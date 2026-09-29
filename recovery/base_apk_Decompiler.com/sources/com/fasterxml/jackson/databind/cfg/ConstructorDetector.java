package com.fasterxml.jackson.databind.cfg;

import com.fasterxml.jackson.databind.util.ClassUtil;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class ConstructorDetector implements Serializable {
    protected final boolean _allowJDKTypeCtors;
    protected final boolean _requireCtorAnnotation;
    protected final SingleArgConstructor _singleArgMode;
    public static final ConstructorDetector DEFAULT = new ConstructorDetector(SingleArgConstructor.HEURISTIC);
    public static final ConstructorDetector USE_PROPERTIES_BASED = new ConstructorDetector(SingleArgConstructor.PROPERTIES);
    public static final ConstructorDetector USE_DELEGATING = new ConstructorDetector(SingleArgConstructor.DELEGATING);
    public static final ConstructorDetector EXPLICIT_ONLY = new ConstructorDetector(SingleArgConstructor.REQUIRE_MODE);

    public enum SingleArgConstructor {
        DELEGATING,
        PROPERTIES,
        HEURISTIC,
        REQUIRE_MODE
    }

    protected ConstructorDetector(SingleArgConstructor singleArgConstructor, boolean z, boolean z2) {
        this._singleArgMode = singleArgConstructor;
        this._requireCtorAnnotation = z;
        this._allowJDKTypeCtors = z2;
    }

    protected ConstructorDetector(SingleArgConstructor singleArgConstructor) {
        this(singleArgConstructor, false, false);
    }

    public final SingleArgConstructor singleArgMode() {
        return this._singleArgMode;
    }

    public final boolean requireCtorAnnotation() {
        return this._requireCtorAnnotation;
    }

    public final boolean singleArgCreatorDefaultsToDelegating() {
        return this._singleArgMode == SingleArgConstructor.DELEGATING;
    }

    public final boolean singleArgCreatorDefaultsToProperties() {
        return this._singleArgMode == SingleArgConstructor.PROPERTIES;
    }

    public final boolean shouldIntrospectorImplicitConstructors(Class<?> cls) {
        if (this._requireCtorAnnotation) {
            return false;
        }
        return this._allowJDKTypeCtors || !ClassUtil.isJDKClass(cls) || Throwable.class.isAssignableFrom(cls);
    }
}
