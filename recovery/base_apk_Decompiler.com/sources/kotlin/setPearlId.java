package kotlin;

import java.util.Iterator;
import java.util.Set;
import kotlin.getZenArea;
import kotlin.setActiveRecallQbankId;
import kotlin.setVideoId;

/* JADX INFO: loaded from: classes4.dex */
public final class setPearlId {
    public static final read AudioAttributesCompatParcelizer = new read(0);
    private static final Set<RevisionSubjectStatusModel> IconCompatParcelizer = getKycMessage.read(RevisionSubjectStatusModel.RemoteActionCompatParcelizer(getZenArea.RemoteActionCompatParcelizer.AudioAttributesImplApi21Parcelizer.MediaBrowserCompatItemReceiver()));
    private final getAnswerMap<IconCompatParcelizer, CourseConfigV2CustomModuleQuestionSource> RemoteActionCompatParcelizer;
    private final getPearlId write;

    public setPearlId(getPearlId getpearlid) {
        toMagicModuleMetaRepoModel.write(getpearlid, "");
        this.write = getpearlid;
        this.RemoteActionCompatParcelizer = getpearlid.onCustomAction().IconCompatParcelizer(new RemoteActionCompatParcelizer());
    }

    static final class RemoteActionCompatParcelizer extends MagicModuleUseCase implements getAnswerMap<IconCompatParcelizer, CourseConfigV2CustomModuleQuestionSource> {
        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public CourseConfigV2CustomModuleQuestionSource invoke(IconCompatParcelizer iconCompatParcelizer) {
            toMagicModuleMetaRepoModel.write(iconCompatParcelizer, "");
            return setPearlId.this.AudioAttributesCompatParcelizer(iconCompatParcelizer);
        }

        RemoteActionCompatParcelizer() {
            super(1);
        }
    }

    public static /* synthetic */ CourseConfigV2CustomModuleQuestionSource write(setPearlId setpearlid, RevisionSubjectStatusModel revisionSubjectStatusModel) {
        return setpearlid.RemoteActionCompatParcelizer(revisionSubjectStatusModel, null);
    }

    public final CourseConfigV2CustomModuleQuestionSource RemoteActionCompatParcelizer(RevisionSubjectStatusModel revisionSubjectStatusModel, isStep isstep) {
        toMagicModuleMetaRepoModel.write(revisionSubjectStatusModel, "");
        return this.RemoteActionCompatParcelizer.invoke(new IconCompatParcelizer(revisionSubjectStatusModel, isstep));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CourseConfigV2CustomModuleQuestionSource AudioAttributesCompatParcelizer(IconCompatParcelizer iconCompatParcelizer) {
        Object next;
        McqTimeSpent mcqTimeSpentRemoteActionCompatParcelizer;
        RevisionSubjectStatusModel revisionSubjectStatusModelWrite = iconCompatParcelizer.write();
        Iterator<getDocSideType> it = this.write.AudioAttributesImplApi26Parcelizer().iterator();
        while (it.hasNext()) {
            CourseConfigV2CustomModuleQuestionSource courseConfigV2CustomModuleQuestionSourceRemoteActionCompatParcelizer = it.next().RemoteActionCompatParcelizer(revisionSubjectStatusModelWrite);
            if (courseConfigV2CustomModuleQuestionSourceRemoteActionCompatParcelizer != null) {
                return courseConfigV2CustomModuleQuestionSourceRemoteActionCompatParcelizer;
            }
        }
        if (IconCompatParcelizer.contains(revisionSubjectStatusModelWrite)) {
            return null;
        }
        isStep isstepAudioAttributesCompatParcelizer = iconCompatParcelizer.AudioAttributesCompatParcelizer();
        if (isstepAudioAttributesCompatParcelizer == null && (isstepAudioAttributesCompatParcelizer = this.write.write().write(revisionSubjectStatusModelWrite)) == null) {
            return null;
        }
        setRatingCount setratingcountIconCompatParcelizer = isstepAudioAttributesCompatParcelizer.IconCompatParcelizer();
        setActiveRecallQbankId.RemoteActionCompatParcelizer remoteActionCompatParcelizerAudioAttributesCompatParcelizer = isstepAudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer();
        setPublishedTime setpublishedtimeWrite = isstepAudioAttributesCompatParcelizer.write();
        getIntroDurationSeconds getintrodurationsecondsRemoteActionCompatParcelizer = isstepAudioAttributesCompatParcelizer.RemoteActionCompatParcelizer();
        RevisionSubjectStatusModel revisionSubjectStatusModelWrite2 = revisionSubjectStatusModelWrite.write();
        if (revisionSubjectStatusModelWrite2 != null) {
            CourseConfigV2CustomModuleQuestionSource courseConfigV2CustomModuleQuestionSourceWrite = write(this, revisionSubjectStatusModelWrite2);
            SchemaItem schemaItem = courseConfigV2CustomModuleQuestionSourceWrite instanceof SchemaItem ? (SchemaItem) courseConfigV2CustomModuleQuestionSourceWrite : null;
            if (schemaItem == null) {
                return null;
            }
            getRelatedLessonId getrelatedlessonidAudioAttributesImplApi26Parcelizer = revisionSubjectStatusModelWrite.AudioAttributesImplApi26Parcelizer();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getrelatedlessonidAudioAttributesImplApi26Parcelizer, "");
            if (!schemaItem.write(getrelatedlessonidAudioAttributesImplApi26Parcelizer)) {
                return null;
            }
            mcqTimeSpentRemoteActionCompatParcelizer = schemaItem.write();
        } else {
            CourseConfigV2PracticalItems courseConfigV2PracticalItemsMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = this.write.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
            getNotesCount getnotescountRemoteActionCompatParcelizer = revisionSubjectStatusModelWrite.RemoteActionCompatParcelizer();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getnotescountRemoteActionCompatParcelizer, "");
            Iterator<T> it2 = getSubjectPrefix.AudioAttributesCompatParcelizer(courseConfigV2PracticalItemsMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, getnotescountRemoteActionCompatParcelizer).iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
                getShouldShowEmptyPlanScreen getshouldshowemptyplanscreen = (getShouldShowEmptyPlanScreen) next;
                if (!(getshouldshowemptyplanscreen instanceof QaPair)) {
                    break;
                }
                getRelatedLessonId getrelatedlessonidAudioAttributesImplApi26Parcelizer2 = revisionSubjectStatusModelWrite.AudioAttributesImplApi26Parcelizer();
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getrelatedlessonidAudioAttributesImplApi26Parcelizer2, "");
                if (((QaPair) getshouldshowemptyplanscreen).AudioAttributesCompatParcelizer(getrelatedlessonidAudioAttributesImplApi26Parcelizer2)) {
                    break;
                }
            }
            getShouldShowEmptyPlanScreen getshouldshowemptyplanscreen2 = (getShouldShowEmptyPlanScreen) next;
            if (getshouldshowemptyplanscreen2 == null) {
                return null;
            }
            getPearlId getpearlid = this.write;
            setActiveRecallQbankId.onAddQueueItem onaddqueueitemOnPrepareFromUri = remoteActionCompatParcelizerAudioAttributesCompatParcelizer.onPrepareFromUri();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(onaddqueueitemOnPrepareFromUri, "");
            setTagActive settagactive = new setTagActive(onaddqueueitemOnPrepareFromUri);
            setVideoId.IconCompatParcelizer iconCompatParcelizer2 = setVideoId.AudioAttributesCompatParcelizer;
            setActiveRecallQbankId.onPlay onplayOnSeekTo = remoteActionCompatParcelizerAudioAttributesCompatParcelizer.onSeekTo();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(onplayOnSeekTo, "");
            mcqTimeSpentRemoteActionCompatParcelizer = getpearlid.RemoteActionCompatParcelizer(getshouldshowemptyplanscreen2, setratingcountIconCompatParcelizer, settagactive, setVideoId.IconCompatParcelizer.RemoteActionCompatParcelizer(onplayOnSeekTo), setpublishedtimeWrite, null);
        }
        return new SchemaItem(mcqTimeSpentRemoteActionCompatParcelizer, remoteActionCompatParcelizerAudioAttributesCompatParcelizer, setratingcountIconCompatParcelizer, setpublishedtimeWrite, getintrodurationsecondsRemoteActionCompatParcelizer);
    }

    static final class IconCompatParcelizer {
        private final isStep RemoteActionCompatParcelizer;
        private final RevisionSubjectStatusModel write;

        public IconCompatParcelizer(RevisionSubjectStatusModel revisionSubjectStatusModel, isStep isstep) {
            toMagicModuleMetaRepoModel.write(revisionSubjectStatusModel, "");
            this.write = revisionSubjectStatusModel;
            this.RemoteActionCompatParcelizer = isstep;
        }

        public final isStep AudioAttributesCompatParcelizer() {
            return this.RemoteActionCompatParcelizer;
        }

        public final RevisionSubjectStatusModel write() {
            return this.write;
        }

        public final boolean equals(Object obj) {
            return (obj instanceof IconCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.write, ((IconCompatParcelizer) obj).write);
        }

        public final int hashCode() {
            return this.write.hashCode();
        }
    }

    public static final class read {
        private read() {
        }

        public static Set<RevisionSubjectStatusModel> AudioAttributesCompatParcelizer() {
            return setPearlId.IconCompatParcelizer;
        }

        public /* synthetic */ read(byte b) {
            this();
        }
    }
}
