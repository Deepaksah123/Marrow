package com.marrow2.ui.common.composeUtilis.marrow_webview;

import android.content.Context;
import android.webkit.WebView;
import kotlin.Metadata;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J/\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0014¢\u0006\u0004\b\f\u0010\r"}, d2 = {"Lcom/marrow2/ui/common/composeUtilis/marrow_webview/CustomWebViewWrapper;", "Landroid/webkit/WebView;", "Landroid/content/Context;", "p0", "<init>", "(Landroid/content/Context;)V", "", "p1", "", "p2", "p3", "", "onOverScrolled", "(IIZZ)V"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CustomWebViewWrapper extends WebView {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomWebViewWrapper(Context context) {
        super(context);
        toMagicModuleMetaRepoModel.write(context, "");
        setSaveEnabled(false);
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
