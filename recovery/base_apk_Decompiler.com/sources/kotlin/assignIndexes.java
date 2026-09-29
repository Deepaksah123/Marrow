package kotlin;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087@\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\n\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rR\u0011\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f\u0088\u0001\u0011\u0092\u0001\u00020\u0002"}, d2 = {"Lo/assignIndexes;", "", "", "p0", "IconCompatParcelizer", "(I)I", "", "AudioAttributesCompatParcelizer", "(I)Ljava/lang/String;", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "AudioAttributesImplApi26Parcelizer", "I", "RemoteActionCompatParcelizer", AppMeasurementSdk.ConditionalUserProperty.VALUE}, k = 1, mv = {2, 0, 0}, xi = 48)
@submitMagicModule
public final class assignIndexes {

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private final int RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final int RemoteActionCompatParcelizer = IconCompatParcelizer(1);
    private static final int AudioAttributesImplBaseParcelizer = IconCompatParcelizer(2);
    private static final int read = IconCompatParcelizer(3);
    private static final int AudioAttributesCompatParcelizer = IconCompatParcelizer(4);
    private static final int MediaBrowserCompatItemReceiver = IconCompatParcelizer(5);
    private static final int write = IconCompatParcelizer(6);
    private static final int AudioAttributesImplApi21Parcelizer = IconCompatParcelizer(0);

    public static int IconCompatParcelizer(int i) {
        return i;
    }

    public static final boolean read(int i, int i2) {
        return i == i2;
    }

    private /* synthetic */ assignIndexes(int i) {
        this.RemoteActionCompatParcelizer = i;
    }

    public final String toString() {
        return AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer);
    }

    public static String AudioAttributesCompatParcelizer(int i) {
        return read(i, RemoteActionCompatParcelizer) ? "Left" : read(i, AudioAttributesImplBaseParcelizer) ? "Right" : read(i, read) ? "Center" : read(i, AudioAttributesCompatParcelizer) ? "Justify" : read(i, MediaBrowserCompatItemReceiver) ? "Start" : read(i, write) ? "End" : read(i, AudioAttributesImplApi21Parcelizer) ? "Unspecified" : "Invalid";
    }

    /* JADX INFO: renamed from: o.assignIndexes$IconCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u0005\u0010\bR\u001a\u0010\f\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\bR\u001a\u0010\u0007\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\u000b\u0010\bR\u001a\u0010\u000b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001a\u0010\u000e\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\t\u0010\bR\u001a\u0010\u000f\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0006\u001a\u0004\b\u000e\u0010\b"}, d2 = {"Lo/assignIndexes$IconCompatParcelizer;", "", "<init>", "()V", "Lo/assignIndexes;", "RemoteActionCompatParcelizer", "I", "IconCompatParcelizer", "()I", "AudioAttributesCompatParcelizer", "AudioAttributesImplBaseParcelizer", "read", "write", "MediaBrowserCompatItemReceiver", "AudioAttributesImplApi21Parcelizer", "AudioAttributesImplApi26Parcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final int IconCompatParcelizer() {
            return assignIndexes.RemoteActionCompatParcelizer;
        }

        public final int RemoteActionCompatParcelizer() {
            return assignIndexes.AudioAttributesImplBaseParcelizer;
        }

        public final int write() {
            return assignIndexes.read;
        }

        public final int read() {
            return assignIndexes.AudioAttributesCompatParcelizer;
        }

        public final int AudioAttributesImplBaseParcelizer() {
            return assignIndexes.MediaBrowserCompatItemReceiver;
        }

        public final int AudioAttributesCompatParcelizer() {
            return assignIndexes.write;
        }

        public final int AudioAttributesImplApi21Parcelizer() {
            return assignIndexes.AudioAttributesImplApi21Parcelizer;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    public static final /* synthetic */ assignIndexes write(int i) {
        return new assignIndexes(i);
    }

    public static boolean RemoteActionCompatParcelizer(int i, Object obj) {
        return (obj instanceof assignIndexes) && i == ((assignIndexes) obj).getRemoteActionCompatParcelizer();
    }

    public static int RemoteActionCompatParcelizer(int i) {
        return Integer.hashCode(i);
    }

    public final boolean equals(Object p0) {
        return RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, p0);
    }

    public final int hashCode() {
        return RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer);
    }

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from getter */
    public final /* synthetic */ int getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }
}
