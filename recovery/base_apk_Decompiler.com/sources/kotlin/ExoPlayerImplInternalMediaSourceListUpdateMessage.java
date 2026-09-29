package kotlin;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.io.IOException;
import java.util.ArrayList;
import kotlin.Format1;

/* JADX INFO: loaded from: classes2.dex */
final class ExoPlayerImplInternalMediaSourceListUpdateMessage {
    private static final Format1.AudioAttributesCompatParcelizer AudioAttributesCompatParcelizer = Format1.AudioAttributesCompatParcelizer.write("ch", "size", "w", TtmlNode.TAG_STYLE, "fFamily", "data");
    private static final Format1.AudioAttributesCompatParcelizer RemoteActionCompatParcelizer = Format1.AudioAttributesCompatParcelizer.write("shapes");

    static maybeNotifyPlaybackInfoChanged write(Format1 format1, ExoPlayerImplExternalSyntheticLambda19 exoPlayerImplExternalSyntheticLambda19) throws IOException {
        ArrayList arrayList = new ArrayList();
        format1.AudioAttributesCompatParcelizer();
        String strMediaBrowserCompatSearchResultReceiver = null;
        String strMediaBrowserCompatSearchResultReceiver2 = null;
        double dAudioAttributesImplApi21Parcelizer = 0.0d;
        double dAudioAttributesImplApi21Parcelizer2 = 0.0d;
        char cCharAt = 0;
        while (format1.MediaBrowserCompatCustomActionResultReceiver()) {
            int iAudioAttributesCompatParcelizer = format1.AudioAttributesCompatParcelizer(AudioAttributesCompatParcelizer);
            if (iAudioAttributesCompatParcelizer == 0) {
                cCharAt = format1.MediaBrowserCompatSearchResultReceiver().charAt(0);
            } else if (iAudioAttributesCompatParcelizer == 1) {
                dAudioAttributesImplApi21Parcelizer = format1.AudioAttributesImplApi21Parcelizer();
            } else if (iAudioAttributesCompatParcelizer == 2) {
                dAudioAttributesImplApi21Parcelizer2 = format1.AudioAttributesImplApi21Parcelizer();
            } else if (iAudioAttributesCompatParcelizer == 3) {
                strMediaBrowserCompatSearchResultReceiver = format1.MediaBrowserCompatSearchResultReceiver();
            } else if (iAudioAttributesCompatParcelizer == 4) {
                strMediaBrowserCompatSearchResultReceiver2 = format1.MediaBrowserCompatSearchResultReceiver();
            } else if (iAudioAttributesCompatParcelizer == 5) {
                format1.AudioAttributesCompatParcelizer();
                while (format1.MediaBrowserCompatCustomActionResultReceiver()) {
                    if (format1.AudioAttributesCompatParcelizer(RemoteActionCompatParcelizer) == 0) {
                        format1.read();
                        while (format1.MediaBrowserCompatCustomActionResultReceiver()) {
                            arrayList.add((setOffloadSchedulingEnabledInternal) ExoPlayerImplInternalExternalSyntheticLambda0.AudioAttributesCompatParcelizer(format1, exoPlayerImplExternalSyntheticLambda19));
                        }
                        format1.write();
                    } else {
                        format1.MediaDescriptionCompat();
                        format1.RatingCompat();
                    }
                }
                format1.IconCompatParcelizer();
            } else {
                format1.MediaDescriptionCompat();
                format1.RatingCompat();
            }
        }
        format1.IconCompatParcelizer();
        return new maybeNotifyPlaybackInfoChanged(arrayList, cCharAt, dAudioAttributesImplApi21Parcelizer, dAudioAttributesImplApi21Parcelizer2, strMediaBrowserCompatSearchResultReceiver, strMediaBrowserCompatSearchResultReceiver2);
    }
}
