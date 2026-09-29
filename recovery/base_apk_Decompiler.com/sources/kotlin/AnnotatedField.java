package kotlin;

import android.content.Context;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
public final class AnnotatedField {

    /* JADX INFO: renamed from: o.AnnotatedField$4, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/content/Context;", "p0", "", "Lo/withAnnotations;", "Lo/AnnotatedMethod;", "IconCompatParcelizer", "(Landroid/content/Context;)Ljava/util/List;"}, k = 3, mv = {1, 5, 1}, xi = 48)
    static final class AnonymousClass4 extends MagicModuleUseCase implements getAnswerMap<Context, List<? extends withAnnotations<AnnotatedMethod>>> {
        public static final AnonymousClass4 read = new AnonymousClass4();

        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final List<withAnnotations<AnnotatedMethod>> invoke(Context context) {
            toMagicModuleMetaRepoModel.write(context, "");
            return IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
        }

        AnonymousClass4() {
            super(1);
        }
    }

    public static /* synthetic */ PlaybackConfigRootRequestBody RemoteActionCompatParcelizer(String str) {
        AnonymousClass4 anonymousClass4 = AnonymousClass4.read;
        setMbbsVerificationYear setmbbsverificationyear = setMbbsVerificationYear.INSTANCE;
        return IconCompatParcelizer(str, null, anonymousClass4, College.AudioAttributesCompatParcelizer(setMbbsVerificationYear.write().plus(getAltContact.read(null))));
    }

    private static PlaybackConfigRootRequestBody<Context, collectAnnotations<AnnotatedMethod>> IconCompatParcelizer(String str, AnnotatedFieldCollector<AnnotatedMethod> annotatedFieldCollector, getAnswerMap<? super Context, ? extends List<? extends withAnnotations<AnnotatedMethod>>> getanswermap, TopUserCompanion topUserCompanion) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(getanswermap, "");
        toMagicModuleMetaRepoModel.write(topUserCompanion, "");
        return new getModifiers(str, null, getanswermap, topUserCompanion);
    }
}
