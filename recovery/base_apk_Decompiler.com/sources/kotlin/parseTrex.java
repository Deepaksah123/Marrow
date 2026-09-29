package kotlin;

import java.util.Arrays;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class parseTrex {
    static <K, V> Map<K, V> RemoteActionCompatParcelizer(int i) {
        return AtomParsersTkhdData.RemoteActionCompatParcelizer(i);
    }

    static <K, V> Map<K, V> write() {
        return AtomParsersTkhdData.RemoteActionCompatParcelizer();
    }

    static <T> T[] read(T[] tArr, int i) {
        if (tArr.length != 0) {
            tArr = (T[]) Arrays.copyOf(tArr, 0);
        }
        return (T[]) Arrays.copyOf(tArr, i);
    }

    static <T> T[] RemoteActionCompatParcelizer(Object[] objArr, int i, int i2, T[] tArr) {
        return (T[]) Arrays.copyOfRange(objArr, i, i2, tArr.getClass());
    }
}
