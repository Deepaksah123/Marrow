package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes2.dex */
public final class AnnotatedMethod extends AnnotatedWithParams implements Serializable {
    protected final transient Method _method;
    protected Class<?>[] _paramClasses;
    protected Serialization _serialization;

    public AnnotatedMethod(TypeResolutionContext typeResolutionContext, Method method, AnnotationMap annotationMap, AnnotationMap[] annotationMapArr) {
        super(typeResolutionContext, annotationMap, annotationMapArr);
        if (method == null) {
            throw new IllegalArgumentException("Cannot construct AnnotatedMethod with null Method");
        }
        this._method = method;
    }

    protected AnnotatedMethod(Serialization serialization) {
        super(null, null, null);
        this._method = null;
        this._serialization = serialization;
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedMember
    public final AnnotatedMethod withAnnotations(AnnotationMap annotationMap) {
        return new AnnotatedMethod(this._typeContext, this._method, annotationMap, this._paramAnnotations);
    }

    @Override // com.fasterxml.jackson.databind.introspect.Annotated
    public final Method getAnnotated() {
        return this._method;
    }

    @Override // com.fasterxml.jackson.databind.introspect.Annotated
    public final String getName() {
        return this._method.getName();
    }

    @Override // com.fasterxml.jackson.databind.introspect.Annotated
    public final JavaType getType() {
        return this._typeContext.resolveType(this._method.getGenericReturnType());
    }

    @Override // com.fasterxml.jackson.databind.introspect.Annotated
    public final Class<?> getRawType() {
        return this._method.getReturnType();
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedWithParams
    public final Object call() throws Exception {
        return this._method.invoke(null, new Object[0]);
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedWithParams
    public final Object call(Object[] objArr) throws Exception {
        return this._method.invoke(null, objArr);
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedWithParams
    public final Object call1(Object obj) throws Exception {
        return this._method.invoke(null, obj);
    }

    public final Object callOnWith(Object obj, Object... objArr) throws Exception {
        return this._method.invoke(obj, objArr);
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedWithParams
    public final int getParameterCount() {
        return this._method.getParameterCount();
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedWithParams
    public final Class<?> getRawParameterType(int i) {
        Class<?>[] rawParameterTypes = getRawParameterTypes();
        if (i >= rawParameterTypes.length) {
            return null;
        }
        return rawParameterTypes[i];
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedWithParams
    public final JavaType getParameterType(int i) {
        Type[] genericParameterTypes = this._method.getGenericParameterTypes();
        if (i >= genericParameterTypes.length) {
            return null;
        }
        return this._typeContext.resolveType(genericParameterTypes[i]);
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedMember
    public final Class<?> getDeclaringClass() {
        return this._method.getDeclaringClass();
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedMember
    public final Method getMember() {
        return this._method;
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedMember
    public final void setValue(Object obj, Object obj2) throws IllegalArgumentException {
        try {
            this._method.invoke(obj, obj2);
        } catch (IllegalAccessException | InvocationTargetException e) {
            StringBuilder sb = new StringBuilder("Failed to setValue() with method ");
            sb.append(getFullName());
            sb.append(": ");
            sb.append(ClassUtil.exceptionMessage(e));
            throw new IllegalArgumentException(sb.toString(), e);
        }
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedMember
    public final Object getValue(Object obj) throws IllegalArgumentException {
        try {
            return this._method.invoke(obj, null);
        } catch (IllegalAccessException | InvocationTargetException e) {
            StringBuilder sb = new StringBuilder("Failed to getValue() with method ");
            sb.append(this.getFullName());
            sb.append(": ");
            sb.append(ClassUtil.exceptionMessage(e));
            throw new IllegalArgumentException(sb.toString(), e);
        }
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedMember
    public final String getFullName() {
        String fullName = super.getFullName();
        int parameterCount = getParameterCount();
        if (parameterCount == 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(fullName);
            sb.append("()");
            return sb.toString();
        }
        if (parameterCount == 1) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(fullName);
            sb2.append("(");
            sb2.append(getRawParameterType(0).getName());
            sb2.append(")");
            return sb2.toString();
        }
        return String.format("%s(%d params)", super.getFullName(), Integer.valueOf(getParameterCount()));
    }

    public final Class<?>[] getRawParameterTypes() {
        if (this._paramClasses == null) {
            this._paramClasses = this._method.getParameterTypes();
        }
        return this._paramClasses;
    }

    public final Class<?> getRawReturnType() {
        return this._method.getReturnType();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[method ");
        sb.append(getFullName());
        sb.append("]");
        return sb.toString();
    }

    public final int hashCode() {
        return this._method.getName().hashCode();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!ClassUtil.hasClass(obj, getClass())) {
            return false;
        }
        Method method = ((AnnotatedMethod) obj)._method;
        if (method == null) {
            return this._method == null;
        }
        return method.equals(this._method);
    }

    final Object writeReplace() {
        return new AnnotatedMethod(new Serialization(this._method));
    }

    final Object readResolve() {
        Class<?> cls = this._serialization.clazz;
        try {
            Method declaredMethod = cls.getDeclaredMethod(this._serialization.name, this._serialization.args);
            if (!declaredMethod.isAccessible()) {
                ClassUtil.checkAndFixAccess(declaredMethod, false);
            }
            return new AnnotatedMethod(null, declaredMethod, null, null);
        } catch (Exception unused) {
            StringBuilder sb = new StringBuilder("Could not find method '");
            sb.append(this._serialization.name);
            sb.append("' from Class '");
            sb.append(cls.getName());
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    static final class Serialization implements Serializable {
        protected Class<?>[] args;
        protected Class<?> clazz;
        protected String name;

        public Serialization(Method method) {
            this.clazz = method.getDeclaringClass();
            this.name = method.getName();
            this.args = method.getParameterTypes();
        }
    }
}
