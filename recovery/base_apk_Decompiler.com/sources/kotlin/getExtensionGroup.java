package kotlin;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes4.dex */
public final class getExtensionGroup extends AtomicReferenceArray<Object> implements Runnable, Callable<Object>, MarkIncompleteResponseBody {
    private Runnable RemoteActionCompatParcelizer;
    private static Object AudioAttributesCompatParcelizer = new Object();
    private static Object read = new Object();
    private static Object write = new Object();
    private static Object IconCompatParcelizer = new Object();

    public getExtensionGroup(Runnable runnable, getFilterType getfiltertype) {
        super(3);
        this.RemoteActionCompatParcelizer = runnable;
        lazySet(0, getfiltertype);
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        run();
        return null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        Object obj2;
        Object obj3;
        boolean zCompareAndSet;
        Object obj4;
        lazySet(2, Thread.currentThread());
        try {
            this.RemoteActionCompatParcelizer.run();
        } finally {
            try {
            } catch (Throwable th) {
                do {
                    if (obj == obj2) {
                        break;
                    } else if (obj == obj3) {
                        break;
                    }
                } while (!zCompareAndSet);
            }
        }
        lazySet(2, null);
        Object obj5 = get(0);
        if (obj5 != AudioAttributesCompatParcelizer && compareAndSet(0, obj5, IconCompatParcelizer) && obj5 != null) {
            ((getFilterType) obj5).IconCompatParcelizer(this);
        }
        do {
            obj4 = get(1);
            if (obj4 == read || obj4 == write) {
                return;
            }
        } while (!compareAndSet(1, obj4, IconCompatParcelizer));
    }

    public final void AudioAttributesCompatParcelizer(Future<?> future) {
        Object obj;
        do {
            obj = get(1);
            if (obj == IconCompatParcelizer) {
                return;
            }
            if (obj == read) {
                future.cancel(false);
                return;
            } else if (obj == write) {
                future.cancel(true);
                return;
            }
        } while (!compareAndSet(1, obj, future));
    }

    @Override // kotlin.MarkIncompleteResponseBody
    public final void aL_() {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        while (true) {
            Object obj5 = get(1);
            if (obj5 == IconCompatParcelizer || obj5 == (obj3 = read) || obj5 == (obj4 = write)) {
                break;
            }
            boolean z = get(2) != Thread.currentThread();
            if (z) {
                obj3 = obj4;
            }
            if (compareAndSet(1, obj5, obj3)) {
                if (obj5 != null) {
                    ((Future) obj5).cancel(z);
                }
            }
        }
        do {
            obj = get(0);
            if (obj == IconCompatParcelizer || obj == (obj2 = AudioAttributesCompatParcelizer) || obj == null) {
                return;
            }
        } while (!compareAndSet(0, obj, obj2));
        ((getFilterType) obj).IconCompatParcelizer(this);
    }

    @Override // kotlin.MarkIncompleteResponseBody
    public final boolean write() {
        Object obj = get(0);
        return obj == AudioAttributesCompatParcelizer || obj == IconCompatParcelizer;
    }
}
