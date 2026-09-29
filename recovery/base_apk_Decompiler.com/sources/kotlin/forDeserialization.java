package kotlin;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.List;
import java.util.RandomAccess;
import org.apache.commons.compress.utils.CharsetNames;

/* JADX INFO: loaded from: classes4.dex */
public final class forDeserialization {
    public static final byte[] AudioAttributesCompatParcelizer;
    static final Charset write = Charset.forName(CharsetNames.UTF_8);

    public interface AudioAttributesCompatParcelizer {
        boolean AudioAttributesCompatParcelizer();
    }

    public interface AudioAttributesImplApi26Parcelizer extends AudioAttributesImplBaseParcelizer<Long> {
    }

    public interface AudioAttributesImplBaseParcelizer<E> extends List<E>, RandomAccess {
        AudioAttributesImplBaseParcelizer<E> AudioAttributesCompatParcelizer(int i);

        void RemoteActionCompatParcelizer();

        boolean read();
    }

    public interface IconCompatParcelizer {
        int read();
    }

    public interface MediaBrowserCompatCustomActionResultReceiver extends AudioAttributesImplBaseParcelizer<Float> {
    }

    public interface MediaBrowserCompatItemReceiver extends AudioAttributesImplBaseParcelizer<Integer> {
    }

    public interface RemoteActionCompatParcelizer<T extends IconCompatParcelizer> {
        T IconCompatParcelizer();
    }

    public interface read extends AudioAttributesImplBaseParcelizer<Boolean> {
    }

    public interface write extends AudioAttributesImplBaseParcelizer<Double> {
    }

    public static int IconCompatParcelizer(boolean z) {
        return z ? 1231 : 1237;
    }

    public static int read(long j) {
        return (int) (j ^ (j >>> 32));
    }

    static <T> T read(T t) {
        return t;
    }

    static {
        Charset.forName(CharsetNames.ISO_8859_1);
        byte[] bArr = new byte[0];
        AudioAttributesCompatParcelizer = bArr;
        ByteBuffer.wrap(bArr);
        getOwner.AudioAttributesCompatParcelizer(bArr);
    }

    static <T> T read(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    public static boolean read(byte[] bArr) {
        return _emptyAnnotationMaps.write(bArr);
    }

    public static String AudioAttributesCompatParcelizer(byte[] bArr) {
        return new String(bArr, write);
    }

    public static int RemoteActionCompatParcelizer(byte[] bArr) {
        return RemoteActionCompatParcelizer(bArr, bArr.length);
    }

    private static int RemoteActionCompatParcelizer(byte[] bArr, int i) {
        int iWrite = write(i, bArr, 0, i);
        if (iWrite == 0) {
            return 1;
        }
        return iWrite;
    }

    static int write(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }

    static Object RemoteActionCompatParcelizer(Object obj, Object obj2) {
        return ((constructPropertyCollector) obj).onPrepareFromMediaId().RemoteActionCompatParcelizer((constructPropertyCollector) obj2).read();
    }
}
