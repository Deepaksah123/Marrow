package kotlin;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import kotlin.Metadata;
import kotlin.SyncModule;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u00013B\u0017\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010!\u001a\u00020\"J\r\u0010#\u001a\u00020\u000eH\u0000¢\u0006\u0002\b$J8\u0010%\u001a\u00020\"2\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010&\u001a\u00020'2\b\b\u0002\u0010(\u001a\u00020\u000e2\u000e\b\u0004\u0010)\u001a\b\u0012\u0004\u0012\u00020\"0*H\u0086\bø\u0001\u0000J\u0006\u0010+\u001a\u00020,J.\u0010-\u001a\u00020\"2\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010&\u001a\u00020'2\u000e\b\u0004\u0010)\u001a\b\u0012\u0004\u0012\u00020'0*H\u0086\bø\u0001\u0000J\u0018\u0010-\u001a\u00020\"2\u0006\u0010.\u001a\u00020\b2\b\b\u0002\u0010&\u001a\u00020'J%\u0010/\u001a\u00020\u000e2\u0006\u0010.\u001a\u00020\b2\u0006\u0010&\u001a\u00020'2\u0006\u00100\u001a\u00020\u000eH\u0000¢\u0006\u0002\b1J\u0006\u0010\u001c\u001a\u00020\"J\b\u00102\u001a\u00020\u0005H\u0016R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u000eX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u0014X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\b0\u001a8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0016R\u001a\u0010\u001c\u001a\u00020\u000eX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0010\"\u0004\b\u001e\u0010\u0012R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 \u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u00064"}, d2 = {"Lokhttp3/internal/concurrent/TaskQueue;", "", "taskRunner", "Lokhttp3/internal/concurrent/TaskRunner;", "name", "", "(Lokhttp3/internal/concurrent/TaskRunner;Ljava/lang/String;)V", "activeTask", "Lokhttp3/internal/concurrent/Task;", "getActiveTask$okhttp", "()Lokhttp3/internal/concurrent/Task;", "setActiveTask$okhttp", "(Lokhttp3/internal/concurrent/Task;)V", "cancelActiveTask", "", "getCancelActiveTask$okhttp", "()Z", "setCancelActiveTask$okhttp", "(Z)V", "futureTasks", "", "getFutureTasks$okhttp", "()Ljava/util/List;", "getName$okhttp", "()Ljava/lang/String;", "scheduledTasks", "", "getScheduledTasks", "shutdown", "getShutdown$okhttp", "setShutdown$okhttp", "getTaskRunner$okhttp", "()Lokhttp3/internal/concurrent/TaskRunner;", "cancelAll", "", "cancelAllAndDecide", "cancelAllAndDecide$okhttp", "execute", "delayNanos", "", "cancelable", "block", "Lkotlin/Function0;", "idleLatch", "Ljava/util/concurrent/CountDownLatch;", "schedule", "task", "scheduleAndDecide", "recurrence", "scheduleAndDecide$okhttp", "toString", "AwaitIdleTask", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SubscriptionDataModule {
    private TableModule activeTask;
    private boolean cancelActiveTask;
    private final List<TableModule> futureTasks;
    private final String name;
    private boolean shutdown;
    private final SyncModule taskRunner;

    public SubscriptionDataModule(SyncModule syncModule, String str) {
        toMagicModuleMetaRepoModel.write(syncModule, "");
        toMagicModuleMetaRepoModel.write(str, "");
        this.taskRunner = syncModule;
        this.name = str;
        this.futureTasks = new ArrayList();
    }

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from getter */
    public final SyncModule getTaskRunner() {
        return this.taskRunner;
    }

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from getter */
    public final boolean getShutdown() {
        return this.shutdown;
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final TableModule getActiveTask() {
        return this.activeTask;
    }

    public final void read(TableModule tableModule) {
        this.activeTask = tableModule;
    }

    public final List<TableModule> write() {
        return this.futureTasks;
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final boolean getCancelActiveTask() {
        return this.cancelActiveTask;
    }

    public final void AudioAttributesImplApi21Parcelizer() {
        this.cancelActiveTask = false;
    }

    public final void RemoteActionCompatParcelizer(TableModule tableModule, long j) {
        toMagicModuleMetaRepoModel.write(tableModule, "");
        synchronized (this.taskRunner) {
            if (this.shutdown) {
                if (tableModule.getCancelable()) {
                    SyncModule.Companion companion = SyncModule.INSTANCE;
                    if (SyncModule.Companion.IconCompatParcelizer().isLoggable(Level.FINE)) {
                        SchedulerModule.AudioAttributesCompatParcelizer(tableModule, this, "schedule canceled (queue is shutdown)");
                    }
                    return;
                } else {
                    SyncModule.Companion companion2 = SyncModule.INSTANCE;
                    if (SyncModule.Companion.IconCompatParcelizer().isLoggable(Level.FINE)) {
                        SchedulerModule.AudioAttributesCompatParcelizer(tableModule, this, "schedule failed (queue is shutdown)");
                    }
                    throw new RejectedExecutionException();
                }
            }
            if (write(tableModule, j, false)) {
                this.taskRunner.AudioAttributesCompatParcelizer(this);
            }
            getShowPopup getshowpopup = getShowPopup.INSTANCE;
        }
    }

    public static final class write extends TableModule {
        private /* synthetic */ getCreatedOnDateMs<getShowPopup> read;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public write(String str, getCreatedOnDateMs<getShowPopup> getcreatedondatems) {
            super(str, true);
            this.read = getcreatedondatems;
        }

        @Override // kotlin.TableModule
        public final long AudioAttributesCompatParcelizer() {
            this.read.invoke();
            return -1L;
        }
    }

    public final boolean write(TableModule tableModule, long j, boolean z) {
        String string;
        toMagicModuleMetaRepoModel.write(tableModule, "");
        tableModule.read(this);
        long j2 = this.taskRunner.getBackend().read();
        long j3 = j2 + j;
        int iIndexOf = this.futureTasks.indexOf(tableModule);
        if (iIndexOf != -1) {
            if (tableModule.getNextExecuteNanoTime() > j3) {
                this.futureTasks.remove(iIndexOf);
            } else {
                SyncModule.Companion companion = SyncModule.INSTANCE;
                if (SyncModule.Companion.IconCompatParcelizer().isLoggable(Level.FINE)) {
                    SchedulerModule.AudioAttributesCompatParcelizer(tableModule, this, "already scheduled");
                }
                return false;
            }
        }
        tableModule.AudioAttributesCompatParcelizer(j3);
        SyncModule.Companion companion2 = SyncModule.INSTANCE;
        if (SyncModule.Companion.IconCompatParcelizer().isLoggable(Level.FINE)) {
            if (z) {
                StringBuilder sb = new StringBuilder("run again after ");
                sb.append(SchedulerModule.read(j3 - j2));
                string = sb.toString();
            } else {
                StringBuilder sb2 = new StringBuilder("scheduled after ");
                sb2.append(SchedulerModule.read(j3 - j2));
                string = sb2.toString();
            }
            SchedulerModule.AudioAttributesCompatParcelizer(tableModule, this, string);
        }
        Iterator<TableModule> it = this.futureTasks.iterator();
        int size = 0;
        while (true) {
            if (!it.hasNext()) {
                size = -1;
                break;
            }
            if (it.next().getNextExecuteNanoTime() - j2 > j) {
                break;
            }
            size++;
        }
        if (size == -1) {
            size = this.futureTasks.size();
        }
        this.futureTasks.add(size, tableModule);
        return size == 0;
    }

    public final boolean RemoteActionCompatParcelizer() {
        TableModule tableModule = this.activeTask;
        if (tableModule != null) {
            toMagicModuleMetaRepoModel.write(tableModule);
            if (tableModule.getCancelable()) {
                this.cancelActiveTask = true;
            }
        }
        boolean z = false;
        for (int size = this.futureTasks.size() - 1; size >= 0; size--) {
            if (this.futureTasks.get(size).getCancelable()) {
                TableModule tableModule2 = this.futureTasks.get(size);
                SyncModule.Companion companion = SyncModule.INSTANCE;
                if (SyncModule.Companion.IconCompatParcelizer().isLoggable(Level.FINE)) {
                    SchedulerModule.AudioAttributesCompatParcelizer(tableModule2, this, "canceled");
                }
                this.futureTasks.remove(size);
                z = true;
            }
        }
        return z;
    }

    public final String toString() {
        return this.name;
    }

    public final void IconCompatParcelizer() {
        boolean z = FirebaseDataModule.AudioAttributesCompatParcelizer;
        synchronized (this.taskRunner) {
            if (RemoteActionCompatParcelizer()) {
                this.taskRunner.AudioAttributesCompatParcelizer(this);
            }
            getShowPopup getshowpopup = getShowPopup.INSTANCE;
        }
    }

    public final void MediaBrowserCompatItemReceiver() {
        boolean z = FirebaseDataModule.AudioAttributesCompatParcelizer;
        synchronized (this.taskRunner) {
            this.shutdown = true;
            if (RemoteActionCompatParcelizer()) {
                this.taskRunner.AudioAttributesCompatParcelizer(this);
            }
            getShowPopup getshowpopup = getShowPopup.INSTANCE;
        }
    }
}
