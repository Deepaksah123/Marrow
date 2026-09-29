package kotlin;

import kotlin.getDownloadIndex;

/* JADX INFO: loaded from: classes3.dex */
public enum lambdasetOnFrameRenderedListener0comgoogleandroidexoplayer2mediacodecSynchronousMediaCodecAdapter implements getDownloadIndex.write {
    APPLICATION_PROCESS_STATE_UNKNOWN(0),
    FOREGROUND(1),
    BACKGROUND(2),
    FOREGROUND_BACKGROUND(3);

    private final int MediaBrowserCompatCustomActionResultReceiver;

    static {
        new Object() { // from class: o.lambdasetOnFrameRenderedListener0comgoogleandroidexoplayer2mediacodecSynchronousMediaCodecAdapter.2
        };
    }

    @Override // o.getDownloadIndex.write
    public final int AudioAttributesCompatParcelizer() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    public static getDownloadIndex.AudioAttributesCompatParcelizer write() {
        return AudioAttributesCompatParcelizer.read;
    }

    static final class AudioAttributesCompatParcelizer implements getDownloadIndex.AudioAttributesCompatParcelizer {
        static final getDownloadIndex.AudioAttributesCompatParcelizer read = new AudioAttributesCompatParcelizer();

        private AudioAttributesCompatParcelizer() {
        }
    }

    lambdasetOnFrameRenderedListener0comgoogleandroidexoplayer2mediacodecSynchronousMediaCodecAdapter(int i) {
        this.MediaBrowserCompatCustomActionResultReceiver = i;
    }
}
