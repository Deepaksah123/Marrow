package kotlin;

import com.google.android.exoplayer2.source.rtsp.SessionDescription;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.getZenArea;

/* JADX INFO: loaded from: classes4.dex */
public final class NestfgetmThumbnailUrl {
    public static final NestfgetmThumbnailUrl AudioAttributesCompatParcelizer = new NestfgetmThumbnailUrl();
    private static final Map<getNotesCount, getRelatedLessonId> IconCompatParcelizer;
    private static final Map<getRelatedLessonId, List<getRelatedLessonId>> RemoteActionCompatParcelizer;
    private static final Set<getNotesCount> read;
    private static final Set<getRelatedLessonId> write;

    private NestfgetmThumbnailUrl() {
    }

    public static Map<getNotesCount, getRelatedLessonId> AudioAttributesCompatParcelizer() {
        return IconCompatParcelizer;
    }

    static {
        Map<getNotesCount, getRelatedLessonId> mapRemoteActionCompatParcelizer = VideoTimelineResponseBody.RemoteActionCompatParcelizer(setAction.write(NestfgetmSourceType.RemoteActionCompatParcelizer(getZenArea.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer, "name"), getRelatedLessonId.RemoteActionCompatParcelizer("name")), setAction.write(NestfgetmSourceType.RemoteActionCompatParcelizer(getZenArea.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer, "ordinal"), getRelatedLessonId.RemoteActionCompatParcelizer("ordinal")), setAction.write(NestfgetmSourceType.read(getZenArea.RemoteActionCompatParcelizer.MediaBrowserCompatMediaItem, "size"), getRelatedLessonId.RemoteActionCompatParcelizer("size")), setAction.write(NestfgetmSourceType.read(getZenArea.RemoteActionCompatParcelizer.onPlay, "size"), getRelatedLessonId.RemoteActionCompatParcelizer("size")), setAction.write(NestfgetmSourceType.RemoteActionCompatParcelizer(getZenArea.RemoteActionCompatParcelizer.AudioAttributesImplBaseParcelizer, SessionDescription.ATTR_LENGTH), getRelatedLessonId.RemoteActionCompatParcelizer(SessionDescription.ATTR_LENGTH)), setAction.write(NestfgetmSourceType.read(getZenArea.RemoteActionCompatParcelizer.onPlay, "keys"), getRelatedLessonId.RemoteActionCompatParcelizer("keySet")), setAction.write(NestfgetmSourceType.read(getZenArea.RemoteActionCompatParcelizer.onPlay, "values"), getRelatedLessonId.RemoteActionCompatParcelizer("values")), setAction.write(NestfgetmSourceType.read(getZenArea.RemoteActionCompatParcelizer.onPlay, "entries"), getRelatedLessonId.RemoteActionCompatParcelizer("entrySet")));
        IconCompatParcelizer = mapRemoteActionCompatParcelizer;
        Set<Map.Entry<getNotesCount, getRelatedLessonId>> setEntrySet = mapRemoteActionCompatParcelizer.entrySet();
        ArrayList<Pair> arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer(setEntrySet, 10));
        Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            arrayList.add(new Pair(((getNotesCount) entry.getKey()).IconCompatParcelizer(), entry.getValue()));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Pair pair : arrayList) {
            getRelatedLessonId getrelatedlessonid = (getRelatedLessonId) pair.IconCompatParcelizer();
            Object obj = linkedHashMap.get(getrelatedlessonid);
            if (obj == null) {
                obj = (List) new ArrayList();
                linkedHashMap.put(getrelatedlessonid, obj);
            }
            ((List) obj).add((getRelatedLessonId) pair.write());
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(VideoTimelineResponseBody.read(linkedHashMap.size()));
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry2.getKey(), IntermediateLoginResponseBody.MediaBrowserCompatCustomActionResultReceiver((Iterable) entry2.getValue()));
        }
        RemoteActionCompatParcelizer = linkedHashMap2;
        Set<getNotesCount> setKeySet = IconCompatParcelizer.keySet();
        read = setKeySet;
        Set<getNotesCount> set = setKeySet;
        ArrayList arrayList2 = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer(set, 10));
        Iterator<T> it2 = set.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((getNotesCount) it2.next()).IconCompatParcelizer());
        }
        write = IntermediateLoginResponseBody.onPlayFromUri(arrayList2);
    }

    public static Set<getNotesCount> RemoteActionCompatParcelizer() {
        return read;
    }

    public static Set<getRelatedLessonId> read() {
        return write;
    }

    public static List<getRelatedLessonId> AudioAttributesCompatParcelizer(getRelatedLessonId getrelatedlessonid) {
        toMagicModuleMetaRepoModel.write(getrelatedlessonid, "");
        List<getRelatedLessonId> list = RemoteActionCompatParcelizer.get(getrelatedlessonid);
        return list == null ? IntermediateLoginResponseBody.RemoteActionCompatParcelizer() : list;
    }
}
