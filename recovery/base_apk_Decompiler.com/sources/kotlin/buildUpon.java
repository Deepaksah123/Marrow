package kotlin;

import java.io.IOException;
import kotlin.Format1;

/* JADX INFO: loaded from: classes2.dex */
public final class buildUpon {
    private static final Format1.AudioAttributesCompatParcelizer IconCompatParcelizer = Format1.AudioAttributesCompatParcelizer.write("nm", "r", "hd");

    static setPlayWhenReadyInternal IconCompatParcelizer(Format1 format1, ExoPlayerImplExternalSyntheticLambda19 exoPlayerImplExternalSyntheticLambda19) throws IOException {
        boolean zMediaBrowserCompatItemReceiver = false;
        String strMediaBrowserCompatSearchResultReceiver = null;
        mediaSourceListUpdateRequestedInternal mediasourcelistupdaterequestedinternal = null;
        while (format1.MediaBrowserCompatCustomActionResultReceiver()) {
            int iAudioAttributesCompatParcelizer = format1.AudioAttributesCompatParcelizer(IconCompatParcelizer);
            if (iAudioAttributesCompatParcelizer == 0) {
                strMediaBrowserCompatSearchResultReceiver = format1.MediaBrowserCompatSearchResultReceiver();
            } else if (iAudioAttributesCompatParcelizer == 1) {
                mediasourcelistupdaterequestedinternal = onContinueLoadingRequested.read(format1, exoPlayerImplExternalSyntheticLambda19, true);
            } else if (iAudioAttributesCompatParcelizer == 2) {
                zMediaBrowserCompatItemReceiver = format1.MediaBrowserCompatItemReceiver();
            } else {
                format1.RatingCompat();
            }
        }
        if (zMediaBrowserCompatItemReceiver) {
            return null;
        }
        return new setPlayWhenReadyInternal(strMediaBrowserCompatSearchResultReceiver, mediasourcelistupdaterequestedinternal);
    }
}
