package kotlin;

/* JADX INFO: loaded from: classes4.dex */
final class getRawParameterType<T> extends isIncludableConstructor<T> {
    private final T read;
    private final int write;

    public getRawParameterType(T t, int i) {
        super(null);
        this.read = t;
        this.write = i;
    }

    public final T IconCompatParcelizer() {
        return this.read;
    }

    public final void read() {
        T t = this.read;
        if ((t != null ? t.hashCode() : 0) != this.write) {
            throw new IllegalStateException("Data in DataStore was mutated but DataStore is only compatible with Immutable types.".toString());
        }
    }
}
