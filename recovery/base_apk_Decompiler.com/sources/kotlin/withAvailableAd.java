package kotlin;

import com.marrow.data.api.models.MarrowResponse;
import com.marrow.data.api.models.Success;
import com.marrow.data.api.models.response.common.KycResponseBody;
import com.marrow.data.models.common.ImageUpload;
import com.marrow.data.models.user.LoggedUser;
import com.marrow.data.models.user.User;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class withAvailableAd implements withAvailableAdUri {
    private final withAdResumePositionUs RemoteActionCompatParcelizer;
    private final withAdLoadError read;

    @setSdkPayload
    public withAvailableAd(withAdLoadError withadloaderror, withAdResumePositionUs withadresumepositionus) {
        toMagicModuleMetaRepoModel.write(withadloaderror, "");
        toMagicModuleMetaRepoModel.write(withadresumepositionus, "");
        this.read = withadloaderror;
        this.RemoteActionCompatParcelizer = withadresumepositionus;
    }

    @Override // kotlin.withAvailableAdUri
    public final accessgetEmptyStatecp<List<ImageUpload>> AudioAttributesCompatParcelizer() {
        return this.read.IconCompatParcelizer(1);
    }

    @Override // kotlin.withAvailableAdUri
    public final MarrowResponse<KycResponseBody> RemoteActionCompatParcelizer(ImageUpload imageUpload) {
        toMagicModuleMetaRepoModel.write(imageUpload, "");
        String str = this.read.read(imageUpload.getFilename());
        if (str == null) {
            return withIsServerSideInserted.IconCompatParcelizer;
        }
        LoggedUser loggedUserWrite = this.read.write();
        if (loggedUserWrite == null) {
            return withIsServerSideInserted.write;
        }
        withAdResumePositionUs withadresumepositionus = this.RemoteActionCompatParcelizer;
        long id = imageUpload.getId();
        String userId = loggedUserWrite.getInfo().getUserId();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(userId, "");
        MarrowResponse<KycResponseBody> marrowResponse = withadresumepositionus.read(str, String.valueOf(id), userId, imageUpload.getDocType(), imageUpload.getDocSideType(), imageUpload.getDocGroupId());
        if ((marrowResponse instanceof Success) && ((KycResponseBody) ((Success) marrowResponse).getData()).isAccepted) {
            User info = loggedUserWrite.getInfo();
            info.setKycStatus(getOrderDetails.write(new int[]{6, 7}, info.getKycStatus()) ? 7 : 3);
            this.read.RemoteActionCompatParcelizer(loggedUserWrite);
            this.read.RemoteActionCompatParcelizer(imageUpload.getId());
        }
        return marrowResponse;
    }
}
