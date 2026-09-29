package kotlin;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes4.dex */
public final class isNotesPurchaseAllowed<T> extends setQuestion<T, T> {
    public isNotesPurchaseAllowed(accessgetEmptyStatecp<T> accessgetemptystatecp) {
        super(accessgetemptystatecp);
    }

    @Override // kotlin.accessgetEmptyStatecp
    public final void read(SchemaUserStatusRSModel<? super T> schemaUserStatusRSModel) {
        this.write.RemoteActionCompatParcelizer(new RemoteActionCompatParcelizer(schemaUserStatusRSModel));
    }

    static final class RemoteActionCompatParcelizer<T> extends AtomicLong implements findFirstAndLastInteractiveTime<T>, SchemaLessonStatus {
        private SchemaLessonStatus AudioAttributesCompatParcelizer;
        private SchemaUserStatusRSModel<? super T> IconCompatParcelizer;
        private boolean read;

        RemoteActionCompatParcelizer(SchemaUserStatusRSModel<? super T> schemaUserStatusRSModel) {
            this.IconCompatParcelizer = schemaUserStatusRSModel;
        }

        @Override // kotlin.findFirstAndLastInteractiveTime, kotlin.SchemaUserStatusRSModel
        public final void AudioAttributesCompatParcelizer(SchemaLessonStatus schemaLessonStatus) {
            if (getCreatedOn.AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer, schemaLessonStatus)) {
                this.AudioAttributesCompatParcelizer = schemaLessonStatus;
                this.IconCompatParcelizer.AudioAttributesCompatParcelizer(this);
                schemaLessonStatus.write(Long.MAX_VALUE);
            }
        }

        @Override // kotlin.SchemaUserStatusRSModel
        public final void a_(T t) {
            if (this.read) {
                return;
            }
            if (get() != 0) {
                this.IconCompatParcelizer.a_(t);
                getAccessLevel.write(this, 1L);
            } else {
                AudioAttributesCompatParcelizer(new getLastUpdated("could not emit value due to lack of requests"));
            }
        }

        @Override // kotlin.SchemaUserStatusRSModel
        public final void AudioAttributesCompatParcelizer(Throwable th) {
            if (this.read) {
                getPaymentRefIds.RemoteActionCompatParcelizer(th);
            } else {
                this.read = true;
                this.IconCompatParcelizer.AudioAttributesCompatParcelizer(th);
            }
        }

        @Override // kotlin.SchemaUserStatusRSModel
        public final void aJ_() {
            if (this.read) {
                return;
            }
            this.read = true;
            this.IconCompatParcelizer.aJ_();
        }

        @Override // kotlin.SchemaLessonStatus
        public final void write(long j) {
            if (getCreatedOn.AudioAttributesCompatParcelizer(j)) {
                getAccessLevel.RemoteActionCompatParcelizer(this, j);
            }
        }

        @Override // kotlin.SchemaLessonStatus
        public final void AudioAttributesCompatParcelizer() {
            this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer();
        }
    }
}
