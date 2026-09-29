package com.razorpay;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.MessageQueue;
import android.webkit.WebView;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0007H\u0016J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u000f"}, d2 = {"com/razorpay/RazorpayInitializer$registerWebViewWarmup$callbacks$1", "Landroid/app/Application$ActivityLifecycleCallbacks;", "onActivityCreated", "", "activity", "Landroid/app/Activity;", "savedInstanceState", "Landroid/os/Bundle;", "onActivityDestroyed", "onActivityPaused", "onActivityResumed", "onActivitySaveInstanceState", "outState", "onActivityStarted", "onActivityStopped", "checkout-otpelf-lib_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class RazorpayInitializer$O$$$__o0Oo implements Application.ActivityLifecycleCallbacks {
    final /* synthetic */ Context $appContext;
    final /* synthetic */ Application $application;
    final /* synthetic */ boolean[] $hasTriggered;
    final /* synthetic */ Handler $mainHandler;

    RazorpayInitializer$O$$$__o0Oo(boolean[] zArr, Application application, Context context, Handler handler) {
        this.$hasTriggered = zArr;
        this.$application = application;
        this.$appContext = context;
        this.$mainHandler = handler;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        toMagicModuleMetaRepoModel.write(activity, "");
        if ((!(activity instanceof PaymentResultListener) && !(activity instanceof PaymentResultWithDataListener)) || activity.isFinishing() || activity.isDestroyed()) {
            return;
        }
        boolean[] zArr = this.$hasTriggered;
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        if (Checkout.isPreloadTriggered) {
            this.$application.unregisterActivityLifecycleCallbacks(this);
            return;
        }
        final Context context = this.$appContext;
        final Application application = this.$application;
        final Handler handler = this.$mainHandler;
        new Thread(new Runnable() { // from class: com.razorpay.RazorpayInitializer$O$$$__o0Oo$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                RazorpayInitializer$O$$$__o0Oo.m231onActivityResumed$lambda2(context, application, this, handler);
            }
        }).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onActivityResumed$lambda-2, reason: not valid java name */
    public static final void m231onActivityResumed$lambda2(final Context context, Application application, RazorpayInitializer$O$$$__o0Oo razorpayInitializer$O$$$__o0Oo, Handler handler) {
        toMagicModuleMetaRepoModel.write(context, "");
        toMagicModuleMetaRepoModel.write(application, "");
        toMagicModuleMetaRepoModel.write(razorpayInitializer$O$$$__o0Oo, "");
        toMagicModuleMetaRepoModel.write(handler, "");
        try {
            _Oo_O_$.ensureInitialized(context);
            if (!_Oo_O_$.getInstance().isWebViewWarmupEnabled()) {
                application.unregisterActivityLifecycleCallbacks(razorpayInitializer$O$$$__o0Oo);
            } else {
                application.unregisterActivityLifecycleCallbacks(razorpayInitializer$O$$$__o0Oo);
                handler.post(new Runnable() { // from class: com.razorpay.RazorpayInitializer$O$$$__o0Oo$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        RazorpayInitializer$O$$$__o0Oo.m232onActivityResumed$lambda2$lambda1(context);
                    }
                });
            }
        } catch (Throwable th) {
            Logger.e("Error in RazorpayInitializer WebView warmup", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onActivityResumed$lambda-2$lambda-1, reason: not valid java name */
    public static final void m232onActivityResumed$lambda2$lambda1(final Context context) {
        toMagicModuleMetaRepoModel.write(context, "");
        Looper.myQueue().addIdleHandler(new MessageQueue.IdleHandler() { // from class: com.razorpay.RazorpayInitializer$O$$$__o0Oo$$ExternalSyntheticLambda0
            @Override // android.os.MessageQueue.IdleHandler
            public final boolean queueIdle() {
                return RazorpayInitializer$O$$$__o0Oo.m233onActivityResumed$lambda2$lambda1$lambda0(context);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onActivityResumed$lambda-2$lambda-1$lambda-0, reason: not valid java name */
    public static final boolean m233onActivityResumed$lambda2$lambda1$lambda0(Context context) {
        toMagicModuleMetaRepoModel.write(context, "");
        if (Checkout.isPreloadTriggered) {
            return false;
        }
        try {
            new WebView(context).destroy();
            return false;
        } catch (Throwable th) {
            Logger.e("Error creating WebView in initializer", th);
            HashMap map = new HashMap();
            map.put("webview_type", "initializer_webview");
            map.put("reason", String.valueOf(th.getMessage()));
            AnalyticsUtil.trackEvent(AnalyticsEvent.WEBVIEW_CREATION_FAILED, AnalyticsUtil.getJSONResponse(map));
            return false;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle savedInstanceState) {
        toMagicModuleMetaRepoModel.write(activity, "");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        toMagicModuleMetaRepoModel.write(activity, "");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        toMagicModuleMetaRepoModel.write(activity, "");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle outState) {
        toMagicModuleMetaRepoModel.write(activity, "");
        toMagicModuleMetaRepoModel.write(outState, "");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        toMagicModuleMetaRepoModel.write(activity, "");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        toMagicModuleMetaRepoModel.write(activity, "");
    }
}
