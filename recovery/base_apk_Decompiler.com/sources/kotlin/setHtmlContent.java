package kotlin;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes4.dex */
final class setHtmlContent {
    private static IconCompatParcelizer AudioAttributesCompatParcelizer;
    public static final setHtmlContent write = new setHtmlContent();

    public static final class IconCompatParcelizer {
        private final Method AudioAttributesCompatParcelizer;
        private final Method write;

        public IconCompatParcelizer(Method method, Method method2) {
            this.AudioAttributesCompatParcelizer = method;
            this.write = method2;
        }

        public final Method write() {
            return this.AudioAttributesCompatParcelizer;
        }

        public final Method RemoteActionCompatParcelizer() {
            return this.write;
        }
    }

    private setHtmlContent() {
    }

    private static IconCompatParcelizer write(Object obj) {
        Class<?> cls = obj.getClass();
        try {
            return new IconCompatParcelizer(cls.getMethod("getType", new Class[0]), cls.getMethod("getAccessor", new Class[0]));
        } catch (NoSuchMethodException unused) {
            return new IconCompatParcelizer(null, null);
        }
    }

    private static IconCompatParcelizer read(Object obj) {
        IconCompatParcelizer iconCompatParcelizer = AudioAttributesCompatParcelizer;
        if (iconCompatParcelizer != null) {
            return iconCompatParcelizer;
        }
        IconCompatParcelizer iconCompatParcelizerWrite = write(obj);
        AudioAttributesCompatParcelizer = iconCompatParcelizerWrite;
        return iconCompatParcelizerWrite;
    }

    public final Class<?> RemoteActionCompatParcelizer(Object obj) throws IllegalAccessException, InvocationTargetException {
        toMagicModuleMetaRepoModel.write(obj, "");
        Method methodWrite = read(obj).write();
        if (methodWrite == null) {
            return null;
        }
        Object objInvoke = methodWrite.invoke(obj, new Object[0]);
        toMagicModuleMetaRepoModel.read(objInvoke, "");
        return (Class) objInvoke;
    }

    public final Method AudioAttributesCompatParcelizer(Object obj) throws IllegalAccessException, InvocationTargetException {
        toMagicModuleMetaRepoModel.write(obj, "");
        Method methodRemoteActionCompatParcelizer = read(obj).RemoteActionCompatParcelizer();
        if (methodRemoteActionCompatParcelizer == null) {
            return null;
        }
        Object objInvoke = methodRemoteActionCompatParcelizer.invoke(obj, new Object[0]);
        toMagicModuleMetaRepoModel.read(objInvoke, "");
        return (Method) objInvoke;
    }
}
