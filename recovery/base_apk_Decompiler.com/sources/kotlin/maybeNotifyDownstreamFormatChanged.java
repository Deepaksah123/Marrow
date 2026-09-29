package kotlin;

import com.marrow.data.api.models.MarrowResponse;
import com.marrow.data.api.models.request.payment.CreateOrderRequest;
import com.marrow.data.api.models.response.ApiResponse;
import com.marrow.data.api.models.response.payment.CreateOrderResponse;
import com.marrow.data.api.models.response.payment.PaymentStatusResponse;
import com.marrow.data.api.models.response.plan.Coupon;
import com.marrow.data.api.models.response.plan.UpgradeCardContent;
import com.marrow.data.api.models.response.plan.UpgradePlanResponse;
import com.marrow.data.api.models.response.plan.UpgradePlanResponseV2;
import com.marrow.data.models.plan.Plan;
import com.marrow.data.models.plan.PlanList;
import com.marrow.data.models.plan.PlanMetaDataResponse;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class maybeNotifyDownstreamFormatChanged implements isUnused {
    private getStreamPositionUsForContent read;
    private setTrackId write;

    @setSdkPayload
    public maybeNotifyDownstreamFormatChanged(setTrackId settrackid, getStreamPositionUsForContent getstreampositionusforcontent) {
        this.write = settrackid;
        this.read = getstreampositionusforcontent;
    }

    private accessgetEmptyStatecp<ApiResponse<Plan[]>> read() {
        return this.write.read();
    }

    private accessgetEmptyStatecp<ApiResponse<Coupon[]>> IconCompatParcelizer(int i, int i2) {
        return this.write.write(i, i2);
    }

    @Override // kotlin.isUnused
    public final accessgetEmptyStatecp<MarrowResponse<Coupon>> RemoteActionCompatParcelizer(String str) {
        return this.write.write(str, 1).RemoteActionCompatParcelizer(new withSkippedAd()).read(new withResetAdGroup());
    }

    @Override // kotlin.isUnused
    public final accessgetEmptyStatecp<MarrowResponse<Coupon>> IconCompatParcelizer(String str, String str2) {
        return this.write.write(str, str2).RemoteActionCompatParcelizer(new withSkippedAd()).read(new withResetAdGroup());
    }

    @Override // kotlin.isUnused
    public final accessgetEmptyStatecp<PlanList> write(final boolean z) {
        final int i = 1;
        return read().write(new getSubjectTitle(z, i) { // from class: o.onLoadFinished
            private /* synthetic */ boolean IconCompatParcelizer;
            private /* synthetic */ int RemoteActionCompatParcelizer = 1;

            @Override // kotlin.getSubjectTitle
            public final Object apply(Object obj) {
                return this.AudioAttributesCompatParcelizer.read(this.IconCompatParcelizer, this.RemoteActionCompatParcelizer, (ApiResponse) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ SchemaCompletionStatusRSModel read(boolean z, int i, ApiResponse apiResponse) throws Exception {
        final Plan[] planArr = (Plan[]) apiResponse.data.data;
        return IconCompatParcelizer(z ? 1 : 0, i).RemoteActionCompatParcelizer(new getSubjectTitle() { // from class: o.addAdGroupToAdPlaybackState
            @Override // kotlin.getSubjectTitle
            public final Object apply(Object obj) {
                return maybeNotifyDownstreamFormatChanged.RemoteActionCompatParcelizer(planArr, (ApiResponse) obj);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ PlanList RemoteActionCompatParcelizer(Plan[] planArr, ApiResponse apiResponse) throws Exception {
        return new PlanList(planArr, (apiResponse == null || apiResponse.data == null) ? null : (Coupon) PlayerEmsgHandlerPlayerTrackEmsgHandler.read((Coupon[]) apiResponse.data.data));
    }

    @Override // kotlin.isUnused
    public final accessgetEmptyStatecp<ApiResponse<UpgradePlanResponse>> AudioAttributesCompatParcelizer() {
        return this.write.IconCompatParcelizer();
    }

    @Override // kotlin.isUnused
    public final accessgetEmptyStatecp<MarrowResponse<UpgradePlanResponseV2>> IconCompatParcelizer() {
        return this.write.write(this.read.onRemoveQueueItem()).RemoteActionCompatParcelizer(new withSkippedAd());
    }

    @Override // kotlin.isUnused
    public final accessgetEmptyStatecp<MarrowResponse<UpgradePlanResponseV2>> write() {
        return this.write.AudioAttributesCompatParcelizer(this.read.onRemoveQueueItem(), 1, "www.marrow.com").RemoteActionCompatParcelizer(new withSkippedAd());
    }

    @Override // kotlin.isUnused
    public final accessgetEmptyStatecp<MarrowResponse<List<UpgradeCardContent>>> RemoteActionCompatParcelizer() {
        return this.write.read(this.read.onRemoveQueueItem()).RemoteActionCompatParcelizer(new withSkippedAd());
    }

    @Override // kotlin.isUnused
    public final LessonDynamicResponseBody<MarrowResponse<CreateOrderResponse>> IconCompatParcelizer(CreateOrderRequest createOrderRequest) {
        return this.write.RemoteActionCompatParcelizer(createOrderRequest).read(new withSkippedAd());
    }

    @Override // kotlin.isUnused
    public final LessonDynamicResponseBody<MarrowResponse<PlanMetaDataResponse>> write(String str) {
        return this.write.read(str).read(new withSkippedAd());
    }

    @Override // kotlin.isUnused
    public final accessgetEmptyStatecp<MarrowResponse<PaymentStatusResponse>> AudioAttributesCompatParcelizer(String str) {
        return this.write.RemoteActionCompatParcelizer(str).RemoteActionCompatParcelizer(new withSkippedAd());
    }
}
