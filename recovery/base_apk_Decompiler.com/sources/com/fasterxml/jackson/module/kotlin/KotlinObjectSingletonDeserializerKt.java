package com.fasterxml.jackson.module.kotlin;

import com.fasterxml.jackson.databind.JsonDeserializer;
import kotlin.Metadata;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001f\u0010\u0004\u001a\u00020\u0003*\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/fasterxml/jackson/databind/JsonDeserializer;", "", "p0", "Lcom/fasterxml/jackson/module/kotlin/KotlinObjectSingletonDeserializer;", "asSingletonDeserializer", "(Lcom/fasterxml/jackson/databind/JsonDeserializer;Ljava/lang/Object;)Lcom/fasterxml/jackson/module/kotlin/KotlinObjectSingletonDeserializer;"}, k = 2, mv = {1, 5, 1}, xi = 48)
public final class KotlinObjectSingletonDeserializerKt {
    public static final KotlinObjectSingletonDeserializer asSingletonDeserializer(JsonDeserializer<?> jsonDeserializer, Object obj) {
        toMagicModuleMetaRepoModel.write(jsonDeserializer, "");
        toMagicModuleMetaRepoModel.write(obj, "");
        return new KotlinObjectSingletonDeserializer(obj, jsonDeserializer);
    }
}
