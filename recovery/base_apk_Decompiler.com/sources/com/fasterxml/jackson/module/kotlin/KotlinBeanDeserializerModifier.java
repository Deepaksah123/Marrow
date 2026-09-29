package com.fasterxml.jackson.module.kotlin;

import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.deser.BeanDeserializerModifier;
import kotlin.Metadata;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J3\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\bH\u0016¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/fasterxml/jackson/module/kotlin/KotlinBeanDeserializerModifier;", "Lcom/fasterxml/jackson/databind/deser/BeanDeserializerModifier;", "<init>", "()V", "Lcom/fasterxml/jackson/databind/DeserializationConfig;", "p0", "Lcom/fasterxml/jackson/databind/BeanDescription;", "p1", "Lcom/fasterxml/jackson/databind/JsonDeserializer;", "p2", "", "modifyDeserializer", "(Lcom/fasterxml/jackson/databind/DeserializationConfig;Lcom/fasterxml/jackson/databind/BeanDescription;Lcom/fasterxml/jackson/databind/JsonDeserializer;)Lcom/fasterxml/jackson/databind/JsonDeserializer;"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class KotlinBeanDeserializerModifier extends BeanDeserializerModifier {
    public static final KotlinBeanDeserializerModifier INSTANCE = new KotlinBeanDeserializerModifier();

    private KotlinBeanDeserializerModifier() {
    }

    @Override // com.fasterxml.jackson.databind.deser.BeanDeserializerModifier
    public final JsonDeserializer<? extends Object> modifyDeserializer(DeserializationConfig p0, BeanDescription p1, JsonDeserializer<?> p2) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        toMagicModuleMetaRepoModel.write(p2, "");
        JsonDeserializer jsonDeserializerModifyDeserializer = super.modifyDeserializer(p0, p1, p2);
        Class<?> beanClass = p1.getBeanClass();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(beanClass, "");
        Object objObjectSingletonInstance = KotlinBeanDeserializerModifierKt.objectSingletonInstance(beanClass);
        if (objObjectSingletonInstance != null) {
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(jsonDeserializerModifyDeserializer, "");
            return new KotlinObjectSingletonDeserializer(objObjectSingletonInstance, jsonDeserializerModifyDeserializer);
        }
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(jsonDeserializerModifyDeserializer, "");
        return jsonDeserializerModifyDeserializer;
    }
}
