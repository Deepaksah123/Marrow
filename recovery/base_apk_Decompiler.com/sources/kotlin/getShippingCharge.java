package kotlin;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class getShippingCharge<T> extends AtomicReference<MarkIncompleteResponseBody> implements InteractiveVideoElementUiModelKt<T>, MarkIncompleteResponseBody {
    private getTimelineId<? super T> AudioAttributesCompatParcelizer;
    private getTimelineId<? super Throwable> RemoteActionCompatParcelizer;
    private isTagActive write;

    public getShippingCharge(getTimelineId<? super T> gettimelineid, getTimelineId<? super Throwable> gettimelineid2, isTagActive istagactive) {
        this.AudioAttributesCompatParcelizer = gettimelineid;
        this.RemoteActionCompatParcelizer = gettimelineid2;
        this.write = istagactive;
    }

    @Override // kotlin.MarkIncompleteResponseBody
    public final void aL_() {
        getSubjectId.RemoteActionCompatParcelizer(this);
    }

    @Override // kotlin.MarkIncompleteResponseBody
    public final boolean write() {
        return getSubjectId.AudioAttributesCompatParcelizer(get());
    }

    @Override // kotlin.InteractiveVideoElementUiModelKt
    public final void IconCompatParcelizer(MarkIncompleteResponseBody markIncompleteResponseBody) {
        getSubjectId.AudioAttributesCompatParcelizer(this, markIncompleteResponseBody);
    }

    @Override // kotlin.InteractiveVideoElementUiModelKt
    public final void AudioAttributesCompatParcelizer(T t) {
        lazySet(getSubjectId.DISPOSED);
        try {
            this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(t);
        } catch (Throwable th) {
            getEndTimeMs.RemoteActionCompatParcelizer(th);
            getPaymentRefIds.RemoteActionCompatParcelizer(th);
        }
    }

    @Override // kotlin.InteractiveVideoElementUiModelKt
    public final void IconCompatParcelizer(Throwable th) {
        lazySet(getSubjectId.DISPOSED);
        try {
            this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(th);
        } catch (Throwable th2) {
            getEndTimeMs.RemoteActionCompatParcelizer(th2);
            getPaymentRefIds.RemoteActionCompatParcelizer(new getPytIds(th, th2));
        }
    }

    @Override // kotlin.InteractiveVideoElementUiModelKt
    public final void aK_() {
        lazySet(getSubjectId.DISPOSED);
        try {
            this.write.write();
        } catch (Throwable th) {
            getEndTimeMs.RemoteActionCompatParcelizer(th);
            getPaymentRefIds.RemoteActionCompatParcelizer(th);
        }
    }
}
