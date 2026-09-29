package kotlin;

import android.graphics.Path;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;
import java.io.IOException;
import java.util.Collections;
import kotlin.Format1;

/* JADX INFO: loaded from: classes2.dex */
final class ExoPlayerImplInternalPlaybackInfoUpdate {
    private static final Format1.AudioAttributesCompatParcelizer RemoteActionCompatParcelizer = Format1.AudioAttributesCompatParcelizer.write("nm", "g", "o", "t", CmcdHeadersFactory.STREAMING_FORMAT_SS, "e", "r", "hd");
    private static final Format1.AudioAttributesCompatParcelizer write = Format1.AudioAttributesCompatParcelizer.write(TtmlNode.TAG_P, "k");

    static sendMessageInternal read(Format1 format1, ExoPlayerImplExternalSyntheticLambda19 exoPlayerImplExternalSyntheticLambda19) throws IOException {
        notifyTrackSelectionPlayWhenReadyChanged notifytrackselectionplaywhenreadychangedIconCompatParcelizer = null;
        Path.FillType fillType = Path.FillType.WINDING;
        String strMediaBrowserCompatSearchResultReceiver = null;
        seekToPeriodPosition seektoperiodposition = null;
        notifyTrackSelectionDiscontinuity notifytrackselectiondiscontinuity = null;
        releaseInternal releaseinternal = null;
        releaseInternal releaseinternal2 = null;
        boolean zMediaBrowserCompatItemReceiver = false;
        while (format1.MediaBrowserCompatCustomActionResultReceiver()) {
            switch (format1.AudioAttributesCompatParcelizer(RemoteActionCompatParcelizer)) {
                case 0:
                    strMediaBrowserCompatSearchResultReceiver = format1.MediaBrowserCompatSearchResultReceiver();
                    break;
                case 1:
                    format1.AudioAttributesCompatParcelizer();
                    int iAudioAttributesImplBaseParcelizer = -1;
                    while (format1.MediaBrowserCompatCustomActionResultReceiver()) {
                        int iAudioAttributesCompatParcelizer = format1.AudioAttributesCompatParcelizer(write);
                        if (iAudioAttributesCompatParcelizer == 0) {
                            iAudioAttributesImplBaseParcelizer = format1.AudioAttributesImplBaseParcelizer();
                        } else if (iAudioAttributesCompatParcelizer == 1) {
                            notifytrackselectiondiscontinuity = onContinueLoadingRequested.read(format1, exoPlayerImplExternalSyntheticLambda19, iAudioAttributesImplBaseParcelizer);
                        } else {
                            format1.MediaDescriptionCompat();
                            format1.RatingCompat();
                        }
                    }
                    format1.IconCompatParcelizer();
                    break;
                case 2:
                    notifytrackselectionplaywhenreadychangedIconCompatParcelizer = onContinueLoadingRequested.IconCompatParcelizer(format1, exoPlayerImplExternalSyntheticLambda19);
                    break;
                case 3:
                    seektoperiodposition = format1.AudioAttributesImplBaseParcelizer() == 1 ? seekToPeriodPosition.LINEAR : seekToPeriodPosition.RADIAL;
                    break;
                case 4:
                    releaseinternal = onContinueLoadingRequested.read(format1, exoPlayerImplExternalSyntheticLambda19);
                    break;
                case 5:
                    releaseinternal2 = onContinueLoadingRequested.read(format1, exoPlayerImplExternalSyntheticLambda19);
                    break;
                case 6:
                    fillType = format1.AudioAttributesImplBaseParcelizer() == 1 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD;
                    break;
                case 7:
                    zMediaBrowserCompatItemReceiver = format1.MediaBrowserCompatItemReceiver();
                    break;
                default:
                    format1.MediaDescriptionCompat();
                    format1.RatingCompat();
                    break;
            }
        }
        return new sendMessageInternal(strMediaBrowserCompatSearchResultReceiver, seektoperiodposition, fillType, notifytrackselectiondiscontinuity, notifytrackselectionplaywhenreadychangedIconCompatParcelizer == null ? new notifyTrackSelectionPlayWhenReadyChanged(Collections.singletonList(new setEncoderDelay(100))) : notifytrackselectionplaywhenreadychangedIconCompatParcelizer, releaseinternal, releaseinternal2, zMediaBrowserCompatItemReceiver);
    }
}
