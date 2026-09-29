package kotlin;

import kotlin.onFlushCompleted;

/* JADX INFO: loaded from: classes3.dex */
final class Ac3ExtractorExternalSyntheticLambda0<T> implements onInputBufferAvailable<T>, onFlushCompleted<T> {
    private onFlushCompleted.AudioAttributesCompatParcelizer<T> AudioAttributesCompatParcelizer;
    private volatile onInputBufferAvailable<T> read;
    private static final onFlushCompleted.AudioAttributesCompatParcelizer<Object> RemoteActionCompatParcelizer = new onFlushCompleted.AudioAttributesCompatParcelizer() { // from class: o.decodeBlockSize
        @Override // o.onFlushCompleted.AudioAttributesCompatParcelizer
        public final void read(onInputBufferAvailable oninputbufferavailable) {
            Ac3ExtractorExternalSyntheticLambda0.read();
        }
    };
    private static final onInputBufferAvailable<Object> IconCompatParcelizer = new onInputBufferAvailable() { // from class: o.readSetupHeaders
        @Override // kotlin.onInputBufferAvailable
        public final Object write() {
            return Ac3ExtractorExternalSyntheticLambda0.RemoteActionCompatParcelizer();
        }
    };

    static /* synthetic */ Object RemoteActionCompatParcelizer() {
        return null;
    }

    static /* synthetic */ void read() {
    }

    private Ac3ExtractorExternalSyntheticLambda0(onFlushCompleted.AudioAttributesCompatParcelizer<T> audioAttributesCompatParcelizer, onInputBufferAvailable<T> oninputbufferavailable) {
        this.AudioAttributesCompatParcelizer = audioAttributesCompatParcelizer;
        this.read = oninputbufferavailable;
    }

    static <T> Ac3ExtractorExternalSyntheticLambda0<T> IconCompatParcelizer() {
        return new Ac3ExtractorExternalSyntheticLambda0<>(RemoteActionCompatParcelizer, IconCompatParcelizer);
    }

    static <T> Ac3ExtractorExternalSyntheticLambda0<T> AudioAttributesCompatParcelizer(onInputBufferAvailable<T> oninputbufferavailable) {
        return new Ac3ExtractorExternalSyntheticLambda0<>(null, oninputbufferavailable);
    }

    @Override // kotlin.onInputBufferAvailable
    public final T write() {
        return this.read.write();
    }

    final void IconCompatParcelizer(onInputBufferAvailable<T> oninputbufferavailable) {
        onFlushCompleted.AudioAttributesCompatParcelizer<T> audioAttributesCompatParcelizer;
        if (this.read != IconCompatParcelizer) {
            throw new IllegalStateException("provide() can be called only once.");
        }
        synchronized (this) {
            audioAttributesCompatParcelizer = this.AudioAttributesCompatParcelizer;
            this.AudioAttributesCompatParcelizer = null;
            this.read = oninputbufferavailable;
        }
        audioAttributesCompatParcelizer.read(oninputbufferavailable);
    }

    @Override // kotlin.onFlushCompleted
    public final void write(final onFlushCompleted.AudioAttributesCompatParcelizer<T> audioAttributesCompatParcelizer) {
        onInputBufferAvailable<T> oninputbufferavailable;
        onInputBufferAvailable<T> oninputbufferavailable2;
        onInputBufferAvailable<T> oninputbufferavailable3 = this.read;
        onInputBufferAvailable<Object> oninputbufferavailable4 = IconCompatParcelizer;
        if (oninputbufferavailable3 != oninputbufferavailable4) {
            audioAttributesCompatParcelizer.read(oninputbufferavailable3);
            return;
        }
        synchronized (this) {
            oninputbufferavailable = this.read;
            if (oninputbufferavailable != oninputbufferavailable4) {
                oninputbufferavailable2 = oninputbufferavailable;
            } else {
                final onFlushCompleted.AudioAttributesCompatParcelizer<T> audioAttributesCompatParcelizer2 = this.AudioAttributesCompatParcelizer;
                this.AudioAttributesCompatParcelizer = new onFlushCompleted.AudioAttributesCompatParcelizer() { // from class: o.createTracks
                    @Override // o.onFlushCompleted.AudioAttributesCompatParcelizer
                    public final void read(onInputBufferAvailable oninputbufferavailable5) {
                        Ac3ExtractorExternalSyntheticLambda0.read(audioAttributesCompatParcelizer2, audioAttributesCompatParcelizer, oninputbufferavailable5);
                    }
                };
                oninputbufferavailable2 = null;
            }
        }
        if (oninputbufferavailable2 != null) {
            audioAttributesCompatParcelizer.read(oninputbufferavailable);
        }
    }

    static /* synthetic */ void read(onFlushCompleted.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer, onFlushCompleted.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer2, onInputBufferAvailable oninputbufferavailable) {
        audioAttributesCompatParcelizer.read(oninputbufferavailable);
        audioAttributesCompatParcelizer2.read(oninputbufferavailable);
    }
}
