package kotlin;

import dagger.Lazy;

/* JADX INFO: loaded from: classes4.dex */
public final class TestProgress<T> implements getTestId<T>, Lazy<T> {
    private static final Object write = new Object();
    private volatile getTestId<T> IconCompatParcelizer;
    private volatile Object read = write;

    private TestProgress(getTestId<T> gettestid) {
        this.IconCompatParcelizer = gettestid;
    }

    @Override // kotlin.setDescriptionList
    public final T get() {
        T t = (T) this.read;
        return t == write ? (T) read() : t;
    }

    private Object read() {
        Object obj;
        synchronized (this) {
            obj = this.read;
            if (obj == write) {
                obj = this.IconCompatParcelizer.get();
                this.read = read(this.read, obj);
                this.IconCompatParcelizer = null;
            }
        }
        return obj;
    }

    private static Object read(Object obj, Object obj2) {
        if (obj == write || obj == obj2) {
            return obj2;
        }
        StringBuilder sb = new StringBuilder("Scoped provider was invoked recursively returning different results: ");
        sb.append(obj);
        sb.append(" & ");
        sb.append(obj2);
        sb.append(". This is likely due to a circular dependency.");
        throw new IllegalStateException(sb.toString());
    }

    public static <T> getTestId<T> write(getTestId<T> gettestid) {
        return gettestid instanceof TestProgress ? gettestid : new TestProgress(gettestid);
    }

    @Deprecated
    public static <P extends setDescriptionList<T>, T> setDescriptionList<T> read(P p) {
        return write(setRank.write(p));
    }

    public static <T> Lazy<T> IconCompatParcelizer(getTestId<T> gettestid) {
        if (gettestid instanceof Lazy) {
            return (Lazy) gettestid;
        }
        return new TestProgress((getTestId) setPossibleScore.RemoteActionCompatParcelizer(gettestid));
    }
}
