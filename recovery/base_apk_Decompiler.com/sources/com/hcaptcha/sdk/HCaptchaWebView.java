package com.hcaptcha.sdk;

import android.content.Context;
import android.os.Looper;
import android.util.AttributeSet;
import android.webkit.WebView;

/* JADX INFO: loaded from: classes3.dex */
public class HCaptchaWebView extends WebView {
    public HCaptchaWebView(Context context) {
        super(context);
    }

    @Override // android.view.View
    public boolean performClick() {
        return false;
    }

    public HCaptchaWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public HCaptchaWebView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public final boolean IconCompatParcelizer() {
        return getParent() == null;
    }

    @Override // android.webkit.WebView, android.view.View
    public boolean onCheckIsTextEditor() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return super.onCheckIsTextEditor();
        }
        return false;
    }
}
