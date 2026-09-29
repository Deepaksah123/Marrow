package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin._updateLocation;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bæ\u0080\u0001\u0018\u0000 \b2\u00020\u0001:\u0003\n\u000b\bJ'\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\b\u0010\tø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Lo/_skipWSOrEnd;", "", "Lo/getKey;", "p0", "p1", "Lo/tryToResolveUnresolved;", "p2", "Lo/hasReferringProperties;", "IconCompatParcelizer", "(JJLo/tryToResolveUnresolved;)J", "write", "read"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface _skipWSOrEnd {

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.read;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u001f\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Lo/_skipWSOrEnd$read;", "", "", "p0", "p1", "read", "(II)I"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface read {
        int read(int p0, int p1);
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J'\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0007\u0010\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Lo/_skipWSOrEnd$write;", "", "", "p0", "p1", "Lo/tryToResolveUnresolved;", "p2", "IconCompatParcelizer", "(IILo/tryToResolveUnresolved;)I"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface write {
        int IconCompatParcelizer(int p0, int p1, tryToResolveUnresolved p2);
    }

    long IconCompatParcelizer(long p0, long p1, tryToResolveUnresolved p2);

    /* JADX INFO: renamed from: o._skipWSOrEnd$IconCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\f\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000b\u0010\bR\u001a\u0010\u000e\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\r\u0010\bR\u001a\u0010\u0011\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\bR\u001a\u0010\u0013\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0006\u001a\u0004\b\u0011\u0010\bR\u001a\u0010\u0010\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0006\u001a\u0004\b\u0014\u0010\bR\u001a\u0010\u000f\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u001a\u0010\u0015\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b\f\u0010\bR\u001a\u0010\u0012\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\t\u0010\bR\u001a\u0010\u0014\u001a\u00020\u00168\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\n\u001a\u00020\u00168\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0017\u001a\u0004\b\u000f\u0010\u0019R\u001a\u0010\u0018\u001a\u00020\u00168\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0017\u001a\u0004\b\u0013\u0010\u0019R\u001a\u0010\u000b\u001a\u00020\u001a8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\n\u0010\u001cR\u001a\u0010\u0007\u001a\u00020\u001a8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u001b\u001a\u0004\b\u0015\u0010\u001cR\u001a\u0010\r\u001a\u00020\u001a8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u001b\u001a\u0004\b\u0012\u0010\u001c"}, d2 = {"Lo/_skipWSOrEnd$IconCompatParcelizer;", "", "<init>", "()V", "Lo/_skipWSOrEnd;", "handleMediaPlayPauseIfPendingOnHandler", "Lo/_skipWSOrEnd;", "MediaBrowserCompatSearchResultReceiver", "()Lo/_skipWSOrEnd;", "IconCompatParcelizer", "RatingCompat", "MediaDescriptionCompat", "AudioAttributesCompatParcelizer", "MediaMetadataCompat", "read", "MediaBrowserCompatCustomActionResultReceiver", "MediaBrowserCompatItemReceiver", "RemoteActionCompatParcelizer", "AudioAttributesImplBaseParcelizer", "write", "AudioAttributesImplApi26Parcelizer", "AudioAttributesImplApi21Parcelizer", "Lo/_skipWSOrEnd$read;", "Lo/_skipWSOrEnd$read;", "MediaBrowserCompatMediaItem", "()Lo/_skipWSOrEnd$read;", "Lo/_skipWSOrEnd$write;", "Lo/_skipWSOrEnd$write;", "()Lo/_skipWSOrEnd$write;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion read = new Companion();

        /* JADX INFO: renamed from: handleMediaPlayPauseIfPendingOnHandler, reason: from kotlin metadata */
        private static final _skipWSOrEnd IconCompatParcelizer = new _updateLocation(-1.0f, -1.0f);

        /* JADX INFO: renamed from: RatingCompat, reason: from kotlin metadata */
        private static final _skipWSOrEnd AudioAttributesCompatParcelizer = new _updateLocation(BitmapDescriptorFactory.HUE_RED, -1.0f);

        /* JADX INFO: renamed from: MediaDescriptionCompat, reason: from kotlin metadata */
        private static final _skipWSOrEnd read = new _updateLocation(1.0f, -1.0f);

        /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
        private static final _skipWSOrEnd RemoteActionCompatParcelizer = new _updateLocation(-1.0f, BitmapDescriptorFactory.HUE_RED);

        /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
        private static final _skipWSOrEnd write = new _updateLocation(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);

        /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
        private static final _skipWSOrEnd MediaBrowserCompatItemReceiver = new _updateLocation(1.0f, BitmapDescriptorFactory.HUE_RED);

        /* JADX INFO: renamed from: write, reason: from kotlin metadata */
        private static final _skipWSOrEnd MediaBrowserCompatCustomActionResultReceiver = new _updateLocation(-1.0f, 1.0f);

        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
        private static final _skipWSOrEnd AudioAttributesImplApi21Parcelizer = new _updateLocation(BitmapDescriptorFactory.HUE_RED, 1.0f);

        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
        private static final _skipWSOrEnd AudioAttributesImplBaseParcelizer = new _updateLocation(1.0f, 1.0f);

        /* JADX INFO: renamed from: MediaMetadataCompat, reason: from kotlin metadata */
        private static final read AudioAttributesImplApi26Parcelizer = new _updateLocation.AudioAttributesCompatParcelizer(-1.0f);

        /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
        private static final read RatingCompat = new _updateLocation.AudioAttributesCompatParcelizer(BitmapDescriptorFactory.HUE_RED);

        /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
        private static final read MediaBrowserCompatMediaItem = new _updateLocation.AudioAttributesCompatParcelizer(1.0f);

        /* JADX INFO: renamed from: MediaBrowserCompatSearchResultReceiver, reason: from kotlin metadata */
        private static final write MediaDescriptionCompat = new _updateLocation.IconCompatParcelizer(-1.0f);

        /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
        private static final write MediaBrowserCompatSearchResultReceiver = new _updateLocation.IconCompatParcelizer(BitmapDescriptorFactory.HUE_RED);

        /* JADX INFO: renamed from: MediaBrowserCompatMediaItem, reason: from kotlin metadata */
        private static final write MediaMetadataCompat = new _updateLocation.IconCompatParcelizer(1.0f);

        private Companion() {
        }

        public final _skipWSOrEnd MediaBrowserCompatSearchResultReceiver() {
            return IconCompatParcelizer;
        }

        public final _skipWSOrEnd MediaDescriptionCompat() {
            return AudioAttributesCompatParcelizer;
        }

        public final _skipWSOrEnd MediaMetadataCompat() {
            return read;
        }

        public final _skipWSOrEnd MediaBrowserCompatItemReceiver() {
            return RemoteActionCompatParcelizer;
        }

        public final _skipWSOrEnd RemoteActionCompatParcelizer() {
            return write;
        }

        public final _skipWSOrEnd AudioAttributesImplApi26Parcelizer() {
            return MediaBrowserCompatItemReceiver;
        }

        public final _skipWSOrEnd read() {
            return MediaBrowserCompatCustomActionResultReceiver;
        }

        public final _skipWSOrEnd AudioAttributesCompatParcelizer() {
            return AudioAttributesImplApi21Parcelizer;
        }

        public final _skipWSOrEnd IconCompatParcelizer() {
            return AudioAttributesImplBaseParcelizer;
        }

        public final read MediaBrowserCompatMediaItem() {
            return AudioAttributesImplApi26Parcelizer;
        }

        public final read MediaBrowserCompatCustomActionResultReceiver() {
            return RatingCompat;
        }

        public final read write() {
            return MediaBrowserCompatMediaItem;
        }

        public final write RatingCompat() {
            return MediaDescriptionCompat;
        }

        public final write AudioAttributesImplApi21Parcelizer() {
            return MediaBrowserCompatSearchResultReceiver;
        }

        public final write AudioAttributesImplBaseParcelizer() {
            return MediaMetadataCompat;
        }
    }
}
