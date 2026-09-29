package kotlin;

import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes3.dex */
public abstract class outputImageTrack implements Runnable {
    private final TaskCompletionSource AudioAttributesCompatParcelizer;

    public final void AudioAttributesCompatParcelizer(Exception exc) {
        TaskCompletionSource taskCompletionSource = this.AudioAttributesCompatParcelizer;
        if (taskCompletionSource != null) {
            taskCompletionSource.trySetException(exc);
        }
    }

    protected abstract void RemoteActionCompatParcelizer();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            RemoteActionCompatParcelizer();
        } catch (Exception e) {
            AudioAttributesCompatParcelizer(e);
        }
    }

    outputImageTrack() {
        this.AudioAttributesCompatParcelizer = null;
    }

    public outputImageTrack(TaskCompletionSource taskCompletionSource) {
        this.AudioAttributesCompatParcelizer = taskCompletionSource;
    }

    final TaskCompletionSource write() {
        return this.AudioAttributesCompatParcelizer;
    }
}
