package kotlin;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.EdgeEffect;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: loaded from: classes2.dex */
public final class memberMethods {
    public static EdgeEffect AudioAttributesCompatParcelizer(Context context, AttributeSet attributeSet) {
        if (Build.VERSION.SDK_INT >= 31) {
            return AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(context, attributeSet);
        }
        return new EdgeEffect(context);
    }

    public static float write(EdgeEffect edgeEffect) {
        return Build.VERSION.SDK_INT >= 31 ? AudioAttributesCompatParcelizer.write(edgeEffect) : BitmapDescriptorFactory.HUE_RED;
    }

    public static void AudioAttributesCompatParcelizer(EdgeEffect edgeEffect, float f, float f2) {
        read.read(edgeEffect, f, f2);
    }

    public static float read(EdgeEffect edgeEffect, float f, float f2) {
        if (Build.VERSION.SDK_INT >= 31) {
            return AudioAttributesCompatParcelizer.IconCompatParcelizer(edgeEffect, f, f2);
        }
        AudioAttributesCompatParcelizer(edgeEffect, f, f2);
        return f;
    }

    static class AudioAttributesCompatParcelizer {
        public static EdgeEffect AudioAttributesCompatParcelizer(Context context, AttributeSet attributeSet) {
            try {
                return new EdgeEffect(context, attributeSet);
            } catch (Throwable unused) {
                return new EdgeEffect(context);
            }
        }

        public static float IconCompatParcelizer(EdgeEffect edgeEffect, float f, float f2) {
            try {
                return edgeEffect.onPullDistance(f, f2);
            } catch (Throwable unused) {
                edgeEffect.onPull(f, f2);
                return BitmapDescriptorFactory.HUE_RED;
            }
        }

        public static float write(EdgeEffect edgeEffect) {
            try {
                return edgeEffect.getDistance();
            } catch (Throwable unused) {
                return BitmapDescriptorFactory.HUE_RED;
            }
        }
    }

    static class read {
        static void read(EdgeEffect edgeEffect, float f, float f2) {
            edgeEffect.onPull(f, f2);
        }
    }
}
