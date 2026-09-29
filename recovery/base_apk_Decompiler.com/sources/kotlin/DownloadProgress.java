package kotlin;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes3.dex */
final class DownloadProgress {
    static final boolean read;
    private static final Unsafe AudioAttributesImplApi21Parcelizer = write();
    private static final Class<?> MediaBrowserCompatCustomActionResultReceiver = DownloadHelperLiveContentUnsupportedException.AudioAttributesCompatParcelizer();
    private static final boolean AudioAttributesImplBaseParcelizer = read((Class<?>) Long.TYPE);
    private static final boolean IconCompatParcelizer = read((Class<?>) Integer.TYPE);
    private static final AudioAttributesCompatParcelizer MediaBrowserCompatItemReceiver = AudioAttributesImplBaseParcelizer();
    private static final boolean write = MediaBrowserCompatCustomActionResultReceiver();
    private static final boolean RemoteActionCompatParcelizer = AudioAttributesImplApi26Parcelizer();
    static final long AudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer((Class<?>) byte[].class);

    static {
        AudioAttributesCompatParcelizer((Class<?>) boolean[].class);
        write(boolean[].class);
        AudioAttributesCompatParcelizer((Class<?>) int[].class);
        write(int[].class);
        AudioAttributesCompatParcelizer((Class<?>) long[].class);
        write(long[].class);
        AudioAttributesCompatParcelizer((Class<?>) float[].class);
        write(float[].class);
        AudioAttributesCompatParcelizer((Class<?>) double[].class);
        write(double[].class);
        AudioAttributesCompatParcelizer((Class<?>) Object[].class);
        write(Object[].class);
        IconCompatParcelizer(AudioAttributesCompatParcelizer());
        read = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    private DownloadProgress() {
    }

    static boolean read() {
        return RemoteActionCompatParcelizer;
    }

    static boolean RemoteActionCompatParcelizer() {
        return write;
    }

    static <T> T IconCompatParcelizer(Class<T> cls) {
        try {
            return (T) AudioAttributesImplApi21Parcelizer.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    static long read(Field field) {
        return MediaBrowserCompatItemReceiver.read(field);
    }

    private static int AudioAttributesCompatParcelizer(Class<?> cls) {
        if (RemoteActionCompatParcelizer) {
            return MediaBrowserCompatItemReceiver.IconCompatParcelizer(cls);
        }
        return -1;
    }

    private static int write(Class<?> cls) {
        if (RemoteActionCompatParcelizer) {
            return MediaBrowserCompatItemReceiver.AudioAttributesCompatParcelizer(cls);
        }
        return -1;
    }

    static int AudioAttributesImplApi21Parcelizer(Object obj, long j) {
        return MediaBrowserCompatItemReceiver.AudioAttributesCompatParcelizer(obj, j);
    }

    static void write(Object obj, long j, int i) {
        MediaBrowserCompatItemReceiver.read(obj, j, i);
    }

    static long MediaBrowserCompatItemReceiver(Object obj, long j) {
        return MediaBrowserCompatItemReceiver.AudioAttributesImplBaseParcelizer(obj, j);
    }

    static void write(Object obj, long j, long j2) {
        MediaBrowserCompatItemReceiver.read(obj, j, j2);
    }

    static boolean IconCompatParcelizer(Object obj, long j) {
        return MediaBrowserCompatItemReceiver.IconCompatParcelizer(obj, j);
    }

    static void AudioAttributesCompatParcelizer(Object obj, long j, boolean z) {
        MediaBrowserCompatItemReceiver.IconCompatParcelizer(obj, j, z);
    }

    static float AudioAttributesImplBaseParcelizer(Object obj, long j) {
        return MediaBrowserCompatItemReceiver.write(obj, j);
    }

    static void RemoteActionCompatParcelizer(Object obj, long j, float f) {
        MediaBrowserCompatItemReceiver.write(obj, j, f);
    }

    static double AudioAttributesImplApi26Parcelizer(Object obj, long j) {
        return MediaBrowserCompatItemReceiver.RemoteActionCompatParcelizer(obj, j);
    }

    static void write(Object obj, long j, double d) {
        MediaBrowserCompatItemReceiver.IconCompatParcelizer(obj, j, d);
    }

    static Object MediaBrowserCompatCustomActionResultReceiver(Object obj, long j) {
        return MediaBrowserCompatItemReceiver.MediaBrowserCompatItemReceiver(obj, j);
    }

    static void write(Object obj, long j, Object obj2) {
        MediaBrowserCompatItemReceiver.AudioAttributesCompatParcelizer(obj, j, obj2);
    }

    static byte RemoteActionCompatParcelizer(byte[] bArr, long j) {
        return MediaBrowserCompatItemReceiver.read(bArr, AudioAttributesCompatParcelizer + j);
    }

    static void write(byte[] bArr, long j, byte b) {
        MediaBrowserCompatItemReceiver.RemoteActionCompatParcelizer(bArr, AudioAttributesCompatParcelizer + j, b);
    }

    static Unsafe write() {
        try {
            return (Unsafe) AccessController.doPrivileged(new PrivilegedExceptionAction<Unsafe>() { // from class: o.DownloadProgress.2
                @Override // java.security.PrivilegedExceptionAction
                public final /* synthetic */ Unsafe run() throws Exception {
                    return AudioAttributesCompatParcelizer();
                }

                private static Unsafe AudioAttributesCompatParcelizer() throws Exception {
                    for (Field field : Unsafe.class.getDeclaredFields()) {
                        field.setAccessible(true);
                        Object obj = field.get(null);
                        if (Unsafe.class.isInstance(obj)) {
                            return (Unsafe) Unsafe.class.cast(obj);
                        }
                    }
                    return null;
                }
            });
        } catch (Throwable unused) {
            return null;
        }
    }

    private static AudioAttributesCompatParcelizer AudioAttributesImplBaseParcelizer() {
        Unsafe unsafe = AudioAttributesImplApi21Parcelizer;
        if (unsafe == null) {
            return null;
        }
        if (DownloadHelperLiveContentUnsupportedException.RemoteActionCompatParcelizer()) {
            if (AudioAttributesImplBaseParcelizer) {
                return new write(unsafe);
            }
            if (IconCompatParcelizer) {
                return new RemoteActionCompatParcelizer(unsafe);
            }
            return null;
        }
        return new IconCompatParcelizer(unsafe);
    }

    private static boolean AudioAttributesImplApi26Parcelizer() {
        AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = MediaBrowserCompatItemReceiver;
        if (audioAttributesCompatParcelizer == null) {
            return false;
        }
        return audioAttributesCompatParcelizer.RemoteActionCompatParcelizer();
    }

    private static boolean MediaBrowserCompatCustomActionResultReceiver() {
        AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = MediaBrowserCompatItemReceiver;
        if (audioAttributesCompatParcelizer == null) {
            return false;
        }
        return audioAttributesCompatParcelizer.AudioAttributesCompatParcelizer();
    }

    private static boolean read(Class<?> cls) {
        if (!DownloadHelperLiveContentUnsupportedException.RemoteActionCompatParcelizer()) {
            return false;
        }
        try {
            Class<?> cls2 = MediaBrowserCompatCustomActionResultReceiver;
            cls2.getMethod("peekLong", cls, Boolean.TYPE);
            cls2.getMethod("pokeLong", cls, Long.TYPE, Boolean.TYPE);
            cls2.getMethod("pokeInt", cls, Integer.TYPE, Boolean.TYPE);
            cls2.getMethod("peekInt", cls, Boolean.TYPE);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, Integer.TYPE, Integer.TYPE);
            cls2.getMethod("peekByteArray", cls, byte[].class, Integer.TYPE, Integer.TYPE);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Field AudioAttributesCompatParcelizer() {
        Field fieldRemoteActionCompatParcelizer;
        if (DownloadHelperLiveContentUnsupportedException.RemoteActionCompatParcelizer() && (fieldRemoteActionCompatParcelizer = RemoteActionCompatParcelizer((Class<?>) Buffer.class, "effectiveDirectAddress")) != null) {
            return fieldRemoteActionCompatParcelizer;
        }
        Field fieldRemoteActionCompatParcelizer2 = RemoteActionCompatParcelizer((Class<?>) Buffer.class, "address");
        if (fieldRemoteActionCompatParcelizer2 == null || fieldRemoteActionCompatParcelizer2.getType() != Long.TYPE) {
            return null;
        }
        return fieldRemoteActionCompatParcelizer2;
    }

    private static long IconCompatParcelizer(Field field) {
        AudioAttributesCompatParcelizer audioAttributesCompatParcelizer;
        if (field == null || (audioAttributesCompatParcelizer = MediaBrowserCompatItemReceiver) == null) {
            return -1L;
        }
        return audioAttributesCompatParcelizer.read(field);
    }

    private static Field RemoteActionCompatParcelizer(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    static abstract class AudioAttributesCompatParcelizer {
        Unsafe write;

        public abstract void IconCompatParcelizer(Object obj, long j, double d);

        public abstract void IconCompatParcelizer(Object obj, long j, boolean z);

        public abstract boolean IconCompatParcelizer(Object obj, long j);

        public abstract double RemoteActionCompatParcelizer(Object obj, long j);

        public abstract void RemoteActionCompatParcelizer(Object obj, long j, byte b);

        public abstract byte read(Object obj, long j);

        public abstract float write(Object obj, long j);

        public abstract void write(Object obj, long j, float f);

        AudioAttributesCompatParcelizer(Unsafe unsafe) {
            this.write = unsafe;
        }

        public final long read(Field field) {
            return this.write.objectFieldOffset(field);
        }

        public final int IconCompatParcelizer(Class<?> cls) {
            return this.write.arrayBaseOffset(cls);
        }

        public final int AudioAttributesCompatParcelizer(Class<?> cls) {
            return this.write.arrayIndexScale(cls);
        }

        public boolean RemoteActionCompatParcelizer() {
            Unsafe unsafe = this.write;
            if (unsafe == null) {
                return false;
            }
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                cls.getMethod("arrayBaseOffset", Class.class);
                cls.getMethod("arrayIndexScale", Class.class);
                cls.getMethod("getInt", Object.class, Long.TYPE);
                cls.getMethod("putInt", Object.class, Long.TYPE, Integer.TYPE);
                cls.getMethod("getLong", Object.class, Long.TYPE);
                cls.getMethod("putLong", Object.class, Long.TYPE, Long.TYPE);
                cls.getMethod("getObject", Object.class, Long.TYPE);
                cls.getMethod("putObject", Object.class, Long.TYPE, Object.class);
                return true;
            } catch (Throwable th) {
                DownloadProgress.RemoteActionCompatParcelizer(th);
                return false;
            }
        }

        public final int AudioAttributesCompatParcelizer(Object obj, long j) {
            return this.write.getInt(obj, j);
        }

        public final void read(Object obj, long j, int i) {
            this.write.putInt(obj, j, i);
        }

        public final long AudioAttributesImplBaseParcelizer(Object obj, long j) {
            return this.write.getLong(obj, j);
        }

        public final void read(Object obj, long j, long j2) {
            this.write.putLong(obj, j, j2);
        }

        public final Object MediaBrowserCompatItemReceiver(Object obj, long j) {
            return this.write.getObject(obj, j);
        }

        public final void AudioAttributesCompatParcelizer(Object obj, long j, Object obj2) {
            this.write.putObject(obj, j, obj2);
        }

        public boolean AudioAttributesCompatParcelizer() {
            Unsafe unsafe = this.write;
            if (unsafe == null) {
                return false;
            }
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                cls.getMethod("getLong", Object.class, Long.TYPE);
                return DownloadProgress.AudioAttributesCompatParcelizer() != null;
            } catch (Throwable th) {
                DownloadProgress.RemoteActionCompatParcelizer(th);
                return false;
            }
        }
    }

    static final class IconCompatParcelizer extends AudioAttributesCompatParcelizer {
        IconCompatParcelizer(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // o.DownloadProgress.AudioAttributesCompatParcelizer
        public final boolean RemoteActionCompatParcelizer() {
            if (!super.RemoteActionCompatParcelizer()) {
                return false;
            }
            try {
                Class<?> cls = this.write.getClass();
                cls.getMethod("getByte", Object.class, Long.TYPE);
                cls.getMethod("putByte", Object.class, Long.TYPE, Byte.TYPE);
                cls.getMethod("getBoolean", Object.class, Long.TYPE);
                cls.getMethod("putBoolean", Object.class, Long.TYPE, Boolean.TYPE);
                cls.getMethod("getFloat", Object.class, Long.TYPE);
                cls.getMethod("putFloat", Object.class, Long.TYPE, Float.TYPE);
                cls.getMethod("getDouble", Object.class, Long.TYPE);
                cls.getMethod("putDouble", Object.class, Long.TYPE, Double.TYPE);
                return true;
            } catch (Throwable th) {
                DownloadProgress.RemoteActionCompatParcelizer(th);
                return false;
            }
        }

        @Override // o.DownloadProgress.AudioAttributesCompatParcelizer
        public final byte read(Object obj, long j) {
            return this.write.getByte(obj, j);
        }

        @Override // o.DownloadProgress.AudioAttributesCompatParcelizer
        public final void RemoteActionCompatParcelizer(Object obj, long j, byte b) {
            this.write.putByte(obj, j, b);
        }

        @Override // o.DownloadProgress.AudioAttributesCompatParcelizer
        public final boolean IconCompatParcelizer(Object obj, long j) {
            return this.write.getBoolean(obj, j);
        }

        @Override // o.DownloadProgress.AudioAttributesCompatParcelizer
        public final void IconCompatParcelizer(Object obj, long j, boolean z) {
            this.write.putBoolean(obj, j, z);
        }

        @Override // o.DownloadProgress.AudioAttributesCompatParcelizer
        public final float write(Object obj, long j) {
            return this.write.getFloat(obj, j);
        }

        @Override // o.DownloadProgress.AudioAttributesCompatParcelizer
        public final void write(Object obj, long j, float f) {
            this.write.putFloat(obj, j, f);
        }

        @Override // o.DownloadProgress.AudioAttributesCompatParcelizer
        public final double RemoteActionCompatParcelizer(Object obj, long j) {
            return this.write.getDouble(obj, j);
        }

        @Override // o.DownloadProgress.AudioAttributesCompatParcelizer
        public final void IconCompatParcelizer(Object obj, long j, double d) {
            this.write.putDouble(obj, j, d);
        }

        @Override // o.DownloadProgress.AudioAttributesCompatParcelizer
        public final boolean AudioAttributesCompatParcelizer() {
            if (!super.AudioAttributesCompatParcelizer()) {
                return false;
            }
            try {
                Class<?> cls = this.write.getClass();
                cls.getMethod("getByte", Long.TYPE);
                cls.getMethod("putByte", Long.TYPE, Byte.TYPE);
                cls.getMethod("getInt", Long.TYPE);
                cls.getMethod("putInt", Long.TYPE, Integer.TYPE);
                cls.getMethod("getLong", Long.TYPE);
                cls.getMethod("putLong", Long.TYPE, Long.TYPE);
                cls.getMethod("copyMemory", Long.TYPE, Long.TYPE, Long.TYPE);
                cls.getMethod("copyMemory", Object.class, Long.TYPE, Object.class, Long.TYPE, Long.TYPE);
                return true;
            } catch (Throwable th) {
                DownloadProgress.RemoteActionCompatParcelizer(th);
                return false;
            }
        }
    }

    static final class write extends AudioAttributesCompatParcelizer {
        @Override // o.DownloadProgress.AudioAttributesCompatParcelizer
        public final boolean AudioAttributesCompatParcelizer() {
            return false;
        }

        write(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // o.DownloadProgress.AudioAttributesCompatParcelizer
        public final byte read(Object obj, long j) {
            return DownloadProgress.read ? DownloadProgress.MediaBrowserCompatSearchResultReceiver(obj, j) : DownloadProgress.MediaDescriptionCompat(obj, j);
        }

        @Override // o.DownloadProgress.AudioAttributesCompatParcelizer
        public final void RemoteActionCompatParcelizer(Object obj, long j, byte b) {
            if (DownloadProgress.read) {
                DownloadProgress.IconCompatParcelizer(obj, j, b);
            } else {
                DownloadProgress.RemoteActionCompatParcelizer(obj, j, b);
            }
        }

        @Override // o.DownloadProgress.AudioAttributesCompatParcelizer
        public final boolean IconCompatParcelizer(Object obj, long j) {
            return DownloadProgress.read ? DownloadProgress.MediaMetadataCompat(obj, j) : DownloadProgress.MediaBrowserCompatMediaItem(obj, j);
        }

        @Override // o.DownloadProgress.AudioAttributesCompatParcelizer
        public final void IconCompatParcelizer(Object obj, long j, boolean z) {
            if (DownloadProgress.read) {
                DownloadProgress.write(obj, j, z);
            } else {
                DownloadProgress.RemoteActionCompatParcelizer(obj, j, z);
            }
        }

        @Override // o.DownloadProgress.AudioAttributesCompatParcelizer
        public final float write(Object obj, long j) {
            return Float.intBitsToFloat(AudioAttributesCompatParcelizer(obj, j));
        }

        @Override // o.DownloadProgress.AudioAttributesCompatParcelizer
        public final void write(Object obj, long j, float f) {
            read(obj, j, Float.floatToIntBits(f));
        }

        @Override // o.DownloadProgress.AudioAttributesCompatParcelizer
        public final double RemoteActionCompatParcelizer(Object obj, long j) {
            return Double.longBitsToDouble(AudioAttributesImplBaseParcelizer(obj, j));
        }

        @Override // o.DownloadProgress.AudioAttributesCompatParcelizer
        public final void IconCompatParcelizer(Object obj, long j, double d) {
            read(obj, j, Double.doubleToLongBits(d));
        }
    }

    static final class RemoteActionCompatParcelizer extends AudioAttributesCompatParcelizer {
        @Override // o.DownloadProgress.AudioAttributesCompatParcelizer
        public final boolean AudioAttributesCompatParcelizer() {
            return false;
        }

        RemoteActionCompatParcelizer(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // o.DownloadProgress.AudioAttributesCompatParcelizer
        public final byte read(Object obj, long j) {
            return DownloadProgress.read ? DownloadProgress.MediaBrowserCompatSearchResultReceiver(obj, j) : DownloadProgress.MediaDescriptionCompat(obj, j);
        }

        @Override // o.DownloadProgress.AudioAttributesCompatParcelizer
        public final void RemoteActionCompatParcelizer(Object obj, long j, byte b) {
            if (DownloadProgress.read) {
                DownloadProgress.IconCompatParcelizer(obj, j, b);
            } else {
                DownloadProgress.RemoteActionCompatParcelizer(obj, j, b);
            }
        }

        @Override // o.DownloadProgress.AudioAttributesCompatParcelizer
        public final boolean IconCompatParcelizer(Object obj, long j) {
            return DownloadProgress.read ? DownloadProgress.MediaMetadataCompat(obj, j) : DownloadProgress.MediaBrowserCompatMediaItem(obj, j);
        }

        @Override // o.DownloadProgress.AudioAttributesCompatParcelizer
        public final void IconCompatParcelizer(Object obj, long j, boolean z) {
            if (DownloadProgress.read) {
                DownloadProgress.write(obj, j, z);
            } else {
                DownloadProgress.RemoteActionCompatParcelizer(obj, j, z);
            }
        }

        @Override // o.DownloadProgress.AudioAttributesCompatParcelizer
        public final float write(Object obj, long j) {
            return Float.intBitsToFloat(AudioAttributesCompatParcelizer(obj, j));
        }

        @Override // o.DownloadProgress.AudioAttributesCompatParcelizer
        public final void write(Object obj, long j, float f) {
            read(obj, j, Float.floatToIntBits(f));
        }

        @Override // o.DownloadProgress.AudioAttributesCompatParcelizer
        public final double RemoteActionCompatParcelizer(Object obj, long j) {
            return Double.longBitsToDouble(AudioAttributesImplBaseParcelizer(obj, j));
        }

        @Override // o.DownloadProgress.AudioAttributesCompatParcelizer
        public final void IconCompatParcelizer(Object obj, long j, double d) {
            read(obj, j, Double.doubleToLongBits(d));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte MediaBrowserCompatSearchResultReceiver(Object obj, long j) {
        return (byte) (AudioAttributesImplApi21Parcelizer(obj, (-4) & j) >>> ((int) (((~j) & 3) << 3)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte MediaDescriptionCompat(Object obj, long j) {
        return (byte) (AudioAttributesImplApi21Parcelizer(obj, (-4) & j) >>> ((int) ((j & 3) << 3)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void IconCompatParcelizer(Object obj, long j, byte b) {
        long j2 = (-4) & j;
        int iAudioAttributesImplApi21Parcelizer = AudioAttributesImplApi21Parcelizer(obj, j2);
        int i = ((~((int) j)) & 3) << 3;
        write(obj, j2, ((~(255 << i)) & iAudioAttributesImplApi21Parcelizer) | ((b & 255) << i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void RemoteActionCompatParcelizer(Object obj, long j, byte b) {
        long j2 = (-4) & j;
        int i = (((int) j) & 3) << 3;
        int i2 = (b & 255) << i;
        write(obj, j2, ((~(255 << i)) & AudioAttributesImplApi21Parcelizer(obj, j2)) | i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean MediaMetadataCompat(Object obj, long j) {
        return MediaBrowserCompatSearchResultReceiver(obj, j) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean MediaBrowserCompatMediaItem(Object obj, long j) {
        return MediaDescriptionCompat(obj, j) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void write(Object obj, long j, boolean z) {
        IconCompatParcelizer(obj, j, z ? (byte) 1 : (byte) 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void RemoteActionCompatParcelizer(Object obj, long j, boolean z) {
        RemoteActionCompatParcelizer(obj, j, z ? (byte) 1 : (byte) 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void RemoteActionCompatParcelizer(Throwable th) {
        Logger.getLogger(DownloadProgress.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: ".concat(String.valueOf(th)));
    }
}
