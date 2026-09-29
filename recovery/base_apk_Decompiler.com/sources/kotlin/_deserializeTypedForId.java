package kotlin;

import android.media.MediaFormat;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class _deserializeTypedForId {
    public static void read(MediaFormat mediaFormat, List<byte[]> list) {
        for (int i = 0; i < list.size(); i++) {
            mediaFormat.setByteBuffer("csd-".concat(String.valueOf(i)), ByteBuffer.wrap(list.get(i)));
        }
    }

    public static void RemoteActionCompatParcelizer(MediaFormat mediaFormat, String str, int i) {
        if (i != -1) {
            mediaFormat.setInteger(str, i);
        }
    }

    public static void read(MediaFormat mediaFormat, String str, float f) {
        if (f != -1.0f) {
            mediaFormat.setFloat(str, f);
        }
    }

    private static void write(MediaFormat mediaFormat, String str, byte[] bArr) {
        if (bArr != null) {
            mediaFormat.setByteBuffer(str, ByteBuffer.wrap(bArr));
        }
    }

    public static void write(MediaFormat mediaFormat, keyFormat keyformat) {
        if (keyformat != null) {
            RemoteActionCompatParcelizer(mediaFormat, "color-transfer", keyformat.AudioAttributesCompatParcelizer);
            RemoteActionCompatParcelizer(mediaFormat, "color-standard", keyformat.read);
            RemoteActionCompatParcelizer(mediaFormat, "color-range", keyformat.RemoteActionCompatParcelizer);
            write(mediaFormat, "hdr-static-info", keyformat.MediaBrowserCompatCustomActionResultReceiver);
        }
    }
}
