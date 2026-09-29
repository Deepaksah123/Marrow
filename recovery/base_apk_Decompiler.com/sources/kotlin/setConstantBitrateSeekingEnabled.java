package kotlin;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import kotlin.calculateNextSearchBytePosition;

/* JADX INFO: loaded from: classes5.dex */
public final class setConstantBitrateSeekingEnabled {
    final setAdtsExtractorFlags AudioAttributesCompatParcelizer;
    final setAdtsExtractorFlags AudioAttributesImplApi21Parcelizer;
    final setAdtsExtractorFlags AudioAttributesImplApi26Parcelizer;
    final setAdtsExtractorFlags AudioAttributesImplBaseParcelizer;
    public final setAdtsExtractorFlags IconCompatParcelizer;
    final setAdtsExtractorFlags RemoteActionCompatParcelizer;
    final setAdtsExtractorFlags read;
    public final Paint write;

    setConstantBitrateSeekingEnabled(Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(SeekPoint.read(context, calculateNextSearchBytePosition.IconCompatParcelizer.materialCalendarStyle, setMatroskaExtractorFlags.class.getCanonicalName()), calculateNextSearchBytePosition.MediaMetadataCompat.MaterialCalendar);
        this.IconCompatParcelizer = setAdtsExtractorFlags.read(context, typedArrayObtainStyledAttributes.getResourceId(calculateNextSearchBytePosition.MediaMetadataCompat.MaterialCalendar_dayStyle, 0));
        this.AudioAttributesCompatParcelizer = setAdtsExtractorFlags.read(context, typedArrayObtainStyledAttributes.getResourceId(calculateNextSearchBytePosition.MediaMetadataCompat.MaterialCalendar_dayInvalidStyle, 0));
        this.RemoteActionCompatParcelizer = setAdtsExtractorFlags.read(context, typedArrayObtainStyledAttributes.getResourceId(calculateNextSearchBytePosition.MediaMetadataCompat.MaterialCalendar_daySelectedStyle, 0));
        this.AudioAttributesImplApi21Parcelizer = setAdtsExtractorFlags.read(context, typedArrayObtainStyledAttributes.getResourceId(calculateNextSearchBytePosition.MediaMetadataCompat.MaterialCalendar_dayTodayStyle, 0));
        ColorStateList colorStateListIconCompatParcelizer = SeekMap.IconCompatParcelizer(context, typedArrayObtainStyledAttributes, calculateNextSearchBytePosition.MediaMetadataCompat.MaterialCalendar_rangeFillColor);
        this.AudioAttributesImplBaseParcelizer = setAdtsExtractorFlags.read(context, typedArrayObtainStyledAttributes.getResourceId(calculateNextSearchBytePosition.MediaMetadataCompat.MaterialCalendar_yearStyle, 0));
        this.read = setAdtsExtractorFlags.read(context, typedArrayObtainStyledAttributes.getResourceId(calculateNextSearchBytePosition.MediaMetadataCompat.MaterialCalendar_yearSelectedStyle, 0));
        this.AudioAttributesImplApi26Parcelizer = setAdtsExtractorFlags.read(context, typedArrayObtainStyledAttributes.getResourceId(calculateNextSearchBytePosition.MediaMetadataCompat.MaterialCalendar_yearTodayStyle, 0));
        Paint paint = new Paint();
        this.write = paint;
        paint.setColor(colorStateListIconCompatParcelizer.getDefaultColor());
        typedArrayObtainStyledAttributes.recycle();
    }
}
