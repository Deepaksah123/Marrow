package kotlin;

import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.ServiceLoader;
import java.util.Set;
import kotlin.PlanData;
import kotlin.addPlan;
import kotlin.getCheapestPlan;
import kotlin.getTestHeaderTitle;
import kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition;

/* JADX INFO: loaded from: classes4.dex */
public final class getOptions {
    private static final PlanData.RemoteActionCompatParcelizer AudioAttributesCompatParcelizer;
    public static final getOptions RemoteActionCompatParcelizer;
    private static final List<ExternalOverridabilityCondition> write = IntermediateLoginResponseBody.onPlay(ServiceLoader.load(ExternalOverridabilityCondition.class, ExternalOverridabilityCondition.class.getClassLoader()));
    private final addPlan AudioAttributesImplBaseParcelizer;
    private final PlanData.RemoteActionCompatParcelizer IconCompatParcelizer;
    private final getCheapestPlan MediaBrowserCompatItemReceiver;
    private final MagicModuleSubmissionRequestBody<getLink, getLink, Boolean> read;

    static {
        PlanData.RemoteActionCompatParcelizer remoteActionCompatParcelizer = new PlanData.RemoteActionCompatParcelizer() { // from class: o.getOptions.5
            @Override // o.PlanData.RemoteActionCompatParcelizer
            public final boolean IconCompatParcelizer(getPlanAddOns getplanaddons, getPlanAddOns getplanaddons2) {
                if (getplanaddons == null) {
                    AudioAttributesCompatParcelizer(0);
                }
                if (getplanaddons2 == null) {
                    AudioAttributesCompatParcelizer(1);
                }
                return getplanaddons.equals(getplanaddons2);
            }

            private static /* synthetic */ void AudioAttributesCompatParcelizer(int i) {
                Object[] objArr = new Object[3];
                if (i != 1) {
                    objArr[0] = CmcdHeadersFactory.OBJECT_TYPE_AUDIO_ONLY;
                } else {
                    objArr[0] = "b";
                }
                objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil$1";
                objArr[2] = "equals";
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
            }
        };
        AudioAttributesCompatParcelizer = remoteActionCompatParcelizer;
        RemoteActionCompatParcelizer = new getOptions(remoteActionCompatParcelizer, getCheapestPlan.read.write, addPlan.write.write);
    }

    public static getOptions read(getCheapestPlan getcheapestplan) {
        if (getcheapestplan == null) {
            write(0);
        }
        return new getOptions(AudioAttributesCompatParcelizer, getcheapestplan, addPlan.write.write);
    }

    public static getOptions RemoteActionCompatParcelizer(getCheapestPlan getcheapestplan, PlanData.RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        if (getcheapestplan == null) {
            write(3);
        }
        return new getOptions(remoteActionCompatParcelizer, getcheapestplan, addPlan.write.write);
    }

    private getOptions(PlanData.RemoteActionCompatParcelizer remoteActionCompatParcelizer, getCheapestPlan getcheapestplan, addPlan addplan) {
        if (remoteActionCompatParcelizer == null) {
            write(5);
        }
        if (getcheapestplan == null) {
            write(6);
        }
        if (addplan == null) {
            write(7);
        }
        this.IconCompatParcelizer = remoteActionCompatParcelizer;
        this.MediaBrowserCompatItemReceiver = getcheapestplan;
        this.AudioAttributesImplBaseParcelizer = addplan;
        this.read = null;
    }

    private static <D extends getVideoPageNotesTitle> Set<D> RemoteActionCompatParcelizer(Set<D> set) {
        return RemoteActionCompatParcelizer(set, !set.isEmpty() && setLocked.IconCompatParcelizer(setLocked.IconCompatParcelizer(set.iterator().next())), new MagicModuleSubmissionRequestBody<D, D, Pair<getVideoPageNotesTitle, getVideoPageNotesTitle>>() { // from class: o.getOptions.3
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final /* synthetic */ Pair<getVideoPageNotesTitle, getVideoPageNotesTitle> invoke(Object obj, Object obj2) {
                return write((getVideoPageNotesTitle) obj, (getVideoPageNotesTitle) obj2);
            }

            /* JADX WARN: Incorrect types in method signature: (TD;TD;)Lo/getSubscriptionExpiresOn<Lo/getVideoPageNotesTitle;Lo/getVideoPageNotesTitle;>; */
            private static Pair write(getVideoPageNotesTitle getvideopagenotestitle, getVideoPageNotesTitle getvideopagenotestitle2) {
                return new Pair(getvideopagenotestitle, getvideopagenotestitle2);
            }
        });
    }

    private static <D> Set<D> RemoteActionCompatParcelizer(Set<D> set, boolean z, MagicModuleSubmissionRequestBody<? super D, ? super D, Pair<getVideoPageNotesTitle, getVideoPageNotesTitle>> magicModuleSubmissionRequestBody) {
        if (set == null) {
            write(9);
        }
        if (set.size() <= 1) {
            if (set == null) {
                write(11);
            }
            return set;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : set) {
            Iterator it = linkedHashSet.iterator();
            while (true) {
                if (it.hasNext()) {
                    Pair<getVideoPageNotesTitle, getVideoPageNotesTitle> pairInvoke = magicModuleSubmissionRequestBody.invoke(obj, (Object) it.next());
                    getVideoPageNotesTitle getvideopagenotestitleRemoteActionCompatParcelizer = pairInvoke.RemoteActionCompatParcelizer();
                    getVideoPageNotesTitle getvideopagenotestitle = pairInvoke.read();
                    if (RemoteActionCompatParcelizer(getvideopagenotestitleRemoteActionCompatParcelizer, getvideopagenotestitle, z)) {
                        it.remove();
                    } else if (RemoteActionCompatParcelizer(getvideopagenotestitle, getvideopagenotestitleRemoteActionCompatParcelizer, z)) {
                        break;
                    }
                } else {
                    linkedHashSet.add(obj);
                    break;
                }
            }
        }
        return linkedHashSet;
    }

    private static <D extends getVideoPageNotesTitle> boolean RemoteActionCompatParcelizer(D d, D d2, boolean z) {
        if (d == null) {
            write(13);
        }
        if (d2 == null) {
            write(14);
        }
        if (!d.equals(d2) && setStarred.AudioAttributesCompatParcelizer.IconCompatParcelizer((getVariant) d.onAddQueueItem(), (getVariant) d2.onAddQueueItem(), z, true)) {
            return true;
        }
        getVideoPageNotesTitle getvideopagenotestitleOnAddQueueItem = d2.onAddQueueItem();
        Iterator it = getAnswerDescription.AudioAttributesCompatParcelizer((getVideoPageNotesTitle) d).iterator();
        while (it.hasNext()) {
            if (setStarred.AudioAttributesCompatParcelizer.IconCompatParcelizer((getVariant) getvideopagenotestitleOnAddQueueItem, (getVariant) it.next(), z, true)) {
                return true;
            }
        }
        return false;
    }

    private static Set<getTestHeaderTitle> IconCompatParcelizer(getTestHeaderTitle gettestheadertitle) {
        if (gettestheadertitle == null) {
            write(15);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        write(gettestheadertitle, linkedHashSet);
        return linkedHashSet;
    }

    private static void write(getTestHeaderTitle gettestheadertitle, Set<getTestHeaderTitle> set) {
        if (gettestheadertitle == null) {
            write(17);
        }
        if (set == null) {
            write(18);
        }
        if (gettestheadertitle.handleMediaPlayPauseIfPendingOnHandler().AudioAttributesCompatParcelizer()) {
            set.add(gettestheadertitle);
        } else {
            if (gettestheadertitle.AudioAttributesImplApi26Parcelizer().isEmpty()) {
                throw new IllegalStateException("No overridden descriptors found for (fake override) ".concat(String.valueOf(gettestheadertitle)));
            }
            Iterator<? extends getTestHeaderTitle> it = gettestheadertitle.AudioAttributesImplApi26Parcelizer().iterator();
            while (it.hasNext()) {
                write(it.next(), set);
            }
        }
    }

    private RemoteActionCompatParcelizer AudioAttributesCompatParcelizer(getVideoPageNotesTitle getvideopagenotestitle, getVideoPageNotesTitle getvideopagenotestitle2, CourseConfigV2CustomModuleQuestionSource courseConfigV2CustomModuleQuestionSource) {
        if (getvideopagenotestitle == null) {
            write(19);
        }
        if (getvideopagenotestitle2 == null) {
            write(20);
        }
        RemoteActionCompatParcelizer RemoteActionCompatParcelizer2 = RemoteActionCompatParcelizer(getvideopagenotestitle, getvideopagenotestitle2, courseConfigV2CustomModuleQuestionSource, false);
        if (RemoteActionCompatParcelizer2 == null) {
            write(21);
        }
        return RemoteActionCompatParcelizer2;
    }

    public final RemoteActionCompatParcelizer RemoteActionCompatParcelizer(getVideoPageNotesTitle getvideopagenotestitle, getVideoPageNotesTitle getvideopagenotestitle2, CourseConfigV2CustomModuleQuestionSource courseConfigV2CustomModuleQuestionSource, boolean z) {
        if (getvideopagenotestitle == null) {
            write(22);
        }
        if (getvideopagenotestitle2 == null) {
            write(23);
        }
        RemoteActionCompatParcelizer remoteActionCompatParcelizer = read(getvideopagenotestitle, getvideopagenotestitle2, z);
        boolean z2 = remoteActionCompatParcelizer.IconCompatParcelizer() == RemoteActionCompatParcelizer.IconCompatParcelizer.OVERRIDABLE;
        for (ExternalOverridabilityCondition externalOverridabilityCondition : write) {
            if (externalOverridabilityCondition.getContract() != ExternalOverridabilityCondition.IconCompatParcelizer.CONFLICTS_ONLY && (!z2 || externalOverridabilityCondition.getContract() != ExternalOverridabilityCondition.IconCompatParcelizer.SUCCESS_ONLY)) {
                int i = AnonymousClass10.read[externalOverridabilityCondition.isOverridable(getvideopagenotestitle, getvideopagenotestitle2, courseConfigV2CustomModuleQuestionSource).ordinal()];
                if (i == 1) {
                    z2 = true;
                } else {
                    if (i == 2) {
                        return RemoteActionCompatParcelizer.write("External condition failed");
                    }
                    if (i == 3) {
                        return RemoteActionCompatParcelizer.read("External condition");
                    }
                }
            }
        }
        if (!z2) {
            if (remoteActionCompatParcelizer == null) {
                write(26);
            }
            return remoteActionCompatParcelizer;
        }
        for (ExternalOverridabilityCondition externalOverridabilityCondition2 : write) {
            if (externalOverridabilityCondition2.getContract() == ExternalOverridabilityCondition.IconCompatParcelizer.CONFLICTS_ONLY) {
                int i2 = AnonymousClass10.read[externalOverridabilityCondition2.isOverridable(getvideopagenotestitle, getvideopagenotestitle2, courseConfigV2CustomModuleQuestionSource).ordinal()];
                if (i2 == 1) {
                    StringBuilder sb = new StringBuilder("Contract violation in ");
                    sb.append(externalOverridabilityCondition2.getClass().getName());
                    sb.append(" condition. It's not supposed to end with success");
                    throw new IllegalStateException(sb.toString());
                }
                if (i2 == 2) {
                    return RemoteActionCompatParcelizer.write("External condition failed");
                }
                if (i2 == 3) {
                    return RemoteActionCompatParcelizer.read("External condition");
                }
            }
        }
        RemoteActionCompatParcelizer remoteActionCompatParcelizerWrite = RemoteActionCompatParcelizer.write();
        if (remoteActionCompatParcelizerWrite == null) {
            write(29);
        }
        return remoteActionCompatParcelizerWrite;
    }

    public final RemoteActionCompatParcelizer read(getVideoPageNotesTitle getvideopagenotestitle, getVideoPageNotesTitle getvideopagenotestitle2, boolean z) {
        if (getvideopagenotestitle == null) {
            write(30);
        }
        if (getvideopagenotestitle2 == null) {
            write(31);
        }
        RemoteActionCompatParcelizer remoteActionCompatParcelizerWrite = write(getvideopagenotestitle, getvideopagenotestitle2);
        if (remoteActionCompatParcelizerWrite != null) {
            if (remoteActionCompatParcelizerWrite == null) {
                write(32);
            }
            return remoteActionCompatParcelizerWrite;
        }
        List<getLink> listWrite = write(getvideopagenotestitle);
        List<getLink> listWrite2 = write(getvideopagenotestitle2);
        List<getBadgeText> listMediaDescriptionCompat = getvideopagenotestitle.MediaDescriptionCompat();
        List<getBadgeText> listMediaDescriptionCompat2 = getvideopagenotestitle2.MediaDescriptionCompat();
        int i = 0;
        if (listMediaDescriptionCompat.size() != listMediaDescriptionCompat2.size()) {
            while (i < listWrite.size()) {
                if (!PlanData.AudioAttributesCompatParcelizer.IconCompatParcelizer(listWrite.get(i), listWrite2.get(i))) {
                    return RemoteActionCompatParcelizer.read("Type parameter number mismatch");
                }
                i++;
            }
            return RemoteActionCompatParcelizer.write("Type parameter number mismatch");
        }
        getPlanType getplantypeIconCompatParcelizer = IconCompatParcelizer(listMediaDescriptionCompat, listMediaDescriptionCompat2);
        for (int i2 = 0; i2 < listMediaDescriptionCompat.size(); i2++) {
            if (!AudioAttributesCompatParcelizer(listMediaDescriptionCompat.get(i2), listMediaDescriptionCompat2.get(i2), getplantypeIconCompatParcelizer)) {
                return RemoteActionCompatParcelizer.read("Type parameter bounds mismatch");
            }
        }
        while (i < listWrite.size()) {
            if (!AudioAttributesCompatParcelizer(listWrite.get(i), listWrite2.get(i), getplantypeIconCompatParcelizer)) {
                return RemoteActionCompatParcelizer.read("Value parameter type mismatch");
            }
            i++;
        }
        if ((getvideopagenotestitle instanceof CourseConfigV2NavDrawerItemRateUs) && (getvideopagenotestitle2 instanceof CourseConfigV2NavDrawerItemRateUs) && ((CourseConfigV2NavDrawerItemRateUs) getvideopagenotestitle).onSeekTo() != ((CourseConfigV2NavDrawerItemRateUs) getvideopagenotestitle2).onSeekTo()) {
            return RemoteActionCompatParcelizer.write("Incompatible suspendability");
        }
        if (z) {
            getLink getlinkAudioAttributesImplBaseParcelizer = getvideopagenotestitle.AudioAttributesImplBaseParcelizer();
            getLink getlinkAudioAttributesImplBaseParcelizer2 = getvideopagenotestitle2.AudioAttributesImplBaseParcelizer();
            if (getlinkAudioAttributesImplBaseParcelizer != null && getlinkAudioAttributesImplBaseParcelizer2 != null && ((!Copy.write(getlinkAudioAttributesImplBaseParcelizer2) || !Copy.write(getlinkAudioAttributesImplBaseParcelizer)) && !getPearlType.IconCompatParcelizer.IconCompatParcelizer(getplantypeIconCompatParcelizer, getlinkAudioAttributesImplBaseParcelizer2.MediaBrowserCompatMediaItem(), getlinkAudioAttributesImplBaseParcelizer.MediaBrowserCompatMediaItem()))) {
                return RemoteActionCompatParcelizer.write("Return type mismatch");
            }
        }
        RemoteActionCompatParcelizer remoteActionCompatParcelizerWrite2 = RemoteActionCompatParcelizer.write();
        if (remoteActionCompatParcelizerWrite2 == null) {
            write(39);
        }
        return remoteActionCompatParcelizerWrite2;
    }

    public static RemoteActionCompatParcelizer write(getVideoPageNotesTitle getvideopagenotestitle, getVideoPageNotesTitle getvideopagenotestitle2) {
        boolean z;
        if (getvideopagenotestitle == null) {
            write(40);
        }
        if (getvideopagenotestitle2 == null) {
            write(41);
        }
        boolean z2 = getvideopagenotestitle instanceof CourseConfigV2NavDrawerItemRateUs;
        if ((z2 && !(getvideopagenotestitle2 instanceof CourseConfigV2NavDrawerItemRateUs)) || (((z = getvideopagenotestitle instanceof CourseConfigV2SettingsItems)) && !(getvideopagenotestitle2 instanceof CourseConfigV2SettingsItems))) {
            return RemoteActionCompatParcelizer.read("Member kind mismatch");
        }
        if (!z2 && !z) {
            throw new IllegalArgumentException("This type of CallableDescriptor cannot be checked for overridability: ".concat(String.valueOf(getvideopagenotestitle)));
        }
        if (!getvideopagenotestitle.aQ_().equals(getvideopagenotestitle2.aQ_())) {
            return RemoteActionCompatParcelizer.read("Name mismatch");
        }
        RemoteActionCompatParcelizer remoteActionCompatParcelizerIconCompatParcelizer = IconCompatParcelizer(getvideopagenotestitle, getvideopagenotestitle2);
        if (remoteActionCompatParcelizerIconCompatParcelizer != null) {
            return remoteActionCompatParcelizerIconCompatParcelizer;
        }
        return null;
    }

    private getPlanType IconCompatParcelizer(List<getBadgeText> list, List<getBadgeText> list2) {
        if (list == null) {
            write(42);
        }
        if (list2 == null) {
            write(43);
        }
        if (list.isEmpty()) {
            getPlanType getplantypeAudioAttributesCompatParcelizer = new getQuestionDescription(null, this.IconCompatParcelizer, this.MediaBrowserCompatItemReceiver, this.AudioAttributesImplBaseParcelizer, this.read).AudioAttributesCompatParcelizer();
            if (getplantypeAudioAttributesCompatParcelizer == null) {
                write(44);
            }
            return getplantypeAudioAttributesCompatParcelizer;
        }
        HashMap map = new HashMap();
        for (int i = 0; i < list.size(); i++) {
            map.put(list.get(i).MediaBrowserCompatSearchResultReceiver(), list2.get(i).MediaBrowserCompatSearchResultReceiver());
        }
        getPlanType getplantypeAudioAttributesCompatParcelizer2 = new getQuestionDescription(map, this.IconCompatParcelizer, this.MediaBrowserCompatItemReceiver, this.AudioAttributesImplBaseParcelizer, this.read).AudioAttributesCompatParcelizer();
        if (getplantypeAudioAttributesCompatParcelizer2 == null) {
            write(45);
        }
        return getplantypeAudioAttributesCompatParcelizer2;
    }

    private static RemoteActionCompatParcelizer IconCompatParcelizer(getVideoPageNotesTitle getvideopagenotestitle, getVideoPageNotesTitle getvideopagenotestitle2) {
        if ((getvideopagenotestitle.MediaBrowserCompatCustomActionResultReceiver() == null) != (getvideopagenotestitle2.MediaBrowserCompatCustomActionResultReceiver() == null)) {
            return RemoteActionCompatParcelizer.read("Receiver presence mismatch");
        }
        if (getvideopagenotestitle.aX_().size() != getvideopagenotestitle2.aX_().size()) {
            return RemoteActionCompatParcelizer.read("Value parameter number mismatch");
        }
        return null;
    }

    private static boolean AudioAttributesCompatParcelizer(getLink getlink, getLink getlink2, getPlanType getplantype) {
        if (getlink == null) {
            write(46);
        }
        if (getlink2 == null) {
            write(47);
        }
        if (getplantype == null) {
            write(48);
        }
        if (Copy.write(getlink) && Copy.write(getlink2)) {
            return true;
        }
        getPearlType getpearltype = getPearlType.IconCompatParcelizer;
        return getPearlType.AudioAttributesCompatParcelizer(getplantype, getlink.MediaBrowserCompatMediaItem(), getlink2.MediaBrowserCompatMediaItem());
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0054, code lost:
    
        r1.remove();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static boolean AudioAttributesCompatParcelizer(kotlin.getBadgeText r4, kotlin.getBadgeText r5, kotlin.getPlanType r6) {
        /*
            if (r4 != 0) goto L7
            r0 = 49
            write(r0)
        L7:
            if (r5 != 0) goto Le
            r0 = 50
            write(r0)
        Le:
            if (r6 != 0) goto L15
            r0 = 51
            write(r0)
        L15:
            java.util.List r4 = r4.MediaBrowserCompatCustomActionResultReceiver()
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.List r5 = r5.MediaBrowserCompatCustomActionResultReceiver()
            r0.<init>(r5)
            int r5 = r4.size()
            int r1 = r0.size()
            r2 = 0
            if (r5 == r1) goto L2e
            return r2
        L2e:
            java.util.Iterator r4 = r4.iterator()
        L32:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L59
            java.lang.Object r5 = r4.next()
            o.getLink r5 = (kotlin.getLink) r5
            java.util.ListIterator r1 = r0.listIterator()
        L42:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L58
            java.lang.Object r3 = r1.next()
            o.getLink r3 = (kotlin.getLink) r3
            boolean r3 = AudioAttributesCompatParcelizer(r5, r3, r6)
            if (r3 == 0) goto L42
            r1.remove()
            goto L32
        L58:
            return r2
        L59:
            r4 = 1
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getOptions.AudioAttributesCompatParcelizer(o.getBadgeText, o.getBadgeText, o.getPlanType):boolean");
    }

    private static List<getLink> write(getVideoPageNotesTitle getvideopagenotestitle) {
        CourseConfigV2TestTabItem courseConfigV2TestTabItemMediaBrowserCompatCustomActionResultReceiver = getvideopagenotestitle.MediaBrowserCompatCustomActionResultReceiver();
        ArrayList arrayList = new ArrayList();
        if (courseConfigV2TestTabItemMediaBrowserCompatCustomActionResultReceiver != null) {
            arrayList.add(courseConfigV2TestTabItemMediaBrowserCompatCustomActionResultReceiver.onPrepareFromMediaId());
        }
        Iterator<getMeta> it = getvideopagenotestitle.aX_().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().onPrepareFromMediaId());
        }
        return arrayList;
    }

    public final void RemoteActionCompatParcelizer(getRelatedLessonId getrelatedlessonid, Collection<? extends getTestHeaderTitle> collection, Collection<? extends getTestHeaderTitle> collection2, CourseConfigV2CustomModuleQuestionSource courseConfigV2CustomModuleQuestionSource, getOption4 getoption4) {
        if (getrelatedlessonid == null) {
            write(52);
        }
        if (collection == null) {
            write(53);
        }
        if (collection2 == null) {
            write(54);
        }
        if (courseConfigV2CustomModuleQuestionSource == null) {
            write(55);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(collection);
        Iterator<? extends getTestHeaderTitle> it = collection2.iterator();
        while (it.hasNext()) {
            linkedHashSet.removeAll(RemoteActionCompatParcelizer(it.next(), collection, courseConfigV2CustomModuleQuestionSource, getoption4));
        }
        AudioAttributesCompatParcelizer(courseConfigV2CustomModuleQuestionSource, linkedHashSet, getoption4);
    }

    private static boolean read(CourseConfigV2NavDrawerItemYourCourse courseConfigV2NavDrawerItemYourCourse, CourseConfigV2NavDrawerItemYourCourse courseConfigV2NavDrawerItemYourCourse2) {
        if (courseConfigV2NavDrawerItemYourCourse == null) {
            write(57);
        }
        if (courseConfigV2NavDrawerItemYourCourse2 == null) {
            write(58);
        }
        return !CourseConfigV2NavDrawerItemFaq.write(courseConfigV2NavDrawerItemYourCourse2.onCustomAction()) && CourseConfigV2NavDrawerItemFaq.AudioAttributesCompatParcelizer(courseConfigV2NavDrawerItemYourCourse2, courseConfigV2NavDrawerItemYourCourse, false);
    }

    private Collection<getTestHeaderTitle> RemoteActionCompatParcelizer(getTestHeaderTitle gettestheadertitle, Collection<? extends getTestHeaderTitle> collection, CourseConfigV2CustomModuleQuestionSource courseConfigV2CustomModuleQuestionSource, getOption4 getoption4) {
        if (gettestheadertitle == null) {
            write(59);
        }
        if (collection == null) {
            write(60);
        }
        if (courseConfigV2CustomModuleQuestionSource == null) {
            write(61);
        }
        if (getoption4 == null) {
            write(62);
        }
        ArrayList arrayList = new ArrayList(collection.size());
        Tag tagRemoteActionCompatParcelizer = Tag.RemoteActionCompatParcelizer();
        for (getTestHeaderTitle gettestheadertitle2 : collection) {
            RemoteActionCompatParcelizer.IconCompatParcelizer IconCompatParcelizer = AudioAttributesCompatParcelizer(gettestheadertitle2, gettestheadertitle, courseConfigV2CustomModuleQuestionSource).IconCompatParcelizer();
            boolean z = read((CourseConfigV2NavDrawerItemYourCourse) gettestheadertitle, (CourseConfigV2NavDrawerItemYourCourse) gettestheadertitle2);
            int i = AnonymousClass10.IconCompatParcelizer[IconCompatParcelizer.ordinal()];
            if (i == 1) {
                if (z) {
                    tagRemoteActionCompatParcelizer.add(gettestheadertitle2);
                }
                arrayList.add(gettestheadertitle2);
            } else if (i == 2) {
                if (z) {
                    getoption4.IconCompatParcelizer(gettestheadertitle2, gettestheadertitle);
                }
                arrayList.add(gettestheadertitle2);
            }
        }
        getoption4.AudioAttributesCompatParcelizer(gettestheadertitle, tagRemoteActionCompatParcelizer);
        return arrayList;
    }

    private static boolean IconCompatParcelizer(Collection<getTestHeaderTitle> collection) {
        if (collection == null) {
            write(63);
        }
        if (collection.size() < 2) {
            return true;
        }
        final getVariant getvariantAudioAttributesImplApi21Parcelizer = collection.iterator().next().AudioAttributesImplApi21Parcelizer();
        return IntermediateLoginResponseBody.IconCompatParcelizer(collection, new getAnswerMap<getTestHeaderTitle, Boolean>() { // from class: o.getOptions.2
            /* JADX INFO: Access modifiers changed from: private */
            @Override // kotlin.getAnswerMap
            /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
            public Boolean invoke(getTestHeaderTitle gettestheadertitle) {
                return Boolean.valueOf(gettestheadertitle.AudioAttributesImplApi21Parcelizer() == getvariantAudioAttributesImplApi21Parcelizer);
            }
        });
    }

    private static void AudioAttributesCompatParcelizer(CourseConfigV2CustomModuleQuestionSource courseConfigV2CustomModuleQuestionSource, Collection<getTestHeaderTitle> collection, getOption4 getoption4) {
        if (courseConfigV2CustomModuleQuestionSource == null) {
            write(64);
        }
        if (getoption4 == null) {
            write(66);
        }
        if (IconCompatParcelizer(collection)) {
            Iterator<getTestHeaderTitle> it = collection.iterator();
            while (it.hasNext()) {
                IconCompatParcelizer(Collections.singleton(it.next()), courseConfigV2CustomModuleQuestionSource, getoption4);
            }
        } else {
            LinkedList linkedList = new LinkedList(collection);
            while (!linkedList.isEmpty()) {
                IconCompatParcelizer(read(McqContentBodyCompanion.RemoteActionCompatParcelizer(linkedList), linkedList, getoption4), courseConfigV2CustomModuleQuestionSource, getoption4);
            }
        }
    }

    public static boolean RemoteActionCompatParcelizer(getVideoPageNotesTitle getvideopagenotestitle, getVideoPageNotesTitle getvideopagenotestitle2) {
        if (getvideopagenotestitle == null) {
            write(67);
        }
        if (getvideopagenotestitle2 == null) {
            write(68);
        }
        getLink getlinkAudioAttributesImplBaseParcelizer = getvideopagenotestitle.AudioAttributesImplBaseParcelizer();
        getLink getlinkAudioAttributesImplBaseParcelizer2 = getvideopagenotestitle2.AudioAttributesImplBaseParcelizer();
        if (!read((getSubText) getvideopagenotestitle, (getSubText) getvideopagenotestitle2)) {
            return false;
        }
        getPlanType getplantypeIconCompatParcelizer = RemoteActionCompatParcelizer.IconCompatParcelizer(getvideopagenotestitle.MediaDescriptionCompat(), getvideopagenotestitle2.MediaDescriptionCompat());
        if (getvideopagenotestitle instanceof CourseConfigV2NavDrawerItemRateUs) {
            return RemoteActionCompatParcelizer(getvideopagenotestitle, getlinkAudioAttributesImplBaseParcelizer, getvideopagenotestitle2, getlinkAudioAttributesImplBaseParcelizer2, getplantypeIconCompatParcelizer);
        }
        if (getvideopagenotestitle instanceof CourseConfigV2SettingsItems) {
            CourseConfigV2SettingsItems courseConfigV2SettingsItems = (CourseConfigV2SettingsItems) getvideopagenotestitle;
            CourseConfigV2SettingsItems courseConfigV2SettingsItems2 = (CourseConfigV2SettingsItems) getvideopagenotestitle2;
            if (!read((getAllSettings) courseConfigV2SettingsItems.onPlayFromSearch(), (getAllSettings) courseConfigV2SettingsItems2.onPlayFromSearch())) {
                return false;
            }
            if (!courseConfigV2SettingsItems.onRewind() || !courseConfigV2SettingsItems2.onRewind()) {
                return (courseConfigV2SettingsItems.onRewind() || !courseConfigV2SettingsItems2.onRewind()) && RemoteActionCompatParcelizer(getvideopagenotestitle, getlinkAudioAttributesImplBaseParcelizer, getvideopagenotestitle2, getlinkAudioAttributesImplBaseParcelizer2, getplantypeIconCompatParcelizer);
            }
            getPearlType getpearltype = getPearlType.IconCompatParcelizer;
            return getPearlType.AudioAttributesCompatParcelizer(getplantypeIconCompatParcelizer, getlinkAudioAttributesImplBaseParcelizer.MediaBrowserCompatMediaItem(), getlinkAudioAttributesImplBaseParcelizer2.MediaBrowserCompatMediaItem());
        }
        StringBuilder sb = new StringBuilder("Unexpected callable: ");
        sb.append(getvideopagenotestitle.getClass());
        throw new IllegalArgumentException(sb.toString());
    }

    private static boolean read(getSubText getsubtext, getSubText getsubtext2) {
        if (getsubtext == null) {
            write(69);
        }
        if (getsubtext2 == null) {
            write(70);
        }
        Integer numIconCompatParcelizer = CourseConfigV2NavDrawerItemFaq.IconCompatParcelizer(getsubtext.onCustomAction(), getsubtext2.onCustomAction());
        return numIconCompatParcelizer == null || numIconCompatParcelizer.intValue() >= 0;
    }

    private static boolean read(getAllSettings getallsettings, getAllSettings getallsettings2) {
        if (getallsettings == null || getallsettings2 == null) {
            return true;
        }
        return read((getSubText) getallsettings, (getSubText) getallsettings2);
    }

    private static boolean RemoteActionCompatParcelizer(getVideoPageNotesTitle getvideopagenotestitle, Collection<getVideoPageNotesTitle> collection) {
        if (getvideopagenotestitle == null) {
            write(71);
        }
        if (collection == null) {
            write(72);
        }
        Iterator<getVideoPageNotesTitle> it = collection.iterator();
        while (it.hasNext()) {
            if (!RemoteActionCompatParcelizer(getvideopagenotestitle, it.next())) {
                return false;
            }
        }
        return true;
    }

    private static boolean RemoteActionCompatParcelizer(getVideoPageNotesTitle getvideopagenotestitle, getLink getlink, getVideoPageNotesTitle getvideopagenotestitle2, getLink getlink2, getPlanType getplantype) {
        if (getvideopagenotestitle == null) {
            write(73);
        }
        if (getlink == null) {
            write(74);
        }
        if (getvideopagenotestitle2 == null) {
            write(75);
        }
        if (getlink2 == null) {
            write(76);
        }
        if (getplantype == null) {
            write(77);
        }
        return getPearlType.IconCompatParcelizer.IconCompatParcelizer(getplantype, getlink.MediaBrowserCompatMediaItem(), getlink2.MediaBrowserCompatMediaItem());
    }

    public static <H> H IconCompatParcelizer(Collection<H> collection, getAnswerMap<H, getVideoPageNotesTitle> getanswermap) {
        H h;
        if (collection == null) {
            write(78);
        }
        if (getanswermap == null) {
            write(79);
        }
        if (collection.size() == 1) {
            H h2 = (H) IntermediateLoginResponseBody.RatingCompat(collection);
            if (h2 == null) {
                write(80);
            }
            return h2;
        }
        ArrayList arrayList = new ArrayList(2);
        List listWrite = IntermediateLoginResponseBody.write((Iterable) collection, (getAnswerMap) getanswermap);
        H h3 = (H) IntermediateLoginResponseBody.RatingCompat(collection);
        getVideoPageNotesTitle getvideopagenotestitleInvoke = getanswermap.invoke(h3);
        for (H h4 : collection) {
            getVideoPageNotesTitle getvideopagenotestitleInvoke2 = getanswermap.invoke(h4);
            if (RemoteActionCompatParcelizer(getvideopagenotestitleInvoke2, listWrite)) {
                arrayList.add(h4);
            }
            if (RemoteActionCompatParcelizer(getvideopagenotestitleInvoke2, getvideopagenotestitleInvoke) && !RemoteActionCompatParcelizer(getvideopagenotestitleInvoke, getvideopagenotestitleInvoke2)) {
                h3 = h4;
            }
        }
        if (arrayList.isEmpty()) {
            if (h3 == null) {
                write(81);
            }
            return h3;
        }
        if (arrayList.size() == 1) {
            H h5 = (H) IntermediateLoginResponseBody.RatingCompat((Iterable) arrayList);
            if (h5 == null) {
                write(82);
            }
            return h5;
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                h = null;
                break;
            }
            h = (H) it.next();
            if (!PearlSubjectInfo.AudioAttributesCompatParcelizer(getanswermap.invoke(h).AudioAttributesImplBaseParcelizer())) {
                break;
            }
        }
        if (h != null) {
            if (h == null) {
                write(83);
            }
            return h;
        }
        H h6 = (H) IntermediateLoginResponseBody.RatingCompat((Iterable) arrayList);
        if (h6 == null) {
            write(84);
        }
        return h6;
    }

    private static void IconCompatParcelizer(Collection<getTestHeaderTitle> collection, CourseConfigV2CustomModuleQuestionSource courseConfigV2CustomModuleQuestionSource, getOption4 getoption4) {
        if (collection == null) {
            write(85);
        }
        if (courseConfigV2CustomModuleQuestionSource == null) {
            write(86);
        }
        if (getoption4 == null) {
            write(87);
        }
        Collection<getTestHeaderTitle> collection2 = read(courseConfigV2CustomModuleQuestionSource, collection);
        boolean zIsEmpty = collection2.isEmpty();
        if (!zIsEmpty) {
            collection = collection2;
        }
        getTestHeaderTitle gettestheadertitleWrite = ((getTestHeaderTitle) IconCompatParcelizer(collection, new getAnswerMap<getTestHeaderTitle, getVideoPageNotesTitle>() { // from class: o.getOptions.1
            private static getTestHeaderTitle AudioAttributesCompatParcelizer(getTestHeaderTitle gettestheadertitle) {
                return gettestheadertitle;
            }

            @Override // kotlin.getAnswerMap
            public final /* synthetic */ getVideoPageNotesTitle invoke(getTestHeaderTitle gettestheadertitle) {
                return AudioAttributesCompatParcelizer(gettestheadertitle);
            }
        })).write(courseConfigV2CustomModuleQuestionSource, write(collection, courseConfigV2CustomModuleQuestionSource), zIsEmpty ? CourseConfigV2NavDrawerItemFaq.MediaBrowserCompatItemReceiver : CourseConfigV2NavDrawerItemFaq.RemoteActionCompatParcelizer, getTestHeaderTitle.RemoteActionCompatParcelizer.FAKE_OVERRIDE);
        getoption4.AudioAttributesCompatParcelizer(gettestheadertitleWrite, collection);
        getoption4.AudioAttributesCompatParcelizer(gettestheadertitleWrite);
    }

    /* JADX INFO: renamed from: o.getOptions$10, reason: invalid class name */
    static /* synthetic */ class AnonymousClass10 {
        static final /* synthetic */ int[] IconCompatParcelizer;
        static final /* synthetic */ int[] RemoteActionCompatParcelizer;
        static final /* synthetic */ int[] read;

        static {
            int[] iArr = new int[CourseConfigV2NavDrawerItems.values().length];
            RemoteActionCompatParcelizer = iArr;
            try {
                iArr[CourseConfigV2NavDrawerItems.FINAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                RemoteActionCompatParcelizer[CourseConfigV2NavDrawerItems.SEALED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                RemoteActionCompatParcelizer[CourseConfigV2NavDrawerItems.OPEN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                RemoteActionCompatParcelizer[CourseConfigV2NavDrawerItems.ABSTRACT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[RemoteActionCompatParcelizer.IconCompatParcelizer.values().length];
            IconCompatParcelizer = iArr2;
            try {
                iArr2[RemoteActionCompatParcelizer.IconCompatParcelizer.OVERRIDABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                IconCompatParcelizer[RemoteActionCompatParcelizer.IconCompatParcelizer.CONFLICT.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                IconCompatParcelizer[RemoteActionCompatParcelizer.IconCompatParcelizer.INCOMPATIBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr3 = new int[ExternalOverridabilityCondition.read.values().length];
            read = iArr3;
            try {
                iArr3[ExternalOverridabilityCondition.read.OVERRIDABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                read[ExternalOverridabilityCondition.read.CONFLICT.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                read[ExternalOverridabilityCondition.read.INCOMPATIBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                read[ExternalOverridabilityCondition.read.UNKNOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    private static CourseConfigV2NavDrawerItems write(Collection<getTestHeaderTitle> collection, CourseConfigV2CustomModuleQuestionSource courseConfigV2CustomModuleQuestionSource) {
        if (collection == null) {
            write(88);
        }
        if (courseConfigV2CustomModuleQuestionSource == null) {
            write(89);
        }
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        for (getTestHeaderTitle gettestheadertitle : collection) {
            int i = AnonymousClass10.RemoteActionCompatParcelizer[gettestheadertitle.MediaBrowserCompatMediaItem().ordinal()];
            if (i == 1) {
                CourseConfigV2NavDrawerItems courseConfigV2NavDrawerItems = CourseConfigV2NavDrawerItems.FINAL;
                if (courseConfigV2NavDrawerItems == null) {
                    write(90);
                }
                return courseConfigV2NavDrawerItems;
            }
            if (i == 2) {
                throw new IllegalStateException("Member cannot have SEALED modality: ".concat(String.valueOf(gettestheadertitle)));
            }
            if (i == 3) {
                z3 = true;
            } else if (i == 4) {
                z2 = true;
            }
        }
        if (courseConfigV2CustomModuleQuestionSource.onPause() && courseConfigV2CustomModuleQuestionSource.MediaBrowserCompatMediaItem() != CourseConfigV2NavDrawerItems.ABSTRACT && courseConfigV2CustomModuleQuestionSource.MediaBrowserCompatMediaItem() != CourseConfigV2NavDrawerItems.SEALED) {
            z = true;
        }
        if (z3 && !z2) {
            CourseConfigV2NavDrawerItems courseConfigV2NavDrawerItems2 = CourseConfigV2NavDrawerItems.OPEN;
            if (courseConfigV2NavDrawerItems2 == null) {
                write(91);
            }
            return courseConfigV2NavDrawerItems2;
        }
        if (!z3 && z2) {
            CourseConfigV2NavDrawerItems courseConfigV2NavDrawerItemsMediaBrowserCompatMediaItem = z ? courseConfigV2CustomModuleQuestionSource.MediaBrowserCompatMediaItem() : CourseConfigV2NavDrawerItems.ABSTRACT;
            if (courseConfigV2NavDrawerItemsMediaBrowserCompatMediaItem == null) {
                write(92);
            }
            return courseConfigV2NavDrawerItemsMediaBrowserCompatMediaItem;
        }
        HashSet hashSet = new HashSet();
        Iterator<getTestHeaderTitle> it = collection.iterator();
        while (it.hasNext()) {
            hashSet.addAll(IconCompatParcelizer(it.next()));
        }
        return AudioAttributesCompatParcelizer(RemoteActionCompatParcelizer((Set) hashSet), z, courseConfigV2CustomModuleQuestionSource.MediaBrowserCompatMediaItem());
    }

    private static CourseConfigV2NavDrawerItems AudioAttributesCompatParcelizer(Collection<getTestHeaderTitle> collection, boolean z, CourseConfigV2NavDrawerItems courseConfigV2NavDrawerItems) {
        if (collection == null) {
            write(93);
        }
        if (courseConfigV2NavDrawerItems == null) {
            write(94);
        }
        CourseConfigV2NavDrawerItems courseConfigV2NavDrawerItems2 = CourseConfigV2NavDrawerItems.ABSTRACT;
        for (getTestHeaderTitle gettestheadertitle : collection) {
            CourseConfigV2NavDrawerItems courseConfigV2NavDrawerItemsMediaBrowserCompatMediaItem = (z && gettestheadertitle.MediaBrowserCompatMediaItem() == CourseConfigV2NavDrawerItems.ABSTRACT) ? courseConfigV2NavDrawerItems : gettestheadertitle.MediaBrowserCompatMediaItem();
            if (courseConfigV2NavDrawerItemsMediaBrowserCompatMediaItem.compareTo(courseConfigV2NavDrawerItems2) < 0) {
                courseConfigV2NavDrawerItems2 = courseConfigV2NavDrawerItemsMediaBrowserCompatMediaItem;
            }
        }
        if (courseConfigV2NavDrawerItems2 == null) {
            write(95);
        }
        return courseConfigV2NavDrawerItems2;
    }

    private static Collection<getTestHeaderTitle> read(final CourseConfigV2CustomModuleQuestionSource courseConfigV2CustomModuleQuestionSource, Collection<getTestHeaderTitle> collection) {
        if (courseConfigV2CustomModuleQuestionSource == null) {
            write(96);
        }
        if (collection == null) {
            write(97);
        }
        return IntermediateLoginResponseBody.read((Iterable) collection, (getAnswerMap) new getAnswerMap<getTestHeaderTitle, Boolean>() { // from class: o.getOptions.4
            /* JADX INFO: Access modifiers changed from: private */
            @Override // kotlin.getAnswerMap
            /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
            public Boolean invoke(getTestHeaderTitle gettestheadertitle) {
                boolean z = false;
                if (!CourseConfigV2NavDrawerItemFaq.write(gettestheadertitle.onCustomAction()) && CourseConfigV2NavDrawerItemFaq.AudioAttributesCompatParcelizer(gettestheadertitle, courseConfigV2CustomModuleQuestionSource, false)) {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
        });
    }

    public static <H> Collection<H> AudioAttributesCompatParcelizer(H h, Collection<H> collection, getAnswerMap<H, getVideoPageNotesTitle> getanswermap, getAnswerMap<H, getShowPopup> getanswermap2) {
        if (h == null) {
            write(99);
        }
        if (collection == null) {
            write(100);
        }
        if (getanswermap == null) {
            write(101);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(h);
        getVideoPageNotesTitle getvideopagenotestitleInvoke = getanswermap.invoke(h);
        Iterator<H> it = collection.iterator();
        while (it.hasNext()) {
            H next = it.next();
            getVideoPageNotesTitle getvideopagenotestitleInvoke2 = getanswermap.invoke(next);
            if (h == next) {
                it.remove();
            } else {
                RemoteActionCompatParcelizer.IconCompatParcelizer iconCompatParcelizer = read(getvideopagenotestitleInvoke, getvideopagenotestitleInvoke2);
                if (iconCompatParcelizer == RemoteActionCompatParcelizer.IconCompatParcelizer.OVERRIDABLE) {
                    arrayList.add(next);
                    it.remove();
                } else if (iconCompatParcelizer == RemoteActionCompatParcelizer.IconCompatParcelizer.CONFLICT) {
                    getanswermap2.invoke(next);
                    it.remove();
                }
            }
        }
        return arrayList;
    }

    public static RemoteActionCompatParcelizer.IconCompatParcelizer read(getVideoPageNotesTitle getvideopagenotestitle, getVideoPageNotesTitle getvideopagenotestitle2) {
        getOptions getoptions = RemoteActionCompatParcelizer;
        RemoteActionCompatParcelizer.IconCompatParcelizer IconCompatParcelizer = getoptions.AudioAttributesCompatParcelizer(getvideopagenotestitle2, getvideopagenotestitle, (CourseConfigV2CustomModuleQuestionSource) null).IconCompatParcelizer();
        RemoteActionCompatParcelizer.IconCompatParcelizer IconCompatParcelizer2 = getoptions.AudioAttributesCompatParcelizer(getvideopagenotestitle, getvideopagenotestitle2, (CourseConfigV2CustomModuleQuestionSource) null).IconCompatParcelizer();
        return (IconCompatParcelizer == RemoteActionCompatParcelizer.IconCompatParcelizer.OVERRIDABLE && IconCompatParcelizer2 == RemoteActionCompatParcelizer.IconCompatParcelizer.OVERRIDABLE) ? RemoteActionCompatParcelizer.IconCompatParcelizer.OVERRIDABLE : (IconCompatParcelizer == RemoteActionCompatParcelizer.IconCompatParcelizer.CONFLICT || IconCompatParcelizer2 == RemoteActionCompatParcelizer.IconCompatParcelizer.CONFLICT) ? RemoteActionCompatParcelizer.IconCompatParcelizer.CONFLICT : RemoteActionCompatParcelizer.IconCompatParcelizer.INCOMPATIBLE;
    }

    private static Collection<getTestHeaderTitle> read(final getTestHeaderTitle gettestheadertitle, Queue<getTestHeaderTitle> queue, final getOption4 getoption4) {
        if (gettestheadertitle == null) {
            write(104);
        }
        if (getoption4 == null) {
            write(106);
        }
        return AudioAttributesCompatParcelizer(gettestheadertitle, queue, new getAnswerMap<getTestHeaderTitle, getVideoPageNotesTitle>() { // from class: o.getOptions.6
            private static getVideoPageNotesTitle read(getTestHeaderTitle gettestheadertitle2) {
                return gettestheadertitle2;
            }

            @Override // kotlin.getAnswerMap
            public final /* synthetic */ getVideoPageNotesTitle invoke(getTestHeaderTitle gettestheadertitle2) {
                return read(gettestheadertitle2);
            }
        }, new getAnswerMap<getTestHeaderTitle, getShowPopup>() { // from class: o.getOptions.7
            /* JADX INFO: Access modifiers changed from: private */
            @Override // kotlin.getAnswerMap
            /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
            public getShowPopup invoke(getTestHeaderTitle gettestheadertitle2) {
                getoption4.write(gettestheadertitle, gettestheadertitle2);
                return getShowPopup.INSTANCE;
            }
        });
    }

    public static void RemoteActionCompatParcelizer(getTestHeaderTitle gettestheadertitle, getAnswerMap<getTestHeaderTitle, getShowPopup> getanswermap) {
        CourseConfigV2NavDrawerItemFreeExtension courseConfigV2NavDrawerItemFreeExtension;
        if (gettestheadertitle == null) {
            write(107);
        }
        for (getTestHeaderTitle gettestheadertitle2 : gettestheadertitle.AudioAttributesImplApi26Parcelizer()) {
            if (gettestheadertitle2.onCustomAction() == CourseConfigV2NavDrawerItemFaq.RemoteActionCompatParcelizer) {
                RemoteActionCompatParcelizer(gettestheadertitle2, getanswermap);
            }
        }
        if (gettestheadertitle.onCustomAction() == CourseConfigV2NavDrawerItemFaq.RemoteActionCompatParcelizer) {
            CourseConfigV2NavDrawerItemFreeExtension courseConfigV2NavDrawerItemFreeExtension2 = read(gettestheadertitle);
            if (courseConfigV2NavDrawerItemFreeExtension2 == null) {
                if (getanswermap != null) {
                    getanswermap.invoke(gettestheadertitle);
                }
                courseConfigV2NavDrawerItemFreeExtension = CourseConfigV2NavDrawerItemFaq.MediaBrowserCompatMediaItem;
            } else {
                courseConfigV2NavDrawerItemFreeExtension = courseConfigV2NavDrawerItemFreeExtension2;
            }
            if (gettestheadertitle instanceof getRootSubjectId) {
                ((getRootSubjectId) gettestheadertitle).IconCompatParcelizer(courseConfigV2NavDrawerItemFreeExtension);
                Iterator<getAllSettings> it = ((CourseConfigV2SettingsItems) gettestheadertitle).IconCompatParcelizer().iterator();
                while (it.hasNext()) {
                    RemoteActionCompatParcelizer(it.next(), courseConfigV2NavDrawerItemFreeExtension2 == null ? null : getanswermap);
                }
                return;
            }
            if (gettestheadertitle instanceof getIntegerMap) {
                ((getIntegerMap) gettestheadertitle).RemoteActionCompatParcelizer(courseConfigV2NavDrawerItemFreeExtension);
                return;
            }
            getExamName getexamname = (getExamName) gettestheadertitle;
            getexamname.IconCompatParcelizer(courseConfigV2NavDrawerItemFreeExtension);
            if (courseConfigV2NavDrawerItemFreeExtension != getexamname.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver().onCustomAction()) {
                getexamname.onPlayFromMediaId();
            }
        }
    }

    private static CourseConfigV2NavDrawerItemFreeExtension read(getTestHeaderTitle gettestheadertitle) {
        if (gettestheadertitle == null) {
            write(108);
        }
        Collection<? extends getTestHeaderTitle> collectionAudioAttributesImplApi26Parcelizer = gettestheadertitle.AudioAttributesImplApi26Parcelizer();
        CourseConfigV2NavDrawerItemFreeExtension courseConfigV2NavDrawerItemFreeExtensionRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(collectionAudioAttributesImplApi26Parcelizer);
        if (courseConfigV2NavDrawerItemFreeExtensionRemoteActionCompatParcelizer == null) {
            return null;
        }
        if (gettestheadertitle.handleMediaPlayPauseIfPendingOnHandler() == getTestHeaderTitle.RemoteActionCompatParcelizer.FAKE_OVERRIDE) {
            for (getTestHeaderTitle gettestheadertitle2 : collectionAudioAttributesImplApi26Parcelizer) {
                if (gettestheadertitle2.MediaBrowserCompatMediaItem() != CourseConfigV2NavDrawerItems.ABSTRACT && !gettestheadertitle2.onCustomAction().equals(courseConfigV2NavDrawerItemFreeExtensionRemoteActionCompatParcelizer)) {
                    return null;
                }
            }
            return courseConfigV2NavDrawerItemFreeExtensionRemoteActionCompatParcelizer;
        }
        return courseConfigV2NavDrawerItemFreeExtensionRemoteActionCompatParcelizer.IconCompatParcelizer();
    }

    private static CourseConfigV2NavDrawerItemFreeExtension RemoteActionCompatParcelizer(Collection<? extends getTestHeaderTitle> collection) {
        CourseConfigV2NavDrawerItemFreeExtension courseConfigV2NavDrawerItemFreeExtension;
        if (collection == null) {
            write(109);
        }
        if (collection.isEmpty()) {
            return CourseConfigV2NavDrawerItemFaq.write;
        }
        Iterator<? extends getTestHeaderTitle> it = collection.iterator();
        loop0: while (true) {
            courseConfigV2NavDrawerItemFreeExtension = null;
            while (it.hasNext()) {
                CourseConfigV2NavDrawerItemFreeExtension courseConfigV2NavDrawerItemFreeExtensionOnCustomAction = it.next().onCustomAction();
                if (courseConfigV2NavDrawerItemFreeExtension != null) {
                    Integer numIconCompatParcelizer = CourseConfigV2NavDrawerItemFaq.IconCompatParcelizer(courseConfigV2NavDrawerItemFreeExtensionOnCustomAction, courseConfigV2NavDrawerItemFreeExtension);
                    if (numIconCompatParcelizer != null) {
                        if (numIconCompatParcelizer.intValue() > 0) {
                        }
                    }
                }
                courseConfigV2NavDrawerItemFreeExtension = courseConfigV2NavDrawerItemFreeExtensionOnCustomAction;
            }
        }
        if (courseConfigV2NavDrawerItemFreeExtension == null) {
            return null;
        }
        Iterator<? extends getTestHeaderTitle> it2 = collection.iterator();
        while (it2.hasNext()) {
            Integer numIconCompatParcelizer2 = CourseConfigV2NavDrawerItemFaq.IconCompatParcelizer(courseConfigV2NavDrawerItemFreeExtension, it2.next().onCustomAction());
            if (numIconCompatParcelizer2 == null || numIconCompatParcelizer2.intValue() < 0) {
                return null;
            }
        }
        return courseConfigV2NavDrawerItemFreeExtension;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0035 A[FALL_THROUGH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ void write(int r24) {
        /*
            Method dump skipped, instruction units count: 1322
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getOptions.write(int):void");
    }

    public static class RemoteActionCompatParcelizer {
        private static final RemoteActionCompatParcelizer IconCompatParcelizer = new RemoteActionCompatParcelizer(IconCompatParcelizer.OVERRIDABLE, "SUCCESS");
        private final String AudioAttributesCompatParcelizer;
        private final IconCompatParcelizer read;

        public enum IconCompatParcelizer {
            OVERRIDABLE,
            INCOMPATIBLE,
            CONFLICT
        }

        public static RemoteActionCompatParcelizer write() {
            RemoteActionCompatParcelizer remoteActionCompatParcelizer = IconCompatParcelizer;
            if (remoteActionCompatParcelizer == null) {
                IconCompatParcelizer(0);
            }
            return remoteActionCompatParcelizer;
        }

        public static RemoteActionCompatParcelizer read(String str) {
            return new RemoteActionCompatParcelizer(IconCompatParcelizer.INCOMPATIBLE, str);
        }

        public static RemoteActionCompatParcelizer write(String str) {
            return new RemoteActionCompatParcelizer(IconCompatParcelizer.CONFLICT, str);
        }

        private RemoteActionCompatParcelizer(IconCompatParcelizer iconCompatParcelizer, String str) {
            if (iconCompatParcelizer == null) {
                IconCompatParcelizer(3);
            }
            if (str == null) {
                IconCompatParcelizer(4);
            }
            this.read = iconCompatParcelizer;
            this.AudioAttributesCompatParcelizer = str;
        }

        public final IconCompatParcelizer IconCompatParcelizer() {
            IconCompatParcelizer iconCompatParcelizer = this.read;
            if (iconCompatParcelizer == null) {
                IconCompatParcelizer(5);
            }
            return iconCompatParcelizer;
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0031  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static /* synthetic */ void IconCompatParcelizer(int r10) {
            /*
                r0 = 4
                r1 = 3
                r2 = 2
                r3 = 1
                if (r10 == r3) goto Lf
                if (r10 == r2) goto Lf
                if (r10 == r1) goto Lf
                if (r10 == r0) goto Lf
                java.lang.String r4 = "@NotNull method %s.%s must not return null"
                goto L11
            Lf:
                java.lang.String r4 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
            L11:
                if (r10 == r3) goto L1b
                if (r10 == r2) goto L1b
                if (r10 == r1) goto L1b
                if (r10 == r0) goto L1b
                r5 = r2
                goto L1c
            L1b:
                r5 = r1
            L1c:
                java.lang.Object[] r5 = new java.lang.Object[r5]
                java.lang.String r6 = "success"
                java.lang.String r7 = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil$OverrideCompatibilityInfo"
                r8 = 0
                if (r10 == r3) goto L31
                if (r10 == r2) goto L31
                if (r10 == r1) goto L2e
                if (r10 == r0) goto L31
                r5[r8] = r7
                goto L35
            L2e:
                r5[r8] = r6
                goto L35
            L31:
                java.lang.String r9 = "debugMessage"
                r5[r8] = r9
            L35:
                switch(r10) {
                    case 1: goto L45;
                    case 2: goto L45;
                    case 3: goto L45;
                    case 4: goto L45;
                    case 5: goto L40;
                    case 6: goto L3b;
                    default: goto L38;
                }
            L38:
                r5[r3] = r6
                goto L47
            L3b:
                java.lang.String r6 = "getDebugMessage"
                r5[r3] = r6
                goto L47
            L40:
                java.lang.String r6 = "getResult"
                r5[r3] = r6
                goto L47
            L45:
                r5[r3] = r7
            L47:
                if (r10 == r3) goto L59
                if (r10 == r2) goto L54
                if (r10 == r1) goto L4f
                if (r10 != r0) goto L5d
            L4f:
                java.lang.String r6 = "<init>"
                r5[r2] = r6
                goto L5d
            L54:
                java.lang.String r6 = "conflict"
                r5[r2] = r6
                goto L5d
            L59:
                java.lang.String r6 = "incompatible"
                r5[r2] = r6
            L5d:
                java.lang.String r4 = java.lang.String.format(r4, r5)
                if (r10 == r3) goto L6f
                if (r10 == r2) goto L6f
                if (r10 == r1) goto L6f
                if (r10 == r0) goto L6f
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                r10.<init>(r4)
                goto L74
            L6f:
                java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
                r10.<init>(r4)
            L74:
                throw r10
            */
            throw new UnsupportedOperationException("Method not decompiled: o.getOptions.RemoteActionCompatParcelizer.IconCompatParcelizer(int):void");
        }
    }
}
