package kotlin;

/* JADX INFO: loaded from: classes4.dex */
final class getImageV2Url<T> {
    private final T read;
    private final Thread write = Thread.currentThread();

    getImageV2Url(T t) {
        this.read = t;
    }

    public final boolean IconCompatParcelizer() {
        return this.write == Thread.currentThread();
    }

    public final T AudioAttributesCompatParcelizer() {
        if (!IconCompatParcelizer()) {
            throw new IllegalStateException("No value in this thread (hasValue should be checked before)");
        }
        return this.read;
    }
}
