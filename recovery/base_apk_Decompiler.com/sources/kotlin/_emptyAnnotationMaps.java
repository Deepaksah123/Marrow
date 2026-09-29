package kotlin;

import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;

/* JADX INFO: loaded from: classes4.dex */
final class _emptyAnnotationMaps {
    private static final IconCompatParcelizer read;

    /* JADX INFO: Access modifiers changed from: private */
    public static int AudioAttributesCompatParcelizer(int i) {
        if (i > -12) {
            return -1;
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int read(int i, int i2) {
        if (i > -12 || i2 > -65) {
            return -1;
        }
        return i ^ (i2 << 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int write(int i, int i2, int i3) {
        if (i > -12 || i2 > -65 || i3 > -65) {
            return -1;
        }
        return (i ^ (i2 << 8)) ^ (i3 << 16);
    }

    static {
        read = (!read.AudioAttributesCompatParcelizer() || AnnotatedMethodCollectorMethodBuilder.RemoteActionCompatParcelizer()) ? new RemoteActionCompatParcelizer() : new read();
    }

    public static boolean write(byte[] bArr) {
        return read.read(bArr, 0, bArr.length);
    }

    public static boolean write(byte[] bArr, int i, int i2) {
        return read.read(bArr, i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int IconCompatParcelizer(byte[] bArr, int i, int i2) {
        byte b = bArr[i - 1];
        int i3 = i2 - i;
        if (i3 == 0) {
            return AudioAttributesCompatParcelizer(b);
        }
        if (i3 == 1) {
            return read(b, bArr[i]);
        }
        if (i3 == 2) {
            return write(b, bArr[i], bArr[i + 1]);
        }
        throw new AssertionError();
    }

    static class write extends IllegalArgumentException {
        write(int i, int i2) {
            StringBuilder sb = new StringBuilder("Unpaired surrogate at index ");
            sb.append(i);
            sb.append(" of ");
            sb.append(i2);
            super(sb.toString());
        }
    }

    static int write(CharSequence charSequence) {
        int length = charSequence.length();
        int i = 0;
        while (i < length && charSequence.charAt(i) < 128) {
            i++;
        }
        int iRemoteActionCompatParcelizer = length;
        while (true) {
            if (i < length) {
                char cCharAt = charSequence.charAt(i);
                if (cCharAt >= 2048) {
                    iRemoteActionCompatParcelizer += RemoteActionCompatParcelizer(charSequence, i);
                    break;
                }
                iRemoteActionCompatParcelizer += (127 - cCharAt) >>> 31;
                i++;
            } else {
                break;
            }
        }
        if (iRemoteActionCompatParcelizer >= length) {
            return iRemoteActionCompatParcelizer;
        }
        StringBuilder sb = new StringBuilder("UTF-8 length does not fit in int: ");
        long j = 0;
        sb.append(((long) iRemoteActionCompatParcelizer) + ((((long) 1) << 32) | (j - ((j >> 63) << 32))));
        throw new IllegalArgumentException(sb.toString());
    }

    private static int RemoteActionCompatParcelizer(CharSequence charSequence, int i) {
        int length = charSequence.length();
        int i2 = 0;
        while (i < length) {
            char cCharAt = charSequence.charAt(i);
            if (cCharAt < 2048) {
                i2 += (127 - cCharAt) >>> 31;
            } else {
                i2 += 2;
                if (55296 <= cCharAt && cCharAt <= 57343) {
                    if (Character.codePointAt(charSequence, i) < 65536) {
                        throw new write(i, length);
                    }
                    i++;
                }
            }
            i++;
        }
        return i2;
    }

    static int write(CharSequence charSequence, byte[] bArr, int i, int i2) {
        return read.write(charSequence, bArr, i, i2);
    }

    static String RemoteActionCompatParcelizer(byte[] bArr, int i, int i2) throws _add {
        return read.AudioAttributesCompatParcelizer(bArr, i, i2);
    }

    static abstract class IconCompatParcelizer {
        abstract String AudioAttributesCompatParcelizer(byte[] bArr, int i, int i2) throws _add;

        abstract int IconCompatParcelizer(byte[] bArr, int i, int i2);

        abstract int write(CharSequence charSequence, byte[] bArr, int i, int i2);

        IconCompatParcelizer() {
        }

        final boolean read(byte[] bArr, int i, int i2) {
            return IconCompatParcelizer(bArr, i, i2) == 0;
        }
    }

    static final class RemoteActionCompatParcelizer extends IconCompatParcelizer {
        RemoteActionCompatParcelizer() {
        }

        @Override // o._emptyAnnotationMaps.IconCompatParcelizer
        final int IconCompatParcelizer(byte[] bArr, int i, int i2) {
            return write(bArr, i, i2);
        }

        @Override // o._emptyAnnotationMaps.IconCompatParcelizer
        final String AudioAttributesCompatParcelizer(byte[] bArr, int i, int i2) throws _add {
            if ((i | i2 | ((bArr.length - i) - i2)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)));
            }
            int i3 = i + i2;
            char[] cArr = new char[i2];
            int i4 = 0;
            while (i < i3) {
                byte b = bArr[i];
                if (!AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(b)) {
                    break;
                }
                i++;
                AudioAttributesCompatParcelizer.read(b, cArr, i4);
                i4++;
            }
            int i5 = i4;
            while (i < i3) {
                int i6 = i + 1;
                byte b2 = bArr[i];
                if (AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(b2)) {
                    AudioAttributesCompatParcelizer.read(b2, cArr, i5);
                    i5++;
                    i = i6;
                    while (i < i3) {
                        byte b3 = bArr[i];
                        if (AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(b3)) {
                            i++;
                            AudioAttributesCompatParcelizer.read(b3, cArr, i5);
                            i5++;
                        }
                    }
                } else if (AudioAttributesCompatParcelizer.AudioAttributesImplBaseParcelizer(b2)) {
                    if (i6 >= i3) {
                        throw _add.RemoteActionCompatParcelizer();
                    }
                    i += 2;
                    AudioAttributesCompatParcelizer.write(b2, bArr[i6], cArr, i5);
                    i5++;
                } else if (AudioAttributesCompatParcelizer.AudioAttributesImplApi21Parcelizer(b2)) {
                    if (i6 >= i3 - 1) {
                        throw _add.RemoteActionCompatParcelizer();
                    }
                    AudioAttributesCompatParcelizer.write(b2, bArr[i6], bArr[i + 2], cArr, i5);
                    i5++;
                    i += 3;
                } else {
                    if (i6 >= i3 - 2) {
                        throw _add.RemoteActionCompatParcelizer();
                    }
                    AudioAttributesCompatParcelizer.write(b2, bArr[i6], bArr[i + 2], bArr[i + 3], cArr, i5);
                    i5 += 2;
                    i += 4;
                }
            }
            return new String(cArr, 0, i5);
        }

        @Override // o._emptyAnnotationMaps.IconCompatParcelizer
        final int write(CharSequence charSequence, byte[] bArr, int i, int i2) {
            int i3;
            int i4;
            int i5;
            char cCharAt;
            int length = charSequence.length();
            int i6 = i2 + i;
            int i7 = 0;
            while (i7 < length && (i5 = i7 + i) < i6 && (cCharAt = charSequence.charAt(i7)) < 128) {
                bArr[i5] = (byte) cCharAt;
                i7++;
            }
            if (i7 == length) {
                return i + length;
            }
            int i8 = i + i7;
            while (i7 < length) {
                char cCharAt2 = charSequence.charAt(i7);
                if (cCharAt2 >= 128 || i8 >= i6) {
                    if (cCharAt2 < 2048 && i8 <= i6 - 2) {
                        bArr[i8] = (byte) ((cCharAt2 >>> 6) | 960);
                        i3 = i8 + 2;
                        bArr[i8 + 1] = (byte) ((cCharAt2 & '?') | 128);
                    } else {
                        if ((cCharAt2 >= 55296 && 57343 >= cCharAt2) || i8 > i6 - 3) {
                            if (i8 <= i6 - 4) {
                                int i9 = i7 + 1;
                                if (i9 != charSequence.length()) {
                                    char cCharAt3 = charSequence.charAt(i9);
                                    if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                        int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                        bArr[i8] = (byte) ((codePoint >>> 18) | PsExtractor.VIDEO_STREAM_MASK);
                                        bArr[i8 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                                        bArr[i8 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                                        bArr[i8 + 3] = (byte) ((codePoint & 63) | 128);
                                        i8 += 4;
                                        i7 = i9;
                                    } else {
                                        i7 = i9;
                                    }
                                }
                                throw new write(i7 - 1, length);
                            }
                            if (55296 <= cCharAt2 && cCharAt2 <= 57343 && ((i4 = i7 + 1) == charSequence.length() || !Character.isSurrogatePair(cCharAt2, charSequence.charAt(i4)))) {
                                throw new write(i7, length);
                            }
                            StringBuilder sb = new StringBuilder("Failed writing ");
                            sb.append(cCharAt2);
                            sb.append(" at index ");
                            sb.append(i8);
                            throw new ArrayIndexOutOfBoundsException(sb.toString());
                        }
                        bArr[i8] = (byte) ((cCharAt2 >>> '\f') | 480);
                        bArr[i8 + 1] = (byte) (((cCharAt2 >>> 6) & 63) | 128);
                        i3 = i8 + 3;
                        bArr[i8 + 2] = (byte) ((cCharAt2 & '?') | 128);
                    }
                    i8 = i3;
                } else {
                    bArr[i8] = (byte) cCharAt2;
                    i8++;
                }
                i7++;
            }
            return i8;
        }

        private static int write(byte[] bArr, int i, int i2) {
            while (i < i2 && bArr[i] >= 0) {
                i++;
            }
            if (i >= i2) {
                return 0;
            }
            return RemoteActionCompatParcelizer(bArr, i, i2);
        }

        private static int RemoteActionCompatParcelizer(byte[] bArr, int i, int i2) {
            while (i < i2) {
                int i3 = i + 1;
                byte b = bArr[i];
                if (b < 0) {
                    if (b < -32) {
                        if (i3 >= i2) {
                            return b;
                        }
                        if (b >= -62) {
                            i += 2;
                            if (bArr[i3] > -65) {
                            }
                        }
                        return -1;
                    }
                    if (b >= -16) {
                        if (i3 >= i2 - 2) {
                            return _emptyAnnotationMaps.IconCompatParcelizer(bArr, i3, i2);
                        }
                        byte b2 = bArr[i3];
                        if (b2 <= -65 && (((b << 28) + (b2 + 112)) >> 30) == 0 && bArr[i + 2] <= -65) {
                            i3 = i + 4;
                            if (bArr[i + 3] > -65) {
                            }
                        }
                        return -1;
                    }
                    if (i3 >= i2 - 1) {
                        return _emptyAnnotationMaps.IconCompatParcelizer(bArr, i3, i2);
                    }
                    byte b3 = bArr[i3];
                    if (b3 <= -65 && ((b != -32 || b3 >= -96) && (b != -19 || b3 < -96))) {
                        i3 = i + 3;
                        if (bArr[i + 2] > -65) {
                        }
                    }
                    return -1;
                }
                i = i3;
            }
            return 0;
        }
    }

    static final class read extends IconCompatParcelizer {
        read() {
        }

        static boolean AudioAttributesCompatParcelizer() {
            return ClassIntrospectorMixInResolver.AudioAttributesCompatParcelizer() && ClassIntrospectorMixInResolver.RemoteActionCompatParcelizer();
        }

        @Override // o._emptyAnnotationMaps.IconCompatParcelizer
        final int IconCompatParcelizer(byte[] bArr, int i, int i2) {
            if ((i | i2 | (bArr.length - i2)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("Array length=%d, index=%d, limit=%d", Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)));
            }
            long j = i;
            return IconCompatParcelizer(bArr, j, (int) (((long) i2) - j));
        }

        @Override // o._emptyAnnotationMaps.IconCompatParcelizer
        final String AudioAttributesCompatParcelizer(byte[] bArr, int i, int i2) throws _add {
            if ((i | i2 | ((bArr.length - i) - i2)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)));
            }
            int i3 = i + i2;
            char[] cArr = new char[i2];
            int i4 = 0;
            while (i < i3) {
                byte bWrite = ClassIntrospectorMixInResolver.write(bArr, i);
                if (!AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(bWrite)) {
                    break;
                }
                i++;
                AudioAttributesCompatParcelizer.read(bWrite, cArr, i4);
                i4++;
            }
            int i5 = i4;
            while (i < i3) {
                int i6 = i + 1;
                byte bWrite2 = ClassIntrospectorMixInResolver.write(bArr, i);
                if (AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(bWrite2)) {
                    AudioAttributesCompatParcelizer.read(bWrite2, cArr, i5);
                    i5++;
                    i = i6;
                    while (i < i3) {
                        byte bWrite3 = ClassIntrospectorMixInResolver.write(bArr, i);
                        if (AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(bWrite3)) {
                            i++;
                            AudioAttributesCompatParcelizer.read(bWrite3, cArr, i5);
                            i5++;
                        }
                    }
                } else if (AudioAttributesCompatParcelizer.AudioAttributesImplBaseParcelizer(bWrite2)) {
                    if (i6 >= i3) {
                        throw _add.RemoteActionCompatParcelizer();
                    }
                    i += 2;
                    AudioAttributesCompatParcelizer.write(bWrite2, ClassIntrospectorMixInResolver.write(bArr, i6), cArr, i5);
                    i5++;
                } else if (AudioAttributesCompatParcelizer.AudioAttributesImplApi21Parcelizer(bWrite2)) {
                    if (i6 >= i3 - 1) {
                        throw _add.RemoteActionCompatParcelizer();
                    }
                    AudioAttributesCompatParcelizer.write(bWrite2, ClassIntrospectorMixInResolver.write(bArr, i6), ClassIntrospectorMixInResolver.write(bArr, i + 2), cArr, i5);
                    i5++;
                    i += 3;
                } else {
                    if (i6 >= i3 - 2) {
                        throw _add.RemoteActionCompatParcelizer();
                    }
                    AudioAttributesCompatParcelizer.write(bWrite2, ClassIntrospectorMixInResolver.write(bArr, i6), ClassIntrospectorMixInResolver.write(bArr, i + 2), ClassIntrospectorMixInResolver.write(bArr, i + 3), cArr, i5);
                    i5 += 2;
                    i += 4;
                }
            }
            return new String(cArr, 0, i5);
        }

        @Override // o._emptyAnnotationMaps.IconCompatParcelizer
        final int write(CharSequence charSequence, byte[] bArr, int i, int i2) {
            long j;
            String str;
            String str2;
            int i3;
            char cCharAt;
            long j2 = i;
            long j3 = ((long) i2) + j2;
            int length = charSequence.length();
            String str3 = " at index ";
            String str4 = "Failed writing ";
            if (length > i2 || bArr.length - i2 < i) {
                StringBuilder sb = new StringBuilder("Failed writing ");
                sb.append(charSequence.charAt(length - 1));
                sb.append(" at index ");
                sb.append(i + i2);
                throw new ArrayIndexOutOfBoundsException(sb.toString());
            }
            int i4 = 0;
            while (true) {
                j = 1;
                if (i4 >= length || (cCharAt = charSequence.charAt(i4)) >= 128) {
                    break;
                }
                ClassIntrospectorMixInResolver.IconCompatParcelizer(bArr, j2, (byte) cCharAt);
                i4++;
                j2++;
            }
            if (i4 == length) {
                return (int) j2;
            }
            while (i4 < length) {
                char cCharAt2 = charSequence.charAt(i4);
                if (cCharAt2 < 128 && j2 < j3) {
                    ClassIntrospectorMixInResolver.IconCompatParcelizer(bArr, j2, (byte) cCharAt2);
                    j2 += j;
                    str = str3;
                    str2 = str4;
                } else if (cCharAt2 < 2048 && j2 <= j3 - 2) {
                    ClassIntrospectorMixInResolver.IconCompatParcelizer(bArr, j2, (byte) ((cCharAt2 >>> 6) | 960));
                    ClassIntrospectorMixInResolver.IconCompatParcelizer(bArr, j2 + j, (byte) ((cCharAt2 & '?') | 128));
                    str = str3;
                    str2 = str4;
                    j2 = 2 + j2;
                } else {
                    if ((cCharAt2 >= 55296 && 57343 >= cCharAt2) || j2 > j3 - 3) {
                        str = str3;
                        str2 = str4;
                        if (j2 <= j3 - 4) {
                            int i5 = i4 + 1;
                            if (i5 != length) {
                                char cCharAt3 = charSequence.charAt(i5);
                                if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                    int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                    ClassIntrospectorMixInResolver.IconCompatParcelizer(bArr, j2, (byte) ((codePoint >>> 18) | PsExtractor.VIDEO_STREAM_MASK));
                                    ClassIntrospectorMixInResolver.IconCompatParcelizer(bArr, j2 + j, (byte) (((codePoint >>> 12) & 63) | 128));
                                    ClassIntrospectorMixInResolver.IconCompatParcelizer(bArr, j2 + 2, (byte) (((codePoint >>> 6) & 63) | 128));
                                    ClassIntrospectorMixInResolver.IconCompatParcelizer(bArr, j2 + 3, (byte) ((codePoint & 63) | 128));
                                    j2 = 4 + j2;
                                    i4 = i5;
                                } else {
                                    i4 = i5;
                                }
                            }
                            throw new write(i4 - 1, length);
                        }
                        if (55296 <= cCharAt2 && cCharAt2 <= 57343 && ((i3 = i4 + 1) == length || !Character.isSurrogatePair(cCharAt2, charSequence.charAt(i3)))) {
                            throw new write(i4, length);
                        }
                        StringBuilder sb2 = new StringBuilder(str2);
                        sb2.append(cCharAt2);
                        sb2.append(str);
                        sb2.append(j2);
                        throw new ArrayIndexOutOfBoundsException(sb2.toString());
                    }
                    ClassIntrospectorMixInResolver.IconCompatParcelizer(bArr, j2, (byte) ((cCharAt2 >>> '\f') | 480));
                    str = str3;
                    str2 = str4;
                    ClassIntrospectorMixInResolver.IconCompatParcelizer(bArr, j2 + j, (byte) (((cCharAt2 >>> 6) & 63) | 128));
                    ClassIntrospectorMixInResolver.IconCompatParcelizer(bArr, j2 + 2, (byte) ((cCharAt2 & '?') | 128));
                    j2 += 3;
                }
                i4++;
                j = 1;
                str3 = str;
                str4 = str2;
            }
            return (int) j2;
        }

        private static int write(byte[] bArr, long j, int i) {
            int i2 = 0;
            if (i < 16) {
                return 0;
            }
            while (i2 < i) {
                if (ClassIntrospectorMixInResolver.write(bArr, j) < 0) {
                    return i2;
                }
                i2++;
                j++;
            }
            return i;
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x0037, code lost:
        
            return -1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x0063, code lost:
        
            return -1;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static int IconCompatParcelizer(byte[] r10, long r11, int r13) {
            /*
                int r0 = write(r10, r11, r13)
                int r13 = r13 - r0
                long r0 = (long) r0
                long r11 = r11 + r0
            L7:
                r0 = 0
                r1 = r0
            L9:
                r2 = 1
                if (r13 <= 0) goto L1a
                long r4 = r11 + r2
                byte r1 = kotlin.ClassIntrospectorMixInResolver.write(r10, r11)
                if (r1 < 0) goto L19
                int r13 = r13 + (-1)
                r11 = r4
                goto L9
            L19:
                r11 = r4
            L1a:
                if (r13 != 0) goto L1d
                return r0
            L1d:
                int r0 = r13 + (-1)
                r4 = -32
                r5 = -1
                r6 = -65
                if (r1 >= r4) goto L38
                if (r0 != 0) goto L29
                return r1
            L29:
                int r13 = r13 + (-2)
                r0 = -62
                if (r1 < r0) goto L37
                byte r0 = kotlin.ClassIntrospectorMixInResolver.write(r10, r11)
                if (r0 > r6) goto L37
                long r11 = r11 + r2
                goto L7
            L37:
                return r5
            L38:
                r7 = -16
                r8 = 2
                if (r1 >= r7) goto L64
                r7 = 2
                if (r0 >= r7) goto L46
                int r10 = RemoteActionCompatParcelizer(r10, r1, r11, r0)
                return r10
            L46:
                int r13 = r13 + (-3)
                byte r0 = kotlin.ClassIntrospectorMixInResolver.write(r10, r11)
                if (r0 > r6) goto L63
                r7 = -96
                if (r1 != r4) goto L54
                if (r0 < r7) goto L63
            L54:
                r4 = -19
                if (r1 != r4) goto L5a
                if (r0 >= r7) goto L63
            L5a:
                long r0 = r11 + r8
                long r11 = r11 + r2
                byte r11 = kotlin.ClassIntrospectorMixInResolver.write(r10, r11)
                if (r11 <= r6) goto L8f
            L63:
                return r5
            L64:
                r4 = 3
                if (r0 >= r4) goto L6c
                int r10 = RemoteActionCompatParcelizer(r10, r1, r11, r0)
                return r10
            L6c:
                int r13 = r13 + (-4)
                byte r0 = kotlin.ClassIntrospectorMixInResolver.write(r10, r11)
                if (r0 > r6) goto L92
                int r1 = r1 << 28
                int r0 = r0 + 112
                int r1 = r1 + r0
                int r0 = r1 >> 30
                if (r0 != 0) goto L92
                long r2 = r2 + r11
                byte r0 = kotlin.ClassIntrospectorMixInResolver.write(r10, r2)
                if (r0 > r6) goto L92
                r0 = 3
                long r0 = r0 + r11
                long r11 = r11 + r8
                byte r11 = kotlin.ClassIntrospectorMixInResolver.write(r10, r11)
                if (r11 <= r6) goto L8f
                goto L92
            L8f:
                r11 = r0
                goto L7
            L92:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: o._emptyAnnotationMaps.read.IconCompatParcelizer(byte[], long, int):int");
        }

        private static int RemoteActionCompatParcelizer(byte[] bArr, int i, long j, int i2) {
            if (i2 == 0) {
                return _emptyAnnotationMaps.AudioAttributesCompatParcelizer(i);
            }
            if (i2 == 1) {
                return _emptyAnnotationMaps.read(i, ClassIntrospectorMixInResolver.write(bArr, j));
            }
            if (i2 == 2) {
                return _emptyAnnotationMaps.write(i, ClassIntrospectorMixInResolver.write(bArr, j), ClassIntrospectorMixInResolver.write(bArr, j + 1));
            }
            throw new AssertionError();
        }
    }

    static class AudioAttributesCompatParcelizer {
        private static boolean AudioAttributesCompatParcelizer(byte b) {
            return b > -65;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean AudioAttributesImplApi21Parcelizer(byte b) {
            return b < -16;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean AudioAttributesImplBaseParcelizer(byte b) {
            return b < -32;
        }

        private static int MediaBrowserCompatCustomActionResultReceiver(byte b) {
            return b & 63;
        }

        private static char RemoteActionCompatParcelizer(int i) {
            return (char) ((i >>> 10) + 55232);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean RemoteActionCompatParcelizer(byte b) {
            return b >= 0;
        }

        private static char read(int i) {
            return (char) ((i & AnalyticsListener.EVENT_DRM_KEYS_LOADED) + 56320);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void read(byte b, char[] cArr, int i) {
            cArr[i] = (char) b;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void write(byte b, byte b2, char[] cArr, int i) throws _add {
            if (b < -62 || AudioAttributesCompatParcelizer(b2)) {
                throw _add.RemoteActionCompatParcelizer();
            }
            cArr[i] = (char) (((b & 31) << 6) | MediaBrowserCompatCustomActionResultReceiver(b2));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void write(byte b, byte b2, byte b3, char[] cArr, int i) throws _add {
            if (AudioAttributesCompatParcelizer(b2) || ((b == -32 && b2 < -96) || ((b == -19 && b2 >= -96) || AudioAttributesCompatParcelizer(b3)))) {
                throw _add.RemoteActionCompatParcelizer();
            }
            cArr[i] = (char) (((b & 15) << 12) | (MediaBrowserCompatCustomActionResultReceiver(b2) << 6) | MediaBrowserCompatCustomActionResultReceiver(b3));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void write(byte b, byte b2, byte b3, byte b4, char[] cArr, int i) throws _add {
            if (AudioAttributesCompatParcelizer(b2) || (((b << 28) + (b2 + 112)) >> 30) != 0 || AudioAttributesCompatParcelizer(b3) || AudioAttributesCompatParcelizer(b4)) {
                throw _add.RemoteActionCompatParcelizer();
            }
            int iMediaBrowserCompatCustomActionResultReceiver = ((b & 7) << 18) | (MediaBrowserCompatCustomActionResultReceiver(b2) << 12) | (MediaBrowserCompatCustomActionResultReceiver(b3) << 6) | MediaBrowserCompatCustomActionResultReceiver(b4);
            cArr[i] = RemoteActionCompatParcelizer(iMediaBrowserCompatCustomActionResultReceiver);
            cArr[i + 1] = read(iMediaBrowserCompatCustomActionResultReceiver);
        }
    }
}
