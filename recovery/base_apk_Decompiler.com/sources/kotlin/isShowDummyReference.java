package kotlin;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes4.dex */
final class isShowDummyReference {
    private static write read;
    public static final isShowDummyReference write = new isShowDummyReference();

    public static final class write {
        private final Method AudioAttributesCompatParcelizer;
        private final Method IconCompatParcelizer;
        private final Method RemoteActionCompatParcelizer;
        private final Method write;

        public write(Method method, Method method2, Method method3, Method method4) {
            this.write = method;
            this.AudioAttributesCompatParcelizer = method2;
            this.IconCompatParcelizer = method3;
            this.RemoteActionCompatParcelizer = method4;
        }

        public final Method write() {
            return this.write;
        }

        public final Method read() {
            return this.AudioAttributesCompatParcelizer;
        }

        public final Method AudioAttributesCompatParcelizer() {
            return this.IconCompatParcelizer;
        }

        public final Method IconCompatParcelizer() {
            return this.RemoteActionCompatParcelizer;
        }
    }

    private isShowDummyReference() {
    }

    private static write read() {
        try {
            return new write(Class.class.getMethod("isSealed", new Class[0]), Class.class.getMethod("getPermittedSubclasses", new Class[0]), Class.class.getMethod("isRecord", new Class[0]), Class.class.getMethod("getRecordComponents", new Class[0]));
        } catch (NoSuchMethodException unused) {
            return new write(null, null, null, null);
        }
    }

    private static write write() {
        write writeVar = read;
        if (writeVar != null) {
            return writeVar;
        }
        write writeVar2 = read();
        read = writeVar2;
        return writeVar2;
    }

    public final Boolean read(Class<?> cls) throws IllegalAccessException, InvocationTargetException {
        toMagicModuleMetaRepoModel.write(cls, "");
        Method methodWrite = write().write();
        if (methodWrite == null) {
            return null;
        }
        Object objInvoke = methodWrite.invoke(cls, new Object[0]);
        toMagicModuleMetaRepoModel.read(objInvoke, "");
        return (Boolean) objInvoke;
    }

    public final Class<?>[] write(Class<?> cls) throws IllegalAccessException, InvocationTargetException {
        toMagicModuleMetaRepoModel.write(cls, "");
        Method method = write().read();
        if (method == null) {
            return null;
        }
        Object objInvoke = method.invoke(cls, new Object[0]);
        toMagicModuleMetaRepoModel.read(objInvoke, "");
        return (Class[]) objInvoke;
    }

    public final Boolean IconCompatParcelizer(Class<?> cls) throws IllegalAccessException, InvocationTargetException {
        toMagicModuleMetaRepoModel.write(cls, "");
        Method methodAudioAttributesCompatParcelizer = write().AudioAttributesCompatParcelizer();
        if (methodAudioAttributesCompatParcelizer == null) {
            return null;
        }
        Object objInvoke = methodAudioAttributesCompatParcelizer.invoke(cls, new Object[0]);
        toMagicModuleMetaRepoModel.read(objInvoke, "");
        return (Boolean) objInvoke;
    }

    public final Object[] RemoteActionCompatParcelizer(Class<?> cls) {
        toMagicModuleMetaRepoModel.write(cls, "");
        Method methodIconCompatParcelizer = write().IconCompatParcelizer();
        if (methodIconCompatParcelizer == null) {
            return null;
        }
        return (Object[]) methodIconCompatParcelizer.invoke(cls, new Object[0]);
    }
}
