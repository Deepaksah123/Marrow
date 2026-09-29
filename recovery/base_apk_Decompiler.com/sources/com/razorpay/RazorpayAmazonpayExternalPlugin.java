package com.razorpay;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import kotlin.Metadata;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0004H&¢\u0006\u0004\b\n\u0010\u000bJ1\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\u000fH&¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H&¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0003\u001a\u00020\u00152\u0006\u0010\b\u001a\u00020\u0016H&¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0003\u001a\u00020\u00152\u0006\u0010\b\u001a\u00020\u0004H&¢\u0006\u0004\b\u0018\u0010\u001aJ'\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0001H&¢\u0006\u0004\b\u001b\u0010\u001cJ'\u0010\u001e\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u001dH&¢\u0006\u0004\b\u001e\u0010\u001f"}, d2 = {"Lcom/razorpay/RazorpayAmazonpayExternalPlugin;", "", "Landroid/app/Activity;", "p0", "", "getPaymentMetadata", "(Landroid/app/Activity;)Ljava/lang/String;", "Landroid/content/Context;", "p1", "", "initialize", "(Landroid/content/Context;Ljava/lang/String;)V", "", "Landroid/content/Intent;", "p2", "Lorg/json/JSONObject;", "p3", "onActivityResult", "(IILandroid/content/Intent;Lorg/json/JSONObject;)V", "setDataForPolling", "(Ljava/lang/String;Ljava/lang/String;)V", "Landroid/webkit/WebView;", "Landroid/webkit/WebResourceRequest;", "", "shouldOverrideUrlLoading", "(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Z", "(Landroid/webkit/WebView;Ljava/lang/String;)Z", "startAuthorization", "(Ljava/lang/String;Landroid/app/Activity;Ljava/lang/Object;)V", "Lcom/razorpay/RzpInternalCallback;", "startTransaction", "(Ljava/lang/String;Landroid/app/Activity;Lcom/razorpay/RzpInternalCallback;)V"}, k = 1, mv = {1, 6, 0}, xi = 48)
public interface RazorpayAmazonpayExternalPlugin {
    String getPaymentMetadata(Activity p0);

    void initialize(Context p0, String p1);

    void onActivityResult(int p0, int p1, Intent p2, JSONObject p3);

    void setDataForPolling(String p0, String p1);

    boolean shouldOverrideUrlLoading(WebView p0, WebResourceRequest p1);

    boolean shouldOverrideUrlLoading(WebView p0, String p1);

    void startAuthorization(String p0, Activity p1, Object p2);

    void startTransaction(String p0, Activity p1, RzpInternalCallback p2);
}
