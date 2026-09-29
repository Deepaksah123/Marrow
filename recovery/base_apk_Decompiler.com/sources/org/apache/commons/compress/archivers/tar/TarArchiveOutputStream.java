package org.apache.commons.compress.archivers.tar;

import com.marrow.data.models.custommodule.FilterParams;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.io.StringWriter;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.compress.archivers.ArchiveEntry;
import org.apache.commons.compress.archivers.ArchiveOutputStream;
import org.apache.commons.compress.archivers.zip.ZipEncoding;
import org.apache.commons.compress.archivers.zip.ZipEncodingHelper;
import org.apache.commons.compress.utils.CharsetNames;
import org.apache.commons.compress.utils.CountingOutputStream;

/* JADX INFO: loaded from: classes5.dex */
public class TarArchiveOutputStream extends ArchiveOutputStream {
    private static final ZipEncoding ASCII = ZipEncodingHelper.getZipEncoding("ASCII");
    public static final int BIGNUMBER_ERROR = 0;
    public static final int BIGNUMBER_POSIX = 2;
    public static final int BIGNUMBER_STAR = 1;
    public static final int LONGFILE_ERROR = 0;
    public static final int LONGFILE_GNU = 2;
    public static final int LONGFILE_POSIX = 3;
    public static final int LONGFILE_TRUNCATE = 1;
    private boolean addPaxHeadersForNonAsciiNames;
    private final byte[] assemBuf;
    private int assemLen;
    private int bigNumberMode;
    private boolean closed;
    private long currBytes;
    private String currName;
    private long currSize;
    final String encoding;
    private boolean finished;
    private boolean haveUnclosedEntry;
    private int longFileMode;
    private final OutputStream out;
    private final byte[] recordBuf;
    private final int recordSize;
    private final int recordsPerBlock;
    private int recordsWritten;
    private final ZipEncoding zipEncoding;

    private boolean shouldBeReplaced(char c) {
        return c == 0 || c == '/' || c == '\\';
    }

    public TarArchiveOutputStream(OutputStream outputStream) {
        this(outputStream, TarConstants.DEFAULT_BLKSIZE, 512);
    }

    public TarArchiveOutputStream(OutputStream outputStream, String str) {
        this(outputStream, TarConstants.DEFAULT_BLKSIZE, 512, str);
    }

    public TarArchiveOutputStream(OutputStream outputStream, int i) {
        this(outputStream, i, 512);
    }

    public TarArchiveOutputStream(OutputStream outputStream, int i, String str) {
        this(outputStream, i, 512, str);
    }

    public TarArchiveOutputStream(OutputStream outputStream, int i, int i2) {
        this(outputStream, i, i2, null);
    }

    public TarArchiveOutputStream(OutputStream outputStream, int i, int i2, String str) {
        this.longFileMode = 0;
        this.bigNumberMode = 0;
        this.closed = false;
        this.haveUnclosedEntry = false;
        this.finished = false;
        this.addPaxHeadersForNonAsciiNames = false;
        this.out = new CountingOutputStream(outputStream);
        this.encoding = str;
        this.zipEncoding = ZipEncodingHelper.getZipEncoding(str);
        this.assemLen = 0;
        this.assemBuf = new byte[i2];
        this.recordBuf = new byte[i2];
        this.recordSize = i2;
        this.recordsPerBlock = i / i2;
    }

    public void setLongFileMode(int i) {
        this.longFileMode = i;
    }

    public void setBigNumberMode(int i) {
        this.bigNumberMode = i;
    }

    public void setAddPaxHeadersForNonAsciiNames(boolean z) {
        this.addPaxHeadersForNonAsciiNames = z;
    }

    @Override // org.apache.commons.compress.archivers.ArchiveOutputStream
    @Deprecated
    public int getCount() {
        return (int) getBytesWritten();
    }

    @Override // org.apache.commons.compress.archivers.ArchiveOutputStream
    public long getBytesWritten() {
        return ((CountingOutputStream) this.out).getBytesWritten();
    }

    @Override // org.apache.commons.compress.archivers.ArchiveOutputStream
    public void finish() throws IOException {
        if (this.finished) {
            throw new IOException("This archive has already been finished");
        }
        if (this.haveUnclosedEntry) {
            throw new IOException("This archives contains unclosed entries.");
        }
        writeEOFRecord();
        writeEOFRecord();
        padAsNeeded();
        this.out.flush();
        this.finished = true;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (!this.finished) {
            finish();
        }
        if (this.closed) {
            return;
        }
        this.out.close();
        this.closed = true;
    }

    public int getRecordSize() {
        return this.recordSize;
    }

    @Override // org.apache.commons.compress.archivers.ArchiveOutputStream
    public void putArchiveEntry(ArchiveEntry archiveEntry) throws IOException {
        if (this.finished) {
            throw new IOException("Stream has already been finished");
        }
        TarArchiveEntry tarArchiveEntry = (TarArchiveEntry) archiveEntry;
        HashMap map = new HashMap();
        String name = tarArchiveEntry.getName();
        boolean zHandleLongName = handleLongName(tarArchiveEntry, name, map, "path", TarConstants.LF_GNUTYPE_LONGNAME, "file name");
        String linkName = tarArchiveEntry.getLinkName();
        boolean z = linkName != null && linkName.length() > 0 && handleLongName(tarArchiveEntry, linkName, map, "linkpath", TarConstants.LF_GNUTYPE_LONGLINK, "link name");
        int i = this.bigNumberMode;
        if (i == 2) {
            addPaxHeadersForBigNumbers(map, tarArchiveEntry);
        } else if (i != 1) {
            failForBigNumbers(tarArchiveEntry);
        }
        if (this.addPaxHeadersForNonAsciiNames && !zHandleLongName && !ASCII.canEncode(name)) {
            map.put("path", name);
        }
        if (this.addPaxHeadersForNonAsciiNames && !z && ((tarArchiveEntry.isLink() || tarArchiveEntry.isSymbolicLink()) && !ASCII.canEncode(linkName))) {
            map.put("linkpath", linkName);
        }
        if (map.size() > 0) {
            writePaxHeaders(tarArchiveEntry, name, map);
        }
        tarArchiveEntry.writeEntryHeader(this.recordBuf, this.zipEncoding, this.bigNumberMode == 1);
        writeRecord(this.recordBuf);
        this.currBytes = 0L;
        if (tarArchiveEntry.isDirectory()) {
            this.currSize = 0L;
        } else {
            this.currSize = tarArchiveEntry.getSize();
        }
        this.currName = name;
        this.haveUnclosedEntry = true;
    }

    @Override // org.apache.commons.compress.archivers.ArchiveOutputStream
    public void closeArchiveEntry() throws IOException {
        byte[] bArr;
        if (this.finished) {
            throw new IOException("Stream has already been finished");
        }
        if (!this.haveUnclosedEntry) {
            throw new IOException("No current entry to close");
        }
        int i = this.assemLen;
        if (i > 0) {
            while (true) {
                bArr = this.assemBuf;
                if (i >= bArr.length) {
                    break;
                }
                bArr[i] = 0;
                i++;
            }
            writeRecord(bArr);
            this.currBytes += (long) this.assemLen;
            this.assemLen = 0;
        }
        if (this.currBytes < this.currSize) {
            StringBuilder sb = new StringBuilder("entry '");
            sb.append(this.currName);
            sb.append("' closed at '");
            sb.append(this.currBytes);
            sb.append("' before the '");
            sb.append(this.currSize);
            sb.append("' bytes specified in the header were written");
            throw new IOException(sb.toString());
        }
        this.haveUnclosedEntry = false;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws IOException {
        if (!this.haveUnclosedEntry) {
            throw new IllegalStateException("No current tar entry");
        }
        if (this.currBytes + ((long) i2) > this.currSize) {
            StringBuilder sb = new StringBuilder("request to write '");
            sb.append(i2);
            sb.append("' bytes exceeds size in header of '");
            sb.append(this.currSize);
            sb.append("' bytes for entry '");
            sb.append(this.currName);
            sb.append("'");
            throw new IOException(sb.toString());
        }
        int i3 = this.assemLen;
        if (i3 > 0) {
            byte[] bArr2 = this.recordBuf;
            if (i3 + i2 >= bArr2.length) {
                int length = bArr2.length - i3;
                System.arraycopy(this.assemBuf, 0, bArr2, 0, i3);
                System.arraycopy(bArr, i, this.recordBuf, this.assemLen, length);
                writeRecord(this.recordBuf);
                this.currBytes += (long) this.recordBuf.length;
                i += length;
                i2 -= length;
                this.assemLen = 0;
            } else {
                System.arraycopy(bArr, i, this.assemBuf, i3, i2);
                i += i2;
                this.assemLen += i2;
                i2 = 0;
            }
        }
        while (i2 > 0) {
            if (i2 < this.recordBuf.length) {
                System.arraycopy(bArr, i, this.assemBuf, this.assemLen, i2);
                this.assemLen += i2;
                return;
            } else {
                writeRecord(bArr, i);
                int length2 = this.recordBuf.length;
                this.currBytes += (long) length2;
                i2 -= length2;
                i += length2;
            }
        }
    }

    void writePaxHeaders(TarArchiveEntry tarArchiveEntry, String str, Map<String, String> map) throws IOException {
        StringBuilder sb = new StringBuilder("./PaxHeaders.X/");
        sb.append(stripTo7Bits(str));
        String string = sb.toString();
        if (string.length() >= 100) {
            string = string.substring(0, 99);
        }
        TarArchiveEntry tarArchiveEntry2 = new TarArchiveEntry(string, TarConstants.LF_PAX_EXTENDED_HEADER_LC);
        transferModTime(tarArchiveEntry, tarArchiveEntry2);
        StringWriter stringWriter = new StringWriter();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            int length = key.length() + value.length() + 5;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(length);
            sb2.append(" ");
            sb2.append(key);
            sb2.append("=");
            sb2.append(value);
            sb2.append("\n");
            String string2 = sb2.toString();
            int length2 = string2.getBytes(CharsetNames.UTF_8).length;
            while (length != length2) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(length2);
                sb3.append(" ");
                sb3.append(key);
                sb3.append("=");
                sb3.append(value);
                sb3.append("\n");
                string2 = sb3.toString();
                int i = length2;
                length2 = string2.getBytes(CharsetNames.UTF_8).length;
                length = i;
            }
            stringWriter.write(string2);
        }
        byte[] bytes = stringWriter.toString().getBytes(CharsetNames.UTF_8);
        tarArchiveEntry2.setSize(bytes.length);
        putArchiveEntry(tarArchiveEntry2);
        write(bytes);
        closeArchiveEntry();
    }

    private String stripTo7Bits(String str) {
        int length = str.length();
        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            char cCharAt = (char) (str.charAt(i) & 127);
            if (shouldBeReplaced(cCharAt)) {
                sb.append("_");
            } else {
                sb.append(cCharAt);
            }
        }
        return sb.toString();
    }

    private void writeEOFRecord() throws IOException {
        Arrays.fill(this.recordBuf, (byte) 0);
        writeRecord(this.recordBuf);
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        this.out.flush();
    }

    @Override // org.apache.commons.compress.archivers.ArchiveOutputStream
    public ArchiveEntry createArchiveEntry(File file, String str) throws IOException {
        if (this.finished) {
            throw new IOException("Stream has already been finished");
        }
        return new TarArchiveEntry(file, str);
    }

    private void writeRecord(byte[] bArr) throws IOException {
        if (bArr.length != this.recordSize) {
            StringBuilder sb = new StringBuilder("record to write has length '");
            sb.append(bArr.length);
            sb.append("' which is not the record size of '");
            sb.append(this.recordSize);
            sb.append("'");
            throw new IOException(sb.toString());
        }
        this.out.write(bArr);
        this.recordsWritten++;
    }

    private void writeRecord(byte[] bArr, int i) throws IOException {
        int i2 = this.recordSize;
        if (i + i2 > bArr.length) {
            StringBuilder sb = new StringBuilder("record has length '");
            sb.append(bArr.length);
            sb.append("' with offset '");
            sb.append(i);
            sb.append("' which is less than the record size of '");
            sb.append(this.recordSize);
            sb.append("'");
            throw new IOException(sb.toString());
        }
        this.out.write(bArr, i, i2);
        this.recordsWritten++;
    }

    private void padAsNeeded() throws IOException {
        int i = this.recordsWritten % this.recordsPerBlock;
        if (i != 0) {
            while (i < this.recordsPerBlock) {
                writeEOFRecord();
                i++;
            }
        }
    }

    private void addPaxHeadersForBigNumbers(Map<String, String> map, TarArchiveEntry tarArchiveEntry) {
        addPaxHeaderForBigNumber(map, "size", tarArchiveEntry.getSize(), TarConstants.MAXSIZE);
        addPaxHeaderForBigNumber(map, "gid", tarArchiveEntry.getLongGroupId(), TarConstants.MAXID);
        addPaxHeaderForBigNumber(map, "mtime", tarArchiveEntry.getModTime().getTime() / 1000, TarConstants.MAXSIZE);
        addPaxHeaderForBigNumber(map, "uid", tarArchiveEntry.getLongUserId(), TarConstants.MAXID);
        addPaxHeaderForBigNumber(map, "SCHILY.devmajor", tarArchiveEntry.getDevMajor(), TarConstants.MAXID);
        addPaxHeaderForBigNumber(map, "SCHILY.devminor", tarArchiveEntry.getDevMinor(), TarConstants.MAXID);
        failForBigNumber(FilterParams.KEY_MODE, tarArchiveEntry.getMode(), TarConstants.MAXID);
    }

    private void addPaxHeaderForBigNumber(Map<String, String> map, String str, long j, long j2) {
        if (j < 0 || j > j2) {
            map.put(str, String.valueOf(j));
        }
    }

    private void failForBigNumbers(TarArchiveEntry tarArchiveEntry) {
        failForBigNumber("entry size", tarArchiveEntry.getSize(), TarConstants.MAXSIZE);
        failForBigNumberWithPosixMessage("group id", tarArchiveEntry.getLongGroupId(), TarConstants.MAXID);
        failForBigNumber("last modification time", tarArchiveEntry.getModTime().getTime() / 1000, TarConstants.MAXSIZE);
        failForBigNumber("user id", tarArchiveEntry.getLongUserId(), TarConstants.MAXID);
        failForBigNumber(FilterParams.KEY_MODE, tarArchiveEntry.getMode(), TarConstants.MAXID);
        failForBigNumber("major device number", tarArchiveEntry.getDevMajor(), TarConstants.MAXID);
        failForBigNumber("minor device number", tarArchiveEntry.getDevMinor(), TarConstants.MAXID);
    }

    private void failForBigNumber(String str, long j, long j2) {
        failForBigNumber(str, j, j2, "");
    }

    private void failForBigNumberWithPosixMessage(String str, long j, long j2) {
        failForBigNumber(str, j, j2, " Use STAR or POSIX extensions to overcome this limit");
    }

    private void failForBigNumber(String str, long j, long j2, String str2) {
        if (j < 0 || j > j2) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" '");
            sb.append(j);
            sb.append("' is too big ( > ");
            sb.append(j2);
            sb.append(" ).");
            sb.append(str2);
            throw new RuntimeException(sb.toString());
        }
    }

    private boolean handleLongName(TarArchiveEntry tarArchiveEntry, String str, Map<String, String> map, String str2, byte b, String str3) throws IOException {
        ByteBuffer byteBufferEncode = this.zipEncoding.encode(str);
        int iLimit = byteBufferEncode.limit() - byteBufferEncode.position();
        if (iLimit >= 100) {
            int i = this.longFileMode;
            if (i == 3) {
                map.put(str2, str);
                return true;
            }
            if (i == 2) {
                TarArchiveEntry tarArchiveEntry2 = new TarArchiveEntry(TarConstants.GNU_LONGLINK, b);
                tarArchiveEntry2.setSize(iLimit + 1);
                transferModTime(tarArchiveEntry, tarArchiveEntry2);
                putArchiveEntry(tarArchiveEntry2);
                write(byteBufferEncode.array(), byteBufferEncode.arrayOffset(), iLimit);
                write(0);
                closeArchiveEntry();
            } else if (i != 1) {
                StringBuilder sb = new StringBuilder();
                sb.append(str3);
                sb.append(" '");
                sb.append(str);
                sb.append("' is too long ( > 100 bytes)");
                throw new RuntimeException(sb.toString());
            }
        }
        return false;
    }

    private void transferModTime(TarArchiveEntry tarArchiveEntry, TarArchiveEntry tarArchiveEntry2) {
        Date modTime = tarArchiveEntry.getModTime();
        long time = modTime.getTime() / 1000;
        if (time < 0 || time > TarConstants.MAXSIZE) {
            modTime = new Date(0L);
        }
        tarArchiveEntry2.setModTime(modTime);
    }
}
