package kotlin;

import com.marrow.data.api.models.request.payment.CreateOrderRequest;
import com.marrow.data.api.models.response.ApiResponse;
import com.marrow.data.api.models.response.payment.CreateOrderResponse;
import com.marrow.data.api.models.response.payment.PaymentStatusResponse;
import com.marrow.data.api.models.response.plan.Coupon;
import com.marrow.data.api.models.response.plan.UpgradeCardContent;
import com.marrow.data.api.models.response.plan.UpgradePlanResponse;
import com.marrow.data.api.models.response.plan.UpgradePlanResponseV2;
import com.marrow.data.models.custommodule.FilterParams;
import com.marrow.data.models.plan.Plan;
import com.marrow.data.models.plan.PlanMetaDataResponse;
import in.juspay.hypersdk.core.PaymentConstants;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public interface setTrackId {
    @setMcqTimingDetails(read = "plan/i/upgrade_plans_v3")
    accessgetEmptyStatecp<ApiResponse<UpgradePlanResponseV2>> AudioAttributesCompatParcelizer(@RankPairModel(read = FilterParams.KEY_COURSE_ID) int i, @RankPairModel(read = "create_order") int i2, @RankPairModel(read = "return_url") String str);

    @setMcqTimingDetails(read = "plan/i/upgrade_plans_trigger")
    accessgetEmptyStatecp<ApiResponse<UpgradePlanResponse>> IconCompatParcelizer();

    @getReviewTimeMs(read = "payment/i/payment_order_v2")
    LessonDynamicResponseBody<ApiResponse<CreateOrderResponse>> RemoteActionCompatParcelizer(@getTimeTook CreateOrderRequest createOrderRequest);

    @setMcqTimingDetails(read = "payment/i/payment_status")
    accessgetEmptyStatecp<ApiResponse<PaymentStatusResponse>> RemoteActionCompatParcelizer(@RankPairModel(read = PaymentConstants.ORDER_ID) String str);

    @setMcqTimingDetails(read = "plan/i/metadata_v2")
    LessonDynamicResponseBody<ApiResponse<PlanMetaDataResponse>> read(@RankPairModel(read = "group_id") String str);

    @setMcqTimingDetails(read = "plan")
    accessgetEmptyStatecp<ApiResponse<Plan[]>> read();

    @setMcqTimingDetails(read = "plan/i/upgrade_plans_v3_faq")
    accessgetEmptyStatecp<ApiResponse<List<UpgradeCardContent>>> read(@RankPairModel(read = FilterParams.KEY_COURSE_ID) int i);

    @setMcqTimingDetails(read = "plan/i/upgrade_plans_v3")
    accessgetEmptyStatecp<ApiResponse<UpgradePlanResponseV2>> write(@RankPairModel(read = FilterParams.KEY_COURSE_ID) int i);

    @setMcqTimingDetails(read = "coupon")
    accessgetEmptyStatecp<ApiResponse<Coupon[]>> write(@RankPairModel(read = "rf") int i, @RankPairModel(read = "include_fallback") int i2);

    @setMcqTimingDetails(read = "coupon/{coupon_code}")
    accessgetEmptyStatecp<ApiResponse<Coupon>> write(@setRankRange(IconCompatParcelizer = "coupon_code") String str, @RankPairModel(read = "include_fallback") int i);

    @setMcqTimingDetails(read = "rf_coupon/{coupon_code}")
    accessgetEmptyStatecp<ApiResponse<Coupon>> write(@setRankRange(IconCompatParcelizer = "coupon_code") String str, @RankPairModel(read = "plan_id") String str2);
}
