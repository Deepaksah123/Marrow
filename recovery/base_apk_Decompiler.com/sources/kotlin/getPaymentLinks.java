package kotlin;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class getPaymentLinks<T> extends getBasePrice<T, T> {
    private getIds read;

    public getPaymentLinks(InteractiveVideoElementUiModelCompanion<T> interactiveVideoElementUiModelCompanion, getIds getids) {
        super(interactiveVideoElementUiModelCompanion);
        this.read = getids;
    }

    @Override // kotlin.getEmptyState
    public final void RemoteActionCompatParcelizer(InteractiveVideoElementUiModelKt<? super T> interactiveVideoElementUiModelKt) {
        read readVar = new read(interactiveVideoElementUiModelKt);
        interactiveVideoElementUiModelKt.IconCompatParcelizer(readVar);
        readVar.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(this.read.IconCompatParcelizer(new write(readVar, this.write)));
    }

    static final class write<T> implements Runnable {
        private InteractiveVideoElementUiModelKt<? super T> AudioAttributesCompatParcelizer;
        private InteractiveVideoElementUiModelCompanion<T> IconCompatParcelizer;

        write(InteractiveVideoElementUiModelKt<? super T> interactiveVideoElementUiModelKt, InteractiveVideoElementUiModelCompanion<T> interactiveVideoElementUiModelCompanion) {
            this.AudioAttributesCompatParcelizer = interactiveVideoElementUiModelKt;
            this.IconCompatParcelizer = interactiveVideoElementUiModelCompanion;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.IconCompatParcelizer.write(this.AudioAttributesCompatParcelizer);
        }
    }

    static final class read<T> extends AtomicReference<MarkIncompleteResponseBody> implements InteractiveVideoElementUiModelKt<T>, MarkIncompleteResponseBody {
        private InteractiveVideoElementUiModelKt<? super T> IconCompatParcelizer;
        final getTimelineTitle RemoteActionCompatParcelizer = new getTimelineTitle();

        read(InteractiveVideoElementUiModelKt<? super T> interactiveVideoElementUiModelKt) {
            this.IconCompatParcelizer = interactiveVideoElementUiModelKt;
        }

        @Override // kotlin.MarkIncompleteResponseBody
        public final void aL_() {
            getSubjectId.RemoteActionCompatParcelizer(this);
            this.RemoteActionCompatParcelizer.aL_();
        }

        @Override // kotlin.MarkIncompleteResponseBody
        public final boolean write() {
            return getSubjectId.AudioAttributesCompatParcelizer(get());
        }

        @Override // kotlin.InteractiveVideoElementUiModelKt
        public final void IconCompatParcelizer(MarkIncompleteResponseBody markIncompleteResponseBody) {
            getSubjectId.AudioAttributesCompatParcelizer(this, markIncompleteResponseBody);
        }

        @Override // kotlin.InteractiveVideoElementUiModelKt
        public final void AudioAttributesCompatParcelizer(T t) {
            this.IconCompatParcelizer.AudioAttributesCompatParcelizer(t);
        }

        @Override // kotlin.InteractiveVideoElementUiModelKt
        public final void IconCompatParcelizer(Throwable th) {
            this.IconCompatParcelizer.IconCompatParcelizer(th);
        }

        @Override // kotlin.InteractiveVideoElementUiModelKt
        public final void aK_() {
            this.IconCompatParcelizer.aK_();
        }
    }
}
