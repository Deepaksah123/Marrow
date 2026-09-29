package kotlin;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class getSubscriptionPeriod<T, R> extends getBasePrice<T, R> {
    private getSubjectTitle<? super T, ? extends InteractiveVideoElementUiModelCompanion<? extends R>> AudioAttributesCompatParcelizer;

    public getSubscriptionPeriod(InteractiveVideoElementUiModelCompanion<T> interactiveVideoElementUiModelCompanion, getSubjectTitle<? super T, ? extends InteractiveVideoElementUiModelCompanion<? extends R>> getsubjecttitle) {
        super(interactiveVideoElementUiModelCompanion);
        this.AudioAttributesCompatParcelizer = getsubjecttitle;
    }

    @Override // kotlin.getEmptyState
    public final void RemoteActionCompatParcelizer(InteractiveVideoElementUiModelKt<? super R> interactiveVideoElementUiModelKt) {
        this.write.write(new RemoteActionCompatParcelizer(interactiveVideoElementUiModelKt, this.AudioAttributesCompatParcelizer));
    }

    static final class RemoteActionCompatParcelizer<T, R> extends AtomicReference<MarkIncompleteResponseBody> implements InteractiveVideoElementUiModelKt<T>, MarkIncompleteResponseBody {
        private getSubjectTitle<? super T, ? extends InteractiveVideoElementUiModelCompanion<? extends R>> RemoteActionCompatParcelizer;
        final InteractiveVideoElementUiModelKt<? super R> read;
        private MarkIncompleteResponseBody write;

        RemoteActionCompatParcelizer(InteractiveVideoElementUiModelKt<? super R> interactiveVideoElementUiModelKt, getSubjectTitle<? super T, ? extends InteractiveVideoElementUiModelCompanion<? extends R>> getsubjecttitle) {
            this.read = interactiveVideoElementUiModelKt;
            this.RemoteActionCompatParcelizer = getsubjecttitle;
        }

        @Override // kotlin.MarkIncompleteResponseBody
        public final void aL_() {
            getSubjectId.RemoteActionCompatParcelizer(this);
            this.write.aL_();
        }

        @Override // kotlin.MarkIncompleteResponseBody
        public final boolean write() {
            return getSubjectId.AudioAttributesCompatParcelizer(get());
        }

        @Override // kotlin.InteractiveVideoElementUiModelKt
        public final void IconCompatParcelizer(MarkIncompleteResponseBody markIncompleteResponseBody) {
            if (getSubjectId.read(this.write, markIncompleteResponseBody)) {
                this.write = markIncompleteResponseBody;
                this.read.IconCompatParcelizer(this);
            }
        }

        @Override // kotlin.InteractiveVideoElementUiModelKt
        public final void AudioAttributesCompatParcelizer(T t) {
            try {
                InteractiveVideoElementUiModelCompanion interactiveVideoElementUiModelCompanion = (InteractiveVideoElementUiModelCompanion) setHasPyt.AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer.apply(t), "The mapper returned a null MaybeSource");
                if (write()) {
                    return;
                }
                interactiveVideoElementUiModelCompanion.write(new AudioAttributesCompatParcelizer());
            } catch (Exception e) {
                getEndTimeMs.RemoteActionCompatParcelizer(e);
                this.read.IconCompatParcelizer(e);
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

        final class AudioAttributesCompatParcelizer implements InteractiveVideoElementUiModelKt<R> {
            AudioAttributesCompatParcelizer() {
            }

            @Override // kotlin.InteractiveVideoElementUiModelKt
            public final void IconCompatParcelizer(MarkIncompleteResponseBody markIncompleteResponseBody) {
                getSubjectId.AudioAttributesCompatParcelizer(RemoteActionCompatParcelizer.this, markIncompleteResponseBody);
            }

            @Override // kotlin.InteractiveVideoElementUiModelKt
            public final void AudioAttributesCompatParcelizer(R r) {
                RemoteActionCompatParcelizer.this.read.AudioAttributesCompatParcelizer(r);
            }

            @Override // kotlin.InteractiveVideoElementUiModelKt
            public final void IconCompatParcelizer(Throwable th) {
                RemoteActionCompatParcelizer.this.read.IconCompatParcelizer(th);
            }

            @Override // kotlin.InteractiveVideoElementUiModelKt
            public final void aK_() {
                RemoteActionCompatParcelizer.this.read.aK_();
            }
        }
    }
}
