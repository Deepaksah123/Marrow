package com.fasterxml.jackson.module.kotlin;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.Module;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.introspect.Annotated;
import com.fasterxml.jackson.databind.introspect.AnnotatedField;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.introspect.AnnotatedParameter;
import com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector;
import com.fasterxml.jackson.databind.jsontype.NamedType;
import com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer;
import com.fasterxml.jackson.databind.util.Converter;
import in.juspay.hyper.constants.LogCategory;
import java.lang.annotation.Annotation;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.ApplicationData;
import kotlin.IntermediateLoginResponseBody;
import kotlin.MagicModuleFeedbackRequestBody;
import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.Metadata;
import kotlin.RenewEligible;
import kotlin.deleteOfflineDownloadedFiles;
import kotlin.getErrorMessageId;
import kotlin.getRenewExpiresOn;
import kotlin.isHdPlaybackError;
import kotlin.isRateLimitingError;
import kotlin.isResolutionNotSupported;
import kotlin.isVideoNetworkError;
import kotlin.logFontExceptionCrash;
import kotlin.requireLoggedUser;
import kotlin.toMagicModuleMetaDataUcModel;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u0000 G2\u00020\u0001:\u0001GB/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ%\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\f2\u0006\u0010\u0005\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0012\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00112\u0006\u0010\u0003\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0015\u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u00142\u0006\u0010\u0003\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00172\u0006\u0010\u0003\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ%\u0010\u001e\u001a\u0004\u0018\u00010\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010!\u001a\u0004\u0018\u00010\u0006*\u00020 H\u0002¢\u0006\u0004\b!\u0010\"J\u0015\u0010$\u001a\u0004\u0018\u00010\u0006*\u00020#H\u0002¢\u0006\u0004\b$\u0010%J\u0015\u0010\u001c\u001a\u0004\u0018\u00010\u0006*\u00020&H\u0002¢\u0006\u0004\b\u001c\u0010'J\u0015\u0010\u001c\u001a\u0004\u0018\u00010\u0006*\u00020#H\u0002¢\u0006\u0004\b\u001c\u0010%J\u0015\u0010\u001c\u001a\u0004\u0018\u00010\u0006*\u00020(H\u0002¢\u0006\u0004\b\u001c\u0010)J\u001f\u0010,\u001a\u00020\u0006*\u0006\u0012\u0002\b\u00030*2\u0006\u0010\u0003\u001a\u00020+H\u0002¢\u0006\u0004\b,\u0010-J\u0017\u0010.\u001a\u00020\u0006*\u0006\u0012\u0002\b\u00030*H\u0002¢\u0006\u0004\b.\u0010/J\u001f\u00100\u001a\u00020\u0006*\u0006\u0012\u0002\b\u00030*2\u0006\u0010\u0003\u001a\u00020+H\u0002¢\u0006\u0004\b0\u0010-J\u001f\u00101\u001a\u00020\u0006*\u0006\u0012\u0002\b\u00030*2\u0006\u0010\u0003\u001a\u00020+H\u0002¢\u0006\u0004\b1\u0010-J\u0013\u00103\u001a\u00020\u0006*\u000202H\u0002¢\u0006\u0004\b3\u00104J\u0015\u00106\u001a\u0004\u0018\u00010\u0006*\u000205H\u0002¢\u0006\u0004\b6\u00107J\u0015\u00106\u001a\u0004\u0018\u00010\u0006*\u00020 H\u0002¢\u0006\u0004\b6\u0010\"J\u001b\u00109\u001a\u00020\u0006*\n\u0012\u0002\b\u0003\u0012\u0002\b\u000308H\u0002¢\u0006\u0004\b9\u0010:J\u0017\u0010;\u001a\u00020\u0006*\u0006\u0012\u0002\b\u00030*H\u0002¢\u0006\u0004\b;\u0010/J\u0017\u0010=\u001a\u00020\u0006*\u0006\u0012\u0002\b\u00030<H\u0002¢\u0006\u0004\b=\u0010>R\u0014\u0010?\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010A\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010C\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010E\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010DR\u0014\u0010F\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010D"}, d2 = {"Lcom/fasterxml/jackson/module/kotlin/KotlinAnnotationIntrospector;", "Lcom/fasterxml/jackson/databind/introspect/NopAnnotationIntrospector;", "Lcom/fasterxml/jackson/databind/Module$SetupContext;", "p0", "Lcom/fasterxml/jackson/module/kotlin/ReflectionCache;", "p1", "", "p2", "p3", "p4", "<init>", "(Lcom/fasterxml/jackson/databind/Module$SetupContext;Lcom/fasterxml/jackson/module/kotlin/ReflectionCache;ZZZ)V", "Lcom/fasterxml/jackson/databind/cfg/MapperConfig;", "Lcom/fasterxml/jackson/databind/introspect/Annotated;", "Lcom/fasterxml/jackson/annotation/JsonCreator$Mode;", "findCreatorAnnotation", "(Lcom/fasterxml/jackson/databind/cfg/MapperConfig;Lcom/fasterxml/jackson/databind/introspect/Annotated;)Lcom/fasterxml/jackson/annotation/JsonCreator$Mode;", "Lcom/fasterxml/jackson/databind/JsonSerializer;", "findNullSerializer", "(Lcom/fasterxml/jackson/databind/introspect/Annotated;)Lcom/fasterxml/jackson/databind/JsonSerializer;", "Lcom/fasterxml/jackson/databind/util/Converter;", "findSerializationConverter", "(Lcom/fasterxml/jackson/databind/introspect/Annotated;)Lcom/fasterxml/jackson/databind/util/Converter;", "", "Lcom/fasterxml/jackson/databind/jsontype/NamedType;", "findSubtypes", "(Lcom/fasterxml/jackson/databind/introspect/Annotated;)Ljava/util/List;", "Lcom/fasterxml/jackson/databind/introspect/AnnotatedMember;", "hasRequiredMarker", "(Lcom/fasterxml/jackson/databind/introspect/AnnotatedMember;)Ljava/lang/Boolean;", "requiredAnnotationOrNullability", "(Ljava/lang/Boolean;Ljava/lang/Boolean;)Ljava/lang/Boolean;", "Ljava/lang/reflect/Method;", "getRequiredMarkerFromAccessorLikeMethod", "(Ljava/lang/reflect/Method;)Ljava/lang/Boolean;", "Lcom/fasterxml/jackson/databind/introspect/AnnotatedMethod;", "getRequiredMarkerFromCorrespondingAccessor", "(Lcom/fasterxml/jackson/databind/introspect/AnnotatedMethod;)Ljava/lang/Boolean;", "Lcom/fasterxml/jackson/databind/introspect/AnnotatedField;", "(Lcom/fasterxml/jackson/databind/introspect/AnnotatedField;)Ljava/lang/Boolean;", "Lcom/fasterxml/jackson/databind/introspect/AnnotatedParameter;", "(Lcom/fasterxml/jackson/databind/introspect/AnnotatedParameter;)Ljava/lang/Boolean;", "Lkotlin/reflect/KFunction;", "", "isConstructorParameterRequired", "(Lo/getErrorMessageId;I)Z", "isGetterLike", "(Lo/getErrorMessageId;)Z", "isMethodParameterRequired", "isParameterRequired", "Lo/deleteOfflineDownloadedFiles;", "isRequired", "(Lo/deleteOfflineDownloadedFiles;)Z", "Ljava/lang/reflect/AccessibleObject;", "isRequiredByAnnotation", "(Ljava/lang/reflect/AccessibleObject;)Ljava/lang/Boolean;", "Lo/isVideoNetworkError;", "isRequiredByNullability", "(Lo/isVideoNetworkError;)Z", "isSetterLike", "Lo/isHdPlaybackError;", "requireRebox", "(Lo/isHdPlaybackError;)Z", "cache", "Lcom/fasterxml/jackson/module/kotlin/ReflectionCache;", LogCategory.CONTEXT, "Lcom/fasterxml/jackson/databind/Module$SetupContext;", "nullIsSameAsDefault", "Z", "nullToEmptyCollection", "nullToEmptyMap", "Companion"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class KotlinAnnotationIntrospector extends NopAnnotationIntrospector {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final RenewEligible<deleteOfflineDownloadedFiles> UNIT_TYPE$delegate = getRenewExpiresOn.RemoteActionCompatParcelizer(KotlinAnnotationIntrospector$Companion$UNIT_TYPE$2.INSTANCE);
    private final ReflectionCache cache;
    private final Module.SetupContext context;
    private final boolean nullIsSameAsDefault;
    private final boolean nullToEmptyCollection;
    private final boolean nullToEmptyMap;

    public KotlinAnnotationIntrospector(Module.SetupContext setupContext, ReflectionCache reflectionCache, boolean z, boolean z2, boolean z3) {
        toMagicModuleMetaRepoModel.write(setupContext, "");
        toMagicModuleMetaRepoModel.write(reflectionCache, "");
        this.context = setupContext;
        this.cache = reflectionCache;
        this.nullToEmptyCollection = z;
        this.nullToEmptyMap = z2;
        this.nullIsSameAsDefault = z3;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public final Boolean hasRequiredMarker(AnnotatedMember p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return this.cache.javaMemberIsRequired(p0, new KotlinAnnotationIntrospector$hasRequiredMarker$hasRequired$1(this, p0));
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public final JsonCreator.Mode findCreatorAnnotation(MapperConfig<?> p0, Annotated p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        return super.findCreatorAnnotation(p0, p1);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public final Converter<?, ?> findSerializationConverter(Annotated p0) {
        AnnotatedMethod annotatedMethod;
        isHdPlaybackError<?> ishdplaybackerrorFindValueClassReturnType;
        toMagicModuleMetaRepoModel.write(p0, "");
        ValueClassBoxConverter<?, ?> valueClassBoxConverter = null;
        if ((p0 instanceof AnnotatedMethod ? (AnnotatedMethod) p0 : null) != null && (ishdplaybackerrorFindValueClassReturnType = this.cache.findValueClassReturnType((annotatedMethod = (AnnotatedMethod) p0))) != null) {
            ReflectionCache reflectionCache = this.cache;
            Class<?> rawReturnType = annotatedMethod.getRawReturnType();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(rawReturnType, "");
            valueClassBoxConverter = reflectionCache.getValueClassBoxConverter(rawReturnType, ishdplaybackerrorFindValueClassReturnType);
        }
        return valueClassBoxConverter;
    }

    private final boolean requireRebox(isHdPlaybackError<?> ishdplaybackerror) {
        for (isVideoNetworkError isvideonetworkerror : logFontExceptionCrash.AudioAttributesCompatParcelizer(ishdplaybackerror)) {
            if (requireLoggedUser.read(isvideonetworkerror) != null) {
                return isvideonetworkerror.MediaMetadataCompat().IconCompatParcelizer();
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public final JsonSerializer<?> findNullSerializer(Annotated p0) {
        AnnotatedMethod annotatedMethod;
        isHdPlaybackError<?> ishdplaybackerrorFindValueClassReturnType;
        toMagicModuleMetaRepoModel.write(p0, "");
        StdDelegatingSerializer delegatingSerializer = null;
        if ((p0 instanceof AnnotatedMethod ? (AnnotatedMethod) p0 : null) != null && (ishdplaybackerrorFindValueClassReturnType = this.cache.findValueClassReturnType((annotatedMethod = (AnnotatedMethod) p0))) != null) {
            if (!requireRebox(ishdplaybackerrorFindValueClassReturnType)) {
                ishdplaybackerrorFindValueClassReturnType = null;
            }
            if (ishdplaybackerrorFindValueClassReturnType != null) {
                ReflectionCache reflectionCache = this.cache;
                Class<?> rawReturnType = annotatedMethod.getRawReturnType();
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(rawReturnType, "");
                delegatingSerializer = reflectionCache.getValueClassBoxConverter(rawReturnType, ishdplaybackerrorFindValueClassReturnType).getDelegatingSerializer();
            }
        }
        return delegatingSerializer;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public final List<NamedType> findSubtypes(Annotated p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        Class<?> rawType = p0.getRawType();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(rawType, "");
        if (!KotlinModuleKt.isKotlinClass(rawType)) {
            rawType = null;
        }
        if (rawType == null) {
            return null;
        }
        List listAudioAttributesImplApi21Parcelizer = MagicModuleFeedbackRequestBody.read(rawType).AudioAttributesImplApi21Parcelizer();
        ArrayList arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) listAudioAttributesImplApi21Parcelizer, 10));
        Iterator it = listAudioAttributesImplApi21Parcelizer.iterator();
        while (it.hasNext()) {
            arrayList.add(new NamedType(MagicModuleFeedbackRequestBody.IconCompatParcelizer((isHdPlaybackError) it.next())));
        }
        List<NamedType> listMediaBrowserCompatItemReceiver = IntermediateLoginResponseBody.MediaBrowserCompatItemReceiver((Collection) arrayList);
        return listMediaBrowserCompatItemReceiver.isEmpty() ? null : listMediaBrowserCompatItemReceiver;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Boolean hasRequiredMarker(AnnotatedField annotatedField) {
        deleteOfflineDownloadedFiles deleteofflinedownloadedfilesMediaMetadataCompat;
        Member member = annotatedField.getMember();
        if (member == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.lang.reflect.Field");
        }
        Boolean boolIsRequiredByAnnotation = isRequiredByAnnotation((Field) member);
        Member member2 = annotatedField.getMember();
        if (member2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.lang.reflect.Field");
        }
        isResolutionNotSupported<?> isresolutionnotsupportedWrite = requireLoggedUser.write((Field) member2);
        return requiredAnnotationOrNullability(boolIsRequiredByAnnotation, (isresolutionnotsupportedWrite == null || (deleteofflinedownloadedfilesMediaMetadataCompat = isresolutionnotsupportedWrite.MediaMetadataCompat()) == null) ? null : Boolean.valueOf(isRequired(deleteofflinedownloadedfilesMediaMetadataCompat)));
    }

    private final Boolean isRequiredByAnnotation(AccessibleObject accessibleObject) {
        Annotation annotation;
        Annotation[] annotations = accessibleObject.getAnnotations();
        if (annotations == null) {
            return null;
        }
        int length = annotations.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                annotation = null;
                break;
            }
            annotation = annotations[i];
            if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(MagicModuleFeedbackRequestBody.IconCompatParcelizer(annotation), toMagicModuleMetaDataUcModel.write(JsonProperty.class))) {
                break;
            }
            i++;
        }
        if (annotation == null) {
            return null;
        }
        return Boolean.valueOf(((JsonProperty) annotation).required());
    }

    private final Boolean requiredAnnotationOrNullability(Boolean p0, Boolean p1) {
        if (p0 == null || p1 == null) {
            return p1 != null ? p1 : p0;
        }
        return Boolean.valueOf(p0.booleanValue() || p1.booleanValue());
    }

    private final Boolean isRequiredByAnnotation(Method method) {
        Annotation annotation;
        Annotation[] annotations = method.getAnnotations();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(annotations, "");
        Annotation[] annotationArr = annotations;
        int length = annotationArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                annotation = null;
                break;
            }
            annotation = annotationArr[i];
            if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(MagicModuleFeedbackRequestBody.IconCompatParcelizer(MagicModuleFeedbackRequestBody.IconCompatParcelizer(annotation)), JsonProperty.class)) {
                break;
            }
            i++;
        }
        JsonProperty jsonProperty = annotation instanceof JsonProperty ? (JsonProperty) annotation : null;
        if (jsonProperty == null) {
            return null;
        }
        return Boolean.valueOf(jsonProperty.required());
    }

    private final boolean isRequiredByNullability(isVideoNetworkError<?, ?> isvideonetworkerror) {
        return isRequired(isvideonetworkerror.MediaMetadataCompat());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Boolean hasRequiredMarker(AnnotatedMethod annotatedMethod) {
        Boolean requiredMarkerFromCorrespondingAccessor = getRequiredMarkerFromCorrespondingAccessor(annotatedMethod);
        if (requiredMarkerFromCorrespondingAccessor != null) {
            return requiredMarkerFromCorrespondingAccessor;
        }
        Method member = annotatedMethod.getMember();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(member, "");
        return getRequiredMarkerFromAccessorLikeMethod(member);
    }

    private final Boolean getRequiredMarkerFromCorrespondingAccessor(AnnotatedMethod annotatedMethod) {
        isVideoNetworkError<?, ?> isvideonetworkerror;
        isRateLimitingError isratelimitingerror;
        Class<?> declaringClass = annotatedMethod.getMember().getDeclaringClass();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(declaringClass, "");
        Iterator it = logFontExceptionCrash.IconCompatParcelizer(MagicModuleFeedbackRequestBody.read(declaringClass)).iterator();
        do {
            if (!it.hasNext()) {
                return null;
            }
            isvideonetworkerror = (isVideoNetworkError) it.next();
            if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(requireLoggedUser.RemoteActionCompatParcelizer(isvideonetworkerror), annotatedMethod.getMember())) {
                break;
            }
            isratelimitingerror = isvideonetworkerror instanceof isRateLimitingError ? (isRateLimitingError) isvideonetworkerror : null;
        } while (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(isratelimitingerror != null ? requireLoggedUser.AudioAttributesCompatParcelizer(isratelimitingerror) : null, annotatedMethod.getMember()));
        Method member = annotatedMethod.getMember();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(member, "");
        return requiredAnnotationOrNullability(isRequiredByAnnotation(member), Boolean.valueOf(isRequiredByNullability(isvideonetworkerror)));
    }

    private final Boolean getRequiredMarkerFromAccessorLikeMethod(Method method) {
        getErrorMessageId<?> geterrormessageid = requireLoggedUser.read(method);
        if (geterrormessageid == null) {
            return null;
        }
        Boolean boolIsRequiredByAnnotation = isRequiredByAnnotation(method);
        if (isGetterLike(geterrormessageid)) {
            return requiredAnnotationOrNullability(boolIsRequiredByAnnotation, Boolean.valueOf(isRequired(geterrormessageid.MediaMetadataCompat())));
        }
        if (isSetterLike(geterrormessageid)) {
            return requiredAnnotationOrNullability(boolIsRequiredByAnnotation, Boolean.valueOf(isMethodParameterRequired(geterrormessageid, 0)));
        }
        return null;
    }

    private final boolean isGetterLike(getErrorMessageId<?> geterrormessageid) {
        return geterrormessageid.MediaBrowserCompatSearchResultReceiver().size() == 1;
    }

    private final boolean isSetterLike(getErrorMessageId<?> geterrormessageid) {
        return geterrormessageid.MediaBrowserCompatSearchResultReceiver().size() == 2 && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(geterrormessageid.MediaMetadataCompat(), INSTANCE.getUNIT_TYPE());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Boolean hasRequiredMarker(AnnotatedParameter annotatedParameter) {
        Member member = annotatedParameter.getMember();
        JsonProperty jsonProperty = (JsonProperty) annotatedParameter.getAnnotation(JsonProperty.class);
        Boolean boolValueOf = null;
        Boolean boolValueOf2 = jsonProperty == null ? null : Boolean.valueOf(jsonProperty.required());
        if (member instanceof Constructor) {
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(member, "");
            getErrorMessageId<?> geterrormessageidRemoteActionCompatParcelizer = requireLoggedUser.RemoteActionCompatParcelizer((Constructor) member);
            if (geterrormessageidRemoteActionCompatParcelizer != null) {
                boolValueOf = Boolean.valueOf(isConstructorParameterRequired(geterrormessageidRemoteActionCompatParcelizer, annotatedParameter.getIndex()));
            }
        } else if (member instanceof Method) {
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(member, "");
            getErrorMessageId<?> geterrormessageid = requireLoggedUser.read((Method) member);
            if (geterrormessageid != null) {
                boolValueOf = Boolean.valueOf(isMethodParameterRequired(geterrormessageid, annotatedParameter.getIndex()));
            }
        }
        return requiredAnnotationOrNullability(boolValueOf2, boolValueOf);
    }

    private final boolean isConstructorParameterRequired(getErrorMessageId<?> geterrormessageid, int i) {
        return isParameterRequired(geterrormessageid, i);
    }

    private final boolean isMethodParameterRequired(getErrorMessageId<?> geterrormessageid, int i) {
        return isParameterRequired(geterrormessageid, i + 1);
    }

    private final boolean isParameterRequired(getErrorMessageId<?> geterrormessageid, int i) {
        ApplicationData applicationData = geterrormessageid.MediaBrowserCompatSearchResultReceiver().get(i);
        deleteOfflineDownloadedFiles deleteofflinedownloadedfiles = applicationData.read();
        Type type = requireLoggedUser.read(deleteofflinedownloadedfiles);
        return (deleteofflinedownloadedfiles.IconCompatParcelizer() || applicationData.AudioAttributesCompatParcelizer() || ((type instanceof Class ? ((Class) type).isPrimitive() : false) && !this.context.isEnabled(DeserializationFeature.FAIL_ON_NULL_FOR_PRIMITIVES))) ? false : true;
    }

    private final boolean isRequired(deleteOfflineDownloadedFiles deleteofflinedownloadedfiles) {
        return !deleteofflinedownloadedfiles.IconCompatParcelizer();
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001b\u0010\t\u001a\u00020\u00048GX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/fasterxml/jackson/module/kotlin/KotlinAnnotationIntrospector$Companion;", "", "<init>", "()V", "Lo/deleteOfflineDownloadedFiles;", "UNIT_TYPE$delegate", "Lo/RenewEligible;", "getUNIT_TYPE", "()Lo/deleteOfflineDownloadedFiles;", "UNIT_TYPE"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final deleteOfflineDownloadedFiles getUNIT_TYPE() {
            return (deleteOfflineDownloadedFiles) KotlinAnnotationIntrospector.UNIT_TYPE$delegate.RemoteActionCompatParcelizer();
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }
}
