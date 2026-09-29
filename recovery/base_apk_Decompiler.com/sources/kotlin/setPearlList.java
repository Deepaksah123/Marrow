package kotlin;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class setPearlList extends isVideoPlanCtype {
    private static final RecentUpdatesLastSyncedModel AudioAttributesCompatParcelizer;
    private static final RecentUpdatesLastSyncedModel RemoteActionCompatParcelizer;
    private final setMcqList IconCompatParcelizer;
    private final isProPlan read;

    @Override // kotlin.isVideoPlanCtype
    public final boolean read() {
        return false;
    }

    public /* synthetic */ setPearlList(byte b) {
        this((isProPlan) null);
    }

    private setPearlList(isProPlan isproplan) {
        setMcqList setmcqlist = new setMcqList();
        this.IconCompatParcelizer = setmcqlist;
        this.read = new isProPlan(setmcqlist);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.isVideoPlanCtype
    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public isIndividualPlan IconCompatParcelizer(getLink getlink) {
        toMagicModuleMetaRepoModel.write(getlink, "");
        return new isIndividualPlan(RemoteActionCompatParcelizer(this, getlink));
    }

    private static /* synthetic */ getLink RemoteActionCompatParcelizer(setPearlList setpearllist, getLink getlink) {
        return setpearllist.IconCompatParcelizer(getlink, new RecentUpdatesLastSyncedModel(setGroupSubttile.COMMON, (getPearlList) null, false, false, (Set) null, 62));
    }

    private final getLink IconCompatParcelizer(getLink getlink, RecentUpdatesLastSyncedModel recentUpdatesLastSyncedModel) {
        getTagsList gettagslist;
        getQuestionLimit getquestionlimitRemoteActionCompatParcelizer = getlink.AudioAttributesImplApi21Parcelizer().RemoteActionCompatParcelizer();
        if (getquestionlimitRemoteActionCompatParcelizer instanceof getBadgeText) {
            return IconCompatParcelizer(this.read.write((getBadgeText) getquestionlimitRemoteActionCompatParcelizer, recentUpdatesLastSyncedModel.write(true)), recentUpdatesLastSyncedModel);
        }
        if (getquestionlimitRemoteActionCompatParcelizer instanceof CourseConfigV2CustomModuleQuestionSource) {
            getQuestionLimit getquestionlimitRemoteActionCompatParcelizer2 = PearlSubjectInfo.RemoteActionCompatParcelizer(getlink).AudioAttributesImplApi21Parcelizer().RemoteActionCompatParcelizer();
            if (!(getquestionlimitRemoteActionCompatParcelizer2 instanceof CourseConfigV2CustomModuleQuestionSource)) {
                StringBuilder sb = new StringBuilder("For some reason declaration for upper bound is not a class but \"");
                sb.append(getquestionlimitRemoteActionCompatParcelizer2);
                sb.append("\" while for lower it's \"");
                sb.append(getquestionlimitRemoteActionCompatParcelizer);
                sb.append('\"');
                throw new IllegalStateException(sb.toString().toString());
            }
            Pair<getHref, Boolean> pair = read(PearlSubjectInfo.write(getlink), (CourseConfigV2CustomModuleQuestionSource) getquestionlimitRemoteActionCompatParcelizer, AudioAttributesCompatParcelizer);
            getHref gethrefRemoteActionCompatParcelizer = pair.RemoteActionCompatParcelizer();
            boolean zBooleanValue = pair.read().booleanValue();
            Pair<getHref, Boolean> pair2 = read(PearlSubjectInfo.RemoteActionCompatParcelizer(getlink), (CourseConfigV2CustomModuleQuestionSource) getquestionlimitRemoteActionCompatParcelizer2, RemoteActionCompatParcelizer);
            getHref gethrefRemoteActionCompatParcelizer2 = pair2.RemoteActionCompatParcelizer();
            boolean zBooleanValue2 = pair2.read().booleanValue();
            if (zBooleanValue || zBooleanValue2) {
                gettagslist = new getTagsList(gethrefRemoteActionCompatParcelizer, gethrefRemoteActionCompatParcelizer2);
            } else {
                gettagslist = AddOnMetaKt.AudioAttributesCompatParcelizer(gethrefRemoteActionCompatParcelizer, gethrefRemoteActionCompatParcelizer2);
            }
            return gettagslist;
        }
        throw new IllegalStateException("Unexpected declaration kind: ".concat(String.valueOf(getquestionlimitRemoteActionCompatParcelizer)).toString());
    }

    private final Pair<getHref, Boolean> read(getHref gethref, CourseConfigV2CustomModuleQuestionSource courseConfigV2CustomModuleQuestionSource, RecentUpdatesLastSyncedModel recentUpdatesLastSyncedModel) {
        boolean zIsEmpty = gethref.AudioAttributesImplApi21Parcelizer().AudioAttributesCompatParcelizer().isEmpty();
        Boolean bool = Boolean.FALSE;
        if (zIsEmpty) {
            return setAction.write(gethref, bool);
        }
        getHref gethref2 = gethref;
        if (getTestTabItems.RemoteActionCompatParcelizer(gethref2)) {
            setDefault setdefault = gethref.bb_().get(0);
            getTotalSubject gettotalsubject = setdefault.read();
            getLink getlinkAudioAttributesCompatParcelizer = setdefault.AudioAttributesCompatParcelizer();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getlinkAudioAttributesCompatParcelizer, "");
            return setAction.write(AddOnMetaKt.write(gethref.bc_(), gethref.AudioAttributesImplApi21Parcelizer(), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(new isIndividualPlan(gettotalsubject, IconCompatParcelizer(getlinkAudioAttributesCompatParcelizer, recentUpdatesLastSyncedModel))), gethref.ba_()), bool);
        }
        if (Copy.write(gethref2)) {
            return setAction.write(SubscriptionType.read(setAccessLevel.ERROR_RAW_TYPE, gethref.AudioAttributesImplApi21Parcelizer().toString()), bool);
        }
        setTags settagsWrite = courseConfigV2CustomModuleQuestionSource.write(this);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(settagsWrite, "");
        getGroupDescription getgroupdescriptionBc_ = gethref.bc_();
        getPlanAddOns getplanaddonsMediaBrowserCompatSearchResultReceiver = courseConfigV2CustomModuleQuestionSource.MediaBrowserCompatSearchResultReceiver();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getplanaddonsMediaBrowserCompatSearchResultReceiver, "");
        List<getBadgeText> listAudioAttributesCompatParcelizer = courseConfigV2CustomModuleQuestionSource.MediaBrowserCompatSearchResultReceiver().AudioAttributesCompatParcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(listAudioAttributesCompatParcelizer, "");
        List<getBadgeText> list = listAudioAttributesCompatParcelizer;
        ArrayList arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) list, 10));
        for (getBadgeText getbadgetext : list) {
            setMcqList setmcqlist = this.IconCompatParcelizer;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getbadgetext, "");
            RecentUpdatesLastSyncedModel recentUpdatesLastSyncedModel2 = recentUpdatesLastSyncedModel;
            isProPlan isproplan = this.read;
            arrayList.add(setmcqlist.RemoteActionCompatParcelizer(getbadgetext, recentUpdatesLastSyncedModel2, isproplan, isproplan.write(getbadgetext, recentUpdatesLastSyncedModel2)));
        }
        return setAction.write(AddOnMetaKt.write(getgroupdescriptionBc_, getplanaddonsMediaBrowserCompatSearchResultReceiver, arrayList, gethref.ba_(), settagsWrite, new IconCompatParcelizer(courseConfigV2CustomModuleQuestionSource, this, gethref, recentUpdatesLastSyncedModel)), Boolean.TRUE);
    }

    static final class IconCompatParcelizer extends MagicModuleUseCase implements getAnswerMap<getCheapestPlan, getHref> {
        private /* synthetic */ RecentUpdatesLastSyncedModel IconCompatParcelizer;
        private /* synthetic */ setPearlList RemoteActionCompatParcelizer;
        private /* synthetic */ getHref read;
        private /* synthetic */ CourseConfigV2CustomModuleQuestionSource write;

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public getHref invoke(getCheapestPlan getcheapestplan) {
            RevisionSubjectStatusModel revisionSubjectStatusModel;
            toMagicModuleMetaRepoModel.write(getcheapestplan, "");
            CourseConfigV2CustomModuleQuestionSource courseConfigV2CustomModuleQuestionSource = this.write;
            if (!(courseConfigV2CustomModuleQuestionSource instanceof CourseConfigV2CustomModuleQuestionSource)) {
                courseConfigV2CustomModuleQuestionSource = null;
            }
            if (courseConfigV2CustomModuleQuestionSource != null && (revisionSubjectStatusModel = setLocked.read((getQuestionLimit) courseConfigV2CustomModuleQuestionSource)) != null) {
                getcheapestplan.write(revisionSubjectStatusModel);
            }
            return null;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IconCompatParcelizer(CourseConfigV2CustomModuleQuestionSource courseConfigV2CustomModuleQuestionSource, setPearlList setpearllist, getHref gethref, RecentUpdatesLastSyncedModel recentUpdatesLastSyncedModel) {
            super(1);
            this.write = courseConfigV2CustomModuleQuestionSource;
            this.RemoteActionCompatParcelizer = setpearllist;
            this.read = gethref;
            this.IconCompatParcelizer = recentUpdatesLastSyncedModel;
        }
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
        AudioAttributesCompatParcelizer = getPublishedOnMs.read(setGroupSubttile.COMMON, false, true, null, 5).AudioAttributesCompatParcelizer(getPearlList.FLEXIBLE_LOWER_BOUND);
        RemoteActionCompatParcelizer = getPublishedOnMs.read(setGroupSubttile.COMMON, false, true, null, 5).AudioAttributesCompatParcelizer(getPearlList.FLEXIBLE_UPPER_BOUND);
    }

    public setPearlList() {
        this((byte) 0);
    }
}
