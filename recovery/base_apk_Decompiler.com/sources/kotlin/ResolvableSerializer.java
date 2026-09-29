package kotlin;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes2.dex */
public final class ResolvableSerializer {
    private static final byte[] write = {79, TarConstants.LF_PAX_GLOBAL_EXTENDED_HEADER, TarConstants.LF_PAX_GLOBAL_EXTENDED_HEADER, TarConstants.LF_GNUTYPE_SPARSE, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 28, -43, -59, -9, 1, 19, 79, 112, 117, 115, 72, 101, 97, 100, 1, 2, 56, 1, -128, -69, 0, 0, 0, 0, 0};
    private static final byte[] IconCompatParcelizer = {79, TarConstants.LF_PAX_GLOBAL_EXTENDED_HEADER, TarConstants.LF_PAX_GLOBAL_EXTENDED_HEADER, TarConstants.LF_GNUTYPE_SPARSE, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 11, -103, 87, TarConstants.LF_GNUTYPE_SPARSE, 1, 16, 79, 112, 117, 115, 84, 97, TarConstants.LF_PAX_GLOBAL_EXTENDED_HEADER, 115, 0, 0, 0, 0, 0, 0, 0, 0};
    private ByteBuffer read = deserializeTypedFromArray.AudioAttributesCompatParcelizer;
    private int RemoteActionCompatParcelizer = 0;
    private int AudioAttributesCompatParcelizer = 2;

    public final void read(_find _findVar, List<byte[]> list) {
        ByteBuffer byteBuffer = _findVar.read;
        if (_findVar.read.limit() - _findVar.read.position() == 0) {
            return;
        }
        this.read = read(_findVar.read, (this.AudioAttributesCompatParcelizer == 2 && (list.size() == 1 || list.size() == 3)) ? list.get(0) : null);
        _findVar.write();
        _findVar.read(this.read.remaining());
        _findVar.read.put(this.read);
        _findVar.AudioAttributesImplApi21Parcelizer();
    }

    public final void AudioAttributesCompatParcelizer() {
        this.read = deserializeTypedFromArray.AudioAttributesCompatParcelizer;
        this.RemoteActionCompatParcelizer = 0;
        this.AudioAttributesCompatParcelizer = 2;
    }

    private ByteBuffer read(ByteBuffer byteBuffer, byte[] bArr) {
        int i;
        int length;
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i2 = iLimit - iPosition;
        int i3 = (i2 + 255) / 255;
        int length2 = i3 + 27 + i2;
        if (this.AudioAttributesCompatParcelizer == 2) {
            if (bArr != null) {
                length = bArr.length + 28;
            } else {
                length = write.length;
            }
            length2 += IconCompatParcelizer.length + length;
            i = length;
        } else {
            i = 0;
        }
        ByteBuffer byteBufferAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(length2);
        if (this.AudioAttributesCompatParcelizer == 2) {
            if (bArr != null) {
                write(byteBufferAudioAttributesCompatParcelizer, bArr);
            } else {
                byteBufferAudioAttributesCompatParcelizer.put(write);
            }
            byteBufferAudioAttributesCompatParcelizer.put(IconCompatParcelizer);
        }
        int iWrite = this.RemoteActionCompatParcelizer + isObjectOrPrimitive.write(byteBuffer);
        this.RemoteActionCompatParcelizer = iWrite;
        write(byteBufferAudioAttributesCompatParcelizer, iWrite, this.AudioAttributesCompatParcelizer, i3, false);
        for (int i4 = 0; i4 < i3; i4++) {
            if (i2 >= 255) {
                byteBufferAudioAttributesCompatParcelizer.put((byte) -1);
                i2 -= 255;
            } else {
                byteBufferAudioAttributesCompatParcelizer.put((byte) i2);
                i2 = 0;
            }
        }
        while (iPosition < iLimit) {
            byteBufferAudioAttributesCompatParcelizer.put(byteBuffer.get(iPosition));
            iPosition++;
        }
        byteBuffer.position(byteBuffer.limit());
        byteBufferAudioAttributesCompatParcelizer.flip();
        if (this.AudioAttributesCompatParcelizer == 2) {
            byte[] bArrArray = byteBufferAudioAttributesCompatParcelizer.array();
            int iArrayOffset = byteBufferAudioAttributesCompatParcelizer.arrayOffset();
            byte[] bArr2 = IconCompatParcelizer;
            byteBufferAudioAttributesCompatParcelizer.putInt(i + bArr2.length + 22, LaissezFaireSubTypeValidator.read(bArrArray, iArrayOffset + i + bArr2.length, byteBufferAudioAttributesCompatParcelizer.limit() - byteBufferAudioAttributesCompatParcelizer.position(), 0));
        } else {
            byteBufferAudioAttributesCompatParcelizer.putInt(22, LaissezFaireSubTypeValidator.read(byteBufferAudioAttributesCompatParcelizer.array(), byteBufferAudioAttributesCompatParcelizer.arrayOffset(), byteBufferAudioAttributesCompatParcelizer.limit() - byteBufferAudioAttributesCompatParcelizer.position(), 0));
        }
        this.AudioAttributesCompatParcelizer++;
        return byteBufferAudioAttributesCompatParcelizer;
    }

    private static void write(ByteBuffer byteBuffer, byte[] bArr) {
        write(byteBuffer, 0L, 0, 1, true);
        byteBuffer.put(parseUint8Attribute.write(bArr.length));
        byteBuffer.put(bArr);
        byteBuffer.putInt(22, LaissezFaireSubTypeValidator.read(byteBuffer.array(), byteBuffer.arrayOffset(), bArr.length + 28, 0));
        byteBuffer.position(bArr.length + 28);
    }

    private static void write(ByteBuffer byteBuffer, long j, int i, int i2, boolean z) {
        byteBuffer.put((byte) 79);
        byteBuffer.put(TarConstants.LF_PAX_GLOBAL_EXTENDED_HEADER);
        byteBuffer.put(TarConstants.LF_PAX_GLOBAL_EXTENDED_HEADER);
        byteBuffer.put(TarConstants.LF_GNUTYPE_SPARSE);
        byteBuffer.put((byte) 0);
        byteBuffer.put(z ? (byte) 2 : (byte) 0);
        byteBuffer.putLong(j);
        byteBuffer.putInt(0);
        byteBuffer.putInt(i);
        byteBuffer.putInt(0);
        byteBuffer.put(parseUint8Attribute.write(i2));
    }

    private ByteBuffer AudioAttributesCompatParcelizer(int i) {
        if (this.read.capacity() < i) {
            this.read = ByteBuffer.allocate(i).order(ByteOrder.LITTLE_ENDIAN);
        } else {
            this.read.clear();
        }
        return this.read;
    }
}
