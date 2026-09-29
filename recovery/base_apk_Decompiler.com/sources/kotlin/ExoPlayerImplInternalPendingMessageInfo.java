package kotlin;

import java.io.IOException;
import kotlin.Format1;

/* JADX INFO: loaded from: classes2.dex */
final class ExoPlayerImplInternalPendingMessageInfo {
    private static final Format1.AudioAttributesCompatParcelizer IconCompatParcelizer = Format1.AudioAttributesCompatParcelizer.write("fFamily", "fName", "fStyle", "ascent");

    static isUsingPlaceholderPeriod IconCompatParcelizer(Format1 format1) throws IOException {
        format1.AudioAttributesCompatParcelizer();
        String strMediaBrowserCompatSearchResultReceiver = null;
        String strMediaBrowserCompatSearchResultReceiver2 = null;
        float fAudioAttributesImplApi21Parcelizer = 0.0f;
        String strMediaBrowserCompatSearchResultReceiver3 = null;
        while (format1.MediaBrowserCompatCustomActionResultReceiver()) {
            int iAudioAttributesCompatParcelizer = format1.AudioAttributesCompatParcelizer(IconCompatParcelizer);
            if (iAudioAttributesCompatParcelizer == 0) {
                strMediaBrowserCompatSearchResultReceiver = format1.MediaBrowserCompatSearchResultReceiver();
            } else if (iAudioAttributesCompatParcelizer == 1) {
                strMediaBrowserCompatSearchResultReceiver3 = format1.MediaBrowserCompatSearchResultReceiver();
            } else if (iAudioAttributesCompatParcelizer == 2) {
                strMediaBrowserCompatSearchResultReceiver2 = format1.MediaBrowserCompatSearchResultReceiver();
            } else if (iAudioAttributesCompatParcelizer == 3) {
                fAudioAttributesImplApi21Parcelizer = (float) format1.AudioAttributesImplApi21Parcelizer();
            } else {
                format1.MediaDescriptionCompat();
                format1.RatingCompat();
            }
        }
        format1.IconCompatParcelizer();
        return new isUsingPlaceholderPeriod(strMediaBrowserCompatSearchResultReceiver, strMediaBrowserCompatSearchResultReceiver3, strMediaBrowserCompatSearchResultReceiver2, fAudioAttributesImplApi21Parcelizer);
    }
}
