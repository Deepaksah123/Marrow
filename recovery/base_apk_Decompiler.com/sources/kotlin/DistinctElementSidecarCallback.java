package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0081@\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0011\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010\u0088\u0001\u0012\u0092\u0001\u00020\u0002"}, d2 = {"Lo/DistinctElementSidecarCallback;", "", "", "p0", "RemoteActionCompatParcelizer", "(J)J", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "AudioAttributesImplApi21Parcelizer", "J", "write", "flag"}, k = 1, mv = {2, 0, 0}, xi = 48)
@submitMagicModule
public final class DistinctElementSidecarCallback {

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private final long write;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long AudioAttributesCompatParcelizer = RemoteActionCompatParcelizer(0);
    private static final long read = RemoteActionCompatParcelizer(1);
    private static final long IconCompatParcelizer = RemoteActionCompatParcelizer(2);
    private static final long RemoteActionCompatParcelizer = RemoteActionCompatParcelizer(3);

    private static long RemoteActionCompatParcelizer(long j) {
        return j;
    }

    /* JADX INFO: renamed from: o.DistinctElementSidecarCallback$write, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0007R\u001a\u0010\n\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\b\u0010\u0007R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0006\u001a\u0004\b\n\u0010\u0007R\u001a\u0010\t\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000b\u0010\u0007"}, d2 = {"Lo/DistinctElementSidecarCallback$write;", "", "<init>", "()V", "Lo/DistinctElementSidecarCallback;", "AudioAttributesCompatParcelizer", "J", "()J", "IconCompatParcelizer", "read", "RemoteActionCompatParcelizer", "write"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final long AudioAttributesCompatParcelizer() {
            return DistinctElementSidecarCallback.AudioAttributesCompatParcelizer;
        }

        public final long IconCompatParcelizer() {
            return DistinctElementSidecarCallback.read;
        }

        public final long RemoteActionCompatParcelizer() {
            return DistinctElementSidecarCallback.IconCompatParcelizer;
        }

        public final long write() {
            return DistinctElementSidecarCallback.RemoteActionCompatParcelizer;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    public static boolean read(long j, Object obj) {
        return (obj instanceof DistinctElementSidecarCallback) && j == ((DistinctElementSidecarCallback) obj).getWrite();
    }

    public static int write(long j) {
        return Long.hashCode(j);
    }

    public static String AudioAttributesCompatParcelizer(long j) {
        StringBuilder sb = new StringBuilder("LayoutCacheOperation(flag=");
        sb.append(j);
        sb.append(')');
        return sb.toString();
    }

    public final boolean equals(Object p0) {
        return read(this.write, p0);
    }

    public final int hashCode() {
        return write(this.write);
    }

    public final String toString() {
        return AudioAttributesCompatParcelizer(this.write);
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final /* synthetic */ long getWrite() {
        return this.write;
    }
}
