package kotlin;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087@\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\n\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000e\u0088\u0001\u0011\u0092\u0001\u00020\u0002"}, d2 = {"Lo/ThreadLocalBufferManager;", "", "", "p0", "AudioAttributesCompatParcelizer", "(I)I", "", "RemoteActionCompatParcelizer", "(I)Ljava/lang/String;", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "I", "IconCompatParcelizer", "read", AppMeasurementSdk.ConditionalUserProperty.VALUE}, k = 1, mv = {2, 0, 0}, xi = 48)
@submitMagicModule
public final class ThreadLocalBufferManager {

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final int IconCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final int AudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(0);
    private static final int write = AudioAttributesCompatParcelizer(1);

    public static int AudioAttributesCompatParcelizer(int i) {
        return i;
    }

    public static final boolean IconCompatParcelizer(int i, int i2) {
        return i == i2;
    }

    /* JADX INFO: renamed from: o.ThreadLocalBufferManager$read, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0007\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\t\u0010\b"}, d2 = {"Lo/ThreadLocalBufferManager$read;", "", "<init>", "()V", "Lo/ThreadLocalBufferManager;", "AudioAttributesCompatParcelizer", "I", "RemoteActionCompatParcelizer", "()I", "write", "IconCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final int RemoteActionCompatParcelizer() {
            return ThreadLocalBufferManager.AudioAttributesCompatParcelizer;
        }

        public final int write() {
            return ThreadLocalBufferManager.write;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    public final String toString() {
        return RemoteActionCompatParcelizer(this.IconCompatParcelizer);
    }

    public static String RemoteActionCompatParcelizer(int i) {
        return IconCompatParcelizer(i, AudioAttributesCompatParcelizer) ? "Fill" : IconCompatParcelizer(i, write) ? "Stroke" : "Unknown";
    }

    public static boolean read(int i, Object obj) {
        return (obj instanceof ThreadLocalBufferManager) && i == ((ThreadLocalBufferManager) obj).getIconCompatParcelizer();
    }

    public static int IconCompatParcelizer(int i) {
        return Integer.hashCode(i);
    }

    public final boolean equals(Object p0) {
        return read(this.IconCompatParcelizer, p0);
    }

    public final int hashCode() {
        return IconCompatParcelizer(this.IconCompatParcelizer);
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final /* synthetic */ int getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }
}
