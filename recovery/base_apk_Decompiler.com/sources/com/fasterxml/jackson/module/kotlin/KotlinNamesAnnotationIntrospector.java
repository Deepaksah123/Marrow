package com.fasterxml.jackson.module.kotlin;

import com.fasterxml.jackson.databind.introspect.Annotated;
import com.fasterxml.jackson.databind.introspect.AnnotatedConstructor;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.introspect.AnnotatedParameter;
import com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector;
import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.ApplicationData;
import kotlin.IntermediateLoginResponseBody;
import kotlin.MagicModuleUseCase;
import kotlin.Metadata;
import kotlin.TestGroupLSModel;
import kotlin.component28;
import kotlin.getAnswerMap;
import kotlin.getErrorMessageId;
import kotlin.isHdPlaybackError;
import kotlin.requireLoggedUser;
import kotlin.setStatusTimestamp;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0010\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0003\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0010\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0003\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0014\u0010\u0017R\u0011\u0010\u0018\u001a\u00020\u00048\u0006¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R!\u0010\u001a\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u00068\u0007¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f"}, d2 = {"Lcom/fasterxml/jackson/module/kotlin/KotlinNamesAnnotationIntrospector;", "Lcom/fasterxml/jackson/databind/introspect/NopAnnotationIntrospector;", "Lcom/fasterxml/jackson/module/kotlin/KotlinModule;", "p0", "Lcom/fasterxml/jackson/module/kotlin/ReflectionCache;", "p1", "", "Lo/isHdPlaybackError;", "p2", "<init>", "(Lcom/fasterxml/jackson/module/kotlin/KotlinModule;Lcom/fasterxml/jackson/module/kotlin/ReflectionCache;Ljava/util/Set;)V", "Lcom/fasterxml/jackson/databind/introspect/AnnotatedMember;", "", "findImplicitPropertyName", "(Lcom/fasterxml/jackson/databind/introspect/AnnotatedMember;)Ljava/lang/String;", "Lcom/fasterxml/jackson/databind/introspect/AnnotatedParameter;", "findKotlinParameterName", "(Lcom/fasterxml/jackson/databind/introspect/AnnotatedParameter;)Ljava/lang/String;", "Lcom/fasterxml/jackson/databind/introspect/Annotated;", "", "hasCreatorAnnotation", "(Lcom/fasterxml/jackson/databind/introspect/Annotated;)Z", "Lcom/fasterxml/jackson/databind/introspect/AnnotatedConstructor;", "(Lcom/fasterxml/jackson/databind/introspect/AnnotatedConstructor;)Z", "cache", "Lcom/fasterxml/jackson/module/kotlin/ReflectionCache;", "ignoredClassesForImplyingJsonCreator", "Ljava/util/Set;", "getIgnoredClassesForImplyingJsonCreator", "()Ljava/util/Set;", "module", "Lcom/fasterxml/jackson/module/kotlin/KotlinModule;"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class KotlinNamesAnnotationIntrospector extends NopAnnotationIntrospector {
    private final ReflectionCache cache;
    private final Set<isHdPlaybackError<?>> ignoredClassesForImplyingJsonCreator;
    private final KotlinModule module;

    /* JADX WARN: Multi-variable type inference failed */
    public KotlinNamesAnnotationIntrospector(KotlinModule kotlinModule, ReflectionCache reflectionCache, Set<? extends isHdPlaybackError<?>> set) {
        toMagicModuleMetaRepoModel.write(kotlinModule, "");
        toMagicModuleMetaRepoModel.write(reflectionCache, "");
        toMagicModuleMetaRepoModel.write(set, "");
        this.module = kotlinModule;
        this.cache = reflectionCache;
        this.ignoredClassesForImplyingJsonCreator = set;
    }

    public final Set<isHdPlaybackError<?>> getIgnoredClassesForImplyingJsonCreator() {
        return this.ignoredClassesForImplyingJsonCreator;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public final String findImplicitPropertyName(AnnotatedMember p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        Class<?> declaringClass = p0.getDeclaringClass();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(declaringClass, "");
        if (!KotlinModuleKt.isKotlinClass(declaringClass)) {
            return null;
        }
        String name = p0.getName();
        if (!(p0 instanceof AnnotatedMethod)) {
            if (p0 instanceof AnnotatedParameter) {
                return findKotlinParameterName((AnnotatedParameter) p0);
            }
            return null;
        }
        if (((AnnotatedMethod) p0).getParameterCount() == 0) {
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(name, "");
            if (!TestGroupLSModel.MediaBrowserCompatCustomActionResultReceiver(name, "get")) {
                if (TestGroupLSModel.MediaBrowserCompatCustomActionResultReceiver(name, "is")) {
                    return TestGroupLSModel.write((CharSequence) name, (CharSequence) "-", false) ? TestGroupLSModel.read(name, "-", name) : name;
                }
            } else {
                if ((TestGroupLSModel.write((CharSequence) name, (CharSequence) "-", false) ? name : null) == null) {
                    return null;
                }
                String string = TestGroupLSModel.read(name, "get", name);
                if (string.length() > 0) {
                    StringBuilder sb = new StringBuilder();
                    char cCharAt = string.charAt(0);
                    Locale locale = Locale.getDefault();
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(locale, "");
                    sb.append(setStatusTimestamp.RemoteActionCompatParcelizer(cCharAt, locale).toString());
                    if (string == null) {
                        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                    }
                    String strSubstring = string.substring(1);
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strSubstring, "");
                    sb.append(strSubstring);
                    string = sb.toString();
                }
                return TestGroupLSModel.IconCompatParcelizer(string, '-', string);
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:78:0x016d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean hasCreatorAnnotation(com.fasterxml.jackson.databind.introspect.AnnotatedConstructor r9) {
        /*
            Method dump skipped, instruction units count: 380
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.module.kotlin.KotlinNamesAnnotationIntrospector.hasCreatorAnnotation(com.fasterxml.jackson.databind.introspect.AnnotatedConstructor):boolean");
    }

    /* JADX INFO: renamed from: com.fasterxml.jackson.module.kotlin.KotlinNamesAnnotationIntrospector$hasCreatorAnnotation$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lcom/fasterxml/jackson/databind/introspect/AnnotatedConstructor;"}, k = 3, mv = {1, 5, 1}, xi = 48)
    static final class AnonymousClass2 extends MagicModuleUseCase implements getAnswerMap<AnnotatedConstructor, Boolean> {
        @Override // kotlin.getAnswerMap
        public final Boolean invoke(AnnotatedConstructor annotatedConstructor) {
            toMagicModuleMetaRepoModel.write(annotatedConstructor, "");
            return Boolean.valueOf(KotlinNamesAnnotationIntrospector.this.hasCreatorAnnotation(annotatedConstructor));
        }

        AnonymousClass2() {
            super(1);
        }
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public final boolean hasCreatorAnnotation(Annotated p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        if (!(p0 instanceof AnnotatedConstructor)) {
            return false;
        }
        AnnotatedConstructor annotatedConstructor = (AnnotatedConstructor) p0;
        if (KotlinNamesAnnotationIntrospectorKt.isKotlinConstructorWithParameters(annotatedConstructor)) {
            return this.cache.checkConstructorIsCreatorAnnotated(annotatedConstructor, new AnonymousClass2());
        }
        return false;
    }

    private final String findKotlinParameterName(AnnotatedParameter p0) {
        List<ApplicationData> listMediaBrowserCompatSearchResultReceiver;
        ApplicationData applicationData;
        List<ApplicationData> listMediaBrowserCompatSearchResultReceiver2;
        ApplicationData applicationData2;
        List<ApplicationData> listMediaBrowserCompatSearchResultReceiver3;
        getErrorMessageId geterrormessageidRemoteActionCompatParcelizer;
        List<ApplicationData> listMediaBrowserCompatSearchResultReceiver4;
        ApplicationData applicationData3;
        List<ApplicationData> listMediaBrowserCompatSearchResultReceiver5;
        Class<?> declaringClass = p0.getDeclaringClass();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(declaringClass, "");
        if (!KotlinModuleKt.isKotlinClass(declaringClass)) {
            return null;
        }
        Member member = p0.getOwner().getMember();
        int size = 0;
        if (member instanceof Constructor) {
            Constructor constructor = (Constructor) member;
            int length = constructor.getParameterTypes().length;
            try {
                getErrorMessageId geterrormessageidRemoteActionCompatParcelizer2 = requireLoggedUser.RemoteActionCompatParcelizer(constructor);
                if (geterrormessageidRemoteActionCompatParcelizer2 != null && (listMediaBrowserCompatSearchResultReceiver5 = geterrormessageidRemoteActionCompatParcelizer2.MediaBrowserCompatSearchResultReceiver()) != null) {
                    size = listMediaBrowserCompatSearchResultReceiver5.size();
                }
            } catch (UnsupportedOperationException | component28 unused) {
            }
            if (size <= 0 || size != length || (geterrormessageidRemoteActionCompatParcelizer = requireLoggedUser.RemoteActionCompatParcelizer(constructor)) == null || (listMediaBrowserCompatSearchResultReceiver4 = geterrormessageidRemoteActionCompatParcelizer.MediaBrowserCompatSearchResultReceiver()) == null || (applicationData3 = listMediaBrowserCompatSearchResultReceiver4.get(p0.getIndex())) == null) {
                return null;
            }
            return applicationData3.RemoteActionCompatParcelizer();
        }
        if (!(member instanceof Method)) {
            return null;
        }
        try {
            getErrorMessageId<?> geterrormessageid = requireLoggedUser.read((Method) member);
            int index = ((geterrormessageid != null && (listMediaBrowserCompatSearchResultReceiver = geterrormessageid.MediaBrowserCompatSearchResultReceiver()) != null && (applicationData = (ApplicationData) IntermediateLoginResponseBody.MediaBrowserCompatSearchResultReceiver((List) listMediaBrowserCompatSearchResultReceiver)) != null) ? applicationData.IconCompatParcelizer() : null) != ApplicationData.IconCompatParcelizer.RemoteActionCompatParcelizer ? p0.getIndex() + 1 : p0.getIndex();
            if (geterrormessageid != null && (listMediaBrowserCompatSearchResultReceiver3 = geterrormessageid.MediaBrowserCompatSearchResultReceiver()) != null) {
                size = listMediaBrowserCompatSearchResultReceiver3.size();
            }
            if (size > index && geterrormessageid != null && (listMediaBrowserCompatSearchResultReceiver2 = geterrormessageid.MediaBrowserCompatSearchResultReceiver()) != null && (applicationData2 = listMediaBrowserCompatSearchResultReceiver2.get(index)) != null) {
                return applicationData2.RemoteActionCompatParcelizer();
            }
            return null;
        } catch (component28 unused2) {
            return null;
        }
    }
}
