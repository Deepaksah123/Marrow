package kotlin;

import android.graphics.Bitmap;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import kotlin.DrmSessionEventListenerEventDispatcherExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes2.dex */
public final class DrmSessionEventListenerEventDispatcherExternalSyntheticLambda4 extends WebChromeClient {
    private DrmSessionEventListenerEventDispatcherExternalSyntheticLambda5 IconCompatParcelizer;

    private DrmSessionEventListenerEventDispatcherExternalSyntheticLambda5 RemoteActionCompatParcelizer() {
        DrmSessionEventListenerEventDispatcherExternalSyntheticLambda5 drmSessionEventListenerEventDispatcherExternalSyntheticLambda5 = this.IconCompatParcelizer;
        if (drmSessionEventListenerEventDispatcherExternalSyntheticLambda5 != null) {
            return drmSessionEventListenerEventDispatcherExternalSyntheticLambda5;
        }
        toMagicModuleMetaRepoModel.IconCompatParcelizer("");
        return null;
    }

    public final void write(DrmSessionEventListenerEventDispatcherExternalSyntheticLambda5 drmSessionEventListenerEventDispatcherExternalSyntheticLambda5) {
        toMagicModuleMetaRepoModel.write(drmSessionEventListenerEventDispatcherExternalSyntheticLambda5, "");
        this.IconCompatParcelizer = drmSessionEventListenerEventDispatcherExternalSyntheticLambda5;
    }

    @Override // android.webkit.WebChromeClient
    public final void onReceivedTitle(WebView webView, String str) {
        super.onReceivedTitle(webView, str);
        RemoteActionCompatParcelizer().read(str);
    }

    @Override // android.webkit.WebChromeClient
    public final void onReceivedIcon(WebView webView, Bitmap bitmap) {
        super.onReceivedIcon(webView, bitmap);
        RemoteActionCompatParcelizer().RemoteActionCompatParcelizer(bitmap);
    }

    @Override // android.webkit.WebChromeClient
    public final void onProgressChanged(WebView webView, int i) {
        super.onProgressChanged(webView, i);
        if (RemoteActionCompatParcelizer().read() instanceof DrmSessionEventListenerEventDispatcherExternalSyntheticLambda0.write) {
            return;
        }
        RemoteActionCompatParcelizer().write(new DrmSessionEventListenerEventDispatcherExternalSyntheticLambda0.IconCompatParcelizer(i / 100.0f));
    }
}
