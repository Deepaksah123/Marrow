package kotlin;

import java.util.Map;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
class setAnswersChanged {
    public static final <K, V> V RemoteActionCompatParcelizer(Map<K, ? extends V> map, K k) {
        toMagicModuleMetaRepoModel.write(map, "");
        if (map instanceof TestStartResponseBody) {
            return (V) ((TestStartResponseBody) map).IconCompatParcelizer();
        }
        V v = map.get(k);
        if (v != null || map.containsKey(k)) {
            return v;
        }
        StringBuilder sb = new StringBuilder("Key ");
        sb.append(k);
        sb.append(" is missing in the map.");
        throw new NoSuchElementException(sb.toString());
    }
}
