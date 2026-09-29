package com.google.android.exoplayer2.drm;

import com.google.android.exoplayer2.drm.DrmSessionEventListener;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class DrmSessionEventListener$EventDispatcher$$ExternalSyntheticLambda4 implements Runnable {
    public static int AudioAttributesCompatParcelizer;
    public static int write;
    public final /* synthetic */ DrmSessionEventListener.EventDispatcher f$0;
    public final /* synthetic */ DrmSessionEventListener f$1;

    public /* synthetic */ DrmSessionEventListener$EventDispatcher$$ExternalSyntheticLambda4(DrmSessionEventListener.EventDispatcher eventDispatcher, DrmSessionEventListener drmSessionEventListener) {
        this.f$0 = eventDispatcher;
        this.f$1 = drmSessionEventListener;
    }

    public static int IconCompatParcelizer() {
        int i = write;
        int i2 = i % 8984046;
        write = i + 1;
        if (i2 != 0) {
            return AudioAttributesCompatParcelizer;
        }
        int i3 = (int) Runtime.getRuntime().totalMemory();
        AudioAttributesCompatParcelizer = i3;
        return i3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f$0.m79lambda$drmSessionReleased$5$comgoogleandroidexoplayer2drmDrmSessionEventListener$EventDispatcher(this.f$1);
    }
}
