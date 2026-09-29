package kotlin;

import android.content.Context;
import android.graphics.Rect;
import android.view.WindowManager;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lo/setApplicationEnabledSetting;", "Lo/setComponentEnabledSetting;", "<init>", "()V", "Landroid/content/Context;", "p0", "Lo/queryIntentServices;", "p1", "Lo/getSystemSharedLibraryNames;", "read", "(Landroid/content/Context;Lo/queryIntentServices;)Lo/getSystemSharedLibraryNames;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class setApplicationEnabledSetting implements setComponentEnabledSetting {
    public static final setApplicationEnabledSetting INSTANCE = new setApplicationEnabledSetting();

    private setApplicationEnabledSetting() {
    }

    @Override // kotlin.setComponentEnabledSetting
    public final getSystemSharedLibraryNames read(Context p0, queryIntentServices p1) {
        WindowManager windowManager;
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        if (p0.isUiContext()) {
            windowManager = (WindowManager) p0.getSystemService(WindowManager.class);
        } else {
            windowManager = (WindowManager) p0.getApplicationContext().getSystemService(WindowManager.class);
        }
        Rect bounds = windowManager.getCurrentWindowMetrics().getBounds();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(bounds, "");
        return new getSystemSharedLibraryNames(bounds, windowManager.getCurrentWindowMetrics().getDensity());
    }
}
