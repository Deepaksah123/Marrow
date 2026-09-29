package kotlin;

import android.app.NotificationManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.os.Binder;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes5.dex */
final class codecNeedsFlushWorkaround {
    private static Task<Void> write(Executor executor, final Context context, final boolean z) {
        if (!PlatformVersion.isAtLeastQ()) {
            return Tasks.forResult(null);
        }
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        executor.execute(new Runnable() { // from class: o.codecNeedsEosOutputExceptionWorkaround
            @Override // java.lang.Runnable
            public final void run() {
                codecNeedsFlushWorkaround.AudioAttributesCompatParcelizer(context, z, taskCompletionSource);
            }
        });
        return taskCompletionSource.getTask();
    }

    static /* synthetic */ void AudioAttributesCompatParcelizer(Context context, boolean z, TaskCompletionSource taskCompletionSource) {
        try {
            if (!write(context)) {
                context.getPackageName();
                return;
            }
            codecNeedsEosFlushWorkaround.write(context);
            NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
            if (!z) {
                if ("com.google.android.gms".equals(notificationManager.getNotificationDelegate())) {
                    notificationManager.setNotificationDelegate(null);
                }
            } else {
                notificationManager.setNotificationDelegate("com.google.android.gms");
            }
        } finally {
            taskCompletionSource.trySetResult(null);
        }
    }

    private static boolean read(Context context) {
        ApplicationInfo applicationInfo;
        try {
            Context applicationContext = context.getApplicationContext();
            PackageManager packageManager = applicationContext.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(applicationContext.getPackageName(), 128)) == null || ((PackageItemInfo) applicationInfo).metaData == null || !((PackageItemInfo) applicationInfo).metaData.containsKey("firebase_messaging_notification_delegation_enabled")) {
                return true;
            }
            return ((PackageItemInfo) applicationInfo).metaData.getBoolean("firebase_messaging_notification_delegation_enabled");
        } catch (PackageManager.NameNotFoundException unused) {
            return true;
        }
    }

    static void AudioAttributesCompatParcelizer(Context context) {
        if (codecNeedsEosFlushWorkaround.AudioAttributesCompatParcelizer(context)) {
            return;
        }
        write(new ObjectIdWriter(), context, read(context));
    }

    private static boolean write(Context context) {
        return Binder.getCallingUid() == context.getApplicationInfo().uid;
    }
}
