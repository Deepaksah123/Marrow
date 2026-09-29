package com.razorpay;

import android.app.Activity;
import android.content.Context;
import in.juspay.hyper.constants.LogCategory;
import java.util.HashMap;
import java.util.Map;
import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.Metadata;
import kotlin.TestGroupLSModel;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b¨\u0006\t"}, d2 = {"Lcom/razorpay/UpiTurboCheckout$Companion;", "", "()V", "initTurboSdk", "", LogCategory.CONTEXT, "Landroid/content/Context;", "customerMobile", "", "checkout_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class _O_$oo$O$$$__o0Oo {
    private _O_$oo$O$$$__o0Oo() {
    }

    public final void initTurboSdk(Context context, String customerMobile) {
        Class<?> clsLoadClass;
        toMagicModuleMetaRepoModel.write(context, "");
        HashMap<String, String> allPluginsFromManifest = BaseUtils.getAllPluginsFromManifest(context);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(allPluginsFromManifest, "");
        for (Map.Entry<String, String> entry : allPluginsFromManifest.entrySet()) {
            String key = entry.getKey();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(key, "");
            if (TestGroupLSModel.write((CharSequence) key, (CharSequence) "upi_turbo", false)) {
                ClassLoader classLoader = RzpTurboExternalPlugin.class.getClassLoader();
                Object objNewInstance = (classLoader == null || (clsLoadClass = classLoader.loadClass(entry.getValue())) == null) ? null : clsLoadClass.newInstance();
                if (objNewInstance == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.razorpay.RzpTurboExternalPlugin");
                }
                ((RzpTurboExternalPlugin) objNewInstance).preloadUpiAccountsCheckout((Activity) context, customerMobile, null);
            }
        }
    }

    public /* synthetic */ _O_$oo$O$$$__o0Oo(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this();
    }
}
