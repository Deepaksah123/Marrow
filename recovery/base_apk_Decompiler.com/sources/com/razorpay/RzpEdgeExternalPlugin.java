package com.razorpay;

import android.app.Activity;
import android.content.Intent;
import android.webkit.WebView;
import com.marrow.data.models.common.CourseConfigKeyConstantsKt;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J'\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H&¢\u0006\u0004\b\b\u0010\tJ)\u0010\f\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\n2\b\u0010\u0006\u001a\u0004\u0018\u00010\u000bH&¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0007H&¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0007H&¢\u0006\u0004\b\u0010\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0011H&¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0001H&¢\u0006\u0004\b\u0012\u0010\u0014"}, d2 = {"Lcom/razorpay/RzpEdgeExternalPlugin;", "", "Landroid/app/Activity;", "p0", "", "p1", "p2", "", "initEdge", "(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)V", "", "Landroid/content/Intent;", "onActivityResultReceived", "(IILandroid/content/Intent;)V", "onPageFinished", "()V", CourseConfigKeyConstantsKt.KEY_RESET, "Landroid/webkit/WebView;", "startSmsListener", "(Landroid/webkit/WebView;)V", "(Ljava/lang/Object;)V"}, k = 1, mv = {1, 6, 0}, xi = 48)
public interface RzpEdgeExternalPlugin {
    void initEdge(Activity p0, String p1, String p2);

    void onActivityResultReceived(int p0, int p1, Intent p2);

    void onPageFinished();

    void reset();

    void startSmsListener(WebView p0);

    void startSmsListener(Object p0);
}
