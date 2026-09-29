package kotlin;

import java.util.Collection;
import java.util.List;
import kotlin.RecentUpdateSubjectDetails;

/* JADX INFO: loaded from: classes4.dex */
public abstract class getMcqList extends RecentUpdateSubjectDetails {
    @Override // kotlin.RecentUpdateSubjectDetails
    protected final CourseConfigV2TestTabItem MediaBrowserCompatCustomActionResultReceiver() {
        return null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getMcqList(getFeaturedCards getfeaturedcards) {
        super(getfeaturedcards);
        toMagicModuleMetaRepoModel.write(getfeaturedcards, "");
    }

    @Override // kotlin.RecentUpdateSubjectDetails
    protected final RecentUpdateSubjectDetails.IconCompatParcelizer write(extract extractVar, List<? extends getBadgeText> list, getLink getlink, List<? extends getMeta> list2) {
        toMagicModuleMetaRepoModel.write(extractVar, "");
        toMagicModuleMetaRepoModel.write(list, "");
        toMagicModuleMetaRepoModel.write(getlink, "");
        toMagicModuleMetaRepoModel.write(list2, "");
        return new RecentUpdateSubjectDetails.IconCompatParcelizer(getlink, null, list2, list, false, IntermediateLoginResponseBody.RemoteActionCompatParcelizer());
    }

    @Override // kotlin.RecentUpdateSubjectDetails
    protected void IconCompatParcelizer(getRelatedLessonId getrelatedlessonid, Collection<CourseConfigV2SettingsItems> collection) {
        toMagicModuleMetaRepoModel.write(getrelatedlessonid, "");
        toMagicModuleMetaRepoModel.write(collection, "");
    }
}
