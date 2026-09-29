package com.fasterxml.jackson.module.kotlin;

import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.deser.std.StdValueInstantiator;
import java.lang.reflect.Type;
import kotlin.ApplicationData;
import kotlin.Metadata;
import kotlin.requireLoggedUser;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u000bJ1\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0002\u001a\u00020\f2\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000e0\r2\u0006\u0010\u0006\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0013\u001a\u00020\u0005*\u00020\u000eH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0013\u0010\u0016\u001a\u00020\u0005*\u00020\u0015H\u0002¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001b"}, d2 = {"Lcom/fasterxml/jackson/module/kotlin/KotlinValueInstantiator;", "Lcom/fasterxml/jackson/databind/deser/std/StdValueInstantiator;", "p0", "Lcom/fasterxml/jackson/module/kotlin/ReflectionCache;", "p1", "", "p2", "p3", "p4", "p5", "<init>", "(Lcom/fasterxml/jackson/databind/deser/std/StdValueInstantiator;Lcom/fasterxml/jackson/module/kotlin/ReflectionCache;ZZZZ)V", "Lcom/fasterxml/jackson/databind/DeserializationContext;", "", "Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;", "Lcom/fasterxml/jackson/databind/deser/impl/PropertyValueBuffer;", "", "createFromObjectWith", "(Lcom/fasterxml/jackson/databind/DeserializationContext;[Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;Lcom/fasterxml/jackson/databind/deser/impl/PropertyValueBuffer;)Ljava/lang/Object;", "hasInjectableValueId", "(Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;)Z", "Lo/ApplicationData;", "isPrimitive", "(Lo/ApplicationData;)Z", "cache", "Lcom/fasterxml/jackson/module/kotlin/ReflectionCache;", "nullIsSameAsDefault", "Z", "nullToEmptyCollection", "nullToEmptyMap", "strictNullChecks"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class KotlinValueInstantiator extends StdValueInstantiator {
    private final ReflectionCache cache;
    private final boolean nullIsSameAsDefault;
    private final boolean nullToEmptyCollection;
    private final boolean nullToEmptyMap;
    private final boolean strictNullChecks;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KotlinValueInstantiator(StdValueInstantiator stdValueInstantiator, ReflectionCache reflectionCache, boolean z, boolean z2, boolean z3, boolean z4) {
        super(stdValueInstantiator);
        toMagicModuleMetaRepoModel.write(stdValueInstantiator, "");
        toMagicModuleMetaRepoModel.write(reflectionCache, "");
        this.cache = reflectionCache;
        this.nullToEmptyCollection = z;
        this.nullToEmptyMap = z2;
        this.nullIsSameAsDefault = z3;
        this.strictNullChecks = z4;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01b3  */
    @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object createFromObjectWith(com.fasterxml.jackson.databind.DeserializationContext r22, com.fasterxml.jackson.databind.deser.SettableBeanProperty[] r23, com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer r24) throws java.lang.IllegalAccessException, com.fasterxml.jackson.databind.DatabindException {
        /*
            Method dump skipped, instruction units count: 793
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.module.kotlin.KotlinValueInstantiator.createFromObjectWith(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.deser.SettableBeanProperty[], com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer):java.lang.Object");
    }

    private final boolean isPrimitive(ApplicationData applicationData) {
        Type type = requireLoggedUser.read(applicationData.read());
        if (type instanceof Class) {
            return ((Class) type).isPrimitive();
        }
        return false;
    }

    private final boolean hasInjectableValueId(SettableBeanProperty settableBeanProperty) {
        return settableBeanProperty.getInjectableValueId() != null;
    }
}
