package kotlin;

/* JADX INFO: loaded from: classes4.dex */
final class GTSubjectAnalyticsV2ResponseModelCompanion<T> extends LessonIndexResponseBody<T> {
    private final LessonIndexResponseBody<getTopicStat<T>> RemoteActionCompatParcelizer;

    GTSubjectAnalyticsV2ResponseModelCompanion(LessonIndexResponseBody<getTopicStat<T>> lessonIndexResponseBody) {
        this.RemoteActionCompatParcelizer = lessonIndexResponseBody;
    }

    @Override // kotlin.LessonIndexResponseBody
    public final void AudioAttributesCompatParcelizer(getUpdates<? super T> getupdates) {
        this.RemoteActionCompatParcelizer.write(new RemoteActionCompatParcelizer(getupdates));
    }

    static class RemoteActionCompatParcelizer<R> implements getUpdates<getTopicStat<R>> {
        private boolean AudioAttributesCompatParcelizer;
        private final getUpdates<? super R> RemoteActionCompatParcelizer;

        RemoteActionCompatParcelizer(getUpdates<? super R> getupdates) {
            this.RemoteActionCompatParcelizer = getupdates;
        }

        @Override // kotlin.getUpdates
        public final void AudioAttributesCompatParcelizer(MarkIncompleteResponseBody markIncompleteResponseBody) {
            this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(markIncompleteResponseBody);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getUpdates
        public void read(getTopicStat<R> gettopicstat) {
            if (gettopicstat.read()) {
                this.RemoteActionCompatParcelizer.read(gettopicstat.AudioAttributesCompatParcelizer());
                return;
            }
            this.AudioAttributesCompatParcelizer = true;
            getAnswersChanged getanswerschanged = new getAnswersChanged(gettopicstat);
            try {
                this.RemoteActionCompatParcelizer.IconCompatParcelizer(getanswerschanged);
            } catch (Throwable th) {
                getEndTimeMs.RemoteActionCompatParcelizer(th);
                getPaymentRefIds.RemoteActionCompatParcelizer(new getPytIds(getanswerschanged, th));
            }
        }

        @Override // kotlin.getUpdates
        public final void aI_() {
            if (this.AudioAttributesCompatParcelizer) {
                return;
            }
            this.RemoteActionCompatParcelizer.aI_();
        }

        @Override // kotlin.getUpdates
        public final void IconCompatParcelizer(Throwable th) {
            if (!this.AudioAttributesCompatParcelizer) {
                this.RemoteActionCompatParcelizer.IconCompatParcelizer(th);
                return;
            }
            AssertionError assertionError = new AssertionError("This should never happen! Report as a bug with the full stacktrace.");
            assertionError.initCause(th);
            getPaymentRefIds.RemoteActionCompatParcelizer(assertionError);
        }
    }
}
