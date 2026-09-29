package kotlin;

/* JADX INFO: loaded from: classes4.dex */
public enum getItemTitle {
    IN("in"),
    OUT("out"),
    INV("");

    private final String write;

    getItemTitle(String str) {
        this.write = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.write;
    }
}
