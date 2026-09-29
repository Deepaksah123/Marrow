package kotlin;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.TypedValue;
import android.view.animation.AnimationUtils;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: loaded from: classes3.dex */
public final class getSampleRateLookupKey {
    public static int write(Context context, int i, int i2) {
        return SeekPoint.RemoteActionCompatParcelizer(context, i, i2);
    }

    public static TimeInterpolator read(Context context, int i, TimeInterpolator timeInterpolator) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i, typedValue, true)) {
            return timeInterpolator;
        }
        if (typedValue.type != 3) {
            throw new IllegalArgumentException("Motion easing theme attribute must be an @interpolator resource for ?attr/motionEasing*Interpolator attributes or a string for ?attr/motionEasing* attributes.");
        }
        String strValueOf = String.valueOf(typedValue.string);
        if (read(strValueOf)) {
            return IconCompatParcelizer(strValueOf);
        }
        return AnimationUtils.loadInterpolator(context, typedValue.resourceId);
    }

    private static TimeInterpolator IconCompatParcelizer(String str) {
        if (read(str, "cubic-bezier")) {
            String[] strArrSplit = IconCompatParcelizer(str, "cubic-bezier").split(",");
            if (strArrSplit.length != 4) {
                StringBuilder sb = new StringBuilder("Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: ");
                sb.append(strArrSplit.length);
                throw new IllegalArgumentException(sb.toString());
            }
            return forBuilder.IconCompatParcelizer(read(strArrSplit, 0), read(strArrSplit, 1), read(strArrSplit, 2), read(strArrSplit, 3));
        }
        if (read(str, "path")) {
            return forBuilder.read(_verifyNullForScalarCoercion.write(IconCompatParcelizer(str, "path")));
        }
        throw new IllegalArgumentException("Invalid motion easing type: ".concat(String.valueOf(str)));
    }

    private static boolean read(String str) {
        return read(str, "cubic-bezier") || read(str, "path");
    }

    private static boolean read(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        sb.append("(");
        return str.startsWith(sb.toString()) && str.endsWith(")");
    }

    private static String IconCompatParcelizer(String str, String str2) {
        return str.substring(str2.length() + 1, str.length() - 1);
    }

    private static float read(String[] strArr, int i) {
        float f = Float.parseFloat(strArr[i]);
        if (f < BitmapDescriptorFactory.HUE_RED || f > 1.0f) {
            throw new IllegalArgumentException("Motion easing control point value must be between 0 and 1; instead got: ".concat(String.valueOf(f)));
        }
        return f;
    }
}
