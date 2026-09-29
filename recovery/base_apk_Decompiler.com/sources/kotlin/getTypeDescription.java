package kotlin;

import com.google.android.exoplayer2.RendererCapabilities;
import com.google.android.exoplayer2.audio.AacUtil;
import com.google.android.exoplayer2.audio.Ac3Util;
import com.google.android.exoplayer2.audio.DtsUtil;
import com.google.android.exoplayer2.audio.MpegAudioUtil;
import com.google.android.exoplayer2.audio.OpusUtil;
import com.google.android.exoplayer2.util.MimeTypes;

/* JADX INFO: loaded from: classes2.dex */
public final class getTypeDescription {
    private static final String[] AudioAttributesImplApi21Parcelizer = {MimeTypes.AUDIO_MPEG_L1, MimeTypes.AUDIO_MPEG_L2, MimeTypes.AUDIO_MPEG};
    private static final int[] MediaBrowserCompatCustomActionResultReceiver = {44100, OpusUtil.SAMPLE_RATE, 32000};
    private static final int[] read = {32000, 64000, 96000, 128000, 160000, DtsUtil.DTS_MAX_RATE_BYTES_PER_SECOND, 224000, AacUtil.AAC_XHE_MAX_RATE_BYTES_PER_SECOND, 288000, 320000, 352000, 384000, 416000, 448000};
    private static final int[] IconCompatParcelizer = {32000, OpusUtil.SAMPLE_RATE, 56000, 64000, Ac3Util.AC3_MAX_RATE_BYTES_PER_SECOND, 96000, 112000, 128000, 144000, 160000, 176000, DtsUtil.DTS_MAX_RATE_BYTES_PER_SECOND, 224000, AacUtil.AAC_XHE_MAX_RATE_BYTES_PER_SECOND};
    private static final int[] RemoteActionCompatParcelizer = {32000, OpusUtil.SAMPLE_RATE, 56000, 64000, Ac3Util.AC3_MAX_RATE_BYTES_PER_SECOND, 96000, 112000, 128000, 160000, DtsUtil.DTS_MAX_RATE_BYTES_PER_SECOND, 224000, AacUtil.AAC_XHE_MAX_RATE_BYTES_PER_SECOND, 320000, 384000};
    private static final int[] AudioAttributesCompatParcelizer = {32000, MpegAudioUtil.MAX_RATE_BYTES_PER_SECOND, OpusUtil.SAMPLE_RATE, 56000, 64000, Ac3Util.AC3_MAX_RATE_BYTES_PER_SECOND, 96000, 112000, 128000, 160000, DtsUtil.DTS_MAX_RATE_BYTES_PER_SECOND, 224000, AacUtil.AAC_XHE_MAX_RATE_BYTES_PER_SECOND, 320000};
    private static final int[] write = {8000, AacUtil.AAC_HE_V1_MAX_RATE_BYTES_PER_SECOND, 24000, 32000, MpegAudioUtil.MAX_RATE_BYTES_PER_SECOND, OpusUtil.SAMPLE_RATE, 56000, 64000, Ac3Util.AC3_MAX_RATE_BYTES_PER_SECOND, 96000, 112000, 128000, 144000, 160000};

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean write(int i) {
        return (i & (-2097152)) == -2097152;
    }

    public static final class RemoteActionCompatParcelizer {
        public int AudioAttributesCompatParcelizer;
        public int AudioAttributesImplApi21Parcelizer;
        public int AudioAttributesImplApi26Parcelizer;
        public int IconCompatParcelizer;
        public String RemoteActionCompatParcelizer;
        public int read;
        public int write;

        public RemoteActionCompatParcelizer() {
        }

        public RemoteActionCompatParcelizer(RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
            this.AudioAttributesImplApi21Parcelizer = remoteActionCompatParcelizer.AudioAttributesImplApi21Parcelizer;
            this.RemoteActionCompatParcelizer = remoteActionCompatParcelizer.RemoteActionCompatParcelizer;
            this.read = remoteActionCompatParcelizer.read;
            this.write = remoteActionCompatParcelizer.write;
            this.IconCompatParcelizer = remoteActionCompatParcelizer.IconCompatParcelizer;
            this.AudioAttributesCompatParcelizer = remoteActionCompatParcelizer.AudioAttributesCompatParcelizer;
            this.AudioAttributesImplApi26Parcelizer = remoteActionCompatParcelizer.AudioAttributesImplApi26Parcelizer;
        }

        public final boolean write(int i) {
            int i2;
            int i3;
            int i4;
            int i5;
            if (!getTypeDescription.write(i) || (i2 = (i >>> 19) & 3) == 1 || (i3 = (i >>> 17) & 3) == 0 || (i4 = (i >>> 12) & 15) == 0 || i4 == 15 || (i5 = (i >>> 10) & 3) == 3) {
                return false;
            }
            this.AudioAttributesImplApi21Parcelizer = i2;
            this.RemoteActionCompatParcelizer = getTypeDescription.AudioAttributesImplApi21Parcelizer[3 - i3];
            int i6 = getTypeDescription.MediaBrowserCompatCustomActionResultReceiver[i5];
            this.write = i6;
            if (i2 == 2) {
                this.write = i6 / 2;
            } else if (i2 == 0) {
                this.write = i6 / 4;
            }
            int i7 = (i >>> 9) & 1;
            this.AudioAttributesImplApi26Parcelizer = getTypeDescription.write(i2, i3);
            if (i3 == 3) {
                int i8 = i2 == 3 ? getTypeDescription.read[i4 - 1] : getTypeDescription.IconCompatParcelizer[i4 - 1];
                this.AudioAttributesCompatParcelizer = i8;
                this.read = (((i8 * 12) / this.write) + i7) << 2;
            } else {
                if (i2 == 3) {
                    int i9 = i3 == 2 ? getTypeDescription.RemoteActionCompatParcelizer[i4 - 1] : getTypeDescription.AudioAttributesCompatParcelizer[i4 - 1];
                    this.AudioAttributesCompatParcelizer = i9;
                    this.read = ((i9 * 144) / this.write) + i7;
                } else {
                    int i10 = getTypeDescription.write[i4 - 1];
                    this.AudioAttributesCompatParcelizer = i10;
                    this.read = (((i3 == 1 ? 72 : 144) * i10) / this.write) + i7;
                }
            }
            this.IconCompatParcelizer = ((i >> 6) & 3) == 3 ? 1 : 2;
            return true;
        }
    }

    public static int AudioAttributesCompatParcelizer(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        if (!write(i) || (i2 = (i >>> 19) & 3) == 1 || (i3 = (i >>> 17) & 3) == 0 || (i4 = (i >>> 12) & 15) == 0 || i4 == 15 || (i5 = (i >>> 10) & 3) == 3) {
            return -1;
        }
        int i7 = MediaBrowserCompatCustomActionResultReceiver[i5];
        if (i2 == 2) {
            i7 /= 2;
        } else if (i2 == 0) {
            i7 /= 4;
        }
        int i8 = (i >>> 9) & 1;
        if (i3 == 3) {
            return ((((i2 == 3 ? read[i4 - 1] : IconCompatParcelizer[i4 - 1]) * 12) / i7) + i8) << 2;
        }
        if (i2 == 3) {
            i6 = i3 == 2 ? RemoteActionCompatParcelizer[i4 - 1] : AudioAttributesCompatParcelizer[i4 - 1];
        } else {
            i6 = write[i4 - 1];
        }
        if (i2 == 3) {
            return ((i6 * 144) / i7) + i8;
        }
        return (((i3 == 1 ? 72 : 144) * i6) / i7) + i8;
    }

    public static int read(int i) {
        int i2;
        int i3;
        int i4;
        if (!write(i) || (i2 = (i >>> 19) & 3) == 1 || (i3 = (i >>> 17) & 3) == 0 || (i4 = (i >>> 12) & 15) == 0 || i4 == 15 || ((i >>> 10) & 3) == 3) {
            return -1;
        }
        return write(i2, i3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int write(int i, int i2) {
        if (i2 == 1) {
            return i == 3 ? 1152 : 576;
        }
        if (i2 == 2) {
            return 1152;
        }
        if (i2 == 3) {
            return RendererCapabilities.MODE_SUPPORT_MASK;
        }
        throw new IllegalArgumentException();
    }
}
