package kotlin;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.getIds;

/* JADX INFO: loaded from: classes4.dex */
public final class isValidForPlan extends getIds {
    private static ScheduledExecutorService read;
    private static getCouponType write;
    private ThreadFactory AudioAttributesCompatParcelizer;
    private AtomicReference<ScheduledExecutorService> IconCompatParcelizer;

    static {
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(0);
        read = scheduledExecutorServiceNewScheduledThreadPool;
        scheduledExecutorServiceNewScheduledThreadPool.shutdown();
        write = new getCouponType("RxSingleScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx2.single-priority", 5).intValue())), true);
    }

    public isValidForPlan() {
        this(write);
    }

    private isValidForPlan(ThreadFactory threadFactory) {
        AtomicReference<ScheduledExecutorService> atomicReference = new AtomicReference<>();
        this.IconCompatParcelizer = atomicReference;
        this.AudioAttributesCompatParcelizer = threadFactory;
        atomicReference.lazySet(write(threadFactory));
    }

    private static ScheduledExecutorService write(ThreadFactory threadFactory) {
        return getExtension.IconCompatParcelizer(threadFactory);
    }

    @Override // kotlin.getIds
    public final void write() {
        ScheduledExecutorService scheduledExecutorService;
        ScheduledExecutorService scheduledExecutorServiceWrite = null;
        do {
            scheduledExecutorService = this.IconCompatParcelizer.get();
            if (scheduledExecutorService != read) {
                if (scheduledExecutorServiceWrite != null) {
                    scheduledExecutorServiceWrite.shutdown();
                    return;
                }
                return;
            } else if (scheduledExecutorServiceWrite == null) {
                scheduledExecutorServiceWrite = write(this.AudioAttributesCompatParcelizer);
            }
        } while (!setBackInvokedCallbackEnabled.read(this.IconCompatParcelizer, scheduledExecutorService, scheduledExecutorServiceWrite));
    }

    @Override // kotlin.getIds
    public final getIds.IconCompatParcelizer IconCompatParcelizer() {
        return new RemoteActionCompatParcelizer(this.IconCompatParcelizer.get());
    }

    @Override // kotlin.getIds
    public final MarkIncompleteResponseBody IconCompatParcelizer(Runnable runnable, long j, TimeUnit timeUnit) {
        Future<?> futureSchedule;
        getDiscountGroup getdiscountgroup = new getDiscountGroup(getPaymentRefIds.RemoteActionCompatParcelizer(runnable));
        try {
            if (j <= 0) {
                futureSchedule = this.IconCompatParcelizer.get().submit(getdiscountgroup);
            } else {
                futureSchedule = this.IconCompatParcelizer.get().schedule(getdiscountgroup, j, timeUnit);
            }
            getdiscountgroup.read(futureSchedule);
            return getdiscountgroup;
        } catch (RejectedExecutionException e) {
            getPaymentRefIds.RemoteActionCompatParcelizer(e);
            return isLessonPaid.INSTANCE;
        }
    }

    @Override // kotlin.getIds
    public final MarkIncompleteResponseBody write(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        Future<?> futureSchedule;
        Runnable runnableRemoteActionCompatParcelizer = getPaymentRefIds.RemoteActionCompatParcelizer(runnable);
        if (j2 <= 0) {
            ScheduledExecutorService scheduledExecutorService = this.IconCompatParcelizer.get();
            setBookmarked setbookmarked = new setBookmarked(runnableRemoteActionCompatParcelizer, scheduledExecutorService);
            try {
                if (j <= 0) {
                    futureSchedule = scheduledExecutorService.submit(setbookmarked);
                } else {
                    futureSchedule = scheduledExecutorService.schedule(setbookmarked, j, timeUnit);
                }
                setbookmarked.read(futureSchedule);
                return setbookmarked;
            } catch (RejectedExecutionException e) {
                getPaymentRefIds.RemoteActionCompatParcelizer(e);
                return isLessonPaid.INSTANCE;
            }
        }
        getFallBack getfallback = new getFallBack(runnableRemoteActionCompatParcelizer);
        try {
            getfallback.read(this.IconCompatParcelizer.get().scheduleAtFixedRate(getfallback, j, j2, timeUnit));
            return getfallback;
        } catch (RejectedExecutionException e2) {
            getPaymentRefIds.RemoteActionCompatParcelizer(e2);
            return isLessonPaid.INSTANCE;
        }
    }

    static final class RemoteActionCompatParcelizer extends getIds.IconCompatParcelizer {
        private getSno AudioAttributesCompatParcelizer = new getSno();
        private volatile boolean RemoteActionCompatParcelizer;
        private ScheduledExecutorService read;

        RemoteActionCompatParcelizer(ScheduledExecutorService scheduledExecutorService) {
            this.read = scheduledExecutorService;
        }

        @Override // o.getIds.IconCompatParcelizer
        public final MarkIncompleteResponseBody RemoteActionCompatParcelizer(Runnable runnable, long j, TimeUnit timeUnit) {
            Future<?> futureSchedule;
            if (this.RemoteActionCompatParcelizer) {
                return isLessonPaid.INSTANCE;
            }
            getExtensionGroup getextensiongroup = new getExtensionGroup(getPaymentRefIds.RemoteActionCompatParcelizer(runnable), this.AudioAttributesCompatParcelizer);
            this.AudioAttributesCompatParcelizer.read(getextensiongroup);
            try {
                if (j <= 0) {
                    futureSchedule = this.read.submit((Callable) getextensiongroup);
                } else {
                    futureSchedule = this.read.schedule((Callable) getextensiongroup, j, timeUnit);
                }
                getextensiongroup.AudioAttributesCompatParcelizer(futureSchedule);
                return getextensiongroup;
            } catch (RejectedExecutionException e) {
                aL_();
                getPaymentRefIds.RemoteActionCompatParcelizer(e);
                return isLessonPaid.INSTANCE;
            }
        }

        @Override // kotlin.MarkIncompleteResponseBody
        public final void aL_() {
            if (this.RemoteActionCompatParcelizer) {
                return;
            }
            this.RemoteActionCompatParcelizer = true;
            this.AudioAttributesCompatParcelizer.aL_();
        }

        @Override // kotlin.MarkIncompleteResponseBody
        public final boolean write() {
            return this.RemoteActionCompatParcelizer;
        }
    }
}
