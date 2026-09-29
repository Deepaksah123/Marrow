package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: loaded from: classes5.dex */
public final class readVorbisCommentMetadataBlock {
    public static boolean RemoteActionCompatParcelizer(float f, float f2) {
        return f + 1.0E-4f >= f2;
    }

    public static float read(float f, float f2, float f3) {
        return ((1.0f - f3) * f) + (f3 * f2);
    }

    private static float write(float f, float f2, float f3, float f4) {
        return (f <= f2 || f <= f3 || f <= f4) ? (f2 <= f3 || f2 <= f4) ? f3 > f4 ? f3 : f4 : f2 : f;
    }

    public static float AudioAttributesCompatParcelizer(float f, float f2, float f3, float f4) {
        return (float) Math.hypot(f3 - f, f4 - f2);
    }

    public static float IconCompatParcelizer(float f, float f2, float f3, float f4) {
        return write(AudioAttributesCompatParcelizer(f, f2, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED), AudioAttributesCompatParcelizer(f, f2, f3, BitmapDescriptorFactory.HUE_RED), AudioAttributesCompatParcelizer(f, f2, f3, f4), AudioAttributesCompatParcelizer(f, f2, BitmapDescriptorFactory.HUE_RED, f4));
    }
}
