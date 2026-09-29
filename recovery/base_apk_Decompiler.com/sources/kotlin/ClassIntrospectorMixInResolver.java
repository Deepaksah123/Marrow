package kotlin;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes4.dex */
final class ClassIntrospectorMixInResolver {
    static final boolean IconCompatParcelizer;
    private static final Logger MediaBrowserCompatItemReceiver = Logger.getLogger(ClassIntrospectorMixInResolver.class.getName());
    private static final Unsafe AudioAttributesImplBaseParcelizer = read();
    private static final Class<?> MediaBrowserCompatCustomActionResultReceiver = AnnotatedMethodCollectorMethodBuilder.AudioAttributesCompatParcelizer();
    private static final boolean AudioAttributesImplApi26Parcelizer = IconCompatParcelizer((Class<?>) Long.TYPE);
    private static final boolean write = IconCompatParcelizer((Class<?>) Integer.TYPE);
    private static final read AudioAttributesImplApi21Parcelizer = write();
    private static final boolean RemoteActionCompatParcelizer = MediaBrowserCompatCustomActionResultReceiver();
    private static final boolean AudioAttributesCompatParcelizer = AudioAttributesImplApi21Parcelizer();
    private static long read = read(byte[].class);

    static {
        read(boolean[].class);
        RemoteActionCompatParcelizer((Class<?>) boolean[].class);
        read(int[].class);
        RemoteActionCompatParcelizer((Class<?>) int[].class);
        read(long[].class);
        RemoteActionCompatParcelizer((Class<?>) long[].class);
        read(float[].class);
        RemoteActionCompatParcelizer((Class<?>) float[].class);
        read(double[].class);
        RemoteActionCompatParcelizer((Class<?>) double[].class);
        read(Object[].class);
        RemoteActionCompatParcelizer((Class<?>) Object[].class);
        IconCompatParcelizer(IconCompatParcelizer());
        IconCompatParcelizer = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    private ClassIntrospectorMixInResolver() {
    }

    static boolean AudioAttributesCompatParcelizer() {
        return AudioAttributesCompatParcelizer;
    }

    static boolean RemoteActionCompatParcelizer() {
        return RemoteActionCompatParcelizer;
    }

    static <T> T write(Class<T> cls) {
        try {
            return (T) AudioAttributesImplBaseParcelizer.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    static long RemoteActionCompatParcelizer(Field field) {
        return AudioAttributesImplApi21Parcelizer.write(field);
    }

    private static int read(Class<?> cls) {
        if (AudioAttributesCompatParcelizer) {
            return AudioAttributesImplApi21Parcelizer.write(cls);
        }
        return -1;
    }

    private static int RemoteActionCompatParcelizer(Class<?> cls) {
        if (AudioAttributesCompatParcelizer) {
            return AudioAttributesImplApi21Parcelizer.IconCompatParcelizer(cls);
        }
        return -1;
    }

    static int MediaBrowserCompatCustomActionResultReceiver(Object obj, long j) {
        return AudioAttributesImplApi21Parcelizer.read(obj, j);
    }

    static void write(Object obj, long j, int i) {
        AudioAttributesImplApi21Parcelizer.read(obj, j, i);
    }

    static long MediaBrowserCompatItemReceiver(Object obj, long j) {
        return AudioAttributesImplApi21Parcelizer.MediaBrowserCompatItemReceiver(obj, j);
    }

    static void read(Object obj, long j, long j2) {
        AudioAttributesImplApi21Parcelizer.IconCompatParcelizer(obj, j, j2);
    }

    static boolean write(Object obj, long j) {
        return AudioAttributesImplApi21Parcelizer.RemoteActionCompatParcelizer(obj, j);
    }

    static void RemoteActionCompatParcelizer(Object obj, long j, boolean z) {
        AudioAttributesImplApi21Parcelizer.read(obj, j, z);
    }

    static float AudioAttributesImplBaseParcelizer(Object obj, long j) {
        return AudioAttributesImplApi21Parcelizer.write(obj, j);
    }

    static void write(Object obj, long j, float f) {
        AudioAttributesImplApi21Parcelizer.read(obj, j, f);
    }

    static double AudioAttributesImplApi26Parcelizer(Object obj, long j) {
        return AudioAttributesImplApi21Parcelizer.AudioAttributesCompatParcelizer(obj, j);
    }

    static void read(Object obj, long j, double d) {
        AudioAttributesImplApi21Parcelizer.read(obj, j, d);
    }

    static Object AudioAttributesImplApi21Parcelizer(Object obj, long j) {
        return AudioAttributesImplApi21Parcelizer.AudioAttributesImplBaseParcelizer(obj, j);
    }

    static void read(Object obj, long j, Object obj2) {
        AudioAttributesImplApi21Parcelizer.write(obj, j, obj2);
    }

    static byte write(byte[] bArr, long j) {
        return AudioAttributesImplApi21Parcelizer.IconCompatParcelizer(bArr, read + j);
    }

    static void IconCompatParcelizer(byte[] bArr, long j, byte b) {
        AudioAttributesImplApi21Parcelizer.write(bArr, read + j, b);
    }

    static Unsafe read() {
        try {
            return (Unsafe) AccessController.doPrivileged(new PrivilegedExceptionAction<Unsafe>() { // from class: o.ClassIntrospectorMixInResolver.2
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

    private static read write() {
        Unsafe unsafe = AudioAttributesImplBaseParcelizer;
        if (unsafe == null) {
            return null;
        }
        if (AnnotatedMethodCollectorMethodBuilder.RemoteActionCompatParcelizer()) {
            if (AudioAttributesImplApi26Parcelizer) {
                return new AudioAttributesCompatParcelizer(unsafe);
            }
            if (write) {
                return new write(unsafe);
            }
            return null;
        }
        return new RemoteActionCompatParcelizer(unsafe);
    }

    private static boolean AudioAttributesImplApi21Parcelizer() {
        Unsafe unsafe = AudioAttributesImplBaseParcelizer;
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
            if (AnnotatedMethodCollectorMethodBuilder.RemoteActionCompatParcelizer()) {
                return true;
            }
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
            MediaBrowserCompatItemReceiver.log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: ".concat(String.valueOf(th)));
            return false;
        }
    }

    private static boolean MediaBrowserCompatCustomActionResultReceiver() {
        Unsafe unsafe = AudioAttributesImplBaseParcelizer;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
            cls.getMethod("getLong", Object.class, Long.TYPE);
            if (IconCompatParcelizer() == null) {
                return false;
            }
            if (AnnotatedMethodCollectorMethodBuilder.RemoteActionCompatParcelizer()) {
                return true;
            }
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
            MediaBrowserCompatItemReceiver.log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: ".concat(String.valueOf(th)));
            return false;
        }
    }

    private static boolean IconCompatParcelizer(Class<?> cls) {
        if (!AnnotatedMethodCollectorMethodBuilder.RemoteActionCompatParcelizer()) {
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

    private static Field IconCompatParcelizer() {
        Field fieldRemoteActionCompatParcelizer;
        if (AnnotatedMethodCollectorMethodBuilder.RemoteActionCompatParcelizer() && (fieldRemoteActionCompatParcelizer = RemoteActionCompatParcelizer((Class<?>) Buffer.class, "effectiveDirectAddress")) != null) {
            return fieldRemoteActionCompatParcelizer;
        }
        Field fieldRemoteActionCompatParcelizer2 = RemoteActionCompatParcelizer((Class<?>) Buffer.class, "address");
        if (fieldRemoteActionCompatParcelizer2 == null || fieldRemoteActionCompatParcelizer2.getType() != Long.TYPE) {
            return null;
        }
        return fieldRemoteActionCompatParcelizer2;
    }

    private static long IconCompatParcelizer(Field field) {
        read readVar;
        if (field == null || (readVar = AudioAttributesImplApi21Parcelizer) == null) {
            return -1L;
        }
        return readVar.write(field);
    }

    private static Field RemoteActionCompatParcelizer(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    static abstract class read {
        Unsafe RemoteActionCompatParcelizer;

        public abstract double AudioAttributesCompatParcelizer(Object obj, long j);

        public abstract byte IconCompatParcelizer(Object obj, long j);

        public abstract boolean RemoteActionCompatParcelizer(Object obj, long j);

        public abstract void read(Object obj, long j, double d);

        public abstract void read(Object obj, long j, float f);

        public abstract void read(Object obj, long j, boolean z);

        public abstract float write(Object obj, long j);

        public abstract void write(Object obj, long j, byte b);

        read(Unsafe unsafe) {
            this.RemoteActionCompatParcelizer = unsafe;
        }

        public final long write(Field field) {
            return this.RemoteActionCompatParcelizer.objectFieldOffset(field);
        }

        public final int read(Object obj, long j) {
            return this.RemoteActionCompatParcelizer.getInt(obj, j);
        }

        public final void read(Object obj, long j, int i) {
            this.RemoteActionCompatParcelizer.putInt(obj, j, i);
        }

        public final long MediaBrowserCompatItemReceiver(Object obj, long j) {
            return this.RemoteActionCompatParcelizer.getLong(obj, j);
        }

        public final void IconCompatParcelizer(Object obj, long j, long j2) {
            this.RemoteActionCompatParcelizer.putLong(obj, j, j2);
        }

        public final Object AudioAttributesImplBaseParcelizer(Object obj, long j) {
            return this.RemoteActionCompatParcelizer.getObject(obj, j);
        }

        public final void write(Object obj, long j, Object obj2) {
            this.RemoteActionCompatParcelizer.putObject(obj, j, obj2);
        }

        public final int write(Class<?> cls) {
            return this.RemoteActionCompatParcelizer.arrayBaseOffset(cls);
        }

        public final int IconCompatParcelizer(Class<?> cls) {
            return this.RemoteActionCompatParcelizer.arrayIndexScale(cls);
        }
    }

    static final class RemoteActionCompatParcelizer extends read {
        RemoteActionCompatParcelizer(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // o.ClassIntrospectorMixInResolver.read
        public final byte IconCompatParcelizer(Object obj, long j) {
            return this.RemoteActionCompatParcelizer.getByte(obj, j);
        }

        @Override // o.ClassIntrospectorMixInResolver.read
        public final void write(Object obj, long j, byte b) {
            this.RemoteActionCompatParcelizer.putByte(obj, j, b);
        }

        @Override // o.ClassIntrospectorMixInResolver.read
        public final boolean RemoteActionCompatParcelizer(Object obj, long j) {
            return this.RemoteActionCompatParcelizer.getBoolean(obj, j);
        }

        @Override // o.ClassIntrospectorMixInResolver.read
        public final void read(Object obj, long j, boolean z) {
            this.RemoteActionCompatParcelizer.putBoolean(obj, j, z);
        }

        @Override // o.ClassIntrospectorMixInResolver.read
        public final float write(Object obj, long j) {
            return this.RemoteActionCompatParcelizer.getFloat(obj, j);
        }

        @Override // o.ClassIntrospectorMixInResolver.read
        public final void read(Object obj, long j, float f) {
            this.RemoteActionCompatParcelizer.putFloat(obj, j, f);
        }

        @Override // o.ClassIntrospectorMixInResolver.read
        public final double AudioAttributesCompatParcelizer(Object obj, long j) {
            return this.RemoteActionCompatParcelizer.getDouble(obj, j);
        }

        @Override // o.ClassIntrospectorMixInResolver.read
        public final void read(Object obj, long j, double d) {
            this.RemoteActionCompatParcelizer.putDouble(obj, j, d);
        }
    }

    static final class AudioAttributesCompatParcelizer extends read {
        AudioAttributesCompatParcelizer(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // o.ClassIntrospectorMixInResolver.read
        public final byte IconCompatParcelizer(Object obj, long j) {
            return ClassIntrospectorMixInResolver.IconCompatParcelizer ? ClassIntrospectorMixInResolver.MediaBrowserCompatMediaItem(obj, j) : ClassIntrospectorMixInResolver.MediaDescriptionCompat(obj, j);
        }

        @Override // o.ClassIntrospectorMixInResolver.read
        public final void write(Object obj, long j, byte b) {
            if (ClassIntrospectorMixInResolver.IconCompatParcelizer) {
                ClassIntrospectorMixInResolver.read(obj, j, b);
            } else {
                ClassIntrospectorMixInResolver.RemoteActionCompatParcelizer(obj, j, b);
            }
        }

        @Override // o.ClassIntrospectorMixInResolver.read
        public final boolean RemoteActionCompatParcelizer(Object obj, long j) {
            return ClassIntrospectorMixInResolver.IconCompatParcelizer ? ClassIntrospectorMixInResolver.MediaBrowserCompatSearchResultReceiver(obj, j) : ClassIntrospectorMixInResolver.RatingCompat(obj, j);
        }

        @Override // o.ClassIntrospectorMixInResolver.read
        public final void read(Object obj, long j, boolean z) {
            if (ClassIntrospectorMixInResolver.IconCompatParcelizer) {
                ClassIntrospectorMixInResolver.read(obj, j, z);
            } else {
                ClassIntrospectorMixInResolver.write(obj, j, z);
            }
        }

        @Override // o.ClassIntrospectorMixInResolver.read
        public final float write(Object obj, long j) {
            return Float.intBitsToFloat(read(obj, j));
        }

        @Override // o.ClassIntrospectorMixInResolver.read
        public final void read(Object obj, long j, float f) {
            read(obj, j, Float.floatToIntBits(f));
        }

        @Override // o.ClassIntrospectorMixInResolver.read
        public final double AudioAttributesCompatParcelizer(Object obj, long j) {
            return Double.longBitsToDouble(MediaBrowserCompatItemReceiver(obj, j));
        }

        @Override // o.ClassIntrospectorMixInResolver.read
        public final void read(Object obj, long j, double d) {
            IconCompatParcelizer(obj, j, Double.doubleToLongBits(d));
        }
    }

    static final class write extends read {
        write(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // o.ClassIntrospectorMixInResolver.read
        public final byte IconCompatParcelizer(Object obj, long j) {
            return ClassIntrospectorMixInResolver.IconCompatParcelizer ? ClassIntrospectorMixInResolver.MediaBrowserCompatMediaItem(obj, j) : ClassIntrospectorMixInResolver.MediaDescriptionCompat(obj, j);
        }

        @Override // o.ClassIntrospectorMixInResolver.read
        public final void write(Object obj, long j, byte b) {
            if (ClassIntrospectorMixInResolver.IconCompatParcelizer) {
                ClassIntrospectorMixInResolver.read(obj, j, b);
            } else {
                ClassIntrospectorMixInResolver.RemoteActionCompatParcelizer(obj, j, b);
            }
        }

        @Override // o.ClassIntrospectorMixInResolver.read
        public final boolean RemoteActionCompatParcelizer(Object obj, long j) {
            return ClassIntrospectorMixInResolver.IconCompatParcelizer ? ClassIntrospectorMixInResolver.MediaBrowserCompatSearchResultReceiver(obj, j) : ClassIntrospectorMixInResolver.RatingCompat(obj, j);
        }

        @Override // o.ClassIntrospectorMixInResolver.read
        public final void read(Object obj, long j, boolean z) {
            if (ClassIntrospectorMixInResolver.IconCompatParcelizer) {
                ClassIntrospectorMixInResolver.read(obj, j, z);
            } else {
                ClassIntrospectorMixInResolver.write(obj, j, z);
            }
        }

        @Override // o.ClassIntrospectorMixInResolver.read
        public final float write(Object obj, long j) {
            return Float.intBitsToFloat(read(obj, j));
        }

        @Override // o.ClassIntrospectorMixInResolver.read
        public final void read(Object obj, long j, float f) {
            read(obj, j, Float.floatToIntBits(f));
        }

        @Override // o.ClassIntrospectorMixInResolver.read
        public final double AudioAttributesCompatParcelizer(Object obj, long j) {
            return Double.longBitsToDouble(MediaBrowserCompatItemReceiver(obj, j));
        }

        @Override // o.ClassIntrospectorMixInResolver.read
        public final void read(Object obj, long j, double d) {
            IconCompatParcelizer(obj, j, Double.doubleToLongBits(d));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte MediaBrowserCompatMediaItem(Object obj, long j) {
        return (byte) (MediaBrowserCompatCustomActionResultReceiver(obj, (-4) & j) >>> ((int) (((~j) & 3) << 3)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte MediaDescriptionCompat(Object obj, long j) {
        return (byte) (MediaBrowserCompatCustomActionResultReceiver(obj, (-4) & j) >>> ((int) ((j & 3) << 3)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void read(Object obj, long j, byte b) {
        long j2 = (-4) & j;
        int iMediaBrowserCompatCustomActionResultReceiver = MediaBrowserCompatCustomActionResultReceiver(obj, j2);
        int i = ((~((int) j)) & 3) << 3;
        write(obj, j2, ((~(255 << i)) & iMediaBrowserCompatCustomActionResultReceiver) | ((b & 255) << i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void RemoteActionCompatParcelizer(Object obj, long j, byte b) {
        long j2 = (-4) & j;
        int i = (((int) j) & 3) << 3;
        int i2 = (b & 255) << i;
        write(obj, j2, ((~(255 << i)) & MediaBrowserCompatCustomActionResultReceiver(obj, j2)) | i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean MediaBrowserCompatSearchResultReceiver(Object obj, long j) {
        return MediaBrowserCompatMediaItem(obj, j) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean RatingCompat(Object obj, long j) {
        return MediaDescriptionCompat(obj, j) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void read(Object obj, long j, boolean z) {
        read(obj, j, z ? (byte) 1 : (byte) 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void write(Object obj, long j, boolean z) {
        RemoteActionCompatParcelizer(obj, j, z ? (byte) 1 : (byte) 0);
    }
}
