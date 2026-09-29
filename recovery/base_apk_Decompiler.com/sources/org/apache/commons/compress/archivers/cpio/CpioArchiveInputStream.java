package org.apache.commons.compress.archivers.cpio;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import org.apache.commons.compress.archivers.ArchiveEntry;
import org.apache.commons.compress.archivers.ArchiveInputStream;
import org.apache.commons.compress.archivers.zip.ZipEncoding;
import org.apache.commons.compress.archivers.zip.ZipEncodingHelper;
import org.apache.commons.compress.utils.ArchiveUtils;
import org.apache.commons.compress.utils.CharsetNames;
import org.apache.commons.compress.utils.IOUtils;

/* JADX INFO: loaded from: classes5.dex */
public class CpioArchiveInputStream extends ArchiveInputStream implements CpioConstants {
    private final byte[] FOUR_BYTES_BUF;
    private final byte[] SIX_BYTES_BUF;
    private final byte[] TWO_BYTES_BUF;
    private final int blockSize;
    private boolean closed;
    private long crc;
    final String encoding;
    private CpioArchiveEntry entry;
    private long entryBytesRead;
    private boolean entryEOF;

    /* JADX INFO: renamed from: in, reason: collision with root package name */
    private final InputStream f4in;
    private final byte[] tmpbuf;
    private final ZipEncoding zipEncoding;

    public CpioArchiveInputStream(InputStream inputStream) {
        this(inputStream, 512, CharsetNames.US_ASCII);
    }

    public CpioArchiveInputStream(InputStream inputStream, String str) {
        this(inputStream, 512, str);
    }

    public CpioArchiveInputStream(InputStream inputStream, int i) {
        this(inputStream, i, CharsetNames.US_ASCII);
    }

    public CpioArchiveInputStream(InputStream inputStream, int i, String str) {
        this.closed = false;
        this.entryBytesRead = 0L;
        this.entryEOF = false;
        this.tmpbuf = new byte[4096];
        this.crc = 0L;
        this.TWO_BYTES_BUF = new byte[2];
        this.FOUR_BYTES_BUF = new byte[4];
        this.SIX_BYTES_BUF = new byte[6];
        this.f4in = inputStream;
        this.blockSize = i;
        this.encoding = str;
        this.zipEncoding = ZipEncodingHelper.getZipEncoding(str);
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        ensureOpen();
        return this.entryEOF ? 0 : 1;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.closed) {
            return;
        }
        this.f4in.close();
        this.closed = true;
    }

    private void closeEntry() throws IOException {
        while (skip(2147483647L) == 2147483647L) {
        }
    }

    private void ensureOpen() throws IOException {
        if (this.closed) {
            throw new IOException("Stream closed");
        }
    }

    public CpioArchiveEntry getNextCPIOEntry() throws IOException {
        ensureOpen();
        if (this.entry != null) {
            closeEntry();
        }
        byte[] bArr = this.TWO_BYTES_BUF;
        readFully(bArr, 0, bArr.length);
        if (CpioUtil.byteArray2long(this.TWO_BYTES_BUF, false) == 29127) {
            this.entry = readOldBinaryEntry(false);
        } else if (CpioUtil.byteArray2long(this.TWO_BYTES_BUF, true) == 29127) {
            this.entry = readOldBinaryEntry(true);
        } else {
            byte[] bArr2 = this.TWO_BYTES_BUF;
            System.arraycopy(bArr2, 0, this.SIX_BYTES_BUF, 0, bArr2.length);
            readFully(this.SIX_BYTES_BUF, this.TWO_BYTES_BUF.length, this.FOUR_BYTES_BUF.length);
            String asciiString = ArchiveUtils.toAsciiString(this.SIX_BYTES_BUF);
            if (asciiString.equals(CpioConstants.MAGIC_NEW)) {
                this.entry = readNewEntry(false);
            } else if (asciiString.equals(CpioConstants.MAGIC_NEW_CRC)) {
                this.entry = readNewEntry(true);
            } else if (asciiString.equals(CpioConstants.MAGIC_OLD_ASCII)) {
                this.entry = readOldAsciiEntry();
            } else {
                StringBuilder sb = new StringBuilder("Unknown magic [");
                sb.append(asciiString);
                sb.append("]. Occured at byte: ");
                sb.append(getBytesRead());
                throw new IOException(sb.toString());
            }
        }
        this.entryBytesRead = 0L;
        this.entryEOF = false;
        this.crc = 0L;
        if (this.entry.getName().equals(CpioConstants.CPIO_TRAILER)) {
            this.entryEOF = true;
            skipRemainderOfLastBlock();
            return null;
        }
        return this.entry;
    }

    private void skip(int i) throws IOException {
        if (i > 0) {
            readFully(this.FOUR_BYTES_BUF, 0, i);
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        ensureOpen();
        if (i < 0 || i2 < 0 || i > bArr.length - i2) {
            throw new IndexOutOfBoundsException();
        }
        if (i2 == 0) {
            return 0;
        }
        CpioArchiveEntry cpioArchiveEntry = this.entry;
        if (cpioArchiveEntry == null || this.entryEOF) {
            return -1;
        }
        if (this.entryBytesRead == cpioArchiveEntry.getSize()) {
            skip(this.entry.getDataPadCount());
            this.entryEOF = true;
            if (this.entry.getFormat() != 2 || this.crc == this.entry.getChksum()) {
                return -1;
            }
            StringBuilder sb = new StringBuilder("CRC Error. Occured at byte: ");
            sb.append(getBytesRead());
            throw new IOException(sb.toString());
        }
        int iMin = (int) Math.min(i2, this.entry.getSize() - this.entryBytesRead);
        if (iMin < 0) {
            return -1;
        }
        int fully = readFully(bArr, i, iMin);
        if (this.entry.getFormat() == 2) {
            for (int i3 = 0; i3 < fully; i3++) {
                this.crc += (long) (bArr[i3] & 255);
            }
        }
        this.entryBytesRead += (long) fully;
        return fully;
    }

    private final int readFully(byte[] bArr, int i, int i2) throws IOException {
        int fully = IOUtils.readFully(this.f4in, bArr, i, i2);
        count(fully);
        if (fully >= i2) {
            return fully;
        }
        throw new EOFException();
    }

    private long readBinaryLong(int i, boolean z) throws IOException {
        byte[] bArr = new byte[i];
        readFully(bArr, 0, i);
        return CpioUtil.byteArray2long(bArr, z);
    }

    private long readAsciiLong(int i, int i2) throws IOException {
        byte[] bArr = new byte[i];
        readFully(bArr, 0, i);
        return Long.parseLong(ArchiveUtils.toAsciiString(bArr), i2);
    }

    private CpioArchiveEntry readNewEntry(boolean z) throws IOException {
        CpioArchiveEntry cpioArchiveEntry;
        if (z) {
            cpioArchiveEntry = new CpioArchiveEntry((short) 2);
        } else {
            cpioArchiveEntry = new CpioArchiveEntry((short) 1);
        }
        cpioArchiveEntry.setInode(readAsciiLong(8, 16));
        long asciiLong = readAsciiLong(8, 16);
        if (CpioUtil.fileType(asciiLong) != 0) {
            cpioArchiveEntry.setMode(asciiLong);
        }
        cpioArchiveEntry.setUID(readAsciiLong(8, 16));
        cpioArchiveEntry.setGID(readAsciiLong(8, 16));
        cpioArchiveEntry.setNumberOfLinks(readAsciiLong(8, 16));
        cpioArchiveEntry.setTime(readAsciiLong(8, 16));
        cpioArchiveEntry.setSize(readAsciiLong(8, 16));
        cpioArchiveEntry.setDeviceMaj(readAsciiLong(8, 16));
        cpioArchiveEntry.setDeviceMin(readAsciiLong(8, 16));
        cpioArchiveEntry.setRemoteDeviceMaj(readAsciiLong(8, 16));
        cpioArchiveEntry.setRemoteDeviceMin(readAsciiLong(8, 16));
        long asciiLong2 = readAsciiLong(8, 16);
        cpioArchiveEntry.setChksum(readAsciiLong(8, 16));
        String cString = readCString((int) asciiLong2);
        cpioArchiveEntry.setName(cString);
        if (CpioUtil.fileType(asciiLong) == 0 && !cString.equals(CpioConstants.CPIO_TRAILER)) {
            StringBuilder sb = new StringBuilder("Mode 0 only allowed in the trailer. Found entry name: ");
            sb.append(ArchiveUtils.sanitize(cString));
            sb.append(" Occured at byte: ");
            sb.append(getBytesRead());
            throw new IOException(sb.toString());
        }
        skip(cpioArchiveEntry.getHeaderPadCount());
        return cpioArchiveEntry;
    }

    private CpioArchiveEntry readOldAsciiEntry() throws IOException {
        CpioArchiveEntry cpioArchiveEntry = new CpioArchiveEntry((short) 4);
        cpioArchiveEntry.setDevice(readAsciiLong(6, 8));
        cpioArchiveEntry.setInode(readAsciiLong(6, 8));
        long asciiLong = readAsciiLong(6, 8);
        if (CpioUtil.fileType(asciiLong) != 0) {
            cpioArchiveEntry.setMode(asciiLong);
        }
        cpioArchiveEntry.setUID(readAsciiLong(6, 8));
        cpioArchiveEntry.setGID(readAsciiLong(6, 8));
        cpioArchiveEntry.setNumberOfLinks(readAsciiLong(6, 8));
        cpioArchiveEntry.setRemoteDevice(readAsciiLong(6, 8));
        cpioArchiveEntry.setTime(readAsciiLong(11, 8));
        long asciiLong2 = readAsciiLong(6, 8);
        cpioArchiveEntry.setSize(readAsciiLong(11, 8));
        String cString = readCString((int) asciiLong2);
        cpioArchiveEntry.setName(cString);
        if (CpioUtil.fileType(asciiLong) != 0 || cString.equals(CpioConstants.CPIO_TRAILER)) {
            return cpioArchiveEntry;
        }
        StringBuilder sb = new StringBuilder("Mode 0 only allowed in the trailer. Found entry: ");
        sb.append(ArchiveUtils.sanitize(cString));
        sb.append(" Occured at byte: ");
        sb.append(getBytesRead());
        throw new IOException(sb.toString());
    }

    private CpioArchiveEntry readOldBinaryEntry(boolean z) throws IOException {
        CpioArchiveEntry cpioArchiveEntry = new CpioArchiveEntry((short) 8);
        cpioArchiveEntry.setDevice(readBinaryLong(2, z));
        cpioArchiveEntry.setInode(readBinaryLong(2, z));
        long binaryLong = readBinaryLong(2, z);
        if (CpioUtil.fileType(binaryLong) != 0) {
            cpioArchiveEntry.setMode(binaryLong);
        }
        cpioArchiveEntry.setUID(readBinaryLong(2, z));
        cpioArchiveEntry.setGID(readBinaryLong(2, z));
        cpioArchiveEntry.setNumberOfLinks(readBinaryLong(2, z));
        cpioArchiveEntry.setRemoteDevice(readBinaryLong(2, z));
        cpioArchiveEntry.setTime(readBinaryLong(4, z));
        long binaryLong2 = readBinaryLong(2, z);
        cpioArchiveEntry.setSize(readBinaryLong(4, z));
        String cString = readCString((int) binaryLong2);
        cpioArchiveEntry.setName(cString);
        if (CpioUtil.fileType(binaryLong) == 0 && !cString.equals(CpioConstants.CPIO_TRAILER)) {
            StringBuilder sb = new StringBuilder("Mode 0 only allowed in the trailer. Found entry: ");
            sb.append(ArchiveUtils.sanitize(cString));
            sb.append("Occured at byte: ");
            sb.append(getBytesRead());
            throw new IOException(sb.toString());
        }
        skip(cpioArchiveEntry.getHeaderPadCount());
        return cpioArchiveEntry;
    }

    private String readCString(int i) throws IOException {
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        readFully(bArr, 0, i2);
        this.f4in.read();
        return this.zipEncoding.decode(bArr);
    }

    @Override // java.io.InputStream
    public long skip(long j) throws IOException {
        if (j < 0) {
            throw new IllegalArgumentException("negative skip length");
        }
        ensureOpen();
        int iMin = (int) Math.min(j, 2147483647L);
        int i = 0;
        while (true) {
            if (i >= iMin) {
                break;
            }
            int length = iMin - i;
            byte[] bArr = this.tmpbuf;
            if (length > bArr.length) {
                length = bArr.length;
            }
            int i2 = read(bArr, 0, length);
            if (i2 == -1) {
                this.entryEOF = true;
                break;
            }
            i += i2;
        }
        return i;
    }

    @Override // org.apache.commons.compress.archivers.ArchiveInputStream
    public ArchiveEntry getNextEntry() throws IOException {
        return getNextCPIOEntry();
    }

    private void skipRemainderOfLastBlock() throws IOException {
        long bytesRead = getBytesRead();
        long j = this.blockSize;
        long j2 = bytesRead % j;
        long j3 = j2 == 0 ? 0L : j - j2;
        while (j3 > 0) {
            long jSkip = skip(((long) this.blockSize) - j2);
            if (jSkip <= 0) {
                return;
            } else {
                j3 -= jSkip;
            }
        }
    }

    public static boolean matches(byte[] bArr, int i) {
        if (i < 6) {
            return false;
        }
        byte b = bArr[0];
        if (b == 113 && (bArr[1] & 255) == 199) {
            return true;
        }
        byte b2 = bArr[1];
        if (b2 == 113 && (b & 255) == 199) {
            return true;
        }
        if (b != 48 || b2 != 55 || bArr[2] != 48 || bArr[3] != 55 || bArr[4] != 48) {
            return false;
        }
        byte b3 = bArr[5];
        return b3 == 49 || b3 == 50 || b3 == 55;
    }
}
