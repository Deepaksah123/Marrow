package kotlin;

import java.io.IOException;
import kotlin.Format1;

/* JADX INFO: loaded from: classes2.dex */
final class defaultIfNull {
    private static final Format1.AudioAttributesCompatParcelizer read = Format1.AudioAttributesCompatParcelizer.write("nm", "c", "o", "tr", "hd");

    static sendMessageToTargetThread IconCompatParcelizer(Format1 format1, ExoPlayerImplExternalSyntheticLambda19 exoPlayerImplExternalSyntheticLambda19) throws IOException {
        String strMediaBrowserCompatSearchResultReceiver = null;
        mediaSourceListUpdateRequestedInternal mediasourcelistupdaterequestedinternal = null;
        mediaSourceListUpdateRequestedInternal mediasourcelistupdaterequestedinternal2 = null;
        resetPendingPauseAtEndOfPeriod resetpendingpauseatendofperiod = null;
        boolean zMediaBrowserCompatItemReceiver = false;
        while (format1.MediaBrowserCompatCustomActionResultReceiver()) {
            int iAudioAttributesCompatParcelizer = format1.AudioAttributesCompatParcelizer(read);
            if (iAudioAttributesCompatParcelizer == 0) {
                strMediaBrowserCompatSearchResultReceiver = format1.MediaBrowserCompatSearchResultReceiver();
            } else if (iAudioAttributesCompatParcelizer == 1) {
                mediasourcelistupdaterequestedinternal = onContinueLoadingRequested.read(format1, exoPlayerImplExternalSyntheticLambda19, false);
            } else if (iAudioAttributesCompatParcelizer == 2) {
                mediasourcelistupdaterequestedinternal2 = onContinueLoadingRequested.read(format1, exoPlayerImplExternalSyntheticLambda19, false);
            } else if (iAudioAttributesCompatParcelizer == 3) {
                resetpendingpauseatendofperiod = sendMessage.read(format1, exoPlayerImplExternalSyntheticLambda19);
            } else if (iAudioAttributesCompatParcelizer == 4) {
                zMediaBrowserCompatItemReceiver = format1.MediaBrowserCompatItemReceiver();
            } else {
                format1.RatingCompat();
            }
        }
        return new sendMessageToTargetThread(strMediaBrowserCompatSearchResultReceiver, mediasourcelistupdaterequestedinternal, mediasourcelistupdaterequestedinternal2, resetpendingpauseatendofperiod, zMediaBrowserCompatItemReceiver);
    }
}
