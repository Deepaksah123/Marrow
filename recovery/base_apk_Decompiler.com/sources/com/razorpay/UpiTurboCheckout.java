package com.razorpay;

import android.app.Activity;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.razorpay.RzpTurboExternalPlugin;
import java.util.HashMap;
import java.util.Map;
import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.Metadata;
import kotlin.TestGroupLSModel;
import kotlin.getRenewGrpId;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: renamed from: com.razorpay._O_$oo, reason: from Kotlin metadata */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\r\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\bJ\b\u0010\u0011\u001a\u00020\nH\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0007J\u0006\u0010\u0014\u001a\u00020\u0013J\u001a\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005J\b\u0010\u0017\u001a\u00020\u0013H\u0002J\u000e\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u0001J\"\u0010\u001a\u001a\u00020\u00132\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0016\u001a\u00020\u0001J\"\u0010\u001b\u001a\u00020\u00132\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u001c\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0016\u001a\u00020\u0001J\"\u0010\u001d\u001a\u00020\u00132\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0016\u001a\u00020\u0001J\u000e\u0010\u001e\u001a\u00020\u00132\u0006\u0010\u0004\u001a\u00020\u0005R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082.¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/razorpay/UpiTurboCheckout;", "", "activity", "Landroid/app/Activity;", "customerMobile", "", TtmlNode.ATTR_TTS_COLOR, "orderId", "(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "isPluginIntegrated", "", "pluginCompatibilityResponse", "Lcom/razorpay/RzpPluginCompatibilityResponse;", "razorpayTurbo", "Lcom/razorpay/RzpTurboExternalPlugin;", "razorpayTurboPlugin", "Lcom/razorpay/RzpPlugin;", "checkForPlugin", "clearSession", "", "destroy", "getLinkedUpiAccounts", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "initTurboSdk", "initialize", "session", "linkNewUpiAccount", "linkNewUpiAccountCheckout", "amountInDisplayFormat", "manageUpiAccounts", "setMobileNumber", "Companion", "checkout_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class UpiTurboCheckout {
    public static final _O_$oo$O$$$__o0Oo Companion = new _O_$oo$O$$$__o0Oo(null);
    private Activity activity;
    private String color;
    private String customerMobile;
    private boolean isPluginIntegrated;
    private String orderId;
    private RzpPluginCompatibilityResponse pluginCompatibilityResponse;
    private RzpTurboExternalPlugin razorpayTurbo;
    private RzpPlugin razorpayTurboPlugin;

    public UpiTurboCheckout(Activity activity, String str, String str2, String str3) {
        toMagicModuleMetaRepoModel.write(activity, "");
        toMagicModuleMetaRepoModel.write(str, "");
        this.activity = activity;
        this.customerMobile = str;
        this.color = str2;
        this.orderId = str3;
    }

    public /* synthetic */ UpiTurboCheckout(Activity activity, String str, String str2, String str3, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(activity, str, str2, (i & 8) != 0 ? null : str3);
    }

    public final void setMobileNumber(String customerMobile) {
        toMagicModuleMetaRepoModel.write(customerMobile, "");
        this.customerMobile = customerMobile;
    }

    private final void initTurboSdk() {
        if (checkForPlugin()) {
            RzpTurboExternalPlugin rzpTurboExternalPlugin = this.razorpayTurbo;
            if (rzpTurboExternalPlugin == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                rzpTurboExternalPlugin = null;
            }
            rzpTurboExternalPlugin.initTurboSdk(this.activity, this.customerMobile, null);
        }
    }

    private final boolean checkForPlugin() {
        Class<?> clsLoadClass;
        Class<?> clsLoadClass2;
        if (this.isPluginIntegrated) {
            return true;
        }
        HashMap<String, String> allPluginsFromManifest = BaseUtils.getAllPluginsFromManifest(this.activity);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(allPluginsFromManifest, "");
        for (Map.Entry<String, String> entry : allPluginsFromManifest.entrySet()) {
            String key = entry.getKey();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(key, "");
            if (TestGroupLSModel.write((CharSequence) key, (CharSequence) "upi_turbo", false)) {
                ClassLoader classLoader = RzpTurboExternalPlugin.class.getClassLoader();
                RzpPluginCompatibilityResponse rzpPluginCompatibilityResponse = null;
                Object objNewInstance = (classLoader == null || (clsLoadClass2 = classLoader.loadClass(entry.getValue())) == null) ? null : clsLoadClass2.newInstance();
                if (objNewInstance != null) {
                    this.razorpayTurbo = (RzpTurboExternalPlugin) objNewInstance;
                    ClassLoader classLoader2 = RzpPlugin.class.getClassLoader();
                    Object objNewInstance2 = (classLoader2 == null || (clsLoadClass = classLoader2.loadClass(entry.getValue())) == null) ? null : clsLoadClass.newInstance();
                    if (objNewInstance2 != null) {
                        RzpPlugin rzpPlugin = (RzpPlugin) objNewInstance2;
                        this.razorpayTurboPlugin = rzpPlugin;
                        if (rzpPlugin == null) {
                            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                            rzpPlugin = null;
                        }
                        RzpPluginCompatibilityResponse rzpPluginCompatibilityResponseIsCompatible = rzpPlugin.isCompatible(com.razorpay.a.a.O$$$__o0Oo.SDK_TYPE, 1718, com.razorpay.a.a.O$$$__o0Oo.VERSION_NAME);
                        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(rzpPluginCompatibilityResponseIsCompatible, "");
                        this.pluginCompatibilityResponse = rzpPluginCompatibilityResponseIsCompatible;
                        if (rzpPluginCompatibilityResponseIsCompatible == null) {
                            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                        } else {
                            rzpPluginCompatibilityResponse = rzpPluginCompatibilityResponseIsCompatible;
                        }
                        if (!rzpPluginCompatibilityResponse.isCompatible()) {
                            return false;
                        }
                        this.isPluginIntegrated = true;
                        return true;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type com.razorpay.RzpPlugin");
                }
                throw new NullPointerException("null cannot be cast to non-null type com.razorpay.RzpTurboExternalPlugin");
            }
        }
        return false;
    }

    public static /* synthetic */ void getLinkedUpiAccounts$default(UpiTurboCheckout upiTurboCheckout, Object obj, String str, int i, Object obj2) {
        if ((i & 2) != 0) {
            str = null;
        }
        upiTurboCheckout.getLinkedUpiAccounts(obj, str);
    }

    public final void getLinkedUpiAccounts(Object listener, String customerMobile) {
        toMagicModuleMetaRepoModel.write(listener, "");
        if (checkForPlugin()) {
            RzpTurboExternalPlugin rzpTurboExternalPlugin = this.razorpayTurbo;
            if (rzpTurboExternalPlugin == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                rzpTurboExternalPlugin = null;
            }
            RzpTurboExternalPlugin rzpTurboExternalPlugin2 = rzpTurboExternalPlugin;
            Activity activity = this.activity;
            if (customerMobile == null) {
                customerMobile = this.customerMobile;
            }
            rzpTurboExternalPlugin2.getLinkedUpiAccountsCheckout(activity, customerMobile, null, this.color, listener, this.orderId);
            return;
        }
        throw new RuntimeException("Razorpay UPI-Turbo Wrapper Plugin not integrated. ");
    }

    public final void linkNewUpiAccountCheckout(String color, String amountInDisplayFormat, Object listener) {
        toMagicModuleMetaRepoModel.write(listener, "");
        if (checkForPlugin()) {
            RzpTurboExternalPlugin rzpTurboExternalPlugin = this.razorpayTurbo;
            if (rzpTurboExternalPlugin == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                rzpTurboExternalPlugin = null;
            }
            RzpTurboExternalPlugin.DefaultImpls.linkNewUpiAccountCheckout$default(rzpTurboExternalPlugin, this.activity, this.customerMobile, null, color, amountInDisplayFormat, listener, this.orderId, false, 128, null);
            return;
        }
        throw new RuntimeException("Razorpay UPI-Turbo Wrapper Plugin not integrated. ");
    }

    public final void linkNewUpiAccount(String customerMobile, String color, Object listener) {
        toMagicModuleMetaRepoModel.write(listener, "");
        if (checkForPlugin()) {
            RzpTurboExternalPlugin rzpTurboExternalPlugin = this.razorpayTurbo;
            if (rzpTurboExternalPlugin == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                rzpTurboExternalPlugin = null;
            }
            rzpTurboExternalPlugin.linkNewUpiAccountCheckout(this.activity, customerMobile, null, color, null, listener, this.orderId, true);
            return;
        }
        throw new RuntimeException("Razorpay UPI-Turbo Wrapper Plugin not integrated. ");
    }

    public final void initialize(Object session) {
        toMagicModuleMetaRepoModel.write(session, "");
        if (checkForPlugin()) {
            RzpTurboExternalPlugin rzpTurboExternalPlugin = this.razorpayTurbo;
            if (rzpTurboExternalPlugin == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                rzpTurboExternalPlugin = null;
            }
            rzpTurboExternalPlugin.initialize(this.activity, session, this.customerMobile, null);
            return;
        }
        throw new RuntimeException("Razorpay UPI-Turbo Wrapper Plugin not integrated. ");
    }

    @getRenewGrpId
    public final void clearSession() {
        if (checkForPlugin()) {
            RzpTurboExternalPlugin rzpTurboExternalPlugin = this.razorpayTurbo;
            if (rzpTurboExternalPlugin == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                rzpTurboExternalPlugin = null;
            }
            rzpTurboExternalPlugin.clearSession();
            return;
        }
        throw new RuntimeException("Razorpay UPI-Turbo Wrapper Plugin not integrated. ");
    }

    public final void manageUpiAccounts(String customerMobile, String color, Object listener) {
        toMagicModuleMetaRepoModel.write(listener, "");
        if (checkForPlugin()) {
            RzpTurboExternalPlugin rzpTurboExternalPlugin = this.razorpayTurbo;
            if (rzpTurboExternalPlugin == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                rzpTurboExternalPlugin = null;
            }
            rzpTurboExternalPlugin.manageUpiAccounts(this.activity, customerMobile, color, listener);
            return;
        }
        throw new RuntimeException("Razorpay UPI-Turbo Wrapper Plugin not integrated. ");
    }

    public final void destroy() {
        if (checkForPlugin()) {
            RzpTurboExternalPlugin rzpTurboExternalPlugin = this.razorpayTurbo;
            if (rzpTurboExternalPlugin == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                rzpTurboExternalPlugin = null;
            }
            rzpTurboExternalPlugin.destroy();
            return;
        }
        throw new RuntimeException("Razorpay UPI-Turbo Wrapper Plugin not integrated. ");
    }
}
