package kotlin;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
final class DefaultMediaSourceFactoryDelegateFactoryLoaderExternalSyntheticLambda3 {
    public static ApplicationInfo read(Context context) {
        return Build.VERSION.SDK_INT >= 33 ? context.getPackageManager().getApplicationInfo(context.getPackageName(), PackageManager.ApplicationInfoFlags.of(128L)) : context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
    }

    public static <T extends Parcelable> T RemoteActionCompatParcelizer(Bundle bundle, String str, Class<T> cls) {
        return Build.VERSION.SDK_INT >= 33 ? (T) bundle.getParcelable(str, cls) : (T) bundle.getParcelable(str);
    }

    public static <T extends Serializable> T read(Bundle bundle, String str, Class<T> cls) {
        return Build.VERSION.SDK_INT >= 33 ? (T) bundle.getSerializable(str, cls) : (T) bundle.getSerializable(str);
    }
}
