package kotlin;

import android.content.Context;

/* JADX INFO: loaded from: classes5.dex */
public final class checkAndReadFirstSampleNumber extends removeOnTrimMemoryListener {
    public checkAndReadFirstSampleNumber(Context context, checkAndReadBlockSizeSamples checkandreadblocksizesamples, onRetainNonConfigurationInstance onretainnonconfigurationinstance) {
        super(context, checkandreadblocksizesamples, onretainnonconfigurationinstance);
    }

    @Override // kotlin.onRequestPermissionsResult
    public final void read(boolean z) {
        super.read(z);
        ((onRequestPermissionsResult) onPlay()).read(z);
    }
}
