package kotlin;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class CourseConfigV2QBankGroupItem implements CourseConfigV2QbankItem {
    private final Collection<getShouldShowEmptyPlanScreen> IconCompatParcelizer;

    /* JADX WARN: Multi-variable type inference failed */
    public CourseConfigV2QBankGroupItem(Collection<? extends getShouldShowEmptyPlanScreen> collection) {
        toMagicModuleMetaRepoModel.write(collection, "");
        this.IconCompatParcelizer = collection;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.CourseConfigV2QbankItem
    public final void write(getNotesCount getnotescount, Collection<getShouldShowEmptyPlanScreen> collection) {
        toMagicModuleMetaRepoModel.write(getnotescount, "");
        toMagicModuleMetaRepoModel.write(collection, "");
        for (Object obj : this.IconCompatParcelizer) {
            if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(((getShouldShowEmptyPlanScreen) obj).IconCompatParcelizer(), getnotescount)) {
                collection.add(obj);
            }
        }
    }

    @Override // kotlin.CourseConfigV2QbankItem
    public final boolean RemoteActionCompatParcelizer(getNotesCount getnotescount) {
        toMagicModuleMetaRepoModel.write(getnotescount, "");
        Collection<getShouldShowEmptyPlanScreen> collection = this.IconCompatParcelizer;
        if ((collection instanceof Collection) && collection.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(((getShouldShowEmptyPlanScreen) it.next()).IconCompatParcelizer(), getnotescount)) {
                return false;
            }
        }
        return true;
    }

    @Override // kotlin.CourseConfigV2PracticalItems
    @getRenewGrpId
    public final List<getShouldShowEmptyPlanScreen> IconCompatParcelizer(getNotesCount getnotescount) {
        toMagicModuleMetaRepoModel.write(getnotescount, "");
        Collection<getShouldShowEmptyPlanScreen> collection = this.IconCompatParcelizer;
        ArrayList arrayList = new ArrayList();
        for (Object obj : collection) {
            if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(((getShouldShowEmptyPlanScreen) obj).IconCompatParcelizer(), getnotescount)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    static final class RemoteActionCompatParcelizer extends MagicModuleUseCase implements getAnswerMap<getShouldShowEmptyPlanScreen, getNotesCount> {
        public static final RemoteActionCompatParcelizer read = new RemoteActionCompatParcelizer();

        private static getNotesCount write(getShouldShowEmptyPlanScreen getshouldshowemptyplanscreen) {
            toMagicModuleMetaRepoModel.write(getshouldshowemptyplanscreen, "");
            return getshouldshowemptyplanscreen.IconCompatParcelizer();
        }

        @Override // kotlin.getAnswerMap
        public final /* synthetic */ getNotesCount invoke(getShouldShowEmptyPlanScreen getshouldshowemptyplanscreen) {
            return write(getshouldshowemptyplanscreen);
        }

        RemoteActionCompatParcelizer() {
            super(1);
        }
    }

    @Override // kotlin.CourseConfigV2PracticalItems
    public final Collection<getNotesCount> RemoteActionCompatParcelizer(getNotesCount getnotescount, getAnswerMap<? super getRelatedLessonId, Boolean> getanswermap) {
        toMagicModuleMetaRepoModel.write(getnotescount, "");
        toMagicModuleMetaRepoModel.write(getanswermap, "");
        return StateResult.MediaBrowserCompatItemReceiver(StateResult.IconCompatParcelizer(StateResult.write(IntermediateLoginResponseBody.AudioAttributesImplBaseParcelizer(this.IconCompatParcelizer), RemoteActionCompatParcelizer.read), (getAnswerMap) new AudioAttributesCompatParcelizer(getnotescount)));
    }

    static final class AudioAttributesCompatParcelizer extends MagicModuleUseCase implements getAnswerMap<getNotesCount, Boolean> {
        private /* synthetic */ getNotesCount AudioAttributesCompatParcelizer;

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Boolean invoke(getNotesCount getnotescount) {
            toMagicModuleMetaRepoModel.write(getnotescount, "");
            return Boolean.valueOf(!getnotescount.read() && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(getnotescount.AudioAttributesCompatParcelizer(), this.AudioAttributesCompatParcelizer));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AudioAttributesCompatParcelizer(getNotesCount getnotescount) {
            super(1);
            this.AudioAttributesCompatParcelizer = getnotescount;
        }
    }
}
