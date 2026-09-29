package kotlin;

import com.marrow.data.api.models.MarrowResponse;
import com.marrow.data.api.models.ResponseExtensionsKt;
import com.marrow.data.api.models.response.ApiResponse;
import com.marrow.data.api.models.response.payment.PaymentStatusResponse;
import com.marrow.data.models.plan.Subscription;

/* JADX INFO: loaded from: classes3.dex */
public final class resetSampleQueues implements maybeNotifyPrimaryTrackFormatChanged {
    private final logErrorMessage IconCompatParcelizer;

    @setSdkPayload
    public resetSampleQueues(logErrorMessage logerrormessage) {
        toMagicModuleMetaRepoModel.write(logerrormessage, "");
        this.IconCompatParcelizer = logerrormessage;
    }

    @Override // kotlin.maybeNotifyPrimaryTrackFormatChanged
    public final SearchTextResponseBody<ApiResponse<Subscription[]>> write() {
        SearchTextResponseBody<ApiResponse<Subscription[]>> searchTextResponseBodyAudioAttributesCompatParcelizer = this.IconCompatParcelizer.AudioAttributesCompatParcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(searchTextResponseBodyAudioAttributesCompatParcelizer, "");
        return searchTextResponseBodyAudioAttributesCompatParcelizer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MarrowResponse AudioAttributesCompatParcelizer(ApiResponse apiResponse) {
        toMagicModuleMetaRepoModel.write(apiResponse, "");
        return ResponseExtensionsKt.asMarrowResponse(apiResponse);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MarrowResponse write(getAnswerMap getanswermap, Object obj) {
        toMagicModuleMetaRepoModel.write(obj, "");
        return (MarrowResponse) getanswermap.invoke(obj);
    }

    @Override // kotlin.maybeNotifyPrimaryTrackFormatChanged
    public final accessgetEmptyStatecp<MarrowResponse<Subscription[]>> IconCompatParcelizer(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        accessgetEmptyStatecp<ApiResponse<Subscription[]>> accessgetemptystatecpWrite = this.IconCompatParcelizer.write(str);
        final getAnswerMap getanswermap = new getAnswerMap() { // from class: o.getChunkSource
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return resetSampleQueues.AudioAttributesCompatParcelizer((ApiResponse) obj);
            }
        };
        accessgetEmptyStatecp accessgetemptystatecpRemoteActionCompatParcelizer = accessgetemptystatecpWrite.RemoteActionCompatParcelizer(new getSubjectTitle() { // from class: o.isMediaChunk
            @Override // kotlin.getSubjectTitle
            public final Object apply(Object obj) {
                return resetSampleQueues.write(getanswermap, obj);
            }
        });
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(accessgetemptystatecpRemoteActionCompatParcelizer, "");
        return accessgetemptystatecpRemoteActionCompatParcelizer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MarrowResponse RemoteActionCompatParcelizer(getAnswerMap getanswermap, Object obj) {
        toMagicModuleMetaRepoModel.write(obj, "");
        return (MarrowResponse) getanswermap.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MarrowResponse read(ApiResponse apiResponse) {
        toMagicModuleMetaRepoModel.write(apiResponse, "");
        return ResponseExtensionsKt.asMarrowResponse(apiResponse);
    }

    @Override // kotlin.maybeNotifyPrimaryTrackFormatChanged
    public final accessgetEmptyStatecp<MarrowResponse<PaymentStatusResponse>> AudioAttributesCompatParcelizer(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        accessgetEmptyStatecp<ApiResponse<PaymentStatusResponse>> accessgetemptystatecpIconCompatParcelizer = this.IconCompatParcelizer.IconCompatParcelizer(str);
        final getAnswerMap getanswermap = new getAnswerMap() { // from class: o.primarySampleIndexToMediaChunkIndex
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return resetSampleQueues.read((ApiResponse) obj);
            }
        };
        accessgetEmptyStatecp accessgetemptystatecpRemoteActionCompatParcelizer = accessgetemptystatecpIconCompatParcelizer.RemoteActionCompatParcelizer(new getSubjectTitle() { // from class: o.ChunkSource
            @Override // kotlin.getSubjectTitle
            public final Object apply(Object obj) {
                return resetSampleQueues.RemoteActionCompatParcelizer(getanswermap, obj);
            }
        });
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(accessgetemptystatecpRemoteActionCompatParcelizer, "");
        return accessgetemptystatecpRemoteActionCompatParcelizer;
    }
}
