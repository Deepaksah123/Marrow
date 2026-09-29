package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0087@\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u000fR\u0011\u0010\u0012\u001a\u00020\t8G¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011\u0088\u0001\u0013\u0092\u0001\u00020\u0002"}, d2 = {"Lo/init;", "", "", "p0", "write", "(J)J", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "J", "RemoteActionCompatParcelizer", "(J)I", "read", "packedValue"}, k = 1, mv = {2, 0, 0}, xi = 48)
@submitMagicModule
public final class init {
    private final long write;

    public static final int RemoteActionCompatParcelizer(long j) {
        return (int) j;
    }

    public static long write(long j) {
        return j;
    }

    private /* synthetic */ init(long j) {
        this.write = j;
    }

    public static final /* synthetic */ init AudioAttributesCompatParcelizer(long j) {
        return new init(j);
    }

    public static boolean RemoteActionCompatParcelizer(long j, Object obj) {
        return (obj instanceof init) && j == ((init) obj).getWrite();
    }

    public static int IconCompatParcelizer(long j) {
        return Long.hashCode(j);
    }

    public static String read(long j) {
        StringBuilder sb = new StringBuilder("GridItemSpan(packedValue=");
        sb.append(j);
        sb.append(')');
        return sb.toString();
    }

    public final boolean equals(Object p0) {
        return RemoteActionCompatParcelizer(this.write, p0);
    }

    public final int hashCode() {
        return IconCompatParcelizer(this.write);
    }

    public final String toString() {
        return read(this.write);
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final /* synthetic */ long getWrite() {
        return this.write;
    }
}
