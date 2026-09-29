package kotlin;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class GTSubjectAnalyticsV2ResponseModel {
    static final Type[] AudioAttributesCompatParcelizer = new Type[0];

    static RuntimeException AudioAttributesCompatParcelizer(Method method, String str, Object... objArr) {
        return read(method, null, str, objArr);
    }

    static RuntimeException read(Method method, Throwable th, String str, Object... objArr) {
        String str2 = String.format(str, objArr);
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        sb.append("\n    for method ");
        sb.append(method.getDeclaringClass().getSimpleName());
        sb.append(".");
        sb.append(method.getName());
        return new IllegalArgumentException(sb.toString(), th);
    }

    static RuntimeException write(Method method, Throwable th, int i, String str, Object... objArr) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" (parameter #");
        sb.append(i + 1);
        sb.append(")");
        return read(method, th, sb.toString(), objArr);
    }

    static RuntimeException write(Method method, int i, String str, Object... objArr) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" (parameter #");
        sb.append(i + 1);
        sb.append(")");
        return AudioAttributesCompatParcelizer(method, sb.toString(), objArr);
    }

    static Class<?> RemoteActionCompatParcelizer(Type type) {
        Objects.requireNonNull(type, "type == null");
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            if (!(rawType instanceof Class)) {
                throw new IllegalArgumentException();
            }
            return (Class) rawType;
        }
        if (type instanceof GenericArrayType) {
            return Array.newInstance(RemoteActionCompatParcelizer(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        }
        if (type instanceof TypeVariable) {
            return Object.class;
        }
        if (type instanceof WildcardType) {
            return RemoteActionCompatParcelizer(((WildcardType) type).getUpperBounds()[0]);
        }
        StringBuilder sb = new StringBuilder("Expected a Class, ParameterizedType, or GenericArrayType, but <");
        sb.append(type);
        sb.append("> is of type ");
        sb.append(type.getClass().getName());
        throw new IllegalArgumentException(sb.toString());
    }

    static boolean write(Type type, Type type2) {
        if (type == type2) {
            return true;
        }
        if (type instanceof Class) {
            return type.equals(type2);
        }
        if (type instanceof ParameterizedType) {
            if (!(type2 instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            ParameterizedType parameterizedType2 = (ParameterizedType) type2;
            Type ownerType = parameterizedType.getOwnerType();
            Type ownerType2 = parameterizedType2.getOwnerType();
            return (ownerType == ownerType2 || (ownerType != null && ownerType.equals(ownerType2))) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            if (type2 instanceof GenericArrayType) {
                return write(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
            }
            return false;
        }
        if (type instanceof WildcardType) {
            if (!(type2 instanceof WildcardType)) {
                return false;
            }
            WildcardType wildcardType = (WildcardType) type;
            WildcardType wildcardType2 = (WildcardType) type2;
            return Arrays.equals(wildcardType.getUpperBounds(), wildcardType2.getUpperBounds()) && Arrays.equals(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds());
        }
        if (!(type instanceof TypeVariable) || !(type2 instanceof TypeVariable)) {
            return false;
        }
        TypeVariable typeVariable = (TypeVariable) type;
        TypeVariable typeVariable2 = (TypeVariable) type2;
        return typeVariable.getGenericDeclaration() == typeVariable2.getGenericDeclaration() && typeVariable.getName().equals(typeVariable2.getName());
    }

    private static Type read(Type type, Class<?> cls, Class<?> cls2) {
        if (cls2 == cls) {
            return type;
        }
        if (cls2.isInterface()) {
            Class<?>[] interfaces = cls.getInterfaces();
            int length = interfaces.length;
            for (int i = 0; i < length; i++) {
                Class<?> cls3 = interfaces[i];
                if (cls3 == cls2) {
                    return cls.getGenericInterfaces()[i];
                }
                if (cls2.isAssignableFrom(cls3)) {
                    return read(cls.getGenericInterfaces()[i], interfaces[i], cls2);
                }
            }
        }
        if (!cls.isInterface()) {
            while (cls != Object.class) {
                Class<? super Object> superclass = cls.getSuperclass();
                if (superclass == cls2) {
                    return cls.getGenericSuperclass();
                }
                if (cls2.isAssignableFrom(superclass)) {
                    return read(cls.getGenericSuperclass(), superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    private static int read(Object[] objArr, Object obj) {
        for (int i = 0; i < objArr.length; i++) {
            if (obj.equals(objArr[i])) {
                return i;
            }
        }
        throw new NoSuchElementException();
    }

    static String write(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }

    static Type IconCompatParcelizer(Type type, Class<?> cls, Class<?> cls2) {
        if (!cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException();
        }
        return AudioAttributesCompatParcelizer(type, cls, read(type, cls, cls2));
    }

    private static Type AudioAttributesCompatParcelizer(Type type, Class<?> cls, Type type2) {
        Type type3 = type2;
        while (type3 instanceof TypeVariable) {
            TypeVariable typeVariable = (TypeVariable) type3;
            Type type4 = read(type, cls, (TypeVariable<?>) typeVariable);
            if (type4 == typeVariable) {
                return type4;
            }
            type3 = type4;
        }
        if (type3 instanceof Class) {
            Class cls2 = (Class) type3;
            if (cls2.isArray()) {
                Class<?> componentType = cls2.getComponentType();
                Type typeAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(type, cls, componentType);
                return componentType == typeAudioAttributesCompatParcelizer ? cls2 : new AudioAttributesCompatParcelizer(typeAudioAttributesCompatParcelizer);
            }
        }
        if (type3 instanceof GenericArrayType) {
            GenericArrayType genericArrayType = (GenericArrayType) type3;
            Type genericComponentType = genericArrayType.getGenericComponentType();
            Type typeAudioAttributesCompatParcelizer2 = AudioAttributesCompatParcelizer(type, cls, genericComponentType);
            return genericComponentType == typeAudioAttributesCompatParcelizer2 ? genericArrayType : new AudioAttributesCompatParcelizer(typeAudioAttributesCompatParcelizer2);
        }
        if (type3 instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type3;
            Type ownerType = parameterizedType.getOwnerType();
            Type typeAudioAttributesCompatParcelizer3 = AudioAttributesCompatParcelizer(type, cls, ownerType);
            boolean z = typeAudioAttributesCompatParcelizer3 != ownerType;
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            int length = actualTypeArguments.length;
            for (int i = 0; i < length; i++) {
                Type typeAudioAttributesCompatParcelizer4 = AudioAttributesCompatParcelizer(type, cls, actualTypeArguments[i]);
                if (typeAudioAttributesCompatParcelizer4 != actualTypeArguments[i]) {
                    if (!z) {
                        actualTypeArguments = (Type[]) actualTypeArguments.clone();
                        z = true;
                    }
                    actualTypeArguments[i] = typeAudioAttributesCompatParcelizer4;
                }
            }
            return z ? new read(typeAudioAttributesCompatParcelizer3, parameterizedType.getRawType(), actualTypeArguments) : parameterizedType;
        }
        boolean z2 = type3 instanceof WildcardType;
        Type type5 = type3;
        if (z2) {
            WildcardType wildcardType = (WildcardType) type3;
            Type[] lowerBounds = wildcardType.getLowerBounds();
            Type[] upperBounds = wildcardType.getUpperBounds();
            if (lowerBounds.length == 1) {
                Type typeAudioAttributesCompatParcelizer5 = AudioAttributesCompatParcelizer(type, cls, lowerBounds[0]);
                type5 = wildcardType;
                if (typeAudioAttributesCompatParcelizer5 != lowerBounds[0]) {
                    return new RemoteActionCompatParcelizer(new Type[]{Object.class}, new Type[]{typeAudioAttributesCompatParcelizer5});
                }
            } else {
                type5 = wildcardType;
                if (upperBounds.length == 1) {
                    Type typeAudioAttributesCompatParcelizer6 = AudioAttributesCompatParcelizer(type, cls, upperBounds[0]);
                    type5 = wildcardType;
                    if (typeAudioAttributesCompatParcelizer6 != upperBounds[0]) {
                        return new RemoteActionCompatParcelizer(new Type[]{typeAudioAttributesCompatParcelizer6}, AudioAttributesCompatParcelizer);
                    }
                }
            }
        }
        return type5;
    }

    private static Type read(Type type, Class<?> cls, TypeVariable<?> typeVariable) {
        Class<?> clsRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(typeVariable);
        if (clsRemoteActionCompatParcelizer != null) {
            Type type2 = read(type, cls, clsRemoteActionCompatParcelizer);
            if (type2 instanceof ParameterizedType) {
                return ((ParameterizedType) type2).getActualTypeArguments()[read(clsRemoteActionCompatParcelizer.getTypeParameters(), typeVariable)];
            }
        }
        return typeVariable;
    }

    private static Class<?> RemoteActionCompatParcelizer(TypeVariable<?> typeVariable) {
        GenericDeclaration genericDeclaration = typeVariable.getGenericDeclaration();
        if (genericDeclaration instanceof Class) {
            return (Class) genericDeclaration;
        }
        return null;
    }

    static void read(Type type) {
        if ((type instanceof Class) && ((Class) type).isPrimitive()) {
            throw new IllegalArgumentException();
        }
    }

    static boolean RemoteActionCompatParcelizer(Annotation[] annotationArr, Class<? extends Annotation> cls) {
        for (Annotation annotation : annotationArr) {
            if (cls.isInstance(annotation)) {
                return true;
            }
        }
        return false;
    }

    static ActivityAdapterModule write(ActivityAdapterModule activityAdapterModule) throws IOException {
        resetCurrentSelectedPosition resetcurrentselectedposition = new resetCurrentSelectedPosition();
        activityAdapterModule.AudioAttributesCompatParcelizer().write(resetcurrentselectedposition);
        return ActivityAdapterModule.AudioAttributesCompatParcelizer(activityAdapterModule.write(), activityAdapterModule.read(), resetcurrentselectedposition);
    }

    static Type RemoteActionCompatParcelizer(int i, ParameterizedType parameterizedType) {
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        if (i < 0 || i >= actualTypeArguments.length) {
            StringBuilder sb = new StringBuilder("Index ");
            sb.append(i);
            sb.append(" not in range [0,");
            sb.append(actualTypeArguments.length);
            sb.append(") for ");
            sb.append(parameterizedType);
            throw new IllegalArgumentException(sb.toString());
        }
        Type type = actualTypeArguments[i];
        return type instanceof WildcardType ? ((WildcardType) type).getUpperBounds()[0] : type;
    }

    static Type IconCompatParcelizer(ParameterizedType parameterizedType) {
        Type type = parameterizedType.getActualTypeArguments()[0];
        return type instanceof WildcardType ? ((WildcardType) type).getLowerBounds()[0] : type;
    }

    static boolean IconCompatParcelizer(Type type) {
        if (type instanceof Class) {
            return false;
        }
        if (type instanceof ParameterizedType) {
            for (Type type2 : ((ParameterizedType) type).getActualTypeArguments()) {
                if (IconCompatParcelizer(type2)) {
                    return true;
                }
            }
            return false;
        }
        if (type instanceof GenericArrayType) {
            return IconCompatParcelizer(((GenericArrayType) type).getGenericComponentType());
        }
        if ((type instanceof TypeVariable) || (type instanceof WildcardType)) {
            return true;
        }
        String name = type == null ? "null" : type.getClass().getName();
        StringBuilder sb = new StringBuilder("Expected a Class, ParameterizedType, or GenericArrayType, but <");
        sb.append(type);
        sb.append("> is of type ");
        sb.append(name);
        throw new IllegalArgumentException(sb.toString());
    }

    static final class read implements ParameterizedType {
        private final Type[] AudioAttributesCompatParcelizer;
        private final Type IconCompatParcelizer;
        private final Type write;

        read(Type type, Type type2, Type... typeArr) {
            if (type2 instanceof Class) {
                if ((type == null) != (((Class) type2).getEnclosingClass() == null)) {
                    throw new IllegalArgumentException();
                }
            }
            for (Type type3 : typeArr) {
                Objects.requireNonNull(type3, "typeArgument == null");
                GTSubjectAnalyticsV2ResponseModel.read(type3);
            }
            this.write = type;
            this.IconCompatParcelizer = type2;
            this.AudioAttributesCompatParcelizer = (Type[]) typeArr.clone();
        }

        @Override // java.lang.reflect.ParameterizedType
        public final Type[] getActualTypeArguments() {
            return (Type[]) this.AudioAttributesCompatParcelizer.clone();
        }

        @Override // java.lang.reflect.ParameterizedType
        public final Type getRawType() {
            return this.IconCompatParcelizer;
        }

        @Override // java.lang.reflect.ParameterizedType
        public final Type getOwnerType() {
            return this.write;
        }

        public final boolean equals(Object obj) {
            return (obj instanceof ParameterizedType) && GTSubjectAnalyticsV2ResponseModel.write(this, (ParameterizedType) obj);
        }

        public final int hashCode() {
            int iHashCode = Arrays.hashCode(this.AudioAttributesCompatParcelizer);
            int iHashCode2 = this.IconCompatParcelizer.hashCode();
            Type type = this.write;
            return (type != null ? type.hashCode() : 0) ^ (iHashCode ^ iHashCode2);
        }

        public final String toString() {
            Type[] typeArr = this.AudioAttributesCompatParcelizer;
            if (typeArr.length == 0) {
                return GTSubjectAnalyticsV2ResponseModel.write(this.IconCompatParcelizer);
            }
            StringBuilder sb = new StringBuilder((typeArr.length + 1) * 30);
            sb.append(GTSubjectAnalyticsV2ResponseModel.write(this.IconCompatParcelizer));
            sb.append("<");
            sb.append(GTSubjectAnalyticsV2ResponseModel.write(this.AudioAttributesCompatParcelizer[0]));
            for (int i = 1; i < this.AudioAttributesCompatParcelizer.length; i++) {
                sb.append(", ");
                sb.append(GTSubjectAnalyticsV2ResponseModel.write(this.AudioAttributesCompatParcelizer[i]));
            }
            sb.append(">");
            return sb.toString();
        }
    }

    static final class AudioAttributesCompatParcelizer implements GenericArrayType {
        private final Type write;

        AudioAttributesCompatParcelizer(Type type) {
            this.write = type;
        }

        @Override // java.lang.reflect.GenericArrayType
        public final Type getGenericComponentType() {
            return this.write;
        }

        public final boolean equals(Object obj) {
            return (obj instanceof GenericArrayType) && GTSubjectAnalyticsV2ResponseModel.write(this, (GenericArrayType) obj);
        }

        public final int hashCode() {
            return this.write.hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(GTSubjectAnalyticsV2ResponseModel.write(this.write));
            sb.append(ThemeAlphaConstantsKt.PATH_SEGMENT_ENCODE_SET_URI);
            return sb.toString();
        }
    }

    static final class RemoteActionCompatParcelizer implements WildcardType {
        private final Type IconCompatParcelizer;
        private final Type RemoteActionCompatParcelizer;

        RemoteActionCompatParcelizer(Type[] typeArr, Type[] typeArr2) {
            if (typeArr2.length > 1) {
                throw new IllegalArgumentException();
            }
            int length = typeArr.length;
            if (typeArr2.length == 1) {
                GTSubjectAnalyticsV2ResponseModel.read(typeArr2[0]);
                if (typeArr[0] != Object.class) {
                    throw new IllegalArgumentException();
                }
                this.RemoteActionCompatParcelizer = typeArr2[0];
                this.IconCompatParcelizer = Object.class;
                return;
            }
            GTSubjectAnalyticsV2ResponseModel.read(typeArr[0]);
            this.RemoteActionCompatParcelizer = null;
            this.IconCompatParcelizer = typeArr[0];
        }

        @Override // java.lang.reflect.WildcardType
        public final Type[] getUpperBounds() {
            return new Type[]{this.IconCompatParcelizer};
        }

        @Override // java.lang.reflect.WildcardType
        public final Type[] getLowerBounds() {
            Type type = this.RemoteActionCompatParcelizer;
            return type != null ? new Type[]{type} : GTSubjectAnalyticsV2ResponseModel.AudioAttributesCompatParcelizer;
        }

        public final boolean equals(Object obj) {
            return (obj instanceof WildcardType) && GTSubjectAnalyticsV2ResponseModel.write(this, (WildcardType) obj);
        }

        public final int hashCode() {
            Type type = this.RemoteActionCompatParcelizer;
            return (this.IconCompatParcelizer.hashCode() + 31) ^ (type != null ? type.hashCode() + 31 : 1);
        }

        public final String toString() {
            if (this.RemoteActionCompatParcelizer != null) {
                StringBuilder sb = new StringBuilder("? super ");
                sb.append(GTSubjectAnalyticsV2ResponseModel.write(this.RemoteActionCompatParcelizer));
                return sb.toString();
            }
            if (this.IconCompatParcelizer == Object.class) {
                return "?";
            }
            StringBuilder sb2 = new StringBuilder("? extends ");
            sb2.append(GTSubjectAnalyticsV2ResponseModel.write(this.IconCompatParcelizer));
            return sb2.toString();
        }
    }

    static void AudioAttributesCompatParcelizer(Throwable th) {
        if (th instanceof VirtualMachineError) {
            throw ((VirtualMachineError) th);
        }
        if (th instanceof ThreadDeath) {
            throw ((ThreadDeath) th);
        }
        if (th instanceof LinkageError) {
            throw ((LinkageError) th);
        }
    }
}
