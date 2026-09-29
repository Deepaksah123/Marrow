package kotlin;

import com.marrow.data.api.models.response.ApiResponse;
import com.marrow.data.api.models.response.payment.PaymentStatusResponse;
import com.marrow.data.api.models.response.user.SyncUserResponse;
import com.marrow.data.models.plan.Subscription;
import in.juspay.hypersdk.core.PaymentConstants;

/* JADX INFO: loaded from: classes3.dex */
public interface logErrorMessage {
    @setMcqTimingDetails(read = "subscription")
    SearchTextResponseBody<ApiResponse<Subscription[]>> AudioAttributesCompatParcelizer();

    @setMcqTimingDetails(read = "payment/i/payment_status")
    accessgetEmptyStatecp<ApiResponse<PaymentStatusResponse>> IconCompatParcelizer(@RankPairModel(read = PaymentConstants.ORDER_ID) String str);

    @setMcqTimingDetails(read = "user/{id}?subs=1&rf=1")
    SearchTextResponseBody<ApiResponse<SyncUserResponse>> read(@setRankRange(IconCompatParcelizer = "id") String str);

    @setMcqTimingDetails(read = "subscription")
    accessgetEmptyStatecp<ApiResponse<Subscription[]>> write(@RankPairModel(read = "payment_ref_id") String str);
}
