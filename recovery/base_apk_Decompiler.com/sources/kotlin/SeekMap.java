package kotlin;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import kotlin.calculateNextSearchBytePosition;

/* JADX INFO: loaded from: classes3.dex */
public final class SeekMap {
    public static ColorStateList IconCompatParcelizer(Context context, TypedArray typedArray, int i) {
        int resourceId;
        ColorStateList colorStateListIconCompatParcelizer;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (colorStateListIconCompatParcelizer = getDefaultViewModelCreationExtras.IconCompatParcelizer(context, resourceId)) == null) ? typedArray.getColorStateList(i) : colorStateListIconCompatParcelizer;
    }

    public static ColorStateList IconCompatParcelizer(Context context, setTitle settitle, int i) {
        int iMediaBrowserCompatItemReceiver;
        ColorStateList colorStateListIconCompatParcelizer;
        return (!settitle.AudioAttributesImplApi26Parcelizer(i) || (iMediaBrowserCompatItemReceiver = settitle.MediaBrowserCompatItemReceiver(i, 0)) == 0 || (colorStateListIconCompatParcelizer = getDefaultViewModelCreationExtras.IconCompatParcelizer(context, iMediaBrowserCompatItemReceiver)) == null) ? settitle.write(i) : colorStateListIconCompatParcelizer;
    }

    public static Drawable RemoteActionCompatParcelizer(Context context, TypedArray typedArray, int i) {
        int resourceId;
        Drawable drawableWrite;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (drawableWrite = getDefaultViewModelCreationExtras.write(context, resourceId)) == null) ? typedArray.getDrawable(i) : drawableWrite;
    }

    public static TrackOutput write(Context context, TypedArray typedArray, int i) {
        int resourceId;
        if (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) {
            return null;
        }
        return new TrackOutput(context, resourceId);
    }

    public static int write(Context context, TypedArray typedArray, int i, int i2) {
        TypedValue typedValue = new TypedValue();
        if (!typedArray.getValue(i, typedValue) || typedValue.type != 2) {
            return typedArray.getDimensionPixelSize(i, i2);
        }
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, i2);
        typedArrayObtainStyledAttributes.recycle();
        return dimensionPixelSize;
    }

    public static boolean IconCompatParcelizer(Context context) {
        return context.getResources().getConfiguration().fontScale >= 1.3f;
    }

    public static boolean RemoteActionCompatParcelizer(Context context) {
        return context.getResources().getConfiguration().fontScale >= 2.0f;
    }

    public static float read(Context context) {
        return context.getResources().getConfiguration().fontScale;
    }

    public static int IconCompatParcelizer(Context context, int i) {
        if (i == 0) {
            return 0;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, calculateNextSearchBytePosition.MediaMetadataCompat.TextAppearance);
        TypedValue typedValue = new TypedValue();
        boolean value = typedArrayObtainStyledAttributes.getValue(calculateNextSearchBytePosition.MediaMetadataCompat.TextAppearance_android_textSize, typedValue);
        typedArrayObtainStyledAttributes.recycle();
        if (!value) {
            return 0;
        }
        if (RemoteActionCompatParcelizer(typedValue) == 2) {
            return Math.round(TypedValue.complexToFloat(typedValue.data) * context.getResources().getDisplayMetrics().density);
        }
        return TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics());
    }

    private static int RemoteActionCompatParcelizer(TypedValue typedValue) {
        return typedValue.getComplexUnit();
    }

    static int IconCompatParcelizer(TypedArray typedArray, int i, int i2) {
        return typedArray.hasValue(i) ? i : i2;
    }
}
