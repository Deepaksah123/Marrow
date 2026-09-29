package kotlin;

import android.graphics.PointF;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;
import java.io.IOException;
import kotlin.Format1;

/* JADX INFO: loaded from: classes2.dex */
final class registeredModules {
    private static final Format1.AudioAttributesCompatParcelizer read = Format1.AudioAttributesCompatParcelizer.write("nm", TtmlNode.TAG_P, CmcdHeadersFactory.STREAMING_FORMAT_SS, "r", "hd");

    static setForegroundModeInternal read(Format1 format1, ExoPlayerImplExternalSyntheticLambda19 exoPlayerImplExternalSyntheticLambda19) throws IOException {
        String strMediaBrowserCompatSearchResultReceiver = null;
        resolvePendingMessagePosition<PointF, PointF> resolvependingmessagepositionRemoteActionCompatParcelizer = null;
        releaseInternal releaseinternal = null;
        mediaSourceListUpdateRequestedInternal mediasourcelistupdaterequestedinternalRemoteActionCompatParcelizer = null;
        boolean zMediaBrowserCompatItemReceiver = false;
        while (format1.MediaBrowserCompatCustomActionResultReceiver()) {
            int iAudioAttributesCompatParcelizer = format1.AudioAttributesCompatParcelizer(read);
            if (iAudioAttributesCompatParcelizer == 0) {
                strMediaBrowserCompatSearchResultReceiver = format1.MediaBrowserCompatSearchResultReceiver();
            } else if (iAudioAttributesCompatParcelizer == 1) {
                resolvependingmessagepositionRemoteActionCompatParcelizer = removeMediaSources.RemoteActionCompatParcelizer(format1, exoPlayerImplExternalSyntheticLambda19);
            } else if (iAudioAttributesCompatParcelizer == 2) {
                releaseinternal = onContinueLoadingRequested.read(format1, exoPlayerImplExternalSyntheticLambda19);
            } else if (iAudioAttributesCompatParcelizer == 3) {
                mediasourcelistupdaterequestedinternalRemoteActionCompatParcelizer = onContinueLoadingRequested.RemoteActionCompatParcelizer(format1, exoPlayerImplExternalSyntheticLambda19);
            } else if (iAudioAttributesCompatParcelizer == 4) {
                zMediaBrowserCompatItemReceiver = format1.MediaBrowserCompatItemReceiver();
            } else {
                format1.RatingCompat();
            }
        }
        return new setForegroundModeInternal(strMediaBrowserCompatSearchResultReceiver, resolvependingmessagepositionRemoteActionCompatParcelizer, releaseinternal, mediasourcelistupdaterequestedinternalRemoteActionCompatParcelizer, zMediaBrowserCompatItemReceiver);
    }
}
