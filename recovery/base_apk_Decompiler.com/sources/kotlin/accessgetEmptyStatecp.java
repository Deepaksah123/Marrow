package kotlin;

import java.util.NoSuchElementException;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import kotlin.getCutOffTime;

/* JADX INFO: loaded from: classes.dex */
public abstract class accessgetEmptyStatecp<T> implements SchemaCompletionStatusRSModel<T> {
    static final int BUFFER_SIZE = Math.max(1, Integer.getInteger("rx2.buffer-size", 128).intValue());

    protected abstract void read(SchemaUserStatusRSModel<? super T> schemaUserStatusRSModel);

    public static int AudioAttributesCompatParcelizer() {
        return BUFFER_SIZE;
    }

    private static <T, R> accessgetEmptyStatecp<R> read(getSubjectTitle<? super Object[], ? extends R> getsubjecttitle, SchemaCompletionStatusRSModel<? extends T>... schemaCompletionStatusRSModelArr) {
        return IconCompatParcelizer(schemaCompletionStatusRSModelArr, getsubjecttitle, AudioAttributesCompatParcelizer());
    }

    private static <T, R> accessgetEmptyStatecp<R> IconCompatParcelizer(SchemaCompletionStatusRSModel<? extends T>[] schemaCompletionStatusRSModelArr, getSubjectTitle<? super Object[], ? extends R> getsubjecttitle, int i) {
        setHasPyt.AudioAttributesCompatParcelizer(schemaCompletionStatusRSModelArr, "sources is null");
        if (schemaCompletionStatusRSModelArr.length == 0) {
            return AudioAttributesImplApi21Parcelizer();
        }
        setHasPyt.AudioAttributesCompatParcelizer(getsubjecttitle, "combiner is null");
        setHasPyt.read(i, "bufferSize");
        return getPaymentRefIds.read(new getSortOrder(schemaCompletionStatusRSModelArr, getsubjecttitle, i));
    }

    public static <T1, T2, R> accessgetEmptyStatecp<R> RemoteActionCompatParcelizer(SchemaCompletionStatusRSModel<? extends T1> schemaCompletionStatusRSModel, SchemaCompletionStatusRSModel<? extends T2> schemaCompletionStatusRSModel2, VideoBookmarkTimelineCompanion<? super T1, ? super T2, ? extends R> videoBookmarkTimelineCompanion) {
        setHasPyt.AudioAttributesCompatParcelizer(schemaCompletionStatusRSModel, "source1 is null");
        setHasPyt.AudioAttributesCompatParcelizer(schemaCompletionStatusRSModel2, "source2 is null");
        return read(toVideoBookmarkTimeline.RemoteActionCompatParcelizer(videoBookmarkTimelineCompanion), schemaCompletionStatusRSModel, schemaCompletionStatusRSModel2);
    }

    public static <T> accessgetEmptyStatecp<T> read(getAttemptedOption<T> getattemptedoption, InteractiveVideoElementRSModel interactiveVideoElementRSModel) {
        setHasPyt.AudioAttributesCompatParcelizer(getattemptedoption, "source is null");
        setHasPyt.AudioAttributesCompatParcelizer(interactiveVideoElementRSModel, "mode is null");
        return getPaymentRefIds.read(new McqResponseBody(getattemptedoption, interactiveVideoElementRSModel));
    }

    public static <T> accessgetEmptyStatecp<T> IconCompatParcelizer(Callable<? extends SchemaCompletionStatusRSModel<? extends T>> callable) {
        setHasPyt.AudioAttributesCompatParcelizer(callable, "supplier is null");
        return getPaymentRefIds.read(new getPearls(callable));
    }

    private static <T> accessgetEmptyStatecp<T> AudioAttributesImplApi21Parcelizer() {
        return getPaymentRefIds.read(setSortOrder.IconCompatParcelizer);
    }

    public static <T> accessgetEmptyStatecp<T> read(T t) {
        setHasPyt.AudioAttributesCompatParcelizer(t, "item is null");
        return getPaymentRefIds.read((accessgetEmptyStatecp) new getQuestionCount(t));
    }

    public static accessgetEmptyStatecp<Long> write(long j, TimeUnit timeUnit, getIds getids) {
        setHasPyt.AudioAttributesCompatParcelizer(timeUnit, "unit is null");
        setHasPyt.AudioAttributesCompatParcelizer(getids, "scheduler is null");
        return getPaymentRefIds.read(new getOfferPrice(Math.max(0L, j), timeUnit, getids));
    }

    public final T write() {
        setExtensionDays setextensiondays = new setExtensionDays();
        RemoteActionCompatParcelizer(setextensiondays);
        T tRemoteActionCompatParcelizer = setextensiondays.RemoteActionCompatParcelizer();
        if (tRemoteActionCompatParcelizer != null) {
            return tRemoteActionCompatParcelizer;
        }
        throw new NoSuchElementException();
    }

    private LessonDynamicResponseBody<T> AudioAttributesImplBaseParcelizer() {
        return getPaymentRefIds.write(new setPearlIds(this, 0L));
    }

    public final LessonDynamicResponseBody<T> read() {
        return AudioAttributesImplBaseParcelizer();
    }

    public final <R> accessgetEmptyStatecp<R> write(getSubjectTitle<? super T, ? extends SchemaCompletionStatusRSModel<? extends R>> getsubjecttitle) {
        return AudioAttributesCompatParcelizer(getsubjecttitle, AudioAttributesCompatParcelizer(), AudioAttributesCompatParcelizer());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <R> accessgetEmptyStatecp<R> AudioAttributesCompatParcelizer(getSubjectTitle<? super T, ? extends SchemaCompletionStatusRSModel<? extends R>> getsubjecttitle, int i, int i2) {
        setHasPyt.AudioAttributesCompatParcelizer(getsubjecttitle, "mapper is null");
        setHasPyt.read(i, "maxConcurrency");
        setHasPyt.read(i2, "bufferSize");
        if (this instanceof InteractiveVideoElementTransformerKt) {
            Object objCall = ((InteractiveVideoElementTransformerKt) this).call();
            if (objCall == null) {
                return AudioAttributesImplApi21Parcelizer();
            }
            return getPrice.IconCompatParcelizer(objCall, getsubjecttitle);
        }
        return getPaymentRefIds.read(new setSequenceId(this, getsubjecttitle, false, i, i2));
    }

    public final <R> accessgetEmptyStatecp<R> RemoteActionCompatParcelizer(getSubjectTitle<? super T, ? extends R> getsubjecttitle) {
        setHasPyt.AudioAttributesCompatParcelizer(getsubjecttitle, "mapper is null");
        return getPaymentRefIds.read(new getGroupMcqId(this, getsubjecttitle));
    }

    public final accessgetEmptyStatecp<T> AudioAttributesCompatParcelizer(getIds getids) {
        return IconCompatParcelizer(getids, AudioAttributesCompatParcelizer());
    }

    private accessgetEmptyStatecp<T> IconCompatParcelizer(getIds getids, int i) {
        setHasPyt.AudioAttributesCompatParcelizer(getids, "scheduler is null");
        setHasPyt.read(i, "bufferSize");
        return getPaymentRefIds.read(new getSectionTimeInSec(this, getids, false, i));
    }

    public final accessgetEmptyStatecp<T> IconCompatParcelizer() {
        return AudioAttributesCompatParcelizer(AudioAttributesCompatParcelizer());
    }

    private accessgetEmptyStatecp<T> AudioAttributesCompatParcelizer(int i) {
        setHasPyt.read(i, "bufferSize");
        return getPaymentRefIds.read(new getPlanDetails(this, i, true, false, toVideoBookmarkTimeline.IconCompatParcelizer));
    }

    public final accessgetEmptyStatecp<T> RemoteActionCompatParcelizer() {
        return getPaymentRefIds.read(new PlanDetails(this));
    }

    public final accessgetEmptyStatecp<T> MediaBrowserCompatItemReceiver() {
        return getPaymentRefIds.read(new NotesPurchasePlanDetailsResponse(this));
    }

    public final accessgetEmptyStatecp<T> read(getSubjectTitle<? super Throwable, ? extends T> getsubjecttitle) {
        setHasPyt.AudioAttributesCompatParcelizer(getsubjecttitle, "valueSupplier is null");
        return getPaymentRefIds.read(new getHasAlreadyPurchased(this, getsubjecttitle));
    }

    public final MarkIncompleteResponseBody RemoteActionCompatParcelizer(getTimelineId<? super T> gettimelineid) {
        return read(gettimelineid, toVideoBookmarkTimeline.AudioAttributesCompatParcelizer, toVideoBookmarkTimeline.IconCompatParcelizer, getCutOffTime.write.INSTANCE);
    }

    public final MarkIncompleteResponseBody IconCompatParcelizer(getTimelineId<? super T> gettimelineid, getTimelineId<? super Throwable> gettimelineid2) {
        return read(gettimelineid, gettimelineid2, toVideoBookmarkTimeline.IconCompatParcelizer, getCutOffTime.write.INSTANCE);
    }

    public final MarkIncompleteResponseBody AudioAttributesCompatParcelizer(getTimelineId<? super T> gettimelineid, getTimelineId<? super Throwable> gettimelineid2, isTagActive istagactive) {
        return read(gettimelineid, gettimelineid2, istagactive, getCutOffTime.write.INSTANCE);
    }

    private MarkIncompleteResponseBody read(getTimelineId<? super T> gettimelineid, getTimelineId<? super Throwable> gettimelineid2, isTagActive istagactive, getTimelineId<? super SchemaLessonStatus> gettimelineid3) {
        setHasPyt.AudioAttributesCompatParcelizer(gettimelineid, "onNext is null");
        setHasPyt.AudioAttributesCompatParcelizer(gettimelineid2, "onError is null");
        setHasPyt.AudioAttributesCompatParcelizer(istagactive, "onComplete is null");
        setHasPyt.AudioAttributesCompatParcelizer(gettimelineid3, "onSubscribe is null");
        setApplied setapplied = new setApplied(gettimelineid, gettimelineid2, istagactive, gettimelineid3);
        RemoteActionCompatParcelizer(setapplied);
        return setapplied;
    }

    @Override // kotlin.SchemaCompletionStatusRSModel
    public final void write(SchemaUserStatusRSModel<? super T> schemaUserStatusRSModel) {
        if (schemaUserStatusRSModel instanceof findFirstAndLastInteractiveTime) {
            RemoteActionCompatParcelizer((findFirstAndLastInteractiveTime) schemaUserStatusRSModel);
        } else {
            setHasPyt.AudioAttributesCompatParcelizer(schemaUserStatusRSModel, "s is null");
            RemoteActionCompatParcelizer(new isApplied(schemaUserStatusRSModel));
        }
    }

    public final void RemoteActionCompatParcelizer(findFirstAndLastInteractiveTime<? super T> findfirstandlastinteractivetime) {
        setHasPyt.AudioAttributesCompatParcelizer(findfirstandlastinteractivetime, "s is null");
        try {
            SchemaUserStatusRSModel<? super T> schemaUserStatusRSModelRemoteActionCompatParcelizer = getPaymentRefIds.RemoteActionCompatParcelizer(findfirstandlastinteractivetime);
            setHasPyt.AudioAttributesCompatParcelizer(schemaUserStatusRSModelRemoteActionCompatParcelizer, "Plugin returned null Subscriber");
            read((SchemaUserStatusRSModel) schemaUserStatusRSModelRemoteActionCompatParcelizer);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            getEndTimeMs.RemoteActionCompatParcelizer(th);
            getPaymentRefIds.RemoteActionCompatParcelizer(th);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    public final accessgetEmptyStatecp<T> RemoteActionCompatParcelizer(getIds getids) {
        setHasPyt.AudioAttributesCompatParcelizer(getids, "scheduler is null");
        return AudioAttributesCompatParcelizer(getids, !(this instanceof McqResponseBody));
    }

    private accessgetEmptyStatecp<T> AudioAttributesCompatParcelizer(getIds getids, boolean z) {
        setHasPyt.AudioAttributesCompatParcelizer(getids, "scheduler is null");
        return getPaymentRefIds.read(new getDiscount(this, getids, z));
    }
}
