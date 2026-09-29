package com.fasterxml.jackson.module.kotlin;

import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.deser.Deserializers;
import kotlin.Metadata;
import kotlin.getTopRankers;
import kotlin.newYearNameItem;
import kotlin.setClientAuthToken;
import kotlin.setClientId;
import kotlin.setCustomerEmail;
import kotlin.setCustomerPhone;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\u000b\u001a\b\u0012\u0002\b\u0003\u0018\u00010\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/fasterxml/jackson/module/kotlin/KotlinDeserializers;", "Lcom/fasterxml/jackson/databind/deser/Deserializers$Base;", "<init>", "()V", "Lcom/fasterxml/jackson/databind/JavaType;", "p0", "Lcom/fasterxml/jackson/databind/DeserializationConfig;", "p1", "Lcom/fasterxml/jackson/databind/BeanDescription;", "p2", "Lcom/fasterxml/jackson/databind/JsonDeserializer;", "findBeanDeserializer", "(Lcom/fasterxml/jackson/databind/JavaType;Lcom/fasterxml/jackson/databind/DeserializationConfig;Lcom/fasterxml/jackson/databind/BeanDescription;)Lcom/fasterxml/jackson/databind/JsonDeserializer;"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class KotlinDeserializers extends Deserializers.Base {
    @Override // com.fasterxml.jackson.databind.deser.Deserializers.Base, com.fasterxml.jackson.databind.deser.Deserializers
    public final JsonDeserializer<?> findBeanDeserializer(JavaType p0, DeserializationConfig p1, BeanDescription p2) {
        toMagicModuleMetaRepoModel.write(p0, "");
        if (p0.isInterface() && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0.getRawClass(), getTopRankers.class)) {
            return SequenceDeserializer.INSTANCE;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0.getRawClass(), newYearNameItem.class)) {
            return RegexDeserializer.INSTANCE;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0.getRawClass(), setClientAuthToken.class)) {
            return UByteDeserializer.INSTANCE;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0.getRawClass(), setCustomerPhone.class)) {
            return UShortDeserializer.INSTANCE;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0.getRawClass(), setCustomerEmail.class)) {
            return UIntDeserializer.INSTANCE;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0.getRawClass(), setClientId.class)) {
            return ULongDeserializer.INSTANCE;
        }
        return null;
    }
}
