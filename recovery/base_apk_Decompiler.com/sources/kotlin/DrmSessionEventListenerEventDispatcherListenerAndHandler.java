package kotlin;

import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;

/* JADX INFO: loaded from: classes2.dex */
public final class DrmSessionEventListenerEventDispatcherListenerAndHandler {
    private final WebResourceRequest IconCompatParcelizer;
    private final WebResourceError write;

    public DrmSessionEventListenerEventDispatcherListenerAndHandler(WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        toMagicModuleMetaRepoModel.write(webResourceError, "");
        this.IconCompatParcelizer = webResourceRequest;
        this.write = webResourceError;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DrmSessionEventListenerEventDispatcherListenerAndHandler)) {
            return false;
        }
        DrmSessionEventListenerEventDispatcherListenerAndHandler drmSessionEventListenerEventDispatcherListenerAndHandler = (DrmSessionEventListenerEventDispatcherListenerAndHandler) obj;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.IconCompatParcelizer, drmSessionEventListenerEventDispatcherListenerAndHandler.IconCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.write, drmSessionEventListenerEventDispatcherListenerAndHandler.write);
    }

    public final int hashCode() {
        WebResourceRequest webResourceRequest = this.IconCompatParcelizer;
        return ((webResourceRequest == null ? 0 : webResourceRequest.hashCode()) * 31) + this.write.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WebViewError(request=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", error=");
        sb.append(this.write);
        sb.append(')');
        return sb.toString();
    }
}
