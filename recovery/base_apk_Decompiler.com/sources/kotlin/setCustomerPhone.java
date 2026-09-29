package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\n\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0087@\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0012B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\tHÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0007\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011\u0088\u0001\u0013\u0092\u0001\u00020\u0002"}, d2 = {"Lo/setCustomerPhone;", "", "", "p0", "IconCompatParcelizer", "(S)S", "", "write", "(S)Ljava/lang/String;", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "AudioAttributesCompatParcelizer", "S", "read", "data"}, k = 1, mv = {2, 2, 0}, xi = 48)
@submitMagicModule
public final class setCustomerPhone implements Comparable<setCustomerPhone> {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final short write;

    public static short IconCompatParcelizer(short s) {
        return s;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(setCustomerPhone setcustomerphone) {
        return toMagicModuleMetaRepoModel.read(getWrite() & 65535, setcustomerphone.getWrite() & 65535);
    }

    private /* synthetic */ setCustomerPhone(short s) {
        this.write = s;
    }

    private static String write(short s) {
        return String.valueOf(s & 65535);
    }

    public final String toString() {
        return write(this.write);
    }

    public static final /* synthetic */ setCustomerPhone AudioAttributesCompatParcelizer(short s) {
        return new setCustomerPhone(s);
    }

    private static boolean AudioAttributesCompatParcelizer(short s, Object obj) {
        return (obj instanceof setCustomerPhone) && s == ((setCustomerPhone) obj).getWrite();
    }

    private static int RemoteActionCompatParcelizer(short s) {
        return Short.hashCode(s);
    }

    public final boolean equals(Object p0) {
        return AudioAttributesCompatParcelizer(this.write, p0);
    }

    public final int hashCode() {
        return RemoteActionCompatParcelizer(this.write);
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final /* synthetic */ short getWrite() {
        return this.write;
    }
}
