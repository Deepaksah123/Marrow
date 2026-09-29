package kotlin;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import kotlin.DownloadFailureReason;

/* JADX INFO: loaded from: classes3.dex */
public final class forMediaItem {
    public static boolean write(Class<?> cls) {
        return read(cls.getName());
    }

    private static boolean read(String str) {
        return str.startsWith("java.") || str.startsWith("javax.");
    }

    public static boolean AudioAttributesCompatParcelizer(Class<?> cls) {
        return IconCompatParcelizer(cls.getName());
    }

    private static boolean IconCompatParcelizer(String str) {
        return str.startsWith("android.") || str.startsWith("androidx.") || read(str);
    }

    public static boolean read(Class<?> cls) {
        String name = cls.getName();
        return IconCompatParcelizer(name) || name.startsWith("kotlin.") || name.startsWith("kotlinx.") || name.startsWith("scala.");
    }

    public static DownloadFailureReason.read RemoteActionCompatParcelizer(List<DownloadFailureReason> list, Class<?> cls) {
        Iterator<DownloadFailureReason> it = list.iterator();
        while (it.hasNext()) {
            DownloadFailureReason.read readVarAudioAttributesCompatParcelizer = it.next().AudioAttributesCompatParcelizer(cls);
            if (readVarAudioAttributesCompatParcelizer != DownloadFailureReason.read.INDECISIVE) {
                return readVarAudioAttributesCompatParcelizer;
            }
        }
        return DownloadFailureReason.read.ALLOW;
    }

    public static boolean IconCompatParcelizer(AccessibleObject accessibleObject, Object obj) {
        return write.AudioAttributesCompatParcelizer.read(accessibleObject, obj);
    }

    static abstract class write {
        public static final write AudioAttributesCompatParcelizer;

        public abstract boolean read(AccessibleObject accessibleObject, Object obj);

        private write() {
        }

        /* synthetic */ write(byte b) {
            this();
        }

        static {
            write writeVar;
            if (createMediaSource.AudioAttributesCompatParcelizer()) {
                try {
                    final Method declaredMethod = AccessibleObject.class.getDeclaredMethod("canAccess", Object.class);
                    writeVar = new write() { // from class: o.forMediaItem.write.5
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super((byte) 0);
                        }

                        @Override // o.forMediaItem.write
                        public final boolean read(AccessibleObject accessibleObject, Object obj) {
                            try {
                                return ((Boolean) declaredMethod.invoke(accessibleObject, obj)).booleanValue();
                            } catch (Exception e) {
                                throw new RuntimeException("Failed invoking canAccess", e);
                            }
                        }
                    };
                } catch (NoSuchMethodException unused) {
                    writeVar = null;
                }
            } else {
                writeVar = null;
            }
            if (writeVar == null) {
                writeVar = new write() { // from class: o.forMediaItem.write.1
                    @Override // o.forMediaItem.write
                    public final boolean read(AccessibleObject accessibleObject, Object obj) {
                        return true;
                    }
                };
            }
            AudioAttributesCompatParcelizer = writeVar;
        }
    }
}
