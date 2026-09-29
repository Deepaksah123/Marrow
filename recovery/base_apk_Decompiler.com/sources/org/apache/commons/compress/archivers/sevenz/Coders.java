package org.apache.commons.compress.archivers.sevenz;

import java.io.FilterInputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;
import java.util.zip.InflaterInputStream;
import org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream;
import org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream;
import org.tukaani.xz.ARMOptions;
import org.tukaani.xz.ARMThumbOptions;
import org.tukaani.xz.FilterOptions;
import org.tukaani.xz.FinishableWrapperOutputStream;
import org.tukaani.xz.IA64Options;
import org.tukaani.xz.LZMAInputStream;
import org.tukaani.xz.PowerPCOptions;
import org.tukaani.xz.SPARCOptions;
import org.tukaani.xz.X86Options;

/* JADX INFO: loaded from: classes5.dex */
class Coders {
    private static final Map<SevenZMethod, CoderBase> CODER_MAP = new HashMap<SevenZMethod, CoderBase>() { // from class: org.apache.commons.compress.archivers.sevenz.Coders.1
        private static final long serialVersionUID = 1664829131806520867L;

        {
            put(SevenZMethod.COPY, new CopyDecoder());
            put(SevenZMethod.LZMA, new LZMADecoder());
            put(SevenZMethod.LZMA2, new LZMA2Decoder());
            put(SevenZMethod.DEFLATE, new DeflateDecoder());
            put(SevenZMethod.BZIP2, new BZIP2Decoder());
            put(SevenZMethod.AES256SHA256, new AES256SHA256Decoder());
            put(SevenZMethod.BCJ_X86_FILTER, new BCJDecoder(new X86Options()));
            put(SevenZMethod.BCJ_PPC_FILTER, new BCJDecoder(new PowerPCOptions()));
            put(SevenZMethod.BCJ_IA64_FILTER, new BCJDecoder(new IA64Options()));
            put(SevenZMethod.BCJ_ARM_FILTER, new BCJDecoder(new ARMOptions()));
            put(SevenZMethod.BCJ_ARM_THUMB_FILTER, new BCJDecoder(new ARMThumbOptions()));
            put(SevenZMethod.BCJ_SPARC_FILTER, new BCJDecoder(new SPARCOptions()));
            put(SevenZMethod.DELTA_FILTER, new DeltaDecoder());
        }
    };

    Coders() {
    }

    static CoderBase findByMethod(SevenZMethod sevenZMethod) {
        return CODER_MAP.get(sevenZMethod);
    }

    static InputStream addDecoder(String str, InputStream inputStream, long j, Coder coder, byte[] bArr) throws IOException {
        CoderBase coderBaseFindByMethod = findByMethod(SevenZMethod.byId(coder.decompressionMethodId));
        if (coderBaseFindByMethod == null) {
            StringBuilder sb = new StringBuilder("Unsupported compression method ");
            sb.append(Arrays.toString(coder.decompressionMethodId));
            sb.append(" used in ");
            sb.append(str);
            throw new IOException(sb.toString());
        }
        return coderBaseFindByMethod.decode(str, inputStream, j, coder, bArr);
    }

    static OutputStream addEncoder(OutputStream outputStream, SevenZMethod sevenZMethod, Object obj) throws IOException {
        CoderBase coderBaseFindByMethod = findByMethod(sevenZMethod);
        if (coderBaseFindByMethod == null) {
            throw new IOException("Unsupported compression method ".concat(String.valueOf(sevenZMethod)));
        }
        return coderBaseFindByMethod.encode(outputStream, obj);
    }

    static class CopyDecoder extends CoderBase {
        @Override // org.apache.commons.compress.archivers.sevenz.CoderBase
        InputStream decode(String str, InputStream inputStream, long j, Coder coder, byte[] bArr) throws IOException {
            return inputStream;
        }

        @Override // org.apache.commons.compress.archivers.sevenz.CoderBase
        OutputStream encode(OutputStream outputStream, Object obj) {
            return outputStream;
        }

        CopyDecoder() {
            super(new Class[0]);
        }
    }

    static class LZMADecoder extends CoderBase {
        LZMADecoder() {
            super(new Class[0]);
        }

        @Override // org.apache.commons.compress.archivers.sevenz.CoderBase
        InputStream decode(String str, InputStream inputStream, long j, Coder coder, byte[] bArr) throws IOException {
            byte b = coder.properties[0];
            int i = 1;
            long j2 = coder.properties[1];
            while (i < 4) {
                int i2 = i + 1;
                j2 |= (((long) coder.properties[i2]) & 255) << (i << 3);
                i = i2;
            }
            if (j2 > 2147483632) {
                throw new IOException("Dictionary larger than 4GiB maximum size used in ".concat(String.valueOf(str)));
            }
            return new LZMAInputStream(inputStream, j, b, (int) j2);
        }
    }

    static class BCJDecoder extends CoderBase {
        private final FilterOptions opts;

        BCJDecoder(FilterOptions filterOptions) {
            super(new Class[0]);
            this.opts = filterOptions;
        }

        @Override // org.apache.commons.compress.archivers.sevenz.CoderBase
        InputStream decode(String str, InputStream inputStream, long j, Coder coder, byte[] bArr) throws IOException {
            try {
                return this.opts.getInputStream(inputStream);
            } catch (AssertionError e) {
                StringBuilder sb = new StringBuilder("BCJ filter used in ");
                sb.append(str);
                sb.append(" needs XZ for Java > 1.4 - see http://commons.apache.org/proper/commons-compress/limitations.html#7Z");
                throw new IOException(sb.toString(), e);
            }
        }

        @Override // org.apache.commons.compress.archivers.sevenz.CoderBase
        OutputStream encode(OutputStream outputStream, Object obj) {
            return new FilterOutputStream(this.opts.getOutputStream(new FinishableWrapperOutputStream(outputStream))) { // from class: org.apache.commons.compress.archivers.sevenz.Coders.BCJDecoder.1
                @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
                public void flush() {
                }
            };
        }
    }

    static class DeflateDecoder extends CoderBase {
        DeflateDecoder() {
            super(Number.class);
        }

        @Override // org.apache.commons.compress.archivers.sevenz.CoderBase
        InputStream decode(String str, InputStream inputStream, long j, Coder coder, byte[] bArr) throws IOException {
            final Inflater inflater = new Inflater(true);
            final InflaterInputStream inflaterInputStream = new InflaterInputStream(new DummyByteAddingInputStream(inputStream), inflater);
            return new InputStream() { // from class: org.apache.commons.compress.archivers.sevenz.Coders.DeflateDecoder.1
                @Override // java.io.InputStream
                public int read() throws IOException {
                    return inflaterInputStream.read();
                }

                @Override // java.io.InputStream
                public int read(byte[] bArr2, int i, int i2) throws IOException {
                    return inflaterInputStream.read(bArr2, i, i2);
                }

                @Override // java.io.InputStream
                public int read(byte[] bArr2) throws IOException {
                    return inflaterInputStream.read(bArr2);
                }

                @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
                public void close() throws IOException {
                    try {
                        inflaterInputStream.close();
                    } finally {
                        inflater.end();
                    }
                }
            };
        }

        @Override // org.apache.commons.compress.archivers.sevenz.CoderBase
        OutputStream encode(OutputStream outputStream, Object obj) {
            final Deflater deflater = new Deflater(numberOptionOrDefault(obj, 9), true);
            final DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(outputStream, deflater);
            return new OutputStream() { // from class: org.apache.commons.compress.archivers.sevenz.Coders.DeflateDecoder.2
                @Override // java.io.OutputStream
                public void write(int i) throws IOException {
                    deflaterOutputStream.write(i);
                }

                @Override // java.io.OutputStream
                public void write(byte[] bArr) throws IOException {
                    deflaterOutputStream.write(bArr);
                }

                @Override // java.io.OutputStream
                public void write(byte[] bArr, int i, int i2) throws IOException {
                    deflaterOutputStream.write(bArr, i, i2);
                }

                @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
                public void close() throws IOException {
                    try {
                        deflaterOutputStream.close();
                    } finally {
                        deflater.end();
                    }
                }
            };
        }
    }

    static class BZIP2Decoder extends CoderBase {
        BZIP2Decoder() {
            super(Number.class);
        }

        @Override // org.apache.commons.compress.archivers.sevenz.CoderBase
        InputStream decode(String str, InputStream inputStream, long j, Coder coder, byte[] bArr) throws IOException {
            return new BZip2CompressorInputStream(inputStream);
        }

        @Override // org.apache.commons.compress.archivers.sevenz.CoderBase
        OutputStream encode(OutputStream outputStream, Object obj) throws IOException {
            return new BZip2CompressorOutputStream(outputStream, numberOptionOrDefault(obj, 9));
        }
    }

    static class DummyByteAddingInputStream extends FilterInputStream {
        private boolean addDummyByte;

        private DummyByteAddingInputStream(InputStream inputStream) {
            super(inputStream);
            this.addDummyByte = true;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read() throws IOException {
            int i = super.read();
            if (i != -1 || !this.addDummyByte) {
                return i;
            }
            this.addDummyByte = false;
            return 0;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read(byte[] bArr, int i, int i2) throws IOException {
            int i3 = super.read(bArr, i, i2);
            if (i3 != -1 || !this.addDummyByte) {
                return i3;
            }
            this.addDummyByte = false;
            bArr[i] = 0;
            return 1;
        }
    }
}
