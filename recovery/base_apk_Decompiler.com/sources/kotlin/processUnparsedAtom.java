package kotlin;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.AbstractOwnableSynchronizer;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: loaded from: classes5.dex */
abstract class processUnparsedAtom<T> extends AtomicReference<Runnable> implements Runnable {
    private static final Runnable AudioAttributesCompatParcelizer;
    private static final Runnable read;

    abstract boolean AudioAttributesCompatParcelizer();

    abstract void IconCompatParcelizer(Throwable th);

    abstract T RemoteActionCompatParcelizer() throws Exception;

    abstract String read();

    abstract void read(T t);

    processUnparsedAtom() {
    }

    static final class RemoteActionCompatParcelizer implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
        }

        private RemoteActionCompatParcelizer() {
        }

        /* synthetic */ RemoteActionCompatParcelizer(byte b) {
            this();
        }
    }

    static {
        byte b = 0;
        read = new RemoteActionCompatParcelizer(b);
        AudioAttributesCompatParcelizer = new RemoteActionCompatParcelizer(b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        Thread threadCurrentThread = Thread.currentThread();
        Object objRemoteActionCompatParcelizer = null;
        if (compareAndSet(null, threadCurrentThread)) {
            boolean zAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer();
            if (!zAudioAttributesCompatParcelizer) {
                try {
                    objRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
                } catch (Throwable th) {
                    try {
                        parsePsshAtom.IconCompatParcelizer(th);
                        if (!compareAndSet(threadCurrentThread, read)) {
                            write(threadCurrentThread);
                        }
                        if (zAudioAttributesCompatParcelizer) {
                            return;
                        }
                        IconCompatParcelizer(th);
                        return;
                    } finally {
                        if (!compareAndSet(threadCurrentThread, read)) {
                            write(threadCurrentThread);
                        }
                        if (!zAudioAttributesCompatParcelizer) {
                            read(isPsshAtom.IconCompatParcelizer(null));
                        }
                    }
                }
            }
        }
    }

    private void write(Thread thread) {
        Runnable runnable = get();
        read readVar = null;
        int i = 0;
        boolean z = false;
        while (true) {
            boolean z2 = runnable instanceof read;
            if (!z2 && runnable != AudioAttributesCompatParcelizer) {
                break;
            }
            if (z2) {
                readVar = (read) runnable;
            }
            i++;
            if (i > 1000) {
                Runnable runnable2 = AudioAttributesCompatParcelizer;
                if (runnable == runnable2 || compareAndSet(runnable, runnable2)) {
                    z = Thread.interrupted() || z;
                    LockSupport.park(readVar);
                }
            } else {
                Thread.yield();
            }
            runnable = get();
        }
        if (z) {
            thread.interrupt();
        }
    }

    final void write() {
        Runnable runnable = get();
        if (runnable instanceof Thread) {
            read readVar = new read(this, (byte) 0);
            readVar.read(Thread.currentThread());
            if (compareAndSet(runnable, readVar)) {
                try {
                    ((Thread) runnable).interrupt();
                } finally {
                    if (getAndSet(read) == AudioAttributesCompatParcelizer) {
                        LockSupport.unpark((Thread) runnable);
                    }
                }
            }
        }
    }

    static final class read extends AbstractOwnableSynchronizer implements Runnable {
        private final processUnparsedAtom<?> write;

        @Override // java.lang.Runnable
        public final void run() {
        }

        /* synthetic */ read(processUnparsedAtom processunparsedatom, byte b) {
            this(processunparsedatom);
        }

        private read(processUnparsedAtom<?> processunparsedatom) {
            this.write = processunparsedatom;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void read(Thread thread) {
            super.setExclusiveOwnerThread(thread);
        }

        public final String toString() {
            return this.write.toString();
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        String string;
        Runnable runnable = get();
        if (runnable == read) {
            string = "running=[DONE]";
        } else if (runnable instanceof read) {
            string = "running=[INTERRUPTED]";
        } else if (runnable instanceof Thread) {
            StringBuilder sb = new StringBuilder("running=[RUNNING ON ");
            sb.append(((Thread) runnable).getName());
            sb.append("]");
            string = sb.toString();
        } else {
            string = "running=[NOT STARTED YET]";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(string);
        sb2.append(", ");
        sb2.append(read());
        return sb2.toString();
    }
}
