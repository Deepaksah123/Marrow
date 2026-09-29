package kotlin;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.CourseConfigV2NavDrawerItems;
import kotlin.CourseConfigV2PlanScreenConfig;
import kotlin.getGroupDescription;
import kotlin.getMainSettings;

/* JADX INFO: loaded from: classes4.dex */
public final class setVideoModels extends toMap implements setStartDateTime {
    private final getFeaturedCards AudioAttributesCompatParcelizer;
    private final isPaused AudioAttributesImplApi21Parcelizer;
    private final McqIndexMini AudioAttributesImplApi26Parcelizer;
    private final PageValue<List<getBadgeText>> AudioAttributesImplBaseParcelizer;
    private final boolean MediaBrowserCompatCustomActionResultReceiver;
    private final getQuestionSource MediaBrowserCompatItemReceiver;
    private final CourseConfigV2NavDrawerItems MediaBrowserCompatMediaItem;
    private final getFeaturedCards MediaBrowserCompatSearchResultReceiver;
    private final DataSet MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    private final getMainSettings<getMainModel> MediaDescriptionCompat;
    private final RecentUpdatesImageCreator MediaMetadataCompat;
    private final RenewEligible RatingCompat;
    private final RemoteActionCompatParcelizer onAddQueueItem;
    private final getMainModel onCustomAction;
    private final getQuote read;
    private final CourseConfigV2CustomModuleQuestionSource write;

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

    public /* synthetic */ setVideoModels(getFeaturedCards getfeaturedcards, getVariant getvariant, isPaused ispaused) {
        this(getfeaturedcards, getvariant, ispaused, null);
    }

    public final getFeaturedCards onRemoveQueueItemAt() {
        return this.MediaBrowserCompatSearchResultReceiver;
    }

    public final isPaused onRewind() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private setVideoModels(getFeaturedCards getfeaturedcards, getVariant getvariant, isPaused ispaused, CourseConfigV2CustomModuleQuestionSource courseConfigV2CustomModuleQuestionSource) {
        getQuestionSource getquestionsource;
        CourseConfigV2NavDrawerItems courseConfigV2NavDrawerItemsWrite;
        super(getfeaturedcards.read(), getvariant, ispaused.RatingCompat(), getfeaturedcards.IconCompatParcelizer().MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver().write(ispaused), false);
        toMagicModuleMetaRepoModel.write(getfeaturedcards, "");
        toMagicModuleMetaRepoModel.write(getvariant, "");
        toMagicModuleMetaRepoModel.write(ispaused, "");
        this.MediaBrowserCompatSearchResultReceiver = getfeaturedcards;
        this.AudioAttributesImplApi21Parcelizer = ispaused;
        this.write = courseConfigV2CustomModuleQuestionSource;
        getFeaturedCards getfeaturedcardsAudioAttributesCompatParcelizer = FilterParams.AudioAttributesCompatParcelizer(getfeaturedcards, this, ispaused, 4);
        this.AudioAttributesCompatParcelizer = getfeaturedcardsAudioAttributesCompatParcelizer;
        setVideoModels setvideomodels = this;
        getfeaturedcardsAudioAttributesCompatParcelizer.IconCompatParcelizer().AudioAttributesImplBaseParcelizer().read(ispaused);
        this.RatingCompat = getRenewExpiresOn.RemoteActionCompatParcelizer(new read());
        if (ispaused.onAddQueueItem()) {
            getquestionsource = getQuestionSource.ANNOTATION_CLASS;
        } else if (ispaused.onPlay()) {
            getquestionsource = getQuestionSource.INTERFACE;
        } else {
            getquestionsource = ispaused.onFastForward() ? getQuestionSource.ENUM_CLASS : getQuestionSource.CLASS;
        }
        this.MediaBrowserCompatItemReceiver = getquestionsource;
        if (ispaused.onAddQueueItem() || ispaused.onFastForward()) {
            courseConfigV2NavDrawerItemsWrite = CourseConfigV2NavDrawerItems.FINAL;
        } else {
            CourseConfigV2NavDrawerItems.write writeVar = CourseConfigV2NavDrawerItems.write;
            courseConfigV2NavDrawerItemsWrite = CourseConfigV2NavDrawerItems.write.write(ispaused.onMediaButtonEvent(), ispaused.onMediaButtonEvent() || ispaused.handleMediaPlayPauseIfPendingOnHandler() || ispaused.onPlay(), !ispaused.onPlayFromMediaId());
        }
        this.MediaBrowserCompatMediaItem = courseConfigV2NavDrawerItemsWrite;
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = ispaused.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
        this.MediaBrowserCompatCustomActionResultReceiver = (ispaused.MediaDescriptionCompat() == null || ispaused.onPlayFromUri()) ? false : true;
        this.onAddQueueItem = new RemoteActionCompatParcelizer();
        getMainModel getmainmodel = new getMainModel(getfeaturedcardsAudioAttributesCompatParcelizer, setvideomodels, ispaused, courseConfigV2CustomModuleQuestionSource != null);
        this.onCustomAction = getmainmodel;
        getMainSettings.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = getMainSettings.write;
        this.MediaDescriptionCompat = getMainSettings.AudioAttributesCompatParcelizer.IconCompatParcelizer(setvideomodels, getfeaturedcardsAudioAttributesCompatParcelizer.read(), getfeaturedcardsAudioAttributesCompatParcelizer.IconCompatParcelizer().RatingCompat().RemoteActionCompatParcelizer(), new AudioAttributesImplApi26Parcelizer());
        this.AudioAttributesImplApi26Parcelizer = new McqIndexMini(getmainmodel);
        this.MediaMetadataCompat = new RecentUpdatesImageCreator(getfeaturedcardsAudioAttributesCompatParcelizer, ispaused, this);
        this.read = fromVideo.write(getfeaturedcardsAudioAttributesCompatParcelizer, ispaused);
        this.AudioAttributesImplBaseParcelizer = getfeaturedcardsAudioAttributesCompatParcelizer.read().read(new IconCompatParcelizer());
    }

    public static final class write {
        private write() {
        }

        public /* synthetic */ write(byte b) {
            this();
        }
    }

    static {
        new write((byte) 0);
        getKycMessage.IconCompatParcelizer("equals", "hashCode", "getClass", "wait", "notify", "notifyAll", "toString");
    }

    static final class read extends MagicModuleUseCase implements getCreatedOnDateMs<List<? extends RecentUpdatesReferences>> {
        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public List<RecentUpdatesReferences> invoke() {
            RevisionSubjectStatusModel revisionSubjectStatusModel = setLocked.read((getQuestionLimit) setVideoModels.this);
            if (revisionSubjectStatusModel != null) {
                return setVideoModels.this.onRemoveQueueItemAt().IconCompatParcelizer().AudioAttributesImplApi21Parcelizer().AudioAttributesCompatParcelizer(revisionSubjectStatusModel);
            }
            return null;
        }

        read() {
            super(0);
        }
    }

    public final List<RecentUpdatesReferences> onPrepareFromUri() {
        return (List) this.RatingCompat.RemoteActionCompatParcelizer();
    }

    @Override // kotlin.CourseConfigV2CustomModuleQuestionSource
    public final getQuestionSource AudioAttributesImplBaseParcelizer() {
        return this.MediaBrowserCompatItemReceiver;
    }

    @Override // kotlin.CourseConfigV2CustomModuleQuestionSource, kotlin.CourseConfigV2NavDrawerItemYourCourse
    public final CourseConfigV2NavDrawerItems MediaBrowserCompatMediaItem() {
        return this.MediaBrowserCompatMediaItem;
    }

    public static final class AudioAttributesCompatParcelizer<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return getConfigExpirySeconds.read(setLocked.write((CourseConfigV2CustomModuleQuestionSource) t).RemoteActionCompatParcelizer(), setLocked.write((CourseConfigV2CustomModuleQuestionSource) t2).RemoteActionCompatParcelizer());
        }
    }

    @Override // kotlin.CourseConfigV2CustomModuleQuestionSource, kotlin.CourseConfigV2NavDrawerItemYourCourse, kotlin.getSubText
    public final CourseConfigV2NavDrawerItemFreeExtension onCustomAction() {
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, CourseConfigV2NavDrawerItemFaq.AudioAttributesImplBaseParcelizer) && this.AudioAttributesImplApi21Parcelizer.MediaDescriptionCompat() == null) {
            CourseConfigV2NavDrawerItemFreeExtension courseConfigV2NavDrawerItemFreeExtension = NestfputmThumbnailHeight.write;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(courseConfigV2NavDrawerItemFreeExtension, "");
            return courseConfigV2NavDrawerItemFreeExtension;
        }
        return getModuleMessage.IconCompatParcelizer(this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
    }

    @Override // kotlin.getBadge
    public final boolean onPrepareFromSearch() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    @Override // kotlin.getQuestionLimit
    public final getPlanAddOns MediaBrowserCompatSearchResultReceiver() {
        return this.onAddQueueItem;
    }

    static final class AudioAttributesImplApi26Parcelizer extends MagicModuleUseCase implements getAnswerMap<getCheapestPlan, getMainModel> {
        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public getMainModel invoke(getCheapestPlan getcheapestplan) {
            toMagicModuleMetaRepoModel.write(getcheapestplan, "");
            getFeaturedCards getfeaturedcards = setVideoModels.this.AudioAttributesCompatParcelizer;
            setVideoModels setvideomodels = setVideoModels.this;
            return new getMainModel(getfeaturedcards, setvideomodels, setvideomodels.onRewind(), setVideoModels.this.write != null, setVideoModels.this.onCustomAction);
        }

        AudioAttributesImplApi26Parcelizer() {
            super(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.getStringArrayMap
    /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
    public getMainModel IconCompatParcelizer(getCheapestPlan getcheapestplan) {
        toMagicModuleMetaRepoModel.write(getcheapestplan, "");
        return (getMainModel) this.MediaDescriptionCompat.read(getcheapestplan);
    }

    @Override // kotlin.FeaturedCardLabel, kotlin.CourseConfigV2CustomModuleQuestionSource
    public final setTags onSeekTo() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    @Override // kotlin.CourseConfigV2CustomModuleQuestionSource
    public final setTags MediaMetadataCompat() {
        return this.MediaMetadataCompat;
    }

    @Override // kotlin.FeaturedCardLabel, kotlin.CourseConfigV2CustomModuleQuestionSource
    /* JADX INFO: renamed from: onSetRating, reason: merged with bridge method [inline-methods] */
    public final getMainModel onRemoveQueueItem() {
        setTags settagsOnRemoveQueueItem = super.onRemoveQueueItem();
        toMagicModuleMetaRepoModel.read(settagsOnRemoveQueueItem, "");
        return (getMainModel) settagsOnRemoveQueueItem;
    }

    @Override // kotlin.CourseConfigV2CustomModuleQuestionSource
    /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
    public final List<CourseConfigV2EditionSwitch> MediaBrowserCompatCustomActionResultReceiver() {
        return this.onCustomAction.IconCompatParcelizer().invoke();
    }

    @Override // kotlin.fromJSONArray
    public final getQuote RemoteActionCompatParcelizer() {
        return this.read;
    }

    static final class IconCompatParcelizer extends MagicModuleUseCase implements getCreatedOnDateMs<List<? extends getBadgeText>> {
        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public List<getBadgeText> invoke() {
            List<setStartTimeStamp> listOnCommand = setVideoModels.this.onRewind().onCommand();
            setVideoModels setvideomodels = setVideoModels.this;
            ArrayList arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) listOnCommand, 10));
            for (setStartTimeStamp setstarttimestamp : listOnCommand) {
                getBadgeText getbadgetextWrite = setvideomodels.AudioAttributesCompatParcelizer.MediaBrowserCompatItemReceiver().write(setstarttimestamp);
                if (getbadgetextWrite == null) {
                    StringBuilder sb = new StringBuilder("Parameter ");
                    sb.append(setstarttimestamp);
                    sb.append(" surely belongs to class ");
                    sb.append(setvideomodels.onRewind());
                    sb.append(", so it must be resolved");
                    throw new AssertionError(sb.toString());
                }
                arrayList.add(getbadgetextWrite);
            }
            return arrayList;
        }

        IconCompatParcelizer() {
            super(0);
        }
    }

    @Override // kotlin.CourseConfigV2CustomModuleQuestionSource, kotlin.getBadge
    public final List<getBadgeText> MediaBrowserCompatItemReceiver() {
        return this.AudioAttributesImplBaseParcelizer.invoke();
    }

    @Override // kotlin.CourseConfigV2CustomModuleQuestionSource
    public final Collection<CourseConfigV2CustomModuleQuestionSource> MediaDescriptionCompat() {
        if (this.MediaBrowserCompatMediaItem == CourseConfigV2NavDrawerItems.SEALED) {
            RecentUpdatesLastSyncedModel recentUpdatesLastSyncedModel = getPublishedOnMs.read(setGroupSubttile.COMMON, false, false, null, 7);
            Collection<QbankSubModel> collectionMediaBrowserCompatSearchResultReceiver = this.AudioAttributesImplApi21Parcelizer.MediaBrowserCompatSearchResultReceiver();
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = collectionMediaBrowserCompatSearchResultReceiver.iterator();
            while (it.hasNext()) {
                getQuestionLimit getquestionlimitRemoteActionCompatParcelizer = this.AudioAttributesCompatParcelizer.AudioAttributesImplApi21Parcelizer().read((QbankSubModel) it.next(), recentUpdatesLastSyncedModel).AudioAttributesImplApi21Parcelizer().RemoteActionCompatParcelizer();
                CourseConfigV2CustomModuleQuestionSource courseConfigV2CustomModuleQuestionSource = getquestionlimitRemoteActionCompatParcelizer instanceof CourseConfigV2CustomModuleQuestionSource ? (CourseConfigV2CustomModuleQuestionSource) getquestionlimitRemoteActionCompatParcelizer : null;
                if (courseConfigV2CustomModuleQuestionSource != null) {
                    arrayList.add(courseConfigV2CustomModuleQuestionSource);
                }
            }
            return IntermediateLoginResponseBody.AudioAttributesCompatParcelizer((Iterable) arrayList, (Comparator) new AudioAttributesCompatParcelizer());
        }
        return IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Lazy Java class ");
        sb.append(setLocked.read((getVariant) this));
        return sb.toString();
    }

    final class RemoteActionCompatParcelizer extends getPearlDisplayId {
        private final PageValue<List<getBadgeText>> RemoteActionCompatParcelizer;

        @Override // kotlin.getPlanAddOns
        public final boolean AudioAttributesImplApi26Parcelizer() {
            return true;
        }

        public RemoteActionCompatParcelizer() {
            super(setVideoModels.this.AudioAttributesCompatParcelizer.read());
            this.RemoteActionCompatParcelizer = setVideoModels.this.AudioAttributesCompatParcelizer.read().read(new IconCompatParcelizer(setVideoModels.this));
        }

        @Override // kotlin.getPearlDisplayId, kotlin.setPearlType, kotlin.getPlanAddOns
        public final /* synthetic */ getQuestionLimit RemoteActionCompatParcelizer() {
            return RemoteActionCompatParcelizer();
        }

        static final class IconCompatParcelizer extends MagicModuleUseCase implements getCreatedOnDateMs<List<? extends getBadgeText>> {
            private /* synthetic */ setVideoModels AudioAttributesCompatParcelizer;

            /* JADX INFO: Access modifiers changed from: private */
            @Override // kotlin.getCreatedOnDateMs
            /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
            public List<getBadgeText> invoke() {
                return CourseResponseKeyConstantsKt.IconCompatParcelizer(this.AudioAttributesCompatParcelizer);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            IconCompatParcelizer(setVideoModels setvideomodels) {
                super(0);
                this.AudioAttributesCompatParcelizer = setvideomodels;
            }
        }

        @Override // kotlin.getPlanAddOns
        public final List<getBadgeText> AudioAttributesCompatParcelizer() {
            return this.RemoteActionCompatParcelizer.invoke();
        }

        @Override // kotlin.isHtmlPearl
        public final Collection<getLink> read() {
            Collection<QbankSubModel> collectionOnCustomAction = setVideoModels.this.onRewind().onCustomAction();
            ArrayList arrayList = new ArrayList(collectionOnCustomAction.size());
            ArrayList arrayList2 = new ArrayList(0);
            getLink getlinkAudioAttributesImplBaseParcelizer = AudioAttributesImplBaseParcelizer();
            Iterator<QbankSubModel> it = collectionOnCustomAction.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                QbankSubModel next = it.next();
                getLink getlinkWrite = setVideoModels.this.AudioAttributesCompatParcelizer.IconCompatParcelizer().onCommand().write(setVideoModels.this.AudioAttributesCompatParcelizer.AudioAttributesImplApi21Parcelizer().read(next, getPublishedOnMs.read(setGroupSubttile.SUPERTYPE, false, false, null, 7)), setVideoModels.this.AudioAttributesCompatParcelizer);
                if (getlinkWrite.AudioAttributesImplApi21Parcelizer().RemoteActionCompatParcelizer() instanceof CourseConfigV2PlanScreenConfig.IconCompatParcelizer) {
                    arrayList2.add(next);
                }
                if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(getlinkWrite.AudioAttributesImplApi21Parcelizer(), getlinkAudioAttributesImplBaseParcelizer != null ? getlinkAudioAttributesImplBaseParcelizer.AudioAttributesImplApi21Parcelizer() : null) && !getTestTabItems.write(getlinkWrite)) {
                    arrayList.add(getlinkWrite);
                }
            }
            ArrayList arrayList3 = arrayList;
            CourseConfigV2CustomModuleQuestionSource courseConfigV2CustomModuleQuestionSource = setVideoModels.this.write;
            SubjectGroupTypeConstant.write(arrayList3, courseConfigV2CustomModuleQuestionSource != null ? getSearchHint.write(courseConfigV2CustomModuleQuestionSource, setVideoModels.this).AudioAttributesImplBaseParcelizer().IconCompatParcelizer(courseConfigV2CustomModuleQuestionSource.aP_(), getTotalSubject.INVARIANT) : null);
            SubjectGroupTypeConstant.write(arrayList3, getlinkAudioAttributesImplBaseParcelizer);
            if (!arrayList2.isEmpty()) {
                getFirstAttemptTime getfirstattempttime = setVideoModels.this.AudioAttributesCompatParcelizer.IconCompatParcelizer().read();
                CourseConfigV2CustomModuleQuestionSource courseConfigV2CustomModuleQuestionSourceRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
                ArrayList<setQuestionCount> arrayList4 = arrayList2;
                ArrayList arrayList5 = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) arrayList4, 10));
                for (setQuestionCount setquestioncount : arrayList4) {
                    toMagicModuleMetaRepoModel.read(setquestioncount, "");
                    arrayList5.add(((QbankSubModel) setquestioncount).MediaBrowserCompatItemReceiver());
                }
                getfirstattempttime.IconCompatParcelizer(courseConfigV2CustomModuleQuestionSourceRemoteActionCompatParcelizer, arrayList5);
            }
            return !arrayList3.isEmpty() ? IntermediateLoginResponseBody.onPlay(arrayList) : IntermediateLoginResponseBody.RemoteActionCompatParcelizer(setVideoModels.this.AudioAttributesCompatParcelizer.write().write().write());
        }

        private final getLink AudioAttributesImplBaseParcelizer() {
            getNotesCount getnotescount;
            ArrayList arrayList;
            getNotesCount getnotescountAudioAttributesImplApi21Parcelizer = AudioAttributesImplApi21Parcelizer();
            if (getnotescountAudioAttributesImplApi21Parcelizer == null || getnotescountAudioAttributesImplApi21Parcelizer.read() || !getnotescountAudioAttributesImplApi21Parcelizer.AudioAttributesCompatParcelizer(getZenArea.RemoteActionCompatParcelizer)) {
                getnotescountAudioAttributesImplApi21Parcelizer = null;
            }
            if (getnotescountAudioAttributesImplApi21Parcelizer == null) {
                NestfputmEditorDetail nestfputmEditorDetail = NestfputmEditorDetail.write;
                getnotescount = NestfputmEditorDetail.read(setLocked.write(setVideoModels.this));
                if (getnotescount == null) {
                    return null;
                }
            } else {
                getnotescount = getnotescountAudioAttributesImplApi21Parcelizer;
            }
            CourseConfigV2CustomModuleQuestionSource courseConfigV2CustomModuleQuestionSourceAudioAttributesCompatParcelizer = setLocked.AudioAttributesCompatParcelizer(setVideoModels.this.AudioAttributesCompatParcelizer.write(), getnotescount, isCollapsible.FROM_JAVA_LOADER);
            if (courseConfigV2CustomModuleQuestionSourceAudioAttributesCompatParcelizer == null) {
                return null;
            }
            int size = courseConfigV2CustomModuleQuestionSourceAudioAttributesCompatParcelizer.MediaBrowserCompatSearchResultReceiver().AudioAttributesCompatParcelizer().size();
            List<getBadgeText> listAudioAttributesCompatParcelizer = setVideoModels.this.MediaBrowserCompatSearchResultReceiver().AudioAttributesCompatParcelizer();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(listAudioAttributesCompatParcelizer, "");
            int size2 = listAudioAttributesCompatParcelizer.size();
            if (size2 == size) {
                List<getBadgeText> list = listAudioAttributesCompatParcelizer;
                ArrayList arrayList2 = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList2.add(new isIndividualPlan(getTotalSubject.INVARIANT, ((getBadgeText) it.next()).aP_()));
                }
                arrayList = arrayList2;
            } else {
                if (size2 != 1 || size <= 1 || getnotescountAudioAttributesImplApi21Parcelizer != null) {
                    return null;
                }
                isIndividualPlan isindividualplan = new isIndividualPlan(getTotalSubject.INVARIANT, ((getBadgeText) IntermediateLoginResponseBody.onCommand((List) listAudioAttributesCompatParcelizer)).aP_());
                newEncryptedObject newencryptedobject = new newEncryptedObject(1, size);
                ArrayList arrayList3 = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer(newencryptedobject, 10));
                Iterator<Integer> it2 = newencryptedobject.iterator();
                while (it2.hasNext()) {
                    ((getSINGLE_SYNC_RESULT) it2).RemoteActionCompatParcelizer();
                    arrayList3.add(isindividualplan);
                }
                arrayList = arrayList3;
            }
            getGroupDescription.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = getGroupDescription.AudioAttributesCompatParcelizer;
            return AddOnMetaKt.write(getGroupDescription.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(), courseConfigV2CustomModuleQuestionSourceAudioAttributesCompatParcelizer, arrayList);
        }

        private final getNotesCount AudioAttributesImplApi21Parcelizer() {
            String strAudioAttributesCompatParcelizer;
            getQuote getquoteRemoteActionCompatParcelizer = setVideoModels.this.RemoteActionCompatParcelizer();
            getNotesCount getnotescount = getPsshData.MediaDescriptionCompat;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getnotescount, "");
            dummyEditor dummyeditorIconCompatParcelizer = getquoteRemoteActionCompatParcelizer.IconCompatParcelizer(getnotescount);
            if (dummyeditorIconCompatParcelizer == null) {
                return null;
            }
            Object objOnCommand = IntermediateLoginResponseBody.onCommand(dummyeditorIconCompatParcelizer.read().values());
            getStatusUpdateEndTimeMs getstatusupdateendtimems = objOnCommand instanceof getStatusUpdateEndTimeMs ? (getStatusUpdateEndTimeMs) objOnCommand : null;
            if (getstatusupdateendtimems == null || (strAudioAttributesCompatParcelizer = getstatusupdateendtimems.AudioAttributesCompatParcelizer()) == null || !StepIndex.read(strAudioAttributesCompatParcelizer)) {
                return null;
            }
            return new getNotesCount(strAudioAttributesCompatParcelizer);
        }

        @Override // kotlin.isHtmlPearl
        public final CourseConfigV2VideoSubjectPageItem write() {
            return setVideoModels.this.AudioAttributesCompatParcelizer.IconCompatParcelizer().onMediaButtonEvent();
        }

        @Override // kotlin.getPearlDisplayId
        /* JADX INFO: renamed from: IconCompatParcelizer */
        public final CourseConfigV2CustomModuleQuestionSource RemoteActionCompatParcelizer() {
            return setVideoModels.this;
        }

        public final String toString() {
            String strAudioAttributesCompatParcelizer = setVideoModels.this.aQ_().AudioAttributesCompatParcelizer();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strAudioAttributesCompatParcelizer, "");
            return strAudioAttributesCompatParcelizer;
        }
    }

    public final setVideoModels AudioAttributesCompatParcelizer(setModuleMessage setmodulemessage, CourseConfigV2CustomModuleQuestionSource courseConfigV2CustomModuleQuestionSource) {
        toMagicModuleMetaRepoModel.write(setmodulemessage, "");
        getFeaturedCards getfeaturedcards = this.AudioAttributesCompatParcelizer;
        getFeaturedCards getfeaturedcardsWrite = FilterParams.write(getfeaturedcards, getfeaturedcards.IconCompatParcelizer().read(setmodulemessage));
        getVariant getvariantAudioAttributesImplApi21Parcelizer = onPlayFromMediaId();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getvariantAudioAttributesImplApi21Parcelizer, "");
        return new setVideoModels(getfeaturedcardsWrite, getvariantAudioAttributesImplApi21Parcelizer, this.AudioAttributesImplApi21Parcelizer, courseConfigV2CustomModuleQuestionSource);
    }
}
