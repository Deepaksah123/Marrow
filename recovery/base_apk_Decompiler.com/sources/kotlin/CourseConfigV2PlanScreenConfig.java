package kotlin;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.getQuote;
import kotlin.setTags;

/* JADX INFO: loaded from: classes4.dex */
public final class CourseConfigV2PlanScreenConfig {
    private final getMini AudioAttributesCompatParcelizer;
    private final getListOfLessonCompletions<getNotesCount, getShouldShowEmptyPlanScreen> RemoteActionCompatParcelizer;
    private final getListOfLessonCompletions<RemoteActionCompatParcelizer, CourseConfigV2CustomModuleQuestionSource> read;
    private final getTopSection write;

    public CourseConfigV2PlanScreenConfig(getMini getmini, getTopSection gettopsection) {
        toMagicModuleMetaRepoModel.write(getmini, "");
        toMagicModuleMetaRepoModel.write(gettopsection, "");
        this.AudioAttributesCompatParcelizer = getmini;
        this.write = gettopsection;
        this.RemoteActionCompatParcelizer = getmini.AudioAttributesCompatParcelizer(new AudioAttributesCompatParcelizer());
        this.read = getmini.AudioAttributesCompatParcelizer(new write());
    }

    static final class RemoteActionCompatParcelizer {
        private final List<Integer> AudioAttributesCompatParcelizer;
        private final RevisionSubjectStatusModel write;

        public RemoteActionCompatParcelizer(RevisionSubjectStatusModel revisionSubjectStatusModel, List<Integer> list) {
            toMagicModuleMetaRepoModel.write(revisionSubjectStatusModel, "");
            toMagicModuleMetaRepoModel.write(list, "");
            this.write = revisionSubjectStatusModel;
            this.AudioAttributesCompatParcelizer = list;
        }

        public final RevisionSubjectStatusModel read() {
            return this.write;
        }

        public final List<Integer> IconCompatParcelizer() {
            return this.AudioAttributesCompatParcelizer;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RemoteActionCompatParcelizer)) {
                return false;
            }
            RemoteActionCompatParcelizer remoteActionCompatParcelizer = (RemoteActionCompatParcelizer) obj;
            return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.write, remoteActionCompatParcelizer.write) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, remoteActionCompatParcelizer.AudioAttributesCompatParcelizer);
        }

        public final int hashCode() {
            return (this.write.hashCode() * 31) + this.AudioAttributesCompatParcelizer.hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ClassRequest(classId=");
            sb.append(this.write);
            sb.append(", typeParametersCount=");
            sb.append(this.AudioAttributesCompatParcelizer);
            sb.append(')');
            return sb.toString();
        }
    }

    static final class AudioAttributesCompatParcelizer extends MagicModuleUseCase implements getAnswerMap<getNotesCount, getShouldShowEmptyPlanScreen> {
        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public getShouldShowEmptyPlanScreen invoke(getNotesCount getnotescount) {
            toMagicModuleMetaRepoModel.write(getnotescount, "");
            return new getDoubleMap(CourseConfigV2PlanScreenConfig.this.write, getnotescount);
        }

        AudioAttributesCompatParcelizer() {
            super(1);
        }
    }

    static final class write extends MagicModuleUseCase implements getAnswerMap<RemoteActionCompatParcelizer, CourseConfigV2CustomModuleQuestionSource> {
        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public CourseConfigV2CustomModuleQuestionSource invoke(RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
            CourseConfigV2CustomModuleQuestionSource courseConfigV2CustomModuleQuestionSource;
            CourseConfigV2CustomModuleQuestionSource courseConfigV2CustomModuleQuestionSourceAudioAttributesCompatParcelizer;
            toMagicModuleMetaRepoModel.write(remoteActionCompatParcelizer, "");
            RevisionSubjectStatusModel revisionSubjectStatusModel = remoteActionCompatParcelizer.read();
            List<Integer> listIconCompatParcelizer = remoteActionCompatParcelizer.IconCompatParcelizer();
            if (revisionSubjectStatusModel.AudioAttributesImplApi21Parcelizer()) {
                throw new UnsupportedOperationException("Unresolved local class: ".concat(String.valueOf(revisionSubjectStatusModel)));
            }
            RevisionSubjectStatusModel revisionSubjectStatusModelWrite = revisionSubjectStatusModel.write();
            if (revisionSubjectStatusModelWrite == null || (courseConfigV2CustomModuleQuestionSourceAudioAttributesCompatParcelizer = CourseConfigV2PlanScreenConfig.this.AudioAttributesCompatParcelizer(revisionSubjectStatusModelWrite, IntermediateLoginResponseBody.IconCompatParcelizer((Iterable) listIconCompatParcelizer, 1))) == null) {
                getListOfLessonCompletions getlistoflessoncompletions = CourseConfigV2PlanScreenConfig.this.RemoteActionCompatParcelizer;
                getNotesCount getnotescountRemoteActionCompatParcelizer = revisionSubjectStatusModel.RemoteActionCompatParcelizer();
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getnotescountRemoteActionCompatParcelizer, "");
                courseConfigV2CustomModuleQuestionSource = (getCategory) getlistoflessoncompletions.invoke(getnotescountRemoteActionCompatParcelizer);
            } else {
                courseConfigV2CustomModuleQuestionSource = courseConfigV2CustomModuleQuestionSourceAudioAttributesCompatParcelizer;
            }
            boolean zAudioAttributesImplBaseParcelizer = revisionSubjectStatusModel.AudioAttributesImplBaseParcelizer();
            getMini getmini = CourseConfigV2PlanScreenConfig.this.AudioAttributesCompatParcelizer;
            getCategory getcategory = courseConfigV2CustomModuleQuestionSource;
            getRelatedLessonId getrelatedlessonidAudioAttributesImplApi26Parcelizer = revisionSubjectStatusModel.AudioAttributesImplApi26Parcelizer();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getrelatedlessonidAudioAttributesImplApi26Parcelizer, "");
            Integer num = (Integer) IntermediateLoginResponseBody.MediaBrowserCompatSearchResultReceiver((List) listIconCompatParcelizer);
            return new IconCompatParcelizer(getmini, getcategory, getrelatedlessonidAudioAttributesImplApi26Parcelizer, zAudioAttributesImplBaseParcelizer, num != null ? num.intValue() : 0);
        }

        write() {
            super(1);
        }
    }

    public static final class IconCompatParcelizer extends toMap {
        private final boolean AudioAttributesCompatParcelizer;
        private final setSubjectIds read;
        private final List<getBadgeText> write;

        @Override // kotlin.CourseConfigV2CustomModuleQuestionSource
        public final CourseConfigV2CustomModuleQuestionSource AudioAttributesCompatParcelizer() {
            return null;
        }

        @Override // kotlin.CourseConfigV2CustomModuleQuestionSource
        public final CourseConfigV2ZenAreaItem<getHref> MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
            return null;
        }

        @Override // kotlin.CourseConfigV2CustomModuleQuestionSource
        public final CourseConfigV2EditionSwitch handleMediaPlayPauseIfPendingOnHandler() {
            return null;
        }

        @Override // kotlin.CourseConfigV2CustomModuleQuestionSource
        public final boolean onAddQueueItem() {
            return false;
        }

        @Override // kotlin.CourseConfigV2NavDrawerItemYourCourse
        public final boolean onCommand() {
            return false;
        }

        @Override // kotlin.CourseConfigV2CustomModuleQuestionSource
        public final boolean onFastForward() {
            return false;
        }

        @Override // kotlin.toMap, kotlin.CourseConfigV2NavDrawerItemYourCourse
        public final boolean onMediaButtonEvent() {
            return false;
        }

        @Override // kotlin.CourseConfigV2NavDrawerItemYourCourse
        public final boolean onPause() {
            return false;
        }

        @Override // kotlin.CourseConfigV2CustomModuleQuestionSource
        public final boolean onPlay() {
            return false;
        }

        @Override // kotlin.CourseConfigV2CustomModuleQuestionSource
        public final boolean onPlayFromMediaId() {
            return false;
        }

        @Override // kotlin.CourseConfigV2CustomModuleQuestionSource
        public final boolean onPlayFromUri() {
            return false;
        }

        @Override // kotlin.getStringArrayMap
        public final /* synthetic */ setTags IconCompatParcelizer(getCheapestPlan getcheapestplan) {
            return write(getcheapestplan);
        }

        @Override // kotlin.CourseConfigV2CustomModuleQuestionSource
        public final /* synthetic */ setTags MediaMetadataCompat() {
            return write();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IconCompatParcelizer(getMini getmini, getVariant getvariant, getRelatedLessonId getrelatedlessonid, boolean z, int i) {
            super(getmini, getvariant, getrelatedlessonid, getIntroDurationSeconds.AudioAttributesCompatParcelizer, false);
            toMagicModuleMetaRepoModel.write(getmini, "");
            toMagicModuleMetaRepoModel.write(getvariant, "");
            toMagicModuleMetaRepoModel.write(getrelatedlessonid, "");
            this.AudioAttributesCompatParcelizer = z;
            newEncryptedObject newencryptedobjectIconCompatParcelizer = getQues.IconCompatParcelizer(0, i);
            ArrayList arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer(newencryptedobjectIconCompatParcelizer, 10));
            Iterator<Integer> it = newencryptedobjectIconCompatParcelizer.iterator();
            while (it.hasNext()) {
                int iRemoteActionCompatParcelizer = ((getSINGLE_SYNC_RESULT) it).RemoteActionCompatParcelizer();
                getQuote.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = getQuote.IconCompatParcelizer;
                arrayList.add(getWrongCount.IconCompatParcelizer(this, getQuote.AudioAttributesCompatParcelizer.read(), getTotalSubject.INVARIANT, getRelatedLessonId.RemoteActionCompatParcelizer("T".concat(String.valueOf(iRemoteActionCompatParcelizer))), iRemoteActionCompatParcelizer, getmini));
            }
            this.write = arrayList;
            this.read = new setSubjectIds(this, CourseResponseKeyConstantsKt.IconCompatParcelizer(this), getKycMessage.read(setLocked.IconCompatParcelizer((getVariant) this).write().write()), getmini);
        }

        @Override // kotlin.CourseConfigV2CustomModuleQuestionSource
        public final getQuestionSource AudioAttributesImplBaseParcelizer() {
            return getQuestionSource.CLASS;
        }

        @Override // kotlin.CourseConfigV2CustomModuleQuestionSource, kotlin.CourseConfigV2NavDrawerItemYourCourse
        public final CourseConfigV2NavDrawerItems MediaBrowserCompatMediaItem() {
            return CourseConfigV2NavDrawerItems.FINAL;
        }

        @Override // kotlin.CourseConfigV2CustomModuleQuestionSource, kotlin.CourseConfigV2NavDrawerItemYourCourse, kotlin.getSubText
        public final CourseConfigV2NavDrawerItemFreeExtension onCustomAction() {
            CourseConfigV2NavDrawerItemFreeExtension courseConfigV2NavDrawerItemFreeExtension = CourseConfigV2NavDrawerItemFaq.MediaBrowserCompatMediaItem;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(courseConfigV2NavDrawerItemFreeExtension, "");
            return courseConfigV2NavDrawerItemFreeExtension;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getQuestionLimit
        /* JADX INFO: renamed from: onPrepareFromUri, reason: merged with bridge method [inline-methods] */
        public setSubjectIds MediaBrowserCompatSearchResultReceiver() {
            return this.read;
        }

        @Override // kotlin.CourseConfigV2CustomModuleQuestionSource, kotlin.getBadge
        public final List<getBadgeText> MediaBrowserCompatItemReceiver() {
            return this.write;
        }

        @Override // kotlin.getBadge
        public final boolean onPrepareFromSearch() {
            return this.AudioAttributesCompatParcelizer;
        }

        @Override // kotlin.fromJSONArray
        public final getQuote RemoteActionCompatParcelizer() {
            getQuote.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = getQuote.IconCompatParcelizer;
            return getQuote.AudioAttributesCompatParcelizer.read();
        }

        private static setTags.write write(getCheapestPlan getcheapestplan) {
            toMagicModuleMetaRepoModel.write(getcheapestplan, "");
            return setTags.write.RemoteActionCompatParcelizer;
        }

        private static setTags.write write() {
            return setTags.write.RemoteActionCompatParcelizer;
        }

        @Override // kotlin.CourseConfigV2CustomModuleQuestionSource
        public final Collection<CourseConfigV2EditionSwitch> MediaBrowserCompatCustomActionResultReceiver() {
            return getKycMessage.read();
        }

        @Override // kotlin.CourseConfigV2CustomModuleQuestionSource
        public final Collection<CourseConfigV2CustomModuleQuestionSource> MediaDescriptionCompat() {
            return IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("class ");
            sb.append(aQ_());
            sb.append(" (not found)");
            return sb.toString();
        }
    }

    public final CourseConfigV2CustomModuleQuestionSource AudioAttributesCompatParcelizer(RevisionSubjectStatusModel revisionSubjectStatusModel, List<Integer> list) {
        toMagicModuleMetaRepoModel.write(revisionSubjectStatusModel, "");
        toMagicModuleMetaRepoModel.write(list, "");
        return this.read.invoke(new RemoteActionCompatParcelizer(revisionSubjectStatusModel, list));
    }
}
