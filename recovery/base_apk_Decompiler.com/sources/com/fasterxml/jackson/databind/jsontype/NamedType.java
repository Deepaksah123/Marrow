package com.fasterxml.jackson.databind.jsontype;

import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class NamedType implements Serializable {
    protected final Class<?> _class;
    protected final int _hashCode;
    protected String _name;

    public NamedType(Class<?> cls) {
        this(cls, null);
    }

    public NamedType(Class<?> cls, String str) {
        this._class = cls;
        this._hashCode = cls.getName().hashCode() + (str == null ? 0 : str.hashCode());
        setName(str);
    }

    public final Class<?> getType() {
        return this._class;
    }

    public final String getName() {
        return this._name;
    }

    public final void setName(String str) {
        if (str == null || str.isEmpty()) {
            str = null;
        }
        this._name = str;
    }

    public final boolean hasName() {
        return this._name != null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        NamedType namedType = (NamedType) obj;
        return this._class == namedType._class && Objects.equals(this._name, namedType._name);
    }

    public final int hashCode() {
        return this._hashCode;
    }

    public final String toString() {
        String string;
        StringBuilder sb = new StringBuilder("[NamedType, class ");
        sb.append(this._class.getName());
        sb.append(", name: ");
        if (this._name == null) {
            string = "null";
        } else {
            StringBuilder sb2 = new StringBuilder("'");
            sb2.append(this._name);
            sb2.append("'");
            string = sb2.toString();
        }
        sb.append(string);
        sb.append("]");
        return sb.toString();
    }
}
