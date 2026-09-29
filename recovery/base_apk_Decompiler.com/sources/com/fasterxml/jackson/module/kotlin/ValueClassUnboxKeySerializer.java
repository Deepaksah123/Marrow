package com.fasterxml.jackson.module.kotlin;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/fasterxml/jackson/module/kotlin/ValueClassUnboxKeySerializer;", "Lcom/fasterxml/jackson/databind/ser/std/StdSerializer;", "", "<init>", "()V", "p0", "Lcom/fasterxml/jackson/core/JsonGenerator;", "p1", "Lcom/fasterxml/jackson/databind/SerializerProvider;", "p2", "", "serialize", "(Ljava/lang/Object;Lcom/fasterxml/jackson/core/JsonGenerator;Lcom/fasterxml/jackson/databind/SerializerProvider;)V"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class ValueClassUnboxKeySerializer extends StdSerializer<Object> {
    public static final ValueClassUnboxKeySerializer INSTANCE = new ValueClassUnboxKeySerializer();

    private ValueClassUnboxKeySerializer() {
        super(Object.class);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, com.fasterxml.jackson.databind.JsonSerializer
    public final void serialize(Object p0, JsonGenerator p1, SerializerProvider p2) throws IllegalAccessException, NoSuchMethodException, IOException, InvocationTargetException {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        toMagicModuleMetaRepoModel.write(p2, "");
        Method method = p0.getClass().getMethod("unbox-impl", new Class[0]);
        Object objInvoke = method.invoke(p0, new Object[0]);
        if (objInvoke == null) {
            p2.findNullKeySerializer(p2.getTypeFactory().constructType(method.getGenericReturnType()), null).serialize(null, p1, p2);
        } else {
            p2.findKeySerializer(objInvoke.getClass(), (BeanProperty) null).serialize(objInvoke, p1, p2);
        }
    }
}
