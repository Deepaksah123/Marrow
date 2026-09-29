package kotlin;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.setActiveRecallQbankId;
import kotlin.setPearlId;

/* JADX INFO: loaded from: classes4.dex */
public abstract class getReviewTime extends QaPair {
    private setTags AudioAttributesCompatParcelizer;
    private final setTagType AudioAttributesImplBaseParcelizer;
    private final setPublishedTime IconCompatParcelizer;
    private final LessonQbankItem RemoteActionCompatParcelizer;
    private setActiveRecallQbankId.MediaMetadataCompat read;
    private final setQuestions write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getReviewTime(getNotesCount getnotescount, getMini getmini, getTopSection gettopsection, setActiveRecallQbankId.MediaMetadataCompat mediaMetadataCompat, setPublishedTime setpublishedtime) {
        super(getnotescount, getmini, gettopsection);
        toMagicModuleMetaRepoModel.write(getnotescount, "");
        toMagicModuleMetaRepoModel.write(getmini, "");
        toMagicModuleMetaRepoModel.write(gettopsection, "");
        toMagicModuleMetaRepoModel.write(mediaMetadataCompat, "");
        toMagicModuleMetaRepoModel.write(setpublishedtime, "");
        this.IconCompatParcelizer = setpublishedtime;
        this.write = null;
        setActiveRecallQbankId.MediaBrowserCompatSearchResultReceiver mediaBrowserCompatSearchResultReceiverAudioAttributesImplBaseParcelizer = mediaMetadataCompat.AudioAttributesImplBaseParcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(mediaBrowserCompatSearchResultReceiverAudioAttributesImplBaseParcelizer, "");
        setActiveRecallQbankId.MediaDescriptionCompat mediaDescriptionCompatWrite = mediaMetadataCompat.write();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(mediaDescriptionCompatWrite, "");
        setTagType settagtype = new setTagType(mediaBrowserCompatSearchResultReceiverAudioAttributesImplBaseParcelizer, mediaDescriptionCompatWrite);
        this.AudioAttributesImplBaseParcelizer = settagtype;
        this.RemoteActionCompatParcelizer = new LessonQbankItem(mediaMetadataCompat, settagtype, setpublishedtime, new RemoteActionCompatParcelizer());
        this.read = mediaMetadataCompat;
    }

    static final class RemoteActionCompatParcelizer extends MagicModuleUseCase implements getAnswerMap<RevisionSubjectStatusModel, getIntroDurationSeconds> {
        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public getIntroDurationSeconds invoke(RevisionSubjectStatusModel revisionSubjectStatusModel) {
            toMagicModuleMetaRepoModel.write(revisionSubjectStatusModel, "");
            setQuestions setquestions = getReviewTime.this.write;
            if (setquestions != null) {
                return setquestions;
            }
            getIntroDurationSeconds getintrodurationseconds = getIntroDurationSeconds.AudioAttributesCompatParcelizer;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getintrodurationseconds, "");
            return getintrodurationseconds;
        }

        RemoteActionCompatParcelizer() {
            super(1);
        }
    }

    @Override // kotlin.QaPair
    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: merged with bridge method [inline-methods] */
    public final LessonQbankItem MediaBrowserCompatCustomActionResultReceiver() {
        return this.RemoteActionCompatParcelizer;
    }

    @Override // kotlin.QaPair
    public final void read(getPearlId getpearlid) {
        toMagicModuleMetaRepoModel.write(getpearlid, "");
        setActiveRecallQbankId.MediaMetadataCompat mediaMetadataCompat = this.read;
        if (mediaMetadataCompat == null) {
            throw new IllegalStateException("Repeated call to DeserializedPackageFragmentImpl::initialize".toString());
        }
        this.read = null;
        setActiveRecallQbankId.RatingCompat ratingCompatIconCompatParcelizer = mediaMetadataCompat.IconCompatParcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(ratingCompatIconCompatParcelizer, "");
        this.AudioAttributesCompatParcelizer = new getAttempted(this, ratingCompatIconCompatParcelizer, this.AudioAttributesImplBaseParcelizer, this.IconCompatParcelizer, null, getpearlid, "scope of ".concat(String.valueOf(this)), new read());
    }

    static final class read extends MagicModuleUseCase implements getCreatedOnDateMs<Collection<? extends getRelatedLessonId>> {
        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public Collection<getRelatedLessonId> invoke() {
            Collection<RevisionSubjectStatusModel> collection = getReviewTime.this.MediaBrowserCompatCustomActionResultReceiver().read();
            ArrayList arrayList = new ArrayList();
            for (Object obj : collection) {
                RevisionSubjectStatusModel revisionSubjectStatusModel = (RevisionSubjectStatusModel) obj;
                if (!revisionSubjectStatusModel.AudioAttributesImplBaseParcelizer()) {
                    setPearlId.read readVar = setPearlId.AudioAttributesCompatParcelizer;
                    if (!setPearlId.read.AudioAttributesCompatParcelizer().contains(revisionSubjectStatusModel)) {
                        arrayList.add(obj);
                    }
                }
            }
            ArrayList arrayList2 = arrayList;
            ArrayList arrayList3 = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) arrayList2, 10));
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList3.add(((RevisionSubjectStatusModel) it.next()).AudioAttributesImplApi26Parcelizer());
            }
            return arrayList3;
        }

        read() {
            super(0);
        }
    }

    @Override // kotlin.getShouldShowEmptyPlanScreen
    public final setTags write() {
        setTags settags = this.AudioAttributesCompatParcelizer;
        if (settags != null) {
            return settags;
        }
        toMagicModuleMetaRepoModel.IconCompatParcelizer("");
        return null;
    }
}
