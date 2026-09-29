package kotlin;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.CourseConfigV2NavDrawerItemRateUs;
import kotlin.CourseConfigV2NavDrawerItems;
import kotlin.NestfgetmThumbnailWidth;
import kotlin.RecentUpdateSubjectDetails;
import kotlin.Tag;
import kotlin.getInviteCode;
import kotlin.getOptions;
import kotlin.getQuote;
import kotlin.reflect.jvm.internal.impl.load.java.JavaIncompatibilityRulesOverridabilityCondition;
import kotlin.setModuleOwner;

/* JADX INFO: loaded from: classes4.dex */
public final class getMainModel extends RecentUpdateSubjectDetails {
    private final PageValue<Set<getRelatedLessonId>> AudioAttributesCompatParcelizer;
    private final CourseConfigV2CustomModuleQuestionSource AudioAttributesImplApi21Parcelizer;
    private final PageValue<Set<getRelatedLessonId>> AudioAttributesImplApi26Parcelizer;
    private final SchemaQbankItem<getRelatedLessonId, CourseConfigV2CustomModuleQuestionSource> AudioAttributesImplBaseParcelizer;
    private final PageValue<List<CourseConfigV2EditionSwitch>> IconCompatParcelizer;
    private final boolean MediaBrowserCompatCustomActionResultReceiver;
    private final isPaused RemoteActionCompatParcelizer;
    private final PageValue<Map<getRelatedLessonId, getExpiryTimeStamp>> write;

    public /* synthetic */ getMainModel(getFeaturedCards getfeaturedcards, CourseConfigV2CustomModuleQuestionSource courseConfigV2CustomModuleQuestionSource, isPaused ispaused, boolean z) {
        this(getfeaturedcards, courseConfigV2CustomModuleQuestionSource, ispaused, z, null);
    }

    @Override // kotlin.RecentUpdateSubjectDetails
    public final /* synthetic */ Set write(setOption6AnsweredCount setoption6answeredcount, getAnswerMap getanswermap) {
        return IconCompatParcelizer(setoption6answeredcount, (getAnswerMap<? super getRelatedLessonId, Boolean>) getanswermap);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.RecentUpdateSubjectDetails
    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: merged with bridge method [inline-methods] */
    public final CourseConfigV2CustomModuleQuestionSource AudioAttributesImplBaseParcelizer() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getMainModel(getFeaturedCards getfeaturedcards, CourseConfigV2CustomModuleQuestionSource courseConfigV2CustomModuleQuestionSource, isPaused ispaused, boolean z, getMainModel getmainmodel) {
        super(getfeaturedcards, getmainmodel);
        toMagicModuleMetaRepoModel.write(getfeaturedcards, "");
        toMagicModuleMetaRepoModel.write(courseConfigV2CustomModuleQuestionSource, "");
        toMagicModuleMetaRepoModel.write(ispaused, "");
        this.AudioAttributesImplApi21Parcelizer = courseConfigV2CustomModuleQuestionSource;
        this.RemoteActionCompatParcelizer = ispaused;
        this.MediaBrowserCompatCustomActionResultReceiver = z;
        this.IconCompatParcelizer = getfeaturedcards.read().read(new AudioAttributesImplBaseParcelizer(getfeaturedcards));
        this.AudioAttributesImplApi26Parcelizer = getfeaturedcards.read().read(new MediaBrowserCompatCustomActionResultReceiver());
        this.AudioAttributesCompatParcelizer = getfeaturedcards.read().read(new AudioAttributesImplApi21Parcelizer(getfeaturedcards, this));
        this.write = getfeaturedcards.read().read(new AudioAttributesImplApi26Parcelizer());
        this.AudioAttributesImplBaseParcelizer = getfeaturedcards.read().IconCompatParcelizer(new RatingCompat(getfeaturedcards));
    }

    static final class AudioAttributesCompatParcelizer extends MagicModuleUseCase implements getAnswerMap<getResultTimeStamp, Boolean> {
        public static final AudioAttributesCompatParcelizer write = new AudioAttributesCompatParcelizer();

        private static Boolean RemoteActionCompatParcelizer(getResultTimeStamp getresulttimestamp) {
            toMagicModuleMetaRepoModel.write(getresulttimestamp, "");
            return Boolean.valueOf(!getresulttimestamp.onPlayFromUri());
        }

        @Override // kotlin.getAnswerMap
        public final /* synthetic */ Boolean invoke(getResultTimeStamp getresulttimestamp) {
            return RemoteActionCompatParcelizer(getresulttimestamp);
        }

        AudioAttributesCompatParcelizer() {
            super(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.RecentUpdateSubjectDetails
    /* JADX INFO: renamed from: onCustomAction, reason: merged with bridge method [inline-methods] */
    public setFeaturedCards write() {
        return new setFeaturedCards(this.RemoteActionCompatParcelizer, AudioAttributesCompatParcelizer.write);
    }

    private LinkedHashSet<getRelatedLessonId> IconCompatParcelizer(setOption6AnsweredCount setoption6answeredcount, getAnswerMap<? super getRelatedLessonId, Boolean> getanswermap) {
        toMagicModuleMetaRepoModel.write(setoption6answeredcount, "");
        Collection<getLink> collectionAV_ = AudioAttributesImplBaseParcelizer().MediaBrowserCompatSearchResultReceiver().aV_();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(collectionAV_, "");
        LinkedHashSet<getRelatedLessonId> linkedHashSet = new LinkedHashSet<>();
        Iterator<T> it = collectionAV_.iterator();
        while (it.hasNext()) {
            IntermediateLoginResponseBody.IconCompatParcelizer((Collection) linkedHashSet, (Iterable) ((getLink) it.next()).read().aY_());
        }
        LinkedHashSet<getRelatedLessonId> linkedHashSet2 = linkedHashSet;
        linkedHashSet2.addAll(MediaDescriptionCompat().invoke().AudioAttributesCompatParcelizer());
        linkedHashSet2.addAll(MediaDescriptionCompat().invoke().RemoteActionCompatParcelizer());
        linkedHashSet2.addAll(RemoteActionCompatParcelizer(setoption6answeredcount, getanswermap));
        linkedHashSet2.addAll(AudioAttributesImplApi21Parcelizer().IconCompatParcelizer().onPause().RemoteActionCompatParcelizer(AudioAttributesImplApi21Parcelizer(), AudioAttributesImplBaseParcelizer()));
        return linkedHashSet2;
    }

    static final class AudioAttributesImplBaseParcelizer extends MagicModuleUseCase implements getCreatedOnDateMs<List<? extends CourseConfigV2EditionSwitch>> {
        private /* synthetic */ getFeaturedCards RemoteActionCompatParcelizer;

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public List<CourseConfigV2EditionSwitch> invoke() {
            Collection<setCount> collectionWrite = getMainModel.this.RemoteActionCompatParcelizer.write();
            ArrayList arrayList = new ArrayList(collectionWrite.size());
            Iterator<setCount> it = collectionWrite.iterator();
            while (it.hasNext()) {
                arrayList.add(getMainModel.this.AudioAttributesCompatParcelizer(it.next()));
            }
            if (getMainModel.this.RemoteActionCompatParcelizer.onPause()) {
                CourseConfigV2EditionSwitch courseConfigV2EditionSwitchRatingCompat = getMainModel.this.RatingCompat();
                String strRemoteActionCompatParcelizer = getPublishedTime.RemoteActionCompatParcelizer(courseConfigV2EditionSwitchRatingCompat, false, false, 2);
                ArrayList arrayList2 = arrayList;
                if (arrayList2.isEmpty()) {
                    arrayList.add(courseConfigV2EditionSwitchRatingCompat);
                    this.RemoteActionCompatParcelizer.IconCompatParcelizer().AudioAttributesImplBaseParcelizer().read(getMainModel.this.RemoteActionCompatParcelizer, courseConfigV2EditionSwitchRatingCompat);
                } else {
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) getPublishedTime.RemoteActionCompatParcelizer((CourseConfigV2EditionSwitch) it2.next(), false, false, 2), (Object) strRemoteActionCompatParcelizer)) {
                            break;
                        }
                    }
                    arrayList.add(courseConfigV2EditionSwitchRatingCompat);
                    this.RemoteActionCompatParcelizer.IconCompatParcelizer().AudioAttributesImplBaseParcelizer().read(getMainModel.this.RemoteActionCompatParcelizer, courseConfigV2EditionSwitchRatingCompat);
                }
            }
            getFeaturedCards getfeaturedcards = this.RemoteActionCompatParcelizer;
            getfeaturedcards.IconCompatParcelizer().onPause().read(getfeaturedcards, getMainModel.this.AudioAttributesImplBaseParcelizer(), arrayList);
            HomeVideoModelCompanion homeVideoModelCompanionOnCommand = this.RemoteActionCompatParcelizer.IconCompatParcelizer().onCommand();
            getFeaturedCards getfeaturedcards2 = this.RemoteActionCompatParcelizer;
            List listAudioAttributesCompatParcelizer = arrayList;
            getMainModel getmainmodel = getMainModel.this;
            if (listAudioAttributesCompatParcelizer.isEmpty()) {
                listAudioAttributesCompatParcelizer = IntermediateLoginResponseBody.AudioAttributesCompatParcelizer(getmainmodel.MediaMetadataCompat());
            }
            return IntermediateLoginResponseBody.onPlay(homeVideoModelCompanionOnCommand.write(getfeaturedcards2, listAudioAttributesCompatParcelizer));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AudioAttributesImplBaseParcelizer(getFeaturedCards getfeaturedcards) {
            super(0);
            this.RemoteActionCompatParcelizer = getfeaturedcards;
        }
    }

    public final PageValue<List<CourseConfigV2EditionSwitch>> IconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CourseConfigV2EditionSwitch RatingCompat() {
        CourseConfigV2CustomModuleQuestionSource courseConfigV2CustomModuleQuestionSourceAudioAttributesImplBaseParcelizer = AudioAttributesImplBaseParcelizer();
        getQuote.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = getQuote.IconCompatParcelizer;
        CustomModuleCompanion customModuleCompanion = CustomModuleCompanion.read(courseConfigV2CustomModuleQuestionSourceAudioAttributesImplBaseParcelizer, getQuote.AudioAttributesCompatParcelizer.read(), true, AudioAttributesImplApi21Parcelizer().IconCompatParcelizer().MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver().write(this.RemoteActionCompatParcelizer));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(customModuleCompanion, "");
        List<getMeta> listRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(customModuleCompanion);
        customModuleCompanion.write(false);
        customModuleCompanion.read(listRemoteActionCompatParcelizer, RemoteActionCompatParcelizer(courseConfigV2CustomModuleQuestionSourceAudioAttributesImplBaseParcelizer));
        customModuleCompanion.AudioAttributesCompatParcelizer(false);
        customModuleCompanion.write(courseConfigV2CustomModuleQuestionSourceAudioAttributesImplBaseParcelizer.aP_());
        return customModuleCompanion;
    }

    private final List<getMeta> RemoteActionCompatParcelizer(NetworkStat networkStat) {
        Collection<getStartTimeStamp> collectionMediaBrowserCompatMediaItem = this.RemoteActionCompatParcelizer.MediaBrowserCompatMediaItem();
        ArrayList arrayList = new ArrayList(collectionMediaBrowserCompatMediaItem.size());
        int i = 0;
        RecentUpdatesLastSyncedModel recentUpdatesLastSyncedModel = getPublishedOnMs.read(setGroupSubttile.COMMON, false, false, null, 6);
        Iterator<getStartTimeStamp> it = collectionMediaBrowserCompatMediaItem.iterator();
        while (true) {
            int i2 = i;
            if (it.hasNext()) {
                i = i2 + 1;
                getStartTimeStamp next = it.next();
                getLink getlink = AudioAttributesImplApi21Parcelizer().AudioAttributesImplApi21Parcelizer().read(next.AudioAttributesCompatParcelizer(), recentUpdatesLastSyncedModel);
                getQuote.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = getQuote.IconCompatParcelizer;
                arrayList.add(new getLastHtmlBody(networkStat, null, i2, getQuote.AudioAttributesCompatParcelizer.read(), next.RatingCompat(), getlink, false, false, false, null, AudioAttributesImplApi21Parcelizer().IconCompatParcelizer().MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver().write(next)));
            } else {
                return arrayList;
            }
        }
    }

    @Override // kotlin.RecentUpdateSubjectDetails
    protected final boolean AudioAttributesCompatParcelizer(setUserInitiatedExamStartedOn setuserinitiatedexamstartedon) {
        toMagicModuleMetaRepoModel.write(setuserinitiatedexamstartedon, "");
        if (this.RemoteActionCompatParcelizer.onAddQueueItem()) {
            return false;
        }
        return RemoteActionCompatParcelizer(setuserinitiatedexamstartedon);
    }

    private final boolean RemoteActionCompatParcelizer(CourseConfigV2SupportItem courseConfigV2SupportItem) {
        getRelatedLessonId getrelatedlessonidAQ_ = courseConfigV2SupportItem.aQ_();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getrelatedlessonidAQ_, "");
        List<getRelatedLessonId> list = getStatusannotations.read(getrelatedlessonidAQ_);
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                Set<CourseConfigV2SettingsItems> setAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer((getRelatedLessonId) it.next());
                if (!(setAudioAttributesCompatParcelizer instanceof Collection) || !setAudioAttributesCompatParcelizer.isEmpty()) {
                    for (CourseConfigV2SettingsItems courseConfigV2SettingsItems : setAudioAttributesCompatParcelizer) {
                        if (write(courseConfigV2SettingsItems, new MediaBrowserCompatItemReceiver(courseConfigV2SupportItem, this))) {
                            if (!courseConfigV2SettingsItems.onRewind()) {
                                String strAudioAttributesCompatParcelizer = courseConfigV2SupportItem.aQ_().AudioAttributesCompatParcelizer();
                                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strAudioAttributesCompatParcelizer, "");
                                if (!VideoInfoMini.RemoteActionCompatParcelizer(strAudioAttributesCompatParcelizer)) {
                                }
                            }
                            return false;
                        }
                    }
                }
            }
        }
        return (AudioAttributesCompatParcelizer(courseConfigV2SupportItem) || write(courseConfigV2SupportItem) || IconCompatParcelizer(courseConfigV2SupportItem)) ? false : true;
    }

    static final class MediaBrowserCompatItemReceiver extends MagicModuleUseCase implements getAnswerMap<getRelatedLessonId, Collection<? extends CourseConfigV2SupportItem>> {
        private /* synthetic */ getMainModel IconCompatParcelizer;
        private /* synthetic */ CourseConfigV2SupportItem RemoteActionCompatParcelizer;

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Collection<CourseConfigV2SupportItem> invoke(getRelatedLessonId getrelatedlessonid) {
            toMagicModuleMetaRepoModel.write(getrelatedlessonid, "");
            if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer.aQ_(), getrelatedlessonid)) {
                return IntermediateLoginResponseBody.AudioAttributesCompatParcelizer(this.IconCompatParcelizer.RemoteActionCompatParcelizer(getrelatedlessonid), (Iterable) this.IconCompatParcelizer.read(getrelatedlessonid));
            }
            return IntermediateLoginResponseBody.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        MediaBrowserCompatItemReceiver(CourseConfigV2SupportItem courseConfigV2SupportItem, getMainModel getmainmodel) {
            super(1);
            this.RemoteActionCompatParcelizer = courseConfigV2SupportItem;
            this.IconCompatParcelizer = getmainmodel;
        }
    }

    private final boolean write(CourseConfigV2SupportItem courseConfigV2SupportItem) {
        NestfgetmEditorDetail nestfgetmEditorDetail = NestfgetmEditorDetail.AudioAttributesCompatParcelizer;
        getRelatedLessonId getrelatedlessonidAQ_ = courseConfigV2SupportItem.aQ_();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getrelatedlessonidAQ_, "");
        if (!NestfgetmEditorDetail.write(getrelatedlessonidAQ_)) {
            return false;
        }
        getRelatedLessonId getrelatedlessonidAQ_2 = courseConfigV2SupportItem.aQ_();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getrelatedlessonidAQ_2, "");
        Set<CourseConfigV2SupportItem> setWrite = write(getrelatedlessonidAQ_2);
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = setWrite.iterator();
        while (it.hasNext()) {
            CourseConfigV2NavDrawerItemRateUs courseConfigV2NavDrawerItemRateUsWrite = NestfgetmEditorDetail.write((CourseConfigV2SupportItem) it.next());
            if (courseConfigV2NavDrawerItemRateUsWrite != null) {
                arrayList.add(courseConfigV2NavDrawerItemRateUsWrite);
            }
        }
        ArrayList arrayList2 = arrayList;
        if (arrayList2.isEmpty()) {
            return false;
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            if (IconCompatParcelizer(courseConfigV2SupportItem, (CourseConfigV2NavDrawerItemRateUs) it2.next())) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Collection<CourseConfigV2SupportItem> RemoteActionCompatParcelizer(getRelatedLessonId getrelatedlessonid) {
        Collection<extract> collectionRemoteActionCompatParcelizer = MediaDescriptionCompat().invoke().RemoteActionCompatParcelizer(getrelatedlessonid);
        ArrayList arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer(collectionRemoteActionCompatParcelizer, 10));
        Iterator<T> it = collectionRemoteActionCompatParcelizer.iterator();
        while (it.hasNext()) {
            arrayList.add(IconCompatParcelizer((extract) it.next()));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Collection<CourseConfigV2SupportItem> read(getRelatedLessonId getrelatedlessonid) {
        Set<CourseConfigV2SupportItem> setWrite = write(getrelatedlessonid);
        ArrayList arrayList = new ArrayList();
        for (Object obj : setWrite) {
            CourseConfigV2SupportItem courseConfigV2SupportItem = (CourseConfigV2SupportItem) obj;
            if (!getModuleOwner.AudioAttributesCompatParcelizer(courseConfigV2SupportItem) && NestfgetmEditorDetail.write(courseConfigV2SupportItem) == null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    private final boolean AudioAttributesCompatParcelizer(CourseConfigV2SupportItem courseConfigV2SupportItem) {
        getInviteCode.RemoteActionCompatParcelizer remoteActionCompatParcelizer = getInviteCode.IconCompatParcelizer;
        getRelatedLessonId getrelatedlessonidAQ_ = courseConfigV2SupportItem.aQ_();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getrelatedlessonidAQ_, "");
        getRelatedLessonId getrelatedlessonidRemoteActionCompatParcelizer = getInviteCode.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(getrelatedlessonidAQ_);
        if (getrelatedlessonidRemoteActionCompatParcelizer == null) {
            return false;
        }
        Set<CourseConfigV2SupportItem> setWrite = write(getrelatedlessonidRemoteActionCompatParcelizer);
        ArrayList arrayList = new ArrayList();
        for (Object obj : setWrite) {
            if (getModuleOwner.AudioAttributesCompatParcelizer((CourseConfigV2SupportItem) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = arrayList;
        if (arrayList2.isEmpty()) {
            return false;
        }
        CourseConfigV2SupportItem courseConfigV2SupportItemAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(courseConfigV2SupportItem, getrelatedlessonidRemoteActionCompatParcelizer);
        ArrayList arrayList3 = arrayList2;
        if (arrayList3.isEmpty()) {
            return false;
        }
        Iterator it = arrayList3.iterator();
        while (it.hasNext()) {
            if (write((CourseConfigV2SupportItem) it.next(), courseConfigV2SupportItemAudioAttributesCompatParcelizer)) {
                return true;
            }
        }
        return false;
    }

    private final boolean IconCompatParcelizer(CourseConfigV2SupportItem courseConfigV2SupportItem) {
        CourseConfigV2SupportItem courseConfigV2SupportItem2 = read(courseConfigV2SupportItem);
        if (courseConfigV2SupportItem2 == null) {
            return false;
        }
        getRelatedLessonId getrelatedlessonidAQ_ = courseConfigV2SupportItem.aQ_();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getrelatedlessonidAQ_, "");
        Set<CourseConfigV2SupportItem> setWrite = write(getrelatedlessonidAQ_);
        if (setWrite.isEmpty()) {
            return false;
        }
        for (CourseConfigV2SupportItem courseConfigV2SupportItem3 : setWrite) {
            if (courseConfigV2SupportItem3.onSeekTo() && read(courseConfigV2SupportItem2, courseConfigV2SupportItem3)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static kotlin.CourseConfigV2SupportItem read(kotlin.CourseConfigV2SupportItem r5) {
        /*
            java.util.List r0 = r5.aX_()
            java.lang.String r1 = ""
            kotlin.toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(r0, r1)
            java.lang.Object r0 = kotlin.IntermediateLoginResponseBody.MediaMetadataCompat(r0)
            o.getMeta r0 = (kotlin.getMeta) r0
            r2 = 0
            if (r0 == 0) goto L7e
            o.getLink r3 = r0.onPrepareFromMediaId()
            o.getPlanAddOns r3 = r3.AudioAttributesImplApi21Parcelizer()
            o.getQuestionLimit r3 = r3.RemoteActionCompatParcelizer()
            if (r3 == 0) goto L36
            o.getVariant r3 = (kotlin.getVariant) r3
            o.getSlidesCount r3 = kotlin.setLocked.read(r3)
            if (r3 == 0) goto L36
            boolean r4 = r3.read()
            if (r4 != 0) goto L2f
            r3 = r2
        L2f:
            if (r3 == 0) goto L36
            o.getNotesCount r3 = r3.MediaBrowserCompatItemReceiver()
            goto L37
        L36:
            r3 = r2
        L37:
            o.getNotesCount r4 = kotlin.getZenArea.MediaBrowserCompatCustomActionResultReceiver
            boolean r3 = kotlin.toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(r3, r4)
            if (r3 == 0) goto L40
            goto L41
        L40:
            r0 = r2
        L41:
            if (r0 == 0) goto L7e
            o.CourseConfigV2NavDrawerItemRateUs$write r2 = r5.onRemoveQueueItemAt()
            java.util.List r5 = r5.aX_()
            kotlin.toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(r5, r1)
            java.util.List r5 = kotlin.IntermediateLoginResponseBody.MediaDescriptionCompat(r5)
            o.CourseConfigV2NavDrawerItemRateUs$write r5 = r2.AudioAttributesCompatParcelizer(r5)
            o.getLink r0 = r0.onPrepareFromMediaId()
            java.util.List r0 = r0.bb_()
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            o.setDefault r0 = (kotlin.setDefault) r0
            o.getLink r0 = r0.AudioAttributesCompatParcelizer()
            o.CourseConfigV2NavDrawerItemRateUs$write r5 = r5.AudioAttributesCompatParcelizer(r0)
            o.CourseConfigV2NavDrawerItemRateUs r5 = r5.IconCompatParcelizer()
            o.CourseConfigV2SupportItem r5 = (kotlin.CourseConfigV2SupportItem) r5
            r0 = r5
            o.getAttemptedCount r0 = (kotlin.getAttemptedCount) r0
            if (r0 != 0) goto L79
            return r5
        L79:
            r1 = 1
            r0.MediaBrowserCompatItemReceiver(r1)
            return r5
        L7e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getMainModel.read(o.CourseConfigV2SupportItem):o.CourseConfigV2SupportItem");
    }

    private static CourseConfigV2SupportItem AudioAttributesCompatParcelizer(CourseConfigV2SupportItem courseConfigV2SupportItem, getRelatedLessonId getrelatedlessonid) {
        CourseConfigV2NavDrawerItemRateUs.write<? extends CourseConfigV2SupportItem> writeVarOnRemoveQueueItemAt = courseConfigV2SupportItem.onRemoveQueueItemAt();
        writeVarOnRemoveQueueItemAt.read(getrelatedlessonid);
        writeVarOnRemoveQueueItemAt.MediaBrowserCompatCustomActionResultReceiver();
        writeVarOnRemoveQueueItemAt.AudioAttributesCompatParcelizer();
        CourseConfigV2NavDrawerItemRateUs courseConfigV2NavDrawerItemRateUsIconCompatParcelizer = writeVarOnRemoveQueueItemAt.IconCompatParcelizer();
        toMagicModuleMetaRepoModel.write(courseConfigV2NavDrawerItemRateUsIconCompatParcelizer);
        return (CourseConfigV2SupportItem) courseConfigV2NavDrawerItemRateUsIconCompatParcelizer;
    }

    private static boolean write(CourseConfigV2SupportItem courseConfigV2SupportItem, CourseConfigV2NavDrawerItemRateUs courseConfigV2NavDrawerItemRateUs) {
        NestfgetmThumbnailHeight nestfgetmThumbnailHeight = NestfgetmThumbnailHeight.read;
        if (NestfgetmThumbnailHeight.AudioAttributesCompatParcelizer(courseConfigV2SupportItem)) {
            courseConfigV2NavDrawerItemRateUs = courseConfigV2NavDrawerItemRateUs.onPrepareFromMediaId();
        }
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(courseConfigV2NavDrawerItemRateUs, "");
        return read(courseConfigV2NavDrawerItemRateUs, courseConfigV2SupportItem);
    }

    private static boolean read(getVideoPageNotesTitle getvideopagenotestitle, getVideoPageNotesTitle getvideopagenotestitle2) {
        getOptions.RemoteActionCompatParcelizer.IconCompatParcelizer IconCompatParcelizer2 = getOptions.RemoteActionCompatParcelizer.read(getvideopagenotestitle2, getvideopagenotestitle, true).IconCompatParcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(IconCompatParcelizer2, "");
        return IconCompatParcelizer2 == getOptions.RemoteActionCompatParcelizer.IconCompatParcelizer.OVERRIDABLE && !JavaIncompatibilityRulesOverridabilityCondition.Companion.AudioAttributesCompatParcelizer(getvideopagenotestitle2, getvideopagenotestitle);
    }

    private final CourseConfigV2SupportItem read(CourseConfigV2SettingsItems courseConfigV2SettingsItems, getAnswerMap<? super getRelatedLessonId, ? extends Collection<? extends CourseConfigV2SupportItem>> getanswermap) {
        CourseConfigV2TestItem courseConfigV2TestItemOnPlayFromMediaId = courseConfigV2SettingsItems.onPlayFromMediaId();
        String strRemoteActionCompatParcelizer = null;
        CourseConfigV2TestItem courseConfigV2TestItem = courseConfigV2TestItemOnPlayFromMediaId != null ? (CourseConfigV2TestItem) getModuleOwner.read(courseConfigV2TestItemOnPlayFromMediaId) : null;
        if (courseConfigV2TestItem != null) {
            NestfgetmCorrectionNotes nestfgetmCorrectionNotes = NestfgetmCorrectionNotes.AudioAttributesCompatParcelizer;
            strRemoteActionCompatParcelizer = NestfgetmCorrectionNotes.RemoteActionCompatParcelizer(courseConfigV2TestItem);
        }
        if (strRemoteActionCompatParcelizer != null && !getModuleOwner.IconCompatParcelizer(AudioAttributesImplBaseParcelizer(), courseConfigV2TestItem)) {
            return read(courseConfigV2SettingsItems, strRemoteActionCompatParcelizer, getanswermap);
        }
        String strAudioAttributesCompatParcelizer = courseConfigV2SettingsItems.aQ_().AudioAttributesCompatParcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strAudioAttributesCompatParcelizer, "");
        return read(courseConfigV2SettingsItems, VideoInfoMini.write(strAudioAttributesCompatParcelizer), getanswermap);
    }

    private static CourseConfigV2SupportItem read(CourseConfigV2SettingsItems courseConfigV2SettingsItems, String str, getAnswerMap<? super getRelatedLessonId, ? extends Collection<? extends CourseConfigV2SupportItem>> getanswermap) {
        CourseConfigV2SupportItem courseConfigV2SupportItem;
        getRelatedLessonId getrelatedlessonidRemoteActionCompatParcelizer = getRelatedLessonId.RemoteActionCompatParcelizer(str);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getrelatedlessonidRemoteActionCompatParcelizer, "");
        Iterator<T> it = getanswermap.invoke(getrelatedlessonidRemoteActionCompatParcelizer).iterator();
        do {
            courseConfigV2SupportItem = null;
            if (!it.hasNext()) {
                break;
            }
            CourseConfigV2SupportItem courseConfigV2SupportItem2 = (CourseConfigV2SupportItem) it.next();
            if (courseConfigV2SupportItem2.aX_().size() == 0) {
                PlanData planData = PlanData.AudioAttributesCompatParcelizer;
                getLink getlinkAudioAttributesImplBaseParcelizer = courseConfigV2SupportItem2.AudioAttributesImplBaseParcelizer();
                if (getlinkAudioAttributesImplBaseParcelizer == null ? false : planData.read(getlinkAudioAttributesImplBaseParcelizer, courseConfigV2SettingsItems.onPrepareFromMediaId())) {
                    courseConfigV2SupportItem = courseConfigV2SupportItem2;
                }
            }
        } while (courseConfigV2SupportItem == null);
        return courseConfigV2SupportItem;
    }

    private static CourseConfigV2SupportItem IconCompatParcelizer(CourseConfigV2SettingsItems courseConfigV2SettingsItems, getAnswerMap<? super getRelatedLessonId, ? extends Collection<? extends CourseConfigV2SupportItem>> getanswermap) {
        CourseConfigV2SupportItem courseConfigV2SupportItem;
        getLink getlinkAudioAttributesImplBaseParcelizer;
        String strAudioAttributesCompatParcelizer = courseConfigV2SettingsItems.aQ_().AudioAttributesCompatParcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strAudioAttributesCompatParcelizer, "");
        getRelatedLessonId getrelatedlessonidRemoteActionCompatParcelizer = getRelatedLessonId.RemoteActionCompatParcelizer(VideoInfoMini.AudioAttributesCompatParcelizer(strAudioAttributesCompatParcelizer));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getrelatedlessonidRemoteActionCompatParcelizer, "");
        Iterator<T> it = getanswermap.invoke(getrelatedlessonidRemoteActionCompatParcelizer).iterator();
        do {
            courseConfigV2SupportItem = null;
            if (!it.hasNext()) {
                break;
            }
            CourseConfigV2SupportItem courseConfigV2SupportItem2 = (CourseConfigV2SupportItem) it.next();
            if (courseConfigV2SupportItem2.aX_().size() == 1 && (getlinkAudioAttributesImplBaseParcelizer = courseConfigV2SupportItem2.AudioAttributesImplBaseParcelizer()) != null && getTestTabItems.MediaMetadataCompat(getlinkAudioAttributesImplBaseParcelizer)) {
                PlanData planData = PlanData.AudioAttributesCompatParcelizer;
                List<getMeta> listAX_ = courseConfigV2SupportItem2.aX_();
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(listAX_, "");
                if (planData.IconCompatParcelizer(((getMeta) IntermediateLoginResponseBody.onCommand((List) listAX_)).onPrepareFromMediaId(), courseConfigV2SettingsItems.onPrepareFromMediaId())) {
                    courseConfigV2SupportItem = courseConfigV2SupportItem2;
                }
            }
        } while (courseConfigV2SupportItem == null);
        return courseConfigV2SupportItem;
    }

    private final boolean write(CourseConfigV2SettingsItems courseConfigV2SettingsItems, getAnswerMap<? super getRelatedLessonId, ? extends Collection<? extends CourseConfigV2SupportItem>> getanswermap) {
        if (HomeRefreshInfoModel.IconCompatParcelizer(courseConfigV2SettingsItems)) {
            return false;
        }
        CourseConfigV2SupportItem courseConfigV2SupportItem = read(courseConfigV2SettingsItems, getanswermap);
        CourseConfigV2SupportItem courseConfigV2SupportItemIconCompatParcelizer = IconCompatParcelizer(courseConfigV2SettingsItems, getanswermap);
        if (courseConfigV2SupportItem == null) {
            return false;
        }
        if (courseConfigV2SettingsItems.onRewind()) {
            return courseConfigV2SupportItemIconCompatParcelizer != null && courseConfigV2SupportItemIconCompatParcelizer.MediaBrowserCompatMediaItem() == courseConfigV2SupportItem.MediaBrowserCompatMediaItem();
        }
        return true;
    }

    @Override // kotlin.RecentUpdateSubjectDetails
    protected final void read(Collection<CourseConfigV2SupportItem> collection, getRelatedLessonId getrelatedlessonid) {
        toMagicModuleMetaRepoModel.write(collection, "");
        toMagicModuleMetaRepoModel.write(getrelatedlessonid, "");
        Set<CourseConfigV2SupportItem> setWrite = write(getrelatedlessonid);
        getInviteCode.RemoteActionCompatParcelizer remoteActionCompatParcelizer = getInviteCode.IconCompatParcelizer;
        if (!getInviteCode.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(getrelatedlessonid)) {
            NestfgetmEditorDetail nestfgetmEditorDetail = NestfgetmEditorDetail.AudioAttributesCompatParcelizer;
            if (!NestfgetmEditorDetail.write(getrelatedlessonid)) {
                Set<CourseConfigV2SupportItem> set = setWrite;
                if (!set.isEmpty()) {
                    Iterator<T> it = set.iterator();
                    while (it.hasNext()) {
                        if (((CourseConfigV2NavDrawerItemRateUs) it.next()).onSeekTo()) {
                        }
                    }
                }
                ArrayList arrayList = new ArrayList();
                for (Object obj : set) {
                    if (RemoteActionCompatParcelizer((CourseConfigV2SupportItem) obj)) {
                        arrayList.add(obj);
                    }
                }
                RemoteActionCompatParcelizer(collection, getrelatedlessonid, (Collection<? extends CourseConfigV2SupportItem>) arrayList, false);
                return;
            }
        }
        Tag.write writeVar = Tag.RemoteActionCompatParcelizer;
        Tag tagAudioAttributesCompatParcelizer = Tag.write.AudioAttributesCompatParcelizer();
        Collection<? extends CourseConfigV2SupportItem> collection2 = getExpiredOn.read(getrelatedlessonid, setWrite, IntermediateLoginResponseBody.RemoteActionCompatParcelizer(), AudioAttributesImplBaseParcelizer(), getFirstAttemptTime.AudioAttributesCompatParcelizer, AudioAttributesImplApi21Parcelizer().IconCompatParcelizer().RatingCompat().write());
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(collection2, "");
        AudioAttributesCompatParcelizer(getrelatedlessonid, collection, collection2, collection, new write(this));
        AudioAttributesCompatParcelizer(getrelatedlessonid, collection, collection2, tagAudioAttributesCompatParcelizer, new IconCompatParcelizer(this));
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : setWrite) {
            if (RemoteActionCompatParcelizer((CourseConfigV2SupportItem) obj2)) {
                arrayList2.add(obj2);
            }
        }
        RemoteActionCompatParcelizer(collection, getrelatedlessonid, (Collection<? extends CourseConfigV2SupportItem>) IntermediateLoginResponseBody.AudioAttributesCompatParcelizer((Collection) arrayList2, (Iterable) tagAudioAttributesCompatParcelizer), true);
    }

    final /* synthetic */ class write extends MagicModuleRepoModelsKt implements getAnswerMap<getRelatedLessonId, Collection<? extends CourseConfigV2SupportItem>> {
        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public Collection<CourseConfigV2SupportItem> invoke(getRelatedLessonId getrelatedlessonid) {
            toMagicModuleMetaRepoModel.write(getrelatedlessonid, "");
            return ((getMainModel) this.AudioAttributesImplApi26Parcelizer).RemoteActionCompatParcelizer(getrelatedlessonid);
        }

        @Override // kotlin.r8lambdawOOzi0yme1vxdgON3UOSQJBjUQA, kotlin.isKycAuditIncomplete
        public final String MediaBrowserCompatCustomActionResultReceiver() {
            return "searchMethodsByNameWithoutBuiltinMagic";
        }

        @Override // kotlin.r8lambdawOOzi0yme1vxdgON3UOSQJBjUQA
        public final isAuthError MediaDescriptionCompat() {
            return toMagicModuleMetaDataUcModel.write(getMainModel.class);
        }

        write(Object obj) {
            super(1, obj);
        }

        @Override // kotlin.r8lambdawOOzi0yme1vxdgON3UOSQJBjUQA
        public final String MediaBrowserCompatMediaItem() {
            return "searchMethodsByNameWithoutBuiltinMagic(Lorg/jetbrains/kotlin/name/Name;)Ljava/util/Collection;";
        }
    }

    final /* synthetic */ class IconCompatParcelizer extends MagicModuleRepoModelsKt implements getAnswerMap<getRelatedLessonId, Collection<? extends CourseConfigV2SupportItem>> {
        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Collection<CourseConfigV2SupportItem> invoke(getRelatedLessonId getrelatedlessonid) {
            toMagicModuleMetaRepoModel.write(getrelatedlessonid, "");
            return ((getMainModel) this.AudioAttributesImplApi26Parcelizer).read(getrelatedlessonid);
        }

        @Override // kotlin.r8lambdawOOzi0yme1vxdgON3UOSQJBjUQA, kotlin.isKycAuditIncomplete
        public final String MediaBrowserCompatCustomActionResultReceiver() {
            return "searchMethodsInSupertypesWithoutBuiltinMagic";
        }

        @Override // kotlin.r8lambdawOOzi0yme1vxdgON3UOSQJBjUQA
        public final isAuthError MediaDescriptionCompat() {
            return toMagicModuleMetaDataUcModel.write(getMainModel.class);
        }

        IconCompatParcelizer(Object obj) {
            super(1, obj);
        }

        @Override // kotlin.r8lambdawOOzi0yme1vxdgON3UOSQJBjUQA
        public final String MediaBrowserCompatMediaItem() {
            return "searchMethodsInSupertypesWithoutBuiltinMagic(Lorg/jetbrains/kotlin/name/Name;)Ljava/util/Collection;";
        }
    }

    private final void RemoteActionCompatParcelizer(Collection<CourseConfigV2SupportItem> collection, getRelatedLessonId getrelatedlessonid, Collection<? extends CourseConfigV2SupportItem> collection2, boolean z) {
        Collection<? extends CourseConfigV2SupportItem> collection3 = getExpiredOn.read(getrelatedlessonid, collection2, collection, AudioAttributesImplBaseParcelizer(), AudioAttributesImplApi21Parcelizer().IconCompatParcelizer().read(), AudioAttributesImplApi21Parcelizer().IconCompatParcelizer().RatingCompat().write());
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(collection3, "");
        if (!z) {
            collection.addAll(collection3);
            return;
        }
        Collection<? extends CourseConfigV2SupportItem> collection4 = collection3;
        List listAudioAttributesCompatParcelizer = IntermediateLoginResponseBody.AudioAttributesCompatParcelizer((Collection) collection, (Iterable) collection4);
        ArrayList arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer(collection4, 10));
        for (CourseConfigV2SupportItem courseConfigV2SupportItemIconCompatParcelizer : collection4) {
            CourseConfigV2SupportItem courseConfigV2SupportItem = (CourseConfigV2SupportItem) getModuleOwner.IconCompatParcelizer(courseConfigV2SupportItemIconCompatParcelizer);
            if (courseConfigV2SupportItem == null) {
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(courseConfigV2SupportItemIconCompatParcelizer, "");
            } else {
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(courseConfigV2SupportItemIconCompatParcelizer, "");
                courseConfigV2SupportItemIconCompatParcelizer = IconCompatParcelizer(courseConfigV2SupportItemIconCompatParcelizer, courseConfigV2SupportItem, listAudioAttributesCompatParcelizer);
            }
            arrayList.add(courseConfigV2SupportItemIconCompatParcelizer);
        }
        collection.addAll(arrayList);
    }

    private final void AudioAttributesCompatParcelizer(getRelatedLessonId getrelatedlessonid, Collection<? extends CourseConfigV2SupportItem> collection, Collection<? extends CourseConfigV2SupportItem> collection2, Collection<CourseConfigV2SupportItem> collection3, getAnswerMap<? super getRelatedLessonId, ? extends Collection<? extends CourseConfigV2SupportItem>> getanswermap) {
        for (CourseConfigV2SupportItem courseConfigV2SupportItem : collection2) {
            SubjectGroupTypeConstant.write(collection3, RemoteActionCompatParcelizer(courseConfigV2SupportItem, getanswermap, getrelatedlessonid, collection));
            SubjectGroupTypeConstant.write(collection3, write(courseConfigV2SupportItem, getanswermap, collection));
            SubjectGroupTypeConstant.write(collection3, AudioAttributesCompatParcelizer(courseConfigV2SupportItem, getanswermap));
        }
    }

    private final CourseConfigV2SupportItem write(CourseConfigV2SupportItem courseConfigV2SupportItem, getAnswerMap<? super getRelatedLessonId, ? extends Collection<? extends CourseConfigV2SupportItem>> getanswermap, Collection<? extends CourseConfigV2SupportItem> collection) {
        CourseConfigV2SupportItem courseConfigV2SupportItemWrite;
        CourseConfigV2NavDrawerItemRateUs courseConfigV2NavDrawerItemRateUsWrite = NestfgetmEditorDetail.write(courseConfigV2SupportItem);
        if (courseConfigV2NavDrawerItemRateUsWrite != null && (courseConfigV2SupportItemWrite = write(courseConfigV2NavDrawerItemRateUsWrite, getanswermap)) != null) {
            if (!RemoteActionCompatParcelizer(courseConfigV2SupportItemWrite)) {
                courseConfigV2SupportItemWrite = null;
            }
            if (courseConfigV2SupportItemWrite != null) {
                return IconCompatParcelizer(courseConfigV2SupportItemWrite, courseConfigV2NavDrawerItemRateUsWrite, collection);
            }
        }
        return null;
    }

    private final CourseConfigV2SupportItem RemoteActionCompatParcelizer(CourseConfigV2SupportItem courseConfigV2SupportItem, getAnswerMap<? super getRelatedLessonId, ? extends Collection<? extends CourseConfigV2SupportItem>> getanswermap, getRelatedLessonId getrelatedlessonid, Collection<? extends CourseConfigV2SupportItem> collection) {
        CourseConfigV2SupportItem courseConfigV2SupportItem2 = (CourseConfigV2SupportItem) getModuleOwner.read(courseConfigV2SupportItem);
        if (courseConfigV2SupportItem2 == null) {
            return null;
        }
        String strWrite = getModuleOwner.write(courseConfigV2SupportItem2);
        toMagicModuleMetaRepoModel.write((Object) strWrite);
        getRelatedLessonId getrelatedlessonidRemoteActionCompatParcelizer = getRelatedLessonId.RemoteActionCompatParcelizer(strWrite);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getrelatedlessonidRemoteActionCompatParcelizer, "");
        Iterator<? extends CourseConfigV2SupportItem> it = getanswermap.invoke(getrelatedlessonidRemoteActionCompatParcelizer).iterator();
        while (it.hasNext()) {
            CourseConfigV2SupportItem courseConfigV2SupportItemAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(it.next(), getrelatedlessonid);
            if (write(courseConfigV2SupportItem2, courseConfigV2SupportItemAudioAttributesCompatParcelizer)) {
                return IconCompatParcelizer(courseConfigV2SupportItemAudioAttributesCompatParcelizer, courseConfigV2SupportItem2, collection);
            }
        }
        return null;
    }

    private static CourseConfigV2SupportItem AudioAttributesCompatParcelizer(CourseConfigV2SupportItem courseConfigV2SupportItem, getAnswerMap<? super getRelatedLessonId, ? extends Collection<? extends CourseConfigV2SupportItem>> getanswermap) {
        if (!courseConfigV2SupportItem.onSeekTo()) {
            return null;
        }
        getRelatedLessonId getrelatedlessonidAQ_ = courseConfigV2SupportItem.aQ_();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getrelatedlessonidAQ_, "");
        Iterator<T> it = getanswermap.invoke(getrelatedlessonidAQ_).iterator();
        while (it.hasNext()) {
            CourseConfigV2SupportItem courseConfigV2SupportItem2 = read((CourseConfigV2SupportItem) it.next());
            if (courseConfigV2SupportItem2 == null || !read(courseConfigV2SupportItem2, courseConfigV2SupportItem)) {
                courseConfigV2SupportItem2 = null;
            }
            if (courseConfigV2SupportItem2 != null) {
                return courseConfigV2SupportItem2;
            }
        }
        return null;
    }

    private static CourseConfigV2SupportItem IconCompatParcelizer(CourseConfigV2SupportItem courseConfigV2SupportItem, getVideoPageNotesTitle getvideopagenotestitle, Collection<? extends CourseConfigV2SupportItem> collection) {
        Collection<? extends CourseConfigV2SupportItem> collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return courseConfigV2SupportItem;
        }
        for (CourseConfigV2SupportItem courseConfigV2SupportItem2 : collection2) {
            if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(courseConfigV2SupportItem, courseConfigV2SupportItem2) && courseConfigV2SupportItem2.onPlayFromSearch() == null && read(courseConfigV2SupportItem2, getvideopagenotestitle)) {
                CourseConfigV2NavDrawerItemRateUs courseConfigV2NavDrawerItemRateUsIconCompatParcelizer = courseConfigV2SupportItem.onRemoveQueueItemAt().write().IconCompatParcelizer();
                toMagicModuleMetaRepoModel.write(courseConfigV2NavDrawerItemRateUsIconCompatParcelizer);
                return (CourseConfigV2SupportItem) courseConfigV2NavDrawerItemRateUsIconCompatParcelizer;
            }
        }
        return courseConfigV2SupportItem;
    }

    private final CourseConfigV2SupportItem write(CourseConfigV2NavDrawerItemRateUs courseConfigV2NavDrawerItemRateUs, getAnswerMap<? super getRelatedLessonId, ? extends Collection<? extends CourseConfigV2SupportItem>> getanswermap) {
        Object next;
        getRelatedLessonId getrelatedlessonidAQ_ = courseConfigV2NavDrawerItemRateUs.aQ_();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getrelatedlessonidAQ_, "");
        Iterator<T> it = getanswermap.invoke(getrelatedlessonidAQ_).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (IconCompatParcelizer((CourseConfigV2SupportItem) next, courseConfigV2NavDrawerItemRateUs)) {
                break;
            }
        }
        CourseConfigV2SupportItem courseConfigV2SupportItem = (CourseConfigV2SupportItem) next;
        if (courseConfigV2SupportItem == null) {
            return null;
        }
        CourseConfigV2NavDrawerItemRateUs.write<? extends CourseConfigV2SupportItem> writeVarOnRemoveQueueItemAt = courseConfigV2SupportItem.onRemoveQueueItemAt();
        List<getMeta> listAX_ = courseConfigV2NavDrawerItemRateUs.aX_();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(listAX_, "");
        List<getMeta> list = listAX_;
        ArrayList arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) list, 10));
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(((getMeta) it2.next()).onPrepareFromMediaId());
        }
        List<getMeta> listAX_2 = courseConfigV2SupportItem.aX_();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(listAX_2, "");
        writeVarOnRemoveQueueItemAt.AudioAttributesCompatParcelizer(getIncludeUntagged.read(arrayList, listAX_2, courseConfigV2NavDrawerItemRateUs));
        writeVarOnRemoveQueueItemAt.MediaBrowserCompatCustomActionResultReceiver();
        writeVarOnRemoveQueueItemAt.AudioAttributesCompatParcelizer();
        writeVarOnRemoveQueueItemAt.write(setUserInitiatedExamStartedOn.IconCompatParcelizer, Boolean.TRUE);
        return (CourseConfigV2SupportItem) writeVarOnRemoveQueueItemAt.IconCompatParcelizer();
    }

    private final Set<CourseConfigV2SupportItem> write(getRelatedLessonId getrelatedlessonid) {
        Collection<getLink> collectionMediaBrowserCompatMediaItem = MediaBrowserCompatMediaItem();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<T> it = collectionMediaBrowserCompatMediaItem.iterator();
        while (it.hasNext()) {
            IntermediateLoginResponseBody.IconCompatParcelizer((Collection) linkedHashSet, (Iterable) ((getLink) it.next()).read().read(getrelatedlessonid, isCollapsible.WHEN_GET_SUPER_MEMBERS));
        }
        return linkedHashSet;
    }

    @Override // kotlin.RecentUpdateSubjectDetails
    protected final void RemoteActionCompatParcelizer(Collection<CourseConfigV2SupportItem> collection, getRelatedLessonId getrelatedlessonid) {
        toMagicModuleMetaRepoModel.write(collection, "");
        toMagicModuleMetaRepoModel.write(getrelatedlessonid, "");
        if (this.RemoteActionCompatParcelizer.onPause() && MediaDescriptionCompat().invoke().IconCompatParcelizer(getrelatedlessonid) != null) {
            Collection<CourseConfigV2SupportItem> collection2 = collection;
            if (collection2.isEmpty()) {
                getStartTimeStamp getstarttimestampIconCompatParcelizer = MediaDescriptionCompat().invoke().IconCompatParcelizer(getrelatedlessonid);
                toMagicModuleMetaRepoModel.write(getstarttimestampIconCompatParcelizer);
                collection.add(read(getstarttimestampIconCompatParcelizer));
            } else {
                Iterator<T> it = collection2.iterator();
                while (it.hasNext()) {
                    if (((CourseConfigV2SupportItem) it.next()).aX_().isEmpty()) {
                        break;
                    }
                }
                getStartTimeStamp getstarttimestampIconCompatParcelizer2 = MediaDescriptionCompat().invoke().IconCompatParcelizer(getrelatedlessonid);
                toMagicModuleMetaRepoModel.write(getstarttimestampIconCompatParcelizer2);
                collection.add(read(getstarttimestampIconCompatParcelizer2));
            }
        }
        AudioAttributesImplApi21Parcelizer().IconCompatParcelizer().onPause().IconCompatParcelizer(AudioAttributesImplApi21Parcelizer(), AudioAttributesImplBaseParcelizer(), getrelatedlessonid, collection);
    }

    private final setUserInitiatedExamStartedOn read(getStartTimeStamp getstarttimestamp) {
        setUserInitiatedExamStartedOn setuserinitiatedexamstartedonRemoteActionCompatParcelizer = setUserInitiatedExamStartedOn.RemoteActionCompatParcelizer((getVariant) AudioAttributesImplBaseParcelizer(), fromVideo.write(AudioAttributesImplApi21Parcelizer(), getstarttimestamp), getstarttimestamp.RatingCompat(), (getIntroDurationSeconds) AudioAttributesImplApi21Parcelizer().IconCompatParcelizer().MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver().write(getstarttimestamp), true);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(setuserinitiatedexamstartedonRemoteActionCompatParcelizer, "");
        getLink getlink = AudioAttributesImplApi21Parcelizer().AudioAttributesImplApi21Parcelizer().read(getstarttimestamp.AudioAttributesCompatParcelizer(), getPublishedOnMs.read(setGroupSubttile.COMMON, false, false, null, 6));
        CourseConfigV2TestTabItem courseConfigV2TestTabItemMediaBrowserCompatCustomActionResultReceiver = MediaBrowserCompatCustomActionResultReceiver();
        List<CourseConfigV2TestTabItem> listRemoteActionCompatParcelizer = IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
        List<? extends getBadgeText> listRemoteActionCompatParcelizer2 = IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
        List<getMeta> listRemoteActionCompatParcelizer3 = IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
        CourseConfigV2NavDrawerItems.write writeVar = CourseConfigV2NavDrawerItems.write;
        setuserinitiatedexamstartedonRemoteActionCompatParcelizer.read(null, courseConfigV2TestTabItemMediaBrowserCompatCustomActionResultReceiver, listRemoteActionCompatParcelizer, listRemoteActionCompatParcelizer2, listRemoteActionCompatParcelizer3, getlink, CourseConfigV2NavDrawerItems.write.write(false, false, true), CourseConfigV2NavDrawerItemFaq.MediaBrowserCompatMediaItem, null);
        setuserinitiatedexamstartedonRemoteActionCompatParcelizer.RemoteActionCompatParcelizer(false, false);
        AudioAttributesImplApi21Parcelizer().IconCompatParcelizer().AudioAttributesImplBaseParcelizer().IconCompatParcelizer(getstarttimestamp, setuserinitiatedexamstartedonRemoteActionCompatParcelizer);
        return setuserinitiatedexamstartedonRemoteActionCompatParcelizer;
    }

    @Override // kotlin.RecentUpdateSubjectDetails
    protected final void IconCompatParcelizer(getRelatedLessonId getrelatedlessonid, Collection<CourseConfigV2SettingsItems> collection) {
        toMagicModuleMetaRepoModel.write(getrelatedlessonid, "");
        toMagicModuleMetaRepoModel.write(collection, "");
        if (this.RemoteActionCompatParcelizer.onAddQueueItem()) {
            read(getrelatedlessonid, collection);
        }
        Set<CourseConfigV2SettingsItems> setAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(getrelatedlessonid);
        if (setAudioAttributesCompatParcelizer.isEmpty()) {
            return;
        }
        Tag.write writeVar = Tag.RemoteActionCompatParcelizer;
        Tag tagAudioAttributesCompatParcelizer = Tag.write.AudioAttributesCompatParcelizer();
        Tag.write writeVar2 = Tag.RemoteActionCompatParcelizer;
        Tag tagAudioAttributesCompatParcelizer2 = Tag.write.AudioAttributesCompatParcelizer();
        IconCompatParcelizer(setAudioAttributesCompatParcelizer, collection, tagAudioAttributesCompatParcelizer, new read());
        IconCompatParcelizer(getKycMessage.IconCompatParcelizer((Set) setAudioAttributesCompatParcelizer, (Iterable) tagAudioAttributesCompatParcelizer), tagAudioAttributesCompatParcelizer2, null, new RemoteActionCompatParcelizer());
        Collection<? extends CourseConfigV2SettingsItems> collection2 = getExpiredOn.read(getrelatedlessonid, getKycMessage.RemoteActionCompatParcelizer(setAudioAttributesCompatParcelizer, tagAudioAttributesCompatParcelizer2), collection, AudioAttributesImplBaseParcelizer(), AudioAttributesImplApi21Parcelizer().IconCompatParcelizer().read(), AudioAttributesImplApi21Parcelizer().IconCompatParcelizer().RatingCompat().write());
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(collection2, "");
        collection.addAll(collection2);
    }

    static final class read extends MagicModuleUseCase implements getAnswerMap<getRelatedLessonId, Collection<? extends CourseConfigV2SupportItem>> {
        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Collection<CourseConfigV2SupportItem> invoke(getRelatedLessonId getrelatedlessonid) {
            toMagicModuleMetaRepoModel.write(getrelatedlessonid, "");
            return getMainModel.this.RemoteActionCompatParcelizer(getrelatedlessonid);
        }

        read() {
            super(1);
        }
    }

    static final class RemoteActionCompatParcelizer extends MagicModuleUseCase implements getAnswerMap<getRelatedLessonId, Collection<? extends CourseConfigV2SupportItem>> {
        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Collection<CourseConfigV2SupportItem> invoke(getRelatedLessonId getrelatedlessonid) {
            toMagicModuleMetaRepoModel.write(getrelatedlessonid, "");
            return getMainModel.this.read(getrelatedlessonid);
        }

        RemoteActionCompatParcelizer() {
            super(1);
        }
    }

    private final void IconCompatParcelizer(Set<? extends CourseConfigV2SettingsItems> set, Collection<CourseConfigV2SettingsItems> collection, Set<CourseConfigV2SettingsItems> set2, getAnswerMap<? super getRelatedLessonId, ? extends Collection<? extends CourseConfigV2SupportItem>> getanswermap) {
        for (CourseConfigV2SettingsItems courseConfigV2SettingsItems : set) {
            setWarningMsg setwarningmsgRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(courseConfigV2SettingsItems, getanswermap);
            if (setwarningmsgRemoteActionCompatParcelizer != null) {
                collection.add(setwarningmsgRemoteActionCompatParcelizer);
                if (set2 != null) {
                    set2.add(courseConfigV2SettingsItems);
                    return;
                }
                return;
            }
        }
    }

    private final void read(getRelatedLessonId getrelatedlessonid, Collection<CourseConfigV2SettingsItems> collection) {
        extract extractVar = (extract) IntermediateLoginResponseBody.onCommand(MediaDescriptionCompat().invoke().RemoteActionCompatParcelizer(getrelatedlessonid));
        if (extractVar == null) {
            return;
        }
        collection.add(RemoteActionCompatParcelizer(this, extractVar, CourseConfigV2NavDrawerItems.FINAL));
    }

    private static /* synthetic */ setWarningMsg RemoteActionCompatParcelizer(getMainModel getmainmodel, extract extractVar, CourseConfigV2NavDrawerItems courseConfigV2NavDrawerItems) {
        return getmainmodel.read(extractVar, (getLink) null, courseConfigV2NavDrawerItems);
    }

    private final setWarningMsg read(extract extractVar, getLink getlink, CourseConfigV2NavDrawerItems courseConfigV2NavDrawerItems) {
        setWarningMsg setwarningmsgRemoteActionCompatParcelizer = setWarningMsg.RemoteActionCompatParcelizer(AudioAttributesImplBaseParcelizer(), fromVideo.write(AudioAttributesImplApi21Parcelizer(), extractVar), courseConfigV2NavDrawerItems, getModuleMessage.IconCompatParcelizer(extractVar.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver()), false, extractVar.RatingCompat(), AudioAttributesImplApi21Parcelizer().IconCompatParcelizer().MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver().write(extractVar), false);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(setwarningmsgRemoteActionCompatParcelizer, "");
        getQuote.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = getQuote.IconCompatParcelizer;
        SchemaKt schemaKtWrite = getOption2.write(setwarningmsgRemoteActionCompatParcelizer, getQuote.AudioAttributesCompatParcelizer.read());
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(schemaKtWrite, "");
        setwarningmsgRemoteActionCompatParcelizer.read(schemaKtWrite, (getAppSettings) null);
        getLink getlinkAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(extractVar, FilterParams.IconCompatParcelizer(AudioAttributesImplApi21Parcelizer(), setwarningmsgRemoteActionCompatParcelizer, extractVar, 0));
        setwarningmsgRemoteActionCompatParcelizer.write(getlinkAudioAttributesCompatParcelizer, IntermediateLoginResponseBody.RemoteActionCompatParcelizer(), MediaBrowserCompatCustomActionResultReceiver(), null, IntermediateLoginResponseBody.RemoteActionCompatParcelizer());
        schemaKtWrite.write(getlinkAudioAttributesCompatParcelizer);
        return setwarningmsgRemoteActionCompatParcelizer;
    }

    private final setWarningMsg RemoteActionCompatParcelizer(CourseConfigV2SettingsItems courseConfigV2SettingsItems, getAnswerMap<? super getRelatedLessonId, ? extends Collection<? extends CourseConfigV2SupportItem>> getanswermap) {
        CourseConfigV2SupportItem courseConfigV2SupportItemIconCompatParcelizer;
        getSchemaId getschemaidIconCompatParcelizer = null;
        if (!write(courseConfigV2SettingsItems, getanswermap)) {
            return null;
        }
        CourseConfigV2SupportItem courseConfigV2SupportItem = read(courseConfigV2SettingsItems, getanswermap);
        toMagicModuleMetaRepoModel.write(courseConfigV2SupportItem);
        if (courseConfigV2SettingsItems.onRewind()) {
            courseConfigV2SupportItemIconCompatParcelizer = IconCompatParcelizer(courseConfigV2SettingsItems, getanswermap);
            toMagicModuleMetaRepoModel.write(courseConfigV2SupportItemIconCompatParcelizer);
        } else {
            courseConfigV2SupportItemIconCompatParcelizer = null;
        }
        if (courseConfigV2SupportItemIconCompatParcelizer != null) {
            courseConfigV2SupportItemIconCompatParcelizer.MediaBrowserCompatMediaItem();
            courseConfigV2SupportItem.MediaBrowserCompatMediaItem();
        }
        setResponseParams setresponseparams = new setResponseParams(AudioAttributesImplBaseParcelizer(), courseConfigV2SupportItem, courseConfigV2SupportItemIconCompatParcelizer, courseConfigV2SettingsItems);
        getLink getlinkAudioAttributesImplBaseParcelizer = courseConfigV2SupportItem.AudioAttributesImplBaseParcelizer();
        toMagicModuleMetaRepoModel.write(getlinkAudioAttributesImplBaseParcelizer);
        setresponseparams.write(getlinkAudioAttributesImplBaseParcelizer, IntermediateLoginResponseBody.RemoteActionCompatParcelizer(), MediaBrowserCompatCustomActionResultReceiver(), null, IntermediateLoginResponseBody.RemoteActionCompatParcelizer());
        setResponseParams setresponseparams2 = setresponseparams;
        SchemaKt schemaKt = getOption2.read(setresponseparams2, courseConfigV2SupportItem.RemoteActionCompatParcelizer(), false, false, false, courseConfigV2SupportItem.RatingCompat());
        schemaKt.IconCompatParcelizer((CourseConfigV2NavDrawerItemRateUs) courseConfigV2SupportItem);
        schemaKt.write(setresponseparams.onPrepareFromMediaId());
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(schemaKt, "");
        if (courseConfigV2SupportItemIconCompatParcelizer != null) {
            List<getMeta> listAX_ = courseConfigV2SupportItemIconCompatParcelizer.aX_();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(listAX_, "");
            getMeta getmeta = (getMeta) IntermediateLoginResponseBody.MediaBrowserCompatSearchResultReceiver((List) listAX_);
            if (getmeta == null) {
                throw new AssertionError("No parameter found for ".concat(String.valueOf(courseConfigV2SupportItemIconCompatParcelizer)));
            }
            getschemaidIconCompatParcelizer = getOption2.IconCompatParcelizer(setresponseparams2, courseConfigV2SupportItemIconCompatParcelizer.RemoteActionCompatParcelizer(), getmeta.RemoteActionCompatParcelizer(), false, false, false, courseConfigV2SupportItemIconCompatParcelizer.onCustomAction(), courseConfigV2SupportItemIconCompatParcelizer.RatingCompat());
            getschemaidIconCompatParcelizer.IconCompatParcelizer((CourseConfigV2NavDrawerItemRateUs) courseConfigV2SupportItemIconCompatParcelizer);
        }
        setresponseparams.read(schemaKt, getschemaidIconCompatParcelizer);
        return setresponseparams;
    }

    private final Set<CourseConfigV2SettingsItems> AudioAttributesCompatParcelizer(getRelatedLessonId getrelatedlessonid) {
        Collection<getLink> collectionMediaBrowserCompatMediaItem = MediaBrowserCompatMediaItem();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = collectionMediaBrowserCompatMediaItem.iterator();
        while (it.hasNext()) {
            Collection<? extends CourseConfigV2SettingsItems> collectionIconCompatParcelizer = ((getLink) it.next()).read().IconCompatParcelizer(getrelatedlessonid, isCollapsible.WHEN_GET_SUPER_MEMBERS);
            ArrayList arrayList2 = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer(collectionIconCompatParcelizer, 10));
            Iterator<T> it2 = collectionIconCompatParcelizer.iterator();
            while (it2.hasNext()) {
                arrayList2.add((CourseConfigV2SettingsItems) it2.next());
            }
            IntermediateLoginResponseBody.IconCompatParcelizer((Collection) arrayList, (Iterable) arrayList2);
        }
        return IntermediateLoginResponseBody.onPlayFromUri(arrayList);
    }

    private final Collection<getLink> MediaBrowserCompatMediaItem() {
        if (!this.MediaBrowserCompatCustomActionResultReceiver) {
            return AudioAttributesImplApi21Parcelizer().IconCompatParcelizer().RatingCompat().RemoteActionCompatParcelizer().IconCompatParcelizer(AudioAttributesImplBaseParcelizer());
        }
        Collection<getLink> collectionAV_ = AudioAttributesImplBaseParcelizer().MediaBrowserCompatSearchResultReceiver().aV_();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(collectionAV_, "");
        return collectionAV_;
    }

    @Override // kotlin.RecentUpdateSubjectDetails
    protected final RecentUpdateSubjectDetails.IconCompatParcelizer write(extract extractVar, List<? extends getBadgeText> list, getLink getlink, List<? extends getMeta> list2) {
        toMagicModuleMetaRepoModel.write(extractVar, "");
        toMagicModuleMetaRepoModel.write(list, "");
        toMagicModuleMetaRepoModel.write(getlink, "");
        toMagicModuleMetaRepoModel.write(list2, "");
        setModuleOwner.read readVarWrite = AudioAttributesImplApi21Parcelizer().IconCompatParcelizer().handleMediaPlayPauseIfPendingOnHandler().write(extractVar, AudioAttributesImplBaseParcelizer(), getlink, list2, list);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(readVarWrite, "");
        getLink getlinkRemoteActionCompatParcelizer = readVarWrite.RemoteActionCompatParcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getlinkRemoteActionCompatParcelizer, "");
        getLink getlinkIconCompatParcelizer = readVarWrite.IconCompatParcelizer();
        List<getMeta> listWrite = readVarWrite.write();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(listWrite, "");
        List<getBadgeText> list3 = readVarWrite.read();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(list3, "");
        boolean zMediaBrowserCompatCustomActionResultReceiver = readVarWrite.MediaBrowserCompatCustomActionResultReceiver();
        List<String> listAudioAttributesCompatParcelizer = readVarWrite.AudioAttributesCompatParcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(listAudioAttributesCompatParcelizer, "");
        return new RecentUpdateSubjectDetails.IconCompatParcelizer(getlinkRemoteActionCompatParcelizer, getlinkIconCompatParcelizer, listWrite, list3, zMediaBrowserCompatCustomActionResultReceiver, listAudioAttributesCompatParcelizer);
    }

    private static boolean IconCompatParcelizer(CourseConfigV2SupportItem courseConfigV2SupportItem, CourseConfigV2NavDrawerItemRateUs courseConfigV2NavDrawerItemRateUs) {
        String strRemoteActionCompatParcelizer = getPublishedTime.RemoteActionCompatParcelizer(courseConfigV2SupportItem, false, false, 2);
        CourseConfigV2NavDrawerItemRateUs courseConfigV2NavDrawerItemRateUsOnPrepareFromMediaId = courseConfigV2NavDrawerItemRateUs.onPrepareFromMediaId();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(courseConfigV2NavDrawerItemRateUsOnPrepareFromMediaId, "");
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) strRemoteActionCompatParcelizer, (Object) getPublishedTime.RemoteActionCompatParcelizer(courseConfigV2NavDrawerItemRateUsOnPrepareFromMediaId, false, false, 2)) && !read(courseConfigV2SupportItem, courseConfigV2NavDrawerItemRateUs);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CustomModuleCompanion AudioAttributesCompatParcelizer(setCount setcount) {
        CourseConfigV2CustomModuleQuestionSource courseConfigV2CustomModuleQuestionSourceAudioAttributesImplBaseParcelizer = AudioAttributesImplBaseParcelizer();
        setCount setcount2 = setcount;
        CustomModuleCompanion customModuleCompanion = CustomModuleCompanion.read(courseConfigV2CustomModuleQuestionSourceAudioAttributesImplBaseParcelizer, fromVideo.write(AudioAttributesImplApi21Parcelizer(), setcount), false, AudioAttributesImplApi21Parcelizer().IconCompatParcelizer().MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver().write(setcount2));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(customModuleCompanion, "");
        getFeaturedCards getfeaturedcardsIconCompatParcelizer = FilterParams.IconCompatParcelizer(AudioAttributesImplApi21Parcelizer(), customModuleCompanion, setcount, courseConfigV2CustomModuleQuestionSourceAudioAttributesImplBaseParcelizer.MediaBrowserCompatItemReceiver().size());
        RecentUpdateSubjectDetails.write writeVarIconCompatParcelizer = IconCompatParcelizer(getfeaturedcardsIconCompatParcelizer, customModuleCompanion, setcount.AudioAttributesImplApi21Parcelizer());
        List<getBadgeText> listMediaBrowserCompatItemReceiver = courseConfigV2CustomModuleQuestionSourceAudioAttributesImplBaseParcelizer.MediaBrowserCompatItemReceiver();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(listMediaBrowserCompatItemReceiver, "");
        List<getBadgeText> list = listMediaBrowserCompatItemReceiver;
        List<setStartTimeStamp> listOnCommand = setcount.onCommand();
        ArrayList arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) listOnCommand, 10));
        Iterator<T> it = listOnCommand.iterator();
        while (it.hasNext()) {
            getBadgeText getbadgetextWrite = getfeaturedcardsIconCompatParcelizer.MediaBrowserCompatItemReceiver().write((setStartTimeStamp) it.next());
            toMagicModuleMetaRepoModel.write(getbadgetextWrite);
            arrayList.add(getbadgetextWrite);
        }
        customModuleCompanion.RemoteActionCompatParcelizer(writeVarIconCompatParcelizer.IconCompatParcelizer(), getModuleMessage.IconCompatParcelizer(setcount.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver()), IntermediateLoginResponseBody.AudioAttributesCompatParcelizer((Collection) list, (Iterable) arrayList));
        customModuleCompanion.AudioAttributesCompatParcelizer(false);
        customModuleCompanion.write(writeVarIconCompatParcelizer.write());
        customModuleCompanion.write(courseConfigV2CustomModuleQuestionSourceAudioAttributesImplBaseParcelizer.aP_());
        getfeaturedcardsIconCompatParcelizer.IconCompatParcelizer().AudioAttributesImplBaseParcelizer().read(setcount2, customModuleCompanion);
        return customModuleCompanion;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CourseConfigV2EditionSwitch MediaMetadataCompat() {
        List<getMeta> listEmptyList;
        boolean zOnAddQueueItem = this.RemoteActionCompatParcelizer.onAddQueueItem();
        this.RemoteActionCompatParcelizer.onPlay();
        if (!zOnAddQueueItem) {
            return null;
        }
        CourseConfigV2CustomModuleQuestionSource courseConfigV2CustomModuleQuestionSourceAudioAttributesImplBaseParcelizer = AudioAttributesImplBaseParcelizer();
        getQuote.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = getQuote.IconCompatParcelizer;
        CustomModuleCompanion customModuleCompanion = CustomModuleCompanion.read(courseConfigV2CustomModuleQuestionSourceAudioAttributesImplBaseParcelizer, getQuote.AudioAttributesCompatParcelizer.read(), true, AudioAttributesImplApi21Parcelizer().IconCompatParcelizer().MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver().write(this.RemoteActionCompatParcelizer));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(customModuleCompanion, "");
        if (zOnAddQueueItem) {
            listEmptyList = read(customModuleCompanion);
        } else {
            listEmptyList = Collections.emptyList();
        }
        customModuleCompanion.write(false);
        customModuleCompanion.read(listEmptyList, RemoteActionCompatParcelizer(courseConfigV2CustomModuleQuestionSourceAudioAttributesImplBaseParcelizer));
        customModuleCompanion.AudioAttributesCompatParcelizer(true);
        customModuleCompanion.write(courseConfigV2CustomModuleQuestionSourceAudioAttributesImplBaseParcelizer.aP_());
        AudioAttributesImplApi21Parcelizer().IconCompatParcelizer().AudioAttributesImplBaseParcelizer().read(this.RemoteActionCompatParcelizer, customModuleCompanion);
        return customModuleCompanion;
    }

    private static CourseConfigV2NavDrawerItemFreeExtension RemoteActionCompatParcelizer(CourseConfigV2CustomModuleQuestionSource courseConfigV2CustomModuleQuestionSource) {
        CourseConfigV2NavDrawerItemFreeExtension courseConfigV2NavDrawerItemFreeExtensionOnCustomAction = courseConfigV2CustomModuleQuestionSource.onCustomAction();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(courseConfigV2NavDrawerItemFreeExtensionOnCustomAction, "");
        if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(courseConfigV2NavDrawerItemFreeExtensionOnCustomAction, NestfputmThumbnailHeight.IconCompatParcelizer)) {
            return courseConfigV2NavDrawerItemFreeExtensionOnCustomAction;
        }
        CourseConfigV2NavDrawerItemFreeExtension courseConfigV2NavDrawerItemFreeExtension = NestfputmThumbnailHeight.RemoteActionCompatParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(courseConfigV2NavDrawerItemFreeExtension, "");
        return courseConfigV2NavDrawerItemFreeExtension;
    }

    private final List<getMeta> read(NetworkStat networkStat) {
        Pair pair;
        Collection<extract> collectionAudioAttributesImplApi26Parcelizer = this.RemoteActionCompatParcelizer.AudioAttributesImplApi26Parcelizer();
        ArrayList arrayList = new ArrayList(collectionAudioAttributesImplApi26Parcelizer.size());
        int i = 0;
        RecentUpdatesLastSyncedModel recentUpdatesLastSyncedModel = getPublishedOnMs.read(setGroupSubttile.COMMON, true, false, null, 6);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : collectionAudioAttributesImplApi26Parcelizer) {
            if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(((extract) obj).RatingCompat(), getPsshData.IconCompatParcelizer)) {
                arrayList2.add(obj);
            } else {
                arrayList3.add(obj);
            }
        }
        Pair pair2 = new Pair(arrayList2, arrayList3);
        List list = (List) pair2.RemoteActionCompatParcelizer();
        List<extract> list2 = (List) pair2.read();
        list.size();
        extract extractVar = (extract) IntermediateLoginResponseBody.MediaBrowserCompatSearchResultReceiver(list);
        if (extractVar != null) {
            setQuestionCount setquestioncountMediaBrowserCompatItemReceiver = extractVar.MediaBrowserCompatItemReceiver();
            if (setquestioncountMediaBrowserCompatItemReceiver instanceof isUnattempted) {
                isUnattempted isunattempted = (isUnattempted) setquestioncountMediaBrowserCompatItemReceiver;
                pair = new Pair(AudioAttributesImplApi21Parcelizer().AudioAttributesImplApi21Parcelizer().read(isunattempted, recentUpdatesLastSyncedModel, true), AudioAttributesImplApi21Parcelizer().AudioAttributesImplApi21Parcelizer().read(isunattempted.AudioAttributesCompatParcelizer(), recentUpdatesLastSyncedModel));
            } else {
                pair = new Pair(AudioAttributesImplApi21Parcelizer().AudioAttributesImplApi21Parcelizer().read(setquestioncountMediaBrowserCompatItemReceiver, recentUpdatesLastSyncedModel), null);
            }
            IconCompatParcelizer(arrayList, networkStat, 0, extractVar, (getLink) pair.RemoteActionCompatParcelizer(), (getLink) pair.read());
        }
        int i2 = extractVar == null ? 0 : 1;
        for (extract extractVar2 : list2) {
            IconCompatParcelizer(arrayList, networkStat, i + i2, extractVar2, AudioAttributesImplApi21Parcelizer().AudioAttributesImplApi21Parcelizer().read(extractVar2.MediaBrowserCompatItemReceiver(), recentUpdatesLastSyncedModel), null);
            i++;
        }
        return arrayList;
    }

    private final void IconCompatParcelizer(List<getMeta> list, CourseConfigV2GtAnalyticsCard courseConfigV2GtAnalyticsCard, int i, extract extractVar, getLink getlink, getLink getlink2) {
        CourseConfigV2GtAnalyticsCard courseConfigV2GtAnalyticsCard2 = courseConfigV2GtAnalyticsCard;
        getQuote.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = getQuote.IconCompatParcelizer;
        getQuote getquote = getQuote.AudioAttributesCompatParcelizer.read();
        getRelatedLessonId getrelatedlessonidRatingCompat = extractVar.RatingCompat();
        getLink getlinkAudioAttributesImplApi26Parcelizer = setPlanAddOns.AudioAttributesImplApi26Parcelizer(getlink);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getlinkAudioAttributesImplApi26Parcelizer, "");
        list.add(new getLastHtmlBody(courseConfigV2GtAnalyticsCard2, null, i, getquote, getrelatedlessonidRatingCompat, getlinkAudioAttributesImplApi26Parcelizer, extractVar.AudioAttributesImplApi26Parcelizer(), false, false, getlink2 != null ? setPlanAddOns.AudioAttributesImplApi26Parcelizer(getlink2) : null, AudioAttributesImplApi21Parcelizer().IconCompatParcelizer().MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver().write(extractVar)));
    }

    static final class MediaBrowserCompatCustomActionResultReceiver extends MagicModuleUseCase implements getCreatedOnDateMs<Set<? extends getRelatedLessonId>> {
        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Set<getRelatedLessonId> invoke() {
            return IntermediateLoginResponseBody.onPlayFromUri(getMainModel.this.RemoteActionCompatParcelizer.AudioAttributesImplBaseParcelizer());
        }

        MediaBrowserCompatCustomActionResultReceiver() {
            super(0);
        }
    }

    static final class AudioAttributesImplApi21Parcelizer extends MagicModuleUseCase implements getCreatedOnDateMs<Set<? extends getRelatedLessonId>> {
        private /* synthetic */ getFeaturedCards AudioAttributesCompatParcelizer;
        private /* synthetic */ getMainModel write;

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Set<getRelatedLessonId> invoke() {
            getFeaturedCards getfeaturedcards = this.AudioAttributesCompatParcelizer;
            return IntermediateLoginResponseBody.onPlayFromUri(getfeaturedcards.IconCompatParcelizer().onPause().IconCompatParcelizer(getfeaturedcards, this.write.AudioAttributesImplBaseParcelizer()));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AudioAttributesImplApi21Parcelizer(getFeaturedCards getfeaturedcards, getMainModel getmainmodel) {
            super(0);
            this.AudioAttributesCompatParcelizer = getfeaturedcards;
            this.write = getmainmodel;
        }
    }

    static final class AudioAttributesImplApi26Parcelizer extends MagicModuleUseCase implements getCreatedOnDateMs<Map<getRelatedLessonId, ? extends getExpiryTimeStamp>> {
        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Map<getRelatedLessonId, getExpiryTimeStamp> invoke() {
            Collection<getExpiryTimeStamp> collectionMediaBrowserCompatItemReceiver = getMainModel.this.RemoteActionCompatParcelizer.MediaBrowserCompatItemReceiver();
            ArrayList arrayList = new ArrayList();
            for (Object obj : collectionMediaBrowserCompatItemReceiver) {
                if (((getExpiryTimeStamp) obj).MediaBrowserCompatItemReceiver()) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = arrayList;
            LinkedHashMap linkedHashMap = new LinkedHashMap(getQues.write(VideoTimelineResponseBody.read(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) arrayList2, 10)), 16));
            for (Object obj2 : arrayList2) {
                linkedHashMap.put(((getExpiryTimeStamp) obj2).RatingCompat(), obj2);
            }
            return linkedHashMap;
        }

        AudioAttributesImplApi26Parcelizer() {
            super(0);
        }
    }

    static final class RatingCompat extends MagicModuleUseCase implements getAnswerMap<getRelatedLessonId, CourseConfigV2CustomModuleQuestionSource> {
        private /* synthetic */ getFeaturedCards RemoteActionCompatParcelizer;

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public CourseConfigV2CustomModuleQuestionSource invoke(getRelatedLessonId getrelatedlessonid) {
            toMagicModuleMetaRepoModel.write(getrelatedlessonid, "");
            CourseConfigV2CustomModuleQuestionSource courseConfigV2CustomModuleQuestionSourceWrite = null;
            if (!((Set) getMainModel.this.AudioAttributesImplApi26Parcelizer.invoke()).contains(getrelatedlessonid)) {
                if (!((Set) getMainModel.this.AudioAttributesCompatParcelizer.invoke()).contains(getrelatedlessonid)) {
                    getExpiryTimeStamp getexpirytimestamp = (getExpiryTimeStamp) ((Map) getMainModel.this.write.invoke()).get(getrelatedlessonid);
                    if (getexpirytimestamp != null) {
                        courseConfigV2CustomModuleQuestionSourceWrite = getLongMap.write(this.RemoteActionCompatParcelizer.read(), getMainModel.this.AudioAttributesImplBaseParcelizer(), getrelatedlessonid, this.RemoteActionCompatParcelizer.read().read(new AudioAttributesCompatParcelizer(getMainModel.this)), fromVideo.write(this.RemoteActionCompatParcelizer, getexpirytimestamp), this.RemoteActionCompatParcelizer.IconCompatParcelizer().MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver().write(getexpirytimestamp));
                    }
                    return courseConfigV2CustomModuleQuestionSourceWrite;
                }
                getFeaturedCards getfeaturedcards = this.RemoteActionCompatParcelizer;
                getMainModel getmainmodel = getMainModel.this;
                List<CourseConfigV2CustomModuleQuestionSource> listIconCompatParcelizer = IntermediateLoginResponseBody.IconCompatParcelizer();
                getfeaturedcards.IconCompatParcelizer().onPause().AudioAttributesCompatParcelizer(getfeaturedcards, getmainmodel.AudioAttributesImplBaseParcelizer(), getrelatedlessonid, listIconCompatParcelizer);
                List listAudioAttributesCompatParcelizer = IntermediateLoginResponseBody.AudioAttributesCompatParcelizer((List) listIconCompatParcelizer);
                int size = listAudioAttributesCompatParcelizer.size();
                if (size == 0) {
                    return null;
                }
                if (size == 1) {
                    return (CourseConfigV2CustomModuleQuestionSource) IntermediateLoginResponseBody.onCommand(listAudioAttributesCompatParcelizer);
                }
                throw new IllegalStateException("Multiple classes with same name are generated: ".concat(String.valueOf(listAudioAttributesCompatParcelizer)).toString());
            }
            NestfgetmThumbnailWidth nestfgetmThumbnailWidthIconCompatParcelizer = this.RemoteActionCompatParcelizer.IconCompatParcelizer().IconCompatParcelizer();
            RevisionSubjectStatusModel revisionSubjectStatusModel = setLocked.read((getQuestionLimit) getMainModel.this.AudioAttributesImplBaseParcelizer());
            toMagicModuleMetaRepoModel.write(revisionSubjectStatusModel);
            RevisionSubjectStatusModel revisionSubjectStatusModel2 = revisionSubjectStatusModel.read(getrelatedlessonid);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(revisionSubjectStatusModel2, "");
            isPaused ispausedAudioAttributesCompatParcelizer = nestfgetmThumbnailWidthIconCompatParcelizer.AudioAttributesCompatParcelizer(new NestfgetmThumbnailWidth.read(revisionSubjectStatusModel2, null, getMainModel.this.RemoteActionCompatParcelizer, 2));
            if (ispausedAudioAttributesCompatParcelizer != null) {
                getFeaturedCards getfeaturedcards2 = this.RemoteActionCompatParcelizer;
                courseConfigV2CustomModuleQuestionSourceWrite = new setVideoModels(getfeaturedcards2, getMainModel.this.AudioAttributesImplBaseParcelizer(), ispausedAudioAttributesCompatParcelizer);
                getfeaturedcards2.IconCompatParcelizer().write().read((setStartDateTime) courseConfigV2CustomModuleQuestionSourceWrite);
            }
            return courseConfigV2CustomModuleQuestionSourceWrite;
        }

        static final class AudioAttributesCompatParcelizer extends MagicModuleUseCase implements getCreatedOnDateMs<Set<? extends getRelatedLessonId>> {
            private /* synthetic */ getMainModel read;

            /* JADX INFO: Access modifiers changed from: private */
            @Override // kotlin.getCreatedOnDateMs
            /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
            public Set<getRelatedLessonId> invoke() {
                return getKycMessage.RemoteActionCompatParcelizer(this.read.aY_(), this.read.AudioAttributesCompatParcelizer());
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AudioAttributesCompatParcelizer(getMainModel getmainmodel) {
                super(0);
                this.read = getmainmodel;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        RatingCompat(getFeaturedCards getfeaturedcards) {
            super(1);
            this.RemoteActionCompatParcelizer = getfeaturedcards;
        }
    }

    @Override // kotlin.RecentUpdateSubjectDetails
    protected final CourseConfigV2TestTabItem MediaBrowserCompatCustomActionResultReceiver() {
        return getAnswerDescription.write(AudioAttributesImplBaseParcelizer());
    }

    @Override // kotlin.setStatusUpdateEndTimeMs, kotlin.getMcqContentBody
    public final getQuestionLimit AudioAttributesCompatParcelizer(getRelatedLessonId getrelatedlessonid, getTimeStamp gettimestamp) {
        SchemaQbankItem<getRelatedLessonId, CourseConfigV2CustomModuleQuestionSource> schemaQbankItem;
        CourseConfigV2CustomModuleQuestionSource courseConfigV2CustomModuleQuestionSourceInvoke;
        toMagicModuleMetaRepoModel.write(getrelatedlessonid, "");
        toMagicModuleMetaRepoModel.write(gettimestamp, "");
        RemoteActionCompatParcelizer(getrelatedlessonid, gettimestamp);
        getMainModel getmainmodel = (getMainModel) MediaBrowserCompatSearchResultReceiver();
        return (getmainmodel == null || (schemaQbankItem = getmainmodel.AudioAttributesImplBaseParcelizer) == null || (courseConfigV2CustomModuleQuestionSourceInvoke = schemaQbankItem.invoke(getrelatedlessonid)) == null) ? this.AudioAttributesImplBaseParcelizer.invoke(getrelatedlessonid) : courseConfigV2CustomModuleQuestionSourceInvoke;
    }

    @Override // kotlin.RecentUpdateSubjectDetails, kotlin.setStatusUpdateEndTimeMs, kotlin.setTags, kotlin.getMcqContentBody
    public final Collection<CourseConfigV2SupportItem> read(getRelatedLessonId getrelatedlessonid, getTimeStamp gettimestamp) {
        toMagicModuleMetaRepoModel.write(getrelatedlessonid, "");
        toMagicModuleMetaRepoModel.write(gettimestamp, "");
        RemoteActionCompatParcelizer(getrelatedlessonid, gettimestamp);
        return super.read(getrelatedlessonid, gettimestamp);
    }

    @Override // kotlin.RecentUpdateSubjectDetails, kotlin.setStatusUpdateEndTimeMs, kotlin.setTags
    public final Collection<CourseConfigV2SettingsItems> IconCompatParcelizer(getRelatedLessonId getrelatedlessonid, getTimeStamp gettimestamp) {
        toMagicModuleMetaRepoModel.write(getrelatedlessonid, "");
        toMagicModuleMetaRepoModel.write(gettimestamp, "");
        RemoteActionCompatParcelizer(getrelatedlessonid, gettimestamp);
        return super.IconCompatParcelizer(getrelatedlessonid, gettimestamp);
    }

    @Override // kotlin.RecentUpdateSubjectDetails
    protected final Set<getRelatedLessonId> RemoteActionCompatParcelizer(setOption6AnsweredCount setoption6answeredcount, getAnswerMap<? super getRelatedLessonId, Boolean> getanswermap) {
        toMagicModuleMetaRepoModel.write(setoption6answeredcount, "");
        return getKycMessage.RemoteActionCompatParcelizer(this.AudioAttributesImplApi26Parcelizer.invoke(), this.write.invoke().keySet());
    }

    @Override // kotlin.RecentUpdateSubjectDetails
    protected final Set<getRelatedLessonId> IconCompatParcelizer(setOption6AnsweredCount setoption6answeredcount) {
        toMagicModuleMetaRepoModel.write(setoption6answeredcount, "");
        if (this.RemoteActionCompatParcelizer.onAddQueueItem()) {
            return aY_();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(MediaDescriptionCompat().invoke().IconCompatParcelizer());
        Collection<getLink> collectionAV_ = AudioAttributesImplBaseParcelizer().MediaBrowserCompatSearchResultReceiver().aV_();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(collectionAV_, "");
        Iterator<T> it = collectionAV_.iterator();
        while (it.hasNext()) {
            IntermediateLoginResponseBody.IconCompatParcelizer((Collection) linkedHashSet, (Iterable) ((getLink) it.next()).read().AudioAttributesCompatParcelizer());
        }
        return linkedHashSet;
    }

    @Override // kotlin.setStatusUpdateEndTimeMs, kotlin.getMcqContentBody
    public final void RemoteActionCompatParcelizer(getRelatedLessonId getrelatedlessonid, getTimeStamp gettimestamp) {
        toMagicModuleMetaRepoModel.write(getrelatedlessonid, "");
        toMagicModuleMetaRepoModel.write(gettimestamp, "");
        Section.RemoteActionCompatParcelizer(AudioAttributesImplApi21Parcelizer().IconCompatParcelizer().MediaBrowserCompatMediaItem(), gettimestamp, AudioAttributesImplBaseParcelizer(), getrelatedlessonid);
    }

    @Override // kotlin.RecentUpdateSubjectDetails
    public final String toString() {
        StringBuilder sb = new StringBuilder("Lazy Java member scope for ");
        sb.append(this.RemoteActionCompatParcelizer.AudioAttributesImplApi21Parcelizer());
        return sb.toString();
    }
}
