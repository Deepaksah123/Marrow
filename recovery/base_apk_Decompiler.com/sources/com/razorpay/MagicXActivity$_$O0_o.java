package com.razorpay;

import android.content.Intent;
import android.graphics.Bitmap;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import kotlin.Metadata;
import kotlin.TestGroupLSModel;
import kotlin.getShowPopup;
import kotlin.toMagicModuleMetaRepoModel;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J&\u0010\b\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J\u001e\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016J\u001c\u0010\u000f\u001a\u00020\u00102\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016¨\u0006\u0011"}, d2 = {"com/razorpay/MagicXActivity$setWebViewClientForMagicX$1", "Landroid/webkit/WebViewClient;", "onPageFinished", "", "view", "Landroid/webkit/WebView;", "url", "", "onPageStarted", "favicon", "Landroid/graphics/Bitmap;", "shouldInterceptRequest", "Landroid/webkit/WebResourceResponse;", "request", "Landroid/webkit/WebResourceRequest;", "shouldOverrideUrlLoading", "", "checkout_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class MagicXActivity$_$O0_o extends WebViewClient {
    final /* synthetic */ MagicXActivity this$0;

    MagicXActivity$_$O0_o(MagicXActivity magicXActivity) {
        this.this$0 = magicXActivity;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView view, String url, Bitmap favicon) {
        super.onPageStarted(view, url, favicon);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView view, String url) {
        String strAccess$getStorefrontUrl$p = MagicXActivity.access$getStorefrontUrl$p(this.this$0);
        if (strAccess$getStorefrontUrl$p == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            strAccess$getStorefrontUrl$p = null;
        }
        if (TestGroupLSModel.read(strAccess$getStorefrontUrl$p, url, true)) {
            final MagicXActivity magicXActivity = this.this$0;
            magicXActivity.runOnUiThread(new Runnable() { // from class: com.razorpay.MagicXActivity$_$O0_o$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    MagicXActivity$_$O0_o.m220onPageFinished$lambda0(magicXActivity);
                }
            });
        }
        super.onPageFinished(view, url);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onPageFinished$lambda-0, reason: not valid java name */
    public static final void m220onPageFinished$lambda0(MagicXActivity magicXActivity) {
        toMagicModuleMetaRepoModel.write(magicXActivity, "");
        WebView webViewAccess$getWebView$p = MagicXActivity.access$getWebView$p(magicXActivity);
        if (webViewAccess$getWebView$p == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            webViewAccess$getWebView$p = null;
        }
        StringBuilder sb = new StringBuilder("\n                            fetch(window.Shopify.routes.root + 'cart/clear.js')\n                              .then(res => {res.json()}).then(data => {\n                                const stringifiedFormData = { 'items': ");
        JSONArray jSONArrayAccess$getItemsToBeAddedToCart$p = MagicXActivity.access$getItemsToBeAddedToCart$p(magicXActivity);
        if (jSONArrayAccess$getItemsToBeAddedToCart$p == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            jSONArrayAccess$getItemsToBeAddedToCart$p = null;
        }
        sb.append(jSONArrayAccess$getItemsToBeAddedToCart$p);
        sb.append("}\n\n\n                                fetch(window.Shopify.routes.root + 'cart/add.js', {\n                                  method: 'POST',\n                                  headers: {\n                                    'Content-Type': 'application/json'\n                                  },\n                                  body: JSON.stringify(stringifiedFormData)\n                                })\n                                .then(response => {\n                                  openRzpLogin();\n                                  return response.json();\n                                }).then(data=>{\n\n                                })\n                                .catch((error) => {\n                                  MagicXBridge.errorFromJs(JSON.stringify(error));\n                                });\n                              }).catch((error)=>{\n                                MagicXBridge.errorFromJs(JSON.stringify(error));\n                              });\n                        ");
        webViewAccess$getWebView$p.evaluateJavascript(TestGroupLSModel.write(sb.toString()), null);
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
        if (request != null) {
            request.getUrl();
        }
        return super.shouldOverrideUrlLoading(view, request);
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView view, WebResourceRequest request) {
        if (request != null) {
            MagicXActivity magicXActivity = this.this$0;
            if (MagicXActivity.access$getMagicxLoaded$p(magicXActivity)) {
                String string = request.getUrl().toString();
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
                if (TestGroupLSModel.MediaBrowserCompatCustomActionResultReceiver(string, "https://api.razorpay.com/v1/checkout/public?")) {
                    MagicXActivity.access$setMagicxLoaded$p(magicXActivity, false);
                    magicXActivity.finish();
                    return null;
                }
            }
            String string2 = request.getUrl().toString();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string2, "");
            if (TestGroupLSModel.MediaBrowserCompatCustomActionResultReceiver(string2, "https://api.razorpay.com/v1/magic/order?")) {
                MagicXActivity.access$dismissHalfTransparentPage(magicXActivity);
            }
            String string3 = request.getUrl().toString();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string3, "");
            if (TestGroupLSModel.MediaBrowserCompatCustomActionResultReceiver(string3, "https://checkout.razorpay.com/app/shopify/v1/payment/")) {
                Intent intent = new Intent();
                intent.putExtra("checkout_url", request.getUrl().toString());
                getShowPopup getshowpopup = getShowPopup.INSTANCE;
                magicXActivity.setResult(99002, intent);
                magicXActivity.finish();
                return null;
            }
            return super.shouldInterceptRequest(view, request);
        }
        return super.shouldInterceptRequest(view, request);
    }
}
