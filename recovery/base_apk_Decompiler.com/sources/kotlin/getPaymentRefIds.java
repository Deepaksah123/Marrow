package kotlin;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class getPaymentRefIds {
    private static volatile boolean read;

    public static <T> getEmptyState<T> AudioAttributesCompatParcelizer(getEmptyState<T> getemptystate) {
        return getemptystate;
    }

    public static <T> MarkCompleteResponseBody<? super T> IconCompatParcelizer(MarkCompleteResponseBody<? super T> markCompleteResponseBody) {
        return markCompleteResponseBody;
    }

    public static <T> SchemaUserStatusRSModel<? super T> RemoteActionCompatParcelizer(SchemaUserStatusRSModel<? super T> schemaUserStatusRSModel) {
        return schemaUserStatusRSModel;
    }

    public static getIds RemoteActionCompatParcelizer(getIds getids) {
        return getids;
    }

    public static <T> InteractiveVideoElementUiModelKt<? super T> read(InteractiveVideoElementUiModelKt<? super T> interactiveVideoElementUiModelKt) {
        return interactiveVideoElementUiModelKt;
    }

    public static <T> LessonIndexResponseBody<T> read(LessonIndexResponseBody<T> lessonIndexResponseBody) {
        return lessonIndexResponseBody;
    }

    public static <T> accessgetEmptyStatecp<T> read(accessgetEmptyStatecp<T> accessgetemptystatecp) {
        return accessgetemptystatecp;
    }

    public static getAllOptions read(getAllOptions getalloptions) {
        return getalloptions;
    }

    public static <T> getUpdates<? super T> read(getUpdates<? super T> getupdates) {
        return getupdates;
    }

    public static <T> LessonDynamicResponseBody<T> write(LessonDynamicResponseBody<T> lessonDynamicResponseBody) {
        return lessonDynamicResponseBody;
    }

    public static getIds write(getIds getids) {
        return getids;
    }

    public static boolean read() {
        return read;
    }

    public static getIds IconCompatParcelizer(Callable<getIds> callable) {
        setHasPyt.AudioAttributesCompatParcelizer(callable, "Scheduler Callable can't be null");
        return read(callable);
    }

    public static getIds AudioAttributesCompatParcelizer(Callable<getIds> callable) {
        setHasPyt.AudioAttributesCompatParcelizer(callable, "Scheduler Callable can't be null");
        return read(callable);
    }

    public static getIds RemoteActionCompatParcelizer(Callable<getIds> callable) {
        setHasPyt.AudioAttributesCompatParcelizer(callable, "Scheduler Callable can't be null");
        return read(callable);
    }

    public static getIds write(Callable<getIds> callable) {
        setHasPyt.AudioAttributesCompatParcelizer(callable, "Scheduler Callable can't be null");
        return read(callable);
    }

    public static void RemoteActionCompatParcelizer(Throwable th) {
        if (th == null) {
            th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        } else if (!AudioAttributesCompatParcelizer(th)) {
            th = new getTagLabel(th);
        }
        th.printStackTrace();
        write(th);
    }

    private static boolean AudioAttributesCompatParcelizer(Throwable th) {
        return (th instanceof VideoBookmarkTimelineModel) || (th instanceof getLastUpdated) || (th instanceof IllegalStateException) || (th instanceof NullPointerException) || (th instanceof IllegalArgumentException) || (th instanceof getPytIds);
    }

    private static void write(Throwable th) {
        Thread threadCurrentThread = Thread.currentThread();
        threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th);
    }

    public static Runnable RemoteActionCompatParcelizer(Runnable runnable) {
        setHasPyt.AudioAttributesCompatParcelizer(runnable, "run is null");
        return runnable;
    }

    private static getIds read(Callable<getIds> callable) {
        try {
            return (getIds) setHasPyt.AudioAttributesCompatParcelizer(callable.call(), "Scheduler Callable result can't be null");
        } catch (Throwable th) {
            throw OrderDetails.RemoteActionCompatParcelizer(th);
        }
    }
}
