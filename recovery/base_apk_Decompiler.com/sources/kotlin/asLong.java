package kotlin;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0083@\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rR\u0011\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f\u0088\u0001\u0012\u0092\u0001\u00020\u0002"}, d2 = {"Lo/asLong;", "", "", "p0", "RemoteActionCompatParcelizer", "(I)I", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "onCommand", "I", "IconCompatParcelizer", "read", AppMeasurementSdk.ConditionalUserProperty.VALUE}, k = 1, mv = {2, 0, 0}, xi = 48)
@submitMagicModule
final class asLong {

    /* JADX INFO: renamed from: onCommand, reason: from kotlin metadata */
    private final int IconCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final int RemoteActionCompatParcelizer = RemoteActionCompatParcelizer(0);
    private static final int MediaBrowserCompatCustomActionResultReceiver = RemoteActionCompatParcelizer(1);
    private static final int AudioAttributesImplBaseParcelizer = RemoteActionCompatParcelizer(2);
    private static final int RatingCompat = RemoteActionCompatParcelizer(3);
    private static final int AudioAttributesImplApi26Parcelizer = RemoteActionCompatParcelizer(4);
    private static final int handleMediaPlayPauseIfPendingOnHandler = RemoteActionCompatParcelizer(5);
    private static final int MediaBrowserCompatMediaItem = RemoteActionCompatParcelizer(6);
    private static final int onAddQueueItem = RemoteActionCompatParcelizer(7);
    private static final int MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = RemoteActionCompatParcelizer(8);
    private static final int onCustomAction = RemoteActionCompatParcelizer(9);
    private static final int AudioAttributesCompatParcelizer = RemoteActionCompatParcelizer(10);
    private static final int IconCompatParcelizer = RemoteActionCompatParcelizer(11);
    private static final int MediaDescriptionCompat = RemoteActionCompatParcelizer(12);
    private static final int MediaMetadataCompat = RemoteActionCompatParcelizer(13);
    private static final int MediaBrowserCompatSearchResultReceiver = RemoteActionCompatParcelizer(14);
    private static final int AudioAttributesImplApi21Parcelizer = RemoteActionCompatParcelizer(15);
    private static final int MediaBrowserCompatItemReceiver = RemoteActionCompatParcelizer(16);
    private static final int write = RemoteActionCompatParcelizer(17);

    public static final boolean IconCompatParcelizer(int i, int i2) {
        return i == i2;
    }

    public static int RemoteActionCompatParcelizer(int i) {
        return i;
    }

    /* JADX INFO: renamed from: o.asLong$read, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\f\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000b\u0010\bR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\r\u0010\bR\u001a\u0010\u0010\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0006\u001a\u0004\b\u000f\u0010\bR\u001a\u0010\u0007\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u0011\u0010\bR\u001a\u0010\n\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0006\u001a\u0004\b\u0013\u0010\bR\u001a\u0010\r\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0006\u001a\u0004\b\u0014\u0010\bR\u001a\u0010\u000b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0006\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0011\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0006\u001a\u0004\b\u0015\u0010\bR\u001a\u0010\u000f\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0006\u001a\u0004\b\u0018\u0010\bR\u001a\u0010\u0014\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\u0005\u0010\bR\u001a\u0010\u0019\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\u0010\u0010\bR\u001a\u0010\u001a\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0006\u001a\u0004\b\u0019\u0010\bR\u001a\u0010\u0018\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u001a\u0010\u000e\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0006\u001a\u0004\b\u001a\u0010\bR\u001a\u0010\u0016\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001a\u0010\u0017\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b\f\u0010\bR\u001a\u0010\u0013\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\t\u0010\b"}, d2 = {"Lo/asLong$read;", "", "<init>", "()V", "Lo/asLong;", "RemoteActionCompatParcelizer", "I", "write", "()I", "IconCompatParcelizer", "MediaBrowserCompatCustomActionResultReceiver", "AudioAttributesImplBaseParcelizer", "AudioAttributesCompatParcelizer", "AudioAttributesImplApi26Parcelizer", "RatingCompat", "AudioAttributesImplApi21Parcelizer", "read", "MediaBrowserCompatItemReceiver", "handleMediaPlayPauseIfPendingOnHandler", "MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver", "MediaBrowserCompatMediaItem", "onAddQueueItem", "onCommand", "onCustomAction", "MediaBrowserCompatSearchResultReceiver", "MediaMetadataCompat", "MediaDescriptionCompat"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final int write() {
            return asLong.RemoteActionCompatParcelizer;
        }

        public final int AudioAttributesImplBaseParcelizer() {
            return asLong.MediaBrowserCompatCustomActionResultReceiver;
        }

        public final int AudioAttributesImplApi26Parcelizer() {
            return asLong.AudioAttributesImplBaseParcelizer;
        }

        public final int AudioAttributesImplApi21Parcelizer() {
            return asLong.RatingCompat;
        }

        public final int MediaBrowserCompatItemReceiver() {
            return asLong.AudioAttributesImplApi26Parcelizer;
        }

        public final int MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
            return asLong.handleMediaPlayPauseIfPendingOnHandler;
        }

        public final int MediaBrowserCompatMediaItem() {
            return asLong.MediaBrowserCompatMediaItem;
        }

        public final int onCommand() {
            return asLong.onAddQueueItem;
        }

        public final int onAddQueueItem() {
            return asLong.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        }

        public final int MediaBrowserCompatSearchResultReceiver() {
            return asLong.onCustomAction;
        }

        public final int RemoteActionCompatParcelizer() {
            return asLong.AudioAttributesCompatParcelizer;
        }

        public final int read() {
            return asLong.IconCompatParcelizer;
        }

        public final int MediaMetadataCompat() {
            return asLong.MediaDescriptionCompat;
        }

        public final int RatingCompat() {
            return asLong.MediaMetadataCompat;
        }

        public final int MediaDescriptionCompat() {
            return asLong.MediaBrowserCompatSearchResultReceiver;
        }

        public final int MediaBrowserCompatCustomActionResultReceiver() {
            return asLong.AudioAttributesImplApi21Parcelizer;
        }

        public final int AudioAttributesCompatParcelizer() {
            return asLong.MediaBrowserCompatItemReceiver;
        }

        public final int IconCompatParcelizer() {
            return asLong.write;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    public static boolean AudioAttributesCompatParcelizer(int i, Object obj) {
        return (obj instanceof asLong) && i == ((asLong) obj).getIconCompatParcelizer();
    }

    public static int AudioAttributesCompatParcelizer(int i) {
        return Integer.hashCode(i);
    }

    public static String read(int i) {
        StringBuilder sb = new StringBuilder("SLOperation(value=");
        sb.append(i);
        sb.append(')');
        return sb.toString();
    }

    public final boolean equals(Object p0) {
        return AudioAttributesCompatParcelizer(this.IconCompatParcelizer, p0);
    }

    public final int hashCode() {
        return AudioAttributesCompatParcelizer(this.IconCompatParcelizer);
    }

    public final String toString() {
        return read(this.IconCompatParcelizer);
    }

    /* JADX INFO: renamed from: handleMediaPlayPauseIfPendingOnHandler, reason: from getter */
    public final /* synthetic */ int getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }
}
