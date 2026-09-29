package kotlin;

import android.content.Context;
import android.content.pm.InstallSourceInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lo/isHandledMediaKey;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "Lo/seekToTimeBarPosition;", "AudioAttributesCompatParcelizer", "(Landroid/content/Context;)Lo/seekToTimeBarPosition;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class isHandledMediaKey {
    public static final isHandledMediaKey INSTANCE = new isHandledMediaKey();

    private isHandledMediaKey() {
    }

    public static seekToTimeBarPosition AudioAttributesCompatParcelizer(Context p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        PackageManager packageManager = p0.getPackageManager();
        String packageName = p0.getPackageName();
        try {
            if (Build.VERSION.SDK_INT >= 30) {
                InstallSourceInfo installSourceInfo = packageManager.getInstallSourceInfo(packageName);
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(installSourceInfo, "");
                String installingPackageName = installSourceInfo.getInstallingPackageName();
                String str = installingPackageName == null ? "" : installingPackageName;
                String initiatingPackageName = installSourceInfo.getInitiatingPackageName();
                String str2 = initiatingPackageName == null ? "" : initiatingPackageName;
                String originatingPackageName = installSourceInfo.getOriginatingPackageName();
                return new seekToTimeBarPosition(str, str2, originatingPackageName == null ? "" : originatingPackageName, null, null, 24, null);
            }
            String installerPackageName = packageManager.getInstallerPackageName(packageName);
            return new seekToTimeBarPosition(null, null, null, installerPackageName == null ? "" : installerPackageName, null, 23, null);
        } catch (Exception e) {
            String message = e.getMessage();
            return new seekToTimeBarPosition(null, null, null, null, message == null ? "" : message, 15, null);
        }
    }
}
