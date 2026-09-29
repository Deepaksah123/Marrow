package com.razorpay;

import in.juspay.hyper.constants.Labels;
import java.net.URI;
import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.Metadata;
import kotlin.getMagicModuleMeta;
import kotlin.toMagicModuleMetaRepoModel;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0010\u001a\u00020\u0006J\u0006\u0010\u0011\u001a\u00020\u0006J\u0006\u0010\u0012\u001a\u00020\u0006J\u0006\u0010\u0013\u001a\u00020\u0006J\u0006\u0010\u0014\u001a\u00020\u0006J\u0006\u0010\u0015\u001a\u00020\u0006R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\bR\u0011\u0010\u000b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\bR\u0011\u0010\r\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\bR\u000e\u0010\u000f\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/razorpay/GlobalUrlConfig;", "", "urlConfig", "Lorg/json/JSONObject;", "(Lorg/json/JSONObject;)V", "baseCdn", "", "getBaseCdn", "()Ljava/lang/String;", "baseUrl", "getBaseUrl", "cdnUrl", "getCdnUrl", "staticCdn", "getStaticCdn", "trackUrl", "getButlerUrl", "getCheckoutUrl", "getOtpelfJsUrl", "getOtpelfVersionUrl", "getPaymentsEndpoint", "getTrackUrl", "Companion", "core_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class GlobalUrlConfig {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static GlobalUrlConfig _1__;
    private final String I__1l;
    private final String __l1_;
    private final String _l_1l__;
    private final String _llI;
    private final String l$1_I$l$;

    private GlobalUrlConfig(JSONObject jSONObject) {
        String strOptString = jSONObject.optString("frame", "https://api.razorpay.com");
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strOptString, "");
        this.l$1_I$l$ = strOptString;
        String strOptString2 = jSONObject.optString("baseCdn", "");
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strOptString2, "");
        this.__l1_ = strOptString2;
        String strOptString3 = jSONObject.optString("staticCdn", "");
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strOptString3, "");
        this._llI = strOptString3;
        String lumberjackEndpoint = CoreConfig.getInstance().getLumberjackEndpoint();
        String strOptString4 = jSONObject.optString("trackUrl", lumberjackEndpoint == null ? "https://lumberjack.razorpay.com/v1/track" : lumberjackEndpoint);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strOptString4, "");
        this._l_1l__ = strOptString4;
        String strOptString5 = jSONObject.optString("cdnUrl");
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strOptString5, "");
        this.I__1l = strOptString5;
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0007J\b\u0010\t\u001a\u00020\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/razorpay/GlobalUrlConfig$Companion;", "", "()V", "globalUrlConfig", "Lcom/razorpay/GlobalUrlConfig;", Labels.HyperSdk.INITIATE, "", "urlConfig", "Lorg/json/JSONObject;", "instance", "core_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @getMagicModuleMeta
        public final GlobalUrlConfig instance() {
            MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0 = null;
            if (GlobalUrlConfig._1__ != null) {
                GlobalUrlConfig globalUrlConfig = GlobalUrlConfig._1__;
                if (globalUrlConfig != null) {
                    return globalUrlConfig;
                }
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                return null;
            }
            GlobalUrlConfig._1__ = new GlobalUrlConfig(new JSONObject(), magicModuleRepositoryImplExternalSyntheticLambda0);
            GlobalUrlConfig globalUrlConfig2 = GlobalUrlConfig._1__;
            if (globalUrlConfig2 != null) {
                return globalUrlConfig2;
            }
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            return null;
        }

        @getMagicModuleMeta
        public final void initiate(JSONObject urlConfig) {
            GlobalUrlConfig globalUrlConfig;
            MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0 = null;
            if (urlConfig == null) {
                globalUrlConfig = new GlobalUrlConfig(new JSONObject(), magicModuleRepositoryImplExternalSyntheticLambda0);
            } else {
                globalUrlConfig = new GlobalUrlConfig(urlConfig, magicModuleRepositoryImplExternalSyntheticLambda0);
            }
            GlobalUrlConfig._1__ = globalUrlConfig;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    /* JADX INFO: renamed from: getBaseUrl, reason: from getter */
    public final String getL$1_I$l$() {
        return this.l$1_I$l$;
    }

    /* JADX INFO: renamed from: getBaseCdn, reason: from getter */
    public final String get__l1_() {
        return this.__l1_;
    }

    /* JADX INFO: renamed from: getStaticCdn, reason: from getter */
    public final String get_llI() {
        return this._llI;
    }

    /* JADX INFO: renamed from: getCdnUrl, reason: from getter */
    public final String getI__1l() {
        return this.I__1l;
    }

    public final String getOtpelfVersionUrl() {
        if (this.I__1l.length() == 0) {
            String otpElfVersionUrl = CoreConfig.getInstance().getOtpElfVersionUrl();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(otpElfVersionUrl, "");
            return otpElfVersionUrl;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.I__1l);
        sb.append("static/otpelf2/version.json");
        return sb.toString();
    }

    public final String getOtpelfJsUrl() {
        if (this.I__1l.length() == 0) {
            String otpElfJsUrl = CoreConfig.getInstance().getOtpElfJsUrl();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(otpElfJsUrl, "");
            return otpElfJsUrl;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.I__1l);
        sb.append("static/otpelf2/otpelf.js");
        return sb.toString();
    }

    public final String getCheckoutUrl() {
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.l$1_I$l$, (Object) "https://api.razorpay.com")) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.l$1_I$l$);
            sb.append("/v1/checkout/public");
            return sb.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.l$1_I$l$);
        sb2.append("?baseCdn=");
        sb2.append(this.__l1_);
        sb2.append("&staticCdn=");
        sb2.append(this._llI);
        sb2.append("&trackUrl=");
        sb2.append(this._l_1l__);
        sb2.append("&cdn=");
        sb2.append(this.I__1l);
        return sb2.toString();
    }

    public final String getTrackUrl() {
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this._l_1l__, (Object) CoreConfig.getInstance().getLumberjackEndpoint())) {
            return this._l_1l__;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this._l_1l__);
        sb.append("v1/track");
        return sb.toString();
    }

    public final String getButlerUrl() {
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.l$1_I$l$, (Object) "https://api.razorpay.com")) {
            String configEndpoint = CoreConfig.getInstance().getConfigEndpoint();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(configEndpoint, "");
            return configEndpoint;
        }
        URI uri = new URI(this.l$1_I$l$);
        StringBuilder sb = new StringBuilder();
        sb.append(uri.getScheme());
        sb.append("://");
        sb.append(uri.getHost());
        sb.append("/butler/v1/settings");
        return sb.toString();
    }

    public final String getPaymentsEndpoint() {
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.l$1_I$l$, (Object) "https://api.razorpay.com")) {
            return "https://api.razorpay.com/v1/payments/";
        }
        URI uri = new URI(this.l$1_I$l$);
        StringBuilder sb = new StringBuilder();
        sb.append(uri.getScheme());
        sb.append("://");
        sb.append(uri.getHost());
        sb.append("/v1/payments/");
        return sb.toString();
    }

    public /* synthetic */ GlobalUrlConfig(JSONObject jSONObject, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(jSONObject);
    }

    @getMagicModuleMeta
    public static final void initiate(JSONObject jSONObject) {
        INSTANCE.initiate(jSONObject);
    }

    @getMagicModuleMeta
    public static final GlobalUrlConfig instance() {
        return INSTANCE.instance();
    }
}
