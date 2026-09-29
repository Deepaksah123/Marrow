package kotlin;

/* JADX INFO: loaded from: classes5.dex */
public abstract class XingSeeker {
    public abstract long read();

    public abstract int write();

    public static XingSeeker RemoteActionCompatParcelizer(int i, long j) {
        return new Atom(i, j);
    }
}
