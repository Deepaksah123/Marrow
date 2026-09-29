package kotlin;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.setActiveRecallQbankId;
import kotlin.setVideoId;

/* JADX INFO: loaded from: classes4.dex */
public final class getAttempted extends SchemaDetailLesson {
    private final getShouldShowEmptyPlanScreen AudioAttributesCompatParcelizer;
    private final String RemoteActionCompatParcelizer;
    private final getNotesCount write;

    @Override // kotlin.setStatusUpdateEndTimeMs, kotlin.getMcqContentBody
    public final /* synthetic */ Collection read(setOption6AnsweredCount setoption6answeredcount, getAnswerMap getanswermap) {
        return RemoteActionCompatParcelizer(setoption6answeredcount, (getAnswerMap<? super getRelatedLessonId, Boolean>) getanswermap);
    }

    public getAttempted(getShouldShowEmptyPlanScreen getshouldshowemptyplanscreen, setActiveRecallQbankId.RatingCompat ratingCompat, setRatingCount setratingcount, setPublishedTime setpublishedtime, setQuestions setquestions, getPearlId getpearlid, String str, getCreatedOnDateMs<? extends Collection<getRelatedLessonId>> getcreatedondatems) {
        toMagicModuleMetaRepoModel.write(getshouldshowemptyplanscreen, "");
        toMagicModuleMetaRepoModel.write(ratingCompat, "");
        toMagicModuleMetaRepoModel.write(setratingcount, "");
        toMagicModuleMetaRepoModel.write(setpublishedtime, "");
        toMagicModuleMetaRepoModel.write(getpearlid, "");
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(getcreatedondatems, "");
        setActiveRecallQbankId.onAddQueueItem onaddqueueitemAudioAttributesImplBaseParcelizer = ratingCompat.AudioAttributesImplBaseParcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(onaddqueueitemAudioAttributesImplBaseParcelizer, "");
        setTagActive settagactive = new setTagActive(onaddqueueitemAudioAttributesImplBaseParcelizer);
        setVideoId.IconCompatParcelizer iconCompatParcelizer = setVideoId.AudioAttributesCompatParcelizer;
        setActiveRecallQbankId.onPlay onplayMediaBrowserCompatItemReceiver = ratingCompat.MediaBrowserCompatItemReceiver();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(onplayMediaBrowserCompatItemReceiver, "");
        McqTimeSpent mcqTimeSpentRemoteActionCompatParcelizer = getpearlid.RemoteActionCompatParcelizer(getshouldshowemptyplanscreen, setratingcount, settagactive, setVideoId.IconCompatParcelizer.RemoteActionCompatParcelizer(onplayMediaBrowserCompatItemReceiver), setpublishedtime, setquestions);
        List<setActiveRecallQbankId.AudioAttributesImplApi26Parcelizer> listWrite = ratingCompat.write();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(listWrite, "");
        List<setActiveRecallQbankId.MediaBrowserCompatMediaItem> listRemoteActionCompatParcelizer = ratingCompat.RemoteActionCompatParcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(listRemoteActionCompatParcelizer, "");
        List<setActiveRecallQbankId.onCommand> listIconCompatParcelizer = ratingCompat.IconCompatParcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(listIconCompatParcelizer, "");
        super(mcqTimeSpentRemoteActionCompatParcelizer, listWrite, listRemoteActionCompatParcelizer, listIconCompatParcelizer, getcreatedondatems);
        this.AudioAttributesCompatParcelizer = getshouldshowemptyplanscreen;
        this.RemoteActionCompatParcelizer = str;
        this.write = getshouldshowemptyplanscreen.IconCompatParcelizer();
    }

    private List<getVariant> RemoteActionCompatParcelizer(setOption6AnsweredCount setoption6answeredcount, getAnswerMap<? super getRelatedLessonId, Boolean> getanswermap) {
        toMagicModuleMetaRepoModel.write(setoption6answeredcount, "");
        toMagicModuleMetaRepoModel.write(getanswermap, "");
        Collection<getVariant> collection = read(setoption6answeredcount, getanswermap, isCollapsible.WHEN_GET_ALL_DESCRIPTORS);
        Iterable<getDocSideType> iterableAudioAttributesImplApi26Parcelizer = AudioAttributesImplApi21Parcelizer().AudioAttributesCompatParcelizer().AudioAttributesImplApi26Parcelizer();
        ArrayList arrayList = new ArrayList();
        Iterator<getDocSideType> it = iterableAudioAttributesImplApi26Parcelizer.iterator();
        while (it.hasNext()) {
            IntermediateLoginResponseBody.IconCompatParcelizer((Collection) arrayList, (Iterable) it.next().write(this.write));
        }
        return IntermediateLoginResponseBody.AudioAttributesCompatParcelizer((Collection) collection, (Iterable) arrayList);
    }

    @Override // kotlin.SchemaDetailLesson
    protected final boolean RemoteActionCompatParcelizer(getRelatedLessonId getrelatedlessonid) {
        toMagicModuleMetaRepoModel.write(getrelatedlessonid, "");
        if (super.RemoteActionCompatParcelizer(getrelatedlessonid)) {
            return true;
        }
        Iterable<getDocSideType> iterableAudioAttributesImplApi26Parcelizer = AudioAttributesImplApi21Parcelizer().AudioAttributesCompatParcelizer().AudioAttributesImplApi26Parcelizer();
        if ((iterableAudioAttributesImplApi26Parcelizer instanceof Collection) && ((Collection) iterableAudioAttributesImplApi26Parcelizer).isEmpty()) {
            return false;
        }
        Iterator<getDocSideType> it = iterableAudioAttributesImplApi26Parcelizer.iterator();
        while (it.hasNext()) {
            if (it.next().AudioAttributesCompatParcelizer(this.write, getrelatedlessonid)) {
                return true;
            }
        }
        return false;
    }

    @Override // kotlin.SchemaDetailLesson
    protected final RevisionSubjectStatusModel AudioAttributesCompatParcelizer(getRelatedLessonId getrelatedlessonid) {
        toMagicModuleMetaRepoModel.write(getrelatedlessonid, "");
        return new RevisionSubjectStatusModel(this.write, getrelatedlessonid);
    }

    @Override // kotlin.SchemaDetailLesson, kotlin.setStatusUpdateEndTimeMs, kotlin.getMcqContentBody
    public final getQuestionLimit AudioAttributesCompatParcelizer(getRelatedLessonId getrelatedlessonid, getTimeStamp gettimestamp) {
        toMagicModuleMetaRepoModel.write(getrelatedlessonid, "");
        toMagicModuleMetaRepoModel.write(gettimestamp, "");
        RemoteActionCompatParcelizer(getrelatedlessonid, gettimestamp);
        return super.AudioAttributesCompatParcelizer(getrelatedlessonid, gettimestamp);
    }

    @Override // kotlin.setStatusUpdateEndTimeMs, kotlin.getMcqContentBody
    public final void RemoteActionCompatParcelizer(getRelatedLessonId getrelatedlessonid, getTimeStamp gettimestamp) {
        toMagicModuleMetaRepoModel.write(getrelatedlessonid, "");
        toMagicModuleMetaRepoModel.write(gettimestamp, "");
        Section.read(AudioAttributesImplApi21Parcelizer().AudioAttributesCompatParcelizer().MediaBrowserCompatSearchResultReceiver(), gettimestamp, this.AudioAttributesCompatParcelizer, getrelatedlessonid);
    }

    @Override // kotlin.SchemaDetailLesson
    protected final Set<getRelatedLessonId> IconCompatParcelizer() {
        return getKycMessage.read();
    }

    @Override // kotlin.SchemaDetailLesson
    protected final Set<getRelatedLessonId> MediaBrowserCompatCustomActionResultReceiver() {
        return getKycMessage.read();
    }

    @Override // kotlin.SchemaDetailLesson
    protected final Set<getRelatedLessonId> write() {
        return getKycMessage.read();
    }

    public final String toString() {
        return this.RemoteActionCompatParcelizer;
    }

    @Override // kotlin.SchemaDetailLesson
    protected final void AudioAttributesCompatParcelizer(Collection<getVariant> collection, getAnswerMap<? super getRelatedLessonId, Boolean> getanswermap) {
        toMagicModuleMetaRepoModel.write(collection, "");
        toMagicModuleMetaRepoModel.write(getanswermap, "");
    }
}
