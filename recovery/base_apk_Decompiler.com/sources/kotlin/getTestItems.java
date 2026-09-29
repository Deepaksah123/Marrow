package kotlin;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.getQuote;
import kotlin.getStartDate;
import kotlin.getZenArea;

/* JADX INFO: loaded from: classes4.dex */
public final class getTestItems {
    public static final boolean AudioAttributesImplApi26Parcelizer(getLink getlink) {
        toMagicModuleMetaRepoModel.write(getlink, "");
        getQuestionLimit getquestionlimitRemoteActionCompatParcelizer = getlink.AudioAttributesImplApi21Parcelizer().RemoteActionCompatParcelizer();
        return (getquestionlimitRemoteActionCompatParcelizer != null ? IconCompatParcelizer(getquestionlimitRemoteActionCompatParcelizer) : null) == getStartDate.Function;
    }

    public static final boolean AudioAttributesImplBaseParcelizer(getLink getlink) {
        toMagicModuleMetaRepoModel.write(getlink, "");
        getQuestionLimit getquestionlimitRemoteActionCompatParcelizer = getlink.AudioAttributesImplApi21Parcelizer().RemoteActionCompatParcelizer();
        return (getquestionlimitRemoteActionCompatParcelizer != null ? IconCompatParcelizer(getquestionlimitRemoteActionCompatParcelizer) : null) == getStartDate.SuspendFunction;
    }

    public static final boolean AudioAttributesImplApi21Parcelizer(getLink getlink) {
        toMagicModuleMetaRepoModel.write(getlink, "");
        getQuestionLimit getquestionlimitRemoteActionCompatParcelizer = getlink.AudioAttributesImplApi21Parcelizer().RemoteActionCompatParcelizer();
        return getquestionlimitRemoteActionCompatParcelizer != null && write(getquestionlimitRemoteActionCompatParcelizer);
    }

    private static boolean write(getVariant getvariant) {
        toMagicModuleMetaRepoModel.write(getvariant, "");
        getStartDate getstartdateIconCompatParcelizer = IconCompatParcelizer(getvariant);
        return getstartdateIconCompatParcelizer == getStartDate.Function || getstartdateIconCompatParcelizer == getStartDate.SuspendFunction;
    }

    public static final boolean MediaBrowserCompatItemReceiver(getLink getlink) {
        toMagicModuleMetaRepoModel.write(getlink, "");
        return AudioAttributesImplApi21Parcelizer(getlink) && RatingCompat(getlink);
    }

    private static final boolean RatingCompat(getLink getlink) {
        return getlink.RemoteActionCompatParcelizer().IconCompatParcelizer(getZenArea.RemoteActionCompatParcelizer.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) != null;
    }

    private static getStartDate IconCompatParcelizer(getVariant getvariant) {
        toMagicModuleMetaRepoModel.write(getvariant, "");
        if ((getvariant instanceof CourseConfigV2CustomModuleQuestionSource) && getTestTabItems.read(getvariant)) {
            return IconCompatParcelizer(setLocked.read(getvariant));
        }
        return null;
    }

    private static final getStartDate IconCompatParcelizer(getSlidesCount getslidescount) {
        if (!getslidescount.read() || getslidescount.IconCompatParcelizer()) {
            return null;
        }
        getStartDate.read readVar = getStartDate.IconCompatParcelizer;
        String strAudioAttributesCompatParcelizer = getslidescount.AudioAttributesImplApi26Parcelizer().AudioAttributesCompatParcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strAudioAttributesCompatParcelizer, "");
        getNotesCount getnotescountAudioAttributesCompatParcelizer = getslidescount.MediaBrowserCompatItemReceiver().AudioAttributesCompatParcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getnotescountAudioAttributesCompatParcelizer, "");
        return readVar.IconCompatParcelizer(strAudioAttributesCompatParcelizer, getnotescountAudioAttributesCompatParcelizer);
    }

    private static int MediaBrowserCompatCustomActionResultReceiver(getLink getlink) {
        toMagicModuleMetaRepoModel.write(getlink, "");
        dummyEditor dummyeditorIconCompatParcelizer = getlink.RemoteActionCompatParcelizer().IconCompatParcelizer(getZenArea.RemoteActionCompatParcelizer.MediaDescriptionCompat);
        if (dummyeditorIconCompatParcelizer == null) {
            return 0;
        }
        getMagicLine getmagicline = (getMagicLine) VideoTimelineResponseBody.AudioAttributesCompatParcelizer(dummyeditorIconCompatParcelizer.read(), getZenArea.AudioAttributesImplBaseParcelizer);
        toMagicModuleMetaRepoModel.read(getmagicline, "");
        return ((getOption6AnsweredCount) getmagicline).AudioAttributesCompatParcelizer().intValue();
    }

    public static final getLink RemoteActionCompatParcelizer(getLink getlink) {
        toMagicModuleMetaRepoModel.write(getlink, "");
        AudioAttributesImplApi21Parcelizer(getlink);
        if (!RatingCompat(getlink)) {
            return null;
        }
        return getlink.bb_().get(MediaBrowserCompatCustomActionResultReceiver(getlink)).AudioAttributesCompatParcelizer();
    }

    public static final List<getLink> IconCompatParcelizer(getLink getlink) {
        toMagicModuleMetaRepoModel.write(getlink, "");
        AudioAttributesImplApi21Parcelizer(getlink);
        int iMediaBrowserCompatCustomActionResultReceiver = MediaBrowserCompatCustomActionResultReceiver(getlink);
        if (iMediaBrowserCompatCustomActionResultReceiver == 0) {
            return IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
        }
        List<setDefault> listSubList = getlink.bb_().subList(0, iMediaBrowserCompatCustomActionResultReceiver);
        ArrayList arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) listSubList, 10));
        Iterator<T> it = listSubList.iterator();
        while (it.hasNext()) {
            getLink getlinkAudioAttributesCompatParcelizer = ((setDefault) it.next()).AudioAttributesCompatParcelizer();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getlinkAudioAttributesCompatParcelizer, "");
            arrayList.add(getlinkAudioAttributesCompatParcelizer);
        }
        return arrayList;
    }

    public static final getLink AudioAttributesCompatParcelizer(getLink getlink) {
        toMagicModuleMetaRepoModel.write(getlink, "");
        AudioAttributesImplApi21Parcelizer(getlink);
        getLink getlinkAudioAttributesCompatParcelizer = ((setDefault) IntermediateLoginResponseBody.MediaBrowserCompatMediaItem((List) getlink.bb_())).AudioAttributesCompatParcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getlinkAudioAttributesCompatParcelizer, "");
        return getlinkAudioAttributesCompatParcelizer;
    }

    public static final List<setDefault> write(getLink getlink) {
        toMagicModuleMetaRepoModel.write(getlink, "");
        AudioAttributesImplApi21Parcelizer(getlink);
        return getlink.bb_().subList(MediaBrowserCompatCustomActionResultReceiver(getlink) + (MediaBrowserCompatItemReceiver(getlink) ? 1 : 0), r0.size() - 1);
    }

    public static final getRelatedLessonId read(getLink getlink) {
        String strAudioAttributesCompatParcelizer;
        toMagicModuleMetaRepoModel.write(getlink, "");
        dummyEditor dummyeditorIconCompatParcelizer = getlink.RemoteActionCompatParcelizer().IconCompatParcelizer(getZenArea.RemoteActionCompatParcelizer.onSetShuffleMode);
        if (dummyeditorIconCompatParcelizer == null) {
            return null;
        }
        Object objOnCommand = IntermediateLoginResponseBody.onCommand(dummyeditorIconCompatParcelizer.read().values());
        getStatusUpdateEndTimeMs getstatusupdateendtimems = objOnCommand instanceof getStatusUpdateEndTimeMs ? (getStatusUpdateEndTimeMs) objOnCommand : null;
        if (getstatusupdateendtimems != null && (strAudioAttributesCompatParcelizer = getstatusupdateendtimems.AudioAttributesCompatParcelizer()) != null) {
            if (!getRelatedLessonId.read(strAudioAttributesCompatParcelizer)) {
                strAudioAttributesCompatParcelizer = null;
            }
            if (strAudioAttributesCompatParcelizer != null) {
                return getRelatedLessonId.RemoteActionCompatParcelizer(strAudioAttributesCompatParcelizer);
            }
        }
        return null;
    }

    private static List<setDefault> AudioAttributesCompatParcelizer(getLink getlink, List<? extends getLink> list, List<? extends getLink> list2, List<getRelatedLessonId> list3, getLink getlink2, getTestTabItems gettesttabitems) {
        getRelatedLessonId getrelatedlessonid;
        toMagicModuleMetaRepoModel.write(list, "");
        toMagicModuleMetaRepoModel.write(list2, "");
        toMagicModuleMetaRepoModel.write(getlink2, "");
        toMagicModuleMetaRepoModel.write(gettesttabitems, "");
        int i = 0;
        ArrayList arrayList = new ArrayList(list2.size() + list.size() + (getlink != null ? 1 : 0) + 1);
        List<? extends getLink> list4 = list;
        ArrayList arrayList2 = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) list4, 10));
        Iterator<T> it = list4.iterator();
        while (it.hasNext()) {
            arrayList2.add(getSearchTimes.write((getLink) it.next()));
        }
        arrayList.addAll(arrayList2);
        ArrayList arrayList3 = arrayList;
        SubjectGroupTypeConstant.write(arrayList3, getlink != null ? getSearchTimes.write(getlink) : null);
        for (Object obj : list2) {
            if (i < 0) {
                IntermediateLoginResponseBody.read();
            }
            getLink getlinkWrite = (getLink) obj;
            if (list3 == null || (getrelatedlessonid = list3.get(i)) == null || getrelatedlessonid.read()) {
                getrelatedlessonid = null;
            }
            if (getrelatedlessonid != null) {
                getNotesCount getnotescount = getZenArea.RemoteActionCompatParcelizer.onSetShuffleMode;
                getRelatedLessonId getrelatedlessonidRemoteActionCompatParcelizer = getRelatedLessonId.RemoteActionCompatParcelizer("name");
                String strAudioAttributesCompatParcelizer = getrelatedlessonid.AudioAttributesCompatParcelizer();
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strAudioAttributesCompatParcelizer, "");
                getQualification getqualification = new getQualification(gettesttabitems, getnotescount, VideoTimelineResponseBody.read(setAction.write(getrelatedlessonidRemoteActionCompatParcelizer, new getStatusUpdateEndTimeMs(strAudioAttributesCompatParcelizer))));
                getQuote.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = getQuote.IconCompatParcelizer;
                getlinkWrite = getSearchTimes.write(getlinkWrite, getQuote.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(IntermediateLoginResponseBody.read(getlinkWrite.RemoteActionCompatParcelizer(), getqualification)));
            }
            arrayList3.add(getSearchTimes.write(getlinkWrite));
            i++;
        }
        arrayList.add(getSearchTimes.write(getlink2));
        return arrayList;
    }

    public static final getHref read(getTestTabItems gettesttabitems, getQuote getquote, getLink getlink, List<? extends getLink> list, List<? extends getLink> list2, List<getRelatedLessonId> list3, getLink getlink2, boolean z) {
        toMagicModuleMetaRepoModel.write(gettesttabitems, "");
        toMagicModuleMetaRepoModel.write(getquote, "");
        toMagicModuleMetaRepoModel.write(list, "");
        toMagicModuleMetaRepoModel.write(list2, "");
        toMagicModuleMetaRepoModel.write(getlink2, "");
        List<setDefault> listAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(getlink, list, list2, null, getlink2, gettesttabitems);
        CourseConfigV2CustomModuleQuestionSource courseConfigV2CustomModuleQuestionSourceWrite = write(gettesttabitems, list2.size() + list.size() + (getlink == null ? 0 : 1), z);
        if (getlink != null) {
            getquote = AudioAttributesCompatParcelizer(getquote, gettesttabitems);
        }
        if (!list.isEmpty()) {
            getquote = RemoteActionCompatParcelizer(getquote, gettesttabitems, list.size());
        }
        return AddOnMetaKt.write(getDurationTitle.AudioAttributesCompatParcelizer(getquote), courseConfigV2CustomModuleQuestionSourceWrite, listAudioAttributesCompatParcelizer);
    }

    private static getQuote AudioAttributesCompatParcelizer(getQuote getquote, getTestTabItems gettesttabitems) {
        toMagicModuleMetaRepoModel.write(getquote, "");
        toMagicModuleMetaRepoModel.write(gettesttabitems, "");
        if (getquote.AudioAttributesCompatParcelizer(getZenArea.RemoteActionCompatParcelizer.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver)) {
            return getquote;
        }
        getQuote.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = getQuote.IconCompatParcelizer;
        return getQuote.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(IntermediateLoginResponseBody.read(getquote, new getQualification(gettesttabitems, getZenArea.RemoteActionCompatParcelizer.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, VideoTimelineResponseBody.read())));
    }

    private static getQuote RemoteActionCompatParcelizer(getQuote getquote, getTestTabItems gettesttabitems, int i) {
        toMagicModuleMetaRepoModel.write(getquote, "");
        toMagicModuleMetaRepoModel.write(gettesttabitems, "");
        if (getquote.AudioAttributesCompatParcelizer(getZenArea.RemoteActionCompatParcelizer.MediaDescriptionCompat)) {
            return getquote;
        }
        getQuote.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = getQuote.IconCompatParcelizer;
        return getQuote.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(IntermediateLoginResponseBody.read(getquote, new getQualification(gettesttabitems, getZenArea.RemoteActionCompatParcelizer.MediaDescriptionCompat, VideoTimelineResponseBody.read(setAction.write(getZenArea.AudioAttributesImplBaseParcelizer, new getOption6AnsweredCount(i))))));
    }

    private static CourseConfigV2CustomModuleQuestionSource write(getTestTabItems gettesttabitems, int i, boolean z) {
        toMagicModuleMetaRepoModel.write(gettesttabitems, "");
        CourseConfigV2CustomModuleQuestionSource courseConfigV2CustomModuleQuestionSourceRemoteActionCompatParcelizer = z ? gettesttabitems.RemoteActionCompatParcelizer(i) : gettesttabitems.read(i);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(courseConfigV2CustomModuleQuestionSourceRemoteActionCompatParcelizer, "");
        return courseConfigV2CustomModuleQuestionSourceRemoteActionCompatParcelizer;
    }
}
