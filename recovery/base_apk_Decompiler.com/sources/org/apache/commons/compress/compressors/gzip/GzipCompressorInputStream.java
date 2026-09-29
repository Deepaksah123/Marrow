package org.apache.commons.compress.compressors.gzip;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.CRC32;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import org.apache.commons.compress.compressors.CompressorInputStream;
import org.apache.commons.compress.utils.CharsetNames;

/* JADX INFO: loaded from: classes5.dex */
public class GzipCompressorInputStream extends CompressorInputStream {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final int FCOMMENT = 16;
    private static final int FEXTRA = 4;
    private static final int FHCRC = 2;
    private static final int FNAME = 8;
    private static final int FRESERVED = 224;
    private final byte[] buf;
    private int bufUsed;
    private final CRC32 crc;
    private final boolean decompressConcatenated;
    private boolean endReached;

    /* JADX INFO: renamed from: in, reason: collision with root package name */
    private final InputStream f13in;
    private Inflater inf;
    private final byte[] oneByte;
    private final GzipParameters parameters;

    public GzipCompressorInputStream(InputStream inputStream) throws IOException {
        this(inputStream, false);
    }

    public GzipCompressorInputStream(InputStream inputStream, boolean z) throws IOException {
        this.buf = new byte[8192];
        this.bufUsed = 0;
        this.inf = new Inflater(true);
        this.crc = new CRC32();
        this.endReached = false;
        this.oneByte = new byte[1];
        this.parameters = new GzipParameters();
        if (inputStream.markSupported()) {
            this.f13in = inputStream;
        } else {
            this.f13in = new BufferedInputStream(inputStream);
        }
        this.decompressConcatenated = z;
        init(true);
    }

    public GzipParameters getMetaData() {
        return this.parameters;
    }

    private boolean init(boolean z) throws IOException {
        int i = this.f13in.read();
        int i2 = this.f13in.read();
        if (i == -1 && !z) {
            return false;
        }
        if (i != 31 || i2 != 139) {
            throw new IOException(z ? "Input is not in the .gz format" : "Garbage after a valid .gz stream");
        }
        DataInputStream dataInputStream = new DataInputStream(this.f13in);
        int unsignedByte = dataInputStream.readUnsignedByte();
        if (unsignedByte != 8) {
            StringBuilder sb = new StringBuilder("Unsupported compression method ");
            sb.append(unsignedByte);
            sb.append(" in the .gz header");
            throw new IOException(sb.toString());
        }
        int unsignedByte2 = dataInputStream.readUnsignedByte();
        if ((unsignedByte2 & 224) != 0) {
            throw new IOException("Reserved flags are set in the .gz header");
        }
        this.parameters.setModificationTime(readLittleEndianInt(dataInputStream) * 1000);
        int unsignedByte3 = dataInputStream.readUnsignedByte();
        if (unsignedByte3 == 2) {
            this.parameters.setCompressionLevel(9);
        } else if (unsignedByte3 == 4) {
            this.parameters.setCompressionLevel(1);
        }
        this.parameters.setOperatingSystem(dataInputStream.readUnsignedByte());
        if ((unsignedByte2 & 4) != 0) {
            for (int unsignedByte4 = (dataInputStream.readUnsignedByte() << 8) | dataInputStream.readUnsignedByte(); unsignedByte4 > 0; unsignedByte4--) {
                dataInputStream.readUnsignedByte();
            }
        }
        if ((unsignedByte2 & 8) != 0) {
            this.parameters.setFilename(new String(readToNull(dataInputStream), CharsetNames.ISO_8859_1));
        }
        if ((unsignedByte2 & 16) != 0) {
            this.parameters.setComment(new String(readToNull(dataInputStream), CharsetNames.ISO_8859_1));
        }
        if ((unsignedByte2 & 2) != 0) {
            dataInputStream.readShort();
        }
        this.inf.reset();
        this.crc.reset();
        return true;
    }

    private byte[] readToNull(DataInputStream dataInputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            int unsignedByte = dataInputStream.readUnsignedByte();
            if (unsignedByte != 0) {
                byteArrayOutputStream.write(unsignedByte);
            } else {
                return byteArrayOutputStream.toByteArray();
            }
        }
    }

    private long readLittleEndianInt(DataInputStream dataInputStream) throws IOException {
        return (((long) dataInputStream.readUnsignedByte()) << 24) | ((long) (dataInputStream.readUnsignedByte() | (dataInputStream.readUnsignedByte() << 8) | (dataInputStream.readUnsignedByte() << 16)));
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (read(this.oneByte, 0, 1) == -1) {
            return -1;
        }
        return this.oneByte[0] & 255;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        if (this.endReached) {
            return -1;
        }
        int i3 = i;
        int i4 = i2;
        int i5 = 0;
        while (i4 > 0) {
            if (this.inf.needsInput()) {
                this.f13in.mark(this.buf.length);
                int i6 = this.f13in.read(this.buf);
                this.bufUsed = i6;
                if (i6 == -1) {
                    throw new EOFException();
                }
                this.inf.setInput(this.buf, 0, i6);
            }
            try {
                int iInflate = this.inf.inflate(bArr, i3, i4);
                this.crc.update(bArr, i3, iInflate);
                i3 += iInflate;
                i4 -= iInflate;
                i5 += iInflate;
                count(iInflate);
                if (this.inf.finished()) {
                    this.f13in.reset();
                    long remaining = this.bufUsed - this.inf.getRemaining();
                    if (this.f13in.skip(remaining) != remaining) {
                        throw new IOException();
                    }
                    this.bufUsed = 0;
                    DataInputStream dataInputStream = new DataInputStream(this.f13in);
                    if (readLittleEndianInt(dataInputStream) != this.crc.getValue()) {
                        throw new IOException("Gzip-compressed data is corrupt (CRC32 error)");
                    }
                    long j = -1;
                    if (readLittleEndianInt(dataInputStream) != (this.inf.getBytesWritten() & ((((long) 0) << 32) | (j - ((j >> 63) << 32))))) {
                        throw new IOException("Gzip-compressed data is corrupt(uncompressed size mismatch)");
                    }
                    if (!this.decompressConcatenated || !init(false)) {
                        this.inf.end();
                        this.inf = null;
                        this.endReached = true;
                        if (i5 == 0) {
                            return -1;
                        }
                        return i5;
                    }
                }
            } catch (DataFormatException unused) {
                throw new IOException("Gzip-compressed data is corrupt");
            }
        }
        return i5;
    }

    public static boolean matches(byte[] bArr, int i) {
        return i >= 2 && bArr[0] == 31 && bArr[1] == -117;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        Inflater inflater = this.inf;
        if (inflater != null) {
            inflater.end();
            this.inf = null;
        }
        if (this.f13in != System.in) {
            this.f13in.close();
        }
    }
}
