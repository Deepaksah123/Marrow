package kotlin;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class NestfputmEditorDetail {
    private static final Map<getNotesCount, getNotesCount> AudioAttributesCompatParcelizer;
    private static final Map<RevisionSubjectStatusModel, RevisionSubjectStatusModel> RemoteActionCompatParcelizer;
    public static final NestfputmEditorDetail write = new NestfputmEditorDetail();

    private NestfputmEditorDetail() {
    }

    public static getNotesCount read(getNotesCount getnotescount) {
        toMagicModuleMetaRepoModel.write(getnotescount, "");
        return AudioAttributesCompatParcelizer.get(getnotescount);
    }

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        RemoteActionCompatParcelizer = linkedHashMap;
        isAspectRatioValid isaspectratiovalid = isAspectRatioValid.IconCompatParcelizer;
        AudioAttributesCompatParcelizer(isAspectRatioValid.MediaBrowserCompatSearchResultReceiver(), AudioAttributesCompatParcelizer("java.util.ArrayList", "java.util.LinkedList"));
        isAspectRatioValid isaspectratiovalid2 = isAspectRatioValid.IconCompatParcelizer;
        AudioAttributesCompatParcelizer(isAspectRatioValid.RatingCompat(), AudioAttributesCompatParcelizer("java.util.HashSet", "java.util.TreeSet", "java.util.LinkedHashSet"));
        isAspectRatioValid isaspectratiovalid3 = isAspectRatioValid.IconCompatParcelizer;
        AudioAttributesCompatParcelizer(isAspectRatioValid.MediaMetadataCompat(), AudioAttributesCompatParcelizer("java.util.HashMap", "java.util.TreeMap", "java.util.LinkedHashMap", "java.util.concurrent.ConcurrentHashMap", "java.util.concurrent.ConcurrentSkipListMap"));
        RevisionSubjectStatusModel revisionSubjectStatusModelRemoteActionCompatParcelizer = RevisionSubjectStatusModel.RemoteActionCompatParcelizer(new getNotesCount("java.util.function.Function"));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(revisionSubjectStatusModelRemoteActionCompatParcelizer, "");
        AudioAttributesCompatParcelizer(revisionSubjectStatusModelRemoteActionCompatParcelizer, AudioAttributesCompatParcelizer("java.util.function.UnaryOperator"));
        RevisionSubjectStatusModel revisionSubjectStatusModelRemoteActionCompatParcelizer2 = RevisionSubjectStatusModel.RemoteActionCompatParcelizer(new getNotesCount("java.util.function.BiFunction"));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(revisionSubjectStatusModelRemoteActionCompatParcelizer2, "");
        AudioAttributesCompatParcelizer(revisionSubjectStatusModelRemoteActionCompatParcelizer2, AudioAttributesCompatParcelizer("java.util.function.BinaryOperator"));
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            arrayList.add(setAction.write(((RevisionSubjectStatusModel) entry.getKey()).AudioAttributesCompatParcelizer(), ((RevisionSubjectStatusModel) entry.getValue()).AudioAttributesCompatParcelizer()));
        }
        AudioAttributesCompatParcelizer = VideoTimelineResponseBody.read(arrayList);
    }

    private static void AudioAttributesCompatParcelizer(RevisionSubjectStatusModel revisionSubjectStatusModel, List<RevisionSubjectStatusModel> list) {
        Map<RevisionSubjectStatusModel, RevisionSubjectStatusModel> map = RemoteActionCompatParcelizer;
        for (Object obj : list) {
            map.put((RevisionSubjectStatusModel) obj, revisionSubjectStatusModel);
        }
    }

    private static List<RevisionSubjectStatusModel> AudioAttributesCompatParcelizer(String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(RevisionSubjectStatusModel.RemoteActionCompatParcelizer(new getNotesCount(str)));
        }
        return arrayList;
    }
}
