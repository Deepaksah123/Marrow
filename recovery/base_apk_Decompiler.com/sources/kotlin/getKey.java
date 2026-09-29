package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0087@\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\n\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0011\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u0004\u0010\u000fR\u0012\u0010\u0011\u001a\u00020\f8Ç\u0002¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0012\u0010\u0013\u001a\u00020\f8Ç\u0002¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0012\u0088\u0001\u0014\u0092\u0001\u00020\u0002"}, d2 = {"Lo/getKey;", "", "", "p0", "read", "(J)J", "", "AudioAttributesImplBaseParcelizer", "(J)Ljava/lang/String;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "J", "RemoteActionCompatParcelizer", "write", "(J)I", "AudioAttributesCompatParcelizer", "packedValue"}, k = 1, mv = {2, 0, 0}, xi = 48)
@submitMagicModule
public final class getKey {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long write = read(0);

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final long RemoteActionCompatParcelizer;

    public static final boolean AudioAttributesCompatParcelizer(long j, long j2) {
        return j == j2;
    }

    public static final int RemoteActionCompatParcelizer(long j) {
        return (int) j;
    }

    public static long read(long j) {
        return j;
    }

    public static final int write(long j) {
        return (int) (j >> 32);
    }

    private /* synthetic */ getKey(long j) {
        this.RemoteActionCompatParcelizer = j;
    }

    public static String AudioAttributesImplBaseParcelizer(long j) {
        StringBuilder sb = new StringBuilder();
        sb.append((int) (j >> 32));
        sb.append(" x ");
        sb.append((int) j);
        return sb.toString();
    }

    public final String toString() {
        return AudioAttributesImplBaseParcelizer(this.RemoteActionCompatParcelizer);
    }

    /* JADX INFO: renamed from: o.getKey$AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Lo/getKey$AudioAttributesCompatParcelizer;", "", "<init>", "()V", "Lo/getKey;", "write", "J", "RemoteActionCompatParcelizer", "()J", "IconCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final long RemoteActionCompatParcelizer() {
            return getKey.write;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    public static final /* synthetic */ getKey AudioAttributesCompatParcelizer(long j) {
        return new getKey(j);
    }

    public static boolean AudioAttributesCompatParcelizer(long j, Object obj) {
        return (obj instanceof getKey) && j == ((getKey) obj).getRemoteActionCompatParcelizer();
    }

    public static int IconCompatParcelizer(long j) {
        return Long.hashCode(j);
    }

    public final boolean equals(Object p0) {
        return AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer, p0);
    }

    public final int hashCode() {
        return IconCompatParcelizer(this.RemoteActionCompatParcelizer);
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final /* synthetic */ long getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }
}
