package kotlin;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class getCustomerEmail<T> extends getCurrency<T, T> {
    private getIds RemoteActionCompatParcelizer;

    public getCustomerEmail(findTheInteractiveElementWhichIsInBetween<T> findtheinteractiveelementwhichisinbetween, getIds getids) {
        super(findtheinteractiveelementwhichisinbetween);
        this.RemoteActionCompatParcelizer = getids;
    }

    @Override // kotlin.LessonIndexResponseBody
    public final void AudioAttributesCompatParcelizer(getUpdates<? super T> getupdates) {
        read readVar = new read(getupdates);
        getupdates.AudioAttributesCompatParcelizer(readVar);
        readVar.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer.IconCompatParcelizer(new IconCompatParcelizer(readVar)));
    }

    static final class read<T> extends AtomicReference<MarkIncompleteResponseBody> implements getUpdates<T>, MarkIncompleteResponseBody {
        private getUpdates<? super T> AudioAttributesCompatParcelizer;
        private AtomicReference<MarkIncompleteResponseBody> write = new AtomicReference<>();

        read(getUpdates<? super T> getupdates) {
            this.AudioAttributesCompatParcelizer = getupdates;
        }

        @Override // kotlin.getUpdates
        public final void AudioAttributesCompatParcelizer(MarkIncompleteResponseBody markIncompleteResponseBody) {
            getSubjectId.AudioAttributesCompatParcelizer(this.write, markIncompleteResponseBody);
        }

        @Override // kotlin.getUpdates
        public final void read(T t) {
            this.AudioAttributesCompatParcelizer.read(t);
        }

        @Override // kotlin.getUpdates
        public final void IconCompatParcelizer(Throwable th) {
            this.AudioAttributesCompatParcelizer.IconCompatParcelizer(th);
        }

        @Override // kotlin.getUpdates
        public final void aI_() {
            this.AudioAttributesCompatParcelizer.aI_();
        }

        @Override // kotlin.MarkIncompleteResponseBody
        public final void aL_() {
            getSubjectId.RemoteActionCompatParcelizer(this.write);
            getSubjectId.RemoteActionCompatParcelizer(this);
        }

        @Override // kotlin.MarkIncompleteResponseBody
        public final boolean write() {
            return getSubjectId.AudioAttributesCompatParcelizer(get());
        }

        final void RemoteActionCompatParcelizer(MarkIncompleteResponseBody markIncompleteResponseBody) {
            getSubjectId.AudioAttributesCompatParcelizer(this, markIncompleteResponseBody);
        }
    }

    final class IconCompatParcelizer implements Runnable {
        private final read<T> AudioAttributesCompatParcelizer;

        IconCompatParcelizer(read<T> readVar) {
            this.AudioAttributesCompatParcelizer = readVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            getCustomerEmail.this.write.write(this.AudioAttributesCompatParcelizer);
        }
    }
}
