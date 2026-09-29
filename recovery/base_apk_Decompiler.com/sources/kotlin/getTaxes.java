package kotlin;

/* JADX INFO: loaded from: classes4.dex */
public final class getTaxes<T, R> extends getBasePrice<T, R> {
    private getSubjectTitle<? super T, ? extends R> AudioAttributesCompatParcelizer;

    public getTaxes(InteractiveVideoElementUiModelCompanion<T> interactiveVideoElementUiModelCompanion, getSubjectTitle<? super T, ? extends R> getsubjecttitle) {
        super(interactiveVideoElementUiModelCompanion);
        this.AudioAttributesCompatParcelizer = getsubjecttitle;
    }

    @Override // kotlin.getEmptyState
    public final void RemoteActionCompatParcelizer(InteractiveVideoElementUiModelKt<? super R> interactiveVideoElementUiModelKt) {
        this.write.write(new AudioAttributesCompatParcelizer(interactiveVideoElementUiModelKt, this.AudioAttributesCompatParcelizer));
    }

    static final class AudioAttributesCompatParcelizer<T, R> implements InteractiveVideoElementUiModelKt<T>, MarkIncompleteResponseBody {
        private MarkIncompleteResponseBody IconCompatParcelizer;
        private InteractiveVideoElementUiModelKt<? super R> RemoteActionCompatParcelizer;
        private getSubjectTitle<? super T, ? extends R> read;

        AudioAttributesCompatParcelizer(InteractiveVideoElementUiModelKt<? super R> interactiveVideoElementUiModelKt, getSubjectTitle<? super T, ? extends R> getsubjecttitle) {
            this.RemoteActionCompatParcelizer = interactiveVideoElementUiModelKt;
            this.read = getsubjecttitle;
        }

        @Override // kotlin.MarkIncompleteResponseBody
        public final void aL_() {
            MarkIncompleteResponseBody markIncompleteResponseBody = this.IconCompatParcelizer;
            this.IconCompatParcelizer = getSubjectId.DISPOSED;
            markIncompleteResponseBody.aL_();
        }

        @Override // kotlin.MarkIncompleteResponseBody
        public final boolean write() {
            return this.IconCompatParcelizer.write();
        }

        @Override // kotlin.InteractiveVideoElementUiModelKt
        public final void IconCompatParcelizer(MarkIncompleteResponseBody markIncompleteResponseBody) {
            if (getSubjectId.read(this.IconCompatParcelizer, markIncompleteResponseBody)) {
                this.IconCompatParcelizer = markIncompleteResponseBody;
                this.RemoteActionCompatParcelizer.IconCompatParcelizer(this);
            }
        }

        @Override // kotlin.InteractiveVideoElementUiModelKt
        public final void AudioAttributesCompatParcelizer(T t) {
            try {
                this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(setHasPyt.AudioAttributesCompatParcelizer(this.read.apply(t), "The mapper returned a null item"));
            } catch (Throwable th) {
                getEndTimeMs.RemoteActionCompatParcelizer(th);
                this.RemoteActionCompatParcelizer.IconCompatParcelizer(th);
            }
        }

        @Override // kotlin.InteractiveVideoElementUiModelKt
        public final void IconCompatParcelizer(Throwable th) {
            this.RemoteActionCompatParcelizer.IconCompatParcelizer(th);
        }

        @Override // kotlin.InteractiveVideoElementUiModelKt
        public final void aK_() {
            this.RemoteActionCompatParcelizer.aK_();
        }
    }
}
