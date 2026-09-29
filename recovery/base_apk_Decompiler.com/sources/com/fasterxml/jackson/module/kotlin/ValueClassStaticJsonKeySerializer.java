package com.fasterxml.jackson.module.kotlin;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.Metadata;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0000\u0018\u0000 \u0014*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0001\u0014B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\r\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0018\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012"}, d2 = {"Lcom/fasterxml/jackson/module/kotlin/ValueClassStaticJsonKeySerializer;", "T", "Lcom/fasterxml/jackson/databind/ser/std/StdSerializer;", "Ljava/lang/Class;", "p0", "Ljava/lang/reflect/Method;", "p1", "<init>", "(Ljava/lang/Class;Ljava/lang/reflect/Method;)V", "Lcom/fasterxml/jackson/core/JsonGenerator;", "Lcom/fasterxml/jackson/databind/SerializerProvider;", "p2", "", "serialize", "(Ljava/lang/Object;Lcom/fasterxml/jackson/core/JsonGenerator;Lcom/fasterxml/jackson/databind/SerializerProvider;)V", "keyType", "Ljava/lang/Class;", "staticJsonKeyGetter", "Ljava/lang/reflect/Method;", "unboxMethod", "Companion"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class ValueClassStaticJsonKeySerializer<T> extends StdSerializer<T> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Class<?> keyType;
    private final Method staticJsonKeyGetter;
    private final Method unboxMethod;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ValueClassStaticJsonKeySerializer(Class<T> cls, Method method) throws NoSuchMethodException {
        super(cls);
        toMagicModuleMetaRepoModel.write(cls, "");
        toMagicModuleMetaRepoModel.write(method, "");
        this.staticJsonKeyGetter = method;
        Class<?> returnType = method.getReturnType();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(returnType, "");
        this.keyType = returnType;
        Method method2 = cls.getMethod("unbox-impl", new Class[0]);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(method2, "");
        this.unboxMethod = method2;
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, com.fasterxml.jackson.databind.JsonSerializer
    public final void serialize(T p0, JsonGenerator p1, SerializerProvider p2) throws IllegalAccessException, IOException, InvocationTargetException {
        toMagicModuleMetaRepoModel.write(p1, "");
        toMagicModuleMetaRepoModel.write(p2, "");
        Object objInvoke = this.staticJsonKeyGetter.invoke(null, this.unboxMethod.invoke(p0, new Object[0]));
        JsonSerializer<Object> jsonSerializerFindKeySerializer = objInvoke == null ? null : p2.findKeySerializer(this.keyType, (BeanProperty) null);
        if (jsonSerializerFindKeySerializer == null) {
            jsonSerializerFindKeySerializer = p2.findNullKeySerializer(p2.constructType(this.keyType), null);
        }
        jsonSerializerFindKeySerializer.serialize(objInvoke, p1, p2);
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\u0007\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00062\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/fasterxml/jackson/module/kotlin/ValueClassStaticJsonKeySerializer$Companion;", "", "<init>", "()V", "Ljava/lang/Class;", "p0", "Lcom/fasterxml/jackson/databind/ser/std/StdSerializer;", "createOrNull", "(Ljava/lang/Class;)Lcom/fasterxml/jackson/databind/ser/std/StdSerializer;"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final StdSerializer<?> createOrNull(Class<?> p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            Method staticJsonKeyGetter = KotlinKeySerializersKt.getStaticJsonKeyGetter(p0);
            return staticJsonKeyGetter == null ? null : new ValueClassStaticJsonKeySerializer(p0, staticJsonKeyGetter);
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }
}
