package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0087@\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0011B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\tHÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0010\u0088\u0001\u0012\u0092\u0001\u00020\u0002"}, d2 = {"Lo/setClientId;", "", "", "p0", "RemoteActionCompatParcelizer", "(J)J", "", "write", "(J)Ljava/lang/String;", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "J", "IconCompatParcelizer", "data"}, k = 1, mv = {2, 2, 0}, xi = 48)
@submitMagicModule
public final class setClientId implements Comparable<setClientId> {

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final long IconCompatParcelizer;

    public static long RemoteActionCompatParcelizer(long j) {
        return j;
    }

    public static final boolean write(long j, long j2) {
        return j == j2;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(setClientId setclientid) {
        return getBigButtonText.RemoteActionCompatParcelizer(getIconCompatParcelizer(), setclientid.getIconCompatParcelizer());
    }

    private /* synthetic */ setClientId(long j) {
        this.IconCompatParcelizer = j;
    }

    private static String write(long j) {
        return getBigButtonText.AudioAttributesCompatParcelizer(j);
    }

    public final String toString() {
        return write(this.IconCompatParcelizer);
    }

    public static final /* synthetic */ setClientId read(long j) {
        return new setClientId(j);
    }

    private static boolean write(long j, Object obj) {
        return (obj instanceof setClientId) && j == ((setClientId) obj).getIconCompatParcelizer();
    }

    public static int IconCompatParcelizer(long j) {
        return Long.hashCode(j);
    }

    public final boolean equals(Object p0) {
        return write(this.IconCompatParcelizer, p0);
    }

    public final int hashCode() {
        return IconCompatParcelizer(this.IconCompatParcelizer);
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final /* synthetic */ long getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }
}
