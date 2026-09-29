package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001J\u007f\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00042\u001c\b\u0002\u0010\t\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b\u0018\u00010\u00062\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00042\u0018\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\f0\u0006H&¢\u0006\u0004\b\u000e\u0010\u000f\u0082\u0001\u0001\u0010ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Lo/startWakefulService;", "", "", "p0", "Lkotlin/Function1;", "p1", "Lkotlin/Function2;", "Lo/setLayoutTransition;", "Lo/init;", "p2", "p3", "Lo/FragmentContainerView;", "", "p4", "IconCompatParcelizer", "(ILo/getAnswerMap;Lo/MagicModuleSubmissionRequestBody;Lo/getAnswerMap;Lo/getMagicModuleStat;)V", "Lo/lambdainit1androidxfragmentappFragmentActivity;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface startWakefulService {
    void IconCompatParcelizer(int p0, getAnswerMap<? super Integer, ? extends Object> p1, MagicModuleSubmissionRequestBody<? super setLayoutTransition, ? super Integer, init> p2, getAnswerMap<? super Integer, ? extends Object> p3, getMagicModuleStat<? super FragmentContainerView, ? super Integer, ? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup> p4);

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class RemoteActionCompatParcelizer implements getAnswerMap {
        public static final RemoteActionCompatParcelizer AudioAttributesCompatParcelizer = new RemoteActionCompatParcelizer();

        public final Void read(int i) {
            return null;
        }

        @Override // kotlin.getAnswerMap
        public final /* synthetic */ Object invoke(Object obj) {
            return read(((Number) obj).intValue());
        }

        RemoteActionCompatParcelizer() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void IconCompatParcelizer$default(startWakefulService startwakefulservice, int i, getAnswerMap getanswermap, MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody, getAnswerMap getanswermap2, getMagicModuleStat getmagicmodulestat, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: items");
        }
        getAnswerMap getanswermap3 = (i2 & 2) != 0 ? null : getanswermap;
        MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody2 = (i2 & 4) != 0 ? null : magicModuleSubmissionRequestBody;
        if ((i2 & 8) != 0) {
            getanswermap2 = RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer;
        }
        startwakefulservice.IconCompatParcelizer(i, getanswermap3, magicModuleSubmissionRequestBody2, getanswermap2, getmagicmodulestat);
    }
}
