package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087@\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\n\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\f\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\f\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\r\u0010\u0005J\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0017\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\b\u0010\u0016R\u0011\u0010\u0004\u001a\u00020\u00068G¢\u0006\u0006\u001a\u0004\b\n\u0010\u0018R\u0011\u0010\n\u001a\u00020\u00068G¢\u0006\u0006\u001a\u0004\b\f\u0010\u0018\u0088\u0001\u0019\u0092\u0001\u00020\u0002"}, d2 = {"Lo/hasReferringProperties;", "", "", "p0", "read", "(J)J", "", "p1", "RemoteActionCompatParcelizer", "(JII)J", "IconCompatParcelizer", "(JJ)J", "AudioAttributesCompatParcelizer", "AudioAttributesImplBaseParcelizer", "", "MediaBrowserCompatItemReceiver", "(J)Ljava/lang/String;", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "J", "write", "(J)I", "packedValue"}, k = 1, mv = {2, 0, 0}, xi = 48)
@submitMagicModule
public final class hasReferringProperties {

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final long write;

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long write = read(0);
    private static final long IconCompatParcelizer = read(9223372034707292159L);

    public static final int AudioAttributesCompatParcelizer(long j) {
        return (int) j;
    }

    public static final int IconCompatParcelizer(long j) {
        return (int) (j >> 32);
    }

    public static long read(long j) {
        return j;
    }

    public static final boolean write(long j, long j2) {
        return j == j2;
    }

    private /* synthetic */ hasReferringProperties(long j) {
        this.write = j;
    }

    public static /* synthetic */ long RemoteActionCompatParcelizer$default(long j, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = (int) (j >> 32);
        }
        if ((i3 & 2) != 0) {
            long j2 = -1;
            i2 = (int) (((((long) 0) << 32) | (j2 - ((j2 >> 63) << 32))) & j);
        }
        return RemoteActionCompatParcelizer(j, i, i2);
    }

    public static final long RemoteActionCompatParcelizer(long j, int i, int i2) {
        long j2 = -1;
        return read((((long) i) << 32) | (((long) i2) & ((((long) 0) << 32) | (j2 - ((j2 >> 63) << 32)))));
    }

    public static final long IconCompatParcelizer(long j, long j2) {
        long j3 = -1;
        return read((((long) (((int) j) - ((int) j2))) & ((((long) 0) << 32) | (j3 - ((j3 >> 63) << 32)))) | ((((int) (j >> 32)) - ((int) (j2 >> 32))) << 32));
    }

    public static final long AudioAttributesCompatParcelizer(long j, long j2) {
        long j3 = -1;
        return read((((long) (((int) j) + ((int) j2))) & ((((long) 0) << 32) | (j3 - ((j3 >> 63) << 32)))) | ((((int) (j >> 32)) + ((int) (j2 >> 32))) << 32));
    }

    public static final long AudioAttributesImplBaseParcelizer(long j) {
        long j2 = -1;
        return read((((long) (-((int) j))) & ((((long) 0) << 32) | (j2 - ((j2 >> 63) << 32)))) | (((long) (-((int) (j >> 32)))) << 32));
    }

    public static String MediaBrowserCompatItemReceiver(long j) {
        StringBuilder sb = new StringBuilder("(");
        sb.append(IconCompatParcelizer(j));
        sb.append(", ");
        sb.append(AudioAttributesCompatParcelizer(j));
        sb.append(')');
        return sb.toString();
    }

    public final String toString() {
        return MediaBrowserCompatItemReceiver(this.write);
    }

    /* JADX INFO: renamed from: o.hasReferringProperties$AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0007R\u001a\u0010\n\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0006\u001a\u0004\b\t\u0010\u0007"}, d2 = {"Lo/hasReferringProperties$AudioAttributesCompatParcelizer;", "", "<init>", "()V", "Lo/hasReferringProperties;", "write", "J", "()J", "IconCompatParcelizer", "RemoteActionCompatParcelizer", "AudioAttributesCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final long write() {
            return hasReferringProperties.write;
        }

        public final long RemoteActionCompatParcelizer() {
            return hasReferringProperties.IconCompatParcelizer;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    public static final /* synthetic */ hasReferringProperties write(long j) {
        return new hasReferringProperties(j);
    }

    public static boolean read(long j, Object obj) {
        return (obj instanceof hasReferringProperties) && j == ((hasReferringProperties) obj).getWrite();
    }

    public static int RemoteActionCompatParcelizer(long j) {
        return Long.hashCode(j);
    }

    public final boolean equals(Object p0) {
        return read(this.write, p0);
    }

    public final int hashCode() {
        return RemoteActionCompatParcelizer(this.write);
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final /* synthetic */ long getWrite() {
        return this.write;
    }
}
