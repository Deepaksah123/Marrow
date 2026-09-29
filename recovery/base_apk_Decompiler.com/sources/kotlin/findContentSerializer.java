package kotlin;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087@\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\n\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f\u0088\u0001\u0010\u0092\u0001\u00020\u0002"}, d2 = {"Lo/findContentSerializer;", "", "", "p0", "write", "(I)I", "", "RemoteActionCompatParcelizer", "(I)Ljava/lang/String;", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "MediaBrowserCompatItemReceiver", "I", AppMeasurementSdk.ConditionalUserProperty.VALUE}, k = 1, mv = {2, 0, 0}, xi = 48)
@submitMagicModule
public final class findContentSerializer {

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private final int write;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final int AudioAttributesCompatParcelizer = write(0);
    private static final int IconCompatParcelizer = write(1);
    private static final int read = write(2);
    private static final int write = write(3);

    public static final boolean IconCompatParcelizer(int i, int i2) {
        return i == i2;
    }

    public static int write(int i) {
        return i;
    }

    /* JADX INFO: renamed from: o.findContentSerializer$RemoteActionCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0007R\u001a\u0010\n\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\b\u0010\u0007R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\u000b\u0010\u0007R\u001a\u0010\u000b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0006\u001a\u0004\b\n\u0010\u0007"}, d2 = {"Lo/findContentSerializer$RemoteActionCompatParcelizer;", "", "<init>", "()V", "Lo/findContentSerializer;", "AudioAttributesCompatParcelizer", "I", "()I", "write", "IconCompatParcelizer", "RemoteActionCompatParcelizer", "read"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final int AudioAttributesCompatParcelizer() {
            return findContentSerializer.AudioAttributesCompatParcelizer;
        }

        public final int write() {
            return findContentSerializer.IconCompatParcelizer;
        }

        public final int read() {
            return findContentSerializer.read;
        }

        public final int RemoteActionCompatParcelizer() {
            return findContentSerializer.write;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    public final String toString() {
        return RemoteActionCompatParcelizer(this.write);
    }

    public static String RemoteActionCompatParcelizer(int i) {
        return IconCompatParcelizer(i, AudioAttributesCompatParcelizer) ? "Clamp" : IconCompatParcelizer(i, IconCompatParcelizer) ? "Repeated" : IconCompatParcelizer(i, read) ? "Mirror" : IconCompatParcelizer(i, write) ? "Decal" : "Unknown";
    }

    public static boolean AudioAttributesCompatParcelizer(int i, Object obj) {
        return (obj instanceof findContentSerializer) && i == ((findContentSerializer) obj).getWrite();
    }

    public static int AudioAttributesCompatParcelizer(int i) {
        return Integer.hashCode(i);
    }

    public final boolean equals(Object p0) {
        return AudioAttributesCompatParcelizer(this.write, p0);
    }

    public final int hashCode() {
        return AudioAttributesCompatParcelizer(this.write);
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final /* synthetic */ int getWrite() {
        return this.write;
    }
}
