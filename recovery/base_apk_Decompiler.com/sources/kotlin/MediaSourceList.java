package kotlin;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes2.dex */
public final class MediaSourceList {
    public static <Z> MediaPeriodQueueExternalSyntheticLambda0<ImageView, Z> AudioAttributesCompatParcelizer(ImageView imageView, Class<Z> cls) {
        if (Bitmap.class.equals(cls)) {
            return new resolveMediaPeriodIdForAdsAfterPeriodPositionChange(imageView);
        }
        if (Drawable.class.isAssignableFrom(cls)) {
            return new shouldLoadNextMediaPeriod(imageView);
        }
        StringBuilder sb = new StringBuilder("Unhandled class: ");
        sb.append(cls);
        sb.append(", try .as*(Class).transcode(ResourceTranscoder)");
        throw new IllegalArgumentException(sb.toString());
    }
}
