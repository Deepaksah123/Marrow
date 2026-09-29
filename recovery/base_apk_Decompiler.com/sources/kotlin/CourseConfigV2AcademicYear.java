package kotlin;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.getIntegerMap;
import kotlin.getQuote;
import kotlin.getTestHeaderTitle;

/* JADX INFO: loaded from: classes4.dex */
public final class CourseConfigV2AcademicYear extends getAttemptedCount {
    public static final read read = new read(0);

    @Override // kotlin.getIntegerMap, kotlin.CourseConfigV2NavDrawerItemRateUs
    public final boolean AudioAttributesCompatParcelizer() {
        return false;
    }

    @Override // kotlin.getIntegerMap, kotlin.CourseConfigV2NavDrawerItemRateUs
    public final boolean IconCompatParcelizer() {
        return false;
    }

    @Override // kotlin.getIntegerMap, kotlin.CourseConfigV2NavDrawerItemYourCourse
    public final boolean onMediaButtonEvent() {
        return false;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    private CourseConfigV2AcademicYear(getVariant getvariant, CourseConfigV2AcademicYear courseConfigV2AcademicYear, getTestHeaderTitle.RemoteActionCompatParcelizer remoteActionCompatParcelizer, boolean z) {
        CourseConfigV2AcademicYear courseConfigV2AcademicYear2 = courseConfigV2AcademicYear;
        getQuote.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = getQuote.IconCompatParcelizer;
        super(getvariant, courseConfigV2AcademicYear2, getQuote.AudioAttributesCompatParcelizer.read(), setSuggestedSubjects.MediaBrowserCompatMediaItem, remoteActionCompatParcelizer, getIntroDurationSeconds.AudioAttributesCompatParcelizer);
        AudioAttributesImplBaseParcelizer(true);
        MediaBrowserCompatItemReceiver(z);
        AudioAttributesCompatParcelizer(false);
    }

    @Override // kotlin.getIntegerMap
    public final CourseConfigV2NavDrawerItemRateUs AudioAttributesCompatParcelizer(getIntegerMap.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
        toMagicModuleMetaRepoModel.write(audioAttributesCompatParcelizer, "");
        CourseConfigV2AcademicYear courseConfigV2AcademicYear = (CourseConfigV2AcademicYear) super.AudioAttributesCompatParcelizer(audioAttributesCompatParcelizer);
        if (courseConfigV2AcademicYear == null) {
            return null;
        }
        List<getMeta> listAX_ = courseConfigV2AcademicYear.aX_();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(listAX_, "");
        List<getMeta> list = listAX_;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                getLink getlinkOnPrepareFromMediaId = ((getMeta) it.next()).onPrepareFromMediaId();
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getlinkOnPrepareFromMediaId, "");
                if (getTestItems.read(getlinkOnPrepareFromMediaId) != null) {
                    List<getMeta> listAX_2 = courseConfigV2AcademicYear.aX_();
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(listAX_2, "");
                    List<getMeta> list2 = listAX_2;
                    ArrayList arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) list2, 10));
                    Iterator<T> it2 = list2.iterator();
                    while (it2.hasNext()) {
                        getLink getlinkOnPrepareFromMediaId2 = ((getMeta) it2.next()).onPrepareFromMediaId();
                        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getlinkOnPrepareFromMediaId2, "");
                        arrayList.add(getTestItems.read(getlinkOnPrepareFromMediaId2));
                    }
                    return courseConfigV2AcademicYear.RemoteActionCompatParcelizer(arrayList);
                }
            }
        }
        return courseConfigV2AcademicYear;
    }

    @Override // kotlin.getAttemptedCount, kotlin.getIntegerMap
    public final getIntegerMap read(getVariant getvariant, CourseConfigV2NavDrawerItemRateUs courseConfigV2NavDrawerItemRateUs, getTestHeaderTitle.RemoteActionCompatParcelizer remoteActionCompatParcelizer, getRelatedLessonId getrelatedlessonid, getQuote getquote, getIntroDurationSeconds getintrodurationseconds) {
        toMagicModuleMetaRepoModel.write(getvariant, "");
        toMagicModuleMetaRepoModel.write(remoteActionCompatParcelizer, "");
        toMagicModuleMetaRepoModel.write(getquote, "");
        toMagicModuleMetaRepoModel.write(getintrodurationseconds, "");
        return new CourseConfigV2AcademicYear(getvariant, (CourseConfigV2AcademicYear) courseConfigV2NavDrawerItemRateUs, remoteActionCompatParcelizer, onSeekTo());
    }

    private final CourseConfigV2NavDrawerItemRateUs RemoteActionCompatParcelizer(List<getRelatedLessonId> list) {
        boolean z;
        getRelatedLessonId getrelatedlessonid;
        int size = aX_().size() - list.size();
        if (size == 0) {
            List<getMeta> listAX_ = aX_();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(listAX_, "");
            List<Pair> listAudioAttributesImplApi26Parcelizer = IntermediateLoginResponseBody.AudioAttributesImplApi26Parcelizer(list, listAX_);
            if (!listAudioAttributesImplApi26Parcelizer.isEmpty()) {
                for (Pair pair : listAudioAttributesImplApi26Parcelizer) {
                    if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((getRelatedLessonId) pair.RemoteActionCompatParcelizer(), ((getMeta) pair.read()).aQ_())) {
                    }
                }
            }
            return this;
        }
        List<getMeta> listAX_2 = aX_();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(listAX_2, "");
        List<getMeta> list2 = listAX_2;
        ArrayList arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) list2, 10));
        for (getMeta getmeta : list2) {
            getRelatedLessonId getrelatedlessonidAQ_ = getmeta.aQ_();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getrelatedlessonidAQ_, "");
            int iOnCommand = getmeta.onCommand();
            int i = iOnCommand - size;
            if (i >= 0 && (getrelatedlessonid = list.get(i)) != null) {
                getrelatedlessonidAQ_ = getrelatedlessonid;
            }
            arrayList.add(getmeta.read(this, getrelatedlessonidAQ_, iOnCommand));
        }
        ArrayList arrayList2 = arrayList;
        getIntegerMap.AudioAttributesCompatParcelizer audioAttributesCompatParcelizerRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(setDesriptionList.read);
        List<getRelatedLessonId> list3 = list;
        if (list3.isEmpty()) {
            z = false;
        } else {
            Iterator<T> it = list3.iterator();
            while (it.hasNext()) {
                if (((getRelatedLessonId) it.next()) == null) {
                    z = true;
                    break;
                }
            }
            z = false;
        }
        getIntegerMap.AudioAttributesCompatParcelizer audioAttributesCompatParcelizerWrite = audioAttributesCompatParcelizerRemoteActionCompatParcelizer.IconCompatParcelizer(z).RemoteActionCompatParcelizer(arrayList2).write(MediaBrowserCompatItemReceiver());
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(audioAttributesCompatParcelizerWrite, "");
        CourseConfigV2NavDrawerItemRateUs courseConfigV2NavDrawerItemRateUsAudioAttributesCompatParcelizer = super.AudioAttributesCompatParcelizer(audioAttributesCompatParcelizerWrite);
        toMagicModuleMetaRepoModel.write(courseConfigV2NavDrawerItemRateUsAudioAttributesCompatParcelizer);
        return courseConfigV2NavDrawerItemRateUsAudioAttributesCompatParcelizer;
    }

    public static final class read {
        private read() {
        }

        public static CourseConfigV2AcademicYear write(isTestIntroFooterEnabled istestintrofooterenabled, boolean z) {
            toMagicModuleMetaRepoModel.write(istestintrofooterenabled, "");
            List<getBadgeText> listMediaBrowserCompatItemReceiver = istestintrofooterenabled.MediaBrowserCompatItemReceiver();
            CourseConfigV2AcademicYear courseConfigV2AcademicYear = new CourseConfigV2AcademicYear(istestintrofooterenabled, getTestHeaderTitle.RemoteActionCompatParcelizer.DECLARATION, z);
            CourseConfigV2TestTabItem courseConfigV2TestTabItemOnPlayFromSearch = istestintrofooterenabled.onPlayFromSearch();
            List<CourseConfigV2TestTabItem> listRemoteActionCompatParcelizer = IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
            List<? extends getBadgeText> listRemoteActionCompatParcelizer2 = IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
            ArrayList arrayList = new ArrayList();
            for (Object obj : listMediaBrowserCompatItemReceiver) {
                if (((getBadgeText) obj).MediaBrowserCompatMediaItem() != getTotalSubject.IN_VARIANCE) {
                    break;
                }
                arrayList.add(obj);
            }
            Iterable<SyncResult> iterableOnPlayFromSearch = IntermediateLoginResponseBody.onPlayFromSearch(arrayList);
            ArrayList arrayList2 = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer(iterableOnPlayFromSearch, 10));
            for (SyncResult syncResult : iterableOnPlayFromSearch) {
                read readVar = CourseConfigV2AcademicYear.read;
                arrayList2.add(IconCompatParcelizer(courseConfigV2AcademicYear, syncResult.AudioAttributesCompatParcelizer(), (getBadgeText) syncResult.write()));
            }
            courseConfigV2AcademicYear.read(null, courseConfigV2TestTabItemOnPlayFromSearch, listRemoteActionCompatParcelizer, listRemoteActionCompatParcelizer2, arrayList2, ((getBadgeText) IntermediateLoginResponseBody.MediaBrowserCompatMediaItem((List) listMediaBrowserCompatItemReceiver)).aP_(), CourseConfigV2NavDrawerItems.ABSTRACT, CourseConfigV2NavDrawerItemFaq.MediaBrowserCompatMediaItem);
            courseConfigV2AcademicYear.write(true);
            return courseConfigV2AcademicYear;
        }

        private static getMeta IconCompatParcelizer(CourseConfigV2AcademicYear courseConfigV2AcademicYear, int i, getBadgeText getbadgetext) {
            String lowerCase;
            String strAudioAttributesCompatParcelizer = getbadgetext.aQ_().AudioAttributesCompatParcelizer();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strAudioAttributesCompatParcelizer, "");
            if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) strAudioAttributesCompatParcelizer, (Object) "T")) {
                lowerCase = "instance";
            } else if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) strAudioAttributesCompatParcelizer, (Object) "E")) {
                lowerCase = "receiver";
            } else {
                lowerCase = strAudioAttributesCompatParcelizer.toLowerCase(Locale.ROOT);
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(lowerCase, "");
            }
            getQuote.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = getQuote.IconCompatParcelizer;
            getQuote getquote = getQuote.AudioAttributesCompatParcelizer.read();
            getRelatedLessonId getrelatedlessonidRemoteActionCompatParcelizer = getRelatedLessonId.RemoteActionCompatParcelizer(lowerCase);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getrelatedlessonidRemoteActionCompatParcelizer, "");
            getHref gethrefAP_ = getbadgetext.aP_();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(gethrefAP_, "");
            getIntroDurationSeconds getintrodurationseconds = getIntroDurationSeconds.AudioAttributesCompatParcelizer;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getintrodurationseconds, "");
            return new getLastHtmlBody(courseConfigV2AcademicYear, null, i, getquote, getrelatedlessonidRemoteActionCompatParcelizer, gethrefAP_, false, false, false, null, getintrodurationseconds);
        }

        public /* synthetic */ read(byte b) {
            this();
        }
    }

    public /* synthetic */ CourseConfigV2AcademicYear(getVariant getvariant, getTestHeaderTitle.RemoteActionCompatParcelizer remoteActionCompatParcelizer, boolean z) {
        this(getvariant, null, remoteActionCompatParcelizer, z);
    }
}
