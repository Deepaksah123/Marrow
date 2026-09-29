package kotlin;

/* JADX INFO: loaded from: classes.dex */
public final class setScore implements getModifiedScore<Object> {
    private final GtaModelCreator RemoteActionCompatParcelizer;
    private volatile Object read;
    private final Object write = new Object();

    public setScore(GtaModelCreator gtaModelCreator) {
        this.RemoteActionCompatParcelizer = gtaModelCreator;
    }

    @Override // kotlin.getModifiedScore
    public final Object af_() {
        if (this.read == null) {
            synchronized (this.write) {
                if (this.read == null) {
                    this.read = this.RemoteActionCompatParcelizer.write();
                }
            }
        }
        return this.read;
    }
}
