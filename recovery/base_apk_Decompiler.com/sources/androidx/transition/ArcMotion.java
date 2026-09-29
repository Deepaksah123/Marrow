package androidx.transition;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.util.AttributeSet;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin._parseLongPrimitive;
import kotlin.recordRemarketingPing;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: classes4.dex */
public class ArcMotion extends PathMotion {
    private static final float read = (float) Math.tan(Math.toRadians(35.0d));
    private float AudioAttributesCompatParcelizer;
    private float AudioAttributesImplBaseParcelizer;
    private float IconCompatParcelizer;
    private float MediaBrowserCompatCustomActionResultReceiver;
    private float RemoteActionCompatParcelizer;
    private float write;

    public ArcMotion() {
        this.AudioAttributesCompatParcelizer = BitmapDescriptorFactory.HUE_RED;
        this.AudioAttributesImplBaseParcelizer = BitmapDescriptorFactory.HUE_RED;
        this.write = 70.0f;
        this.RemoteActionCompatParcelizer = BitmapDescriptorFactory.HUE_RED;
        this.MediaBrowserCompatCustomActionResultReceiver = BitmapDescriptorFactory.HUE_RED;
        this.IconCompatParcelizer = read;
    }

    public ArcMotion(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.AudioAttributesCompatParcelizer = BitmapDescriptorFactory.HUE_RED;
        this.AudioAttributesImplBaseParcelizer = BitmapDescriptorFactory.HUE_RED;
        this.write = 70.0f;
        this.RemoteActionCompatParcelizer = BitmapDescriptorFactory.HUE_RED;
        this.MediaBrowserCompatCustomActionResultReceiver = BitmapDescriptorFactory.HUE_RED;
        this.IconCompatParcelizer = read;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, recordRemarketingPing.read);
        XmlPullParser xmlPullParser = (XmlPullParser) attributeSet;
        RemoteActionCompatParcelizer(_parseLongPrimitive.read(typedArrayObtainStyledAttributes, xmlPullParser, "minimumVerticalAngle", 1, BitmapDescriptorFactory.HUE_RED));
        AudioAttributesCompatParcelizer(_parseLongPrimitive.read(typedArrayObtainStyledAttributes, xmlPullParser, "minimumHorizontalAngle", 0, BitmapDescriptorFactory.HUE_RED));
        IconCompatParcelizer(_parseLongPrimitive.read(typedArrayObtainStyledAttributes, xmlPullParser, "maximumAngle", 2, 70.0f));
        typedArrayObtainStyledAttributes.recycle();
    }

    private void AudioAttributesCompatParcelizer(float f) {
        this.AudioAttributesCompatParcelizer = f;
        this.RemoteActionCompatParcelizer = write(f);
    }

    private void RemoteActionCompatParcelizer(float f) {
        this.AudioAttributesImplBaseParcelizer = f;
        this.MediaBrowserCompatCustomActionResultReceiver = write(f);
    }

    private void IconCompatParcelizer(float f) {
        this.write = f;
        this.IconCompatParcelizer = write(f);
    }

    private static float write(float f) {
        if (f < BitmapDescriptorFactory.HUE_RED || f > 90.0f) {
            throw new IllegalArgumentException("Arc must be between 0 and 90 degrees");
        }
        return (float) Math.tan(Math.toRadians(f / 2.0f));
    }

    @Override // androidx.transition.PathMotion
    public final Path write(float f, float f2, float f3, float f4) {
        float f5;
        float f6;
        float f7;
        Path path = new Path();
        path.moveTo(f, f2);
        float f8 = f3 - f;
        float f9 = f4 - f2;
        float f10 = (f8 * f8) + (f9 * f9);
        float f11 = (f + f3) / 2.0f;
        float f12 = (f2 + f4) / 2.0f;
        float f13 = 0.25f * f10;
        boolean z = f2 > f4;
        if (Math.abs(f8) < Math.abs(f9)) {
            float fAbs = Math.abs(f10 / (f9 * 2.0f));
            if (z) {
                f6 = fAbs + f4;
                f5 = f3;
            } else {
                f6 = fAbs + f2;
                f5 = f;
            }
            f7 = this.MediaBrowserCompatCustomActionResultReceiver;
        } else {
            float f14 = f10 / (f8 * 2.0f);
            if (z) {
                f6 = f2;
                f5 = f14 + f;
            } else {
                f5 = f3 - f14;
                f6 = f4;
            }
            f7 = this.RemoteActionCompatParcelizer;
        }
        float f15 = f13 * f7 * f7;
        float f16 = f11 - f5;
        float f17 = f12 - f6;
        float f18 = (f16 * f16) + (f17 * f17);
        float f19 = this.IconCompatParcelizer;
        float f20 = f13 * f19 * f19;
        if (f18 >= f15) {
            f15 = f18 > f20 ? f20 : 0.0f;
        }
        if (f15 != BitmapDescriptorFactory.HUE_RED) {
            float fSqrt = (float) Math.sqrt(f15 / f18);
            f5 = ((f5 - f11) * fSqrt) + f11;
            f6 = f12 + (fSqrt * (f6 - f12));
        }
        path.cubicTo((f + f5) / 2.0f, (f2 + f6) / 2.0f, (f5 + f3) / 2.0f, (f6 + f4) / 2.0f, f3, f4);
        return path;
    }
}
