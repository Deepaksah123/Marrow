package kotlin;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public abstract class getEmptyState<T> implements InteractiveVideoElementUiModelCompanion<T> {
    protected abstract void RemoteActionCompatParcelizer(InteractiveVideoElementUiModelKt<? super T> interactiveVideoElementUiModelKt);

    public static <T> getEmptyState<T> IconCompatParcelizer(Callable<? extends T> callable) {
        setHasPyt.AudioAttributesCompatParcelizer(callable, "callable is null");
        return getPaymentRefIds.AudioAttributesCompatParcelizer((getEmptyState) new getSgst(callable));
    }

    public final getEmptyState<T> IconCompatParcelizer(getHasPyt<? super T> gethaspyt) {
        setHasPyt.AudioAttributesCompatParcelizer(gethaspyt, "predicate is null");
        return getPaymentRefIds.AudioAttributesCompatParcelizer(new Taxes(this, gethaspyt));
    }

    public final <R> getEmptyState<R> RemoteActionCompatParcelizer(getSubjectTitle<? super T, ? extends InteractiveVideoElementUiModelCompanion<? extends R>> getsubjecttitle) {
        setHasPyt.AudioAttributesCompatParcelizer(getsubjecttitle, "mapper is null");
        return getPaymentRefIds.AudioAttributesCompatParcelizer(new getSubscriptionPeriod(this, getsubjecttitle));
    }

    public final <R> getEmptyState<R> write(getSubjectTitle<? super T, ? extends R> getsubjecttitle) {
        setHasPyt.AudioAttributesCompatParcelizer(getsubjecttitle, "mapper is null");
        return getPaymentRefIds.AudioAttributesCompatParcelizer(new getTaxes(this, getsubjecttitle));
    }

    public final getEmptyState<T> read(getIds getids) {
        setHasPyt.AudioAttributesCompatParcelizer(getids, "scheduler is null");
        return getPaymentRefIds.AudioAttributesCompatParcelizer(new getOrderId(this, getids));
    }

    public final LessonDynamicResponseBody<T> RemoteActionCompatParcelizer() {
        return getPaymentRefIds.write(new getGateway(this));
    }

    public final MarkIncompleteResponseBody AudioAttributesCompatParcelizer(getTimelineId<? super T> gettimelineid, getTimelineId<? super Throwable> gettimelineid2) {
        return write(gettimelineid, gettimelineid2, toVideoBookmarkTimeline.IconCompatParcelizer);
    }

    private MarkIncompleteResponseBody write(getTimelineId<? super T> gettimelineid, getTimelineId<? super Throwable> gettimelineid2, isTagActive istagactive) {
        setHasPyt.AudioAttributesCompatParcelizer(gettimelineid, "onSuccess is null");
        setHasPyt.AudioAttributesCompatParcelizer(gettimelineid2, "onError is null");
        setHasPyt.AudioAttributesCompatParcelizer(istagactive, "onComplete is null");
        return (MarkIncompleteResponseBody) AudioAttributesCompatParcelizer(new getShippingCharge(gettimelineid, gettimelineid2, istagactive));
    }

    @Override // kotlin.InteractiveVideoElementUiModelCompanion
    public final void write(InteractiveVideoElementUiModelKt<? super T> interactiveVideoElementUiModelKt) {
        setHasPyt.AudioAttributesCompatParcelizer(interactiveVideoElementUiModelKt, "observer is null");
        InteractiveVideoElementUiModelKt<? super T> interactiveVideoElementUiModelKt2 = getPaymentRefIds.read(interactiveVideoElementUiModelKt);
        setHasPyt.AudioAttributesCompatParcelizer(interactiveVideoElementUiModelKt2, "observer returned by the RxJavaPlugins hook is null");
        try {
            RemoteActionCompatParcelizer(interactiveVideoElementUiModelKt2);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            getEndTimeMs.RemoteActionCompatParcelizer(th);
            NullPointerException nullPointerException = new NullPointerException("subscribeActual failed");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    public final getEmptyState<T> IconCompatParcelizer(getIds getids) {
        setHasPyt.AudioAttributesCompatParcelizer(getids, "scheduler is null");
        return getPaymentRefIds.AudioAttributesCompatParcelizer(new getPaymentLinks(this, getids));
    }

    private <E extends InteractiveVideoElementUiModelKt<? super T>> E AudioAttributesCompatParcelizer(E e) {
        write(e);
        return e;
    }

    public final getEmptyState<T> IconCompatParcelizer(InteractiveVideoElementUiModelCompanion<? extends T> interactiveVideoElementUiModelCompanion) {
        setHasPyt.AudioAttributesCompatParcelizer(interactiveVideoElementUiModelCompanion, "other is null");
        return getPaymentRefIds.AudioAttributesCompatParcelizer(new CreateOrderResponse(this, interactiveVideoElementUiModelCompanion));
    }
}
