package kotlin;

import android.content.Context;
import android.util.TypedValue;
import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public final class SeekPoint {
    public static TypedValue AudioAttributesCompatParcelizer(Context context, int i) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    public static TypedValue write(View view, int i) {
        return IconCompatParcelizer(view.getContext(), i, view.getClass().getCanonicalName());
    }

    public static TypedValue IconCompatParcelizer(Context context, int i, String str) {
        TypedValue typedValueAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(context, i);
        if (typedValueAudioAttributesCompatParcelizer != null) {
            return typedValueAudioAttributesCompatParcelizer;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", str, context.getResources().getResourceName(i)));
    }

    public static int read(Context context, int i, String str) {
        return IconCompatParcelizer(context, i, str).data;
    }

    public static boolean AudioAttributesCompatParcelizer(Context context, int i, boolean z) {
        TypedValue typedValueAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(context, i);
        return (typedValueAudioAttributesCompatParcelizer == null || typedValueAudioAttributesCompatParcelizer.type != 18) ? z : typedValueAudioAttributesCompatParcelizer.data != 0;
    }

    public static int RemoteActionCompatParcelizer(Context context, int i, int i2) {
        TypedValue typedValueAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(context, i);
        return (typedValueAudioAttributesCompatParcelizer == null || typedValueAudioAttributesCompatParcelizer.type != 16) ? i2 : typedValueAudioAttributesCompatParcelizer.data;
    }
}
