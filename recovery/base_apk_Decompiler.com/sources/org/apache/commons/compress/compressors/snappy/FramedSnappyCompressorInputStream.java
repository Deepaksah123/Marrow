package org.apache.commons.compress.compressors.snappy;

import java.io.IOException;
import java.io.InputStream;
import java.io.PushbackInputStream;
import java.util.Arrays;
import org.apache.commons.compress.compressors.CompressorInputStream;
import org.apache.commons.compress.utils.BoundedInputStream;
import org.apache.commons.compress.utils.IOUtils;

/* JADX INFO: loaded from: classes5.dex */
public class FramedSnappyCompressorInputStream extends CompressorInputStream {
    private static final int COMPRESSED_CHUNK_TYPE = 0;
    static final long MASK_OFFSET = 2726488792L;
    private static final int MAX_SKIPPABLE_TYPE = 253;
    private static final int MAX_UNSKIPPABLE_TYPE = 127;
    private static final int MIN_UNSKIPPABLE_TYPE = 2;
    private static final int PADDING_CHUNK_TYPE = 254;
    private static final int STREAM_IDENTIFIER_TYPE = 255;
    private static final byte[] SZ_SIGNATURE = {-1, 6, 0, 0, 115, 78, 97, 80, 112, 89};
    private static final int UNCOMPRESSED_CHUNK_TYPE = 1;
    private final PureJavaCrc32C checksum;
    private SnappyCompressorInputStream currentCompressedChunk;
    private final FramedSnappyDialect dialect;
    private boolean endReached;
    private long expectedChecksum;

    /* JADX INFO: renamed from: in, reason: collision with root package name */
    private final PushbackInputStream f16in;
    private boolean inUncompressedChunk;
    private final byte[] oneByte;
    private int uncompressedBytesRemaining;

    static long unmask(long j) {
        long j2 = -1;
        long j3 = (j - MASK_OFFSET) & ((((long) 0) << 32) | (j2 - ((j2 >> 63) << 32)));
        long j4 = -1;
        return ((j3 >> 17) | (j3 << 15)) & ((((long) 0) << 32) | (j4 - ((j4 >> 63) << 32)));
    }

    public FramedSnappyCompressorInputStream(InputStream inputStream) throws IOException {
        this(inputStream, FramedSnappyDialect.STANDARD);
    }

    public FramedSnappyCompressorInputStream(InputStream inputStream, FramedSnappyDialect framedSnappyDialect) throws IOException {
        this.oneByte = new byte[1];
        this.expectedChecksum = -1L;
        this.checksum = new PureJavaCrc32C();
        this.f16in = new PushbackInputStream(inputStream, 1);
        this.dialect = framedSnappyDialect;
        if (framedSnappyDialect.hasStreamIdentifier()) {
            readStreamIdentifier();
        }
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (read(this.oneByte, 0, 1) == -1) {
            return -1;
        }
        return this.oneByte[0] & 255;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        SnappyCompressorInputStream snappyCompressorInputStream = this.currentCompressedChunk;
        if (snappyCompressorInputStream != null) {
            snappyCompressorInputStream.close();
            this.currentCompressedChunk = null;
        }
        this.f16in.close();
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        int once = readOnce(bArr, i, i2);
        if (once != -1) {
            return once;
        }
        readNextBlock();
        if (this.endReached) {
            return -1;
        }
        return readOnce(bArr, i, i2);
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        if (this.inUncompressedChunk) {
            return Math.min(this.uncompressedBytesRemaining, this.f16in.available());
        }
        SnappyCompressorInputStream snappyCompressorInputStream = this.currentCompressedChunk;
        if (snappyCompressorInputStream != null) {
            return snappyCompressorInputStream.available();
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int readOnce(byte[] r5, int r6, int r7) throws java.io.IOException {
        /*
            r4 = this;
            boolean r0 = r4.inUncompressedChunk
            r1 = -1
            if (r0 == 0) goto L20
            int r0 = r4.uncompressedBytesRemaining
            int r7 = java.lang.Math.min(r0, r7)
            if (r7 != 0) goto Le
            return r1
        Le:
            java.io.PushbackInputStream r0 = r4.f16in
            int r7 = r0.read(r5, r6, r7)
            if (r7 == r1) goto L1e
            int r0 = r4.uncompressedBytesRemaining
            int r0 = r0 - r7
            r4.uncompressedBytesRemaining = r0
            r4.count(r7)
        L1e:
            r1 = r7
            goto L44
        L20:
            org.apache.commons.compress.compressors.snappy.SnappyCompressorInputStream r0 = r4.currentCompressedChunk
            if (r0 == 0) goto L44
            long r2 = r0.getBytesRead()
            org.apache.commons.compress.compressors.snappy.SnappyCompressorInputStream r0 = r4.currentCompressedChunk
            int r7 = r0.read(r5, r6, r7)
            if (r7 != r1) goto L39
            org.apache.commons.compress.compressors.snappy.SnappyCompressorInputStream r0 = r4.currentCompressedChunk
            r0.close()
            r0 = 0
            r4.currentCompressedChunk = r0
            goto L1e
        L39:
            org.apache.commons.compress.compressors.snappy.SnappyCompressorInputStream r0 = r4.currentCompressedChunk
            long r0 = r0.getBytesRead()
            long r0 = r0 - r2
            r4.count(r0)
            goto L1e
        L44:
            if (r1 <= 0) goto L4b
            org.apache.commons.compress.compressors.snappy.PureJavaCrc32C r4 = r4.checksum
            r4.update(r5, r6, r1)
        L4b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.compress.compressors.snappy.FramedSnappyCompressorInputStream.readOnce(byte[], int, int):int");
    }

    private void readNextBlock() throws IOException {
        verifyLastChecksumAndReset();
        this.inUncompressedChunk = false;
        int oneByte = readOneByte();
        if (oneByte == -1) {
            this.endReached = true;
            return;
        }
        if (oneByte == 255) {
            this.f16in.unread(oneByte);
            pushedBackBytes(1L);
            readStreamIdentifier();
            readNextBlock();
            return;
        }
        if (oneByte == PADDING_CHUNK_TYPE || (oneByte > MAX_UNSKIPPABLE_TYPE && oneByte <= MAX_SKIPPABLE_TYPE)) {
            skipBlock();
            readNextBlock();
            return;
        }
        if (oneByte >= 2 && oneByte <= MAX_UNSKIPPABLE_TYPE) {
            StringBuilder sb = new StringBuilder("unskippable chunk with type ");
            sb.append(oneByte);
            sb.append(" (hex ");
            sb.append(Integer.toHexString(oneByte));
            sb.append(") detected.");
            throw new IOException(sb.toString());
        }
        if (oneByte == 1) {
            this.inUncompressedChunk = true;
            this.uncompressedBytesRemaining = readSize() - 4;
            this.expectedChecksum = unmask(readCrc());
        } else {
            if (oneByte == 0) {
                boolean zUsesChecksumWithCompressedChunks = this.dialect.usesChecksumWithCompressedChunks();
                long size = readSize() - (zUsesChecksumWithCompressedChunks ? 4 : 0);
                if (zUsesChecksumWithCompressedChunks) {
                    this.expectedChecksum = unmask(readCrc());
                } else {
                    this.expectedChecksum = -1L;
                }
                SnappyCompressorInputStream snappyCompressorInputStream = new SnappyCompressorInputStream(new BoundedInputStream(this.f16in, size));
                this.currentCompressedChunk = snappyCompressorInputStream;
                count(snappyCompressorInputStream.getBytesRead());
                return;
            }
            StringBuilder sb2 = new StringBuilder("unknown chunk type ");
            sb2.append(oneByte);
            sb2.append(" detected.");
            throw new IOException(sb2.toString());
        }
    }

    private long readCrc() throws IOException {
        byte[] bArr = new byte[4];
        int fully = IOUtils.readFully(this.f16in, bArr);
        count(fully);
        if (fully != 4) {
            throw new IOException("premature end of stream");
        }
        long j = 0;
        for (int i = 0; i < 4; i++) {
            j |= (((long) bArr[i]) & 255) << (i << 3);
        }
        return j;
    }

    private int readSize() throws IOException {
        int i = 0;
        for (int i2 = 0; i2 < 3; i2++) {
            int oneByte = readOneByte();
            if (oneByte == -1) {
                throw new IOException("premature end of stream");
            }
            i |= oneByte << (i2 << 3);
        }
        return i;
    }

    private void skipBlock() throws IOException {
        long size = readSize();
        long jSkip = IOUtils.skip(this.f16in, size);
        count(jSkip);
        if (jSkip != size) {
            throw new IOException("premature end of stream");
        }
    }

    private void readStreamIdentifier() throws IOException {
        byte[] bArr = new byte[10];
        int fully = IOUtils.readFully(this.f16in, bArr);
        count(fully);
        if (10 != fully || !matches(bArr, 10)) {
            throw new IOException("Not a framed Snappy stream");
        }
    }

    private int readOneByte() throws IOException {
        int i = this.f16in.read();
        if (i == -1) {
            return -1;
        }
        count(1);
        return i & 255;
    }

    private void verifyLastChecksumAndReset() throws IOException {
        long j = this.expectedChecksum;
        if (j >= 0 && j != this.checksum.getValue()) {
            throw new IOException("Checksum verification failed");
        }
        this.expectedChecksum = -1L;
        this.checksum.reset();
    }

    public static boolean matches(byte[] bArr, int i) {
        byte[] bArr2 = SZ_SIGNATURE;
        if (i < bArr2.length) {
            return false;
        }
        if (bArr.length > bArr2.length) {
            byte[] bArr3 = new byte[bArr2.length];
            System.arraycopy(bArr, 0, bArr3, 0, bArr2.length);
            bArr = bArr3;
        }
        return Arrays.equals(bArr, bArr2);
    }
}
