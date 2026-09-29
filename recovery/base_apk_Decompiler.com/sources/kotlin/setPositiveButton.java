package kotlin;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.TypedValue;
import android.view.View;
import java.util.Objects;
import kotlin._init_lambda5;

/* JADX INFO: loaded from: classes.dex */
public final class setPositiveButton {
    private static final ThreadLocal<TypedValue> AudioAttributesImplBaseParcelizer = new ThreadLocal<>();
    static final int[] RemoteActionCompatParcelizer = {-16842910};
    static final int[] AudioAttributesCompatParcelizer = {R.attr.state_focused};
    static final int[] write = {R.attr.state_pressed};
    static final int[] IconCompatParcelizer = {R.attr.state_checked};
    static final int[] read = new int[0];
    private static final int[] AudioAttributesImplApi26Parcelizer = new int[1];

    public static int IconCompatParcelizer(Context context, int i) {
        int[] iArr = AudioAttributesImplApi26Parcelizer;
        iArr[0] = i;
        setTitle settitleIconCompatParcelizer = setTitle.IconCompatParcelizer(context, null, iArr);
        try {
            return settitleIconCompatParcelizer.AudioAttributesCompatParcelizer(0);
        } finally {
            settitleIconCompatParcelizer.write();
        }
    }

    public static ColorStateList RemoteActionCompatParcelizer(Context context, int i) {
        int[] iArr = AudioAttributesImplApi26Parcelizer;
        iArr[0] = i;
        setTitle settitleIconCompatParcelizer = setTitle.IconCompatParcelizer(context, null, iArr);
        try {
            return settitleIconCompatParcelizer.write(0);
        } finally {
            settitleIconCompatParcelizer.write();
        }
    }

    public static int AudioAttributesCompatParcelizer(Context context, int i) {
        ColorStateList colorStateListRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(context, i);
        if (colorStateListRemoteActionCompatParcelizer != null && colorStateListRemoteActionCompatParcelizer.isStateful()) {
            return colorStateListRemoteActionCompatParcelizer.getColorForState(RemoteActionCompatParcelizer, colorStateListRemoteActionCompatParcelizer.getDefaultColor());
        }
        TypedValue typedValueRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
        context.getTheme().resolveAttribute(R.attr.disabledAlpha, typedValueRemoteActionCompatParcelizer, true);
        return RemoteActionCompatParcelizer(context, i, typedValueRemoteActionCompatParcelizer.getFloat());
    }

    private static TypedValue RemoteActionCompatParcelizer() {
        ThreadLocal<TypedValue> threadLocal = AudioAttributesImplBaseParcelizer;
        TypedValue typedValue = threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }

    private static int RemoteActionCompatParcelizer(Context context, int i, float f) {
        return _verifyNumberForScalarCoercion.AudioAttributesCompatParcelizer(IconCompatParcelizer(context, i), Math.round(Color.alpha(r0) * f));
    }

    public static void IconCompatParcelizer(View view, Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(_init_lambda5.AudioAttributesImplApi26Parcelizer.AppCompatTheme);
        try {
            if (!typedArrayObtainStyledAttributes.hasValue(_init_lambda5.AudioAttributesImplApi26Parcelizer.AppCompatTheme_windowActionBar)) {
                Objects.toString(view.getClass());
            }
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }
}
