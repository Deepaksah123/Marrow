package kotlin;

import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class L3FallbackApprovalResponseBody implements setRatingParticular {
    private setScrollEndListener write;

    public L3FallbackApprovalResponseBody(setScrollEndListener setscrollendlistener) {
        this.write = setscrollendlistener;
    }

    static getEventBus AudioAttributesCompatParcelizer(setScrollEndListener setscrollendlistener) throws IOException {
        try {
            return new getEventBus(new getCourse_id(setscrollendlistener.write()));
        } catch (IllegalArgumentException e) {
            throw new MaxHeightRecyclerView(e.getMessage(), e);
        }
    }

    @Override // kotlin.toResetBookmarkRepoModel
    public final setMsDelay AudioAttributesCompatParcelizer() throws IOException {
        return AudioAttributesCompatParcelizer(this.write);
    }

    @Override // kotlin.LottieRatingBar
    public final setMsDelay AudioAttributesImplApi26Parcelizer() {
        try {
            return AudioAttributesCompatParcelizer();
        } catch (IOException e) {
            throw new setHideRunner("unable to get DER object", e);
        } catch (IllegalArgumentException e2) {
            throw new setHideRunner("unable to get DER object", e2);
        }
    }
}
