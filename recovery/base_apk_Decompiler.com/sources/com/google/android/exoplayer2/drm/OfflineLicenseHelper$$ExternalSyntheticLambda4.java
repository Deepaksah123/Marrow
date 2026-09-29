package com.google.android.exoplayer2.drm;

import kotlin.Mp4ExtractorMp4Track;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class OfflineLicenseHelper$$ExternalSyntheticLambda4 implements Runnable {
    public static int AudioAttributesCompatParcelizer;
    public static int read;
    public final /* synthetic */ OfflineLicenseHelper f$0;
    public final /* synthetic */ DrmSession f$1;
    public final /* synthetic */ Mp4ExtractorMp4Track f$2;

    public /* synthetic */ OfflineLicenseHelper$$ExternalSyntheticLambda4(OfflineLicenseHelper offlineLicenseHelper, DrmSession drmSession, Mp4ExtractorMp4Track mp4ExtractorMp4Track) {
        this.f$0 = offlineLicenseHelper;
        this.f$1 = drmSession;
        this.f$2 = mp4ExtractorMp4Track;
    }

    public static int AudioAttributesCompatParcelizer() {
        int i = read;
        int i2 = i % 6044160;
        read = i + 1;
        if (i2 != 0) {
            return AudioAttributesCompatParcelizer;
        }
        int i3 = (int) Runtime.getRuntime().totalMemory();
        AudioAttributesCompatParcelizer = i3;
        return i3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f$0.m84lambda$acquireFirstSessionOnHandlerThread$3$comgoogleandroidexoplayer2drmOfflineLicenseHelper(this.f$1, this.f$2);
    }
}
