package kotlin;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.List;
import java.util.RandomAccess;
import org.apache.commons.compress.utils.CharsetNames;

/* JADX INFO: loaded from: classes3.dex */
public final class getDownloadIndex {
    static final Charset IconCompatParcelizer;
    public static final byte[] write;

    public interface AudioAttributesCompatParcelizer {
    }

    public interface IconCompatParcelizer extends MediaBrowserCompatItemReceiver<Integer> {
        void RemoteActionCompatParcelizer(int i);

        IconCompatParcelizer read(int i);

        int write(int i);
    }

    public interface MediaBrowserCompatItemReceiver<E> extends List<E>, RandomAccess {
        MediaBrowserCompatItemReceiver<E> AudioAttributesCompatParcelizer(int i);

        boolean AudioAttributesCompatParcelizer();

        void RemoteActionCompatParcelizer();
    }

    public interface RemoteActionCompatParcelizer extends MediaBrowserCompatItemReceiver<Long> {
    }

    public interface write {
        int AudioAttributesCompatParcelizer();
    }

    static <T> T RemoteActionCompatParcelizer(T t) {
        return t;
    }

    public static int read(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static int write(boolean z) {
        return z ? 1231 : 1237;
    }

    static {
        Charset.forName(CharsetNames.US_ASCII);
        IconCompatParcelizer = Charset.forName(CharsetNames.UTF_8);
        Charset.forName(CharsetNames.ISO_8859_1);
        byte[] bArr = new byte[0];
        write = bArr;
        ByteBuffer.wrap(bArr);
        r8lambdayrUeic0SkelIVzAhyN8h2i3DiE.read(bArr);
    }

    static <T> T AudioAttributesCompatParcelizer(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    public static boolean IconCompatParcelizer(byte[] bArr) {
        return copyWithKeySetId.write(bArr);
    }

    public static String read(byte[] bArr) {
        return new String(bArr, IconCompatParcelizer);
    }

    public static int AudioAttributesCompatParcelizer(byte[] bArr) {
        return RemoteActionCompatParcelizer(bArr, bArr.length);
    }

    private static int RemoteActionCompatParcelizer(byte[] bArr, int i) {
        int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(i, bArr, 0, i);
        if (iRemoteActionCompatParcelizer == 0) {
            return 1;
        }
        return iRemoteActionCompatParcelizer;
    }

    static int RemoteActionCompatParcelizer(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }

    public static class read<F, T> extends AbstractList<T> {
        private final IconCompatParcelizer<F, T> read;
        private final List<F> write;

        public interface IconCompatParcelizer<F, T> {
        }

        @Override // java.util.AbstractList, java.util.List
        public final T get(int i) {
            throw null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            throw null;
        }
    }
}
