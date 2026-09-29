package kotlin;

import android.os.Looper;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes5.dex */
public final class parsePayloadMux {
    private static final ExecutorService IconCompatParcelizer = latmGetValue.IconCompatParcelizer("awaitEvenIfOnMainThread task continuation executor");

    public static <T> Task<T> read(Task<T> task, Task<T> task2) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        Continuation<T, TContinuationResult> continuation = new Continuation() { // from class: o.NalUnitTargetBuffer
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task3) {
                return parsePayloadMux.IconCompatParcelizer(taskCompletionSource, task3);
            }
        };
        task.continueWith(continuation);
        task2.continueWith(continuation);
        return taskCompletionSource.getTask();
    }

    static /* synthetic */ Void IconCompatParcelizer(TaskCompletionSource taskCompletionSource, Task task) throws Exception {
        if (task.isSuccessful()) {
            taskCompletionSource.trySetResult(task.getResult());
            return null;
        }
        if (task.getException() == null) {
            return null;
        }
        taskCompletionSource.trySetException(task.getException());
        return null;
    }

    public static <T> Task<T> IconCompatParcelizer(Executor executor, Task<T> task, Task<T> task2) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        Continuation<T, TContinuationResult> continuation = new Continuation() { // from class: o.readFrameRemainder
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task3) {
                return parsePayloadMux.write(taskCompletionSource, task3);
            }
        };
        task.continueWith(executor, continuation);
        task2.continueWith(executor, continuation);
        return taskCompletionSource.getTask();
    }

    static /* synthetic */ Void write(TaskCompletionSource taskCompletionSource, Task task) throws Exception {
        if (task.isSuccessful()) {
            taskCompletionSource.trySetResult(task.getResult());
            return null;
        }
        if (task.getException() == null) {
            return null;
        }
        taskCompletionSource.trySetException(task.getException());
        return null;
    }

    public static <T> Task<T> AudioAttributesCompatParcelizer(final Executor executor, final Callable<Task<T>> callable) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        executor.execute(new Runnable() { // from class: o.readHeaderRemainder
            @Override // java.lang.Runnable
            public final void run() {
                parsePayloadMux.AudioAttributesCompatParcelizer(callable, executor, taskCompletionSource);
            }
        });
        return taskCompletionSource.getTask();
    }

    static /* synthetic */ void AudioAttributesCompatParcelizer(Callable callable, Executor executor, final TaskCompletionSource taskCompletionSource) {
        try {
            ((Task) callable.call()).continueWith(executor, new Continuation() { // from class: o.PassthroughSectionPayloadReader
                @Override // com.google.android.gms.tasks.Continuation
                public final Object then(Task task) {
                    return parsePayloadMux.AudioAttributesCompatParcelizer(taskCompletionSource, task);
                }
            });
        } catch (Exception e) {
            taskCompletionSource.setException(e);
        }
    }

    static /* synthetic */ Object AudioAttributesCompatParcelizer(TaskCompletionSource taskCompletionSource, Task task) throws Exception {
        if (task.isSuccessful()) {
            taskCompletionSource.setResult(task.getResult());
            return null;
        }
        if (task.getException() == null) {
            return null;
        }
        taskCompletionSource.setException(task.getException());
        return null;
    }

    public static <T> T RemoteActionCompatParcelizer(Task<T> task) throws InterruptedException, TimeoutException {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        task.continueWith(IconCompatParcelizer, new Continuation() { // from class: o.isCompleted
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task2) {
                return parsePayloadMux.RemoteActionCompatParcelizer(countDownLatch);
            }
        });
        if (Looper.getMainLooper() == Looper.myLooper()) {
            countDownLatch.await(3L, TimeUnit.SECONDS);
        } else {
            countDownLatch.await(4L, TimeUnit.SECONDS);
        }
        if (task.isSuccessful()) {
            return task.getResult();
        }
        if (task.isCanceled()) {
            throw new CancellationException("Task is already canceled");
        }
        if (task.isComplete()) {
            throw new IllegalStateException(task.getException());
        }
        throw new TimeoutException();
    }

    static /* synthetic */ Object RemoteActionCompatParcelizer(CountDownLatch countDownLatch) throws Exception {
        countDownLatch.countDown();
        return null;
    }

    public static boolean write(CountDownLatch countDownLatch, TimeUnit timeUnit) {
        boolean z = false;
        try {
            long nanos = timeUnit.toNanos(2L);
            long jNanoTime = nanos;
            while (true) {
                try {
                    break;
                } catch (InterruptedException unused) {
                    z = true;
                    jNanoTime = (System.nanoTime() + nanos) - System.nanoTime();
                }
            }
            return countDownLatch.await(jNanoTime, TimeUnit.NANOSECONDS);
        } finally {
            if (z) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
