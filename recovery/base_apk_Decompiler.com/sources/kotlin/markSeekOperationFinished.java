package kotlin;

import android.util.SparseArray;
import java.util.HashMap;

/* JADX INFO: loaded from: classes5.dex */
public final class markSeekOperationFinished {
    private static SparseArray<DrmUtilApi21> RemoteActionCompatParcelizer = new SparseArray<>();
    private static HashMap<DrmUtilApi21, Integer> read;

    static {
        HashMap<DrmUtilApi21, Integer> map = new HashMap<>();
        read = map;
        map.put(DrmUtilApi21.DEFAULT, 0);
        read.put(DrmUtilApi21.VERY_LOW, 1);
        read.put(DrmUtilApi21.HIGHEST, 2);
        for (DrmUtilApi21 drmUtilApi21 : read.keySet()) {
            RemoteActionCompatParcelizer.append(read.get(drmUtilApi21).intValue(), drmUtilApi21);
        }
    }

    public static DrmUtilApi21 RemoteActionCompatParcelizer(int i) {
        DrmUtilApi21 drmUtilApi21 = RemoteActionCompatParcelizer.get(i);
        if (drmUtilApi21 != null) {
            return drmUtilApi21;
        }
        throw new IllegalArgumentException("Unknown Priority for value ".concat(String.valueOf(i)));
    }

    public static int write(DrmUtilApi21 drmUtilApi21) {
        Integer num = read.get(drmUtilApi21);
        if (num == null) {
            throw new IllegalStateException("PriorityMapping is missing known Priority value ".concat(String.valueOf(drmUtilApi21)));
        }
        return num.intValue();
    }
}
