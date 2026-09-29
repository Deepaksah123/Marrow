package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0081@\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u000e\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0016R\u0011\u0010\b\u001a\u00020\u00068G¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0017\u001a\u00020\u00068G¢\u0006\u0006\u001a\u0004\b\b\u0010\u0018\u0088\u0001\u0019\u0092\u0001\u00020\u0002"}, d2 = {"Lo/endRearDisplaySession;", "", "", "p0", "IconCompatParcelizer", "(J)J", "", "p1", "AudioAttributesCompatParcelizer", "(FF)J", "Lo/bufferMapProperty;", "RemoteActionCompatParcelizer", "(Lo/bufferMapProperty;)J", "", "read", "(J)Ljava/lang/String;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "J", "write", "(J)F", "packedValue"}, k = 1, mv = {2, 0, 0}, xi = 48)
@submitMagicModule
public final class endRearDisplaySession {

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long RemoteActionCompatParcelizer = AudioAttributesCompatParcelizer(Float.NaN, Float.NaN);

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final long read;

    public static final boolean AudioAttributesCompatParcelizer(long j, long j2) {
        return j == j2;
    }

    private static long IconCompatParcelizer(long j) {
        return j;
    }

    public static long RemoteActionCompatParcelizer(bufferMapProperty buffermapproperty) {
        return AudioAttributesCompatParcelizer(buffermapproperty.getWrite(), buffermapproperty.getRead());
    }

    public final String toString() {
        return read(this.read);
    }

    public static String read(long j) {
        StringBuilder sb = new StringBuilder("InlineDensity(density=");
        sb.append(write(j));
        sb.append(", fontScale=");
        sb.append(AudioAttributesCompatParcelizer(j));
        sb.append(')');
        return sb.toString();
    }

    /* JADX INFO: renamed from: o.endRearDisplaySession$IconCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Lo/endRearDisplaySession$IconCompatParcelizer;", "", "<init>", "()V", "Lo/endRearDisplaySession;", "RemoteActionCompatParcelizer", "J", "write", "()J"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final long write() {
            return endRearDisplaySession.RemoteActionCompatParcelizer;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    public static long AudioAttributesCompatParcelizer(float f, float f2) {
        long j = -1;
        return IconCompatParcelizer((((long) Float.floatToRawIntBits(f2)) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)))) | (((long) Float.floatToRawIntBits(f)) << 32));
    }

    public static final float write(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    public static final float AudioAttributesCompatParcelizer(long j) {
        return Float.intBitsToFloat((int) j);
    }

    public static boolean RemoteActionCompatParcelizer(long j, Object obj) {
        return (obj instanceof endRearDisplaySession) && j == ((endRearDisplaySession) obj).getRead();
    }

    public static int RemoteActionCompatParcelizer(long j) {
        return Long.hashCode(j);
    }

    public final boolean equals(Object p0) {
        return RemoteActionCompatParcelizer(this.read, p0);
    }

    public final int hashCode() {
        return RemoteActionCompatParcelizer(this.read);
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final /* synthetic */ long getRead() {
        return this.read;
    }
}
