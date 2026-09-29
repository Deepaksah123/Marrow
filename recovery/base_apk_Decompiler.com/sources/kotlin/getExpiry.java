package kotlin;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class getExpiry<T> extends LessonDynamicResponseBody<T> {
    private getIds RemoteActionCompatParcelizer;
    private setRootSubjectId<? extends T> read;

    public getExpiry(setRootSubjectId<? extends T> setrootsubjectid, getIds getids) {
        this.read = setrootsubjectid;
        this.RemoteActionCompatParcelizer = getids;
    }

    @Override // kotlin.LessonDynamicResponseBody
    public final void IconCompatParcelizer(MarkCompleteResponseBody<? super T> markCompleteResponseBody) {
        read readVar = new read(markCompleteResponseBody, this.read);
        markCompleteResponseBody.IconCompatParcelizer(readVar);
        readVar.IconCompatParcelizer.AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer.IconCompatParcelizer(readVar));
    }

    /* JADX INFO: loaded from: classes4.dex */
    static final class read<T> extends AtomicReference<MarkIncompleteResponseBody> implements MarkCompleteResponseBody<T>, MarkIncompleteResponseBody, Runnable {
        private MarkCompleteResponseBody<? super T> AudioAttributesCompatParcelizer;
        final getTimelineTitle IconCompatParcelizer = new getTimelineTitle();
        private setRootSubjectId<? extends T> read;

        read(MarkCompleteResponseBody<? super T> markCompleteResponseBody, setRootSubjectId<? extends T> setrootsubjectid) {
            this.AudioAttributesCompatParcelizer = markCompleteResponseBody;
            this.read = setrootsubjectid;
        }

        @Override // kotlin.MarkCompleteResponseBody
        public final void IconCompatParcelizer(MarkIncompleteResponseBody markIncompleteResponseBody) {
            getSubjectId.AudioAttributesCompatParcelizer(this, markIncompleteResponseBody);
        }

        @Override // kotlin.MarkCompleteResponseBody
        public final void AudioAttributesCompatParcelizer(T t) {
            this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(t);
        }

        @Override // kotlin.MarkCompleteResponseBody
        public final void IconCompatParcelizer(Throwable th) {
            this.AudioAttributesCompatParcelizer.IconCompatParcelizer(th);
        }

        @Override // kotlin.MarkIncompleteResponseBody
        public final void aL_() {
            getSubjectId.RemoteActionCompatParcelizer(this);
            this.IconCompatParcelizer.aL_();
        }

        @Override // kotlin.MarkIncompleteResponseBody
        public final boolean write() {
            return getSubjectId.AudioAttributesCompatParcelizer(get());
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.read.read(this);
        }
    }
}
