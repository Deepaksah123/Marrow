package kotlin;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.getQuote;
import kotlin.getTestHeaderTitle;

/* JADX INFO: loaded from: classes4.dex */
public final class getCompletenessScore extends getIntegerMap implements SchemaUserStatus {
    public static final read read;
    private final getMini IconCompatParcelizer;
    private final SchemaLessonStatusResponse MediaBrowserCompatCustomActionResultReceiver;
    private CourseConfigV2EditionSwitch RemoteActionCompatParcelizer;
    private final CourseConfigV2VideoProperties write;

    @Override // kotlin.getIntegerMap
    public final /* synthetic */ getIntegerMap read(getVariant getvariant, CourseConfigV2NavDrawerItemRateUs courseConfigV2NavDrawerItemRateUs, getTestHeaderTitle.RemoteActionCompatParcelizer remoteActionCompatParcelizer, getRelatedLessonId getrelatedlessonid, getQuote getquote, getIntroDurationSeconds getintrodurationseconds) {
        return write(getvariant, remoteActionCompatParcelizer, getquote, getintrodurationseconds);
    }

    @Override // kotlin.getIntegerMap, kotlin.getTestHeaderTitle
    public final /* synthetic */ getTestHeaderTitle write(getVariant getvariant, CourseConfigV2NavDrawerItems courseConfigV2NavDrawerItems, CourseConfigV2NavDrawerItemFreeExtension courseConfigV2NavDrawerItemFreeExtension, getTestHeaderTitle.RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        return AudioAttributesCompatParcelizer(getvariant, courseConfigV2NavDrawerItems, courseConfigV2NavDrawerItemFreeExtension, remoteActionCompatParcelizer, false);
    }

    public final getMini onRemoveQueueItem() {
        return this.IconCompatParcelizer;
    }

    public final CourseConfigV2VideoProperties onSetPlaybackSpeed() {
        return this.write;
    }

    private getCompletenessScore(getMini getmini, CourseConfigV2VideoProperties courseConfigV2VideoProperties, CourseConfigV2EditionSwitch courseConfigV2EditionSwitch, SchemaUserStatus schemaUserStatus, getQuote getquote, getTestHeaderTitle.RemoteActionCompatParcelizer remoteActionCompatParcelizer, getIntroDurationSeconds getintrodurationseconds) {
        super(courseConfigV2VideoProperties, schemaUserStatus, getquote, getVideoMetaEncrypt.AudioAttributesCompatParcelizer, remoteActionCompatParcelizer, getintrodurationseconds);
        this.IconCompatParcelizer = getmini;
        this.write = courseConfigV2VideoProperties;
        IconCompatParcelizer(onSetPlaybackSpeed().onCommand());
        this.MediaBrowserCompatCustomActionResultReceiver = getmini.AudioAttributesCompatParcelizer(new write(courseConfigV2EditionSwitch));
        this.RemoteActionCompatParcelizer = courseConfigV2EditionSwitch;
    }

    static {
        new isResolutionNotSupported[1][0] = toMagicModuleMetaDataUcModel.write(new downloadMagicModuleMetalambda0(toMagicModuleMetaDataUcModel.write(getCompletenessScore.class), "withDispatchReceiver", "getWithDispatchReceiver()Lorg/jetbrains/kotlin/descriptors/impl/TypeAliasConstructorDescriptor;"));
        read = new read((byte) 0);
    }

    static final class write extends MagicModuleUseCase implements getCreatedOnDateMs<getCompletenessScore> {
        private /* synthetic */ CourseConfigV2EditionSwitch IconCompatParcelizer;

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public getCompletenessScore invoke() {
            getMini getminiOnRemoveQueueItem = getCompletenessScore.this.onRemoveQueueItem();
            CourseConfigV2VideoProperties courseConfigV2VideoPropertiesOnSetPlaybackSpeed = getCompletenessScore.this.onSetPlaybackSpeed();
            CourseConfigV2EditionSwitch courseConfigV2EditionSwitch = this.IconCompatParcelizer;
            getCompletenessScore getcompletenessscore = getCompletenessScore.this;
            getQuote getquoteRemoteActionCompatParcelizer = courseConfigV2EditionSwitch.RemoteActionCompatParcelizer();
            getTestHeaderTitle.RemoteActionCompatParcelizer remoteActionCompatParcelizerHandleMediaPlayPauseIfPendingOnHandler = this.IconCompatParcelizer.handleMediaPlayPauseIfPendingOnHandler();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(remoteActionCompatParcelizerHandleMediaPlayPauseIfPendingOnHandler, "");
            getIntroDurationSeconds getintrodurationsecondsRatingCompat = getCompletenessScore.this.onSetPlaybackSpeed().RatingCompat();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getintrodurationsecondsRatingCompat, "");
            getCompletenessScore getcompletenessscore2 = new getCompletenessScore(getminiOnRemoveQueueItem, courseConfigV2VideoPropertiesOnSetPlaybackSpeed, courseConfigV2EditionSwitch, getcompletenessscore, getquoteRemoteActionCompatParcelizer, remoteActionCompatParcelizerHandleMediaPlayPauseIfPendingOnHandler, getintrodurationsecondsRatingCompat, (byte) 0);
            getCompletenessScore getcompletenessscore3 = getCompletenessScore.this;
            CourseConfigV2EditionSwitch courseConfigV2EditionSwitch2 = this.IconCompatParcelizer;
            read readVar = getCompletenessScore.read;
            setDesriptionList setdesriptionlistRemoteActionCompatParcelizer = read.RemoteActionCompatParcelizer(getcompletenessscore3.onSetPlaybackSpeed());
            if (setdesriptionlistRemoteActionCompatParcelizer == null) {
                return null;
            }
            CourseConfigV2TestTabItem courseConfigV2TestTabItemWrite = courseConfigV2EditionSwitch2.write();
            CourseConfigV2TestTabItem courseConfigV2TestTabItemWrite2 = courseConfigV2TestTabItemWrite != null ? courseConfigV2TestTabItemWrite.write(setdesriptionlistRemoteActionCompatParcelizer) : null;
            List<CourseConfigV2TestTabItem> list = courseConfigV2EditionSwitch2.read();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(list, "");
            List<CourseConfigV2TestTabItem> list2 = list;
            ArrayList arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(((CourseConfigV2TestTabItem) it.next()).write(setdesriptionlistRemoteActionCompatParcelizer));
            }
            getcompletenessscore2.read(null, courseConfigV2TestTabItemWrite2, arrayList, getcompletenessscore3.onSetPlaybackSpeed().MediaBrowserCompatItemReceiver(), getcompletenessscore3.aX_(), getcompletenessscore3.AudioAttributesImplBaseParcelizer(), CourseConfigV2NavDrawerItems.FINAL, getcompletenessscore3.onSetPlaybackSpeed().onCustomAction());
            return getcompletenessscore2;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        write(CourseConfigV2EditionSwitch courseConfigV2EditionSwitch) {
            super(0);
            this.IconCompatParcelizer = courseConfigV2EditionSwitch;
        }
    }

    @Override // kotlin.SchemaUserStatus
    public final CourseConfigV2EditionSwitch MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
        return this.RemoteActionCompatParcelizer;
    }

    @Override // kotlin.CourseConfigV2GtAnalyticsCard
    public final boolean onPlay() {
        return MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver().onPlay();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.CourseConfigV2GtAnalyticsCard
    /* JADX INFO: renamed from: onSetShuffleMode, reason: merged with bridge method [inline-methods] */
    public CourseConfigV2VideoProperties onPlayFromMediaId() {
        return onSetPlaybackSpeed();
    }

    @Override // kotlin.CourseConfigV2GtAnalyticsCard
    public final CourseConfigV2CustomModuleQuestionSource onFastForward() {
        CourseConfigV2CustomModuleQuestionSource courseConfigV2CustomModuleQuestionSourceOnFastForward = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver().onFastForward();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(courseConfigV2CustomModuleQuestionSourceOnFastForward, "");
        return courseConfigV2CustomModuleQuestionSourceOnFastForward;
    }

    @Override // kotlin.getIntegerMap, kotlin.getVideoPageNotesTitle
    public final getLink AudioAttributesImplBaseParcelizer() {
        getLink getlinkAudioAttributesImplBaseParcelizer = super.AudioAttributesImplBaseParcelizer();
        toMagicModuleMetaRepoModel.write(getlinkAudioAttributesImplBaseParcelizer);
        return getlinkAudioAttributesImplBaseParcelizer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.getIntegerMap, kotlin.CourseConfigV2NavDrawerItemRateUs
    /* JADX INFO: renamed from: onSetRepeatMode, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public SchemaUserStatus onPrepareFromMediaId() {
        CourseConfigV2NavDrawerItemRateUs courseConfigV2NavDrawerItemRateUsOnPrepareFromMediaId = super.onPrepareFromMediaId();
        toMagicModuleMetaRepoModel.read(courseConfigV2NavDrawerItemRateUsOnPrepareFromMediaId, "");
        return (SchemaUserStatus) courseConfigV2NavDrawerItemRateUsOnPrepareFromMediaId;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.getIntegerMap, kotlin.CourseConfigV2VideoItem
    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public SchemaUserStatus write(setDesriptionList setdesriptionlist) {
        toMagicModuleMetaRepoModel.write(setdesriptionlist, "");
        CourseConfigV2NavDrawerItemRateUs courseConfigV2NavDrawerItemRateUsWrite = super.write(setdesriptionlist);
        toMagicModuleMetaRepoModel.read(courseConfigV2NavDrawerItemRateUsWrite, "");
        getCompletenessScore getcompletenessscore = (getCompletenessScore) courseConfigV2NavDrawerItemRateUsWrite;
        setDesriptionList setdesriptionlistAudioAttributesCompatParcelizer = setDesriptionList.AudioAttributesCompatParcelizer(getcompletenessscore.AudioAttributesImplBaseParcelizer());
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(setdesriptionlistAudioAttributesCompatParcelizer, "");
        CourseConfigV2EditionSwitch courseConfigV2EditionSwitchIconCompatParcelizer = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver().aS_().IconCompatParcelizer(setdesriptionlistAudioAttributesCompatParcelizer);
        if (courseConfigV2EditionSwitchIconCompatParcelizer == null) {
            return null;
        }
        getcompletenessscore.RemoteActionCompatParcelizer = courseConfigV2EditionSwitchIconCompatParcelizer;
        return getcompletenessscore;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.getIntegerMap
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public SchemaUserStatus AudioAttributesCompatParcelizer(getVariant getvariant, CourseConfigV2NavDrawerItems courseConfigV2NavDrawerItems, CourseConfigV2NavDrawerItemFreeExtension courseConfigV2NavDrawerItemFreeExtension, getTestHeaderTitle.RemoteActionCompatParcelizer remoteActionCompatParcelizer, boolean z) {
        toMagicModuleMetaRepoModel.write(getvariant, "");
        toMagicModuleMetaRepoModel.write(courseConfigV2NavDrawerItems, "");
        toMagicModuleMetaRepoModel.write(courseConfigV2NavDrawerItemFreeExtension, "");
        toMagicModuleMetaRepoModel.write(remoteActionCompatParcelizer, "");
        CourseConfigV2NavDrawerItemRateUs courseConfigV2NavDrawerItemRateUsIconCompatParcelizer = onRemoveQueueItemAt().RemoteActionCompatParcelizer(getvariant).write(courseConfigV2NavDrawerItems).RemoteActionCompatParcelizer(courseConfigV2NavDrawerItemFreeExtension).read(remoteActionCompatParcelizer).read(z).IconCompatParcelizer();
        toMagicModuleMetaRepoModel.read(courseConfigV2NavDrawerItemRateUsIconCompatParcelizer, "");
        return (SchemaUserStatus) courseConfigV2NavDrawerItemRateUsIconCompatParcelizer;
    }

    private getCompletenessScore write(getVariant getvariant, getTestHeaderTitle.RemoteActionCompatParcelizer remoteActionCompatParcelizer, getQuote getquote, getIntroDurationSeconds getintrodurationseconds) {
        toMagicModuleMetaRepoModel.write(getvariant, "");
        toMagicModuleMetaRepoModel.write(remoteActionCompatParcelizer, "");
        toMagicModuleMetaRepoModel.write(getquote, "");
        toMagicModuleMetaRepoModel.write(getintrodurationseconds, "");
        if (remoteActionCompatParcelizer != getTestHeaderTitle.RemoteActionCompatParcelizer.DECLARATION) {
            getTestHeaderTitle.RemoteActionCompatParcelizer remoteActionCompatParcelizer2 = getTestHeaderTitle.RemoteActionCompatParcelizer.SYNTHESIZED;
        }
        return new getCompletenessScore(this.IconCompatParcelizer, onSetPlaybackSpeed(), MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(), this, getquote, getTestHeaderTitle.RemoteActionCompatParcelizer.DECLARATION, getintrodurationseconds);
    }

    public /* synthetic */ getCompletenessScore(getMini getmini, CourseConfigV2VideoProperties courseConfigV2VideoProperties, CourseConfigV2EditionSwitch courseConfigV2EditionSwitch, SchemaUserStatus schemaUserStatus, getQuote getquote, getTestHeaderTitle.RemoteActionCompatParcelizer remoteActionCompatParcelizer, getIntroDurationSeconds getintrodurationseconds, byte b) {
        this(getmini, courseConfigV2VideoProperties, courseConfigV2EditionSwitch, schemaUserStatus, getquote, remoteActionCompatParcelizer, getintrodurationseconds);
    }

    public static final class read {
        private read() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static setDesriptionList RemoteActionCompatParcelizer(CourseConfigV2VideoProperties courseConfigV2VideoProperties) {
            if (courseConfigV2VideoProperties.write() == null) {
                return null;
            }
            return setDesriptionList.AudioAttributesCompatParcelizer(courseConfigV2VideoProperties.MediaBrowserCompatCustomActionResultReceiver());
        }

        public static SchemaUserStatus AudioAttributesCompatParcelizer(getMini getmini, CourseConfigV2VideoProperties courseConfigV2VideoProperties, CourseConfigV2EditionSwitch courseConfigV2EditionSwitch) {
            CourseConfigV2EditionSwitch courseConfigV2EditionSwitchIconCompatParcelizer;
            List<CourseConfigV2TestTabItem> listRemoteActionCompatParcelizer;
            toMagicModuleMetaRepoModel.write(getmini, "");
            toMagicModuleMetaRepoModel.write(courseConfigV2VideoProperties, "");
            toMagicModuleMetaRepoModel.write(courseConfigV2EditionSwitch, "");
            setDesriptionList setdesriptionlistRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(courseConfigV2VideoProperties);
            CourseConfigV2TestTabItem courseConfigV2TestTabItemAudioAttributesCompatParcelizer = null;
            if (setdesriptionlistRemoteActionCompatParcelizer == null || (courseConfigV2EditionSwitchIconCompatParcelizer = courseConfigV2EditionSwitch.IconCompatParcelizer(setdesriptionlistRemoteActionCompatParcelizer)) == null) {
                return null;
            }
            getQuote getquoteRemoteActionCompatParcelizer = courseConfigV2EditionSwitch.RemoteActionCompatParcelizer();
            getTestHeaderTitle.RemoteActionCompatParcelizer remoteActionCompatParcelizerHandleMediaPlayPauseIfPendingOnHandler = courseConfigV2EditionSwitch.handleMediaPlayPauseIfPendingOnHandler();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(remoteActionCompatParcelizerHandleMediaPlayPauseIfPendingOnHandler, "");
            getIntroDurationSeconds getintrodurationsecondsRatingCompat = courseConfigV2VideoProperties.RatingCompat();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getintrodurationsecondsRatingCompat, "");
            getCompletenessScore getcompletenessscore = new getCompletenessScore(getmini, courseConfigV2VideoProperties, courseConfigV2EditionSwitchIconCompatParcelizer, null, getquoteRemoteActionCompatParcelizer, remoteActionCompatParcelizerHandleMediaPlayPauseIfPendingOnHandler, getintrodurationsecondsRatingCompat, (byte) 0);
            List<getMeta> listIconCompatParcelizer = getIntegerMap.IconCompatParcelizer(getcompletenessscore, courseConfigV2EditionSwitch.aX_(), setdesriptionlistRemoteActionCompatParcelizer);
            if (listIconCompatParcelizer == null) {
                return null;
            }
            getHref gethrefWrite = PearlSubjectInfo.write(courseConfigV2EditionSwitchIconCompatParcelizer.AudioAttributesImplBaseParcelizer().MediaBrowserCompatMediaItem());
            getHref gethrefAP_ = courseConfigV2VideoProperties.aP_();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(gethrefAP_, "");
            getHref gethrefIconCompatParcelizer = Meta.IconCompatParcelizer(gethrefWrite, gethrefAP_);
            CourseConfigV2TestTabItem courseConfigV2TestTabItemWrite = courseConfigV2EditionSwitch.write();
            if (courseConfigV2TestTabItemWrite != null) {
                getLink getlinkAudioAttributesCompatParcelizer = setdesriptionlistRemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(courseConfigV2TestTabItemWrite.onPrepareFromMediaId(), getTotalSubject.INVARIANT);
                getQuote.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = getQuote.IconCompatParcelizer;
                courseConfigV2TestTabItemAudioAttributesCompatParcelizer = getOption2.AudioAttributesCompatParcelizer(getcompletenessscore, getlinkAudioAttributesCompatParcelizer, getQuote.AudioAttributesCompatParcelizer.read());
            }
            CourseConfigV2TestTabItem courseConfigV2TestTabItem = courseConfigV2TestTabItemAudioAttributesCompatParcelizer;
            CourseConfigV2CustomModuleQuestionSource courseConfigV2CustomModuleQuestionSourceWrite = courseConfigV2VideoProperties.write();
            if (courseConfigV2CustomModuleQuestionSourceWrite != null) {
                List<CourseConfigV2TestTabItem> list = courseConfigV2EditionSwitch.read();
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(list, "");
                List<CourseConfigV2TestTabItem> list2 = list;
                ArrayList arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) list2, 10));
                int i = 0;
                for (Object obj : list2) {
                    if (i < 0) {
                        IntermediateLoginResponseBody.read();
                    }
                    CourseConfigV2TestTabItem courseConfigV2TestTabItem2 = (CourseConfigV2TestTabItem) obj;
                    getLink getlinkAudioAttributesCompatParcelizer2 = setdesriptionlistRemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(courseConfigV2TestTabItem2.onPrepareFromMediaId(), getTotalSubject.INVARIANT);
                    getStartIndex getstartindexIconCompatParcelizer = courseConfigV2TestTabItem2.IconCompatParcelizer();
                    toMagicModuleMetaRepoModel.read(getstartindexIconCompatParcelizer, "");
                    getRelatedLessonId getrelatedlessonidRemoteActionCompatParcelizer = ((getPlaybackIndex) getstartindexIconCompatParcelizer).RemoteActionCompatParcelizer();
                    getQuote.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer2 = getQuote.IconCompatParcelizer;
                    arrayList.add(getOption2.read(courseConfigV2CustomModuleQuestionSourceWrite, getlinkAudioAttributesCompatParcelizer2, getrelatedlessonidRemoteActionCompatParcelizer, getQuote.AudioAttributesCompatParcelizer.read(), i));
                    i++;
                }
                listRemoteActionCompatParcelizer = arrayList;
            } else {
                listRemoteActionCompatParcelizer = IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
            }
            getcompletenessscore.read(courseConfigV2TestTabItem, null, listRemoteActionCompatParcelizer, courseConfigV2VideoProperties.MediaBrowserCompatItemReceiver(), listIconCompatParcelizer, gethrefIconCompatParcelizer, CourseConfigV2NavDrawerItems.FINAL, courseConfigV2VideoProperties.onCustomAction());
            return getcompletenessscore;
        }

        public /* synthetic */ read(byte b) {
            this();
        }
    }
}
