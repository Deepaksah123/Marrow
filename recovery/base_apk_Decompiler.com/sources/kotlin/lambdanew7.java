package kotlin;

/* JADX INFO: loaded from: classes2.dex */
public enum lambdanew7 {
    FALSE(20),
    TRUE(21),
    NULL(22),
    UNDEFINED(23),
    RESERVED(0),
    UNALLOCATED(0);

    private final int AudioAttributesImplApi21Parcelizer;

    lambdanew7(int i) {
        this.AudioAttributesImplApi21Parcelizer = i;
    }

    public final int IconCompatParcelizer() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    public static lambdanew7 RemoteActionCompatParcelizer(int i) {
        switch (i & 31) {
            case 20:
                return FALSE;
            case 21:
                return TRUE;
            case 22:
                return NULL;
            case 23:
                return UNDEFINED;
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
                return RESERVED;
            default:
                return UNALLOCATED;
        }
    }
}
