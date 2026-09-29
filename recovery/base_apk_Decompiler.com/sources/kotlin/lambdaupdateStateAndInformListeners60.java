package kotlin;

import android.net.Uri;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
public final class lambdaupdateStateAndInformListeners60 extends WebViewClient {
    private final WeakReference<SimpleBasePlayerExternalSyntheticLambda14> RemoteActionCompatParcelizer;

    public lambdaupdateStateAndInformListeners60(SimpleBasePlayerExternalSyntheticLambda14 simpleBasePlayerExternalSyntheticLambda14) {
        toMagicModuleMetaRepoModel.write(simpleBasePlayerExternalSyntheticLambda14, "");
        this.RemoteActionCompatParcelizer = new WeakReference<>(simpleBasePlayerExternalSyntheticLambda14);
    }

    @Override // android.webkit.WebViewClient
    @getRenewGrpId
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) throws UnsupportedEncodingException {
        toMagicModuleMetaRepoModel.write(webView, "");
        toMagicModuleMetaRepoModel.write(str, "");
        SimpleBasePlayerExternalSyntheticLambda14 simpleBasePlayerExternalSyntheticLambda14 = this.RemoteActionCompatParcelizer.get();
        if (simpleBasePlayerExternalSyntheticLambda14 != null) {
            simpleBasePlayerExternalSyntheticLambda14.write(str);
            return true;
        }
        RendererWakeupListener.MediaMetadataCompat();
        return true;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) throws UnsupportedEncodingException {
        String string;
        toMagicModuleMetaRepoModel.write(webView, "");
        toMagicModuleMetaRepoModel.write(webResourceRequest, "");
        Uri url = webResourceRequest.getUrl();
        if (url != null && (string = url.toString()) != null) {
            SimpleBasePlayerExternalSyntheticLambda14 simpleBasePlayerExternalSyntheticLambda14 = this.RemoteActionCompatParcelizer.get();
            if (simpleBasePlayerExternalSyntheticLambda14 != null) {
                simpleBasePlayerExternalSyntheticLambda14.write(string);
                return true;
            }
            RendererWakeupListener.MediaMetadataCompat();
            return true;
        }
        RendererWakeupListener.MediaMetadataCompat();
        return true;
    }
}
