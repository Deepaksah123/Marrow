package kotlin;

import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;
import java.io.IOException;
import kotlin.Format1;
import kotlin.shouldAdvancePlayingPeriod;

/* JADX INFO: loaded from: classes2.dex */
final class withManifestFormatInfo {
    private static final Format1.AudioAttributesCompatParcelizer read = Format1.AudioAttributesCompatParcelizer.write(CmcdHeadersFactory.STREAMING_FORMAT_SS, "e", "o", "nm", "m", "hd");

    static shouldAdvancePlayingPeriod AudioAttributesCompatParcelizer(Format1 format1, ExoPlayerImplExternalSyntheticLambda19 exoPlayerImplExternalSyntheticLambda19) throws IOException {
        String strMediaBrowserCompatSearchResultReceiver = null;
        shouldAdvancePlayingPeriod.IconCompatParcelizer IconCompatParcelizer = null;
        mediaSourceListUpdateRequestedInternal mediasourcelistupdaterequestedinternal = null;
        mediaSourceListUpdateRequestedInternal mediasourcelistupdaterequestedinternal2 = null;
        mediaSourceListUpdateRequestedInternal mediasourcelistupdaterequestedinternal3 = null;
        boolean zMediaBrowserCompatItemReceiver = false;
        while (format1.MediaBrowserCompatCustomActionResultReceiver()) {
            int iAudioAttributesCompatParcelizer = format1.AudioAttributesCompatParcelizer(read);
            if (iAudioAttributesCompatParcelizer == 0) {
                mediasourcelistupdaterequestedinternal = onContinueLoadingRequested.read(format1, exoPlayerImplExternalSyntheticLambda19, false);
            } else if (iAudioAttributesCompatParcelizer == 1) {
                mediasourcelistupdaterequestedinternal2 = onContinueLoadingRequested.read(format1, exoPlayerImplExternalSyntheticLambda19, false);
            } else if (iAudioAttributesCompatParcelizer == 2) {
                mediasourcelistupdaterequestedinternal3 = onContinueLoadingRequested.read(format1, exoPlayerImplExternalSyntheticLambda19, false);
            } else if (iAudioAttributesCompatParcelizer == 3) {
                strMediaBrowserCompatSearchResultReceiver = format1.MediaBrowserCompatSearchResultReceiver();
            } else if (iAudioAttributesCompatParcelizer == 4) {
                IconCompatParcelizer = shouldAdvancePlayingPeriod.IconCompatParcelizer.IconCompatParcelizer(format1.AudioAttributesImplBaseParcelizer());
            } else if (iAudioAttributesCompatParcelizer == 5) {
                zMediaBrowserCompatItemReceiver = format1.MediaBrowserCompatItemReceiver();
            } else {
                format1.RatingCompat();
            }
        }
        return new shouldAdvancePlayingPeriod(strMediaBrowserCompatSearchResultReceiver, IconCompatParcelizer, mediasourcelistupdaterequestedinternal, mediasourcelistupdaterequestedinternal2, mediasourcelistupdaterequestedinternal3, zMediaBrowserCompatItemReceiver);
    }
}
