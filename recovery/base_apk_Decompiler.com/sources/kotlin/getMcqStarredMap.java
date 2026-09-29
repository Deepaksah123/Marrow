package kotlin;

import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public class getMcqStarredMap extends setAnswersChanged {
    public static final int read(int i) {
        if (i < 0) {
            return i;
        }
        if (i < 3) {
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) ((i / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static final <K, V> Map<K, V> read(Pair<? extends K, ? extends V> pair) {
        toMagicModuleMetaRepoModel.write(pair, "");
        Map<K, V> mapSingletonMap = Collections.singletonMap(pair.write(), pair.IconCompatParcelizer());
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(mapSingletonMap, "");
        return mapSingletonMap;
    }

    public static final <K, V> Map<K, V> RemoteActionCompatParcelizer() {
        return new getLoggedUser();
    }

    public static final <K, V> Map<K, V> IconCompatParcelizer(int i) {
        return new getLoggedUser(i);
    }

    public static final <K, V> Map<K, V> read(Map<K, V> map) {
        toMagicModuleMetaRepoModel.write(map, "");
        return ((getLoggedUser) map).AudioAttributesCompatParcelizer();
    }

    public static final <K, V> SortedMap<K, V> AudioAttributesCompatParcelizer(Map<? extends K, ? extends V> map, Comparator<? super K> comparator) {
        toMagicModuleMetaRepoModel.write(map, "");
        toMagicModuleMetaRepoModel.write(comparator, "");
        TreeMap treeMap = new TreeMap(comparator);
        treeMap.putAll(map);
        return treeMap;
    }

    public static final <K, V> Map<K, V> write(Map<? extends K, ? extends V> map) {
        toMagicModuleMetaRepoModel.write(map, "");
        Map.Entry<? extends K, ? extends V> next = map.entrySet().iterator().next();
        Map<K, V> mapSingletonMap = Collections.singletonMap(next.getKey(), next.getValue());
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(mapSingletonMap, "");
        return mapSingletonMap;
    }
}
