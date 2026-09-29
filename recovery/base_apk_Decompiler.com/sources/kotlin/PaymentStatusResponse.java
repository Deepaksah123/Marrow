package kotlin;

/* JADX INFO: loaded from: classes.dex */
public final class PaymentStatusResponse<T, R> extends LessonDynamicResponseBody<R> {
    private getSubjectTitle<? super T, ? extends R> read;
    private setRootSubjectId<? extends T> write;

    public PaymentStatusResponse(setRootSubjectId<? extends T> setrootsubjectid, getSubjectTitle<? super T, ? extends R> getsubjecttitle) {
        this.write = setrootsubjectid;
        this.read = getsubjecttitle;
    }

    @Override // kotlin.LessonDynamicResponseBody
    public final void IconCompatParcelizer(MarkCompleteResponseBody<? super R> markCompleteResponseBody) {
        this.write.read(new write(markCompleteResponseBody, this.read));
    }

    /* JADX INFO: loaded from: classes4.dex */
    static final class write<T, R> implements MarkCompleteResponseBody<T> {
        private MarkCompleteResponseBody<? super R> RemoteActionCompatParcelizer;
        private getSubjectTitle<? super T, ? extends R> read;

        write(MarkCompleteResponseBody<? super R> markCompleteResponseBody, getSubjectTitle<? super T, ? extends R> getsubjecttitle) {
            this.RemoteActionCompatParcelizer = markCompleteResponseBody;
            this.read = getsubjecttitle;
        }

        @Override // kotlin.MarkCompleteResponseBody
        public final void IconCompatParcelizer(MarkIncompleteResponseBody markIncompleteResponseBody) {
            this.RemoteActionCompatParcelizer.IconCompatParcelizer(markIncompleteResponseBody);
        }

        @Override // kotlin.MarkCompleteResponseBody
        public final void AudioAttributesCompatParcelizer(T t) {
            try {
                this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(setHasPyt.AudioAttributesCompatParcelizer(this.read.apply(t), "The mapper function returned a null value."));
            } catch (Throwable th) {
                getEndTimeMs.RemoteActionCompatParcelizer(th);
                IconCompatParcelizer(th);
            }
        }

        @Override // kotlin.MarkCompleteResponseBody
        public final void IconCompatParcelizer(Throwable th) {
            this.RemoteActionCompatParcelizer.IconCompatParcelizer(th);
        }
    }
}
