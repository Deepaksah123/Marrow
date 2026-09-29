package kotlin;

import android.graphics.PointF;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;
import java.io.IOException;
import kotlin.Format1;

/* JADX INFO: loaded from: classes2.dex */
final class ExoPlayerImplInternal1 {
    private static final Format1.AudioAttributesCompatParcelizer write = Format1.AudioAttributesCompatParcelizer.write("nm", TtmlNode.TAG_P, CmcdHeadersFactory.STREAMING_FORMAT_SS, "hd", "d");

    static resolveSubsequentPeriod write(Format1 format1, ExoPlayerImplExternalSyntheticLambda19 exoPlayerImplExternalSyntheticLambda19, int i) throws IOException {
        boolean z = i == 3;
        boolean zMediaBrowserCompatItemReceiver = false;
        String strMediaBrowserCompatSearchResultReceiver = null;
        resolvePendingMessagePosition<PointF, PointF> resolvependingmessagepositionRemoteActionCompatParcelizer = null;
        releaseInternal releaseinternal = null;
        while (format1.MediaBrowserCompatCustomActionResultReceiver()) {
            int iAudioAttributesCompatParcelizer = format1.AudioAttributesCompatParcelizer(write);
            if (iAudioAttributesCompatParcelizer == 0) {
                strMediaBrowserCompatSearchResultReceiver = format1.MediaBrowserCompatSearchResultReceiver();
            } else if (iAudioAttributesCompatParcelizer == 1) {
                resolvependingmessagepositionRemoteActionCompatParcelizer = removeMediaSources.RemoteActionCompatParcelizer(format1, exoPlayerImplExternalSyntheticLambda19);
            } else if (iAudioAttributesCompatParcelizer == 2) {
                releaseinternal = onContinueLoadingRequested.read(format1, exoPlayerImplExternalSyntheticLambda19);
            } else if (iAudioAttributesCompatParcelizer == 3) {
                zMediaBrowserCompatItemReceiver = format1.MediaBrowserCompatItemReceiver();
            } else if (iAudioAttributesCompatParcelizer == 4) {
                z = format1.AudioAttributesImplBaseParcelizer() == 3;
            } else {
                format1.MediaDescriptionCompat();
                format1.RatingCompat();
            }
        }
        return new resolveSubsequentPeriod(strMediaBrowserCompatSearchResultReceiver, resolvependingmessagepositionRemoteActionCompatParcelizer, releaseinternal, z, zMediaBrowserCompatItemReceiver);
    }
}
