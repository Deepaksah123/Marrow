package kotlin;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes4.dex */
public final class getCustomerId<T> extends LessonDynamicResponseBody<T> {
    private T IconCompatParcelizer = null;
    private findTheInteractiveElementWhichIsInBetween<? extends T> RemoteActionCompatParcelizer;

    public getCustomerId(findTheInteractiveElementWhichIsInBetween<? extends T> findtheinteractiveelementwhichisinbetween) {
        this.RemoteActionCompatParcelizer = findtheinteractiveelementwhichisinbetween;
    }

    @Override // kotlin.LessonDynamicResponseBody
    public final void IconCompatParcelizer(MarkCompleteResponseBody<? super T> markCompleteResponseBody) {
        this.RemoteActionCompatParcelizer.write(new RemoteActionCompatParcelizer(markCompleteResponseBody, this.IconCompatParcelizer));
    }

    static final class RemoteActionCompatParcelizer<T> implements getUpdates<T>, MarkIncompleteResponseBody {
        private T AudioAttributesCompatParcelizer;
        private boolean IconCompatParcelizer;
        private MarkCompleteResponseBody<? super T> RemoteActionCompatParcelizer;
        private MarkIncompleteResponseBody read;
        private T write;

        RemoteActionCompatParcelizer(MarkCompleteResponseBody<? super T> markCompleteResponseBody, T t) {
            this.RemoteActionCompatParcelizer = markCompleteResponseBody;
            this.AudioAttributesCompatParcelizer = t;
        }

        @Override // kotlin.getUpdates
        public final void AudioAttributesCompatParcelizer(MarkIncompleteResponseBody markIncompleteResponseBody) {
            if (getSubjectId.read(this.read, markIncompleteResponseBody)) {
                this.read = markIncompleteResponseBody;
                this.RemoteActionCompatParcelizer.IconCompatParcelizer(this);
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
            if (this.IconCompatParcelizer) {
                return;
            }
            if (this.write != null) {
                this.IconCompatParcelizer = true;
                this.read.aL_();
                this.RemoteActionCompatParcelizer.IconCompatParcelizer(new IllegalArgumentException("Sequence contains more than one element!"));
                return;
            }
            this.write = t;
        }

        @Override // kotlin.getUpdates
        public final void IconCompatParcelizer(Throwable th) {
            if (this.IconCompatParcelizer) {
                getPaymentRefIds.RemoteActionCompatParcelizer(th);
            } else {
                this.IconCompatParcelizer = true;
                this.RemoteActionCompatParcelizer.IconCompatParcelizer(th);
            }
        }

        @Override // kotlin.getUpdates
        public final void aI_() {
            if (this.IconCompatParcelizer) {
                return;
            }
            this.IconCompatParcelizer = true;
            T t = this.write;
            this.write = null;
            if (t == null) {
                t = this.AudioAttributesCompatParcelizer;
            }
            if (t != null) {
                this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(t);
            } else {
                this.RemoteActionCompatParcelizer.IconCompatParcelizer(new NoSuchElementException());
            }
        }
    }
}
