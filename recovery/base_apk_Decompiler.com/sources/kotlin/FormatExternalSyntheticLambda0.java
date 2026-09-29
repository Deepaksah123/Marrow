package kotlin;

import java.io.IOException;
import kotlin.Format1;

/* JADX INFO: loaded from: classes2.dex */
final class FormatExternalSyntheticLambda0 {
    private static Format1.AudioAttributesCompatParcelizer IconCompatParcelizer = Format1.AudioAttributesCompatParcelizer.write("nm", "ind", "ks", "hd");

    static setPlaybackParametersInternal read(Format1 format1, ExoPlayerImplExternalSyntheticLambda19 exoPlayerImplExternalSyntheticLambda19) throws IOException {
        String strMediaBrowserCompatSearchResultReceiver = null;
        int iAudioAttributesImplBaseParcelizer = 0;
        boolean zMediaBrowserCompatItemReceiver = false;
        replaceStreamsOrDisableRendererForTransition replacestreamsordisablerendererfortransitionMediaBrowserCompatItemReceiver = null;
        while (format1.MediaBrowserCompatCustomActionResultReceiver()) {
            int iAudioAttributesCompatParcelizer = format1.AudioAttributesCompatParcelizer(IconCompatParcelizer);
            if (iAudioAttributesCompatParcelizer == 0) {
                strMediaBrowserCompatSearchResultReceiver = format1.MediaBrowserCompatSearchResultReceiver();
            } else if (iAudioAttributesCompatParcelizer == 1) {
                iAudioAttributesImplBaseParcelizer = format1.AudioAttributesImplBaseParcelizer();
            } else if (iAudioAttributesCompatParcelizer == 2) {
                replacestreamsordisablerendererfortransitionMediaBrowserCompatItemReceiver = onContinueLoadingRequested.MediaBrowserCompatItemReceiver(format1, exoPlayerImplExternalSyntheticLambda19);
            } else if (iAudioAttributesCompatParcelizer == 3) {
                zMediaBrowserCompatItemReceiver = format1.MediaBrowserCompatItemReceiver();
            } else {
                format1.RatingCompat();
            }
        }
        return new setPlaybackParametersInternal(strMediaBrowserCompatSearchResultReceiver, iAudioAttributesImplBaseParcelizer, replacestreamsordisablerendererfortransitionMediaBrowserCompatItemReceiver, zMediaBrowserCompatItemReceiver);
    }
}
