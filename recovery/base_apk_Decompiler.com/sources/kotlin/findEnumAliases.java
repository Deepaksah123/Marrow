package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0087@\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\n\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0013\u001a\u00020\f8G¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012\u0088\u0001\u0015\u0092\u0001\u00020\u0002"}, d2 = {"Lo/findEnumAliases;", "", "", "p0", "read", "(J)J", "", "write", "(J)Ljava/lang/String;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "MediaBrowserCompatItemReceiver", "J", "AudioAttributesCompatParcelizer", "(J)I", "IconCompatParcelizer", "RemoteActionCompatParcelizer", "packedValue"}, k = 1, mv = {2, 0, 0}, xi = 48)
@submitMagicModule
public final class findEnumAliases {
    private static final long write;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private final long AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long read = read(12884901889L);
    private static final long AudioAttributesCompatParcelizer = read(12884901890L);
    private static final long IconCompatParcelizer = read(17179869187L);

    public static final int AudioAttributesCompatParcelizer(long j) {
        return (int) (j >> 32);
    }

    public static long read(long j) {
        return j;
    }

    public static final boolean write(long j, long j2) {
        return j == j2;
    }

    /* JADX INFO: renamed from: o.findEnumAliases$RemoteActionCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0007R\u001a\u0010\n\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\t\u0010\u0007R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000b\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006"}, d2 = {"Lo/findEnumAliases$RemoteActionCompatParcelizer;", "", "<init>", "()V", "Lo/findEnumAliases;", "write", "J", "()J", "RemoteActionCompatParcelizer", "read", "AudioAttributesCompatParcelizer", "IconCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final long write() {
            return findEnumAliases.write;
        }

        public final long read() {
            return findEnumAliases.read;
        }

        public final long IconCompatParcelizer() {
            return findEnumAliases.AudioAttributesCompatParcelizer;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    static {
        long j = 0;
        write = read((((long) 3) << 32) | (j - ((j >> 63) << 32)));
    }

    public final String toString() {
        return write(this.AudioAttributesCompatParcelizer);
    }

    public static String write(long j) {
        return write(j, write) ? "Rgb" : write(j, read) ? "Xyz" : write(j, AudioAttributesCompatParcelizer) ? "Lab" : write(j, IconCompatParcelizer) ? "Cmyk" : "Unknown";
    }

    public static boolean RemoteActionCompatParcelizer(long j, Object obj) {
        return (obj instanceof findEnumAliases) && j == ((findEnumAliases) obj).getAudioAttributesCompatParcelizer();
    }

    public static int IconCompatParcelizer(long j) {
        return Long.hashCode(j);
    }

    public final boolean equals(Object p0) {
        return RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, p0);
    }

    public final int hashCode() {
        return IconCompatParcelizer(this.AudioAttributesCompatParcelizer);
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final /* synthetic */ long getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }
}
