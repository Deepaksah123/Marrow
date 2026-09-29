package kotlin;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
final class isNaturalTypeWithStdHandling extends _find {
    private int AudioAttributesImplApi26Parcelizer;
    private long MediaBrowserCompatCustomActionResultReceiver;
    private int MediaBrowserCompatItemReceiver;

    public isNaturalTypeWithStdHandling() {
        super(2);
        this.AudioAttributesImplApi26Parcelizer = 32;
    }

    @Override // kotlin._find, kotlin._defaultTypeId
    public final void write() {
        super.write();
        this.MediaBrowserCompatItemReceiver = 0;
    }

    public final void MediaBrowserCompatItemReceiver(int i) {
        buildTypeSerializer.IconCompatParcelizer(i > 0);
        this.AudioAttributesImplApi26Parcelizer = i;
    }

    public final long MediaBrowserCompatItemReceiver() {
        return this.RemoteActionCompatParcelizer;
    }

    public final long MediaBrowserCompatMediaItem() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    public final int MediaMetadataCompat() {
        return this.MediaBrowserCompatItemReceiver;
    }

    public final boolean MediaBrowserCompatSearchResultReceiver() {
        return this.MediaBrowserCompatItemReceiver > 0;
    }

    public final boolean AudioAttributesCompatParcelizer(_find _findVar) {
        buildTypeSerializer.IconCompatParcelizer(!_findVar.MediaBrowserCompatCustomActionResultReceiver());
        buildTypeSerializer.IconCompatParcelizer(!_findVar.H_());
        buildTypeSerializer.IconCompatParcelizer(!_findVar.AudioAttributesCompatParcelizer());
        if (!write(_findVar)) {
            return false;
        }
        int i = this.MediaBrowserCompatItemReceiver;
        this.MediaBrowserCompatItemReceiver = i + 1;
        if (i == 0) {
            this.RemoteActionCompatParcelizer = _findVar.RemoteActionCompatParcelizer;
            if (_findVar.read()) {
                c_(1);
            }
        }
        ByteBuffer byteBuffer = _findVar.read;
        if (byteBuffer != null) {
            read(byteBuffer.remaining());
            this.read.put(byteBuffer);
        }
        this.MediaBrowserCompatCustomActionResultReceiver = _findVar.RemoteActionCompatParcelizer;
        return true;
    }

    private boolean write(_find _findVar) {
        if (!MediaBrowserCompatSearchResultReceiver()) {
            return true;
        }
        if (this.MediaBrowserCompatItemReceiver >= this.AudioAttributesImplApi26Parcelizer) {
            return false;
        }
        ByteBuffer byteBuffer = _findVar.read;
        return byteBuffer == null || this.read == null || this.read.position() + byteBuffer.remaining() <= 3072000;
    }
}
