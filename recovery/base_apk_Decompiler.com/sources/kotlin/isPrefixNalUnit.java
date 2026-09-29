package kotlin;

/* JADX INFO: loaded from: classes5.dex */
public enum isPrefixNalUnit {
    DEVELOPER(1),
    /* JADX INFO: Fake field, exist only in values array */
    USER_SIDELOAD(2),
    /* JADX INFO: Fake field, exist only in values array */
    TEST_DISTRIBUTION(3),
    APP_STORE(4);

    private final int read;

    isPrefixNalUnit(int i) {
        this.read = i;
    }

    public final int IconCompatParcelizer() {
        return this.read;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.read);
    }

    public static isPrefixNalUnit RemoteActionCompatParcelizer(String str) {
        return str != null ? APP_STORE : DEVELOPER;
    }
}
