package com.fasterxml.jackson.core.util;

import com.fasterxml.jackson.core.util.JacksonFeature;

/* JADX INFO: loaded from: classes2.dex */
public final class JacksonFeatureSet<F extends JacksonFeature> {
    protected int _enabled;

    protected JacksonFeatureSet(int i) {
        this._enabled = i;
    }

    public static <F extends JacksonFeature> JacksonFeatureSet<F> fromDefaults(F[] fArr) {
        if (fArr.length > 31) {
            throw new IllegalArgumentException(String.format("Can not use type `%s` with JacksonFeatureSet: too many entries (%d > 31)", fArr[0].getClass().getName(), Integer.valueOf(fArr.length)));
        }
        int mask = 0;
        for (F f : fArr) {
            if (f.enabledByDefault()) {
                mask |= f.getMask();
            }
        }
        return new JacksonFeatureSet<>(mask);
    }

    public final JacksonFeatureSet<F> with(F f) {
        int mask = f.getMask() | this._enabled;
        return mask == this._enabled ? this : new JacksonFeatureSet<>(mask);
    }

    public final boolean isEnabled(F f) {
        return (this._enabled & f.getMask()) != 0;
    }
}
