package kotlin;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class setReadingSampleState {
    public static Executor AudioAttributesCompatParcelizer(Executor executor) {
        return new setReadingId3HeaderState(executor);
    }

    public static Executor AudioAttributesCompatParcelizer() {
        return AudioAttributesCompatParcelizer.INSTANCE;
    }

    enum AudioAttributesCompatParcelizer implements Executor {
        INSTANCE;

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            runnable.run();
        }
    }
}
