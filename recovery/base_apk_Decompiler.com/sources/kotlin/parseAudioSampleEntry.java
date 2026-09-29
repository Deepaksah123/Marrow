package kotlin;

import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes5.dex */
public abstract class parseAudioSampleEntry implements Runnable {
    private final TaskCompletionSource a;

    public void a(Exception exc) {
        TaskCompletionSource taskCompletionSource = this.a;
        if (taskCompletionSource != null) {
            taskCompletionSource.trySetException(exc);
        }
    }

    protected abstract void b();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            b();
        } catch (Exception e) {
            a(e);
        }
    }

    parseAudioSampleEntry() {
        this.a = null;
    }

    public parseAudioSampleEntry(TaskCompletionSource taskCompletionSource) {
        this.a = taskCompletionSource;
    }

    final TaskCompletionSource c() {
        return this.a;
    }
}
