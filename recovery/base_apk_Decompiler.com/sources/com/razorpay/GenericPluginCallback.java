package com.razorpay;

import kotlin.Metadata;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0001H&¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/razorpay/GenericPluginCallback;", "", "Lorg/json/JSONObject;", "p0", "", "onError", "(Lorg/json/JSONObject;)V", "onSuccess", "(Ljava/lang/Object;)V"}, k = 1, mv = {1, 6, 0}, xi = 48)
public interface GenericPluginCallback {
    void onError(JSONObject p0);

    void onSuccess(Object p0);
}
