package kotlin;

/* JADX INFO: loaded from: classes2.dex */
public final class ObjectBuffer {
    public final long[] AudioAttributesCompatParcelizer;
    public final long AudioAttributesImplApi21Parcelizer;
    public final int AudioAttributesImplApi26Parcelizer;
    public final long AudioAttributesImplBaseParcelizer;
    public final long IconCompatParcelizer;
    public final int MediaBrowserCompatCustomActionResultReceiver;
    public final int MediaBrowserCompatItemReceiver;
    private final bufferedSize[] RatingCompat;
    public final int RemoteActionCompatParcelizer;
    public final long[] read;
    public final C0170format write;

    public ObjectBuffer(int i, int i2, long j, long j2, long j3, C0170format c0170format, int i3, bufferedSize[] bufferedsizeArr, int i4, long[] jArr, long[] jArr2) {
        this.RemoteActionCompatParcelizer = i;
        this.AudioAttributesImplApi26Parcelizer = i2;
        this.AudioAttributesImplApi21Parcelizer = j;
        this.AudioAttributesImplBaseParcelizer = j2;
        this.IconCompatParcelizer = j3;
        this.write = c0170format;
        this.MediaBrowserCompatItemReceiver = i3;
        this.RatingCompat = bufferedsizeArr;
        this.MediaBrowserCompatCustomActionResultReceiver = i4;
        this.read = jArr;
        this.AudioAttributesCompatParcelizer = jArr2;
    }

    public final bufferedSize IconCompatParcelizer(int i) {
        bufferedSize[] bufferedsizeArr = this.RatingCompat;
        if (bufferedsizeArr == null) {
            return null;
        }
        return bufferedsizeArr[i];
    }
}
