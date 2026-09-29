package kotlin;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class parseSmta extends parsePaspFromParent {
    public static boolean AudioAttributesCompatParcelizer(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static int read(Object... objArr) {
        return Arrays.hashCode(objArr);
    }
}
