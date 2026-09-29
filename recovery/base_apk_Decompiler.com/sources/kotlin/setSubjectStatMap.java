package kotlin;

/* JADX INFO: loaded from: classes4.dex */
public final class setSubjectStatMap<T> implements getTestId<T> {
    private static final Object write = new Object();
    private volatile Object AudioAttributesCompatParcelizer = write;
    private volatile getTestId<T> read;

    private setSubjectStatMap(getTestId<T> gettestid) {
        this.read = gettestid;
    }

    @Override // kotlin.setDescriptionList
    public final T get() {
        T t = (T) this.AudioAttributesCompatParcelizer;
        if (t != write) {
            return t;
        }
        getTestId<T> gettestid = this.read;
        if (gettestid == null) {
            return (T) this.AudioAttributesCompatParcelizer;
        }
        T t2 = gettestid.get();
        this.AudioAttributesCompatParcelizer = t2;
        this.read = null;
        return t2;
    }

    public static <T> getTestId<T> write(getTestId<T> gettestid) {
        return new setSubjectStatMap((getTestId) setPossibleScore.RemoteActionCompatParcelizer(gettestid));
    }
}
