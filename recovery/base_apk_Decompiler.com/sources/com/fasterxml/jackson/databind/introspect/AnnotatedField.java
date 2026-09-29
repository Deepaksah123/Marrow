package com.fasterxml.jackson.databind.introspect;

import android.os.Process;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Modifier;

/* JADX INFO: loaded from: classes2.dex */
public final class AnnotatedField extends AnnotatedMember implements Serializable {
    protected final transient Field _field;
    protected Serialization _serialization;

    public AnnotatedField(TypeResolutionContext typeResolutionContext, Field field, AnnotationMap annotationMap) {
        super(typeResolutionContext, annotationMap);
        this._field = field;
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedMember
    public final AnnotatedField withAnnotations(AnnotationMap annotationMap) {
        return new AnnotatedField(this._typeContext, this._field, annotationMap);
    }

    protected AnnotatedField(Serialization serialization) {
        super(null, null);
        this._field = null;
        this._serialization = serialization;
    }

    @Override // com.fasterxml.jackson.databind.introspect.Annotated
    public final Field getAnnotated() {
        return this._field;
    }

    public final int getModifiers() {
        return this._field.getModifiers();
    }

    @Override // com.fasterxml.jackson.databind.introspect.Annotated
    public final String getName() {
        return this._field.getName();
    }

    @Override // com.fasterxml.jackson.databind.introspect.Annotated
    public final Class<?> getRawType() {
        return this._field.getType();
    }

    @Override // com.fasterxml.jackson.databind.introspect.Annotated
    public final JavaType getType() {
        return this._typeContext.resolveType(this._field.getGenericType());
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedMember
    public final Class<?> getDeclaringClass() {
        return this._field.getDeclaringClass();
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedMember
    public final Member getMember() {
        return this._field;
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedMember
    public final void setValue(Object obj, Object obj2) throws IllegalArgumentException {
        try {
            this._field.set(obj, obj2);
        } catch (IllegalAccessException e) {
            StringBuilder sb = new StringBuilder("Failed to setValue() for field ");
            sb.append(getFullName());
            sb.append(": ");
            sb.append(e.getMessage());
            throw new IllegalArgumentException(sb.toString(), e);
        }
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedMember
    public final Object getValue(Object obj) throws IllegalArgumentException {
        try {
            return this._field.get(obj);
        } catch (IllegalAccessException e) {
            StringBuilder sb = new StringBuilder("Failed to getValue() for field ");
            sb.append(this.getFullName());
            sb.append(": ");
            sb.append(e.getMessage());
            throw new IllegalArgumentException(sb.toString(), e);
        }
    }

    public final boolean isTransient() {
        return Modifier.isTransient(getModifiers());
    }

    public final int hashCode() {
        return this._field.getName().hashCode();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!ClassUtil.hasClass(obj, getClass())) {
            return false;
        }
        Field field = ((AnnotatedField) obj)._field;
        if (field == null) {
            return this._field == null;
        }
        return field.equals(this._field);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[field ");
        sb.append(getFullName());
        sb.append("]");
        return sb.toString();
    }

    final Object writeReplace() {
        return new AnnotatedField(new Serialization(this._field));
    }

    final Object readResolve() {
        Class<?> cls = this._serialization.clazz;
        try {
            Field declaredField = cls.getDeclaredField(this._serialization.name);
            if (!declaredField.isAccessible()) {
                ClassUtil.checkAndFixAccess(declaredField, false);
            }
            return new AnnotatedField(null, declaredField, null);
        } catch (Exception unused) {
            StringBuilder sb = new StringBuilder("Could not find method '");
            sb.append(this._serialization.name);
            sb.append("' from Class '");
            sb.append(cls.getName());
            throw new IllegalArgumentException(sb.toString());
        }
    }

    public static final class Serialization implements Serializable {
        public static int RemoteActionCompatParcelizer;
        public static int read;
        protected Class<?> clazz;
        protected String name;

        public Serialization(Field field) {
            this.clazz = field.getDeclaringClass();
            this.name = field.getName();
        }

        public static int read() {
            int i = read;
            int i2 = i % 6924973;
            read = i + 1;
            if (i2 != 0) {
                return RemoteActionCompatParcelizer;
            }
            int iMyTid = Process.myTid();
            RemoteActionCompatParcelizer = iMyTid;
            return iMyTid;
        }
    }
}
