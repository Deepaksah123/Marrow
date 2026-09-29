package kotlin;

/* JADX INFO: loaded from: classes4.dex */
public final class getHasBeenAnswered implements isTest {
    private final CourseConfigV2PracticalItems IconCompatParcelizer;

    public getHasBeenAnswered(CourseConfigV2PracticalItems courseConfigV2PracticalItems) {
        toMagicModuleMetaRepoModel.write(courseConfigV2PracticalItems, "");
        this.IconCompatParcelizer = courseConfigV2PracticalItems;
    }

    @Override // kotlin.isTest
    public final isStep write(RevisionSubjectStatusModel revisionSubjectStatusModel) {
        isStep isstepWrite;
        toMagicModuleMetaRepoModel.write(revisionSubjectStatusModel, "");
        CourseConfigV2PracticalItems courseConfigV2PracticalItems = this.IconCompatParcelizer;
        getNotesCount getnotescountRemoteActionCompatParcelizer = revisionSubjectStatusModel.RemoteActionCompatParcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getnotescountRemoteActionCompatParcelizer, "");
        for (getShouldShowEmptyPlanScreen getshouldshowemptyplanscreen : getSubjectPrefix.AudioAttributesCompatParcelizer(courseConfigV2PracticalItems, getnotescountRemoteActionCompatParcelizer)) {
            if ((getshouldshowemptyplanscreen instanceof QaPair) && (isstepWrite = ((QaPair) getshouldshowemptyplanscreen).MediaBrowserCompatCustomActionResultReceiver().write(revisionSubjectStatusModel)) != null) {
                return isstepWrite;
            }
        }
        return null;
    }
}
