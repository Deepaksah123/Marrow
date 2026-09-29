package kotlin;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class H264ReaderSampleReaderSliceHeaderData {
    private final Executor read;
    private Task<Void> RemoteActionCompatParcelizer = Tasks.forResult(null);
    private final Object AudioAttributesCompatParcelizer = new Object();
    private final ThreadLocal<Boolean> write = new ThreadLocal<>();

    public H264ReaderSampleReaderSliceHeaderData(Executor executor) {
        this.read = executor;
        executor.execute(new Runnable() { // from class: o.H264ReaderSampleReaderSliceHeaderData.3
            @Override // java.lang.Runnable
            public final void run() {
                H264ReaderSampleReaderSliceHeaderData.this.write.set(Boolean.TRUE);
            }
        });
    }

    public final Executor AudioAttributesCompatParcelizer() {
        return this.read;
    }

    private boolean write() {
        return Boolean.TRUE.equals(this.write.get());
    }

    public final void read() {
        if (!write()) {
            throw new IllegalStateException("Not running on background worker thread as intended.");
        }
    }

    final Task<Void> IconCompatParcelizer(final Runnable runnable) {
        return RemoteActionCompatParcelizer(new Callable<Void>() { // from class: o.H264ReaderSampleReaderSliceHeaderData.1
            /* JADX INFO: Access modifiers changed from: private */
            @Override // java.util.concurrent.Callable
            /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
            public Void call() throws Exception {
                runnable.run();
                return null;
            }
        });
    }

    private <T> Continuation<Void, T> read(final Callable<T> callable) {
        return new Continuation<Void, T>() { // from class: o.H264ReaderSampleReaderSliceHeaderData.5
            @Override // com.google.android.gms.tasks.Continuation
            public final T then(Task<Void> task) throws Exception {
                return (T) callable.call();
            }
        };
    }

    private <T> Task<Void> IconCompatParcelizer(Task<T> task) {
        return task.continueWith(this.read, new Continuation<T, Void>() { // from class: o.H264ReaderSampleReaderSliceHeaderData.2
            @Override // com.google.android.gms.tasks.Continuation
            public final /* synthetic */ Void then(Task task2) throws Exception {
                return null;
            }
        });
    }

    public final <T> Task<T> RemoteActionCompatParcelizer(Callable<T> callable) {
        Task<T> taskContinueWith;
        synchronized (this.AudioAttributesCompatParcelizer) {
            taskContinueWith = this.RemoteActionCompatParcelizer.continueWith(this.read, read(callable));
            this.RemoteActionCompatParcelizer = IconCompatParcelizer(taskContinueWith);
        }
        return taskContinueWith;
    }

    public final <T> Task<T> write(Callable<Task<T>> callable) {
        Task<T> taskContinueWithTask;
        synchronized (this.AudioAttributesCompatParcelizer) {
            taskContinueWithTask = this.RemoteActionCompatParcelizer.continueWithTask(this.read, read(callable));
            this.RemoteActionCompatParcelizer = IconCompatParcelizer(taskContinueWithTask);
        }
        return taskContinueWithTask;
    }
}
