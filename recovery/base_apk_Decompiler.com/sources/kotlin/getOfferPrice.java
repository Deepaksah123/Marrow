package kotlin;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class getOfferPrice extends accessgetEmptyStatecp<Long> {
    private TimeUnit AudioAttributesCompatParcelizer;
    private long RemoteActionCompatParcelizer;
    private getIds write;

    public getOfferPrice(long j, TimeUnit timeUnit, getIds getids) {
        this.RemoteActionCompatParcelizer = j;
        this.AudioAttributesCompatParcelizer = timeUnit;
        this.write = getids;
    }

    @Override // kotlin.accessgetEmptyStatecp
    public final void read(SchemaUserStatusRSModel<? super Long> schemaUserStatusRSModel) {
        AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = new AudioAttributesCompatParcelizer(schemaUserStatusRSModel);
        schemaUserStatusRSModel.AudioAttributesCompatParcelizer(audioAttributesCompatParcelizer);
        audioAttributesCompatParcelizer.read(this.write.IconCompatParcelizer(audioAttributesCompatParcelizer, this.RemoteActionCompatParcelizer, this.AudioAttributesCompatParcelizer));
    }

    /* JADX INFO: loaded from: classes5.dex */
    static final class AudioAttributesCompatParcelizer extends AtomicReference<MarkIncompleteResponseBody> implements SchemaLessonStatus, Runnable {
        private SchemaUserStatusRSModel<? super Long> IconCompatParcelizer;
        private volatile boolean read;

        AudioAttributesCompatParcelizer(SchemaUserStatusRSModel<? super Long> schemaUserStatusRSModel) {
            this.IconCompatParcelizer = schemaUserStatusRSModel;
        }

        @Override // kotlin.SchemaLessonStatus
        public final void write(long j) {
            if (getCreatedOn.AudioAttributesCompatParcelizer(j)) {
                this.read = true;
            }
        }

        @Override // kotlin.SchemaLessonStatus
        public final void AudioAttributesCompatParcelizer() {
            getSubjectId.RemoteActionCompatParcelizer(this);
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (get() != getSubjectId.DISPOSED) {
                if (this.read) {
                    this.IconCompatParcelizer.a_(0L);
                    lazySet(isLessonPaid.INSTANCE);
                    this.IconCompatParcelizer.aJ_();
                } else {
                    lazySet(isLessonPaid.INSTANCE);
                    this.IconCompatParcelizer.AudioAttributesCompatParcelizer(new getLastUpdated("Can't deliver value due to lack of requests"));
                }
            }
        }

        public final void read(MarkIncompleteResponseBody markIncompleteResponseBody) {
            getSubjectId.read(this, markIncompleteResponseBody);
        }
    }
}
