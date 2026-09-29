package kotlin;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.stats.WakeLock;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
final class isMediaCodecException {
    private static WakeLock read;
    private static long RemoteActionCompatParcelizer = TimeUnit.MINUTES.toMillis(1);
    private static final Object IconCompatParcelizer = new Object();

    isMediaCodecException() {
    }

    private static void AudioAttributesCompatParcelizer(Context context) {
        if (read == null) {
            WakeLock wakeLock = new WakeLock(context, 1, "wake:com.google.firebase.iid.WakeLockHolder");
            read = wakeLock;
            wakeLock.setReferenceCounted(true);
        }
    }

    static ComponentName RemoteActionCompatParcelizer(Context context, Intent intent) {
        synchronized (IconCompatParcelizer) {
            AudioAttributesCompatParcelizer(context);
            boolean zIconCompatParcelizer = IconCompatParcelizer(intent);
            read(intent, true);
            ComponentName componentNameStartService = context.startService(intent);
            if (componentNameStartService == null) {
                return null;
            }
            if (!zIconCompatParcelizer) {
                read.acquire(RemoteActionCompatParcelizer);
            }
            return componentNameStartService;
        }
    }

    static void AudioAttributesCompatParcelizer(Context context, readSourceOmittingSampleData readsourceomittingsampledata, final Intent intent) {
        synchronized (IconCompatParcelizer) {
            AudioAttributesCompatParcelizer(context);
            boolean zIconCompatParcelizer = IconCompatParcelizer(intent);
            read(intent, true);
            if (!zIconCompatParcelizer) {
                read.acquire(RemoteActionCompatParcelizer);
            }
            readsourceomittingsampledata.IconCompatParcelizer(intent).addOnCompleteListener(new OnCompleteListener() { // from class: o.isDecodeOnlyBuffer
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    isMediaCodecException.AudioAttributesCompatParcelizer(intent);
                }
            });
        }
    }

    private static void read(Intent intent, boolean z) {
        intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", z);
    }

    private static boolean IconCompatParcelizer(Intent intent) {
        return intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void AudioAttributesCompatParcelizer(Intent intent) {
        synchronized (IconCompatParcelizer) {
            if (read != null && IconCompatParcelizer(intent)) {
                read(intent, false);
                read.release();
            }
        }
    }
}
