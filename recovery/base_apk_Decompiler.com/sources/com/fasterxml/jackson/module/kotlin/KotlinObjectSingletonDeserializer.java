package com.fasterxml.jackson.module.kotlin;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.deser.ContextualDeserializer;
import com.fasterxml.jackson.databind.deser.NullValueProvider;
import com.fasterxml.jackson.databind.deser.ResolvableDeserializer;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004B\u001b\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0001¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\u00012\b\u0010\u0005\u001a\u0004\u0018\u00010\t2\b\u0010\u0006\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0011\u001a\u00020\u00102\b\u0010\u0005\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/fasterxml/jackson/module/kotlin/KotlinObjectSingletonDeserializer;", "Lcom/fasterxml/jackson/databind/JsonDeserializer;", "", "Lcom/fasterxml/jackson/databind/deser/ContextualDeserializer;", "Lcom/fasterxml/jackson/databind/deser/ResolvableDeserializer;", "p0", "p1", "<init>", "(Ljava/lang/Object;Lcom/fasterxml/jackson/databind/JsonDeserializer;)V", "Lcom/fasterxml/jackson/databind/DeserializationContext;", "Lcom/fasterxml/jackson/databind/BeanProperty;", "createContextual", "(Lcom/fasterxml/jackson/databind/DeserializationContext;Lcom/fasterxml/jackson/databind/BeanProperty;)Lcom/fasterxml/jackson/databind/JsonDeserializer;", "Lcom/fasterxml/jackson/core/JsonParser;", "deserialize", "(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;)Ljava/lang/Object;", "", "resolve", "(Lcom/fasterxml/jackson/databind/DeserializationContext;)V", "defaultDeserializer", "Lcom/fasterxml/jackson/databind/JsonDeserializer;", "singletonInstance", "Ljava/lang/Object;"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class KotlinObjectSingletonDeserializer extends JsonDeserializer<Object> implements ContextualDeserializer, ResolvableDeserializer {
    private final JsonDeserializer<?> defaultDeserializer;
    private final Object singletonInstance;

    public KotlinObjectSingletonDeserializer(Object obj, JsonDeserializer<?> jsonDeserializer) {
        toMagicModuleMetaRepoModel.write(obj, "");
        toMagicModuleMetaRepoModel.write(jsonDeserializer, "");
        this.singletonInstance = obj;
        this.defaultDeserializer = jsonDeserializer;
    }

    @Override // com.fasterxml.jackson.databind.deser.ResolvableDeserializer
    public final void resolve(DeserializationContext p0) throws JsonMappingException {
        NullValueProvider nullValueProvider = this.defaultDeserializer;
        if (nullValueProvider instanceof ResolvableDeserializer) {
            ((ResolvableDeserializer) nullValueProvider).resolve(p0);
        }
    }

    @Override // com.fasterxml.jackson.databind.deser.ContextualDeserializer
    public final JsonDeserializer<?> createContextual(DeserializationContext p0, BeanProperty p1) throws JsonMappingException {
        NullValueProvider nullValueProvider = this.defaultDeserializer;
        if (nullValueProvider instanceof ContextualDeserializer) {
            JsonDeserializer<?> jsonDeserializerCreateContextual = ((ContextualDeserializer) nullValueProvider).createContextual(p0, p1);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(jsonDeserializerCreateContextual, "");
            return KotlinObjectSingletonDeserializerKt.asSingletonDeserializer(jsonDeserializerCreateContextual, this.singletonInstance);
        }
        return this;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final Object deserialize(JsonParser p0, DeserializationContext p1) throws IOException {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        this.defaultDeserializer.deserialize(p0, p1);
        return this.singletonInstance;
    }
}
