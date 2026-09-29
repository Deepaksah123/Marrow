package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0087@\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\n\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\f\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\f\u0010\u000bJ\u0018\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0006H\u0086\u0002¢\u0006\u0004\b\u0004\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0017R\u0011\u0010\u0019\u001a\u00020\u00068G¢\u0006\u0006\u001a\u0004\b\f\u0010\u0018R\u0011\u0010\b\u001a\u00020\u00068G¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0018\u0088\u0001\u001a\u0092\u0001\u00020\u0002"}, d2 = {"Lo/UnsupportedTypeDeserializer;", "", "", "p0", "IconCompatParcelizer", "(J)J", "", "p1", "write", "(JFF)J", "RemoteActionCompatParcelizer", "(JJ)J", "read", "(JF)J", "", "MediaBrowserCompatItemReceiver", "(J)Ljava/lang/String;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "J", "(J)F", "AudioAttributesCompatParcelizer", "packedValue"}, k = 1, mv = {2, 0, 0}, xi = 48)
@submitMagicModule
public final class UnsupportedTypeDeserializer {

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final long IconCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long AudioAttributesCompatParcelizer = IconCompatParcelizer(0);

    public static final boolean AudioAttributesCompatParcelizer(long j, long j2) {
        return j == j2;
    }

    public static long IconCompatParcelizer(long j) {
        return j;
    }

    private /* synthetic */ UnsupportedTypeDeserializer(long j) {
        this.IconCompatParcelizer = j;
    }

    /* JADX INFO: renamed from: o.UnsupportedTypeDeserializer$write, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Lo/UnsupportedTypeDeserializer$write;", "", "<init>", "()V", "Lo/UnsupportedTypeDeserializer;", "AudioAttributesCompatParcelizer", "J", "write", "()J", "RemoteActionCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final long write() {
            return UnsupportedTypeDeserializer.AudioAttributesCompatParcelizer;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    public static String MediaBrowserCompatItemReceiver(long j) {
        StringBuilder sb = new StringBuilder("(");
        sb.append(read(j));
        sb.append(", ");
        sb.append(AudioAttributesCompatParcelizer(j));
        sb.append(") px/sec");
        return sb.toString();
    }

    public final String toString() {
        return MediaBrowserCompatItemReceiver(this.IconCompatParcelizer);
    }

    public static final float read(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    public static final float AudioAttributesCompatParcelizer(long j) {
        return Float.intBitsToFloat((int) j);
    }

    public static final long write(long j, float f, float f2) {
        long j2 = -1;
        return IconCompatParcelizer((((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f2)) & ((((long) 0) << 32) | (j2 - ((j2 >> 63) << 32)))));
    }

    public static /* synthetic */ long write$default(long j, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = Float.intBitsToFloat((int) (j >> 32));
        }
        if ((i & 2) != 0) {
            long j2 = -1;
            f2 = Float.intBitsToFloat((int) (((((long) 0) << 32) | (j2 - ((j2 >> 63) << 32))) & j));
        }
        return write(j, f, f2);
    }

    public static final long RemoteActionCompatParcelizer(long j, long j2) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j2 >> 32));
        long j3 = -1;
        return IconCompatParcelizer((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) j) - Float.intBitsToFloat((int) j2))) & ((((long) 0) << 32) | (j3 - ((j3 >> 63) << 32)))) | (Float.floatToRawIntBits(fIntBitsToFloat - fIntBitsToFloat2) << 32));
    }

    public static final long read(long j, long j2) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j2 >> 32));
        long j3 = -1;
        return IconCompatParcelizer((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) j) + Float.intBitsToFloat((int) j2))) & ((((long) 0) << 32) | (j3 - ((j3 >> 63) << 32)))) | (Float.floatToRawIntBits(fIntBitsToFloat + fIntBitsToFloat2) << 32));
    }

    public static final long IconCompatParcelizer(long j, float f) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        long j2 = -1;
        return IconCompatParcelizer((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) j) * f)) & ((((long) 0) << 32) | (j2 - ((j2 >> 63) << 32)))) | (Float.floatToRawIntBits(fIntBitsToFloat * f) << 32));
    }

    public static final /* synthetic */ UnsupportedTypeDeserializer RemoteActionCompatParcelizer(long j) {
        return new UnsupportedTypeDeserializer(j);
    }

    public static boolean IconCompatParcelizer(long j, Object obj) {
        return (obj instanceof UnsupportedTypeDeserializer) && j == ((UnsupportedTypeDeserializer) obj).getIconCompatParcelizer();
    }

    public static int write(long j) {
        return Long.hashCode(j);
    }

    public final boolean equals(Object p0) {
        return IconCompatParcelizer(this.IconCompatParcelizer, p0);
    }

    public final int hashCode() {
        return write(this.IconCompatParcelizer);
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final /* synthetic */ long getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }
}
