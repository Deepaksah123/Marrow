package kotlin;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087@\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\n\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rR\u0011\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f\u0088\u0001\u0010\u0092\u0001\u00020\u0002"}, d2 = {"Lo/contentsAsInt;", "", "", "p0", "AudioAttributesCompatParcelizer", "(I)I", "", "RemoteActionCompatParcelizer", "(I)Ljava/lang/String;", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "AudioAttributesImplApi21Parcelizer", "I", AppMeasurementSdk.ConditionalUserProperty.VALUE}, k = 1, mv = {2, 0, 0}, xi = 48)
@submitMagicModule
public final class contentsAsInt {

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private final int RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final int AudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(0);
    private static final int write = AudioAttributesCompatParcelizer(1);
    private static final int MediaBrowserCompatItemReceiver = AudioAttributesCompatParcelizer(2);
    private static final int IconCompatParcelizer = AudioAttributesCompatParcelizer(3);
    private static final int read = AudioAttributesCompatParcelizer(4);

    public static int AudioAttributesCompatParcelizer(int i) {
        return i;
    }

    public static final boolean write(int i, int i2) {
        return i == i2;
    }

    /* JADX INFO: renamed from: o.contentsAsInt$RemoteActionCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\t\u0010\bR\u001a\u0010\f\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000b\u0010\bR\u001a\u0010\u0007\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\u0005\u0010\bR\u001a\u0010\u000b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\b"}, d2 = {"Lo/contentsAsInt$RemoteActionCompatParcelizer;", "", "<init>", "()V", "Lo/contentsAsInt;", "AudioAttributesCompatParcelizer", "I", "write", "()I", "IconCompatParcelizer", "MediaBrowserCompatItemReceiver", "read", "RemoteActionCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final int write() {
            return contentsAsInt.AudioAttributesCompatParcelizer;
        }

        public final int IconCompatParcelizer() {
            return contentsAsInt.write;
        }

        public final int read() {
            return contentsAsInt.MediaBrowserCompatItemReceiver;
        }

        public final int AudioAttributesCompatParcelizer() {
            return contentsAsInt.IconCompatParcelizer;
        }

        public final int RemoteActionCompatParcelizer() {
            return contentsAsInt.read;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    private /* synthetic */ contentsAsInt(int i) {
        this.RemoteActionCompatParcelizer = i;
    }

    public final String toString() {
        return RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer);
    }

    public static String RemoteActionCompatParcelizer(int i) {
        return write(i, AudioAttributesCompatParcelizer) ? "Argb8888" : write(i, write) ? "Alpha8" : write(i, MediaBrowserCompatItemReceiver) ? "Rgb565" : write(i, IconCompatParcelizer) ? "F16" : write(i, read) ? "Gpu" : "Unknown";
    }

    public static final /* synthetic */ contentsAsInt write(int i) {
        return new contentsAsInt(i);
    }

    public static boolean AudioAttributesCompatParcelizer(int i, Object obj) {
        return (obj instanceof contentsAsInt) && i == ((contentsAsInt) obj).getRemoteActionCompatParcelizer();
    }

    public static int IconCompatParcelizer(int i) {
        return Integer.hashCode(i);
    }

    public final boolean equals(Object p0) {
        return AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer, p0);
    }

    public final int hashCode() {
        return IconCompatParcelizer(this.RemoteActionCompatParcelizer);
    }

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from getter */
    public final /* synthetic */ int getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }
}
