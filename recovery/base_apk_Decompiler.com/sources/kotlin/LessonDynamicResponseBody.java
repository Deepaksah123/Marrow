package kotlin;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public abstract class LessonDynamicResponseBody<T> implements setRootSubjectId<T> {
    protected abstract void IconCompatParcelizer(MarkCompleteResponseBody<? super T> markCompleteResponseBody);

    public static <T> LessonDynamicResponseBody<T> read(LessonResetResponseBody<T> lessonResetResponseBody) {
        setHasPyt.AudioAttributesCompatParcelizer(lessonResetResponseBody, "source is null");
        return getPaymentRefIds.write(new getEnvironment(lessonResetResponseBody));
    }

    public static <T> LessonDynamicResponseBody<T> AudioAttributesCompatParcelizer(Callable<? extends T> callable) {
        setHasPyt.AudioAttributesCompatParcelizer(callable, "callable is null");
        return getPaymentRefIds.write(new PayloadKt(callable));
    }

    public static <T> LessonDynamicResponseBody<T> RemoteActionCompatParcelizer(T t) {
        setHasPyt.AudioAttributesCompatParcelizer(t, "value is null");
        return getPaymentRefIds.write(new getReturnUrl(t));
    }

    public static <T1, T2, R> LessonDynamicResponseBody<R> write(setRootSubjectId<? extends T1> setrootsubjectid, setRootSubjectId<? extends T2> setrootsubjectid2, VideoBookmarkTimelineCompanion<? super T1, ? super T2, ? extends R> videoBookmarkTimelineCompanion) {
        setHasPyt.AudioAttributesCompatParcelizer(setrootsubjectid, "source1 is null");
        setHasPyt.AudioAttributesCompatParcelizer(setrootsubjectid2, "source2 is null");
        return AudioAttributesCompatParcelizer(toVideoBookmarkTimeline.RemoteActionCompatParcelizer(videoBookmarkTimelineCompanion), setrootsubjectid, setrootsubjectid2);
    }

    private static <T, R> LessonDynamicResponseBody<R> AudioAttributesCompatParcelizer(getSubjectTitle<? super Object[], ? extends R> getsubjecttitle, setRootSubjectId<? extends T>... setrootsubjectidArr) {
        setHasPyt.AudioAttributesCompatParcelizer(getsubjecttitle, "zipper is null");
        setHasPyt.AudioAttributesCompatParcelizer(setrootsubjectidArr, "sources is null");
        int length = setrootsubjectidArr.length;
        return getPaymentRefIds.write(new getPaymentRefId(setrootsubjectidArr, getsubjecttitle));
    }

    public final <R> LessonDynamicResponseBody<R> RemoteActionCompatParcelizer(getSubjectTitle<? super T, ? extends setRootSubjectId<? extends R>> getsubjecttitle) {
        setHasPyt.AudioAttributesCompatParcelizer(getsubjecttitle, "mapper is null");
        return getPaymentRefIds.write(new PaymentLinks(this, getsubjecttitle));
    }

    public final T AudioAttributesCompatParcelizer() {
        getSequenceId getsequenceid = new getSequenceId();
        read(getsequenceid);
        return (T) getsequenceid.IconCompatParcelizer();
    }

    public final <R> LessonDynamicResponseBody<R> read(getSubjectTitle<? super T, ? extends R> getsubjecttitle) {
        setHasPyt.AudioAttributesCompatParcelizer(getsubjecttitle, "mapper is null");
        return getPaymentRefIds.write(new PaymentStatusResponse(this, getsubjecttitle));
    }

    public final LessonDynamicResponseBody<T> AudioAttributesCompatParcelizer(getIds getids) {
        setHasPyt.AudioAttributesCompatParcelizer(getids, "scheduler is null");
        return getPaymentRefIds.write(new getSubscriptionList(this, getids));
    }

    public final LessonDynamicResponseBody<T> write(getSubjectTitle<Throwable, ? extends T> getsubjecttitle) {
        setHasPyt.AudioAttributesCompatParcelizer(getsubjecttitle, "resumeFunction is null");
        return getPaymentRefIds.write(new getWeb(this, getsubjecttitle, null));
    }

    public final LessonDynamicResponseBody<T> AudioAttributesCompatParcelizer(T t) {
        setHasPyt.AudioAttributesCompatParcelizer(t, "value is null");
        return getPaymentRefIds.write(new getWeb(this, null, t));
    }

    public final MarkIncompleteResponseBody read() {
        return RemoteActionCompatParcelizer(toVideoBookmarkTimeline.IconCompatParcelizer(), toVideoBookmarkTimeline.AudioAttributesCompatParcelizer);
    }

    public final MarkIncompleteResponseBody RemoteActionCompatParcelizer(getTimelineId<? super T> gettimelineid, getTimelineId<? super Throwable> gettimelineid2) {
        setHasPyt.AudioAttributesCompatParcelizer(gettimelineid, "onSuccess is null");
        setHasPyt.AudioAttributesCompatParcelizer(gettimelineid2, "onError is null");
        getQuestion getquestion = new getQuestion(gettimelineid, gettimelineid2);
        read(getquestion);
        return getquestion;
    }

    @Override // kotlin.setRootSubjectId
    public final void read(MarkCompleteResponseBody<? super T> markCompleteResponseBody) {
        setHasPyt.AudioAttributesCompatParcelizer(markCompleteResponseBody, "subscriber is null");
        MarkCompleteResponseBody<? super T> markCompleteResponseBodyIconCompatParcelizer = getPaymentRefIds.IconCompatParcelizer(markCompleteResponseBody);
        setHasPyt.AudioAttributesCompatParcelizer(markCompleteResponseBodyIconCompatParcelizer, "subscriber returned by the RxJavaPlugins hook is null");
        try {
            IconCompatParcelizer(markCompleteResponseBodyIconCompatParcelizer);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            getEndTimeMs.RemoteActionCompatParcelizer(th);
            NullPointerException nullPointerException = new NullPointerException("subscribeActual failed");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    public final LessonDynamicResponseBody<T> write(getIds getids) {
        setHasPyt.AudioAttributesCompatParcelizer(getids, "scheduler is null");
        return getPaymentRefIds.write(new getExpiry(this, getids));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final getEmptyState<T> IconCompatParcelizer() {
        if (this instanceof getEditionId) {
            return ((getEditionId) this).read();
        }
        return getPaymentRefIds.AudioAttributesCompatParcelizer(new getCgst(this));
    }
}
