package kotlin;

import android.util.Base64;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.UUID;

/* JADX INFO: loaded from: classes5.dex */
public final class forceDisableAsynchronous {
    private static final byte read = Byte.parseByte("01110000", 2);
    private static final byte RemoteActionCompatParcelizer = Byte.parseByte("00001111", 2);

    public static String AudioAttributesCompatParcelizer() {
        byte[] bArrAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(UUID.randomUUID(), new byte[17]);
        byte b = bArrAudioAttributesCompatParcelizer[0];
        bArrAudioAttributesCompatParcelizer[16] = b;
        bArrAudioAttributesCompatParcelizer[0] = (byte) ((b & RemoteActionCompatParcelizer) | read);
        return IconCompatParcelizer(bArrAudioAttributesCompatParcelizer);
    }

    private static String IconCompatParcelizer(byte[] bArr) {
        return new String(Base64.encode(bArr, 11), Charset.defaultCharset()).substring(0, 22);
    }

    private static byte[] AudioAttributesCompatParcelizer(UUID uuid, byte[] bArr) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        byteBufferWrap.putLong(uuid.getMostSignificantBits());
        byteBufferWrap.putLong(uuid.getLeastSignificantBits());
        return byteBufferWrap.array();
    }
}
