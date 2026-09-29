package kotlin;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes4.dex */
final class VideoDownloadFGService extends PaginatedSyncTask {
    VideoDownloadFGService(OutputStream outputStream) {
        super(outputStream);
    }

    @Override // kotlin.setMinimumWidthMargin
    final VideoDownloadFGService read() {
        return this;
    }

    @Override // kotlin.PaginatedSyncTask, kotlin.setMinimumWidthMargin
    final void write(LottieRatingBar[] lottieRatingBarArr) throws IOException {
        for (LottieRatingBar lottieRatingBar : lottieRatingBarArr) {
            lottieRatingBar.AudioAttributesImplApi26Parcelizer().IconCompatParcelizer().RemoteActionCompatParcelizer(this, true);
        }
    }

    @Override // kotlin.PaginatedSyncTask, kotlin.setMinimumWidthMargin
    final void RemoteActionCompatParcelizer(setMsDelay setmsdelay) throws IOException {
        setmsdelay.IconCompatParcelizer().RemoteActionCompatParcelizer(this, true);
    }

    @Override // kotlin.PaginatedSyncTask, kotlin.setMinimumWidthMargin
    final void AudioAttributesCompatParcelizer(setMsDelay[] setmsdelayArr) throws IOException {
        for (setMsDelay setmsdelay : setmsdelayArr) {
            setmsdelay.IconCompatParcelizer().RemoteActionCompatParcelizer(this, true);
        }
    }
}
