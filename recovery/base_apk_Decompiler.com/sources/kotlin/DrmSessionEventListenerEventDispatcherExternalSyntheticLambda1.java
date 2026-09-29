package kotlin;

import android.graphics.Bitmap;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.DrmSessionEventListenerEventDispatcherExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes2.dex */
public class DrmSessionEventListenerEventDispatcherExternalSyntheticLambda1 extends WebViewClient {
    private DrmSessionEventListenerEventDispatcherExternalSyntheticLambda5 AudioAttributesCompatParcelizer;
    private DrmSessionManager read;

    private DrmSessionEventListenerEventDispatcherExternalSyntheticLambda5 AudioAttributesCompatParcelizer() {
        DrmSessionEventListenerEventDispatcherExternalSyntheticLambda5 drmSessionEventListenerEventDispatcherExternalSyntheticLambda5 = this.AudioAttributesCompatParcelizer;
        if (drmSessionEventListenerEventDispatcherExternalSyntheticLambda5 != null) {
            return drmSessionEventListenerEventDispatcherExternalSyntheticLambda5;
        }
        toMagicModuleMetaRepoModel.IconCompatParcelizer("");
        return null;
    }

    public final void AudioAttributesCompatParcelizer(DrmSessionEventListenerEventDispatcherExternalSyntheticLambda5 drmSessionEventListenerEventDispatcherExternalSyntheticLambda5) {
        toMagicModuleMetaRepoModel.write(drmSessionEventListenerEventDispatcherExternalSyntheticLambda5, "");
        this.AudioAttributesCompatParcelizer = drmSessionEventListenerEventDispatcherExternalSyntheticLambda5;
    }

    private DrmSessionManager RemoteActionCompatParcelizer() {
        DrmSessionManager drmSessionManager = this.read;
        if (drmSessionManager != null) {
            return drmSessionManager;
        }
        toMagicModuleMetaRepoModel.IconCompatParcelizer("");
        return null;
    }

    public final void read(DrmSessionManager drmSessionManager) {
        toMagicModuleMetaRepoModel.write(drmSessionManager, "");
        this.read = drmSessionManager;
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        AudioAttributesCompatParcelizer().write(new DrmSessionEventListenerEventDispatcherExternalSyntheticLambda0.IconCompatParcelizer(BitmapDescriptorFactory.HUE_RED));
        AudioAttributesCompatParcelizer().write().clear();
        AudioAttributesCompatParcelizer().read(null);
        AudioAttributesCompatParcelizer().RemoteActionCompatParcelizer((Bitmap) null);
        AudioAttributesCompatParcelizer().RemoteActionCompatParcelizer(str);
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        AudioAttributesCompatParcelizer().write(DrmSessionEventListenerEventDispatcherExternalSyntheticLambda0.write.INSTANCE);
    }

    @Override // android.webkit.WebViewClient
    public void doUpdateVisitedHistory(WebView webView, String str, boolean z) {
        super.doUpdateVisitedHistory(webView, str, z);
        RemoteActionCompatParcelizer().RemoteActionCompatParcelizer(webView != null ? webView.canGoBack() : false);
        RemoteActionCompatParcelizer().AudioAttributesCompatParcelizer(webView != null ? webView.canGoForward() : false);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        if (webResourceError != null) {
            AudioAttributesCompatParcelizer().write().add(new DrmSessionEventListenerEventDispatcherListenerAndHandler(webResourceRequest, webResourceError));
        }
    }
}
