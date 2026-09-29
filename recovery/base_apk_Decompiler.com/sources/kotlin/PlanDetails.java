package kotlin;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes.dex */
public final class PlanDetails<T> extends setQuestion<T, T> implements getTimelineId<T> {
    private getTimelineId<? super T> RemoteActionCompatParcelizer;

    @Override // kotlin.getTimelineId
    public final void RemoteActionCompatParcelizer(T t) {
    }

    public PlanDetails(accessgetEmptyStatecp<T> accessgetemptystatecp) {
        super(accessgetemptystatecp);
        this.RemoteActionCompatParcelizer = this;
    }

    @Override // kotlin.accessgetEmptyStatecp
    public final void read(SchemaUserStatusRSModel<? super T> schemaUserStatusRSModel) {
        this.write.RemoteActionCompatParcelizer(new IconCompatParcelizer(schemaUserStatusRSModel, this.RemoteActionCompatParcelizer));
    }

    /* JADX INFO: loaded from: classes4.dex */
    static final class IconCompatParcelizer<T> extends AtomicLong implements findFirstAndLastInteractiveTime<T>, SchemaLessonStatus {
        private SchemaLessonStatus AudioAttributesCompatParcelizer;
        private boolean IconCompatParcelizer;
        private SchemaUserStatusRSModel<? super T> RemoteActionCompatParcelizer;
        private getTimelineId<? super T> read;

        IconCompatParcelizer(SchemaUserStatusRSModel<? super T> schemaUserStatusRSModel, getTimelineId<? super T> gettimelineid) {
            this.RemoteActionCompatParcelizer = schemaUserStatusRSModel;
            this.read = gettimelineid;
        }

        @Override // kotlin.findFirstAndLastInteractiveTime, kotlin.SchemaUserStatusRSModel
        public final void AudioAttributesCompatParcelizer(SchemaLessonStatus schemaLessonStatus) {
            if (getCreatedOn.AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer, schemaLessonStatus)) {
                this.AudioAttributesCompatParcelizer = schemaLessonStatus;
                this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(this);
                schemaLessonStatus.write(Long.MAX_VALUE);
            }
        }

        @Override // kotlin.SchemaUserStatusRSModel
        public final void a_(T t) {
            if (this.IconCompatParcelizer) {
                return;
            }
            if (get() != 0) {
                this.RemoteActionCompatParcelizer.a_(t);
                getAccessLevel.write(this, 1L);
                return;
            }
            try {
                this.read.RemoteActionCompatParcelizer(t);
            } catch (Throwable th) {
                getEndTimeMs.RemoteActionCompatParcelizer(th);
                AudioAttributesCompatParcelizer();
                AudioAttributesCompatParcelizer(th);
            }
        }

        @Override // kotlin.SchemaUserStatusRSModel
        public final void AudioAttributesCompatParcelizer(Throwable th) {
            if (this.IconCompatParcelizer) {
                getPaymentRefIds.RemoteActionCompatParcelizer(th);
            } else {
                this.IconCompatParcelizer = true;
                this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(th);
            }
        }

        @Override // kotlin.SchemaUserStatusRSModel
        public final void aJ_() {
            if (this.IconCompatParcelizer) {
                return;
            }
            this.IconCompatParcelizer = true;
            this.RemoteActionCompatParcelizer.aJ_();
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
