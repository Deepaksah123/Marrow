package com.fasterxml.jackson.module.kotlin;

import com.fasterxml.jackson.databind.introspect.AnnotatedField;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.introspect.AnnotatedParameter;
import kotlin.MagicModuleUseCase;
import kotlin.Metadata;
import kotlin.getAnswerMap;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lcom/fasterxml/jackson/databind/introspect/AnnotatedMember;"}, k = 3, mv = {1, 5, 1}, xi = 48)
final class KotlinAnnotationIntrospector$hasRequiredMarker$hasRequired$1 extends MagicModuleUseCase implements getAnswerMap<AnnotatedMember, Boolean> {
    final /* synthetic */ AnnotatedMember $m;
    final /* synthetic */ KotlinAnnotationIntrospector this$0;

    @Override // kotlin.getAnswerMap
    public final Boolean invoke(AnnotatedMember annotatedMember) {
        toMagicModuleMetaRepoModel.write(annotatedMember, "");
        if (this.this$0.nullToEmptyCollection && this.$m.getType().isCollectionLikeType()) {
            return Boolean.FALSE;
        }
        if (this.this$0.nullToEmptyMap && this.$m.getType().isMapLikeType()) {
            return Boolean.FALSE;
        }
        Class<?> declaringClass = this.$m.getMember().getDeclaringClass();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(declaringClass, "");
        if (KotlinModuleKt.isKotlinClass(declaringClass)) {
            AnnotatedMember annotatedMember2 = this.$m;
            if (annotatedMember2 instanceof AnnotatedField) {
                return this.this$0.hasRequiredMarker((AnnotatedField) annotatedMember2);
            }
            if (annotatedMember2 instanceof AnnotatedMethod) {
                return this.this$0.hasRequiredMarker((AnnotatedMethod) annotatedMember2);
            }
            if (annotatedMember2 instanceof AnnotatedParameter) {
                return this.this$0.hasRequiredMarker((AnnotatedParameter) annotatedMember2);
            }
        }
        return null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    KotlinAnnotationIntrospector$hasRequiredMarker$hasRequired$1(KotlinAnnotationIntrospector kotlinAnnotationIntrospector, AnnotatedMember annotatedMember) {
        super(1);
        this.this$0 = kotlinAnnotationIntrospector;
        this.$m = annotatedMember;
    }
}
