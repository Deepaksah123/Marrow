package com.fasterxml.jackson.core.io;

import com.fasterxml.jackson.core.util.ByteArrayBuilder;
import com.fasterxml.jackson.core.util.TextBuffer;
import com.google.android.exoplayer2.C;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class JsonStringEncoder {
    private static final char[] HC = CharTypes.copyHexChars(true);
    private static final byte[] HB = CharTypes.copyHexBytes(true);
    private static final JsonStringEncoder instance = new JsonStringEncoder();

    public static JsonStringEncoder getInstance() {
        return instance;
    }

    public final char[] quoteAsString(String str) {
        int i_appendNamed;
        int length = str.length();
        char[] cArrFinishCurrentSegment = new char[_initialCharBufSize(length)];
        int[] iArr = CharTypes.get7BitOutputEscapes();
        int length2 = iArr.length;
        TextBuffer textBufferFromInitial = null;
        char[] cArr_qbuf = null;
        int i = 0;
        int i2 = 0;
        loop0: while (i2 < length) {
            do {
                char cCharAt = str.charAt(i2);
                if (cCharAt >= length2 || iArr[cCharAt] == 0) {
                    if (i >= cArrFinishCurrentSegment.length) {
                        if (textBufferFromInitial == null) {
                            textBufferFromInitial = TextBuffer.fromInitial(cArrFinishCurrentSegment);
                        }
                        try {
                            cArrFinishCurrentSegment = textBufferFromInitial.finishCurrentSegment();
                            i = 0;
                        } catch (IOException e) {
                            throw new IllegalStateException(e);
                        }
                    }
                    cArrFinishCurrentSegment[i] = cCharAt;
                    i2++;
                    i++;
                } else {
                    if (cArr_qbuf == null) {
                        cArr_qbuf = _qbuf();
                    }
                    char cCharAt2 = str.charAt(i2);
                    int i3 = iArr[cCharAt2];
                    if (i3 < 0) {
                        i_appendNamed = _appendNumeric(cCharAt2, cArr_qbuf);
                    } else {
                        i_appendNamed = _appendNamed(i3, cArr_qbuf);
                    }
                    int i4 = i + i_appendNamed;
                    if (i4 > cArrFinishCurrentSegment.length) {
                        int length3 = cArrFinishCurrentSegment.length - i;
                        if (length3 > 0) {
                            System.arraycopy(cArr_qbuf, 0, cArrFinishCurrentSegment, i, length3);
                        }
                        if (textBufferFromInitial == null) {
                            textBufferFromInitial = TextBuffer.fromInitial(cArrFinishCurrentSegment);
                        }
                        try {
                            cArrFinishCurrentSegment = textBufferFromInitial.finishCurrentSegment();
                            int i5 = i_appendNamed - length3;
                            System.arraycopy(cArr_qbuf, length3, cArrFinishCurrentSegment, 0, i5);
                            i = i5;
                        } catch (IOException e2) {
                            throw new IllegalStateException(e2);
                        }
                    } else {
                        System.arraycopy(cArr_qbuf, 0, cArrFinishCurrentSegment, i, i_appendNamed);
                        i = i4;
                    }
                    i2++;
                }
            } while (i2 < length);
        }
        if (textBufferFromInitial == null) {
            return Arrays.copyOfRange(cArrFinishCurrentSegment, 0, i);
        }
        textBufferFromInitial.setCurrentLength(i);
        try {
            return textBufferFromInitial.contentsAsArray();
        } catch (IOException e3) {
            throw new IllegalStateException(e3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x00f3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final byte[] quoteAsUTF8(java.lang.String r12) {
        /*
            Method dump skipped, instruction units count: 269
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.io.JsonStringEncoder.quoteAsUTF8(java.lang.String):byte[]");
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00de A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final byte[] encodeAsUTF8(java.lang.String r11) {
        /*
            Method dump skipped, instruction units count: 245
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.io.JsonStringEncoder.encodeAsUTF8(java.lang.String):byte[]");
    }

    private char[] _qbuf() {
        return new char[]{'\\', 0, '0', '0', 0, 0};
    }

    private int _appendNumeric(int i, char[] cArr) {
        cArr[1] = 'u';
        char[] cArr2 = HC;
        cArr[4] = cArr2[i >> 4];
        cArr[5] = cArr2[i & 15];
        return 6;
    }

    private int _appendNamed(int i, char[] cArr) {
        cArr[1] = (char) i;
        return 2;
    }

    private int _appendByte(int i, int i2, ByteArrayBuilder byteArrayBuilder, int i3) {
        byteArrayBuilder.setCurrentSegmentLength(i3);
        byteArrayBuilder.append(92);
        if (i2 < 0) {
            byteArrayBuilder.append(117);
            if (i > 255) {
                byte[] bArr = HB;
                byteArrayBuilder.append(bArr[i >> 12]);
                byteArrayBuilder.append(bArr[(i >> 8) & 15]);
                i &= 255;
            } else {
                byteArrayBuilder.append(48);
                byteArrayBuilder.append(48);
            }
            byte[] bArr2 = HB;
            byteArrayBuilder.append(bArr2[i >> 4]);
            byteArrayBuilder.append(bArr2[i & 15]);
        } else {
            byteArrayBuilder.append((byte) i2);
        }
        return byteArrayBuilder.getCurrentSegmentLength();
    }

    private static int _convert(int i, int i2) {
        if (i2 >= 56320 && i2 <= 57343) {
            return ((i - 55296) << 10) + C.DEFAULT_BUFFER_SEGMENT_SIZE + (i2 - 56320);
        }
        StringBuilder sb = new StringBuilder("Broken surrogate pair: first char 0x");
        sb.append(Integer.toHexString(i));
        sb.append(", second 0x");
        sb.append(Integer.toHexString(i2));
        sb.append("; illegal combination");
        throw new IllegalArgumentException(sb.toString());
    }

    private static void _illegal(int i) {
        throw new IllegalArgumentException(UTF8Writer.illegalSurrogateDesc(i));
    }

    static int _initialCharBufSize(int i) {
        return Math.min(Math.max(16, i + Math.min((i >> 3) + 6, 1000)), 32000);
    }

    static int _initialByteBufSize(int i) {
        return Math.min(Math.max(24, i + 6 + (i >> 1)), 32000);
    }
}
