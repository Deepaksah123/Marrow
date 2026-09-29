package kotlin;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import android.view.Display;
import android.view.WindowManager;
import java.io.File;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class _isNaN {
    private static final String DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION_SUFFIX = ".DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION";
    public static final int RECEIVER_EXPORTED = 2;
    public static final int RECEIVER_NOT_EXPORTED = 4;
    public static final int RECEIVER_VISIBLE_TO_INSTANT_APPS = 1;
    private static final String TAG = "ContextCompat";
    private static final Object sSync = new Object();

    public static boolean startActivities(Context context, Intent[] intentArr) {
        return startActivities(context, intentArr, null);
    }

    public static boolean startActivities(Context context, Intent[] intentArr, Bundle bundle) {
        context.startActivities(intentArr, bundle);
        return true;
    }

    @Deprecated
    public static void startActivity(Context context, Intent intent, Bundle bundle) {
        context.startActivity(intent, bundle);
    }

    public static File getDataDir(Context context) {
        return IconCompatParcelizer.IconCompatParcelizer(context);
    }

    @Deprecated
    public static File[] getObbDirs(Context context) {
        return context.getObbDirs();
    }

    @Deprecated
    public static File[] getExternalFilesDirs(Context context, String str) {
        return context.getExternalFilesDirs(str);
    }

    @Deprecated
    public static File[] getExternalCacheDirs(Context context) {
        return context.getExternalCacheDirs();
    }

    public static Drawable getDrawable(Context context, int i) {
        return write.IconCompatParcelizer(context, i);
    }

    public static ColorStateList getColorStateList(Context context, int i) {
        return _parseDoublePrimitive.write(context.getResources(), i, context.getTheme());
    }

    public static int getColor(Context context, int i) {
        return AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(context, i);
    }

    public static int checkSelfPermission(Context context, String str) {
        configureFromStringCreator.AudioAttributesCompatParcelizer(str, "permission must be non-null");
        if (Build.VERSION.SDK_INT >= 33 || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
            return context.checkPermission(str, Process.myPid(), Process.myUid());
        }
        return _deserializeFromEmpty.write(context).read() ? 0 : -1;
    }

    public static File getNoBackupFilesDir(Context context) {
        return write.IconCompatParcelizer(context);
    }

    public static File getCodeCacheDir(Context context) {
        return write.AudioAttributesCompatParcelizer(context);
    }

    private static File createFilesDir(File file) {
        synchronized (sSync) {
            if (!file.exists()) {
                if (file.mkdirs()) {
                    return file;
                }
                Log.w(TAG, "Unable to create files subdir " + file.getPath());
            }
            return file;
        }
    }

    public static Context createDeviceProtectedStorageContext(Context context) {
        return IconCompatParcelizer.AudioAttributesCompatParcelizer(context);
    }

    public static boolean isDeviceProtectedStorage(Context context) {
        return IconCompatParcelizer.write(context);
    }

    public static Executor getMainExecutor(Context context) {
        return read.IconCompatParcelizer(context);
    }

    public static void startForegroundService(Context context, Intent intent) {
        RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(context, intent);
    }

    public static Display getDisplayOrDefault(Context context) {
        if (Build.VERSION.SDK_INT >= 30) {
            return MediaBrowserCompatItemReceiver.read(context);
        }
        return ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
    }

    public static <T> T getSystemService(Context context, Class<T> cls) {
        return (T) AudioAttributesCompatParcelizer.read(context, cls);
    }

    public static Intent registerReceiver(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, int i) {
        return registerReceiver(context, broadcastReceiver, intentFilter, null, null, i);
    }

    public static Intent registerReceiver(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler, int i) {
        int i2 = i & 1;
        if (i2 != 0 && (i & 4) != 0) {
            throw new IllegalArgumentException("Cannot specify both RECEIVER_VISIBLE_TO_INSTANT_APPS and RECEIVER_NOT_EXPORTED");
        }
        if (i2 != 0) {
            i |= 2;
        }
        int i3 = i;
        int i4 = i3 & 2;
        if (i4 == 0 && (i3 & 4) == 0) {
            throw new IllegalArgumentException("One of either RECEIVER_EXPORTED or RECEIVER_NOT_EXPORTED is required");
        }
        if (i4 != 0 && (i3 & 4) != 0) {
            throw new IllegalArgumentException("Cannot specify both RECEIVER_EXPORTED and RECEIVER_NOT_EXPORTED");
        }
        if (Build.VERSION.SDK_INT >= 33) {
            return MediaBrowserCompatCustomActionResultReceiver.AudioAttributesCompatParcelizer(context, broadcastReceiver, intentFilter, str, handler, i3);
        }
        return RemoteActionCompatParcelizer.IconCompatParcelizer(context, broadcastReceiver, intentFilter, str, handler, i3);
    }

    public static String getSystemServiceName(Context context, Class<?> cls) {
        return AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(context, cls);
    }

    public static String getString(Context context, int i) {
        return getContextForLanguage(context).getString(i);
    }

    public static Context getContextForLanguage(Context context) {
        StdKeyDeserializerStringCtorKeyDeserializer stdKeyDeserializerStringCtorKeyDeserializerIconCompatParcelizer = _coerceEmptyString.IconCompatParcelizer(context);
        if (Build.VERSION.SDK_INT > 32 || stdKeyDeserializerStringCtorKeyDeserializerIconCompatParcelizer.IconCompatParcelizer()) {
            return context;
        }
        Configuration configuration = new Configuration(context.getResources().getConfiguration());
        _resolveCurrentResolver.write(configuration, stdKeyDeserializerStringCtorKeyDeserializerIconCompatParcelizer);
        return context.createConfigurationContext(configuration);
    }

    public static String getAttributionTag(Context context) {
        if (Build.VERSION.SDK_INT >= 30) {
            return MediaBrowserCompatItemReceiver.IconCompatParcelizer(context);
        }
        return null;
    }

    public static Context createAttributionContext(Context context, String str) {
        return Build.VERSION.SDK_INT >= 30 ? MediaBrowserCompatItemReceiver.read(context, str) : context;
    }

    static String obtainAndCheckReceiverPermission(Context context) {
        String str = context.getApplicationContext().getPackageName() + DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION_SUFFIX;
        if (_parseBooleanPrimitive.read(context, str) == 0) {
            return str;
        }
        String str2 = context.getOpPackageName() + DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION_SUFFIX;
        if (_parseBooleanPrimitive.read(context, str2) == 0) {
            return str2;
        }
        throw new RuntimeException("Permission " + str2 + " is required by your application to receive broadcasts, please add it to your manifest");
    }

    /* JADX INFO: loaded from: classes2.dex */
    static class write {
        static Drawable IconCompatParcelizer(Context context, int i) {
            return context.getDrawable(i);
        }

        static File IconCompatParcelizer(Context context) {
            return context.getNoBackupFilesDir();
        }

        static File AudioAttributesCompatParcelizer(Context context) {
            return context.getCodeCacheDir();
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    static class AudioAttributesCompatParcelizer {
        static int AudioAttributesCompatParcelizer(Context context, int i) {
            return context.getColor(i);
        }

        static <T> T read(Context context, Class<T> cls) {
            return (T) context.getSystemService(cls);
        }

        static String AudioAttributesCompatParcelizer(Context context, Class<?> cls) {
            return context.getSystemServiceName(cls);
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    static class IconCompatParcelizer {
        static File IconCompatParcelizer(Context context) {
            return context.getDataDir();
        }

        static Context AudioAttributesCompatParcelizer(Context context) {
            return context.createDeviceProtectedStorageContext();
        }

        static boolean write(Context context) {
            return context.isDeviceProtectedStorage();
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    static class RemoteActionCompatParcelizer {
        static Intent IconCompatParcelizer(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler, int i) {
            if ((i & 4) != 0 && str == null) {
                return context.registerReceiver(broadcastReceiver, intentFilter, _isNaN.obtainAndCheckReceiverPermission(context), handler);
            }
            return context.registerReceiver(broadcastReceiver, intentFilter, str, handler, i & 1);
        }

        static ComponentName AudioAttributesCompatParcelizer(Context context, Intent intent) {
            return context.startForegroundService(intent);
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    static class read {
        static Executor IconCompatParcelizer(Context context) {
            return context.getMainExecutor();
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    static class MediaBrowserCompatItemReceiver {
        static String IconCompatParcelizer(Context context) {
            return context.getAttributionTag();
        }

        static Display read(Context context) {
            try {
                return context.getDisplay();
            } catch (UnsupportedOperationException unused) {
                Objects.toString(context);
                return ((DisplayManager) context.getSystemService(DisplayManager.class)).getDisplay(0);
            }
        }

        static Context read(Context context, String str) {
            return context.createAttributionContext(str);
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    static class MediaBrowserCompatCustomActionResultReceiver {
        static Intent AudioAttributesCompatParcelizer(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler, int i) {
            return context.registerReceiver(broadcastReceiver, intentFilter, str, handler, i);
        }
    }
}
