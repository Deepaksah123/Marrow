package kotlin;

import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes5.dex */
final class updateAndGetPresentationTimeUs implements MediaCodecAdapter {
    private final IntArrayQueue AudioAttributesCompatParcelizer;
    private final TaskCompletionSource<getLastOutputBufferPresentationTimeUs> IconCompatParcelizer;

    public updateAndGetPresentationTimeUs(IntArrayQueue intArrayQueue, TaskCompletionSource<getLastOutputBufferPresentationTimeUs> taskCompletionSource) {
        this.AudioAttributesCompatParcelizer = intArrayQueue;
        this.IconCompatParcelizer = taskCompletionSource;
    }

    @Override // kotlin.MediaCodecAdapter
    public final boolean RemoteActionCompatParcelizer(createForVideoDecoding createforvideodecoding) {
        if (!createforvideodecoding.MediaDescriptionCompat() || this.AudioAttributesCompatParcelizer.IconCompatParcelizer(createforvideodecoding)) {
            return false;
        }
        this.IconCompatParcelizer.setResult(getLastOutputBufferPresentationTimeUs.read().read(createforvideodecoding.read()).AudioAttributesCompatParcelizer(createforvideodecoding.AudioAttributesCompatParcelizer()).write(createforvideodecoding.AudioAttributesImplApi21Parcelizer()).read());
        return true;
    }

    @Override // kotlin.MediaCodecAdapter
    public final boolean write(Exception exc) {
        this.IconCompatParcelizer.trySetException(exc);
        return true;
    }
}
