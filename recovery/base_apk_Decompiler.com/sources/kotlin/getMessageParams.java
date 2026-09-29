package kotlin;

/* JADX INFO: loaded from: classes3.dex */
public final class getMessageParams<T> {
    private final Class<T> IconCompatParcelizer;
    private final T write;

    public final Class<T> IconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public final T read() {
        return this.write;
    }

    public final String toString() {
        return String.format("Event{type: %s, payload: %s}", null, null);
    }
}
