package kotlin;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public final class toDegrees extends EducationalDegree implements getCurrentYear {
    private final Executor IconCompatParcelizer;

    public toDegrees(Executor executor) {
        this.IconCompatParcelizer = executor;
        if (read() instanceof ScheduledThreadPoolExecutor) {
            ((ScheduledThreadPoolExecutor) read()).setRemoveOnCancelPolicy(true);
        }
    }

    @Override // kotlin.EducationalDegree
    public final Executor read() {
        return this.IconCompatParcelizer;
    }

    @Override // kotlin.getPlatform
    public final void RemoteActionCompatParcelizer(CurrentQuery currentQuery, Runnable runnable) {
        try {
            read().execute(runnable);
        } catch (RejectedExecutionException e) {
            write(currentQuery, e);
            setMbbsVerificationYear.write().RemoteActionCompatParcelizer(currentQuery, runnable);
        }
    }

    @Override // kotlin.getCurrentYear
    public final void write(long j, setStateRank<? super getShowPopup> setstaterank) {
        Executor executor = read();
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        ScheduledFuture<?> scheduledFuture = scheduledExecutorService != null ? read(scheduledExecutorService, new setYearUpdateRequired(this, setstaterank), setstaterank.getWrite(), j) : null;
        if (scheduledFuture != null) {
            setStatePercentile.AudioAttributesCompatParcelizer(setstaterank, new setSkipped(scheduledFuture));
        } else {
            getWhichCollegeDataIsNotPresent.IconCompatParcelizer.write(j, setstaterank);
        }
    }

    @Override // kotlin.getCurrentYear
    public final setYearOfPassout read(long j, Runnable runnable, CurrentQuery currentQuery) {
        Executor executor = read();
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        ScheduledFuture<?> scheduledFuture = scheduledExecutorService != null ? read(scheduledExecutorService, runnable, currentQuery, j) : null;
        if (scheduledFuture != null) {
            return new setYearOfAdmission(scheduledFuture);
        }
        return getWhichCollegeDataIsNotPresent.IconCompatParcelizer.read(j, runnable, currentQuery);
    }

    private static ScheduledFuture<?> read(ScheduledExecutorService scheduledExecutorService, Runnable runnable, CurrentQuery currentQuery, long j) {
        try {
            return scheduledExecutorService.schedule(runnable, j, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e) {
            write(currentQuery, e);
            return null;
        }
    }

    private static void write(CurrentQuery currentQuery, RejectedExecutionException rejectedExecutionException) {
        getUserConfig.AudioAttributesCompatParcelizer(currentQuery, getJSONArray.AudioAttributesCompatParcelizer("The task was rejected", rejectedExecutionException));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Executor executor = read();
        ExecutorService executorService = executor instanceof ExecutorService ? (ExecutorService) executor : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    @Override // kotlin.getPlatform
    public final String toString() {
        return read().toString();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof toDegrees) && ((toDegrees) obj).read() == read();
    }

    public final int hashCode() {
        return System.identityHashCode(read());
    }
}
