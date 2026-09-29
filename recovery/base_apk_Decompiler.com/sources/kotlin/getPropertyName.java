package kotlin;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087@\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\n\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f\u0088\u0001\u0011\u0092\u0001\u00020\u0002"}, d2 = {"Lo/getPropertyName;", "", "", "p0", "write", "(I)I", "", "RemoteActionCompatParcelizer", "(I)Ljava/lang/String;", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "RatingCompat", "I", "AudioAttributesCompatParcelizer", AppMeasurementSdk.ConditionalUserProperty.VALUE}, k = 1, mv = {2, 0, 0}, xi = 48)
@submitMagicModule
public final class getPropertyName {

    /* JADX INFO: renamed from: RatingCompat, reason: from kotlin metadata */
    private final int RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final int AudioAttributesImplApi21Parcelizer = write(0);
    private static final int MediaBrowserCompatCustomActionResultReceiver = write(1);
    private static final int IconCompatParcelizer = write(2);
    private static final int read = write(3);
    private static final int AudioAttributesImplBaseParcelizer = write(4);
    private static final int MediaMetadataCompat = write(5);
    private static final int write = write(6);
    private static final int MediaBrowserCompatItemReceiver = write(7);
    private static final int AudioAttributesImplApi26Parcelizer = write(8);
    private static final int RemoteActionCompatParcelizer = write(9);

    public static final boolean AudioAttributesCompatParcelizer(int i, int i2) {
        return i == i2;
    }

    private static int write(int i) {
        return i;
    }

    private /* synthetic */ getPropertyName(int i) {
        this.RemoteActionCompatParcelizer = i;
    }

    public final String toString() {
        return RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer);
    }

    public static String RemoteActionCompatParcelizer(int i) {
        return AudioAttributesCompatParcelizer(i, AudioAttributesImplApi21Parcelizer) ? "Unspecified" : AudioAttributesCompatParcelizer(i, MediaBrowserCompatCustomActionResultReceiver) ? "Text" : AudioAttributesCompatParcelizer(i, IconCompatParcelizer) ? "Ascii" : AudioAttributesCompatParcelizer(i, read) ? "Number" : AudioAttributesCompatParcelizer(i, AudioAttributesImplBaseParcelizer) ? "Phone" : AudioAttributesCompatParcelizer(i, MediaMetadataCompat) ? "Uri" : AudioAttributesCompatParcelizer(i, write) ? "Email" : AudioAttributesCompatParcelizer(i, MediaBrowserCompatItemReceiver) ? "Password" : AudioAttributesCompatParcelizer(i, AudioAttributesImplApi26Parcelizer) ? "NumberPassword" : AudioAttributesCompatParcelizer(i, RemoteActionCompatParcelizer) ? "Decimal" : "Invalid";
    }

    /* JADX INFO: renamed from: o.getPropertyName$AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u000b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001a\u0010\r\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\bR\u001a\u0010\f\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000b\u0010\bR\u001a\u0010\u0010\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0006\u001a\u0004\b\u000f\u0010\bR\u001a\u0010\u0007\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b\u0005\u0010\bR\u001a\u0010\u000e\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0006\u001a\u0004\b\t\u0010\bR\u001a\u0010\n\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u001a\u0010\u000f\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\f\u0010\bR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\u0010\u0010\b"}, d2 = {"Lo/getPropertyName$AudioAttributesCompatParcelizer;", "", "<init>", "()V", "Lo/getPropertyName;", "AudioAttributesImplApi21Parcelizer", "I", "MediaBrowserCompatItemReceiver", "()I", "AudioAttributesCompatParcelizer", "MediaBrowserCompatCustomActionResultReceiver", "RemoteActionCompatParcelizer", "IconCompatParcelizer", "read", "AudioAttributesImplBaseParcelizer", "AudioAttributesImplApi26Parcelizer", "write", "MediaMetadataCompat"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final int MediaBrowserCompatItemReceiver() {
            return getPropertyName.AudioAttributesImplApi21Parcelizer;
        }

        public final int MediaBrowserCompatCustomActionResultReceiver() {
            return getPropertyName.MediaBrowserCompatCustomActionResultReceiver;
        }

        public final int read() {
            return getPropertyName.IconCompatParcelizer;
        }

        public final int RemoteActionCompatParcelizer() {
            return getPropertyName.read;
        }

        public final int AudioAttributesImplApi26Parcelizer() {
            return getPropertyName.AudioAttributesImplBaseParcelizer;
        }

        public final int AudioAttributesImplApi21Parcelizer() {
            return getPropertyName.MediaMetadataCompat;
        }

        public final int AudioAttributesCompatParcelizer() {
            return getPropertyName.write;
        }

        public final int AudioAttributesImplBaseParcelizer() {
            return getPropertyName.MediaBrowserCompatItemReceiver;
        }

        public final int IconCompatParcelizer() {
            return getPropertyName.AudioAttributesImplApi26Parcelizer;
        }

        public final int write() {
            return getPropertyName.RemoteActionCompatParcelizer;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    public static final /* synthetic */ getPropertyName read(int i) {
        return new getPropertyName(i);
    }

    public static boolean RemoteActionCompatParcelizer(int i, Object obj) {
        return (obj instanceof getPropertyName) && i == ((getPropertyName) obj).getRemoteActionCompatParcelizer();
    }

    public static int AudioAttributesCompatParcelizer(int i) {
        return Integer.hashCode(i);
    }

    public final boolean equals(Object p0) {
        return RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, p0);
    }

    public final int hashCode() {
        return AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer);
    }

    /* JADX INFO: renamed from: RatingCompat, reason: from getter */
    public final /* synthetic */ int getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }
}
