package kotlin;

import java.util.Iterator;
import java.util.List;
import kotlin.getHighYieldIds;
import kotlin.getZenArea;

/* JADX INFO: loaded from: classes4.dex */
public final class getPublishedTime {
    private static String RemoteActionCompatParcelizer(CourseConfigV2NavDrawerItemRateUs courseConfigV2NavDrawerItemRateUs, boolean z, boolean z2) {
        String strAudioAttributesCompatParcelizer;
        toMagicModuleMetaRepoModel.write(courseConfigV2NavDrawerItemRateUs, "");
        StringBuilder sb = new StringBuilder();
        if (z2) {
            if (courseConfigV2NavDrawerItemRateUs instanceof CourseConfigV2GtAnalyticsCard) {
                strAudioAttributesCompatParcelizer = "<init>";
            } else {
                strAudioAttributesCompatParcelizer = courseConfigV2NavDrawerItemRateUs.aQ_().AudioAttributesCompatParcelizer();
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strAudioAttributesCompatParcelizer, "");
            }
            sb.append(strAudioAttributesCompatParcelizer);
        }
        sb.append("(");
        CourseConfigV2TestTabItem courseConfigV2TestTabItemMediaBrowserCompatCustomActionResultReceiver = courseConfigV2NavDrawerItemRateUs.MediaBrowserCompatCustomActionResultReceiver();
        if (courseConfigV2TestTabItemMediaBrowserCompatCustomActionResultReceiver != null) {
            getLink getlinkOnPrepareFromMediaId = courseConfigV2TestTabItemMediaBrowserCompatCustomActionResultReceiver.onPrepareFromMediaId();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getlinkOnPrepareFromMediaId, "");
            write(sb, getlinkOnPrepareFromMediaId);
        }
        Iterator<getMeta> it = courseConfigV2NavDrawerItemRateUs.aX_().iterator();
        while (it.hasNext()) {
            getLink getlinkOnPrepareFromMediaId2 = it.next().onPrepareFromMediaId();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getlinkOnPrepareFromMediaId2, "");
            write(sb, getlinkOnPrepareFromMediaId2);
        }
        sb.append(")");
        if (z) {
            if (getActiveRecallQbankId.RemoteActionCompatParcelizer(courseConfigV2NavDrawerItemRateUs)) {
                sb.append("V");
            } else {
                getLink getlinkAudioAttributesImplBaseParcelizer = courseConfigV2NavDrawerItemRateUs.AudioAttributesImplBaseParcelizer();
                toMagicModuleMetaRepoModel.write(getlinkAudioAttributesImplBaseParcelizer);
                write(sb, getlinkAudioAttributesImplBaseParcelizer);
            }
        }
        String string = sb.toString();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
        return string;
    }

    public static /* synthetic */ String RemoteActionCompatParcelizer(CourseConfigV2NavDrawerItemRateUs courseConfigV2NavDrawerItemRateUs, boolean z, boolean z2, int i) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            z2 = true;
        }
        return RemoteActionCompatParcelizer(courseConfigV2NavDrawerItemRateUs, z, z2);
    }

    public static final boolean read(getVideoPageNotesTitle getvideopagenotestitle) {
        CourseConfigV2NavDrawerItemRateUs courseConfigV2NavDrawerItemRateUsWrite;
        toMagicModuleMetaRepoModel.write(getvideopagenotestitle, "");
        if (!(getvideopagenotestitle instanceof CourseConfigV2NavDrawerItemRateUs)) {
            return false;
        }
        CourseConfigV2NavDrawerItemRateUs courseConfigV2NavDrawerItemRateUs = (CourseConfigV2NavDrawerItemRateUs) getvideopagenotestitle;
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) courseConfigV2NavDrawerItemRateUs.aQ_().AudioAttributesCompatParcelizer(), (Object) "remove") && courseConfigV2NavDrawerItemRateUs.aX_().size() == 1 && !getModuleOwner.RemoteActionCompatParcelizer((getTestHeaderTitle) getvideopagenotestitle)) {
            List<getMeta> listAX_ = courseConfigV2NavDrawerItemRateUs.onPrepareFromMediaId().aX_();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(listAX_, "");
            getLink getlinkOnPrepareFromMediaId = ((getMeta) IntermediateLoginResponseBody.onCommand((List) listAX_)).onPrepareFromMediaId();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getlinkOnPrepareFromMediaId, "");
            getHighYieldIds gethighyieldidsRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(getlinkOnPrepareFromMediaId);
            getHighYieldIds.RemoteActionCompatParcelizer remoteActionCompatParcelizer = gethighyieldidsRemoteActionCompatParcelizer instanceof getHighYieldIds.RemoteActionCompatParcelizer ? (getHighYieldIds.RemoteActionCompatParcelizer) gethighyieldidsRemoteActionCompatParcelizer : null;
            if ((remoteActionCompatParcelizer != null ? remoteActionCompatParcelizer.AudioAttributesImplApi21Parcelizer() : null) != setOption2AnsweredCount.INT || (courseConfigV2NavDrawerItemRateUsWrite = NestfgetmEditorDetail.write(courseConfigV2NavDrawerItemRateUs)) == null) {
                return false;
            }
            List<getMeta> listAX_2 = courseConfigV2NavDrawerItemRateUsWrite.onPrepareFromMediaId().aX_();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(listAX_2, "");
            getLink getlinkOnPrepareFromMediaId2 = ((getMeta) IntermediateLoginResponseBody.onCommand((List) listAX_2)).onPrepareFromMediaId();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getlinkOnPrepareFromMediaId2, "");
            getHighYieldIds gethighyieldidsRemoteActionCompatParcelizer2 = RemoteActionCompatParcelizer(getlinkOnPrepareFromMediaId2);
            getVariant getvariantAudioAttributesImplApi21Parcelizer = courseConfigV2NavDrawerItemRateUsWrite.AudioAttributesImplApi21Parcelizer();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getvariantAudioAttributesImplApi21Parcelizer, "");
            if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(setLocked.read(getvariantAudioAttributesImplApi21Parcelizer), getZenArea.RemoteActionCompatParcelizer.onPlayFromUri.AudioAttributesImplApi26Parcelizer()) && (gethighyieldidsRemoteActionCompatParcelizer2 instanceof getHighYieldIds.write) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) ((getHighYieldIds.write) gethighyieldidsRemoteActionCompatParcelizer2).AudioAttributesImplApi21Parcelizer(), (Object) "java/lang/Object")) {
                return true;
            }
        }
        return false;
    }

    public static final String IconCompatParcelizer(CourseConfigV2CustomModuleQuestionSource courseConfigV2CustomModuleQuestionSource) {
        toMagicModuleMetaRepoModel.write(courseConfigV2CustomModuleQuestionSource, "");
        CourseConfigV2AnnouncementBanner courseConfigV2AnnouncementBanner = CourseConfigV2AnnouncementBanner.write;
        getSlidesCount getslidescountAudioAttributesImplApi26Parcelizer = setLocked.write(courseConfigV2CustomModuleQuestionSource).AudioAttributesImplApi26Parcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getslidescountAudioAttributesImplApi26Parcelizer, "");
        RevisionSubjectStatusModel revisionSubjectStatusModelIconCompatParcelizer = CourseConfigV2AnnouncementBanner.IconCompatParcelizer(getslidescountAudioAttributesImplApi26Parcelizer);
        if (revisionSubjectStatusModelIconCompatParcelizer != null) {
            String strAudioAttributesCompatParcelizer = setMcqType.RemoteActionCompatParcelizer(revisionSubjectStatusModelIconCompatParcelizer).AudioAttributesCompatParcelizer();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strAudioAttributesCompatParcelizer, "");
            return strAudioAttributesCompatParcelizer;
        }
        return getActiveRecallQbankId.write(courseConfigV2CustomModuleQuestionSource, isComingSoon.RemoteActionCompatParcelizer);
    }

    private static final void write(StringBuilder sb, getLink getlink) {
        sb.append(RemoteActionCompatParcelizer(getlink));
    }

    public static final getHighYieldIds RemoteActionCompatParcelizer(getLink getlink) {
        toMagicModuleMetaRepoModel.write(getlink, "");
        return (getHighYieldIds) getActiveRecallQbankId.write(getlink, getLessonNumber.write, isDontConsider.AudioAttributesCompatParcelizer, isComingSoon.RemoteActionCompatParcelizer, null, UpdatedStatusCompanion.IconCompatParcelizer());
    }

    public static final String IconCompatParcelizer(getVideoPageNotesTitle getvideopagenotestitle) {
        toMagicModuleMetaRepoModel.write(getvideopagenotestitle, "");
        getPeopleSolved getpeoplesolved = getPeopleSolved.AudioAttributesCompatParcelizer;
        if (getAnswerDescription.MediaDescriptionCompat(getvideopagenotestitle)) {
            return null;
        }
        getVariant getvariantAudioAttributesImplApi21Parcelizer = getvideopagenotestitle.AudioAttributesImplApi21Parcelizer();
        CourseConfigV2CustomModuleQuestionSource courseConfigV2CustomModuleQuestionSource = getvariantAudioAttributesImplApi21Parcelizer instanceof CourseConfigV2CustomModuleQuestionSource ? (CourseConfigV2CustomModuleQuestionSource) getvariantAudioAttributesImplApi21Parcelizer : null;
        if (courseConfigV2CustomModuleQuestionSource == null || courseConfigV2CustomModuleQuestionSource.aQ_().read()) {
            return null;
        }
        getVideoPageNotesTitle getvideopagenotestitleAS_ = getvideopagenotestitle.aS_();
        CourseConfigV2SupportItem courseConfigV2SupportItem = getvideopagenotestitleAS_ instanceof CourseConfigV2SupportItem ? (CourseConfigV2SupportItem) getvideopagenotestitleAS_ : null;
        if (courseConfigV2SupportItem == null) {
            return null;
        }
        return getRatingCount.write(getpeoplesolved, courseConfigV2CustomModuleQuestionSource, RemoteActionCompatParcelizer(courseConfigV2SupportItem, false, false, 3));
    }
}
