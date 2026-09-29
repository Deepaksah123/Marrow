package kotlin;

/* JADX INFO: loaded from: classes3.dex */
public final class parseCommentAttribute {
    public static int IconCompatParcelizer(boolean z, boolean z2) {
        if (z == z2) {
            return 0;
        }
        return z ? 1 : -1;
    }

    public static boolean RemoteActionCompatParcelizer(boolean[] zArr) {
        for (boolean z : zArr) {
            if (z) {
                return true;
            }
        }
        return false;
    }
}
