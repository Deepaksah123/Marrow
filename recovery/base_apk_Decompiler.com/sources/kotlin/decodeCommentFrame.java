package kotlin;

import com.google.android.gms.tasks.OnCanceledListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes3.dex */
public class decodeCommentFrame {
    private Task<decodeGeobFrame> AudioAttributesCompatParcelizer = null;
    private final Executor IconCompatParcelizer;
    private final removeUnsynchronization read;
    private static final Map<String, decodeCommentFrame> write = new HashMap();
    private static final Executor RemoteActionCompatParcelizer = new ObjectIdWriter();

    private decodeCommentFrame(Executor executor, removeUnsynchronization removeunsynchronization) {
        this.IconCompatParcelizer = executor;
        this.read = removeunsynchronization;
    }

    public final decodeGeobFrame AudioAttributesCompatParcelizer() {
        return RemoteActionCompatParcelizer();
    }

    private decodeGeobFrame RemoteActionCompatParcelizer() {
        synchronized (this) {
            Task<decodeGeobFrame> task = this.AudioAttributesCompatParcelizer;
            if (task != null && task.isSuccessful()) {
                return this.AudioAttributesCompatParcelizer.getResult();
            }
            try {
                return (decodeGeobFrame) write(read(), 5L, TimeUnit.SECONDS);
            } catch (InterruptedException | ExecutionException | TimeoutException unused) {
                return null;
            }
        }
    }

    public final Task<decodeGeobFrame> RemoteActionCompatParcelizer(decodeGeobFrame decodegeobframe) {
        return AudioAttributesCompatParcelizer(decodegeobframe);
    }

    private Task<decodeGeobFrame> AudioAttributesCompatParcelizer(final decodeGeobFrame decodegeobframe) {
        final boolean z = true;
        return Tasks.call(this.IconCompatParcelizer, new Callable() { // from class: o.decodeFrame
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.AudioAttributesCompatParcelizer.read(decodegeobframe);
            }
        }).onSuccessTask(this.IconCompatParcelizer, new SuccessContinuation(z, decodegeobframe) { // from class: o.decodeHeader
            private /* synthetic */ boolean IconCompatParcelizer = true;
            private /* synthetic */ decodeGeobFrame write;

            {
                this.write = decodegeobframe;
            }

            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                return this.read.IconCompatParcelizer(this.IconCompatParcelizer, this.write);
            }
        });
    }

    final /* synthetic */ Void read(decodeGeobFrame decodegeobframe) throws Exception {
        return this.read.RemoteActionCompatParcelizer(decodegeobframe);
    }

    final /* synthetic */ Task IconCompatParcelizer(boolean z, decodeGeobFrame decodegeobframe) throws Exception {
        if (z) {
            IconCompatParcelizer(decodegeobframe);
        }
        return Tasks.forResult(decodegeobframe);
    }

    public final Task<decodeGeobFrame> read() {
        Task<decodeGeobFrame> task;
        synchronized (this) {
            Task<decodeGeobFrame> task2 = this.AudioAttributesCompatParcelizer;
            if (task2 == null || (task2.isComplete() && !this.AudioAttributesCompatParcelizer.isSuccessful())) {
                Executor executor = this.IconCompatParcelizer;
                final removeUnsynchronization removeunsynchronization = this.read;
                Objects.requireNonNull(removeunsynchronization);
                this.AudioAttributesCompatParcelizer = Tasks.call(executor, new Callable() { // from class: o.decodeChapterTOCFrame
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return removeunsynchronization.AudioAttributesCompatParcelizer();
                    }
                });
            }
            task = this.AudioAttributesCompatParcelizer;
        }
        return task;
    }

    public final void IconCompatParcelizer() {
        synchronized (this) {
            this.AudioAttributesCompatParcelizer = Tasks.forResult(null);
        }
        this.read.write();
    }

    private void IconCompatParcelizer(decodeGeobFrame decodegeobframe) {
        synchronized (this) {
            this.AudioAttributesCompatParcelizer = Tasks.forResult(decodegeobframe);
        }
    }

    public static decodeCommentFrame read(Executor executor, removeUnsynchronization removeunsynchronization) {
        decodeCommentFrame decodecommentframe;
        synchronized (decodeCommentFrame.class) {
            String str = removeunsynchronization.read();
            Map<String, decodeCommentFrame> map = write;
            if (!map.containsKey(str)) {
                map.put(str, new decodeCommentFrame(executor, removeunsynchronization));
            }
            decodecommentframe = map.get(str);
        }
        return decodecommentframe;
    }

    private static <TResult> TResult write(Task<TResult> task, long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        read readVar = new read((byte) 0);
        Executor executor = RemoteActionCompatParcelizer;
        task.addOnSuccessListener(executor, readVar);
        task.addOnFailureListener(executor, readVar);
        task.addOnCanceledListener(executor, readVar);
        if (!readVar.read(5L, timeUnit)) {
            throw new TimeoutException("Task await timed out.");
        }
        if (task.isSuccessful()) {
            return task.getResult();
        }
        throw new ExecutionException(task.getException());
    }

    static class read<TResult> implements OnSuccessListener<TResult>, OnFailureListener, OnCanceledListener {
        private final CountDownLatch RemoteActionCompatParcelizer;

        private read() {
            this.RemoteActionCompatParcelizer = new CountDownLatch(1);
        }

        /* synthetic */ read(byte b) {
            this();
        }

        @Override // com.google.android.gms.tasks.OnSuccessListener
        public final void onSuccess(TResult tresult) {
            this.RemoteActionCompatParcelizer.countDown();
        }

        @Override // com.google.android.gms.tasks.OnFailureListener
        public final void onFailure(Exception exc) {
            this.RemoteActionCompatParcelizer.countDown();
        }

        @Override // com.google.android.gms.tasks.OnCanceledListener
        public final void onCanceled() {
            this.RemoteActionCompatParcelizer.countDown();
        }

        public final boolean read(long j, TimeUnit timeUnit) throws InterruptedException {
            return this.RemoteActionCompatParcelizer.await(j, timeUnit);
        }
    }
}
