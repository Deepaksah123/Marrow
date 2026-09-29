package in.juspay.hypersdk.ui;

import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebViewClient;
import in.juspay.hypersdk.core.MerchantViewType;
import in.juspay.hypersdk.data.JuspayResponseHandler;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public interface HyperPaymentsCallback {
    WebViewClient createJuspaySafeWebViewClient();

    View getMerchantView(ViewGroup viewGroup, MerchantViewType merchantViewType);

    void onEvent(JSONObject jSONObject, JuspayResponseHandler juspayResponseHandler);

    void onStartWaitingDialogCreated(View view);
}
