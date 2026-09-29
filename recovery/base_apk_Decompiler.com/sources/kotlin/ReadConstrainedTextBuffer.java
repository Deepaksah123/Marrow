package kotlin;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087@\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\n\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000e\u0088\u0001\u0010\u0092\u0001\u00020\u0002"}, d2 = {"Lo/ReadConstrainedTextBuffer;", "", "", "p0", "RemoteActionCompatParcelizer", "(I)I", "", "read", "(I)Ljava/lang/String;", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "I", "write", AppMeasurementSdk.ConditionalUserProperty.VALUE}, k = 1, mv = {2, 0, 0}, xi = 48)
@submitMagicModule
public final class ReadConstrainedTextBuffer {
    private final int read;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final int IconCompatParcelizer = RemoteActionCompatParcelizer(0);
    private static final int RemoteActionCompatParcelizer = RemoteActionCompatParcelizer(1);

    public static int RemoteActionCompatParcelizer(int i) {
        return i;
    }

    public static final boolean write(int i, int i2) {
        return i == i2;
    }

    /* JADX INFO: renamed from: o.ReadConstrainedTextBuffer$write, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0007\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0005\u0010\b"}, d2 = {"Lo/ReadConstrainedTextBuffer$write;", "", "<init>", "()V", "Lo/ReadConstrainedTextBuffer;", "IconCompatParcelizer", "I", "RemoteActionCompatParcelizer", "()I"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final int RemoteActionCompatParcelizer() {
            return ReadConstrainedTextBuffer.IconCompatParcelizer;
        }

        public final int IconCompatParcelizer() {
            return ReadConstrainedTextBuffer.RemoteActionCompatParcelizer;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    public final String toString() {
        return read(this.read);
    }

    public static String read(int i) {
        return write(i, IconCompatParcelizer) ? "Difference" : write(i, RemoteActionCompatParcelizer) ? "Intersect" : "Unknown";
    }

    public static boolean RemoteActionCompatParcelizer(int i, Object obj) {
        return (obj instanceof ReadConstrainedTextBuffer) && i == ((ReadConstrainedTextBuffer) obj).getRead();
    }

    public static int IconCompatParcelizer(int i) {
        return Integer.hashCode(i);
    }

    public final boolean equals(Object p0) {
        return RemoteActionCompatParcelizer(this.read, p0);
    }

    public final int hashCode() {
        return IconCompatParcelizer(this.read);
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final /* synthetic */ int getRead() {
        return this.read;
    }
}
