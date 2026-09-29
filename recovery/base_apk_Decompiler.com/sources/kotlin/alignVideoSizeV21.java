package kotlin;

/* JADX INFO: loaded from: classes5.dex */
public final class alignVideoSizeV21 implements MediaCodecDecoderException {
    private static alignVideoSizeV21 write;

    private alignVideoSizeV21() {
    }

    public static alignVideoSizeV21 read() {
        if (write == null) {
            write = new alignVideoSizeV21();
        }
        return write;
    }

    @Override // kotlin.MediaCodecDecoderException
    public final long IconCompatParcelizer() {
        return System.currentTimeMillis();
    }
}
