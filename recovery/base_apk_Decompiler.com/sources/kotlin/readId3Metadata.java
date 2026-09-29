package kotlin;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import kotlin.calculateNextSearchBytePosition;

/* JADX INFO: loaded from: classes3.dex */
public final class readId3Metadata {
    private static final int[] IconCompatParcelizer = {calculateNextSearchBytePosition.IconCompatParcelizer.colorPrimary};
    private static final int[] AudioAttributesCompatParcelizer = {calculateNextSearchBytePosition.IconCompatParcelizer.colorPrimaryVariant};

    public static TypedArray write(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        write(context, attributeSet, i, i2);
        AudioAttributesCompatParcelizer(context, attributeSet, iArr, i, i2, iArr2);
        return context.obtainStyledAttributes(attributeSet, iArr, i, i2);
    }

    public static setTitle read(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        write(context, attributeSet, i, i2);
        AudioAttributesCompatParcelizer(context, attributeSet, iArr, i, i2, iArr2);
        return setTitle.read(context, attributeSet, iArr, i, i2);
    }

    private static void write(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, calculateNextSearchBytePosition.MediaMetadataCompat.ThemeEnforcement, i, i2);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(calculateNextSearchBytePosition.MediaMetadataCompat.ThemeEnforcement_enforceMaterialTheme, false);
        typedArrayObtainStyledAttributes.recycle();
        if (z) {
            TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(calculateNextSearchBytePosition.IconCompatParcelizer.isMaterialTheme, typedValue, true) || (typedValue.type == 18 && typedValue.data == 0)) {
                read(context);
            }
        }
        RemoteActionCompatParcelizer(context);
    }

    private static void AudioAttributesCompatParcelizer(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, calculateNextSearchBytePosition.MediaMetadataCompat.ThemeEnforcement, i, i2);
        boolean zIconCompatParcelizer = false;
        if (!typedArrayObtainStyledAttributes.getBoolean(calculateNextSearchBytePosition.MediaMetadataCompat.ThemeEnforcement_enforceTextAppearance, false)) {
            typedArrayObtainStyledAttributes.recycle();
            return;
        }
        if (iArr2 == null || iArr2.length == 0) {
            if (typedArrayObtainStyledAttributes.getResourceId(calculateNextSearchBytePosition.MediaMetadataCompat.ThemeEnforcement_android_textAppearance, -1) != -1) {
                zIconCompatParcelizer = true;
            }
        } else {
            zIconCompatParcelizer = IconCompatParcelizer(context, attributeSet, iArr, i, i2, iArr2);
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!zIconCompatParcelizer) {
            throw new IllegalArgumentException("This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant).");
        }
    }

    private static boolean IconCompatParcelizer(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, i2);
        for (int i3 : iArr2) {
            if (typedArrayObtainStyledAttributes.getResourceId(i3, -1) == -1) {
                typedArrayObtainStyledAttributes.recycle();
                return false;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        return true;
    }

    public static void RemoteActionCompatParcelizer(Context context) {
        RemoteActionCompatParcelizer(context, IconCompatParcelizer, "Theme.AppCompat");
    }

    public static void read(Context context) {
        RemoteActionCompatParcelizer(context, AudioAttributesCompatParcelizer, "Theme.MaterialComponents");
    }

    public static boolean write(Context context) {
        return SeekPoint.AudioAttributesCompatParcelizer(context, calculateNextSearchBytePosition.IconCompatParcelizer.isMaterial3Theme, false);
    }

    private static boolean RemoteActionCompatParcelizer(Context context, int[] iArr) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iArr);
        for (int i = 0; i < iArr.length; i++) {
            if (!typedArrayObtainStyledAttributes.hasValue(i)) {
                typedArrayObtainStyledAttributes.recycle();
                return false;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        return true;
    }

    private static void RemoteActionCompatParcelizer(Context context, int[] iArr, String str) {
        if (RemoteActionCompatParcelizer(context, iArr)) {
            return;
        }
        StringBuilder sb = new StringBuilder("The style on this component requires your app theme to be ");
        sb.append(str);
        sb.append(" (or a descendant).");
        throw new IllegalArgumentException(sb.toString());
    }
}
