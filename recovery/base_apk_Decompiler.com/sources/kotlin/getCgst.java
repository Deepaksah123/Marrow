package kotlin;

/* JADX INFO: loaded from: classes.dex */
public final class getCgst<T> extends getEmptyState<T> {
    private setRootSubjectId<T> write;

    public getCgst(setRootSubjectId<T> setrootsubjectid) {
        this.write = setrootsubjectid;
    }

    @Override // kotlin.getEmptyState
    public final void RemoteActionCompatParcelizer(InteractiveVideoElementUiModelKt<? super T> interactiveVideoElementUiModelKt) {
        this.write.read(new RemoteActionCompatParcelizer(interactiveVideoElementUiModelKt));
    }

    /* JADX INFO: loaded from: classes4.dex */
    static final class RemoteActionCompatParcelizer<T> implements MarkCompleteResponseBody<T>, MarkIncompleteResponseBody {
        private InteractiveVideoElementUiModelKt<? super T> read;
        private MarkIncompleteResponseBody write;

        RemoteActionCompatParcelizer(InteractiveVideoElementUiModelKt<? super T> interactiveVideoElementUiModelKt) {
            this.read = interactiveVideoElementUiModelKt;
        }

        @Override // kotlin.MarkIncompleteResponseBody
        public final void aL_() {
            this.write.aL_();
            this.write = getSubjectId.DISPOSED;
        }

        @Override // kotlin.MarkIncompleteResponseBody
        public final boolean write() {
            return this.write.write();
        }

        @Override // kotlin.MarkCompleteResponseBody
        public final void IconCompatParcelizer(MarkIncompleteResponseBody markIncompleteResponseBody) {
            if (getSubjectId.read(this.write, markIncompleteResponseBody)) {
                this.write = markIncompleteResponseBody;
                this.read.IconCompatParcelizer(this);
            }
        }

        @Override // kotlin.MarkCompleteResponseBody
        public final void AudioAttributesCompatParcelizer(T t) {
            this.write = getSubjectId.DISPOSED;
            this.read.AudioAttributesCompatParcelizer(t);
        }

        @Override // kotlin.MarkCompleteResponseBody
        public final void IconCompatParcelizer(Throwable th) {
            this.write = getSubjectId.DISPOSED;
            this.read.IconCompatParcelizer(th);
        }
    }
}
