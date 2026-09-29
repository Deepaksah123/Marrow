package com.fasterxml.jackson.module.kotlin;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.Metadata;
import kotlin.getShowPopup;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\b0\u0018\u0000 \b*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0002\b\tB\u0017\b\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\u0006\u0010\u0007\u0082\u0001\u0001\n"}, d2 = {"Lcom/fasterxml/jackson/module/kotlin/ValueClassSerializer;", "", "T", "Lcom/fasterxml/jackson/databind/ser/std/StdSerializer;", "Ljava/lang/Class;", "p0", "<init>", "(Ljava/lang/Class;)V", "Companion", "StaticJsonValue", "Lcom/fasterxml/jackson/module/kotlin/ValueClassSerializer$StaticJsonValue;"}, k = 1, mv = {1, 5, 1}, xi = 48)
public abstract class ValueClassSerializer<T> extends StdSerializer<T> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    private ValueClassSerializer(Class<T> cls) {
        super(cls);
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000*\b\b\u0001\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00010\u0003B\u001d\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ'\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00028\u00012\u0006\u0010\u0007\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011"}, d2 = {"Lcom/fasterxml/jackson/module/kotlin/ValueClassSerializer$StaticJsonValue;", "", "T", "Lcom/fasterxml/jackson/module/kotlin/ValueClassSerializer;", "Ljava/lang/Class;", "p0", "Ljava/lang/reflect/Method;", "p1", "<init>", "(Ljava/lang/Class;Ljava/lang/reflect/Method;)V", "Lcom/fasterxml/jackson/core/JsonGenerator;", "Lcom/fasterxml/jackson/databind/SerializerProvider;", "p2", "", "serialize", "(Ljava/lang/Object;Lcom/fasterxml/jackson/core/JsonGenerator;Lcom/fasterxml/jackson/databind/SerializerProvider;)V", "staticJsonValueGetter", "Ljava/lang/reflect/Method;", "unboxMethod"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class StaticJsonValue<T> extends ValueClassSerializer<T> {
        private final Method staticJsonValueGetter;
        private final Method unboxMethod;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StaticJsonValue(Class<T> cls, Method method) throws NoSuchMethodException {
            super(cls, null);
            toMagicModuleMetaRepoModel.write(cls, "");
            toMagicModuleMetaRepoModel.write(method, "");
            this.staticJsonValueGetter = method;
            Method method2 = cls.getMethod("unbox-impl", new Class[0]);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(method2, "");
            this.unboxMethod = method2;
        }

        @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, com.fasterxml.jackson.databind.JsonSerializer
        public final void serialize(T p0, JsonGenerator p1, SerializerProvider p2) throws IllegalAccessException, IOException, InvocationTargetException {
            getShowPopup getshowpopup;
            toMagicModuleMetaRepoModel.write(p0, "");
            toMagicModuleMetaRepoModel.write(p1, "");
            toMagicModuleMetaRepoModel.write(p2, "");
            Object objInvoke = this.staticJsonValueGetter.invoke(null, this.unboxMethod.invoke(p0, new Object[0]));
            if (objInvoke == null) {
                getshowpopup = null;
            } else {
                p2.findValueSerializer(objInvoke.getClass()).serialize(objInvoke, p1, p2);
                getshowpopup = getShowPopup.INSTANCE;
            }
            if (getshowpopup == null) {
                p2.findNullValueSerializer(null).serialize(null, p1, p2);
            }
        }
    }

    public /* synthetic */ ValueClassSerializer(Class cls, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(cls);
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00062\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/fasterxml/jackson/module/kotlin/ValueClassSerializer$Companion;", "", "<init>", "()V", "Ljava/lang/Class;", "p0", "Lcom/fasterxml/jackson/databind/ser/std/StdSerializer;", "from", "(Ljava/lang/Class;)Lcom/fasterxml/jackson/databind/ser/std/StdSerializer;"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final StdSerializer<?> from(Class<?> p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            Method staticJsonValueGetter = KotlinSerializersKt.getStaticJsonValueGetter(p0);
            StaticJsonValue staticJsonValue = staticJsonValueGetter == null ? null : new StaticJsonValue(p0, staticJsonValueGetter);
            if (staticJsonValue != null) {
                return staticJsonValue;
            }
            return ValueClassUnboxSerializer.INSTANCE;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }
}
