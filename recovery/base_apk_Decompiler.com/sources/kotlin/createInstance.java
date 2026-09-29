package kotlin;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087@\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\n\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f\u0088\u0001\u0011\u0092\u0001\u00020\u0002"}, d2 = {"Lo/createInstance;", "", "", "p0", "AudioAttributesCompatParcelizer", "(I)I", "", "read", "(I)Ljava/lang/String;", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "onPrepareFromUri", "I", "IconCompatParcelizer", AppMeasurementSdk.ConditionalUserProperty.VALUE}, k = 1, mv = {2, 0, 0}, xi = 48)
@submitMagicModule
public final class createInstance {

    /* JADX INFO: renamed from: onPrepareFromUri, reason: from kotlin metadata */
    private final int IconCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final int AudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(0);
    private static final int onFastForward = AudioAttributesCompatParcelizer(1);
    private static final int AudioAttributesImplApi21Parcelizer = AudioAttributesCompatParcelizer(2);
    private static final int onPrepareFromSearch = AudioAttributesCompatParcelizer(3);
    private static final int MediaMetadataCompat = AudioAttributesCompatParcelizer(4);
    private static final int onPlayFromSearch = AudioAttributesCompatParcelizer(5);
    private static final int MediaBrowserCompatItemReceiver = AudioAttributesCompatParcelizer(6);
    private static final int onPrepare = AudioAttributesCompatParcelizer(7);
    private static final int MediaBrowserCompatSearchResultReceiver = AudioAttributesCompatParcelizer(8);
    private static final int onPrepareFromMediaId = AudioAttributesCompatParcelizer(9);
    private static final int MediaBrowserCompatCustomActionResultReceiver = AudioAttributesCompatParcelizer(10);
    private static final int onPlayFromUri = AudioAttributesCompatParcelizer(11);
    private static final int onPause = AudioAttributesCompatParcelizer(12);
    private static final int onCustomAction = AudioAttributesCompatParcelizer(13);
    private static final int onMediaButtonEvent = AudioAttributesCompatParcelizer(14);
    private static final int MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = AudioAttributesCompatParcelizer(15);
    private static final int AudioAttributesImplBaseParcelizer = AudioAttributesCompatParcelizer(16);
    private static final int handleMediaPlayPauseIfPendingOnHandler = AudioAttributesCompatParcelizer(17);
    private static final int IconCompatParcelizer = AudioAttributesCompatParcelizer(18);
    private static final int RemoteActionCompatParcelizer = AudioAttributesCompatParcelizer(19);
    private static final int RatingCompat = AudioAttributesCompatParcelizer(20);
    private static final int onPlay = AudioAttributesCompatParcelizer(21);
    private static final int AudioAttributesImplApi26Parcelizer = AudioAttributesCompatParcelizer(22);
    private static final int MediaBrowserCompatMediaItem = AudioAttributesCompatParcelizer(23);
    private static final int onAddQueueItem = AudioAttributesCompatParcelizer(24);
    private static final int MediaDescriptionCompat = AudioAttributesCompatParcelizer(25);
    private static final int onPlayFromMediaId = AudioAttributesCompatParcelizer(26);
    private static final int write = AudioAttributesCompatParcelizer(27);
    private static final int onCommand = AudioAttributesCompatParcelizer(28);

    public static int AudioAttributesCompatParcelizer(int i) {
        return i;
    }

    public static final boolean IconCompatParcelizer(int i, int i2) {
        return i == i2;
    }

    /* JADX INFO: renamed from: o.createInstance$read, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b \b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0007R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0007R\u001a\u0010\f\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\u000b\u0010\u0007R\u001a\u0010\u000f\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\u0007R\u001a\u0010\u0011\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0006\u001a\u0004\b\u0010\u0010\u0007R\u001a\u0010\u0014\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0006\u001a\u0004\b\u0013\u0010\u0007R\u001a\u0010\u0015\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0006\u001a\u0004\b\u0014\u0010\u0007R\u001a\u0010\u0017\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0006\u001a\u0004\b\u0016\u0010\u0007R\u001a\u0010\u0019\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0006\u001a\u0004\b\u0017\u0010\u0007R\u001a\u0010\u000b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0006\u001a\u0004\b\t\u0010\u0007R\u001a\u0010\u0018\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0006\u001a\u0004\b\u0015\u0010\u0007R\u001a\u0010\u001a\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0006\u001a\u0004\b\r\u0010\u0007R\u001a\u0010\u001d\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0006\u001a\u0004\b\u001c\u0010\u0007R\u001a\u0010\u001f\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0006\u001a\u0004\b\u001e\u0010\u0007R\u001a\u0010\u0010\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b \u0010\u0007R\u001a\u0010\"\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u0006\u001a\u0004\b!\u0010\u0007R\u001a\u0010#\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0006\u001a\u0004\b\u0011\u0010\u0007R\u001a\u0010!\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010\u0006\u001a\u0004\b\u001a\u0010\u0007R\u001a\u0010\u001c\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b\u000f\u0010\u0007R\u001a\u0010\u001e\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0006\u001a\u0004\b\b\u0010\u0007R\u001a\u0010$\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0006\u001a\u0004\b\u001d\u0010\u0007R\u001a\u0010\t\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u0006\u001a\u0004\b$\u0010\u0007R\u001a\u0010 \u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0006\u001a\u0004\b\u0019\u0010\u0007R\u001a\u0010\n\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0006\u001a\u0004\b\u001f\u0010\u0007R\u001a\u0010\u001b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010\u0006\u001a\u0004\b\"\u0010\u0007R\u001a\u0010\u000e\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u0006\u001a\u0004\b\u0018\u0010\u0007R\u001a\u0010\u0013\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010\u0006\u001a\u0004\b\u001b\u0010\u0007R\u001a\u0010\r\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\f\u0010\u0007R\u001a\u0010\u0016\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\u0006\u001a\u0004\b#\u0010\u0007"}, d2 = {"Lo/createInstance$read;", "", "<init>", "()V", "Lo/createInstance;", "AudioAttributesCompatParcelizer", "I", "()I", "RemoteActionCompatParcelizer", "onFastForward", "onMediaButtonEvent", "AudioAttributesImplApi21Parcelizer", "write", "onPrepareFromSearch", "onPrepare", "read", "MediaMetadataCompat", "IconCompatParcelizer", "onPlayFromSearch", "onPlayFromUri", "AudioAttributesImplApi26Parcelizer", "MediaBrowserCompatItemReceiver", "onPrepareFromMediaId", "AudioAttributesImplBaseParcelizer", "MediaBrowserCompatSearchResultReceiver", "MediaBrowserCompatCustomActionResultReceiver", "MediaBrowserCompatMediaItem", "onPause", "onCustomAction", "RatingCompat", "MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver", "MediaDescriptionCompat", "onPlay", "onCommand", "handleMediaPlayPauseIfPendingOnHandler", "onAddQueueItem", "onPlayFromMediaId"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final int AudioAttributesCompatParcelizer() {
            return createInstance.AudioAttributesCompatParcelizer;
        }

        public final int onMediaButtonEvent() {
            return createInstance.onFastForward;
        }

        public final int AudioAttributesImplApi21Parcelizer() {
            return createInstance.AudioAttributesImplApi21Parcelizer;
        }

        public final int onPrepare() {
            return createInstance.onPrepareFromSearch;
        }

        public final int MediaMetadataCompat() {
            return createInstance.MediaMetadataCompat;
        }

        public final int onPlayFromUri() {
            return createInstance.onPlayFromSearch;
        }

        public final int AudioAttributesImplApi26Parcelizer() {
            return createInstance.MediaBrowserCompatItemReceiver;
        }

        public final int onPrepareFromMediaId() {
            return createInstance.onPrepare;
        }

        public final int AudioAttributesImplBaseParcelizer() {
            return createInstance.MediaBrowserCompatSearchResultReceiver;
        }

        public final int onFastForward() {
            return createInstance.onPrepareFromMediaId;
        }

        public final int MediaBrowserCompatItemReceiver() {
            return createInstance.MediaBrowserCompatCustomActionResultReceiver;
        }

        public final int onPrepareFromSearch() {
            return createInstance.onPlayFromUri;
        }

        public final int onCustomAction() {
            return createInstance.onPause;
        }

        public final int MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
            return createInstance.onCustomAction;
        }

        public final int onPlay() {
            return createInstance.onMediaButtonEvent;
        }

        public final int onCommand() {
            return createInstance.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        }

        public final int IconCompatParcelizer() {
            return createInstance.AudioAttributesImplBaseParcelizer;
        }

        public final int MediaBrowserCompatMediaItem() {
            return createInstance.handleMediaPlayPauseIfPendingOnHandler;
        }

        public final int read() {
            return createInstance.IconCompatParcelizer;
        }

        public final int RemoteActionCompatParcelizer() {
            return createInstance.RemoteActionCompatParcelizer;
        }

        public final int RatingCompat() {
            return createInstance.RatingCompat;
        }

        public final int onPlayFromMediaId() {
            return createInstance.onPlay;
        }

        public final int MediaBrowserCompatCustomActionResultReceiver() {
            return createInstance.AudioAttributesImplApi26Parcelizer;
        }

        public final int MediaDescriptionCompat() {
            return createInstance.MediaBrowserCompatMediaItem;
        }

        public final int handleMediaPlayPauseIfPendingOnHandler() {
            return createInstance.onAddQueueItem;
        }

        public final int MediaBrowserCompatSearchResultReceiver() {
            return createInstance.MediaDescriptionCompat;
        }

        public final int onPause() {
            return createInstance.onPlayFromMediaId;
        }

        public final int write() {
            return createInstance.write;
        }

        public final int onAddQueueItem() {
            return createInstance.onCommand;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    public final String toString() {
        return read(this.IconCompatParcelizer);
    }

    public static String read(int i) {
        return IconCompatParcelizer(i, AudioAttributesCompatParcelizer) ? "Clear" : IconCompatParcelizer(i, onFastForward) ? "Src" : IconCompatParcelizer(i, AudioAttributesImplApi21Parcelizer) ? "Dst" : IconCompatParcelizer(i, onPrepareFromSearch) ? "SrcOver" : IconCompatParcelizer(i, MediaMetadataCompat) ? "DstOver" : IconCompatParcelizer(i, onPlayFromSearch) ? "SrcIn" : IconCompatParcelizer(i, MediaBrowserCompatItemReceiver) ? "DstIn" : IconCompatParcelizer(i, onPrepare) ? "SrcOut" : IconCompatParcelizer(i, MediaBrowserCompatSearchResultReceiver) ? "DstOut" : IconCompatParcelizer(i, onPrepareFromMediaId) ? "SrcAtop" : IconCompatParcelizer(i, MediaBrowserCompatCustomActionResultReceiver) ? "DstAtop" : IconCompatParcelizer(i, onPlayFromUri) ? "Xor" : IconCompatParcelizer(i, onPause) ? "Plus" : IconCompatParcelizer(i, onCustomAction) ? "Modulate" : IconCompatParcelizer(i, onMediaButtonEvent) ? "Screen" : IconCompatParcelizer(i, MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) ? "Overlay" : IconCompatParcelizer(i, AudioAttributesImplBaseParcelizer) ? "Darken" : IconCompatParcelizer(i, handleMediaPlayPauseIfPendingOnHandler) ? "Lighten" : IconCompatParcelizer(i, IconCompatParcelizer) ? "ColorDodge" : IconCompatParcelizer(i, RemoteActionCompatParcelizer) ? "ColorBurn" : IconCompatParcelizer(i, RatingCompat) ? "HardLight" : IconCompatParcelizer(i, onPlay) ? "Softlight" : IconCompatParcelizer(i, AudioAttributesImplApi26Parcelizer) ? "Difference" : IconCompatParcelizer(i, MediaBrowserCompatMediaItem) ? "Exclusion" : IconCompatParcelizer(i, onAddQueueItem) ? "Multiply" : IconCompatParcelizer(i, MediaDescriptionCompat) ? "Hue" : IconCompatParcelizer(i, onPlayFromMediaId) ? "Saturation" : IconCompatParcelizer(i, write) ? "Color" : IconCompatParcelizer(i, onCommand) ? "Luminosity" : "Unknown";
    }

    public static boolean RemoteActionCompatParcelizer(int i, Object obj) {
        return (obj instanceof createInstance) && i == ((createInstance) obj).getIconCompatParcelizer();
    }

    public static int IconCompatParcelizer(int i) {
        return Integer.hashCode(i);
    }

    public final boolean equals(Object p0) {
        return RemoteActionCompatParcelizer(this.IconCompatParcelizer, p0);
    }

    public final int hashCode() {
        return IconCompatParcelizer(this.IconCompatParcelizer);
    }

    /* JADX INFO: renamed from: onPrepareFromMediaId, reason: from getter */
    public final /* synthetic */ int getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }
}
