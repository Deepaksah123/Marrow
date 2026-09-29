package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.source.MediaSourceEventListener;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class MediaSourceEventListener$EventDispatcher$$ExternalSyntheticLambda2 implements Runnable {
    public static int IconCompatParcelizer;
    public static int RemoteActionCompatParcelizer;
    public final /* synthetic */ MediaSourceEventListener.EventDispatcher f$0;
    public final /* synthetic */ MediaSourceEventListener f$1;
    public final /* synthetic */ LoadEventInfo f$2;
    public final /* synthetic */ MediaLoadData f$3;

    public /* synthetic */ MediaSourceEventListener$EventDispatcher$$ExternalSyntheticLambda2(MediaSourceEventListener.EventDispatcher eventDispatcher, MediaSourceEventListener mediaSourceEventListener, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
        this.f$0 = eventDispatcher;
        this.f$1 = mediaSourceEventListener;
        this.f$2 = loadEventInfo;
        this.f$3 = mediaLoadData;
    }

    public static int IconCompatParcelizer() {
        int i = IconCompatParcelizer;
        int i2 = i % 8808080;
        IconCompatParcelizer = i + 1;
        if (i2 != 0) {
            return RemoteActionCompatParcelizer;
        }
        int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
        RemoteActionCompatParcelizer = iFreeMemory;
        return iFreeMemory;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f$0.m105lambda$loadCanceled$2$comgoogleandroidexoplayer2sourceMediaSourceEventListener$EventDispatcher(this.f$1, this.f$2, this.f$3);
    }
}
