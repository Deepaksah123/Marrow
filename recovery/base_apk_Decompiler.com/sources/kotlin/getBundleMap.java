package kotlin;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class getBundleMap implements CourseConfigV2QbankItem {
    private final String read;
    private final List<CourseConfigV2PracticalItems> write;

    /* JADX WARN: Multi-variable type inference failed */
    public getBundleMap(List<? extends CourseConfigV2PracticalItems> list, String str) {
        toMagicModuleMetaRepoModel.write(list, "");
        toMagicModuleMetaRepoModel.write(str, "");
        this.write = list;
        this.read = str;
        list.size();
        IntermediateLoginResponseBody.onPlayFromUri(list).size();
    }

    @Override // kotlin.CourseConfigV2PracticalItems
    @getRenewGrpId
    public final List<getShouldShowEmptyPlanScreen> IconCompatParcelizer(getNotesCount getnotescount) {
        toMagicModuleMetaRepoModel.write(getnotescount, "");
        ArrayList arrayList = new ArrayList();
        Iterator<CourseConfigV2PracticalItems> it = this.write.iterator();
        while (it.hasNext()) {
            getSubjectPrefix.IconCompatParcelizer(it.next(), getnotescount, arrayList);
        }
        return IntermediateLoginResponseBody.onPlay(arrayList);
    }

    @Override // kotlin.CourseConfigV2QbankItem
    public final void write(getNotesCount getnotescount, Collection<getShouldShowEmptyPlanScreen> collection) {
        toMagicModuleMetaRepoModel.write(getnotescount, "");
        toMagicModuleMetaRepoModel.write(collection, "");
        Iterator<CourseConfigV2PracticalItems> it = this.write.iterator();
        while (it.hasNext()) {
            getSubjectPrefix.IconCompatParcelizer(it.next(), getnotescount, collection);
        }
    }

    @Override // kotlin.CourseConfigV2QbankItem
    public final boolean RemoteActionCompatParcelizer(getNotesCount getnotescount) {
        toMagicModuleMetaRepoModel.write(getnotescount, "");
        List<CourseConfigV2PracticalItems> list = this.write;
        if ((list instanceof Collection) && list.isEmpty()) {
            return true;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (!getSubjectPrefix.RemoteActionCompatParcelizer((CourseConfigV2PracticalItems) it.next(), getnotescount)) {
                return false;
            }
        }
        return true;
    }

    @Override // kotlin.CourseConfigV2PracticalItems
    public final Collection<getNotesCount> RemoteActionCompatParcelizer(getNotesCount getnotescount, getAnswerMap<? super getRelatedLessonId, Boolean> getanswermap) {
        toMagicModuleMetaRepoModel.write(getnotescount, "");
        toMagicModuleMetaRepoModel.write(getanswermap, "");
        HashSet hashSet = new HashSet();
        Iterator<CourseConfigV2PracticalItems> it = this.write.iterator();
        while (it.hasNext()) {
            hashSet.addAll(it.next().RemoteActionCompatParcelizer(getnotescount, getanswermap));
        }
        return hashSet;
    }

    public final String toString() {
        return this.read;
    }
}
