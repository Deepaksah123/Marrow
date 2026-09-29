package kotlin;

/* JADX INFO: loaded from: classes2.dex */
public final class releaseOutputBuffer {
    public final long AudioAttributesCompatParcelizer;
    public final boolean AudioAttributesImplApi21Parcelizer;
    public final boolean AudioAttributesImplApi26Parcelizer;
    public final int AudioAttributesImplBaseParcelizer;
    public final boolean IconCompatParcelizer;
    public final long MediaBrowserCompatCustomActionResultReceiver;
    public final int MediaBrowserCompatItemReceiver;
    public final boolean MediaBrowserCompatMediaItem;
    public final boolean MediaBrowserCompatSearchResultReceiver;
    public final int MediaDescriptionCompat;
    public final long MediaMetadataCompat;
    public final boolean RemoteActionCompatParcelizer;
    public final int read;
    public final int write;

    public releaseOutputBuffer(boolean z, long j, int i, int i2, boolean z2, long j2, int i3, int i4, boolean z3, boolean z4, long j3, int i5, boolean z5, boolean z6) {
        this.IconCompatParcelizer = z;
        this.AudioAttributesCompatParcelizer = j;
        this.read = i;
        this.write = i2;
        this.RemoteActionCompatParcelizer = z2;
        this.MediaBrowserCompatCustomActionResultReceiver = j2;
        this.MediaBrowserCompatItemReceiver = i3;
        this.AudioAttributesImplBaseParcelizer = i4;
        this.AudioAttributesImplApi26Parcelizer = z3;
        this.AudioAttributesImplApi21Parcelizer = z4;
        this.MediaMetadataCompat = j3;
        this.MediaDescriptionCompat = i5;
        this.MediaBrowserCompatMediaItem = z5;
        this.MediaBrowserCompatSearchResultReceiver = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof releaseOutputBuffer)) {
            return false;
        }
        releaseOutputBuffer releaseoutputbuffer = (releaseOutputBuffer) obj;
        return this.IconCompatParcelizer == releaseoutputbuffer.IconCompatParcelizer && this.AudioAttributesCompatParcelizer == releaseoutputbuffer.AudioAttributesCompatParcelizer && this.read == releaseoutputbuffer.read && this.write == releaseoutputbuffer.write && this.RemoteActionCompatParcelizer == releaseoutputbuffer.RemoteActionCompatParcelizer && this.MediaBrowserCompatCustomActionResultReceiver == releaseoutputbuffer.MediaBrowserCompatCustomActionResultReceiver && this.MediaBrowserCompatItemReceiver == releaseoutputbuffer.MediaBrowserCompatItemReceiver && this.AudioAttributesImplBaseParcelizer == releaseoutputbuffer.AudioAttributesImplBaseParcelizer && this.AudioAttributesImplApi26Parcelizer == releaseoutputbuffer.AudioAttributesImplApi26Parcelizer && this.AudioAttributesImplApi21Parcelizer == releaseoutputbuffer.AudioAttributesImplApi21Parcelizer && this.MediaMetadataCompat == releaseoutputbuffer.MediaMetadataCompat && this.MediaDescriptionCompat == releaseoutputbuffer.MediaDescriptionCompat && this.MediaBrowserCompatMediaItem == releaseoutputbuffer.MediaBrowserCompatMediaItem && this.MediaBrowserCompatSearchResultReceiver == releaseoutputbuffer.MediaBrowserCompatSearchResultReceiver;
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.IconCompatParcelizer);
        int iHashCode2 = Long.hashCode(this.AudioAttributesCompatParcelizer);
        int iHashCode3 = Integer.hashCode(this.read);
        int iHashCode4 = Integer.hashCode(this.write);
        int iHashCode5 = Boolean.hashCode(this.RemoteActionCompatParcelizer);
        int iHashCode6 = Long.hashCode(this.MediaBrowserCompatCustomActionResultReceiver);
        int iHashCode7 = Integer.hashCode(this.MediaBrowserCompatItemReceiver);
        int iHashCode8 = Integer.hashCode(this.AudioAttributesImplBaseParcelizer);
        int iHashCode9 = Boolean.hashCode(this.AudioAttributesImplApi26Parcelizer);
        int iHashCode10 = Boolean.hashCode(this.AudioAttributesImplApi21Parcelizer);
        int iHashCode11 = Long.hashCode(this.MediaMetadataCompat);
        int iHashCode12 = Integer.hashCode(this.MediaDescriptionCompat);
        return Boolean.hashCode(this.MediaBrowserCompatSearchResultReceiver) + ((Boolean.hashCode(this.MediaBrowserCompatMediaItem) + ((iHashCode12 + ((iHashCode11 + ((iHashCode10 + ((iHashCode9 + ((iHashCode8 + ((iHashCode7 + ((iHashCode6 + ((iHashCode5 + ((iHashCode4 + ((iHashCode3 + ((iHashCode2 + (iHashCode * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "";
    }
}
