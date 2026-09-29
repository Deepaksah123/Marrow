package kotlin;

import com.google.android.exoplayer2.RendererCapabilities;

/* JADX INFO: loaded from: classes2.dex */
public interface buildIterableSerializer {

    public interface write {
        void AudioAttributesCompatParcelizer(buildIndexedListSerializer buildindexedlistserializer);
    }

    static int AudioAttributesImplApi21Parcelizer(int i) {
        return i & 64;
    }

    static int IconCompatParcelizer(int i) {
        return i & RendererCapabilities.MODE_SUPPORT_MASK;
    }

    static int IconCompatParcelizer(int i, int i2, int i3, int i4, int i5, int i6) {
        return i | i2 | i3 | i4 | i5 | i6;
    }

    static int MediaBrowserCompatCustomActionResultReceiver(int i) {
        return i & 32;
    }

    static int RemoteActionCompatParcelizer(int i) {
        return i & 3584;
    }

    static int read(int i) {
        return i & 7;
    }

    static int write(int i) {
        return i & 24;
    }

    int MediaBrowserCompatMediaItem();

    default void RemoteActionCompatParcelizer() {
    }

    int onPlayFromSearch() throws addNull;

    String onSeekTo();

    int read(C0170format c0170format) throws addNull;

    default void read(write writeVar) {
    }

    static int AudioAttributesCompatParcelizer(int i) {
        return IconCompatParcelizer(i, 0, 0, 0);
    }

    static int IconCompatParcelizer(int i, int i2, int i3, int i4) {
        return IconCompatParcelizer(i, i2, i3, 0, 128, i4);
    }

    static int IconCompatParcelizer(int i, int i2, int i3, int i4, int i5) {
        return IconCompatParcelizer(i, i2, i3, i4, i5, 0);
    }

    static boolean read(int i, boolean z) {
        int i2 = read(i);
        if (i2 != 4) {
            return z && i2 == 3;
        }
        return true;
    }
}
