package kotlin;

/* JADX INFO: loaded from: classes5.dex */
public final class getFallBack extends SdkPayloadKt implements Runnable {
    public getFallBack(Runnable runnable) {
        super(runnable);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.RemoteActionCompatParcelizer = Thread.currentThread();
        try {
            this.write.run();
            this.RemoteActionCompatParcelizer = null;
        } catch (Throwable th) {
            this.RemoteActionCompatParcelizer = null;
            lazySet(AudioAttributesCompatParcelizer);
            getPaymentRefIds.RemoteActionCompatParcelizer(th);
        }
    }
}
