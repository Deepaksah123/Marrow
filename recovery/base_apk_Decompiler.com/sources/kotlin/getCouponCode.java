package kotlin;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import kotlin.getIds;

/* JADX INFO: loaded from: classes4.dex */
public class getCouponCode extends getIds.IconCompatParcelizer {
    private final ScheduledExecutorService AudioAttributesCompatParcelizer;
    private volatile boolean IconCompatParcelizer;

    public getCouponCode(ThreadFactory threadFactory) {
        this.AudioAttributesCompatParcelizer = getExtension.IconCompatParcelizer(threadFactory);
    }

    @Override // o.getIds.IconCompatParcelizer
    public final MarkIncompleteResponseBody read(Runnable runnable) {
        return RemoteActionCompatParcelizer(runnable, 0L, null);
    }

    @Override // o.getIds.IconCompatParcelizer
    public final MarkIncompleteResponseBody RemoteActionCompatParcelizer(Runnable runnable, long j, TimeUnit timeUnit) {
        if (this.IconCompatParcelizer) {
            return isLessonPaid.INSTANCE;
        }
        return AudioAttributesCompatParcelizer(runnable, j, timeUnit, null);
    }

    public final MarkIncompleteResponseBody AudioAttributesCompatParcelizer(Runnable runnable, long j, TimeUnit timeUnit) {
        Future<?> futureSchedule;
        getDiscountGroup getdiscountgroup = new getDiscountGroup(getPaymentRefIds.RemoteActionCompatParcelizer(runnable));
        try {
            if (j <= 0) {
                futureSchedule = this.AudioAttributesCompatParcelizer.submit(getdiscountgroup);
            } else {
                futureSchedule = this.AudioAttributesCompatParcelizer.schedule(getdiscountgroup, j, timeUnit);
            }
            getdiscountgroup.read(futureSchedule);
            return getdiscountgroup;
        } catch (RejectedExecutionException e) {
            getPaymentRefIds.RemoteActionCompatParcelizer(e);
            return isLessonPaid.INSTANCE;
        }
    }

    public final MarkIncompleteResponseBody RemoteActionCompatParcelizer(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        Future<?> futureSchedule;
        Runnable runnableRemoteActionCompatParcelizer = getPaymentRefIds.RemoteActionCompatParcelizer(runnable);
        if (j2 <= 0) {
            setBookmarked setbookmarked = new setBookmarked(runnableRemoteActionCompatParcelizer, this.AudioAttributesCompatParcelizer);
            try {
                if (j <= 0) {
                    futureSchedule = this.AudioAttributesCompatParcelizer.submit(setbookmarked);
                } else {
                    futureSchedule = this.AudioAttributesCompatParcelizer.schedule(setbookmarked, j, timeUnit);
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
            getfallback.read(this.AudioAttributesCompatParcelizer.scheduleAtFixedRate(getfallback, j, j2, timeUnit));
            return getfallback;
        } catch (RejectedExecutionException e2) {
            getPaymentRefIds.RemoteActionCompatParcelizer(e2);
            return isLessonPaid.INSTANCE;
        }
    }

    public final getExtensionGroup AudioAttributesCompatParcelizer(Runnable runnable, long j, TimeUnit timeUnit, getFilterType getfiltertype) {
        Future<?> futureSchedule;
        getExtensionGroup getextensiongroup = new getExtensionGroup(getPaymentRefIds.RemoteActionCompatParcelizer(runnable), getfiltertype);
        if (getfiltertype != null && !getfiltertype.read(getextensiongroup)) {
            return getextensiongroup;
        }
        try {
            if (j <= 0) {
                futureSchedule = this.AudioAttributesCompatParcelizer.submit((Callable) getextensiongroup);
            } else {
                futureSchedule = this.AudioAttributesCompatParcelizer.schedule((Callable) getextensiongroup, j, timeUnit);
            }
            getextensiongroup.AudioAttributesCompatParcelizer(futureSchedule);
            return getextensiongroup;
        } catch (RejectedExecutionException e) {
            if (getfiltertype != null) {
                getfiltertype.RemoteActionCompatParcelizer(getextensiongroup);
            }
            getPaymentRefIds.RemoteActionCompatParcelizer(e);
            return getextensiongroup;
        }
    }

    @Override // kotlin.MarkIncompleteResponseBody
    public final void aL_() {
        if (this.IconCompatParcelizer) {
            return;
        }
        this.IconCompatParcelizer = true;
        this.AudioAttributesCompatParcelizer.shutdownNow();
    }

    public final void read() {
        if (this.IconCompatParcelizer) {
            return;
        }
        this.IconCompatParcelizer = true;
        this.AudioAttributesCompatParcelizer.shutdown();
    }

    @Override // kotlin.MarkIncompleteResponseBody
    public final boolean write() {
        return this.IconCompatParcelizer;
    }
}
