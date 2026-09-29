package kotlin;

import com.marrow.data.api.models.response.payment.CreateOrderResponse;
import com.marrow.data.api.models.response.payment.Payload;
import com.marrow.data.api.models.response.payment.SdkPayload;
import kotlin.readShort;

/* JADX INFO: loaded from: classes3.dex */
public final class readLittleEndianLong {
    public static final readShort.AudioAttributesCompatParcelizer RemoteActionCompatParcelizer(SdkPayload sdkPayload) {
        toMagicModuleMetaRepoModel.write(sdkPayload, "");
        Payload payload = sdkPayload.getPayload();
        String action = payload != null ? payload.getAction() : null;
        Payload payload2 = sdkPayload.getPayload();
        String amount = payload2 != null ? payload2.getAmount() : null;
        Payload payload3 = sdkPayload.getPayload();
        String clientId = payload3 != null ? payload3.getClientId() : null;
        Payload payload4 = sdkPayload.getPayload();
        String merchantId = payload4 != null ? payload4.getMerchantId() : null;
        Payload payload5 = sdkPayload.getPayload();
        String environment = payload5 != null ? payload5.getEnvironment() : null;
        Payload payload6 = sdkPayload.getPayload();
        String clientAuthToken = payload6 != null ? payload6.getClientAuthToken() : null;
        Payload payload7 = sdkPayload.getPayload();
        String clientAuthTokenExpiry = payload7 != null ? payload7.getClientAuthTokenExpiry() : null;
        Payload payload8 = sdkPayload.getPayload();
        String customerId = payload8 != null ? payload8.getCustomerId() : null;
        Payload payload9 = sdkPayload.getPayload();
        String currency = payload9 != null ? payload9.getCurrency() : null;
        Payload payload10 = sdkPayload.getPayload();
        String customerPhone = payload10 != null ? payload10.getCustomerPhone() : null;
        Payload payload11 = sdkPayload.getPayload();
        String customerEmail = payload11 != null ? payload11.getCustomerEmail() : null;
        Payload payload12 = sdkPayload.getPayload();
        String orderId = payload12 != null ? payload12.getOrderId() : null;
        Payload payload13 = sdkPayload.getPayload();
        return new readShort.AudioAttributesCompatParcelizer(action, amount, clientId, merchantId, environment, clientAuthToken, clientAuthTokenExpiry, customerId, currency, customerPhone, customerEmail, orderId, payload13 != null ? payload13.getDescription() : null, sdkPayload.getRequestId(), sdkPayload.getService());
    }

    public static final readShort.IconCompatParcelizer AudioAttributesCompatParcelizer(CreateOrderResponse createOrderResponse, String str, String str2, int i) {
        toMagicModuleMetaRepoModel.write(createOrderResponse, "");
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        return new readShort.IconCompatParcelizer(createOrderResponse.getAmount(), createOrderResponse.getCurrency(), createOrderResponse.getOrderId(), str, null, null, null, null, str2, i, null, null, null, null, null, null, null, null, 261360, null);
    }
}
