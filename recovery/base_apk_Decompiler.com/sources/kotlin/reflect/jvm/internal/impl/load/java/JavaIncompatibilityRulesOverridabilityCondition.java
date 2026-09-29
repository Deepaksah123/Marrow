package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.List;
import kotlin.CourseConfigV2CustomModuleQuestionSource;
import kotlin.CourseConfigV2NavDrawerItemRateUs;
import kotlin.IntermediateLoginResponseBody;
import kotlin.NestfgetmEditorDetail;
import kotlin.Pair;
import kotlin.getHighYieldIds;
import kotlin.getInviteCode;
import kotlin.getLink;
import kotlin.getMeta;
import kotlin.getModuleOwner;
import kotlin.getPublishedTime;
import kotlin.getQuestionLimit;
import kotlin.getRelatedLessonId;
import kotlin.getSearchTimes;
import kotlin.getTestHeaderTitle;
import kotlin.getTestTabItems;
import kotlin.getVariant;
import kotlin.getVideoPageNotesTitle;
import kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition;
import kotlin.setLocked;
import kotlin.setStartDateTime;
import kotlin.setUserInitiatedExamStartedOn;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes4.dex */
public final class JavaIncompatibilityRulesOverridabilityCondition implements ExternalOverridabilityCondition {
    public static final IconCompatParcelizer Companion = new IconCompatParcelizer(0);

    @Override // kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition
    public final ExternalOverridabilityCondition.read isOverridable(getVideoPageNotesTitle getvideopagenotestitle, getVideoPageNotesTitle getvideopagenotestitle2, CourseConfigV2CustomModuleQuestionSource courseConfigV2CustomModuleQuestionSource) {
        toMagicModuleMetaRepoModel.write(getvideopagenotestitle, "");
        toMagicModuleMetaRepoModel.write(getvideopagenotestitle2, "");
        if (AudioAttributesCompatParcelizer(getvideopagenotestitle, getvideopagenotestitle2, courseConfigV2CustomModuleQuestionSource)) {
            return ExternalOverridabilityCondition.read.INCOMPATIBLE;
        }
        if (Companion.AudioAttributesCompatParcelizer(getvideopagenotestitle, getvideopagenotestitle2)) {
            return ExternalOverridabilityCondition.read.INCOMPATIBLE;
        }
        return ExternalOverridabilityCondition.read.UNKNOWN;
    }

    private static boolean AudioAttributesCompatParcelizer(getVideoPageNotesTitle getvideopagenotestitle, getVideoPageNotesTitle getvideopagenotestitle2, CourseConfigV2CustomModuleQuestionSource courseConfigV2CustomModuleQuestionSource) {
        if ((getvideopagenotestitle instanceof getTestHeaderTitle) && (getvideopagenotestitle2 instanceof CourseConfigV2NavDrawerItemRateUs) && !getTestTabItems.RemoteActionCompatParcelizer(getvideopagenotestitle2)) {
            NestfgetmEditorDetail nestfgetmEditorDetail = NestfgetmEditorDetail.AudioAttributesCompatParcelizer;
            CourseConfigV2NavDrawerItemRateUs courseConfigV2NavDrawerItemRateUs = (CourseConfigV2NavDrawerItemRateUs) getvideopagenotestitle2;
            getRelatedLessonId getrelatedlessonidAQ_ = courseConfigV2NavDrawerItemRateUs.aQ_();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getrelatedlessonidAQ_, "");
            if (!NestfgetmEditorDetail.write(getrelatedlessonidAQ_)) {
                getInviteCode.RemoteActionCompatParcelizer remoteActionCompatParcelizer = getInviteCode.IconCompatParcelizer;
                getRelatedLessonId getrelatedlessonidAQ_2 = courseConfigV2NavDrawerItemRateUs.aQ_();
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getrelatedlessonidAQ_2, "");
                if (!getInviteCode.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(getrelatedlessonidAQ_2)) {
                    return false;
                }
            }
            getTestHeaderTitle gettestheadertitleIconCompatParcelizer = getModuleOwner.IconCompatParcelizer((getTestHeaderTitle) getvideopagenotestitle);
            boolean z = getvideopagenotestitle instanceof CourseConfigV2NavDrawerItemRateUs;
            CourseConfigV2NavDrawerItemRateUs courseConfigV2NavDrawerItemRateUs2 = z ? (CourseConfigV2NavDrawerItemRateUs) getvideopagenotestitle : null;
            if ((courseConfigV2NavDrawerItemRateUs2 != null && courseConfigV2NavDrawerItemRateUs.onPlayFromUri() == courseConfigV2NavDrawerItemRateUs2.onPlayFromUri()) || (gettestheadertitleIconCompatParcelizer != null && courseConfigV2NavDrawerItemRateUs.onPlayFromUri())) {
                if ((courseConfigV2CustomModuleQuestionSource instanceof setStartDateTime) && courseConfigV2NavDrawerItemRateUs.onPlayFromSearch() == null && gettestheadertitleIconCompatParcelizer != null && !getModuleOwner.IconCompatParcelizer(courseConfigV2CustomModuleQuestionSource, gettestheadertitleIconCompatParcelizer)) {
                    if ((gettestheadertitleIconCompatParcelizer instanceof CourseConfigV2NavDrawerItemRateUs) && z && NestfgetmEditorDetail.write((CourseConfigV2NavDrawerItemRateUs) gettestheadertitleIconCompatParcelizer) != null) {
                        String strRemoteActionCompatParcelizer = getPublishedTime.RemoteActionCompatParcelizer(courseConfigV2NavDrawerItemRateUs, false, false, 2);
                        CourseConfigV2NavDrawerItemRateUs courseConfigV2NavDrawerItemRateUsOnPrepareFromMediaId = ((CourseConfigV2NavDrawerItemRateUs) getvideopagenotestitle).onPrepareFromMediaId();
                        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(courseConfigV2NavDrawerItemRateUsOnPrepareFromMediaId, "");
                        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) strRemoteActionCompatParcelizer, (Object) getPublishedTime.RemoteActionCompatParcelizer(courseConfigV2NavDrawerItemRateUsOnPrepareFromMediaId, false, false, 2))) {
                            return false;
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition
    public final ExternalOverridabilityCondition.IconCompatParcelizer getContract() {
        return ExternalOverridabilityCondition.IconCompatParcelizer.CONFLICTS_ONLY;
    }

    public static final class IconCompatParcelizer {
        private IconCompatParcelizer() {
        }

        public final boolean AudioAttributesCompatParcelizer(getVideoPageNotesTitle getvideopagenotestitle, getVideoPageNotesTitle getvideopagenotestitle2) {
            toMagicModuleMetaRepoModel.write(getvideopagenotestitle, "");
            toMagicModuleMetaRepoModel.write(getvideopagenotestitle2, "");
            if (!(getvideopagenotestitle2 instanceof setUserInitiatedExamStartedOn) || !(getvideopagenotestitle instanceof CourseConfigV2NavDrawerItemRateUs)) {
                return false;
            }
            setUserInitiatedExamStartedOn setuserinitiatedexamstartedon = (setUserInitiatedExamStartedOn) getvideopagenotestitle2;
            setuserinitiatedexamstartedon.aX_().size();
            CourseConfigV2NavDrawerItemRateUs courseConfigV2NavDrawerItemRateUs = (CourseConfigV2NavDrawerItemRateUs) getvideopagenotestitle;
            courseConfigV2NavDrawerItemRateUs.aX_().size();
            List<getMeta> listAX_ = setuserinitiatedexamstartedon.MediaBrowserCompatItemReceiver().aX_();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(listAX_, "");
            List<getMeta> listAX_2 = courseConfigV2NavDrawerItemRateUs.onPrepareFromMediaId().aX_();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(listAX_2, "");
            for (Pair pair : IntermediateLoginResponseBody.AudioAttributesImplApi26Parcelizer(listAX_, listAX_2)) {
                getMeta getmeta = (getMeta) pair.RemoteActionCompatParcelizer();
                getMeta getmeta2 = (getMeta) pair.read();
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getmeta, "");
                boolean z = write((CourseConfigV2NavDrawerItemRateUs) getvideopagenotestitle2, getmeta) instanceof getHighYieldIds.RemoteActionCompatParcelizer;
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getmeta2, "");
                if (z != (write(courseConfigV2NavDrawerItemRateUs, getmeta2) instanceof getHighYieldIds.RemoteActionCompatParcelizer)) {
                    return true;
                }
            }
            return false;
        }

        private static getHighYieldIds write(CourseConfigV2NavDrawerItemRateUs courseConfigV2NavDrawerItemRateUs, getMeta getmeta) {
            if (getPublishedTime.read(courseConfigV2NavDrawerItemRateUs) || AudioAttributesCompatParcelizer(courseConfigV2NavDrawerItemRateUs)) {
                getLink getlinkOnPrepareFromMediaId = getmeta.onPrepareFromMediaId();
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getlinkOnPrepareFromMediaId, "");
                return getPublishedTime.RemoteActionCompatParcelizer(getSearchTimes.MediaBrowserCompatMediaItem(getlinkOnPrepareFromMediaId));
            }
            getLink getlinkOnPrepareFromMediaId2 = getmeta.onPrepareFromMediaId();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getlinkOnPrepareFromMediaId2, "");
            return getPublishedTime.RemoteActionCompatParcelizer(getlinkOnPrepareFromMediaId2);
        }

        private static boolean AudioAttributesCompatParcelizer(CourseConfigV2NavDrawerItemRateUs courseConfigV2NavDrawerItemRateUs) {
            if (courseConfigV2NavDrawerItemRateUs.aX_().size() != 1) {
                return false;
            }
            getVariant getvariantOnPlayFromMediaId = courseConfigV2NavDrawerItemRateUs.onPlayFromMediaId();
            CourseConfigV2CustomModuleQuestionSource courseConfigV2CustomModuleQuestionSource = getvariantOnPlayFromMediaId instanceof CourseConfigV2CustomModuleQuestionSource ? (CourseConfigV2CustomModuleQuestionSource) getvariantOnPlayFromMediaId : null;
            if (courseConfigV2CustomModuleQuestionSource == null) {
                return false;
            }
            List<getMeta> listAX_ = courseConfigV2NavDrawerItemRateUs.aX_();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(listAX_, "");
            getQuestionLimit getquestionlimitRemoteActionCompatParcelizer = ((getMeta) IntermediateLoginResponseBody.onCommand((List) listAX_)).onPrepareFromMediaId().AudioAttributesImplApi21Parcelizer().RemoteActionCompatParcelizer();
            CourseConfigV2CustomModuleQuestionSource courseConfigV2CustomModuleQuestionSource2 = getquestionlimitRemoteActionCompatParcelizer instanceof CourseConfigV2CustomModuleQuestionSource ? (CourseConfigV2CustomModuleQuestionSource) getquestionlimitRemoteActionCompatParcelizer : null;
            return courseConfigV2CustomModuleQuestionSource2 != null && getTestTabItems.read(courseConfigV2CustomModuleQuestionSource) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(setLocked.write(courseConfigV2CustomModuleQuestionSource), setLocked.write(courseConfigV2CustomModuleQuestionSource2));
        }

        public /* synthetic */ IconCompatParcelizer(byte b) {
            this();
        }
    }
}
