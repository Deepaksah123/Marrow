package kotlin;

import java.io.IOException;
import java.io.StringWriter;

/* JADX INFO: loaded from: classes3.dex */
public abstract class getCount {
    @Deprecated
    public getCount() {
    }

    public final boolean MediaBrowserCompatCustomActionResultReceiver() {
        return this instanceof moveToPosition;
    }

    public final boolean MediaBrowserCompatMediaItem() {
        return this instanceof createDownloader;
    }

    public final boolean MediaBrowserCompatSearchResultReceiver() {
        return this instanceof createDownloaderConstructors;
    }

    public final boolean MediaMetadataCompat() {
        return this instanceof DefaultDownloaderFactory;
    }

    public final createDownloader AudioAttributesImplBaseParcelizer() {
        if (MediaBrowserCompatMediaItem()) {
            return (createDownloader) this;
        }
        throw new IllegalStateException("Not a JSON Object: ".concat(String.valueOf(this)));
    }

    public final moveToPosition MediaBrowserCompatItemReceiver() {
        if (MediaBrowserCompatCustomActionResultReceiver()) {
            return (moveToPosition) this;
        }
        throw new IllegalStateException("Not a JSON Array: ".concat(String.valueOf(this)));
    }

    public final createDownloaderConstructors AudioAttributesImplApi21Parcelizer() {
        if (MediaBrowserCompatSearchResultReceiver()) {
            return (createDownloaderConstructors) this;
        }
        throw new IllegalStateException("Not a JSON Primitive: ".concat(String.valueOf(this)));
    }

    public boolean read() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public Number write() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public String AudioAttributesImplApi26Parcelizer() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public double AudioAttributesCompatParcelizer() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public long RemoteActionCompatParcelizer() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public int IconCompatParcelizer() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            DownloadHelper2 downloadHelper2 = new DownloadHelper2(stringWriter);
            downloadHelper2.AudioAttributesCompatParcelizer(true);
            getDefaultTrackSelectorParameters.AudioAttributesCompatParcelizer(this, downloadHelper2);
            return stringWriter.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
