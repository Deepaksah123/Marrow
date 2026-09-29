package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes2.dex */
public final class AnnotatedConstructor extends AnnotatedWithParams {
    protected final Constructor<?> _constructor;
    protected Serialization _serialization;

    public AnnotatedConstructor(TypeResolutionContext typeResolutionContext, Constructor<?> constructor, AnnotationMap annotationMap, AnnotationMap[] annotationMapArr) {
        super(typeResolutionContext, annotationMap, annotationMapArr);
        if (constructor == null) {
            throw new IllegalArgumentException("Null constructor not allowed");
        }
        this._constructor = constructor;
    }

    protected AnnotatedConstructor(Serialization serialization) {
        super(null, null, null);
        this._constructor = null;
        this._serialization = serialization;
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedMember
    public final AnnotatedConstructor withAnnotations(AnnotationMap annotationMap) {
        return new AnnotatedConstructor(this._typeContext, this._constructor, annotationMap, this._paramAnnotations);
    }

    @Override // com.fasterxml.jackson.databind.introspect.Annotated
    public final Constructor<?> getAnnotated() {
        return this._constructor;
    }

    @Override // com.fasterxml.jackson.databind.introspect.Annotated
    public final String getName() {
        return this._constructor.getName();
    }

    @Override // com.fasterxml.jackson.databind.introspect.Annotated
    public final JavaType getType() {
        return this._typeContext.resolveType(getRawType());
    }

    @Override // com.fasterxml.jackson.databind.introspect.Annotated
    public final Class<?> getRawType() {
        return this._constructor.getDeclaringClass();
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedWithParams
    public final int getParameterCount() {
        return this._constructor.getParameterCount();
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedWithParams
    public final Class<?> getRawParameterType(int i) {
        Class<?>[] parameterTypes = this._constructor.getParameterTypes();
        if (i >= parameterTypes.length) {
            return null;
        }
        return parameterTypes[i];
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedWithParams
    public final JavaType getParameterType(int i) {
        Type[] genericParameterTypes = this._constructor.getGenericParameterTypes();
        if (i >= genericParameterTypes.length) {
            return null;
        }
        return this._typeContext.resolveType(genericParameterTypes[i]);
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedWithParams
    public final Object call() throws Exception {
        return this._constructor.newInstance(null);
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedWithParams
    public final Object call(Object[] objArr) throws Exception {
        return this._constructor.newInstance(objArr);
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedWithParams
    public final Object call1(Object obj) throws Exception {
        return this._constructor.newInstance(obj);
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedMember
    public final Class<?> getDeclaringClass() {
        return this._constructor.getDeclaringClass();
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedMember
    public final Member getMember() {
        return this._constructor;
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedMember
    public final void setValue(Object obj, Object obj2) throws UnsupportedOperationException {
        StringBuilder sb = new StringBuilder("Cannot call setValue() on constructor of ");
        sb.append(getDeclaringClass().getName());
        throw new UnsupportedOperationException(sb.toString());
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedMember
    public final Object getValue(Object obj) throws UnsupportedOperationException {
        StringBuilder sb = new StringBuilder("Cannot call getValue() on constructor of ");
        sb.append(getDeclaringClass().getName());
        throw new UnsupportedOperationException(sb.toString());
    }

    public final String toString() {
        int parameterCount = this._constructor.getParameterCount();
        return String.format("[constructor for %s (%d arg%s), annotations: %s", ClassUtil.nameOf(this._constructor.getDeclaringClass()), Integer.valueOf(parameterCount), parameterCount == 1 ? "" : CmcdHeadersFactory.STREAMING_FORMAT_SS, this._annotations);
    }

    public final int hashCode() {
        return this._constructor.getName().hashCode();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!ClassUtil.hasClass(obj, getClass())) {
            return false;
        }
        Constructor<?> constructor = ((AnnotatedConstructor) obj)._constructor;
        if (constructor == null) {
            return this._constructor == null;
        }
        return constructor.equals(this._constructor);
    }

    final Object writeReplace() {
        return new AnnotatedConstructor(new Serialization(this._constructor));
    }

    final Object readResolve() {
        Class<?> cls = this._serialization.clazz;
        try {
            Constructor<?> declaredConstructor = cls.getDeclaredConstructor(this._serialization.args);
            if (!declaredConstructor.isAccessible()) {
                ClassUtil.checkAndFixAccess(declaredConstructor, false);
            }
            return new AnnotatedConstructor(null, declaredConstructor, null, null);
        } catch (Exception unused) {
            StringBuilder sb = new StringBuilder("Could not find constructor with ");
            sb.append(this._serialization.args.length);
            sb.append(" args from Class '");
            sb.append(cls.getName());
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    static final class Serialization implements Serializable {
        protected Class<?>[] args;
        protected Class<?> clazz;

        public Serialization(Constructor<?> constructor) {
            this.clazz = constructor.getDeclaringClass();
            this.args = constructor.getParameterTypes();
        }
    }
}
