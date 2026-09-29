package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0081@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u0007\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0007\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rR\u0011\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f\u0088\u0001\u0010\u0092\u0001\u00020\u0002"}, d2 = {"Lo/intValue;", "", "", "p0", "read", "(J)J", "", "write", "(J)Ljava/lang/String;", "", "(JLjava/lang/Object;)Z", "", "IconCompatParcelizer", "(J)I", "AudioAttributesCompatParcelizer", "J", "packedValue"}, k = 1, mv = {2, 0, 0}, xi = 48)
@submitMagicModule
public final class intValue {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final long write;

    public static long read(long j) {
        return j;
    }

    public static final boolean write(long j, long j2) {
        return j == j2;
    }

    public final String toString() {
        return write(this.write);
    }

    public static String write(long j) {
        StringBuilder sb = new StringBuilder("ValueInsets(");
        sb.append((int) ((j >>> 48) & 65535));
        sb.append(", ");
        sb.append((int) ((j >>> 32) & 65535));
        sb.append(", ");
        sb.append((int) ((j >>> 16) & 65535));
        sb.append(", ");
        sb.append((int) (j & 65535));
        sb.append(')');
        return sb.toString();
    }

    public static boolean write(long j, Object obj) {
        return (obj instanceof intValue) && j == ((intValue) obj).getWrite();
    }

    public static int IconCompatParcelizer(long j) {
        return Long.hashCode(j);
    }

    public final boolean equals(Object obj) {
        return write(this.write, obj);
    }

    public final int hashCode() {
        return IconCompatParcelizer(this.write);
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final /* synthetic */ long getWrite() {
        return this.write;
    }
}
