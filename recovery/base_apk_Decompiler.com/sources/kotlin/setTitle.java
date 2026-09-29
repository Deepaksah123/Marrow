package kotlin;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import kotlin._parseDoublePrimitive;

/* JADX INFO: loaded from: classes.dex */
public final class setTitle {
    private final TypedArray IconCompatParcelizer;
    private TypedValue RemoteActionCompatParcelizer;
    private final Context write;

    public static setTitle IconCompatParcelizer(Context context, AttributeSet attributeSet, int[] iArr) {
        return new setTitle(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    public static setTitle read(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2) {
        return new setTitle(context, context.obtainStyledAttributes(attributeSet, iArr, i, i2));
    }

    public static setTitle AudioAttributesCompatParcelizer(Context context, int i, int[] iArr) {
        return new setTitle(context, context.obtainStyledAttributes(i, iArr));
    }

    private setTitle(Context context, TypedArray typedArray) {
        this.write = context;
        this.IconCompatParcelizer = typedArray;
    }

    public final TypedArray AudioAttributesCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public final Drawable IconCompatParcelizer(int i) {
        int resourceId;
        if (this.IconCompatParcelizer.hasValue(i) && (resourceId = this.IconCompatParcelizer.getResourceId(i, 0)) != 0) {
            return getDefaultViewModelCreationExtras.write(this.write, resourceId);
        }
        return this.IconCompatParcelizer.getDrawable(i);
    }

    public final Drawable RemoteActionCompatParcelizer(int i) {
        int resourceId;
        if (!this.IconCompatParcelizer.hasValue(i) || (resourceId = this.IconCompatParcelizer.getResourceId(i, 0)) == 0) {
            return null;
        }
        return startIntentSenderForResult.write().read(this.write, resourceId, true);
    }

    public final Typeface AudioAttributesCompatParcelizer(int i, int i2, _parseDoublePrimitive.IconCompatParcelizer iconCompatParcelizer) {
        int resourceId = this.IconCompatParcelizer.getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.RemoteActionCompatParcelizer == null) {
            this.RemoteActionCompatParcelizer = new TypedValue();
        }
        return _parseDoublePrimitive.read(this.write, resourceId, this.RemoteActionCompatParcelizer, i2, iconCompatParcelizer);
    }

    public final CharSequence AudioAttributesImplBaseParcelizer(int i) {
        return this.IconCompatParcelizer.getText(i);
    }

    public final String AudioAttributesImplApi21Parcelizer(int i) {
        return this.IconCompatParcelizer.getString(i);
    }

    public final boolean AudioAttributesCompatParcelizer(int i, boolean z) {
        return this.IconCompatParcelizer.getBoolean(i, z);
    }

    public final int read(int i, int i2) {
        return this.IconCompatParcelizer.getInt(i, i2);
    }

    public final float MediaBrowserCompatCustomActionResultReceiver(int i) {
        return this.IconCompatParcelizer.getFloat(i, -1.0f);
    }

    public final int AudioAttributesCompatParcelizer(int i) {
        return this.IconCompatParcelizer.getColor(i, 0);
    }

    public final ColorStateList write(int i) {
        int resourceId;
        ColorStateList colorStateListIconCompatParcelizer;
        return (!this.IconCompatParcelizer.hasValue(i) || (resourceId = this.IconCompatParcelizer.getResourceId(i, 0)) == 0 || (colorStateListIconCompatParcelizer = getDefaultViewModelCreationExtras.IconCompatParcelizer(this.write, resourceId)) == null) ? this.IconCompatParcelizer.getColorStateList(i) : colorStateListIconCompatParcelizer;
    }

    public final int RemoteActionCompatParcelizer(int i, int i2) {
        return this.IconCompatParcelizer.getInteger(i, i2);
    }

    public final float read(int i) {
        return this.IconCompatParcelizer.getDimension(i, -1.0f);
    }

    public final int write(int i, int i2) {
        return this.IconCompatParcelizer.getDimensionPixelOffset(i, i2);
    }

    public final int AudioAttributesCompatParcelizer(int i, int i2) {
        return this.IconCompatParcelizer.getDimensionPixelSize(i, i2);
    }

    public final int IconCompatParcelizer(int i, int i2) {
        return this.IconCompatParcelizer.getLayoutDimension(i, i2);
    }

    public final int MediaBrowserCompatItemReceiver(int i, int i2) {
        return this.IconCompatParcelizer.getResourceId(i, i2);
    }

    public final CharSequence[] MediaBrowserCompatItemReceiver(int i) {
        return this.IconCompatParcelizer.getTextArray(i);
    }

    public final boolean AudioAttributesImplApi26Parcelizer(int i) {
        return this.IconCompatParcelizer.hasValue(i);
    }

    public final void write() {
        this.IconCompatParcelizer.recycle();
    }
}
