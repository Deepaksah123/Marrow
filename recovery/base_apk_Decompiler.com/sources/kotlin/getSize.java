package kotlin;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class getSize {
    private static final Executor IconCompatParcelizer = new Executor() { // from class: o.getSize.1
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            moveMediaSourceRange.RemoteActionCompatParcelizer(runnable);
        }
    };
    private static final Executor AudioAttributesCompatParcelizer = new Executor() { // from class: o.getSize.3
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            runnable.run();
        }
    };

    public static Executor RemoteActionCompatParcelizer() {
        return IconCompatParcelizer;
    }

    public static Executor read() {
        return AudioAttributesCompatParcelizer;
    }
}
