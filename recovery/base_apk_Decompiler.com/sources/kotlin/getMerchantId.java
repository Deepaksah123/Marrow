package kotlin;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes5.dex */
public final class getMerchantId extends LessonIndexResponseBody<Long> {
    private getIds AudioAttributesCompatParcelizer;
    private TimeUnit IconCompatParcelizer;
    private long RemoteActionCompatParcelizer;

    public getMerchantId(long j, TimeUnit timeUnit, getIds getids) {
        this.RemoteActionCompatParcelizer = j;
        this.IconCompatParcelizer = timeUnit;
        this.AudioAttributesCompatParcelizer = getids;
    }

    @Override // kotlin.LessonIndexResponseBody
    public final void AudioAttributesCompatParcelizer(getUpdates<? super Long> getupdates) {
        RemoteActionCompatParcelizer remoteActionCompatParcelizer = new RemoteActionCompatParcelizer(getupdates);
        getupdates.AudioAttributesCompatParcelizer(remoteActionCompatParcelizer);
        remoteActionCompatParcelizer.IconCompatParcelizer(this.AudioAttributesCompatParcelizer.IconCompatParcelizer(remoteActionCompatParcelizer, this.RemoteActionCompatParcelizer, this.IconCompatParcelizer));
    }

    static final class RemoteActionCompatParcelizer extends AtomicReference<MarkIncompleteResponseBody> implements MarkIncompleteResponseBody, Runnable {
        private getUpdates<? super Long> read;

        RemoteActionCompatParcelizer(getUpdates<? super Long> getupdates) {
            this.read = getupdates;
        }

        @Override // kotlin.MarkIncompleteResponseBody
        public final void aL_() {
            getSubjectId.RemoteActionCompatParcelizer(this);
        }

        @Override // kotlin.MarkIncompleteResponseBody
        public final boolean write() {
            return get() == getSubjectId.DISPOSED;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (write()) {
                return;
            }
            this.read.read(0L);
            lazySet(isLessonPaid.INSTANCE);
            this.read.aI_();
        }

        public final void IconCompatParcelizer(MarkIncompleteResponseBody markIncompleteResponseBody) {
            getSubjectId.read((AtomicReference<MarkIncompleteResponseBody>) this, markIncompleteResponseBody);
        }
    }
}
