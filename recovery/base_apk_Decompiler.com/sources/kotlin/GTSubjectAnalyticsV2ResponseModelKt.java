package kotlin;

/* JADX INFO: loaded from: classes4.dex */
final class GTSubjectAnalyticsV2ResponseModelKt<T> extends LessonIndexResponseBody<getTopicStat<T>> {
    private final SearchTextResponseBody<T> RemoteActionCompatParcelizer;

    GTSubjectAnalyticsV2ResponseModelKt(SearchTextResponseBody<T> searchTextResponseBody) {
        this.RemoteActionCompatParcelizer = searchTextResponseBody;
    }

    @Override // kotlin.LessonIndexResponseBody
    public final void AudioAttributesCompatParcelizer(getUpdates<? super getTopicStat<T>> getupdates) {
        SearchTextResponseBody<T> searchTextResponseBodyClone = this.RemoteActionCompatParcelizer.clone();
        RemoteActionCompatParcelizer remoteActionCompatParcelizer = new RemoteActionCompatParcelizer(searchTextResponseBodyClone, getupdates);
        getupdates.AudioAttributesCompatParcelizer(remoteActionCompatParcelizer);
        if (remoteActionCompatParcelizer.write()) {
            return;
        }
        searchTextResponseBodyClone.IconCompatParcelizer(remoteActionCompatParcelizer);
    }

    static final class RemoteActionCompatParcelizer<T> implements MarkIncompleteResponseBody, SubjectLSModel<T> {
        private final SearchTextResponseBody<?> AudioAttributesCompatParcelizer;
        private boolean IconCompatParcelizer = false;
        private volatile boolean read;
        private final getUpdates<? super getTopicStat<T>> write;

        RemoteActionCompatParcelizer(SearchTextResponseBody<?> searchTextResponseBody, getUpdates<? super getTopicStat<T>> getupdates) {
            this.AudioAttributesCompatParcelizer = searchTextResponseBody;
            this.write = getupdates;
        }

        @Override // kotlin.SubjectLSModel
        public final void read(SearchTextResponseBody<T> searchTextResponseBody, getTopicStat<T> gettopicstat) {
            if (this.read) {
                return;
            }
            try {
                this.write.read(gettopicstat);
                if (this.read) {
                    return;
                }
                this.IconCompatParcelizer = true;
                this.write.aI_();
            } catch (Throwable th) {
                getEndTimeMs.RemoteActionCompatParcelizer(th);
                if (this.IconCompatParcelizer) {
                    getPaymentRefIds.RemoteActionCompatParcelizer(th);
                    return;
                }
                if (this.read) {
                    return;
                }
                try {
                    this.write.IconCompatParcelizer(th);
                } catch (Throwable th2) {
                    getEndTimeMs.RemoteActionCompatParcelizer(th2);
                    getPaymentRefIds.RemoteActionCompatParcelizer(new getPytIds(th, th2));
                }
            }
        }

        @Override // kotlin.SubjectLSModel
        public final void AudioAttributesCompatParcelizer(SearchTextResponseBody<T> searchTextResponseBody, Throwable th) {
            if (searchTextResponseBody.IconCompatParcelizer()) {
                return;
            }
            try {
                this.write.IconCompatParcelizer(th);
            } catch (Throwable th2) {
                getEndTimeMs.RemoteActionCompatParcelizer(th2);
                getPaymentRefIds.RemoteActionCompatParcelizer(new getPytIds(th, th2));
            }
        }

        @Override // kotlin.MarkIncompleteResponseBody
        public final void aL_() {
            this.read = true;
            this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer();
        }

        @Override // kotlin.MarkIncompleteResponseBody
        public final boolean write() {
            return this.read;
        }
    }
}
