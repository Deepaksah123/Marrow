package com.fasterxml.jackson.module.kotlin;

import com.fasterxml.jackson.annotation.JsonKey;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import kotlin.Metadata;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0019\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u0006\u0012\u0002\b\u00030\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ljava/lang/Class;", "Ljava/lang/reflect/Method;", "getStaticJsonKeyGetter", "(Ljava/lang/Class;)Ljava/lang/reflect/Method;"}, k = 2, mv = {1, 5, 1}, xi = 48)
public final class KotlinKeySerializersKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Method getStaticJsonKeyGetter(Class<?> cls) {
        Method method;
        Method[] declaredMethods = cls.getDeclaredMethods();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(declaredMethods, "");
        Method[] methodArr = declaredMethods;
        int length = methodArr.length;
        int i = 0;
        loop0: while (true) {
            if (i >= length) {
                method = null;
                break;
            }
            method = methodArr[i];
            Method method2 = method;
            if (Modifier.isStatic(method2.getModifiers())) {
                Annotation[] annotations = method2.getAnnotations();
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(annotations, "");
                for (Annotation annotation : annotations) {
                    if ((annotation instanceof JsonKey) && ((JsonKey) annotation).value()) {
                        break loop0;
                    }
                }
            }
            i++;
        }
        return method;
    }
}
