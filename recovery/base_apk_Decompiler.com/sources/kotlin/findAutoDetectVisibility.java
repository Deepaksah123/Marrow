package kotlin;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087@\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\n\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f\u0088\u0001\u0011\u0092\u0001\u00020\u0002"}, d2 = {"Lo/findAutoDetectVisibility;", "", "", "p0", "RemoteActionCompatParcelizer", "(I)I", "", "IconCompatParcelizer", "(I)Ljava/lang/String;", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "write", "I", "AudioAttributesCompatParcelizer", AppMeasurementSdk.ConditionalUserProperty.VALUE}, k = 1, mv = {2, 0, 0}, xi = 48)
@submitMagicModule
public final class findAutoDetectVisibility {

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final int AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final int read = RemoteActionCompatParcelizer(0);
    private static final int RemoteActionCompatParcelizer = RemoteActionCompatParcelizer(1);
    private static final int AudioAttributesCompatParcelizer = RemoteActionCompatParcelizer(2);

    public static final boolean AudioAttributesCompatParcelizer(int i, int i2) {
        return i == i2;
    }

    public static int RemoteActionCompatParcelizer(int i) {
        return i;
    }

    /* JADX INFO: renamed from: o.findAutoDetectVisibility$IconCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0007R\u001a\u0010\b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0006\u001a\u0004\b\b\u0010\u0007R\u001a\u0010\n\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0007"}, d2 = {"Lo/findAutoDetectVisibility$IconCompatParcelizer;", "", "<init>", "()V", "Lo/findAutoDetectVisibility;", "read", "I", "()I", "RemoteActionCompatParcelizer", "AudioAttributesCompatParcelizer", "IconCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final int read() {
            return findAutoDetectVisibility.read;
        }

        public final int RemoteActionCompatParcelizer() {
            return findAutoDetectVisibility.RemoteActionCompatParcelizer;
        }

        public final int IconCompatParcelizer() {
            return findAutoDetectVisibility.AudioAttributesCompatParcelizer;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    public final String toString() {
        return IconCompatParcelizer(this.AudioAttributesCompatParcelizer);
    }

    public static String IconCompatParcelizer(int i) {
        return AudioAttributesCompatParcelizer(i, read) ? "Butt" : AudioAttributesCompatParcelizer(i, RemoteActionCompatParcelizer) ? "Round" : AudioAttributesCompatParcelizer(i, AudioAttributesCompatParcelizer) ? "Square" : "Unknown";
    }

    public static boolean write(int i, Object obj) {
        return (obj instanceof findAutoDetectVisibility) && i == ((findAutoDetectVisibility) obj).getAudioAttributesCompatParcelizer();
    }

    public static int AudioAttributesCompatParcelizer(int i) {
        return Integer.hashCode(i);
    }

    public final boolean equals(Object p0) {
        return write(this.AudioAttributesCompatParcelizer, p0);
    }

    public final int hashCode() {
        return AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer);
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final /* synthetic */ int getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }
}
