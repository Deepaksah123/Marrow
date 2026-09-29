package kotlin;

/* JADX INFO: loaded from: classes.dex */
public final class setExtensionDays<T> extends setExtension<T> {
    @Override // kotlin.SchemaUserStatusRSModel
    public final void a_(T t) {
        if (this.write == null) {
            this.write = t;
            this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer();
            countDown();
        }
    }

    @Override // kotlin.SchemaUserStatusRSModel
    public final void AudioAttributesCompatParcelizer(Throwable th) {
        if (this.write == null) {
            this.read = th;
        } else {
            getPaymentRefIds.RemoteActionCompatParcelizer(th);
        }
        countDown();
    }
}
