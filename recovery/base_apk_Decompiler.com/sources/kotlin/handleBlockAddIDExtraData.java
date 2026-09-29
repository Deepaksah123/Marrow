package kotlin;

import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes3.dex */
public abstract class handleBlockAddIDExtraData implements Runnable {
    private final TaskCompletionSource RemoteActionCompatParcelizer;

    public final void RemoteActionCompatParcelizer(Exception exc) {
        TaskCompletionSource taskCompletionSource = this.RemoteActionCompatParcelizer;
        if (taskCompletionSource != null) {
            taskCompletionSource.trySetException(exc);
        }
    }

    protected abstract void read();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            read();
        } catch (Exception e) {
            RemoteActionCompatParcelizer(e);
        }
    }

    handleBlockAddIDExtraData() {
        this.RemoteActionCompatParcelizer = null;
    }

    public handleBlockAddIDExtraData(TaskCompletionSource taskCompletionSource) {
        this.RemoteActionCompatParcelizer = taskCompletionSource;
    }

    final TaskCompletionSource AudioAttributesCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }
}
