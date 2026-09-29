package kotlin;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class VideoTimelineResponseBodyCompanion extends getMcqStarredMap {
    public static final <K, V> Map<K, V> read() {
        getPytMcqCount getpytmcqcount = getPytMcqCount.AudioAttributesCompatParcelizer;
        toMagicModuleMetaRepoModel.read(getpytmcqcount, "");
        return getpytmcqcount;
    }

    public static final <K, V> Map<K, V> RemoteActionCompatParcelizer(Pair<? extends K, ? extends V>... pairArr) {
        toMagicModuleMetaRepoModel.write(pairArr, "");
        return pairArr.length > 0 ? VideoTimelineResponseBody.write(pairArr, new LinkedHashMap(VideoTimelineResponseBody.read(pairArr.length))) : VideoTimelineResponseBody.read();
    }

    public static final <K, V> Map<K, V> write(Pair<? extends K, ? extends V>... pairArr) {
        toMagicModuleMetaRepoModel.write(pairArr, "");
        LinkedHashMap linkedHashMap = new LinkedHashMap(VideoTimelineResponseBody.read(pairArr.length));
        VideoTimelineResponseBody.RemoteActionCompatParcelizer((Map) linkedHashMap, (Pair[]) pairArr);
        return linkedHashMap;
    }

    public static final <K, V> HashMap<K, V> AudioAttributesCompatParcelizer(Pair<? extends K, ? extends V>... pairArr) {
        toMagicModuleMetaRepoModel.write(pairArr, "");
        HashMap<K, V> map = new HashMap<>(VideoTimelineResponseBody.read(pairArr.length));
        VideoTimelineResponseBody.RemoteActionCompatParcelizer((Map) map, (Pair[]) pairArr);
        return map;
    }

    public static final <K, V> LinkedHashMap<K, V> IconCompatParcelizer(Pair<? extends K, ? extends V>... pairArr) {
        toMagicModuleMetaRepoModel.write(pairArr, "");
        return (LinkedHashMap) VideoTimelineResponseBody.write(pairArr, new LinkedHashMap(VideoTimelineResponseBody.read(pairArr.length)));
    }

    public static final <K, V> V AudioAttributesCompatParcelizer(Map<K, ? extends V> map, K k) {
        toMagicModuleMetaRepoModel.write(map, "");
        return (V) VideoTimelineResponseBody.RemoteActionCompatParcelizer(map, k);
    }

    public static final <K, V> V write(Map<K, V> map, K k, getCreatedOnDateMs<? extends V> getcreatedondatems) {
        toMagicModuleMetaRepoModel.write(map, "");
        toMagicModuleMetaRepoModel.write(getcreatedondatems, "");
        V v = map.get(k);
        if (v != null) {
            return v;
        }
        V vInvoke = getcreatedondatems.invoke();
        map.put(k, vInvoke);
        return vInvoke;
    }

    public static final <K, V> void RemoteActionCompatParcelizer(Map<? super K, ? super V> map, Pair<? extends K, ? extends V>[] pairArr) {
        toMagicModuleMetaRepoModel.write(map, "");
        toMagicModuleMetaRepoModel.write(pairArr, "");
        for (Pair<? extends K, ? extends V> pair : pairArr) {
            map.put(pair.RemoteActionCompatParcelizer(), pair.read());
        }
    }

    public static final <K, V> void IconCompatParcelizer(Map<? super K, ? super V> map, Iterable<? extends Pair<? extends K, ? extends V>> iterable) {
        toMagicModuleMetaRepoModel.write(map, "");
        toMagicModuleMetaRepoModel.write(iterable, "");
        for (Pair<? extends K, ? extends V> pair : iterable) {
            map.put(pair.RemoteActionCompatParcelizer(), pair.read());
        }
    }

    public static final <K, V> Map<K, V> read(Iterable<? extends Pair<? extends K, ? extends V>> iterable) {
        toMagicModuleMetaRepoModel.write(iterable, "");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size == 0) {
                return VideoTimelineResponseBody.read();
            }
            if (size != 1) {
                return VideoTimelineResponseBody.IconCompatParcelizer(iterable, new LinkedHashMap(VideoTimelineResponseBody.read(collection.size())));
            }
            return VideoTimelineResponseBody.read((Pair) (iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next()));
        }
        return VideoTimelineResponseBody.RemoteActionCompatParcelizer(VideoTimelineResponseBody.IconCompatParcelizer(iterable, new LinkedHashMap()));
    }

    public static final <K, V, M extends Map<? super K, ? super V>> M IconCompatParcelizer(Iterable<? extends Pair<? extends K, ? extends V>> iterable, M m) {
        toMagicModuleMetaRepoModel.write(iterable, "");
        toMagicModuleMetaRepoModel.write(m, "");
        VideoTimelineResponseBody.IconCompatParcelizer(m, iterable);
        return m;
    }

    public static final <K, V, M extends Map<? super K, ? super V>> M write(Pair<? extends K, ? extends V>[] pairArr, M m) {
        toMagicModuleMetaRepoModel.write(pairArr, "");
        toMagicModuleMetaRepoModel.write(m, "");
        VideoTimelineResponseBody.RemoteActionCompatParcelizer((Map) m, (Pair[]) pairArr);
        return m;
    }

    public static final <K, V> Map<K, V> AudioAttributesCompatParcelizer(Map<? extends K, ? extends V> map) {
        toMagicModuleMetaRepoModel.write(map, "");
        int size = map.size();
        if (size == 0) {
            return VideoTimelineResponseBody.read();
        }
        if (size == 1) {
            return VideoTimelineResponseBody.write(map);
        }
        return VideoTimelineResponseBody.IconCompatParcelizer(map);
    }

    public static final <K, V> Map<K, V> IconCompatParcelizer(Map<? extends K, ? extends V> map) {
        toMagicModuleMetaRepoModel.write(map, "");
        return new LinkedHashMap(map);
    }

    public static final <K, V> Map<K, V> read(Map<? extends K, ? extends V> map, Pair<? extends K, ? extends V> pair) {
        toMagicModuleMetaRepoModel.write(map, "");
        toMagicModuleMetaRepoModel.write(pair, "");
        if (map.isEmpty()) {
            return VideoTimelineResponseBody.read(pair);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.put(pair.write(), pair.IconCompatParcelizer());
        return linkedHashMap;
    }

    public static final <K, V> Map<K, V> read(Map<? extends K, ? extends V> map, Map<? extends K, ? extends V> map2) {
        toMagicModuleMetaRepoModel.write(map, "");
        toMagicModuleMetaRepoModel.write(map2, "");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.putAll(map2);
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V> Map<K, V> RemoteActionCompatParcelizer(Map<K, ? extends V> map) {
        toMagicModuleMetaRepoModel.write(map, "");
        int size = map.size();
        if (size != 0) {
            return size != 1 ? map : VideoTimelineResponseBody.write(map);
        }
        return VideoTimelineResponseBody.read();
    }
}
