package kotlin;

/* JADX INFO: loaded from: classes2.dex */
public enum lambdanew0 {
    DIRECT(0),
    ONE_BYTE(24),
    TWO_BYTES(25),
    FOUR_BYTES(26),
    EIGHT_BYTES(27),
    RESERVED(28),
    INDEFINITE(31);

    private final int AudioAttributesImplApi21Parcelizer;

    lambdanew0(int i) {
        this.AudioAttributesImplApi21Parcelizer = i;
    }

    public static lambdanew0 AudioAttributesCompatParcelizer(int i) {
        switch (i & 31) {
            case 24:
                return ONE_BYTE;
            case 25:
                return TWO_BYTES;
            case 26:
                return FOUR_BYTES;
            case 27:
                return EIGHT_BYTES;
            case 28:
            case 29:
            case 30:
                return RESERVED;
            case 31:
                return INDEFINITE;
            default:
                return DIRECT;
        }
    }
}
