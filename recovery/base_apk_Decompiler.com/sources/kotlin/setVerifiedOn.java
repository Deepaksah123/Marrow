package kotlin;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
final class setVerifiedOn implements Executor {
    public final getPlatform RemoteActionCompatParcelizer;

    public setVerifiedOn(getPlatform getplatform) {
        this.RemoteActionCompatParcelizer = getplatform;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        if (this.RemoteActionCompatParcelizer.IconCompatParcelizer(VideoSessionResponseBody.RemoteActionCompatParcelizer)) {
            this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(VideoSessionResponseBody.RemoteActionCompatParcelizer, runnable);
        } else {
            runnable.run();
        }
    }

    public final String toString() {
        return this.RemoteActionCompatParcelizer.toString();
    }
}
