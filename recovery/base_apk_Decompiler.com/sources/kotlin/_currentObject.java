package kotlin;

import android.text.Layout;

/* JADX INFO: loaded from: classes2.dex */
final class _currentObject {
    private String AudioAttributesImplApi26Parcelizer;
    private boolean AudioAttributesImplBaseParcelizer;
    private float IconCompatParcelizer;
    private boolean MediaBrowserCompatItemReceiver;
    private Layout.Alignment RatingCompat;
    private int RemoteActionCompatParcelizer;
    private Layout.Alignment handleMediaPlayPauseIfPendingOnHandler;
    private TokenBufferParser onAddQueueItem;
    private int read;
    private String write;
    private int MediaBrowserCompatMediaItem = -1;
    private int onCommand = -1;
    private int AudioAttributesCompatParcelizer = -1;
    private int MediaBrowserCompatCustomActionResultReceiver = -1;
    private int AudioAttributesImplApi21Parcelizer = -1;
    private int MediaMetadataCompat = -1;
    private int MediaDescriptionCompat = -1;
    private int onCustomAction = -1;
    private float MediaBrowserCompatSearchResultReceiver = Float.MAX_VALUE;

    public final int RatingCompat() {
        int i = this.AudioAttributesCompatParcelizer;
        if (i == -1 && this.MediaBrowserCompatCustomActionResultReceiver == -1) {
            return -1;
        }
        return (i == 1 ? 1 : 0) | (this.MediaBrowserCompatCustomActionResultReceiver == 1 ? 2 : 0);
    }

    public final boolean handleMediaPlayPauseIfPendingOnHandler() {
        return this.MediaBrowserCompatMediaItem == 1;
    }

    public final _currentObject AudioAttributesCompatParcelizer(boolean z) {
        this.MediaBrowserCompatMediaItem = z ? 1 : 0;
        return this;
    }

    public final boolean onCustomAction() {
        return this.onCommand == 1;
    }

    public final _currentObject IconCompatParcelizer(boolean z) {
        this.onCommand = z ? 1 : 0;
        return this;
    }

    public final _currentObject write(boolean z) {
        this.AudioAttributesCompatParcelizer = z ? 1 : 0;
        return this;
    }

    public final _currentObject RemoteActionCompatParcelizer(boolean z) {
        this.MediaBrowserCompatCustomActionResultReceiver = z ? 1 : 0;
        return this;
    }

    public final String AudioAttributesCompatParcelizer() {
        return this.write;
    }

    public final _currentObject AudioAttributesCompatParcelizer(String str) {
        this.write = str;
        return this;
    }

    public final int IconCompatParcelizer() {
        if (!this.AudioAttributesImplBaseParcelizer) {
            throw new IllegalStateException("Font color has not been defined.");
        }
        return this.RemoteActionCompatParcelizer;
    }

    public final _currentObject write(int i) {
        this.RemoteActionCompatParcelizer = i;
        this.AudioAttributesImplBaseParcelizer = true;
        return this;
    }

    public final boolean onCommand() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    public final int write() {
        if (!this.MediaBrowserCompatItemReceiver) {
            throw new IllegalStateException("Background color has not been defined.");
        }
        return this.read;
    }

    public final _currentObject RemoteActionCompatParcelizer(int i) {
        this.read = i;
        this.MediaBrowserCompatItemReceiver = true;
        return this;
    }

    public final boolean MediaBrowserCompatSearchResultReceiver() {
        return this.MediaBrowserCompatItemReceiver;
    }

    public final _currentObject RemoteActionCompatParcelizer(float f) {
        this.MediaBrowserCompatSearchResultReceiver = f;
        return this;
    }

    public final float MediaBrowserCompatItemReceiver() {
        return this.MediaBrowserCompatSearchResultReceiver;
    }

    public final _currentObject AudioAttributesCompatParcelizer(_currentObject _currentobject) {
        return IconCompatParcelizer(_currentobject);
    }

    private _currentObject IconCompatParcelizer(_currentObject _currentobject) {
        int i;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (_currentobject != null) {
            if (!this.AudioAttributesImplBaseParcelizer && _currentobject.AudioAttributesImplBaseParcelizer) {
                write(_currentobject.RemoteActionCompatParcelizer);
            }
            if (this.AudioAttributesCompatParcelizer == -1) {
                this.AudioAttributesCompatParcelizer = _currentobject.AudioAttributesCompatParcelizer;
            }
            if (this.MediaBrowserCompatCustomActionResultReceiver == -1) {
                this.MediaBrowserCompatCustomActionResultReceiver = _currentobject.MediaBrowserCompatCustomActionResultReceiver;
            }
            if (this.write == null && (str = _currentobject.write) != null) {
                this.write = str;
            }
            if (this.MediaBrowserCompatMediaItem == -1) {
                this.MediaBrowserCompatMediaItem = _currentobject.MediaBrowserCompatMediaItem;
            }
            if (this.onCommand == -1) {
                this.onCommand = _currentobject.onCommand;
            }
            if (this.MediaDescriptionCompat == -1) {
                this.MediaDescriptionCompat = _currentobject.MediaDescriptionCompat;
            }
            if (this.handleMediaPlayPauseIfPendingOnHandler == null && (alignment2 = _currentobject.handleMediaPlayPauseIfPendingOnHandler) != null) {
                this.handleMediaPlayPauseIfPendingOnHandler = alignment2;
            }
            if (this.RatingCompat == null && (alignment = _currentobject.RatingCompat) != null) {
                this.RatingCompat = alignment;
            }
            if (this.onCustomAction == -1) {
                this.onCustomAction = _currentobject.onCustomAction;
            }
            if (this.AudioAttributesImplApi21Parcelizer == -1) {
                this.AudioAttributesImplApi21Parcelizer = _currentobject.AudioAttributesImplApi21Parcelizer;
                this.IconCompatParcelizer = _currentobject.IconCompatParcelizer;
            }
            if (this.onAddQueueItem == null) {
                this.onAddQueueItem = _currentobject.onAddQueueItem;
            }
            if (this.MediaBrowserCompatSearchResultReceiver == Float.MAX_VALUE) {
                this.MediaBrowserCompatSearchResultReceiver = _currentobject.MediaBrowserCompatSearchResultReceiver;
            }
            if (!this.MediaBrowserCompatItemReceiver && _currentobject.MediaBrowserCompatItemReceiver) {
                RemoteActionCompatParcelizer(_currentobject.read);
            }
            if (this.MediaMetadataCompat == -1 && (i = _currentobject.MediaMetadataCompat) != -1) {
                this.MediaMetadataCompat = i;
            }
        }
        return this;
    }

    public final _currentObject RemoteActionCompatParcelizer(String str) {
        this.AudioAttributesImplApi26Parcelizer = str;
        return this;
    }

    public final String AudioAttributesImplBaseParcelizer() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    public final _currentObject AudioAttributesCompatParcelizer(int i) {
        this.MediaMetadataCompat = i;
        return this;
    }

    public final int AudioAttributesImplApi21Parcelizer() {
        return this.MediaMetadataCompat;
    }

    public final _currentObject IconCompatParcelizer(int i) {
        this.MediaDescriptionCompat = i;
        return this;
    }

    public final int MediaBrowserCompatCustomActionResultReceiver() {
        return this.MediaDescriptionCompat;
    }

    public final Layout.Alignment MediaDescriptionCompat() {
        return this.handleMediaPlayPauseIfPendingOnHandler;
    }

    public final _currentObject IconCompatParcelizer(Layout.Alignment alignment) {
        this.handleMediaPlayPauseIfPendingOnHandler = alignment;
        return this;
    }

    public final Layout.Alignment AudioAttributesImplApi26Parcelizer() {
        return this.RatingCompat;
    }

    public final _currentObject write(Layout.Alignment alignment) {
        this.RatingCompat = alignment;
        return this;
    }

    public final boolean MediaBrowserCompatMediaItem() {
        return this.onCustomAction == 1;
    }

    public final _currentObject read(boolean z) {
        this.onCustomAction = z ? 1 : 0;
        return this;
    }

    public final TokenBufferParser MediaMetadataCompat() {
        return this.onAddQueueItem;
    }

    public final _currentObject IconCompatParcelizer(TokenBufferParser tokenBufferParser) {
        this.onAddQueueItem = tokenBufferParser;
        return this;
    }

    public final _currentObject write(float f) {
        this.IconCompatParcelizer = f;
        return this;
    }

    public final _currentObject read(int i) {
        this.AudioAttributesImplApi21Parcelizer = i;
        return this;
    }

    public final int RemoteActionCompatParcelizer() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    public final float read() {
        return this.IconCompatParcelizer;
    }
}
