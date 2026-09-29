package kotlin;

/* JADX INFO: loaded from: classes4.dex */
public final class setHideRunner extends IllegalStateException {
    private Throwable RemoteActionCompatParcelizer;

    public setHideRunner(String str) {
        super(str);
    }

    public setHideRunner(String str, Throwable th) {
        super(str);
        this.RemoteActionCompatParcelizer = th;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.RemoteActionCompatParcelizer;
    }
}
