package org.apache.commons.compress.archivers.ar;

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import org.apache.commons.compress.archivers.ArchiveEntry;
import org.apache.commons.compress.archivers.ArchiveOutputStream;
import org.apache.commons.compress.utils.ArchiveUtils;

/* JADX INFO: loaded from: classes5.dex */
public class ArArchiveOutputStream extends ArchiveOutputStream {
    public static final int LONGFILE_BSD = 1;
    public static final int LONGFILE_ERROR = 0;
    private final OutputStream out;
    private ArArchiveEntry prevEntry;
    private long entryOffset = 0;
    private boolean haveUnclosedEntry = false;
    private int longFileMode = 0;
    private boolean finished = false;

    public ArArchiveOutputStream(OutputStream outputStream) {
        this.out = outputStream;
    }

    public void setLongFileMode(int i) {
        this.longFileMode = i;
    }

    private long writeArchiveHeader() throws IOException {
        this.out.write(ArchiveUtils.toAsciiBytes(ArArchiveEntry.HEADER));
        return r0.length;
    }

    @Override // org.apache.commons.compress.archivers.ArchiveOutputStream
    public void closeArchiveEntry() throws IOException {
        if (this.finished) {
            throw new IOException("Stream has already been finished");
        }
        if (this.prevEntry == null || !this.haveUnclosedEntry) {
            throw new IOException("No current entry to close");
        }
        if (this.entryOffset % 2 != 0) {
            this.out.write(10);
        }
        this.haveUnclosedEntry = false;
    }

    @Override // org.apache.commons.compress.archivers.ArchiveOutputStream
    public void putArchiveEntry(ArchiveEntry archiveEntry) throws IOException {
        if (this.finished) {
            throw new IOException("Stream has already been finished");
        }
        ArArchiveEntry arArchiveEntry = (ArArchiveEntry) archiveEntry;
        ArArchiveEntry arArchiveEntry2 = this.prevEntry;
        if (arArchiveEntry2 == null) {
            writeArchiveHeader();
        } else {
            if (arArchiveEntry2.getLength() != this.entryOffset) {
                StringBuilder sb = new StringBuilder("length does not match entry (");
                sb.append(this.prevEntry.getLength());
                sb.append(" != ");
                sb.append(this.entryOffset);
                throw new IOException(sb.toString());
            }
            if (this.haveUnclosedEntry) {
                closeArchiveEntry();
            }
        }
        this.prevEntry = arArchiveEntry;
        writeEntryHeader(arArchiveEntry);
        this.entryOffset = 0L;
        this.haveUnclosedEntry = true;
    }

    private long fill(long j, long j2, char c) throws IOException {
        long j3 = j2 - j;
        if (j3 > 0) {
            for (int i = 0; i < j3; i++) {
                write(c);
            }
        }
        return j2;
    }

    private long write(String str) throws IOException {
        write(str.getBytes("ascii"));
        return r2.length;
    }

    private long writeEntryHeader(ArArchiveEntry arArchiveEntry) throws IOException {
        long jWrite;
        boolean z;
        String name = arArchiveEntry.getName();
        if (this.longFileMode == 0 && name.length() > 16) {
            throw new IOException("filename too long, > 16 chars: ".concat(String.valueOf(name)));
        }
        if (1 == this.longFileMode && (name.length() > 16 || name.contains(" "))) {
            StringBuilder sb = new StringBuilder("#1/");
            sb.append(String.valueOf(name.length()));
            z = true;
            jWrite = write(sb.toString());
        } else {
            jWrite = write(name);
            z = false;
        }
        long jFill = fill(jWrite, 16L, ' ');
        StringBuilder sb2 = new StringBuilder("");
        sb2.append(arArchiveEntry.getLastModified());
        String string = sb2.toString();
        if (string.length() > 12) {
            throw new IOException("modified too long");
        }
        long jFill2 = fill(write(string) + jFill, 28L, ' ');
        StringBuilder sb3 = new StringBuilder("");
        sb3.append(arArchiveEntry.getUserId());
        String string2 = sb3.toString();
        if (string2.length() > 6) {
            throw new IOException("userid too long");
        }
        long jFill3 = fill(write(string2) + jFill2, 34L, ' ');
        StringBuilder sb4 = new StringBuilder("");
        sb4.append(arArchiveEntry.getGroupId());
        String string3 = sb4.toString();
        if (string3.length() > 6) {
            throw new IOException("groupid too long");
        }
        long jFill4 = fill(write(string3) + jFill3, 40L, ' ');
        StringBuilder sb5 = new StringBuilder("");
        sb5.append(Integer.toString(arArchiveEntry.getMode(), 8));
        String string4 = sb5.toString();
        if (string4.length() > 8) {
            throw new IOException("filemode too long");
        }
        long jFill5 = fill(write(string4) + jFill4, 48L, ' ');
        String strValueOf = String.valueOf(arArchiveEntry.getLength() + ((long) (z ? name.length() : 0)));
        if (strValueOf.length() > 10) {
            throw new IOException("size too long");
        }
        long jFill6 = fill(jFill5 + write(strValueOf), 58L, ' ') + write(ArArchiveEntry.TRAILER);
        return z ? jFill6 + write(name) : jFill6;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws IOException {
        this.out.write(bArr, i, i2);
        count(i2);
        this.entryOffset += (long) i2;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (!this.finished) {
            finish();
        }
        this.out.close();
        this.prevEntry = null;
    }

    @Override // org.apache.commons.compress.archivers.ArchiveOutputStream
    public ArchiveEntry createArchiveEntry(File file, String str) throws IOException {
        if (this.finished) {
            throw new IOException("Stream has already been finished");
        }
        return new ArArchiveEntry(file, str);
    }

    @Override // org.apache.commons.compress.archivers.ArchiveOutputStream
    public void finish() throws IOException {
        if (this.haveUnclosedEntry) {
            throw new IOException("This archive contains unclosed entries.");
        }
        if (this.finished) {
            throw new IOException("This archive has already been finished");
        }
        this.finished = true;
    }
}
