package kotlin;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class getSubscriptionList<T> extends LessonDynamicResponseBody<T> {
    private getIds IconCompatParcelizer;
    private setRootSubjectId<T> RemoteActionCompatParcelizer;

    public getSubscriptionList(setRootSubjectId<T> setrootsubjectid, getIds getids) {
        this.RemoteActionCompatParcelizer = setrootsubjectid;
        this.IconCompatParcelizer = getids;
    }

    @Override // kotlin.LessonDynamicResponseBody
    public final void IconCompatParcelizer(MarkCompleteResponseBody<? super T> markCompleteResponseBody) {
        this.RemoteActionCompatParcelizer.read(new AudioAttributesCompatParcelizer(markCompleteResponseBody, this.IconCompatParcelizer));
    }

    /* JADX INFO: loaded from: classes4.dex */
    static final class AudioAttributesCompatParcelizer<T> extends AtomicReference<MarkIncompleteResponseBody> implements MarkCompleteResponseBody<T>, MarkIncompleteResponseBody, Runnable {
        private T AudioAttributesCompatParcelizer;
        private getIds IconCompatParcelizer;
        private MarkCompleteResponseBody<? super T> RemoteActionCompatParcelizer;
        private Throwable write;

        AudioAttributesCompatParcelizer(MarkCompleteResponseBody<? super T> markCompleteResponseBody, getIds getids) {
            this.RemoteActionCompatParcelizer = markCompleteResponseBody;
            this.IconCompatParcelizer = getids;
        }

        @Override // kotlin.MarkCompleteResponseBody
        public final void IconCompatParcelizer(MarkIncompleteResponseBody markIncompleteResponseBody) {
            if (getSubjectId.AudioAttributesCompatParcelizer(this, markIncompleteResponseBody)) {
                this.RemoteActionCompatParcelizer.IconCompatParcelizer(this);
            }
        }

        @Override // kotlin.MarkCompleteResponseBody
        public final void AudioAttributesCompatParcelizer(T t) {
            this.AudioAttributesCompatParcelizer = t;
            getSubjectId.write(this, this.IconCompatParcelizer.IconCompatParcelizer(this));
        }

        @Override // kotlin.MarkCompleteResponseBody
        public final void IconCompatParcelizer(Throwable th) {
            this.write = th;
            getSubjectId.write(this, this.IconCompatParcelizer.IconCompatParcelizer(this));
        }

        @Override // java.lang.Runnable
        public final void run() {
            Throwable th = this.write;
            if (th != null) {
                this.RemoteActionCompatParcelizer.IconCompatParcelizer(th);
            } else {
                this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer);
            }
        }

        @Override // kotlin.MarkIncompleteResponseBody
        public final void aL_() {
            getSubjectId.RemoteActionCompatParcelizer(this);
        }

        @Override // kotlin.MarkIncompleteResponseBody
        public final boolean write() {
            return getSubjectId.AudioAttributesCompatParcelizer(get());
        }
    }
}
