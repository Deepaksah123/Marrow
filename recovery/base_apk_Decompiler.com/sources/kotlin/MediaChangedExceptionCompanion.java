package kotlin;

import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class MediaChangedExceptionCompanion implements setPairOfTimeAndIndex {
    private setScrollEndListener RemoteActionCompatParcelizer;

    MediaChangedExceptionCompanion(setScrollEndListener setscrollendlistener) {
        this.RemoteActionCompatParcelizer = setscrollendlistener;
    }

    static safeParam AudioAttributesCompatParcelizer(setScrollEndListener setscrollendlistener) throws IOException {
        return new safeParam(setscrollendlistener.write());
    }

    @Override // kotlin.toResetBookmarkRepoModel
    public final setMsDelay AudioAttributesCompatParcelizer() throws IOException {
        return AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer);
    }

    @Override // kotlin.LottieRatingBar
    public final setMsDelay AudioAttributesImplApi26Parcelizer() {
        try {
            return AudioAttributesCompatParcelizer();
        } catch (IOException e) {
            throw new IllegalStateException(e.getMessage());
        }
    }
}
