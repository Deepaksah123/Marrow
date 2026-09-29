package kotlin;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087@\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\n\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f\u0088\u0001\u0012\u0092\u0001\u00020\u0002"}, d2 = {"Lo/wrapAndTrack;", "", "", "p0", "read", "(I)I", "", "write", "(I)Ljava/lang/String;", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "AudioAttributesImplBaseParcelizer", "I", "IconCompatParcelizer", "RemoteActionCompatParcelizer", AppMeasurementSdk.ConditionalUserProperty.VALUE}, k = 1, mv = {2, 0, 0}, xi = 48)
@submitMagicModule
public final class wrapAndTrack {

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private final int IconCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final int read = read(0);
    private static final int write = read(1);
    private static final int IconCompatParcelizer = read(2);
    private static final int MediaBrowserCompatItemReceiver = read(3);
    private static final int AudioAttributesCompatParcelizer = read(4);

    public static final boolean AudioAttributesCompatParcelizer(int i, int i2) {
        return i == i2;
    }

    public static int read(int i) {
        return i;
    }

    /* JADX INFO: renamed from: o.wrapAndTrack$RemoteActionCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0007\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u000b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\u0005\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u001a\u0010\t\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u000b\u0010\b"}, d2 = {"Lo/wrapAndTrack$RemoteActionCompatParcelizer;", "", "<init>", "()V", "Lo/wrapAndTrack;", "read", "I", "AudioAttributesCompatParcelizer", "()I", "write", "RemoteActionCompatParcelizer", "IconCompatParcelizer", "MediaBrowserCompatItemReceiver"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final int AudioAttributesCompatParcelizer() {
            return wrapAndTrack.read;
        }

        public final int RemoteActionCompatParcelizer() {
            return wrapAndTrack.write;
        }

        public final int read() {
            return wrapAndTrack.IconCompatParcelizer;
        }

        public final int IconCompatParcelizer() {
            return wrapAndTrack.AudioAttributesCompatParcelizer;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    public final String toString() {
        return write(this.IconCompatParcelizer);
    }

    public static String write(int i) {
        return AudioAttributesCompatParcelizer(i, read) ? "Difference" : AudioAttributesCompatParcelizer(i, write) ? "Intersect" : AudioAttributesCompatParcelizer(i, IconCompatParcelizer) ? "Union" : AudioAttributesCompatParcelizer(i, MediaBrowserCompatItemReceiver) ? "Xor" : AudioAttributesCompatParcelizer(i, AudioAttributesCompatParcelizer) ? "ReverseDifference" : "Unknown";
    }

    public static boolean IconCompatParcelizer(int i, Object obj) {
        return (obj instanceof wrapAndTrack) && i == ((wrapAndTrack) obj).getIconCompatParcelizer();
    }

    public static int IconCompatParcelizer(int i) {
        return Integer.hashCode(i);
    }

    public final boolean equals(Object p0) {
        return IconCompatParcelizer(this.IconCompatParcelizer, p0);
    }

    public final int hashCode() {
        return IconCompatParcelizer(this.IconCompatParcelizer);
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final /* synthetic */ int getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }
}
