package kotlin;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.CourseConfigV2PlanScreenConfig;
import kotlin.CourseConfigV2VideoSubjectPageItem;
import kotlin.getBookmarkCount;
import kotlin.getMainSettings;
import kotlin.getMcqContentBody;
import kotlin.getQuote;
import kotlin.setActiveRecallQbankId;
import kotlin.setTags;
import kotlin.setVideoId;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes4.dex */
public final class SchemaItem extends FeaturedCardLabel implements CourseConfigV2NavDrawerItemBuyNow {
    private final getQuote AudioAttributesCompatParcelizer;
    private final setActiveRecallQbankId.RemoteActionCompatParcelizer AudioAttributesImplApi21Parcelizer;
    private final SchemaLessonStatusResponse<CourseConfigV2CustomModuleQuestionSource> AudioAttributesImplApi26Parcelizer;
    private final PageValue<Collection<CourseConfigV2EditionSwitch>> AudioAttributesImplBaseParcelizer;
    private final getVariant MediaBrowserCompatCustomActionResultReceiver;
    private final AudioAttributesCompatParcelizer MediaBrowserCompatItemReceiver;
    private final getMainSettings<write> MediaBrowserCompatMediaItem;
    private final setPublishedTime MediaBrowserCompatSearchResultReceiver;
    private final getBookmarkCount.write MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    private final getQuestionSource MediaDescriptionCompat;
    private final SchemaLessonStatusResponse<CourseConfigV2EditionSwitch> MediaMetadataCompat;
    private final CourseConfigV2NavDrawerItems RatingCompat;
    private final PageValue<Collection<CourseConfigV2CustomModuleQuestionSource>> handleMediaPlayPauseIfPendingOnHandler;
    private final setStatusUpdateEndTimeMs onAddQueueItem;
    private final getIntroDurationSeconds onCommand;
    private final read onCustomAction;
    private final CourseConfigV2NavDrawerItemFreeExtension onFastForward;
    private final SchemaLessonStatusResponse<CourseConfigV2ZenAreaItem<getHref>> onMediaButtonEvent;
    private final McqTimeSpent read;
    private final RevisionSubjectStatusModel write;

    @Override // kotlin.CourseConfigV2NavDrawerItemYourCourse
    public final boolean onCommand() {
        return false;
    }

    public final setActiveRecallQbankId.RemoteActionCompatParcelizer onRewind() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    public final setPublishedTime onRemoveQueueItemAt() {
        return this.MediaBrowserCompatSearchResultReceiver;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SchemaItem(McqTimeSpent mcqTimeSpent, setActiveRecallQbankId.RemoteActionCompatParcelizer remoteActionCompatParcelizer, setRatingCount setratingcount, setPublishedTime setpublishedtime, getIntroDurationSeconds getintrodurationseconds) {
        setTags.write setencrypt;
        SchemaLessonItem schemaLessonItem;
        super(mcqTimeSpent.AudioAttributesImplApi21Parcelizer(), FilterItemRecordCreator.AudioAttributesCompatParcelizer(setratingcount, remoteActionCompatParcelizer.MediaMetadataCompat()).AudioAttributesImplApi26Parcelizer());
        toMagicModuleMetaRepoModel.write(mcqTimeSpent, "");
        toMagicModuleMetaRepoModel.write(remoteActionCompatParcelizer, "");
        toMagicModuleMetaRepoModel.write(setratingcount, "");
        toMagicModuleMetaRepoModel.write(setpublishedtime, "");
        toMagicModuleMetaRepoModel.write(getintrodurationseconds, "");
        this.AudioAttributesImplApi21Parcelizer = remoteActionCompatParcelizer;
        this.MediaBrowserCompatSearchResultReceiver = setpublishedtime;
        this.onCommand = getintrodurationseconds;
        this.write = FilterItemRecordCreator.AudioAttributesCompatParcelizer(setratingcount, remoteActionCompatParcelizer.MediaMetadataCompat());
        MultiBookmarkCounter multiBookmarkCounter = MultiBookmarkCounter.AudioAttributesCompatParcelizer;
        this.RatingCompat = MultiBookmarkCounter.AudioAttributesCompatParcelizer(setPeopleSolved.onSetShuffleMode.IconCompatParcelizer(remoteActionCompatParcelizer.MediaBrowserCompatMediaItem()));
        this.onFastForward = getLessonName.write(MultiBookmarkCounter.AudioAttributesCompatParcelizer, setPeopleSolved.onSetRating.IconCompatParcelizer(remoteActionCompatParcelizer.MediaBrowserCompatMediaItem()));
        MultiBookmarkCounter multiBookmarkCounter2 = MultiBookmarkCounter.AudioAttributesCompatParcelizer;
        getQuestionSource getquestionsourceIconCompatParcelizer = MultiBookmarkCounter.IconCompatParcelizer(setPeopleSolved.AudioAttributesCompatParcelizer.IconCompatParcelizer(remoteActionCompatParcelizer.MediaBrowserCompatMediaItem()));
        this.MediaDescriptionCompat = getquestionsourceIconCompatParcelizer;
        List<setActiveRecallQbankId.onCustomAction> listOnPrepareFromSearch = remoteActionCompatParcelizer.onPrepareFromSearch();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(listOnPrepareFromSearch, "");
        setActiveRecallQbankId.onAddQueueItem onaddqueueitemOnPrepareFromUri = remoteActionCompatParcelizer.onPrepareFromUri();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(onaddqueueitemOnPrepareFromUri, "");
        setTagActive settagactive = new setTagActive(onaddqueueitemOnPrepareFromUri);
        setVideoId.IconCompatParcelizer iconCompatParcelizer = setVideoId.AudioAttributesCompatParcelizer;
        setActiveRecallQbankId.onPlay onplayOnSeekTo = remoteActionCompatParcelizer.onSeekTo();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(onplayOnSeekTo, "");
        McqTimeSpent mcqTimeSpentWrite = mcqTimeSpent.write(this, listOnPrepareFromSearch, setratingcount, settagactive, setVideoId.IconCompatParcelizer.RemoteActionCompatParcelizer(onplayOnSeekTo), setpublishedtime);
        this.read = mcqTimeSpentWrite;
        if (getquestionsourceIconCompatParcelizer == getQuestionSource.ENUM_CLASS) {
            setencrypt = new setEncrypt(mcqTimeSpentWrite.AudioAttributesImplApi21Parcelizer(), this);
        } else {
            setencrypt = setTags.write.RemoteActionCompatParcelizer;
        }
        this.onAddQueueItem = setencrypt;
        this.onCustomAction = new read();
        getMainSettings.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = getMainSettings.write;
        this.MediaBrowserCompatMediaItem = getMainSettings.AudioAttributesCompatParcelizer.IconCompatParcelizer(this, mcqTimeSpentWrite.AudioAttributesImplApi21Parcelizer(), mcqTimeSpentWrite.AudioAttributesCompatParcelizer().MediaMetadataCompat().RemoteActionCompatParcelizer(), new MediaBrowserCompatItemReceiver(this));
        this.MediaBrowserCompatItemReceiver = getquestionsourceIconCompatParcelizer == getQuestionSource.ENUM_CLASS ? new AudioAttributesCompatParcelizer() : null;
        getVariant getvariantIconCompatParcelizer = mcqTimeSpent.IconCompatParcelizer();
        this.MediaBrowserCompatCustomActionResultReceiver = getvariantIconCompatParcelizer;
        this.MediaMetadataCompat = mcqTimeSpentWrite.AudioAttributesImplApi21Parcelizer().AudioAttributesCompatParcelizer(new AudioAttributesImplApi26Parcelizer());
        this.AudioAttributesImplBaseParcelizer = mcqTimeSpentWrite.AudioAttributesImplApi21Parcelizer().read(new AudioAttributesImplApi21Parcelizer());
        this.AudioAttributesImplApi26Parcelizer = mcqTimeSpentWrite.AudioAttributesImplApi21Parcelizer().AudioAttributesCompatParcelizer(new IconCompatParcelizer());
        this.handleMediaPlayPauseIfPendingOnHandler = mcqTimeSpentWrite.AudioAttributesImplApi21Parcelizer().read(new MediaDescriptionCompat());
        this.onMediaButtonEvent = mcqTimeSpentWrite.AudioAttributesImplApi21Parcelizer().AudioAttributesCompatParcelizer(new MediaBrowserCompatSearchResultReceiver());
        setRatingCount setratingcountWrite = mcqTimeSpentWrite.write();
        setTagActive settagactiveMediaBrowserCompatCustomActionResultReceiver = mcqTimeSpentWrite.MediaBrowserCompatCustomActionResultReceiver();
        SchemaItem schemaItem = getvariantIconCompatParcelizer instanceof SchemaItem ? (SchemaItem) getvariantIconCompatParcelizer : null;
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = new getBookmarkCount.write(remoteActionCompatParcelizer, setratingcountWrite, settagactiveMediaBrowserCompatCustomActionResultReceiver, getintrodurationseconds, schemaItem != null ? schemaItem.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver : null);
        if (!setPeopleSolved.read.IconCompatParcelizer(remoteActionCompatParcelizer.MediaBrowserCompatMediaItem()).booleanValue()) {
            getQuote.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer2 = getQuote.IconCompatParcelizer;
            schemaLessonItem = getQuote.AudioAttributesCompatParcelizer.read();
        } else {
            schemaLessonItem = new SchemaLessonItem(mcqTimeSpentWrite.AudioAttributesImplApi21Parcelizer(), new RemoteActionCompatParcelizer());
        }
        this.AudioAttributesCompatParcelizer = schemaLessonItem;
    }

    public final McqTimeSpent write() {
        return this.read;
    }

    final /* synthetic */ class MediaBrowserCompatItemReceiver extends MagicModuleRepoModelsKt implements getAnswerMap<getCheapestPlan, write> {
        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public write invoke(getCheapestPlan getcheapestplan) {
            toMagicModuleMetaRepoModel.write(getcheapestplan, "");
            return new write((SchemaItem) this.AudioAttributesImplApi26Parcelizer, getcheapestplan);
        }

        @Override // kotlin.r8lambdawOOzi0yme1vxdgON3UOSQJBjUQA, kotlin.isKycAuditIncomplete
        public final String MediaBrowserCompatCustomActionResultReceiver() {
            return "<init>";
        }

        @Override // kotlin.r8lambdawOOzi0yme1vxdgON3UOSQJBjUQA
        public final isAuthError MediaDescriptionCompat() {
            return toMagicModuleMetaDataUcModel.write(write.class);
        }

        MediaBrowserCompatItemReceiver(Object obj) {
            super(1, obj);
        }

        @Override // kotlin.r8lambdawOOzi0yme1vxdgON3UOSQJBjUQA
        public final String MediaBrowserCompatMediaItem() {
            return "<init>(Lorg/jetbrains/kotlin/serialization/deserialization/descriptors/DeserializedClassDescriptor;Lorg/jetbrains/kotlin/types/checker/KotlinTypeRefiner;)V";
        }
    }

    private final write onSkipToPrevious() {
        return (write) this.MediaBrowserCompatMediaItem.read(this.read.AudioAttributesCompatParcelizer().MediaMetadataCompat().RemoteActionCompatParcelizer());
    }

    static final class AudioAttributesImplApi26Parcelizer extends MagicModuleUseCase implements getCreatedOnDateMs<CourseConfigV2EditionSwitch> {
        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public CourseConfigV2EditionSwitch invoke() {
            return SchemaItem.this.onSetPlaybackSpeed();
        }

        AudioAttributesImplApi26Parcelizer() {
            super(0);
        }
    }

    static final class AudioAttributesImplApi21Parcelizer extends MagicModuleUseCase implements getCreatedOnDateMs<Collection<? extends CourseConfigV2EditionSwitch>> {
        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public Collection<CourseConfigV2EditionSwitch> invoke() {
            return SchemaItem.this.onSetRating();
        }

        AudioAttributesImplApi21Parcelizer() {
            super(0);
        }
    }

    static final class IconCompatParcelizer extends MagicModuleUseCase implements getCreatedOnDateMs<CourseConfigV2CustomModuleQuestionSource> {
        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public CourseConfigV2CustomModuleQuestionSource invoke() {
            return SchemaItem.this.onSetCaptioningEnabled();
        }

        IconCompatParcelizer() {
            super(0);
        }
    }

    static final class MediaDescriptionCompat extends MagicModuleUseCase implements getCreatedOnDateMs<Collection<? extends CourseConfigV2CustomModuleQuestionSource>> {
        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Collection<CourseConfigV2CustomModuleQuestionSource> invoke() {
            return SchemaItem.this.onSetShuffleMode();
        }

        MediaDescriptionCompat() {
            super(0);
        }
    }

    static final class MediaBrowserCompatSearchResultReceiver extends MagicModuleUseCase implements getCreatedOnDateMs<CourseConfigV2ZenAreaItem<getHref>> {
        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public CourseConfigV2ZenAreaItem<getHref> invoke() {
            return SchemaItem.this.onSkipToQueueItem();
        }

        MediaBrowserCompatSearchResultReceiver() {
            super(0);
        }
    }

    public final getBookmarkCount.write onPrepareFromUri() {
        return this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    }

    @Override // kotlin.fromJSONArray
    public final getQuote RemoteActionCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    static final class RemoteActionCompatParcelizer extends MagicModuleUseCase implements getCreatedOnDateMs<List<? extends dummyEditor>> {
        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public List<dummyEditor> invoke() {
            return IntermediateLoginResponseBody.onPlay(SchemaItem.this.write().AudioAttributesCompatParcelizer().AudioAttributesCompatParcelizer().RemoteActionCompatParcelizer(SchemaItem.this.onPrepareFromUri()));
        }

        RemoteActionCompatParcelizer() {
            super(0);
        }
    }

    @Override // kotlin.CourseConfigV2CustomModuleQuestionSource, kotlin.CourseConfigV2NavDrawerItemAboutUs, kotlin.getVariant
    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer */
    public final getVariant onPlayFromMediaId() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    @Override // kotlin.getQuestionLimit
    public final getPlanAddOns MediaBrowserCompatSearchResultReceiver() {
        return this.onCustomAction;
    }

    @Override // kotlin.CourseConfigV2CustomModuleQuestionSource
    public final getQuestionSource AudioAttributesImplBaseParcelizer() {
        return this.MediaDescriptionCompat;
    }

    @Override // kotlin.CourseConfigV2CustomModuleQuestionSource, kotlin.CourseConfigV2NavDrawerItemYourCourse
    public final CourseConfigV2NavDrawerItems MediaBrowserCompatMediaItem() {
        return this.RatingCompat;
    }

    @Override // kotlin.CourseConfigV2CustomModuleQuestionSource, kotlin.CourseConfigV2NavDrawerItemYourCourse, kotlin.getSubText
    public final CourseConfigV2NavDrawerItemFreeExtension onCustomAction() {
        return this.onFastForward;
    }

    @Override // kotlin.getBadge
    public final boolean onPrepareFromSearch() {
        Boolean boolIconCompatParcelizer = setPeopleSolved.onPlayFromMediaId.IconCompatParcelizer(this.AudioAttributesImplApi21Parcelizer.MediaBrowserCompatMediaItem());
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(boolIconCompatParcelizer, "");
        return boolIconCompatParcelizer.booleanValue();
    }

    @Override // kotlin.CourseConfigV2CustomModuleQuestionSource
    public final boolean onFastForward() {
        Boolean boolIconCompatParcelizer = setPeopleSolved.MediaBrowserCompatMediaItem.IconCompatParcelizer(this.AudioAttributesImplApi21Parcelizer.MediaBrowserCompatMediaItem());
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(boolIconCompatParcelizer, "");
        return boolIconCompatParcelizer.booleanValue();
    }

    @Override // kotlin.CourseConfigV2CustomModuleQuestionSource
    public final boolean onPlay() {
        Boolean boolIconCompatParcelizer = setPeopleSolved.onSeekTo.IconCompatParcelizer(this.AudioAttributesImplApi21Parcelizer.MediaBrowserCompatMediaItem());
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(boolIconCompatParcelizer, "");
        return boolIconCompatParcelizer.booleanValue() && this.MediaBrowserCompatSearchResultReceiver.RemoteActionCompatParcelizer();
    }

    @Override // kotlin.CourseConfigV2NavDrawerItemYourCourse
    public final boolean onPause() {
        Boolean boolIconCompatParcelizer = setPeopleSolved.MediaMetadataCompat.IconCompatParcelizer(this.AudioAttributesImplApi21Parcelizer.MediaBrowserCompatMediaItem());
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(boolIconCompatParcelizer, "");
        return boolIconCompatParcelizer.booleanValue();
    }

    @Override // kotlin.CourseConfigV2NavDrawerItemYourCourse
    public final boolean onMediaButtonEvent() {
        Boolean boolIconCompatParcelizer = setPeopleSolved.handleMediaPlayPauseIfPendingOnHandler.IconCompatParcelizer(this.AudioAttributesImplApi21Parcelizer.MediaBrowserCompatMediaItem());
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(boolIconCompatParcelizer, "");
        return boolIconCompatParcelizer.booleanValue();
    }

    @Override // kotlin.CourseConfigV2CustomModuleQuestionSource
    public final boolean onPlayFromMediaId() {
        Boolean boolIconCompatParcelizer = setPeopleSolved.onPause.IconCompatParcelizer(this.AudioAttributesImplApi21Parcelizer.MediaBrowserCompatMediaItem());
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(boolIconCompatParcelizer, "");
        return boolIconCompatParcelizer.booleanValue();
    }

    @Override // kotlin.CourseConfigV2CustomModuleQuestionSource
    public final boolean onPlayFromUri() {
        Boolean boolIconCompatParcelizer = setPeopleSolved.onSeekTo.IconCompatParcelizer(this.AudioAttributesImplApi21Parcelizer.MediaBrowserCompatMediaItem());
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(boolIconCompatParcelizer, "");
        return boolIconCompatParcelizer.booleanValue() && this.MediaBrowserCompatSearchResultReceiver.write(1, 4, 2);
    }

    @Override // kotlin.getStringArrayMap
    public final setTags IconCompatParcelizer(getCheapestPlan getcheapestplan) {
        toMagicModuleMetaRepoModel.write(getcheapestplan, "");
        return this.MediaBrowserCompatMediaItem.read(getcheapestplan);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.CourseConfigV2CustomModuleQuestionSource
    /* JADX INFO: renamed from: onStop, reason: merged with bridge method [inline-methods] */
    public setStatusUpdateEndTimeMs MediaMetadataCompat() {
        return this.onAddQueueItem;
    }

    @Override // kotlin.CourseConfigV2CustomModuleQuestionSource
    public final boolean onAddQueueItem() {
        return setPeopleSolved.AudioAttributesCompatParcelizer.IconCompatParcelizer(this.AudioAttributesImplApi21Parcelizer.MediaBrowserCompatMediaItem()) == setActiveRecallQbankId.RemoteActionCompatParcelizer.write.COMPANION_OBJECT;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CourseConfigV2EditionSwitch onSetPlaybackSpeed() {
        Object next;
        if (this.MediaDescriptionCompat.AudioAttributesCompatParcelizer()) {
            NetworkStat networkStatRemoteActionCompatParcelizer = getOption2.RemoteActionCompatParcelizer(this, getIntroDurationSeconds.AudioAttributesCompatParcelizer);
            networkStatRemoteActionCompatParcelizer.write(aP_());
            return networkStatRemoteActionCompatParcelizer;
        }
        List<setActiveRecallQbankId.write> listAudioAttributesCompatParcelizer = this.AudioAttributesImplApi21Parcelizer.AudioAttributesCompatParcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(listAudioAttributesCompatParcelizer, "");
        Iterator<T> it = listAudioAttributesCompatParcelizer.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (!setPeopleSolved.onPrepare.IconCompatParcelizer(((setActiveRecallQbankId.write) next).AudioAttributesCompatParcelizer()).booleanValue()) {
                break;
            }
        }
        setActiveRecallQbankId.write writeVar = (setActiveRecallQbankId.write) next;
        if (writeVar != null) {
            return this.read.read().read(writeVar, true);
        }
        return null;
    }

    @Override // kotlin.CourseConfigV2CustomModuleQuestionSource
    public final CourseConfigV2EditionSwitch handleMediaPlayPauseIfPendingOnHandler() {
        return this.MediaMetadataCompat.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Collection<CourseConfigV2EditionSwitch> onSetRating() {
        return IntermediateLoginResponseBody.AudioAttributesCompatParcelizer((Collection) IntermediateLoginResponseBody.AudioAttributesCompatParcelizer((Collection) onSetRepeatMode(), (Iterable) IntermediateLoginResponseBody.AudioAttributesCompatParcelizer(handleMediaPlayPauseIfPendingOnHandler())), (Iterable) this.read.AudioAttributesCompatParcelizer().IconCompatParcelizer().write(this));
    }

    private final List<CourseConfigV2EditionSwitch> onSetRepeatMode() {
        List<setActiveRecallQbankId.write> listAudioAttributesCompatParcelizer = this.AudioAttributesImplApi21Parcelizer.AudioAttributesCompatParcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(listAudioAttributesCompatParcelizer, "");
        ArrayList arrayList = new ArrayList();
        for (Object obj : listAudioAttributesCompatParcelizer) {
            Boolean boolIconCompatParcelizer = setPeopleSolved.onPrepare.IconCompatParcelizer(((setActiveRecallQbankId.write) obj).AudioAttributesCompatParcelizer());
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(boolIconCompatParcelizer, "");
            if (boolIconCompatParcelizer.booleanValue()) {
                arrayList.add(obj);
            }
        }
        ArrayList<setActiveRecallQbankId.write> arrayList2 = arrayList;
        ArrayList arrayList3 = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) arrayList2, 10));
        for (setActiveRecallQbankId.write writeVar : arrayList2) {
            allFilterItem allfilteritem = this.read.read();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(writeVar, "");
            arrayList3.add(allfilteritem.read(writeVar, false));
        }
        return arrayList3;
    }

    @Override // kotlin.CourseConfigV2CustomModuleQuestionSource
    public final Collection<CourseConfigV2EditionSwitch> MediaBrowserCompatCustomActionResultReceiver() {
        return this.AudioAttributesImplBaseParcelizer.invoke();
    }

    @Override // kotlin.FeaturedCardLabel, kotlin.CourseConfigV2CustomModuleQuestionSource
    public final List<CourseConfigV2TestTabItem> onPrepare() {
        List<setActiveRecallQbankId.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver> list = setTagExpiryMs.read(this.AudioAttributesImplApi21Parcelizer, this.read.MediaBrowserCompatCustomActionResultReceiver());
        ArrayList arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            getLink getlinkAudioAttributesCompatParcelizer = this.read.MediaBrowserCompatItemReceiver().AudioAttributesCompatParcelizer((setActiveRecallQbankId.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) it.next());
            CourseConfigV2TestTabItem courseConfigV2TestTabItemOnPlayFromSearch = onPlayFromSearch();
            McqPager mcqPager = new McqPager(this, getlinkAudioAttributesCompatParcelizer, null);
            getQuote.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = getQuote.IconCompatParcelizer;
            arrayList.add(new getCorrectnessScore(courseConfigV2TestTabItemOnPlayFromSearch, mcqPager, getQuote.AudioAttributesCompatParcelizer.read()));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CourseConfigV2CustomModuleQuestionSource onSetCaptioningEnabled() {
        if (!this.AudioAttributesImplApi21Parcelizer.onRemoveQueueItemAt()) {
            return null;
        }
        getQuestionLimit getquestionlimitAudioAttributesCompatParcelizer = onSkipToPrevious().AudioAttributesCompatParcelizer(FilterItemRecordCreator.read(this.read.write(), this.AudioAttributesImplApi21Parcelizer.IconCompatParcelizer()), isCollapsible.FROM_DESERIALIZATION);
        if (getquestionlimitAudioAttributesCompatParcelizer instanceof CourseConfigV2CustomModuleQuestionSource) {
            return (CourseConfigV2CustomModuleQuestionSource) getquestionlimitAudioAttributesCompatParcelizer;
        }
        return null;
    }

    @Override // kotlin.CourseConfigV2CustomModuleQuestionSource
    public final CourseConfigV2CustomModuleQuestionSource AudioAttributesCompatParcelizer() {
        return this.AudioAttributesImplApi26Parcelizer.invoke();
    }

    public final boolean write(getRelatedLessonId getrelatedlessonid) {
        toMagicModuleMetaRepoModel.write(getrelatedlessonid, "");
        return onSkipToPrevious().AudioAttributesImplApi26Parcelizer().contains(getrelatedlessonid);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Collection<CourseConfigV2CustomModuleQuestionSource> onSetShuffleMode() {
        if (this.RatingCompat != CourseConfigV2NavDrawerItems.SEALED) {
            return IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
        }
        List<Integer> listOnPlayFromSearch = this.AudioAttributesImplApi21Parcelizer.onPlayFromSearch();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(listOnPlayFromSearch, "");
        if (listOnPlayFromSearch.isEmpty()) {
            getMyAnswerIndex getmyanswerindex = getMyAnswerIndex.RemoteActionCompatParcelizer;
            return getMyAnswerIndex.read(this);
        }
        ArrayList arrayList = new ArrayList();
        for (Integer num : listOnPlayFromSearch) {
            getPearlId getpearlidAudioAttributesCompatParcelizer = this.read.AudioAttributesCompatParcelizer();
            setRatingCount setratingcountWrite = this.read.write();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(num, "");
            CourseConfigV2CustomModuleQuestionSource courseConfigV2CustomModuleQuestionSourceAudioAttributesCompatParcelizer = getpearlidAudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(FilterItemRecordCreator.AudioAttributesCompatParcelizer(setratingcountWrite, num.intValue()));
            if (courseConfigV2CustomModuleQuestionSourceAudioAttributesCompatParcelizer != null) {
                arrayList.add(courseConfigV2CustomModuleQuestionSourceAudioAttributesCompatParcelizer);
            }
        }
        return arrayList;
    }

    @Override // kotlin.CourseConfigV2CustomModuleQuestionSource
    public final Collection<CourseConfigV2CustomModuleQuestionSource> MediaDescriptionCompat() {
        return this.handleMediaPlayPauseIfPendingOnHandler.invoke();
    }

    @Override // kotlin.CourseConfigV2CustomModuleQuestionSource
    public final CourseConfigV2ZenAreaItem<getHref> MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
        return this.onMediaButtonEvent.invoke();
    }

    final /* synthetic */ class AudioAttributesImplBaseParcelizer extends MagicModuleRepoModelsKt implements getAnswerMap<getRelatedLessonId, getHref> {
        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public getHref invoke(getRelatedLessonId getrelatedlessonid) {
            toMagicModuleMetaRepoModel.write(getrelatedlessonid, "");
            return ((SchemaItem) this.AudioAttributesImplApi26Parcelizer).read(getrelatedlessonid);
        }

        @Override // kotlin.r8lambdawOOzi0yme1vxdgON3UOSQJBjUQA, kotlin.isKycAuditIncomplete
        public final String MediaBrowserCompatCustomActionResultReceiver() {
            return "getValueClassPropertyType";
        }

        @Override // kotlin.r8lambdawOOzi0yme1vxdgON3UOSQJBjUQA
        public final isAuthError MediaDescriptionCompat() {
            return toMagicModuleMetaDataUcModel.write(SchemaItem.class);
        }

        AudioAttributesImplBaseParcelizer(Object obj) {
            super(1, obj);
        }

        @Override // kotlin.r8lambdawOOzi0yme1vxdgON3UOSQJBjUQA
        public final String MediaBrowserCompatMediaItem() {
            return "getValueClassPropertyType(Lorg/jetbrains/kotlin/name/Name;)Lorg/jetbrains/kotlin/types/SimpleType;";
        }
    }

    final /* synthetic */ class MediaBrowserCompatCustomActionResultReceiver extends MagicModuleRepoModelsKt implements getAnswerMap<setActiveRecallQbankId.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, getHref> {
        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public getHref invoke(setActiveRecallQbankId.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) {
            toMagicModuleMetaRepoModel.write(mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, "");
            return SchemaCompletionState.IconCompatParcelizer((SchemaCompletionState) this.AudioAttributesImplApi26Parcelizer, mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
        }

        @Override // kotlin.r8lambdawOOzi0yme1vxdgON3UOSQJBjUQA, kotlin.isKycAuditIncomplete
        public final String MediaBrowserCompatCustomActionResultReceiver() {
            return "simpleType";
        }

        @Override // kotlin.r8lambdawOOzi0yme1vxdgON3UOSQJBjUQA
        public final isAuthError MediaDescriptionCompat() {
            return toMagicModuleMetaDataUcModel.write(toMagicModuleMetaRepoModel.IconCompatParcelizer.class);
        }

        MediaBrowserCompatCustomActionResultReceiver(Object obj) {
            super(1, obj);
        }

        @Override // kotlin.r8lambdawOOzi0yme1vxdgON3UOSQJBjUQA
        public final String MediaBrowserCompatMediaItem() {
            return "computeValueClassRepresentation$simpleType(Lorg/jetbrains/kotlin/serialization/deserialization/TypeDeserializer;Lorg/jetbrains/kotlin/metadata/ProtoBuf$Type;)Lorg/jetbrains/kotlin/types/SimpleType;";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CourseConfigV2ZenAreaItem<getHref> onSkipToQueueItem() {
        if (!onPlay() && !onPlayFromUri()) {
            return null;
        }
        CourseConfigV2ZenAreaItem<getHref> courseConfigV2ZenAreaItemAudioAttributesCompatParcelizer = getMcqIndex.AudioAttributesCompatParcelizer(this.AudioAttributesImplApi21Parcelizer, this.read.write(), this.read.MediaBrowserCompatCustomActionResultReceiver(), new MediaBrowserCompatCustomActionResultReceiver(this.read.MediaBrowserCompatItemReceiver()), new AudioAttributesImplBaseParcelizer(this));
        if (courseConfigV2ZenAreaItemAudioAttributesCompatParcelizer != null) {
            return courseConfigV2ZenAreaItemAudioAttributesCompatParcelizer;
        }
        if (this.MediaBrowserCompatSearchResultReceiver.write(1, 5, 1)) {
            return null;
        }
        CourseConfigV2EditionSwitch courseConfigV2EditionSwitchHandleMediaPlayPauseIfPendingOnHandler = handleMediaPlayPauseIfPendingOnHandler();
        if (courseConfigV2EditionSwitchHandleMediaPlayPauseIfPendingOnHandler == null) {
            throw new IllegalStateException("Inline class has no primary constructor: ".concat(String.valueOf(this)).toString());
        }
        List<getMeta> listAX_ = courseConfigV2EditionSwitchHandleMediaPlayPauseIfPendingOnHandler.aX_();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(listAX_, "");
        getRelatedLessonId getrelatedlessonidAQ_ = ((getMeta) IntermediateLoginResponseBody.RatingCompat((List) listAX_)).aQ_();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getrelatedlessonidAQ_, "");
        getHref gethref = read(getrelatedlessonidAQ_);
        if (gethref == null) {
            throw new IllegalStateException("Value class has no underlying property: ".concat(String.valueOf(this)).toString());
        }
        return new CourseConfigV2NavDrawerItemMarrowNotes(getrelatedlessonidAQ_, gethref);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final getHref read(getRelatedLessonId getrelatedlessonid) {
        Iterator<T> it = onSkipToPrevious().IconCompatParcelizer(getrelatedlessonid, isCollapsible.FROM_DESERIALIZATION).iterator();
        boolean z = false;
        Object obj = null;
        while (true) {
            if (!it.hasNext()) {
                if (!z) {
                    break;
                }
            } else {
                Object next = it.next();
                if (((CourseConfigV2SettingsItems) next).MediaBrowserCompatCustomActionResultReceiver() == null) {
                    if (z) {
                        break;
                    }
                    z = true;
                    obj = next;
                }
            }
        }
        obj = null;
        CourseConfigV2SettingsItems courseConfigV2SettingsItems = (CourseConfigV2SettingsItems) obj;
        return (getHref) (courseConfigV2SettingsItems != null ? courseConfigV2SettingsItems.onPrepareFromMediaId() : null);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("deserialized ");
        sb.append(onPause() ? "expect " : "");
        sb.append("class ");
        sb.append(aQ_());
        return sb.toString();
    }

    @Override // kotlin.CourseConfigV2HomePageItems
    public final getIntroDurationSeconds RatingCompat() {
        return this.onCommand;
    }

    @Override // kotlin.CourseConfigV2CustomModuleQuestionSource, kotlin.getBadge
    public final List<getBadgeText> MediaBrowserCompatItemReceiver() {
        return this.read.MediaBrowserCompatItemReceiver().IconCompatParcelizer();
    }

    final class read extends getPearlDisplayId {
        private final PageValue<List<getBadgeText>> write;

        @Override // kotlin.getPlanAddOns
        public final boolean AudioAttributesImplApi26Parcelizer() {
            return true;
        }

        public read() {
            super(SchemaItem.this.write().AudioAttributesImplApi21Parcelizer());
            this.write = SchemaItem.this.write().AudioAttributesImplApi21Parcelizer().read(new IconCompatParcelizer(SchemaItem.this));
        }

        static final class IconCompatParcelizer extends MagicModuleUseCase implements getCreatedOnDateMs<List<? extends getBadgeText>> {
            private /* synthetic */ SchemaItem RemoteActionCompatParcelizer;

            /* JADX INFO: Access modifiers changed from: private */
            @Override // kotlin.getCreatedOnDateMs
            /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
            public List<getBadgeText> invoke() {
                return CourseResponseKeyConstantsKt.IconCompatParcelizer(this.RemoteActionCompatParcelizer);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            IconCompatParcelizer(SchemaItem schemaItem) {
                super(0);
                this.RemoteActionCompatParcelizer = schemaItem;
            }
        }

        @Override // kotlin.isHtmlPearl
        public final Collection<getLink> read() {
            String strAudioAttributesCompatParcelizer;
            getNotesCount getnotescountAudioAttributesCompatParcelizer;
            List<setActiveRecallQbankId.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver> listWrite = setTagExpiryMs.write(SchemaItem.this.onRewind(), SchemaItem.this.write().MediaBrowserCompatCustomActionResultReceiver());
            SchemaItem schemaItem = SchemaItem.this;
            ArrayList arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) listWrite, 10));
            Iterator<T> it = listWrite.iterator();
            while (it.hasNext()) {
                arrayList.add(schemaItem.write().MediaBrowserCompatItemReceiver().AudioAttributesCompatParcelizer((setActiveRecallQbankId.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) it.next()));
            }
            List listAudioAttributesCompatParcelizer = IntermediateLoginResponseBody.AudioAttributesCompatParcelizer((Collection) arrayList, (Iterable) SchemaItem.this.write().AudioAttributesCompatParcelizer().IconCompatParcelizer().read(SchemaItem.this));
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = listAudioAttributesCompatParcelizer.iterator();
            while (it2.hasNext()) {
                getQuestionLimit getquestionlimitRemoteActionCompatParcelizer = ((getLink) it2.next()).AudioAttributesImplApi21Parcelizer().RemoteActionCompatParcelizer();
                CourseConfigV2PlanScreenConfig.IconCompatParcelizer iconCompatParcelizer = getquestionlimitRemoteActionCompatParcelizer instanceof CourseConfigV2PlanScreenConfig.IconCompatParcelizer ? (CourseConfigV2PlanScreenConfig.IconCompatParcelizer) getquestionlimitRemoteActionCompatParcelizer : null;
                if (iconCompatParcelizer != null) {
                    arrayList2.add(iconCompatParcelizer);
                }
            }
            ArrayList arrayList3 = arrayList2;
            if (!arrayList3.isEmpty()) {
                getFirstAttemptTime getfirstattempttimeAudioAttributesImplBaseParcelizer = SchemaItem.this.write().AudioAttributesCompatParcelizer().AudioAttributesImplBaseParcelizer();
                SchemaItem schemaItem2 = SchemaItem.this;
                ArrayList<CourseConfigV2PlanScreenConfig.IconCompatParcelizer> arrayList4 = arrayList3;
                ArrayList arrayList5 = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) arrayList4, 10));
                for (CourseConfigV2PlanScreenConfig.IconCompatParcelizer iconCompatParcelizer2 : arrayList4) {
                    RevisionSubjectStatusModel revisionSubjectStatusModel = setLocked.read((getQuestionLimit) iconCompatParcelizer2);
                    if (revisionSubjectStatusModel == null || (getnotescountAudioAttributesCompatParcelizer = revisionSubjectStatusModel.AudioAttributesCompatParcelizer()) == null || (strAudioAttributesCompatParcelizer = getnotescountAudioAttributesCompatParcelizer.RemoteActionCompatParcelizer()) == null) {
                        strAudioAttributesCompatParcelizer = iconCompatParcelizer2.aQ_().AudioAttributesCompatParcelizer();
                    }
                    arrayList5.add(strAudioAttributesCompatParcelizer);
                }
                getfirstattempttimeAudioAttributesImplBaseParcelizer.IconCompatParcelizer(schemaItem2, arrayList5);
            }
            return IntermediateLoginResponseBody.onPlay(listAudioAttributesCompatParcelizer);
        }

        @Override // kotlin.getPlanAddOns
        public final List<getBadgeText> AudioAttributesCompatParcelizer() {
            return this.write.invoke();
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getPearlDisplayId, kotlin.setPearlType, kotlin.getPlanAddOns
        /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public SchemaItem RemoteActionCompatParcelizer() {
            return SchemaItem.this;
        }

        public final String toString() {
            String string = SchemaItem.this.aQ_().toString();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
            return string;
        }

        @Override // kotlin.isHtmlPearl
        public final CourseConfigV2VideoSubjectPageItem write() {
            return CourseConfigV2VideoSubjectPageItem.read.read;
        }
    }

    final class write extends SchemaDetailLesson {
        private final PageValue<Collection<getLink>> AudioAttributesCompatParcelizer;
        private /* synthetic */ SchemaItem IconCompatParcelizer;
        private final PageValue<Collection<getVariant>> RemoteActionCompatParcelizer;
        private final getCheapestPlan write;

        public write(SchemaItem schemaItem, getCheapestPlan getcheapestplan) {
            toMagicModuleMetaRepoModel.write(getcheapestplan, "");
            this.IconCompatParcelizer = schemaItem;
            McqTimeSpent mcqTimeSpentWrite = schemaItem.write();
            List<setActiveRecallQbankId.AudioAttributesImplApi26Parcelizer> listMediaDescriptionCompat = schemaItem.onRewind().MediaDescriptionCompat();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(listMediaDescriptionCompat, "");
            List<setActiveRecallQbankId.MediaBrowserCompatMediaItem> listOnPause = schemaItem.onRewind().onPause();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(listOnPause, "");
            List<setActiveRecallQbankId.onCommand> listOnPlayFromUri = schemaItem.onRewind().onPlayFromUri();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(listOnPlayFromUri, "");
            List<Integer> listOnFastForward = schemaItem.onRewind().onFastForward();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(listOnFastForward, "");
            List<Integer> list = listOnFastForward;
            setRatingCount setratingcountWrite = schemaItem.write().write();
            ArrayList arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(FilterItemRecordCreator.read(setratingcountWrite, ((Number) it.next()).intValue()));
            }
            super(mcqTimeSpentWrite, listMediaDescriptionCompat, listOnPause, listOnPlayFromUri, new read(arrayList));
            this.write = getcheapestplan;
            this.RemoteActionCompatParcelizer = AudioAttributesImplApi21Parcelizer().AudioAttributesImplApi21Parcelizer().read(new RemoteActionCompatParcelizer());
            this.AudioAttributesCompatParcelizer = AudioAttributesImplApi21Parcelizer().AudioAttributesImplApi21Parcelizer().read(new IconCompatParcelizer());
        }

        static final class read extends MagicModuleUseCase implements getCreatedOnDateMs<List<? extends getRelatedLessonId>> {
            private /* synthetic */ List<getRelatedLessonId> IconCompatParcelizer;

            /* JADX INFO: Access modifiers changed from: private */
            @Override // kotlin.getCreatedOnDateMs
            /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
            public List<getRelatedLessonId> invoke() {
                return this.IconCompatParcelizer;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            read(List<getRelatedLessonId> list) {
                super(0);
                this.IconCompatParcelizer = list;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final SchemaItem MediaBrowserCompatItemReceiver() {
            return this.IconCompatParcelizer;
        }

        static final class RemoteActionCompatParcelizer extends MagicModuleUseCase implements getCreatedOnDateMs<Collection<? extends getVariant>> {
            /* JADX INFO: Access modifiers changed from: private */
            @Override // kotlin.getCreatedOnDateMs
            /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
            public Collection<getVariant> invoke() {
                write writeVar = write.this;
                setOption6AnsweredCount setoption6answeredcount = setOption6AnsweredCount.write;
                setTags.RemoteActionCompatParcelizer remoteActionCompatParcelizer = setTags.read;
                return writeVar.read(setoption6answeredcount, setTags.RemoteActionCompatParcelizer.write(), isCollapsible.WHEN_GET_ALL_DESCRIPTORS);
            }

            RemoteActionCompatParcelizer() {
                super(0);
            }
        }

        static final class IconCompatParcelizer extends MagicModuleUseCase implements getCreatedOnDateMs<Collection<? extends getLink>> {
            /* JADX INFO: Access modifiers changed from: private */
            @Override // kotlin.getCreatedOnDateMs
            /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
            public Collection<getLink> invoke() {
                return write.this.write.IconCompatParcelizer(write.this.MediaBrowserCompatItemReceiver());
            }

            IconCompatParcelizer() {
                super(0);
            }
        }

        @Override // kotlin.setStatusUpdateEndTimeMs, kotlin.getMcqContentBody
        public final Collection<getVariant> read(setOption6AnsweredCount setoption6answeredcount, getAnswerMap<? super getRelatedLessonId, Boolean> getanswermap) {
            toMagicModuleMetaRepoModel.write(setoption6answeredcount, "");
            toMagicModuleMetaRepoModel.write(getanswermap, "");
            return this.RemoteActionCompatParcelizer.invoke();
        }

        @Override // kotlin.SchemaDetailLesson, kotlin.setStatusUpdateEndTimeMs, kotlin.setTags, kotlin.getMcqContentBody
        public final Collection<CourseConfigV2SupportItem> read(getRelatedLessonId getrelatedlessonid, getTimeStamp gettimestamp) {
            toMagicModuleMetaRepoModel.write(getrelatedlessonid, "");
            toMagicModuleMetaRepoModel.write(gettimestamp, "");
            RemoteActionCompatParcelizer(getrelatedlessonid, gettimestamp);
            return super.read(getrelatedlessonid, gettimestamp);
        }

        @Override // kotlin.SchemaDetailLesson, kotlin.setStatusUpdateEndTimeMs, kotlin.setTags
        public final Collection<CourseConfigV2SettingsItems> IconCompatParcelizer(getRelatedLessonId getrelatedlessonid, getTimeStamp gettimestamp) {
            toMagicModuleMetaRepoModel.write(getrelatedlessonid, "");
            toMagicModuleMetaRepoModel.write(gettimestamp, "");
            RemoteActionCompatParcelizer(getrelatedlessonid, gettimestamp);
            return super.IconCompatParcelizer(getrelatedlessonid, gettimestamp);
        }

        @Override // kotlin.SchemaDetailLesson
        protected final boolean write(CourseConfigV2SupportItem courseConfigV2SupportItem) {
            toMagicModuleMetaRepoModel.write(courseConfigV2SupportItem, "");
            return AudioAttributesImplApi21Parcelizer().AudioAttributesCompatParcelizer().handleMediaPlayPauseIfPendingOnHandler().IconCompatParcelizer(this.IconCompatParcelizer, courseConfigV2SupportItem);
        }

        @Override // kotlin.SchemaDetailLesson
        protected final void AudioAttributesCompatParcelizer(getRelatedLessonId getrelatedlessonid, List<CourseConfigV2SupportItem> list) {
            toMagicModuleMetaRepoModel.write(getrelatedlessonid, "");
            toMagicModuleMetaRepoModel.write(list, "");
            ArrayList arrayList = new ArrayList();
            Iterator<getLink> it = this.AudioAttributesCompatParcelizer.invoke().iterator();
            while (it.hasNext()) {
                arrayList.addAll(it.next().read().read(getrelatedlessonid, isCollapsible.FOR_ALREADY_TRACKED));
            }
            list.addAll(AudioAttributesImplApi21Parcelizer().AudioAttributesCompatParcelizer().IconCompatParcelizer().write(getrelatedlessonid, this.IconCompatParcelizer));
            RemoteActionCompatParcelizer(getrelatedlessonid, arrayList, list);
        }

        @Override // kotlin.SchemaDetailLesson
        protected final void read(getRelatedLessonId getrelatedlessonid, List<CourseConfigV2SettingsItems> list) {
            toMagicModuleMetaRepoModel.write(getrelatedlessonid, "");
            toMagicModuleMetaRepoModel.write(list, "");
            ArrayList arrayList = new ArrayList();
            Iterator<getLink> it = this.AudioAttributesCompatParcelizer.invoke().iterator();
            while (it.hasNext()) {
                arrayList.addAll(it.next().read().IconCompatParcelizer(getrelatedlessonid, isCollapsible.FOR_ALREADY_TRACKED));
            }
            RemoteActionCompatParcelizer(getrelatedlessonid, arrayList, list);
        }

        private final <D extends getTestHeaderTitle> void RemoteActionCompatParcelizer(getRelatedLessonId getrelatedlessonid, Collection<? extends D> collection, List<D> list) {
            AudioAttributesImplApi21Parcelizer().AudioAttributesCompatParcelizer().MediaMetadataCompat().write().RemoteActionCompatParcelizer(getrelatedlessonid, collection, new ArrayList(list), MediaBrowserCompatItemReceiver(), new C0045write(list));
        }

        /* JADX INFO: renamed from: o.SchemaItem$write$write, reason: collision with other inner class name */
        public static final class C0045write extends setAnswerDescription {
            private /* synthetic */ List<D> write;

            C0045write(List<D> list) {
                this.write = list;
            }

            /* JADX WARN: Type inference incomplete: some casts might be missing */
            @Override // kotlin.getOption4
            public final void AudioAttributesCompatParcelizer(getTestHeaderTitle gettestheadertitle) {
                toMagicModuleMetaRepoModel.write(gettestheadertitle, "");
                getOptions.RemoteActionCompatParcelizer(gettestheadertitle, (getAnswerMap<getTestHeaderTitle, getShowPopup>) null);
                this.write.add((D) gettestheadertitle);
            }

            @Override // kotlin.setAnswerDescription
            public final void read(getTestHeaderTitle gettestheadertitle, getTestHeaderTitle gettestheadertitle2) {
                toMagicModuleMetaRepoModel.write(gettestheadertitle, "");
                toMagicModuleMetaRepoModel.write(gettestheadertitle2, "");
                if (gettestheadertitle2 instanceof getIntegerMap) {
                    ((getIntegerMap) gettestheadertitle2).AudioAttributesCompatParcelizer(CourseConfigV2NavDrawerItemDownloadPdfNotes.AudioAttributesCompatParcelizer, gettestheadertitle);
                }
            }
        }

        @Override // kotlin.SchemaDetailLesson
        protected final Set<getRelatedLessonId> IconCompatParcelizer() {
            List<getLink> listAV_ = MediaBrowserCompatItemReceiver().onCustomAction.aV_();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator<T> it = listAV_.iterator();
            while (it.hasNext()) {
                IntermediateLoginResponseBody.IconCompatParcelizer((Collection) linkedHashSet, (Iterable) ((getLink) it.next()).read().aY_());
            }
            linkedHashSet.addAll(AudioAttributesImplApi21Parcelizer().AudioAttributesCompatParcelizer().IconCompatParcelizer().AudioAttributesCompatParcelizer(this.IconCompatParcelizer));
            return linkedHashSet;
        }

        @Override // kotlin.SchemaDetailLesson
        protected final Set<getRelatedLessonId> MediaBrowserCompatCustomActionResultReceiver() {
            List<getLink> listAV_ = MediaBrowserCompatItemReceiver().onCustomAction.aV_();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator<T> it = listAV_.iterator();
            while (it.hasNext()) {
                IntermediateLoginResponseBody.IconCompatParcelizer((Collection) linkedHashSet, (Iterable) ((getLink) it.next()).read().AudioAttributesCompatParcelizer());
            }
            return linkedHashSet;
        }

        @Override // kotlin.SchemaDetailLesson
        protected final Set<getRelatedLessonId> write() {
            List<getLink> listAV_ = MediaBrowserCompatItemReceiver().onCustomAction.aV_();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator<T> it = listAV_.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Set<getRelatedLessonId> setAW_ = ((getLink) it.next()).read().aW_();
                if (setAW_ == null) {
                    linkedHashSet = null;
                    break;
                }
                IntermediateLoginResponseBody.IconCompatParcelizer((Collection) linkedHashSet, (Iterable) setAW_);
            }
            return linkedHashSet;
        }

        @Override // kotlin.SchemaDetailLesson, kotlin.setStatusUpdateEndTimeMs, kotlin.getMcqContentBody
        public final getQuestionLimit AudioAttributesCompatParcelizer(getRelatedLessonId getrelatedlessonid, getTimeStamp gettimestamp) {
            CourseConfigV2CustomModuleQuestionSource courseConfigV2CustomModuleQuestionSource;
            toMagicModuleMetaRepoModel.write(getrelatedlessonid, "");
            toMagicModuleMetaRepoModel.write(gettimestamp, "");
            RemoteActionCompatParcelizer(getrelatedlessonid, gettimestamp);
            AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = MediaBrowserCompatItemReceiver().MediaBrowserCompatItemReceiver;
            return (audioAttributesCompatParcelizer == null || (courseConfigV2CustomModuleQuestionSource = audioAttributesCompatParcelizer.read(getrelatedlessonid)) == null) ? super.AudioAttributesCompatParcelizer(getrelatedlessonid, gettimestamp) : courseConfigV2CustomModuleQuestionSource;
        }

        @Override // kotlin.SchemaDetailLesson
        protected final RevisionSubjectStatusModel AudioAttributesCompatParcelizer(getRelatedLessonId getrelatedlessonid) {
            toMagicModuleMetaRepoModel.write(getrelatedlessonid, "");
            RevisionSubjectStatusModel revisionSubjectStatusModel = this.IconCompatParcelizer.write.read(getrelatedlessonid);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(revisionSubjectStatusModel, "");
            return revisionSubjectStatusModel;
        }

        @Override // kotlin.SchemaDetailLesson
        protected final void AudioAttributesCompatParcelizer(Collection<getVariant> collection, getAnswerMap<? super getRelatedLessonId, Boolean> getanswermap) {
            toMagicModuleMetaRepoModel.write(collection, "");
            toMagicModuleMetaRepoModel.write(getanswermap, "");
            AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = MediaBrowserCompatItemReceiver().MediaBrowserCompatItemReceiver;
            List listRemoteActionCompatParcelizer = audioAttributesCompatParcelizer != null ? audioAttributesCompatParcelizer.RemoteActionCompatParcelizer() : null;
            if (listRemoteActionCompatParcelizer == null) {
                listRemoteActionCompatParcelizer = IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
            }
            collection.addAll(listRemoteActionCompatParcelizer);
        }

        @Override // kotlin.setStatusUpdateEndTimeMs, kotlin.getMcqContentBody
        public final void RemoteActionCompatParcelizer(getRelatedLessonId getrelatedlessonid, getTimeStamp gettimestamp) {
            toMagicModuleMetaRepoModel.write(getrelatedlessonid, "");
            toMagicModuleMetaRepoModel.write(gettimestamp, "");
            Section.RemoteActionCompatParcelizer(AudioAttributesImplApi21Parcelizer().AudioAttributesCompatParcelizer().MediaBrowserCompatSearchResultReceiver(), gettimestamp, MediaBrowserCompatItemReceiver(), getrelatedlessonid);
        }
    }

    final class AudioAttributesCompatParcelizer {
        private final PageValue<Set<getRelatedLessonId>> IconCompatParcelizer;
        private final Map<getRelatedLessonId, setActiveRecallQbankId.AudioAttributesImplApi21Parcelizer> RemoteActionCompatParcelizer;
        private final SchemaQbankItem<getRelatedLessonId, CourseConfigV2CustomModuleQuestionSource> read;

        public AudioAttributesCompatParcelizer() {
            List<setActiveRecallQbankId.AudioAttributesImplApi21Parcelizer> listAudioAttributesImplBaseParcelizer = SchemaItem.this.onRewind().AudioAttributesImplBaseParcelizer();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(listAudioAttributesImplBaseParcelizer, "");
            List<setActiveRecallQbankId.AudioAttributesImplApi21Parcelizer> list = listAudioAttributesImplBaseParcelizer;
            LinkedHashMap linkedHashMap = new LinkedHashMap(getQues.write(VideoTimelineResponseBody.read(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) list, 10)), 16));
            for (Object obj : list) {
                linkedHashMap.put(FilterItemRecordCreator.read(SchemaItem.this.write().write(), ((setActiveRecallQbankId.AudioAttributesImplApi21Parcelizer) obj).AudioAttributesCompatParcelizer()), obj);
            }
            this.RemoteActionCompatParcelizer = linkedHashMap;
            this.read = SchemaItem.this.write().AudioAttributesImplApi21Parcelizer().IconCompatParcelizer(new RemoteActionCompatParcelizer(SchemaItem.this));
            this.IconCompatParcelizer = SchemaItem.this.write().AudioAttributesImplApi21Parcelizer().read(new read());
        }

        static final class RemoteActionCompatParcelizer extends MagicModuleUseCase implements getAnswerMap<getRelatedLessonId, CourseConfigV2CustomModuleQuestionSource> {
            private /* synthetic */ SchemaItem RemoteActionCompatParcelizer;

            /* JADX INFO: Access modifiers changed from: private */
            @Override // kotlin.getAnswerMap
            /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
            public CourseConfigV2CustomModuleQuestionSource invoke(getRelatedLessonId getrelatedlessonid) {
                getLongMap getlongmapWrite;
                toMagicModuleMetaRepoModel.write(getrelatedlessonid, "");
                setActiveRecallQbankId.AudioAttributesImplApi21Parcelizer audioAttributesImplApi21Parcelizer = (setActiveRecallQbankId.AudioAttributesImplApi21Parcelizer) AudioAttributesCompatParcelizer.this.RemoteActionCompatParcelizer.get(getrelatedlessonid);
                if (audioAttributesImplApi21Parcelizer != null) {
                    SchemaItem schemaItem = this.RemoteActionCompatParcelizer;
                    getlongmapWrite = getLongMap.write(schemaItem.write().AudioAttributesImplApi21Parcelizer(), schemaItem, getrelatedlessonid, AudioAttributesCompatParcelizer.this.IconCompatParcelizer, new getUserContext(schemaItem.write().AudioAttributesImplApi21Parcelizer(), new IconCompatParcelizer(schemaItem, audioAttributesImplApi21Parcelizer)), getIntroDurationSeconds.AudioAttributesCompatParcelizer);
                } else {
                    getlongmapWrite = null;
                }
                return getlongmapWrite;
            }

            static final class IconCompatParcelizer extends MagicModuleUseCase implements getCreatedOnDateMs<List<? extends dummyEditor>> {
                private /* synthetic */ SchemaItem AudioAttributesCompatParcelizer;
                private /* synthetic */ setActiveRecallQbankId.AudioAttributesImplApi21Parcelizer write;

                /* JADX INFO: Access modifiers changed from: private */
                @Override // kotlin.getCreatedOnDateMs
                /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
                public List<dummyEditor> invoke() {
                    return IntermediateLoginResponseBody.onPlay(this.AudioAttributesCompatParcelizer.write().AudioAttributesCompatParcelizer().AudioAttributesCompatParcelizer().read(this.AudioAttributesCompatParcelizer.onPrepareFromUri(), this.write));
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                IconCompatParcelizer(SchemaItem schemaItem, setActiveRecallQbankId.AudioAttributesImplApi21Parcelizer audioAttributesImplApi21Parcelizer) {
                    super(0);
                    this.AudioAttributesCompatParcelizer = schemaItem;
                    this.write = audioAttributesImplApi21Parcelizer;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            RemoteActionCompatParcelizer(SchemaItem schemaItem) {
                super(1);
                this.RemoteActionCompatParcelizer = schemaItem;
            }
        }

        static final class read extends MagicModuleUseCase implements getCreatedOnDateMs<Set<? extends getRelatedLessonId>> {
            /* JADX INFO: Access modifiers changed from: private */
            @Override // kotlin.getCreatedOnDateMs
            /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
            public Set<getRelatedLessonId> invoke() {
                return AudioAttributesCompatParcelizer.this.IconCompatParcelizer();
            }

            read() {
                super(0);
            }
        }

        public final CourseConfigV2CustomModuleQuestionSource read(getRelatedLessonId getrelatedlessonid) {
            toMagicModuleMetaRepoModel.write(getrelatedlessonid, "");
            return this.read.invoke(getrelatedlessonid);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Set<getRelatedLessonId> IconCompatParcelizer() {
            HashSet hashSet = new HashSet();
            Iterator<getLink> it = SchemaItem.this.MediaBrowserCompatSearchResultReceiver().aV_().iterator();
            while (it.hasNext()) {
                for (getVariant getvariant : getMcqContentBody.IconCompatParcelizer.RemoteActionCompatParcelizer(it.next().read(), null, null, 3)) {
                    if ((getvariant instanceof CourseConfigV2SupportItem) || (getvariant instanceof CourseConfigV2SettingsItems)) {
                        hashSet.add(getvariant.aQ_());
                    }
                }
            }
            List<setActiveRecallQbankId.AudioAttributesImplApi26Parcelizer> listMediaDescriptionCompat = SchemaItem.this.onRewind().MediaDescriptionCompat();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(listMediaDescriptionCompat, "");
            SchemaItem schemaItem = SchemaItem.this;
            Iterator<T> it2 = listMediaDescriptionCompat.iterator();
            while (it2.hasNext()) {
                hashSet.add(FilterItemRecordCreator.read(schemaItem.write().write(), ((setActiveRecallQbankId.AudioAttributesImplApi26Parcelizer) it2.next()).AudioAttributesImplBaseParcelizer()));
            }
            HashSet hashSet2 = hashSet;
            HashSet hashSet3 = hashSet2;
            List<setActiveRecallQbankId.MediaBrowserCompatMediaItem> listOnPause = SchemaItem.this.onRewind().onPause();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(listOnPause, "");
            SchemaItem schemaItem2 = SchemaItem.this;
            Iterator<T> it3 = listOnPause.iterator();
            while (it3.hasNext()) {
                hashSet2.add(FilterItemRecordCreator.read(schemaItem2.write().write(), ((setActiveRecallQbankId.MediaBrowserCompatMediaItem) it3.next()).MediaBrowserCompatItemReceiver()));
            }
            return getKycMessage.RemoteActionCompatParcelizer(hashSet3, hashSet2);
        }

        public final Collection<CourseConfigV2CustomModuleQuestionSource> RemoteActionCompatParcelizer() {
            Set<getRelatedLessonId> setKeySet = this.RemoteActionCompatParcelizer.keySet();
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = setKeySet.iterator();
            while (it.hasNext()) {
                CourseConfigV2CustomModuleQuestionSource courseConfigV2CustomModuleQuestionSource = read((getRelatedLessonId) it.next());
                if (courseConfigV2CustomModuleQuestionSource != null) {
                    arrayList.add(courseConfigV2CustomModuleQuestionSource);
                }
            }
            return arrayList;
        }
    }
}
