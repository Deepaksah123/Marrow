package kotlin;

import android.content.Context;

/* JADX INFO: loaded from: classes5.dex */
final class parsePayloadLengthInfo {
    private String RemoteActionCompatParcelizer;

    parsePayloadLengthInfo() {
    }

    final String write(Context context) {
        String str;
        synchronized (this) {
            if (this.RemoteActionCompatParcelizer == null) {
                this.RemoteActionCompatParcelizer = AudioAttributesCompatParcelizer(context);
            }
            str = "".equals(this.RemoteActionCompatParcelizer) ? null : this.RemoteActionCompatParcelizer;
        }
        return str;
    }

    private static String AudioAttributesCompatParcelizer(Context context) {
        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
        return installerPackageName == null ? "" : installerPackageName;
    }
}
