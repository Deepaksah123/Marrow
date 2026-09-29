package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087@\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0007B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\tHÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010\u0088\u0001\u0012\u0092\u0001\u00020\u0002"}, d2 = {"Lo/setCustomerEmail;", "", "", "p0", "read", "(I)I", "", "AudioAttributesCompatParcelizer", "(I)Ljava/lang/String;", "", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "IconCompatParcelizer", "I", "write", "data"}, k = 1, mv = {2, 2, 0}, xi = 48)
@submitMagicModule
public final class setCustomerEmail implements Comparable<setCustomerEmail> {

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final int write;

    public static int read(int i) {
        return i;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(setCustomerEmail setcustomeremail) {
        return getBigButtonText.RemoteActionCompatParcelizer(getWrite(), setcustomeremail.getWrite());
    }

    private /* synthetic */ setCustomerEmail(int i) {
        this.write = i;
    }

    private static String AudioAttributesCompatParcelizer(int i) {
        long j = -1;
        return String.valueOf(((long) i) & ((((long) 0) << 32) | (j - ((j >> 63) << 32))));
    }

    public final String toString() {
        return AudioAttributesCompatParcelizer(this.write);
    }

    public static final /* synthetic */ setCustomerEmail IconCompatParcelizer(int i) {
        return new setCustomerEmail(i);
    }

    private static boolean write(int i, Object obj) {
        return (obj instanceof setCustomerEmail) && i == ((setCustomerEmail) obj).getWrite();
    }

    private static int RemoteActionCompatParcelizer(int i) {
        return Integer.hashCode(i);
    }

    public final boolean equals(Object p0) {
        return write(this.write, p0);
    }

    public final int hashCode() {
        return RemoteActionCompatParcelizer(this.write);
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final /* synthetic */ int getWrite() {
        return this.write;
    }
}
