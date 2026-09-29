package kotlin;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
final class completeAndClearBuffer {
    public long AudioAttributesCompatParcelizer;
    public boolean AudioAttributesImplApi26Parcelizer;
    public long AudioAttributesImplBaseParcelizer;
    public long IconCompatParcelizer;
    public boolean MediaBrowserCompatCustomActionResultReceiver;
    public int MediaBrowserCompatItemReceiver;
    public bufferedSize MediaBrowserCompatSearchResultReceiver;
    public boolean RemoteActionCompatParcelizer;
    public int onCustomAction;
    public long read;
    public NameTransformer write;
    public long[] handleMediaPlayPauseIfPendingOnHandler = new long[0];
    public int[] onAddQueueItem = new int[0];
    public int[] RatingCompat = new int[0];
    public long[] MediaMetadataCompat = new long[0];
    public boolean[] MediaBrowserCompatMediaItem = new boolean[0];
    public boolean[] MediaDescriptionCompat = new boolean[0];
    public final AsPropertyTypeDeserializer AudioAttributesImplApi21Parcelizer = new AsPropertyTypeDeserializer();

    public final void IconCompatParcelizer() {
        this.onCustomAction = 0;
        this.AudioAttributesImplBaseParcelizer = 0L;
        this.AudioAttributesImplApi26Parcelizer = false;
        this.RemoteActionCompatParcelizer = false;
        this.MediaBrowserCompatCustomActionResultReceiver = false;
        this.MediaBrowserCompatSearchResultReceiver = null;
    }

    public final void write(int i, int i2) {
        this.onCustomAction = i;
        this.MediaBrowserCompatItemReceiver = i2;
        if (this.onAddQueueItem.length < i) {
            this.handleMediaPlayPauseIfPendingOnHandler = new long[i];
            this.onAddQueueItem = new int[i];
        }
        if (this.RatingCompat.length < i2) {
            int i3 = (i2 * 125) / 100;
            this.RatingCompat = new int[i3];
            this.MediaMetadataCompat = new long[i3];
            this.MediaBrowserCompatMediaItem = new boolean[i3];
            this.MediaDescriptionCompat = new boolean[i3];
        }
    }

    public final void AudioAttributesCompatParcelizer(int i) {
        this.AudioAttributesImplApi21Parcelizer.write(i);
        this.RemoteActionCompatParcelizer = true;
        this.MediaBrowserCompatCustomActionResultReceiver = true;
    }

    public final void AudioAttributesCompatParcelizer(closeOnFailAndThrowAsIOE closeonfailandthrowasioe) throws IOException {
        closeonfailandthrowasioe.IconCompatParcelizer(this.AudioAttributesImplApi21Parcelizer.RemoteActionCompatParcelizer(), 0, this.AudioAttributesImplApi21Parcelizer.read());
        this.AudioAttributesImplApi21Parcelizer.MediaBrowserCompatCustomActionResultReceiver(0);
        this.MediaBrowserCompatCustomActionResultReceiver = false;
    }

    public final void RemoteActionCompatParcelizer(AsPropertyTypeDeserializer asPropertyTypeDeserializer) {
        asPropertyTypeDeserializer.write(this.AudioAttributesImplApi21Parcelizer.RemoteActionCompatParcelizer(), 0, this.AudioAttributesImplApi21Parcelizer.read());
        this.AudioAttributesImplApi21Parcelizer.MediaBrowserCompatCustomActionResultReceiver(0);
        this.MediaBrowserCompatCustomActionResultReceiver = false;
    }

    public final long IconCompatParcelizer(int i) {
        return this.MediaMetadataCompat[i];
    }

    public final boolean read(int i) {
        return this.RemoteActionCompatParcelizer && this.MediaDescriptionCompat[i];
    }
}
