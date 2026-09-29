package in.juspay.hypersdk.ota;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import kotlin.Metadata;
import kotlin.getShowPopup;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0004"}, d2 = {"Lin/juspay/hypersdk/ota/WaitTask;", "Ljava/util/concurrent/FutureTask;", "", "<init>", "()V", "complete", "run"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class WaitTask extends FutureTask<getShowPopup> {
    public WaitTask() {
        super(new Callable() { // from class: in.juspay.hypersdk.ota.WaitTask$$ExternalSyntheticLambda0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return getShowPopup.INSTANCE;
            }
        });
    }

    public final void complete() {
        super.set(getShowPopup.INSTANCE);
    }

    @Override // java.util.concurrent.FutureTask, java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
    }
}
