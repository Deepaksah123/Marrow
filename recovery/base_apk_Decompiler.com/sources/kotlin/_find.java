package kotlin;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public class _find extends _defaultTypeId {
    public C0170format AudioAttributesCompatParcelizer;
    private final int AudioAttributesImplApi21Parcelizer;
    private final int AudioAttributesImplApi26Parcelizer;
    public boolean AudioAttributesImplBaseParcelizer;
    public final TypeSerializerBase IconCompatParcelizer;
    public long RemoteActionCompatParcelizer;
    public ByteBuffer read;
    public ByteBuffer write;

    static {
        isSafeSubType.AudioAttributesCompatParcelizer("media3.decoder");
    }

    public static final class IconCompatParcelizer extends IllegalStateException {
        public final int IconCompatParcelizer;
        public final int read;

        public IconCompatParcelizer(int i, int i2) {
            StringBuilder sb = new StringBuilder("Buffer too small (");
            sb.append(i);
            sb.append(" < ");
            sb.append(i2);
            sb.append(")");
            super(sb.toString());
            this.IconCompatParcelizer = i;
            this.read = i2;
        }
    }

    public static _find AudioAttributesImplApi26Parcelizer() {
        return new _find(0);
    }

    public _find(int i) {
        this(i, (byte) 0);
    }

    private _find(int i, byte b) {
        this.IconCompatParcelizer = new TypeSerializerBase();
        this.AudioAttributesImplApi21Parcelizer = i;
        this.AudioAttributesImplApi26Parcelizer = 0;
    }

    public final void AudioAttributesCompatParcelizer(int i) {
        ByteBuffer byteBuffer = this.write;
        if (byteBuffer == null || byteBuffer.capacity() < i) {
            this.write = ByteBuffer.allocate(i);
        } else {
            this.write.clear();
        }
    }

    public final void read(int i) {
        int i2 = i + this.AudioAttributesImplApi26Parcelizer;
        ByteBuffer byteBuffer = this.read;
        if (byteBuffer == null) {
            this.read = MediaBrowserCompatItemReceiver(i2);
            return;
        }
        int iCapacity = byteBuffer.capacity();
        int iPosition = byteBuffer.position();
        int i3 = i2 + iPosition;
        if (iCapacity >= i3) {
            this.read = byteBuffer;
            return;
        }
        ByteBuffer byteBufferMediaBrowserCompatItemReceiver = MediaBrowserCompatItemReceiver(i3);
        byteBufferMediaBrowserCompatItemReceiver.order(byteBuffer.order());
        if (iPosition > 0) {
            byteBuffer.flip();
            byteBufferMediaBrowserCompatItemReceiver.put(byteBuffer);
        }
        this.read = byteBufferMediaBrowserCompatItemReceiver;
    }

    public final boolean MediaBrowserCompatCustomActionResultReceiver() {
        return RemoteActionCompatParcelizer(1073741824);
    }

    public final void AudioAttributesImplApi21Parcelizer() {
        ByteBuffer byteBuffer = this.read;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.write;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }

    @Override // kotlin._defaultTypeId
    public void write() {
        super.write();
        ByteBuffer byteBuffer = this.read;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.write;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.AudioAttributesImplBaseParcelizer = false;
    }

    private ByteBuffer MediaBrowserCompatItemReceiver(int i) {
        int i2 = this.AudioAttributesImplApi21Parcelizer;
        if (i2 == 1) {
            return ByteBuffer.allocate(i);
        }
        if (i2 == 2) {
            return ByteBuffer.allocateDirect(i);
        }
        ByteBuffer byteBuffer = this.read;
        throw new IconCompatParcelizer(byteBuffer == null ? 0 : byteBuffer.capacity(), i);
    }
}
