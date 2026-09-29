package com.fasterxml.jackson.module.kotlin;

import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.ser.Serializers;
import kotlin.Metadata;
import kotlin.getTopRankers;
import kotlin.setClientAuthToken;
import kotlin.setClientId;
import kotlin.setCustomerEmail;
import kotlin.setCustomerPhone;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\u000b\u001a\b\u0012\u0002\b\u0003\u0018\u00010\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/fasterxml/jackson/module/kotlin/KotlinSerializers;", "Lcom/fasterxml/jackson/databind/ser/Serializers$Base;", "<init>", "()V", "Lcom/fasterxml/jackson/databind/SerializationConfig;", "p0", "Lcom/fasterxml/jackson/databind/JavaType;", "p1", "Lcom/fasterxml/jackson/databind/BeanDescription;", "p2", "Lcom/fasterxml/jackson/databind/JsonSerializer;", "findSerializer", "(Lcom/fasterxml/jackson/databind/SerializationConfig;Lcom/fasterxml/jackson/databind/JavaType;Lcom/fasterxml/jackson/databind/BeanDescription;)Lcom/fasterxml/jackson/databind/JsonSerializer;"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class KotlinSerializers extends Serializers.Base {
    @Override // com.fasterxml.jackson.databind.ser.Serializers.Base, com.fasterxml.jackson.databind.ser.Serializers
    public final JsonSerializer<?> findSerializer(SerializationConfig p0, JavaType p1, BeanDescription p2) {
        toMagicModuleMetaRepoModel.write(p1, "");
        Class<?> rawClass = p1.getRawClass();
        if (getTopRankers.class.isAssignableFrom(rawClass)) {
            return SequenceSerializer.INSTANCE;
        }
        if (setClientAuthToken.class.isAssignableFrom(rawClass)) {
            return UByteSerializer.INSTANCE;
        }
        if (setCustomerPhone.class.isAssignableFrom(rawClass)) {
            return UShortSerializer.INSTANCE;
        }
        if (setCustomerEmail.class.isAssignableFrom(rawClass)) {
            return UIntSerializer.INSTANCE;
        }
        if (setClientId.class.isAssignableFrom(rawClass)) {
            return ULongSerializer.INSTANCE;
        }
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(rawClass, "");
        if (ExtensionsKt.isUnboxableValueClass(rawClass)) {
            return ValueClassSerializer.INSTANCE.from(rawClass);
        }
        return null;
    }
}
