package kotlin;

/* JADX INFO: loaded from: classes4.dex */
final class getMcqTimingDetails<T> extends LessonIndexResponseBody<getForceSubmit<T>> {
    private final LessonIndexResponseBody<getTopicStat<T>> RemoteActionCompatParcelizer;

    getMcqTimingDetails(LessonIndexResponseBody<getTopicStat<T>> lessonIndexResponseBody) {
        this.RemoteActionCompatParcelizer = lessonIndexResponseBody;
    }

    @Override // kotlin.LessonIndexResponseBody
    public final void AudioAttributesCompatParcelizer(getUpdates<? super getForceSubmit<T>> getupdates) {
        this.RemoteActionCompatParcelizer.write(new read(getupdates));
    }

    static class read<R> implements getUpdates<getTopicStat<R>> {
        private final getUpdates<? super getForceSubmit<R>> write;

        read(getUpdates<? super getForceSubmit<R>> getupdates) {
            this.write = getupdates;
        }

        @Override // kotlin.getUpdates
        public final void AudioAttributesCompatParcelizer(MarkIncompleteResponseBody markIncompleteResponseBody) {
            this.write.AudioAttributesCompatParcelizer(markIncompleteResponseBody);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getUpdates
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public void read(getTopicStat<R> gettopicstat) {
            this.write.read(getForceSubmit.write(gettopicstat));
        }

        @Override // kotlin.getUpdates
        public final void IconCompatParcelizer(Throwable th) {
            try {
                this.write.read(getForceSubmit.IconCompatParcelizer(th));
                this.write.aI_();
            } catch (Throwable th2) {
                try {
                    this.write.IconCompatParcelizer(th2);
                } catch (Throwable th3) {
                    getEndTimeMs.RemoteActionCompatParcelizer(th3);
                    getPaymentRefIds.RemoteActionCompatParcelizer(new getPytIds(th2, th3));
                }
            }
        }

        @Override // kotlin.getUpdates
        public final void aI_() {
            this.write.aI_();
        }
    }
}
