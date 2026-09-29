package kotlin;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes5.dex */
public final class McqFaqResponseBody<T> extends AtomicReference<MarkIncompleteResponseBody> implements getUpdates<T>, MarkIncompleteResponseBody {
    private getTimelineId<? super T> IconCompatParcelizer;
    private isTagActive RemoteActionCompatParcelizer;
    private getTimelineId<? super MarkIncompleteResponseBody> read;
    private getTimelineId<? super Throwable> write;

    public McqFaqResponseBody(getTimelineId<? super T> gettimelineid, getTimelineId<? super Throwable> gettimelineid2, isTagActive istagactive, getTimelineId<? super MarkIncompleteResponseBody> gettimelineid3) {
        this.IconCompatParcelizer = gettimelineid;
        this.write = gettimelineid2;
        this.RemoteActionCompatParcelizer = istagactive;
        this.read = gettimelineid3;
    }

    @Override // kotlin.getUpdates
    public final void AudioAttributesCompatParcelizer(MarkIncompleteResponseBody markIncompleteResponseBody) {
        if (getSubjectId.AudioAttributesCompatParcelizer(this, markIncompleteResponseBody)) {
            try {
                this.read.RemoteActionCompatParcelizer(this);
            } catch (Throwable th) {
                getEndTimeMs.RemoteActionCompatParcelizer(th);
                markIncompleteResponseBody.aL_();
                IconCompatParcelizer(th);
            }
        }
    }

    @Override // kotlin.getUpdates
    public final void read(T t) {
        if (write()) {
            return;
        }
        try {
            this.IconCompatParcelizer.RemoteActionCompatParcelizer(t);
        } catch (Throwable th) {
            getEndTimeMs.RemoteActionCompatParcelizer(th);
            get().aL_();
            IconCompatParcelizer(th);
        }
    }

    @Override // kotlin.getUpdates
    public final void IconCompatParcelizer(Throwable th) {
        if (!write()) {
            lazySet(getSubjectId.DISPOSED);
            try {
                this.write.RemoteActionCompatParcelizer(th);
                return;
            } catch (Throwable th2) {
                getEndTimeMs.RemoteActionCompatParcelizer(th2);
                getPaymentRefIds.RemoteActionCompatParcelizer(new getPytIds(th, th2));
                return;
            }
        }
        getPaymentRefIds.RemoteActionCompatParcelizer(th);
    }

    @Override // kotlin.getUpdates
    public final void aI_() {
        if (write()) {
            return;
        }
        lazySet(getSubjectId.DISPOSED);
        try {
            this.RemoteActionCompatParcelizer.write();
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
