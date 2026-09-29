package com.razorpay;

import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.getShowPopup;
import kotlin.setWebAlpha;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00010\n0\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\r\u0010\b"}, d2 = {"Lcom/razorpay/RazorpayInitializer;", "Lo/setWebAlpha;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "create", "(Landroid/content/Context;)V", "", "Ljava/lang/Class;", "dependencies", "()Ljava/util/List;", "registerWebViewWarmup"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class RazorpayInitializer implements setWebAlpha<getShowPopup> {
    public final /* bridge */ /* synthetic */ Object create(Context context) {
        m229create(context);
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: renamed from: create, reason: collision with other method in class */
    public final void m229create(final Context p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        if (Build.VERSION.SDK_INT >= 34) {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.razorpay.RazorpayInitializer$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    RazorpayInitializer.m228create$lambda0(this.f$0, p0);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: create$lambda-0, reason: not valid java name */
    public static final void m228create$lambda0(RazorpayInitializer razorpayInitializer, Context context) {
        toMagicModuleMetaRepoModel.write(razorpayInitializer, "");
        toMagicModuleMetaRepoModel.write(context, "");
        Context applicationContext = context.getApplicationContext();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(applicationContext, "");
        razorpayInitializer.registerWebViewWarmup(applicationContext);
    }

    public final List<Class<? extends setWebAlpha<?>>> dependencies() {
        return new ArrayList();
    }

    private final void registerWebViewWarmup(Context p0) {
        Application application = p0 instanceof Application ? (Application) p0 : null;
        if (application == null) {
            return;
        }
        application.registerActivityLifecycleCallbacks(new RazorpayInitializer$O$$$__o0Oo(new boolean[]{false}, application, p0, new Handler(Looper.getMainLooper())));
    }
}
