package com.google.android.gms.dynamic;

/* JADX INFO: loaded from: classes5.dex */
final class zaf implements zah {
    final /* synthetic */ DeferredLifecycleHelper zaa;

    @Override // com.google.android.gms.dynamic.zah
    public final int zaa() {
        return 4;
    }

    @Override // com.google.android.gms.dynamic.zah
    public final void zab(LifecycleDelegate lifecycleDelegate) {
        DeferredLifecycleHelper.zaa(this.zaa).onStart();
    }

    zaf(DeferredLifecycleHelper deferredLifecycleHelper) {
        this.zaa = deferredLifecycleHelper;
    }
}
