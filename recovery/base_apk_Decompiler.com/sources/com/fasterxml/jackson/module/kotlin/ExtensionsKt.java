package com.fasterxml.jackson.module.kotlin;

import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.json.JsonMapper;
import com.fasterxml.jackson.module.kotlin.KotlinModule;
import java.lang.annotation.Annotation;
import java.util.BitSet;
import kotlin.MagicModuleUseCase;
import kotlin.Metadata;
import kotlin.getAnswerMap;
import kotlin.getShowPopup;
import kotlin.submitMagicModule;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\r\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a!\u0010\b\u001a\u00020\u00072\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\b\u0010\t\u001a#\u0010\f\u001a\u00020\u000b2\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\f\u0010\r\u001a\u0017\u0010\u0010\u001a\u00020\u000f*\u0006\u0012\u0002\b\u00030\u000eH\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0013\u0010\u0014\u001a\u00020\u0013*\u00020\u0012H\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a)\u0010\u001a\u001a\u0006*\u00020\u00160\u0016*\u00020\u00162\b\u0010\u0006\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0019\u001a\u00020\u0018H\u0000¢\u0006\u0004\b\u001a\u0010\u001b"}, d2 = {"Lcom/fasterxml/jackson/databind/ObjectMapper;", "jacksonObjectMapper", "()Lcom/fasterxml/jackson/databind/ObjectMapper;", "Lkotlin/Function1;", "Lcom/fasterxml/jackson/databind/json/JsonMapper$Builder;", "", "p0", "Lcom/fasterxml/jackson/databind/json/JsonMapper;", "jsonMapper", "(Lo/getAnswerMap;)Lcom/fasterxml/jackson/databind/json/JsonMapper;", "Lcom/fasterxml/jackson/module/kotlin/KotlinModule$Builder;", "Lcom/fasterxml/jackson/module/kotlin/KotlinModule;", "kotlinModule", "(Lo/getAnswerMap;)Lcom/fasterxml/jackson/module/kotlin/KotlinModule;", "Ljava/lang/Class;", "", "isUnboxableValueClass", "(Ljava/lang/Class;)Z", "", "Ljava/util/BitSet;", "toBitSet", "(I)Ljava/util/BitSet;", "Lcom/fasterxml/jackson/databind/JsonMappingException;", "", "", "p1", "wrapWithPath", "(Lcom/fasterxml/jackson/databind/JsonMappingException;Ljava/lang/Object;Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonMappingException;"}, k = 2, mv = {1, 5, 1}, xi = 48)
public final class ExtensionsKt {

    /* JADX INFO: renamed from: com.fasterxml.jackson.module.kotlin.ExtensionsKt$kotlinModule$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/fasterxml/jackson/module/kotlin/KotlinModule$Builder;", "", "invoke", "(Lcom/fasterxml/jackson/module/kotlin/KotlinModule$Builder;)V"}, k = 3, mv = {1, 5, 1}, xi = 48)
    static final class C01531 extends MagicModuleUseCase implements getAnswerMap<KotlinModule.Builder, getShowPopup> {
        public static final C01531 INSTANCE = new C01531();

        @Override // kotlin.getAnswerMap
        public final /* bridge */ /* synthetic */ getShowPopup invoke(KotlinModule.Builder builder) {
            invoke2(builder);
            return getShowPopup.INSTANCE;
        }

        C01531() {
            super(1);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(KotlinModule.Builder builder) {
            toMagicModuleMetaRepoModel.write(builder, "");
        }
    }

    public static /* synthetic */ KotlinModule kotlinModule$default(getAnswerMap getanswermap, int i, Object obj) {
        if ((i & 1) != 0) {
            getanswermap = C01531.INSTANCE;
        }
        return kotlinModule(getanswermap);
    }

    public static final KotlinModule kotlinModule(getAnswerMap<? super KotlinModule.Builder, getShowPopup> getanswermap) {
        toMagicModuleMetaRepoModel.write(getanswermap, "");
        KotlinModule.Builder builder = new KotlinModule.Builder();
        getanswermap.invoke(builder);
        return builder.build();
    }

    public static final JsonMapper jsonMapper(getAnswerMap<? super JsonMapper.Builder, getShowPopup> getanswermap) {
        toMagicModuleMetaRepoModel.write(getanswermap, "");
        JsonMapper.Builder builder = JsonMapper.builder();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(builder, "");
        getanswermap.invoke(builder);
        JsonMapper jsonMapperBuild = builder.build();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(jsonMapperBuild, "");
        return jsonMapperBuild;
    }

    /* JADX INFO: renamed from: com.fasterxml.jackson.module.kotlin.ExtensionsKt$jacksonObjectMapper$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/fasterxml/jackson/databind/json/JsonMapper$Builder;", "", "invoke", "(Lcom/fasterxml/jackson/databind/json/JsonMapper$Builder;)V"}, k = 3, mv = {1, 5, 1}, xi = 48)
    static final class AnonymousClass1 extends MagicModuleUseCase implements getAnswerMap<JsonMapper.Builder, getShowPopup> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        @Override // kotlin.getAnswerMap
        public final /* bridge */ /* synthetic */ getShowPopup invoke(JsonMapper.Builder builder) {
            invoke2(builder);
            return getShowPopup.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(JsonMapper.Builder builder) {
            toMagicModuleMetaRepoModel.write(builder, "");
            builder.addModule(ExtensionsKt.kotlinModule$default(null, 1, null));
        }

        AnonymousClass1() {
            super(1);
        }
    }

    public static final ObjectMapper jacksonObjectMapper() {
        return jsonMapper(AnonymousClass1.INSTANCE);
    }

    public static final JsonMappingException wrapWithPath(JsonMappingException jsonMappingException, Object obj, String str) {
        toMagicModuleMetaRepoModel.write(jsonMappingException, "");
        toMagicModuleMetaRepoModel.write(str, "");
        return JsonMappingException.wrapWithPath(jsonMappingException, obj, str);
    }

    public static final BitSet toBitSet(int i) {
        BitSet bitSet = new BitSet(32);
        int i2 = 0;
        while (i != 0) {
            if (i % 2 != 0) {
                bitSet.set(i2);
            }
            i2++;
            i >>= 1;
        }
        return bitSet;
    }

    public static final boolean isUnboxableValueClass(Class<?> cls) {
        toMagicModuleMetaRepoModel.write(cls, "");
        Annotation[] annotations = cls.getAnnotations();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(annotations, "");
        Annotation[] annotationArr = annotations;
        int length = annotationArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            if (!(annotationArr[i] instanceof submitMagicModule)) {
                i++;
            } else if (KotlinModuleKt.isKotlinClass(cls)) {
                return true;
            }
        }
        return false;
    }
}
