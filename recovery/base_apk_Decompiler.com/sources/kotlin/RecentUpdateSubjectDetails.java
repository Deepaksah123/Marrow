package kotlin;

import android.os.Process;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.CourseConfigV2NavDrawerItems;
import kotlin.getQuote;
import kotlin.getVideoPageNotesTitle;
import kotlin.setOption6AnsweredCount;
import kotlin.setReferences;
import kotlin.setTags;

/* JADX INFO: loaded from: classes4.dex */
public abstract class RecentUpdateSubjectDetails extends setStatusUpdateEndTimeMs {
    private static /* synthetic */ isResolutionNotSupported<Object>[] AudioAttributesCompatParcelizer = {toMagicModuleMetaDataUcModel.write(new downloadMagicModuleMetalambda0(toMagicModuleMetaDataUcModel.write(RecentUpdateSubjectDetails.class), "functionNamesLazy", "getFunctionNamesLazy()Ljava/util/Set;")), toMagicModuleMetaDataUcModel.write(new downloadMagicModuleMetalambda0(toMagicModuleMetaDataUcModel.write(RecentUpdateSubjectDetails.class), "propertyNamesLazy", "getPropertyNamesLazy()Ljava/util/Set;")), toMagicModuleMetaDataUcModel.write(new downloadMagicModuleMetalambda0(toMagicModuleMetaDataUcModel.write(RecentUpdateSubjectDetails.class), "classNamesLazy", "getClassNamesLazy()Ljava/util/Set;"))};
    private final getListOfLessonCompletions<getRelatedLessonId, Collection<CourseConfigV2SupportItem>> AudioAttributesImplApi21Parcelizer;
    private final getListOfLessonCompletions<getRelatedLessonId, Collection<CourseConfigV2SupportItem>> AudioAttributesImplApi26Parcelizer;
    private final SchemaQbankItem<getRelatedLessonId, CourseConfigV2SettingsItems> AudioAttributesImplBaseParcelizer;
    private final getFeaturedCards IconCompatParcelizer;
    private final PageValue MediaBrowserCompatCustomActionResultReceiver;
    private final PageValue<getTestModels> MediaBrowserCompatItemReceiver;
    private final RecentUpdateSubjectDetails MediaBrowserCompatSearchResultReceiver;
    private final PageValue MediaDescriptionCompat;
    private final getListOfLessonCompletions<getRelatedLessonId, List<CourseConfigV2SettingsItems>> RatingCompat;
    private final PageValue<Collection<getVariant>> RemoteActionCompatParcelizer;
    private final PageValue write;

    protected abstract getVariant AudioAttributesImplBaseParcelizer();

    protected abstract Set<getRelatedLessonId> IconCompatParcelizer(setOption6AnsweredCount setoption6answeredcount);

    protected abstract void IconCompatParcelizer(getRelatedLessonId getrelatedlessonid, Collection<CourseConfigV2SettingsItems> collection);

    protected abstract CourseConfigV2TestTabItem MediaBrowserCompatCustomActionResultReceiver();

    protected abstract Set<getRelatedLessonId> RemoteActionCompatParcelizer(setOption6AnsweredCount setoption6answeredcount, getAnswerMap<? super getRelatedLessonId, Boolean> getanswermap);

    protected abstract void read(Collection<CourseConfigV2SupportItem> collection, getRelatedLessonId getrelatedlessonid);

    protected abstract Set<getRelatedLessonId> write(setOption6AnsweredCount setoption6answeredcount, getAnswerMap<? super getRelatedLessonId, Boolean> getanswermap);

    protected abstract IconCompatParcelizer write(extract extractVar, List<? extends getBadgeText> list, getLink getlink, List<? extends getMeta> list2);

    protected abstract getTestModels write();

    public /* synthetic */ RecentUpdateSubjectDetails(getFeaturedCards getfeaturedcards) {
        this(getfeaturedcards, null);
    }

    protected final getFeaturedCards AudioAttributesImplApi21Parcelizer() {
        return this.IconCompatParcelizer;
    }

    protected final RecentUpdateSubjectDetails MediaBrowserCompatSearchResultReceiver() {
        return this.MediaBrowserCompatSearchResultReceiver;
    }

    public RecentUpdateSubjectDetails(getFeaturedCards getfeaturedcards, RecentUpdateSubjectDetails recentUpdateSubjectDetails) {
        toMagicModuleMetaRepoModel.write(getfeaturedcards, "");
        this.IconCompatParcelizer = getfeaturedcards;
        this.MediaBrowserCompatSearchResultReceiver = recentUpdateSubjectDetails;
        this.RemoteActionCompatParcelizer = getfeaturedcards.read().write(new read(), IntermediateLoginResponseBody.RemoteActionCompatParcelizer());
        this.MediaBrowserCompatItemReceiver = getfeaturedcards.read().read(new AudioAttributesImplApi26Parcelizer());
        this.AudioAttributesImplApi26Parcelizer = getfeaturedcards.read().AudioAttributesCompatParcelizer(new MediaBrowserCompatCustomActionResultReceiver());
        this.AudioAttributesImplBaseParcelizer = getfeaturedcards.read().IconCompatParcelizer(new AudioAttributesCompatParcelizer());
        this.AudioAttributesImplApi21Parcelizer = getfeaturedcards.read().AudioAttributesCompatParcelizer(new MediaBrowserCompatItemReceiver());
        this.MediaBrowserCompatCustomActionResultReceiver = getfeaturedcards.read().read(new AudioAttributesImplBaseParcelizer());
        this.MediaDescriptionCompat = getfeaturedcards.read().read(new RatingCompat());
        this.write = getfeaturedcards.read().read(new RemoteActionCompatParcelizer());
        this.RatingCompat = getfeaturedcards.read().AudioAttributesCompatParcelizer(new AudioAttributesImplApi21Parcelizer());
    }

    public static final class read extends MagicModuleUseCase implements getCreatedOnDateMs<Collection<? extends getVariant>> {
        public static int RemoteActionCompatParcelizer;
        public static int read;

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Collection<getVariant> invoke() {
            RecentUpdateSubjectDetails recentUpdateSubjectDetails = RecentUpdateSubjectDetails.this;
            setOption6AnsweredCount setoption6answeredcount = setOption6AnsweredCount.write;
            setTags.RemoteActionCompatParcelizer remoteActionCompatParcelizer = setTags.read;
            return recentUpdateSubjectDetails.AudioAttributesCompatParcelizer(setoption6answeredcount, setTags.RemoteActionCompatParcelizer.write());
        }

        read() {
            super(0);
        }

        public static int write() {
            int i = RemoteActionCompatParcelizer;
            int i2 = i % 8175785;
            RemoteActionCompatParcelizer = i + 1;
            if (i2 != 0) {
                return read;
            }
            int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
            read = iMaxMemory;
            return iMaxMemory;
        }
    }

    protected final PageValue<Collection<getVariant>> AudioAttributesImplApi26Parcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    static final class AudioAttributesImplApi26Parcelizer extends MagicModuleUseCase implements getCreatedOnDateMs<getTestModels> {
        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public getTestModels invoke() {
            return RecentUpdateSubjectDetails.this.write();
        }

        AudioAttributesImplApi26Parcelizer() {
            super(0);
        }
    }

    protected final PageValue<getTestModels> MediaDescriptionCompat() {
        return this.MediaBrowserCompatItemReceiver;
    }

    static final class MediaBrowserCompatCustomActionResultReceiver extends MagicModuleUseCase implements getAnswerMap<getRelatedLessonId, Collection<? extends CourseConfigV2SupportItem>> {
        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Collection<CourseConfigV2SupportItem> invoke(getRelatedLessonId getrelatedlessonid) {
            toMagicModuleMetaRepoModel.write(getrelatedlessonid, "");
            if (RecentUpdateSubjectDetails.this.MediaBrowserCompatSearchResultReceiver() != null) {
                return (Collection) RecentUpdateSubjectDetails.this.MediaBrowserCompatSearchResultReceiver().AudioAttributesImplApi26Parcelizer.invoke(getrelatedlessonid);
            }
            ArrayList arrayList = new ArrayList();
            for (extract extractVar : RecentUpdateSubjectDetails.this.MediaDescriptionCompat().invoke().RemoteActionCompatParcelizer(getrelatedlessonid)) {
                setUserInitiatedExamStartedOn setuserinitiatedexamstartedonIconCompatParcelizer = RecentUpdateSubjectDetails.this.IconCompatParcelizer(extractVar);
                if (RecentUpdateSubjectDetails.this.AudioAttributesCompatParcelizer(setuserinitiatedexamstartedonIconCompatParcelizer)) {
                    RecentUpdateSubjectDetails.this.AudioAttributesImplApi21Parcelizer().IconCompatParcelizer().AudioAttributesImplBaseParcelizer().IconCompatParcelizer(extractVar, setuserinitiatedexamstartedonIconCompatParcelizer);
                    arrayList.add(setuserinitiatedexamstartedonIconCompatParcelizer);
                }
            }
            ArrayList arrayList2 = arrayList;
            RecentUpdateSubjectDetails.this.RemoteActionCompatParcelizer(arrayList2, getrelatedlessonid);
            return arrayList2;
        }

        MediaBrowserCompatCustomActionResultReceiver() {
            super(1);
        }
    }

    static final class AudioAttributesCompatParcelizer extends MagicModuleUseCase implements getAnswerMap<getRelatedLessonId, CourseConfigV2SettingsItems> {
        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public CourseConfigV2SettingsItems invoke(getRelatedLessonId getrelatedlessonid) {
            toMagicModuleMetaRepoModel.write(getrelatedlessonid, "");
            if (RecentUpdateSubjectDetails.this.MediaBrowserCompatSearchResultReceiver() != null) {
                return (CourseConfigV2SettingsItems) RecentUpdateSubjectDetails.this.MediaBrowserCompatSearchResultReceiver().AudioAttributesImplBaseParcelizer.invoke(getrelatedlessonid);
            }
            getExpiryTimeStamp getexpirytimestampWrite = RecentUpdateSubjectDetails.this.MediaDescriptionCompat().invoke().write(getrelatedlessonid);
            if (getexpirytimestampWrite == null || getexpirytimestampWrite.MediaBrowserCompatItemReceiver()) {
                return null;
            }
            return RecentUpdateSubjectDetails.this.AudioAttributesCompatParcelizer(getexpirytimestampWrite);
        }

        AudioAttributesCompatParcelizer() {
            super(1);
        }
    }

    static final class MediaBrowserCompatItemReceiver extends MagicModuleUseCase implements getAnswerMap<getRelatedLessonId, Collection<? extends CourseConfigV2SupportItem>> {
        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public Collection<CourseConfigV2SupportItem> invoke(getRelatedLessonId getrelatedlessonid) {
            toMagicModuleMetaRepoModel.write(getrelatedlessonid, "");
            LinkedHashSet linkedHashSet = new LinkedHashSet((Collection) RecentUpdateSubjectDetails.this.AudioAttributesImplApi26Parcelizer.invoke(getrelatedlessonid));
            RecentUpdateSubjectDetails.RemoteActionCompatParcelizer(linkedHashSet);
            LinkedHashSet linkedHashSet2 = linkedHashSet;
            RecentUpdateSubjectDetails.this.read(linkedHashSet2, getrelatedlessonid);
            return IntermediateLoginResponseBody.onPlay(RecentUpdateSubjectDetails.this.AudioAttributesImplApi21Parcelizer().IconCompatParcelizer().onCommand().write(RecentUpdateSubjectDetails.this.AudioAttributesImplApi21Parcelizer(), linkedHashSet2));
        }

        MediaBrowserCompatItemReceiver() {
            super(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void RemoteActionCompatParcelizer(Set<CourseConfigV2SupportItem> set) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : set) {
            String strRemoteActionCompatParcelizer = getPublishedTime.RemoteActionCompatParcelizer((CourseConfigV2SupportItem) obj, false, false, 2);
            Object obj2 = linkedHashMap.get(strRemoteActionCompatParcelizer);
            if (obj2 == null) {
                obj2 = (List) new ArrayList();
                linkedHashMap.put(strRemoteActionCompatParcelizer, obj2);
            }
            ((List) obj2).add(obj);
        }
        for (List list : linkedHashMap.values()) {
            if (list.size() != 1) {
                List list2 = list;
                Collection<? extends CourseConfigV2SupportItem> collectionWrite = setOption1.write(list2, MediaBrowserCompatSearchResultReceiver.write);
                set.removeAll(list2);
                set.addAll(collectionWrite);
            }
        }
    }

    static final class MediaBrowserCompatSearchResultReceiver extends MagicModuleUseCase implements getAnswerMap<CourseConfigV2SupportItem, getVideoPageNotesTitle> {
        public static final MediaBrowserCompatSearchResultReceiver write = new MediaBrowserCompatSearchResultReceiver();

        private static getVideoPageNotesTitle read(CourseConfigV2SupportItem courseConfigV2SupportItem) {
            toMagicModuleMetaRepoModel.write(courseConfigV2SupportItem, "");
            return courseConfigV2SupportItem;
        }

        @Override // kotlin.getAnswerMap
        public final /* synthetic */ getVideoPageNotesTitle invoke(CourseConfigV2SupportItem courseConfigV2SupportItem) {
            return read(courseConfigV2SupportItem);
        }

        MediaBrowserCompatSearchResultReceiver() {
            super(1);
        }
    }

    protected static final class IconCompatParcelizer {
        private final getLink AudioAttributesCompatParcelizer;
        private final List<getMeta> AudioAttributesImplApi26Parcelizer;
        private final boolean IconCompatParcelizer;
        private final List<getBadgeText> RemoteActionCompatParcelizer;
        private final List<String> read;
        private final getLink write;

        /* JADX WARN: Multi-variable type inference failed */
        public IconCompatParcelizer(getLink getlink, getLink getlink2, List<? extends getMeta> list, List<? extends getBadgeText> list2, boolean z, List<String> list3) {
            toMagicModuleMetaRepoModel.write(getlink, "");
            toMagicModuleMetaRepoModel.write(list, "");
            toMagicModuleMetaRepoModel.write(list2, "");
            toMagicModuleMetaRepoModel.write(list3, "");
            this.AudioAttributesCompatParcelizer = getlink;
            this.write = getlink2;
            this.AudioAttributesImplApi26Parcelizer = list;
            this.RemoteActionCompatParcelizer = list2;
            this.IconCompatParcelizer = z;
            this.read = list3;
        }

        public final getLink IconCompatParcelizer() {
            return this.AudioAttributesCompatParcelizer;
        }

        public final getLink RemoteActionCompatParcelizer() {
            return this.write;
        }

        public final List<getMeta> AudioAttributesImplApi21Parcelizer() {
            return this.AudioAttributesImplApi26Parcelizer;
        }

        public final List<getBadgeText> AudioAttributesCompatParcelizer() {
            return this.RemoteActionCompatParcelizer;
        }

        public final boolean read() {
            return this.IconCompatParcelizer;
        }

        public final List<String> write() {
            return this.read;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof IconCompatParcelizer)) {
                return false;
            }
            IconCompatParcelizer iconCompatParcelizer = (IconCompatParcelizer) obj;
            return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, iconCompatParcelizer.AudioAttributesCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.write, iconCompatParcelizer.write) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.AudioAttributesImplApi26Parcelizer, iconCompatParcelizer.AudioAttributesImplApi26Parcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, iconCompatParcelizer.RemoteActionCompatParcelizer) && this.IconCompatParcelizer == iconCompatParcelizer.IconCompatParcelizer && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.read, iconCompatParcelizer.read);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r4v1, types: [int] */
        /* JADX WARN: Type inference failed for: r4v2 */
        /* JADX WARN: Type inference failed for: r4v3 */
        public final int hashCode() {
            int iHashCode = this.AudioAttributesCompatParcelizer.hashCode();
            getLink getlink = this.write;
            int iHashCode2 = getlink == null ? 0 : getlink.hashCode();
            int iHashCode3 = this.AudioAttributesImplApi26Parcelizer.hashCode();
            int iHashCode4 = this.RemoteActionCompatParcelizer.hashCode();
            boolean z = this.IconCompatParcelizer;
            ?? r4 = z;
            if (z) {
                r4 = 1;
            }
            return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + r4) * 31) + this.read.hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("MethodSignatureData(returnType=");
            sb.append(this.AudioAttributesCompatParcelizer);
            sb.append(", receiverType=");
            sb.append(this.write);
            sb.append(", valueParameters=");
            sb.append(this.AudioAttributesImplApi26Parcelizer);
            sb.append(", typeParameters=");
            sb.append(this.RemoteActionCompatParcelizer);
            sb.append(", hasStableParameterNames=");
            sb.append(this.IconCompatParcelizer);
            sb.append(", errors=");
            sb.append(this.read);
            sb.append(')');
            return sb.toString();
        }
    }

    protected final setUserInitiatedExamStartedOn IconCompatParcelizer(extract extractVar) {
        CourseConfigV2TestTabItem courseConfigV2TestTabItemAudioAttributesCompatParcelizer;
        Map<? extends getVideoPageNotesTitle.RemoteActionCompatParcelizer<?>, ?> map;
        toMagicModuleMetaRepoModel.write(extractVar, "");
        setUserInitiatedExamStartedOn setuserinitiatedexamstartedonRemoteActionCompatParcelizer = setUserInitiatedExamStartedOn.RemoteActionCompatParcelizer(AudioAttributesImplBaseParcelizer(), fromVideo.write(this.IconCompatParcelizer, extractVar), extractVar.RatingCompat(), this.IconCompatParcelizer.IconCompatParcelizer().MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver().write(extractVar), this.MediaBrowserCompatItemReceiver.invoke().IconCompatParcelizer(extractVar.RatingCompat()) != null && extractVar.AudioAttributesImplApi21Parcelizer().isEmpty());
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(setuserinitiatedexamstartedonRemoteActionCompatParcelizer, "");
        getFeaturedCards getfeaturedcardsIconCompatParcelizer = FilterParams.IconCompatParcelizer(this.IconCompatParcelizer, setuserinitiatedexamstartedonRemoteActionCompatParcelizer, extractVar, 0);
        List<setStartTimeStamp> listOnCommand = extractVar.onCommand();
        ArrayList arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) listOnCommand, 10));
        Iterator<T> it = listOnCommand.iterator();
        while (it.hasNext()) {
            getBadgeText getbadgetextWrite = getfeaturedcardsIconCompatParcelizer.MediaBrowserCompatItemReceiver().write((setStartTimeStamp) it.next());
            toMagicModuleMetaRepoModel.write(getbadgetextWrite);
            arrayList.add(getbadgetextWrite);
        }
        write writeVarIconCompatParcelizer = IconCompatParcelizer(getfeaturedcardsIconCompatParcelizer, setuserinitiatedexamstartedonRemoteActionCompatParcelizer, extractVar.AudioAttributesImplApi21Parcelizer());
        IconCompatParcelizer iconCompatParcelizerWrite = write(extractVar, arrayList, AudioAttributesCompatParcelizer(extractVar, getfeaturedcardsIconCompatParcelizer), writeVarIconCompatParcelizer.IconCompatParcelizer());
        getLink getlinkRemoteActionCompatParcelizer = iconCompatParcelizerWrite.RemoteActionCompatParcelizer();
        if (getlinkRemoteActionCompatParcelizer != null) {
            getQuote.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = getQuote.IconCompatParcelizer;
            courseConfigV2TestTabItemAudioAttributesCompatParcelizer = getOption2.AudioAttributesCompatParcelizer(setuserinitiatedexamstartedonRemoteActionCompatParcelizer, getlinkRemoteActionCompatParcelizer, getQuote.AudioAttributesCompatParcelizer.read());
        } else {
            courseConfigV2TestTabItemAudioAttributesCompatParcelizer = null;
        }
        CourseConfigV2TestTabItem courseConfigV2TestTabItem = courseConfigV2TestTabItemAudioAttributesCompatParcelizer;
        CourseConfigV2TestTabItem courseConfigV2TestTabItemMediaBrowserCompatCustomActionResultReceiver = MediaBrowserCompatCustomActionResultReceiver();
        List<CourseConfigV2TestTabItem> listRemoteActionCompatParcelizer = IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
        List<getBadgeText> listAudioAttributesCompatParcelizer = iconCompatParcelizerWrite.AudioAttributesCompatParcelizer();
        List<getMeta> listAudioAttributesImplApi21Parcelizer = iconCompatParcelizerWrite.AudioAttributesImplApi21Parcelizer();
        getLink getlinkIconCompatParcelizer = iconCompatParcelizerWrite.IconCompatParcelizer();
        CourseConfigV2NavDrawerItems.write writeVar = CourseConfigV2NavDrawerItems.write;
        CourseConfigV2NavDrawerItems courseConfigV2NavDrawerItemsWrite = CourseConfigV2NavDrawerItems.write.write(false, extractVar.handleMediaPlayPauseIfPendingOnHandler(), !extractVar.onPlayFromMediaId());
        CourseConfigV2NavDrawerItemFreeExtension courseConfigV2NavDrawerItemFreeExtensionIconCompatParcelizer = getModuleMessage.IconCompatParcelizer(extractVar.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver());
        if (iconCompatParcelizerWrite.RemoteActionCompatParcelizer() != null) {
            map = VideoTimelineResponseBody.read(setAction.write(setUserInitiatedExamStartedOn.read, IntermediateLoginResponseBody.RatingCompat((List) writeVarIconCompatParcelizer.IconCompatParcelizer())));
        } else {
            map = VideoTimelineResponseBody.read();
        }
        setuserinitiatedexamstartedonRemoteActionCompatParcelizer.read(courseConfigV2TestTabItem, courseConfigV2TestTabItemMediaBrowserCompatCustomActionResultReceiver, listRemoteActionCompatParcelizer, listAudioAttributesCompatParcelizer, listAudioAttributesImplApi21Parcelizer, getlinkIconCompatParcelizer, courseConfigV2NavDrawerItemsWrite, courseConfigV2NavDrawerItemFreeExtensionIconCompatParcelizer, map);
        setuserinitiatedexamstartedonRemoteActionCompatParcelizer.RemoteActionCompatParcelizer(iconCompatParcelizerWrite.read(), writeVarIconCompatParcelizer.write());
        if (!iconCompatParcelizerWrite.write().isEmpty()) {
            getfeaturedcardsIconCompatParcelizer.IconCompatParcelizer().handleMediaPlayPauseIfPendingOnHandler().AudioAttributesCompatParcelizer(setuserinitiatedexamstartedonRemoteActionCompatParcelizer, iconCompatParcelizerWrite.write());
        }
        return setuserinitiatedexamstartedonRemoteActionCompatParcelizer;
    }

    protected static getLink AudioAttributesCompatParcelizer(extract extractVar, getFeaturedCards getfeaturedcards) {
        toMagicModuleMetaRepoModel.write(extractVar, "");
        toMagicModuleMetaRepoModel.write(getfeaturedcards, "");
        return getfeaturedcards.AudioAttributesImplApi21Parcelizer().read(extractVar.MediaBrowserCompatItemReceiver(), getPublishedOnMs.read(setGroupSubttile.COMMON, extractVar.AudioAttributesImplBaseParcelizer().onAddQueueItem(), false, null, 6));
    }

    protected static final class write {
        private final boolean read;
        private final List<getMeta> write;

        /* JADX WARN: Multi-variable type inference failed */
        public write(List<? extends getMeta> list, boolean z) {
            toMagicModuleMetaRepoModel.write(list, "");
            this.write = list;
            this.read = z;
        }

        public final List<getMeta> IconCompatParcelizer() {
            return this.write;
        }

        public final boolean write() {
            return this.read;
        }
    }

    protected static write IconCompatParcelizer(getFeaturedCards getfeaturedcards, CourseConfigV2NavDrawerItemRateUs courseConfigV2NavDrawerItemRateUs, List<? extends setStatus> list) {
        Pair pairWrite;
        getRelatedLessonId getrelatedlessonidAudioAttributesCompatParcelizer;
        toMagicModuleMetaRepoModel.write(getfeaturedcards, "");
        toMagicModuleMetaRepoModel.write(courseConfigV2NavDrawerItemRateUs, "");
        toMagicModuleMetaRepoModel.write(list, "");
        Iterable<SyncResult> iterableOnPlayFromSearch = IntermediateLoginResponseBody.onPlayFromSearch(list);
        ArrayList arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer(iterableOnPlayFromSearch, 10));
        boolean z = false;
        for (SyncResult syncResult : iterableOnPlayFromSearch) {
            int iIconCompatParcelizer = syncResult.IconCompatParcelizer();
            setStatus setstatus = (setStatus) syncResult.read();
            getQuote getquoteWrite = fromVideo.write(getfeaturedcards, setstatus);
            RecentUpdatesLastSyncedModel recentUpdatesLastSyncedModel = getPublishedOnMs.read(setGroupSubttile.COMMON, false, false, null, 7);
            if (setstatus.write()) {
                setQuestionCount setquestioncountRemoteActionCompatParcelizer = setstatus.RemoteActionCompatParcelizer();
                isUnattempted isunattempted = setquestioncountRemoteActionCompatParcelizer instanceof isUnattempted ? (isUnattempted) setquestioncountRemoteActionCompatParcelizer : null;
                if (isunattempted == null) {
                    throw new AssertionError("Vararg parameter should be an array: ".concat(String.valueOf(setstatus)));
                }
                getLink getlink = getfeaturedcards.AudioAttributesImplApi21Parcelizer().read(isunattempted, recentUpdatesLastSyncedModel, true);
                pairWrite = setAction.write(getlink, getfeaturedcards.write().write().MediaDescriptionCompat(getlink));
            } else {
                pairWrite = setAction.write(getfeaturedcards.AudioAttributesImplApi21Parcelizer().read(setstatus.RemoteActionCompatParcelizer(), recentUpdatesLastSyncedModel), null);
            }
            getLink getlink2 = (getLink) pairWrite.RemoteActionCompatParcelizer();
            getLink getlink3 = (getLink) pairWrite.read();
            if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) courseConfigV2NavDrawerItemRateUs.aQ_().AudioAttributesCompatParcelizer(), (Object) "equals") && list.size() == 1 && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(getfeaturedcards.write().write().onCommand(), getlink2)) {
                getrelatedlessonidAudioAttributesCompatParcelizer = getRelatedLessonId.RemoteActionCompatParcelizer("other");
            } else {
                getrelatedlessonidAudioAttributesCompatParcelizer = setstatus.AudioAttributesCompatParcelizer();
                if (getrelatedlessonidAudioAttributesCompatParcelizer == null) {
                    z = true;
                }
                if (getrelatedlessonidAudioAttributesCompatParcelizer == null) {
                    getrelatedlessonidAudioAttributesCompatParcelizer = getRelatedLessonId.RemoteActionCompatParcelizer(TtmlNode.TAG_P.concat(String.valueOf(iIconCompatParcelizer)));
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getrelatedlessonidAudioAttributesCompatParcelizer, "");
                }
            }
            getRelatedLessonId getrelatedlessonid = getrelatedlessonidAudioAttributesCompatParcelizer;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getrelatedlessonid, "");
            arrayList.add(new getLastHtmlBody(courseConfigV2NavDrawerItemRateUs, null, iIconCompatParcelizer, getquoteWrite, getrelatedlessonid, getlink2, false, false, false, getlink3, getfeaturedcards.IconCompatParcelizer().MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver().write(setstatus)));
        }
        return new write(IntermediateLoginResponseBody.onPlay(arrayList), z);
    }

    static final class AudioAttributesImplBaseParcelizer extends MagicModuleUseCase implements getCreatedOnDateMs<Set<? extends getRelatedLessonId>> {
        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public Set<getRelatedLessonId> invoke() {
            return RecentUpdateSubjectDetails.this.write(setOption6AnsweredCount.read, null);
        }

        AudioAttributesImplBaseParcelizer() {
            super(0);
        }
    }

    static final class RatingCompat extends MagicModuleUseCase implements getCreatedOnDateMs<Set<? extends getRelatedLessonId>> {
        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public Set<getRelatedLessonId> invoke() {
            return RecentUpdateSubjectDetails.this.IconCompatParcelizer(setOption6AnsweredCount.MediaBrowserCompatItemReceiver);
        }

        RatingCompat() {
            super(0);
        }
    }

    private final Set<getRelatedLessonId> MediaBrowserCompatItemReceiver() {
        return (Set) Pearl.RemoteActionCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver, AudioAttributesCompatParcelizer[0]);
    }

    static final class RemoteActionCompatParcelizer extends MagicModuleUseCase implements getCreatedOnDateMs<Set<? extends getRelatedLessonId>> {
        public static int RemoteActionCompatParcelizer;
        public static int write;

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public Set<getRelatedLessonId> invoke() {
            return RecentUpdateSubjectDetails.this.RemoteActionCompatParcelizer(setOption6AnsweredCount.RemoteActionCompatParcelizer, (getAnswerMap<? super getRelatedLessonId, Boolean>) null);
        }

        RemoteActionCompatParcelizer() {
            super(0);
        }

        public static int IconCompatParcelizer() {
            int i = write;
            int i2 = i % 6652994;
            write = i + 1;
            if (i2 != 0) {
                return RemoteActionCompatParcelizer;
            }
            int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
            RemoteActionCompatParcelizer = startElapsedRealtime;
            return startElapsedRealtime;
        }
    }

    private final Set<getRelatedLessonId> RatingCompat() {
        return (Set) Pearl.RemoteActionCompatParcelizer(this.MediaDescriptionCompat, AudioAttributesCompatParcelizer[1]);
    }

    private final Set<getRelatedLessonId> IconCompatParcelizer() {
        return (Set) Pearl.RemoteActionCompatParcelizer(this.write, AudioAttributesCompatParcelizer[2]);
    }

    @Override // kotlin.setStatusUpdateEndTimeMs, kotlin.setTags
    public final Set<getRelatedLessonId> aY_() {
        return MediaBrowserCompatItemReceiver();
    }

    @Override // kotlin.setStatusUpdateEndTimeMs, kotlin.setTags
    public final Set<getRelatedLessonId> AudioAttributesCompatParcelizer() {
        return RatingCompat();
    }

    @Override // kotlin.setStatusUpdateEndTimeMs, kotlin.setTags
    public final Set<getRelatedLessonId> aW_() {
        return IconCompatParcelizer();
    }

    @Override // kotlin.setStatusUpdateEndTimeMs, kotlin.setTags, kotlin.getMcqContentBody
    public Collection<CourseConfigV2SupportItem> read(getRelatedLessonId getrelatedlessonid, getTimeStamp gettimestamp) {
        toMagicModuleMetaRepoModel.write(getrelatedlessonid, "");
        toMagicModuleMetaRepoModel.write(gettimestamp, "");
        return !aY_().contains(getrelatedlessonid) ? IntermediateLoginResponseBody.RemoteActionCompatParcelizer() : this.AudioAttributesImplApi21Parcelizer.invoke(getrelatedlessonid);
    }

    static final class AudioAttributesImplApi21Parcelizer extends MagicModuleUseCase implements getAnswerMap<getRelatedLessonId, List<? extends CourseConfigV2SettingsItems>> {
        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public List<CourseConfigV2SettingsItems> invoke(getRelatedLessonId getrelatedlessonid) {
            toMagicModuleMetaRepoModel.write(getrelatedlessonid, "");
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = arrayList;
            SubjectGroupTypeConstant.write(arrayList2, RecentUpdateSubjectDetails.this.AudioAttributesImplBaseParcelizer.invoke(getrelatedlessonid));
            RecentUpdateSubjectDetails.this.IconCompatParcelizer(getrelatedlessonid, arrayList2);
            if (getAnswerDescription.AudioAttributesImplBaseParcelizer(RecentUpdateSubjectDetails.this.AudioAttributesImplBaseParcelizer())) {
                return IntermediateLoginResponseBody.onPlay(arrayList);
            }
            return IntermediateLoginResponseBody.onPlay(RecentUpdateSubjectDetails.this.AudioAttributesImplApi21Parcelizer().IconCompatParcelizer().onCommand().write(RecentUpdateSubjectDetails.this.AudioAttributesImplApi21Parcelizer(), arrayList2));
        }

        AudioAttributesImplApi21Parcelizer() {
            super(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CourseConfigV2SettingsItems AudioAttributesCompatParcelizer(getExpiryTimeStamp getexpirytimestamp) {
        getRootSubjectId getrootsubjectidIconCompatParcelizer = IconCompatParcelizer(getexpirytimestamp);
        getrootsubjectidIconCompatParcelizer.write((SchemaKt) null, (getAppSettings) null, (CourseConfigV2NavDrawerItemKnowMore) null, (CourseConfigV2NavDrawerItemKnowMore) null);
        getrootsubjectidIconCompatParcelizer.write(write(getexpirytimestamp), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(), MediaBrowserCompatCustomActionResultReceiver(), null, IntermediateLoginResponseBody.RemoteActionCompatParcelizer());
        if (getAnswerDescription.write(getrootsubjectidIconCompatParcelizer, getrootsubjectidIconCompatParcelizer.onPrepareFromMediaId())) {
            getrootsubjectidIconCompatParcelizer.IconCompatParcelizer(new MediaDescriptionCompat(getexpirytimestamp, getrootsubjectidIconCompatParcelizer));
        }
        getRootSubjectId getrootsubjectid = getrootsubjectidIconCompatParcelizer;
        this.IconCompatParcelizer.IconCompatParcelizer().AudioAttributesImplBaseParcelizer().write(getexpirytimestamp, getrootsubjectid);
        return getrootsubjectid;
    }

    static final class MediaDescriptionCompat extends MagicModuleUseCase implements getCreatedOnDateMs<SchemaLessonStatusResponse<? extends getMagicLine<?>>> {
        private /* synthetic */ getRootSubjectId AudioAttributesCompatParcelizer;
        private /* synthetic */ getExpiryTimeStamp IconCompatParcelizer;

        /* JADX INFO: renamed from: o.RecentUpdateSubjectDetails$MediaDescriptionCompat$1, reason: invalid class name */
        static final class AnonymousClass1 extends MagicModuleUseCase implements getCreatedOnDateMs<getMagicLine<?>> {
            private /* synthetic */ getRootSubjectId AudioAttributesCompatParcelizer;
            private /* synthetic */ getExpiryTimeStamp IconCompatParcelizer;
            private /* synthetic */ RecentUpdateSubjectDetails RemoteActionCompatParcelizer;

            /* JADX INFO: Access modifiers changed from: private */
            @Override // kotlin.getCreatedOnDateMs
            /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
            public getMagicLine<?> invoke() {
                return this.RemoteActionCompatParcelizer.AudioAttributesImplApi21Parcelizer().IconCompatParcelizer().AudioAttributesImplApi26Parcelizer().read(this.IconCompatParcelizer, this.AudioAttributesCompatParcelizer);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(RecentUpdateSubjectDetails recentUpdateSubjectDetails, getExpiryTimeStamp getexpirytimestamp, getRootSubjectId getrootsubjectid) {
                super(0);
                this.RemoteActionCompatParcelizer = recentUpdateSubjectDetails;
                this.IconCompatParcelizer = getexpirytimestamp;
                this.AudioAttributesCompatParcelizer = getrootsubjectid;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public SchemaLessonStatusResponse<getMagicLine<?>> invoke() {
            return RecentUpdateSubjectDetails.this.AudioAttributesImplApi21Parcelizer().read().AudioAttributesCompatParcelizer(new AnonymousClass1(RecentUpdateSubjectDetails.this, this.IconCompatParcelizer, this.AudioAttributesCompatParcelizer));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        MediaDescriptionCompat(getExpiryTimeStamp getexpirytimestamp, getRootSubjectId getrootsubjectid) {
            super(0);
            this.IconCompatParcelizer = getexpirytimestamp;
            this.AudioAttributesCompatParcelizer = getrootsubjectid;
        }
    }

    private final getRootSubjectId IconCompatParcelizer(getExpiryTimeStamp getexpirytimestamp) {
        setWarningMsg setwarningmsgRemoteActionCompatParcelizer = setWarningMsg.RemoteActionCompatParcelizer(AudioAttributesImplBaseParcelizer(), fromVideo.write(this.IconCompatParcelizer, getexpirytimestamp), CourseConfigV2NavDrawerItems.FINAL, getModuleMessage.IconCompatParcelizer(getexpirytimestamp.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver()), !getexpirytimestamp.onPlayFromMediaId(), getexpirytimestamp.RatingCompat(), this.IconCompatParcelizer.IconCompatParcelizer().MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver().write(getexpirytimestamp), read(getexpirytimestamp));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(setwarningmsgRemoteActionCompatParcelizer, "");
        return setwarningmsgRemoteActionCompatParcelizer;
    }

    private static boolean read(getExpiryTimeStamp getexpirytimestamp) {
        return getexpirytimestamp.onPlayFromMediaId() && getexpirytimestamp.onPlayFromUri();
    }

    private final getLink write(getExpiryTimeStamp getexpirytimestamp) {
        getLink getlink = this.IconCompatParcelizer.AudioAttributesImplApi21Parcelizer().read(getexpirytimestamp.AudioAttributesImplApi21Parcelizer(), getPublishedOnMs.read(setGroupSubttile.COMMON, false, false, null, 7));
        if (getTestTabItems.AudioAttributesImplBaseParcelizer(getlink) || getTestTabItems.MediaBrowserCompatMediaItem(getlink)) {
            read(getexpirytimestamp);
        }
        return getlink;
    }

    @Override // kotlin.setStatusUpdateEndTimeMs, kotlin.setTags
    public Collection<CourseConfigV2SettingsItems> IconCompatParcelizer(getRelatedLessonId getrelatedlessonid, getTimeStamp gettimestamp) {
        toMagicModuleMetaRepoModel.write(getrelatedlessonid, "");
        toMagicModuleMetaRepoModel.write(gettimestamp, "");
        return !AudioAttributesCompatParcelizer().contains(getrelatedlessonid) ? IntermediateLoginResponseBody.RemoteActionCompatParcelizer() : this.RatingCompat.invoke(getrelatedlessonid);
    }

    @Override // kotlin.setStatusUpdateEndTimeMs, kotlin.getMcqContentBody
    public Collection<getVariant> read(setOption6AnsweredCount setoption6answeredcount, getAnswerMap<? super getRelatedLessonId, Boolean> getanswermap) {
        toMagicModuleMetaRepoModel.write(setoption6answeredcount, "");
        toMagicModuleMetaRepoModel.write(getanswermap, "");
        return this.RemoteActionCompatParcelizer.invoke();
    }

    protected final List<getVariant> AudioAttributesCompatParcelizer(setOption6AnsweredCount setoption6answeredcount, getAnswerMap<? super getRelatedLessonId, Boolean> getanswermap) {
        toMagicModuleMetaRepoModel.write(setoption6answeredcount, "");
        toMagicModuleMetaRepoModel.write(getanswermap, "");
        isCollapsible iscollapsible = isCollapsible.WHEN_GET_ALL_DESCRIPTORS;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        setOption6AnsweredCount.write writeVar = setOption6AnsweredCount.IconCompatParcelizer;
        if (setoption6answeredcount.AudioAttributesCompatParcelizer(setOption6AnsweredCount.write.IconCompatParcelizer())) {
            for (getRelatedLessonId getrelatedlessonid : RemoteActionCompatParcelizer(setoption6answeredcount, getanswermap)) {
                if (getanswermap.invoke(getrelatedlessonid).booleanValue()) {
                    SubjectGroupTypeConstant.write(linkedHashSet, AudioAttributesCompatParcelizer(getrelatedlessonid, iscollapsible));
                }
            }
        }
        setOption6AnsweredCount.write writeVar2 = setOption6AnsweredCount.IconCompatParcelizer;
        if (setoption6answeredcount.AudioAttributesCompatParcelizer(setOption6AnsweredCount.write.read()) && !setoption6answeredcount.AudioAttributesImplBaseParcelizer().contains(setReferences.read.IconCompatParcelizer)) {
            for (getRelatedLessonId getrelatedlessonid2 : write(setoption6answeredcount, getanswermap)) {
                if (getanswermap.invoke(getrelatedlessonid2).booleanValue()) {
                    linkedHashSet.addAll(read(getrelatedlessonid2, iscollapsible));
                }
            }
        }
        setOption6AnsweredCount.write writeVar3 = setOption6AnsweredCount.IconCompatParcelizer;
        if (setoption6answeredcount.AudioAttributesCompatParcelizer(setOption6AnsweredCount.write.AudioAttributesImplBaseParcelizer()) && !setoption6answeredcount.AudioAttributesImplBaseParcelizer().contains(setReferences.read.IconCompatParcelizer)) {
            for (getRelatedLessonId getrelatedlessonid3 : IconCompatParcelizer(setoption6answeredcount)) {
                if (getanswermap.invoke(getrelatedlessonid3).booleanValue()) {
                    linkedHashSet.addAll(IconCompatParcelizer(getrelatedlessonid3, iscollapsible));
                }
            }
        }
        return IntermediateLoginResponseBody.onPlay(linkedHashSet);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Lazy scope for ");
        sb.append(AudioAttributesImplBaseParcelizer());
        return sb.toString();
    }

    protected void RemoteActionCompatParcelizer(Collection<CourseConfigV2SupportItem> collection, getRelatedLessonId getrelatedlessonid) {
        toMagicModuleMetaRepoModel.write(collection, "");
        toMagicModuleMetaRepoModel.write(getrelatedlessonid, "");
    }

    protected boolean AudioAttributesCompatParcelizer(setUserInitiatedExamStartedOn setuserinitiatedexamstartedon) {
        toMagicModuleMetaRepoModel.write(setuserinitiatedexamstartedon, "");
        return true;
    }
}
