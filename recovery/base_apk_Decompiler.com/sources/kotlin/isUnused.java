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
import com.marrow.data.models.plan.PlanList;
import com.marrow.data.models.plan.PlanMetaDataResponse;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public interface isUnused {
    accessgetEmptyStatecp<ApiResponse<UpgradePlanResponse>> AudioAttributesCompatParcelizer();

    accessgetEmptyStatecp<MarrowResponse<PaymentStatusResponse>> AudioAttributesCompatParcelizer(String str);

    LessonDynamicResponseBody<MarrowResponse<CreateOrderResponse>> IconCompatParcelizer(CreateOrderRequest createOrderRequest);

    accessgetEmptyStatecp<MarrowResponse<UpgradePlanResponseV2>> IconCompatParcelizer();

    accessgetEmptyStatecp<MarrowResponse<Coupon>> IconCompatParcelizer(String str, String str2);

    accessgetEmptyStatecp<MarrowResponse<List<UpgradeCardContent>>> RemoteActionCompatParcelizer();

    accessgetEmptyStatecp<MarrowResponse<Coupon>> RemoteActionCompatParcelizer(String str);

    LessonDynamicResponseBody<MarrowResponse<PlanMetaDataResponse>> write(String str);

    accessgetEmptyStatecp<MarrowResponse<UpgradePlanResponseV2>> write();

    accessgetEmptyStatecp<PlanList> write(boolean z);
}
