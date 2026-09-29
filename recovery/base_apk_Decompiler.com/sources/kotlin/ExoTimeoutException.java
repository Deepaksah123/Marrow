package kotlin;

import android.graphics.PointF;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.io.IOException;
import kotlin.Format1;
import kotlin.setMediaClockPlaybackParameters;

/* JADX INFO: loaded from: classes2.dex */
final class ExoTimeoutException {
    private static final Format1.AudioAttributesCompatParcelizer IconCompatParcelizer = Format1.AudioAttributesCompatParcelizer.write("nm", "sy", "pt", TtmlNode.TAG_P, "r", "or", "os", "ir", "is", "hd", "d");

    static setMediaClockPlaybackParameters AudioAttributesCompatParcelizer(Format1 format1, ExoPlayerImplExternalSyntheticLambda19 exoPlayerImplExternalSyntheticLambda19, int i) throws IOException {
        boolean zMediaBrowserCompatItemReceiver = false;
        boolean z = i == 3;
        String strMediaBrowserCompatSearchResultReceiver = null;
        setMediaClockPlaybackParameters.RemoteActionCompatParcelizer remoteActionCompatParcelizerAudioAttributesCompatParcelizer = null;
        mediaSourceListUpdateRequestedInternal mediasourcelistupdaterequestedinternal = null;
        resolvePendingMessagePosition<PointF, PointF> resolvependingmessagepositionRemoteActionCompatParcelizer = null;
        mediaSourceListUpdateRequestedInternal mediasourcelistupdaterequestedinternal2 = null;
        mediaSourceListUpdateRequestedInternal mediasourcelistupdaterequestedinternalRemoteActionCompatParcelizer = null;
        mediaSourceListUpdateRequestedInternal mediasourcelistupdaterequestedinternalRemoteActionCompatParcelizer2 = null;
        mediaSourceListUpdateRequestedInternal mediasourcelistupdaterequestedinternal3 = null;
        mediaSourceListUpdateRequestedInternal mediasourcelistupdaterequestedinternal4 = null;
        while (format1.MediaBrowserCompatCustomActionResultReceiver()) {
            switch (format1.AudioAttributesCompatParcelizer(IconCompatParcelizer)) {
                case 0:
                    strMediaBrowserCompatSearchResultReceiver = format1.MediaBrowserCompatSearchResultReceiver();
                    break;
                case 1:
                    remoteActionCompatParcelizerAudioAttributesCompatParcelizer = setMediaClockPlaybackParameters.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(format1.AudioAttributesImplBaseParcelizer());
                    break;
                case 2:
                    mediasourcelistupdaterequestedinternal = onContinueLoadingRequested.read(format1, exoPlayerImplExternalSyntheticLambda19, false);
                    break;
                case 3:
                    resolvependingmessagepositionRemoteActionCompatParcelizer = removeMediaSources.RemoteActionCompatParcelizer(format1, exoPlayerImplExternalSyntheticLambda19);
                    break;
                case 4:
                    mediasourcelistupdaterequestedinternal2 = onContinueLoadingRequested.read(format1, exoPlayerImplExternalSyntheticLambda19, false);
                    break;
                case 5:
                    mediasourcelistupdaterequestedinternalRemoteActionCompatParcelizer2 = onContinueLoadingRequested.RemoteActionCompatParcelizer(format1, exoPlayerImplExternalSyntheticLambda19);
                    break;
                case 6:
                    mediasourcelistupdaterequestedinternal4 = onContinueLoadingRequested.read(format1, exoPlayerImplExternalSyntheticLambda19, false);
                    break;
                case 7:
                    mediasourcelistupdaterequestedinternalRemoteActionCompatParcelizer = onContinueLoadingRequested.RemoteActionCompatParcelizer(format1, exoPlayerImplExternalSyntheticLambda19);
                    break;
                case 8:
                    mediasourcelistupdaterequestedinternal3 = onContinueLoadingRequested.read(format1, exoPlayerImplExternalSyntheticLambda19, false);
                    break;
                case 9:
                    zMediaBrowserCompatItemReceiver = format1.MediaBrowserCompatItemReceiver();
                    break;
                case 10:
                    z = format1.AudioAttributesImplBaseParcelizer() == 3;
                    break;
                default:
                    format1.MediaDescriptionCompat();
                    format1.RatingCompat();
                    break;
            }
        }
        return new setMediaClockPlaybackParameters(strMediaBrowserCompatSearchResultReceiver, remoteActionCompatParcelizerAudioAttributesCompatParcelizer, mediasourcelistupdaterequestedinternal, resolvependingmessagepositionRemoteActionCompatParcelizer, mediasourcelistupdaterequestedinternal2, mediasourcelistupdaterequestedinternalRemoteActionCompatParcelizer, mediasourcelistupdaterequestedinternalRemoteActionCompatParcelizer2, mediasourcelistupdaterequestedinternal3, mediasourcelistupdaterequestedinternal4, zMediaBrowserCompatItemReceiver, z);
    }
}
