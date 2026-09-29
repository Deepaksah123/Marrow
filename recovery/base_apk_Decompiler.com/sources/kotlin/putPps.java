package kotlin;

import android.os.Process;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes5.dex */
final class putPps {
    private static String IconCompatParcelizer;
    private static final AtomicLong RemoteActionCompatParcelizer = new AtomicLong(0);

    putPps(parseAudioMuxElement parseaudiomuxelement) {
        byte[] bArr = new byte[10];
        AudioAttributesCompatParcelizer(bArr);
        IconCompatParcelizer(bArr);
        RemoteActionCompatParcelizer(bArr);
        String strIconCompatParcelizer = putSps.IconCompatParcelizer(parseaudiomuxelement.read().IconCompatParcelizer());
        String strAudioAttributesCompatParcelizer = putSps.AudioAttributesCompatParcelizer(bArr);
        IconCompatParcelizer = String.format(Locale.US, "%s%s%s%s", strAudioAttributesCompatParcelizer.substring(0, 12), strAudioAttributesCompatParcelizer.substring(12, 16), strAudioAttributesCompatParcelizer.subSequence(16, 20), strIconCompatParcelizer.substring(0, 12)).toUpperCase(Locale.US);
    }

    private static void AudioAttributesCompatParcelizer(byte[] bArr) {
        long time = new Date().getTime();
        byte[] bArr2 = read(time / 1000);
        bArr[0] = bArr2[0];
        bArr[1] = bArr2[1];
        bArr[2] = bArr2[2];
        bArr[3] = bArr2[3];
        byte[] bArrWrite = write(time % 1000);
        bArr[4] = bArrWrite[0];
        bArr[5] = bArrWrite[1];
    }

    private static void IconCompatParcelizer(byte[] bArr) {
        byte[] bArrWrite = write(RemoteActionCompatParcelizer.incrementAndGet());
        bArr[6] = bArrWrite[0];
        bArr[7] = bArrWrite[1];
    }

    private static void RemoteActionCompatParcelizer(byte[] bArr) {
        byte[] bArrWrite = write(Integer.valueOf(Process.myPid()).shortValue());
        bArr[8] = bArrWrite[0];
        bArr[9] = bArrWrite[1];
    }

    private static byte[] read(long j) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
        byteBufferAllocate.putInt((int) j);
        byteBufferAllocate.order(ByteOrder.BIG_ENDIAN);
        byteBufferAllocate.position(0);
        return byteBufferAllocate.array();
    }

    private static byte[] write(long j) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(2);
        byteBufferAllocate.putShort((short) j);
        byteBufferAllocate.order(ByteOrder.BIG_ENDIAN);
        byteBufferAllocate.position(0);
        return byteBufferAllocate.array();
    }

    public final String toString() {
        return IconCompatParcelizer;
    }
}
