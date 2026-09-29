package kotlin;

import com.google.android.exoplayer2.analytics.AnalyticsListener;
import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
public final class getAudioAttributes extends experimentalSetOffloadSchedulingEnabled<lambdanew2> {
    public getAudioAttributes(copyWithMediaPeriodId copywithmediaperiodid, InputStream inputStream) {
        super(copywithmediaperiodid, inputStream);
    }

    public final lambdanew2 read() throws ExoPlaybackExceptionType {
        byte[] bArrAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(2);
        return new lambdanew2(IconCompatParcelizer((bArrAudioAttributesCompatParcelizer[1] & 255) | ((bArrAudioAttributesCompatParcelizer[0] & 255) << 8)));
    }

    private static float IconCompatParcelizer(int i) {
        int i2 = (32768 & i) >> 15;
        int i3 = (i & 31744) >> 10;
        int i4 = i & AnalyticsListener.EVENT_DRM_KEYS_LOADED;
        if (i3 == 0) {
            return (float) (((double) (i2 != 0 ? -1 : 1)) * Math.pow(2.0d, -14.0d) * (((double) i4) / Math.pow(2.0d, 10.0d)));
        }
        if (i3 != 31) {
            return (float) (((double) (i2 != 0 ? -1 : 1)) * Math.pow(2.0d, i3 - 15) * ((((double) i4) / Math.pow(2.0d, 10.0d)) + 1.0d));
        }
        if (i4 != 0) {
            return Float.NaN;
        }
        return (i2 != 0 ? -1 : 1) * Float.POSITIVE_INFINITY;
    }
}
