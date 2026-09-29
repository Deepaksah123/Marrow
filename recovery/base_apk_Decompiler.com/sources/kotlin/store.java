package kotlin;

import com.marrow.data.api.models.request.payment.CreateOrderRequest;
import com.marrow.data.api.models.response.payment.CreateOrderResponse;
import com.marrow.data.api.models.response.payment.PaymentStatusResponse;

/* JADX INFO: loaded from: classes3.dex */
public interface store {
    Object IconCompatParcelizer(CreateOrderRequest createOrderRequest, SampleVideos<? super CreateOrderResponse> sampleVideos);

    Object RemoteActionCompatParcelizer(String str, SampleVideos<? super PaymentStatusResponse> sampleVideos);
}
