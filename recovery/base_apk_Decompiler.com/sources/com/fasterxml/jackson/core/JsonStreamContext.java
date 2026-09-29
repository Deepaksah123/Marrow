package com.fasterxml.jackson.core;

import com.fasterxml.jackson.core.io.CharTypes;
import com.fasterxml.jackson.core.io.ContentReference;

/* JADX INFO: loaded from: classes2.dex */
public abstract class JsonStreamContext {
    public int _index;
    public int _nestingDepth;
    public int _type;

    public abstract String getCurrentName();

    public Object getCurrentValue() {
        return null;
    }

    public abstract JsonStreamContext getParent();

    public void setCurrentValue(Object obj) {
    }

    public JsonStreamContext() {
    }

    public JsonStreamContext(JsonStreamContext jsonStreamContext) {
        this._type = jsonStreamContext._type;
        this._index = jsonStreamContext._index;
    }

    public JsonStreamContext(int i, int i2) {
        this._type = i;
        this._index = i2;
    }

    public final boolean inArray() {
        return this._type == 1;
    }

    public final boolean inRoot() {
        return this._type == 0;
    }

    public final boolean inObject() {
        return this._type == 2;
    }

    public final int getNestingDepth() {
        return this._nestingDepth;
    }

    public String typeDesc() {
        int i = this._type;
        if (i == 0) {
            return "root";
        }
        if (i == 1) {
            return "Array";
        }
        if (i == 2) {
            return "Object";
        }
        return "?";
    }

    public final int getEntryCount() {
        return this._index + 1;
    }

    public final int getCurrentIndex() {
        int i = this._index;
        if (i < 0) {
            return 0;
        }
        return i;
    }

    public boolean hasCurrentIndex() {
        return this._index >= 0;
    }

    public boolean hasCurrentName() {
        return getCurrentName() != null;
    }

    public JsonLocation startLocation(ContentReference contentReference) {
        return JsonLocation.NA;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(64);
        int i = this._type;
        if (i == 0) {
            sb.append("/");
        } else if (i == 1) {
            sb.append('[');
            sb.append(getCurrentIndex());
            sb.append(']');
        } else {
            sb.append('{');
            String currentName = getCurrentName();
            if (currentName != null) {
                sb.append('\"');
                CharTypes.appendQuoted(sb, currentName);
                sb.append('\"');
            } else {
                sb.append('?');
            }
            sb.append('}');
        }
        return sb.toString();
    }
}
