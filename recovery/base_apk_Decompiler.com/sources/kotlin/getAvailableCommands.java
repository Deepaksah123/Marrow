package kotlin;

import com.airbnb.epoxy.NoOpControllerHelper;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class getAvailableCommands {
    private static final Map<Class<?>, Constructor<?>> read = new LinkedHashMap();
    private static final NoOpControllerHelper RemoteActionCompatParcelizer = new NoOpControllerHelper();

    getAvailableCommands() {
    }

    static getApplicationLooper read(getContentBufferedPosition getcontentbufferedposition) {
        Constructor<?> constructorIconCompatParcelizer = IconCompatParcelizer(getcontentbufferedposition.getClass());
        if (constructorIconCompatParcelizer == null) {
            return RemoteActionCompatParcelizer;
        }
        try {
            return (getApplicationLooper) constructorIconCompatParcelizer.newInstance(getcontentbufferedposition);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Unable to invoke ".concat(String.valueOf(constructorIconCompatParcelizer)), e);
        } catch (InstantiationException e2) {
            throw new RuntimeException("Unable to invoke ".concat(String.valueOf(constructorIconCompatParcelizer)), e2);
        } catch (InvocationTargetException e3) {
            Throwable cause = e3.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unable to get Epoxy helper class.", cause);
        }
    }

    private static Constructor<?> IconCompatParcelizer(Class<?> cls) {
        Constructor<?> constructorIconCompatParcelizer;
        Map<Class<?>, Constructor<?>> map = read;
        Constructor<?> constructor = map.get(cls);
        if (constructor != null || map.containsKey(cls)) {
            return constructor;
        }
        String name = cls.getName();
        if (name.startsWith("android.") || name.startsWith("java.")) {
            return null;
        }
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(name);
            sb.append("_EpoxyHelper");
            constructorIconCompatParcelizer = Class.forName(sb.toString()).getConstructor(cls);
        } catch (ClassNotFoundException unused) {
            constructorIconCompatParcelizer = IconCompatParcelizer(cls.getSuperclass());
        } catch (NoSuchMethodException e) {
            throw new RuntimeException("Unable to find Epoxy Helper constructor for ".concat(String.valueOf(name)), e);
        }
        read.put(cls, constructorIconCompatParcelizer);
        return constructorIconCompatParcelizer;
    }
}
