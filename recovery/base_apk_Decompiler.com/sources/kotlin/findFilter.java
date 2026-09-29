package kotlin;

import java.nio.ByteBuffer;
import kotlin.deserializeTypedFromArray;

/* JADX INFO: loaded from: classes2.dex */
final class findFilter extends getTypeInclusion {
    private int[] IconCompatParcelizer;
    private int[] RemoteActionCompatParcelizer;

    findFilter() {
    }

    public final void read(int[] iArr) {
        this.IconCompatParcelizer = iArr;
    }

    @Override // kotlin.getTypeInclusion
    public final deserializeTypedFromArray.IconCompatParcelizer IconCompatParcelizer(deserializeTypedFromArray.IconCompatParcelizer iconCompatParcelizer) throws deserializeTypedFromArray.RemoteActionCompatParcelizer {
        int[] iArr = this.IconCompatParcelizer;
        if (iArr == null) {
            return deserializeTypedFromArray.IconCompatParcelizer.read;
        }
        if (iconCompatParcelizer.write != 2) {
            throw new deserializeTypedFromArray.RemoteActionCompatParcelizer(iconCompatParcelizer);
        }
        boolean z = iconCompatParcelizer.IconCompatParcelizer != iArr.length;
        int i = 0;
        while (i < iArr.length) {
            int i2 = iArr[i];
            if (i2 >= iconCompatParcelizer.IconCompatParcelizer) {
                throw new deserializeTypedFromArray.RemoteActionCompatParcelizer(iconCompatParcelizer);
            }
            z |= i2 != i;
            i++;
        }
        if (z) {
            return new deserializeTypedFromArray.IconCompatParcelizer(iconCompatParcelizer.RemoteActionCompatParcelizer, iArr.length, 2);
        }
        return deserializeTypedFromArray.IconCompatParcelizer.read;
    }

    @Override // kotlin.deserializeTypedFromArray
    public final void read(ByteBuffer byteBuffer) {
        int[] iArr = (int[]) buildTypeSerializer.IconCompatParcelizer(this.RemoteActionCompatParcelizer);
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        ByteBuffer byteBufferRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(((iLimit - iPosition) / this.write.AudioAttributesCompatParcelizer) * this.read.AudioAttributesCompatParcelizer);
        while (iPosition < iLimit) {
            for (int i : iArr) {
                byteBufferRemoteActionCompatParcelizer.putShort(byteBuffer.getShort((i << 1) + iPosition));
            }
            iPosition += this.write.AudioAttributesCompatParcelizer;
        }
        byteBuffer.position(iLimit);
        byteBufferRemoteActionCompatParcelizer.flip();
    }

    @Override // kotlin.getTypeInclusion
    public final void AudioAttributesImplBaseParcelizer() {
        this.RemoteActionCompatParcelizer = this.IconCompatParcelizer;
    }

    @Override // kotlin.getTypeInclusion
    public final void MediaBrowserCompatCustomActionResultReceiver() {
        this.RemoteActionCompatParcelizer = null;
        this.IconCompatParcelizer = null;
    }
}
