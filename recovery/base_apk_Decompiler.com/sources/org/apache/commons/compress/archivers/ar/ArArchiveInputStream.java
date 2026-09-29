package org.apache.commons.compress.archivers.ar;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import org.apache.commons.compress.archivers.ArchiveEntry;
import org.apache.commons.compress.archivers.ArchiveInputStream;
import org.apache.commons.compress.utils.ArchiveUtils;
import org.apache.commons.compress.utils.IOUtils;

/* JADX INFO: loaded from: classes5.dex */
public class ArArchiveInputStream extends ArchiveInputStream {
    private static final String BSD_LONGNAME_PATTERN = "^#1/\\d+";
    static final String BSD_LONGNAME_PREFIX = "#1/";
    private static final int BSD_LONGNAME_PREFIX_LEN = 3;
    private static final String GNU_LONGNAME_PATTERN = "^/\\d+";
    private static final String GNU_STRING_TABLE_NAME = "//";
    private final InputStream input;
    private long offset = 0;
    private ArArchiveEntry currentEntry = null;
    private byte[] namebuffer = null;
    private long entryOffset = -1;
    private final byte[] NAME_BUF = new byte[16];
    private final byte[] LAST_MODIFIED_BUF = new byte[12];
    private final byte[] ID_BUF = new byte[6];
    private final byte[] FILE_MODE_BUF = new byte[8];
    private final byte[] LENGTH_BUF = new byte[10];
    private boolean closed = false;

    public ArArchiveInputStream(InputStream inputStream) {
        this.input = inputStream;
    }

    public ArArchiveEntry getNextArEntry() throws IOException {
        ArArchiveEntry arArchiveEntry = this.currentEntry;
        if (arArchiveEntry != null) {
            IOUtils.skip(this, (this.entryOffset + arArchiveEntry.getLength()) - this.offset);
            this.currentEntry = null;
        }
        if (this.offset == 0) {
            byte[] asciiBytes = ArchiveUtils.toAsciiBytes(ArArchiveEntry.HEADER);
            byte[] bArr = new byte[asciiBytes.length];
            if (IOUtils.readFully(this, bArr) != asciiBytes.length) {
                StringBuilder sb = new StringBuilder("failed to read header. Occured at byte: ");
                sb.append(getBytesRead());
                throw new IOException(sb.toString());
            }
            for (int i = 0; i < asciiBytes.length; i++) {
                if (asciiBytes[i] != bArr[i]) {
                    StringBuilder sb2 = new StringBuilder("invalid header ");
                    sb2.append(ArchiveUtils.toAsciiString(bArr));
                    throw new IOException(sb2.toString());
                }
            }
        }
        if ((this.offset % 2 != 0 && read() < 0) || this.input.available() == 0) {
            return null;
        }
        IOUtils.readFully(this, this.NAME_BUF);
        IOUtils.readFully(this, this.LAST_MODIFIED_BUF);
        IOUtils.readFully(this, this.ID_BUF);
        int iAsInt = asInt(this.ID_BUF, true);
        IOUtils.readFully(this, this.ID_BUF);
        IOUtils.readFully(this, this.FILE_MODE_BUF);
        IOUtils.readFully(this, this.LENGTH_BUF);
        byte[] asciiBytes2 = ArchiveUtils.toAsciiBytes(ArArchiveEntry.TRAILER);
        byte[] bArr2 = new byte[asciiBytes2.length];
        if (IOUtils.readFully(this, bArr2) != asciiBytes2.length) {
            StringBuilder sb3 = new StringBuilder("failed to read entry trailer. Occured at byte: ");
            sb3.append(getBytesRead());
            throw new IOException(sb3.toString());
        }
        for (int i2 = 0; i2 < asciiBytes2.length; i2++) {
            if (asciiBytes2[i2] != bArr2[i2]) {
                StringBuilder sb4 = new StringBuilder("invalid entry trailer. not read the content? Occured at byte: ");
                sb4.append(getBytesRead());
                throw new IOException(sb4.toString());
            }
        }
        this.entryOffset = this.offset;
        String strTrim = ArchiveUtils.toAsciiString(this.NAME_BUF).trim();
        if (isGNUStringTable(strTrim)) {
            this.currentEntry = readGNUStringTable(this.LENGTH_BUF);
            return getNextArEntry();
        }
        long jAsLong = asLong(this.LENGTH_BUF);
        if (strTrim.endsWith("/")) {
            strTrim = strTrim.substring(0, strTrim.length() - 1);
        } else if (isGNULongName(strTrim)) {
            strTrim = getExtendedName(Integer.parseInt(strTrim.substring(1)));
        } else if (isBSDLongName(strTrim)) {
            strTrim = getBSDLongName(strTrim);
            long length = strTrim.length();
            jAsLong -= length;
            this.entryOffset += length;
        }
        ArArchiveEntry arArchiveEntry2 = new ArArchiveEntry(strTrim, jAsLong, iAsInt, asInt(this.ID_BUF, true), asInt(this.FILE_MODE_BUF, 8), asLong(this.LAST_MODIFIED_BUF));
        this.currentEntry = arArchiveEntry2;
        return arArchiveEntry2;
    }

    private String getExtendedName(int i) throws IOException {
        byte[] bArr;
        if (this.namebuffer == null) {
            throw new IOException("Cannot process GNU long filename as no // record was found");
        }
        int i2 = i;
        while (true) {
            bArr = this.namebuffer;
            if (i2 < bArr.length) {
                byte b = bArr[i2];
                if (b == 10 || b == 0) {
                    break;
                }
                i2++;
            } else {
                throw new IOException("Failed to read entry: ".concat(String.valueOf(i)));
            }
        }
        int i3 = i2 - 1;
        if (bArr[i3] == 47) {
            i2 = i3;
        }
        return ArchiveUtils.toAsciiString(bArr, i, i2 - i);
    }

    private long asLong(byte[] bArr) {
        return Long.parseLong(ArchiveUtils.toAsciiString(bArr).trim());
    }

    private int asInt(byte[] bArr) {
        return asInt(bArr, 10, false);
    }

    private int asInt(byte[] bArr, boolean z) {
        return asInt(bArr, 10, z);
    }

    private int asInt(byte[] bArr, int i) {
        return asInt(bArr, i, false);
    }

    private int asInt(byte[] bArr, int i, boolean z) {
        String strTrim = ArchiveUtils.toAsciiString(bArr).trim();
        if (strTrim.length() == 0 && z) {
            return 0;
        }
        return Integer.parseInt(strTrim, i);
    }

    @Override // org.apache.commons.compress.archivers.ArchiveInputStream
    public ArchiveEntry getNextEntry() throws IOException {
        return getNextArEntry();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (!this.closed) {
            this.closed = true;
            this.input.close();
        }
        this.currentEntry = null;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        ArArchiveEntry arArchiveEntry = this.currentEntry;
        if (arArchiveEntry != null) {
            long length = this.entryOffset + arArchiveEntry.getLength();
            if (i2 <= 0) {
                return -1;
            }
            long j = this.offset;
            if (length <= j) {
                return -1;
            }
            i2 = (int) Math.min(i2, length - j);
        }
        int i3 = this.input.read(bArr, i, i2);
        count(i3);
        this.offset += i3 > 0 ? i3 : 0L;
        return i3;
    }

    public static boolean matches(byte[] bArr, int i) {
        return i >= 8 && bArr[0] == 33 && bArr[1] == 60 && bArr[2] == 97 && bArr[3] == 114 && bArr[4] == 99 && bArr[5] == 104 && bArr[6] == 62 && bArr[7] == 10;
    }

    private static boolean isBSDLongName(String str) {
        return str != null && str.matches(BSD_LONGNAME_PATTERN);
    }

    private String getBSDLongName(String str) throws IOException {
        int i = Integer.parseInt(str.substring(BSD_LONGNAME_PREFIX_LEN));
        byte[] bArr = new byte[i];
        if (IOUtils.readFully(this, bArr) != i) {
            throw new EOFException();
        }
        return ArchiveUtils.toAsciiString(bArr);
    }

    private static boolean isGNUStringTable(String str) {
        return GNU_STRING_TABLE_NAME.equals(str);
    }

    private ArArchiveEntry readGNUStringTable(byte[] bArr) throws IOException {
        int iAsInt = asInt(bArr);
        byte[] bArr2 = new byte[iAsInt];
        this.namebuffer = bArr2;
        int fully = IOUtils.readFully(this, bArr2, 0, iAsInt);
        if (fully != iAsInt) {
            StringBuilder sb = new StringBuilder("Failed to read complete // record: expected=");
            sb.append(iAsInt);
            sb.append(" read=");
            sb.append(fully);
            throw new IOException(sb.toString());
        }
        return new ArArchiveEntry(GNU_STRING_TABLE_NAME, iAsInt);
    }

    private boolean isGNULongName(String str) {
        return str != null && str.matches(GNU_LONGNAME_PATTERN);
    }
}
