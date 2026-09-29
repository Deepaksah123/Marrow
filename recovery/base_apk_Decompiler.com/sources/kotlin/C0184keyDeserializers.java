package kotlin;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;

/* JADX INFO: renamed from: o.keyDeserializers, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087@\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\n\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f\u0088\u0001\u0011\u0092\u0001\u00020\u0002"}, d2 = {"Lo/keyDeserializers;", "", "", "p0", "IconCompatParcelizer", "(I)I", "", "read", "(I)Ljava/lang/String;", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "RatingCompat", "I", "write", AppMeasurementSdk.ConditionalUserProperty.VALUE}, k = 1, mv = {2, 0, 0}, xi = 48)
@submitMagicModule
public final class C0184keyDeserializers {

    /* JADX INFO: renamed from: RatingCompat, reason: from kotlin metadata */
    private final int write;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final int IconCompatParcelizer = IconCompatParcelizer(0);
    private static final int write = IconCompatParcelizer(1);
    private static final int AudioAttributesImplApi21Parcelizer = IconCompatParcelizer(2);
    private static final int AudioAttributesImplBaseParcelizer = IconCompatParcelizer(3);
    private static final int MediaBrowserCompatCustomActionResultReceiver = IconCompatParcelizer(4);
    private static final int MediaBrowserCompatItemReceiver = IconCompatParcelizer(5);
    private static final int RemoteActionCompatParcelizer = IconCompatParcelizer(6);
    private static final int AudioAttributesImplApi26Parcelizer = IconCompatParcelizer(7);
    private static final int AudioAttributesCompatParcelizer = IconCompatParcelizer(8);

    private static int IconCompatParcelizer(int i) {
        return i;
    }

    public static final boolean IconCompatParcelizer(int i, int i2) {
        return i == i2;
    }

    /* JADX INFO: renamed from: o.keyDeserializers$read, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0007\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\u0005\u0010\bR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000b\u0010\bR\u001a\u0010\u000e\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\bR\u001a\u0010\u0010\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000f\u0010\bR\u001a\u0010\u000b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u001a\u0010\n\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0010\u0010\bR\u001a\u0010\f\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001a\u0010\r\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0006\u001a\u0004\b\t\u0010\b"}, d2 = {"Lo/keyDeserializers$read;", "", "<init>", "()V", "Lo/keyDeserializers;", "IconCompatParcelizer", "I", "RemoteActionCompatParcelizer", "()I", "write", "AudioAttributesImplApi21Parcelizer", "AudioAttributesImplApi26Parcelizer", "AudioAttributesImplBaseParcelizer", "MediaBrowserCompatCustomActionResultReceiver", "AudioAttributesCompatParcelizer", "MediaBrowserCompatItemReceiver", "read"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final int RemoteActionCompatParcelizer() {
            return C0184keyDeserializers.IconCompatParcelizer;
        }

        public final int IconCompatParcelizer() {
            return C0184keyDeserializers.write;
        }

        public final int AudioAttributesImplApi26Parcelizer() {
            return C0184keyDeserializers.AudioAttributesImplApi21Parcelizer;
        }

        public final int MediaBrowserCompatCustomActionResultReceiver() {
            return C0184keyDeserializers.AudioAttributesImplBaseParcelizer;
        }

        public final int MediaBrowserCompatItemReceiver() {
            return C0184keyDeserializers.MediaBrowserCompatCustomActionResultReceiver;
        }

        public final int AudioAttributesCompatParcelizer() {
            return C0184keyDeserializers.MediaBrowserCompatItemReceiver;
        }

        public final int read() {
            return C0184keyDeserializers.RemoteActionCompatParcelizer;
        }

        public final int AudioAttributesImplApi21Parcelizer() {
            return C0184keyDeserializers.AudioAttributesImplApi26Parcelizer;
        }

        public final int write() {
            return C0184keyDeserializers.AudioAttributesCompatParcelizer;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    private /* synthetic */ C0184keyDeserializers(int i) {
        this.write = i;
    }

    public final String toString() {
        return read(this.write);
    }

    public static String read(int i) {
        return IconCompatParcelizer(i, IconCompatParcelizer) ? "Button" : IconCompatParcelizer(i, write) ? "Checkbox" : IconCompatParcelizer(i, AudioAttributesImplApi21Parcelizer) ? "Switch" : IconCompatParcelizer(i, AudioAttributesImplBaseParcelizer) ? "RadioButton" : IconCompatParcelizer(i, MediaBrowserCompatCustomActionResultReceiver) ? "Tab" : IconCompatParcelizer(i, MediaBrowserCompatItemReceiver) ? "Image" : IconCompatParcelizer(i, RemoteActionCompatParcelizer) ? "DropdownList" : IconCompatParcelizer(i, AudioAttributesImplApi26Parcelizer) ? "Picker" : IconCompatParcelizer(i, AudioAttributesCompatParcelizer) ? "Carousel" : "Unknown";
    }

    public static final /* synthetic */ C0184keyDeserializers write(int i) {
        return new C0184keyDeserializers(i);
    }

    public static boolean AudioAttributesCompatParcelizer(int i, Object obj) {
        return (obj instanceof C0184keyDeserializers) && i == ((C0184keyDeserializers) obj).getWrite();
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

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from getter */
    public final /* synthetic */ int getWrite() {
        return this.write;
    }
}
