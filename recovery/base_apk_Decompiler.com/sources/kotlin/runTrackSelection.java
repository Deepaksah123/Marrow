package kotlin;

import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes3.dex */
public abstract class runTrackSelection {
    public static final runTrackSelection RemoteActionCompatParcelizer = read();

    public abstract <T> T write(Class<T> cls) throws Exception;

    /* JADX INFO: Access modifiers changed from: private */
    public static void RemoteActionCompatParcelizer(Class<?> cls) {
        String strRemoteActionCompatParcelizer = moveToLast.RemoteActionCompatParcelizer(cls);
        if (strRemoteActionCompatParcelizer != null) {
            throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(String.valueOf(strRemoteActionCompatParcelizer)));
        }
    }

    private static runTrackSelection read() {
        try {
            Class<?> cls = Class.forName("sun.misc.Unsafe");
            Field declaredField = cls.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            final Object obj = declaredField.get(null);
            final Method method = cls.getMethod("allocateInstance", Class.class);
            return new runTrackSelection() { // from class: o.runTrackSelection.5
                @Override // kotlin.runTrackSelection
                public final <T> T write(Class<T> cls2) throws Exception {
                    runTrackSelection.RemoteActionCompatParcelizer(cls2);
                    return (T) method.invoke(obj, cls2);
                }
            };
        } catch (Exception unused) {
            try {
                try {
                    Method declaredMethod = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", Class.class);
                    declaredMethod.setAccessible(true);
                    final int iIntValue = ((Integer) declaredMethod.invoke(null, Object.class)).intValue();
                    final Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod("newInstance", Class.class, Integer.TYPE);
                    declaredMethod2.setAccessible(true);
                    return new runTrackSelection() { // from class: o.runTrackSelection.1
                        @Override // kotlin.runTrackSelection
                        public final <T> T write(Class<T> cls2) throws Exception {
                            runTrackSelection.RemoteActionCompatParcelizer(cls2);
                            return (T) declaredMethod2.invoke(null, cls2, Integer.valueOf(iIntValue));
                        }
                    };
                } catch (Exception unused2) {
                    return new runTrackSelection() { // from class: o.runTrackSelection.4
                        @Override // kotlin.runTrackSelection
                        public final <T> T write(Class<T> cls2) {
                            StringBuilder sb = new StringBuilder("Cannot allocate ");
                            sb.append(cls2);
                            sb.append(". Usage of JDK sun.misc.Unsafe is enabled, but it could not be used. Make sure your runtime is configured correctly.");
                            throw new UnsupportedOperationException(sb.toString());
                        }
                    };
                }
            } catch (Exception unused3) {
                final Method declaredMethod3 = ObjectInputStream.class.getDeclaredMethod("newInstance", Class.class, Class.class);
                declaredMethod3.setAccessible(true);
                return new runTrackSelection() { // from class: o.runTrackSelection.2
                    @Override // kotlin.runTrackSelection
                    public final <T> T write(Class<T> cls2) throws Exception {
                        runTrackSelection.RemoteActionCompatParcelizer(cls2);
                        return (T) declaredMethod3.invoke(null, cls2, Object.class);
                    }
                };
            }
        }
    }
}
