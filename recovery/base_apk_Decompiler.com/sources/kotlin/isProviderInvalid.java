package kotlin;

import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class isProviderInvalid implements TimerView {
    private setScrollEndListener write;

    isProviderInvalid(setScrollEndListener setscrollendlistener) {
        this.write = setscrollendlistener;
    }

    static PlayIntegrityExceptionUtil write(setScrollEndListener setscrollendlistener) throws IOException {
        return new PlayIntegrityExceptionUtil(setscrollendlistener.write());
    }

    @Override // kotlin.toResetBookmarkRepoModel
    public final setMsDelay AudioAttributesCompatParcelizer() throws IOException {
        return write(this.write);
    }

    @Override // kotlin.LottieRatingBar
    public final setMsDelay AudioAttributesImplApi26Parcelizer() {
        try {
            return AudioAttributesCompatParcelizer();
        } catch (IOException e) {
            throw new setHideRunner(e.getMessage(), e);
        }
    }
}
