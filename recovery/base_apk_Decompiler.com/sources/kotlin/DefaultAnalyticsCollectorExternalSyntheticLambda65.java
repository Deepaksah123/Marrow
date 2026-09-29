package kotlin;

import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.FutureTask;

/* JADX INFO: loaded from: classes.dex */
public final class DefaultAnalyticsCollectorExternalSyntheticLambda65<T> {
    private CountDownLatch IconCompatParcelizer;

    public DefaultAnalyticsCollectorExternalSyntheticLambda65(final Callable<T> callable) {
        toMagicModuleMetaRepoModel.write(callable, "");
        this.IconCompatParcelizer = new CountDownLatch(1);
        lambdaonMediaMetadataChanged48.MediaBrowserCompatCustomActionResultReceiver().execute(new FutureTask(new Callable<Void>() { // from class: o.DefaultAnalyticsCollectorExternalSyntheticLambda65.3
            @Override // java.util.concurrent.Callable
            /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
            public final Void call() {
                try {
                    callable.call();
                } finally {
                    CountDownLatch countDownLatch = DefaultAnalyticsCollectorExternalSyntheticLambda65.this.IconCompatParcelizer;
                    if (countDownLatch != null) {
                        countDownLatch.countDown();
                    }
                }
            }
        }));
    }
}
