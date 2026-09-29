package com.fasterxml.jackson.module.kotlin;

import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.Module;
import com.fasterxml.jackson.databind.module.SimpleModule;
import java.util.BitSet;
import java.util.Set;
import kotlin.EncryptedContentArray;
import kotlin.LessonMcqUpdateInfoSTATUS;
import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.Metadata;
import kotlin.ResolutionConfigRsModel;
import kotlin.getKycMessage;
import kotlin.getRenewGrpId;
import kotlin.getShowFullPage;
import kotlin.isHdPlaybackError;
import kotlin.newEncryptedObject;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u0000  2\u00020\u0001:\u0002! B\u0011\b\u0012\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005BE\b\u0007\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u0007\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u0007¢\u0006\u0004\b\u0004\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0015\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00140\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0017\u001a\u00020\u00078\u0006¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0019\u001a\u00020\u00078\u0006¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018R\u0011\u0010\u001a\u001a\u00020\u00078\u0006¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u0011\u0010\u001b\u001a\u00020\u00068\u0006¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0011\u0010\u001d\u001a\u00020\u000b8\u0006¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0011\u0010\u001f\u001a\u00020\u00078\u0006¢\u0006\u0006\n\u0004\b\u001f\u0010\u0018"}, d2 = {"Lcom/fasterxml/jackson/module/kotlin/KotlinModule;", "Lcom/fasterxml/jackson/databind/module/SimpleModule;", "Lcom/fasterxml/jackson/module/kotlin/KotlinModule$Builder;", "p0", "<init>", "(Lcom/fasterxml/jackson/module/kotlin/KotlinModule$Builder;)V", "", "", "p1", "p2", "p3", "Lcom/fasterxml/jackson/module/kotlin/SingletonSupport;", "p4", "p5", "(IZZZLcom/fasterxml/jackson/module/kotlin/SingletonSupport;Z)V", "Lcom/fasterxml/jackson/databind/Module$SetupContext;", "", "setupModule", "(Lcom/fasterxml/jackson/databind/Module$SetupContext;)V", "", "Lo/isHdPlaybackError;", "ignoredClassesForImplyingJsonCreator", "Ljava/util/Set;", "nullIsSameAsDefault", "Z", "nullToEmptyCollection", "nullToEmptyMap", "reflectionCacheSize", "I", "singletonSupport", "Lcom/fasterxml/jackson/module/kotlin/SingletonSupport;", "strictNullChecks", "Companion", "Builder"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class KotlinModule extends SimpleModule {
    private final Set<isHdPlaybackError<?>> ignoredClassesForImplyingJsonCreator;
    private final boolean nullIsSameAsDefault;
    private final boolean nullToEmptyCollection;
    private final boolean nullToEmptyMap;
    private final int reflectionCacheSize;
    private final SingletonSupport singletonSupport;
    private final boolean strictNullChecks;

    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SingletonSupport.values().length];
            iArr[SingletonSupport.DISABLED.ordinal()] = 1;
            iArr[SingletonSupport.CANONICALIZE.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public /* synthetic */ KotlinModule(int i, boolean z, boolean z2, boolean z3, SingletonSupport singletonSupport, boolean z4, int i2, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i2 & 1) != 0 ? 512 : i, (i2 & 2) != 0 ? false : z, (i2 & 4) != 0 ? false : z2, (i2 & 8) != 0 ? false : z3, (i2 & 16) != 0 ? SingletonSupport.DISABLED : singletonSupport, (i2 & 32) == 0 ? z4 : false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @getRenewGrpId
    public KotlinModule(int i, boolean z, boolean z2, boolean z3, SingletonSupport singletonSupport, boolean z4) throws JsonMappingException {
        super(KotlinModule.class.getName(), PackageVersion.VERSION);
        toMagicModuleMetaRepoModel.write(singletonSupport, "");
        this.reflectionCacheSize = i;
        this.nullToEmptyCollection = z;
        this.nullToEmptyMap = z2;
        this.nullIsSameAsDefault = z3;
        this.singletonSupport = singletonSupport;
        this.strictNullChecks = z4;
        if (!getShowFullPage.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer()) {
            throw new JsonMappingException(null, toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer("KotlinModule requires Kotlin version >= 1.5 - Found ", (Object) getShowFullPage.AudioAttributesCompatParcelizer));
        }
        this.ignoredClassesForImplyingJsonCreator = getKycMessage.read();
    }

    private KotlinModule(Builder builder) {
        this(builder.getReflectionCacheSize(), builder.isEnabled(KotlinFeature.NullToEmptyCollection), builder.isEnabled(KotlinFeature.NullToEmptyMap), builder.isEnabled(KotlinFeature.NullIsSameAsDefault), builder.isEnabled(KotlinFeature.SingletonSupport) ? SingletonSupport.CANONICALIZE : SingletonSupport.DISABLED, builder.isEnabled(KotlinFeature.StrictNullChecks));
    }

    @Override // com.fasterxml.jackson.databind.module.SimpleModule, com.fasterxml.jackson.databind.Module
    public final void setupModule(Module.SetupContext p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        super.setupModule(p0);
        if (!p0.isEnabled(MapperFeature.USE_ANNOTATIONS)) {
            throw new IllegalStateException("The Jackson Kotlin module requires USE_ANNOTATIONS to be true or it cannot function");
        }
        ReflectionCache reflectionCache = new ReflectionCache(this.reflectionCacheSize);
        p0.addValueInstantiators(new KotlinInstantiators(reflectionCache, this.nullToEmptyCollection, this.nullToEmptyMap, this.nullIsSameAsDefault, this.strictNullChecks));
        if (WhenMappings.$EnumSwitchMapping$0[this.singletonSupport.ordinal()] == 2) {
            p0.addBeanDeserializerModifier(KotlinBeanDeserializerModifier.INSTANCE);
        }
        p0.insertAnnotationIntrospector(new KotlinAnnotationIntrospector(p0, reflectionCache, this.nullToEmptyCollection, this.nullToEmptyMap, this.nullIsSameAsDefault));
        p0.appendAnnotationIntrospector(new KotlinNamesAnnotationIntrospector(this, reflectionCache, this.ignoredClassesForImplyingJsonCreator));
        p0.addDeserializers(new KotlinDeserializers());
        p0.addKeyDeserializers(KotlinKeyDeserializers.INSTANCE);
        p0.addSerializers(new KotlinSerializers());
        p0.addKeySerializers(new KotlinKeySerializers());
        p0.setMixInAnnotations(newEncryptedObject.class, ClosedRangeMixin.class);
        p0.setMixInAnnotations(ResolutionConfigRsModel.class, ClosedRangeMixin.class);
        p0.setMixInAnnotations(LessonMcqUpdateInfoSTATUS.class, ClosedRangeMixin.class);
        p0.setMixInAnnotations(EncryptedContentArray.class, ClosedRangeMixin.class);
    }

    @getRenewGrpId
    public KotlinModule() {
        this(0, false, false, false, null, false, 63, null);
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR$\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u000f8\u0007@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/fasterxml/jackson/module/kotlin/KotlinModule$Builder;", "", "<init>", "()V", "Lcom/fasterxml/jackson/module/kotlin/KotlinModule;", "build", "()Lcom/fasterxml/jackson/module/kotlin/KotlinModule;", "Lcom/fasterxml/jackson/module/kotlin/KotlinFeature;", "p0", "", "isEnabled", "(Lcom/fasterxml/jackson/module/kotlin/KotlinFeature;)Z", "Ljava/util/BitSet;", "bitSet", "Ljava/util/BitSet;", "", "reflectionCacheSize", "I", "getReflectionCacheSize", "()I"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Builder {
        private int reflectionCacheSize = 512;
        private final BitSet bitSet = KotlinFeature.INSTANCE.getDefaults$jackson_module_kotlin();

        public final int getReflectionCacheSize() {
            return this.reflectionCacheSize;
        }

        public final boolean isEnabled(KotlinFeature p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            return this.bitSet.intersects(p0.getBitSet());
        }

        public final KotlinModule build() {
            return new KotlinModule(this, null);
        }
    }

    public /* synthetic */ KotlinModule(Builder builder, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(builder);
    }
}
