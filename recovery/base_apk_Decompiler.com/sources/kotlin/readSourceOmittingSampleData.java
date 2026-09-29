package kotlin;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayDeque;
import java.util.Objects;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
final class readSourceOmittingSampleData implements ServiceConnection {
    private final Queue<RemoteActionCompatParcelizer> AudioAttributesCompatParcelizer;
    private boolean IconCompatParcelizer;
    private final ScheduledExecutorService MediaBrowserCompatItemReceiver;
    private initCodec RemoteActionCompatParcelizer;
    private final Intent read;
    private final Context write;

    static class RemoteActionCompatParcelizer {
        private final TaskCompletionSource<Void> IconCompatParcelizer = new TaskCompletionSource<>();
        final Intent RemoteActionCompatParcelizer;

        RemoteActionCompatParcelizer(Intent intent) {
            this.RemoteActionCompatParcelizer = intent;
        }

        final void read(ScheduledExecutorService scheduledExecutorService) {
            final ScheduledFuture<?> scheduledFutureSchedule = scheduledExecutorService.schedule(new Runnable() { // from class: o.isRecoverableMediaCodecExceptionV21
                @Override // java.lang.Runnable
                public final void run() {
                    this.write.AudioAttributesCompatParcelizer();
                }
            }, 20L, TimeUnit.SECONDS);
            read().addOnCompleteListener(scheduledExecutorService, new OnCompleteListener() { // from class: o.maybeInitCodecWithFallback
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    scheduledFutureSchedule.cancel(false);
                }
            });
        }

        final /* synthetic */ void AudioAttributesCompatParcelizer() {
            this.RemoteActionCompatParcelizer.getAction();
            write();
        }

        final Task<Void> read() {
            return this.IconCompatParcelizer.getTask();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public final void write() {
            this.IconCompatParcelizer.trySetResult(null);
        }
    }

    readSourceOmittingSampleData(Context context, String str) {
        this(context, str, new ScheduledThreadPoolExecutor(0, new NamedThreadFactory("Firebase-FirebaseInstanceIdServiceConnection")));
    }

    private readSourceOmittingSampleData(Context context, String str, ScheduledExecutorService scheduledExecutorService) {
        this.AudioAttributesCompatParcelizer = new ArrayDeque();
        this.IconCompatParcelizer = false;
        Context applicationContext = context.getApplicationContext();
        this.write = applicationContext;
        this.read = new Intent(str).setPackage(applicationContext.getPackageName());
        this.MediaBrowserCompatItemReceiver = scheduledExecutorService;
    }

    final Task<Void> IconCompatParcelizer(Intent intent) {
        Task<Void> task;
        synchronized (this) {
            RemoteActionCompatParcelizer remoteActionCompatParcelizer = new RemoteActionCompatParcelizer(intent);
            remoteActionCompatParcelizer.read(this.MediaBrowserCompatItemReceiver);
            this.AudioAttributesCompatParcelizer.add(remoteActionCompatParcelizer);
            IconCompatParcelizer();
            task = remoteActionCompatParcelizer.read();
        }
        return task;
    }

    private void IconCompatParcelizer() {
        synchronized (this) {
            while (!this.AudioAttributesCompatParcelizer.isEmpty()) {
                initCodec initcodec = this.RemoteActionCompatParcelizer;
                if (initcodec != null && initcodec.isBinderAlive()) {
                    this.RemoteActionCompatParcelizer.write(this.AudioAttributesCompatParcelizer.poll());
                } else {
                    read();
                    return;
                }
            }
        }
    }

    private void read() {
        Log.isLoggable("FirebaseMessaging", 3);
        if (this.IconCompatParcelizer) {
            return;
        }
        this.IconCompatParcelizer = true;
        try {
            if (ConnectionTracker.getInstance().bindService(this.write, this.read, this, 65)) {
                return;
            }
        } catch (SecurityException unused) {
        }
        this.IconCompatParcelizer = false;
        write();
    }

    private void write() {
        while (!this.AudioAttributesCompatParcelizer.isEmpty()) {
            this.AudioAttributesCompatParcelizer.poll().write();
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Objects.toString(componentName);
            }
            this.IconCompatParcelizer = false;
            if (!(iBinder instanceof initCodec)) {
                Objects.toString(iBinder);
                write();
            } else {
                this.RemoteActionCompatParcelizer = (initCodec) iBinder;
                IconCompatParcelizer();
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Objects.toString(componentName);
        }
        IconCompatParcelizer();
    }
}
