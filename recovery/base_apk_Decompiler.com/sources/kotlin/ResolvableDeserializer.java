package kotlin;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087@\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\n\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f\u0088\u0001\u0011\u0092\u0001\u00020\u0002"}, d2 = {"Lo/ResolvableDeserializer;", "", "", "p0", "IconCompatParcelizer", "(I)I", "", "write", "(I)Ljava/lang/String;", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "MediaMetadataCompat", "I", "AudioAttributesCompatParcelizer", AppMeasurementSdk.ConditionalUserProperty.VALUE}, k = 1, mv = {2, 0, 0}, xi = 48)
@submitMagicModule
public final class ResolvableDeserializer {

    /* JADX INFO: renamed from: MediaMetadataCompat, reason: from kotlin metadata */
    private final int AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final int MediaBrowserCompatItemReceiver = IconCompatParcelizer(-1);
    private static final int AudioAttributesCompatParcelizer = IconCompatParcelizer(1);
    private static final int AudioAttributesImplBaseParcelizer = IconCompatParcelizer(0);
    private static final int read = IconCompatParcelizer(2);
    private static final int MediaBrowserCompatCustomActionResultReceiver = IconCompatParcelizer(3);
    private static final int AudioAttributesImplApi26Parcelizer = IconCompatParcelizer(4);
    private static final int AudioAttributesImplApi21Parcelizer = IconCompatParcelizer(5);
    private static final int RemoteActionCompatParcelizer = IconCompatParcelizer(6);
    private static final int write = IconCompatParcelizer(7);

    private static int IconCompatParcelizer(int i) {
        return i;
    }

    public static final boolean write(int i, int i2) {
        return i == i2;
    }

    private /* synthetic */ ResolvableDeserializer(int i) {
        this.AudioAttributesCompatParcelizer = i;
    }

    public final String toString() {
        return write(this.AudioAttributesCompatParcelizer);
    }

    public static String write(int i) {
        return write(i, MediaBrowserCompatItemReceiver) ? "Unspecified" : write(i, AudioAttributesImplBaseParcelizer) ? "None" : write(i, AudioAttributesCompatParcelizer) ? "Default" : write(i, read) ? "Go" : write(i, MediaBrowserCompatCustomActionResultReceiver) ? "Search" : write(i, AudioAttributesImplApi26Parcelizer) ? "Send" : write(i, AudioAttributesImplApi21Parcelizer) ? "Previous" : write(i, RemoteActionCompatParcelizer) ? "Next" : write(i, write) ? "Done" : "Invalid";
    }

    /* JADX INFO: renamed from: o.ResolvableDeserializer$IconCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\f\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000b\u0010\bR\u001a\u0010\u000e\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001a\u0010\n\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u001a\u0010\u000b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\r\u0010\bR\u001a\u0010\u000f\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0006\u001a\u0004\b\u0010\u0010\bR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0005\u0010\bR\u001a\u0010\r\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\f\u0010\bR\u001a\u0010\u0010\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0006\u001a\u0004\b\t\u0010\b"}, d2 = {"Lo/ResolvableDeserializer$IconCompatParcelizer;", "", "<init>", "()V", "Lo/ResolvableDeserializer;", "MediaBrowserCompatItemReceiver", "I", "AudioAttributesImplApi21Parcelizer", "()I", "RemoteActionCompatParcelizer", "AudioAttributesCompatParcelizer", "IconCompatParcelizer", "read", "AudioAttributesImplBaseParcelizer", "write", "MediaBrowserCompatCustomActionResultReceiver", "AudioAttributesImplApi26Parcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final int AudioAttributesImplApi21Parcelizer() {
            return ResolvableDeserializer.MediaBrowserCompatItemReceiver;
        }

        public final int IconCompatParcelizer() {
            return ResolvableDeserializer.AudioAttributesCompatParcelizer;
        }

        public final int AudioAttributesCompatParcelizer() {
            return ResolvableDeserializer.AudioAttributesImplBaseParcelizer;
        }

        public final int write() {
            return ResolvableDeserializer.read;
        }

        public final int AudioAttributesImplBaseParcelizer() {
            return ResolvableDeserializer.MediaBrowserCompatCustomActionResultReceiver;
        }

        public final int AudioAttributesImplApi26Parcelizer() {
            return ResolvableDeserializer.AudioAttributesImplApi26Parcelizer;
        }

        public final int MediaBrowserCompatItemReceiver() {
            return ResolvableDeserializer.AudioAttributesImplApi21Parcelizer;
        }

        public final int read() {
            return ResolvableDeserializer.RemoteActionCompatParcelizer;
        }

        public final int RemoteActionCompatParcelizer() {
            return ResolvableDeserializer.write;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    public static final /* synthetic */ ResolvableDeserializer read(int i) {
        return new ResolvableDeserializer(i);
    }

    public static boolean IconCompatParcelizer(int i, Object obj) {
        return (obj instanceof ResolvableDeserializer) && i == ((ResolvableDeserializer) obj).getAudioAttributesCompatParcelizer();
    }

    public static int RemoteActionCompatParcelizer(int i) {
        return Integer.hashCode(i);
    }

    public final boolean equals(Object p0) {
        return IconCompatParcelizer(this.AudioAttributesCompatParcelizer, p0);
    }

    public final int hashCode() {
        return RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer);
    }

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from getter */
    public final /* synthetic */ int getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }
}
