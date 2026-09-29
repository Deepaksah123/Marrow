package com.fasterxml.jackson.module.kotlin;

import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.KeyDeserializer;
import com.fasterxml.jackson.databind.deser.std.StdKeyDeserializers;
import kotlin.Metadata;
import kotlin.setClientAuthToken;
import kotlin.setClientId;
import kotlin.setCustomerEmail;
import kotlin.setCustomerPhone;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/fasterxml/jackson/module/kotlin/KotlinKeyDeserializers;", "Lcom/fasterxml/jackson/databind/deser/std/StdKeyDeserializers;", "<init>", "()V", "Lcom/fasterxml/jackson/databind/JavaType;", "p0", "Lcom/fasterxml/jackson/databind/DeserializationConfig;", "p1", "Lcom/fasterxml/jackson/databind/BeanDescription;", "p2", "Lcom/fasterxml/jackson/databind/KeyDeserializer;", "findKeyDeserializer", "(Lcom/fasterxml/jackson/databind/JavaType;Lcom/fasterxml/jackson/databind/DeserializationConfig;Lcom/fasterxml/jackson/databind/BeanDescription;)Lcom/fasterxml/jackson/databind/KeyDeserializer;"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class KotlinKeyDeserializers extends StdKeyDeserializers {
    public static final KotlinKeyDeserializers INSTANCE = new KotlinKeyDeserializers();

    private KotlinKeyDeserializers() {
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdKeyDeserializers, com.fasterxml.jackson.databind.deser.KeyDeserializers
    public final KeyDeserializer findKeyDeserializer(JavaType p0, DeserializationConfig p1, BeanDescription p2) {
        toMagicModuleMetaRepoModel.write(p0, "");
        Class<?> rawClass = p0.getRawClass();
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(rawClass, setClientAuthToken.class)) {
            return UByteKeyDeserializer.INSTANCE;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(rawClass, setCustomerPhone.class)) {
            return UShortKeyDeserializer.INSTANCE;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(rawClass, setCustomerEmail.class)) {
            return UIntKeyDeserializer.INSTANCE;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(rawClass, setClientId.class)) {
            return ULongKeyDeserializer.INSTANCE;
        }
        return null;
    }
}
