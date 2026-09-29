package kotlin;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes4.dex */
class PaginatedSyncTask extends setMinimumWidthMargin {
    PaginatedSyncTask(OutputStream outputStream) {
        super(outputStream);
    }

    @Override // kotlin.setMinimumWidthMargin
    final PaginatedSyncTask write() {
        return this;
    }

    @Override // kotlin.setMinimumWidthMargin
    void write(LottieRatingBar[] lottieRatingBarArr) throws IOException {
        for (LottieRatingBar lottieRatingBar : lottieRatingBarArr) {
            lottieRatingBar.AudioAttributesImplApi26Parcelizer().MediaBrowserCompatItemReceiver().RemoteActionCompatParcelizer(this, true);
        }
    }

    @Override // kotlin.setMinimumWidthMargin
    void RemoteActionCompatParcelizer(setMsDelay setmsdelay) throws IOException {
        setmsdelay.MediaBrowserCompatItemReceiver().RemoteActionCompatParcelizer(this, true);
    }

    @Override // kotlin.setMinimumWidthMargin
    void AudioAttributesCompatParcelizer(setMsDelay[] setmsdelayArr) throws IOException {
        for (setMsDelay setmsdelay : setmsdelayArr) {
            setmsdelay.MediaBrowserCompatItemReceiver().RemoteActionCompatParcelizer(this, true);
        }
    }
}
