package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\u0005\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087@\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0007B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\tHÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0007\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0010\u0088\u0001\u0011\u0092\u0001\u00020\u0002"}, d2 = {"Lo/setClientAuthToken;", "", "", "p0", "IconCompatParcelizer", "(B)B", "", "read", "(B)Ljava/lang/String;", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "B", "data"}, k = 1, mv = {2, 2, 0}, xi = 48)
@submitMagicModule
public final class setClientAuthToken implements Comparable<setClientAuthToken> {

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final byte read;

    public static byte IconCompatParcelizer(byte b) {
        return b;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(setClientAuthToken setclientauthtoken) {
        return toMagicModuleMetaRepoModel.read(getRead() & 255, setclientauthtoken.getRead() & 255);
    }

    private /* synthetic */ setClientAuthToken(byte b) {
        this.read = b;
    }

    private static String read(byte b) {
        return String.valueOf(b & 255);
    }

    public final String toString() {
        return read(this.read);
    }

    public static final /* synthetic */ setClientAuthToken AudioAttributesCompatParcelizer(byte b) {
        return new setClientAuthToken(b);
    }

    private static boolean read(byte b, Object obj) {
        return (obj instanceof setClientAuthToken) && b == ((setClientAuthToken) obj).getRead();
    }

    private static int write(byte b) {
        return Byte.hashCode(b);
    }

    public final boolean equals(Object p0) {
        return read(this.read, p0);
    }

    public final int hashCode() {
        return write(this.read);
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final /* synthetic */ byte getRead() {
        return this.read;
    }
}
