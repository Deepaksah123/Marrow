package com.google.android.gms.common.api.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zav implements Runnable {
    final /* synthetic */ zaaa zaa;

    @Override // java.lang.Runnable
    public final void run() {
        this.zaa.zam.lock();
        try {
            zaaa.zap(this.zaa);
        } finally {
            this.zaa.zam.unlock();
        }
    }

    zav(zaaa zaaaVar) {
        this.zaa = zaaaVar;
    }
}
