package kotlin;

/* JADX INFO: loaded from: classes4.dex */
final class setTopicStat<T> extends LessonIndexResponseBody<getTopicStat<T>> {
    private final SearchTextResponseBody<T> read;

    setTopicStat(SearchTextResponseBody<T> searchTextResponseBody) {
        this.read = searchTextResponseBody;
    }

    @Override // kotlin.LessonIndexResponseBody
    public final void AudioAttributesCompatParcelizer(getUpdates<? super getTopicStat<T>> getupdates) {
        boolean z;
        SearchTextResponseBody<T> searchTextResponseBodyClone = this.read.clone();
        IconCompatParcelizer iconCompatParcelizer = new IconCompatParcelizer(searchTextResponseBodyClone);
        getupdates.AudioAttributesCompatParcelizer(iconCompatParcelizer);
        if (iconCompatParcelizer.write()) {
            return;
        }
        try {
            getTopicStat<T> gettopicstat = searchTextResponseBodyClone.read();
            if (!iconCompatParcelizer.write()) {
                getupdates.read(gettopicstat);
            }
            if (iconCompatParcelizer.write()) {
                return;
            }
            try {
                getupdates.aI_();
            } catch (Throwable th) {
                th = th;
                z = true;
                getEndTimeMs.RemoteActionCompatParcelizer(th);
                if (z) {
                    getPaymentRefIds.RemoteActionCompatParcelizer(th);
                    return;
                }
                if (iconCompatParcelizer.write()) {
                    return;
                }
                try {
                    getupdates.IconCompatParcelizer(th);
                } catch (Throwable th2) {
                    getEndTimeMs.RemoteActionCompatParcelizer(th2);
                    getPaymentRefIds.RemoteActionCompatParcelizer(new getPytIds(th, th2));
                }
            }
        } catch (Throwable th3) {
            th = th3;
            z = false;
        }
    }

    static final class IconCompatParcelizer implements MarkIncompleteResponseBody {
        private volatile boolean AudioAttributesCompatParcelizer;
        private final SearchTextResponseBody<?> write;

        IconCompatParcelizer(SearchTextResponseBody<?> searchTextResponseBody) {
            this.write = searchTextResponseBody;
        }

        @Override // kotlin.MarkIncompleteResponseBody
        public final void aL_() {
            this.AudioAttributesCompatParcelizer = true;
            this.write.RemoteActionCompatParcelizer();
        }

        @Override // kotlin.MarkIncompleteResponseBody
        public final boolean write() {
            return this.AudioAttributesCompatParcelizer;
        }
    }
}
