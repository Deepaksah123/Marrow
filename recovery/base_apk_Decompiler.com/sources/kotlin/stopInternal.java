package kotlin;

import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.StatFs;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import java.io.File;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u000b¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0013\u001a\u00020\f¢\u0006\u0004\b\u0013\u0010\u0015J\u0015\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u000b¢\u0006\u0004\b\u0016\u0010\u0017R\u0011\u0010\u000e\u001a\u00020\u00078G¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0018"}, d2 = {"Lo/stopInternal;", "", "<init>", "()V", "", "p0", "p1", "Landroid/graphics/Bitmap$Config;", "p2", "write", "(IILandroid/graphics/Bitmap$Config;)I", "Landroid/content/Context;", "", "", "read", "(Landroid/content/Context;D)J", "Ljava/io/File;", "RemoteActionCompatParcelizer", "(Ljava/io/File;)J", "IconCompatParcelizer", "(Landroid/content/Context;)D", "()D", "AudioAttributesCompatParcelizer", "(Landroid/content/Context;)Ljava/io/File;", "()Landroid/graphics/Bitmap$Config;"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class stopInternal {
    public static final stopInternal INSTANCE = new stopInternal();

    public static double IconCompatParcelizer() {
        return 0.0d;
    }

    private stopInternal() {
    }

    public static Bitmap.Config RemoteActionCompatParcelizer() {
        return Bitmap.Config.HARDWARE;
    }

    public static int write(int p0, int p1, Bitmap.Config p2) {
        return p0 * p1 * maybeNotifySurfaceSizeChanged.AudioAttributesCompatParcelizer(p2);
    }

    public static File AudioAttributesCompatParcelizer(Context p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        File file = new File(p0.getCacheDir(), "image_cache");
        file.mkdirs();
        return file;
    }

    public static long RemoteActionCompatParcelizer(File p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        try {
            StatFs statFs = new StatFs(p0.getAbsolutePath());
            return getQues.AudioAttributesCompatParcelizer((long) (statFs.getBlockCountLong() * 0.02d * statFs.getBlockSizeLong()), 10485760L, 262144000L);
        } catch (Exception unused) {
            return 10485760L;
        }
    }

    public static long read(Context p0, double p1) {
        int largeMemoryClass;
        Object systemService;
        toMagicModuleMetaRepoModel.write(p0, "");
        try {
            systemService = _isNaN.getSystemService(p0, ActivityManager.class);
        } catch (Exception unused) {
            largeMemoryClass = 256;
        }
        if (systemService != null) {
            ActivityManager activityManager = (ActivityManager) systemService;
            largeMemoryClass = (p0.getApplicationInfo().flags & ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? activityManager.getLargeMemoryClass() : activityManager.getMemoryClass();
            return (long) (p1 * ((double) largeMemoryClass) * 1024.0d * 1024.0d);
        }
        StringBuilder sb = new StringBuilder("System service of type ");
        sb.append(ActivityManager.class);
        sb.append(" was not found.");
        throw new IllegalStateException(sb.toString().toString());
    }

    public static double IconCompatParcelizer(Context p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        try {
            Object systemService = _isNaN.getSystemService(p0, ActivityManager.class);
            if (systemService != null) {
                return ((ActivityManager) systemService).isLowRamDevice() ? 0.15d : 0.2d;
            }
            StringBuilder sb = new StringBuilder("System service of type ");
            sb.append(ActivityManager.class);
            sb.append(" was not found.");
            throw new IllegalStateException(sb.toString().toString());
        } catch (Exception unused) {
            return 0.2d;
        }
    }
}
