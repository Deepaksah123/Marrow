package com.fasterxml.jackson.databind.type;

import com.fasterxml.jackson.databind.JavaType;
import java.lang.reflect.Array;

/* JADX INFO: loaded from: classes2.dex */
public final class ArrayType extends TypeBase {
    protected final JavaType _componentType;
    protected final Object _emptyArray;

    @Override // com.fasterxml.jackson.databind.JavaType
    public final boolean isAbstract() {
        return false;
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public final boolean isArrayType() {
        return true;
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public final boolean isConcrete() {
        return true;
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public final boolean isContainerType() {
        return true;
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public final JavaType refine(Class<?> cls, TypeBindings typeBindings, JavaType javaType, JavaType[] javaTypeArr) {
        return null;
    }

    protected ArrayType(JavaType javaType, TypeBindings typeBindings, Object obj, Object obj2, Object obj3, boolean z) {
        super(obj.getClass(), typeBindings, null, null, javaType.hashCode(), obj2, obj3, z);
        this._componentType = javaType;
        this._emptyArray = obj;
    }

    public static ArrayType construct(JavaType javaType, TypeBindings typeBindings) {
        return construct(javaType, typeBindings, null, null);
    }

    public static ArrayType construct(JavaType javaType, TypeBindings typeBindings, Object obj, Object obj2) {
        return new ArrayType(javaType, typeBindings, Array.newInstance(javaType.getRawClass(), 0), obj, obj2, false);
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public final JavaType withContentType(JavaType javaType) {
        return new ArrayType(javaType, this._bindings, Array.newInstance(javaType.getRawClass(), 0), this._valueHandler, this._typeHandler, this._asStatic);
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public final ArrayType withTypeHandler(Object obj) {
        return obj == this._typeHandler ? this : new ArrayType(this._componentType, this._bindings, this._emptyArray, this._valueHandler, obj, this._asStatic);
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public final ArrayType withContentTypeHandler(Object obj) {
        return obj == this._componentType.getTypeHandler() ? this : new ArrayType(this._componentType.withTypeHandler(obj), this._bindings, this._emptyArray, this._valueHandler, this._typeHandler, this._asStatic);
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public final ArrayType withValueHandler(Object obj) {
        return obj == this._valueHandler ? this : new ArrayType(this._componentType, this._bindings, this._emptyArray, obj, this._typeHandler, this._asStatic);
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public final ArrayType withContentValueHandler(Object obj) {
        return obj == this._componentType.getValueHandler() ? this : new ArrayType(this._componentType.withValueHandler(obj), this._bindings, this._emptyArray, this._valueHandler, this._typeHandler, this._asStatic);
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public final ArrayType withStaticTyping() {
        return this._asStatic ? this : new ArrayType(this._componentType.withStaticTyping(), this._bindings, this._emptyArray, this._valueHandler, this._typeHandler, true);
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public final boolean hasGenericTypes() {
        return this._componentType.hasGenericTypes();
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public final JavaType getContentType() {
        return this._componentType;
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public final boolean hasHandlers() {
        return super.hasHandlers() || this._componentType.hasHandlers();
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public final StringBuilder getGenericSignature(StringBuilder sb) {
        sb.append('[');
        return this._componentType.getGenericSignature(sb);
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public final StringBuilder getErasedSignature(StringBuilder sb) {
        sb.append('[');
        return this._componentType.getErasedSignature(sb);
    }

    public final Object[] getEmptyArray() {
        return (Object[]) this._emptyArray;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[array type, component type: ");
        sb.append(this._componentType);
        sb.append("]");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && obj.getClass() == getClass()) {
            return this._componentType.equals(((ArrayType) obj)._componentType);
        }
        return false;
    }
}
