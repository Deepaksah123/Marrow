package kotlin;

import android.content.Context;
import java.net.URI;
import java.util.Objects;
import kotlin.getWrappedMetadataFormat;

/* JADX INFO: loaded from: classes3.dex */
final class clearDecoderInfoCache extends getAlternativeCodecMimeType {
    private final getWrappedMetadataFormat RemoteActionCompatParcelizer;
    private final Context write;

    private static boolean AudioAttributesCompatParcelizer(int i) {
        return i == -1 || i > 0;
    }

    private static boolean AudioAttributesImplApi21Parcelizer(String str) {
        return str == null;
    }

    private static boolean RemoteActionCompatParcelizer(long j) {
        return j >= 0;
    }

    private static boolean read(int i) {
        return i > 0;
    }

    private static boolean read(long j) {
        return j >= 0;
    }

    static {
        MediaCodecRendererDecoderInitializationException.IconCompatParcelizer();
    }

    clearDecoderInfoCache(getWrappedMetadataFormat getwrappedmetadataformat, Context context) {
        this.write = context;
        this.RemoteActionCompatParcelizer = getwrappedmetadataformat;
    }

    @Override // kotlin.getAlternativeCodecMimeType
    public final boolean AudioAttributesCompatParcelizer() {
        if (IconCompatParcelizer(this.RemoteActionCompatParcelizer.MediaBrowserCompatSearchResultReceiver())) {
            this.RemoteActionCompatParcelizer.MediaBrowserCompatSearchResultReceiver();
            return false;
        }
        URI uriRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer.MediaBrowserCompatSearchResultReceiver());
        if (uriRemoteActionCompatParcelizer == null) {
            return false;
        }
        if (!read(uriRemoteActionCompatParcelizer, this.write)) {
            Objects.toString(uriRemoteActionCompatParcelizer);
            return false;
        }
        if (!MediaBrowserCompatCustomActionResultReceiver(uriRemoteActionCompatParcelizer.getHost()) || !AudioAttributesImplBaseParcelizer(uriRemoteActionCompatParcelizer.getScheme()) || !AudioAttributesImplApi21Parcelizer(uriRemoteActionCompatParcelizer.getUserInfo()) || !AudioAttributesCompatParcelizer(uriRemoteActionCompatParcelizer.getPort())) {
            return false;
        }
        if (!IconCompatParcelizer(this.RemoteActionCompatParcelizer.MediaMetadataCompat() ? this.RemoteActionCompatParcelizer.write() : null)) {
            Objects.toString(this.RemoteActionCompatParcelizer.write());
            return false;
        }
        if (this.RemoteActionCompatParcelizer.onAddQueueItem() && !read(this.RemoteActionCompatParcelizer.AudioAttributesImplApi21Parcelizer())) {
            this.RemoteActionCompatParcelizer.AudioAttributesImplApi21Parcelizer();
            return false;
        }
        if (this.RemoteActionCompatParcelizer.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() && !read(this.RemoteActionCompatParcelizer.AudioAttributesImplBaseParcelizer())) {
            this.RemoteActionCompatParcelizer.AudioAttributesImplBaseParcelizer();
            return false;
        }
        if (this.RemoteActionCompatParcelizer.onCommand() && !read(this.RemoteActionCompatParcelizer.AudioAttributesImplApi26Parcelizer())) {
            this.RemoteActionCompatParcelizer.AudioAttributesImplApi26Parcelizer();
            return false;
        }
        if (!this.RemoteActionCompatParcelizer.RatingCompat() || this.RemoteActionCompatParcelizer.IconCompatParcelizer() <= 0) {
            this.RemoteActionCompatParcelizer.IconCompatParcelizer();
            return false;
        }
        if (this.RemoteActionCompatParcelizer.handleMediaPlayPauseIfPendingOnHandler() && !RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver())) {
            this.RemoteActionCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver();
            return false;
        }
        if (this.RemoteActionCompatParcelizer.onMediaButtonEvent() && !RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer.MediaDescriptionCompat())) {
            this.RemoteActionCompatParcelizer.MediaDescriptionCompat();
            return false;
        }
        if (this.RemoteActionCompatParcelizer.onCustomAction() && this.RemoteActionCompatParcelizer.MediaBrowserCompatMediaItem() > 0) {
            return this.RemoteActionCompatParcelizer.onAddQueueItem();
        }
        this.RemoteActionCompatParcelizer.MediaBrowserCompatMediaItem();
        return false;
    }

    private static boolean IconCompatParcelizer(String str) {
        return AudioAttributesCompatParcelizer(str);
    }

    private static URI RemoteActionCompatParcelizer(String str) {
        if (str == null) {
            return null;
        }
        try {
            return URI.create(str);
        } catch (IllegalArgumentException | IllegalStateException e) {
            new Object[]{e.getMessage()};
            return null;
        }
    }

    private static boolean read(URI uri, Context context) {
        if (uri == null) {
            return false;
        }
        return isFeatureSupported.IconCompatParcelizer(uri, context);
    }

    private static boolean MediaBrowserCompatCustomActionResultReceiver(String str) {
        return (str == null || AudioAttributesCompatParcelizer(str) || str.length() > 255) ? false : true;
    }

    private static boolean AudioAttributesImplBaseParcelizer(String str) {
        if (str == null) {
            return false;
        }
        return "http".equalsIgnoreCase(str) || "https".equalsIgnoreCase(str);
    }

    private static boolean IconCompatParcelizer(getWrappedMetadataFormat.write writeVar) {
        return (writeVar == null || writeVar == getWrappedMetadataFormat.write.HTTP_METHOD_UNKNOWN) ? false : true;
    }

    private static boolean AudioAttributesCompatParcelizer(String str) {
        if (str == null) {
            return true;
        }
        return str.trim().isEmpty();
    }
}
