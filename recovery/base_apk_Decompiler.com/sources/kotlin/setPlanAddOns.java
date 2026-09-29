package kotlin;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.getGroupDescription;

/* JADX INFO: loaded from: classes4.dex */
public final class setPlanAddOns {
    private static getHref RemoteActionCompatParcelizer = SubscriptionType.read(setAccessLevel.DONT_CARE, new String[0]);
    public static final getHref read = SubscriptionType.read(setAccessLevel.UNINFERRED_LAMBDA_PARAMETER_TYPE, new String[0]);
    private static getHref write = new RemoteActionCompatParcelizer("NO_EXPECTED_TYPE");
    private static getHref AudioAttributesCompatParcelizer = new RemoteActionCompatParcelizer("UNIT_EXPECTED_TYPE");

    public static class RemoteActionCompatParcelizer extends newHeaderInstance {
        private final String write;

        @Override // kotlin.PlanAddOnsCompanion
        public final /* synthetic */ PlanAddOnsCompanion AudioAttributesCompatParcelizer(getGroupDescription getgroupdescription) {
            return read(getgroupdescription);
        }

        @Override // kotlin.PlanAddOnsCompanion
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer */
        public final /* synthetic */ PlanAddOnsCompanion write(boolean z) {
            return write(z);
        }

        public RemoteActionCompatParcelizer(String str) {
            this.write = str;
        }

        @Override // kotlin.newHeaderInstance
        protected final getHref write() {
            throw new IllegalStateException(this.write);
        }

        @Override // kotlin.getHref
        public final getHref read(getGroupDescription getgroupdescription) {
            if (getgroupdescription == null) {
                write(0);
            }
            throw new IllegalStateException(this.write);
        }

        @Override // kotlin.getHref
        public final getHref write(boolean z) {
            throw new IllegalStateException(this.write);
        }

        @Override // kotlin.getHref
        public final String toString() {
            String str = this.write;
            if (str == null) {
                write(1);
            }
            return str;
        }

        @Override // kotlin.newHeaderInstance
        public final newHeaderInstance AudioAttributesCompatParcelizer(getHref gethref) {
            if (gethref == null) {
                write(2);
            }
            throw new IllegalStateException(this.write);
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x0030  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static /* synthetic */ void write(int r9) {
            /*
                r0 = 4
                r1 = 1
                if (r9 == r1) goto L9
                if (r9 == r0) goto L9
                java.lang.String r2 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
                goto Lb
            L9:
                java.lang.String r2 = "@NotNull method %s.%s must not return null"
            Lb:
                r3 = 3
                r4 = 2
                if (r9 == r1) goto L13
                if (r9 == r0) goto L13
                r5 = r3
                goto L14
            L13:
                r5 = r4
            L14:
                java.lang.Object[] r5 = new java.lang.Object[r5]
                java.lang.String r6 = "kotlin/reflect/jvm/internal/impl/types/TypeUtils$SpecialType"
                r7 = 0
                if (r9 == r1) goto L30
                if (r9 == r4) goto L2b
                if (r9 == r3) goto L26
                if (r9 == r0) goto L30
                java.lang.String r8 = "newAttributes"
                r5[r7] = r8
                goto L32
            L26:
                java.lang.String r8 = "kotlinTypeRefiner"
                r5[r7] = r8
                goto L32
            L2b:
                java.lang.String r8 = "delegate"
                r5[r7] = r8
                goto L32
            L30:
                r5[r7] = r6
            L32:
                java.lang.String r7 = "refine"
                if (r9 == r1) goto L3e
                if (r9 == r0) goto L3b
                r5[r1] = r6
                goto L42
            L3b:
                r5[r1] = r7
                goto L42
            L3e:
                java.lang.String r6 = "toString"
                r5[r1] = r6
            L42:
                if (r9 == r1) goto L56
                if (r9 == r4) goto L52
                if (r9 == r3) goto L4f
                if (r9 == r0) goto L56
                java.lang.String r3 = "replaceAttributes"
                r5[r4] = r3
                goto L56
            L4f:
                r5[r4] = r7
                goto L56
            L52:
                java.lang.String r3 = "replaceDelegate"
                r5[r4] = r3
            L56:
                java.lang.String r2 = java.lang.String.format(r2, r5)
                if (r9 == r1) goto L64
                if (r9 == r0) goto L64
                java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
                r9.<init>(r2)
                goto L69
            L64:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                r9.<init>(r2)
            L69:
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: o.setPlanAddOns.RemoteActionCompatParcelizer.write(int):void");
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.newHeaderInstance, kotlin.PlanAddOnsCompanion
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public RemoteActionCompatParcelizer write(getCheapestPlan getcheapestplan) {
            if (getcheapestplan == null) {
                write(3);
            }
            return this;
        }
    }

    public static boolean MediaBrowserCompatItemReceiver(getLink getlink) {
        if (getlink == null) {
            AudioAttributesCompatParcelizer(0);
        }
        return getlink == write || getlink == AudioAttributesCompatParcelizer;
    }

    public static boolean read(getLink getlink) {
        return getlink != null && getlink.AudioAttributesImplApi21Parcelizer() == RemoteActionCompatParcelizer.AudioAttributesImplApi21Parcelizer();
    }

    public static getLink MediaBrowserCompatCustomActionResultReceiver(getLink getlink) {
        if (getlink == null) {
            AudioAttributesCompatParcelizer(1);
        }
        return AudioAttributesCompatParcelizer(getlink, true);
    }

    public static getLink AudioAttributesImplApi26Parcelizer(getLink getlink) {
        if (getlink == null) {
            AudioAttributesCompatParcelizer(2);
        }
        return AudioAttributesCompatParcelizer(getlink, false);
    }

    public static getLink AudioAttributesCompatParcelizer(getLink getlink, boolean z) {
        if (getlink == null) {
            AudioAttributesCompatParcelizer(3);
        }
        PlanAddOnsCompanion planAddOnsCompanionRemoteActionCompatParcelizer = getlink.MediaBrowserCompatMediaItem().write(z);
        if (planAddOnsCompanionRemoteActionCompatParcelizer == null) {
            AudioAttributesCompatParcelizer(4);
        }
        return planAddOnsCompanionRemoteActionCompatParcelizer;
    }

    public static getHref read(getHref gethref, boolean z) {
        if (gethref == null) {
            AudioAttributesCompatParcelizer(5);
        }
        if (!z) {
            if (gethref == null) {
                AudioAttributesCompatParcelizer(7);
            }
            return gethref;
        }
        getHref gethrefWrite = gethref.write(true);
        if (gethrefWrite == null) {
            AudioAttributesCompatParcelizer(6);
        }
        return gethrefWrite;
    }

    public static getLink write(getLink getlink, boolean z) {
        if (getlink == null) {
            AudioAttributesCompatParcelizer(8);
        }
        if (z) {
            return MediaBrowserCompatCustomActionResultReceiver(getlink);
        }
        if (getlink == null) {
            AudioAttributesCompatParcelizer(9);
        }
        return getlink;
    }

    public static getHref RemoteActionCompatParcelizer(getQuestionLimit getquestionlimit, setTags settags, getAnswerMap<getCheapestPlan, getHref> getanswermap) {
        if (SubscriptionType.write(getquestionlimit)) {
            PlanSubscriptionItemKt planSubscriptionItemKt = SubscriptionType.read(setAccessLevel.UNABLE_TO_SUBSTITUTE_TYPE, getquestionlimit.toString());
            if (planSubscriptionItemKt == null) {
                AudioAttributesCompatParcelizer(11);
            }
            return planSubscriptionItemKt;
        }
        return IconCompatParcelizer(getquestionlimit.MediaBrowserCompatSearchResultReceiver(), settags, getanswermap);
    }

    public static getHref IconCompatParcelizer(getPlanAddOns getplanaddons, setTags settags, getAnswerMap<getCheapestPlan, getHref> getanswermap) {
        if (getplanaddons == null) {
            AudioAttributesCompatParcelizer(12);
        }
        if (settags == null) {
            AudioAttributesCompatParcelizer(13);
        }
        if (getanswermap == null) {
            AudioAttributesCompatParcelizer(14);
        }
        List<setDefault> listRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(getplanaddons.AudioAttributesCompatParcelizer());
        getGroupDescription.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = getGroupDescription.AudioAttributesCompatParcelizer;
        return AddOnMetaKt.write(getGroupDescription.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(), getplanaddons, listRemoteActionCompatParcelizer, false, settags, getanswermap);
    }

    public static List<setDefault> RemoteActionCompatParcelizer(List<getBadgeText> list) {
        if (list == null) {
            AudioAttributesCompatParcelizer(16);
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<getBadgeText> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new isIndividualPlan(it.next().aP_()));
        }
        List<setDefault> listOnPlay = IntermediateLoginResponseBody.onPlay(arrayList);
        if (listOnPlay == null) {
            AudioAttributesCompatParcelizer(17);
        }
        return listOnPlay;
    }

    private static List<getLink> AudioAttributesImplBaseParcelizer(getLink getlink) {
        if (getlink == null) {
            AudioAttributesCompatParcelizer(18);
        }
        setDesriptionList setdesriptionlistAudioAttributesCompatParcelizer = setDesriptionList.AudioAttributesCompatParcelizer(getlink);
        Collection<getLink> collectionAV_ = getlink.AudioAttributesImplApi21Parcelizer().aV_();
        ArrayList arrayList = new ArrayList(collectionAV_.size());
        Iterator<getLink> it = collectionAV_.iterator();
        while (it.hasNext()) {
            getLink getlinkRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(getlink, it.next(), setdesriptionlistAudioAttributesCompatParcelizer);
            if (getlinkRemoteActionCompatParcelizer != null) {
                arrayList.add(getlinkRemoteActionCompatParcelizer);
            }
        }
        return arrayList;
    }

    private static getLink RemoteActionCompatParcelizer(getLink getlink, getLink getlink2, setDesriptionList setdesriptionlist) {
        if (getlink == null) {
            AudioAttributesCompatParcelizer(20);
        }
        if (getlink2 == null) {
            AudioAttributesCompatParcelizer(21);
        }
        if (setdesriptionlist == null) {
            AudioAttributesCompatParcelizer(22);
        }
        getLink getlinkIconCompatParcelizer = setdesriptionlist.IconCompatParcelizer(getlink2, getTotalSubject.INVARIANT);
        if (getlinkIconCompatParcelizer != null) {
            return write(getlinkIconCompatParcelizer, getlink.ba_());
        }
        return null;
    }

    public static boolean write(getLink getlink) {
        if (getlink == null) {
            AudioAttributesCompatParcelizer(27);
        }
        if (getlink.ba_()) {
            return true;
        }
        if (PearlSubjectInfo.AudioAttributesCompatParcelizer(getlink) && write(PearlSubjectInfo.read(getlink).AudioAttributesImplApi26Parcelizer())) {
            return true;
        }
        if (Meta.AudioAttributesCompatParcelizer(getlink)) {
            return false;
        }
        if (AudioAttributesCompatParcelizer(getlink)) {
            return MediaMetadataCompat(getlink);
        }
        if (getlink instanceof hasBody) {
            getBadgeText getbadgetextIconCompatParcelizer = ((hasBody) getlink).AudioAttributesImplApi26Parcelizer().IconCompatParcelizer();
            return getbadgetextIconCompatParcelizer == null || MediaMetadataCompat(getbadgetextIconCompatParcelizer.aP_());
        }
        getPlanAddOns getplanaddonsAudioAttributesImplApi21Parcelizer = getlink.AudioAttributesImplApi21Parcelizer();
        if (getplanaddonsAudioAttributesImplApi21Parcelizer instanceof getMainCopy) {
            Iterator<getLink> it = getplanaddonsAudioAttributesImplApi21Parcelizer.aV_().iterator();
            while (it.hasNext()) {
                if (write(it.next())) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean RemoteActionCompatParcelizer(getLink getlink) {
        if (getlink == null) {
            AudioAttributesCompatParcelizer(28);
        }
        if (getlink.ba_()) {
            return true;
        }
        return PearlSubjectInfo.AudioAttributesCompatParcelizer(getlink) && RemoteActionCompatParcelizer(PearlSubjectInfo.read(getlink).AudioAttributesImplApi26Parcelizer());
    }

    private static boolean MediaMetadataCompat(getLink getlink) {
        if (getlink == null) {
            AudioAttributesCompatParcelizer(29);
        }
        if (getlink.AudioAttributesImplApi21Parcelizer().RemoteActionCompatParcelizer() instanceof CourseConfigV2CustomModuleQuestionSource) {
            return false;
        }
        Iterator<getLink> it = AudioAttributesImplBaseParcelizer(getlink).iterator();
        while (it.hasNext()) {
            if (write(it.next())) {
                return true;
            }
        }
        return false;
    }

    public static CourseConfigV2CustomModuleQuestionSource IconCompatParcelizer(getLink getlink) {
        if (getlink == null) {
            AudioAttributesCompatParcelizer(30);
        }
        getQuestionLimit getquestionlimitRemoteActionCompatParcelizer = getlink.AudioAttributesImplApi21Parcelizer().RemoteActionCompatParcelizer();
        if (getquestionlimitRemoteActionCompatParcelizer instanceof CourseConfigV2CustomModuleQuestionSource) {
            return (CourseConfigV2CustomModuleQuestionSource) getquestionlimitRemoteActionCompatParcelizer;
        }
        return null;
    }

    public static boolean RemoteActionCompatParcelizer(getLink getlink, getAnswerMap<PlanAddOnsCompanion, Boolean> getanswermap) {
        if (getanswermap == null) {
            AudioAttributesCompatParcelizer(43);
        }
        return IconCompatParcelizer(getlink, getanswermap, (Tag<getLink>) null);
    }

    private static boolean IconCompatParcelizer(getLink getlink, getAnswerMap<PlanAddOnsCompanion, Boolean> getanswermap, Tag<getLink> tag) {
        if (getanswermap == null) {
            AudioAttributesCompatParcelizer(44);
        }
        if (getlink == null) {
            return false;
        }
        PlanAddOnsCompanion planAddOnsCompanionMediaBrowserCompatMediaItem = getlink.MediaBrowserCompatMediaItem();
        if (MediaBrowserCompatItemReceiver(getlink)) {
            return getanswermap.invoke(planAddOnsCompanionMediaBrowserCompatMediaItem).booleanValue();
        }
        if (tag != null && tag.contains(getlink)) {
            return false;
        }
        if (getanswermap.invoke(planAddOnsCompanionMediaBrowserCompatMediaItem).booleanValue()) {
            return true;
        }
        if (tag == null) {
            tag = Tag.RemoteActionCompatParcelizer();
        }
        tag.add(getlink);
        getTopicId gettopicid = planAddOnsCompanionMediaBrowserCompatMediaItem instanceof getTopicId ? (getTopicId) planAddOnsCompanionMediaBrowserCompatMediaItem : null;
        if (gettopicid != null && (IconCompatParcelizer(gettopicid.AudioAttributesImplBaseParcelizer(), getanswermap, tag) || IconCompatParcelizer(gettopicid.AudioAttributesImplApi26Parcelizer(), getanswermap, tag))) {
            return true;
        }
        if ((planAddOnsCompanionMediaBrowserCompatMediaItem instanceof setPearlNumber) && IconCompatParcelizer(((setPearlNumber) planAddOnsCompanionMediaBrowserCompatMediaItem).AudioAttributesImplApi26Parcelizer(), getanswermap, tag)) {
            return true;
        }
        getPlanAddOns getplanaddonsAudioAttributesImplApi21Parcelizer = getlink.AudioAttributesImplApi21Parcelizer();
        if (getplanaddonsAudioAttributesImplApi21Parcelizer instanceof getMainCopy) {
            Iterator<getLink> it = ((getMainCopy) getplanaddonsAudioAttributesImplApi21Parcelizer).aV_().iterator();
            while (it.hasNext()) {
                if (IconCompatParcelizer(it.next(), getanswermap, tag)) {
                    return true;
                }
            }
            return false;
        }
        for (setDefault setdefault : getlink.bb_()) {
            if (!setdefault.write() && IconCompatParcelizer(setdefault.AudioAttributesCompatParcelizer(), getanswermap, tag)) {
                return true;
            }
        }
        return false;
    }

    public static setDefault write(getBadgeText getbadgetext) {
        if (getbadgetext == null) {
            AudioAttributesCompatParcelizer(45);
        }
        return new getDiscountedPrice(getbadgetext);
    }

    public static setDefault write(getBadgeText getbadgetext, PearlMini pearlMini) {
        if (getbadgetext == null) {
            AudioAttributesCompatParcelizer(46);
        }
        if (pearlMini.IconCompatParcelizer() == setGroupSubttile.SUPERTYPE) {
            return new isIndividualPlan(hasSubscriptions.read(getbadgetext));
        }
        return new getDiscountedPrice(getbadgetext);
    }

    public static boolean AudioAttributesCompatParcelizer(getLink getlink) {
        if (getlink == null) {
            AudioAttributesCompatParcelizer(60);
        }
        return AudioAttributesImplApi21Parcelizer(getlink) != null || (getlink.AudioAttributesImplApi21Parcelizer() instanceof getPlans);
    }

    private static getBadgeText AudioAttributesImplApi21Parcelizer(getLink getlink) {
        if (getlink == null) {
            AudioAttributesCompatParcelizer(63);
        }
        if (getlink.AudioAttributesImplApi21Parcelizer().RemoteActionCompatParcelizer() instanceof getBadgeText) {
            return (getBadgeText) getlink.AudioAttributesImplApi21Parcelizer().RemoteActionCompatParcelizer();
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0120  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ void AudioAttributesCompatParcelizer(int r24) {
        /*
            Method dump skipped, instruction units count: 780
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setPlanAddOns.AudioAttributesCompatParcelizer(int):void");
    }
}
