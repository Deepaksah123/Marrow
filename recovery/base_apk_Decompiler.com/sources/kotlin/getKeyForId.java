package kotlin;

import com.marrow.data.api.models.request.payment.CreateOrderRequest;
import com.marrow.data.api.models.response.payment.CreateOrderResponse;
import com.marrow.data.api.models.response.payment.PaymentStatusResponse;
import com.marrow2.core.network.model.NetworkApiResponse;
import in.juspay.hypersdk.core.PaymentConstants;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\bH§@¢\u0006\u0004\b\n\u0010\u000bÀ\u0006\u0003"}, d2 = {"Lo/getKeyForId;", "", "Lcom/marrow/data/api/models/request/payment/CreateOrderRequest;", "p0", "Lcom/marrow2/core/network/model/NetworkApiResponse;", "Lcom/marrow/data/api/models/response/payment/CreateOrderResponse;", "read", "(Lcom/marrow/data/api/models/request/payment/CreateOrderRequest;Lo/SampleVideos;)Ljava/lang/Object;", "", "Lcom/marrow/data/api/models/response/payment/PaymentStatusResponse;", "AudioAttributesCompatParcelizer", "(Ljava/lang/String;Lo/SampleVideos;)Ljava/lang/Object;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface getKeyForId {
    @setMcqTimingDetails(read = "payment/i/payment_status")
    Object AudioAttributesCompatParcelizer(@RankPairModel(read = PaymentConstants.ORDER_ID) String str, SampleVideos<? super NetworkApiResponse<PaymentStatusResponse>> sampleVideos);

    @getReviewTimeMs(read = "payment/i/payment_order_v2")
    Object read(@getTimeTook CreateOrderRequest createOrderRequest, SampleVideos<? super NetworkApiResponse<CreateOrderResponse>> sampleVideos);
}
