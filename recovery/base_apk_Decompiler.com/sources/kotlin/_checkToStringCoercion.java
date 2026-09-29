package kotlin;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;

/* JADX INFO: loaded from: classes.dex */
public final class _checkToStringCoercion {
    @Deprecated
    public static boolean RemoteActionCompatParcelizer(Activity activity, Intent intent) {
        return activity.shouldUpRecreateTask(intent);
    }

    @Deprecated
    public static void IconCompatParcelizer(Activity activity, Intent intent) {
        activity.navigateUpTo(intent);
    }

    public static Intent RemoteActionCompatParcelizer(Activity activity) {
        Intent parentActivityIntent = activity.getParentActivityIntent();
        if (parentActivityIntent != null) {
            return parentActivityIntent;
        }
        String strIconCompatParcelizer = IconCompatParcelizer(activity);
        if (strIconCompatParcelizer == null) {
            return null;
        }
        ComponentName componentName = new ComponentName(activity, strIconCompatParcelizer);
        try {
            if (read(activity, componentName) == null) {
                return Intent.makeMainActivity(componentName);
            }
            return new Intent().setComponent(componentName);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public static Intent AudioAttributesCompatParcelizer(Context context, ComponentName componentName) throws PackageManager.NameNotFoundException {
        String str = read(context, componentName);
        if (str == null) {
            return null;
        }
        ComponentName componentName2 = new ComponentName(componentName.getPackageName(), str);
        if (read(context, componentName2) == null) {
            return Intent.makeMainActivity(componentName2);
        }
        return new Intent().setComponent(componentName2);
    }

    public static String IconCompatParcelizer(Activity activity) {
        try {
            return read(activity, activity.getComponentName());
        } catch (PackageManager.NameNotFoundException e) {
            throw new IllegalArgumentException(e);
        }
    }

    private static String read(Context context, ComponentName componentName) throws PackageManager.NameNotFoundException {
        String string;
        ActivityInfo activityInfo = context.getPackageManager().getActivityInfo(componentName, 269222528);
        String str = activityInfo.parentActivityName;
        if (str != null) {
            return str;
        }
        if (((PackageItemInfo) activityInfo).metaData == null || (string = ((PackageItemInfo) activityInfo).metaData.getString("android.support.PARENT_ACTIVITY")) == null) {
            return null;
        }
        if (string.charAt(0) != '.') {
            return string;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(context.getPackageName());
        sb.append(string);
        return sb.toString();
    }
}
