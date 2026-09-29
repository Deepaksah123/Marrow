package kotlin;

import java.util.ArrayList;
import java.util.List;
import kotlin.getQuote;

/* JADX INFO: loaded from: classes4.dex */
public final class getSubjectDetails {
    private final setMcqList AudioAttributesCompatParcelizer;
    private final getVideoModels RemoteActionCompatParcelizer;
    private final isProPlan read;
    private final getFeaturedCards write;

    public getSubjectDetails(getFeaturedCards getfeaturedcards, getVideoModels getvideomodels) {
        toMagicModuleMetaRepoModel.write(getfeaturedcards, "");
        toMagicModuleMetaRepoModel.write(getvideomodels, "");
        this.write = getfeaturedcards;
        this.RemoteActionCompatParcelizer = getvideomodels;
        setMcqList setmcqlist = new setMcqList();
        this.AudioAttributesCompatParcelizer = setmcqlist;
        this.read = new isProPlan(setmcqlist);
    }

    public final getLink read(setQuestionCount setquestioncount, RecentUpdatesLastSyncedModel recentUpdatesLastSyncedModel) {
        getLink getlink;
        getHref gethrefOnPrepare;
        toMagicModuleMetaRepoModel.write(recentUpdatesLastSyncedModel, "");
        if (setquestioncount instanceof setAvailabilityType) {
            getShowNotesWatermark getshownoteswatermarkWrite = ((setAvailabilityType) setquestioncount).write();
            if (getshownoteswatermarkWrite != null) {
                gethrefOnPrepare = this.write.write().write().RemoteActionCompatParcelizer(getshownoteswatermarkWrite);
            } else {
                gethrefOnPrepare = this.write.write().write().onPrepare();
            }
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(gethrefOnPrepare, "");
            return gethrefOnPrepare;
        }
        if (setquestioncount instanceof QbankSubModel) {
            return write((QbankSubModel) setquestioncount, recentUpdatesLastSyncedModel);
        }
        if (setquestioncount instanceof isUnattempted) {
            return RemoteActionCompatParcelizer(this, (isUnattempted) setquestioncount, recentUpdatesLastSyncedModel);
        }
        if (!(setquestioncount instanceof TestSubModelCompanion)) {
            if (setquestioncount == null) {
                getHref gethrefRatingCompat = this.write.write().write().RatingCompat();
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(gethrefRatingCompat, "");
                return gethrefRatingCompat;
            }
            throw new UnsupportedOperationException("Unsupported type: ".concat(String.valueOf(setquestioncount)));
        }
        setQuestionCount setquestioncountWrite = ((TestSubModelCompanion) setquestioncount).write();
        if (setquestioncountWrite != null && (getlink = read(setquestioncountWrite, recentUpdatesLastSyncedModel)) != null) {
            return getlink;
        }
        getHref gethrefRatingCompat2 = this.write.write().write().RatingCompat();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(gethrefRatingCompat2, "");
        return gethrefRatingCompat2;
    }

    private static /* synthetic */ getLink RemoteActionCompatParcelizer(getSubjectDetails getsubjectdetails, isUnattempted isunattempted, RecentUpdatesLastSyncedModel recentUpdatesLastSyncedModel) {
        return getsubjectdetails.read(isunattempted, recentUpdatesLastSyncedModel, false);
    }

    public final getLink read(isUnattempted isunattempted, RecentUpdatesLastSyncedModel recentUpdatesLastSyncedModel, boolean z) {
        toMagicModuleMetaRepoModel.write(isunattempted, "");
        toMagicModuleMetaRepoModel.write(recentUpdatesLastSyncedModel, "");
        setQuestionCount setquestioncountAudioAttributesCompatParcelizer = isunattempted.AudioAttributesCompatParcelizer();
        setAvailabilityType setavailabilitytype = setquestioncountAudioAttributesCompatParcelizer instanceof setAvailabilityType ? (setAvailabilityType) setquestioncountAudioAttributesCompatParcelizer : null;
        getShowNotesWatermark getshownoteswatermarkWrite = setavailabilitytype != null ? setavailabilitytype.write() : null;
        HomeCardModel homeCardModel = new HomeCardModel(this.write, isunattempted, true);
        if (getshownoteswatermarkWrite != null) {
            getHref gethrefAudioAttributesCompatParcelizer = this.write.write().write().AudioAttributesCompatParcelizer(getshownoteswatermarkWrite);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(gethrefAudioAttributesCompatParcelizer, "");
            getLink getlinkWrite = getSearchTimes.write(gethrefAudioAttributesCompatParcelizer, new getPublishedStatus(gethrefAudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(), homeCardModel));
            toMagicModuleMetaRepoModel.read(getlinkWrite, "");
            getHref gethref = (getHref) getlinkWrite;
            if (recentUpdatesLastSyncedModel.write()) {
                return gethref;
            }
            return AddOnMetaKt.AudioAttributesCompatParcelizer(gethref, gethref.write(true));
        }
        getLink getlink = read(setquestioncountAudioAttributesCompatParcelizer, getPublishedOnMs.read(setGroupSubttile.COMMON, recentUpdatesLastSyncedModel.write(), false, null, 6));
        if (recentUpdatesLastSyncedModel.write()) {
            getHref gethrefAudioAttributesCompatParcelizer2 = this.write.write().write().AudioAttributesCompatParcelizer(z ? getTotalSubject.OUT_VARIANCE : getTotalSubject.INVARIANT, getlink, homeCardModel);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(gethrefAudioAttributesCompatParcelizer2, "");
            return gethrefAudioAttributesCompatParcelizer2;
        }
        HomeCardModel homeCardModel2 = homeCardModel;
        getHref gethrefAudioAttributesCompatParcelizer3 = this.write.write().write().AudioAttributesCompatParcelizer(getTotalSubject.INVARIANT, getlink, homeCardModel2);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(gethrefAudioAttributesCompatParcelizer3, "");
        return AddOnMetaKt.AudioAttributesCompatParcelizer(gethrefAudioAttributesCompatParcelizer3, this.write.write().write().AudioAttributesCompatParcelizer(getTotalSubject.OUT_VARIANCE, getlink, homeCardModel2).write(true));
    }

    private static final PlanSubscriptionItemKt AudioAttributesCompatParcelizer(QbankSubModel qbankSubModel) {
        return SubscriptionType.read(setAccessLevel.UNRESOLVED_JAVA_CLASS, qbankSubModel.MediaBrowserCompatItemReceiver());
    }

    private final getLink write(QbankSubModel qbankSubModel, RecentUpdatesLastSyncedModel recentUpdatesLastSyncedModel) {
        boolean z = (recentUpdatesLastSyncedModel.write() || recentUpdatesLastSyncedModel.IconCompatParcelizer() == setGroupSubttile.SUPERTYPE) ? false : true;
        boolean zMediaBrowserCompatCustomActionResultReceiver = qbankSubModel.MediaBrowserCompatCustomActionResultReceiver();
        if (!zMediaBrowserCompatCustomActionResultReceiver && !z) {
            getHref gethrefWrite = write(qbankSubModel, recentUpdatesLastSyncedModel, (getHref) null);
            return gethrefWrite != null ? gethrefWrite : AudioAttributesCompatParcelizer(qbankSubModel);
        }
        getHref gethrefWrite2 = write(qbankSubModel, recentUpdatesLastSyncedModel.AudioAttributesCompatParcelizer(getPearlList.FLEXIBLE_LOWER_BOUND), (getHref) null);
        if (gethrefWrite2 == null) {
            return AudioAttributesCompatParcelizer(qbankSubModel);
        }
        getHref gethrefWrite3 = write(qbankSubModel, recentUpdatesLastSyncedModel.AudioAttributesCompatParcelizer(getPearlList.FLEXIBLE_UPPER_BOUND), gethrefWrite2);
        if (gethrefWrite3 == null) {
            return AudioAttributesCompatParcelizer(qbankSubModel);
        }
        if (zMediaBrowserCompatCustomActionResultReceiver) {
            return new getTagsList(gethrefWrite2, gethrefWrite3);
        }
        return AddOnMetaKt.AudioAttributesCompatParcelizer(gethrefWrite2, gethrefWrite3);
    }

    private final getHref write(QbankSubModel qbankSubModel, RecentUpdatesLastSyncedModel recentUpdatesLastSyncedModel, getHref gethref) {
        getGroupDescription getgroupdescriptionAudioAttributesCompatParcelizer;
        if (gethref == null || (getgroupdescriptionAudioAttributesCompatParcelizer = gethref.bc_()) == null) {
            getgroupdescriptionAudioAttributesCompatParcelizer = getDurationTitle.AudioAttributesCompatParcelizer(new HomeCardModel(this.write, qbankSubModel));
        }
        getPlanAddOns getplanaddonsRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(qbankSubModel, recentUpdatesLastSyncedModel);
        if (getplanaddonsRemoteActionCompatParcelizer == null) {
            return null;
        }
        boolean z = read(recentUpdatesLastSyncedModel);
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(gethref != null ? gethref.AudioAttributesImplApi21Parcelizer() : null, getplanaddonsRemoteActionCompatParcelizer) && !qbankSubModel.MediaBrowserCompatCustomActionResultReceiver() && z) {
            return gethref.write(true);
        }
        return AddOnMetaKt.write(getgroupdescriptionAudioAttributesCompatParcelizer, getplanaddonsRemoteActionCompatParcelizer, write(qbankSubModel, recentUpdatesLastSyncedModel, getplanaddonsRemoteActionCompatParcelizer), z);
    }

    private final getPlanAddOns RemoteActionCompatParcelizer(QbankSubModel qbankSubModel, RecentUpdatesLastSyncedModel recentUpdatesLastSyncedModel) {
        getPlanAddOns getplanaddonsMediaBrowserCompatSearchResultReceiver;
        setThumbnail setthumbnailAudioAttributesCompatParcelizer = qbankSubModel.AudioAttributesCompatParcelizer();
        if (setthumbnailAudioAttributesCompatParcelizer == null) {
            return IconCompatParcelizer(qbankSubModel);
        }
        if (setthumbnailAudioAttributesCompatParcelizer instanceof isPaused) {
            isPaused ispaused = (isPaused) setthumbnailAudioAttributesCompatParcelizer;
            getNotesCount getnotescountAudioAttributesImplApi21Parcelizer = ispaused.AudioAttributesImplApi21Parcelizer();
            if (getnotescountAudioAttributesImplApi21Parcelizer != null) {
                CourseConfigV2CustomModuleQuestionSource courseConfigV2CustomModuleQuestionSourceAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(qbankSubModel, recentUpdatesLastSyncedModel, getnotescountAudioAttributesImplApi21Parcelizer);
                if (courseConfigV2CustomModuleQuestionSourceAudioAttributesCompatParcelizer == null) {
                    courseConfigV2CustomModuleQuestionSourceAudioAttributesCompatParcelizer = this.write.IconCompatParcelizer().MediaDescriptionCompat().RemoteActionCompatParcelizer(ispaused);
                }
                return (courseConfigV2CustomModuleQuestionSourceAudioAttributesCompatParcelizer == null || (getplanaddonsMediaBrowserCompatSearchResultReceiver = courseConfigV2CustomModuleQuestionSourceAudioAttributesCompatParcelizer.MediaBrowserCompatSearchResultReceiver()) == null) ? IconCompatParcelizer(qbankSubModel) : getplanaddonsMediaBrowserCompatSearchResultReceiver;
            }
            throw new AssertionError("Class type should have a FQ name: ".concat(String.valueOf(setthumbnailAudioAttributesCompatParcelizer)));
        }
        if (setthumbnailAudioAttributesCompatParcelizer instanceof setStartTimeStamp) {
            getBadgeText getbadgetextWrite = this.RemoteActionCompatParcelizer.write((setStartTimeStamp) setthumbnailAudioAttributesCompatParcelizer);
            if (getbadgetextWrite != null) {
                return getbadgetextWrite.MediaBrowserCompatSearchResultReceiver();
            }
            return null;
        }
        throw new IllegalStateException("Unknown classifier kind: ".concat(String.valueOf(setthumbnailAudioAttributesCompatParcelizer)));
    }

    private final getPlanAddOns IconCompatParcelizer(QbankSubModel qbankSubModel) {
        RevisionSubjectStatusModel revisionSubjectStatusModelRemoteActionCompatParcelizer = RevisionSubjectStatusModel.RemoteActionCompatParcelizer(new getNotesCount(qbankSubModel.write()));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(revisionSubjectStatusModelRemoteActionCompatParcelizer, "");
        getPlanAddOns getplanaddonsMediaBrowserCompatSearchResultReceiver = this.write.IconCompatParcelizer().RemoteActionCompatParcelizer().read().MediaDescriptionCompat().AudioAttributesCompatParcelizer(revisionSubjectStatusModelRemoteActionCompatParcelizer, IntermediateLoginResponseBody.RemoteActionCompatParcelizer(0)).MediaBrowserCompatSearchResultReceiver();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getplanaddonsMediaBrowserCompatSearchResultReceiver, "");
        return getplanaddonsMediaBrowserCompatSearchResultReceiver;
    }

    private final CourseConfigV2CustomModuleQuestionSource AudioAttributesCompatParcelizer(QbankSubModel qbankSubModel, RecentUpdatesLastSyncedModel recentUpdatesLastSyncedModel, getNotesCount getnotescount) {
        if (recentUpdatesLastSyncedModel.write() && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(getnotescount, getReferenceLink.RemoteActionCompatParcelizer)) {
            return this.write.IconCompatParcelizer().onCustomAction().RemoteActionCompatParcelizer();
        }
        getPopup getpopup = getPopup.IconCompatParcelizer;
        CourseConfigV2CustomModuleQuestionSource courseConfigV2CustomModuleQuestionSourceWrite = getPopup.write(getnotescount, this.write.write().write());
        if (courseConfigV2CustomModuleQuestionSourceWrite == null) {
            return null;
        }
        return getPopup.read(courseConfigV2CustomModuleQuestionSourceWrite) ? (recentUpdatesLastSyncedModel.RemoteActionCompatParcelizer() == getPearlList.FLEXIBLE_LOWER_BOUND || recentUpdatesLastSyncedModel.IconCompatParcelizer() == setGroupSubttile.SUPERTYPE || AudioAttributesCompatParcelizer(qbankSubModel, courseConfigV2CustomModuleQuestionSourceWrite)) ? getPopup.AudioAttributesCompatParcelizer(courseConfigV2CustomModuleQuestionSourceWrite) : courseConfigV2CustomModuleQuestionSourceWrite : courseConfigV2CustomModuleQuestionSourceWrite;
    }

    private static boolean AudioAttributesCompatParcelizer(QbankSubModel qbankSubModel, CourseConfigV2CustomModuleQuestionSource courseConfigV2CustomModuleQuestionSource) {
        getTotalSubject gettotalsubjectMediaBrowserCompatMediaItem;
        if (!setResultTimeStamp.read((setQuestionCount) IntermediateLoginResponseBody.MediaMetadataCompat((List) qbankSubModel.AudioAttributesImplApi26Parcelizer()))) {
            return false;
        }
        getPopup getpopup = getPopup.IconCompatParcelizer;
        List<getBadgeText> listAudioAttributesCompatParcelizer = getPopup.AudioAttributesCompatParcelizer(courseConfigV2CustomModuleQuestionSource).MediaBrowserCompatSearchResultReceiver().AudioAttributesCompatParcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(listAudioAttributesCompatParcelizer, "");
        getBadgeText getbadgetext = (getBadgeText) IntermediateLoginResponseBody.MediaMetadataCompat((List) listAudioAttributesCompatParcelizer);
        return (getbadgetext == null || (gettotalsubjectMediaBrowserCompatMediaItem = getbadgetext.MediaBrowserCompatMediaItem()) == null || gettotalsubjectMediaBrowserCompatMediaItem == getTotalSubject.OUT_VARIANCE) ? false : true;
    }

    private final List<setDefault> IconCompatParcelizer(QbankSubModel qbankSubModel, List<? extends getBadgeText> list, getPlanAddOns getplanaddons, RecentUpdatesLastSyncedModel recentUpdatesLastSyncedModel) {
        setDefault setdefaultRemoteActionCompatParcelizer;
        List<? extends getBadgeText> list2 = list;
        ArrayList arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) list2, 10));
        for (getBadgeText getbadgetext : list2) {
            if (getSearchTimes.IconCompatParcelizer(getbadgetext, null, recentUpdatesLastSyncedModel.AudioAttributesCompatParcelizer())) {
                setdefaultRemoteActionCompatParcelizer = setPlanAddOns.write(getbadgetext, recentUpdatesLastSyncedModel);
            } else {
                setdefaultRemoteActionCompatParcelizer = this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(getbadgetext, recentUpdatesLastSyncedModel.write(qbankSubModel.MediaBrowserCompatCustomActionResultReceiver()), this.read, new AddOnTaxInfoKt(this.write.read(), new read(getbadgetext, recentUpdatesLastSyncedModel, getplanaddons, qbankSubModel)));
            }
            arrayList.add(setdefaultRemoteActionCompatParcelizer);
        }
        return arrayList;
    }

    static final class read extends MagicModuleUseCase implements getCreatedOnDateMs<getLink> {
        private /* synthetic */ RecentUpdatesLastSyncedModel AudioAttributesCompatParcelizer;
        private /* synthetic */ getBadgeText IconCompatParcelizer;
        private /* synthetic */ QbankSubModel RemoteActionCompatParcelizer;
        private /* synthetic */ getPlanAddOns write;

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public getLink invoke() {
            isProPlan isproplan = getSubjectDetails.this.read;
            getBadgeText getbadgetext = this.IconCompatParcelizer;
            RecentUpdatesLastSyncedModel recentUpdatesLastSyncedModel = this.AudioAttributesCompatParcelizer;
            getQuestionLimit getquestionlimitRemoteActionCompatParcelizer = this.write.RemoteActionCompatParcelizer();
            return isproplan.write(getbadgetext, recentUpdatesLastSyncedModel.read(getquestionlimitRemoteActionCompatParcelizer != null ? getquestionlimitRemoteActionCompatParcelizer.aP_() : null).write(this.RemoteActionCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver()));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        read(getBadgeText getbadgetext, RecentUpdatesLastSyncedModel recentUpdatesLastSyncedModel, getPlanAddOns getplanaddons, QbankSubModel qbankSubModel) {
            super(0);
            this.IconCompatParcelizer = getbadgetext;
            this.AudioAttributesCompatParcelizer = recentUpdatesLastSyncedModel;
            this.write = getplanaddons;
            this.RemoteActionCompatParcelizer = qbankSubModel;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.util.List<kotlin.setDefault> write(kotlin.QbankSubModel r8, kotlin.RecentUpdatesLastSyncedModel r9, kotlin.getPlanAddOns r10) {
        /*
            Method dump skipped, instruction units count: 221
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getSubjectDetails.write(o.QbankSubModel, o.RecentUpdatesLastSyncedModel, o.getPlanAddOns):java.util.List");
    }

    private final setDefault AudioAttributesCompatParcelizer(setQuestionCount setquestioncount, RecentUpdatesLastSyncedModel recentUpdatesLastSyncedModel, getBadgeText getbadgetext) {
        setDefault setdefaultWrite;
        if (setquestioncount instanceof TestSubModelCompanion) {
            TestSubModelCompanion testSubModelCompanion = (TestSubModelCompanion) setquestioncount;
            setQuestionCount setquestioncountWrite = testSubModelCompanion.write();
            getTotalSubject gettotalsubject = testSubModelCompanion.AudioAttributesCompatParcelizer() ? getTotalSubject.OUT_VARIANCE : getTotalSubject.IN_VARIANCE;
            if (setquestioncountWrite == null || IconCompatParcelizer(gettotalsubject, getbadgetext)) {
                setdefaultWrite = setPlanAddOns.write(getbadgetext, recentUpdatesLastSyncedModel);
            } else {
                dummyEditor dummyeditorAudioAttributesCompatParcelizer = getModuleMessage.AudioAttributesCompatParcelizer(this.write, testSubModelCompanion);
                getLink getlinkWrite = read(setquestioncountWrite, getPublishedOnMs.read(setGroupSubttile.COMMON, false, false, null, 7));
                if (dummyeditorAudioAttributesCompatParcelizer != null) {
                    getQuote.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = getQuote.IconCompatParcelizer;
                    getlinkWrite = getSearchTimes.write(getlinkWrite, getQuote.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(IntermediateLoginResponseBody.read(getlinkWrite.RemoteActionCompatParcelizer(), dummyeditorAudioAttributesCompatParcelizer)));
                }
                setdefaultWrite = getSearchTimes.write(getlinkWrite, gettotalsubject, getbadgetext);
            }
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(setdefaultWrite, "");
            return setdefaultWrite;
        }
        return new isIndividualPlan(getTotalSubject.INVARIANT, read(setquestioncount, recentUpdatesLastSyncedModel));
    }

    private static boolean IconCompatParcelizer(getTotalSubject gettotalsubject, getBadgeText getbadgetext) {
        return (getbadgetext.MediaBrowserCompatMediaItem() == getTotalSubject.INVARIANT || gettotalsubject == getbadgetext.MediaBrowserCompatMediaItem()) ? false : true;
    }

    private static boolean read(RecentUpdatesLastSyncedModel recentUpdatesLastSyncedModel) {
        return (recentUpdatesLastSyncedModel.RemoteActionCompatParcelizer() == getPearlList.FLEXIBLE_LOWER_BOUND || recentUpdatesLastSyncedModel.write() || recentUpdatesLastSyncedModel.IconCompatParcelizer() == setGroupSubttile.SUPERTYPE) ? false : true;
    }
}
