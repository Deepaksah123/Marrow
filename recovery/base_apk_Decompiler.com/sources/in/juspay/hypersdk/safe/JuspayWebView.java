package in.juspay.hypersdk.safe;

import android.content.Context;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import in.juspay.hyper.core.ExecutorManager;
import in.juspay.hyper.core.JuspayLogger;

/* JADX INFO: loaded from: classes4.dex */
public class JuspayWebView extends WebView {
    private static final String LOG_TAG = "JuspayWebView";
    private Integer keyboardInputType;
    private long lastKeyboardTypeSetTime;
    private WebChromeClient webChromeClient;
    private WebViewClient webViewClient;

    public JuspayWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.keyboardInputType = null;
        this.lastKeyboardTypeSetTime = 0L;
    }

    public void addJsToWebView(final String str) {
        ExecutorManager.runOnMainThread(new Runnable() { // from class: in.juspay.hypersdk.safe.JuspayWebView$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m363lambda$addJsToWebView$0$injuspayhypersdksafeJuspayWebView(str);
            }
        });
    }

    @Override // android.webkit.WebView
    public WebChromeClient getWebChromeClient() {
        return this.webChromeClient;
    }

    @Override // android.webkit.WebView
    public WebViewClient getWebViewClient() {
        return this.webViewClient;
    }

    /* JADX INFO: renamed from: lambda$addJsToWebView$0$in-juspay-hypersdk-safe-JuspayWebView, reason: not valid java name */
    /* synthetic */ void m363lambda$addJsToWebView$0$injuspayhypersdksafeJuspayWebView(String str) {
        evaluateJavascript(str, null);
    }

    @Override // android.webkit.WebView
    public void loadData(String str, String str2, String str3) {
        super.loadData(str, str2, str3);
    }

    @Override // android.webkit.WebView
    public void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        super.loadDataWithBaseURL(str, str2, str3, str4, str5);
    }

    @Override // android.webkit.WebView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        JuspayLogger.d(LOG_TAG, "Creating input connection");
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (this.keyboardInputType != null && System.currentTimeMillis() - this.lastKeyboardTypeSetTime <= 300) {
            editorInfo.inputType = this.keyboardInputType.intValue() | editorInfo.inputType;
        }
        int i = editorInfo.inputType;
        if ((i & 1) == 1) {
            editorInfo.inputType = i | 224;
        }
        return inputConnectionOnCreateInputConnection;
    }

    public void requestNumericKeyboardShow() {
        this.keyboardInputType = 2;
        InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
        setLastKeyboardTypeSetTime();
        inputMethodManager.restartInput(this);
        inputMethodManager.showSoftInput(this, 1);
    }

    public void requestPasswordKeyboardShow() {
        this.keyboardInputType = 225;
        InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
        setLastKeyboardTypeSetTime();
        inputMethodManager.restartInput(this);
        inputMethodManager.showSoftInput(this, 1);
    }

    public void requestPhoneKeyboardShow() {
        this.keyboardInputType = 3;
        InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
        setLastKeyboardTypeSetTime();
        inputMethodManager.restartInput(this);
        inputMethodManager.showSoftInput(this, 1);
    }

    public void setDefaultWebChromeClient(WebChromeClient webChromeClient) {
        super.setWebChromeClient(webChromeClient);
    }

    public void setDefaultWebViewClient(WebViewClient webViewClient) {
        super.setWebViewClient(webViewClient);
    }

    public void setLastKeyboardTypeSetTime() {
        this.lastKeyboardTypeSetTime = System.currentTimeMillis();
    }

    @Override // android.webkit.WebView
    public void setWebChromeClient(WebChromeClient webChromeClient) {
        this.webChromeClient = webChromeClient;
        super.setWebChromeClient(webChromeClient);
    }

    @Override // android.webkit.WebView
    public void setWebViewClient(WebViewClient webViewClient) {
        this.webViewClient = webViewClient;
        super.setWebViewClient(webViewClient);
    }

    public JuspayWebView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.keyboardInputType = null;
        this.lastKeyboardTypeSetTime = 0L;
    }

    public JuspayWebView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.keyboardInputType = null;
        this.lastKeyboardTypeSetTime = 0L;
    }

    public JuspayWebView(Context context) {
        super(context);
        this.keyboardInputType = null;
        this.lastKeyboardTypeSetTime = 0L;
    }
}
