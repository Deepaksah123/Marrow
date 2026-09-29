package kotlin;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes4.dex */
public final class getDiscountGroup extends SdkPayloadKt implements Callable<Void> {
    public getDiscountGroup(Runnable runnable) {
        super(runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.concurrent.Callable
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public Void call() throws Exception {
        this.RemoteActionCompatParcelizer = Thread.currentThread();
        try {
            this.write.run();
            return null;
        } finally {
            lazySet(AudioAttributesCompatParcelizer);
            this.RemoteActionCompatParcelizer = null;
        }
    }
}
