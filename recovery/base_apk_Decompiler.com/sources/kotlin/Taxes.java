package kotlin;

/* JADX INFO: loaded from: classes4.dex */
public final class Taxes<T> extends getBasePrice<T, T> {
    private getHasPyt<? super T> IconCompatParcelizer;

    public Taxes(InteractiveVideoElementUiModelCompanion<T> interactiveVideoElementUiModelCompanion, getHasPyt<? super T> gethaspyt) {
        super(interactiveVideoElementUiModelCompanion);
        this.IconCompatParcelizer = gethaspyt;
    }

    @Override // kotlin.getEmptyState
    public final void RemoteActionCompatParcelizer(InteractiveVideoElementUiModelKt<? super T> interactiveVideoElementUiModelKt) {
        this.write.write(new RemoteActionCompatParcelizer(interactiveVideoElementUiModelKt, this.IconCompatParcelizer));
    }

    static final class RemoteActionCompatParcelizer<T> implements InteractiveVideoElementUiModelKt<T>, MarkIncompleteResponseBody {
        private MarkIncompleteResponseBody IconCompatParcelizer;
        private getHasPyt<? super T> RemoteActionCompatParcelizer;
        private InteractiveVideoElementUiModelKt<? super T> read;

        RemoteActionCompatParcelizer(InteractiveVideoElementUiModelKt<? super T> interactiveVideoElementUiModelKt, getHasPyt<? super T> gethaspyt) {
            this.read = interactiveVideoElementUiModelKt;
            this.RemoteActionCompatParcelizer = gethaspyt;
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
                this.read.IconCompatParcelizer(this);
            }
        }

        @Override // kotlin.InteractiveVideoElementUiModelKt
        public final void AudioAttributesCompatParcelizer(T t) {
            try {
                if (this.RemoteActionCompatParcelizer.IconCompatParcelizer(t)) {
                    this.read.AudioAttributesCompatParcelizer(t);
                } else {
                    this.read.aK_();
                }
            } catch (Throwable th) {
                getEndTimeMs.RemoteActionCompatParcelizer(th);
                this.read.IconCompatParcelizer(th);
            }
        }

        @Override // kotlin.InteractiveVideoElementUiModelKt
        public final void IconCompatParcelizer(Throwable th) {
            this.read.IconCompatParcelizer(th);
        }

        @Override // kotlin.InteractiveVideoElementUiModelKt
        public final void aK_() {
            this.read.aK_();
        }
    }
}
