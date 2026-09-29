package kotlin;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes4.dex */
public final class getGateway<T> extends LessonDynamicResponseBody<T> {
    private T AudioAttributesCompatParcelizer = null;
    private InteractiveVideoElementUiModelCompanion<T> IconCompatParcelizer;

    public getGateway(InteractiveVideoElementUiModelCompanion<T> interactiveVideoElementUiModelCompanion) {
        this.IconCompatParcelizer = interactiveVideoElementUiModelCompanion;
    }

    @Override // kotlin.LessonDynamicResponseBody
    public final void IconCompatParcelizer(MarkCompleteResponseBody<? super T> markCompleteResponseBody) {
        this.IconCompatParcelizer.write(new AudioAttributesCompatParcelizer(markCompleteResponseBody, this.AudioAttributesCompatParcelizer));
    }

    static final class AudioAttributesCompatParcelizer<T> implements InteractiveVideoElementUiModelKt<T>, MarkIncompleteResponseBody {
        private MarkIncompleteResponseBody AudioAttributesCompatParcelizer;
        private T IconCompatParcelizer;
        private MarkCompleteResponseBody<? super T> RemoteActionCompatParcelizer;

        AudioAttributesCompatParcelizer(MarkCompleteResponseBody<? super T> markCompleteResponseBody, T t) {
            this.RemoteActionCompatParcelizer = markCompleteResponseBody;
            this.IconCompatParcelizer = t;
        }

        @Override // kotlin.MarkIncompleteResponseBody
        public final void aL_() {
            this.AudioAttributesCompatParcelizer.aL_();
            this.AudioAttributesCompatParcelizer = getSubjectId.DISPOSED;
        }

        @Override // kotlin.MarkIncompleteResponseBody
        public final boolean write() {
            return this.AudioAttributesCompatParcelizer.write();
        }

        @Override // kotlin.InteractiveVideoElementUiModelKt
        public final void IconCompatParcelizer(MarkIncompleteResponseBody markIncompleteResponseBody) {
            if (getSubjectId.read(this.AudioAttributesCompatParcelizer, markIncompleteResponseBody)) {
                this.AudioAttributesCompatParcelizer = markIncompleteResponseBody;
                this.RemoteActionCompatParcelizer.IconCompatParcelizer(this);
            }
        }

        @Override // kotlin.InteractiveVideoElementUiModelKt
        public final void AudioAttributesCompatParcelizer(T t) {
            this.AudioAttributesCompatParcelizer = getSubjectId.DISPOSED;
            this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(t);
        }

        @Override // kotlin.InteractiveVideoElementUiModelKt
        public final void IconCompatParcelizer(Throwable th) {
            this.AudioAttributesCompatParcelizer = getSubjectId.DISPOSED;
            this.RemoteActionCompatParcelizer.IconCompatParcelizer(th);
        }

        @Override // kotlin.InteractiveVideoElementUiModelKt
        public final void aK_() {
            this.AudioAttributesCompatParcelizer = getSubjectId.DISPOSED;
            T t = this.IconCompatParcelizer;
            if (t != null) {
                this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(t);
            } else {
                this.RemoteActionCompatParcelizer.IconCompatParcelizer(new NoSuchElementException("The MaybeSource is empty"));
            }
        }
    }
}
