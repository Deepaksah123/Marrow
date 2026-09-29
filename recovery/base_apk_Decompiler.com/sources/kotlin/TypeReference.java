package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0087@\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\n\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010\u0088\u0001\u0011\u0092\u0001\u00020\u0002"}, d2 = {"Lo/TypeReference;", "", "", "p0", "AudioAttributesCompatParcelizer", "(J)J", "", "IconCompatParcelizer", "(J)Ljava/lang/String;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "RemoteActionCompatParcelizer", "J", "packedValue"}, k = 1, mv = {2, 0, 0}, xi = 48)
@submitMagicModule
public final class TypeReference {

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final long IconCompatParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long AudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(0);

    public static long AudioAttributesCompatParcelizer(long j) {
        return j;
    }

    public static final boolean IconCompatParcelizer(long j, long j2) {
        return j == j2;
    }

    /* JADX INFO: renamed from: o.TypeReference$IconCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0007"}, d2 = {"Lo/TypeReference$IconCompatParcelizer;", "", "<init>", "()V", "Lo/TypeReference;", "AudioAttributesCompatParcelizer", "J", "()J", "read"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final long AudioAttributesCompatParcelizer() {
            return TypeReference.AudioAttributesCompatParcelizer;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    public final String toString() {
        return IconCompatParcelizer(this.IconCompatParcelizer);
    }

    public static String IconCompatParcelizer(long j) {
        int i = (int) (j >> 32);
        int i2 = (int) j;
        if (Float.intBitsToFloat(i) == Float.intBitsToFloat(i2)) {
            StringBuilder sb = new StringBuilder("CornerRadius.circular(");
            sb.append(isReferenceType.read(Float.intBitsToFloat(i), 1));
            sb.append(')');
            return sb.toString();
        }
        StringBuilder sb2 = new StringBuilder("CornerRadius.elliptical(");
        sb2.append(isReferenceType.read(Float.intBitsToFloat(i), 1));
        sb2.append(", ");
        sb2.append(isReferenceType.read(Float.intBitsToFloat(i2), 1));
        sb2.append(')');
        return sb2.toString();
    }

    public static boolean RemoteActionCompatParcelizer(long j, Object obj) {
        return (obj instanceof TypeReference) && j == ((TypeReference) obj).getIconCompatParcelizer();
    }

    public static int write(long j) {
        return Long.hashCode(j);
    }

    public final boolean equals(Object p0) {
        return RemoteActionCompatParcelizer(this.IconCompatParcelizer, p0);
    }

    public final int hashCode() {
        return write(this.IconCompatParcelizer);
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final /* synthetic */ long getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }
}
