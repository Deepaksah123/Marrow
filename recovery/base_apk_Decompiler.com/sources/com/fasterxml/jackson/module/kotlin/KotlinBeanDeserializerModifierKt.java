package com.fasterxml.jackson.module.kotlin;

import kotlin.MagicModuleFeedbackRequestBody;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u001a\u001d\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u0000H\u0002¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ljava/lang/Class;", "p0", "", "objectSingletonInstance", "(Ljava/lang/Class;)Ljava/lang/Object;"}, k = 2, mv = {1, 5, 1}, xi = 48)
public final class KotlinBeanDeserializerModifierKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Object objectSingletonInstance(Class<?> cls) {
        if (KotlinModuleKt.isKotlinClass(cls)) {
            return MagicModuleFeedbackRequestBody.read(cls).MediaBrowserCompatCustomActionResultReceiver();
        }
        return null;
    }
}
