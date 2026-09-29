package in.juspay.hyper.core;

import android.content.Context;
import android.content.res.Resources;
import kotlin.Metadata;
import kotlin.getMagicModuleMeta;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR.\u0010\t\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00048G@BX\u0087\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u0012\u0004\b\r\u0010\u0003\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u000f\u001a\u00020\u000e8GX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0011\u0010\u0003\u001a\u0004\b\u000f\u0010\u0010R*\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u000e8\u0007@BX\u0087\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u0012\u0004\b\u0014\u0010\u0003\u001a\u0004\b\u0012\u0010\u0010"}, d2 = {"Lin/juspay/hyper/core/JuspayCoreLib;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "", "setApplicationContext", "(Landroid/content/Context;)V", "applicationContext", "Landroid/content/Context;", "getApplicationContext", "()Landroid/content/Context;", "getApplicationContext$annotations", "", "isAppDebuggable", "()Z", "isAppDebuggable$annotations", "isMultiClientIntegration", "Z", "isMultiClientIntegration$annotations"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class JuspayCoreLib {
    public static final JuspayCoreLib INSTANCE = new JuspayCoreLib();
    private static Context applicationContext;
    private static boolean isMultiClientIntegration;

    @getMagicModuleMeta
    public static /* synthetic */ void getApplicationContext$annotations() {
    }

    @getMagicModuleMeta
    public static /* synthetic */ void isAppDebuggable$annotations() {
    }

    @getMagicModuleMeta
    public static /* synthetic */ void isMultiClientIntegration$annotations() {
    }

    private JuspayCoreLib() {
    }

    public static final Context getApplicationContext() {
        return applicationContext;
    }

    @getMagicModuleMeta
    public static final void setApplicationContext(Context p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        applicationContext = p0;
        try {
            isMultiClientIntegration = toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) p0.getString(p0.getResources().getIdentifier("multiclient_integration", "string", p0.getPackageName())), (Object) "true");
        } catch (Resources.NotFoundException unused) {
        }
    }

    public static final boolean isAppDebuggable() {
        Context context = applicationContext;
        return (context == null || (context.getApplicationInfo().flags & 2) == 0) ? false : true;
    }

    public static final boolean isMultiClientIntegration() {
        return isMultiClientIntegration;
    }
}
