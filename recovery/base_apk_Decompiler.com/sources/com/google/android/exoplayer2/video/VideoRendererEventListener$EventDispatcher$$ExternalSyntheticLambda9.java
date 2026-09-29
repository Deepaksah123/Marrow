package com.google.android.exoplayer2.video;

import android.os.SystemClock;
import com.google.android.exoplayer2.video.VideoRendererEventListener;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class VideoRendererEventListener$EventDispatcher$$ExternalSyntheticLambda9 implements Runnable {
    public static int read;
    public static int write;
    public final /* synthetic */ VideoRendererEventListener.EventDispatcher f$0;
    public final /* synthetic */ long f$1;
    public final /* synthetic */ int f$2;

    public /* synthetic */ VideoRendererEventListener$EventDispatcher$$ExternalSyntheticLambda9(VideoRendererEventListener.EventDispatcher eventDispatcher, long j, int i) {
        this.f$0 = eventDispatcher;
        this.f$1 = j;
        this.f$2 = i;
    }

    public static int IconCompatParcelizer() {
        int i = write;
        int i2 = i % 5177585;
        write = i + 1;
        if (i2 != 0) {
            return read;
        }
        int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
        read = iElapsedRealtime;
        return iElapsedRealtime;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f$0.m168lambda$reportVideoFrameProcessingOffset$4$comgoogleandroidexoplayer2videoVideoRendererEventListener$EventDispatcher(this.f$1, this.f$2);
    }
}
