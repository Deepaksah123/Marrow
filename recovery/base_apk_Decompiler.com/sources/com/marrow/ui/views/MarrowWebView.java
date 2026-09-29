package com.marrow.ui.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.marrow.ui.views.MarrowWebView;
import kotlin.Metadata;
import kotlin.TestGroupLSModel;
import kotlin.buildResolutionString;
import kotlin.joinWithSeparator;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u0000 \u00102\u00020\u0001:\u0002\u001a\u0010B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u00122\b\u0010\u0007\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J/\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0013H\u0014¢\u0006\u0004\b\u0017\u0010\u0018R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0019"}, d2 = {"Lcom/marrow/ui/views/MarrowWebView;", "Landroid/webkit/WebView;", "Landroid/content/Context;", "p0", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "p1", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "p2", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lcom/marrow/ui/views/MarrowWebView$RemoteActionCompatParcelizer;", "", "setHtmlLoadListener", "(Lcom/marrow/ui/views/MarrowWebView$RemoteActionCompatParcelizer;)V", "read", "()V", "", "", "AudioAttributesCompatParcelizer", "(Ljava/lang/String;Ljava/lang/String;)Z", "p3", "onOverScrolled", "(IIZZ)V", "Lcom/marrow/ui/views/MarrowWebView$RemoteActionCompatParcelizer;", "RemoteActionCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class MarrowWebView extends WebView {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private RemoteActionCompatParcelizer RemoteActionCompatParcelizer;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\bf\u0018\u00002\u00020\u0001À\u0006\u0003"}, d2 = {"Lcom/marrow/ui/views/MarrowWebView$RemoteActionCompatParcelizer;", ""}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface RemoteActionCompatParcelizer {
    }

    public static /* synthetic */ boolean RemoteActionCompatParcelizer() {
        return true;
    }

    public static final /* synthetic */ boolean RemoteActionCompatParcelizer(MarrowWebView marrowWebView, String str) {
        return marrowWebView.AudioAttributesCompatParcelizer(str, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarrowWebView(Context context) {
        super(context);
        toMagicModuleMetaRepoModel.write(context, "");
        read();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarrowWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        toMagicModuleMetaRepoModel.write(context, "");
        read();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarrowWebView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        toMagicModuleMetaRepoModel.write(context, "");
        read();
    }

    public final void setHtmlLoadListener(RemoteActionCompatParcelizer p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        this.RemoteActionCompatParcelizer = p0;
    }

    private final void read() {
        setSaveEnabled(false);
        setOnLongClickListener(new View.OnLongClickListener() { // from class: o.startScrubbing
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return MarrowWebView.RemoteActionCompatParcelizer();
            }
        });
        setHapticFeedbackEnabled(false);
        getSettings().setJavaScriptEnabled(true);
        setFocusable(false);
        setFocusableInTouchMode(false);
        setBackgroundColor(0);
        getSettings().setCacheMode(2);
        setWebViewClient(new write());
    }

    public static final class write extends WebViewClient {
        write() {
        }

        @Override // android.webkit.WebViewClient
        public final void onPageFinished(WebView webView, String str) {
            toMagicModuleMetaRepoModel.write(webView, "");
            toMagicModuleMetaRepoModel.write(str, "");
            super.onPageFinished(webView, str);
            if (TestGroupLSModel.MediaBrowserCompatCustomActionResultReceiver(str, "file:///android_asset/#") || MarrowWebView.this.RemoteActionCompatParcelizer == null) {
                return;
            }
        }

        @Override // android.webkit.WebViewClient
        public final void onReceivedError(WebView webView, int i, String str, String str2) {
            toMagicModuleMetaRepoModel.write(webView, "");
            toMagicModuleMetaRepoModel.write(str, "");
            toMagicModuleMetaRepoModel.write(str2, "");
            buildResolutionString.IconCompatParcelizer(getClass(), "onReceivedError(%d, %s, %s", Integer.valueOf(i), str, str2);
        }

        @Override // android.webkit.WebViewClient
        public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            toMagicModuleMetaRepoModel.write(webView, "");
            toMagicModuleMetaRepoModel.write(webResourceRequest, "");
            return MarrowWebView.RemoteActionCompatParcelizer(MarrowWebView.this, webResourceRequest.toString());
        }
    }

    private final boolean AudioAttributesCompatParcelizer(String p0, String p1) {
        return joinWithSeparator.write(getContext(), p0);
    }

    @Override // android.webkit.WebView, android.view.View
    protected final void onOverScrolled(int p0, int p1, boolean p2, boolean p3) {
        boolean z = false;
        super.onOverScrolled(p0, 0, p2, p3);
        boolean z2 = computeHorizontalScrollRange() - (getWidth() + p0) == 0;
        boolean z3 = p0 == 0;
        if (!z2 && !z3) {
            z = true;
        }
        requestDisallowInterceptTouchEvent(z);
    }
}
