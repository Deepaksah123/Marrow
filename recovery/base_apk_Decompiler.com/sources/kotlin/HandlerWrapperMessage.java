package kotlin;

import com.marrow2.data.user.remote.model.ResetContentInfoResponse;

/* JADX INFO: loaded from: classes3.dex */
public final class HandlerWrapperMessage {
    public static final postAtFrontOfQueue AudioAttributesCompatParcelizer(ResetContentInfoResponse resetContentInfoResponse, ResetContentInfoResponse.ScreenCopy screenCopy) {
        toMagicModuleMetaRepoModel.write(resetContentInfoResponse, "");
        toMagicModuleMetaRepoModel.write(screenCopy, "");
        if (resetContentInfoResponse.getScreenCopy() != null && (resetContentInfoResponse.getScreenCopy().getBookmarkContentUiCopy() != null || resetContentInfoResponse.getScreenCopy().getQBankContentUiCopy() != null || resetContentInfoResponse.getScreenCopy().getQBankAndBookmarkContentUiCopy() != null)) {
            screenCopy = resetContentInfoResponse.getScreenCopy();
        }
        return new postAtFrontOfQueue(resetContentInfoResponse.getContentStatus(), screenCopy);
    }
}
