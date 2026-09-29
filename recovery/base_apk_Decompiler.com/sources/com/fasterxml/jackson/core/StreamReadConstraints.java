package com.fasterxml.jackson.core;

import com.fasterxml.jackson.core.exc.StreamConstraintsException;
import com.google.android.gms.common.util.GmsVersion;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public class StreamReadConstraints implements Serializable {
    private static final StreamReadConstraints DEFAULT = new StreamReadConstraints(1000, 1000, GmsVersion.VERSION_LONGHORN);
    protected final int _maxNestingDepth;
    protected final int _maxNumLen;
    protected final int _maxStringLen;

    protected StreamReadConstraints(int i, int i2, int i3) {
        this._maxNestingDepth = i;
        this._maxNumLen = i2;
        this._maxStringLen = i3;
    }

    public static StreamReadConstraints defaults() {
        return DEFAULT;
    }

    public void validateNestingDepth(int i) throws StreamConstraintsException {
        int i2 = this._maxNestingDepth;
        if (i > i2) {
            throw new StreamConstraintsException(String.format("Depth (%d) exceeds the maximum allowed nesting depth (%d)", Integer.valueOf(i), Integer.valueOf(i2)));
        }
    }

    public void validateFPLength(int i) throws StreamConstraintsException {
        int i2 = this._maxNumLen;
        if (i > i2) {
            throw new StreamConstraintsException(String.format("Number length (%d) exceeds the maximum length (%d)", Integer.valueOf(i), Integer.valueOf(i2)));
        }
    }

    public void validateIntegerLength(int i) throws StreamConstraintsException {
        int i2 = this._maxNumLen;
        if (i > i2) {
            throw new StreamConstraintsException(String.format("Number length (%d) exceeds the maximum length (%d)", Integer.valueOf(i), Integer.valueOf(i2)));
        }
    }

    public void validateStringLength(int i) throws StreamConstraintsException {
        int i2 = this._maxStringLen;
        if (i > i2) {
            throw new StreamConstraintsException(String.format("String length (%d) exceeds the maximum length (%d)", Integer.valueOf(i), Integer.valueOf(i2)));
        }
    }

    public void validateBigIntegerScale(int i) throws StreamConstraintsException {
        if (Math.abs(i) > 100000) {
            throw new StreamConstraintsException(String.format("BigDecimal scale (%d) magnitude exceeds maximum allowed (%d)", Integer.valueOf(i), 100000));
        }
    }
}
