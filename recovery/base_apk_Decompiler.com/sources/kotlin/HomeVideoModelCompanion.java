package kotlin;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.getQuote;

/* JADX INFO: loaded from: classes4.dex */
public final class HomeVideoModelCompanion {
    private final C0179getSubtitle AudioAttributesCompatParcelizer;

    public HomeVideoModelCompanion(C0179getSubtitle c0179getSubtitle) {
        toMagicModuleMetaRepoModel.write(c0179getSubtitle, "");
        this.AudioAttributesCompatParcelizer = c0179getSubtitle;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <D extends getTestHeaderTitle> Collection<D> write(getFeaturedCards getfeaturedcards, Collection<? extends D> collection) {
        toMagicModuleMetaRepoModel.write(getfeaturedcards, "");
        toMagicModuleMetaRepoModel.write(collection, "");
        Collection<? extends D> collection2 = collection;
        ArrayList arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer(collection2, 10));
        Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            arrayList.add(write((getTestHeaderTitle) it.next(), getfeaturedcards));
        }
        return arrayList;
    }

    private static <D extends getTestHeaderTitle> getQuote RemoteActionCompatParcelizer(D d, getFeaturedCards getfeaturedcards) {
        getQuestionLimit getquestionlimit = CourseConfigV2NavDrawerItemContactUs.read(d);
        if (getquestionlimit == null) {
            return d.RemoteActionCompatParcelizer();
        }
        setVideoModels setvideomodels = getquestionlimit instanceof setVideoModels ? (setVideoModels) getquestionlimit : null;
        List<RecentUpdatesReferences> listOnPrepareFromUri = setvideomodels != null ? setvideomodels.onPrepareFromUri() : null;
        List<RecentUpdatesReferences> list = listOnPrepareFromUri;
        if (list == null || list.isEmpty()) {
            return d.RemoteActionCompatParcelizer();
        }
        List<RecentUpdatesReferences> list2 = listOnPrepareFromUri;
        ArrayList arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(new setMainModel(getfeaturedcards, (RecentUpdatesReferences) it.next(), true));
        }
        getQuote.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = getQuote.IconCompatParcelizer;
        return getQuote.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(IntermediateLoginResponseBody.read((Iterable) d.RemoteActionCompatParcelizer(), (Iterable) arrayList));
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x01fe, code lost:
    
        if (r1 != null) goto L103;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01ca A[EDGE_INSN: B:89:0x01ca->B:90:0x01da BREAK  A[LOOP:3: B:83:0x01ae->B:136:?]] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01dc A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01eb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final <D extends kotlin.getTestHeaderTitle> D write(D r21, kotlin.getFeaturedCards r22) {
        /*
            Method dump skipped, instruction units count: 613
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.HomeVideoModelCompanion.write(o.getTestHeaderTitle, o.getFeaturedCards):o.getTestHeaderTitle");
    }

    static final class IconCompatParcelizer extends MagicModuleUseCase implements getAnswerMap<getTestHeaderTitle, getLink> {
        public static final IconCompatParcelizer AudioAttributesCompatParcelizer = new IconCompatParcelizer();

        @Override // kotlin.getAnswerMap
        public final /* synthetic */ getLink invoke(getTestHeaderTitle gettestheadertitle) {
            return IconCompatParcelizer(gettestheadertitle);
        }

        private static getLink IconCompatParcelizer(getTestHeaderTitle gettestheadertitle) {
            toMagicModuleMetaRepoModel.write(gettestheadertitle, "");
            CourseConfigV2TestTabItem courseConfigV2TestTabItemMediaBrowserCompatCustomActionResultReceiver = gettestheadertitle.MediaBrowserCompatCustomActionResultReceiver();
            toMagicModuleMetaRepoModel.write(courseConfigV2TestTabItemMediaBrowserCompatCustomActionResultReceiver);
            getLink getlinkOnPrepareFromMediaId = courseConfigV2TestTabItemMediaBrowserCompatCustomActionResultReceiver.onPrepareFromMediaId();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getlinkOnPrepareFromMediaId, "");
            return getlinkOnPrepareFromMediaId;
        }

        IconCompatParcelizer() {
            super(1);
        }
    }

    static final class write extends MagicModuleUseCase implements getAnswerMap<getTestHeaderTitle, getLink> {
        private /* synthetic */ getMeta RemoteActionCompatParcelizer;

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public getLink invoke(getTestHeaderTitle gettestheadertitle) {
            toMagicModuleMetaRepoModel.write(gettestheadertitle, "");
            getLink getlinkOnPrepareFromMediaId = gettestheadertitle.aX_().get(this.RemoteActionCompatParcelizer.onCommand()).onPrepareFromMediaId();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getlinkOnPrepareFromMediaId, "");
            return getlinkOnPrepareFromMediaId;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        write(getMeta getmeta) {
            super(1);
            this.RemoteActionCompatParcelizer = getmeta;
        }
    }

    static final class RemoteActionCompatParcelizer extends MagicModuleUseCase implements getAnswerMap<getTestHeaderTitle, getLink> {
        public static final RemoteActionCompatParcelizer AudioAttributesCompatParcelizer = new RemoteActionCompatParcelizer();

        @Override // kotlin.getAnswerMap
        public final /* synthetic */ getLink invoke(getTestHeaderTitle gettestheadertitle) {
            return AudioAttributesCompatParcelizer(gettestheadertitle);
        }

        private static getLink AudioAttributesCompatParcelizer(getTestHeaderTitle gettestheadertitle) {
            toMagicModuleMetaRepoModel.write(gettestheadertitle, "");
            getLink getlinkAudioAttributesImplBaseParcelizer = gettestheadertitle.AudioAttributesImplBaseParcelizer();
            toMagicModuleMetaRepoModel.write(getlinkAudioAttributesImplBaseParcelizer);
            return getlinkAudioAttributesImplBaseParcelizer;
        }

        RemoteActionCompatParcelizer() {
            super(1);
        }
    }

    public final List<getLink> AudioAttributesCompatParcelizer(getBadgeText getbadgetext, List<? extends getLink> list, getFeaturedCards getfeaturedcards) {
        getLink getlink;
        toMagicModuleMetaRepoModel.write(getbadgetext, "");
        toMagicModuleMetaRepoModel.write(list, "");
        toMagicModuleMetaRepoModel.write(getfeaturedcards, "");
        List<? extends getLink> list2 = list;
        ArrayList arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) list2, 10));
        for (getLink getlink2 : list2) {
            if (!getSearchTimes.read(getlink2, AudioAttributesCompatParcelizer.write) && (getlink = read(this, new isRelatedModule(getbadgetext, false, getfeaturedcards, setSectionName.TYPE_PARAMETER_BOUNDS), getlink2, IntermediateLoginResponseBody.RemoteActionCompatParcelizer())) != null) {
                getlink2 = getlink;
            }
            arrayList.add(getlink2);
        }
        return arrayList;
    }

    static final class AudioAttributesCompatParcelizer extends MagicModuleUseCase implements getAnswerMap<PlanAddOnsCompanion, Boolean> {
        public static final AudioAttributesCompatParcelizer write = new AudioAttributesCompatParcelizer();

        private static Boolean read(PlanAddOnsCompanion planAddOnsCompanion) {
            toMagicModuleMetaRepoModel.write(planAddOnsCompanion, "");
            return Boolean.valueOf(planAddOnsCompanion instanceof Link);
        }

        @Override // kotlin.getAnswerMap
        public final /* synthetic */ Boolean invoke(PlanAddOnsCompanion planAddOnsCompanion) {
            return read(planAddOnsCompanion);
        }

        AudioAttributesCompatParcelizer() {
            super(1);
        }
    }

    public final getLink write(getLink getlink, getFeaturedCards getfeaturedcards) {
        toMagicModuleMetaRepoModel.write(getlink, "");
        toMagicModuleMetaRepoModel.write(getfeaturedcards, "");
        getLink getlink2 = read(this, new isRelatedModule(null, false, getfeaturedcards, setSectionName.TYPE_USE, true), getlink, IntermediateLoginResponseBody.RemoteActionCompatParcelizer());
        return getlink2 == null ? getlink : getlink2;
    }

    static final class read extends MagicModuleUseCase implements getAnswerMap<PlanAddOnsCompanion, Boolean> {
        public static final read write = new read();

        @Override // kotlin.getAnswerMap
        public final /* synthetic */ Boolean invoke(PlanAddOnsCompanion planAddOnsCompanion) {
            return write(planAddOnsCompanion);
        }

        private static Boolean write(PlanAddOnsCompanion planAddOnsCompanion) {
            getQuestionLimit getquestionlimitRemoteActionCompatParcelizer = planAddOnsCompanion.AudioAttributesImplApi21Parcelizer().RemoteActionCompatParcelizer();
            if (getquestionlimitRemoteActionCompatParcelizer == null) {
                return Boolean.FALSE;
            }
            getRelatedLessonId getrelatedlessonidAQ_ = getquestionlimitRemoteActionCompatParcelizer.aQ_();
            CourseConfigV2AnnouncementBanner courseConfigV2AnnouncementBanner = CourseConfigV2AnnouncementBanner.write;
            boolean z = false;
            if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(getrelatedlessonidAQ_, CourseConfigV2AnnouncementBanner.write().IconCompatParcelizer())) {
                getNotesCount getnotescountRemoteActionCompatParcelizer = setLocked.RemoteActionCompatParcelizer(getquestionlimitRemoteActionCompatParcelizer);
                CourseConfigV2AnnouncementBanner courseConfigV2AnnouncementBanner2 = CourseConfigV2AnnouncementBanner.write;
                if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(getnotescountRemoteActionCompatParcelizer, CourseConfigV2AnnouncementBanner.write())) {
                    z = true;
                }
            }
            return Boolean.valueOf(z);
        }

        read() {
            super(1);
        }
    }

    private static boolean RemoteActionCompatParcelizer(getLink getlink) {
        return setPlanAddOns.RemoteActionCompatParcelizer(getlink, read.write);
    }

    private final getLink RemoteActionCompatParcelizer(getTestHeaderTitle gettestheadertitle, getMeta getmeta, getFeaturedCards getfeaturedcards, VideoSubModelCompanion videoSubModelCompanion, boolean z, getAnswerMap<? super getTestHeaderTitle, ? extends getLink> getanswermap) {
        getFeaturedCards getfeaturedcardsAudioAttributesCompatParcelizer;
        return write(gettestheadertitle, getmeta, false, (getmeta == null || (getfeaturedcardsAudioAttributesCompatParcelizer = FilterParams.AudioAttributesCompatParcelizer(getfeaturedcards, getmeta.RemoteActionCompatParcelizer())) == null) ? getfeaturedcards : getfeaturedcardsAudioAttributesCompatParcelizer, setSectionName.VALUE_PARAMETER, videoSubModelCompanion, z, getanswermap);
    }

    private static /* synthetic */ getLink write(HomeVideoModelCompanion homeVideoModelCompanion, getTestHeaderTitle gettestheadertitle, fromJSONArray fromjsonarray, getFeaturedCards getfeaturedcards, setSectionName setsectionname, VideoSubModelCompanion videoSubModelCompanion, getAnswerMap getanswermap) {
        return homeVideoModelCompanion.write(gettestheadertitle, fromjsonarray, true, getfeaturedcards, setsectionname, videoSubModelCompanion, false, getanswermap);
    }

    private final getLink write(getTestHeaderTitle gettestheadertitle, fromJSONArray fromjsonarray, boolean z, getFeaturedCards getfeaturedcards, setSectionName setsectionname, VideoSubModelCompanion videoSubModelCompanion, boolean z2, getAnswerMap<? super getTestHeaderTitle, ? extends getLink> getanswermap) {
        isRelatedModule isrelatedmodule = new isRelatedModule(fromjsonarray, z, getfeaturedcards, setsectionname);
        getLink getlinkInvoke = getanswermap.invoke(gettestheadertitle);
        Collection<? extends getTestHeaderTitle> collectionAudioAttributesImplApi26Parcelizer = gettestheadertitle.AudioAttributesImplApi26Parcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(collectionAudioAttributesImplApi26Parcelizer, "");
        Collection<? extends getTestHeaderTitle> collection = collectionAudioAttributesImplApi26Parcelizer;
        ArrayList arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer(collection, 10));
        for (getTestHeaderTitle gettestheadertitle2 : collection) {
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(gettestheadertitle2, "");
            arrayList.add(getanswermap.invoke(gettestheadertitle2));
        }
        return IconCompatParcelizer(isrelatedmodule, getlinkInvoke, arrayList, videoSubModelCompanion, z2);
    }

    private static /* synthetic */ getLink read(HomeVideoModelCompanion homeVideoModelCompanion, isRelatedModule isrelatedmodule, getLink getlink, List list) {
        return homeVideoModelCompanion.IconCompatParcelizer(isrelatedmodule, getlink, list, null, false);
    }

    private final getLink IconCompatParcelizer(isRelatedModule isrelatedmodule, getLink getlink, List<? extends getLink> list, VideoSubModelCompanion videoSubModelCompanion, boolean z) {
        return this.AudioAttributesCompatParcelizer.write(getlink, isrelatedmodule.IconCompatParcelizer(getlink, list, videoSubModelCompanion, z), isrelatedmodule.MediaBrowserCompatItemReceiver());
    }
}
