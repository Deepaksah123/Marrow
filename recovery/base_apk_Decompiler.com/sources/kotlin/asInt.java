package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0087@\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\n\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0012\u0010\u0012\u001a\u00020\u00118Ç\u0002¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0012\u0010\u0007\u001a\u00020\u00118Ç\u0002¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0013\u0088\u0001\u0014\u0092\u0001\u00020\u0002"}, d2 = {"Lo/asInt;", "", "", "p0", "read", "(J)J", "", "RemoteActionCompatParcelizer", "(J)Ljava/lang/String;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "write", "J", "", "IconCompatParcelizer", "(J)F", "packedValue"}, k = 1, mv = {2, 0, 0}, xi = 48)
@submitMagicModule
public final class asInt {
    private static final long IconCompatParcelizer;
    private final long write;

    public static long read(long j) {
        return j;
    }

    public static String RemoteActionCompatParcelizer(long j) {
        StringBuilder sb = new StringBuilder("ScaleFactor(");
        sb.append(Float.intBitsToFloat((int) (j >> 32)));
        sb.append(", ");
        sb.append(Float.intBitsToFloat((int) j));
        sb.append(')');
        return sb.toString();
    }

    public final String toString() {
        return RemoteActionCompatParcelizer(this.write);
    }

    public static final float IconCompatParcelizer(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    public static final float write(long j) {
        return Float.intBitsToFloat((int) j);
    }

    static {
        long j = -1;
        IconCompatParcelizer = read((((long) Float.floatToRawIntBits(Float.NaN)) << 32) | (((long) Float.floatToRawIntBits(Float.NaN)) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)))));
    }

    public static boolean IconCompatParcelizer(long j, Object obj) {
        return (obj instanceof asInt) && j == ((asInt) obj).getWrite();
    }

    public static int AudioAttributesCompatParcelizer(long j) {
        return Long.hashCode(j);
    }

    public final boolean equals(Object p0) {
        return IconCompatParcelizer(this.write, p0);
    }

    public final int hashCode() {
        return AudioAttributesCompatParcelizer(this.write);
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final /* synthetic */ long getWrite() {
        return this.write;
    }
}
