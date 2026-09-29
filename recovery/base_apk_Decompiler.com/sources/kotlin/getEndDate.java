package kotlin;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.getStartDate;

/* JADX INFO: loaded from: classes4.dex */
public final class getEndDate implements getDocSideType {
    private final getTopSection AudioAttributesCompatParcelizer;
    private final getMini write;

    public getEndDate(getMini getmini, getTopSection gettopsection) {
        toMagicModuleMetaRepoModel.write(getmini, "");
        toMagicModuleMetaRepoModel.write(gettopsection, "");
        this.write = getmini;
        this.AudioAttributesCompatParcelizer = gettopsection;
    }

    @Override // kotlin.getDocSideType
    public final boolean AudioAttributesCompatParcelizer(getNotesCount getnotescount, getRelatedLessonId getrelatedlessonid) {
        toMagicModuleMetaRepoModel.write(getnotescount, "");
        toMagicModuleMetaRepoModel.write(getrelatedlessonid, "");
        String strAudioAttributesCompatParcelizer = getrelatedlessonid.AudioAttributesCompatParcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strAudioAttributesCompatParcelizer, "");
        if (!TestGroupLSModel.MediaBrowserCompatCustomActionResultReceiver(strAudioAttributesCompatParcelizer, "Function") && !TestGroupLSModel.MediaBrowserCompatCustomActionResultReceiver(strAudioAttributesCompatParcelizer, "KFunction") && !TestGroupLSModel.MediaBrowserCompatCustomActionResultReceiver(strAudioAttributesCompatParcelizer, "SuspendFunction") && !TestGroupLSModel.MediaBrowserCompatCustomActionResultReceiver(strAudioAttributesCompatParcelizer, "KSuspendFunction")) {
            return false;
        }
        getStartDate.read readVar = getStartDate.IconCompatParcelizer;
        return getStartDate.read.AudioAttributesCompatParcelizer(strAudioAttributesCompatParcelizer, getnotescount) != null;
    }

    @Override // kotlin.getDocSideType
    public final CourseConfigV2CustomModuleQuestionSource RemoteActionCompatParcelizer(RevisionSubjectStatusModel revisionSubjectStatusModel) {
        toMagicModuleMetaRepoModel.write(revisionSubjectStatusModel, "");
        if (revisionSubjectStatusModel.AudioAttributesImplApi21Parcelizer() || revisionSubjectStatusModel.AudioAttributesImplBaseParcelizer()) {
            return null;
        }
        String strRemoteActionCompatParcelizer = revisionSubjectStatusModel.IconCompatParcelizer().RemoteActionCompatParcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strRemoteActionCompatParcelizer, "");
        if (!TestGroupLSModel.write((CharSequence) strRemoteActionCompatParcelizer, (CharSequence) "Function", false)) {
            return null;
        }
        getNotesCount getnotescountRemoteActionCompatParcelizer = revisionSubjectStatusModel.RemoteActionCompatParcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getnotescountRemoteActionCompatParcelizer, "");
        getStartDate.read readVar = getStartDate.IconCompatParcelizer;
        getStartDate.read.C0106read c0106readAudioAttributesCompatParcelizer = getStartDate.read.AudioAttributesCompatParcelizer(strRemoteActionCompatParcelizer, getnotescountRemoteActionCompatParcelizer);
        if (c0106readAudioAttributesCompatParcelizer == null) {
            return null;
        }
        getStartDate getstartdateAudioAttributesCompatParcelizer = c0106readAudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer();
        int i = c0106readAudioAttributesCompatParcelizer.read();
        List<getShouldShowEmptyPlanScreen> listWrite = this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(getnotescountRemoteActionCompatParcelizer).write();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listWrite) {
            if (obj instanceof getQBankGroupMeta) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = arrayList;
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : arrayList2) {
            if (obj2 instanceof getSupportedBottomTabs) {
                arrayList3.add(obj2);
            }
        }
        Object objRatingCompat = (getSupportedBottomTabs) IntermediateLoginResponseBody.MediaBrowserCompatSearchResultReceiver((List) arrayList3);
        if (objRatingCompat == null) {
            objRatingCompat = IntermediateLoginResponseBody.RatingCompat((List<? extends Object>) arrayList2);
        }
        return new isTestIntroFooterEnabled(this.write, (getQBankGroupMeta) objRatingCompat, getstartdateAudioAttributesCompatParcelizer, i);
    }

    @Override // kotlin.getDocSideType
    public final Collection<CourseConfigV2CustomModuleQuestionSource> write(getNotesCount getnotescount) {
        toMagicModuleMetaRepoModel.write(getnotescount, "");
        return getKycMessage.read();
    }
}
