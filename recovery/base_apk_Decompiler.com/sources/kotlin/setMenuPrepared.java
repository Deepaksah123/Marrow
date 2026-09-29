package kotlin;

/* JADX INFO: loaded from: classes.dex */
@submitMagicModule
public final class setMenuPrepared {
    public final long read;

    private static long write(long j) {
        return j;
    }

    private static String AudioAttributesCompatParcelizer(long j) {
        StringBuilder sb = new StringBuilder("(");
        sb.append(Float.intBitsToFloat((int) (j >> 32)));
        sb.append(", ");
        sb.append(Float.intBitsToFloat((int) j));
        sb.append(')');
        return sb.toString();
    }

    public final String toString() {
        return AudioAttributesCompatParcelizer(this.read);
    }

    public static long write(float f, float f2) {
        long j = -1;
        return write((((long) Float.floatToRawIntBits(f2)) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)))) | (((long) Float.floatToRawIntBits(f)) << 32));
    }

    private static boolean read(long j, Object obj) {
        return (obj instanceof setMenuPrepared) && j == ((setMenuPrepared) obj).IconCompatParcelizer();
    }

    private static int IconCompatParcelizer(long j) {
        return Long.hashCode(j);
    }

    public final boolean equals(Object obj) {
        return read(this.read, obj);
    }

    public final int hashCode() {
        return IconCompatParcelizer(this.read);
    }

    private /* synthetic */ long IconCompatParcelizer() {
        return this.read;
    }
}
