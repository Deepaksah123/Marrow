package kotlin;

import android.app.Application;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class hasNext {
    private static final List<Class<?>> RemoteActionCompatParcelizer = IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Object[]) new Class[]{Application.class, POJOPropertyBuilder5.class});
    private static final List<Class<?>> IconCompatParcelizer = IntermediateLoginResponseBody.RemoteActionCompatParcelizer(POJOPropertyBuilder5.class);

    public static final <T extends POJOPropertyBuilderWithMember> T read(Class<T> cls, Constructor<T> constructor, Object... objArr) {
        toMagicModuleMetaRepoModel.write(cls, "");
        toMagicModuleMetaRepoModel.write(constructor, "");
        toMagicModuleMetaRepoModel.write(objArr, "");
        try {
            return constructor.newInstance(Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Failed to access ".concat(String.valueOf(cls)), e);
        } catch (InstantiationException e2) {
            StringBuilder sb = new StringBuilder("A ");
            sb.append(cls);
            sb.append(" cannot be instantiated.");
            throw new RuntimeException(sb.toString(), e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException("An exception happened in constructor of ".concat(String.valueOf(cls)), e3.getCause());
        }
    }

    public static final <T> Constructor<T> write(Class<T> cls, List<? extends Class<?>> list) {
        toMagicModuleMetaRepoModel.write(cls, "");
        toMagicModuleMetaRepoModel.write(list, "");
        Iterator itAudioAttributesCompatParcelizer = r8lambda_QgM1da7JykGH9FQp_oipiZItrY.AudioAttributesCompatParcelizer(cls.getConstructors());
        while (itAudioAttributesCompatParcelizer.hasNext()) {
            Constructor<T> constructor = (Constructor) itAudioAttributesCompatParcelizer.next();
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(parameterTypes, "");
            List listOnCommand = getOrderDetails.onCommand(parameterTypes);
            if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(list, listOnCommand)) {
                toMagicModuleMetaRepoModel.read(constructor, "");
                return constructor;
            }
            if (list.size() == listOnCommand.size() && listOnCommand.containsAll(list)) {
                StringBuilder sb = new StringBuilder("Class ");
                sb.append(cls.getSimpleName());
                sb.append(" must have parameters in the proper order: ");
                sb.append(list);
                throw new UnsupportedOperationException(sb.toString());
            }
        }
        return null;
    }
}
