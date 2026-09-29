package kotlin;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes5.dex */
public final class resetOutputBuffer {
    private static volatile shouldContinueRendering read = new write(0);

    public static shouldContinueRendering IconCompatParcelizer() {
        return read;
    }

    static class write implements shouldContinueRendering {
        private write() {
        }

        /* synthetic */ write(byte b) {
            this();
        }

        private static ExecutorService AudioAttributesCompatParcelizer(ThreadFactory threadFactory) {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), threadFactory);
            threadPoolExecutor.allowCoreThreadTimeOut(true);
            return Executors.unconfigurableExecutorService(threadPoolExecutor);
        }

        @Override // kotlin.shouldContinueRendering
        public final ExecutorService write(ThreadFactory threadFactory) {
            return AudioAttributesCompatParcelizer(threadFactory);
        }
    }
}
