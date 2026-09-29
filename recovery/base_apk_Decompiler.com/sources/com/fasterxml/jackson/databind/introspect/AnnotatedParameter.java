package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Member;

/* JADX INFO: loaded from: classes2.dex */
public final class AnnotatedParameter extends AnnotatedMember {
    protected final int _index;
    protected final AnnotatedWithParams _owner;
    protected final JavaType _type;

    @Override // com.fasterxml.jackson.databind.introspect.Annotated
    public final AnnotatedElement getAnnotated() {
        return null;
    }

    public AnnotatedParameter(AnnotatedWithParams annotatedWithParams, JavaType javaType, TypeResolutionContext typeResolutionContext, AnnotationMap annotationMap, int i) {
        super(typeResolutionContext, annotationMap);
        this._owner = annotatedWithParams;
        this._type = javaType;
        this._index = i;
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedMember
    public final AnnotatedParameter withAnnotations(AnnotationMap annotationMap) {
        return annotationMap == this._annotations ? this : this._owner.replaceParameterAnnotations(this._index, annotationMap);
    }

    @Override // com.fasterxml.jackson.databind.introspect.Annotated
    public final String getName() {
        return "";
    }

    @Override // com.fasterxml.jackson.databind.introspect.Annotated
    public final Class<?> getRawType() {
        return this._type.getRawClass();
    }

    @Override // com.fasterxml.jackson.databind.introspect.Annotated
    public final JavaType getType() {
        return this._type;
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedMember
    public final Class<?> getDeclaringClass() {
        return this._owner.getDeclaringClass();
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedMember
    public final Member getMember() {
        return this._owner.getMember();
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedMember
    public final void setValue(Object obj, Object obj2) throws UnsupportedOperationException {
        StringBuilder sb = new StringBuilder("Cannot call setValue() on constructor parameter of ");
        sb.append(getDeclaringClass().getName());
        throw new UnsupportedOperationException(sb.toString());
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedMember
    public final Object getValue(Object obj) throws UnsupportedOperationException {
        StringBuilder sb = new StringBuilder("Cannot call getValue() on constructor parameter of ");
        sb.append(getDeclaringClass().getName());
        throw new UnsupportedOperationException(sb.toString());
    }

    public final AnnotatedWithParams getOwner() {
        return this._owner;
    }

    public final int getIndex() {
        return this._index;
    }

    public final int hashCode() {
        return this._owner.hashCode() + this._index;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!ClassUtil.hasClass(obj, getClass())) {
            return false;
        }
        AnnotatedParameter annotatedParameter = (AnnotatedParameter) obj;
        return annotatedParameter._owner.equals(this._owner) && annotatedParameter._index == this._index;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[parameter #");
        sb.append(getIndex());
        sb.append(", annotations: ");
        sb.append(this._annotations);
        sb.append("]");
        return sb.toString();
    }
}
