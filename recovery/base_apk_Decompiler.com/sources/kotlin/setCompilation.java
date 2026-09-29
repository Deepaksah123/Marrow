package kotlin;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;
import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public final class setCompilation {
    private static volatile setCompilation IconCompatParcelizer = null;
    public static final boolean RemoteActionCompatParcelizer = true;
    public static final boolean read = false;
    private static final File write = new File("/proc/self/fd");
    private int AudioAttributesCompatParcelizer;
    private boolean MediaBrowserCompatCustomActionResultReceiver = true;
    private final AtomicBoolean AudioAttributesImplApi21Parcelizer = new AtomicBoolean(false);
    private final int MediaBrowserCompatItemReceiver = 20000;

    public static setCompilation read() {
        if (IconCompatParcelizer == null) {
            synchronized (setCompilation.class) {
                if (IconCompatParcelizer == null) {
                    IconCompatParcelizer = new setCompilation();
                }
            }
        }
        return IconCompatParcelizer;
    }

    setCompilation() {
    }

    public final boolean write(int i, int i2, boolean z, boolean z2) {
        return z && RemoteActionCompatParcelizer && !z2 && i >= 0 && i2 >= 0 && write();
    }

    final boolean RemoteActionCompatParcelizer(int i, int i2, BitmapFactory.Options options, boolean z, boolean z2) {
        boolean zWrite = write(i, i2, z, z2);
        if (zWrite) {
            options.inPreferredConfig = Bitmap.Config.HARDWARE;
            options.inMutable = false;
        }
        return zWrite;
    }

    private int RemoteActionCompatParcelizer() {
        return this.MediaBrowserCompatItemReceiver;
    }

    private boolean write() {
        boolean z;
        synchronized (this) {
            int i = this.AudioAttributesCompatParcelizer + 1;
            this.AudioAttributesCompatParcelizer = i;
            if (i >= 50) {
                this.AudioAttributesCompatParcelizer = 0;
                boolean z2 = ((long) write.list().length) < ((long) RemoteActionCompatParcelizer());
                this.MediaBrowserCompatCustomActionResultReceiver = z2;
                if (!z2) {
                    Log.isLoggable("Downsampler", 5);
                }
            }
            z = this.MediaBrowserCompatCustomActionResultReceiver;
        }
        return z;
    }
}
