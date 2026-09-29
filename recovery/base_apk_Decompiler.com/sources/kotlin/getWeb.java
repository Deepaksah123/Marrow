package kotlin;

/* JADX INFO: loaded from: classes.dex */
public final class getWeb<T> extends LessonDynamicResponseBody<T> {
    private setRootSubjectId<? extends T> IconCompatParcelizer;
    final T RemoteActionCompatParcelizer;
    final getSubjectTitle<? super Throwable, ? extends T> write;

    public getWeb(setRootSubjectId<? extends T> setrootsubjectid, getSubjectTitle<? super Throwable, ? extends T> getsubjecttitle, T t) {
        this.IconCompatParcelizer = setrootsubjectid;
        this.write = getsubjecttitle;
        this.RemoteActionCompatParcelizer = t;
    }

    @Override // kotlin.LessonDynamicResponseBody
    public final void IconCompatParcelizer(MarkCompleteResponseBody<? super T> markCompleteResponseBody) {
        this.IconCompatParcelizer.read(new IconCompatParcelizer(markCompleteResponseBody));
    }

    /* JADX INFO: loaded from: classes4.dex */
    final class IconCompatParcelizer implements MarkCompleteResponseBody<T> {
        private final MarkCompleteResponseBody<? super T> IconCompatParcelizer;

        IconCompatParcelizer(MarkCompleteResponseBody<? super T> markCompleteResponseBody) {
            this.IconCompatParcelizer = markCompleteResponseBody;
        }

        @Override // kotlin.MarkCompleteResponseBody
        public final void IconCompatParcelizer(Throwable th) {
            T tApply;
            if (getWeb.this.write != null) {
                try {
                    tApply = getWeb.this.write.apply(th);
                } catch (Throwable th2) {
                    getEndTimeMs.RemoteActionCompatParcelizer(th2);
                    this.IconCompatParcelizer.IconCompatParcelizer(new getPytIds(th, th2));
                    return;
                }
            } else {
                tApply = getWeb.this.RemoteActionCompatParcelizer;
            }
            if (tApply == null) {
                NullPointerException nullPointerException = new NullPointerException("Value supplied was null");
                nullPointerException.initCause(th);
                this.IconCompatParcelizer.IconCompatParcelizer(nullPointerException);
                return;
            }
            this.IconCompatParcelizer.AudioAttributesCompatParcelizer(tApply);
        }

        @Override // kotlin.MarkCompleteResponseBody
        public final void IconCompatParcelizer(MarkIncompleteResponseBody markIncompleteResponseBody) {
            this.IconCompatParcelizer.IconCompatParcelizer(markIncompleteResponseBody);
        }

        @Override // kotlin.MarkCompleteResponseBody
        public final void AudioAttributesCompatParcelizer(T t) {
            this.IconCompatParcelizer.AudioAttributesCompatParcelizer(t);
        }
    }
}
