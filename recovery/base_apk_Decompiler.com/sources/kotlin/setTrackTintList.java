package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0081@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0011\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u0004\u0010\u000f\u0088\u0001\u0011\u0092\u0001\u00020\u0002"}, d2 = {"Lo/setTrackTintList;", "", "", "p0", "RemoteActionCompatParcelizer", "(J)J", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "J", "read", "packedValue"}, k = 1, mv = {2, 0, 0}, xi = 48)
@submitMagicModule
public final class setTrackTintList {

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final long read;

    public static long RemoteActionCompatParcelizer(long j) {
        return j;
    }

    public static boolean IconCompatParcelizer(long j, Object obj) {
        return (obj instanceof setTrackTintList) && j == ((setTrackTintList) obj).getRead();
    }

    public static int IconCompatParcelizer(long j) {
        return Long.hashCode(j);
    }

    public static String write(long j) {
        StringBuilder sb = new StringBuilder("Motion(packedValue=");
        sb.append(j);
        sb.append(')');
        return sb.toString();
    }

    public final boolean equals(Object p0) {
        return IconCompatParcelizer(this.read, p0);
    }

    public final int hashCode() {
        return IconCompatParcelizer(this.read);
    }

    public final String toString() {
        return write(this.read);
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final /* synthetic */ long getRead() {
        return this.read;
    }
}
