package com.fasterxml.jackson.module.kotlin;

import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.deser.ValueInstantiators;
import com.fasterxml.jackson.databind.deser.std.StdValueInstantiator;
import kotlin.Metadata;
import kotlin.toMagicModuleMetaDataUcModel;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0013"}, d2 = {"Lcom/fasterxml/jackson/module/kotlin/KotlinInstantiators;", "Lcom/fasterxml/jackson/databind/deser/ValueInstantiators;", "Lcom/fasterxml/jackson/module/kotlin/ReflectionCache;", "p0", "", "p1", "p2", "p3", "p4", "<init>", "(Lcom/fasterxml/jackson/module/kotlin/ReflectionCache;ZZZZ)V", "Lcom/fasterxml/jackson/databind/DeserializationConfig;", "Lcom/fasterxml/jackson/databind/BeanDescription;", "Lcom/fasterxml/jackson/databind/deser/ValueInstantiator;", "findValueInstantiator", "(Lcom/fasterxml/jackson/databind/DeserializationConfig;Lcom/fasterxml/jackson/databind/BeanDescription;Lcom/fasterxml/jackson/databind/deser/ValueInstantiator;)Lcom/fasterxml/jackson/databind/deser/ValueInstantiator;", "cache", "Lcom/fasterxml/jackson/module/kotlin/ReflectionCache;", "nullIsSameAsDefault", "Z", "nullToEmptyCollection", "nullToEmptyMap", "strictNullChecks"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class KotlinInstantiators implements ValueInstantiators {
    private final ReflectionCache cache;
    private final boolean nullIsSameAsDefault;
    private final boolean nullToEmptyCollection;
    private final boolean nullToEmptyMap;
    private final boolean strictNullChecks;

    public KotlinInstantiators(ReflectionCache reflectionCache, boolean z, boolean z2, boolean z3, boolean z4) {
        toMagicModuleMetaRepoModel.write(reflectionCache, "");
        this.cache = reflectionCache;
        this.nullToEmptyCollection = z;
        this.nullToEmptyMap = z2;
        this.nullIsSameAsDefault = z3;
        this.strictNullChecks = z4;
    }

    @Override // com.fasterxml.jackson.databind.deser.ValueInstantiators
    public final ValueInstantiator findValueInstantiator(DeserializationConfig p0, BeanDescription p1, ValueInstantiator p2) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        toMagicModuleMetaRepoModel.write(p2, "");
        Class<?> beanClass = p1.getBeanClass();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(beanClass, "");
        if (!KotlinModuleKt.isKotlinClass(beanClass)) {
            return p2;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(toMagicModuleMetaDataUcModel.write(p2.getClass()), toMagicModuleMetaDataUcModel.write(StdValueInstantiator.class))) {
            return new KotlinValueInstantiator((StdValueInstantiator) p2, this.cache, this.nullToEmptyCollection, this.nullToEmptyMap, this.nullIsSameAsDefault, this.strictNullChecks);
        }
        throw new IllegalStateException("KotlinValueInstantiator requires that the default ValueInstantiator is StdValueInstantiator");
    }
}
