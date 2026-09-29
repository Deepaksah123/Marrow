package kotlin;

import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.DefaultLoadControl;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class isObjectOrPrimitive {
    private static long AudioAttributesCompatParcelizer(byte b, byte b2) {
        int i;
        int i2 = b & 3;
        if (i2 != 0) {
            i = 2;
            if (i2 != 1 && i2 != 2) {
                i = b2 & 63;
            }
        } else {
            i = 1;
        }
        int i3 = (b & 255) >> 3;
        int i4 = i3 & 3;
        return ((long) i) * ((long) (i3 >= 16 ? DefaultLoadControl.DEFAULT_BUFFER_FOR_PLAYBACK_MS << i4 : i3 >= 12 ? 10000 << (i3 & 1) : i4 == 3 ? 60000 : 10000 << i4));
    }

    public static int write(byte[] bArr) {
        return bArr[9] & 255;
    }

    public static List<byte[]> AudioAttributesCompatParcelizer(byte[] bArr) {
        long jRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(read(bArr));
        long jRemoteActionCompatParcelizer2 = RemoteActionCompatParcelizer(3840L);
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(bArr);
        arrayList.add(write(jRemoteActionCompatParcelizer));
        arrayList.add(write(jRemoteActionCompatParcelizer2));
        return arrayList;
    }

    public static int IconCompatParcelizer(ByteBuffer byteBuffer) {
        int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(byteBuffer);
        int i = byteBuffer.get(iRemoteActionCompatParcelizer + 26) + 27 + iRemoteActionCompatParcelizer;
        return (int) ((AudioAttributesCompatParcelizer(byteBuffer.get(i), byteBuffer.limit() - i > 1 ? byteBuffer.get(i + 1) : (byte) 0) * 48000) / 1000000);
    }

    private static int RemoteActionCompatParcelizer(ByteBuffer byteBuffer) {
        if ((byteBuffer.get(5) & 2) == 0) {
            return 0;
        }
        byte b = byteBuffer.get(26);
        int i = 28;
        int i2 = 28;
        for (int i3 = 0; i3 < b; i3++) {
            i2 += byteBuffer.get(i3 + 27);
        }
        byte b2 = byteBuffer.get(i2 + 26);
        for (int i4 = 0; i4 < b2; i4++) {
            i += byteBuffer.get(i2 + 27 + i4);
        }
        return i2 + i;
    }

    public static int write(ByteBuffer byteBuffer) {
        return (int) ((AudioAttributesCompatParcelizer(byteBuffer.get(0), byteBuffer.limit() > 1 ? byteBuffer.get(1) : (byte) 0) * 48000) / 1000000);
    }

    public static long IconCompatParcelizer(byte[] bArr) {
        return AudioAttributesCompatParcelizer(bArr[0], bArr.length > 1 ? bArr[1] : (byte) 0);
    }

    public static int read(byte[] bArr) {
        return (bArr[10] & 255) | ((bArr[11] & 255) << 8);
    }

    public static boolean write(long j, long j2) {
        return j - j2 <= RemoteActionCompatParcelizer(3840L) / 1000;
    }

    private static byte[] write(long j) {
        return ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(j).array();
    }

    private static long RemoteActionCompatParcelizer(long j) {
        return (j * C.NANOS_PER_SECOND) / 48000;
    }
}
