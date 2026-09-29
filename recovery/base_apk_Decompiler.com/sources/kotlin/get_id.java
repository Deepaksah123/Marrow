package kotlin;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import in.juspay.hyper.constants.LogCategory;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.getCurrentYear;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b \u0018\u00002\u00020\u00012\u00020\u0002:\u0004:;<=B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\u001e\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00142\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00180\u001cH\u0016J!\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001a\u001a\u00020\u00142\n\u0010\u001f\u001a\u00060!j\u0002` H\u0004¢\u0006\u0002\u0010\"J\b\u0010#\u001a\u00020\u0014H\u0016J\u001f\u0010$\u001a\u00020\u00182\u0006\u0010%\u001a\u00020&2\n\u0010\u001f\u001a\u00060!j\u0002` ¢\u0006\u0002\u0010'J\u0019\u0010(\u001a\u00020\u00182\n\u0010)\u001a\u00060!j\u0002` H\u0016¢\u0006\u0002\u0010*J\u0019\u0010+\u001a\u00020\r2\n\u0010)\u001a\u00060!j\u0002` H\u0002¢\u0006\u0002\u0010,J\u0015\u0010-\u001a\n\u0018\u00010!j\u0004\u0018\u0001` H\u0002¢\u0006\u0002\u0010.J\b\u0010/\u001a\u00020\u0018H\u0002J\b\u00100\u001a\u00020\u0018H\u0002J\u0016\u00101\u001a\u00020\u00182\u0006\u00102\u001a\u00020\u00142\u0006\u00103\u001a\u000204J\u0010\u00105\u001a\u00020\r2\u0006\u0010)\u001a\u000204H\u0002J\u0018\u00106\u001a\u0002072\u0006\u00102\u001a\u00020\u00142\u0006\u00103\u001a\u000204H\u0002J\b\u00108\u001a\u00020\u0018H\u0004J\b\u00109\u001a\u00020\u0018H\u0002R\u0011\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006X\u0082\u0004R\u0011\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0006X\u0082\u0004R\t\u0010\n\u001a\u00020\u000bX\u0082\u0004R$\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\r8B@BX\u0082\u000e¢\u0006\f\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\r8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00148TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006>"}, d2 = {"Lkotlinx/coroutines/EventLoopImplBase;", "Lkotlinx/coroutines/EventLoopImplPlatform;", "Lkotlinx/coroutines/Delay;", "<init>", "()V", "_queue", "Lkotlinx/atomicfu/AtomicRef;", "", "_delayed", "Lkotlinx/coroutines/EventLoopImplBase$DelayedTaskQueue;", "_isCompleted", "Lkotlinx/atomicfu/AtomicBoolean;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "isCompleted", "()Z", "setCompleted", "(Z)V", "isEmpty", "nextTime", "", "getNextTime", "()J", "shutdown", "", "scheduleResumeAfterDelay", "timeMillis", "continuation", "Lkotlinx/coroutines/CancellableContinuation;", "scheduleInvokeOnTimeout", "Lkotlinx/coroutines/DisposableHandle;", "block", "Lkotlinx/coroutines/Runnable;", "Ljava/lang/Runnable;", "(JLjava/lang/Runnable;)Lkotlinx/coroutines/DisposableHandle;", "processNextEvent", "dispatch", LogCategory.CONTEXT, "Lkotlin/coroutines/CoroutineContext;", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Runnable;)V", "enqueue", "task", "(Ljava/lang/Runnable;)V", "enqueueImpl", "(Ljava/lang/Runnable;)Z", "dequeue", "()Ljava/lang/Runnable;", "enqueueDelayedTasks", "closeQueue", "schedule", "now", "delayedTask", "Lkotlinx/coroutines/EventLoopImplBase$DelayedTask;", "shouldUnpark", "scheduleImpl", "", "resetAll", "rescheduleAllDelayed", "DelayedTask", "DelayedResumeTask", "DelayedRunnableTask", "DelayedTaskQueue", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class get_id extends getDisplay implements getCurrentYear {
    private volatile /* synthetic */ Object _delayed$volatile;
    private volatile /* synthetic */ int _isCompleted$volatile = 0;
    private volatile /* synthetic */ Object _queue$volatile;
    private static final /* synthetic */ AtomicReferenceFieldUpdater IconCompatParcelizer = AtomicReferenceFieldUpdater.newUpdater(get_id.class, Object.class, "_queue$volatile");
    private static final /* synthetic */ AtomicReferenceFieldUpdater AudioAttributesCompatParcelizer = AtomicReferenceFieldUpdater.newUpdater(get_id.class, Object.class, "_delayed$volatile");
    private static final /* synthetic */ AtomicIntegerFieldUpdater write = AtomicIntegerFieldUpdater.newUpdater(get_id.class, "_isCompleted$volatile");

    public setYearOfPassout read(long j, Runnable runnable, CurrentQuery currentQuery) {
        return getCurrentYear.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(j, runnable, currentQuery);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean onCommand() {
        return write.get(this) != 0;
    }

    private final void onAddQueueItem() {
        write.set(this, 1);
    }

    @Override // kotlin.CollegeJsonParser
    protected final boolean write() {
        if (!AudioAttributesImplApi21Parcelizer()) {
            return false;
        }
        write writeVar = (write) AudioAttributesCompatParcelizer.get(this);
        if (writeVar != null && !writeVar.IconCompatParcelizer()) {
            return false;
        }
        Object obj = IconCompatParcelizer.get(this);
        if (obj == null) {
            return true;
        }
        return obj instanceof setReBufferDurationMs ? ((setReBufferDurationMs) obj).write() : obj == CourseDetail.read;
    }

    @Override // kotlin.CollegeJsonParser
    protected final long RemoteActionCompatParcelizer() {
        RemoteActionCompatParcelizer remoteActionCompatParcelizer;
        if (super.RemoteActionCompatParcelizer() == 0) {
            return 0L;
        }
        Object obj = IconCompatParcelizer.get(this);
        if (obj != null) {
            if (!(obj instanceof setReBufferDurationMs)) {
                return obj == CourseDetail.read ? Long.MAX_VALUE : 0L;
            }
            if (!((setReBufferDurationMs) obj).write()) {
                return 0L;
            }
        }
        write writeVar = (write) AudioAttributesCompatParcelizer.get(this);
        if (writeVar == null || (remoteActionCompatParcelizer = writeVar.read()) == null) {
            return Long.MAX_VALUE;
        }
        return getQues.write(remoteActionCompatParcelizer.AudioAttributesCompatParcelizer - System.nanoTime(), 0L);
    }

    @Override // kotlin.CollegeJsonParser
    public void AudioAttributesCompatParcelizer() {
        getAddLine2 getaddline2 = getAddLine2.RemoteActionCompatParcelizer;
        getAddLine2.IconCompatParcelizer();
        onAddQueueItem();
        MediaMetadataCompat();
        while (AudioAttributesImplBaseParcelizer() <= 0) {
        }
        handleMediaPlayPauseIfPendingOnHandler();
    }

    @Override // kotlin.getCurrentYear
    public final void write(long j, setStateRank<? super getShowPopup> setstaterank) {
        long j2 = CourseDetail.read(j);
        if (j2 < 4611686018427387903L) {
            long jNanoTime = System.nanoTime();
            AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = new AudioAttributesCompatParcelizer(j2 + jNanoTime, setstaterank);
            IconCompatParcelizer(jNanoTime, audioAttributesCompatParcelizer);
            setStatePercentile.AudioAttributesCompatParcelizer(setstaterank, audioAttributesCompatParcelizer);
        }
    }

    protected final setYearOfPassout AudioAttributesCompatParcelizer(long j, Runnable runnable) {
        long j2 = CourseDetail.read(j);
        if (j2 < 4611686018427387903L) {
            long jNanoTime = System.nanoTime();
            read readVar = new read(j2 + jNanoTime, runnable);
            IconCompatParcelizer(jNanoTime, readVar);
            return readVar;
        }
        return setEmail.INSTANCE;
    }

    @Override // kotlin.CollegeJsonParser
    public final long AudioAttributesImplBaseParcelizer() {
        if (MediaBrowserCompatCustomActionResultReceiver()) {
            return 0L;
        }
        MediaBrowserCompatMediaItem();
        Runnable runnableMediaBrowserCompatSearchResultReceiver = MediaBrowserCompatSearchResultReceiver();
        if (runnableMediaBrowserCompatSearchResultReceiver != null) {
            runnableMediaBrowserCompatSearchResultReceiver.run();
            return 0L;
        }
        return RemoteActionCompatParcelizer();
    }

    @Override // kotlin.getPlatform
    public final void RemoteActionCompatParcelizer(CurrentQuery currentQuery, Runnable runnable) {
        read(runnable);
    }

    public void read(Runnable runnable) {
        MediaBrowserCompatMediaItem();
        if (IconCompatParcelizer(runnable)) {
            AudioAttributesImplApi26Parcelizer();
        } else {
            getWhichCollegeDataIsNotPresent.IconCompatParcelizer.read(runnable);
        }
    }

    private final boolean IconCompatParcelizer(Runnable runnable) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = IconCompatParcelizer;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (onCommand()) {
                return false;
            }
            if (obj != null) {
                if (!(obj instanceof setReBufferDurationMs)) {
                    if (obj == CourseDetail.read) {
                        return false;
                    }
                    setReBufferDurationMs setrebufferdurationms = new setReBufferDurationMs(8, true);
                    toMagicModuleMetaRepoModel.read(obj, "");
                    setrebufferdurationms.read((Runnable) obj);
                    setrebufferdurationms.read(runnable);
                    if (DateDeserializersDateBasedDeserializer.IconCompatParcelizer(IconCompatParcelizer, this, obj, setrebufferdurationms)) {
                        return true;
                    }
                } else {
                    toMagicModuleMetaRepoModel.read(obj, "");
                    setReBufferDurationMs setrebufferdurationms2 = (setReBufferDurationMs) obj;
                    int i = setrebufferdurationms2.read(runnable);
                    if (i == 0) {
                        return true;
                    }
                    if (i == 1) {
                        DateDeserializersDateBasedDeserializer.IconCompatParcelizer(IconCompatParcelizer, this, obj, setrebufferdurationms2.AudioAttributesCompatParcelizer());
                    } else if (i == 2) {
                        return false;
                    }
                }
            } else if (DateDeserializersDateBasedDeserializer.IconCompatParcelizer(IconCompatParcelizer, this, null, runnable)) {
                return true;
            }
        }
    }

    private final Runnable MediaBrowserCompatSearchResultReceiver() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = IconCompatParcelizer;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                return null;
            }
            if (!(obj instanceof setReBufferDurationMs)) {
                if (obj == CourseDetail.read) {
                    return null;
                }
                if (DateDeserializersDateBasedDeserializer.IconCompatParcelizer(IconCompatParcelizer, this, obj, null)) {
                    toMagicModuleMetaRepoModel.read(obj, "");
                    return (Runnable) obj;
                }
            } else {
                toMagicModuleMetaRepoModel.read(obj, "");
                setReBufferDurationMs setrebufferdurationms = (setReBufferDurationMs) obj;
                Object objIconCompatParcelizer = setrebufferdurationms.IconCompatParcelizer();
                if (objIconCompatParcelizer != setReBufferDurationMs.RemoteActionCompatParcelizer) {
                    return (Runnable) objIconCompatParcelizer;
                }
                DateDeserializersDateBasedDeserializer.IconCompatParcelizer(IconCompatParcelizer, this, obj, setrebufferdurationms.AudioAttributesCompatParcelizer());
            }
        }
    }

    private final void MediaBrowserCompatMediaItem() {
        RemoteActionCompatParcelizer remoteActionCompatParcelizer;
        write writeVar = (write) AudioAttributesCompatParcelizer.get(this);
        if (writeVar == null || writeVar.IconCompatParcelizer()) {
            return;
        }
        long jNanoTime = System.nanoTime();
        do {
            write writeVar2 = writeVar;
            synchronized (writeVar2) {
                RemoteActionCompatParcelizer remoteActionCompatParcelizerWrite = writeVar2.write();
                remoteActionCompatParcelizer = null;
                if (remoteActionCompatParcelizerWrite != null) {
                    RemoteActionCompatParcelizer remoteActionCompatParcelizer2 = remoteActionCompatParcelizerWrite;
                    if (remoteActionCompatParcelizer2.read(jNanoTime) && IconCompatParcelizer((Runnable) remoteActionCompatParcelizer2)) {
                        remoteActionCompatParcelizer = writeVar2.read(0);
                    }
                }
            }
        } while (remoteActionCompatParcelizer != null);
    }

    private final void MediaMetadataCompat() {
        getCollegeId.write();
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = IconCompatParcelizer;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                if (DateDeserializersDateBasedDeserializer.IconCompatParcelizer(IconCompatParcelizer, this, null, CourseDetail.read)) {
                    return;
                }
            } else if (!(obj instanceof setReBufferDurationMs)) {
                if (obj == CourseDetail.read) {
                    return;
                }
                setReBufferDurationMs setrebufferdurationms = new setReBufferDurationMs(8, true);
                toMagicModuleMetaRepoModel.read(obj, "");
                setrebufferdurationms.read((Runnable) obj);
                if (DateDeserializersDateBasedDeserializer.IconCompatParcelizer(IconCompatParcelizer, this, obj, setrebufferdurationms)) {
                    return;
                }
            } else {
                ((setReBufferDurationMs) obj).RemoteActionCompatParcelizer();
                return;
            }
        }
    }

    public final void IconCompatParcelizer(long j, RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        int i = read(j, remoteActionCompatParcelizer);
        if (i == 0) {
            if (IconCompatParcelizer(remoteActionCompatParcelizer)) {
                AudioAttributesImplApi26Parcelizer();
            }
        } else if (i == 1) {
            write(j, remoteActionCompatParcelizer);
        } else if (i != 2) {
            throw new IllegalStateException("unexpected result".toString());
        }
    }

    private final boolean IconCompatParcelizer(RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        write writeVar = (write) AudioAttributesCompatParcelizer.get(this);
        return (writeVar != null ? writeVar.read() : null) == remoteActionCompatParcelizer;
    }

    private final int read(long j, RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        if (onCommand()) {
            return 1;
        }
        write writeVar = (write) AudioAttributesCompatParcelizer.get(this);
        if (writeVar == null) {
            DateDeserializersDateBasedDeserializer.IconCompatParcelizer(AudioAttributesCompatParcelizer, this, null, new write(j));
            Object obj = AudioAttributesCompatParcelizer.get(this);
            toMagicModuleMetaRepoModel.write(obj);
            writeVar = (write) obj;
        }
        return remoteActionCompatParcelizer.AudioAttributesCompatParcelizer(j, writeVar, this);
    }

    protected final void MediaBrowserCompatItemReceiver() {
        IconCompatParcelizer.set(this, null);
        AudioAttributesCompatParcelizer.set(this, null);
    }

    private final void handleMediaPlayPauseIfPendingOnHandler() {
        RemoteActionCompatParcelizer remoteActionCompatParcelizerAudioAttributesCompatParcelizer;
        long jNanoTime = System.nanoTime();
        while (true) {
            write writeVar = (write) AudioAttributesCompatParcelizer.get(this);
            if (writeVar == null || (remoteActionCompatParcelizerAudioAttributesCompatParcelizer = writeVar.AudioAttributesCompatParcelizer()) == null) {
                return;
            } else {
                write(jNanoTime, remoteActionCompatParcelizerAudioAttributesCompatParcelizer);
            }
        }
    }

    @Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b \u0018\u00002\u00060\u0002j\u0002`\u00012\b\u0012\u0004\u0012\u00020\u00000\u00032\u00020\u00042\u00020\u00052\u00060\u0007j\u0002`\u0006B\u000f\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0011\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u0000H\u0096\u0002J\u000e\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\tJ\u001e\u0010\u001f\u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00020\t2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#J\u0006\u0010$\u001a\u00020%J\b\u0010&\u001a\u00020'H\u0016R\u0012\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R0\u0010\u000f\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u000e2\f\u0010\r\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u000e8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u0015X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006("}, d2 = {"Lkotlinx/coroutines/EventLoopImplBase$DelayedTask;", "Lkotlinx/coroutines/Runnable;", "Ljava/lang/Runnable;", "", "Lkotlinx/coroutines/DisposableHandle;", "Lkotlinx/coroutines/internal/ThreadSafeHeapNode;", "Lkotlinx/coroutines/internal/SynchronizedObject;", "", "nanoTime", "", "<init>", "(J)V", "_heap", AppMeasurementSdk.ConditionalUserProperty.VALUE, "Lkotlinx/coroutines/internal/ThreadSafeHeap;", "heap", "getHeap", "()Lkotlinx/coroutines/internal/ThreadSafeHeap;", "setHeap", "(Lkotlinx/coroutines/internal/ThreadSafeHeap;)V", "index", "", "getIndex", "()I", "setIndex", "(I)V", "compareTo", "other", "timeToExecute", "", "now", "scheduleTask", "delayed", "Lkotlinx/coroutines/EventLoopImplBase$DelayedTaskQueue;", "eventLoop", "Lkotlinx/coroutines/EventLoopImplBase;", "dispose", "", "toString", "", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class RemoteActionCompatParcelizer implements Runnable, Comparable<RemoteActionCompatParcelizer>, setYearOfPassout, VideoPlaybackInfo {
        public long AudioAttributesCompatParcelizer;
        private int RemoteActionCompatParcelizer = -1;
        private volatile Object _heap;

        public RemoteActionCompatParcelizer(long j) {
            this.AudioAttributesCompatParcelizer = j;
        }

        @Override // kotlin.VideoPlaybackInfo
        public final getDateInEpoch<?> read() {
            Object obj = this._heap;
            if (obj instanceof getDateInEpoch) {
                return (getDateInEpoch) obj;
            }
            return null;
        }

        @Override // kotlin.VideoPlaybackInfo
        public final void RemoteActionCompatParcelizer(getDateInEpoch<?> getdateinepoch) {
            if (this._heap == CourseDetail.RemoteActionCompatParcelizer) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            this._heap = getdateinepoch;
        }

        @Override // kotlin.VideoPlaybackInfo
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
        public final int getRemoteActionCompatParcelizer() {
            return this.RemoteActionCompatParcelizer;
        }

        @Override // kotlin.VideoPlaybackInfo
        public final void write(int i) {
            this.RemoteActionCompatParcelizer = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public int compareTo(RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
            long j = this.AudioAttributesCompatParcelizer - remoteActionCompatParcelizer.AudioAttributesCompatParcelizer;
            if (j > 0) {
                return 1;
            }
            return j < 0 ? -1 : 0;
        }

        public final boolean read(long j) {
            return j - this.AudioAttributesCompatParcelizer >= 0;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("Delayed[nanos=");
            sb.append(this.AudioAttributesCompatParcelizer);
            sb.append(']');
            return sb.toString();
        }

        public final int AudioAttributesCompatParcelizer(long j, write writeVar, get_id get_idVar) {
            synchronized (this) {
                if (this._heap == CourseDetail.RemoteActionCompatParcelizer) {
                    return 2;
                }
                write writeVar2 = writeVar;
                synchronized (writeVar2) {
                    RemoteActionCompatParcelizer remoteActionCompatParcelizerWrite = writeVar2.write();
                    if (get_idVar.onCommand()) {
                        return 1;
                    }
                    if (remoteActionCompatParcelizerWrite == null) {
                        writeVar.read = j;
                    } else {
                        long j2 = remoteActionCompatParcelizerWrite.AudioAttributesCompatParcelizer;
                        if (j2 - j < 0) {
                            j = j2;
                        }
                        if (j - writeVar.read > 0) {
                            writeVar.read = j;
                        }
                    }
                    if (this.AudioAttributesCompatParcelizer - writeVar.read < 0) {
                        this.AudioAttributesCompatParcelizer = writeVar.read;
                    }
                    writeVar2.write(this);
                    return 0;
                }
            }
        }

        @Override // kotlin.setYearOfPassout
        public final void write() {
            synchronized (this) {
                Object obj = this._heap;
                if (obj == CourseDetail.RemoteActionCompatParcelizer) {
                    return;
                }
                write writeVar = obj instanceof write ? (write) obj : null;
                if (writeVar != null) {
                    writeVar.read(this);
                }
                this._heap = CourseDetail.RemoteActionCompatParcelizer;
                getShowPopup getshowpopup = getShowPopup.INSTANCE;
            }
        }
    }

    final class AudioAttributesCompatParcelizer extends RemoteActionCompatParcelizer {
        private final setStateRank<getShowPopup> read;

        /* JADX WARN: Multi-variable type inference failed */
        public AudioAttributesCompatParcelizer(long j, setStateRank<? super getShowPopup> setstaterank) {
            super(j);
            this.read = setstaterank;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.read.RemoteActionCompatParcelizer(get_id.this, getShowPopup.INSTANCE);
        }

        @Override // o.get_id.RemoteActionCompatParcelizer
        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(super.toString());
            sb.append(this.read);
            return sb.toString();
        }
    }

    static final class read extends RemoteActionCompatParcelizer {
        private final Runnable RemoteActionCompatParcelizer;

        public read(long j, Runnable runnable) {
            super(j);
            this.RemoteActionCompatParcelizer = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.RemoteActionCompatParcelizer.run();
        }

        @Override // o.get_id.RemoteActionCompatParcelizer
        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(super.toString());
            sb.append(this.RemoteActionCompatParcelizer);
            return sb.toString();
        }
    }

    public static final class write extends getDateInEpoch<RemoteActionCompatParcelizer> {
        public long read;

        public write(long j) {
            this.read = j;
        }
    }
}
