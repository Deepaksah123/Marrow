package com.fasterxml.jackson.module.kotlin;

import java.lang.annotation.Annotation;
import kotlin.MagicModuleFeedbackRequestBody;
import kotlin.Metadata;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u0015\u0010\u0002\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ljava/lang/Class;", "", "isKotlinClass", "(Ljava/lang/Class;)Z"}, k = 2, mv = {1, 5, 1}, xi = 48)
public final class KotlinModuleKt {
    public static final boolean isKotlinClass(Class<?> cls) {
        toMagicModuleMetaRepoModel.write(cls, "");
        Annotation[] declaredAnnotations = cls.getDeclaredAnnotations();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(declaredAnnotations, "");
        for (Annotation annotation : declaredAnnotations) {
            if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) MagicModuleFeedbackRequestBody.IconCompatParcelizer(MagicModuleFeedbackRequestBody.IconCompatParcelizer(annotation)).getName(), (Object) "kotlin.Metadata")) {
                return true;
            }
        }
        return false;
    }
}
