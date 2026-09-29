package kotlin;

import android.os.Handler;
import android.os.Process;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes2.dex */
final class configureFromBigDecimalCreator {
    static <T> void write(Executor executor, Callable<T> callable, wrapAsJsonMappingException<T> wrapasjsonmappingexception) {
        executor.execute(new write(_constructCreatorKeyDeserializer.IconCompatParcelizer(), callable, wrapasjsonmappingexception));
    }

    static <T> T read(ExecutorService executorService, Callable<T> callable, int i) throws InterruptedException {
        try {
            return executorService.submit(callable).get(i, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            throw e;
        } catch (ExecutionException e2) {
            throw new RuntimeException(e2);
        } catch (TimeoutException unused) {
            throw new InterruptedException("timeout");
        }
    }

    static ThreadPoolExecutor IconCompatParcelizer(String str) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 10000L, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new IconCompatParcelizer(str, 10));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }

    static Executor read(Handler handler) {
        return new AudioAttributesCompatParcelizer(handler);
    }

    static class AudioAttributesCompatParcelizer implements Executor {
        private final Handler AudioAttributesCompatParcelizer;

        AudioAttributesCompatParcelizer(Handler handler) {
            this.AudioAttributesCompatParcelizer = (Handler) StringCollectionDeserializer.RemoteActionCompatParcelizer(handler);
        }

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            if (this.AudioAttributesCompatParcelizer.post((Runnable) StringCollectionDeserializer.RemoteActionCompatParcelizer(runnable))) {
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(this.AudioAttributesCompatParcelizer);
            sb.append(" is shutting down");
            throw new RejectedExecutionException(sb.toString());
        }
    }

    static class write<T> implements Runnable {
        private Callable<T> IconCompatParcelizer;
        private Handler RemoteActionCompatParcelizer;
        private wrapAsJsonMappingException<T> write;

        write(Handler handler, Callable<T> callable, wrapAsJsonMappingException<T> wrapasjsonmappingexception) {
            this.IconCompatParcelizer = callable;
            this.write = wrapasjsonmappingexception;
            this.RemoteActionCompatParcelizer = handler;
        }

        @Override // java.lang.Runnable
        public final void run() {
            final T tCall;
            try {
                tCall = this.IconCompatParcelizer.call();
            } catch (Exception unused) {
                tCall = null;
            }
            final wrapAsJsonMappingException<T> wrapasjsonmappingexception = this.write;
            this.RemoteActionCompatParcelizer.post(new Runnable() { // from class: o.configureFromBigDecimalCreator.write.4
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.lang.Runnable
                public final void run() {
                    wrapasjsonmappingexception.AudioAttributesCompatParcelizer(tCall);
                }
            });
        }
    }

    static class IconCompatParcelizer implements ThreadFactory {
        private String IconCompatParcelizer;
        private int write = 10;

        IconCompatParcelizer(String str, int i) {
            this.IconCompatParcelizer = str;
        }

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            return new read(runnable, this.IconCompatParcelizer, this.write);
        }

        static class read extends Thread {
            private final int RemoteActionCompatParcelizer;

            read(Runnable runnable, String str, int i) {
                super(runnable, str);
                this.RemoteActionCompatParcelizer = i;
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public final void run() {
                Process.setThreadPriority(this.RemoteActionCompatParcelizer);
                super.run();
            }
        }
    }
}
