package com.google.android.gms.dynamic;

import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
final class zaa implements OnDelegateCreatedListener {
    final /* synthetic */ DeferredLifecycleHelper zaa;

    @Override // com.google.android.gms.dynamic.OnDelegateCreatedListener
    public final void onDelegateCreated(LifecycleDelegate lifecycleDelegate) {
        DeferredLifecycleHelper.zac(this.zaa, lifecycleDelegate);
        Iterator it = DeferredLifecycleHelper.zab(this.zaa).iterator();
        while (it.hasNext()) {
            ((zah) it.next()).zab(DeferredLifecycleHelper.zaa(this.zaa));
        }
        DeferredLifecycleHelper.zab(this.zaa).clear();
        DeferredLifecycleHelper.zad(this.zaa, null);
    }

    zaa(DeferredLifecycleHelper deferredLifecycleHelper) {
        this.zaa = deferredLifecycleHelper;
    }
}
