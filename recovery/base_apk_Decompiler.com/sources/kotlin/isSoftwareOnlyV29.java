package kotlin;

import android.app.ActivityManager;
import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
final class isSoftwareOnlyV29 {
    private final Context IconCompatParcelizer;
    private final ActivityManager RemoteActionCompatParcelizer;
    private final ActivityManager.MemoryInfo read;
    private final Runtime write;

    static {
        MediaCodecRendererDecoderInitializationException.IconCompatParcelizer();
    }

    isSoftwareOnlyV29(Context context) {
        this(Runtime.getRuntime(), context);
    }

    private isSoftwareOnlyV29(Runtime runtime, Context context) {
        this.write = runtime;
        this.IconCompatParcelizer = context;
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        this.RemoteActionCompatParcelizer = activityManager;
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        this.read = memoryInfo;
        activityManager.getMemoryInfo(memoryInfo);
    }

    public final int read() {
        return secureDecodersExplicit.RemoteActionCompatParcelizer(isFeatureRequired.BYTES.IconCompatParcelizer(this.write.maxMemory()));
    }

    public final int IconCompatParcelizer() {
        return secureDecodersExplicit.RemoteActionCompatParcelizer(isFeatureRequired.MEGABYTES.IconCompatParcelizer(this.RemoteActionCompatParcelizer.getMemoryClass()));
    }

    public final int AudioAttributesCompatParcelizer() {
        return secureDecodersExplicit.RemoteActionCompatParcelizer(isFeatureRequired.BYTES.IconCompatParcelizer(this.read.totalMem));
    }
}
