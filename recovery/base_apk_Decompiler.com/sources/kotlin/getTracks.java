package kotlin;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes3.dex */
public final class getTracks {
    private static final AudioAttributesCompatParcelizer write;

    static {
        AudioAttributesCompatParcelizer remoteActionCompatParcelizer;
        byte b = 0;
        try {
            remoteActionCompatParcelizer = new IconCompatParcelizer(b);
        } catch (NoSuchMethodException unused) {
            remoteActionCompatParcelizer = new RemoteActionCompatParcelizer(b);
        }
        write = remoteActionCompatParcelizer;
    }

    public static void write(AccessibleObject accessibleObject) throws getDownloaderConstructor {
        try {
            accessibleObject.setAccessible(true);
        } catch (Exception e) {
            String strWrite = write(accessibleObject, false);
            StringBuilder sb = new StringBuilder("Failed making ");
            sb.append(strWrite);
            sb.append(" accessible; either increase its visibility or write a custom TypeAdapter for its declaring type.");
            throw new getDownloaderConstructor(sb.toString(), e);
        }
    }

    public static String write(AccessibleObject accessibleObject, boolean z) {
        String string;
        if (accessibleObject instanceof Field) {
            StringBuilder sb = new StringBuilder("field '");
            sb.append(read((Field) accessibleObject));
            sb.append("'");
            string = sb.toString();
        } else if (accessibleObject instanceof Method) {
            Method method = (Method) accessibleObject;
            StringBuilder sb2 = new StringBuilder(method.getName());
            RemoteActionCompatParcelizer(method, sb2);
            String string2 = sb2.toString();
            StringBuilder sb3 = new StringBuilder("method '");
            sb3.append(method.getDeclaringClass().getName());
            sb3.append("#");
            sb3.append(string2);
            sb3.append("'");
            string = sb3.toString();
        } else if (accessibleObject instanceof Constructor) {
            StringBuilder sb4 = new StringBuilder("constructor '");
            sb4.append(RemoteActionCompatParcelizer((Constructor<?>) accessibleObject));
            sb4.append("'");
            string = sb4.toString();
        } else {
            StringBuilder sb5 = new StringBuilder("<unknown AccessibleObject> ");
            sb5.append(accessibleObject.toString());
            string = sb5.toString();
        }
        if (!z || !Character.isLowerCase(string.charAt(0))) {
            return string;
        }
        StringBuilder sb6 = new StringBuilder();
        sb6.append(Character.toUpperCase(string.charAt(0)));
        sb6.append(string.substring(1));
        return sb6.toString();
    }

    public static String read(Field field) {
        StringBuilder sb = new StringBuilder();
        sb.append(field.getDeclaringClass().getName());
        sb.append("#");
        sb.append(field.getName());
        return sb.toString();
    }

    public static String RemoteActionCompatParcelizer(Constructor<?> constructor) {
        StringBuilder sb = new StringBuilder(constructor.getDeclaringClass().getName());
        RemoteActionCompatParcelizer(constructor, sb);
        return sb.toString();
    }

    private static void RemoteActionCompatParcelizer(AccessibleObject accessibleObject, StringBuilder sb) {
        Class<?>[] parameterTypes;
        sb.append('(');
        if (accessibleObject instanceof Method) {
            parameterTypes = ((Method) accessibleObject).getParameterTypes();
        } else {
            parameterTypes = ((Constructor) accessibleObject).getParameterTypes();
        }
        for (int i = 0; i < parameterTypes.length; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(parameterTypes[i].getSimpleName());
        }
        sb.append(')');
    }

    public static String read(Constructor<?> constructor) {
        try {
            constructor.setAccessible(true);
            return null;
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder("Failed making constructor '");
            sb.append(RemoteActionCompatParcelizer(constructor));
            sb.append("' accessible; either increase its visibility or write a custom InstanceCreator or TypeAdapter for its declaring type: ");
            sb.append(e.getMessage());
            return sb.toString();
        }
    }

    public static boolean read(Class<?> cls) {
        return write.write(cls);
    }

    public static String[] IconCompatParcelizer(Class<?> cls) {
        return write.IconCompatParcelizer(cls);
    }

    public static Method AudioAttributesCompatParcelizer(Class<?> cls, Field field) {
        return write.write(cls, field);
    }

    public static <T> Constructor<T> write(Class<T> cls) {
        return write.AudioAttributesCompatParcelizer(cls);
    }

    public static RuntimeException read(IllegalAccessException illegalAccessException) {
        throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.10.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", illegalAccessException);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static RuntimeException RemoteActionCompatParcelizer(ReflectiveOperationException reflectiveOperationException) {
        throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.10.1). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", reflectiveOperationException);
    }

    static abstract class AudioAttributesCompatParcelizer {
        abstract <T> Constructor<T> AudioAttributesCompatParcelizer(Class<T> cls);

        abstract String[] IconCompatParcelizer(Class<?> cls);

        public abstract Method write(Class<?> cls, Field field);

        abstract boolean write(Class<?> cls);

        private AudioAttributesCompatParcelizer() {
        }

        /* synthetic */ AudioAttributesCompatParcelizer(byte b) {
            this();
        }
    }

    static class IconCompatParcelizer extends AudioAttributesCompatParcelizer {
        private final Method AudioAttributesCompatParcelizer;
        private final Method IconCompatParcelizer;
        private final Method read;
        private final Method write;

        /* synthetic */ IconCompatParcelizer(byte b) throws NoSuchMethodException {
            this();
        }

        private IconCompatParcelizer() throws NoSuchMethodException {
            super((byte) 0);
            this.AudioAttributesCompatParcelizer = Class.class.getMethod("isRecord", new Class[0]);
            Method method = Class.class.getMethod("getRecordComponents", new Class[0]);
            this.write = method;
            Class<?> componentType = method.getReturnType().getComponentType();
            this.IconCompatParcelizer = componentType.getMethod("getName", new Class[0]);
            this.read = componentType.getMethod("getType", new Class[0]);
        }

        @Override // o.getTracks.AudioAttributesCompatParcelizer
        final boolean write(Class<?> cls) {
            try {
                return ((Boolean) this.AudioAttributesCompatParcelizer.invoke(cls, new Object[0])).booleanValue();
            } catch (ReflectiveOperationException e) {
                throw getTracks.RemoteActionCompatParcelizer(e);
            }
        }

        @Override // o.getTracks.AudioAttributesCompatParcelizer
        final String[] IconCompatParcelizer(Class<?> cls) {
            try {
                Object[] objArr = (Object[]) this.write.invoke(cls, new Object[0]);
                String[] strArr = new String[objArr.length];
                for (int i = 0; i < objArr.length; i++) {
                    strArr[i] = (String) this.IconCompatParcelizer.invoke(objArr[i], new Object[0]);
                }
                return strArr;
            } catch (ReflectiveOperationException e) {
                throw getTracks.RemoteActionCompatParcelizer(e);
            }
        }

        @Override // o.getTracks.AudioAttributesCompatParcelizer
        public final <T> Constructor<T> AudioAttributesCompatParcelizer(Class<T> cls) {
            try {
                Object[] objArr = (Object[]) this.write.invoke(cls, new Object[0]);
                Class<?>[] clsArr = new Class[objArr.length];
                for (int i = 0; i < objArr.length; i++) {
                    clsArr[i] = (Class) this.read.invoke(objArr[i], new Object[0]);
                }
                return cls.getDeclaredConstructor(clsArr);
            } catch (ReflectiveOperationException e) {
                throw getTracks.RemoteActionCompatParcelizer(e);
            }
        }

        @Override // o.getTracks.AudioAttributesCompatParcelizer
        public final Method write(Class<?> cls, Field field) {
            try {
                return cls.getMethod(field.getName(), new Class[0]);
            } catch (ReflectiveOperationException e) {
                throw getTracks.RemoteActionCompatParcelizer(e);
            }
        }
    }

    static class RemoteActionCompatParcelizer extends AudioAttributesCompatParcelizer {
        @Override // o.getTracks.AudioAttributesCompatParcelizer
        final boolean write(Class<?> cls) {
            return false;
        }

        private RemoteActionCompatParcelizer() {
            super((byte) 0);
        }

        /* synthetic */ RemoteActionCompatParcelizer(byte b) {
            this();
        }

        @Override // o.getTracks.AudioAttributesCompatParcelizer
        final String[] IconCompatParcelizer(Class<?> cls) {
            throw new UnsupportedOperationException("Records are not supported on this JVM, this method should not be called");
        }

        @Override // o.getTracks.AudioAttributesCompatParcelizer
        final <T> Constructor<T> AudioAttributesCompatParcelizer(Class<T> cls) {
            throw new UnsupportedOperationException("Records are not supported on this JVM, this method should not be called");
        }

        @Override // o.getTracks.AudioAttributesCompatParcelizer
        public final Method write(Class<?> cls, Field field) {
            throw new UnsupportedOperationException("Records are not supported on this JVM, this method should not be called");
        }
    }
}
