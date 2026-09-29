package kotlin;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class SubjectGroupTypeConstant {
    public static final <K> Map<K, Integer> write(Iterable<? extends K> iterable) {
        toMagicModuleMetaRepoModel.write(iterable, "");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<? extends K> it = iterable.iterator();
        int i = 0;
        while (it.hasNext()) {
            linkedHashMap.put(it.next(), Integer.valueOf(i));
            i++;
        }
        return linkedHashMap;
    }

    public static final <T> void write(Collection<T> collection, T t) {
        toMagicModuleMetaRepoModel.write(collection, "");
        if (t != null) {
            collection.add(t);
        }
    }

    public static final <K, V> HashMap<K, V> IconCompatParcelizer(int i) {
        return new HashMap<>(RemoteActionCompatParcelizer(i));
    }

    public static final <E> HashSet<E> read(int i) {
        return new HashSet<>(RemoteActionCompatParcelizer(i));
    }

    public static final <E> LinkedHashSet<E> write(int i) {
        return new LinkedHashSet<>(RemoteActionCompatParcelizer(i));
    }

    private static final int RemoteActionCompatParcelizer(int i) {
        if (i < 3) {
            return 3;
        }
        return i + (i / 3) + 1;
    }

    public static final <T> List<T> IconCompatParcelizer(ArrayList<T> arrayList) {
        toMagicModuleMetaRepoModel.write(arrayList, "");
        int size = arrayList.size();
        if (size == 0) {
            return IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
        }
        if (size == 1) {
            return IntermediateLoginResponseBody.RemoteActionCompatParcelizer(IntermediateLoginResponseBody.RatingCompat((List) arrayList));
        }
        arrayList.trimToSize();
        return arrayList;
    }
}
