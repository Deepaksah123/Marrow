package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0087@\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\n\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u000f\u0088\u0001\u0011\u0092\u0001\u00020\u0002"}, d2 = {"Lo/processUnwrapped;", "", "", "p0", "AudioAttributesCompatParcelizer", "(J)J", "", "read", "(J)Ljava/lang/String;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "J", "RemoteActionCompatParcelizer", "type"}, k = 1, mv = {2, 0, 0}, xi = 48)
@submitMagicModule
public final class processUnwrapped {
    private static final long RemoteActionCompatParcelizer;
    private static final long write;

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final long RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long IconCompatParcelizer = AudioAttributesCompatParcelizer(0);

    public static long AudioAttributesCompatParcelizer(long j) {
        return j;
    }

    public static final boolean read(long j, long j2) {
        return j == j2;
    }

    private /* synthetic */ processUnwrapped(long j) {
        this.RemoteActionCompatParcelizer = j;
    }

    public final String toString() {
        return read(this.RemoteActionCompatParcelizer);
    }

    public static String read(long j) {
        return read(j, IconCompatParcelizer) ? "Unspecified" : read(j, RemoteActionCompatParcelizer) ? "Sp" : read(j, write) ? "Em" : "Invalid";
    }

    /* JADX INFO: renamed from: o.processUnwrapped$read, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0007R\u001a\u0010\n\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0006\u001a\u0004\b\t\u0010\u0007R\u001a\u0010\t\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\n\u0010\u0007"}, d2 = {"Lo/processUnwrapped$read;", "", "<init>", "()V", "Lo/processUnwrapped;", "IconCompatParcelizer", "J", "()J", "RemoteActionCompatParcelizer", "read", "AudioAttributesCompatParcelizer", "write"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final long IconCompatParcelizer() {
            return processUnwrapped.IconCompatParcelizer;
        }

        public final long read() {
            return processUnwrapped.RemoteActionCompatParcelizer;
        }

        public final long AudioAttributesCompatParcelizer() {
            return processUnwrapped.write;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    static {
        long j = 0;
        RemoteActionCompatParcelizer = AudioAttributesCompatParcelizer((((long) 1) << 32) | (j - ((j >> 63) << 32)));
        long j2 = 0;
        write = AudioAttributesCompatParcelizer((((long) 2) << 32) | (j2 - ((j2 >> 63) << 32)));
    }

    public static final /* synthetic */ processUnwrapped write(long j) {
        return new processUnwrapped(j);
    }

    public static boolean AudioAttributesCompatParcelizer(long j, Object obj) {
        return (obj instanceof processUnwrapped) && j == ((processUnwrapped) obj).getRemoteActionCompatParcelizer();
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

    /* JADX INFO: renamed from: write, reason: from getter */
    public final /* synthetic */ long getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }
}
