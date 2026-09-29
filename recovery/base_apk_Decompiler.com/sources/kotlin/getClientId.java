package kotlin;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes5.dex */
public final class getClientId<T> extends getCurrency<T, T> {
    private long read;

    public getClientId(LessonIndexResponseBody<T> lessonIndexResponseBody, long j) {
        super(lessonIndexResponseBody);
        this.read = Long.MAX_VALUE;
    }

    @Override // kotlin.LessonIndexResponseBody
    public final void AudioAttributesCompatParcelizer(getUpdates<? super T> getupdates) {
        getTimelineTitle gettimelinetitle = new getTimelineTitle();
        getupdates.AudioAttributesCompatParcelizer(gettimelinetitle);
        long j = this.read;
        new write(getupdates, j != Long.MAX_VALUE ? j - 1 : Long.MAX_VALUE, gettimelinetitle, this.write).RemoteActionCompatParcelizer();
    }

    static final class write<T> extends AtomicInteger implements getUpdates<T> {
        private long AudioAttributesCompatParcelizer;
        private findTheInteractiveElementWhichIsInBetween<? extends T> IconCompatParcelizer;
        private getUpdates<? super T> RemoteActionCompatParcelizer;
        private getTimelineTitle read;

        write(getUpdates<? super T> getupdates, long j, getTimelineTitle gettimelinetitle, findTheInteractiveElementWhichIsInBetween<? extends T> findtheinteractiveelementwhichisinbetween) {
            this.RemoteActionCompatParcelizer = getupdates;
            this.read = gettimelinetitle;
            this.IconCompatParcelizer = findtheinteractiveelementwhichisinbetween;
            this.AudioAttributesCompatParcelizer = j;
        }

        @Override // kotlin.getUpdates
        public final void AudioAttributesCompatParcelizer(MarkIncompleteResponseBody markIncompleteResponseBody) {
            this.read.AudioAttributesCompatParcelizer(markIncompleteResponseBody);
        }

        @Override // kotlin.getUpdates
        public final void read(T t) {
            this.RemoteActionCompatParcelizer.read(t);
        }

        @Override // kotlin.getUpdates
        public final void IconCompatParcelizer(Throwable th) {
            this.RemoteActionCompatParcelizer.IconCompatParcelizer(th);
        }

        @Override // kotlin.getUpdates
        public final void aI_() {
            long j = this.AudioAttributesCompatParcelizer;
            if (j != Long.MAX_VALUE) {
                this.AudioAttributesCompatParcelizer = j - 1;
            }
            if (j != 0) {
                RemoteActionCompatParcelizer();
            } else {
                this.RemoteActionCompatParcelizer.aI_();
            }
        }

        final void RemoteActionCompatParcelizer() {
            if (getAndIncrement() == 0) {
                int iAddAndGet = 1;
                while (!this.read.write()) {
                    this.IconCompatParcelizer.write(this);
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
            }
        }
    }
}
