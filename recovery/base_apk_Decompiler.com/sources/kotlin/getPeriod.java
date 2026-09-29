package kotlin;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public final class getPeriod implements CctBackendFactory {
    private final Handler read = StdKeyDeserializerStringFactoryKeyDeserializer.write(Looper.getMainLooper());

    @Override // kotlin.CctBackendFactory
    public final void IconCompatParcelizer(long j, Runnable runnable) {
        this.read.postDelayed(runnable, j);
    }

    @Override // kotlin.CctBackendFactory
    public final void read(Runnable runnable) {
        this.read.removeCallbacks(runnable);
    }
}
