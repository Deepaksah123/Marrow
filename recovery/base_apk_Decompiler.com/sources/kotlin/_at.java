package kotlin;

/* JADX INFO: loaded from: classes2.dex */
public final class _at {
    public int AudioAttributesCompatParcelizer;
    public int AudioAttributesImplApi21Parcelizer;
    public int AudioAttributesImplApi26Parcelizer;
    public int AudioAttributesImplBaseParcelizer;
    public int IconCompatParcelizer;
    public int MediaBrowserCompatCustomActionResultReceiver;
    public int MediaBrowserCompatItemReceiver;
    private int MediaMetadataCompat;
    private long RatingCompat;
    public int RemoteActionCompatParcelizer;
    public int read;
    public int write;

    public final void AudioAttributesCompatParcelizer() {
        synchronized (this) {
        }
    }

    public final void IconCompatParcelizer(long j) {
        RemoteActionCompatParcelizer(j);
    }

    private void RemoteActionCompatParcelizer(long j) {
        this.RatingCompat += j;
        this.MediaMetadataCompat++;
    }

    public final String toString() {
        return LaissezFaireSubTypeValidator.read("DecoderCounters {\n decoderInits=%s,\n decoderReleases=%s\n queuedInputBuffers=%s\n skippedInputBuffers=%s\n renderedOutputBuffers=%s\n skippedOutputBuffers=%s\n droppedBuffers=%s\n droppedInputBuffers=%s\n maxConsecutiveDroppedBuffers=%s\n droppedToKeyframeEvents=%s\n totalVideoFrameProcessingOffsetUs=%s\n videoFrameProcessingOffsetCount=%s\n}", Integer.valueOf(this.RemoteActionCompatParcelizer), Integer.valueOf(this.read), Integer.valueOf(this.AudioAttributesImplBaseParcelizer), Integer.valueOf(this.AudioAttributesImplApi26Parcelizer), Integer.valueOf(this.AudioAttributesImplApi21Parcelizer), Integer.valueOf(this.MediaBrowserCompatCustomActionResultReceiver), Integer.valueOf(this.AudioAttributesCompatParcelizer), Integer.valueOf(this.write), Integer.valueOf(this.MediaBrowserCompatItemReceiver), Integer.valueOf(this.IconCompatParcelizer), Long.valueOf(this.RatingCompat), Integer.valueOf(this.MediaMetadataCompat));
    }
}
