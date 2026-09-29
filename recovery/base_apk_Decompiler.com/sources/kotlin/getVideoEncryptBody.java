package kotlin;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class getVideoEncryptBody {
    /* JADX INFO: Access modifiers changed from: private */
    public static final RevisionSubjectStatusModel MediaBrowserCompatItemReceiver(String str) {
        isAspectRatioValid isaspectratiovalid = isAspectRatioValid.IconCompatParcelizer;
        return new RevisionSubjectStatusModel(isAspectRatioValid.MediaBrowserCompatCustomActionResultReceiver(), getRelatedLessonId.RemoteActionCompatParcelizer(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RevisionSubjectStatusModel IconCompatParcelizer(RevisionSubjectStatusModel revisionSubjectStatusModel) {
        isAspectRatioValid isaspectratiovalid = isAspectRatioValid.IconCompatParcelizer;
        getNotesCount getnotescountMediaBrowserCompatCustomActionResultReceiver = isAspectRatioValid.MediaBrowserCompatCustomActionResultReceiver();
        StringBuilder sb = new StringBuilder("U");
        sb.append(revisionSubjectStatusModel.AudioAttributesImplApi26Parcelizer().RemoteActionCompatParcelizer());
        return new RevisionSubjectStatusModel(getnotescountMediaBrowserCompatCustomActionResultReceiver, getRelatedLessonId.RemoteActionCompatParcelizer(sb.toString()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RevisionSubjectStatusModel MediaBrowserCompatSearchResultReceiver(String str) {
        isAspectRatioValid isaspectratiovalid = isAspectRatioValid.IconCompatParcelizer;
        return new RevisionSubjectStatusModel(isAspectRatioValid.AudioAttributesImplBaseParcelizer(), getRelatedLessonId.RemoteActionCompatParcelizer(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RevisionSubjectStatusModel AudioAttributesCompatParcelizer(getRelatedLessonId getrelatedlessonid) {
        isAspectRatioValid isaspectratiovalid = isAspectRatioValid.IconCompatParcelizer;
        getNotesCount getnotescountRemoteActionCompatParcelizer = isAspectRatioValid.RemoteActionCompatParcelizer().RemoteActionCompatParcelizer();
        StringBuilder sb = new StringBuilder();
        sb.append(getrelatedlessonid.RemoteActionCompatParcelizer());
        isAspectRatioValid isaspectratiovalid2 = isAspectRatioValid.IconCompatParcelizer;
        sb.append(isAspectRatioValid.RemoteActionCompatParcelizer().AudioAttributesImplApi26Parcelizer().RemoteActionCompatParcelizer());
        return new RevisionSubjectStatusModel(getnotescountRemoteActionCompatParcelizer, getRelatedLessonId.RemoteActionCompatParcelizer(sb.toString()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RevisionSubjectStatusModel MediaBrowserCompatCustomActionResultReceiver(String str) {
        isAspectRatioValid isaspectratiovalid = isAspectRatioValid.IconCompatParcelizer;
        return new RevisionSubjectStatusModel(isAspectRatioValid.IconCompatParcelizer(), getRelatedLessonId.RemoteActionCompatParcelizer(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RevisionSubjectStatusModel MediaDescriptionCompat(String str) {
        isAspectRatioValid isaspectratiovalid = isAspectRatioValid.IconCompatParcelizer;
        return new RevisionSubjectStatusModel(isAspectRatioValid.AudioAttributesImplApi26Parcelizer(), getRelatedLessonId.RemoteActionCompatParcelizer(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RevisionSubjectStatusModel AudioAttributesImplBaseParcelizer(String str) {
        isAspectRatioValid isaspectratiovalid = isAspectRatioValid.IconCompatParcelizer;
        return new RevisionSubjectStatusModel(isAspectRatioValid.write(), getRelatedLessonId.RemoteActionCompatParcelizer(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RevisionSubjectStatusModel MediaMetadataCompat(String str) {
        isAspectRatioValid isaspectratiovalid = isAspectRatioValid.IconCompatParcelizer;
        return new RevisionSubjectStatusModel(isAspectRatioValid.read(), getRelatedLessonId.RemoteActionCompatParcelizer(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RevisionSubjectStatusModel RatingCompat(String str) {
        isAspectRatioValid isaspectratiovalid = isAspectRatioValid.IconCompatParcelizer;
        return new RevisionSubjectStatusModel(isAspectRatioValid.AudioAttributesCompatParcelizer(), getRelatedLessonId.RemoteActionCompatParcelizer(str));
    }

    static {
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(new getNotesCount("java.lang").write(getRelatedLessonId.RemoteActionCompatParcelizer("annotation")), "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V> Map<V, K> AudioAttributesCompatParcelizer(Map<K, ? extends V> map) {
        Set<Map.Entry<K, ? extends V>> setEntrySet = map.entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap(getQues.write(VideoTimelineResponseBody.read(IntermediateLoginResponseBody.RemoteActionCompatParcelizer(setEntrySet, 10)), 16));
        Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Pair pairWrite = setAction.write(entry.getValue(), entry.getKey());
            linkedHashMap.put(pairWrite.write(), pairWrite.IconCompatParcelizer());
        }
        return linkedHashMap;
    }
}
