package kotlin;

import java.util.ArrayList;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class getExtension {
    private static int IconCompatParcelizer;
    private static AtomicReference<ScheduledExecutorService> RemoteActionCompatParcelizer = new AtomicReference<>();
    static final Map<ScheduledThreadPoolExecutor, Object> read = new ConcurrentHashMap();
    private static boolean write;

    static {
        Properties properties = System.getProperties();
        write writeVar = new write();
        writeVar.IconCompatParcelizer(properties);
        write = writeVar.read;
        IconCompatParcelizer = writeVar.write;
        write();
    }

    private static void write() {
        RemoteActionCompatParcelizer(write);
    }

    private static void RemoteActionCompatParcelizer(boolean z) {
        if (!z) {
            return;
        }
        while (true) {
            AtomicReference<ScheduledExecutorService> atomicReference = RemoteActionCompatParcelizer;
            ScheduledExecutorService scheduledExecutorService = atomicReference.get();
            if (scheduledExecutorService != null) {
                return;
            }
            ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1, new getCouponType("RxSchedulerPurge"));
            if (setBackInvokedCallbackEnabled.read(atomicReference, scheduledExecutorService, scheduledExecutorServiceNewScheduledThreadPool)) {
                AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = new AudioAttributesCompatParcelizer();
                long j = IconCompatParcelizer;
                scheduledExecutorServiceNewScheduledThreadPool.scheduleAtFixedRate(audioAttributesCompatParcelizer, j, j, TimeUnit.SECONDS);
                return;
            }
            scheduledExecutorServiceNewScheduledThreadPool.shutdownNow();
        }
    }

    static final class write {
        boolean read;
        int write;

        write() {
        }

        final void IconCompatParcelizer(Properties properties) {
            if (properties.containsKey("rx2.purge-enabled")) {
                this.read = Boolean.parseBoolean(properties.getProperty("rx2.purge-enabled"));
            } else {
                this.read = true;
            }
            if (this.read && properties.containsKey("rx2.purge-period-seconds")) {
                try {
                    this.write = Integer.parseInt(properties.getProperty("rx2.purge-period-seconds"));
                    return;
                } catch (NumberFormatException unused) {
                    this.write = 1;
                    return;
                }
            }
            this.write = 1;
        }
    }

    public static ScheduledExecutorService IconCompatParcelizer(ThreadFactory threadFactory) {
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1, threadFactory);
        write(write, scheduledExecutorServiceNewScheduledThreadPool);
        return scheduledExecutorServiceNewScheduledThreadPool;
    }

    private static void write(boolean z, ScheduledExecutorService scheduledExecutorService) {
        if (z && (scheduledExecutorService instanceof ScheduledThreadPoolExecutor)) {
            read.put((ScheduledThreadPoolExecutor) scheduledExecutorService, scheduledExecutorService);
        }
    }

    static final class AudioAttributesCompatParcelizer implements Runnable {
        AudioAttributesCompatParcelizer() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            for (ScheduledThreadPoolExecutor scheduledThreadPoolExecutor : new ArrayList(getExtension.read.keySet())) {
                if (scheduledThreadPoolExecutor.isShutdown()) {
                    getExtension.read.remove(scheduledThreadPoolExecutor);
                } else {
                    scheduledThreadPoolExecutor.purge();
                }
            }
        }
    }
}
