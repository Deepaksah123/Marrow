package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087@\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\n\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0011\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0013\u001a\u00020\u00128G¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u00128G¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0014\u0088\u0001\u0016\u0092\u0001\u00020\u0002"}, d2 = {"Lo/hasParameter;", "", "", "p0", "write", "(J)J", "", "AudioAttributesImplBaseParcelizer", "(J)Ljava/lang/String;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "IconCompatParcelizer", "J", "AudioAttributesCompatParcelizer", "Lo/assignParameter;", "RemoteActionCompatParcelizer", "(J)F", "read", "packedValue"}, k = 1, mv = {2, 0, 0}, xi = 48)
@submitMagicModule
public final class hasParameter {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long RemoteActionCompatParcelizer = write(0);
    private static final long write = write(9205357640488583168L);

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final long AudioAttributesCompatParcelizer;

    public static long write(long j) {
        return j;
    }

    public static final boolean write(long j, long j2) {
        return j == j2;
    }

    private /* synthetic */ hasParameter(long j) {
        this.AudioAttributesCompatParcelizer = j;
    }

    public final String toString() {
        return AudioAttributesImplBaseParcelizer(this.AudioAttributesCompatParcelizer);
    }

    public static String AudioAttributesImplBaseParcelizer(long j) {
        if (j != 9205357640488583168L) {
            StringBuilder sb = new StringBuilder("(");
            sb.append((Object) assignParameter.RemoteActionCompatParcelizer(RemoteActionCompatParcelizer(j)));
            sb.append(", ");
            sb.append((Object) assignParameter.RemoteActionCompatParcelizer(read(j)));
            sb.append(')');
            return sb.toString();
        }
        return "DpOffset.Unspecified";
    }

    /* JADX INFO: renamed from: o.hasParameter$AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0006"}, d2 = {"Lo/hasParameter$AudioAttributesCompatParcelizer;", "", "<init>", "()V", "Lo/hasParameter;", "RemoteActionCompatParcelizer", "J", "IconCompatParcelizer", "write"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    public static final float RemoteActionCompatParcelizer(long j) {
        return assignParameter.IconCompatParcelizer(Float.intBitsToFloat((int) (j >> 32)));
    }

    public static final float read(long j) {
        return assignParameter.IconCompatParcelizer(Float.intBitsToFloat((int) j));
    }

    public static final /* synthetic */ hasParameter AudioAttributesCompatParcelizer(long j) {
        return new hasParameter(j);
    }

    public static boolean write(long j, Object obj) {
        return (obj instanceof hasParameter) && j == ((hasParameter) obj).getAudioAttributesCompatParcelizer();
    }

    public static int IconCompatParcelizer(long j) {
        return Long.hashCode(j);
    }

    public final boolean equals(Object p0) {
        return write(this.AudioAttributesCompatParcelizer, p0);
    }

    public final int hashCode() {
        return IconCompatParcelizer(this.AudioAttributesCompatParcelizer);
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final /* synthetic */ long getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }
}
