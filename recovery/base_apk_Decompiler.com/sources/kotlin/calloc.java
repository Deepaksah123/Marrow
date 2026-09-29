package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0087@\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\f\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0012\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u0004\u0010\u0011R\u0012\u0010\u0016\u001a\u00020\u00138Ç\u0002¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0012\u0010\u0017\u001a\u00020\u00138Ç\u0002¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0015R\u0011\u0010\u0014\u001a\u00020\u00138G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0015\u0088\u0001\u0018\u0092\u0001\u00020\u0002"}, d2 = {"Lo/calloc;", "", "", "p0", "write", "(J)J", "", "MediaBrowserCompatCustomActionResultReceiver", "(J)Z", "", "MediaBrowserCompatItemReceiver", "(J)Ljava/lang/String;", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "J", "IconCompatParcelizer", "", "AudioAttributesCompatParcelizer", "(J)F", "RemoteActionCompatParcelizer", "read", "packedValue"}, k = 1, mv = {2, 0, 0}, xi = 48)
@submitMagicModule
public final class calloc {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long IconCompatParcelizer = write(0);
    private static final long RemoteActionCompatParcelizer = write(9205357640488583168L);

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final long IconCompatParcelizer;

    public static final boolean RemoteActionCompatParcelizer(long j, long j2) {
        return j == j2;
    }

    public static long write(long j) {
        return j;
    }

    private /* synthetic */ calloc(long j) {
        this.IconCompatParcelizer = j;
    }

    /* JADX INFO: renamed from: o.calloc$AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u0005\u0010\b"}, d2 = {"Lo/calloc$AudioAttributesCompatParcelizer;", "", "<init>", "()V", "Lo/calloc;", "IconCompatParcelizer", "J", "AudioAttributesCompatParcelizer", "()J", "write", "RemoteActionCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final long AudioAttributesCompatParcelizer() {
            return calloc.IconCompatParcelizer;
        }

        public final long IconCompatParcelizer() {
            return calloc.RemoteActionCompatParcelizer;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    public final String toString() {
        return MediaBrowserCompatItemReceiver(this.IconCompatParcelizer);
    }

    public static String MediaBrowserCompatItemReceiver(long j) {
        if (j != 9205357640488583168L) {
            StringBuilder sb = new StringBuilder("Size(");
            sb.append(isReferenceType.read(Float.intBitsToFloat((int) (j >> 32)), 1));
            sb.append(", ");
            sb.append(isReferenceType.read(Float.intBitsToFloat((int) j), 1));
            sb.append(')');
            return sb.toString();
        }
        return "Size.Unspecified";
    }

    public static final float AudioAttributesCompatParcelizer(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    public static final float RemoteActionCompatParcelizer(long j) {
        return Float.intBitsToFloat((int) j);
    }

    public static final boolean MediaBrowserCompatCustomActionResultReceiver(long j) {
        return (j == 9205357640488583168L) | (Float.intBitsToFloat((int) (j >> 32)) <= BitmapDescriptorFactory.HUE_RED) | (Float.intBitsToFloat((int) j) <= BitmapDescriptorFactory.HUE_RED);
    }

    public static final float IconCompatParcelizer(long j) {
        return Math.min(Float.intBitsToFloat((int) ((j >> 32) & 2147483647L)), Float.intBitsToFloat((int) (j & 2147483647L)));
    }

    public static final /* synthetic */ calloc read(long j) {
        return new calloc(j);
    }

    public static boolean AudioAttributesCompatParcelizer(long j, Object obj) {
        return (obj instanceof calloc) && j == ((calloc) obj).getIconCompatParcelizer();
    }

    public static int AudioAttributesImplBaseParcelizer(long j) {
        return Long.hashCode(j);
    }

    public final boolean equals(Object p0) {
        return AudioAttributesCompatParcelizer(this.IconCompatParcelizer, p0);
    }

    public final int hashCode() {
        return AudioAttributesImplBaseParcelizer(this.IconCompatParcelizer);
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final /* synthetic */ long getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }
}
