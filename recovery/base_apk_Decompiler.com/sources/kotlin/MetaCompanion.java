package kotlin;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.NotesSubscriptionResponse;
import kotlin.getMinPrice;
import kotlin.setTags;

/* JADX INFO: loaded from: classes4.dex */
public final class MetaCompanion {
    private static RemoteActionCompatParcelizer read = new RemoteActionCompatParcelizer(0);
    private final getMinPrice RemoteActionCompatParcelizer;
    private final boolean write;

    public MetaCompanion(getMinPrice getminprice) {
        toMagicModuleMetaRepoModel.write(getminprice, "");
        this.RemoteActionCompatParcelizer = getminprice;
        this.write = false;
    }

    public final getHref RemoteActionCompatParcelizer(NotesSubscriptionResponse notesSubscriptionResponse, getGroupDescription getgroupdescription) {
        toMagicModuleMetaRepoModel.write(notesSubscriptionResponse, "");
        toMagicModuleMetaRepoModel.write(getgroupdescription, "");
        return read(notesSubscriptionResponse, getgroupdescription, false, 0, true);
    }

    private final getHref read(NotesSubscriptionResponse notesSubscriptionResponse, getGroupDescription getgroupdescription, boolean z, int i, boolean z2) {
        setDefault setdefault = read(new isIndividualPlan(getTotalSubject.INVARIANT, notesSubscriptionResponse.read().AudioAttributesImplBaseParcelizer()), notesSubscriptionResponse, null, i);
        getLink getlinkAudioAttributesCompatParcelizer = setdefault.AudioAttributesCompatParcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getlinkAudioAttributesCompatParcelizer, "");
        getHref gethrefWrite = setMinPrice.write(getlinkAudioAttributesCompatParcelizer);
        if (Copy.write(gethrefWrite)) {
            return gethrefWrite;
        }
        setdefault.read();
        getTotalSubject gettotalsubject = getTotalSubject.INVARIANT;
        RemoteActionCompatParcelizer(gethrefWrite.RemoteActionCompatParcelizer(), setPearlDisplayId.write(getgroupdescription));
        getHref gethref = setPlanAddOns.read(RemoteActionCompatParcelizer(gethrefWrite, getgroupdescription), z);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(gethref, "");
        return z2 ? Meta.IconCompatParcelizer(gethref, write(notesSubscriptionResponse, getgroupdescription, z)) : gethref;
    }

    private static getHref write(NotesSubscriptionResponse notesSubscriptionResponse, getGroupDescription getgroupdescription, boolean z) {
        getPlanAddOns getplanaddonsMediaBrowserCompatSearchResultReceiver = notesSubscriptionResponse.read().MediaBrowserCompatSearchResultReceiver();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getplanaddonsMediaBrowserCompatSearchResultReceiver, "");
        return AddOnMetaKt.RemoteActionCompatParcelizer(getgroupdescription, getplanaddonsMediaBrowserCompatSearchResultReceiver, notesSubscriptionResponse.RemoteActionCompatParcelizer(), z, setTags.write.RemoteActionCompatParcelizer);
    }

    private final setDefault read(setDefault setdefault, NotesSubscriptionResponse notesSubscriptionResponse, getBadgeText getbadgetext, int i) {
        getTotalSubject gettotalsubjectMediaBrowserCompatMediaItem;
        getHref gethrefWrite;
        RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(i, notesSubscriptionResponse.read());
        if (setdefault.write()) {
            toMagicModuleMetaRepoModel.write(getbadgetext);
            setDefault setdefaultWrite = setPlanAddOns.write(getbadgetext);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(setdefaultWrite, "");
            return setdefaultWrite;
        }
        getLink getlinkAudioAttributesCompatParcelizer = setdefault.AudioAttributesCompatParcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getlinkAudioAttributesCompatParcelizer, "");
        setDefault setdefaultAudioAttributesCompatParcelizer = notesSubscriptionResponse.AudioAttributesCompatParcelizer(getlinkAudioAttributesCompatParcelizer.AudioAttributesImplApi21Parcelizer());
        if (setdefaultAudioAttributesCompatParcelizer == null) {
            return AudioAttributesCompatParcelizer(setdefault, notesSubscriptionResponse, i);
        }
        if (setdefaultAudioAttributesCompatParcelizer.write()) {
            toMagicModuleMetaRepoModel.write(getbadgetext);
            setDefault setdefaultWrite2 = setPlanAddOns.write(getbadgetext);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(setdefaultWrite2, "");
            return setdefaultWrite2;
        }
        PlanAddOnsCompanion planAddOnsCompanionMediaBrowserCompatMediaItem = setdefaultAudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer().MediaBrowserCompatMediaItem();
        getTotalSubject gettotalsubject = setdefaultAudioAttributesCompatParcelizer.read();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(gettotalsubject, "");
        getTotalSubject gettotalsubject2 = setdefault.read();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(gettotalsubject2, "");
        if (gettotalsubject2 != gettotalsubject && gettotalsubject2 != getTotalSubject.INVARIANT) {
            if (gettotalsubject != getTotalSubject.INVARIANT) {
                this.RemoteActionCompatParcelizer.write(notesSubscriptionResponse.read(), planAddOnsCompanionMediaBrowserCompatMediaItem);
            } else {
                gettotalsubject = gettotalsubject2;
            }
        }
        if (getbadgetext == null || (gettotalsubjectMediaBrowserCompatMediaItem = getbadgetext.MediaBrowserCompatMediaItem()) == null) {
            gettotalsubjectMediaBrowserCompatMediaItem = getTotalSubject.INVARIANT;
        }
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(gettotalsubjectMediaBrowserCompatMediaItem, "");
        if (gettotalsubjectMediaBrowserCompatMediaItem != gettotalsubject && gettotalsubjectMediaBrowserCompatMediaItem != getTotalSubject.INVARIANT) {
            if (gettotalsubject == getTotalSubject.INVARIANT) {
                gettotalsubject = getTotalSubject.INVARIANT;
            } else {
                this.RemoteActionCompatParcelizer.write(notesSubscriptionResponse.read(), planAddOnsCompanionMediaBrowserCompatMediaItem);
            }
        }
        RemoteActionCompatParcelizer(getlinkAudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(), planAddOnsCompanionMediaBrowserCompatMediaItem.RemoteActionCompatParcelizer());
        if (planAddOnsCompanionMediaBrowserCompatMediaItem instanceof getPearId) {
            gethrefWrite = IconCompatParcelizer((getPearId) planAddOnsCompanionMediaBrowserCompatMediaItem, getlinkAudioAttributesCompatParcelizer.bc_());
        } else {
            gethrefWrite = write(setMinPrice.write(planAddOnsCompanionMediaBrowserCompatMediaItem), getlinkAudioAttributesCompatParcelizer);
        }
        return new isIndividualPlan(gettotalsubject, gethrefWrite);
    }

    private static getPearId IconCompatParcelizer(getPearId getpearid, getGroupDescription getgroupdescription) {
        return getpearid.AudioAttributesCompatParcelizer(read(getpearid, getgroupdescription));
    }

    private static getHref RemoteActionCompatParcelizer(getHref gethref, getGroupDescription getgroupdescription) {
        getHref gethref2 = gethref;
        return Copy.write(gethref2) ? gethref : setMinPrice.AudioAttributesCompatParcelizer(gethref, null, read(gethref2, getgroupdescription), 1);
    }

    private static getGroupDescription read(getLink getlink, getGroupDescription getgroupdescription) {
        return Copy.write(getlink) ? getlink.bc_() : getgroupdescription.IconCompatParcelizer(getlink.bc_());
    }

    private final void RemoteActionCompatParcelizer(getQuote getquote, getQuote getquote2) {
        HashSet hashSet = new HashSet();
        Iterator<dummyEditor> it = getquote.iterator();
        while (it.hasNext()) {
            hashSet.add(it.next().write());
        }
        HashSet hashSet2 = hashSet;
        for (dummyEditor dummyeditor : getquote2) {
            if (hashSet2.contains(dummyeditor.write())) {
                this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(dummyeditor);
            }
        }
    }

    private static getHref IconCompatParcelizer(getHref gethref, getLink getlink) {
        getHref gethref2 = setPlanAddOns.read(gethref, getlink.ba_());
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(gethref2, "");
        return gethref2;
    }

    private final getHref write(getHref gethref, getLink getlink) {
        return RemoteActionCompatParcelizer(IconCompatParcelizer(gethref, getlink), getlink.bc_());
    }

    private final setDefault AudioAttributesCompatParcelizer(setDefault setdefault, NotesSubscriptionResponse notesSubscriptionResponse, int i) {
        PlanAddOnsCompanion planAddOnsCompanionMediaBrowserCompatMediaItem = setdefault.AudioAttributesCompatParcelizer().MediaBrowserCompatMediaItem();
        if (!getKeySubjectIds.AudioAttributesCompatParcelizer(planAddOnsCompanionMediaBrowserCompatMediaItem)) {
            getHref gethrefWrite = setMinPrice.write(planAddOnsCompanionMediaBrowserCompatMediaItem);
            getHref gethref = gethrefWrite;
            if (!Copy.write(gethref) && getSearchTimes.RatingCompat(gethref)) {
                getPlanAddOns getplanaddonsAudioAttributesImplApi21Parcelizer = gethrefWrite.AudioAttributesImplApi21Parcelizer();
                getQuestionLimit getquestionlimitRemoteActionCompatParcelizer = getplanaddonsAudioAttributesImplApi21Parcelizer.RemoteActionCompatParcelizer();
                getplanaddonsAudioAttributesImplApi21Parcelizer.AudioAttributesCompatParcelizer().size();
                gethrefWrite.bb_().size();
                if (!(getquestionlimitRemoteActionCompatParcelizer instanceof getBadgeText)) {
                    if (getquestionlimitRemoteActionCompatParcelizer instanceof CourseConfigV2VideoProperties) {
                        CourseConfigV2VideoProperties courseConfigV2VideoProperties = (CourseConfigV2VideoProperties) getquestionlimitRemoteActionCompatParcelizer;
                        if (notesSubscriptionResponse.RemoteActionCompatParcelizer(courseConfigV2VideoProperties)) {
                            this.RemoteActionCompatParcelizer.read(courseConfigV2VideoProperties);
                            getTotalSubject gettotalsubject = getTotalSubject.INVARIANT;
                            setAccessLevel setaccesslevel = setAccessLevel.RECURSIVE_TYPE_ALIAS;
                            String string = courseConfigV2VideoProperties.aQ_().toString();
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
                            return new isIndividualPlan(gettotalsubject, SubscriptionType.read(setaccesslevel, string));
                        }
                        List<setDefault> listBb_ = gethrefWrite.bb_();
                        ArrayList arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) listBb_, 10));
                        int i2 = 0;
                        for (Object obj : listBb_) {
                            if (i2 < 0) {
                                IntermediateLoginResponseBody.read();
                            }
                            arrayList.add(read((setDefault) obj, notesSubscriptionResponse, getplanaddonsAudioAttributesImplApi21Parcelizer.AudioAttributesCompatParcelizer().get(i2), i + 1));
                            i2++;
                        }
                        NotesSubscriptionResponse.write writeVar = NotesSubscriptionResponse.AudioAttributesCompatParcelizer;
                        getHref gethrefIconCompatParcelizer = read(NotesSubscriptionResponse.write.RemoteActionCompatParcelizer(notesSubscriptionResponse, courseConfigV2VideoProperties, arrayList), gethrefWrite.bc_(), gethrefWrite.ba_(), i + 1, false);
                        getHref gethrefWrite2 = write(gethrefWrite, notesSubscriptionResponse, i);
                        if (!getKeySubjectIds.AudioAttributesCompatParcelizer(gethrefIconCompatParcelizer)) {
                            gethrefIconCompatParcelizer = Meta.IconCompatParcelizer(gethrefIconCompatParcelizer, gethrefWrite2);
                        }
                        return new isIndividualPlan(setdefault.read(), gethrefIconCompatParcelizer);
                    }
                    getHref gethrefWrite3 = write(gethrefWrite, notesSubscriptionResponse, i);
                    RemoteActionCompatParcelizer(gethref, gethrefWrite3);
                    return new isIndividualPlan(setdefault.read(), gethrefWrite3);
                }
            }
        }
        return setdefault;
    }

    private final getHref write(getHref gethref, NotesSubscriptionResponse notesSubscriptionResponse, int i) {
        getPlanAddOns getplanaddonsAudioAttributesImplApi21Parcelizer = gethref.AudioAttributesImplApi21Parcelizer();
        List<setDefault> listBb_ = gethref.bb_();
        ArrayList arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) listBb_, 10));
        int i2 = 0;
        for (Object obj : listBb_) {
            if (i2 < 0) {
                IntermediateLoginResponseBody.read();
            }
            setDefault setdefault = (setDefault) obj;
            isIndividualPlan isindividualplan = read(setdefault, notesSubscriptionResponse, getplanaddonsAudioAttributesImplApi21Parcelizer.AudioAttributesCompatParcelizer().get(i2), i + 1);
            if (!isindividualplan.write()) {
                isindividualplan = new isIndividualPlan(isindividualplan.read(), setPlanAddOns.write(isindividualplan.AudioAttributesCompatParcelizer(), setdefault.AudioAttributesCompatParcelizer().ba_()));
            }
            arrayList.add(isindividualplan);
            i2++;
        }
        return setMinPrice.AudioAttributesCompatParcelizer(gethref, arrayList, null, 2);
    }

    private final void RemoteActionCompatParcelizer(getLink getlink, getLink getlink2) {
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(setDesriptionList.AudioAttributesCompatParcelizer(getlink2), "");
        int i = 0;
        for (Object obj : getlink2.bb_()) {
            if (i < 0) {
                IntermediateLoginResponseBody.read();
            }
            setDefault setdefault = (setDefault) obj;
            if (!setdefault.write()) {
                getLink getlinkAudioAttributesCompatParcelizer = setdefault.AudioAttributesCompatParcelizer();
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getlinkAudioAttributesCompatParcelizer, "");
                if (!getSearchTimes.AudioAttributesCompatParcelizer(getlinkAudioAttributesCompatParcelizer)) {
                    getlink.bb_().get(i);
                    getlink.AudioAttributesImplApi21Parcelizer().AudioAttributesCompatParcelizer().get(i);
                }
            }
            i++;
        }
    }

    public static final class RemoteActionCompatParcelizer {
        private RemoteActionCompatParcelizer() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void AudioAttributesCompatParcelizer(int i, CourseConfigV2VideoProperties courseConfigV2VideoProperties) {
            if (i <= 100) {
                return;
            }
            StringBuilder sb = new StringBuilder("Too deep recursion while expanding type alias ");
            sb.append(courseConfigV2VideoProperties.aQ_());
            throw new AssertionError(sb.toString());
        }

        public /* synthetic */ RemoteActionCompatParcelizer(byte b) {
            this();
        }
    }

    static {
        new MetaCompanion(getMinPrice.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer);
    }
}
