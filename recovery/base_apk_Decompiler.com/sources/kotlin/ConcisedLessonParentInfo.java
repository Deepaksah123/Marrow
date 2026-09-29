package kotlin;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.getBooleanFlags;
import kotlin.getMasterOrder;
import kotlin.getMyRating;
import kotlin.getOption8AnsweredCount;
import kotlin.getParentId;
import kotlin.setActiveRecallQbankId;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ConcisedLessonParentInfo<A, C> extends getParentId<A, read<? extends A, ? extends C>> implements setStartIndex<A, C> {
    private final getListOfLessonCompletions<getMasterOrder, read<A, C>> RemoteActionCompatParcelizer;

    protected abstract C write(C c);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConcisedLessonParentInfo(getMini getmini, getLessonActivityStatus getlessonactivitystatus) {
        super(getlessonactivitystatus);
        toMagicModuleMetaRepoModel.write(getmini, "");
        toMagicModuleMetaRepoModel.write(getlessonactivitystatus, "");
        this.RemoteActionCompatParcelizer = getmini.AudioAttributesCompatParcelizer(new write(this));
    }

    static final class write extends MagicModuleUseCase implements getAnswerMap<getMasterOrder, read<? extends A, ? extends C>> {
        private /* synthetic */ ConcisedLessonParentInfo<A, C> AudioAttributesCompatParcelizer;

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public read<A, C> invoke(getMasterOrder getmasterorder) {
            toMagicModuleMetaRepoModel.write(getmasterorder, "");
            return this.AudioAttributesCompatParcelizer.read(getmasterorder);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        write(ConcisedLessonParentInfo<A, C> concisedLessonParentInfo) {
            super(1);
            this.AudioAttributesCompatParcelizer = concisedLessonParentInfo;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.getParentId
    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public read<A, C> write(getMasterOrder getmasterorder) {
        toMagicModuleMetaRepoModel.write(getmasterorder, "");
        return this.RemoteActionCompatParcelizer.invoke(getmasterorder);
    }

    static final class AudioAttributesCompatParcelizer extends MagicModuleUseCase implements MagicModuleSubmissionRequestBody<read<? extends A, ? extends C>, getMyRating, C> {
        public static final AudioAttributesCompatParcelizer IconCompatParcelizer = new AudioAttributesCompatParcelizer();

        @Override // kotlin.MagicModuleSubmissionRequestBody
        public final /* synthetic */ Object invoke(Object obj, getMyRating getmyrating) {
            return AudioAttributesCompatParcelizer((read) obj, getmyrating);
        }

        private static C AudioAttributesCompatParcelizer(read<? extends A, ? extends C> readVar, getMyRating getmyrating) {
            toMagicModuleMetaRepoModel.write(readVar, "");
            toMagicModuleMetaRepoModel.write(getmyrating, "");
            return readVar.RemoteActionCompatParcelizer().get(getmyrating);
        }

        AudioAttributesCompatParcelizer() {
            super(2);
        }
    }

    @Override // kotlin.setStartIndex
    public final C AudioAttributesCompatParcelizer(getBookmarkCount getbookmarkcount, setActiveRecallQbankId.MediaBrowserCompatMediaItem mediaBrowserCompatMediaItem, getLink getlink) {
        toMagicModuleMetaRepoModel.write(getbookmarkcount, "");
        toMagicModuleMetaRepoModel.write(mediaBrowserCompatMediaItem, "");
        toMagicModuleMetaRepoModel.write(getlink, "");
        return write(getbookmarkcount, mediaBrowserCompatMediaItem, getMCQId.PROPERTY_GETTER, getlink, AudioAttributesCompatParcelizer.IconCompatParcelizer);
    }

    static final class RemoteActionCompatParcelizer extends MagicModuleUseCase implements MagicModuleSubmissionRequestBody<read<? extends A, ? extends C>, getMyRating, C> {
        public static final RemoteActionCompatParcelizer IconCompatParcelizer = new RemoteActionCompatParcelizer();

        private static C IconCompatParcelizer(read<? extends A, ? extends C> readVar, getMyRating getmyrating) {
            toMagicModuleMetaRepoModel.write(readVar, "");
            toMagicModuleMetaRepoModel.write(getmyrating, "");
            return readVar.read().get(getmyrating);
        }

        @Override // kotlin.MagicModuleSubmissionRequestBody
        public final /* synthetic */ Object invoke(Object obj, getMyRating getmyrating) {
            return IconCompatParcelizer((read) obj, getmyrating);
        }

        RemoteActionCompatParcelizer() {
            super(2);
        }
    }

    @Override // kotlin.setStartIndex
    public final C IconCompatParcelizer(getBookmarkCount getbookmarkcount, setActiveRecallQbankId.MediaBrowserCompatMediaItem mediaBrowserCompatMediaItem, getLink getlink) {
        toMagicModuleMetaRepoModel.write(getbookmarkcount, "");
        toMagicModuleMetaRepoModel.write(mediaBrowserCompatMediaItem, "");
        toMagicModuleMetaRepoModel.write(getlink, "");
        return write(getbookmarkcount, mediaBrowserCompatMediaItem, getMCQId.PROPERTY, getlink, RemoteActionCompatParcelizer.IconCompatParcelizer);
    }

    private final C write(getBookmarkCount getbookmarkcount, setActiveRecallQbankId.MediaBrowserCompatMediaItem mediaBrowserCompatMediaItem, getMCQId getmcqid, getLink getlink, MagicModuleSubmissionRequestBody<? super read<? extends A, ? extends C>, ? super getMyRating, ? extends C> magicModuleSubmissionRequestBody) {
        C cInvoke;
        getMasterOrder getmasterorderIconCompatParcelizer = IconCompatParcelizer(getbookmarkcount, AudioAttributesCompatParcelizer(getbookmarkcount, true, true, setPeopleSolved.AudioAttributesImplBaseParcelizer.IconCompatParcelizer(mediaBrowserCompatMediaItem.AudioAttributesCompatParcelizer()), getCompletedARQBankCount.IconCompatParcelizer(mediaBrowserCompatMediaItem)));
        if (getmasterorderIconCompatParcelizer == null) {
            return null;
        }
        incrementTotalCount incrementtotalcountWrite = getmasterorderIconCompatParcelizer.write().write();
        getBooleanFlags.RemoteActionCompatParcelizer remoteActionCompatParcelizer = getBooleanFlags.write;
        getMyRating getmyratingAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(mediaBrowserCompatMediaItem, getbookmarkcount.write(), getbookmarkcount.AudioAttributesCompatParcelizer(), getmcqid, incrementtotalcountWrite.write(getBooleanFlags.RemoteActionCompatParcelizer.IconCompatParcelizer()));
        if (getmyratingAudioAttributesCompatParcelizer == null || (cInvoke = magicModuleSubmissionRequestBody.invoke(this.RemoteActionCompatParcelizer.invoke(getmasterorderIconCompatParcelizer), getmyratingAudioAttributesCompatParcelizer)) == null) {
            return null;
        }
        return getVideoSubjectPageItems.AudioAttributesCompatParcelizer(getlink) ? write(cInvoke) : cInvoke;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final read<A, C> read(getMasterOrder getmasterorder) {
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        IconCompatParcelizer iconCompatParcelizer = new IconCompatParcelizer(this, map, getmasterorder, map3, map2);
        RemoteActionCompatParcelizer(getmasterorder);
        getmasterorder.AudioAttributesCompatParcelizer(iconCompatParcelizer);
        return new read<>(map, map2, map3);
    }

    public static final class IconCompatParcelizer implements getMasterOrder.write {
        final /* synthetic */ ConcisedLessonParentInfo<A, C> AudioAttributesCompatParcelizer;
        final /* synthetic */ HashMap<getMyRating, List<A>> IconCompatParcelizer;
        private /* synthetic */ getMasterOrder RemoteActionCompatParcelizer;
        private /* synthetic */ HashMap<getMyRating, C> read;
        private /* synthetic */ HashMap<getMyRating, C> write;

        IconCompatParcelizer(ConcisedLessonParentInfo<A, C> concisedLessonParentInfo, HashMap<getMyRating, List<A>> map, getMasterOrder getmasterorder, HashMap<getMyRating, C> map2, HashMap<getMyRating, C> map3) {
            this.AudioAttributesCompatParcelizer = concisedLessonParentInfo;
            this.IconCompatParcelizer = map;
            this.RemoteActionCompatParcelizer = getmasterorder;
            this.read = map2;
            this.write = map3;
        }

        @Override // o.getMasterOrder.write
        public final getMasterOrder.IconCompatParcelizer read(getRelatedLessonId getrelatedlessonid, String str) {
            toMagicModuleMetaRepoModel.write(getrelatedlessonid, "");
            toMagicModuleMetaRepoModel.write(str, "");
            getMyRating.IconCompatParcelizer iconCompatParcelizer = getMyRating.AudioAttributesCompatParcelizer;
            String strAudioAttributesCompatParcelizer = getrelatedlessonid.AudioAttributesCompatParcelizer();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strAudioAttributesCompatParcelizer, "");
            return new read(this, getMyRating.IconCompatParcelizer.write(strAudioAttributesCompatParcelizer, str));
        }

        @Override // o.getMasterOrder.write
        public final getMasterOrder.RemoteActionCompatParcelizer RemoteActionCompatParcelizer(getRelatedLessonId getrelatedlessonid, String str) {
            toMagicModuleMetaRepoModel.write(getrelatedlessonid, "");
            toMagicModuleMetaRepoModel.write(str, "");
            getMyRating.IconCompatParcelizer iconCompatParcelizer = getMyRating.AudioAttributesCompatParcelizer;
            String strAudioAttributesCompatParcelizer = getrelatedlessonid.AudioAttributesCompatParcelizer();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strAudioAttributesCompatParcelizer, "");
            return new RemoteActionCompatParcelizer(this, getMyRating.IconCompatParcelizer.IconCompatParcelizer(strAudioAttributesCompatParcelizer, str));
        }

        public final class read extends RemoteActionCompatParcelizer implements getMasterOrder.IconCompatParcelizer {
            private /* synthetic */ IconCompatParcelizer read;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public read(IconCompatParcelizer iconCompatParcelizer, getMyRating getmyrating) {
                super(iconCompatParcelizer, getmyrating);
                toMagicModuleMetaRepoModel.write(getmyrating, "");
                this.read = iconCompatParcelizer;
            }

            @Override // o.getMasterOrder.IconCompatParcelizer
            public final getMasterOrder.AudioAttributesCompatParcelizer RemoteActionCompatParcelizer(int i, RevisionSubjectStatusModel revisionSubjectStatusModel, getIntroDurationSeconds getintrodurationseconds) {
                toMagicModuleMetaRepoModel.write(revisionSubjectStatusModel, "");
                toMagicModuleMetaRepoModel.write(getintrodurationseconds, "");
                getMyRating.IconCompatParcelizer iconCompatParcelizer = getMyRating.AudioAttributesCompatParcelizer;
                getMyRating getmyratingRemoteActionCompatParcelizer = getMyRating.IconCompatParcelizer.RemoteActionCompatParcelizer(AudioAttributesCompatParcelizer(), i);
                ArrayList arrayList = this.read.IconCompatParcelizer.get(getmyratingRemoteActionCompatParcelizer);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    this.read.IconCompatParcelizer.put(getmyratingRemoteActionCompatParcelizer, arrayList);
                }
                return this.read.AudioAttributesCompatParcelizer.read(revisionSubjectStatusModel, getintrodurationseconds, arrayList);
            }
        }

        public class RemoteActionCompatParcelizer implements getMasterOrder.RemoteActionCompatParcelizer {
            private final ArrayList<A> AudioAttributesCompatParcelizer;
            private /* synthetic */ IconCompatParcelizer IconCompatParcelizer;
            private final getMyRating read;

            public RemoteActionCompatParcelizer(IconCompatParcelizer iconCompatParcelizer, getMyRating getmyrating) {
                toMagicModuleMetaRepoModel.write(getmyrating, "");
                this.IconCompatParcelizer = iconCompatParcelizer;
                this.read = getmyrating;
                this.AudioAttributesCompatParcelizer = new ArrayList<>();
            }

            protected final getMyRating AudioAttributesCompatParcelizer() {
                return this.read;
            }

            @Override // o.getMasterOrder.RemoteActionCompatParcelizer
            public final getMasterOrder.AudioAttributesCompatParcelizer IconCompatParcelizer(RevisionSubjectStatusModel revisionSubjectStatusModel, getIntroDurationSeconds getintrodurationseconds) {
                toMagicModuleMetaRepoModel.write(revisionSubjectStatusModel, "");
                toMagicModuleMetaRepoModel.write(getintrodurationseconds, "");
                return this.IconCompatParcelizer.AudioAttributesCompatParcelizer.read(revisionSubjectStatusModel, getintrodurationseconds, this.AudioAttributesCompatParcelizer);
            }

            @Override // o.getMasterOrder.RemoteActionCompatParcelizer
            public final void RemoteActionCompatParcelizer() {
                if (this.AudioAttributesCompatParcelizer.isEmpty()) {
                    return;
                }
                this.IconCompatParcelizer.IconCompatParcelizer.put(this.read, this.AudioAttributesCompatParcelizer);
            }
        }
    }

    protected final boolean read(RevisionSubjectStatusModel revisionSubjectStatusModel, Map<getRelatedLessonId, ? extends getMagicLine<?>> map) {
        toMagicModuleMetaRepoModel.write(revisionSubjectStatusModel, "");
        toMagicModuleMetaRepoModel.write(map, "");
        getSearchItems getsearchitems = getSearchItems.IconCompatParcelizer;
        if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(revisionSubjectStatusModel, getSearchItems.write())) {
            return false;
        }
        getMagicLine<?> getmagicline = map.get(getRelatedLessonId.RemoteActionCompatParcelizer(AppMeasurementSdk.ConditionalUserProperty.VALUE));
        getOption8AnsweredCount getoption8answeredcount = getmagicline instanceof getOption8AnsweredCount ? (getOption8AnsweredCount) getmagicline : null;
        if (getoption8answeredcount == null) {
            return false;
        }
        getOption8AnsweredCount.write writeVarAudioAttributesCompatParcelizer = getoption8answeredcount.AudioAttributesCompatParcelizer();
        getOption8AnsweredCount.write.read readVar = writeVarAudioAttributesCompatParcelizer instanceof getOption8AnsweredCount.write.read ? (getOption8AnsweredCount.write.read) writeVarAudioAttributesCompatParcelizer : null;
        if (readVar == null) {
            return false;
        }
        return IconCompatParcelizer(readVar.RemoteActionCompatParcelizer());
    }

    public static final class read<A, C> extends getParentId.RemoteActionCompatParcelizer<A> {
        private final Map<getMyRating, C> AudioAttributesCompatParcelizer;
        private final Map<getMyRating, C> RemoteActionCompatParcelizer;
        private final Map<getMyRating, List<A>> read;

        @Override // o.getParentId.RemoteActionCompatParcelizer
        public final Map<getMyRating, List<A>> IconCompatParcelizer() {
            return this.read;
        }

        public final Map<getMyRating, C> read() {
            return this.RemoteActionCompatParcelizer;
        }

        public final Map<getMyRating, C> RemoteActionCompatParcelizer() {
            return this.AudioAttributesCompatParcelizer;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public read(Map<getMyRating, ? extends List<? extends A>> map, Map<getMyRating, ? extends C> map2, Map<getMyRating, ? extends C> map3) {
            toMagicModuleMetaRepoModel.write(map, "");
            toMagicModuleMetaRepoModel.write(map2, "");
            toMagicModuleMetaRepoModel.write(map3, "");
            this.read = map;
            this.RemoteActionCompatParcelizer = map2;
            this.AudioAttributesCompatParcelizer = map3;
        }
    }
}
