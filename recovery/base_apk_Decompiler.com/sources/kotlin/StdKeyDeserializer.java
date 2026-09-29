package kotlin;

/* JADX INFO: loaded from: classes2.dex */
public final class StdKeyDeserializer {
    public static long AudioAttributesCompatParcelizer(long j, long j2) {
        if (j < 0) {
            return 0L;
        }
        return j > j2 ? j2 : j;
    }

    public static int read(int i, int i2, int i3) {
        return i < i2 ? i2 : i > i3 ? i3 : i;
    }

    public static float write(float f, float f2, float f3) {
        return f < f2 ? f2 : f > f3 ? f3 : f;
    }
}
