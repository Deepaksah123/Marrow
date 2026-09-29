package kotlin;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes4.dex */
final class setBodyType {
    public static final setBodyType write = new setBodyType();

    private setBodyType() {
    }

    public static String AudioAttributesCompatParcelizer(Method method) {
        toMagicModuleMetaRepoModel.write(method, "");
        StringBuilder sb = new StringBuilder("(");
        Class<?>[] parameterTypes = method.getParameterTypes();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(parameterTypes, "");
        for (Class<?> cls : parameterTypes) {
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(cls, "");
            sb.append(getFinalImageUrl.IconCompatParcelizer(cls));
        }
        sb.append(")");
        Class<?> returnType = method.getReturnType();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(returnType, "");
        sb.append(getFinalImageUrl.IconCompatParcelizer(returnType));
        String string = sb.toString();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
        return string;
    }

    public static String IconCompatParcelizer(Constructor<?> constructor) {
        toMagicModuleMetaRepoModel.write(constructor, "");
        StringBuilder sb = new StringBuilder("(");
        Class<?>[] parameterTypes = constructor.getParameterTypes();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(parameterTypes, "");
        for (Class<?> cls : parameterTypes) {
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(cls, "");
            sb.append(getFinalImageUrl.IconCompatParcelizer(cls));
        }
        sb.append(")V");
        String string = sb.toString();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
        return string;
    }

    public static String IconCompatParcelizer(Field field) {
        toMagicModuleMetaRepoModel.write(field, "");
        Class<?> type = field.getType();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(type, "");
        return getFinalImageUrl.IconCompatParcelizer(type);
    }
}
