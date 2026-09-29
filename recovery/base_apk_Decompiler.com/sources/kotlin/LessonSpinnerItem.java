package kotlin;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import org.apache.commons.compress.utils.CharsetNames;

/* JADX INFO: loaded from: classes4.dex */
public final class LessonSpinnerItem {
    public static final byte[] RemoteActionCompatParcelizer;

    public interface AudioAttributesCompatParcelizer {
        int RemoteActionCompatParcelizer();
    }

    public interface RemoteActionCompatParcelizer<T extends AudioAttributesCompatParcelizer> {
        T RemoteActionCompatParcelizer(int i);
    }

    public static boolean AudioAttributesCompatParcelizer(byte[] bArr) {
        return hasChangeDiff.read(bArr);
    }

    public static String RemoteActionCompatParcelizer(byte[] bArr) {
        try {
            return new String(bArr, CharsetNames.UTF_8);
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("UTF-8 not supported?", e);
        }
    }

    static {
        byte[] bArr = new byte[0];
        RemoteActionCompatParcelizer = bArr;
        ByteBuffer.wrap(bArr);
    }
}
