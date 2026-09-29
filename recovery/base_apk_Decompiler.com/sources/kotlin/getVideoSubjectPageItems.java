package kotlin;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class getVideoSubjectPageItems {
    private static final HashMap<RevisionSubjectStatusModel, RevisionSubjectStatusModel> AudioAttributesCompatParcelizer;
    public static final getVideoSubjectPageItems IconCompatParcelizer = new getVideoSubjectPageItems();
    private static final Set<getRelatedLessonId> RemoteActionCompatParcelizer;
    private static final Set<getRelatedLessonId> read;
    private static final HashMap<RevisionSubjectStatusModel, RevisionSubjectStatusModel> write;

    private getVideoSubjectPageItems() {
    }

    static {
        getVideoItems[] getvideoitemsArrValues = getVideoItems.values();
        ArrayList arrayList = new ArrayList(getvideoitemsArrValues.length);
        for (getVideoItems getvideoitems : getvideoitemsArrValues) {
            arrayList.add(getvideoitems.AudioAttributesCompatParcelizer());
        }
        RemoteActionCompatParcelizer = IntermediateLoginResponseBody.onPlayFromUri(arrayList);
        getVideoProperties[] getvideopropertiesArrValues = getVideoProperties.values();
        ArrayList arrayList2 = new ArrayList(getvideopropertiesArrValues.length);
        for (getVideoProperties getvideoproperties : getvideopropertiesArrValues) {
            arrayList2.add(getvideoproperties.IconCompatParcelizer());
        }
        IntermediateLoginResponseBody.onPlayFromUri(arrayList2);
        write = new HashMap<>();
        AudioAttributesCompatParcelizer = new HashMap<>();
        VideoTimelineResponseBody.AudioAttributesCompatParcelizer(setAction.write(getVideoProperties.AudioAttributesCompatParcelizer, getRelatedLessonId.RemoteActionCompatParcelizer("ubyteArrayOf")), setAction.write(getVideoProperties.read, getRelatedLessonId.RemoteActionCompatParcelizer("ushortArrayOf")), setAction.write(getVideoProperties.write, getRelatedLessonId.RemoteActionCompatParcelizer("uintArrayOf")), setAction.write(getVideoProperties.IconCompatParcelizer, getRelatedLessonId.RemoteActionCompatParcelizer("ulongArrayOf")));
        getVideoItems[] getvideoitemsArrValues2 = getVideoItems.values();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (getVideoItems getvideoitems2 : getvideoitemsArrValues2) {
            linkedHashSet.add(getvideoitems2.RemoteActionCompatParcelizer().AudioAttributesImplApi26Parcelizer());
        }
        read = linkedHashSet;
        for (getVideoItems getvideoitems3 : getVideoItems.values()) {
            write.put(getvideoitems3.RemoteActionCompatParcelizer(), getvideoitems3.write());
            AudioAttributesCompatParcelizer.put(getvideoitems3.write(), getvideoitems3.RemoteActionCompatParcelizer());
        }
    }

    public static boolean AudioAttributesCompatParcelizer(getRelatedLessonId getrelatedlessonid) {
        toMagicModuleMetaRepoModel.write(getrelatedlessonid, "");
        return read.contains(getrelatedlessonid);
    }

    public static RevisionSubjectStatusModel IconCompatParcelizer(RevisionSubjectStatusModel revisionSubjectStatusModel) {
        toMagicModuleMetaRepoModel.write(revisionSubjectStatusModel, "");
        return write.get(revisionSubjectStatusModel);
    }

    @getMagicModuleMeta
    public static final boolean AudioAttributesCompatParcelizer(getLink getlink) {
        getQuestionLimit getquestionlimitRemoteActionCompatParcelizer;
        toMagicModuleMetaRepoModel.write(getlink, "");
        if (setPlanAddOns.MediaBrowserCompatItemReceiver(getlink) || (getquestionlimitRemoteActionCompatParcelizer = getlink.AudioAttributesImplApi21Parcelizer().RemoteActionCompatParcelizer()) == null) {
            return false;
        }
        return IconCompatParcelizer(getquestionlimitRemoteActionCompatParcelizer);
    }

    private static boolean IconCompatParcelizer(getVariant getvariant) {
        toMagicModuleMetaRepoModel.write(getvariant, "");
        getVariant getvariantAudioAttributesImplApi21Parcelizer = getvariant.AudioAttributesImplApi21Parcelizer();
        return (getvariantAudioAttributesImplApi21Parcelizer instanceof getShouldShowEmptyPlanScreen) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(((getShouldShowEmptyPlanScreen) getvariantAudioAttributesImplApi21Parcelizer).IconCompatParcelizer(), getZenArea.IconCompatParcelizer) && RemoteActionCompatParcelizer.contains(getvariant.aQ_());
    }
}
