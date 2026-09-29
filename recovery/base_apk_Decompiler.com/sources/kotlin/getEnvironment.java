package kotlin;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class getEnvironment<T> extends LessonDynamicResponseBody<T> {
    private LessonResetResponseBody<T> AudioAttributesCompatParcelizer;

    public getEnvironment(LessonResetResponseBody<T> lessonResetResponseBody) {
        this.AudioAttributesCompatParcelizer = lessonResetResponseBody;
    }

    @Override // kotlin.LessonDynamicResponseBody
    public final void IconCompatParcelizer(MarkCompleteResponseBody<? super T> markCompleteResponseBody) {
        RemoteActionCompatParcelizer remoteActionCompatParcelizer = new RemoteActionCompatParcelizer(markCompleteResponseBody);
        markCompleteResponseBody.IconCompatParcelizer(remoteActionCompatParcelizer);
        try {
            this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(remoteActionCompatParcelizer);
        } catch (Throwable th) {
            getEndTimeMs.RemoteActionCompatParcelizer(th);
            remoteActionCompatParcelizer.AudioAttributesCompatParcelizer(th);
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    static final class RemoteActionCompatParcelizer<T> extends AtomicReference<MarkIncompleteResponseBody> implements setUpdates<T>, MarkIncompleteResponseBody {
        private MarkCompleteResponseBody<? super T> AudioAttributesCompatParcelizer;

        RemoteActionCompatParcelizer(MarkCompleteResponseBody<? super T> markCompleteResponseBody) {
            this.AudioAttributesCompatParcelizer = markCompleteResponseBody;
        }

        @Override // kotlin.setUpdates
        public final void IconCompatParcelizer(T t) {
            MarkIncompleteResponseBody andSet;
            if (get() == getSubjectId.DISPOSED || (andSet = getAndSet(getSubjectId.DISPOSED)) == getSubjectId.DISPOSED) {
                return;
            }
            try {
                if (t == null) {
                    this.AudioAttributesCompatParcelizer.IconCompatParcelizer(new NullPointerException("onSuccess called with null. Null values are generally not allowed in 2.x operators and sources."));
                } else {
                    this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(t);
                }
                if (andSet != null) {
                    andSet.aL_();
                }
            } catch (Throwable th) {
                if (andSet != null) {
                    andSet.aL_();
                }
                throw th;
            }
        }

        @Override // kotlin.setUpdates
        public final void AudioAttributesCompatParcelizer(Throwable th) {
            if (RemoteActionCompatParcelizer(th)) {
                return;
            }
            getPaymentRefIds.RemoteActionCompatParcelizer(th);
        }

        private boolean RemoteActionCompatParcelizer(Throwable th) {
            MarkIncompleteResponseBody andSet;
            if (th == null) {
                th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            if (get() == getSubjectId.DISPOSED || (andSet = getAndSet(getSubjectId.DISPOSED)) == getSubjectId.DISPOSED) {
                return false;
            }
            try {
                this.AudioAttributesCompatParcelizer.IconCompatParcelizer(th);
            } finally {
                if (andSet != null) {
                    andSet.aL_();
                }
            }
        }

        @Override // kotlin.MarkIncompleteResponseBody
        public final void aL_() {
            getSubjectId.RemoteActionCompatParcelizer(this);
        }

        @Override // kotlin.setUpdates, kotlin.MarkIncompleteResponseBody
        public final boolean write() {
            return getSubjectId.AudioAttributesCompatParcelizer(get());
        }

        @Override // java.util.concurrent.atomic.AtomicReference
        public final String toString() {
            return String.format("%s{%s}", getClass().getSimpleName(), super.toString());
        }
    }
}
