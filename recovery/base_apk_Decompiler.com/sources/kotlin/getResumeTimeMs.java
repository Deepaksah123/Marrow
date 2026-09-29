package kotlin;

import com.marrow.data.models.user.NotesDispatchAddressRequestKt;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.MagicModuleUseCaseImplWhenMappings;
import kotlin.Metadata;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0000\u0018\u0000 M2\u00020\u00012\u00020\u0002:\u0003MNOB+\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\"\u0010\u0015\u001a\u00020\u00162\n\u0010\u0017\u001a\u00060\u0018R\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u0004J\u0012\u0010\u001b\u001a\u00020\u00102\n\u0010\u0017\u001a\u00060\u0018R\u00020\u0000J\u000e\u0010\u001c\u001a\b\u0018\u00010\u0018R\u00020\u0000H\u0002J\u0014\u0010\u001d\u001a\u00020\u00042\n\u0010\u0017\u001a\u00060\u0018R\u00020\u0000H\u0002J\u0011\u0010!\u001a\u00020\u00042\u0006\u0010&\u001a\u00020\u0007H\u0082\bJ\u0011\u0010'\u001a\u00020\u00042\u0006\u0010&\u001a\u00020\u0007H\u0082\bJ\u0011\u0010$\u001a\u00020\u00042\u0006\u0010&\u001a\u00020\u0007H\u0086\bJ\t\u0010(\u001a\u00020\u0004H\u0082\bJ\t\u0010)\u001a\u00020\u0004H\u0082\bJ\t\u0010*\u001a\u00020\u0007H\u0082\bJ\t\u0010+\u001a\u00020\u0016H\u0082\bJ\t\u0010,\u001a\u00020\u0010H\u0082\bJ\t\u0010-\u001a\u00020\u0007H\u0082\bJ\u0019\u00102\u001a\u00020\u00162\n\u00103\u001a\u000605j\u0002`4H\u0016¢\u0006\u0002\u00106J\b\u00107\u001a\u00020\u0016H\u0016J\u000e\u00108\u001a\u00020\u00162\u0006\u00109\u001a\u00020\u0007J/\u0010:\u001a\u00020\u00162\n\u0010;\u001a\u000605j\u0002`42\f\b\u0002\u0010<\u001a\u00060\u0010j\u0002`=2\b\b\u0002\u0010>\u001a\u00020\u0010¢\u0006\u0002\u0010?J#\u0010@\u001a\u00020\u00122\n\u0010;\u001a\u000605j\u0002`42\n\u0010<\u001a\u00060\u0010j\u0002`=¢\u0006\u0002\u0010AJ\u0018\u0010B\u001a\u00020\u00162\u0006\u0010C\u001a\u00020\u00072\u0006\u0010D\u001a\u00020\u0010H\u0002J\u0006\u0010E\u001a\u00020\u0016J\u0012\u0010F\u001a\u00020\u00102\b\b\u0002\u0010&\u001a\u00020\u0007H\u0002J\b\u0010G\u001a\u00020\u0010H\u0002J\b\u0010H\u001a\u00020\u0004H\u0002J$\u0010I\u001a\u0004\u0018\u00010\u0012*\b\u0018\u00010\u0018R\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010>\u001a\u00020\u0010H\u0002J\u000e\u0010J\u001a\b\u0018\u00010\u0018R\u00020\u0000H\u0002J\b\u0010K\u001a\u00020\tH\u0016J\u000e\u0010L\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u0012R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\t\u0010\u0013\u001a\u00020\u0014X\u0082\u0004R\u001a\u0010\u001e\u001a\f\u0012\b\u0012\u00060\u0018R\u00020\u00000\u001f8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\t\u0010 \u001a\u00020\u0014X\u0082\u0004R\u0015\u0010!\u001a\u00020\u00048Â\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0015\u0010$\u001a\u00020\u00048Â\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b%\u0010#R\t\u0010.\u001a\u00020/X\u0082\u0004R\u0011\u00100\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b0\u00101¨\u0006P"}, d2 = {"Lkotlinx/coroutines/scheduling/CoroutineScheduler;", "Ljava/util/concurrent/Executor;", "Ljava/io/Closeable;", "corePoolSize", "", "maxPoolSize", "idleWorkerKeepAliveNs", "", "schedulerName", "", "<init>", "(IIJLjava/lang/String;)V", "globalCpuQueue", "Lkotlinx/coroutines/scheduling/GlobalQueue;", "globalBlockingQueue", "addToGlobalQueue", "", "task", "Lkotlinx/coroutines/scheduling/Task;", "parkedWorkersStack", "Lkotlinx/atomicfu/AtomicLong;", "parkedWorkersStackTopUpdate", "", "worker", "Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;", "oldIndex", "newIndex", "parkedWorkersStackPush", "parkedWorkersStackPop", "parkedWorkersStackNextIndex", "workers", "Lkotlinx/coroutines/internal/ResizableAtomicArray;", "controlState", "createdWorkers", "getCreatedWorkers", "()I", "availableCpuPermits", "getAvailableCpuPermits", NotesDispatchAddressRequestKt.KEY_STATE, "blockingTasks", "incrementCreatedWorkers", "decrementCreatedWorkers", "incrementBlockingTasks", "decrementBlockingTasks", "tryAcquireCpuPermit", "releaseCpuPermit", "_isTerminated", "Lkotlinx/atomicfu/AtomicBoolean;", "isTerminated", "()Z", "execute", "command", "Lkotlinx/coroutines/Runnable;", "Ljava/lang/Runnable;", "(Ljava/lang/Runnable;)V", "close", "shutdown", "timeout", "dispatch", "block", "taskContext", "Lkotlinx/coroutines/scheduling/TaskContext;", "tailDispatch", "(Ljava/lang/Runnable;ZZ)V", "createTask", "(Ljava/lang/Runnable;Z)Lkotlinx/coroutines/scheduling/Task;", "signalBlockingWork", "stateSnapshot", "skipUnpark", "signalCpuWork", "tryCreateWorker", "tryUnpark", "createNewWorker", "submitToLocalQueue", "currentWorker", "toString", "runSafely", "Companion", "Worker", "WorkerState", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class getResumeTimeMs implements Executor, Closeable {
    private static final /* synthetic */ AtomicLongFieldUpdater AudioAttributesImplApi26Parcelizer;
    private static final /* synthetic */ AtomicLongFieldUpdater AudioAttributesImplBaseParcelizer;
    private static final /* synthetic */ AtomicIntegerFieldUpdater MediaBrowserCompatItemReceiver;
    public static final accessgetVideoConfigurationC2cp write;
    public final int AudioAttributesCompatParcelizer;
    public final setTotalDurationMs<write> AudioAttributesImplApi21Parcelizer;
    public final getSubtitleId IconCompatParcelizer;
    public final String MediaBrowserCompatCustomActionResultReceiver;
    private int RatingCompat;
    public final getSubtitleId RemoteActionCompatParcelizer;
    private volatile /* synthetic */ int _isTerminated$volatile;
    private volatile /* synthetic */ long controlState$volatile;
    private volatile /* synthetic */ long parkedWorkersStack$volatile;
    public final long read;

    public final /* synthetic */ class RemoteActionCompatParcelizer {
        public static final /* synthetic */ int[] write;

        static {
            int[] iArr = new int[read.values().length];
            try {
                iArr[read.RemoteActionCompatParcelizer.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[read.IconCompatParcelizer.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[read.write.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[read.read.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[read.AudioAttributesCompatParcelizer.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            write = iArr;
        }
    }

    public getResumeTimeMs(int i, int i2, long j, String str) {
        this.AudioAttributesCompatParcelizer = i;
        this.RatingCompat = i2;
        this.read = j;
        this.MediaBrowserCompatCustomActionResultReceiver = str;
        if (i <= 0) {
            StringBuilder sb = new StringBuilder("Core pool size ");
            sb.append(i);
            sb.append(" should be at least 1");
            throw new IllegalArgumentException(sb.toString().toString());
        }
        if (i2 < i) {
            StringBuilder sb2 = new StringBuilder("Max pool size ");
            sb2.append(i2);
            sb2.append(" should be greater than or equals to core pool size ");
            sb2.append(i);
            throw new IllegalArgumentException(sb2.toString().toString());
        }
        if (i2 > 2097150) {
            StringBuilder sb3 = new StringBuilder("Max pool size ");
            sb3.append(i2);
            sb3.append(" should not exceed maximal supported number of threads 2097150");
            throw new IllegalArgumentException(sb3.toString().toString());
        }
        if (j <= 0) {
            StringBuilder sb4 = new StringBuilder("Idle worker keep alive time ");
            sb4.append(j);
            sb4.append(" must be positive");
            throw new IllegalArgumentException(sb4.toString().toString());
        }
        this.IconCompatParcelizer = new getSubtitleId();
        this.RemoteActionCompatParcelizer = new getSubtitleId();
        this.AudioAttributesImplApi21Parcelizer = new setTotalDurationMs<>((i + 1) << 1);
        this.controlState$volatile = ((long) i) << 42;
        this._isTerminated$volatile = 0;
    }

    public final void read(write writeVar, int i, int i2) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = AudioAttributesImplBaseParcelizer;
        while (true) {
            long j = atomicLongFieldUpdater.get(this);
            int iAudioAttributesCompatParcelizer = (int) (TarConstants.MAXID & j);
            if (iAudioAttributesCompatParcelizer == i) {
                iAudioAttributesCompatParcelizer = i2 == 0 ? AudioAttributesCompatParcelizer(writeVar) : i2;
            }
            if (iAudioAttributesCompatParcelizer >= 0 && AudioAttributesImplBaseParcelizer.compareAndSet(this, j, ((2097152 + j) & (-2097152)) | ((long) iAudioAttributesCompatParcelizer))) {
                return;
            }
        }
    }

    public final boolean IconCompatParcelizer(write writeVar) {
        long j;
        int indexInArray;
        if (writeVar.getNextParkedWorker() != write) {
            return false;
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater = AudioAttributesImplBaseParcelizer;
        do {
            j = atomicLongFieldUpdater.get(this);
            int i = (int) (TarConstants.MAXID & j);
            indexInArray = writeVar.getIndexInArray();
            getCollegeId.write();
            writeVar.AudioAttributesCompatParcelizer((Object) this.AudioAttributesImplApi21Parcelizer.IconCompatParcelizer(i));
        } while (!AudioAttributesImplBaseParcelizer.compareAndSet(this, j, ((2097152 + j) & (-2097152)) | ((long) indexInArray)));
        return true;
    }

    private final write MediaBrowserCompatItemReceiver() {
        AtomicLongFieldUpdater atomicLongFieldUpdater = AudioAttributesImplBaseParcelizer;
        while (true) {
            long j = atomicLongFieldUpdater.get(this);
            write writeVarIconCompatParcelizer = this.AudioAttributesImplApi21Parcelizer.IconCompatParcelizer((int) (TarConstants.MAXID & j));
            if (writeVarIconCompatParcelizer == null) {
                return null;
            }
            int iAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(writeVarIconCompatParcelizer);
            if (iAudioAttributesCompatParcelizer >= 0 && AudioAttributesImplBaseParcelizer.compareAndSet(this, j, ((long) iAudioAttributesCompatParcelizer) | ((2097152 + j) & (-2097152)))) {
                writeVarIconCompatParcelizer.AudioAttributesCompatParcelizer(write);
                return writeVarIconCompatParcelizer;
            }
        }
    }

    private static int AudioAttributesCompatParcelizer(write writeVar) {
        Object nextParkedWorker = writeVar.getNextParkedWorker();
        while (nextParkedWorker != write) {
            if (nextParkedWorker == null) {
                return 0;
            }
            write writeVar2 = (write) nextParkedWorker;
            int indexInArray = writeVar2.getIndexInArray();
            if (indexInArray != 0) {
                return indexInArray;
            }
            nextParkedWorker = writeVar2.getNextParkedWorker();
        }
        return -1;
    }

    public final boolean IconCompatParcelizer() {
        return MediaBrowserCompatItemReceiver.get(this) != 0;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006"}, d2 = {"Lo/getResumeTimeMs$AudioAttributesCompatParcelizer;", "", "<init>", "()V", "Lo/accessgetVideoConfigurationC2cp;", "write", "Lo/accessgetVideoConfigurationC2cp;", "RemoteActionCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AudioAttributesCompatParcelizer {
        private AudioAttributesCompatParcelizer() {
        }

        public /* synthetic */ AudioAttributesCompatParcelizer(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    static {
        new AudioAttributesCompatParcelizer(null);
        AudioAttributesImplBaseParcelizer = AtomicLongFieldUpdater.newUpdater(getResumeTimeMs.class, "parkedWorkersStack$volatile");
        AudioAttributesImplApi26Parcelizer = AtomicLongFieldUpdater.newUpdater(getResumeTimeMs.class, "controlState$volatile");
        MediaBrowserCompatItemReceiver = AtomicIntegerFieldUpdater.newUpdater(getResumeTimeMs.class, "_isTerminated$volatile");
        write = new accessgetVideoConfigurationC2cp("NOT_IN_STACK");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable command) {
        read(this, command, false, 6);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws InterruptedException {
        MediaBrowserCompatMediaItem();
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void MediaBrowserCompatMediaItem() throws java.lang.InterruptedException {
        /*
            r7 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = AudioAttributesImplBaseParcelizer()
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r7, r1, r2)
            if (r0 != 0) goto Ld
            return
        Ld:
            o.getResumeTimeMs$write r0 = r7.RemoteActionCompatParcelizer()
            o.setTotalDurationMs<o.getResumeTimeMs$write> r1 = r7.AudioAttributesImplApi21Parcelizer
            monitor-enter(r1)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r3 = read()     // Catch: java.lang.Throwable -> L9a
            long r3 = r3.get(r7)     // Catch: java.lang.Throwable -> L9a
            r5 = 2097151(0x1fffff, double:1.0361303E-317)
            long r3 = r3 & r5
            int r3 = (int) r3
            monitor-exit(r1)
            if (r3 <= 0) goto L55
            r1 = r2
        L25:
            o.setTotalDurationMs<o.getResumeTimeMs$write> r4 = r7.AudioAttributesImplApi21Parcelizer
            java.lang.Object r4 = r4.IconCompatParcelizer(r1)
            kotlin.toMagicModuleMetaRepoModel.write(r4)
            o.getResumeTimeMs$write r4 = (o.getResumeTimeMs.write) r4
            if (r4 == r0) goto L50
        L32:
            java.lang.Thread$State r5 = r4.getState()
            java.lang.Thread$State r6 = java.lang.Thread.State.TERMINATED
            if (r5 == r6) goto L46
            r5 = r4
            java.lang.Thread r5 = (java.lang.Thread) r5
            java.util.concurrent.locks.LockSupport.unpark(r5)
            r5 = 10000(0x2710, double:4.9407E-320)
            r4.join(r5)
            goto L32
        L46:
            kotlin.getCollegeId.write()
            o.getLastQueuedTimeMs r4 = r4.read
            o.getSubtitleId r5 = r7.RemoteActionCompatParcelizer
            r4.RemoteActionCompatParcelizer(r5)
        L50:
            if (r1 == r3) goto L55
            int r1 = r1 + 1
            goto L25
        L55:
            o.getSubtitleId r1 = r7.RemoteActionCompatParcelizer
            r1.AudioAttributesCompatParcelizer()
            o.getSubtitleId r1 = r7.IconCompatParcelizer
            r1.AudioAttributesCompatParcelizer()
        L5f:
            if (r0 == 0) goto L67
            o.getDownloadCount r1 = r0.IconCompatParcelizer(r2)
            if (r1 != 0) goto L96
        L67:
            o.getSubtitleId r1 = r7.IconCompatParcelizer
            java.lang.Object r1 = r1.read()
            o.getDownloadCount r1 = (kotlin.getDownloadCount) r1
            if (r1 != 0) goto L96
            o.getSubtitleId r1 = r7.RemoteActionCompatParcelizer
            java.lang.Object r1 = r1.read()
            o.getDownloadCount r1 = (kotlin.getDownloadCount) r1
            if (r1 != 0) goto L96
            if (r0 == 0) goto L82
            o.getResumeTimeMs$read r1 = o.getResumeTimeMs.read.AudioAttributesCompatParcelizer
            r0.read(r1)
        L82:
            kotlin.getCollegeId.write()
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = AudioAttributesImplApi21Parcelizer()
            r1 = 0
            r0.set(r7, r1)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = MediaBrowserCompatCustomActionResultReceiver()
            r0.set(r7, r1)
            return
        L96:
            AudioAttributesCompatParcelizer(r1)
            goto L5f
        L9a:
            r7 = move-exception
            monitor-exit(r1)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getResumeTimeMs.MediaBrowserCompatMediaItem():void");
    }

    public static /* synthetic */ void read(getResumeTimeMs getresumetimems, Runnable runnable, boolean z, int i) {
        if ((i & 4) != 0) {
            z = false;
        }
        getresumetimems.read(runnable, false, z);
    }

    public final void read(Runnable runnable, boolean z, boolean z2) {
        getDownloadCount getdownloadcountRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(runnable, z);
        boolean z3 = getdownloadcountRemoteActionCompatParcelizer.MediaBrowserCompatItemReceiver;
        long jAddAndGet = z3 ? AudioAttributesImplApi26Parcelizer.addAndGet(this, 2097152L) : 0L;
        write writeVarRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
        getDownloadCount getdownloadcountAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(writeVarRemoteActionCompatParcelizer, getdownloadcountRemoteActionCompatParcelizer, z2);
        if (getdownloadcountAudioAttributesCompatParcelizer != null && !read(getdownloadcountAudioAttributesCompatParcelizer)) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.MediaBrowserCompatCustomActionResultReceiver);
            sb.append(" was terminated");
            throw new RejectedExecutionException(sb.toString());
        }
        boolean z4 = z2 && writeVarRemoteActionCompatParcelizer != null;
        if (z3) {
            write(jAddAndGet, z4);
        } else {
            if (z4) {
                return;
            }
            AudioAttributesCompatParcelizer();
        }
    }

    private static getDownloadCount RemoteActionCompatParcelizer(Runnable runnable, boolean z) {
        long jIconCompatParcelizer = CourseDownloadCount.AudioAttributesImplBaseParcelizer.IconCompatParcelizer();
        if (runnable instanceof getDownloadCount) {
            getDownloadCount getdownloadcount = (getDownloadCount) runnable;
            getdownloadcount.AudioAttributesImplApi26Parcelizer = jIconCompatParcelizer;
            getdownloadcount.MediaBrowserCompatItemReceiver = z;
            return getdownloadcount;
        }
        return CourseDownloadCount.write(runnable, jIconCompatParcelizer, z);
    }

    private final void write(long j, boolean z) {
        if (z || AudioAttributesImplApi26Parcelizer() || RemoteActionCompatParcelizer(j)) {
            return;
        }
        AudioAttributesImplApi26Parcelizer();
    }

    public final void AudioAttributesCompatParcelizer() {
        if (AudioAttributesImplApi26Parcelizer() || IconCompatParcelizer(this)) {
            return;
        }
        AudioAttributesImplApi26Parcelizer();
    }

    private static /* synthetic */ boolean IconCompatParcelizer(getResumeTimeMs getresumetimems) {
        return getresumetimems.RemoteActionCompatParcelizer(AudioAttributesImplApi26Parcelizer.get(getresumetimems));
    }

    private final boolean RemoteActionCompatParcelizer(long j) {
        if (getQues.write(((int) (TarConstants.MAXID & j)) - ((int) ((j & 4398044413952L) >> 21)), 0) < this.AudioAttributesCompatParcelizer) {
            int iWrite = write();
            if (iWrite == 1 && this.AudioAttributesCompatParcelizer > 1) {
                write();
            }
            if (iWrite > 0) {
                return true;
            }
        }
        return false;
    }

    private final boolean AudioAttributesImplApi26Parcelizer() {
        write writeVarMediaBrowserCompatItemReceiver;
        do {
            writeVarMediaBrowserCompatItemReceiver = MediaBrowserCompatItemReceiver();
            if (writeVarMediaBrowserCompatItemReceiver == null) {
                return false;
            }
        } while (!write.IconCompatParcelizer.compareAndSet(writeVarMediaBrowserCompatItemReceiver, -1, 0));
        LockSupport.unpark(writeVarMediaBrowserCompatItemReceiver);
        return true;
    }

    private final int write() {
        synchronized (this.AudioAttributesImplApi21Parcelizer) {
            if (IconCompatParcelizer()) {
                return -1;
            }
            long j = AudioAttributesImplApi26Parcelizer.get(this);
            int i = (int) (j & TarConstants.MAXID);
            int iWrite = getQues.write(i - ((int) ((j & 4398044413952L) >> 21)), 0);
            if (iWrite >= this.AudioAttributesCompatParcelizer) {
                return 0;
            }
            if (i >= this.RatingCompat) {
                return 0;
            }
            int i2 = ((int) (MediaBrowserCompatCustomActionResultReceiver().get(this) & TarConstants.MAXID)) + 1;
            if (i2 <= 0 || this.AudioAttributesImplApi21Parcelizer.IconCompatParcelizer(i2) != null) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            write writeVar = new write(this, i2);
            this.AudioAttributesImplApi21Parcelizer.RemoteActionCompatParcelizer(i2, writeVar);
            if (i2 != ((int) (TarConstants.MAXID & AudioAttributesImplApi26Parcelizer.incrementAndGet(this)))) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            writeVar.start();
            return iWrite + 1;
        }
    }

    private static getDownloadCount AudioAttributesCompatParcelizer(write writeVar, getDownloadCount getdownloadcount, boolean z) {
        if (writeVar == null || writeVar.RemoteActionCompatParcelizer == read.AudioAttributesCompatParcelizer || (!getdownloadcount.MediaBrowserCompatItemReceiver && writeVar.RemoteActionCompatParcelizer == read.IconCompatParcelizer)) {
            return getdownloadcount;
        }
        writeVar.write = true;
        return writeVar.read.IconCompatParcelizer(getdownloadcount, z);
    }

    private final write RemoteActionCompatParcelizer() {
        Thread threadCurrentThread = Thread.currentThread();
        write writeVar = threadCurrentThread instanceof write ? (write) threadCurrentThread : null;
        if (writeVar == null || !toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(getResumeTimeMs.this, this)) {
            return null;
        }
        return writeVar;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        int iRemoteActionCompatParcelizer = this.AudioAttributesImplApi21Parcelizer.RemoteActionCompatParcelizer();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 1; i6 < iRemoteActionCompatParcelizer; i6++) {
            write writeVarIconCompatParcelizer = this.AudioAttributesImplApi21Parcelizer.IconCompatParcelizer(i6);
            if (writeVarIconCompatParcelizer != null) {
                int i7 = writeVarIconCompatParcelizer.read.read();
                int i8 = RemoteActionCompatParcelizer.write[writeVarIconCompatParcelizer.RemoteActionCompatParcelizer.ordinal()];
                if (i8 == 1) {
                    i3++;
                } else if (i8 == 2) {
                    i2++;
                    StringBuilder sb = new StringBuilder();
                    sb.append(i7);
                    sb.append('b');
                    arrayList.add(sb.toString());
                } else if (i8 == 3) {
                    i++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i7);
                    sb2.append('c');
                    arrayList.add(sb2.toString());
                } else if (i8 == 4) {
                    i4++;
                    if (i7 > 0) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(i7);
                        sb3.append('d');
                        arrayList.add(sb3.toString());
                    }
                } else {
                    if (i8 != 5) {
                        throw new RenewEligibleCreator();
                    }
                    i5++;
                }
            }
        }
        long j = AudioAttributesImplApi26Parcelizer.get(this);
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.MediaBrowserCompatCustomActionResultReceiver);
        sb4.append('@');
        sb4.append(isVerified.IconCompatParcelizer(this));
        sb4.append("[Pool Size {core = ");
        sb4.append(this.AudioAttributesCompatParcelizer);
        sb4.append(", max = ");
        sb4.append(this.RatingCompat);
        sb4.append("}, Worker States {CPU = ");
        sb4.append(i);
        sb4.append(", blocking = ");
        sb4.append(i2);
        sb4.append(", parked = ");
        sb4.append(i3);
        sb4.append(", dormant = ");
        sb4.append(i4);
        sb4.append(", terminated = ");
        sb4.append(i5);
        sb4.append("}, running workers queues = ");
        sb4.append(arrayList);
        sb4.append(", global CPU queue size = ");
        sb4.append(this.IconCompatParcelizer.write());
        sb4.append(", global blocking queue size = ");
        sb4.append(this.RemoteActionCompatParcelizer.write());
        sb4.append(", Control State {created workers= ");
        sb4.append((int) (TarConstants.MAXID & j));
        sb4.append(", blocking tasks = ");
        sb4.append((int) ((4398044413952L & j) >> 21));
        sb4.append(", CPUs acquired = ");
        sb4.append(this.AudioAttributesCompatParcelizer - ((int) ((9223367638808264704L & j) >> 42)));
        sb4.append("}]");
        return sb4.toString();
    }

    public static void AudioAttributesCompatParcelizer(getDownloadCount getdownloadcount) {
        try {
            getdownloadcount.run();
        } catch (Throwable th) {
            Thread threadCurrentThread = Thread.currentThread();
            threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th);
        }
    }

    @Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\u0004\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0002\u0010\u0006J\b\u0010#\u001a\u00020$H\u0002J\u000e\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020\u0016J\b\u0010'\u001a\u00020(H\u0016J\b\u0010*\u001a\u00020(H\u0002J\u0006\u0010+\u001a\u00020\u001aJ\u0006\u0010,\u001a\u00020$J\b\u0010-\u001a\u00020(H\u0002J\b\u0010.\u001a\u00020$H\u0002J\u0010\u0010/\u001a\u00020(2\u0006\u00100\u001a\u00020\u0014H\u0002J\u000e\u00101\u001a\u00020\u00052\u0006\u00102\u001a\u00020\u0005J\b\u00103\u001a\u00020(H\u0002J\b\u00104\u001a\u00020(H\u0002J\u0010\u00105\u001a\u0004\u0018\u00010\u00142\u0006\u0010)\u001a\u00020$J\n\u00106\u001a\u0004\u0018\u00010\u0014H\u0002J\n\u00107\u001a\u0004\u0018\u00010\u0014H\u0002J\u0012\u00108\u001a\u0004\u0018\u00010\u00142\u0006\u00109\u001a\u00020$H\u0002J\n\u0010:\u001a\u0004\u0018\u00010\u0014H\u0002J\u001b\u0010;\u001a\u0004\u0018\u00010\u00142\n\u0010<\u001a\u00060\u0005j\u0002`=H\u0002¢\u0006\u0002\u0010>R$\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0005@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0012\u0010\f\u001a\u00020\r8Æ\u0002¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0010\u0010\u0010\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0015\u001a\u00020\u00168\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0006\u0010\u0017\u001a\u00020\u0018R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u000e\u0010!\u001a\u00020\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010)\u001a\u00020$8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006?"}, d2 = {"Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;", "Ljava/lang/Thread;", "<init>", "(Lkotlinx/coroutines/scheduling/CoroutineScheduler;)V", "index", "", "(Lkotlinx/coroutines/scheduling/CoroutineScheduler;I)V", "indexInArray", "getIndexInArray", "()I", "setIndexInArray", "(I)V", "scheduler", "Lkotlinx/coroutines/scheduling/CoroutineScheduler;", "getScheduler", "()Lkotlinx/coroutines/scheduling/CoroutineScheduler;", "localQueue", "Lkotlinx/coroutines/scheduling/WorkQueue;", "stolenTask", "Lkotlin/jvm/internal/Ref$ObjectRef;", "Lkotlinx/coroutines/scheduling/Task;", NotesDispatchAddressRequestKt.KEY_STATE, "Lkotlinx/coroutines/scheduling/CoroutineScheduler$WorkerState;", "workerCtl", "Lkotlinx/atomicfu/AtomicInt;", "terminationDeadline", "", "nextParkedWorker", "", "getNextParkedWorker", "()Ljava/lang/Object;", "setNextParkedWorker", "(Ljava/lang/Object;)V", "minDelayUntilStealableTaskNs", "rngState", "tryAcquireCpuPermit", "", "tryReleaseCpu", "newState", "run", "", "mayHaveLocalTasks", "runWorker", "runSingleTask", "isIo", "tryPark", "inStack", "executeTask", "task", "nextInt", "upperBound", "park", "tryTerminateWorker", "findTask", "findBlockingTask", "findCpuTask", "findAnyTask", "scanLocalQueue", "pollGlobalQueues", "trySteal", "stealingMode", "Lkotlinx/coroutines/scheduling/StealingMode;", "(I)Lkotlinx/coroutines/scheduling/Task;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class write extends Thread {
        private static final /* synthetic */ AtomicIntegerFieldUpdater IconCompatParcelizer = AtomicIntegerFieldUpdater.newUpdater(write.class, "workerCtl$volatile");
        private long AudioAttributesCompatParcelizer;
        private long AudioAttributesImplApi21Parcelizer;
        private int AudioAttributesImplBaseParcelizer;
        private final MagicModuleUseCaseImplWhenMappings.write<getDownloadCount> MediaBrowserCompatItemReceiver;
        public read RemoteActionCompatParcelizer;
        private volatile int indexInArray;
        private volatile Object nextParkedWorker;
        public final getLastQueuedTimeMs read;
        private volatile /* synthetic */ int workerCtl$volatile;
        public boolean write;

        private write() {
            setDaemon(true);
            setContextClassLoader(getResumeTimeMs.this.getClass().getClassLoader());
            this.read = new getLastQueuedTimeMs();
            this.MediaBrowserCompatItemReceiver = new MagicModuleUseCaseImplWhenMappings.write<>();
            this.RemoteActionCompatParcelizer = read.read;
            this.nextParkedWorker = getResumeTimeMs.write;
            int iNanoTime = (int) System.nanoTime();
            this.AudioAttributesImplBaseParcelizer = iNanoTime == 0 ? 42 : iNanoTime;
        }

        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
        public final int getIndexInArray() {
            return this.indexInArray;
        }

        private void IconCompatParcelizer(int i) {
            StringBuilder sb = new StringBuilder();
            sb.append(getResumeTimeMs.this.MediaBrowserCompatCustomActionResultReceiver);
            sb.append("-worker-");
            sb.append(i == 0 ? "TERMINATED" : String.valueOf(i));
            setName(sb.toString());
            this.indexInArray = i;
        }

        public write(getResumeTimeMs getresumetimems, int i) {
            this();
            IconCompatParcelizer(i);
        }

        public final void AudioAttributesCompatParcelizer(Object obj) {
            this.nextParkedWorker = obj;
        }

        /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
        public final Object getNextParkedWorker() {
            return this.nextParkedWorker;
        }

        private final boolean AudioAttributesImplApi21Parcelizer() {
            long j;
            if (this.RemoteActionCompatParcelizer == read.write) {
                return true;
            }
            getResumeTimeMs getresumetimems = getResumeTimeMs.this;
            AtomicLongFieldUpdater atomicLongFieldUpdaterMediaBrowserCompatCustomActionResultReceiver = getResumeTimeMs.MediaBrowserCompatCustomActionResultReceiver();
            do {
                j = atomicLongFieldUpdaterMediaBrowserCompatCustomActionResultReceiver.get(getresumetimems);
                if (((int) ((9223367638808264704L & j) >> 42)) == 0) {
                    return false;
                }
            } while (!getResumeTimeMs.MediaBrowserCompatCustomActionResultReceiver().compareAndSet(getresumetimems, j, j - 4398046511104L));
            this.RemoteActionCompatParcelizer = read.write;
            return true;
        }

        public final boolean read(read readVar) {
            read readVar2 = this.RemoteActionCompatParcelizer;
            boolean z = readVar2 == read.write;
            if (z) {
                getResumeTimeMs.MediaBrowserCompatCustomActionResultReceiver().addAndGet(getResumeTimeMs.this, 4398046511104L);
            }
            if (readVar2 != readVar) {
                this.RemoteActionCompatParcelizer = readVar;
            }
            return z;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            MediaBrowserCompatItemReceiver();
        }

        private final void MediaBrowserCompatItemReceiver() {
            loop0: while (true) {
                boolean z = false;
                while (!getResumeTimeMs.this.IconCompatParcelizer() && this.RemoteActionCompatParcelizer != read.AudioAttributesCompatParcelizer) {
                    getDownloadCount getdownloadcountIconCompatParcelizer = IconCompatParcelizer(this.write);
                    if (getdownloadcountIconCompatParcelizer != null) {
                        this.AudioAttributesCompatParcelizer = 0L;
                        IconCompatParcelizer(getdownloadcountIconCompatParcelizer);
                    } else {
                        this.write = false;
                        if (this.AudioAttributesCompatParcelizer == 0) {
                            AudioAttributesImplApi26Parcelizer();
                        } else if (z) {
                            read(read.RemoteActionCompatParcelizer);
                            Thread.interrupted();
                            LockSupport.parkNanos(this.AudioAttributesCompatParcelizer);
                            this.AudioAttributesCompatParcelizer = 0L;
                        } else {
                            z = true;
                        }
                    }
                }
                break loop0;
            }
            read(read.AudioAttributesCompatParcelizer);
        }

        private final void AudioAttributesImplApi26Parcelizer() {
            if (!write()) {
                getResumeTimeMs.this.IconCompatParcelizer(this);
                return;
            }
            IconCompatParcelizer.set(this, -1);
            while (write() && IconCompatParcelizer.get(this) == -1 && !getResumeTimeMs.this.IconCompatParcelizer() && this.RemoteActionCompatParcelizer != read.AudioAttributesCompatParcelizer) {
                read(read.RemoteActionCompatParcelizer);
                Thread.interrupted();
                MediaBrowserCompatCustomActionResultReceiver();
            }
        }

        private final boolean write() {
            return this.nextParkedWorker != getResumeTimeMs.write;
        }

        private final void IconCompatParcelizer(getDownloadCount getdownloadcount) {
            this.AudioAttributesImplApi21Parcelizer = 0L;
            if (this.RemoteActionCompatParcelizer == read.RemoteActionCompatParcelizer) {
                getCollegeId.write();
                this.RemoteActionCompatParcelizer = read.IconCompatParcelizer;
            }
            if (getdownloadcount.MediaBrowserCompatItemReceiver) {
                if (read(read.IconCompatParcelizer)) {
                    getResumeTimeMs.this.AudioAttributesCompatParcelizer();
                }
                getResumeTimeMs.AudioAttributesCompatParcelizer(getdownloadcount);
                getResumeTimeMs.MediaBrowserCompatCustomActionResultReceiver().addAndGet(getResumeTimeMs.this, -2097152L);
                if (this.RemoteActionCompatParcelizer != read.AudioAttributesCompatParcelizer) {
                    getCollegeId.write();
                    this.RemoteActionCompatParcelizer = read.read;
                    return;
                }
                return;
            }
            getResumeTimeMs.AudioAttributesCompatParcelizer(getdownloadcount);
        }

        private int read(int i) {
            int i2 = this.AudioAttributesImplBaseParcelizer;
            int i3 = i2 ^ (i2 << 13);
            int i4 = i3 ^ (i3 >> 17);
            int i5 = i4 ^ (i4 << 5);
            this.AudioAttributesImplBaseParcelizer = i5;
            int i6 = i - 1;
            return (i6 & i) == 0 ? i6 & i5 : (Integer.MAX_VALUE & i5) % i;
        }

        private final void MediaBrowserCompatCustomActionResultReceiver() {
            if (this.AudioAttributesImplApi21Parcelizer == 0) {
                this.AudioAttributesImplApi21Parcelizer = System.nanoTime() + getResumeTimeMs.this.read;
            }
            LockSupport.parkNanos(getResumeTimeMs.this.read);
            if (System.nanoTime() - this.AudioAttributesImplApi21Parcelizer >= 0) {
                this.AudioAttributesImplApi21Parcelizer = 0L;
                MediaMetadataCompat();
            }
        }

        private final void MediaMetadataCompat() {
            setTotalDurationMs<write> settotaldurationms = getResumeTimeMs.this.AudioAttributesImplApi21Parcelizer;
            getResumeTimeMs getresumetimems = getResumeTimeMs.this;
            synchronized (settotaldurationms) {
                if (getresumetimems.IconCompatParcelizer()) {
                    return;
                }
                if (((int) (getResumeTimeMs.MediaBrowserCompatCustomActionResultReceiver().get(getresumetimems) & TarConstants.MAXID)) <= getresumetimems.AudioAttributesCompatParcelizer) {
                    return;
                }
                if (IconCompatParcelizer.compareAndSet(this, -1, 1)) {
                    int i = this.indexInArray;
                    IconCompatParcelizer(0);
                    getresumetimems.read(this, i, 0);
                    int andDecrement = (int) (getResumeTimeMs.MediaBrowserCompatCustomActionResultReceiver().getAndDecrement(getresumetimems) & TarConstants.MAXID);
                    if (andDecrement != i) {
                        write writeVarIconCompatParcelizer = getresumetimems.AudioAttributesImplApi21Parcelizer.IconCompatParcelizer(andDecrement);
                        toMagicModuleMetaRepoModel.write(writeVarIconCompatParcelizer);
                        write writeVar = writeVarIconCompatParcelizer;
                        getresumetimems.AudioAttributesImplApi21Parcelizer.RemoteActionCompatParcelizer(i, writeVar);
                        writeVar.IconCompatParcelizer(i);
                        getresumetimems.read(writeVar, andDecrement, i);
                    }
                    getresumetimems.AudioAttributesImplApi21Parcelizer.RemoteActionCompatParcelizer(andDecrement, null);
                    getShowPopup getshowpopup = getShowPopup.INSTANCE;
                    this.RemoteActionCompatParcelizer = read.AudioAttributesCompatParcelizer;
                }
            }
        }

        public final getDownloadCount IconCompatParcelizer(boolean z) {
            return AudioAttributesImplApi21Parcelizer() ? AudioAttributesCompatParcelizer(z) : RemoteActionCompatParcelizer();
        }

        private final getDownloadCount RemoteActionCompatParcelizer() {
            getDownloadCount getdownloadcountAudioAttributesCompatParcelizer = this.read.AudioAttributesCompatParcelizer();
            return (getdownloadcountAudioAttributesCompatParcelizer == null && (getdownloadcountAudioAttributesCompatParcelizer = getResumeTimeMs.this.RemoteActionCompatParcelizer.read()) == null) ? RemoteActionCompatParcelizer(1) : getdownloadcountAudioAttributesCompatParcelizer;
        }

        private final getDownloadCount AudioAttributesCompatParcelizer(boolean z) {
            getDownloadCount getdownloadcountAudioAttributesImplBaseParcelizer;
            getDownloadCount getdownloadcountAudioAttributesImplBaseParcelizer2;
            if (z) {
                boolean z2 = read(getResumeTimeMs.this.AudioAttributesCompatParcelizer << 1) == 0;
                if (z2 && (getdownloadcountAudioAttributesImplBaseParcelizer2 = AudioAttributesImplBaseParcelizer()) != null) {
                    return getdownloadcountAudioAttributesImplBaseParcelizer2;
                }
                getDownloadCount getdownloadcountIconCompatParcelizer = this.read.IconCompatParcelizer();
                if (getdownloadcountIconCompatParcelizer != null) {
                    return getdownloadcountIconCompatParcelizer;
                }
                if (!z2 && (getdownloadcountAudioAttributesImplBaseParcelizer = AudioAttributesImplBaseParcelizer()) != null) {
                    return getdownloadcountAudioAttributesImplBaseParcelizer;
                }
            } else {
                getDownloadCount getdownloadcountAudioAttributesImplBaseParcelizer3 = AudioAttributesImplBaseParcelizer();
                if (getdownloadcountAudioAttributesImplBaseParcelizer3 != null) {
                    return getdownloadcountAudioAttributesImplBaseParcelizer3;
                }
            }
            return RemoteActionCompatParcelizer(3);
        }

        private final getDownloadCount AudioAttributesImplBaseParcelizer() {
            if (read(2) == 0) {
                getDownloadCount getdownloadcount = getResumeTimeMs.this.IconCompatParcelizer.read();
                return getdownloadcount != null ? getdownloadcount : getResumeTimeMs.this.RemoteActionCompatParcelizer.read();
            }
            getDownloadCount getdownloadcount2 = getResumeTimeMs.this.RemoteActionCompatParcelizer.read();
            return getdownloadcount2 != null ? getdownloadcount2 : getResumeTimeMs.this.IconCompatParcelizer.read();
        }

        private final getDownloadCount RemoteActionCompatParcelizer(int i) {
            int i2 = (int) (getResumeTimeMs.MediaBrowserCompatCustomActionResultReceiver().get(getResumeTimeMs.this) & TarConstants.MAXID);
            if (i2 < 2) {
                return null;
            }
            int i3 = read(i2);
            getResumeTimeMs getresumetimems = getResumeTimeMs.this;
            long jMin = Long.MAX_VALUE;
            for (int i4 = 0; i4 < i2; i4++) {
                i3++;
                if (i3 > i2) {
                    i3 = 1;
                }
                write writeVarIconCompatParcelizer = getresumetimems.AudioAttributesImplApi21Parcelizer.IconCompatParcelizer(i3);
                if (writeVarIconCompatParcelizer != null && writeVarIconCompatParcelizer != this) {
                    long j = writeVarIconCompatParcelizer.read.read(i, this.MediaBrowserCompatItemReceiver);
                    if (j == -1) {
                        getDownloadCount getdownloadcount = this.MediaBrowserCompatItemReceiver.write;
                        this.MediaBrowserCompatItemReceiver.write = null;
                        return getdownloadcount;
                    }
                    if (j > 0) {
                        jMin = Math.min(jMin, j);
                    }
                }
            }
            if (jMin == Long.MAX_VALUE) {
                jMin = 0;
            }
            this.AudioAttributesCompatParcelizer = jMin;
            return null;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b"}, d2 = {"Lo/getResumeTimeMs$read;", "", "<init>", "(Ljava/lang/String;I)V", "write", "IconCompatParcelizer", "RemoteActionCompatParcelizer", "read", "AudioAttributesCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class read {
        private static final /* synthetic */ read[] MediaBrowserCompatCustomActionResultReceiver;
        public static final read write = new read("CPU_ACQUIRED", 0);
        public static final read IconCompatParcelizer = new read("BLOCKING", 1);
        public static final read RemoteActionCompatParcelizer = new read("PARKING", 2);
        public static final read read = new read("DORMANT", 3);
        public static final read AudioAttributesCompatParcelizer = new read("TERMINATED", 4);

        private read(String str, int i) {
        }

        static {
            read[] readVarArrIconCompatParcelizer = IconCompatParcelizer();
            MediaBrowserCompatCustomActionResultReceiver = readVarArrIconCompatParcelizer;
            getMagicModuleTimeline.IconCompatParcelizer(readVarArrIconCompatParcelizer);
        }

        public static read valueOf(String str) {
            return (read) Enum.valueOf(read.class, str);
        }

        public static read[] values() {
            return (read[]) MediaBrowserCompatCustomActionResultReceiver.clone();
        }

        private static final /* synthetic */ read[] IconCompatParcelizer() {
            return new read[]{write, IconCompatParcelizer, RemoteActionCompatParcelizer, read, AudioAttributesCompatParcelizer};
        }
    }

    private final boolean read(getDownloadCount getdownloadcount) {
        if (getdownloadcount.MediaBrowserCompatItemReceiver) {
            return this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(getdownloadcount);
        }
        return this.IconCompatParcelizer.RemoteActionCompatParcelizer(getdownloadcount);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ AtomicLongFieldUpdater MediaBrowserCompatCustomActionResultReceiver() {
        return AudioAttributesImplApi26Parcelizer;
    }
}
