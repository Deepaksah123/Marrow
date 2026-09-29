package kotlin;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class setApplied<T> extends AtomicReference<SchemaLessonStatus> implements findFirstAndLastInteractiveTime<T>, SchemaLessonStatus, MarkIncompleteResponseBody {
    private getTimelineId<? super Throwable> AudioAttributesCompatParcelizer;
    private isTagActive RemoteActionCompatParcelizer;
    private getTimelineId<? super T> read;
    private getTimelineId<? super SchemaLessonStatus> write;

    public setApplied(getTimelineId<? super T> gettimelineid, getTimelineId<? super Throwable> gettimelineid2, isTagActive istagactive, getTimelineId<? super SchemaLessonStatus> gettimelineid3) {
        this.read = gettimelineid;
        this.AudioAttributesCompatParcelizer = gettimelineid2;
        this.RemoteActionCompatParcelizer = istagactive;
        this.write = gettimelineid3;
    }

    @Override // kotlin.findFirstAndLastInteractiveTime, kotlin.SchemaUserStatusRSModel
    public final void AudioAttributesCompatParcelizer(SchemaLessonStatus schemaLessonStatus) {
        if (getCreatedOn.write(this, schemaLessonStatus)) {
            try {
                this.write.RemoteActionCompatParcelizer(this);
            } catch (Throwable th) {
                getEndTimeMs.RemoteActionCompatParcelizer(th);
                schemaLessonStatus.AudioAttributesCompatParcelizer();
                AudioAttributesCompatParcelizer(th);
            }
        }
    }

    @Override // kotlin.SchemaUserStatusRSModel
    public final void a_(T t) {
        if (write()) {
            return;
        }
        try {
            this.read.RemoteActionCompatParcelizer(t);
        } catch (Throwable th) {
            getEndTimeMs.RemoteActionCompatParcelizer(th);
            get().AudioAttributesCompatParcelizer();
            AudioAttributesCompatParcelizer(th);
        }
    }

    @Override // kotlin.SchemaUserStatusRSModel
    public final void AudioAttributesCompatParcelizer(Throwable th) {
        if (get() != getCreatedOn.CANCELLED) {
            lazySet(getCreatedOn.CANCELLED);
            try {
                this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(th);
                return;
            } catch (Throwable th2) {
                getEndTimeMs.RemoteActionCompatParcelizer(th2);
                getPaymentRefIds.RemoteActionCompatParcelizer(new getPytIds(th, th2));
                return;
            }
        }
        getPaymentRefIds.RemoteActionCompatParcelizer(th);
    }

    @Override // kotlin.SchemaUserStatusRSModel
    public final void aJ_() {
        if (get() != getCreatedOn.CANCELLED) {
            lazySet(getCreatedOn.CANCELLED);
            try {
                this.RemoteActionCompatParcelizer.write();
            } catch (Throwable th) {
                getEndTimeMs.RemoteActionCompatParcelizer(th);
                getPaymentRefIds.RemoteActionCompatParcelizer(th);
            }
        }
    }

    @Override // kotlin.MarkIncompleteResponseBody
    public final void aL_() {
        AudioAttributesCompatParcelizer();
    }

    @Override // kotlin.MarkIncompleteResponseBody
    public final boolean write() {
        return get() == getCreatedOn.CANCELLED;
    }

    @Override // kotlin.SchemaLessonStatus
    public final void write(long j) {
        get().write(j);
    }

    @Override // kotlin.SchemaLessonStatus
    public final void AudioAttributesCompatParcelizer() {
        getCreatedOn.AudioAttributesCompatParcelizer(this);
    }
}
