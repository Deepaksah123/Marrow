package kotlin;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class getOrderId<T> extends getBasePrice<T, T> {
    private getIds read;

    public getOrderId(InteractiveVideoElementUiModelCompanion<T> interactiveVideoElementUiModelCompanion, getIds getids) {
        super(interactiveVideoElementUiModelCompanion);
        this.read = getids;
    }

    @Override // kotlin.getEmptyState
    public final void RemoteActionCompatParcelizer(InteractiveVideoElementUiModelKt<? super T> interactiveVideoElementUiModelKt) {
        this.write.write(new write(interactiveVideoElementUiModelKt, this.read));
    }

    static final class write<T> extends AtomicReference<MarkIncompleteResponseBody> implements InteractiveVideoElementUiModelKt<T>, MarkIncompleteResponseBody, Runnable {
        private T AudioAttributesCompatParcelizer;
        private InteractiveVideoElementUiModelKt<? super T> IconCompatParcelizer;
        private Throwable RemoteActionCompatParcelizer;
        private getIds write;

        write(InteractiveVideoElementUiModelKt<? super T> interactiveVideoElementUiModelKt, getIds getids) {
            this.IconCompatParcelizer = interactiveVideoElementUiModelKt;
            this.write = getids;
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
                this.IconCompatParcelizer.IconCompatParcelizer(this);
            }
        }

        @Override // kotlin.InteractiveVideoElementUiModelKt
        public final void AudioAttributesCompatParcelizer(T t) {
            this.AudioAttributesCompatParcelizer = t;
            getSubjectId.write(this, this.write.IconCompatParcelizer(this));
        }

        @Override // kotlin.InteractiveVideoElementUiModelKt
        public final void IconCompatParcelizer(Throwable th) {
            this.RemoteActionCompatParcelizer = th;
            getSubjectId.write(this, this.write.IconCompatParcelizer(this));
        }

        @Override // kotlin.InteractiveVideoElementUiModelKt
        public final void aK_() {
            getSubjectId.write(this, this.write.IconCompatParcelizer(this));
        }

        @Override // java.lang.Runnable
        public final void run() {
            Throwable th = this.RemoteActionCompatParcelizer;
            if (th != null) {
                this.RemoteActionCompatParcelizer = null;
                this.IconCompatParcelizer.IconCompatParcelizer(th);
                return;
            }
            T t = this.AudioAttributesCompatParcelizer;
            if (t != null) {
                this.AudioAttributesCompatParcelizer = null;
                this.IconCompatParcelizer.AudioAttributesCompatParcelizer(t);
            } else {
                this.IconCompatParcelizer.aK_();
            }
        }
    }
}
