package kotlin;

import java.lang.reflect.Array;

/* JADX INFO: loaded from: classes.dex */
final class setActionBarHideOffset {
    static <T> T[] RemoteActionCompatParcelizer(T[] tArr, int i) {
        if (tArr.length < i) {
            return (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), i));
        }
        if (tArr.length > i) {
            tArr[i] = null;
        }
        return tArr;
    }
}
