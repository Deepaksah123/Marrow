package kotlin;

import android.os.Binder;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
abstract class expectAnyFormat<Result> {
    private static Handler IconCompatParcelizer;
    private volatile RemoteActionCompatParcelizer read = RemoteActionCompatParcelizer.PENDING;
    final AtomicBoolean AudioAttributesCompatParcelizer = new AtomicBoolean();
    final AtomicBoolean write = new AtomicBoolean();
    private final FutureTask<Result> RemoteActionCompatParcelizer = new FutureTask<Result>(new Callable<Result>() { // from class: o.expectAnyFormat.5
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // java.util.concurrent.Callable
        public final Result call() {
            expectAnyFormat.this.write.set(true);
            Result result = null;
            try {
                Process.setThreadPriority(10);
                result = (Result) expectAnyFormat.this.read();
                Binder.flushPendingCommands();
                return result;
            } finally {
            }
        }
    }) { // from class: o.expectAnyFormat.1
        @Override // java.util.concurrent.FutureTask
        protected final void done() {
            try {
                expectAnyFormat.this.AudioAttributesCompatParcelizer(get());
            } catch (InterruptedException unused) {
            } catch (CancellationException unused2) {
                expectAnyFormat.this.AudioAttributesCompatParcelizer(null);
            } catch (ExecutionException e) {
                throw new RuntimeException("An error occurred while executing doInBackground()", e.getCause());
            } catch (Throwable th) {
                throw new RuntimeException("An error occurred while executing doInBackground()", th);
            }
        }
    };

    public enum RemoteActionCompatParcelizer {
        PENDING,
        RUNNING,
        FINISHED
    }

    protected void IconCompatParcelizer(Result result) {
    }

    protected abstract Result read();

    protected void read(Result result) {
    }

    private static Handler AudioAttributesCompatParcelizer() {
        Handler handler;
        synchronized (expectAnyFormat.class) {
            if (IconCompatParcelizer == null) {
                IconCompatParcelizer = new Handler(Looper.getMainLooper());
            }
            handler = IconCompatParcelizer;
        }
        return handler;
    }

    expectAnyFormat() {
    }

    final void AudioAttributesCompatParcelizer(Result result) {
        if (this.write.get()) {
            return;
        }
        write(result);
    }

    final void write(final Result result) {
        AudioAttributesCompatParcelizer().post(new Runnable() { // from class: o.expectAnyFormat.3
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public final void run() {
                expectAnyFormat.this.RemoteActionCompatParcelizer(result);
            }
        });
    }

    public final boolean IconCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer.get();
    }

    public final boolean RemoteActionCompatParcelizer(boolean z) {
        this.AudioAttributesCompatParcelizer.set(true);
        return this.RemoteActionCompatParcelizer.cancel(false);
    }

    /* JADX INFO: renamed from: o.expectAnyFormat$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] read;

        static {
            int[] iArr = new int[RemoteActionCompatParcelizer.values().length];
            read = iArr;
            try {
                iArr[RemoteActionCompatParcelizer.RUNNING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                read[RemoteActionCompatParcelizer.FINISHED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public final void write(Executor executor) {
        if (this.read != RemoteActionCompatParcelizer.PENDING) {
            int i = AnonymousClass2.read[this.read.ordinal()];
            if (i == 1) {
                throw new IllegalStateException("Cannot execute task: the task is already running.");
            }
            if (i == 2) {
                throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
            }
            throw new IllegalStateException("We should never reach this state");
        }
        this.read = RemoteActionCompatParcelizer.RUNNING;
        executor.execute(this.RemoteActionCompatParcelizer);
    }

    final void RemoteActionCompatParcelizer(Result result) {
        if (IconCompatParcelizer()) {
            read(result);
        } else {
            IconCompatParcelizer(result);
        }
        this.read = RemoteActionCompatParcelizer.FINISHED;
    }
}
