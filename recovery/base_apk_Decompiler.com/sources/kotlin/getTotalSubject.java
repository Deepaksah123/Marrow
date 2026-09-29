package kotlin;

/* JADX INFO: loaded from: classes4.dex */
public enum getTotalSubject {
    INVARIANT("", true, true, 0),
    IN_VARIANCE("in", true, false, -1),
    OUT_VARIANCE("out", false, true, 1);

    private final String AudioAttributesImplApi21Parcelizer;
    private final int AudioAttributesImplApi26Parcelizer;
    private final boolean AudioAttributesImplBaseParcelizer;
    private final boolean write;

    getTotalSubject(String str, boolean z, boolean z2, int i) {
        this.AudioAttributesImplApi21Parcelizer = str;
        this.write = z;
        this.AudioAttributesImplBaseParcelizer = z2;
        this.AudioAttributesImplApi26Parcelizer = i;
    }

    public final String AudioAttributesCompatParcelizer() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    public final boolean RemoteActionCompatParcelizer() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.AudioAttributesImplApi21Parcelizer;
    }
}
