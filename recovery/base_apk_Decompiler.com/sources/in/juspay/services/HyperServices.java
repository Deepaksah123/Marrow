package in.juspay.services;

import android.content.Context;
import android.content.Intent;
import android.view.ViewGroup;
import in.juspay.hyper.bridge.HyperBridge;
import in.juspay.hyper.constants.Labels;
import in.juspay.hypersdk.core.JuspayWebViewConfigurationCallback;
import in.juspay.hypersdk.services.HyperPaymentsServices;
import in.juspay.hypersdk.ui.ActivityLaunchDelegate;
import in.juspay.hypersdk.ui.HyperPaymentsCallback;
import in.juspay.hypersdk.ui.IntentSenderDelegate;
import in.juspay.hypersdk.ui.RequestPermissionDelegate;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.Metadata;
import kotlin.getMagicModuleMeta;
import kotlin.maybeGetTypeVariable;
import kotlin.toMagicModuleMetaRepoModel;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u0015\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 B2\u00020\u0001:\u0001BB\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB!\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\nB#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\fB\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\r¢\u0006\u0004\b\u0004\u0010\u000eB\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\r\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\u000fB!\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\r\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\u0010B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\r\u0012\u0006\u0010\u0007\u001a\u00020\u0011¢\u0006\u0004\b\u0004\u0010\u0012B#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\r\u0012\u0006\u0010\u0007\u001a\u00020\u0011\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\u0013B/\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\r\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\u0015J\u0019\u0010\u0017\u001a\u00020\u00162\b\u0010\u0003\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J-\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0003\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ%\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0003\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00192\u0006\u0010\t\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001eJ\u001d\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0003\u001a\u00020\u00192\u0006\u0010\u0007\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001fJ\r\u0010!\u001a\u00020 ¢\u0006\u0004\b!\u0010\"J'\u0010%\u001a\u00020\u001b2\u0006\u0010\u0003\u001a\u00020#2\u0006\u0010\u0007\u001a\u00020#2\b\u0010\t\u001a\u0004\u0018\u00010$¢\u0006\u0004\b%\u0010&J\r\u0010'\u001a\u00020 ¢\u0006\u0004\b'\u0010\"J+\u0010*\u001a\u00020\u001b2\u0006\u0010\u0003\u001a\u00020#2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060(2\u0006\u0010\t\u001a\u00020)¢\u0006\u0004\b*\u0010+J%\u0010,\u001a\u00020\u001b2\u0006\u0010\u0003\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0019¢\u0006\u0004\b,\u0010-J\u001d\u0010,\u001a\u00020\u001b2\u0006\u0010\u0003\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u0019¢\u0006\u0004\b,\u0010.J\u0015\u0010,\u001a\u00020\u001b2\u0006\u0010\u0003\u001a\u00020\u0019¢\u0006\u0004\b,\u0010/J\u0015\u00100\u001a\u00020\u001b2\u0006\u0010\u0003\u001a\u00020\r¢\u0006\u0004\b0\u0010\u000eJ\u0015\u00102\u001a\u00020\u001b2\u0006\u0010\u0003\u001a\u000201¢\u0006\u0004\b2\u00103J\u0015\u00105\u001a\u00020\u001b2\u0006\u0010\u0003\u001a\u000204¢\u0006\u0004\b5\u00106J\u0015\u00108\u001a\u00020\u001b2\u0006\u0010\u0003\u001a\u000207¢\u0006\u0004\b8\u00109J\u0015\u0010;\u001a\u00020\u001b2\u0006\u0010\u0003\u001a\u00020:¢\u0006\u0004\b;\u0010<J\r\u0010=\u001a\u00020\u001b¢\u0006\u0004\b=\u0010>J\u0015\u0010=\u001a\u00020\u001b2\u0006\u0010\u0003\u001a\u00020\u0019¢\u0006\u0004\b=\u0010/R\u0016\u0010@\u001a\u00020?8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010A"}, d2 = {"Lin/juspay/services/HyperServices;", "", "Landroid/content/Context;", "p0", "<init>", "(Landroid/content/Context;)V", "", "p1", "(Landroid/content/Context;Ljava/lang/String;)V", "p2", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V", "Lin/juspay/services/TenantParams;", "(Landroid/content/Context;Lin/juspay/services/TenantParams;Ljava/lang/String;)V", "Lo/maybeGetTypeVariable;", "(Lo/maybeGetTypeVariable;)V", "(Lo/maybeGetTypeVariable;Ljava/lang/String;)V", "(Lo/maybeGetTypeVariable;Ljava/lang/String;Ljava/lang/String;)V", "Landroid/view/ViewGroup;", "(Lo/maybeGetTypeVariable;Landroid/view/ViewGroup;)V", "(Lo/maybeGetTypeVariable;Landroid/view/ViewGroup;Ljava/lang/String;)V", "p3", "(Lo/maybeGetTypeVariable;Landroid/view/ViewGroup;Lin/juspay/services/TenantParams;Ljava/lang/String;)V", "Lin/juspay/services/TenantMap;", "getTenant", "(Ljava/lang/String;)Lin/juspay/services/TenantMap;", "Lorg/json/JSONObject;", "Lin/juspay/hypersdk/ui/HyperPaymentsCallback;", "", Labels.HyperSdk.INITIATE, "(Lo/maybeGetTypeVariable;Landroid/view/ViewGroup;Lorg/json/JSONObject;Lin/juspay/hypersdk/ui/HyperPaymentsCallback;)V", "(Lo/maybeGetTypeVariable;Lorg/json/JSONObject;Lin/juspay/hypersdk/ui/HyperPaymentsCallback;)V", "(Lorg/json/JSONObject;Lin/juspay/hypersdk/ui/HyperPaymentsCallback;)V", "", "isInitialised", "()Z", "", "Landroid/content/Intent;", "onActivityResult", "(IILandroid/content/Intent;)V", "onBackPressed", "", "", "onRequestPermissionsResult", "(I[Ljava/lang/String;[I)V", Labels.HyperSdk.PROCESS, "(Lo/maybeGetTypeVariable;Landroid/view/ViewGroup;Lorg/json/JSONObject;)V", "(Lo/maybeGetTypeVariable;Lorg/json/JSONObject;)V", "(Lorg/json/JSONObject;)V", "resetActivity", "Lin/juspay/hypersdk/ui/ActivityLaunchDelegate;", "setActivityLaunchDelegate", "(Lin/juspay/hypersdk/ui/ActivityLaunchDelegate;)V", "Lin/juspay/hypersdk/ui/IntentSenderDelegate;", "setIntentSenderDelegate", "(Lin/juspay/hypersdk/ui/IntentSenderDelegate;)V", "Lin/juspay/hypersdk/ui/RequestPermissionDelegate;", "setRequestPermissionDelegate", "(Lin/juspay/hypersdk/ui/RequestPermissionDelegate;)V", "Lin/juspay/hypersdk/core/JuspayWebViewConfigurationCallback;", "setWebViewConfigurationCallback", "(Lin/juspay/hypersdk/core/JuspayWebViewConfigurationCallback;)V", Labels.HyperSdk.TERMINATE, "()V", "Lin/juspay/hypersdk/services/HyperPaymentsServices;", "hyperPaymentServices", "Lin/juspay/hypersdk/services/HyperPaymentsServices;", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class HyperServices {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static TenantParams tenantParams = new TenantParams() { // from class: in.juspay.services.HyperServices$Companion$tenantParams$1
        @Override // in.juspay.services.TenantParams
        public final String getBootLoaderEndpoint() {
            TenantMap tenantMap = HyperServices.tenantVal;
            if (tenantMap == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                tenantMap = null;
            }
            return tenantMap.getReleaseConfigTemplateUrl();
        }

        @Override // in.juspay.services.TenantParams
        public final List<Class<? extends HyperBridge>> getBridgeClasses() {
            return new ArrayList();
        }

        @Override // in.juspay.services.TenantParams
        public final JSONObject getLogsEndPoint() {
            TenantMap tenantMap = HyperServices.tenantVal;
            if (tenantMap == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                tenantMap = null;
            }
            return tenantMap.getLogsEndPoints();
        }

        @Override // in.juspay.services.TenantParams
        public final String getTenant() {
            TenantMap tenantMap = HyperServices.tenantVal;
            if (tenantMap == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                tenantMap = null;
            }
            return tenantMap.getTenant();
        }
    };
    private static TenantMap tenantVal;
    private HyperPaymentsServices hyperPaymentServices;

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u000b\u0010\fR\u0016\u0010\u000e\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0011\u001a\u00020\u00108\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012"}, d2 = {"Lin/juspay/services/HyperServices$Companion;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "Lorg/json/JSONObject;", "getVersions", "(Landroid/content/Context;)Lorg/json/JSONObject;", "p1", "", "preFetch", "(Landroid/content/Context;Lorg/json/JSONObject;)V", "Lin/juspay/services/TenantParams;", "tenantParams", "Lin/juspay/services/TenantParams;", "Lin/juspay/services/TenantMap;", "tenantVal", "Lin/juspay/services/TenantMap;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }

        @getMagicModuleMeta
        public final JSONObject getVersions(Context p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            JSONObject versions = HyperPaymentsServices.getVersions(p0);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(versions, "");
            return versions;
        }

        @getMagicModuleMeta
        public final void preFetch(Context p0, JSONObject p1) {
            toMagicModuleMetaRepoModel.write(p0, "");
            toMagicModuleMetaRepoModel.write(p1, "");
            HyperPaymentsServices.preFetch(p0, p1);
        }

        private Companion() {
        }
    }

    public HyperServices(Context context) {
        toMagicModuleMetaRepoModel.write(context, "");
        this.hyperPaymentServices = new HyperPaymentsServices(context, (TenantParams) null, (String) null);
    }

    private final TenantMap getTenant(String p0) {
        String lowerCase;
        if (p0 != null) {
            lowerCase = p0.toLowerCase(Locale.ROOT);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(lowerCase, "");
        } else {
            lowerCase = null;
        }
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) lowerCase, (Object) "juspayglobal") ? TenantMap.GLOBAL : TenantMap.DEFAULT;
    }

    public final void initiate(maybeGetTypeVariable p0, ViewGroup p1, JSONObject p2, HyperPaymentsCallback p3) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        toMagicModuleMetaRepoModel.write(p2, "");
        toMagicModuleMetaRepoModel.write(p3, "");
        this.hyperPaymentServices.initiate(p0, p1, p2, p3);
    }

    public final boolean isInitialised() {
        return this.hyperPaymentServices.isInitialised();
    }

    public final void onActivityResult(int p0, int p1, Intent p2) {
        this.hyperPaymentServices.onActivityResult(p0, p1, p2);
    }

    public final boolean onBackPressed() {
        return this.hyperPaymentServices.onBackPressed();
    }

    public final void onRequestPermissionsResult(int p0, String[] p1, int[] p2) {
        toMagicModuleMetaRepoModel.write(p1, "");
        toMagicModuleMetaRepoModel.write(p2, "");
        this.hyperPaymentServices.onRequestPermissionsResult(p0, p1, p2);
    }

    public final void process(maybeGetTypeVariable p0, JSONObject p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        this.hyperPaymentServices.process(p0, p1);
    }

    public final void resetActivity(maybeGetTypeVariable p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        this.hyperPaymentServices.resetActivity(p0);
    }

    public final void setActivityLaunchDelegate(ActivityLaunchDelegate p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        this.hyperPaymentServices.setActivityLaunchDelegate(p0);
    }

    public final void setIntentSenderDelegate(IntentSenderDelegate p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        this.hyperPaymentServices.setIntentSenderDelegate(p0);
    }

    public final void setRequestPermissionDelegate(RequestPermissionDelegate p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        this.hyperPaymentServices.setRequestPermissionDelegate(p0);
    }

    public final void setWebViewConfigurationCallback(JuspayWebViewConfigurationCallback p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        this.hyperPaymentServices.setWebViewConfigurationCallback(p0);
    }

    public final void terminate() {
        this.hyperPaymentServices.terminate();
    }

    public final void initiate(maybeGetTypeVariable p0, JSONObject p1, HyperPaymentsCallback p2) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        toMagicModuleMetaRepoModel.write(p2, "");
        this.hyperPaymentServices.initiate(p0, p1, p2);
    }

    public final void process(maybeGetTypeVariable p0, ViewGroup p1, JSONObject p2) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        toMagicModuleMetaRepoModel.write(p2, "");
        this.hyperPaymentServices.m368lambda$process$5$injuspayhypersdkservicesHyperPaymentsServices(p0, p1, p2);
    }

    public final void terminate(JSONObject p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        this.hyperPaymentServices.terminate(p0);
    }

    public final void initiate(JSONObject p0, HyperPaymentsCallback p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        this.hyperPaymentServices.initiate(p0, p1);
    }

    public final void process(JSONObject p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        this.hyperPaymentServices.process(p0);
    }

    public HyperServices(Context context, String str) {
        toMagicModuleMetaRepoModel.write(context, "");
        this.hyperPaymentServices = new HyperPaymentsServices(context, (TenantParams) null, str);
    }

    public HyperServices(Context context, String str, String str2) {
        toMagicModuleMetaRepoModel.write(context, "");
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        tenantVal = getTenant(str);
        this.hyperPaymentServices = new HyperPaymentsServices(context, tenantParams, str2);
    }

    public HyperServices(Context context, TenantParams tenantParams2, String str) {
        toMagicModuleMetaRepoModel.write(context, "");
        toMagicModuleMetaRepoModel.write(str, "");
        this.hyperPaymentServices = new HyperPaymentsServices(context, tenantParams2, str);
    }

    public HyperServices(maybeGetTypeVariable maybegettypevariable) {
        toMagicModuleMetaRepoModel.write(maybegettypevariable, "");
        this.hyperPaymentServices = new HyperPaymentsServices(maybegettypevariable);
    }

    public HyperServices(maybeGetTypeVariable maybegettypevariable, String str) {
        toMagicModuleMetaRepoModel.write(maybegettypevariable, "");
        this.hyperPaymentServices = new HyperPaymentsServices(maybegettypevariable, str);
    }

    public HyperServices(maybeGetTypeVariable maybegettypevariable, String str, String str2) {
        toMagicModuleMetaRepoModel.write(maybegettypevariable, "");
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        tenantVal = getTenant(str);
        this.hyperPaymentServices = new HyperPaymentsServices(maybegettypevariable, tenantParams, str2);
    }

    public HyperServices(maybeGetTypeVariable maybegettypevariable, ViewGroup viewGroup) {
        toMagicModuleMetaRepoModel.write(maybegettypevariable, "");
        toMagicModuleMetaRepoModel.write(viewGroup, "");
        this.hyperPaymentServices = new HyperPaymentsServices(maybegettypevariable, viewGroup, (String) null);
    }

    public HyperServices(maybeGetTypeVariable maybegettypevariable, ViewGroup viewGroup, String str) {
        toMagicModuleMetaRepoModel.write(maybegettypevariable, "");
        toMagicModuleMetaRepoModel.write(viewGroup, "");
        this.hyperPaymentServices = new HyperPaymentsServices(maybegettypevariable, viewGroup, null, str);
    }

    public HyperServices(maybeGetTypeVariable maybegettypevariable, ViewGroup viewGroup, TenantParams tenantParams2, String str) {
        toMagicModuleMetaRepoModel.write(maybegettypevariable, "");
        this.hyperPaymentServices = new HyperPaymentsServices(maybegettypevariable, viewGroup, tenantParams2, str);
    }

    @getMagicModuleMeta
    public static final JSONObject getVersions(Context context) {
        return INSTANCE.getVersions(context);
    }

    @getMagicModuleMeta
    public static final void preFetch(Context context, JSONObject jSONObject) {
        INSTANCE.preFetch(context, jSONObject);
    }
}
