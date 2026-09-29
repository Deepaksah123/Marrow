package kotlin;

/* JADX INFO: loaded from: classes2.dex */
public enum seekToInternal {
    NORMAL,
    MULTIPLY,
    SCREEN,
    OVERLAY,
    DARKEN,
    LIGHTEN,
    COLOR_DODGE,
    COLOR_BURN,
    HARD_LIGHT,
    SOFT_LIGHT,
    DIFFERENCE,
    EXCLUSION,
    HUE,
    SATURATION,
    COLOR,
    LUMINOSITY,
    ADD,
    HARD_MIX;

    public final _parseString AudioAttributesCompatParcelizer() {
        int iOrdinal = ordinal();
        if (iOrdinal == 1) {
            return _parseString.MODULATE;
        }
        if (iOrdinal == 2) {
            return _parseString.SCREEN;
        }
        if (iOrdinal == 3) {
            return _parseString.OVERLAY;
        }
        if (iOrdinal == 4) {
            return _parseString.DARKEN;
        }
        if (iOrdinal == 5) {
            return _parseString.LIGHTEN;
        }
        if (iOrdinal != 16) {
            return null;
        }
        return _parseString.PLUS;
    }
}
