package kotlin;

import android.graphics.Path;
import java.io.IOException;
import java.util.Collections;
import kotlin.Format1;

/* JADX INFO: loaded from: classes2.dex */
final class toLogString {
    private static final Format1.AudioAttributesCompatParcelizer write = Format1.AudioAttributesCompatParcelizer.write("nm", "c", "o", "fillEnabled", "r", "hd");

    static setPauseAtEndOfWindowInternal RemoteActionCompatParcelizer(Format1 format1, ExoPlayerImplExternalSyntheticLambda19 exoPlayerImplExternalSyntheticLambda19) throws IOException {
        notifyTrackSelectionPlayWhenReadyChanged notifytrackselectionplaywhenreadychanged = null;
        String strMediaBrowserCompatSearchResultReceiver = null;
        maybeUpdateReadingRenderers maybeupdatereadingrenderersAudioAttributesCompatParcelizer = null;
        boolean zMediaBrowserCompatItemReceiver = false;
        boolean zMediaBrowserCompatItemReceiver2 = false;
        int iAudioAttributesImplBaseParcelizer = 1;
        while (format1.MediaBrowserCompatCustomActionResultReceiver()) {
            int iAudioAttributesCompatParcelizer = format1.AudioAttributesCompatParcelizer(write);
            if (iAudioAttributesCompatParcelizer == 0) {
                strMediaBrowserCompatSearchResultReceiver = format1.MediaBrowserCompatSearchResultReceiver();
            } else if (iAudioAttributesCompatParcelizer == 1) {
                maybeupdatereadingrenderersAudioAttributesCompatParcelizer = onContinueLoadingRequested.AudioAttributesCompatParcelizer(format1, exoPlayerImplExternalSyntheticLambda19);
            } else if (iAudioAttributesCompatParcelizer == 2) {
                notifytrackselectionplaywhenreadychanged = onContinueLoadingRequested.IconCompatParcelizer(format1, exoPlayerImplExternalSyntheticLambda19);
            } else if (iAudioAttributesCompatParcelizer == 3) {
                zMediaBrowserCompatItemReceiver = format1.MediaBrowserCompatItemReceiver();
            } else if (iAudioAttributesCompatParcelizer == 4) {
                iAudioAttributesImplBaseParcelizer = format1.AudioAttributesImplBaseParcelizer();
            } else if (iAudioAttributesCompatParcelizer == 5) {
                zMediaBrowserCompatItemReceiver2 = format1.MediaBrowserCompatItemReceiver();
            } else {
                format1.MediaDescriptionCompat();
                format1.RatingCompat();
            }
        }
        if (notifytrackselectionplaywhenreadychanged == null) {
            notifytrackselectionplaywhenreadychanged = new notifyTrackSelectionPlayWhenReadyChanged(Collections.singletonList(new setEncoderDelay(100)));
        }
        return new setPauseAtEndOfWindowInternal(strMediaBrowserCompatSearchResultReceiver, zMediaBrowserCompatItemReceiver, iAudioAttributesImplBaseParcelizer == 1 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD, maybeupdatereadingrenderersAudioAttributesCompatParcelizer, notifytrackselectionplaywhenreadychanged, zMediaBrowserCompatItemReceiver2);
    }
}
