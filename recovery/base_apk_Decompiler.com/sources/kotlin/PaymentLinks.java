package kotlin;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class PaymentLinks<T, R> extends LessonDynamicResponseBody<R> {
    private setRootSubjectId<? extends T> RemoteActionCompatParcelizer;
    private getSubjectTitle<? super T, ? extends setRootSubjectId<? extends R>> write;

    public PaymentLinks(setRootSubjectId<? extends T> setrootsubjectid, getSubjectTitle<? super T, ? extends setRootSubjectId<? extends R>> getsubjecttitle) {
        this.write = getsubjecttitle;
        this.RemoteActionCompatParcelizer = setrootsubjectid;
    }

    @Override // kotlin.LessonDynamicResponseBody
    public final void IconCompatParcelizer(MarkCompleteResponseBody<? super R> markCompleteResponseBody) {
        this.RemoteActionCompatParcelizer.read(new read(markCompleteResponseBody, this.write));
    }

    /* JADX INFO: loaded from: classes4.dex */
    static final class read<T, R> extends AtomicReference<MarkIncompleteResponseBody> implements MarkCompleteResponseBody<T>, MarkIncompleteResponseBody {
        private MarkCompleteResponseBody<? super R> RemoteActionCompatParcelizer;
        private getSubjectTitle<? super T, ? extends setRootSubjectId<? extends R>> read;

        read(MarkCompleteResponseBody<? super R> markCompleteResponseBody, getSubjectTitle<? super T, ? extends setRootSubjectId<? extends R>> getsubjecttitle) {
            this.RemoteActionCompatParcelizer = markCompleteResponseBody;
            this.read = getsubjecttitle;
        }

        @Override // kotlin.MarkIncompleteResponseBody
        public final void aL_() {
            getSubjectId.RemoteActionCompatParcelizer(this);
        }

        @Override // kotlin.MarkIncompleteResponseBody
        public final boolean write() {
            return getSubjectId.AudioAttributesCompatParcelizer(get());
        }

        @Override // kotlin.MarkCompleteResponseBody
        public final void IconCompatParcelizer(MarkIncompleteResponseBody markIncompleteResponseBody) {
            if (getSubjectId.AudioAttributesCompatParcelizer(this, markIncompleteResponseBody)) {
                this.RemoteActionCompatParcelizer.IconCompatParcelizer(this);
            }
        }

        @Override // kotlin.MarkCompleteResponseBody
        public final void AudioAttributesCompatParcelizer(T t) {
            try {
                setRootSubjectId setrootsubjectid = (setRootSubjectId) setHasPyt.AudioAttributesCompatParcelizer(this.read.apply(t), "The single returned by the mapper is null");
                if (write()) {
                    return;
                }
                setrootsubjectid.read(new IconCompatParcelizer(this, this.RemoteActionCompatParcelizer));
            } catch (Throwable th) {
                getEndTimeMs.RemoteActionCompatParcelizer(th);
                this.RemoteActionCompatParcelizer.IconCompatParcelizer(th);
            }
        }

        @Override // kotlin.MarkCompleteResponseBody
        public final void IconCompatParcelizer(Throwable th) {
            this.RemoteActionCompatParcelizer.IconCompatParcelizer(th);
        }

        static final class IconCompatParcelizer<R> implements MarkCompleteResponseBody<R> {
            private MarkCompleteResponseBody<? super R> RemoteActionCompatParcelizer;
            private AtomicReference<MarkIncompleteResponseBody> write;

            IconCompatParcelizer(AtomicReference<MarkIncompleteResponseBody> atomicReference, MarkCompleteResponseBody<? super R> markCompleteResponseBody) {
                this.write = atomicReference;
                this.RemoteActionCompatParcelizer = markCompleteResponseBody;
            }

            @Override // kotlin.MarkCompleteResponseBody
            public final void IconCompatParcelizer(MarkIncompleteResponseBody markIncompleteResponseBody) {
                getSubjectId.write(this.write, markIncompleteResponseBody);
            }

            @Override // kotlin.MarkCompleteResponseBody
            public final void AudioAttributesCompatParcelizer(R r) {
                this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(r);
            }

            @Override // kotlin.MarkCompleteResponseBody
            public final void IconCompatParcelizer(Throwable th) {
                this.RemoteActionCompatParcelizer.IconCompatParcelizer(th);
            }
        }
    }
}
