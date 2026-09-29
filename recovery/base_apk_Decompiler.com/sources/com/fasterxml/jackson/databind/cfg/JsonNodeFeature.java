package com.fasterxml.jackson.databind.cfg;

/* JADX INFO: loaded from: classes2.dex */
public enum JsonNodeFeature implements DatatypeFeature {
    READ_NULL_PROPERTIES(true),
    WRITE_NULL_PROPERTIES(true),
    STRIP_TRAILING_BIGDECIMAL_ZEROES(true);

    private final boolean _enabledByDefault;
    private final int _mask = 1 << ordinal();

    @Override // com.fasterxml.jackson.databind.cfg.DatatypeFeature
    public final int featureIndex() {
        return 1;
    }

    JsonNodeFeature(boolean z) {
        this._enabledByDefault = z;
    }

    @Override // com.fasterxml.jackson.core.util.JacksonFeature
    public final boolean enabledByDefault() {
        return this._enabledByDefault;
    }

    @Override // com.fasterxml.jackson.core.util.JacksonFeature
    public final boolean enabledIn(int i) {
        return (this._mask & i) != 0;
    }

    @Override // com.fasterxml.jackson.core.util.JacksonFeature
    public final int getMask() {
        return this._mask;
    }
}
