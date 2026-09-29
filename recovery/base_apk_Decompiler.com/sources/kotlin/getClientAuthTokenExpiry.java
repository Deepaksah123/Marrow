package kotlin;

/* JADX INFO: loaded from: classes4.dex */
public final class getClientAuthTokenExpiry<T> extends getEmptyState<T> {
    private findTheInteractiveElementWhichIsInBetween<T> write;

    public getClientAuthTokenExpiry(findTheInteractiveElementWhichIsInBetween<T> findtheinteractiveelementwhichisinbetween) {
        this.write = findtheinteractiveelementwhichisinbetween;
    }

    @Override // kotlin.getEmptyState
    public final void RemoteActionCompatParcelizer(InteractiveVideoElementUiModelKt<? super T> interactiveVideoElementUiModelKt) {
        this.write.write(new AudioAttributesCompatParcelizer(interactiveVideoElementUiModelKt));
    }

    static final class AudioAttributesCompatParcelizer<T> implements getUpdates<T>, MarkIncompleteResponseBody {
        private T AudioAttributesCompatParcelizer;
        private InteractiveVideoElementUiModelKt<? super T> IconCompatParcelizer;
        private boolean RemoteActionCompatParcelizer;
        private MarkIncompleteResponseBody read;

        AudioAttributesCompatParcelizer(InteractiveVideoElementUiModelKt<? super T> interactiveVideoElementUiModelKt) {
            this.IconCompatParcelizer = interactiveVideoElementUiModelKt;
        }

        @Override // kotlin.getUpdates
        public final void AudioAttributesCompatParcelizer(MarkIncompleteResponseBody markIncompleteResponseBody) {
            if (getSubjectId.read(this.read, markIncompleteResponseBody)) {
                this.read = markIncompleteResponseBody;
                this.IconCompatParcelizer.IconCompatParcelizer(this);
            }
        }

        @Override // kotlin.MarkIncompleteResponseBody
        public final void aL_() {
            this.read.aL_();
        }

        @Override // kotlin.MarkIncompleteResponseBody
        public final boolean write() {
            return this.read.write();
        }

        @Override // kotlin.getUpdates
        public final void read(T t) {
            if (this.RemoteActionCompatParcelizer) {
                return;
            }
            if (this.AudioAttributesCompatParcelizer != null) {
                this.RemoteActionCompatParcelizer = true;
                this.read.aL_();
                this.IconCompatParcelizer.IconCompatParcelizer(new IllegalArgumentException("Sequence contains more than one element!"));
                return;
            }
            this.AudioAttributesCompatParcelizer = t;
        }

        @Override // kotlin.getUpdates
        public final void IconCompatParcelizer(Throwable th) {
            if (this.RemoteActionCompatParcelizer) {
                getPaymentRefIds.RemoteActionCompatParcelizer(th);
            } else {
                this.RemoteActionCompatParcelizer = true;
                this.IconCompatParcelizer.IconCompatParcelizer(th);
            }
        }

        @Override // kotlin.getUpdates
        public final void aI_() {
            if (this.RemoteActionCompatParcelizer) {
                return;
            }
            this.RemoteActionCompatParcelizer = true;
            T t = this.AudioAttributesCompatParcelizer;
            this.AudioAttributesCompatParcelizer = null;
            if (t == null) {
                this.IconCompatParcelizer.aK_();
            } else {
                this.IconCompatParcelizer.AudioAttributesCompatParcelizer(t);
            }
        }
    }
}
