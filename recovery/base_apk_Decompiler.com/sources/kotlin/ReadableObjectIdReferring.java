package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0087@\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\n\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0004\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00028AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0005R\u0011\u0010\u000f\u001a\u00020\u00128G¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0005R\u0011\u0010\u0013\u001a\u00020\t8G¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0017\u001a\u00020\u00168G¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018\u0088\u0001\u0019\u0092\u0001\u00020\u0002"}, d2 = {"Lo/ReadableObjectIdReferring;", "", "", "p0", "IconCompatParcelizer", "(J)J", "", "AudioAttributesImplApi21Parcelizer", "(J)Ljava/lang/String;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "RemoteActionCompatParcelizer", "J", "read", "Lo/processUnwrapped;", "write", "MediaBrowserCompatCustomActionResultReceiver", "(J)Z", "", "AudioAttributesCompatParcelizer", "(J)F", "packedValue"}, k = 1, mv = {2, 0, 0}, xi = 48)
@submitMagicModule
public final class ReadableObjectIdReferring {

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final long IconCompatParcelizer;

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final processUnwrapped[] write = {processUnwrapped.write(processUnwrapped.INSTANCE.IconCompatParcelizer()), processUnwrapped.write(processUnwrapped.INSTANCE.read()), processUnwrapped.write(processUnwrapped.INSTANCE.AudioAttributesCompatParcelizer())};
    private static final long read = setResolver.IconCompatParcelizer(0L, Float.NaN);

    public static final boolean AudioAttributesCompatParcelizer(long j, long j2) {
        return j == j2;
    }

    public static long IconCompatParcelizer(long j) {
        return j;
    }

    public static final long RemoteActionCompatParcelizer(long j) {
        return j & 1095216660480L;
    }

    private /* synthetic */ ReadableObjectIdReferring(long j) {
        this.IconCompatParcelizer = j;
    }

    public final String toString() {
        return AudioAttributesImplApi21Parcelizer(this.IconCompatParcelizer);
    }

    public static String AudioAttributesImplApi21Parcelizer(long j) {
        long jWrite = write(j);
        if (processUnwrapped.read(jWrite, processUnwrapped.INSTANCE.IconCompatParcelizer())) {
            return "Unspecified";
        }
        if (processUnwrapped.read(jWrite, processUnwrapped.INSTANCE.read())) {
            StringBuilder sb = new StringBuilder();
            sb.append(AudioAttributesCompatParcelizer(j));
            sb.append(".sp");
            return sb.toString();
        }
        if (!processUnwrapped.read(jWrite, processUnwrapped.INSTANCE.AudioAttributesCompatParcelizer())) {
            return "Invalid";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(AudioAttributesCompatParcelizer(j));
        sb2.append(".em");
        return sb2.toString();
    }

    /* JADX INFO: renamed from: o.ReadableObjectIdReferring$AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001a\u0010\r\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\f"}, d2 = {"Lo/ReadableObjectIdReferring$AudioAttributesCompatParcelizer;", "", "<init>", "()V", "", "Lo/processUnwrapped;", "write", "[Lo/processUnwrapped;", "IconCompatParcelizer", "Lo/ReadableObjectIdReferring;", "read", "J", "()J", "AudioAttributesCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final long IconCompatParcelizer() {
            return ReadableObjectIdReferring.read;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    public static final long write(long j) {
        return write[(int) (RemoteActionCompatParcelizer(j) >>> 32)].getRemoteActionCompatParcelizer();
    }

    public static final boolean MediaBrowserCompatCustomActionResultReceiver(long j) {
        long j2 = 0;
        return RemoteActionCompatParcelizer(j) == ((((long) 2) << 32) | (j2 - ((j2 >> 63) << 32)));
    }

    public static final float AudioAttributesCompatParcelizer(long j) {
        return Float.intBitsToFloat((int) j);
    }

    public static final /* synthetic */ ReadableObjectIdReferring read(long j) {
        return new ReadableObjectIdReferring(j);
    }

    public static boolean IconCompatParcelizer(long j, Object obj) {
        return (obj instanceof ReadableObjectIdReferring) && j == ((ReadableObjectIdReferring) obj).getIconCompatParcelizer();
    }

    public static int MediaBrowserCompatItemReceiver(long j) {
        return Long.hashCode(j);
    }

    public final boolean equals(Object p0) {
        return IconCompatParcelizer(this.IconCompatParcelizer, p0);
    }

    public final int hashCode() {
        return MediaBrowserCompatItemReceiver(this.IconCompatParcelizer);
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final /* synthetic */ long getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }
}
