package com.fasterxml.jackson.module.kotlin;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.introspect.AnnotatedConstructor;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.IntermediateLoginResponseBody;
import kotlin.Metadata;
import kotlin.getErrorMessageId;
import kotlin.isHdPlaybackError;
import kotlin.logFontExceptionCrash;
import kotlin.requireLoggedUser;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a5\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00010\u0000*\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0013\u0010\t\u001a\u00020\b*\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\n\u001a%\u0010\u000b\u001a\u00020\b*\u0006\u0012\u0002\b\u00030\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a#\u0010\u000e\u001a\u00020\b*\u0006\u0012\u0002\b\u00030\r2\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0002¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"", "Lkotlin/reflect/KFunction;", "", "", "p0", "filterOutSingleStringCallables", "(Ljava/util/Collection;Ljava/util/Set;)Ljava/util/Collection;", "Lcom/fasterxml/jackson/databind/introspect/AnnotatedConstructor;", "", "isKotlinConstructorWithParameters", "(Lcom/fasterxml/jackson/databind/introspect/AnnotatedConstructor;)Z", "isPossibleSingleString", "(Lo/getErrorMessageId;Ljava/util/Set;)Z", "Lo/isHdPlaybackError;", "isPrimaryConstructor", "(Lo/isHdPlaybackError;Lo/getErrorMessageId;)Z"}, k = 2, mv = {1, 5, 1}, xi = 48)
public final class KotlinNamesAnnotationIntrospectorKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isKotlinConstructorWithParameters(AnnotatedConstructor annotatedConstructor) {
        if (annotatedConstructor.getParameterCount() <= 0) {
            return false;
        }
        Class<?> declaringClass = annotatedConstructor.getDeclaringClass();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(declaringClass, "");
        return KotlinModuleKt.isKotlinClass(declaringClass) && !annotatedConstructor.getDeclaringClass().isEnum();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isPossibleSingleString(getErrorMessageId<?> geterrormessageid, Set<String> set) {
        Object next;
        if (geterrormessageid.MediaBrowserCompatSearchResultReceiver().size() == 1 && !IntermediateLoginResponseBody.AudioAttributesCompatParcelizer(set, geterrormessageid.MediaBrowserCompatSearchResultReceiver().get(0).RemoteActionCompatParcelizer()) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(requireLoggedUser.read(geterrormessageid.MediaBrowserCompatSearchResultReceiver().get(0).read()), String.class)) {
            Iterator<T> it = geterrormessageid.MediaBrowserCompatSearchResultReceiver().get(0).MediaBrowserCompatItemReceiver().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((Annotation) next) instanceof JsonProperty) {
                    break;
                }
            }
            if (((JsonProperty) next) == null) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Collection<getErrorMessageId<?>> filterOutSingleStringCallables(Collection<? extends getErrorMessageId<?>> collection, Set<String> set) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : collection) {
            if (!isPossibleSingleString((getErrorMessageId) obj, set)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isPrimaryConstructor(isHdPlaybackError<?> ishdplaybackerror, getErrorMessageId<?> geterrormessageid) {
        getErrorMessageId geterrormessageidAudioAttributesImplApi26Parcelizer = logFontExceptionCrash.AudioAttributesImplApi26Parcelizer(ishdplaybackerror);
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(geterrormessageidAudioAttributesImplApi26Parcelizer, geterrormessageid) || (geterrormessageidAudioAttributesImplApi26Parcelizer == null && ishdplaybackerror.write().size() == 1);
    }
}
