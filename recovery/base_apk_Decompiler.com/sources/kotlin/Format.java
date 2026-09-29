package kotlin;

import android.graphics.PointF;
import java.io.IOException;
import kotlin.Format1;

/* JADX INFO: loaded from: classes2.dex */
public final class Format implements copyWithCryptoType<PointF> {
    public static final Format write = new Format();

    @Override // kotlin.copyWithCryptoType
    public final /* synthetic */ PointF AudioAttributesCompatParcelizer(Format1 format1, float f) throws IOException {
        return RemoteActionCompatParcelizer(format1, f);
    }

    private Format() {
    }

    private static PointF RemoteActionCompatParcelizer(Format1 format1, float f) throws IOException {
        Format1.IconCompatParcelizer iconCompatParcelizerMediaBrowserCompatMediaItem = format1.MediaBrowserCompatMediaItem();
        if (iconCompatParcelizerMediaBrowserCompatMediaItem == Format1.IconCompatParcelizer.BEGIN_ARRAY) {
            return setPlayWhenReadyChangeReason.read(format1, f);
        }
        if (iconCompatParcelizerMediaBrowserCompatMediaItem == Format1.IconCompatParcelizer.BEGIN_OBJECT) {
            return setPlayWhenReadyChangeReason.read(format1, f);
        }
        if (iconCompatParcelizerMediaBrowserCompatMediaItem == Format1.IconCompatParcelizer.NUMBER) {
            PointF pointF = new PointF(((float) format1.AudioAttributesImplApi21Parcelizer()) * f, ((float) format1.AudioAttributesImplApi21Parcelizer()) * f);
            while (format1.MediaBrowserCompatCustomActionResultReceiver()) {
                format1.RatingCompat();
            }
            return pointF;
        }
        throw new IllegalArgumentException("Cannot convert json to point. Next token is ".concat(String.valueOf(iconCompatParcelizerMediaBrowserCompatMediaItem)));
    }
}
