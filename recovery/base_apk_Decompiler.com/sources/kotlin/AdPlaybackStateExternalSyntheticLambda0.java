package kotlin;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.marrow.data.api.models.response.firebase.BuyNowPromoResponse;
import com.marrow.data.api.models.response.firebase.BuynowBannerResponse;
import com.marrow.data.api.models.response.firebase.FirebaseSyncResponse;
import com.marrow.data.api.models.response.firebase.NotesResponse;
import com.marrow.data.api.models.response.firebase.PlanResponse;
import com.marrow.data.api.models.response.firebase.SlidesResponse;
import com.marrow.data.api.models.response.firebase.VideoDownloadLimitResponse;
import com.marrow.data.api.models.response.firebase.WoqMarrowthon;
import kotlin.withAdState;

/* JADX INFO: loaded from: classes3.dex */
public final class AdPlaybackStateExternalSyntheticLambda0 implements withAdState {
    private final withAdState.read IconCompatParcelizer;
    private getStreamPositionUsForContent RemoteActionCompatParcelizer;
    private final withAdState.RemoteActionCompatParcelizer write;

    @setSdkPayload
    public AdPlaybackStateExternalSyntheticLambda0(withAdState.RemoteActionCompatParcelizer remoteActionCompatParcelizer, withAdState.read readVar, getStreamPositionUsForContent getstreampositionusforcontent) {
        toMagicModuleMetaRepoModel.write(remoteActionCompatParcelizer, "");
        toMagicModuleMetaRepoModel.write(readVar, "");
        toMagicModuleMetaRepoModel.write(getstreampositionusforcontent, "");
        this.write = remoteActionCompatParcelizer;
        this.IconCompatParcelizer = readVar;
        this.RemoteActionCompatParcelizer = getstreampositionusforcontent;
    }

    @Override // kotlin.withAdState
    public final LessonDynamicResponseBody<FirebaseSyncResponse> RemoteActionCompatParcelizer() {
        return this.write.AudioAttributesCompatParcelizer(this.IconCompatParcelizer.RemoteActionCompatParcelizer());
    }

    @Override // kotlin.withAdState
    public final accessgetEmptyStatecp<VideoDownloadLimitResponse> IconCompatParcelizer() {
        return this.write.AudioAttributesCompatParcelizer();
    }

    @Override // kotlin.withAdState
    public final accessgetEmptyStatecp<BuyNowPromoResponse> read() {
        return this.write.write();
    }

    @Override // kotlin.withAdState
    public final accessgetEmptyStatecp<WoqMarrowthon[]> write() {
        return this.write.RemoteActionCompatParcelizer();
    }

    @Override // kotlin.withAdState
    public final void write(FirebaseSyncResponse firebaseSyncResponse) throws JsonProcessingException {
        toMagicModuleMetaRepoModel.write(firebaseSyncResponse, "");
        FirebaseSyncResponse.Data data = firebaseSyncResponse.data;
        if (data != null) {
            if (data.planResponse != null) {
                withAdState.read readVar = this.IconCompatParcelizer;
                PlanResponse planResponse = data.planResponse;
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(planResponse, "");
                readVar.AudioAttributesCompatParcelizer(planResponse);
            }
            NotesResponse[] notesResponseArr = data.notesResponse;
            if (notesResponseArr != null && notesResponseArr.length != 0) {
                withAdState.read readVar2 = this.IconCompatParcelizer;
                NotesResponse[] notesResponseArr2 = data.notesResponse;
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(notesResponseArr2, "");
                readVar2.AudioAttributesCompatParcelizer(notesResponseArr2);
            }
            SlidesResponse[] slidesResponseArr = data.slidesResponse;
            if (slidesResponseArr != null && slidesResponseArr.length != 0) {
                withAdState.read readVar3 = this.IconCompatParcelizer;
                SlidesResponse[] slidesResponseArr2 = data.slidesResponse;
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(slidesResponseArr2, "");
                readVar3.write(slidesResponseArr2);
            }
            if (data.buynowBannerResponse != null) {
                withAdState.read readVar4 = this.IconCompatParcelizer;
                BuynowBannerResponse buynowBannerResponse = data.buynowBannerResponse;
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(buynowBannerResponse, "");
                readVar4.read(buynowBannerResponse);
            }
        }
        if (firebaseSyncResponse.versions != null) {
            withAdState.read readVar5 = this.IconCompatParcelizer;
            FirebaseSyncResponse.Version version = firebaseSyncResponse.versions;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(version, "");
            readVar5.read(version);
        }
    }

    @Override // kotlin.withAdState
    public final void IconCompatParcelizer(VideoDownloadLimitResponse videoDownloadLimitResponse) {
        toMagicModuleMetaRepoModel.write(videoDownloadLimitResponse, "");
        this.IconCompatParcelizer.IconCompatParcelizer(videoDownloadLimitResponse);
    }

    @Override // kotlin.withAdState
    public final void write(BuyNowPromoResponse buyNowPromoResponse) {
        toMagicModuleMetaRepoModel.write(buyNowPromoResponse, "");
        this.IconCompatParcelizer.write(buyNowPromoResponse);
    }

    @Override // kotlin.withAdState
    public final void RemoteActionCompatParcelizer(WoqMarrowthon[] woqMarrowthonArr) throws JsonProcessingException {
        toMagicModuleMetaRepoModel.write(woqMarrowthonArr, "");
        this.IconCompatParcelizer.IconCompatParcelizer(woqMarrowthonArr);
    }
}
