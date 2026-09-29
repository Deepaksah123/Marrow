package com.razorpay;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.C0177getRfBanners;
import kotlin.Metadata;
import kotlin.SdkPayloadData;
import kotlin.TestGroupLSModel;
import kotlin.getShowPopup;
import kotlin.setWebAlpha;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\t\u0010\bJ!\u0010\f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00010\u000b0\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000e\u0010\b"}, d2 = {"Lcom/razorpay/CoreInitializer;", "Lo/setWebAlpha;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "create", "(Landroid/content/Context;)V", "deferCoreInitUntilFirstActivity", "", "Ljava/lang/Class;", "dependencies", "()Ljava/util/List;", "initGPayInABoxIfAvailable"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class CoreInitializer implements setWebAlpha<getShowPopup> {
    public final /* bridge */ /* synthetic */ Object create(Context context) {
        m214create(context);
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: renamed from: create, reason: collision with other method in class */
    public final void m214create(Context p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        final Context applicationContext = p0.getApplicationContext();
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.razorpay.CoreInitializer$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                CoreInitializer.m212create$lambda1(this.f$0, applicationContext);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: create$lambda-1$lambda-0, reason: not valid java name */
    public static final void m213create$lambda1$lambda0(CoreInitializer coreInitializer, Context context) {
        toMagicModuleMetaRepoModel.write(coreInitializer, "");
        try {
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(context, "");
            coreInitializer.initGPayInABoxIfAvailable(context);
        } catch (Throwable th) {
            Logger.e("Error initializing GPayInABox", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: create$lambda-1, reason: not valid java name */
    public static final void m212create$lambda1(final CoreInitializer coreInitializer, final Context context) {
        toMagicModuleMetaRepoModel.write(coreInitializer, "");
        new Thread(new Runnable() { // from class: com.razorpay.CoreInitializer$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                CoreInitializer.m213create$lambda1$lambda0(this.f$0, context);
            }
        }).start();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(context, "");
        coreInitializer.deferCoreInitUntilFirstActivity(context);
    }

    public final List<Class<? extends setWebAlpha<?>>> dependencies() {
        return new ArrayList();
    }

    private final void deferCoreInitUntilFirstActivity(Context p0) {
        Application application = p0 instanceof Application ? (Application) p0 : null;
        if (application == null) {
            return;
        }
        application.registerActivityLifecycleCallbacks(new CoreInitializer$O$$$__o0Oo(new boolean[]{false}, application, p0));
    }

    private final void initGPayInABoxIfAvailable(Context p0) {
        Object next;
        String str;
        Object obj;
        Class<?> clsLoadClass;
        Constructor<?> declaredConstructor;
        Set<Map.Entry<String, String>> setEntrySet = BaseUtils.getAllPluginsFromManifest(p0).entrySet();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(setEntrySet, "");
        Iterator<T> it = setEntrySet.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            Map.Entry entry = (Map.Entry) next;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(entry, "");
            String str2 = (String) entry.getKey();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str2, "");
            if (TestGroupLSModel.write((CharSequence) str2, (CharSequence) "gpay_in_a_box", true)) {
                break;
            }
        }
        Map.Entry entry2 = (Map.Entry) next;
        if (entry2 == null || (str = (String) entry2.getValue()) == null) {
            return;
        }
        try {
            C0177getRfBanners.IconCompatParcelizer iconCompatParcelizer = C0177getRfBanners.IconCompatParcelizer;
            CoreInitializer coreInitializer = this;
            ClassLoader classLoader = RzpPlugin.class.getClassLoader();
            Object objNewInstance = (classLoader == null || (clsLoadClass = classLoader.loadClass(str)) == null || (declaredConstructor = clsLoadClass.getDeclaredConstructor(new Class[0])) == null) ? null : declaredConstructor.newInstance(new Object[0]);
            obj = C0177getRfBanners.read(objNewInstance instanceof RzpGPayInABoxExternalPlugin ? (RzpGPayInABoxExternalPlugin) objNewInstance : null);
        } catch (Throwable th) {
            C0177getRfBanners.IconCompatParcelizer iconCompatParcelizer2 = C0177getRfBanners.IconCompatParcelizer;
            obj = C0177getRfBanners.read(SdkPayloadData.write(th));
        }
        RzpGPayInABoxExternalPlugin rzpGPayInABoxExternalPlugin = (RzpGPayInABoxExternalPlugin) (C0177getRfBanners.RemoteActionCompatParcelizer(obj) ? null : obj);
        if (rzpGPayInABoxExternalPlugin != null) {
            rzpGPayInABoxExternalPlugin.initializePaymentMethods(p0);
        }
    }
}
