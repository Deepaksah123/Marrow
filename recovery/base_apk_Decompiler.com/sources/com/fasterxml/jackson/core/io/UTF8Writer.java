package com.fasterxml.jackson.core.io;

import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;

/* JADX INFO: loaded from: classes2.dex */
public final class UTF8Writer extends Writer {
    private final IOContext _context;
    private OutputStream _out;
    private byte[] _outBuffer;
    private final int _outBufferEnd;
    private int _outPtr = 0;
    private int _surrogate;

    @Override // java.io.Writer, java.lang.Appendable
    public final /* bridge */ /* synthetic */ Appendable append(char c) throws IOException {
        return append(c);
    }

    public UTF8Writer(IOContext iOContext, OutputStream outputStream) {
        this._context = iOContext;
        this._out = outputStream;
        this._outBuffer = iOContext.allocWriteEncodingBuffer();
        this._outBufferEnd = r1.length - 4;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Writer append(char c) throws IOException {
        write(c);
        return this;
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        OutputStream outputStream = this._out;
        if (outputStream != null) {
            int i = this._outPtr;
            if (i > 0) {
                outputStream.write(this._outBuffer, 0, i);
                this._outPtr = 0;
            }
            OutputStream outputStream2 = this._out;
            this._out = null;
            byte[] bArr = this._outBuffer;
            if (bArr != null) {
                this._outBuffer = null;
                this._context.releaseWriteEncodingBuffer(bArr);
            }
            outputStream2.close();
            int i2 = this._surrogate;
            this._surrogate = 0;
            if (i2 > 0) {
                illegalSurrogate(i2);
            }
        }
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() throws IOException {
        OutputStream outputStream = this._out;
        if (outputStream != null) {
            int i = this._outPtr;
            if (i > 0) {
                outputStream.write(this._outBuffer, 0, i);
                this._outPtr = 0;
            }
            this._out.flush();
        }
    }

    @Override // java.io.Writer
    public final void write(char[] cArr) throws IOException {
        write(cArr, 0, cArr.length);
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i, int i2) throws IOException {
        int i3;
        if (i2 < 2) {
            if (i2 == 1) {
                write(cArr[i]);
                return;
            }
            return;
        }
        if (this._surrogate > 0) {
            i2--;
            write(convertSurrogate(cArr[i]));
            i++;
        }
        int i4 = this._outPtr;
        byte[] bArr = this._outBuffer;
        int i5 = this._outBufferEnd;
        int i6 = i2 + i;
        while (i < i6) {
            if (i4 >= i5) {
                this._out.write(bArr, 0, i4);
                i4 = 0;
            }
            int i7 = i + 1;
            char c = cArr[i];
            if (c < 128) {
                i3 = i4 + 1;
                bArr[i4] = (byte) c;
                int i8 = i6 - i7;
                int i9 = i5 - i3;
                if (i8 > i9) {
                    i8 = i9;
                }
                int i10 = i7;
                while (i10 < i8 + i7) {
                    int i11 = i10 + 1;
                    char c2 = cArr[i10];
                    if (c2 < 128) {
                        bArr[i3] = (byte) c2;
                        i10 = i11;
                        i3++;
                    } else {
                        c = c2;
                        i4 = i3;
                        i7 = i11;
                    }
                }
                i = i10;
                i4 = i3;
            }
            if (c < 2048) {
                bArr[i4] = (byte) ((c >> 6) | PsExtractor.AUDIO_STREAM);
                i3 = i4 + 2;
                bArr[i4 + 1] = (byte) ((c & '?') | 128);
            } else if (c < 55296 || c > 57343) {
                bArr[i4] = (byte) ((c >> '\f') | 224);
                bArr[i4 + 1] = (byte) (((c >> 6) & 63) | 128);
                i3 = i4 + 3;
                bArr[i4 + 2] = (byte) ((c & '?') | 128);
            } else {
                if (c > 56319) {
                    this._outPtr = i4;
                    illegalSurrogate(c);
                }
                this._surrogate = c;
                if (i7 >= i6) {
                    break;
                }
                i = i7 + 1;
                int iConvertSurrogate = convertSurrogate(cArr[i7]);
                if (iConvertSurrogate > 1114111) {
                    this._outPtr = i4;
                    illegalSurrogate(iConvertSurrogate);
                }
                bArr[i4] = (byte) ((iConvertSurrogate >> 18) | PsExtractor.VIDEO_STREAM_MASK);
                bArr[i4 + 1] = (byte) (((iConvertSurrogate >> 12) & 63) | 128);
                bArr[i4 + 2] = (byte) (((iConvertSurrogate >> 6) & 63) | 128);
                i3 = i4 + 4;
                bArr[i4 + 3] = (byte) ((iConvertSurrogate & 63) | 128);
                i4 = i3;
            }
            i = i7;
            i4 = i3;
        }
        this._outPtr = i4;
    }

    @Override // java.io.Writer
    public final void write(int i) throws IOException {
        int i2;
        if (this._surrogate > 0) {
            i = convertSurrogate(i);
        } else if (i >= 55296 && i <= 57343) {
            if (i > 56319) {
                illegalSurrogate(i);
            }
            this._surrogate = i;
            return;
        }
        int i3 = this._outPtr;
        if (i3 >= this._outBufferEnd) {
            this._out.write(this._outBuffer, 0, i3);
            this._outPtr = 0;
        }
        if (i < 128) {
            byte[] bArr = this._outBuffer;
            int i4 = this._outPtr;
            this._outPtr = i4 + 1;
            bArr[i4] = (byte) i;
            return;
        }
        int i5 = this._outPtr;
        if (i < 2048) {
            byte[] bArr2 = this._outBuffer;
            bArr2[i5] = (byte) ((i >> 6) | PsExtractor.AUDIO_STREAM);
            i2 = i5 + 2;
            bArr2[i5 + 1] = (byte) ((i & 63) | 128);
        } else if (i <= 65535) {
            byte[] bArr3 = this._outBuffer;
            bArr3[i5] = (byte) ((i >> 12) | 224);
            bArr3[i5 + 1] = (byte) (((i >> 6) & 63) | 128);
            i2 = i5 + 3;
            bArr3[i5 + 2] = (byte) ((i & 63) | 128);
        } else {
            if (i > 1114111) {
                illegalSurrogate(i);
            }
            byte[] bArr4 = this._outBuffer;
            bArr4[i5] = (byte) ((i >> 18) | PsExtractor.VIDEO_STREAM_MASK);
            bArr4[i5 + 1] = (byte) (((i >> 12) & 63) | 128);
            bArr4[i5 + 2] = (byte) (((i >> 6) & 63) | 128);
            i2 = i5 + 4;
            bArr4[i5 + 3] = (byte) ((i & 63) | 128);
        }
        this._outPtr = i2;
    }

    @Override // java.io.Writer
    public final void write(String str) throws IOException {
        write(str, 0, str.length());
    }

    @Override // java.io.Writer
    public final void write(String str, int i, int i2) throws IOException {
        int i3;
        if (i2 < 2) {
            if (i2 == 1) {
                write(str.charAt(i));
                return;
            }
            return;
        }
        if (this._surrogate > 0) {
            i2--;
            write(convertSurrogate(str.charAt(i)));
            i++;
        }
        int i4 = this._outPtr;
        byte[] bArr = this._outBuffer;
        int i5 = this._outBufferEnd;
        int i6 = i2 + i;
        while (i < i6) {
            if (i4 >= i5) {
                this._out.write(bArr, 0, i4);
                i4 = 0;
            }
            int i7 = i + 1;
            char cCharAt = str.charAt(i);
            if (cCharAt < 128) {
                i3 = i4 + 1;
                bArr[i4] = (byte) cCharAt;
                int i8 = i6 - i7;
                int i9 = i5 - i3;
                if (i8 > i9) {
                    i8 = i9;
                }
                int i10 = i7;
                while (i10 < i8 + i7) {
                    int i11 = i10 + 1;
                    char cCharAt2 = str.charAt(i10);
                    if (cCharAt2 < 128) {
                        bArr[i3] = (byte) cCharAt2;
                        i10 = i11;
                        i3++;
                    } else {
                        cCharAt = cCharAt2;
                        i4 = i3;
                        i7 = i11;
                    }
                }
                i = i10;
                i4 = i3;
            }
            if (cCharAt < 2048) {
                bArr[i4] = (byte) ((cCharAt >> 6) | PsExtractor.AUDIO_STREAM);
                i3 = i4 + 2;
                bArr[i4 + 1] = (byte) ((cCharAt & '?') | 128);
            } else if (cCharAt < 55296 || cCharAt > 57343) {
                bArr[i4] = (byte) ((cCharAt >> '\f') | 224);
                bArr[i4 + 1] = (byte) (((cCharAt >> 6) & 63) | 128);
                i3 = i4 + 3;
                bArr[i4 + 2] = (byte) ((cCharAt & '?') | 128);
            } else {
                if (cCharAt > 56319) {
                    this._outPtr = i4;
                    illegalSurrogate(cCharAt);
                }
                this._surrogate = cCharAt;
                if (i7 >= i6) {
                    break;
                }
                i = i7 + 1;
                int iConvertSurrogate = convertSurrogate(str.charAt(i7));
                if (iConvertSurrogate > 1114111) {
                    this._outPtr = i4;
                    illegalSurrogate(iConvertSurrogate);
                }
                bArr[i4] = (byte) ((iConvertSurrogate >> 18) | PsExtractor.VIDEO_STREAM_MASK);
                bArr[i4 + 1] = (byte) (((iConvertSurrogate >> 12) & 63) | 128);
                bArr[i4 + 2] = (byte) (((iConvertSurrogate >> 6) & 63) | 128);
                i3 = i4 + 4;
                bArr[i4 + 3] = (byte) ((iConvertSurrogate & 63) | 128);
                i4 = i3;
            }
            i = i7;
            i4 = i3;
        }
        this._outPtr = i4;
    }

    protected final int convertSurrogate(int i) throws IOException {
        int i2 = this._surrogate;
        this._surrogate = 0;
        if (i >= 56320 && i <= 57343) {
            return ((i2 - 55296) << 10) + C.DEFAULT_BUFFER_SEGMENT_SIZE + (i - 56320);
        }
        StringBuilder sb = new StringBuilder("Broken surrogate pair: first char 0x");
        sb.append(Integer.toHexString(i2));
        sb.append(", second 0x");
        sb.append(Integer.toHexString(i));
        sb.append("; illegal combination");
        throw new IOException(sb.toString());
    }

    protected static void illegalSurrogate(int i) throws IOException {
        throw new IOException(illegalSurrogateDesc(i));
    }

    protected static String illegalSurrogateDesc(int i) {
        if (i > 1114111) {
            StringBuilder sb = new StringBuilder("Illegal character point (0x");
            sb.append(Integer.toHexString(i));
            sb.append(") to output; max is 0x10FFFF as per RFC 4627");
            return sb.toString();
        }
        if (i < 55296) {
            StringBuilder sb2 = new StringBuilder("Illegal character point (0x");
            sb2.append(Integer.toHexString(i));
            sb2.append(") to output");
            return sb2.toString();
        }
        if (i <= 56319) {
            StringBuilder sb3 = new StringBuilder("Unmatched first part of surrogate pair (0x");
            sb3.append(Integer.toHexString(i));
            sb3.append(")");
            return sb3.toString();
        }
        StringBuilder sb4 = new StringBuilder("Unmatched second part of surrogate pair (0x");
        sb4.append(Integer.toHexString(i));
        sb4.append(")");
        return sb4.toString();
    }
}
