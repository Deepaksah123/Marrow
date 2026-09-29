package kotlin;

import androidx.media3.common.DrmInitData;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.RendererCapabilities;
import com.google.android.exoplayer2.audio.AacUtil;
import com.google.android.exoplayer2.audio.DtsUtil;
import com.google.android.exoplayer2.audio.OpusUtil;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.google.android.exoplayer2.util.MimeTypes;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.C0170format;

/* JADX INFO: loaded from: classes2.dex */
public final class findClassAnnotations {
    private static final int[] IconCompatParcelizer = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};
    private static final int[] write = {-1, 8000, AacUtil.AAC_HE_V1_MAX_RATE_BYTES_PER_SECOND, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, OpusUtil.SAMPLE_RATE, -1, -1};
    private static final int[] AudioAttributesCompatParcelizer = {64, 112, 128, PsExtractor.AUDIO_STREAM, 224, 256, RendererCapabilities.MODE_SUPPORT_MASK, 448, 512, 640, 768, 896, 1024, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};
    private static final int[] read = {8000, AacUtil.AAC_HE_V1_MAX_RATE_BYTES_PER_SECOND, 32000, 64000, 128000, 22050, 44100, 88200, 176400, 352800, 12000, 24000, OpusUtil.SAMPLE_RATE, 96000, DtsUtil.DTS_MAX_RATE_BYTES_PER_SECOND, 384000};
    private static final int[] MediaBrowserCompatItemReceiver = {5, 8, 10, 12};
    private static final int[] AudioAttributesImplBaseParcelizer = {6, 9, 12, 15};
    private static final int[] RemoteActionCompatParcelizer = {2, 4, 6, 8};
    private static final int[] AudioAttributesImplApi21Parcelizer = {9, 11, 13, 16};
    private static final int[] AudioAttributesImplApi26Parcelizer = {5, 8, 10, 12};

    public static int AudioAttributesCompatParcelizer(int i) {
        if (i == 2147385345 || i == -25230976 || i == 536864768 || i == -14745368) {
            return 1;
        }
        if (i == 1683496997 || i == 622876772) {
            return 2;
        }
        if (i == 1078008818 || i == -233094848) {
            return 3;
        }
        return (i == 1908687592 || i == -398277519) ? 4 : 0;
    }

    public static final class IconCompatParcelizer {
        public final int AudioAttributesCompatParcelizer;
        public final String IconCompatParcelizer;
        public final int MediaBrowserCompatItemReceiver;
        public final int RemoteActionCompatParcelizer;
        public final long read;
        public final int write;

        /* synthetic */ IconCompatParcelizer(String str, int i, int i2, int i3, long j) {
            this(str, i, i2, i3, j, 0);
        }

        private IconCompatParcelizer(String str, int i, int i2, int i3, long j, int i4) {
            this.IconCompatParcelizer = str;
            this.AudioAttributesCompatParcelizer = i;
            this.MediaBrowserCompatItemReceiver = i2;
            this.write = i3;
            this.read = j;
            this.RemoteActionCompatParcelizer = 0;
        }
    }

    public static C0170format IconCompatParcelizer(byte[] bArr, String str, String str2, int i) {
        AsExternalTypeSerializer asExternalTypeSerializerAudioAttributesImplBaseParcelizer = AudioAttributesImplBaseParcelizer(bArr);
        asExternalTypeSerializerAudioAttributesImplBaseParcelizer.write(60);
        int i2 = IconCompatParcelizer[asExternalTypeSerializerAudioAttributesImplBaseParcelizer.IconCompatParcelizer(6)];
        int i3 = write[asExternalTypeSerializerAudioAttributesImplBaseParcelizer.IconCompatParcelizer(4)];
        int iIconCompatParcelizer = asExternalTypeSerializerAudioAttributesImplBaseParcelizer.IconCompatParcelizer(5);
        int[] iArr = AudioAttributesCompatParcelizer;
        int i4 = iIconCompatParcelizer >= iArr.length ? -1 : (iArr[iIconCompatParcelizer] * 1000) / 2;
        asExternalTypeSerializerAudioAttributesImplBaseParcelizer.write(10);
        return new C0170format.RemoteActionCompatParcelizer().AudioAttributesCompatParcelizer(str).AudioAttributesImplApi26Parcelizer(MimeTypes.AUDIO_DTS).write(i4).read(i2 + (asExternalTypeSerializerAudioAttributesImplBaseParcelizer.IconCompatParcelizer(2) > 0 ? 1 : 0)).MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(i3).AudioAttributesCompatParcelizer((DrmInitData) null).read(str2).MediaBrowserCompatSearchResultReceiver(i).IconCompatParcelizer();
    }

    public static int RemoteActionCompatParcelizer(byte[] bArr) {
        int i;
        byte b;
        int i2;
        byte b2;
        byte b3 = bArr[0];
        if (b3 != -2) {
            if (b3 == -1) {
                i = (bArr[4] & 7) << 4;
                b2 = bArr[7];
            } else if (b3 == 31) {
                i = (bArr[5] & 7) << 4;
                b2 = bArr[6];
            } else {
                i = (bArr[4] & 1) << 6;
                b = bArr[5];
            }
            i2 = b2 & 60;
            return (((i2 >> 2) | i) + 1) << 5;
        }
        i = (bArr[5] & 1) << 6;
        b = bArr[4];
        i2 = b & 252;
        return (((i2 >> 2) | i) + 1) << 5;
    }

    public static int RemoteActionCompatParcelizer(ByteBuffer byteBuffer) {
        int i;
        byte b;
        int i2;
        byte b2;
        if (byteBuffer.getInt(0) == -233094848 || byteBuffer.getInt(0) == -398277519) {
            return 1024;
        }
        if (byteBuffer.getInt(0) == 622876772) {
            return 4096;
        }
        int iPosition = byteBuffer.position();
        byte b3 = byteBuffer.get(iPosition);
        if (b3 != -2) {
            if (b3 == -1) {
                i = (byteBuffer.get(iPosition + 4) & 7) << 4;
                b2 = byteBuffer.get(iPosition + 7);
            } else if (b3 == 31) {
                i = (byteBuffer.get(iPosition + 5) & 7) << 4;
                b2 = byteBuffer.get(iPosition + 6);
            } else {
                i = (byteBuffer.get(iPosition + 4) & 1) << 6;
                b = byteBuffer.get(iPosition + 5);
            }
            i2 = b2 & 60;
            return (((i2 >> 2) | i) + 1) << 5;
        }
        i = (byteBuffer.get(iPosition + 5) & 1) << 6;
        b = byteBuffer.get(iPosition + 4);
        i2 = b & 252;
        return (((i2 >> 2) | i) + 1) << 5;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int AudioAttributesCompatParcelizer(byte[] r7) {
        /*
            r0 = 0
            r1 = r7[r0]
            r2 = -2
            r3 = 1
            r4 = 6
            r5 = 7
            r6 = 4
            if (r1 == r2) goto L4a
            r2 = -1
            if (r1 == r2) goto L32
            r2 = 31
            if (r1 == r2) goto L21
            r1 = 5
            r1 = r7[r1]
            r1 = r1 & 3
            int r1 = r1 << 12
            r2 = r7[r4]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << r6
            r1 = r1 | r2
            r7 = r7[r5]
            goto L58
        L21:
            r0 = r7[r4]
            r0 = r0 & 3
            int r0 = r0 << 12
            r1 = r7[r5]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << r6
            r0 = r0 | r1
            r1 = 8
            r7 = r7[r1]
            goto L42
        L32:
            r0 = r7[r5]
            r0 = r0 & 3
            int r0 = r0 << 12
            r1 = r7[r4]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << r6
            r0 = r0 | r1
            r1 = 9
            r7 = r7[r1]
        L42:
            r7 = r7 & 60
            int r7 = r7 >> 2
            r7 = r7 | r0
            int r7 = r7 + r3
            r0 = r3
            goto L5d
        L4a:
            r1 = r7[r6]
            r1 = r1 & 3
            int r1 = r1 << 12
            r2 = r7[r5]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << r6
            r1 = r1 | r2
            r7 = r7[r4]
        L58:
            r7 = r7 & 240(0xf0, float:3.36E-43)
            int r7 = r7 >> r6
            r7 = r7 | r1
            int r7 = r7 + r3
        L5d:
            if (r0 == 0) goto L63
            int r7 = r7 << 4
            int r7 = r7 / 14
        L63:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.findClassAnnotations.AudioAttributesCompatParcelizer(byte[]):int");
    }

    public static IconCompatParcelizer IconCompatParcelizer(byte[] bArr) throws SchemaAware {
        int i;
        int i2;
        int iIconCompatParcelizer;
        int i3;
        long jAudioAttributesCompatParcelizer;
        int i4;
        AsExternalTypeSerializer asExternalTypeSerializerAudioAttributesImplBaseParcelizer = AudioAttributesImplBaseParcelizer(bArr);
        asExternalTypeSerializerAudioAttributesImplBaseParcelizer.write(40);
        int iIconCompatParcelizer2 = asExternalTypeSerializerAudioAttributesImplBaseParcelizer.IconCompatParcelizer(2);
        if (asExternalTypeSerializerAudioAttributesImplBaseParcelizer.read()) {
            i = 20;
            i2 = 12;
        } else {
            i = 16;
            i2 = 8;
        }
        asExternalTypeSerializerAudioAttributesImplBaseParcelizer.write(i2);
        int iIconCompatParcelizer3 = asExternalTypeSerializerAudioAttributesImplBaseParcelizer.IconCompatParcelizer(i);
        boolean z = asExternalTypeSerializerAudioAttributesImplBaseParcelizer.read();
        int iIconCompatParcelizer4 = -1;
        int i5 = 0;
        if (z) {
            iIconCompatParcelizer = asExternalTypeSerializerAudioAttributesImplBaseParcelizer.IconCompatParcelizer(2);
            int iIconCompatParcelizer5 = asExternalTypeSerializerAudioAttributesImplBaseParcelizer.IconCompatParcelizer(3);
            if (asExternalTypeSerializerAudioAttributesImplBaseParcelizer.read()) {
                asExternalTypeSerializerAudioAttributesImplBaseParcelizer.write(36);
            }
            int iIconCompatParcelizer6 = asExternalTypeSerializerAudioAttributesImplBaseParcelizer.IconCompatParcelizer(3);
            int iIconCompatParcelizer7 = asExternalTypeSerializerAudioAttributesImplBaseParcelizer.IconCompatParcelizer(3);
            if (iIconCompatParcelizer6 + 1 != 1 || iIconCompatParcelizer7 + 1 != 1) {
                throw SchemaAware.RemoteActionCompatParcelizer("Multiple audio presentations or assets not supported");
            }
            int i6 = iIconCompatParcelizer2 + 1;
            int iIconCompatParcelizer8 = asExternalTypeSerializerAudioAttributesImplBaseParcelizer.IconCompatParcelizer(i6);
            for (int i7 = 0; i7 < i6; i7++) {
                if (((iIconCompatParcelizer8 >> i7) & 1) == 1) {
                    asExternalTypeSerializerAudioAttributesImplBaseParcelizer.write(8);
                }
            }
            if (asExternalTypeSerializerAudioAttributesImplBaseParcelizer.read()) {
                asExternalTypeSerializerAudioAttributesImplBaseParcelizer.write(2);
                int iIconCompatParcelizer9 = asExternalTypeSerializerAudioAttributesImplBaseParcelizer.IconCompatParcelizer(2);
                int iIconCompatParcelizer10 = asExternalTypeSerializerAudioAttributesImplBaseParcelizer.IconCompatParcelizer(2);
                while (i5 < iIconCompatParcelizer10 + 1) {
                    asExternalTypeSerializerAudioAttributesImplBaseParcelizer.write((iIconCompatParcelizer9 + 1) << 2);
                    i5++;
                }
            }
            i5 = (iIconCompatParcelizer5 + 1) << 9;
        } else {
            iIconCompatParcelizer = -1;
        }
        asExternalTypeSerializerAudioAttributesImplBaseParcelizer.write(i);
        asExternalTypeSerializerAudioAttributesImplBaseParcelizer.write(12);
        if (z) {
            if (asExternalTypeSerializerAudioAttributesImplBaseParcelizer.read()) {
                asExternalTypeSerializerAudioAttributesImplBaseParcelizer.write(4);
            }
            if (asExternalTypeSerializerAudioAttributesImplBaseParcelizer.read()) {
                asExternalTypeSerializerAudioAttributesImplBaseParcelizer.write(24);
            }
            if (asExternalTypeSerializerAudioAttributesImplBaseParcelizer.read()) {
                asExternalTypeSerializerAudioAttributesImplBaseParcelizer.MediaBrowserCompatCustomActionResultReceiver(asExternalTypeSerializerAudioAttributesImplBaseParcelizer.IconCompatParcelizer(10) + 1);
            }
            asExternalTypeSerializerAudioAttributesImplBaseParcelizer.write(5);
            i3 = read[asExternalTypeSerializerAudioAttributesImplBaseParcelizer.IconCompatParcelizer(4)];
            iIconCompatParcelizer4 = asExternalTypeSerializerAudioAttributesImplBaseParcelizer.IconCompatParcelizer(8) + 1;
        } else {
            i3 = C.RATE_UNSET_INT;
        }
        int i8 = i3;
        int i9 = iIconCompatParcelizer4;
        if (z) {
            if (iIconCompatParcelizer == 0) {
                i4 = 32000;
            } else if (iIconCompatParcelizer == 1) {
                i4 = 44100;
            } else {
                if (iIconCompatParcelizer != 2) {
                    throw SchemaAware.RemoteActionCompatParcelizer("Unsupported reference clock code in DTS HD header: ".concat(String.valueOf(iIconCompatParcelizer)), null);
                }
                i4 = OpusUtil.SAMPLE_RATE;
            }
            jAudioAttributesCompatParcelizer = LaissezFaireSubTypeValidator.AudioAttributesCompatParcelizer(i5, 1000000L, i4);
        } else {
            jAudioAttributesCompatParcelizer = C.TIME_UNSET;
        }
        return new IconCompatParcelizer(MimeTypes.AUDIO_DTS_EXPRESS, i9, i8, iIconCompatParcelizer3 + 1, jAudioAttributesCompatParcelizer);
    }

    public static int write(byte[] bArr) {
        AsExternalTypeSerializer asExternalTypeSerializerAudioAttributesImplBaseParcelizer = AudioAttributesImplBaseParcelizer(bArr);
        asExternalTypeSerializerAudioAttributesImplBaseParcelizer.write(42);
        return asExternalTypeSerializerAudioAttributesImplBaseParcelizer.IconCompatParcelizer(asExternalTypeSerializerAudioAttributesImplBaseParcelizer.read() ? 12 : 8) + 1;
    }

    public static IconCompatParcelizer write(byte[] bArr, AtomicInteger atomicInteger) throws SchemaAware {
        int iIconCompatParcelizer;
        long jAudioAttributesCompatParcelizer;
        int i;
        int i2;
        AsExternalTypeSerializer asExternalTypeSerializerAudioAttributesImplBaseParcelizer = AudioAttributesImplBaseParcelizer(bArr);
        int i3 = asExternalTypeSerializerAudioAttributesImplBaseParcelizer.IconCompatParcelizer(32) == 1078008818 ? 1 : 0;
        int i4 = read(asExternalTypeSerializerAudioAttributesImplBaseParcelizer, MediaBrowserCompatItemReceiver) + 1;
        if (i3 == 0) {
            iIconCompatParcelizer = C.RATE_UNSET_INT;
            jAudioAttributesCompatParcelizer = C.TIME_UNSET;
        } else {
            if (!asExternalTypeSerializerAudioAttributesImplBaseParcelizer.read()) {
                throw SchemaAware.RemoteActionCompatParcelizer("Only supports full channel mask-based audio presentation");
            }
            read(bArr, i4);
            int iIconCompatParcelizer2 = asExternalTypeSerializerAudioAttributesImplBaseParcelizer.IconCompatParcelizer(2);
            if (iIconCompatParcelizer2 == 0) {
                i = 512;
            } else if (iIconCompatParcelizer2 == 1) {
                i = 480;
            } else {
                if (iIconCompatParcelizer2 != 2) {
                    throw SchemaAware.RemoteActionCompatParcelizer("Unsupported base duration index in DTS UHD header: ".concat(String.valueOf(iIconCompatParcelizer2)), null);
                }
                i = RendererCapabilities.MODE_SUPPORT_MASK;
            }
            int iIconCompatParcelizer3 = asExternalTypeSerializerAudioAttributesImplBaseParcelizer.IconCompatParcelizer(3);
            int iIconCompatParcelizer4 = asExternalTypeSerializerAudioAttributesImplBaseParcelizer.IconCompatParcelizer(2);
            if (iIconCompatParcelizer4 == 0) {
                i2 = 32000;
            } else if (iIconCompatParcelizer4 == 1) {
                i2 = 44100;
            } else {
                if (iIconCompatParcelizer4 != 2) {
                    throw SchemaAware.RemoteActionCompatParcelizer("Unsupported clock rate index in DTS UHD header: ".concat(String.valueOf(iIconCompatParcelizer4)), null);
                }
                i2 = OpusUtil.SAMPLE_RATE;
            }
            if (asExternalTypeSerializerAudioAttributesImplBaseParcelizer.read()) {
                asExternalTypeSerializerAudioAttributesImplBaseParcelizer.write(36);
            }
            iIconCompatParcelizer = (1 << asExternalTypeSerializerAudioAttributesImplBaseParcelizer.IconCompatParcelizer(2)) * i2;
            jAudioAttributesCompatParcelizer = LaissezFaireSubTypeValidator.AudioAttributesCompatParcelizer(i * (iIconCompatParcelizer3 + 1), 1000000L, i2);
        }
        int i5 = iIconCompatParcelizer;
        long j = jAudioAttributesCompatParcelizer;
        int i6 = 0;
        for (int i7 = 0; i7 < i3; i7++) {
            i6 += read(asExternalTypeSerializerAudioAttributesImplBaseParcelizer, AudioAttributesImplBaseParcelizer);
        }
        if (i3 != 0) {
            atomicInteger.set(read(asExternalTypeSerializerAudioAttributesImplBaseParcelizer, RemoteActionCompatParcelizer));
        }
        return new IconCompatParcelizer(MimeTypes.AUDIO_DTS_X, 2, i5, i4 + i6 + (atomicInteger.get() != 0 ? read(asExternalTypeSerializerAudioAttributesImplBaseParcelizer, AudioAttributesImplApi21Parcelizer) : 0), j);
    }

    public static int read(byte[] bArr) {
        AsExternalTypeSerializer asExternalTypeSerializerAudioAttributesImplBaseParcelizer = AudioAttributesImplBaseParcelizer(bArr);
        asExternalTypeSerializerAudioAttributesImplBaseParcelizer.write(32);
        return read(asExternalTypeSerializerAudioAttributesImplBaseParcelizer, AudioAttributesImplApi26Parcelizer) + 1;
    }

    private static void read(byte[] bArr, int i) throws SchemaAware {
        int i2 = i - 2;
        if (((bArr[i - 1] & 255) | ((bArr[i2] << 8) & 65535)) != LaissezFaireSubTypeValidator.IconCompatParcelizer(bArr, 0, i2, 65535)) {
            throw SchemaAware.RemoteActionCompatParcelizer("CRC check failed", null);
        }
    }

    private static int read(AsExternalTypeSerializer asExternalTypeSerializer, int[] iArr) {
        int i = 0;
        for (int i2 = 0; i2 < 3 && asExternalTypeSerializer.read(); i2++) {
            i++;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < i; i4++) {
            i3 += 1 << iArr[i4];
        }
        return i3 + asExternalTypeSerializer.IconCompatParcelizer(iArr[i]);
    }

    private static AsExternalTypeSerializer AudioAttributesImplBaseParcelizer(byte[] bArr) {
        byte b = bArr[0];
        if (b == 127 || b == 100 || b == 64 || b == 113) {
            return new AsExternalTypeSerializer(bArr);
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        if (MediaBrowserCompatItemReceiver(bArrCopyOf)) {
            for (int i = 0; i < bArrCopyOf.length - 1; i += 2) {
                byte b2 = bArrCopyOf[i];
                int i2 = i + 1;
                bArrCopyOf[i] = bArrCopyOf[i2];
                bArrCopyOf[i2] = b2;
            }
        }
        AsExternalTypeSerializer asExternalTypeSerializer = new AsExternalTypeSerializer(bArrCopyOf);
        if (bArrCopyOf[0] == 31) {
            AsExternalTypeSerializer asExternalTypeSerializer2 = new AsExternalTypeSerializer(bArrCopyOf);
            while (asExternalTypeSerializer2.IconCompatParcelizer() >= 16) {
                asExternalTypeSerializer2.write(2);
                asExternalTypeSerializer.RemoteActionCompatParcelizer(asExternalTypeSerializer2.IconCompatParcelizer(14));
            }
        }
        asExternalTypeSerializer.read(bArrCopyOf);
        return asExternalTypeSerializer;
    }

    private static boolean MediaBrowserCompatItemReceiver(byte[] bArr) {
        byte b = bArr[0];
        return b == -2 || b == -1 || b == 37 || b == -14 || b == -24;
    }
}
