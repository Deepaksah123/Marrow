package com.fasterxml.jackson.module.kotlin;

import com.fasterxml.jackson.databind.introspect.AnnotatedConstructor;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.introspect.AnnotatedWithParams;
import com.fasterxml.jackson.databind.util.LRUMap;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.Executable;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.Iterator;
import java.util.Optional;
import kotlin.C0177getRfBanners;
import kotlin.MagicModuleFeedbackRequestBody;
import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.Metadata;
import kotlin.RenewEligibleCreator;
import kotlin.SdkPayloadData;
import kotlin.deleteOfflineDownloadedFiles;
import kotlin.getAnswerMap;
import kotlin.getErrorMessageId;
import kotlin.isApiBlockError;
import kotlin.isHdPlaybackError;
import kotlin.isVideoNetworkError;
import kotlin.logFontExceptionCrash;
import kotlin.requireLoggedUser;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 .2\u00020\u0001:\u0002/.B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J)\u0010\n\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00062\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\u000e\u001a\b\u0012\u0002\b\u0003\u0018\u00010\r2\u0006\u0010\u0003\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ-\u0010\u0012\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00112\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00102\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\r¢\u0006\u0004\b\u0012\u0010\u0013J-\u0010\u0015\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00142\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007¢\u0006\u0004\b\u0015\u0010\u0016J#\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00192\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ\u001b\u0010\u001a\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00192\u0006\u0010\u0003\u001a\u00020\u001c¢\u0006\u0004\b\u001a\u0010\u001dJ\u001b\u0010 \u001a\b\u0012\u0002\b\u0003\u0018\u00010\u001f2\u0006\u0010\u0003\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J\u0019\u0010\"\u001a\b\u0012\u0002\b\u0003\u0018\u00010\r*\u00020\fH\u0002¢\u0006\u0004\b\"\u0010\u000fR \u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b0#8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b$\u0010%R,\u0010&\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u0017\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00190#8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b&\u0010%R$\u0010(\u001a\u0012\u0012\u0004\u0012\u00020'\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001f0#8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b(\u0010%R\"\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0006\u0012\u0004\u0018\u00010)0#8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010%R$\u0010*\u001a\u0012\u0012\u0004\u0012\u00020\u001c\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00190#8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b*\u0010%R,\u0010+\u001a\u001a\u0012\b\u0012\u0006\u0012\u0002\b\u00030\r\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00110#8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b+\u0010%R*\u0010-\u001a\u0018\u0012\u0004\u0012\u00020\f\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\r0,0#8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b-\u0010%"}, d2 = {"Lcom/fasterxml/jackson/module/kotlin/ReflectionCache;", "Ljava/io/Serializable;", "", "p0", "<init>", "(I)V", "Lcom/fasterxml/jackson/databind/introspect/AnnotatedConstructor;", "Lkotlin/Function1;", "", "p1", "checkConstructorIsCreatorAnnotated", "(Lcom/fasterxml/jackson/databind/introspect/AnnotatedConstructor;Lo/getAnswerMap;)Z", "Lcom/fasterxml/jackson/databind/introspect/AnnotatedMethod;", "Lo/isHdPlaybackError;", "findValueClassReturnType", "(Lcom/fasterxml/jackson/databind/introspect/AnnotatedMethod;)Lo/isHdPlaybackError;", "Ljava/lang/Class;", "Lcom/fasterxml/jackson/module/kotlin/ValueClassBoxConverter;", "getValueClassBoxConverter", "(Ljava/lang/Class;Lo/isHdPlaybackError;)Lcom/fasterxml/jackson/module/kotlin/ValueClassBoxConverter;", "Lcom/fasterxml/jackson/databind/introspect/AnnotatedMember;", "javaMemberIsRequired", "(Lcom/fasterxml/jackson/databind/introspect/AnnotatedMember;Lo/getAnswerMap;)Ljava/lang/Boolean;", "Ljava/lang/reflect/Constructor;", "", "Lkotlin/reflect/KFunction;", "kotlinFromJava", "(Ljava/lang/reflect/Constructor;)Lo/getErrorMessageId;", "Ljava/lang/reflect/Method;", "(Ljava/lang/reflect/Method;)Lo/getErrorMessageId;", "Lcom/fasterxml/jackson/databind/introspect/AnnotatedWithParams;", "Lcom/fasterxml/jackson/module/kotlin/ValueCreator;", "valueCreatorFromJava", "(Lcom/fasterxml/jackson/databind/introspect/AnnotatedWithParams;)Lcom/fasterxml/jackson/module/kotlin/ValueCreator;", "getValueClassReturnType", "Lcom/fasterxml/jackson/databind/util/LRUMap;", "javaConstructorIsCreatorAnnotated", "Lcom/fasterxml/jackson/databind/util/LRUMap;", "javaConstructorToKotlin", "Ljava/lang/reflect/Executable;", "javaExecutableToValueCreator", "Lcom/fasterxml/jackson/module/kotlin/ReflectionCache$BooleanTriState;", "javaMethodToKotlin", "valueClassBoxConverterCache", "Ljava/util/Optional;", "valueClassReturnTypeCache", "Companion", "BooleanTriState"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class ReflectionCache implements Serializable {
    private final LRUMap<AnnotatedConstructor, Boolean> javaConstructorIsCreatorAnnotated;
    private final LRUMap<Constructor<Object>, getErrorMessageId<Object>> javaConstructorToKotlin;
    private final LRUMap<Executable, ValueCreator<?>> javaExecutableToValueCreator;
    private final LRUMap<AnnotatedMember, BooleanTriState> javaMemberIsRequired;
    private final LRUMap<Method, getErrorMessageId<?>> javaMethodToKotlin;
    private final LRUMap<isHdPlaybackError<?>, ValueClassBoxConverter<?, ?>> valueClassBoxConverterCache;
    private final LRUMap<AnnotatedMethod, Optional<isHdPlaybackError<?>>> valueClassReturnTypeCache;

    public ReflectionCache(int i) {
        this.javaConstructorToKotlin = new LRUMap<>(i, i);
        this.javaMethodToKotlin = new LRUMap<>(i, i);
        this.javaExecutableToValueCreator = new LRUMap<>(i, i);
        this.javaConstructorIsCreatorAnnotated = new LRUMap<>(i, i);
        this.javaMemberIsRequired = new LRUMap<>(i, i);
        this.valueClassReturnTypeCache = new LRUMap<>(0, i);
        this.valueClassBoxConverterCache = new LRUMap<>(0, i);
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u0000 \n2\u00020\u0001:\u0004\n\u000b\f\rB\u0013\b\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0003\u000e\u000f\u0010"}, d2 = {"Lcom/fasterxml/jackson/module/kotlin/ReflectionCache$BooleanTriState;", "", "", "p0", "<init>", "(Ljava/lang/Boolean;)V", AppMeasurementSdk.ConditionalUserProperty.VALUE, "Ljava/lang/Boolean;", "getValue", "()Ljava/lang/Boolean;", "Companion", "Empty", "False", "True", "Lcom/fasterxml/jackson/module/kotlin/ReflectionCache$BooleanTriState$True;", "Lcom/fasterxml/jackson/module/kotlin/ReflectionCache$BooleanTriState$False;", "Lcom/fasterxml/jackson/module/kotlin/ReflectionCache$BooleanTriState$Empty;"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static abstract class BooleanTriState {
        private final Boolean value;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final True TRUE = new True();
        private static final False FALSE = new False();
        private static final Empty EMPTY = new Empty();

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/fasterxml/jackson/module/kotlin/ReflectionCache$BooleanTriState$True;", "Lcom/fasterxml/jackson/module/kotlin/ReflectionCache$BooleanTriState;", "<init>", "()V"}, k = 1, mv = {1, 5, 1}, xi = 48)
        public static final class True extends BooleanTriState {
            public True() {
                super(Boolean.TRUE, null);
            }
        }

        private BooleanTriState(Boolean bool) {
            this.value = bool;
        }

        public final Boolean getValue() {
            return this.value;
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/fasterxml/jackson/module/kotlin/ReflectionCache$BooleanTriState$False;", "Lcom/fasterxml/jackson/module/kotlin/ReflectionCache$BooleanTriState;", "<init>", "()V"}, k = 1, mv = {1, 5, 1}, xi = 48)
        public static final class False extends BooleanTriState {
            public False() {
                super(Boolean.FALSE, null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/fasterxml/jackson/module/kotlin/ReflectionCache$BooleanTriState$Empty;", "Lcom/fasterxml/jackson/module/kotlin/ReflectionCache$BooleanTriState;", "<init>", "()V"}, k = 1, mv = {1, 5, 1}, xi = 48)
        public static final class Empty extends BooleanTriState {
            /* JADX WARN: Multi-variable type inference failed */
            public Empty() {
                super(null, 0 == true ? 1 : 0);
            }
        }

        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/fasterxml/jackson/module/kotlin/ReflectionCache$BooleanTriState$Companion;", "", "<init>", "()V", "", "p0", "Lcom/fasterxml/jackson/module/kotlin/ReflectionCache$BooleanTriState;", "fromBoolean", "(Ljava/lang/Boolean;)Lcom/fasterxml/jackson/module/kotlin/ReflectionCache$BooleanTriState;", "Lcom/fasterxml/jackson/module/kotlin/ReflectionCache$BooleanTriState$Empty;", "EMPTY", "Lcom/fasterxml/jackson/module/kotlin/ReflectionCache$BooleanTriState$Empty;", "Lcom/fasterxml/jackson/module/kotlin/ReflectionCache$BooleanTriState$False;", "FALSE", "Lcom/fasterxml/jackson/module/kotlin/ReflectionCache$BooleanTriState$False;", "Lcom/fasterxml/jackson/module/kotlin/ReflectionCache$BooleanTriState$True;", "TRUE", "Lcom/fasterxml/jackson/module/kotlin/ReflectionCache$BooleanTriState$True;"}, k = 1, mv = {1, 5, 1}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public final BooleanTriState fromBoolean(Boolean p0) {
                if (p0 == null) {
                    return BooleanTriState.EMPTY;
                }
                if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, Boolean.TRUE)) {
                    return BooleanTriState.TRUE;
                }
                if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, Boolean.FALSE)) {
                    return BooleanTriState.FALSE;
                }
                throw new RenewEligibleCreator();
            }

            public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
                this();
            }
        }

        public /* synthetic */ BooleanTriState(Boolean bool, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this(bool);
        }
    }

    public final getErrorMessageId<Object> kotlinFromJava(Constructor<Object> p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        getErrorMessageId<Object> geterrormessageid = this.javaConstructorToKotlin.get(p0);
        if (geterrormessageid != null) {
            return geterrormessageid;
        }
        getErrorMessageId<Object> geterrormessageidRemoteActionCompatParcelizer = requireLoggedUser.RemoteActionCompatParcelizer((Constructor) p0);
        if (geterrormessageidRemoteActionCompatParcelizer == null) {
            return null;
        }
        getErrorMessageId<Object> geterrormessageidPutIfAbsent = this.javaConstructorToKotlin.putIfAbsent(p0, geterrormessageidRemoteActionCompatParcelizer);
        return geterrormessageidPutIfAbsent == null ? geterrormessageidRemoteActionCompatParcelizer : geterrormessageidPutIfAbsent;
    }

    public final getErrorMessageId<?> kotlinFromJava(Method p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        getErrorMessageId<?> geterrormessageid = this.javaMethodToKotlin.get(p0);
        if (geterrormessageid != null) {
            return geterrormessageid;
        }
        getErrorMessageId<?> geterrormessageid2 = requireLoggedUser.read(p0);
        if (geterrormessageid2 == null) {
            return null;
        }
        getErrorMessageId<?> geterrormessageidPutIfAbsent = this.javaMethodToKotlin.putIfAbsent(p0, geterrormessageid2);
        return geterrormessageidPutIfAbsent == null ? geterrormessageid2 : geterrormessageidPutIfAbsent;
    }

    public final ValueCreator<?> valueCreatorFromJava(AnnotatedWithParams p0) throws IllegalAccessException {
        toMagicModuleMetaRepoModel.write(p0, "");
        if (p0 instanceof AnnotatedConstructor) {
            Constructor<?> annotated = ((AnnotatedConstructor) p0).getAnnotated();
            if (annotated == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.reflect.Constructor<kotlin.Any>");
            }
            ValueCreator<?> valueCreator = this.javaExecutableToValueCreator.get(annotated);
            if (valueCreator != null) {
                return valueCreator;
            }
            getErrorMessageId<Object> geterrormessageidKotlinFromJava = kotlinFromJava(annotated);
            if (geterrormessageidKotlinFromJava == null) {
                return null;
            }
            ConstructorValueCreator constructorValueCreator = new ConstructorValueCreator(geterrormessageidKotlinFromJava);
            ValueCreator<?> valueCreatorPutIfAbsent = this.javaExecutableToValueCreator.putIfAbsent(annotated, constructorValueCreator);
            return valueCreatorPutIfAbsent == null ? constructorValueCreator : valueCreatorPutIfAbsent;
        }
        if (p0 instanceof AnnotatedMethod) {
            Method annotated2 = ((AnnotatedMethod) p0).getAnnotated();
            ValueCreator<?> valueCreator2 = this.javaExecutableToValueCreator.get(annotated2);
            if (valueCreator2 != null) {
                return valueCreator2;
            }
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(annotated2, "");
            getErrorMessageId<?> geterrormessageidKotlinFromJava2 = kotlinFromJava(annotated2);
            if (geterrormessageidKotlinFromJava2 == null) {
                return null;
            }
            MethodValueCreator methodValueCreatorOf = MethodValueCreator.INSTANCE.of(geterrormessageidKotlinFromJava2);
            ValueCreator<?> valueCreatorPutIfAbsent2 = this.javaExecutableToValueCreator.putIfAbsent(annotated2, methodValueCreatorOf);
            return valueCreatorPutIfAbsent2 == null ? methodValueCreatorOf : valueCreatorPutIfAbsent2;
        }
        throw new IllegalStateException(toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer("Expected a constructor or method to create a Kotlin object, instead found ", (Object) p0.getAnnotated().getClass().getName()));
    }

    public final boolean checkConstructorIsCreatorAnnotated(AnnotatedConstructor p0, getAnswerMap<? super AnnotatedConstructor, Boolean> p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        Boolean bool = this.javaConstructorIsCreatorAnnotated.get(p0);
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean zBooleanValue = p1.invoke(p0).booleanValue();
        Boolean boolPutIfAbsent = this.javaConstructorIsCreatorAnnotated.putIfAbsent(p0, Boolean.valueOf(zBooleanValue));
        return boolPutIfAbsent == null ? zBooleanValue : boolPutIfAbsent.booleanValue();
    }

    public final Boolean javaMemberIsRequired(AnnotatedMember p0, getAnswerMap<? super AnnotatedMember, Boolean> p1) {
        Boolean value;
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        BooleanTriState booleanTriState = this.javaMemberIsRequired.get(p0);
        Boolean value2 = booleanTriState == null ? null : booleanTriState.getValue();
        if (value2 != null) {
            return value2;
        }
        Boolean boolInvoke = p1.invoke(p0);
        BooleanTriState booleanTriStatePutIfAbsent = this.javaMemberIsRequired.putIfAbsent(p0, BooleanTriState.INSTANCE.fromBoolean(boolInvoke));
        return (booleanTriStatePutIfAbsent == null || (value = booleanTriStatePutIfAbsent.getValue()) == null) ? boolInvoke : value;
    }

    private final isHdPlaybackError<?> getValueClassReturnType(AnnotatedMethod annotatedMethod) {
        Object obj;
        Object next;
        isVideoNetworkError isvideonetworkerror;
        Object obj2;
        Method member = annotatedMethod.getMember();
        Class<?> returnType = member.getReturnType();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(returnType, "");
        if (ExtensionsKt.isUnboxableValueClass(returnType)) {
            return null;
        }
        Class<?> declaringClass = member.getDeclaringClass();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(declaringClass, "");
        isHdPlaybackError ishdplaybackerror = MagicModuleFeedbackRequestBody.read(declaringClass);
        try {
            C0177getRfBanners.IconCompatParcelizer iconCompatParcelizer = C0177getRfBanners.IconCompatParcelizer;
            obj = C0177getRfBanners.read(logFontExceptionCrash.AudioAttributesCompatParcelizer(ishdplaybackerror));
        } catch (Throwable th) {
            C0177getRfBanners.IconCompatParcelizer iconCompatParcelizer2 = C0177getRfBanners.IconCompatParcelizer;
            obj = C0177getRfBanners.read(SdkPayloadData.write(th));
        }
        if (C0177getRfBanners.RemoteActionCompatParcelizer(obj)) {
            obj = null;
        }
        Collection collection = (Collection) obj;
        if (collection == null) {
            isvideonetworkerror = null;
        } else {
            Iterator it = collection.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(requireLoggedUser.RemoteActionCompatParcelizer((isVideoNetworkError) next), member)) {
                    break;
                }
            }
            isvideonetworkerror = (isVideoNetworkError) next;
        }
        deleteOfflineDownloadedFiles deleteofflinedownloadedfilesMediaMetadataCompat = isvideonetworkerror == null ? null : isvideonetworkerror.MediaMetadataCompat();
        if (deleteofflinedownloadedfilesMediaMetadataCompat == null) {
            try {
                C0177getRfBanners.IconCompatParcelizer iconCompatParcelizer3 = C0177getRfBanners.IconCompatParcelizer;
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(member, "");
                obj2 = C0177getRfBanners.read(requireLoggedUser.read(member));
            } catch (Throwable th2) {
                C0177getRfBanners.IconCompatParcelizer iconCompatParcelizer4 = C0177getRfBanners.IconCompatParcelizer;
                obj2 = C0177getRfBanners.read(SdkPayloadData.write(th2));
            }
            if (C0177getRfBanners.RemoteActionCompatParcelizer(obj2)) {
                obj2 = null;
            }
            getErrorMessageId geterrormessageid = (getErrorMessageId) obj2;
            deleteofflinedownloadedfilesMediaMetadataCompat = geterrormessageid == null ? null : geterrormessageid.MediaMetadataCompat();
        }
        isApiBlockError audioAttributesCompatParcelizer = deleteofflinedownloadedfilesMediaMetadataCompat == null ? null : deleteofflinedownloadedfilesMediaMetadataCompat.getAudioAttributesCompatParcelizer();
        isHdPlaybackError<?> ishdplaybackerror2 = audioAttributesCompatParcelizer instanceof isHdPlaybackError ? (isHdPlaybackError) audioAttributesCompatParcelizer : null;
        if (ishdplaybackerror2 != null && ishdplaybackerror2.RatingCompat()) {
            return ishdplaybackerror2;
        }
        return null;
    }

    public final isHdPlaybackError<?> findValueClassReturnType(AnnotatedMethod p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        Optional<isHdPlaybackError<?>> optionalOfNullable = this.valueClassReturnTypeCache.get(p0);
        if (optionalOfNullable == null) {
            optionalOfNullable = Optional.ofNullable(getValueClassReturnType(p0));
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(optionalOfNullable, "");
            Optional<isHdPlaybackError<?>> optionalPutIfAbsent = this.valueClassReturnTypeCache.putIfAbsent(p0, optionalOfNullable);
            if (optionalPutIfAbsent != null) {
                optionalOfNullable = optionalPutIfAbsent;
            }
        }
        return optionalOfNullable.orElse(null);
    }

    public final ValueClassBoxConverter<?, ?> getValueClassBoxConverter(Class<?> p0, isHdPlaybackError<?> p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        ValueClassBoxConverter<?, ?> valueClassBoxConverter = this.valueClassBoxConverterCache.get(p1);
        if (valueClassBoxConverter != null) {
            return valueClassBoxConverter;
        }
        ValueClassBoxConverter<?, ?> valueClassBoxConverter2 = new ValueClassBoxConverter<>(p0, p1);
        ValueClassBoxConverter<?, ?> valueClassBoxConverterPutIfAbsent = this.valueClassBoxConverterCache.putIfAbsent(p1, valueClassBoxConverter2);
        return valueClassBoxConverterPutIfAbsent == null ? valueClassBoxConverter2 : valueClassBoxConverterPutIfAbsent;
    }
}
