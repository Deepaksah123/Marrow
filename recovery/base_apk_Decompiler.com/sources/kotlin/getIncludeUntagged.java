package kotlin;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class getIncludeUntagged {
    public static final List<getMeta> read(Collection<? extends getLink> collection, Collection<? extends getMeta> collection2, getVideoPageNotesTitle getvideopagenotestitle) {
        getVideoPageNotesTitle getvideopagenotestitle2 = getvideopagenotestitle;
        toMagicModuleMetaRepoModel.write(collection, "");
        toMagicModuleMetaRepoModel.write(collection2, "");
        toMagicModuleMetaRepoModel.write(getvideopagenotestitle2, "");
        collection.size();
        collection2.size();
        List<Pair> listAudioAttributesImplApi26Parcelizer = IntermediateLoginResponseBody.AudioAttributesImplApi26Parcelizer(collection, collection2);
        ArrayList arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) listAudioAttributesImplApi26Parcelizer, 10));
        for (Pair pair : listAudioAttributesImplApi26Parcelizer) {
            getLink getlink = (getLink) pair.RemoteActionCompatParcelizer();
            getMeta getmeta = (getMeta) pair.read();
            int iOnCommand = getmeta.onCommand();
            getQuote getquoteRemoteActionCompatParcelizer = getmeta.RemoteActionCompatParcelizer();
            getRelatedLessonId getrelatedlessonidAQ_ = getmeta.aQ_();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getrelatedlessonidAQ_, "");
            boolean zIconCompatParcelizer = getmeta.IconCompatParcelizer();
            boolean zMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = getmeta.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
            boolean zOnMediaButtonEvent = getmeta.onMediaButtonEvent();
            getLink getlinkMediaDescriptionCompat = getmeta.handleMediaPlayPauseIfPendingOnHandler() != null ? setLocked.IconCompatParcelizer(getvideopagenotestitle2).write().MediaDescriptionCompat(getlink) : null;
            getIntroDurationSeconds getintrodurationsecondsRatingCompat = getmeta.RatingCompat();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getintrodurationsecondsRatingCompat, "");
            arrayList.add(new getLastHtmlBody(getvideopagenotestitle, null, iOnCommand, getquoteRemoteActionCompatParcelizer, getrelatedlessonidAQ_, getlink, zIconCompatParcelizer, zMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, zOnMediaButtonEvent, getlinkMediaDescriptionCompat, getintrodurationsecondsRatingCompat));
            getvideopagenotestitle2 = getvideopagenotestitle;
        }
        return arrayList;
    }

    public static final RecentUpdatesImageCreator AudioAttributesCompatParcelizer(CourseConfigV2CustomModuleQuestionSource courseConfigV2CustomModuleQuestionSource) {
        toMagicModuleMetaRepoModel.write(courseConfigV2CustomModuleQuestionSource, "");
        CourseConfigV2CustomModuleQuestionSource courseConfigV2CustomModuleQuestionSourceIconCompatParcelizer = setLocked.IconCompatParcelizer(courseConfigV2CustomModuleQuestionSource);
        if (courseConfigV2CustomModuleQuestionSourceIconCompatParcelizer == null) {
            return null;
        }
        setTags settagsMediaMetadataCompat = courseConfigV2CustomModuleQuestionSourceIconCompatParcelizer.MediaMetadataCompat();
        RecentUpdatesImageCreator recentUpdatesImageCreator = settagsMediaMetadataCompat instanceof RecentUpdatesImageCreator ? (RecentUpdatesImageCreator) settagsMediaMetadataCompat : null;
        return recentUpdatesImageCreator == null ? AudioAttributesCompatParcelizer(courseConfigV2CustomModuleQuestionSourceIconCompatParcelizer) : recentUpdatesImageCreator;
    }
}
