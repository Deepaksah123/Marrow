package androidx.transition;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin._parseLongPrimitive;
import kotlin._verifyNullForScalarCoercion;
import kotlin.recordRemarketingPing;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: classes4.dex */
public class PatternPathMotion extends PathMotion {
    private Path AudioAttributesCompatParcelizer;
    private final Matrix read;
    private final Path write;

    public PatternPathMotion() {
        Path path = new Path();
        this.write = path;
        this.read = new Matrix();
        path.lineTo(1.0f, BitmapDescriptorFactory.HUE_RED);
        this.AudioAttributesCompatParcelizer = path;
    }

    public PatternPathMotion(Context context, AttributeSet attributeSet) {
        this.write = new Path();
        this.read = new Matrix();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, recordRemarketingPing.write);
        try {
            String strRemoteActionCompatParcelizer = _parseLongPrimitive.RemoteActionCompatParcelizer(typedArrayObtainStyledAttributes, (XmlPullParser) attributeSet, "patternPathData", 0);
            if (strRemoteActionCompatParcelizer == null) {
                throw new RuntimeException("pathData must be supplied for patternPathMotion");
            }
            read(_verifyNullForScalarCoercion.write(strRemoteActionCompatParcelizer));
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    private void read(Path path) {
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float[] fArr = new float[2];
        pathMeasure.getPosTan(pathMeasure.getLength(), fArr, null);
        float f = fArr[0];
        float f2 = fArr[1];
        pathMeasure.getPosTan(BitmapDescriptorFactory.HUE_RED, fArr, null);
        float f3 = fArr[0];
        float f4 = fArr[1];
        if (f3 == f && f4 == f2) {
            throw new IllegalArgumentException("pattern must not end at the starting point");
        }
        this.read.setTranslate(-f3, -f4);
        float f5 = f - f3;
        float f6 = f2 - f4;
        float f7 = 1.0f / read(f5, f6);
        this.read.postScale(f7, f7);
        this.read.postRotate((float) Math.toDegrees(-Math.atan2(f6, f5)));
        path.transform(this.read, this.write);
        this.AudioAttributesCompatParcelizer = path;
    }

    @Override // androidx.transition.PathMotion
    public final Path write(float f, float f2, float f3, float f4) {
        float f5 = f3 - f;
        float f6 = f4 - f2;
        float f7 = read(f5, f6);
        double dAtan2 = Math.atan2(f6, f5);
        this.read.setScale(f7, f7);
        this.read.postRotate((float) Math.toDegrees(dAtan2));
        this.read.postTranslate(f, f2);
        Path path = new Path();
        this.write.transform(this.read, path);
        return path;
    }

    private static float read(float f, float f2) {
        return (float) Math.sqrt((f * f) + (f2 * f2));
    }
}
