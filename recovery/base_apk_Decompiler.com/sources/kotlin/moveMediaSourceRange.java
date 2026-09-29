package kotlin;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Queue;

/* JADX INFO: loaded from: classes2.dex */
public final class moveMediaSourceRange {
    private static volatile Handler IconCompatParcelizer;
    private static final char[] AudioAttributesCompatParcelizer = "0123456789abcdef".toCharArray();
    private static final char[] write = new char[64];

    public static boolean AudioAttributesCompatParcelizer(int i) {
        return i > 0 || i == Integer.MIN_VALUE;
    }

    public static int read(int i, int i2) {
        return (i2 * 31) + i;
    }

    private moveMediaSourceRange() {
    }

    public static String IconCompatParcelizer(byte[] bArr) {
        String str;
        char[] cArr = write;
        synchronized (cArr) {
            str = read(bArr, cArr);
        }
        return str;
    }

    private static String read(byte[] bArr, char[] cArr) {
        for (int i = 0; i < bArr.length; i++) {
            byte b = bArr[i];
            int i2 = i << 1;
            char[] cArr2 = AudioAttributesCompatParcelizer;
            cArr[i2] = cArr2[(b & 255) >>> 4];
            cArr[i2 + 1] = cArr2[b & 15];
        }
        return new String(cArr);
    }

    public static int RemoteActionCompatParcelizer(Bitmap bitmap) {
        if (bitmap.isRecycled()) {
            StringBuilder sb = new StringBuilder("Cannot obtain size for recycled Bitmap: ");
            sb.append(bitmap);
            sb.append("[");
            sb.append(bitmap.getWidth());
            sb.append("x");
            sb.append(bitmap.getHeight());
            sb.append("] ");
            sb.append(bitmap.getConfig());
            throw new IllegalStateException(sb.toString());
        }
        try {
            return bitmap.getAllocationByteCount();
        } catch (NullPointerException unused) {
            return bitmap.getHeight() * bitmap.getRowBytes();
        }
    }

    public static int AudioAttributesCompatParcelizer(int i, int i2, Bitmap.Config config) {
        return i * i2 * read(config);
    }

    public static int read(Bitmap.Config config) {
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        int i = AnonymousClass5.write[config.ordinal()];
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2 && i != 3) {
                return i != 4 ? 4 : 8;
            }
        }
        return i2;
    }

    /* JADX INFO: renamed from: o.moveMediaSourceRange$5, reason: invalid class name */
    static /* synthetic */ class AnonymousClass5 {
        static final /* synthetic */ int[] write;

        static {
            int[] iArr = new int[Bitmap.Config.values().length];
            write = iArr;
            try {
                iArr[Bitmap.Config.ALPHA_8.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                write[Bitmap.Config.RGB_565.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                write[Bitmap.Config.ARGB_4444.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                write[Bitmap.Config.RGBA_F16.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                write[Bitmap.Config.ARGB_8888.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public static boolean IconCompatParcelizer(int i, int i2) {
        return AudioAttributesCompatParcelizer(i) && AudioAttributesCompatParcelizer(i2);
    }

    public static void RemoteActionCompatParcelizer(Runnable runnable) {
        AudioAttributesCompatParcelizer().post(runnable);
    }

    public static void write(Runnable runnable) {
        AudioAttributesCompatParcelizer().removeCallbacks(runnable);
    }

    private static Handler AudioAttributesCompatParcelizer() {
        if (IconCompatParcelizer == null) {
            synchronized (moveMediaSourceRange.class) {
                if (IconCompatParcelizer == null) {
                    IconCompatParcelizer = new Handler(Looper.getMainLooper());
                }
            }
        }
        return IconCompatParcelizer;
    }

    public static void write() {
        if (!IconCompatParcelizer()) {
            throw new IllegalArgumentException("You must call this method on the main thread");
        }
    }

    public static void RemoteActionCompatParcelizer() {
        if (!read()) {
            throw new IllegalArgumentException("You must call this method on a background thread");
        }
    }

    public static boolean IconCompatParcelizer() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    public static boolean read() {
        return !IconCompatParcelizer();
    }

    public static <T> Queue<T> write(int i) {
        return new ArrayDeque(i);
    }

    public static <T> List<T> RemoteActionCompatParcelizer(Collection<T> collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        for (T t : collection) {
            if (t != null) {
                arrayList.add(t);
            }
        }
        return arrayList;
    }

    public static boolean IconCompatParcelizer(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    public static boolean write(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        if (obj instanceof MediaItemLocalConfiguration) {
            return ((MediaItemLocalConfiguration) obj).AudioAttributesCompatParcelizer();
        }
        return obj.equals(obj2);
    }

    public static boolean read(notifyQueueUpdate<?> notifyqueueupdate, notifyQueueUpdate<?> notifyqueueupdate2) {
        if (notifyqueueupdate == null) {
            return notifyqueueupdate2 == null;
        }
        return notifyqueueupdate.write(notifyqueueupdate2);
    }

    public static int AudioAttributesCompatParcelizer(float f) {
        return IconCompatParcelizer(f);
    }

    private static int IconCompatParcelizer(float f) {
        return read(Float.floatToIntBits(f), 17);
    }

    public static int write(Object obj, int i) {
        return read(obj == null ? 0 : obj.hashCode(), i);
    }

    public static int write(boolean z, int i) {
        return read(z ? 1 : 0, i);
    }
}
