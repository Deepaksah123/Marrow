package kotlin;

import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes5.dex */
final class setReadingId3HeaderState implements Executor {
    private static final Logger AudioAttributesCompatParcelizer = Logger.getLogger(setReadingId3HeaderState.class.getName());
    private final Executor RemoteActionCompatParcelizer;
    private final Deque<Runnable> read = new ArrayDeque();
    private IconCompatParcelizer MediaBrowserCompatCustomActionResultReceiver = IconCompatParcelizer.IDLE;
    private long IconCompatParcelizer = 0;
    private final read write = new read(this, 0);

    enum IconCompatParcelizer {
        IDLE,
        QUEUING,
        QUEUED,
        RUNNING
    }

    static /* synthetic */ long AudioAttributesCompatParcelizer(setReadingId3HeaderState setreadingid3headerstate) {
        long j = setreadingid3headerstate.IconCompatParcelizer;
        setreadingid3headerstate.IconCompatParcelizer = 1 + j;
        return j;
    }

    setReadingId3HeaderState(Executor executor) {
        this.RemoteActionCompatParcelizer = (Executor) Preconditions.checkNotNull(executor);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(final Runnable runnable) {
        Preconditions.checkNotNull(runnable);
        synchronized (this.read) {
            if (this.MediaBrowserCompatCustomActionResultReceiver != IconCompatParcelizer.RUNNING && this.MediaBrowserCompatCustomActionResultReceiver != IconCompatParcelizer.QUEUED) {
                long j = this.IconCompatParcelizer;
                Runnable runnable2 = new Runnable() { // from class: o.setReadingId3HeaderState.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        runnable.run();
                    }

                    public final String toString() {
                        return runnable.toString();
                    }
                };
                this.read.add(runnable2);
                this.MediaBrowserCompatCustomActionResultReceiver = IconCompatParcelizer.QUEUING;
                try {
                    this.RemoteActionCompatParcelizer.execute(this.write);
                    if (this.MediaBrowserCompatCustomActionResultReceiver != IconCompatParcelizer.QUEUING) {
                        return;
                    }
                    synchronized (this.read) {
                        if (this.IconCompatParcelizer == j && this.MediaBrowserCompatCustomActionResultReceiver == IconCompatParcelizer.QUEUING) {
                            this.MediaBrowserCompatCustomActionResultReceiver = IconCompatParcelizer.QUEUED;
                        }
                    }
                    return;
                } catch (Error | RuntimeException e) {
                    synchronized (this.read) {
                        boolean z = (this.MediaBrowserCompatCustomActionResultReceiver == IconCompatParcelizer.IDLE || this.MediaBrowserCompatCustomActionResultReceiver == IconCompatParcelizer.QUEUING) && this.read.removeLastOccurrence(runnable2);
                        if (!(e instanceof RejectedExecutionException) || z) {
                            throw e;
                        }
                        return;
                    }
                }
            }
            this.read.add(runnable);
        }
    }

    final class read implements Runnable {
        private Runnable AudioAttributesCompatParcelizer;

        private read() {
        }

        /* synthetic */ read(setReadingId3HeaderState setreadingid3headerstate, byte b) {
            this();
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                AudioAttributesCompatParcelizer();
            } catch (Error e) {
                synchronized (setReadingId3HeaderState.this.read) {
                    setReadingId3HeaderState.this.MediaBrowserCompatCustomActionResultReceiver = IconCompatParcelizer.IDLE;
                    throw e;
                }
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0036, code lost:
        
            r8.RemoteActionCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver = o.setReadingId3HeaderState.IconCompatParcelizer.write;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x003e, code lost:
        
            if (r0 != false) goto L18;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x004e, code lost:
        
            r0 = r0 | java.lang.Thread.interrupted();
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0050, code lost:
        
            r8.AudioAttributesCompatParcelizer.run();
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0056, code lost:
        
            r1 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x0058, code lost:
        
            r3 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x0059, code lost:
        
            r4 = kotlin.setReadingId3HeaderState.AudioAttributesCompatParcelizer;
            r5 = java.util.logging.Level.SEVERE;
            r6 = new java.lang.StringBuilder();
            r6.append("Exception while executing runnable ");
            r6.append(r8.AudioAttributesCompatParcelizer);
            r4.log(r5, r6.toString(), (java.lang.Throwable) r3);
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x0078, code lost:
        
            r8.AudioAttributesCompatParcelizer = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x007a, code lost:
        
            throw r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:48:?, code lost:
        
            return;
         */
        /* JADX WARN: Removed duplicated region for block: B:37:0x0081  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private void AudioAttributesCompatParcelizer() {
            /*
                r8 = this;
                r0 = 0
                r1 = r0
            L2:
                o.setReadingId3HeaderState r2 = kotlin.setReadingId3HeaderState.this     // Catch: java.lang.Throwable -> L7e
                java.util.Deque r2 = kotlin.setReadingId3HeaderState.IconCompatParcelizer(r2)     // Catch: java.lang.Throwable -> L7e
                monitor-enter(r2)     // Catch: java.lang.Throwable -> L7e
                if (r1 != 0) goto L26
                o.setReadingId3HeaderState r1 = kotlin.setReadingId3HeaderState.this     // Catch: java.lang.Throwable -> L7b
                o.setReadingId3HeaderState$IconCompatParcelizer r1 = kotlin.setReadingId3HeaderState.read(r1)     // Catch: java.lang.Throwable -> L7b
                o.setReadingId3HeaderState$IconCompatParcelizer r3 = o.setReadingId3HeaderState.IconCompatParcelizer.RUNNING     // Catch: java.lang.Throwable -> L7b
                if (r1 != r3) goto L19
                monitor-exit(r2)
                if (r0 == 0) goto L40
                goto L41
            L19:
                o.setReadingId3HeaderState r1 = kotlin.setReadingId3HeaderState.this     // Catch: java.lang.Throwable -> L7b
                kotlin.setReadingId3HeaderState.AudioAttributesCompatParcelizer(r1)     // Catch: java.lang.Throwable -> L7b
                o.setReadingId3HeaderState r1 = kotlin.setReadingId3HeaderState.this     // Catch: java.lang.Throwable -> L7b
                o.setReadingId3HeaderState$IconCompatParcelizer r3 = o.setReadingId3HeaderState.IconCompatParcelizer.RUNNING     // Catch: java.lang.Throwable -> L7b
                kotlin.setReadingId3HeaderState.RemoteActionCompatParcelizer(r1, r3)     // Catch: java.lang.Throwable -> L7b
                r1 = 1
            L26:
                o.setReadingId3HeaderState r3 = kotlin.setReadingId3HeaderState.this     // Catch: java.lang.Throwable -> L7b
                java.util.Deque r3 = kotlin.setReadingId3HeaderState.IconCompatParcelizer(r3)     // Catch: java.lang.Throwable -> L7b
                java.lang.Object r3 = r3.poll()     // Catch: java.lang.Throwable -> L7b
                java.lang.Runnable r3 = (java.lang.Runnable) r3     // Catch: java.lang.Throwable -> L7b
                r8.AudioAttributesCompatParcelizer = r3     // Catch: java.lang.Throwable -> L7b
                if (r3 != 0) goto L49
                o.setReadingId3HeaderState r8 = kotlin.setReadingId3HeaderState.this     // Catch: java.lang.Throwable -> L7b
                o.setReadingId3HeaderState$IconCompatParcelizer r1 = o.setReadingId3HeaderState.IconCompatParcelizer.IDLE     // Catch: java.lang.Throwable -> L7b
                kotlin.setReadingId3HeaderState.RemoteActionCompatParcelizer(r8, r1)     // Catch: java.lang.Throwable -> L7b
                monitor-exit(r2)
                if (r0 != 0) goto L41
            L40:
                return
            L41:
                java.lang.Thread r8 = java.lang.Thread.currentThread()
                r8.interrupt()
                return
            L49:
                monitor-exit(r2)
                boolean r2 = java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> L7e
                r0 = r0 | r2
                r2 = 0
                java.lang.Runnable r3 = r8.AudioAttributesCompatParcelizer     // Catch: java.lang.Throwable -> L56 java.lang.RuntimeException -> L58
                r3.run()     // Catch: java.lang.Throwable -> L56 java.lang.RuntimeException -> L58
                goto L75
            L56:
                r1 = move-exception
                goto L78
            L58:
                r3 = move-exception
                java.util.logging.Logger r4 = kotlin.setReadingId3HeaderState.RemoteActionCompatParcelizer()     // Catch: java.lang.Throwable -> L56
                java.util.logging.Level r5 = java.util.logging.Level.SEVERE     // Catch: java.lang.Throwable -> L56
                java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L56
                r6.<init>()     // Catch: java.lang.Throwable -> L56
                java.lang.String r7 = "Exception while executing runnable "
                r6.append(r7)     // Catch: java.lang.Throwable -> L56
                java.lang.Runnable r7 = r8.AudioAttributesCompatParcelizer     // Catch: java.lang.Throwable -> L56
                r6.append(r7)     // Catch: java.lang.Throwable -> L56
                java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L56
                r4.log(r5, r6, r3)     // Catch: java.lang.Throwable -> L56
            L75:
                r8.AudioAttributesCompatParcelizer = r2     // Catch: java.lang.Throwable -> L7e
                goto L2
            L78:
                r8.AudioAttributesCompatParcelizer = r2     // Catch: java.lang.Throwable -> L7e
                throw r1     // Catch: java.lang.Throwable -> L7e
            L7b:
                r8 = move-exception
                monitor-exit(r2)
                throw r8     // Catch: java.lang.Throwable -> L7e
            L7e:
                r8 = move-exception
                if (r0 == 0) goto L88
                java.lang.Thread r0 = java.lang.Thread.currentThread()
                r0.interrupt()
            L88:
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: o.setReadingId3HeaderState.read.AudioAttributesCompatParcelizer():void");
        }

        public final String toString() {
            Runnable runnable = this.AudioAttributesCompatParcelizer;
            if (runnable != null) {
                StringBuilder sb = new StringBuilder("SequentialExecutorWorker{running=");
                sb.append(runnable);
                sb.append("}");
                return sb.toString();
            }
            StringBuilder sb2 = new StringBuilder("SequentialExecutorWorker{state=");
            sb2.append(setReadingId3HeaderState.this.MediaBrowserCompatCustomActionResultReceiver);
            sb2.append("}");
            return sb2.toString();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SequentialExecutor@");
        sb.append(System.identityHashCode(this));
        sb.append("{");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append("}");
        return sb.toString();
    }
}
