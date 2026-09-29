package kotlin;

/* JADX INFO: loaded from: classes3.dex */
public final class applyWorkarounds extends getAlternativeCodecMimeType {
    private final SynchronousMediaCodecAdapter RemoteActionCompatParcelizer;

    static {
        MediaCodecRendererDecoderInitializationException.IconCompatParcelizer();
    }

    applyWorkarounds(SynchronousMediaCodecAdapter synchronousMediaCodecAdapter) {
        this.RemoteActionCompatParcelizer = synchronousMediaCodecAdapter;
    }

    @Override // kotlin.getAlternativeCodecMimeType
    public final boolean AudioAttributesCompatParcelizer() {
        return read();
    }

    private boolean read() {
        SynchronousMediaCodecAdapter synchronousMediaCodecAdapter = this.RemoteActionCompatParcelizer;
        if (synchronousMediaCodecAdapter == null || !synchronousMediaCodecAdapter.AudioAttributesImplApi26Parcelizer() || !this.RemoteActionCompatParcelizer.AudioAttributesImplBaseParcelizer() || !this.RemoteActionCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver()) {
            return false;
        }
        if (this.RemoteActionCompatParcelizer.write()) {
            return this.RemoteActionCompatParcelizer.IconCompatParcelizer().AudioAttributesCompatParcelizer() && this.RemoteActionCompatParcelizer.IconCompatParcelizer().RemoteActionCompatParcelizer();
        }
        return true;
    }
}
