package kotlin;

/* JADX INFO: loaded from: classes.dex */
@submitMagicModule
public final class setShowingForActionMode {
    public final long AudioAttributesCompatParcelizer;

    public static final int IconCompatParcelizer(long j) {
        return (int) (j >> 32);
    }

    private static long read(long j) {
        return j;
    }

    public static final int write(long j) {
        return (int) j;
    }

    private /* synthetic */ setShowingForActionMode(long j) {
        this.AudioAttributesCompatParcelizer = j;
    }

    public static long write(int i, int i2) {
        long j = -1;
        return read((((long) i2) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)))) | (((long) i) << 32));
    }

    private static String AudioAttributesImplApi26Parcelizer(long j) {
        StringBuilder sb = new StringBuilder("(");
        sb.append(IconCompatParcelizer(j));
        sb.append(", ");
        sb.append(write(j));
        sb.append(')');
        return sb.toString();
    }

    public final String toString() {
        return AudioAttributesImplApi26Parcelizer(this.AudioAttributesCompatParcelizer);
    }

    public static final /* synthetic */ setShowingForActionMode RemoteActionCompatParcelizer(long j) {
        return new setShowingForActionMode(j);
    }

    private static boolean read(long j, Object obj) {
        return (obj instanceof setShowingForActionMode) && j == ((setShowingForActionMode) obj).read();
    }

    private static int AudioAttributesCompatParcelizer(long j) {
        return Long.hashCode(j);
    }

    public final boolean equals(Object obj) {
        return read(this.AudioAttributesCompatParcelizer, obj);
    }

    public final int hashCode() {
        return AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer);
    }

    public final /* synthetic */ long read() {
        return this.AudioAttributesCompatParcelizer;
    }
}
