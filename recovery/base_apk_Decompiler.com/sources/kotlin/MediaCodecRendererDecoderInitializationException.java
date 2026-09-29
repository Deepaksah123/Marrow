package kotlin;

/* JADX INFO: loaded from: classes3.dex */
public class MediaCodecRendererDecoderInitializationException {
    private static volatile MediaCodecRendererDecoderInitializationException read;
    private boolean AudioAttributesCompatParcelizer;
    private final MediaCodecRendererApi31 write;

    public static MediaCodecRendererDecoderInitializationException IconCompatParcelizer() {
        if (read == null) {
            synchronized (MediaCodecRendererDecoderInitializationException.class) {
                if (read == null) {
                    read = new MediaCodecRendererDecoderInitializationException();
                }
            }
        }
        return read;
    }

    private MediaCodecRendererDecoderInitializationException(byte b) {
        this.AudioAttributesCompatParcelizer = false;
        this.write = MediaCodecRendererApi31.AudioAttributesCompatParcelizer();
    }

    private MediaCodecRendererDecoderInitializationException() {
        this((byte) 0);
    }

    public final void write(boolean z) {
        this.AudioAttributesCompatParcelizer = z;
    }

    public final boolean AudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }
}
