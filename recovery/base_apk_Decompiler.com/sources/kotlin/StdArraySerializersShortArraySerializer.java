package kotlin;

import com.google.android.exoplayer2.C;

/* JADX INFO: loaded from: classes2.dex */
public final class StdArraySerializersShortArraySerializer {
    public final int AudioAttributesCompatParcelizer;
    public final int AudioAttributesImplApi21Parcelizer;
    public final long IconCompatParcelizer;
    public final int MediaBrowserCompatItemReceiver;
    public final Object RemoteActionCompatParcelizer;
    public final C0170format read;
    public final long write;

    public StdArraySerializersShortArraySerializer(int i) {
        this(i, -1, null, 0, null, C.TIME_UNSET, C.TIME_UNSET);
    }

    public StdArraySerializersShortArraySerializer(int i, int i2, C0170format c0170format, int i3, Object obj, long j, long j2) {
        this.AudioAttributesCompatParcelizer = i;
        this.AudioAttributesImplApi21Parcelizer = i2;
        this.read = c0170format;
        this.MediaBrowserCompatItemReceiver = i3;
        this.RemoteActionCompatParcelizer = obj;
        this.write = j;
        this.IconCompatParcelizer = j2;
    }
}
