package kotlin;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 (2\u00020\u0001:\u0003\u000e(\u0012B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0011H\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000fR\u0017\u0010\u0016\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0012\u0010\u0018R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00110\u00198\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001d\u001a\u00020\u001c8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010\u001f\u001a\u00020\u00078\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010\"\u001a\u00020!8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00110\u00198\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b$\u0010\u001bR\u0014\u0010&\u001a\u00020%8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b&\u0010'"}, d2 = {"Lo/SyncModule;", "", "Lo/SyncModule$IconCompatParcelizer;", "p0", "<init>", "(Lo/SyncModule$IconCompatParcelizer;)V", "Lo/TableModule;", "", "p1", "", "write", "(Lo/TableModule;J)V", "RemoteActionCompatParcelizer", "()Lo/TableModule;", "IconCompatParcelizer", "(Lo/TableModule;)V", "()V", "Lo/SubscriptionDataModule;", "AudioAttributesCompatParcelizer", "(Lo/SubscriptionDataModule;)V", "read", "()Lo/SubscriptionDataModule;", "backend", "Lo/SyncModule$IconCompatParcelizer;", "()Lo/SyncModule$IconCompatParcelizer;", "", "busyQueues", "Ljava/util/List;", "", "coordinatorWaiting", "Z", "coordinatorWakeUpAt", "J", "", "nextQueueName", "I", "readyQueues", "Ljava/lang/Runnable;", "runnable", "Ljava/lang/Runnable;", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SyncModule {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final SyncModule INSTANCE;
    private static final Logger logger;
    private final IconCompatParcelizer backend;
    private final List<SubscriptionDataModule> busyQueues;
    private boolean coordinatorWaiting;
    private long coordinatorWakeUpAt;
    private int nextQueueName;
    private final List<SubscriptionDataModule> readyQueues;
    private final Runnable runnable;

    public interface IconCompatParcelizer {
        void IconCompatParcelizer(Runnable runnable);

        void RemoteActionCompatParcelizer(SyncModule syncModule, long j);

        long read();

        void write(SyncModule syncModule);
    }

    private SyncModule(IconCompatParcelizer iconCompatParcelizer) {
        toMagicModuleMetaRepoModel.write(iconCompatParcelizer, "");
        this.backend = iconCompatParcelizer;
        this.nextQueueName = 10000;
        this.busyQueues = new ArrayList();
        this.readyQueues = new ArrayList();
        this.runnable = new RemoteActionCompatParcelizer();
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final IconCompatParcelizer getBackend() {
        return this.backend;
    }

    public static final class RemoteActionCompatParcelizer implements Runnable {
        RemoteActionCompatParcelizer() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            TableModule tableModuleRemoteActionCompatParcelizer;
            long j;
            while (true) {
                SyncModule syncModule = SyncModule.this;
                synchronized (syncModule) {
                    tableModuleRemoteActionCompatParcelizer = syncModule.RemoteActionCompatParcelizer();
                }
                if (tableModuleRemoteActionCompatParcelizer == null) {
                    return;
                }
                SubscriptionDataModule queue = tableModuleRemoteActionCompatParcelizer.getQueue();
                toMagicModuleMetaRepoModel.write(queue);
                SyncModule syncModule2 = SyncModule.this;
                Companion companion = SyncModule.INSTANCE;
                boolean zIsLoggable = Companion.IconCompatParcelizer().isLoggable(Level.FINE);
                if (zIsLoggable) {
                    j = queue.getTaskRunner().getBackend().read();
                    SchedulerModule.AudioAttributesCompatParcelizer(tableModuleRemoteActionCompatParcelizer, queue, "starting");
                } else {
                    j = -1;
                }
                try {
                    try {
                        syncModule2.write(tableModuleRemoteActionCompatParcelizer);
                        getShowPopup getshowpopup = getShowPopup.INSTANCE;
                        if (zIsLoggable) {
                            long j2 = queue.getTaskRunner().getBackend().read();
                            StringBuilder sb = new StringBuilder("finished run in ");
                            sb.append(SchedulerModule.read(j2 - j));
                            SchedulerModule.AudioAttributesCompatParcelizer(tableModuleRemoteActionCompatParcelizer, queue, sb.toString());
                        }
                    } finally {
                    }
                } catch (Throwable th) {
                    if (zIsLoggable) {
                        long j3 = queue.getTaskRunner().getBackend().read();
                        StringBuilder sb2 = new StringBuilder("failed a run in ");
                        sb2.append(SchedulerModule.read(j3 - j));
                        SchedulerModule.AudioAttributesCompatParcelizer(tableModuleRemoteActionCompatParcelizer, queue, sb2.toString());
                    }
                    throw th;
                }
            }
        }
    }

    public final SubscriptionDataModule read() {
        int i;
        synchronized (this) {
            i = this.nextQueueName;
            this.nextQueueName = i + 1;
        }
        return new SubscriptionDataModule(this, "Q".concat(String.valueOf(i)));
    }

    private void IconCompatParcelizer() {
        for (int size = this.busyQueues.size() - 1; size >= 0; size--) {
            this.busyQueues.get(size).RemoteActionCompatParcelizer();
        }
        for (int size2 = this.readyQueues.size() - 1; size2 >= 0; size2--) {
            SubscriptionDataModule subscriptionDataModule = this.readyQueues.get(size2);
            subscriptionDataModule.RemoteActionCompatParcelizer();
            if (subscriptionDataModule.write().isEmpty()) {
                this.readyQueues.remove(size2);
            }
        }
    }

    public static final class AudioAttributesCompatParcelizer implements IconCompatParcelizer {
        private final ThreadPoolExecutor IconCompatParcelizer;

        public AudioAttributesCompatParcelizer(ThreadFactory threadFactory) {
            toMagicModuleMetaRepoModel.write(threadFactory, "");
            this.IconCompatParcelizer = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), threadFactory);
        }

        @Override // o.SyncModule.IconCompatParcelizer
        public final long read() {
            return System.nanoTime();
        }

        @Override // o.SyncModule.IconCompatParcelizer
        public final void RemoteActionCompatParcelizer(SyncModule syncModule, long j) throws InterruptedException {
            toMagicModuleMetaRepoModel.write(syncModule, "");
            long j2 = j / 1000000;
            if (j2 > 0 || j > 0) {
                syncModule.wait(j2, (int) (j - (1000000 * j2)));
            }
        }

        @Override // o.SyncModule.IconCompatParcelizer
        public final void IconCompatParcelizer(Runnable runnable) {
            toMagicModuleMetaRepoModel.write(runnable, "");
            this.IconCompatParcelizer.execute(runnable);
        }

        @Override // o.SyncModule.IconCompatParcelizer
        public final void write(SyncModule syncModule) {
            toMagicModuleMetaRepoModel.write(syncModule, "");
            syncModule.notify();
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0007¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b"}, d2 = {"Lo/SyncModule$Companion;", "", "<init>", "()V", "Lo/SyncModule;", "INSTANCE", "Lo/SyncModule;", "Ljava/util/logging/Logger;", "logger", "Ljava/util/logging/Logger;", "IconCompatParcelizer", "()Ljava/util/logging/Logger;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static Logger IconCompatParcelizer() {
            return SyncModule.logger;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(FirebaseDataModule.AudioAttributesImplApi21Parcelizer);
        sb.append(" TaskRunner");
        INSTANCE = new SyncModule(new AudioAttributesCompatParcelizer(FirebaseDataModule.RemoteActionCompatParcelizer(sb.toString(), true)));
        Logger logger2 = Logger.getLogger(SyncModule.class.getName());
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(logger2, "");
        logger = logger2;
    }

    public final void AudioAttributesCompatParcelizer(SubscriptionDataModule p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        boolean z = FirebaseDataModule.AudioAttributesCompatParcelizer;
        if (p0.getActiveTask() == null) {
            if (!p0.write().isEmpty()) {
                FirebaseDataModule.write(this.readyQueues, p0);
            } else {
                this.readyQueues.remove(p0);
            }
        }
        if (this.coordinatorWaiting) {
            this.backend.write(this);
        } else {
            this.backend.IconCompatParcelizer(this.runnable);
        }
    }

    private final void IconCompatParcelizer(TableModule p0) {
        boolean z = FirebaseDataModule.AudioAttributesCompatParcelizer;
        p0.AudioAttributesCompatParcelizer(-1L);
        SubscriptionDataModule queue = p0.getQueue();
        toMagicModuleMetaRepoModel.write(queue);
        queue.write().remove(p0);
        this.readyQueues.remove(queue);
        queue.read(p0);
        this.busyQueues.add(queue);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void write(TableModule p0) {
        boolean z = FirebaseDataModule.AudioAttributesCompatParcelizer;
        Thread threadCurrentThread = Thread.currentThread();
        String name = threadCurrentThread.getName();
        threadCurrentThread.setName(p0.getName());
        try {
            long jAudioAttributesCompatParcelizer = p0.AudioAttributesCompatParcelizer();
            synchronized (this) {
                write(p0, jAudioAttributesCompatParcelizer);
                getShowPopup getshowpopup = getShowPopup.INSTANCE;
            }
            threadCurrentThread.setName(name);
        } catch (Throwable th) {
            synchronized (this) {
                write(p0, -1L);
                getShowPopup getshowpopup2 = getShowPopup.INSTANCE;
                threadCurrentThread.setName(name);
                throw th;
            }
        }
    }

    private final void write(TableModule p0, long p1) {
        boolean z = FirebaseDataModule.AudioAttributesCompatParcelizer;
        SubscriptionDataModule queue = p0.getQueue();
        toMagicModuleMetaRepoModel.write(queue);
        if (queue.getActiveTask() != p0) {
            throw new IllegalStateException("Check failed.".toString());
        }
        boolean cancelActiveTask = queue.getCancelActiveTask();
        queue.AudioAttributesImplApi21Parcelizer();
        queue.read(null);
        this.busyQueues.remove(queue);
        if (p1 != -1 && !cancelActiveTask && !queue.getShutdown()) {
            queue.write(p0, p1, true);
        }
        if (queue.write().isEmpty()) {
            return;
        }
        this.readyQueues.add(queue);
    }

    public final TableModule RemoteActionCompatParcelizer() {
        boolean z;
        boolean z2 = FirebaseDataModule.AudioAttributesCompatParcelizer;
        while (!this.readyQueues.isEmpty()) {
            long j = this.backend.read();
            Iterator<SubscriptionDataModule> it = this.readyQueues.iterator();
            long jMin = Long.MAX_VALUE;
            TableModule tableModule = null;
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                TableModule tableModule2 = it.next().write().get(0);
                long jMax = Math.max(0L, tableModule2.getNextExecuteNanoTime() - j);
                if (jMax > 0) {
                    jMin = Math.min(jMax, jMin);
                } else {
                    if (tableModule != null) {
                        z = true;
                        break;
                    }
                    tableModule = tableModule2;
                }
            }
            if (tableModule != null) {
                IconCompatParcelizer(tableModule);
                if (z || (!this.coordinatorWaiting && !this.readyQueues.isEmpty())) {
                    this.backend.IconCompatParcelizer(this.runnable);
                }
                return tableModule;
            }
            if (this.coordinatorWaiting) {
                if (jMin < this.coordinatorWakeUpAt - j) {
                    this.backend.write(this);
                }
                return null;
            }
            this.coordinatorWaiting = true;
            this.coordinatorWakeUpAt = j + jMin;
            try {
                try {
                    this.backend.RemoteActionCompatParcelizer(this, jMin);
                } catch (InterruptedException unused) {
                    IconCompatParcelizer();
                }
            } finally {
                this.coordinatorWaiting = false;
            }
        }
        return null;
    }
}
