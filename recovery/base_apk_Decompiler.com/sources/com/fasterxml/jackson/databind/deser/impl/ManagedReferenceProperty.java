package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import java.io.IOException;
import java.util.Collection;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class ManagedReferenceProperty extends SettableBeanProperty.Delegating {
    protected final SettableBeanProperty _backProperty;
    protected final boolean _isContainer;
    protected final String _referenceName;

    public ManagedReferenceProperty(SettableBeanProperty settableBeanProperty, String str, SettableBeanProperty settableBeanProperty2, boolean z) {
        super(settableBeanProperty);
        this._referenceName = str;
        this._backProperty = settableBeanProperty2;
        this._isContainer = z;
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty.Delegating
    public final SettableBeanProperty withDelegate(SettableBeanProperty settableBeanProperty) {
        throw new IllegalStateException("Should never try to reset delegate");
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty.Delegating, com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public final void fixAccess(DeserializationConfig deserializationConfig) {
        this.delegate.fixAccess(deserializationConfig);
        this._backProperty.fixAccess(deserializationConfig);
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty.Delegating, com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public final void deserializeAndSet(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws IOException {
        set(obj, this.delegate.deserialize(jsonParser, deserializationContext));
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty.Delegating, com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public final Object deserializeSetAndReturn(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws IOException {
        return setAndReturn(obj, deserialize(jsonParser, deserializationContext));
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty.Delegating, com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public final void set(Object obj, Object obj2) throws IOException {
        setAndReturn(obj, obj2);
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty.Delegating, com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public final Object setAndReturn(Object obj, Object obj2) throws IOException {
        if (obj2 != null) {
            if (this._isContainer) {
                if (obj2 instanceof Object[]) {
                    for (Object obj3 : (Object[]) obj2) {
                        if (obj3 != null) {
                            this._backProperty.set(obj3, obj);
                        }
                    }
                } else if (obj2 instanceof Collection) {
                    for (Object obj4 : (Collection) obj2) {
                        if (obj4 != null) {
                            this._backProperty.set(obj4, obj);
                        }
                    }
                } else if (obj2 instanceof Map) {
                    for (Object obj5 : ((Map) obj2).values()) {
                        if (obj5 != null) {
                            this._backProperty.set(obj5, obj);
                        }
                    }
                } else {
                    StringBuilder sb = new StringBuilder("Unsupported container type (");
                    sb.append(obj2.getClass().getName());
                    sb.append(") when resolving reference '");
                    sb.append(this._referenceName);
                    sb.append("'");
                    throw new IllegalStateException(sb.toString());
                }
            } else {
                this._backProperty.set(obj2, obj);
            }
        }
        return this.delegate.setAndReturn(obj, obj2);
    }
}
