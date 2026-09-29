package kotlin;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.widget.TextView;
import kotlin.calculateNextSearchBytePosition;

/* JADX INFO: loaded from: classes5.dex */
public final class setAdtsExtractorFlags {
    private final isValidFrameType AudioAttributesCompatParcelizer;
    private final ColorStateList IconCompatParcelizer;
    private final ColorStateList MediaBrowserCompatCustomActionResultReceiver;
    private final int RemoteActionCompatParcelizer;
    private final Rect read;
    private final ColorStateList write;

    private setAdtsExtractorFlags(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i, isValidFrameType isvalidframetype, Rect rect) {
        StringCollectionDeserializer.IconCompatParcelizer(rect.left);
        StringCollectionDeserializer.IconCompatParcelizer(rect.top);
        StringCollectionDeserializer.IconCompatParcelizer(rect.right);
        StringCollectionDeserializer.IconCompatParcelizer(rect.bottom);
        this.read = rect;
        this.MediaBrowserCompatCustomActionResultReceiver = colorStateList2;
        this.write = colorStateList;
        this.IconCompatParcelizer = colorStateList3;
        this.RemoteActionCompatParcelizer = i;
        this.AudioAttributesCompatParcelizer = isvalidframetype;
    }

    static setAdtsExtractorFlags read(Context context, int i) {
        StringCollectionDeserializer.read(i != 0, "Cannot create a CalendarItemStyle with a styleResId of 0");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, calculateNextSearchBytePosition.MediaMetadataCompat.MaterialCalendarItem);
        Rect rect = new Rect(typedArrayObtainStyledAttributes.getDimensionPixelOffset(calculateNextSearchBytePosition.MediaMetadataCompat.MaterialCalendarItem_android_insetLeft, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(calculateNextSearchBytePosition.MediaMetadataCompat.MaterialCalendarItem_android_insetTop, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(calculateNextSearchBytePosition.MediaMetadataCompat.MaterialCalendarItem_android_insetRight, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(calculateNextSearchBytePosition.MediaMetadataCompat.MaterialCalendarItem_android_insetBottom, 0));
        ColorStateList colorStateListIconCompatParcelizer = SeekMap.IconCompatParcelizer(context, typedArrayObtainStyledAttributes, calculateNextSearchBytePosition.MediaMetadataCompat.MaterialCalendarItem_itemFillColor);
        ColorStateList colorStateListIconCompatParcelizer2 = SeekMap.IconCompatParcelizer(context, typedArrayObtainStyledAttributes, calculateNextSearchBytePosition.MediaMetadataCompat.MaterialCalendarItem_itemTextColor);
        ColorStateList colorStateListIconCompatParcelizer3 = SeekMap.IconCompatParcelizer(context, typedArrayObtainStyledAttributes, calculateNextSearchBytePosition.MediaMetadataCompat.MaterialCalendarItem_itemStrokeColor);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(calculateNextSearchBytePosition.MediaMetadataCompat.MaterialCalendarItem_itemStrokeWidth, 0);
        isValidFrameType isvalidframetypeRemoteActionCompatParcelizer = isValidFrameType.read(context, typedArrayObtainStyledAttributes.getResourceId(calculateNextSearchBytePosition.MediaMetadataCompat.MaterialCalendarItem_itemShapeAppearance, 0), typedArrayObtainStyledAttributes.getResourceId(calculateNextSearchBytePosition.MediaMetadataCompat.MaterialCalendarItem_itemShapeAppearanceOverlay, 0)).RemoteActionCompatParcelizer();
        typedArrayObtainStyledAttributes.recycle();
        return new setAdtsExtractorFlags(colorStateListIconCompatParcelizer, colorStateListIconCompatParcelizer2, colorStateListIconCompatParcelizer3, dimensionPixelSize, isvalidframetypeRemoteActionCompatParcelizer, rect);
    }

    final void RemoteActionCompatParcelizer(TextView textView) {
        write(textView, null, null);
    }

    final void write(TextView textView, ColorStateList colorStateList, ColorStateList colorStateList2) {
        frameSizeBytesByTypeNb framesizebytesbytypenb = new frameSizeBytesByTypeNb();
        frameSizeBytesByTypeNb framesizebytesbytypenb2 = new frameSizeBytesByTypeNb();
        framesizebytesbytypenb.setShapeAppearanceModel(this.AudioAttributesCompatParcelizer);
        framesizebytesbytypenb2.setShapeAppearanceModel(this.AudioAttributesCompatParcelizer);
        framesizebytesbytypenb.AudioAttributesImplApi21Parcelizer(this.write);
        framesizebytesbytypenb.IconCompatParcelizer(this.RemoteActionCompatParcelizer, this.IconCompatParcelizer);
        textView.setTextColor(this.MediaBrowserCompatCustomActionResultReceiver);
        InvalidTypeIdException.read(textView, new InsetDrawable((Drawable) new RippleDrawable(this.MediaBrowserCompatCustomActionResultReceiver.withAlpha(30), framesizebytesbytypenb, framesizebytesbytypenb2), this.read.left, this.read.top, this.read.right, this.read.bottom));
    }

    public final int IconCompatParcelizer() {
        return this.read.top;
    }

    public final int RemoteActionCompatParcelizer() {
        return this.read.bottom;
    }
}
