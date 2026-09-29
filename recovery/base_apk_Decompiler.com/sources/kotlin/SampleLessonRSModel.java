package kotlin;

/* JADX INFO: loaded from: classes4.dex */
public final class SampleLessonRSModel {
    public static boolean write(Object obj, Object obj2) {
        if (obj != obj2) {
            return (obj == null || obj2 == null || !obj.equals(obj2)) ? false : true;
        }
        return true;
    }

    public static int read(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }
}
