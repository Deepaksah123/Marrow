package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0087@\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u00128G¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0013R\u0011\u0010\u0015\u001a\u00020\u00128G¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0013\u0088\u0001\u0016\u0092\u0001\u00020\u0002"}, d2 = {"Lo/findCreatorAnnotation;", "", "", "p0", "AudioAttributesCompatParcelizer", "(J)J", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "RemoteActionCompatParcelizer", "J", "read", "", "(J)F", "write", "IconCompatParcelizer", "packedValue"}, k = 1, mv = {2, 0, 0}, xi = 48)
@submitMagicModule
public final class findCreatorAnnotation {

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long write = findDeserializationConverter.read(0.5f, 0.5f);

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final long read;

    public static long AudioAttributesCompatParcelizer(long j) {
        return j;
    }

    public static final boolean IconCompatParcelizer(long j, long j2) {
        return j == j2;
    }

    private /* synthetic */ findCreatorAnnotation(long j) {
        this.read = j;
    }

    /* JADX INFO: renamed from: o.findCreatorAnnotation$IconCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Lo/findCreatorAnnotation$IconCompatParcelizer;", "", "<init>", "()V", "Lo/findCreatorAnnotation;", "write", "J", "AudioAttributesCompatParcelizer", "()J", "IconCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final long AudioAttributesCompatParcelizer() {
            return findCreatorAnnotation.write;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    public static final float read(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    public static final float write(long j) {
        return Float.intBitsToFloat((int) j);
    }

    public static final /* synthetic */ findCreatorAnnotation RemoteActionCompatParcelizer(long j) {
        return new findCreatorAnnotation(j);
    }

    public static boolean IconCompatParcelizer(long j, Object obj) {
        return (obj instanceof findCreatorAnnotation) && j == ((findCreatorAnnotation) obj).getRead();
    }

    public static int IconCompatParcelizer(long j) {
        return Long.hashCode(j);
    }

    public static String MediaBrowserCompatCustomActionResultReceiver(long j) {
        StringBuilder sb = new StringBuilder("TransformOrigin(packedValue=");
        sb.append(j);
        sb.append(')');
        return sb.toString();
    }

    public final boolean equals(Object p0) {
        return IconCompatParcelizer(this.read, p0);
    }

    public final int hashCode() {
        return IconCompatParcelizer(this.read);
    }

    public final String toString() {
        return MediaBrowserCompatCustomActionResultReceiver(this.read);
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final /* synthetic */ long getRead() {
        return this.read;
    }
}
