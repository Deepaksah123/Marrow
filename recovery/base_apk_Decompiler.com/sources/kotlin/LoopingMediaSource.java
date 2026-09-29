package kotlin;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.ConsoleMessage;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.hcaptcha.sdk.HCaptchaConfig;
import com.hcaptcha.sdk.HCaptchaWebView;
import org.apache.commons.compress.utils.CharsetNames;

/* JADX INFO: loaded from: classes3.dex */
final class LoopingMediaSource {
    private final getPreparePositionWithOverride AudioAttributesCompatParcelizer;
    private final HCaptchaWebView IconCompatParcelizer;
    private final Context RemoteActionCompatParcelizer;
    private final LoopingMediaSourceInfinitelyLoopingTimeline read;
    private final HCaptchaConfig write;

    public static class AudioAttributesCompatParcelizer extends WebChromeClient {
        public /* synthetic */ AudioAttributesCompatParcelizer(byte b) {
            this();
        }

        private AudioAttributesCompatParcelizer() {
        }

        @Override // android.webkit.WebChromeClient
        public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
            consoleMessage.message();
            return true;
        }

        @Override // android.webkit.WebChromeClient
        public final void onProgressChanged(WebView webView, int i) {
            new Object[]{Integer.valueOf(i)};
        }
    }

    public class write extends WebViewClient {
        private final Handler IconCompatParcelizer;

        public write(Handler handler) {
            if (handler == null) {
                throw new NullPointerException("handler is marked non-null but is null");
            }
            this.IconCompatParcelizer = handler;
        }

        final /* synthetic */ void RemoteActionCompatParcelizer(Uri uri) {
            LoopingMediaSource.this.IconCompatParcelizer.removeJavascriptInterface("JSInterface");
            LoopingMediaSource.this.IconCompatParcelizer.removeJavascriptInterface("JSDI");
            getPreparePositionWithOverride getpreparepositionwithoverride = LoopingMediaSource.this.AudioAttributesCompatParcelizer;
            DefaultMediaSourceFactoryDelegateFactoryLoaderExternalSyntheticLambda4 defaultMediaSourceFactoryDelegateFactoryLoaderExternalSyntheticLambda4 = DefaultMediaSourceFactoryDelegateFactoryLoaderExternalSyntheticLambda4.INSECURE_HTTP_REQUEST_ERROR;
            StringBuilder sb = new StringBuilder("Insecure resource ");
            sb.append(uri);
            sb.append(" requested");
            getpreparepositionwithoverride.RemoteActionCompatParcelizer(new FilteringMediaSourceFilteringMediaPeriod(defaultMediaSourceFactoryDelegateFactoryLoaderExternalSyntheticLambda4, sb.toString()));
        }

        private static String write(String str) {
            StringBuilder sb = new StringBuilder();
            sb.append(str.split("[?#]")[0]);
            sb.append("...");
            return sb.toString();
        }

        @Override // android.webkit.WebViewClient
        public final void onLoadResource(WebView webView, String str) {
            write(str);
        }

        @Override // android.webkit.WebViewClient
        public final void onPageFinished(WebView webView, String str) {
            write(str);
        }

        @Override // android.webkit.WebViewClient
        public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            write(str);
        }

        @Override // android.webkit.WebViewClient
        public final void onReceivedError(WebView webView, int i, String str, String str2) {
            super.onReceivedError(webView, i, str, str2);
            new Object[]{str, Integer.valueOf(i)};
        }

        @Override // android.webkit.WebViewClient
        public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
            final Uri url = webResourceRequest.getUrl();
            if (url != null && url.getScheme() != null && url.getScheme().equals("http")) {
                this.IconCompatParcelizer.post(new Runnable() { // from class: o.getNewId
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.IconCompatParcelizer.RemoteActionCompatParcelizer(url);
                    }
                });
            }
            return super.shouldInterceptRequest(webView, webResourceRequest);
        }
    }

    public LoopingMediaSource(Handler handler, Context context, HCaptchaConfig hCaptchaConfig, IcyDataSource icyDataSource, getPreparePositionWithOverride getpreparepositionwithoverride, HCaptchaWebView hCaptchaWebView) {
        if (context == null) {
            throw new NullPointerException("context is marked non-null but is null");
        }
        if (hCaptchaConfig == null) {
            throw new NullPointerException("config is marked non-null but is null");
        }
        if (icyDataSource == null) {
            throw new NullPointerException("internalConfig is marked non-null but is null");
        }
        if (hCaptchaWebView == null) {
            throw new NullPointerException("webView is marked non-null but is null");
        }
        this.RemoteActionCompatParcelizer = context;
        this.write = hCaptchaConfig;
        this.AudioAttributesCompatParcelizer = getpreparepositionwithoverride;
        this.IconCompatParcelizer = hCaptchaWebView;
        this.read = icyDataSource.read();
        RemoteActionCompatParcelizer(handler);
    }

    private void RemoteActionCompatParcelizer(Handler handler) {
        if (handler == null) {
            throw new NullPointerException("handler is marked non-null but is null");
        }
        ForwardingTimeline forwardingTimeline = new ForwardingTimeline(handler, this.write, this.AudioAttributesCompatParcelizer);
        DefaultMediaSourceFactoryDelegateFactoryLoaderExternalSyntheticLambda2 defaultMediaSourceFactoryDelegateFactoryLoaderExternalSyntheticLambda2 = new DefaultMediaSourceFactoryDelegateFactoryLoaderExternalSyntheticLambda2(this.RemoteActionCompatParcelizer);
        WebSettings settings = this.IconCompatParcelizer.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setLoadWithOverviewMode(true);
        settings.setCacheMode(-1);
        byte b = 0;
        settings.setGeolocationEnabled(false);
        settings.setAllowFileAccess(false);
        settings.setAllowContentAccess(false);
        this.IconCompatParcelizer.setWebViewClient(new write(handler));
        if (onIcyMetadata.AudioAttributesCompatParcelizer) {
            this.IconCompatParcelizer.setWebChromeClient(new AudioAttributesCompatParcelizer(b));
        }
        this.IconCompatParcelizer.setBackgroundColor(0);
        if (this.write.getDisableHardwareAcceleration().booleanValue()) {
            this.IconCompatParcelizer.setLayerType(1, null);
        }
        this.IconCompatParcelizer.addJavascriptInterface(forwardingTimeline, "JSInterface");
        this.IconCompatParcelizer.addJavascriptInterface(defaultMediaSourceFactoryDelegateFactoryLoaderExternalSyntheticLambda2, "JSDI");
        this.IconCompatParcelizer.loadDataWithBaseURL(this.write.getHost(), this.read.read(), "text/html", CharsetNames.UTF_8, null);
        new Object[]{Boolean.valueOf(this.IconCompatParcelizer.isHardwareAccelerated())};
    }

    public final void read() {
        this.IconCompatParcelizer.removeJavascriptInterface("JSInterface");
        this.IconCompatParcelizer.removeJavascriptInterface("JSDI");
        ViewParent parent = this.IconCompatParcelizer.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.IconCompatParcelizer);
        }
        this.IconCompatParcelizer.destroy();
    }

    public final HCaptchaConfig RemoteActionCompatParcelizer() {
        return this.write;
    }

    public final HCaptchaWebView write() {
        return this.IconCompatParcelizer;
    }

    public final void AudioAttributesCompatParcelizer() {
        if (this.IconCompatParcelizer.IconCompatParcelizer()) {
            return;
        }
        this.IconCompatParcelizer.loadUrl("javascript:reset();");
    }

    public final void IconCompatParcelizer() {
        this.IconCompatParcelizer.loadUrl("javascript:resetAndExecute();");
    }

    public final boolean IconCompatParcelizer(FilteringMediaSourceFilteringMediaPeriod filteringMediaSourceFilteringMediaPeriod) {
        return this.write.getRetryPredicate().IconCompatParcelizer(this.write, filteringMediaSourceFilteringMediaPeriod);
    }
}
