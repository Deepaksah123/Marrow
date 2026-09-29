package kotlin;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes5.dex */
final class getDefaultUrl implements Executor {
    private final Executor IconCompatParcelizer;

    getDefaultUrl(Executor executor) {
        this.IconCompatParcelizer = executor;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.IconCompatParcelizer.execute(new read(runnable));
    }

    static class read implements Runnable {
        private final Runnable AudioAttributesCompatParcelizer;

        read(Runnable runnable) {
            this.AudioAttributesCompatParcelizer = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                this.AudioAttributesCompatParcelizer.run();
            } catch (Exception unused) {
                executeKeyRequest.IconCompatParcelizer("Executor");
            }
        }
    }
}
