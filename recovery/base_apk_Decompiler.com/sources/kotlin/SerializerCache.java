package kotlin;

import com.google.android.exoplayer2.audio.AacUtil;
import com.google.android.exoplayer2.audio.Ac3Util;
import com.google.android.exoplayer2.audio.Ac4Util;
import com.google.android.exoplayer2.audio.DtsUtil;
import com.google.android.exoplayer2.audio.MpegAudioUtil;
import com.google.android.exoplayer2.audio.OpusUtil;
import kotlin.PropertyBuilder;

/* JADX INFO: loaded from: classes2.dex */
public final class SerializerCache implements PropertyBuilder.write {
    public final int AudioAttributesCompatParcelizer;
    protected final int AudioAttributesImplApi21Parcelizer;
    protected final int AudioAttributesImplBaseParcelizer;
    protected final int IconCompatParcelizer;
    protected final int MediaBrowserCompatItemReceiver;
    protected final int RemoteActionCompatParcelizer;
    public final int write;

    public static class RemoteActionCompatParcelizer {
        private int read = 250000;
        private int AudioAttributesCompatParcelizer = 750000;
        private int AudioAttributesImplApi21Parcelizer = 4;
        private int AudioAttributesImplBaseParcelizer = 250000;
        private int RemoteActionCompatParcelizer = 50000000;
        private int write = 2;
        private int IconCompatParcelizer = 4;

        public final SerializerCache AudioAttributesCompatParcelizer() {
            return new SerializerCache(this);
        }
    }

    protected SerializerCache(RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        this.IconCompatParcelizer = remoteActionCompatParcelizer.read;
        this.RemoteActionCompatParcelizer = remoteActionCompatParcelizer.AudioAttributesCompatParcelizer;
        this.AudioAttributesImplApi21Parcelizer = remoteActionCompatParcelizer.AudioAttributesImplApi21Parcelizer;
        this.MediaBrowserCompatItemReceiver = remoteActionCompatParcelizer.AudioAttributesImplBaseParcelizer;
        this.AudioAttributesImplBaseParcelizer = remoteActionCompatParcelizer.RemoteActionCompatParcelizer;
        this.write = remoteActionCompatParcelizer.write;
        this.AudioAttributesCompatParcelizer = remoteActionCompatParcelizer.IconCompatParcelizer;
    }

    @Override // o.PropertyBuilder.write
    public final int AudioAttributesCompatParcelizer(int i, int i2, int i3, int i4, int i5, int i6, double d) {
        return (((Math.max(i, (int) (((double) RemoteActionCompatParcelizer(i, i2, i3, i4, i5, i6)) * d)) + i4) - 1) / i4) * i4;
    }

    private int RemoteActionCompatParcelizer(int i, int i2, int i3, int i4, int i5, int i6) {
        if (i3 == 0) {
            return read(i, i5, i4);
        }
        if (i3 == 1) {
            return write(i2);
        }
        if (i3 == 2) {
            return AudioAttributesCompatParcelizer(i2, i6);
        }
        throw new IllegalArgumentException();
    }

    private int read(int i, int i2, int i3) {
        return LaissezFaireSubTypeValidator.write(i * this.AudioAttributesImplApi21Parcelizer, write(this.IconCompatParcelizer, i2, i3), write(this.RemoteActionCompatParcelizer, i2, i3));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0012  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int AudioAttributesCompatParcelizer(int r4, int r5) {
        /*
            r3 = this;
            int r0 = r3.MediaBrowserCompatItemReceiver
            r1 = 5
            r2 = 8
            if (r4 != r1) goto La
            int r3 = r3.write
            goto Le
        La:
            if (r4 != r2) goto Lf
            int r3 = r3.AudioAttributesCompatParcelizer
        Le:
            int r0 = r0 * r3
        Lf:
            r3 = -1
            if (r5 == r3) goto L19
            java.math.RoundingMode r3 = java.math.RoundingMode.CEILING
            int r3 = kotlin.parseCoverArt.read(r5, r2, r3)
            goto L1d
        L19:
            int r3 = read(r4)
        L1d:
            long r4 = (long) r0
            long r0 = (long) r3
            long r4 = r4 * r0
            r0 = 1000000(0xf4240, double:4.940656E-318)
            long r4 = r4 / r0
            int r3 = kotlin.parseTextAttribute.RemoteActionCompatParcelizer(r4)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.SerializerCache.AudioAttributesCompatParcelizer(int, int):int");
    }

    private int write(int i) {
        return parseTextAttribute.RemoteActionCompatParcelizer((((long) this.AudioAttributesImplBaseParcelizer) * ((long) read(i))) / 1000000);
    }

    private static int write(int i, int i2, int i3) {
        return parseTextAttribute.RemoteActionCompatParcelizer(((((long) i) * ((long) i2)) * ((long) i3)) / 1000000);
    }

    private static int read(int i) {
        if (i == 20) {
            return OpusUtil.MAX_BYTES_PER_SECOND;
        }
        if (i == 30) {
            return DtsUtil.DTS_HD_MAX_RATE_BYTES_PER_SECOND;
        }
        switch (i) {
            case 5:
                return Ac3Util.AC3_MAX_RATE_BYTES_PER_SECOND;
            case 6:
                return Ac3Util.E_AC3_MAX_RATE_BYTES_PER_SECOND;
            case 7:
                return DtsUtil.DTS_MAX_RATE_BYTES_PER_SECOND;
            case 8:
                return DtsUtil.DTS_HD_MAX_RATE_BYTES_PER_SECOND;
            case 9:
                return MpegAudioUtil.MAX_RATE_BYTES_PER_SECOND;
            case 10:
                return 100000;
            case 11:
                return AacUtil.AAC_HE_V1_MAX_RATE_BYTES_PER_SECOND;
            case 12:
                return 7000;
            default:
                switch (i) {
                    case 14:
                        return Ac3Util.TRUEHD_MAX_RATE_BYTES_PER_SECOND;
                    case 15:
                        return 8000;
                    case 16:
                        return AacUtil.AAC_XHE_MAX_RATE_BYTES_PER_SECOND;
                    case 17:
                        return Ac4Util.MAX_RATE_BYTES_PER_SECOND;
                    case 18:
                        return Ac3Util.E_AC3_MAX_RATE_BYTES_PER_SECOND;
                    default:
                        throw new IllegalArgumentException();
                }
        }
    }
}
