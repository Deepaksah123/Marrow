package kotlin;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class getQuestion<T> extends AtomicReference<MarkIncompleteResponseBody> implements MarkCompleteResponseBody<T>, MarkIncompleteResponseBody {
    private getTimelineId<? super T> RemoteActionCompatParcelizer;
    private getTimelineId<? super Throwable> write;

    public getQuestion(getTimelineId<? super T> gettimelineid, getTimelineId<? super Throwable> gettimelineid2) {
        this.RemoteActionCompatParcelizer = gettimelineid;
        this.write = gettimelineid2;
    }

    @Override // kotlin.MarkCompleteResponseBody
    public final void IconCompatParcelizer(Throwable th) {
        lazySet(getSubjectId.DISPOSED);
        try {
            this.write.RemoteActionCompatParcelizer(th);
        } catch (Throwable th2) {
            getEndTimeMs.RemoteActionCompatParcelizer(th2);
            getPaymentRefIds.RemoteActionCompatParcelizer(new getPytIds(th, th2));
        }
    }

    @Override // kotlin.MarkCompleteResponseBody
    public final void IconCompatParcelizer(MarkIncompleteResponseBody markIncompleteResponseBody) {
        getSubjectId.AudioAttributesCompatParcelizer(this, markIncompleteResponseBody);
    }

    @Override // kotlin.MarkCompleteResponseBody
    public final void AudioAttributesCompatParcelizer(T t) {
        lazySet(getSubjectId.DISPOSED);
        try {
            this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(t);
        } catch (Throwable th) {
            getEndTimeMs.RemoteActionCompatParcelizer(th);
            getPaymentRefIds.RemoteActionCompatParcelizer(th);
        }
    }

    @Override // kotlin.MarkIncompleteResponseBody
    public final void aL_() {
        getSubjectId.RemoteActionCompatParcelizer(this);
    }

    @Override // kotlin.MarkIncompleteResponseBody
    public final boolean write() {
        return get() == getSubjectId.DISPOSED;
    }
}
