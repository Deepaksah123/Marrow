package kotlin;

/* JADX INFO: loaded from: classes4.dex */
public final class isRankPredicted {
    public static final boolean IconCompatParcelizer() {
        return false;
    }

    static {
        ThreadLocal[] threadLocalArr = new ThreadLocal[4];
        for (int i = 0; i < 4; i++) {
            threadLocalArr[i] = new ThreadLocal();
        }
    }
}
