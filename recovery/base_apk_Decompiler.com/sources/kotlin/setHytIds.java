package kotlin;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class setHytIds {
    public static final boolean AudioAttributesCompatParcelizer(getTestHeaderTitle gettestheadertitle) {
        toMagicModuleMetaRepoModel.write(gettestheadertitle, "");
        CourseConfigV2EditionSwitch courseConfigV2EditionSwitch = gettestheadertitle instanceof CourseConfigV2EditionSwitch ? (CourseConfigV2EditionSwitch) gettestheadertitle : null;
        if (courseConfigV2EditionSwitch == null || CourseConfigV2NavDrawerItemFaq.write(courseConfigV2EditionSwitch.onCustomAction())) {
            return false;
        }
        CourseConfigV2CustomModuleQuestionSource courseConfigV2CustomModuleQuestionSourceOnFastForward = courseConfigV2EditionSwitch.onFastForward();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(courseConfigV2CustomModuleQuestionSourceOnFastForward, "");
        if (getOption3.IconCompatParcelizer(courseConfigV2CustomModuleQuestionSourceOnFastForward) || getAnswerDescription.MediaBrowserCompatMediaItem(courseConfigV2EditionSwitch.onFastForward())) {
            return false;
        }
        List<getMeta> listAX_ = courseConfigV2EditionSwitch.aX_();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(listAX_, "");
        List<getMeta> list = listAX_;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            getLink getlinkOnPrepareFromMediaId = ((getMeta) it.next()).onPrepareFromMediaId();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getlinkOnPrepareFromMediaId, "");
            if (AudioAttributesCompatParcelizer(getlinkOnPrepareFromMediaId)) {
                return true;
            }
        }
        return false;
    }

    private static boolean read(getVariant getvariant) {
        toMagicModuleMetaRepoModel.write(getvariant, "");
        return getOption3.IconCompatParcelizer(getvariant) && !IconCompatParcelizer((CourseConfigV2CustomModuleQuestionSource) getvariant);
    }

    private static boolean RemoteActionCompatParcelizer(getLink getlink) {
        toMagicModuleMetaRepoModel.write(getlink, "");
        getQuestionLimit getquestionlimitRemoteActionCompatParcelizer = getlink.AudioAttributesImplApi21Parcelizer().RemoteActionCompatParcelizer();
        return getquestionlimitRemoteActionCompatParcelizer != null && read(getquestionlimitRemoteActionCompatParcelizer);
    }

    private static final boolean AudioAttributesCompatParcelizer(getLink getlink) {
        return RemoteActionCompatParcelizer(getlink) || write(getlink);
    }

    private static final boolean IconCompatParcelizer(CourseConfigV2CustomModuleQuestionSource courseConfigV2CustomModuleQuestionSource) {
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(setLocked.write(courseConfigV2CustomModuleQuestionSource), getZenArea.RatingCompat);
    }

    private static final boolean write(getLink getlink) {
        getQuestionLimit getquestionlimitRemoteActionCompatParcelizer = getlink.AudioAttributesImplApi21Parcelizer().RemoteActionCompatParcelizer();
        getBadgeText getbadgetext = getquestionlimitRemoteActionCompatParcelizer instanceof getBadgeText ? (getBadgeText) getquestionlimitRemoteActionCompatParcelizer : null;
        if (getbadgetext == null) {
            return false;
        }
        return AudioAttributesCompatParcelizer(getSearchTimes.IconCompatParcelizer(getbadgetext));
    }
}
