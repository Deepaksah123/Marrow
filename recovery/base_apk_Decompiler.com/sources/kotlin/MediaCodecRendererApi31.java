package kotlin;

/* JADX INFO: loaded from: classes3.dex */
class MediaCodecRendererApi31 {
    private static MediaCodecRendererApi31 write;

    public static MediaCodecRendererApi31 AudioAttributesCompatParcelizer() {
        MediaCodecRendererApi31 mediaCodecRendererApi31;
        synchronized (MediaCodecRendererApi31.class) {
            if (write == null) {
                write = new MediaCodecRendererApi31();
            }
            mediaCodecRendererApi31 = write;
        }
        return mediaCodecRendererApi31;
    }

    private MediaCodecRendererApi31() {
    }
}
