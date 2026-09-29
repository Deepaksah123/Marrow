package kotlin;

import java.io.IOException;
import kotlin.Format1;
import kotlin.setAllRendererStreamsFinal;

/* JADX INFO: loaded from: classes2.dex */
final class ExoPlayerImplInternalPlaybackInfoUpdateListener {
    private static final Format1.AudioAttributesCompatParcelizer RemoteActionCompatParcelizer = Format1.AudioAttributesCompatParcelizer.write("nm", "mm", "hd");

    static setAllRendererStreamsFinal read(Format1 format1) throws IOException {
        String strMediaBrowserCompatSearchResultReceiver = null;
        boolean zMediaBrowserCompatItemReceiver = false;
        setAllRendererStreamsFinal.RemoteActionCompatParcelizer remoteActionCompatParcelizerWrite = null;
        while (format1.MediaBrowserCompatCustomActionResultReceiver()) {
            int iAudioAttributesCompatParcelizer = format1.AudioAttributesCompatParcelizer(RemoteActionCompatParcelizer);
            if (iAudioAttributesCompatParcelizer == 0) {
                strMediaBrowserCompatSearchResultReceiver = format1.MediaBrowserCompatSearchResultReceiver();
            } else if (iAudioAttributesCompatParcelizer == 1) {
                remoteActionCompatParcelizerWrite = setAllRendererStreamsFinal.RemoteActionCompatParcelizer.write(format1.AudioAttributesImplBaseParcelizer());
            } else if (iAudioAttributesCompatParcelizer == 2) {
                zMediaBrowserCompatItemReceiver = format1.MediaBrowserCompatItemReceiver();
            } else {
                format1.MediaDescriptionCompat();
                format1.RatingCompat();
            }
        }
        return new setAllRendererStreamsFinal(strMediaBrowserCompatSearchResultReceiver, remoteActionCompatParcelizerWrite, zMediaBrowserCompatItemReceiver);
    }
}
