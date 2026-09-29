package kotlin;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087@\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\n\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f\u0088\u0001\u0011\u0092\u0001\u00020\u0002"}, d2 = {"Lo/withCaseInsensitivity;", "", "", "p0", "AudioAttributesCompatParcelizer", "(I)I", "", "IconCompatParcelizer", "(I)Ljava/lang/String;", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "AudioAttributesImplApi26Parcelizer", "I", "read", AppMeasurementSdk.ConditionalUserProperty.VALUE}, k = 1, mv = {2, 0, 0}, xi = 48)
@submitMagicModule
public final class withCaseInsensitivity {

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private final int AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final int IconCompatParcelizer = AudioAttributesCompatParcelizer(1);
    private static final int MediaBrowserCompatCustomActionResultReceiver = AudioAttributesCompatParcelizer(2);
    private static final int write = AudioAttributesCompatParcelizer(3);
    private static final int AudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(4);
    private static final int RemoteActionCompatParcelizer = AudioAttributesCompatParcelizer(5);
    private static final int MediaBrowserCompatItemReceiver = AudioAttributesCompatParcelizer(0);

    public static int AudioAttributesCompatParcelizer(int i) {
        return i;
    }

    public static final boolean read(int i, int i2) {
        return i == i2;
    }

    private /* synthetic */ withCaseInsensitivity(int i) {
        this.AudioAttributesCompatParcelizer = i;
    }

    public final String toString() {
        return IconCompatParcelizer(this.AudioAttributesCompatParcelizer);
    }

    public static String IconCompatParcelizer(int i) {
        return read(i, IconCompatParcelizer) ? "Ltr" : read(i, MediaBrowserCompatCustomActionResultReceiver) ? "Rtl" : read(i, write) ? "Content" : read(i, AudioAttributesCompatParcelizer) ? "ContentOrLtr" : read(i, RemoteActionCompatParcelizer) ? "ContentOrRtl" : read(i, MediaBrowserCompatItemReceiver) ? "Unspecified" : "Invalid";
    }

    /* JADX INFO: renamed from: o.withCaseInsensitivity$read, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u000b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\t\u0010\bR\u001a\u0010\f\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0005\u0010\bR\u001a\u0010\u0007\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\u000b\u0010\bR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\f\u0010\bR\u001a\u0010\u000e\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\n\u0010\b"}, d2 = {"Lo/withCaseInsensitivity$read;", "", "<init>", "()V", "Lo/withCaseInsensitivity;", "IconCompatParcelizer", "I", "write", "()I", "read", "MediaBrowserCompatCustomActionResultReceiver", "AudioAttributesCompatParcelizer", "RemoteActionCompatParcelizer", "MediaBrowserCompatItemReceiver", "AudioAttributesImplBaseParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final int write() {
            return withCaseInsensitivity.IconCompatParcelizer;
        }

        public final int read() {
            return withCaseInsensitivity.MediaBrowserCompatCustomActionResultReceiver;
        }

        public final int IconCompatParcelizer() {
            return withCaseInsensitivity.write;
        }

        public final int AudioAttributesCompatParcelizer() {
            return withCaseInsensitivity.AudioAttributesCompatParcelizer;
        }

        public final int RemoteActionCompatParcelizer() {
            return withCaseInsensitivity.RemoteActionCompatParcelizer;
        }

        public final int MediaBrowserCompatCustomActionResultReceiver() {
            return withCaseInsensitivity.MediaBrowserCompatItemReceiver;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    public static final /* synthetic */ withCaseInsensitivity read(int i) {
        return new withCaseInsensitivity(i);
    }

    public static boolean IconCompatParcelizer(int i, Object obj) {
        return (obj instanceof withCaseInsensitivity) && i == ((withCaseInsensitivity) obj).getAudioAttributesCompatParcelizer();
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

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from getter */
    public final /* synthetic */ int getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }
}
