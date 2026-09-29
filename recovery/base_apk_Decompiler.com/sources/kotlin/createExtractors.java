package kotlin;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.TypedValue;
import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public final class createExtractors {
    public static int RemoteActionCompatParcelizer(View view, int i) {
        return write(view.getContext(), SeekPoint.write(view, i));
    }

    public static int read(Context context, int i, String str) {
        return write(context, SeekPoint.IconCompatParcelizer(context, i, str));
    }

    public static int AudioAttributesCompatParcelizer(View view, int i) {
        return write(view.getContext(), i, 0);
    }

    public static int write(Context context, int i, int i2) {
        Integer numAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(context, i);
        return numAudioAttributesCompatParcelizer != null ? numAudioAttributesCompatParcelizer.intValue() : i2;
    }

    public static Integer AudioAttributesCompatParcelizer(Context context, int i) {
        TypedValue typedValueAudioAttributesCompatParcelizer = SeekPoint.AudioAttributesCompatParcelizer(context, i);
        if (typedValueAudioAttributesCompatParcelizer != null) {
            return Integer.valueOf(write(context, typedValueAudioAttributesCompatParcelizer));
        }
        return null;
    }

    public static ColorStateList RemoteActionCompatParcelizer(Context context, int i) {
        TypedValue typedValueAudioAttributesCompatParcelizer = SeekPoint.AudioAttributesCompatParcelizer(context, i);
        if (typedValueAudioAttributesCompatParcelizer == null) {
            return null;
        }
        if (typedValueAudioAttributesCompatParcelizer.resourceId != 0) {
            return _isNaN.getColorStateList(context, typedValueAudioAttributesCompatParcelizer.resourceId);
        }
        if (typedValueAudioAttributesCompatParcelizer.data != 0) {
            return ColorStateList.valueOf(typedValueAudioAttributesCompatParcelizer.data);
        }
        return null;
    }

    private static int write(Context context, TypedValue typedValue) {
        if (typedValue.resourceId != 0) {
            return _isNaN.getColor(context, typedValue.resourceId);
        }
        return typedValue.data;
    }

    public static int write(View view, int i, int i2, float f) {
        return write(RemoteActionCompatParcelizer(view, i), RemoteActionCompatParcelizer(view, i2), f);
    }

    public static int write(int i, int i2, float f) {
        return read(i, _verifyNumberForScalarCoercion.AudioAttributesCompatParcelizer(i2, Math.round(Color.alpha(i2) * f)));
    }

    public static int read(int i, int i2) {
        return _verifyNumberForScalarCoercion.read(i2, i);
    }

    public static int IconCompatParcelizer(int i, int i2) {
        return _verifyNumberForScalarCoercion.AudioAttributesCompatParcelizer(i, (Color.alpha(i) * i2) / 255);
    }

    public static boolean IconCompatParcelizer(int i) {
        return i != 0 && _verifyNumberForScalarCoercion.read(i) > 0.5d;
    }
}
