package kotlin;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: o.getSubtitle, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0179getSubtitle {
    private final setIncludeUntagged RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: o.getSubtitle$IconCompatParcelizer */
    static final class IconCompatParcelizer {
        private final getLink AudioAttributesCompatParcelizer;
        private final int read;

        public IconCompatParcelizer(getLink getlink, int i) {
            this.AudioAttributesCompatParcelizer = getlink;
            this.read = i;
        }

        public final getLink IconCompatParcelizer() {
            return this.AudioAttributesCompatParcelizer;
        }

        public final int RemoteActionCompatParcelizer() {
            return this.read;
        }
    }

    public C0179getSubtitle(setIncludeUntagged setincludeuntagged) {
        toMagicModuleMetaRepoModel.write(setincludeuntagged, "");
        this.RemoteActionCompatParcelizer = setincludeuntagged;
    }

    /* JADX INFO: renamed from: o.getSubtitle$write */
    static final class write {
        private final getHref AudioAttributesCompatParcelizer;
        private final boolean RemoteActionCompatParcelizer;
        private final int write;

        public write(getHref gethref, int i, boolean z) {
            this.AudioAttributesCompatParcelizer = gethref;
            this.write = i;
            this.RemoteActionCompatParcelizer = z;
        }

        public final int AudioAttributesCompatParcelizer() {
            return this.write;
        }

        public final boolean RemoteActionCompatParcelizer() {
            return this.RemoteActionCompatParcelizer;
        }

        public final getHref write() {
            return this.AudioAttributesCompatParcelizer;
        }
    }

    public final getLink write(getLink getlink, getAnswerMap<? super Integer, getSubject> getanswermap, boolean z) {
        toMagicModuleMetaRepoModel.write(getlink, "");
        toMagicModuleMetaRepoModel.write(getanswermap, "");
        return AudioAttributesCompatParcelizer(getlink.MediaBrowserCompatMediaItem(), getanswermap, 0, z).IconCompatParcelizer();
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x009d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final kotlin.C0179getSubtitle.IconCompatParcelizer AudioAttributesCompatParcelizer(kotlin.PlanAddOnsCompanion r12, kotlin.getAnswerMap<? super java.lang.Integer, kotlin.getSubject> r13, int r14, boolean r15) {
        /*
            Method dump skipped, instruction units count: 242
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.C0179getSubtitle.AudioAttributesCompatParcelizer(o.PlanAddOnsCompanion, o.getAnswerMap, int, boolean):o.getSubtitle$IconCompatParcelizer");
    }

    private static /* synthetic */ write RemoteActionCompatParcelizer(C0179getSubtitle c0179getSubtitle, getHref gethref, getAnswerMap getanswermap, int i, AssociatedLessonIndex associatedLessonIndex, boolean z) {
        return c0179getSubtitle.read(gethref, getanswermap, i, associatedLessonIndex, false, z);
    }

    private final write read(getHref gethref, getAnswerMap<? super Integer, getSubject> getanswermap, int i, AssociatedLessonIndex associatedLessonIndex, boolean z, boolean z2) {
        getPlanAddOns getplanaddonsAudioAttributesImplApi21Parcelizer;
        boolean z3;
        IconCompatParcelizer iconCompatParcelizer;
        setDefault setdefaultWrite;
        boolean zIconCompatParcelizer = AssociatedLessonIndexCompanion.IconCompatParcelizer(associatedLessonIndex);
        boolean z4 = (z2 && z) ? false : true;
        getLink getlink = null;
        if (!zIconCompatParcelizer && gethref.bb_().isEmpty()) {
            return new write(null, 1, false);
        }
        getQuestionLimit getquestionlimitRemoteActionCompatParcelizer = gethref.AudioAttributesImplApi21Parcelizer().RemoteActionCompatParcelizer();
        if (getquestionlimitRemoteActionCompatParcelizer == null) {
            return new write(null, 1, false);
        }
        getSubject getsubjectInvoke = getanswermap.invoke(Integer.valueOf(i));
        getQuestionLimit getquestionlimitRemoteActionCompatParcelizer2 = isInternModule.RemoteActionCompatParcelizer(getquestionlimitRemoteActionCompatParcelizer, getsubjectInvoke, associatedLessonIndex);
        Boolean boolWrite = isInternModule.write(getsubjectInvoke, associatedLessonIndex);
        if (getquestionlimitRemoteActionCompatParcelizer2 == null || (getplanaddonsAudioAttributesImplApi21Parcelizer = getquestionlimitRemoteActionCompatParcelizer2.MediaBrowserCompatSearchResultReceiver()) == null) {
            getplanaddonsAudioAttributesImplApi21Parcelizer = gethref.AudioAttributesImplApi21Parcelizer();
        }
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getplanaddonsAudioAttributesImplApi21Parcelizer, "");
        int iRemoteActionCompatParcelizer = i + 1;
        List<setDefault> listBb_ = gethref.bb_();
        List<getBadgeText> listAudioAttributesCompatParcelizer = getplanaddonsAudioAttributesImplApi21Parcelizer.AudioAttributesCompatParcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(listAudioAttributesCompatParcelizer, "");
        List<getBadgeText> list = listAudioAttributesCompatParcelizer;
        Iterator<T> it = listBb_.iterator();
        Iterator<T> it2 = list.iterator();
        ArrayList arrayList = new ArrayList(Math.min(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) listBb_, 10), IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) list, 10)));
        while (it.hasNext() && it2.hasNext()) {
            Object next = it.next();
            getBadgeText getbadgetext = (getBadgeText) it2.next();
            setDefault setdefault = (setDefault) next;
            if (!z4) {
                z3 = z4;
                iconCompatParcelizer = new IconCompatParcelizer(getlink, 0);
            } else {
                z3 = z4;
                if (!setdefault.write()) {
                    iconCompatParcelizer = AudioAttributesCompatParcelizer(setdefault.AudioAttributesCompatParcelizer().MediaBrowserCompatMediaItem(), getanswermap, iRemoteActionCompatParcelizer, z2);
                } else if (getanswermap.invoke(Integer.valueOf(iRemoteActionCompatParcelizer)).IconCompatParcelizer() == VideoSubModel.FORCE_FLEXIBILITY) {
                    PlanAddOnsCompanion planAddOnsCompanionMediaBrowserCompatMediaItem = setdefault.AudioAttributesCompatParcelizer().MediaBrowserCompatMediaItem();
                    iconCompatParcelizer = new IconCompatParcelizer(AddOnMetaKt.AudioAttributesCompatParcelizer(PearlSubjectInfo.write(planAddOnsCompanionMediaBrowserCompatMediaItem).write(false), PearlSubjectInfo.RemoteActionCompatParcelizer(planAddOnsCompanionMediaBrowserCompatMediaItem).write(true)), 1);
                } else {
                    iconCompatParcelizer = new IconCompatParcelizer(null, 1);
                }
            }
            iRemoteActionCompatParcelizer += iconCompatParcelizer.RemoteActionCompatParcelizer();
            if (iconCompatParcelizer.IconCompatParcelizer() != null) {
                getLink getlinkIconCompatParcelizer = iconCompatParcelizer.IconCompatParcelizer();
                getTotalSubject gettotalsubject = setdefault.read();
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(gettotalsubject, "");
                setdefaultWrite = getSearchTimes.write(getlinkIconCompatParcelizer, gettotalsubject, getbadgetext);
            } else if (getquestionlimitRemoteActionCompatParcelizer2 == null || setdefault.write()) {
                setdefaultWrite = getquestionlimitRemoteActionCompatParcelizer2 != null ? setPlanAddOns.write(getbadgetext) : null;
            } else {
                getLink getlinkAudioAttributesCompatParcelizer = setdefault.AudioAttributesCompatParcelizer();
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getlinkAudioAttributesCompatParcelizer, "");
                getTotalSubject gettotalsubject2 = setdefault.read();
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(gettotalsubject2, "");
                setdefaultWrite = getSearchTimes.write(getlinkAudioAttributesCompatParcelizer, gettotalsubject2, getbadgetext);
            }
            arrayList.add(setdefaultWrite);
            z4 = z3;
            getlink = null;
        }
        ArrayList arrayList2 = arrayList;
        int i2 = iRemoteActionCompatParcelizer - i;
        if (getquestionlimitRemoteActionCompatParcelizer2 == null && boolWrite == null) {
            ArrayList arrayList3 = arrayList2;
            if (!arrayList3.isEmpty()) {
                Iterator it3 = arrayList3.iterator();
                while (it3.hasNext()) {
                    if (((setDefault) it3.next()) == null) {
                    }
                }
            }
            return new write(null, i2, false);
        }
        getQuote[] getquoteArr = new getQuote[3];
        getquoteArr[0] = gethref.RemoteActionCompatParcelizer();
        isDownloaded isdownloaded = isInternModule.write;
        if (getquestionlimitRemoteActionCompatParcelizer2 == null) {
            isdownloaded = null;
        }
        getquoteArr[1] = isdownloaded;
        getquoteArr[2] = boolWrite == null ? null : isInternModule.IconCompatParcelizer();
        getGroupDescription getgroupdescriptionAudioAttributesCompatParcelizer = getDurationTitle.AudioAttributesCompatParcelizer(isInternModule.read(IntermediateLoginResponseBody.read(getquoteArr)));
        ArrayList arrayList4 = arrayList2;
        List<setDefault> listBb_2 = gethref.bb_();
        Iterator it4 = arrayList4.iterator();
        Iterator<T> it5 = listBb_2.iterator();
        ArrayList arrayList5 = new ArrayList(Math.min(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) arrayList4, 10), IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) listBb_2, 10)));
        while (it4.hasNext() && it5.hasNext()) {
            Object next2 = it4.next();
            setDefault setdefault2 = (setDefault) it5.next();
            setDefault setdefault3 = (setDefault) next2;
            if (setdefault3 != null) {
                setdefault2 = setdefault3;
            }
            arrayList5.add(setdefault2);
        }
        getHref gethrefWrite = AddOnMetaKt.write(getgroupdescriptionAudioAttributesCompatParcelizer, getplanaddonsAudioAttributesImplApi21Parcelizer, arrayList5, boolWrite != null ? boolWrite.booleanValue() : gethref.ba_());
        if (getsubjectInvoke.RemoteActionCompatParcelizer()) {
            gethrefWrite = read(gethrefWrite);
        }
        return new write(gethrefWrite, i2, boolWrite != null && getsubjectInvoke.read());
    }

    private final getHref read(getHref gethref) {
        return new getDurationText(gethref);
    }
}
