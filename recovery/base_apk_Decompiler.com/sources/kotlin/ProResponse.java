package kotlin;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class ProResponse {
    public static final <E> E[] RemoteActionCompatParcelizer(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("capacity must be non-negative.".toString());
        }
        return (E[]) new Object[i];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> String AudioAttributesCompatParcelizer(T[] tArr, int i, int i2, Collection<? extends T> collection) {
        StringBuilder sb = new StringBuilder((i2 * 3) + 2);
        sb.append("[");
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            T t = tArr[i + i3];
            if (t == collection) {
                sb.append("(this Collection)");
            } else {
                sb.append(t);
            }
        }
        sb.append("]");
        String string = sb.toString();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
        return string;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> int read(T[] tArr, int i, int i2) {
        int iHashCode = 1;
        for (int i3 = 0; i3 < i2; i3++) {
            T t = tArr[i + i3];
            iHashCode = (iHashCode * 31) + (t != null ? t.hashCode() : 0);
        }
        return iHashCode;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> boolean read(T[] tArr, int i, int i2, List<?> list) {
        if (i2 != list.size()) {
            return false;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(tArr[i + i3], list.get(i3))) {
                return false;
            }
        }
        return true;
    }

    public static final <T> T[] RemoteActionCompatParcelizer(T[] tArr, int i) {
        toMagicModuleMetaRepoModel.write(tArr, "");
        T[] tArr2 = (T[]) Arrays.copyOf(tArr, i);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(tArr2, "");
        return tArr2;
    }

    public static final <E> void IconCompatParcelizer(E[] eArr, int i) {
        toMagicModuleMetaRepoModel.write(eArr, "");
        eArr[i] = null;
    }

    public static final <E> void write(E[] eArr, int i, int i2) {
        toMagicModuleMetaRepoModel.write(eArr, "");
        while (i < i2) {
            IconCompatParcelizer(eArr, i);
            i++;
        }
    }
}
