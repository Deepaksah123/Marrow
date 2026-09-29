package kotlin;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class CreateOrderResponse<T> extends getBasePrice<T, T> {
    private InteractiveVideoElementUiModelCompanion<? extends T> RemoteActionCompatParcelizer;

    public CreateOrderResponse(InteractiveVideoElementUiModelCompanion<T> interactiveVideoElementUiModelCompanion, InteractiveVideoElementUiModelCompanion<? extends T> interactiveVideoElementUiModelCompanion2) {
        super(interactiveVideoElementUiModelCompanion);
        this.RemoteActionCompatParcelizer = interactiveVideoElementUiModelCompanion2;
    }

    @Override // kotlin.getEmptyState
    public final void RemoteActionCompatParcelizer(InteractiveVideoElementUiModelKt<? super T> interactiveVideoElementUiModelKt) {
        this.write.write(new write(interactiveVideoElementUiModelKt, this.RemoteActionCompatParcelizer));
    }

    static final class write<T> extends AtomicReference<MarkIncompleteResponseBody> implements InteractiveVideoElementUiModelKt<T>, MarkIncompleteResponseBody {
        private InteractiveVideoElementUiModelCompanion<? extends T> read;
        private InteractiveVideoElementUiModelKt<? super T> write;

        write(InteractiveVideoElementUiModelKt<? super T> interactiveVideoElementUiModelKt, InteractiveVideoElementUiModelCompanion<? extends T> interactiveVideoElementUiModelCompanion) {
            this.write = interactiveVideoElementUiModelKt;
            this.read = interactiveVideoElementUiModelCompanion;
        }

        @Override // kotlin.MarkIncompleteResponseBody
        public final void aL_() {
            getSubjectId.RemoteActionCompatParcelizer(this);
        }

        @Override // kotlin.MarkIncompleteResponseBody
        public final boolean write() {
            return getSubjectId.AudioAttributesCompatParcelizer(get());
        }

        @Override // kotlin.InteractiveVideoElementUiModelKt
        public final void IconCompatParcelizer(MarkIncompleteResponseBody markIncompleteResponseBody) {
            if (getSubjectId.AudioAttributesCompatParcelizer(this, markIncompleteResponseBody)) {
                this.write.IconCompatParcelizer(this);
            }
        }

        @Override // kotlin.InteractiveVideoElementUiModelKt
        public final void AudioAttributesCompatParcelizer(T t) {
            this.write.AudioAttributesCompatParcelizer(t);
        }

        @Override // kotlin.InteractiveVideoElementUiModelKt
        public final void IconCompatParcelizer(Throwable th) {
            this.write.IconCompatParcelizer(th);
        }

        @Override // kotlin.InteractiveVideoElementUiModelKt
        public final void aK_() {
            MarkIncompleteResponseBody markIncompleteResponseBody = get();
            if (markIncompleteResponseBody == getSubjectId.DISPOSED || !compareAndSet(markIncompleteResponseBody, null)) {
                return;
            }
            this.read.write(new RemoteActionCompatParcelizer(this.write, this));
        }

        static final class RemoteActionCompatParcelizer<T> implements InteractiveVideoElementUiModelKt<T> {
            private AtomicReference<MarkIncompleteResponseBody> AudioAttributesCompatParcelizer;
            private InteractiveVideoElementUiModelKt<? super T> read;

            RemoteActionCompatParcelizer(InteractiveVideoElementUiModelKt<? super T> interactiveVideoElementUiModelKt, AtomicReference<MarkIncompleteResponseBody> atomicReference) {
                this.read = interactiveVideoElementUiModelKt;
                this.AudioAttributesCompatParcelizer = atomicReference;
            }

            @Override // kotlin.InteractiveVideoElementUiModelKt
            public final void IconCompatParcelizer(MarkIncompleteResponseBody markIncompleteResponseBody) {
                getSubjectId.AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer, markIncompleteResponseBody);
            }

            @Override // kotlin.InteractiveVideoElementUiModelKt
            public final void AudioAttributesCompatParcelizer(T t) {
                this.read.AudioAttributesCompatParcelizer(t);
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
}
