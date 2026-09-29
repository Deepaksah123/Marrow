package kotlin;

/* JADX INFO: loaded from: classes4.dex */
public final class getParams extends IllegalStateException {
    private Throwable write;

    getParams(String str, Throwable th) {
        super(str);
        this.write = th;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.write;
    }
}
