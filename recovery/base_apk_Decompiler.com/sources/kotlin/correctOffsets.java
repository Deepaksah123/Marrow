package kotlin;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes2.dex */
public final class correctOffsets {
    private static final ConcurrentMap<String, onVolumeChanged> RemoteActionCompatParcelizer = new ConcurrentHashMap();

    public static onVolumeChanged write(Context context) {
        String packageName = context.getPackageName();
        ConcurrentMap<String, onVolumeChanged> concurrentMap = RemoteActionCompatParcelizer;
        onVolumeChanged onvolumechanged = concurrentMap.get(packageName);
        if (onvolumechanged != null) {
            return onvolumechanged;
        }
        onVolumeChanged onvolumechanged2 = read(context);
        onVolumeChanged onvolumechangedPutIfAbsent = concurrentMap.putIfAbsent(packageName, onvolumechanged2);
        return onvolumechangedPutIfAbsent == null ? onvolumechanged2 : onvolumechangedPutIfAbsent;
    }

    private static onVolumeChanged read(Context context) {
        return new getWindowIndexForChildWindowIndex(AudioAttributesCompatParcelizer(AudioAttributesCompatParcelizer(context)));
    }

    private static String AudioAttributesCompatParcelizer(PackageInfo packageInfo) {
        if (packageInfo != null) {
            return String.valueOf(packageInfo.versionCode);
        }
        return UUID.randomUUID().toString();
    }

    private static PackageInfo AudioAttributesCompatParcelizer(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException unused) {
            context.getPackageName();
            return null;
        }
    }
}
