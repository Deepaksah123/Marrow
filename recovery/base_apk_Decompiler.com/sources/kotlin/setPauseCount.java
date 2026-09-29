package kotlin;

import in.juspay.hyper.constants.LogCategory;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0001/B!\u0012\u0006\u0010\u0003\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u0014\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J!\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\n\u0010\u0019\u001a\u00060\u000fj\u0002`\u000eH\u0016¢\u0006\u0002\u0010\u001aJ!\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\n\u0010\u0019\u001a\u00060\u000fj\u0002`\u000eH\u0017¢\u0006\u0002\u0010\u001aJ2\u0010\u001c\u001a\u00020\u00162\n\u0010\u0019\u001a\u00060\u000fj\u0002`\u000e2\u0016\u0010\u001d\u001a\u0012\u0012\b\u0012\u00060\u001fR\u00020\u0000\u0012\u0004\u0012\u00020\u00160\u001eH\u0082\b¢\u0006\u0002\u0010 J\b\u0010!\u001a\u00020\"H\u0002J\u0015\u0010#\u001a\n\u0018\u00010\u000fj\u0004\u0018\u0001`\u000eH\u0002¢\u0006\u0002\u0010$J\b\u0010%\u001a\u00020\u0007H\u0016J\u0011\u0010&\u001a\u00020\u00162\u0006\u0010'\u001a\u00020(H\u0097AJ%\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020(2\n\u0010\u0019\u001a\u00060\u000fj\u0002`\u000e2\u0006\u0010\u0017\u001a\u00020\u0018H\u0096\u0001J\u001f\u0010,\u001a\u00020\u00162\u0006\u0010+\u001a\u00020(2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00160.H\u0096\u0001R\u000e\u0010\u0003\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\t\u0010\n\u001a\u00020\u000bX\u0082\u0004R\u0018\u0010\f\u001a\f\u0012\b\u0012\u00060\u000fj\u0002`\u000e0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\u00060\u0012j\u0002`\u0011X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0013¨\u00060"}, d2 = {"Lkotlinx/coroutines/internal/LimitedDispatcher;", "Lkotlinx/coroutines/CoroutineDispatcher;", "Lkotlinx/coroutines/Delay;", "dispatcher", "parallelism", "", "name", "", "<init>", "(Lkotlinx/coroutines/CoroutineDispatcher;ILjava/lang/String;)V", "runningWorkers", "Lkotlinx/atomicfu/AtomicInt;", "queue", "Lkotlinx/coroutines/internal/LockFreeTaskQueue;", "Lkotlinx/coroutines/Runnable;", "Ljava/lang/Runnable;", "workerAllocationLock", "Lkotlinx/coroutines/internal/SynchronizedObject;", "", "Ljava/lang/Object;", "limitedParallelism", "dispatch", "", LogCategory.CONTEXT, "Lkotlin/coroutines/CoroutineContext;", "block", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Runnable;)V", "dispatchYield", "dispatchInternal", "startWorker", "Lkotlin/Function1;", "Lkotlinx/coroutines/internal/LimitedDispatcher$Worker;", "(Ljava/lang/Runnable;Lkotlin/jvm/functions/Function1;)V", "tryAllocateWorker", "", "obtainTaskOrDeallocateWorker", "()Ljava/lang/Runnable;", "toString", "delay", "time", "", "invokeOnTimeout", "Lkotlinx/coroutines/DisposableHandle;", "timeMillis", "scheduleResumeAfterDelay", "continuation", "Lkotlinx/coroutines/CancellableContinuation;", "Worker", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class setPauseCount extends getPlatform implements getCurrentYear {
    private static final /* synthetic */ AtomicIntegerFieldUpdater write = AtomicIntegerFieldUpdater.newUpdater(setPauseCount.class, "runningWorkers$volatile");
    private final getPlatform AudioAttributesCompatParcelizer;
    private final int AudioAttributesImplApi21Parcelizer;
    private final Object AudioAttributesImplApi26Parcelizer;
    private final String AudioAttributesImplBaseParcelizer;
    private final /* synthetic */ getCurrentYear IconCompatParcelizer;
    private final setPortraitDurationMs<Runnable> MediaBrowserCompatItemReceiver;
    private volatile /* synthetic */ int runningWorkers$volatile;

    /* JADX WARN: Multi-variable type inference failed */
    public setPauseCount(getPlatform getplatform, int i, String str) {
        getCurrentYear getcurrentyear = getplatform instanceof getCurrentYear ? (getCurrentYear) getplatform : null;
        this.IconCompatParcelizer = getcurrentyear == null ? getVerifiedOn.AudioAttributesCompatParcelizer() : getcurrentyear;
        this.AudioAttributesCompatParcelizer = getplatform;
        this.AudioAttributesImplApi21Parcelizer = i;
        this.AudioAttributesImplBaseParcelizer = str;
        this.MediaBrowserCompatItemReceiver = new setPortraitDurationMs<>();
        this.AudioAttributesImplApi26Parcelizer = new Object();
    }

    @Override // kotlin.getPlatform
    public final getPlatform read(int i, String str) {
        setPbSessionId.AudioAttributesCompatParcelizer(i);
        return i >= this.AudioAttributesImplApi21Parcelizer ? setPbSessionId.read(this, str) : super.read(i, str);
    }

    private final boolean RemoteActionCompatParcelizer() {
        synchronized (this.AudioAttributesImplApi26Parcelizer) {
            if (write.get(this) >= this.AudioAttributesImplApi21Parcelizer) {
                return false;
            }
            write.incrementAndGet(this);
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Runnable write() {
        while (true) {
            Runnable runnable = this.MediaBrowserCompatItemReceiver.read();
            if (runnable != null) {
                return runnable;
            }
            synchronized (this.AudioAttributesImplApi26Parcelizer) {
                write.decrementAndGet(this);
                if (this.MediaBrowserCompatItemReceiver.write() == 0) {
                    return null;
                }
                write.incrementAndGet(this);
            }
        }
    }

    @Override // kotlin.getPlatform
    public final String toString() {
        String str = this.AudioAttributesImplBaseParcelizer;
        if (str != null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.AudioAttributesCompatParcelizer);
        sb.append(".limitedParallelism(");
        sb.append(this.AudioAttributesImplApi21Parcelizer);
        sb.append(')');
        return sb.toString();
    }

    final class write implements Runnable {
        private Runnable IconCompatParcelizer;

        public write(Runnable runnable) {
            this.IconCompatParcelizer = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            int i = 0;
            while (true) {
                try {
                    this.IconCompatParcelizer.run();
                } catch (Throwable th) {
                    YearItem.read(VideoSessionResponseBody.RemoteActionCompatParcelizer, th);
                }
                Runnable runnableWrite = setPauseCount.this.write();
                if (runnableWrite == null) {
                    return;
                }
                this.IconCompatParcelizer = runnableWrite;
                i++;
                if (i >= 16 && setPauseCount.this.AudioAttributesCompatParcelizer.IconCompatParcelizer(setPauseCount.this)) {
                    setPauseCount.this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(setPauseCount.this, this);
                    return;
                }
            }
        }
    }

    @Override // kotlin.getPlatform
    public final void RemoteActionCompatParcelizer(CurrentQuery currentQuery, Runnable runnable) {
        Runnable runnableWrite;
        this.MediaBrowserCompatItemReceiver.RemoteActionCompatParcelizer(runnable);
        if (write.get(this) >= this.AudioAttributesImplApi21Parcelizer || !RemoteActionCompatParcelizer() || (runnableWrite = write()) == null) {
            return;
        }
        this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(this, new write(runnableWrite));
    }

    @Override // kotlin.getPlatform
    public final void AudioAttributesCompatParcelizer(CurrentQuery currentQuery, Runnable runnable) {
        Runnable runnableWrite;
        this.MediaBrowserCompatItemReceiver.RemoteActionCompatParcelizer(runnable);
        if (write.get(this) >= this.AudioAttributesImplApi21Parcelizer || !RemoteActionCompatParcelizer() || (runnableWrite = write()) == null) {
            return;
        }
        this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(this, new write(runnableWrite));
    }

    @Override // kotlin.getCurrentYear
    public final setYearOfPassout read(long j, Runnable runnable, CurrentQuery currentQuery) {
        return this.IconCompatParcelizer.read(j, runnable, currentQuery);
    }

    @Override // kotlin.getCurrentYear
    public final void write(long j, setStateRank<? super getShowPopup> setstaterank) {
        this.IconCompatParcelizer.write(j, setstaterank);
    }
}
