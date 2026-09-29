package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: loaded from: classes2.dex */
public final class setAccessibilityChannel {
    private static float write(float f) {
        return f <= 0.0031308f ? f * 12.92f : (float) ((Math.pow(f, 0.4166666567325592d) * 1.0549999475479126d) - 0.054999999701976776d);
    }

    private static float RemoteActionCompatParcelizer(float f) {
        return f <= 0.04045f ? f / 12.92f : (float) Math.pow((f + 0.055f) / 1.055f, 2.4000000953674316d);
    }

    public static int write(float f, int i, int i2) {
        if (i == i2 || f <= BitmapDescriptorFactory.HUE_RED) {
            return i;
        }
        if (f >= 1.0f) {
            return i2;
        }
        float f2 = (i >>> 24) / 255.0f;
        float f3 = (i2 >>> 24) / 255.0f;
        float fRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(((i >> 16) & 255) / 255.0f);
        float fRemoteActionCompatParcelizer2 = RemoteActionCompatParcelizer(((i >> 8) & 255) / 255.0f);
        float fRemoteActionCompatParcelizer3 = RemoteActionCompatParcelizer((i & 255) / 255.0f);
        float fRemoteActionCompatParcelizer4 = RemoteActionCompatParcelizer(((i2 >> 16) & 255) / 255.0f);
        float fRemoteActionCompatParcelizer5 = RemoteActionCompatParcelizer(((i2 >> 8) & 255) / 255.0f);
        float fRemoteActionCompatParcelizer6 = RemoteActionCompatParcelizer((i2 & 255) / 255.0f);
        return (Math.round((f2 + ((f3 - f2) * f)) * 255.0f) << 24) | (Math.round(write(fRemoteActionCompatParcelizer + ((fRemoteActionCompatParcelizer4 - fRemoteActionCompatParcelizer) * f)) * 255.0f) << 16) | (Math.round(write(fRemoteActionCompatParcelizer2 + ((fRemoteActionCompatParcelizer5 - fRemoteActionCompatParcelizer2) * f)) * 255.0f) << 8) | Math.round(write(fRemoteActionCompatParcelizer3 + ((fRemoteActionCompatParcelizer6 - fRemoteActionCompatParcelizer3) * f)) * 255.0f);
    }
}
