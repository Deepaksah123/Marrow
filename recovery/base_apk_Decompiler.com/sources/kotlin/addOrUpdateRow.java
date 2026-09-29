package kotlin;

import com.marrow.data.api.models.request.payment.CreateOrderRequest;
import com.marrow.data.api.models.response.payment.CreateOrderResponse;
import com.marrow.data.api.models.response.payment.PaymentStatusResponse;
import dagger.Lazy;

/* JADX INFO: loaded from: classes3.dex */
public final class addOrUpdateRow implements initializeTable {
    private final Lazy<store> read;

    @setSdkPayload
    public addOrUpdateRow(Lazy<store> lazy) {
        toMagicModuleMetaRepoModel.write(lazy, "");
        this.read = lazy;
    }

    private final store AudioAttributesCompatParcelizer() {
        store storeVar = this.read.get();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(storeVar, "");
        return storeVar;
    }

    @Override // kotlin.initializeTable
    public final Object read(CreateOrderRequest createOrderRequest, SampleVideos<? super CreateOrderResponse> sampleVideos) {
        return AudioAttributesCompatParcelizer().IconCompatParcelizer(createOrderRequest, sampleVideos);
    }

    @Override // kotlin.initializeTable
    public final Object write(String str, SampleVideos<? super PaymentStatusResponse> sampleVideos) {
        return AudioAttributesCompatParcelizer().RemoteActionCompatParcelizer(str, sampleVideos);
    }
}
