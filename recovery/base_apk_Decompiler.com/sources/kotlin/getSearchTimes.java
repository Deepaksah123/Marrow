package kotlin;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class getSearchTimes {
    public static final getTestTabItems read(getLink getlink) {
        toMagicModuleMetaRepoModel.write(getlink, "");
        getTestTabItems gettesttabitemsAU_ = getlink.AudioAttributesImplApi21Parcelizer().aU_();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(gettesttabitemsAU_, "");
        return gettesttabitemsAU_;
    }

    public static final getLink MediaBrowserCompatMediaItem(getLink getlink) {
        toMagicModuleMetaRepoModel.write(getlink, "");
        getLink getlinkMediaBrowserCompatCustomActionResultReceiver = setPlanAddOns.MediaBrowserCompatCustomActionResultReceiver(getlink);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getlinkMediaBrowserCompatCustomActionResultReceiver, "");
        return getlinkMediaBrowserCompatCustomActionResultReceiver;
    }

    public static final getLink MediaMetadataCompat(getLink getlink) {
        toMagicModuleMetaRepoModel.write(getlink, "");
        getLink getlinkAudioAttributesImplApi26Parcelizer = setPlanAddOns.AudioAttributesImplApi26Parcelizer(getlink);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getlinkAudioAttributesImplApi26Parcelizer, "");
        return getlinkAudioAttributesImplApi26Parcelizer;
    }

    public static final boolean AudioAttributesImplApi21Parcelizer(getLink getlink) {
        toMagicModuleMetaRepoModel.write(getlink, "");
        return getTestTabItems.AudioAttributesImplApi26Parcelizer(getlink);
    }

    public static final boolean IconCompatParcelizer(getLink getlink) {
        toMagicModuleMetaRepoModel.write(getlink, "");
        return getTestTabItems.IconCompatParcelizer(getlink);
    }

    public static final boolean MediaBrowserCompatItemReceiver(getLink getlink) {
        toMagicModuleMetaRepoModel.write(getlink, "");
        return setPlanAddOns.AudioAttributesCompatParcelizer(getlink);
    }

    static final class AudioAttributesCompatParcelizer extends MagicModuleUseCase implements getAnswerMap<PlanAddOnsCompanion, Boolean> {
        public static final AudioAttributesCompatParcelizer read = new AudioAttributesCompatParcelizer();

        private static Boolean AudioAttributesCompatParcelizer(PlanAddOnsCompanion planAddOnsCompanion) {
            return Boolean.valueOf(setPlanAddOns.AudioAttributesCompatParcelizer(planAddOnsCompanion));
        }

        @Override // kotlin.getAnswerMap
        public final /* synthetic */ Boolean invoke(PlanAddOnsCompanion planAddOnsCompanion) {
            return AudioAttributesCompatParcelizer(planAddOnsCompanion);
        }

        AudioAttributesCompatParcelizer() {
            super(1);
        }
    }

    public static final boolean RemoteActionCompatParcelizer(getLink getlink) {
        toMagicModuleMetaRepoModel.write(getlink, "");
        return setPlanAddOns.RemoteActionCompatParcelizer(getlink, AudioAttributesCompatParcelizer.read);
    }

    public static final boolean RemoteActionCompatParcelizer(getLink getlink, getLink getlink2) {
        toMagicModuleMetaRepoModel.write(getlink, "");
        toMagicModuleMetaRepoModel.write(getlink2, "");
        return PlanData.AudioAttributesCompatParcelizer.read(getlink, getlink2);
    }

    public static final getLink write(getLink getlink, getQuote getquote) {
        toMagicModuleMetaRepoModel.write(getlink, "");
        toMagicModuleMetaRepoModel.write(getquote, "");
        return (getlink.RemoteActionCompatParcelizer().RemoteActionCompatParcelizer() && getquote.RemoteActionCompatParcelizer()) ? getlink : getlink.MediaBrowserCompatMediaItem().AudioAttributesCompatParcelizer(getDurationTitle.AudioAttributesCompatParcelizer(getlink.bc_(), getquote));
    }

    public static final setDefault write(getLink getlink, getTotalSubject gettotalsubject, getBadgeText getbadgetext) {
        toMagicModuleMetaRepoModel.write(getlink, "");
        toMagicModuleMetaRepoModel.write(gettotalsubject, "");
        if ((getbadgetext != null ? getbadgetext.MediaBrowserCompatMediaItem() : null) == gettotalsubject) {
            gettotalsubject = getTotalSubject.INVARIANT;
        }
        return new isIndividualPlan(gettotalsubject, getlink);
    }

    public static final setDefault write(getLink getlink) {
        toMagicModuleMetaRepoModel.write(getlink, "");
        return new isIndividualPlan(getlink);
    }

    public static final boolean read(getLink getlink, getAnswerMap<? super PlanAddOnsCompanion, Boolean> getanswermap) {
        toMagicModuleMetaRepoModel.write(getlink, "");
        toMagicModuleMetaRepoModel.write(getanswermap, "");
        return setPlanAddOns.RemoteActionCompatParcelizer(getlink, getanswermap);
    }

    public static final Set<getBadgeText> IconCompatParcelizer(getLink getlink, Set<? extends getBadgeText> set) {
        toMagicModuleMetaRepoModel.write(getlink, "");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        read(getlink, getlink, linkedHashSet, set);
        return linkedHashSet;
    }

    private static final void read(getLink getlink, getLink getlink2, Set<getBadgeText> set, Set<? extends getBadgeText> set2) {
        getQuestionLimit getquestionlimitRemoteActionCompatParcelizer = getlink.AudioAttributesImplApi21Parcelizer().RemoteActionCompatParcelizer();
        if (getquestionlimitRemoteActionCompatParcelizer instanceof getBadgeText) {
            if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(getlink.AudioAttributesImplApi21Parcelizer(), getlink2.AudioAttributesImplApi21Parcelizer())) {
                set.add(getquestionlimitRemoteActionCompatParcelizer);
                return;
            }
            for (getLink getlink3 : ((getBadgeText) getquestionlimitRemoteActionCompatParcelizer).MediaBrowserCompatCustomActionResultReceiver()) {
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getlink3, "");
                read(getlink3, getlink2, set, set2);
            }
            return;
        }
        getQuestionLimit getquestionlimitRemoteActionCompatParcelizer2 = getlink.AudioAttributesImplApi21Parcelizer().RemoteActionCompatParcelizer();
        getBadge getbadge = getquestionlimitRemoteActionCompatParcelizer2 instanceof getBadge ? (getBadge) getquestionlimitRemoteActionCompatParcelizer2 : null;
        List<getBadgeText> listMediaBrowserCompatItemReceiver = getbadge != null ? getbadge.MediaBrowserCompatItemReceiver() : null;
        int i = 0;
        for (setDefault setdefault : getlink.bb_()) {
            getBadgeText getbadgetext = listMediaBrowserCompatItemReceiver != null ? (getBadgeText) IntermediateLoginResponseBody.read((List) listMediaBrowserCompatItemReceiver, i) : null;
            if ((getbadgetext == null || set2 == null || !set2.contains(getbadgetext)) && !setdefault.write() && !IntermediateLoginResponseBody.AudioAttributesCompatParcelizer(set, setdefault.AudioAttributesCompatParcelizer().AudioAttributesImplApi21Parcelizer().RemoteActionCompatParcelizer()) && !toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(setdefault.AudioAttributesCompatParcelizer().AudioAttributesImplApi21Parcelizer(), getlink2.AudioAttributesImplApi21Parcelizer())) {
                getLink getlinkAudioAttributesCompatParcelizer = setdefault.AudioAttributesCompatParcelizer();
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getlinkAudioAttributesCompatParcelizer, "");
                read(getlinkAudioAttributesCompatParcelizer, getlink2, set, set2);
            }
            i++;
        }
    }

    public static /* synthetic */ boolean write(getBadgeText getbadgetext, getPlanAddOns getplanaddons, int i) {
        if ((i & 2) != 0) {
            getplanaddons = null;
        }
        return IconCompatParcelizer(getbadgetext, getplanaddons, null);
    }

    public static final boolean IconCompatParcelizer(getBadgeText getbadgetext, getPlanAddOns getplanaddons, Set<? extends getBadgeText> set) {
        toMagicModuleMetaRepoModel.write(getbadgetext, "");
        List<getLink> listMediaBrowserCompatCustomActionResultReceiver = getbadgetext.MediaBrowserCompatCustomActionResultReceiver();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(listMediaBrowserCompatCustomActionResultReceiver, "");
        List<getLink> list = listMediaBrowserCompatCustomActionResultReceiver;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        for (getLink getlink : list) {
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getlink, "");
            if (write(getlink, getbadgetext.aP_().AudioAttributesImplApi21Parcelizer(), set) && (getplanaddons == null || toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(getlink.AudioAttributesImplApi21Parcelizer(), getplanaddons))) {
                return true;
            }
        }
        return false;
    }

    private static final boolean write(getLink getlink, getPlanAddOns getplanaddons, Set<? extends getBadgeText> set) {
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(getlink.AudioAttributesImplApi21Parcelizer(), getplanaddons)) {
            return true;
        }
        getQuestionLimit getquestionlimitRemoteActionCompatParcelizer = getlink.AudioAttributesImplApi21Parcelizer().RemoteActionCompatParcelizer();
        getBadge getbadge = getquestionlimitRemoteActionCompatParcelizer instanceof getBadge ? (getBadge) getquestionlimitRemoteActionCompatParcelizer : null;
        List<getBadgeText> listMediaBrowserCompatItemReceiver = getbadge != null ? getbadge.MediaBrowserCompatItemReceiver() : null;
        Iterable<SyncResult> iterableOnPlayFromSearch = IntermediateLoginResponseBody.onPlayFromSearch(getlink.bb_());
        if ((iterableOnPlayFromSearch instanceof Collection) && ((Collection) iterableOnPlayFromSearch).isEmpty()) {
            return false;
        }
        for (SyncResult syncResult : iterableOnPlayFromSearch) {
            int iIconCompatParcelizer = syncResult.IconCompatParcelizer();
            setDefault setdefault = (setDefault) syncResult.read();
            getBadgeText getbadgetext = listMediaBrowserCompatItemReceiver != null ? (getBadgeText) IntermediateLoginResponseBody.read((List) listMediaBrowserCompatItemReceiver, iIconCompatParcelizer) : null;
            if (getbadgetext == null || set == null || !set.contains(getbadgetext)) {
                if (setdefault.write()) {
                    continue;
                } else {
                    getLink getlinkAudioAttributesCompatParcelizer = setdefault.AudioAttributesCompatParcelizer();
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getlinkAudioAttributesCompatParcelizer, "");
                    if (write(getlinkAudioAttributesCompatParcelizer, getplanaddons, set)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    static final class RemoteActionCompatParcelizer extends MagicModuleUseCase implements getAnswerMap<PlanAddOnsCompanion, Boolean> {
        public static final RemoteActionCompatParcelizer RemoteActionCompatParcelizer = new RemoteActionCompatParcelizer();

        @Override // kotlin.getAnswerMap
        public final /* synthetic */ Boolean invoke(PlanAddOnsCompanion planAddOnsCompanion) {
            return IconCompatParcelizer(planAddOnsCompanion);
        }

        private static Boolean IconCompatParcelizer(PlanAddOnsCompanion planAddOnsCompanion) {
            toMagicModuleMetaRepoModel.write(planAddOnsCompanion, "");
            getQuestionLimit getquestionlimitRemoteActionCompatParcelizer = planAddOnsCompanion.AudioAttributesImplApi21Parcelizer().RemoteActionCompatParcelizer();
            return Boolean.valueOf(getquestionlimitRemoteActionCompatParcelizer != null ? getSearchTimes.AudioAttributesCompatParcelizer(getquestionlimitRemoteActionCompatParcelizer) : false);
        }

        RemoteActionCompatParcelizer() {
            super(1);
        }
    }

    public static final boolean AudioAttributesCompatParcelizer(getLink getlink) {
        toMagicModuleMetaRepoModel.write(getlink, "");
        return read(getlink, RemoteActionCompatParcelizer.RemoteActionCompatParcelizer);
    }

    public static final boolean AudioAttributesCompatParcelizer(getQuestionLimit getquestionlimit) {
        toMagicModuleMetaRepoModel.write(getquestionlimit, "");
        return (getquestionlimit instanceof getBadgeText) && (((getBadgeText) getquestionlimit).onPlayFromMediaId() instanceof CourseConfigV2VideoProperties);
    }

    static final class read extends MagicModuleUseCase implements getAnswerMap<PlanAddOnsCompanion, Boolean> {
        public static final read write = new read();

        @Override // kotlin.getAnswerMap
        public final /* synthetic */ Boolean invoke(PlanAddOnsCompanion planAddOnsCompanion) {
            return RemoteActionCompatParcelizer(planAddOnsCompanion);
        }

        private static Boolean RemoteActionCompatParcelizer(PlanAddOnsCompanion planAddOnsCompanion) {
            toMagicModuleMetaRepoModel.write(planAddOnsCompanion, "");
            getQuestionLimit getquestionlimitRemoteActionCompatParcelizer = planAddOnsCompanion.AudioAttributesImplApi21Parcelizer().RemoteActionCompatParcelizer();
            boolean z = false;
            if (getquestionlimitRemoteActionCompatParcelizer != null && ((getquestionlimitRemoteActionCompatParcelizer instanceof CourseConfigV2VideoProperties) || (getquestionlimitRemoteActionCompatParcelizer instanceof getBadgeText))) {
                z = true;
            }
            return Boolean.valueOf(z);
        }

        read() {
            super(1);
        }
    }

    public static final boolean RatingCompat(getLink getlink) {
        toMagicModuleMetaRepoModel.write(getlink, "");
        return read(getlink, read.write);
    }

    public static final getLink IconCompatParcelizer(getBadgeText getbadgetext) {
        Object obj;
        toMagicModuleMetaRepoModel.write(getbadgetext, "");
        List<getLink> listMediaBrowserCompatCustomActionResultReceiver = getbadgetext.MediaBrowserCompatCustomActionResultReceiver();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(listMediaBrowserCompatCustomActionResultReceiver, "");
        listMediaBrowserCompatCustomActionResultReceiver.isEmpty();
        List<getLink> listMediaBrowserCompatCustomActionResultReceiver2 = getbadgetext.MediaBrowserCompatCustomActionResultReceiver();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(listMediaBrowserCompatCustomActionResultReceiver2, "");
        Iterator<T> it = listMediaBrowserCompatCustomActionResultReceiver2.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            getQuestionLimit getquestionlimitRemoteActionCompatParcelizer = ((getLink) next).AudioAttributesImplApi21Parcelizer().RemoteActionCompatParcelizer();
            CourseConfigV2CustomModuleQuestionSource courseConfigV2CustomModuleQuestionSource = getquestionlimitRemoteActionCompatParcelizer instanceof CourseConfigV2CustomModuleQuestionSource ? (CourseConfigV2CustomModuleQuestionSource) getquestionlimitRemoteActionCompatParcelizer : null;
            if (courseConfigV2CustomModuleQuestionSource != null && courseConfigV2CustomModuleQuestionSource.AudioAttributesImplBaseParcelizer() != getQuestionSource.INTERFACE && courseConfigV2CustomModuleQuestionSource.AudioAttributesImplBaseParcelizer() != getQuestionSource.ANNOTATION_CLASS) {
                obj = next;
                break;
            }
        }
        getLink getlink = (getLink) obj;
        if (getlink != null) {
            return getlink;
        }
        List<getLink> listMediaBrowserCompatCustomActionResultReceiver3 = getbadgetext.MediaBrowserCompatCustomActionResultReceiver();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(listMediaBrowserCompatCustomActionResultReceiver3, "");
        Object objRatingCompat = IntermediateLoginResponseBody.RatingCompat((List<? extends Object>) listMediaBrowserCompatCustomActionResultReceiver3);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(objRatingCompat, "");
        return (getLink) objRatingCompat;
    }

    public static final boolean AudioAttributesImplBaseParcelizer(getLink getlink) {
        toMagicModuleMetaRepoModel.write(getlink, "");
        if (getlink instanceof hasBody) {
            return true;
        }
        return (getlink instanceof setPearlNumber) && (((setPearlNumber) getlink).AudioAttributesImplApi26Parcelizer() instanceof hasBody);
    }

    public static final boolean AudioAttributesImplApi26Parcelizer(getLink getlink) {
        toMagicModuleMetaRepoModel.write(getlink, "");
        if (getlink instanceof Plan) {
            return true;
        }
        return (getlink instanceof setPearlNumber) && (((setPearlNumber) getlink).AudioAttributesImplApi26Parcelizer() instanceof Plan);
    }

    public static final boolean MediaBrowserCompatCustomActionResultReceiver(getLink getlink) {
        toMagicModuleMetaRepoModel.write(getlink, "");
        return (getlink instanceof PlanSubscriptionItemKt) && ((PlanSubscriptionItemKt) getlink).MediaBrowserCompatItemReceiver().read();
    }

    public static final getLink MediaDescriptionCompat(getLink getlink) {
        getHref gethrefAudioAttributesCompatParcelizer;
        toMagicModuleMetaRepoModel.write(getlink, "");
        PlanAddOnsCompanion planAddOnsCompanionMediaBrowserCompatMediaItem = getlink.MediaBrowserCompatMediaItem();
        if (planAddOnsCompanionMediaBrowserCompatMediaItem instanceof getTopicId) {
            getTopicId gettopicid = (getTopicId) planAddOnsCompanionMediaBrowserCompatMediaItem;
            getHref gethrefAudioAttributesImplBaseParcelizer = gettopicid.AudioAttributesImplBaseParcelizer();
            if (!gethrefAudioAttributesImplBaseParcelizer.AudioAttributesImplApi21Parcelizer().AudioAttributesCompatParcelizer().isEmpty() && gethrefAudioAttributesImplBaseParcelizer.AudioAttributesImplApi21Parcelizer().RemoteActionCompatParcelizer() != null) {
                List<getBadgeText> listAudioAttributesCompatParcelizer = gethrefAudioAttributesImplBaseParcelizer.AudioAttributesImplApi21Parcelizer().AudioAttributesCompatParcelizer();
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(listAudioAttributesCompatParcelizer, "");
                List<getBadgeText> list = listAudioAttributesCompatParcelizer;
                ArrayList arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(new getDiscountedPrice((getBadgeText) it.next()));
                }
                gethrefAudioAttributesImplBaseParcelizer = setMinPrice.AudioAttributesCompatParcelizer(gethrefAudioAttributesImplBaseParcelizer, arrayList, null, 2);
            }
            getHref gethrefAudioAttributesImplApi26Parcelizer = gettopicid.AudioAttributesImplApi26Parcelizer();
            if (!gethrefAudioAttributesImplApi26Parcelizer.AudioAttributesImplApi21Parcelizer().AudioAttributesCompatParcelizer().isEmpty() && gethrefAudioAttributesImplApi26Parcelizer.AudioAttributesImplApi21Parcelizer().RemoteActionCompatParcelizer() != null) {
                List<getBadgeText> listAudioAttributesCompatParcelizer2 = gethrefAudioAttributesImplApi26Parcelizer.AudioAttributesImplApi21Parcelizer().AudioAttributesCompatParcelizer();
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(listAudioAttributesCompatParcelizer2, "");
                List<getBadgeText> list2 = listAudioAttributesCompatParcelizer2;
                ArrayList arrayList2 = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) list2, 10));
                Iterator<T> it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(new getDiscountedPrice((getBadgeText) it2.next()));
                }
                gethrefAudioAttributesImplApi26Parcelizer = setMinPrice.AudioAttributesCompatParcelizer(gethrefAudioAttributesImplApi26Parcelizer, arrayList2, null, 2);
            }
            gethrefAudioAttributesCompatParcelizer = AddOnMetaKt.AudioAttributesCompatParcelizer(gethrefAudioAttributesImplBaseParcelizer, gethrefAudioAttributesImplApi26Parcelizer);
        } else {
            if (!(planAddOnsCompanionMediaBrowserCompatMediaItem instanceof getHref)) {
                throw new RenewEligibleCreator();
            }
            getHref gethrefAudioAttributesCompatParcelizer2 = (getHref) planAddOnsCompanionMediaBrowserCompatMediaItem;
            if (!gethrefAudioAttributesCompatParcelizer2.AudioAttributesImplApi21Parcelizer().AudioAttributesCompatParcelizer().isEmpty() && gethrefAudioAttributesCompatParcelizer2.AudioAttributesImplApi21Parcelizer().RemoteActionCompatParcelizer() != null) {
                List<getBadgeText> listAudioAttributesCompatParcelizer3 = gethrefAudioAttributesCompatParcelizer2.AudioAttributesImplApi21Parcelizer().AudioAttributesCompatParcelizer();
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(listAudioAttributesCompatParcelizer3, "");
                List<getBadgeText> list3 = listAudioAttributesCompatParcelizer3;
                ArrayList arrayList3 = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) list3, 10));
                Iterator<T> it3 = list3.iterator();
                while (it3.hasNext()) {
                    arrayList3.add(new getDiscountedPrice((getBadgeText) it3.next()));
                }
                gethrefAudioAttributesCompatParcelizer2 = setMinPrice.AudioAttributesCompatParcelizer(gethrefAudioAttributesCompatParcelizer2, arrayList3, null, 2);
            }
            gethrefAudioAttributesCompatParcelizer = gethrefAudioAttributesCompatParcelizer2;
        }
        return setPlanType.write(gethrefAudioAttributesCompatParcelizer, planAddOnsCompanionMediaBrowserCompatMediaItem);
    }

    public static final boolean AudioAttributesCompatParcelizer(getBadgeText getbadgetext) {
        toMagicModuleMetaRepoModel.write(getbadgetext, "");
        return write(getbadgetext, (getPlanAddOns) null, 6);
    }
}
