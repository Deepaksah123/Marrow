package in.juspay.hypersdk.data;

import android.os.Bundle;

/* JADX INFO: loaded from: classes4.dex */
public interface JuspayResponseHandler extends Runnable {
    void onError(String str);

    void onResponse(Bundle bundle);

    void onResponse(String str);
}
