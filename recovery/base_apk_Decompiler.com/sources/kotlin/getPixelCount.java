package kotlin;

import java.io.IOException;
import java.util.ArrayList;
import kotlin.Format1;

/* JADX INFO: loaded from: classes2.dex */
final class getPixelCount {
    private static final Format1.AudioAttributesCompatParcelizer read = Format1.AudioAttributesCompatParcelizer.write("nm", "hd", "it");

    static setOffloadSchedulingEnabledInternal AudioAttributesCompatParcelizer(Format1 format1, ExoPlayerImplExternalSyntheticLambda19 exoPlayerImplExternalSyntheticLambda19) throws IOException {
        ArrayList arrayList = new ArrayList();
        String strMediaBrowserCompatSearchResultReceiver = null;
        boolean zMediaBrowserCompatItemReceiver = false;
        while (format1.MediaBrowserCompatCustomActionResultReceiver()) {
            int iAudioAttributesCompatParcelizer = format1.AudioAttributesCompatParcelizer(read);
            if (iAudioAttributesCompatParcelizer == 0) {
                strMediaBrowserCompatSearchResultReceiver = format1.MediaBrowserCompatSearchResultReceiver();
            } else if (iAudioAttributesCompatParcelizer == 1) {
                zMediaBrowserCompatItemReceiver = format1.MediaBrowserCompatItemReceiver();
            } else if (iAudioAttributesCompatParcelizer == 2) {
                format1.read();
                while (format1.MediaBrowserCompatCustomActionResultReceiver()) {
                    resolvePositionForPlaylistChange resolvepositionforplaylistchangeAudioAttributesCompatParcelizer = ExoPlayerImplInternalExternalSyntheticLambda0.AudioAttributesCompatParcelizer(format1, exoPlayerImplExternalSyntheticLambda19);
                    if (resolvepositionforplaylistchangeAudioAttributesCompatParcelizer != null) {
                        arrayList.add(resolvepositionforplaylistchangeAudioAttributesCompatParcelizer);
                    }
                }
                format1.write();
            } else {
                format1.RatingCompat();
            }
        }
        return new setOffloadSchedulingEnabledInternal(strMediaBrowserCompatSearchResultReceiver, arrayList, zMediaBrowserCompatItemReceiver);
    }
}
