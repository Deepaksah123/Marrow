package kotlin;

/* JADX INFO: loaded from: classes5.dex */
public final class FrameworkMediaDrmExternalSyntheticLambda0<T> implements setDescriptionList<T> {
    private static final Object IconCompatParcelizer = new Object();
    private volatile Object read = IconCompatParcelizer;
    private volatile setDescriptionList<T> write;

    private FrameworkMediaDrmExternalSyntheticLambda0(setDescriptionList<T> setdescriptionlist) {
        this.write = setdescriptionlist;
    }

    @Override // kotlin.setDescriptionList
    public final T get() {
        T t;
        T t2 = (T) this.read;
        Object obj = IconCompatParcelizer;
        if (t2 != obj) {
            return t2;
        }
        synchronized (this) {
            t = (T) this.read;
            if (t == obj) {
                t = this.write.get();
                this.read = RemoteActionCompatParcelizer(this.read, t);
                this.write = null;
            }
        }
        return t;
    }

    private static Object RemoteActionCompatParcelizer(Object obj, Object obj2) {
        if (obj == IconCompatParcelizer || (obj instanceof HttpMediaDrmCallback) || obj == obj2) {
            return obj2;
        }
        StringBuilder sb = new StringBuilder("Scoped provider was invoked recursively returning different results: ");
        sb.append(obj);
        sb.append(" & ");
        sb.append(obj2);
        sb.append(". This is likely due to a circular dependency.");
        throw new IllegalStateException(sb.toString());
    }

    public static <P extends setDescriptionList<T>, T> setDescriptionList<T> RemoteActionCompatParcelizer(P p) {
        return p instanceof FrameworkMediaDrmExternalSyntheticLambda0 ? p : new FrameworkMediaDrmExternalSyntheticLambda0(p);
    }
}
