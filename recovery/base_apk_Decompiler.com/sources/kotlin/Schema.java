package kotlin;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class Schema extends getStringArrayMap {
    private final getStringArrayMap AudioAttributesCompatParcelizer;
    private getPlanAddOns AudioAttributesImplApi21Parcelizer;
    private List<getBadgeText> AudioAttributesImplBaseParcelizer;
    private final setDesriptionList RemoteActionCompatParcelizer;
    private setDesriptionList read;
    private List<getBadgeText> write;

    public Schema(getStringArrayMap getstringarraymap, setDesriptionList setdesriptionlist) {
        this.AudioAttributesCompatParcelizer = getstringarraymap;
        this.RemoteActionCompatParcelizer = setdesriptionlist;
    }

    private setDesriptionList write() {
        if (this.read == null) {
            if (this.RemoteActionCompatParcelizer.read()) {
                this.read = this.RemoteActionCompatParcelizer;
            } else {
                List<getBadgeText> listAudioAttributesCompatParcelizer = this.AudioAttributesCompatParcelizer.MediaBrowserCompatSearchResultReceiver().AudioAttributesCompatParcelizer();
                this.AudioAttributesImplBaseParcelizer = new ArrayList(listAudioAttributesCompatParcelizer.size());
                this.read = PearlListItem.write(listAudioAttributesCompatParcelizer, this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(), this, this.AudioAttributesImplBaseParcelizer);
                this.write = IntermediateLoginResponseBody.read((Iterable) this.AudioAttributesImplBaseParcelizer, (getAnswerMap) new getAnswerMap<getBadgeText, Boolean>() { // from class: o.Schema.5
                    @Override // kotlin.getAnswerMap
                    public final /* synthetic */ Boolean invoke(getBadgeText getbadgetext) {
                        return read(getbadgetext);
                    }

                    private static Boolean read(getBadgeText getbadgetext) {
                        return Boolean.valueOf(!getbadgetext.MediaDescriptionCompat());
                    }
                });
            }
        }
        return this.read;
    }

    @Override // kotlin.getQuestionLimit
    public final getPlanAddOns MediaBrowserCompatSearchResultReceiver() {
        getPlanAddOns getplanaddonsMediaBrowserCompatSearchResultReceiver = this.AudioAttributesCompatParcelizer.MediaBrowserCompatSearchResultReceiver();
        if (this.RemoteActionCompatParcelizer.read()) {
            if (getplanaddonsMediaBrowserCompatSearchResultReceiver == null) {
                read(0);
            }
            return getplanaddonsMediaBrowserCompatSearchResultReceiver;
        }
        if (this.AudioAttributesImplApi21Parcelizer == null) {
            setDesriptionList setdesriptionlistWrite = write();
            Collection<getLink> collectionAV_ = getplanaddonsMediaBrowserCompatSearchResultReceiver.aV_();
            ArrayList arrayList = new ArrayList(collectionAV_.size());
            Iterator<getLink> it = collectionAV_.iterator();
            while (it.hasNext()) {
                arrayList.add(setdesriptionlistWrite.IconCompatParcelizer(it.next(), getTotalSubject.INVARIANT));
            }
            this.AudioAttributesImplApi21Parcelizer = new setSubjectIds(this, this.AudioAttributesImplBaseParcelizer, arrayList, getSchemaCompletion.read);
        }
        getPlanAddOns getplanaddons = this.AudioAttributesImplApi21Parcelizer;
        if (getplanaddons == null) {
            read(1);
        }
        return getplanaddons;
    }

    @Override // kotlin.getStringArrayMap
    public final setTags write(isVideoPlanCtype isvideoplanctype, getCheapestPlan getcheapestplan) {
        if (isvideoplanctype == null) {
            read(5);
        }
        if (getcheapestplan == null) {
            read(6);
        }
        setTags settagsWrite = this.AudioAttributesCompatParcelizer.write(isvideoplanctype, getcheapestplan);
        if (!this.RemoteActionCompatParcelizer.read()) {
            return new setMcqEncrypt(settagsWrite, write());
        }
        if (settagsWrite == null) {
            read(7);
        }
        return settagsWrite;
    }

    @Override // kotlin.CourseConfigV2CustomModuleQuestionSource
    public final setTags write(isVideoPlanCtype isvideoplanctype) {
        if (isvideoplanctype == null) {
            read(10);
        }
        setTags settagsWrite = write(isvideoplanctype, setLocked.write(getAnswerDescription.AudioAttributesCompatParcelizer(this)));
        if (settagsWrite == null) {
            read(11);
        }
        return settagsWrite;
    }

    @Override // kotlin.CourseConfigV2CustomModuleQuestionSource
    public final setTags onRemoveQueueItem() {
        setTags settagsIconCompatParcelizer = IconCompatParcelizer(setLocked.write(getAnswerDescription.AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer)));
        if (settagsIconCompatParcelizer == null) {
            read(12);
        }
        return settagsIconCompatParcelizer;
    }

    @Override // kotlin.getStringArrayMap
    public final setTags IconCompatParcelizer(getCheapestPlan getcheapestplan) {
        if (getcheapestplan == null) {
            read(13);
        }
        setTags settagsIconCompatParcelizer = this.AudioAttributesCompatParcelizer.IconCompatParcelizer(getcheapestplan);
        if (!this.RemoteActionCompatParcelizer.read()) {
            return new setMcqEncrypt(settagsIconCompatParcelizer, write());
        }
        if (settagsIconCompatParcelizer == null) {
            read(14);
        }
        return settagsIconCompatParcelizer;
    }

    @Override // kotlin.CourseConfigV2CustomModuleQuestionSource
    public final setTags MediaMetadataCompat() {
        setTags settagsMediaMetadataCompat = this.AudioAttributesCompatParcelizer.MediaMetadataCompat();
        if (settagsMediaMetadataCompat == null) {
            read(15);
        }
        return settagsMediaMetadataCompat;
    }

    @Override // kotlin.CourseConfigV2CustomModuleQuestionSource, kotlin.getQuestionLimit
    public final getHref aP_() {
        return AddOnMetaKt.RemoteActionCompatParcelizer(setRelatedMcqCount.read.AudioAttributesCompatParcelizer(RemoteActionCompatParcelizer()), MediaBrowserCompatSearchResultReceiver(), setPlanAddOns.RemoteActionCompatParcelizer(MediaBrowserCompatSearchResultReceiver().AudioAttributesCompatParcelizer()), false, onRemoveQueueItem());
    }

    @Override // kotlin.CourseConfigV2CustomModuleQuestionSource
    public final CourseConfigV2TestTabItem onPlayFromSearch() {
        throw new UnsupportedOperationException();
    }

    @Override // kotlin.CourseConfigV2CustomModuleQuestionSource
    public final List<CourseConfigV2TestTabItem> onPrepare() {
        List<CourseConfigV2TestTabItem> listEmptyList = Collections.emptyList();
        if (listEmptyList == null) {
            read(17);
        }
        return listEmptyList;
    }

    @Override // kotlin.CourseConfigV2CustomModuleQuestionSource
    public final Collection<CourseConfigV2EditionSwitch> MediaBrowserCompatCustomActionResultReceiver() {
        Collection<CourseConfigV2EditionSwitch> collectionMediaBrowserCompatCustomActionResultReceiver = this.AudioAttributesCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver();
        ArrayList arrayList = new ArrayList(collectionMediaBrowserCompatCustomActionResultReceiver.size());
        for (CourseConfigV2EditionSwitch courseConfigV2EditionSwitch : collectionMediaBrowserCompatCustomActionResultReceiver) {
            arrayList.add(((CourseConfigV2EditionSwitch) courseConfigV2EditionSwitch.onRemoveQueueItemAt().write(courseConfigV2EditionSwitch.aS_()).write(courseConfigV2EditionSwitch.MediaBrowserCompatMediaItem()).RemoteActionCompatParcelizer(courseConfigV2EditionSwitch.onCustomAction()).read(courseConfigV2EditionSwitch.handleMediaPlayPauseIfPendingOnHandler()).read(false).IconCompatParcelizer()).IconCompatParcelizer(write()));
        }
        return arrayList;
    }

    @Override // kotlin.fromJSONArray
    public final getQuote RemoteActionCompatParcelizer() {
        getQuote getquoteRemoteActionCompatParcelizer = this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer();
        if (getquoteRemoteActionCompatParcelizer == null) {
            read(19);
        }
        return getquoteRemoteActionCompatParcelizer;
    }

    @Override // kotlin.getEmptyBuyPlanText
    public final getRelatedLessonId aQ_() {
        getRelatedLessonId getrelatedlessonidAQ_ = this.AudioAttributesCompatParcelizer.aQ_();
        if (getrelatedlessonidAQ_ == null) {
            read(20);
        }
        return getrelatedlessonidAQ_;
    }

    @Override // kotlin.getStringArrayMap, kotlin.getVariant
    /* JADX INFO: renamed from: onPrepareFromMediaId, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final CourseConfigV2CustomModuleQuestionSource onPrepareFromMediaId() {
        CourseConfigV2CustomModuleQuestionSource courseConfigV2CustomModuleQuestionSourceOnPrepareFromMediaId = this.AudioAttributesCompatParcelizer.onAddQueueItem();
        if (courseConfigV2CustomModuleQuestionSourceOnPrepareFromMediaId == null) {
            read(21);
        }
        return courseConfigV2CustomModuleQuestionSourceOnPrepareFromMediaId;
    }

    @Override // kotlin.CourseConfigV2CustomModuleQuestionSource, kotlin.CourseConfigV2NavDrawerItemAboutUs, kotlin.getVariant
    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer */
    public final getVariant onPlayFromMediaId() {
        getVariant getvariantAudioAttributesImplApi21Parcelizer = this.AudioAttributesCompatParcelizer.onPlayFromMediaId();
        if (getvariantAudioAttributesImplApi21Parcelizer == null) {
            read(22);
        }
        return getvariantAudioAttributesImplApi21Parcelizer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.CourseConfigV2VideoItem
    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public CourseConfigV2CustomModuleQuestionSource write(setDesriptionList setdesriptionlist) {
        if (setdesriptionlist == null) {
            read(23);
        }
        return setdesriptionlist.read() ? this : new Schema(this, setDesriptionList.RemoteActionCompatParcelizer(setdesriptionlist.AudioAttributesCompatParcelizer(), write().AudioAttributesCompatParcelizer()));
    }

    @Override // kotlin.CourseConfigV2CustomModuleQuestionSource
    public final CourseConfigV2CustomModuleQuestionSource AudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer();
    }

    @Override // kotlin.CourseConfigV2CustomModuleQuestionSource
    public final getQuestionSource AudioAttributesImplBaseParcelizer() {
        getQuestionSource getquestionsourceAudioAttributesImplBaseParcelizer = this.AudioAttributesCompatParcelizer.AudioAttributesImplBaseParcelizer();
        if (getquestionsourceAudioAttributesImplBaseParcelizer == null) {
            read(25);
        }
        return getquestionsourceAudioAttributesImplBaseParcelizer;
    }

    @Override // kotlin.CourseConfigV2CustomModuleQuestionSource, kotlin.CourseConfigV2NavDrawerItemYourCourse
    public final CourseConfigV2NavDrawerItems MediaBrowserCompatMediaItem() {
        CourseConfigV2NavDrawerItems courseConfigV2NavDrawerItemsMediaBrowserCompatMediaItem = this.AudioAttributesCompatParcelizer.MediaBrowserCompatMediaItem();
        if (courseConfigV2NavDrawerItemsMediaBrowserCompatMediaItem == null) {
            read(26);
        }
        return courseConfigV2NavDrawerItemsMediaBrowserCompatMediaItem;
    }

    @Override // kotlin.CourseConfigV2CustomModuleQuestionSource, kotlin.CourseConfigV2NavDrawerItemYourCourse, kotlin.getSubText
    public final CourseConfigV2NavDrawerItemFreeExtension onCustomAction() {
        CourseConfigV2NavDrawerItemFreeExtension courseConfigV2NavDrawerItemFreeExtensionOnCustomAction = this.AudioAttributesCompatParcelizer.onCustomAction();
        if (courseConfigV2NavDrawerItemFreeExtensionOnCustomAction == null) {
            read(27);
        }
        return courseConfigV2NavDrawerItemFreeExtensionOnCustomAction;
    }

    @Override // kotlin.getBadge
    public final boolean onPrepareFromSearch() {
        return this.AudioAttributesCompatParcelizer.onPrepareFromSearch();
    }

    @Override // kotlin.CourseConfigV2CustomModuleQuestionSource
    public final boolean onFastForward() {
        return this.AudioAttributesCompatParcelizer.onFastForward();
    }

    @Override // kotlin.CourseConfigV2CustomModuleQuestionSource
    public final boolean onPlay() {
        return this.AudioAttributesCompatParcelizer.onPlay();
    }

    @Override // kotlin.CourseConfigV2CustomModuleQuestionSource
    public final boolean onPlayFromMediaId() {
        return this.AudioAttributesCompatParcelizer.onPlayFromMediaId();
    }

    @Override // kotlin.CourseConfigV2CustomModuleQuestionSource
    public final boolean onPlayFromUri() {
        return this.AudioAttributesCompatParcelizer.onPlayFromUri();
    }

    @Override // kotlin.CourseConfigV2NavDrawerItemYourCourse
    public final boolean onMediaButtonEvent() {
        return this.AudioAttributesCompatParcelizer.onMediaButtonEvent();
    }

    @Override // kotlin.CourseConfigV2CustomModuleQuestionSource
    public final boolean onAddQueueItem() {
        return this.AudioAttributesCompatParcelizer.onAddQueueItem();
    }

    @Override // kotlin.CourseConfigV2NavDrawerItemYourCourse
    public final boolean onPause() {
        return this.AudioAttributesCompatParcelizer.onPause();
    }

    @Override // kotlin.CourseConfigV2NavDrawerItemYourCourse
    public final boolean onCommand() {
        return this.AudioAttributesCompatParcelizer.onCommand();
    }

    @Override // kotlin.getVariant
    public final <R, D> R AudioAttributesCompatParcelizer(CourseConfigV2NavDrawerItemAddVideo<R, D> courseConfigV2NavDrawerItemAddVideo, D d) {
        return courseConfigV2NavDrawerItemAddVideo.write(this, d);
    }

    @Override // kotlin.CourseConfigV2CustomModuleQuestionSource
    public final setTags onSeekTo() {
        setTags settagsOnSeekTo = this.AudioAttributesCompatParcelizer.onSeekTo();
        if (settagsOnSeekTo == null) {
            read(28);
        }
        return settagsOnSeekTo;
    }

    @Override // kotlin.CourseConfigV2CustomModuleQuestionSource
    public final CourseConfigV2EditionSwitch handleMediaPlayPauseIfPendingOnHandler() {
        return this.AudioAttributesCompatParcelizer.handleMediaPlayPauseIfPendingOnHandler();
    }

    @Override // kotlin.CourseConfigV2HomePageItems
    public final getIntroDurationSeconds RatingCompat() {
        getIntroDurationSeconds getintrodurationseconds = getIntroDurationSeconds.AudioAttributesCompatParcelizer;
        if (getintrodurationseconds == null) {
            read(29);
        }
        return getintrodurationseconds;
    }

    @Override // kotlin.CourseConfigV2CustomModuleQuestionSource, kotlin.getBadge
    public final List<getBadgeText> MediaBrowserCompatItemReceiver() {
        write();
        List<getBadgeText> list = this.write;
        if (list == null) {
            read(30);
        }
        return list;
    }

    @Override // kotlin.CourseConfigV2CustomModuleQuestionSource
    public final Collection<CourseConfigV2CustomModuleQuestionSource> MediaDescriptionCompat() {
        Collection<CourseConfigV2CustomModuleQuestionSource> collectionMediaDescriptionCompat = this.AudioAttributesCompatParcelizer.MediaDescriptionCompat();
        if (collectionMediaDescriptionCompat == null) {
            read(31);
        }
        return collectionMediaDescriptionCompat;
    }

    @Override // kotlin.CourseConfigV2CustomModuleQuestionSource
    public final CourseConfigV2ZenAreaItem<getHref> MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
        CourseConfigV2ZenAreaItem<getHref> courseConfigV2ZenAreaItemMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = this.AudioAttributesCompatParcelizer.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
        if (courseConfigV2ZenAreaItemMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver == null) {
            return null;
        }
        return courseConfigV2ZenAreaItemMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.IconCompatParcelizer(new getAnswerMap<getHref, getHref>() { // from class: o.Schema.4
            /* JADX INFO: Access modifiers changed from: private */
            @Override // kotlin.getAnswerMap
            /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
            public getHref invoke(getHref gethref) {
                return Schema.this.AudioAttributesCompatParcelizer(gethref);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public getHref AudioAttributesCompatParcelizer(getHref gethref) {
        return (gethref == null || this.RemoteActionCompatParcelizer.read()) ? gethref : (getHref) write().IconCompatParcelizer(gethref, getTotalSubject.INVARIANT);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ void read(int r15) {
        /*
            Method dump skipped, instruction units count: 316
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.Schema.read(int):void");
    }
}
