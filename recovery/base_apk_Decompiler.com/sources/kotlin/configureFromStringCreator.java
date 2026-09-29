package kotlin;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public class configureFromStringCreator {
    public static <T> T IconCompatParcelizer(T t) {
        return t;
    }

    public static boolean RemoteActionCompatParcelizer(Object obj, Object obj2) {
        return Objects.equals(obj, obj2);
    }

    public static int RemoteActionCompatParcelizer(Object... objArr) {
        return Objects.hash(objArr);
    }

    public static String RemoteActionCompatParcelizer(Object obj, String str) {
        return obj != null ? obj.toString() : str;
    }

    public static <T> T AudioAttributesCompatParcelizer(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }
}
