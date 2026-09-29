package kotlin;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
final class WakeLockManager<TResult> extends copyWithId<TResult> {
    private final TracksGroupExternalSyntheticLambda0<TResult> RemoteActionCompatParcelizer;

    protected WakeLockManager(Executor executor, TracksGroupExternalSyntheticLambda0<TResult> tracksGroupExternalSyntheticLambda0) {
        super(executor);
        this.RemoteActionCompatParcelizer = tracksGroupExternalSyntheticLambda0;
    }

    final /* synthetic */ void AudioAttributesCompatParcelizer(Object obj) {
        this.RemoteActionCompatParcelizer.read(obj);
    }

    @Override // kotlin.copyWithId
    final void read(final TResult tresult) {
        this.write.execute(new Runnable() { // from class: o.updateWakeLock
            @Override // java.lang.Runnable
            public final void run() {
                this.write.AudioAttributesCompatParcelizer(tresult);
            }
        });
    }
}
