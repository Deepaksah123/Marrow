package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.nio.ByteBuffer;
import kotlin.deserializeTypedFromArray;

/* JADX INFO: loaded from: classes2.dex */
final class _makeReadOnlyLookupMap extends getTypeInclusion {
    private static final int IconCompatParcelizer = Float.floatToIntBits(Float.NaN);

    _makeReadOnlyLookupMap() {
    }

    @Override // kotlin.getTypeInclusion
    public final deserializeTypedFromArray.IconCompatParcelizer IconCompatParcelizer(deserializeTypedFromArray.IconCompatParcelizer iconCompatParcelizer) throws deserializeTypedFromArray.RemoteActionCompatParcelizer {
        int i = iconCompatParcelizer.write;
        if (!LaissezFaireSubTypeValidator.MediaMetadataCompat(i)) {
            throw new deserializeTypedFromArray.RemoteActionCompatParcelizer(iconCompatParcelizer);
        }
        if (i != 4) {
            return new deserializeTypedFromArray.IconCompatParcelizer(iconCompatParcelizer.RemoteActionCompatParcelizer, iconCompatParcelizer.IconCompatParcelizer, 4);
        }
        return deserializeTypedFromArray.IconCompatParcelizer.read;
    }

    @Override // kotlin.deserializeTypedFromArray
    public final void read(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferRemoteActionCompatParcelizer;
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i = iLimit - iPosition;
        int i2 = this.write.write;
        if (i2 == 21) {
            byteBufferRemoteActionCompatParcelizer = RemoteActionCompatParcelizer((i / 3) << 2);
            while (iPosition < iLimit) {
                read(((byteBuffer.get(iPosition) & 255) << 8) | ((byteBuffer.get(iPosition + 1) & 255) << 16) | ((byteBuffer.get(iPosition + 2) & 255) << 24), byteBufferRemoteActionCompatParcelizer);
                iPosition += 3;
            }
        } else if (i2 == 22) {
            byteBufferRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(i);
            while (iPosition < iLimit) {
                read((byteBuffer.get(iPosition) & 255) | ((byteBuffer.get(iPosition + 1) & 255) << 8) | ((byteBuffer.get(iPosition + 2) & 255) << 16) | ((byteBuffer.get(iPosition + 3) & 255) << 24), byteBufferRemoteActionCompatParcelizer);
                iPosition += 4;
            }
        } else if (i2 == 1342177280) {
            byteBufferRemoteActionCompatParcelizer = RemoteActionCompatParcelizer((i / 3) << 2);
            while (iPosition < iLimit) {
                read(((byteBuffer.get(iPosition + 2) & 255) << 8) | ((byteBuffer.get(iPosition + 1) & 255) << 16) | ((byteBuffer.get(iPosition) & 255) << 24), byteBufferRemoteActionCompatParcelizer);
                iPosition += 3;
            }
        } else if (i2 == 1610612736) {
            byteBufferRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(i);
            while (iPosition < iLimit) {
                read((byteBuffer.get(iPosition + 3) & 255) | ((byteBuffer.get(iPosition + 2) & 255) << 8) | ((byteBuffer.get(iPosition + 1) & 255) << 16) | ((byteBuffer.get(iPosition) & 255) << 24), byteBufferRemoteActionCompatParcelizer);
                iPosition += 4;
            }
        } else {
            throw new IllegalStateException();
        }
        byteBuffer.position(byteBuffer.limit());
        byteBufferRemoteActionCompatParcelizer.flip();
    }

    private static void read(int i, ByteBuffer byteBuffer) {
        int iFloatToIntBits = Float.floatToIntBits((float) (((double) i) * 4.656612875245797E-10d));
        if (iFloatToIntBits == IconCompatParcelizer) {
            iFloatToIntBits = Float.floatToIntBits(BitmapDescriptorFactory.HUE_RED);
        }
        byteBuffer.putInt(iFloatToIntBits);
    }
}
