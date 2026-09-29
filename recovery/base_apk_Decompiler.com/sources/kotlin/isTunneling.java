package kotlin;

import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class isTunneling {
    private static final Object IconCompatParcelizer = new Object();
    private static readSourceOmittingSampleData RemoteActionCompatParcelizer;
    private final Context AudioAttributesCompatParcelizer;
    private final Executor write = new ObjectIdWriter();

    public isTunneling(Context context) {
        this.AudioAttributesCompatParcelizer = context;
    }

    public final Task<Integer> AudioAttributesCompatParcelizer(Intent intent) {
        String stringExtra = intent.getStringExtra("gcm.rawData64");
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        return read(this.AudioAttributesCompatParcelizer, intent);
    }

    private Task<Integer> read(final Context context, final Intent intent) {
        boolean z = PlatformVersion.isAtLeastO() && context.getApplicationInfo().targetSdkVersion >= 26;
        final boolean z2 = (intent.getFlags() & 268435456) != 0;
        if (z && !z2) {
            return IconCompatParcelizer(context, intent, false);
        }
        return Tasks.call(this.write, new Callable() { // from class: o.needsAdaptationReconfigureWorkaround
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Integer.valueOf(drainAndFlushCodec.write().AudioAttributesCompatParcelizer(context, intent));
            }
        }).continueWithTask(this.write, new Continuation() { // from class: o.needsAdaptationFlushWorkaround
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                return isTunneling.write(context, intent, z2, task);
            }
        });
    }

    static /* synthetic */ Task write(Context context, Intent intent, boolean z, Task task) throws Exception {
        return (PlatformVersion.isAtLeastO() && ((Integer) task.getResult()).intValue() == 402) ? IconCompatParcelizer(context, intent, z).continueWith(new ObjectIdWriter(), new logAssumedSupport()) : task;
    }

    static /* synthetic */ Integer IconCompatParcelizer() throws Exception {
        return 403;
    }

    private static Task<Integer> IconCompatParcelizer(Context context, Intent intent, boolean z) {
        readSourceOmittingSampleData readsourceomittingsampledataIconCompatParcelizer = IconCompatParcelizer(context, "com.google.firebase.MESSAGING_EVENT");
        if (z) {
            if (drainAndFlushCodec.write().IconCompatParcelizer(context)) {
                isMediaCodecException.AudioAttributesCompatParcelizer(context, readsourceomittingsampledataIconCompatParcelizer, intent);
            } else {
                readsourceomittingsampledataIconCompatParcelizer.IconCompatParcelizer(intent);
            }
            return Tasks.forResult(-1);
        }
        return readsourceomittingsampledataIconCompatParcelizer.IconCompatParcelizer(intent).continueWith(new ObjectIdWriter(), new Continuation() { // from class: o.logNoSupport
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                return isTunneling.write();
            }
        });
    }

    static /* synthetic */ Integer write() throws Exception {
        return -1;
    }

    private static readSourceOmittingSampleData IconCompatParcelizer(Context context, String str) {
        readSourceOmittingSampleData readsourceomittingsampledata;
        synchronized (IconCompatParcelizer) {
            if (RemoteActionCompatParcelizer == null) {
                RemoteActionCompatParcelizer = new readSourceOmittingSampleData(context, str);
            }
            readsourceomittingsampledata = RemoteActionCompatParcelizer;
        }
        return readsourceomittingsampledata;
    }
}
