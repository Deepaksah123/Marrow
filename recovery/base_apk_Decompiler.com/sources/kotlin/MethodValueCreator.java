package kotlin;

import androidx.paging.compose.PagingPlaceholderKey;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
public final class MethodValueCreator {

    /* JADX INFO: renamed from: o.MethodValueCreator$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "T", "", "p0", "RemoteActionCompatParcelizer", "(I)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass3 extends MagicModuleUseCase implements getAnswerMap<Integer, Object> {
        final /* synthetic */ MethodValueCreatorCompanion<T> $AudioAttributesCompatParcelizer;
        final /* synthetic */ getAnswerMap<T, Object> $write;

        @Override // kotlin.getAnswerMap
        public final /* synthetic */ Object invoke(Integer num) {
            return RemoteActionCompatParcelizer(num.intValue());
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        public final Object RemoteActionCompatParcelizer(int i) {
            if (this.$write == null) {
                return new PagingPlaceholderKey(i);
            }
            Object objIconCompatParcelizer = this.$AudioAttributesCompatParcelizer.IconCompatParcelizer(i);
            return objIconCompatParcelizer == null ? new PagingPlaceholderKey(i) : this.$write.invoke(objIconCompatParcelizer);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(getAnswerMap<T, ? extends Object> getanswermap, MethodValueCreatorCompanion<T> methodValueCreatorCompanion) {
            super(1);
            this.$write = getanswermap;
            this.$AudioAttributesCompatParcelizer = methodValueCreatorCompanion;
        }
    }

    public static final <T> getAnswerMap<Integer, Object> IconCompatParcelizer(MethodValueCreatorCompanion<T> methodValueCreatorCompanion, getAnswerMap<T, ? extends Object> getanswermap) {
        toMagicModuleMetaRepoModel.write(methodValueCreatorCompanion, "");
        return new AnonymousClass3(getanswermap, methodValueCreatorCompanion);
    }
}
