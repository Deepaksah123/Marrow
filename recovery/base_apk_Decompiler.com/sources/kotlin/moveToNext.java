package kotlin;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Properties;

/* JADX INFO: loaded from: classes3.dex */
public final class moveToNext {
    static final Type[] RemoteActionCompatParcelizer = new Type[0];

    private static ParameterizedType read(Type type, Type type2, Type... typeArr) {
        return new write(type, type2, typeArr);
    }

    private static GenericArrayType AudioAttributesImplApi21Parcelizer(Type type) {
        return new read(type);
    }

    private static WildcardType AudioAttributesImplApi26Parcelizer(Type type) {
        Type[] upperBounds;
        if (type instanceof WildcardType) {
            upperBounds = ((WildcardType) type).getUpperBounds();
        } else {
            upperBounds = new Type[]{type};
        }
        return new IconCompatParcelizer(upperBounds, RemoteActionCompatParcelizer);
    }

    private static WildcardType AudioAttributesImplBaseParcelizer(Type type) {
        Type[] lowerBounds;
        if (type instanceof WildcardType) {
            lowerBounds = ((WildcardType) type).getLowerBounds();
        } else {
            lowerBounds = new Type[]{type};
        }
        return new IconCompatParcelizer(new Type[]{Object.class}, lowerBounds);
    }

    public static Type IconCompatParcelizer(Type type) {
        if (type instanceof Class) {
            Class cls = (Class) type;
            boolean zIsArray = cls.isArray();
            Type readVar = cls;
            if (zIsArray) {
                readVar = new read(IconCompatParcelizer(cls.getComponentType()));
            }
            return readVar;
        }
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            return new write(parameterizedType.getOwnerType(), parameterizedType.getRawType(), parameterizedType.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            return new read(((GenericArrayType) type).getGenericComponentType());
        }
        if (!(type instanceof WildcardType)) {
            return type;
        }
        WildcardType wildcardType = (WildcardType) type;
        return new IconCompatParcelizer(wildcardType.getUpperBounds(), wildcardType.getLowerBounds());
    }

    public static Class<?> AudioAttributesCompatParcelizer(Type type) {
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            DownloadException.AudioAttributesCompatParcelizer(rawType instanceof Class);
            return (Class) rawType;
        }
        if (type instanceof GenericArrayType) {
            return Array.newInstance(AudioAttributesCompatParcelizer(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        }
        if (type instanceof TypeVariable) {
            return Object.class;
        }
        if (type instanceof WildcardType) {
            return AudioAttributesCompatParcelizer(((WildcardType) type).getUpperBounds()[0]);
        }
        String name = type == null ? "null" : type.getClass().getName();
        StringBuilder sb = new StringBuilder("Expected a Class, ParameterizedType, or GenericArrayType, but <");
        sb.append(type);
        sb.append("> is of type ");
        sb.append(name);
        throw new IllegalArgumentException(sb.toString());
    }

    private static boolean IconCompatParcelizer(Object obj, Object obj2) {
        return Objects.equals(obj, obj2);
    }

    public static boolean read(Type type, Type type2) {
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
            return IconCompatParcelizer(parameterizedType.getOwnerType(), parameterizedType2.getOwnerType()) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            if (type2 instanceof GenericArrayType) {
                return read(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
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

    public static String write(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
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

    private static Type IconCompatParcelizer(Type type, Class<?> cls, Class<?> cls2) {
        if (type instanceof WildcardType) {
            type = ((WildcardType) type).getUpperBounds()[0];
        }
        DownloadException.AudioAttributesCompatParcelizer(cls2.isAssignableFrom(cls));
        return IconCompatParcelizer(type, cls, read(type, cls, cls2));
    }

    public static Type read(Type type) {
        if (type instanceof GenericArrayType) {
            return ((GenericArrayType) type).getGenericComponentType();
        }
        return ((Class) type).getComponentType();
    }

    public static Type IconCompatParcelizer(Type type, Class<?> cls) {
        Type typeIconCompatParcelizer = IconCompatParcelizer(type, cls, (Class<?>) Collection.class);
        if (typeIconCompatParcelizer instanceof ParameterizedType) {
            return ((ParameterizedType) typeIconCompatParcelizer).getActualTypeArguments()[0];
        }
        return Object.class;
    }

    public static Type[] AudioAttributesCompatParcelizer(Type type, Class<?> cls) {
        if (type == Properties.class) {
            return new Type[]{String.class, String.class};
        }
        Type typeIconCompatParcelizer = IconCompatParcelizer(type, cls, (Class<?>) Map.class);
        if (typeIconCompatParcelizer instanceof ParameterizedType) {
            return ((ParameterizedType) typeIconCompatParcelizer).getActualTypeArguments();
        }
        return new Type[]{Object.class, Object.class};
    }

    public static Type IconCompatParcelizer(Type type, Class<?> cls, Type type2) {
        return read(type, cls, type2, new HashMap());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0049  */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r11v10, types: [java.lang.Object, java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r11v12, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.reflect.WildcardType] */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.reflect.WildcardType] */
    /* JADX WARN: Type inference failed for: r11v4, types: [java.lang.reflect.WildcardType] */
    /* JADX WARN: Type inference failed for: r11v5, types: [java.lang.reflect.ParameterizedType] */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.lang.reflect.GenericArrayType] */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.util.Map, java.util.Map<java.lang.reflect.TypeVariable<?>, java.lang.reflect.Type>] */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.reflect.Type read(java.lang.reflect.Type r9, java.lang.Class<?> r10, java.lang.reflect.Type r11, java.util.Map<java.lang.reflect.TypeVariable<?>, java.lang.reflect.Type> r12) {
        /*
            Method dump skipped, instruction units count: 225
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.moveToNext.read(java.lang.reflect.Type, java.lang.Class, java.lang.reflect.Type, java.util.Map):java.lang.reflect.Type");
    }

    private static Type AudioAttributesCompatParcelizer(Type type, Class<?> cls, TypeVariable<?> typeVariable) {
        Class<?> clsIconCompatParcelizer = IconCompatParcelizer(typeVariable);
        if (clsIconCompatParcelizer != null) {
            Type type2 = read(type, cls, clsIconCompatParcelizer);
            if (type2 instanceof ParameterizedType) {
                return ((ParameterizedType) type2).getActualTypeArguments()[RemoteActionCompatParcelizer(clsIconCompatParcelizer.getTypeParameters(), typeVariable)];
            }
        }
        return typeVariable;
    }

    private static int RemoteActionCompatParcelizer(Object[] objArr, Object obj) {
        int length = objArr.length;
        for (int i = 0; i < length; i++) {
            if (obj.equals(objArr[i])) {
                return i;
            }
        }
        throw new NoSuchElementException();
    }

    private static Class<?> IconCompatParcelizer(TypeVariable<?> typeVariable) {
        GenericDeclaration genericDeclaration = typeVariable.getGenericDeclaration();
        if (genericDeclaration instanceof Class) {
            return (Class) genericDeclaration;
        }
        return null;
    }

    static void RemoteActionCompatParcelizer(Type type) {
        DownloadException.AudioAttributesCompatParcelizer(((type instanceof Class) && ((Class) type).isPrimitive()) ? false : true);
    }

    static final class write implements ParameterizedType, Serializable {
        private final Type RemoteActionCompatParcelizer;
        private final Type[] read;
        private final Type write;

        public write(Type type, Type type2, Type... typeArr) {
            Objects.requireNonNull(type2);
            if (type2 instanceof Class) {
                Class cls = (Class) type2;
                boolean z = true;
                boolean z2 = Modifier.isStatic(cls.getModifiers()) || cls.getEnclosingClass() == null;
                if (type == null && !z2) {
                    z = false;
                }
                DownloadException.AudioAttributesCompatParcelizer(z);
            }
            this.write = type == null ? null : moveToNext.IconCompatParcelizer(type);
            this.RemoteActionCompatParcelizer = moveToNext.IconCompatParcelizer(type2);
            Type[] typeArr2 = (Type[]) typeArr.clone();
            this.read = typeArr2;
            int length = typeArr2.length;
            for (int i = 0; i < length; i++) {
                Objects.requireNonNull(this.read[i]);
                moveToNext.RemoteActionCompatParcelizer(this.read[i]);
                Type[] typeArr3 = this.read;
                typeArr3[i] = moveToNext.IconCompatParcelizer(typeArr3[i]);
            }
        }

        @Override // java.lang.reflect.ParameterizedType
        public final Type[] getActualTypeArguments() {
            return (Type[]) this.read.clone();
        }

        @Override // java.lang.reflect.ParameterizedType
        public final Type getRawType() {
            return this.RemoteActionCompatParcelizer;
        }

        @Override // java.lang.reflect.ParameterizedType
        public final Type getOwnerType() {
            return this.write;
        }

        public final boolean equals(Object obj) {
            return (obj instanceof ParameterizedType) && moveToNext.read(this, (ParameterizedType) obj);
        }

        private static int IconCompatParcelizer(Object obj) {
            if (obj != null) {
                return obj.hashCode();
            }
            return 0;
        }

        public final int hashCode() {
            return IconCompatParcelizer(this.write) ^ (Arrays.hashCode(this.read) ^ this.RemoteActionCompatParcelizer.hashCode());
        }

        public final String toString() {
            int length = this.read.length;
            if (length == 0) {
                return moveToNext.write(this.RemoteActionCompatParcelizer);
            }
            StringBuilder sb = new StringBuilder((length + 1) * 30);
            sb.append(moveToNext.write(this.RemoteActionCompatParcelizer));
            sb.append("<");
            sb.append(moveToNext.write(this.read[0]));
            for (int i = 1; i < length; i++) {
                sb.append(", ");
                sb.append(moveToNext.write(this.read[i]));
            }
            sb.append(">");
            return sb.toString();
        }
    }

    static final class read implements GenericArrayType, Serializable {
        private final Type read;

        public read(Type type) {
            Objects.requireNonNull(type);
            this.read = moveToNext.IconCompatParcelizer(type);
        }

        @Override // java.lang.reflect.GenericArrayType
        public final Type getGenericComponentType() {
            return this.read;
        }

        public final boolean equals(Object obj) {
            return (obj instanceof GenericArrayType) && moveToNext.read(this, (GenericArrayType) obj);
        }

        public final int hashCode() {
            return this.read.hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(moveToNext.write(this.read));
            sb.append(ThemeAlphaConstantsKt.PATH_SEGMENT_ENCODE_SET_URI);
            return sb.toString();
        }
    }

    static final class IconCompatParcelizer implements WildcardType, Serializable {
        private final Type AudioAttributesCompatParcelizer;
        private final Type RemoteActionCompatParcelizer;

        public IconCompatParcelizer(Type[] typeArr, Type[] typeArr2) {
            DownloadException.AudioAttributesCompatParcelizer(typeArr2.length <= 1);
            DownloadException.AudioAttributesCompatParcelizer(typeArr.length == 1);
            if (typeArr2.length == 1) {
                Objects.requireNonNull(typeArr2[0]);
                moveToNext.RemoteActionCompatParcelizer(typeArr2[0]);
                DownloadException.AudioAttributesCompatParcelizer(typeArr[0] == Object.class);
                this.AudioAttributesCompatParcelizer = moveToNext.IconCompatParcelizer(typeArr2[0]);
                this.RemoteActionCompatParcelizer = Object.class;
                return;
            }
            Objects.requireNonNull(typeArr[0]);
            moveToNext.RemoteActionCompatParcelizer(typeArr[0]);
            this.AudioAttributesCompatParcelizer = null;
            this.RemoteActionCompatParcelizer = moveToNext.IconCompatParcelizer(typeArr[0]);
        }

        @Override // java.lang.reflect.WildcardType
        public final Type[] getUpperBounds() {
            return new Type[]{this.RemoteActionCompatParcelizer};
        }

        @Override // java.lang.reflect.WildcardType
        public final Type[] getLowerBounds() {
            Type type = this.AudioAttributesCompatParcelizer;
            return type != null ? new Type[]{type} : moveToNext.RemoteActionCompatParcelizer;
        }

        public final boolean equals(Object obj) {
            return (obj instanceof WildcardType) && moveToNext.read(this, (WildcardType) obj);
        }

        public final int hashCode() {
            Type type = this.AudioAttributesCompatParcelizer;
            return (this.RemoteActionCompatParcelizer.hashCode() + 31) ^ (type != null ? type.hashCode() + 31 : 1);
        }

        public final String toString() {
            if (this.AudioAttributesCompatParcelizer != null) {
                StringBuilder sb = new StringBuilder("? super ");
                sb.append(moveToNext.write(this.AudioAttributesCompatParcelizer));
                return sb.toString();
            }
            if (this.RemoteActionCompatParcelizer == Object.class) {
                return "?";
            }
            StringBuilder sb2 = new StringBuilder("? extends ");
            sb2.append(moveToNext.write(this.RemoteActionCompatParcelizer));
            return sb2.toString();
        }
    }
}
