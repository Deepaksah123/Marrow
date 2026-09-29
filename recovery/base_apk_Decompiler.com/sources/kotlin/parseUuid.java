package kotlin;

/* JADX INFO: loaded from: classes3.dex */
public final class parseUuid {
    public static <T> T[] write(T[] tArr, int i) {
        return (T[]) parseTrex.read(tArr, i);
    }

    static Object[] write(Object... objArr) {
        RemoteActionCompatParcelizer(objArr, objArr.length);
        return objArr;
    }

    static Object[] RemoteActionCompatParcelizer(Object[] objArr, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            write(objArr[i2], i2);
        }
        return objArr;
    }

    static Object write(Object obj, int i) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException("at index ".concat(String.valueOf(i)));
    }
}
