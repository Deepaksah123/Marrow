package kotlin;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class OrderDetails {
    public static final Throwable RemoteActionCompatParcelizer = new read();

    public static RuntimeException RemoteActionCompatParcelizer(Throwable th) {
        if (th instanceof Error) {
            throw ((Error) th);
        }
        if (th instanceof RuntimeException) {
            return (RuntimeException) th;
        }
        return new RuntimeException(th);
    }

    public static <T> boolean write(AtomicReference<Throwable> atomicReference, Throwable th) {
        Throwable th2;
        do {
            th2 = atomicReference.get();
            if (th2 == RemoteActionCompatParcelizer) {
                return false;
            }
        } while (!setBackInvokedCallbackEnabled.read(atomicReference, th2, th2 == null ? th : new getPytIds(th2, th)));
        return true;
    }

    public static <T> Throwable write(AtomicReference<Throwable> atomicReference) {
        Throwable th = atomicReference.get();
        Throwable th2 = RemoteActionCompatParcelizer;
        return th != th2 ? atomicReference.getAndSet(th2) : th;
    }

    static final class read extends Throwable {
        @Override // java.lang.Throwable
        public final Throwable fillInStackTrace() {
            return this;
        }

        public read() {
            super("No further exceptions");
        }
    }
}
