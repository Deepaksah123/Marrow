package kotlin;

/* JADX INFO: loaded from: classes.dex */
public final class setHasPyt {
    public static int RemoteActionCompatParcelizer(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i > i2 ? 1 : 0;
    }

    public static int RemoteActionCompatParcelizer(long j, long j2) {
        if (j < j2) {
            return -1;
        }
        return j > j2 ? 1 : 0;
    }

    public static <T> T AudioAttributesCompatParcelizer(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    static {
        new AudioAttributesCompatParcelizer();
    }

    public static int read(int i, String str) {
        if (i > 0) {
            return i;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" > 0 required but it was ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    /* JADX INFO: loaded from: classes4.dex */
    static final class AudioAttributesCompatParcelizer {
        AudioAttributesCompatParcelizer() {
        }
    }
}
