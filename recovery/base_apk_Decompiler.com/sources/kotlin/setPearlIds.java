package kotlin;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class setPearlIds<T> extends LessonDynamicResponseBody<T> {
    private accessgetEmptyStatecp<T> IconCompatParcelizer;
    private long write = 0;
    private T read = null;

    public setPearlIds(accessgetEmptyStatecp<T> accessgetemptystatecp, long j) {
        this.IconCompatParcelizer = accessgetemptystatecp;
    }

    @Override // kotlin.LessonDynamicResponseBody
    public final void IconCompatParcelizer(MarkCompleteResponseBody<? super T> markCompleteResponseBody) {
        this.IconCompatParcelizer.RemoteActionCompatParcelizer(new IconCompatParcelizer(markCompleteResponseBody, this.write, this.read));
    }

    /* JADX INFO: loaded from: classes4.dex */
    static final class IconCompatParcelizer<T> implements findFirstAndLastInteractiveTime<T>, MarkIncompleteResponseBody {
        private MarkCompleteResponseBody<? super T> AudioAttributesCompatParcelizer;
        private SchemaLessonStatus AudioAttributesImplBaseParcelizer;
        private long IconCompatParcelizer;
        private boolean RemoteActionCompatParcelizer;
        private T read;
        private long write;

        IconCompatParcelizer(MarkCompleteResponseBody<? super T> markCompleteResponseBody, long j, T t) {
            this.AudioAttributesCompatParcelizer = markCompleteResponseBody;
            this.write = j;
            this.read = t;
        }

        @Override // kotlin.findFirstAndLastInteractiveTime, kotlin.SchemaUserStatusRSModel
        public final void AudioAttributesCompatParcelizer(SchemaLessonStatus schemaLessonStatus) {
            if (getCreatedOn.AudioAttributesCompatParcelizer(this.AudioAttributesImplBaseParcelizer, schemaLessonStatus)) {
                this.AudioAttributesImplBaseParcelizer = schemaLessonStatus;
                this.AudioAttributesCompatParcelizer.IconCompatParcelizer(this);
                schemaLessonStatus.write(Long.MAX_VALUE);
            }
        }

        @Override // kotlin.SchemaUserStatusRSModel
        public final void a_(T t) {
            if (this.RemoteActionCompatParcelizer) {
                return;
            }
            long j = this.IconCompatParcelizer;
            if (j == this.write) {
                this.RemoteActionCompatParcelizer = true;
                this.AudioAttributesImplBaseParcelizer.AudioAttributesCompatParcelizer();
                this.AudioAttributesImplBaseParcelizer = getCreatedOn.CANCELLED;
                this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(t);
                return;
            }
            this.IconCompatParcelizer = j + 1;
        }

        @Override // kotlin.SchemaUserStatusRSModel
        public final void AudioAttributesCompatParcelizer(Throwable th) {
            if (this.RemoteActionCompatParcelizer) {
                getPaymentRefIds.RemoteActionCompatParcelizer(th);
                return;
            }
            this.RemoteActionCompatParcelizer = true;
            this.AudioAttributesImplBaseParcelizer = getCreatedOn.CANCELLED;
            this.AudioAttributesCompatParcelizer.IconCompatParcelizer(th);
        }

        @Override // kotlin.SchemaUserStatusRSModel
        public final void aJ_() {
            this.AudioAttributesImplBaseParcelizer = getCreatedOn.CANCELLED;
            if (this.RemoteActionCompatParcelizer) {
                return;
            }
            this.RemoteActionCompatParcelizer = true;
            T t = this.read;
            if (t != null) {
                this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(t);
            } else {
                this.AudioAttributesCompatParcelizer.IconCompatParcelizer(new NoSuchElementException());
            }
        }

        @Override // kotlin.MarkIncompleteResponseBody
        public final void aL_() {
            this.AudioAttributesImplBaseParcelizer.AudioAttributesCompatParcelizer();
            this.AudioAttributesImplBaseParcelizer = getCreatedOn.CANCELLED;
        }

        @Override // kotlin.MarkIncompleteResponseBody
        public final boolean write() {
            return this.AudioAttributesImplBaseParcelizer == getCreatedOn.CANCELLED;
        }
    }
}
