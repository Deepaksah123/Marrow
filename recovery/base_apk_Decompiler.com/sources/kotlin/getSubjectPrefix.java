package kotlin;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class getSubjectPrefix {
    public static final List<getShouldShowEmptyPlanScreen> AudioAttributesCompatParcelizer(CourseConfigV2PracticalItems courseConfigV2PracticalItems, getNotesCount getnotescount) {
        toMagicModuleMetaRepoModel.write(courseConfigV2PracticalItems, "");
        toMagicModuleMetaRepoModel.write(getnotescount, "");
        ArrayList arrayList = new ArrayList();
        IconCompatParcelizer(courseConfigV2PracticalItems, getnotescount, arrayList);
        return arrayList;
    }

    public static final boolean RemoteActionCompatParcelizer(CourseConfigV2PracticalItems courseConfigV2PracticalItems, getNotesCount getnotescount) {
        toMagicModuleMetaRepoModel.write(courseConfigV2PracticalItems, "");
        toMagicModuleMetaRepoModel.write(getnotescount, "");
        return courseConfigV2PracticalItems instanceof CourseConfigV2QbankItem ? ((CourseConfigV2QbankItem) courseConfigV2PracticalItems).RemoteActionCompatParcelizer(getnotescount) : AudioAttributesCompatParcelizer(courseConfigV2PracticalItems, getnotescount).isEmpty();
    }

    public static final void IconCompatParcelizer(CourseConfigV2PracticalItems courseConfigV2PracticalItems, getNotesCount getnotescount, Collection<getShouldShowEmptyPlanScreen> collection) {
        toMagicModuleMetaRepoModel.write(courseConfigV2PracticalItems, "");
        toMagicModuleMetaRepoModel.write(getnotescount, "");
        toMagicModuleMetaRepoModel.write(collection, "");
        if (courseConfigV2PracticalItems instanceof CourseConfigV2QbankItem) {
            ((CourseConfigV2QbankItem) courseConfigV2PracticalItems).write(getnotescount, collection);
        } else {
            collection.addAll(courseConfigV2PracticalItems.IconCompatParcelizer(getnotescount));
        }
    }
}
