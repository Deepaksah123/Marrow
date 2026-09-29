package kotlin;

import com.marrow.data.api.models.MarrowError;
import com.marrow.data.api.models.MarrowResponse;
import com.marrow.data.api.models.ResponseExtensionsKt;
import com.marrow.data.api.models.request.video.VideoHeartbeatRequestBody;
import com.marrow.data.api.models.response.ApiResponse;
import com.marrow.data.api.models.response.video.VideoHeartbeatResponseBody;

/* JADX INFO: loaded from: classes3.dex */
public final class BaseUrlExclusionList implements removeExpiredExclusions {
    private final discardFrom AudioAttributesCompatParcelizer;

    @setSdkPayload
    public BaseUrlExclusionList(discardFrom discardfrom) {
        toMagicModuleMetaRepoModel.write(discardfrom, "");
        this.AudioAttributesCompatParcelizer = discardfrom;
    }

    @Override // kotlin.removeExpiredExclusions
    public final accessgetEmptyStatecp<MarrowResponse<VideoHeartbeatResponseBody>> write(VideoHeartbeatRequestBody videoHeartbeatRequestBody) {
        toMagicModuleMetaRepoModel.write(videoHeartbeatRequestBody, "");
        accessgetEmptyStatecp<ApiResponse<VideoHeartbeatResponseBody>> accessgetemptystatecpAudioAttributesCompatParcelizer = this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(videoHeartbeatRequestBody);
        final getAnswerMap getanswermap = new getAnswerMap() { // from class: o.applyExclusions
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return BaseUrlExclusionList.write((ApiResponse) obj);
            }
        };
        accessgetEmptyStatecp<R> accessgetemptystatecpRemoteActionCompatParcelizer = accessgetemptystatecpAudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(new getSubjectTitle() { // from class: o.addExclusion
            @Override // kotlin.getSubjectTitle
            public final Object apply(Object obj) {
                return BaseUrlExclusionList.IconCompatParcelizer(getanswermap, obj);
            }
        });
        final getAnswerMap getanswermap2 = new getAnswerMap() { // from class: o.r8lambdadm4PGjkoNFYoKRqekPcgJH9m4A
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return BaseUrlExclusionList.write((Throwable) obj);
            }
        };
        accessgetEmptyStatecp<MarrowResponse<VideoHeartbeatResponseBody>> accessgetemptystatecp = accessgetemptystatecpRemoteActionCompatParcelizer.read((getSubjectTitle<? super Throwable, ? extends R>) new getSubjectTitle() { // from class: o.selectWeighted
            @Override // kotlin.getSubjectTitle
            public final Object apply(Object obj) {
                return BaseUrlExclusionList.RemoteActionCompatParcelizer(getanswermap2, obj);
            }
        });
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(accessgetemptystatecp, "");
        return accessgetemptystatecp;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MarrowResponse IconCompatParcelizer(getAnswerMap getanswermap, Object obj) {
        toMagicModuleMetaRepoModel.write(obj, "");
        return (MarrowResponse) getanswermap.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MarrowResponse write(ApiResponse apiResponse) {
        toMagicModuleMetaRepoModel.write(apiResponse, "");
        return ResponseExtensionsKt.asMarrowResponse(apiResponse);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MarrowResponse RemoteActionCompatParcelizer(getAnswerMap getanswermap, Object obj) {
        toMagicModuleMetaRepoModel.write(obj, "");
        return (MarrowResponse) getanswermap.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MarrowResponse write(Throwable th) {
        toMagicModuleMetaRepoModel.write(th, "");
        return new MarrowError(th);
    }
}
