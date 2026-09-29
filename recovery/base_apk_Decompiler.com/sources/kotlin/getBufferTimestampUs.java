package kotlin;

import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes5.dex */
final class getBufferTimestampUs implements MediaCodecAdapter {
    private TaskCompletionSource<String> write;

    @Override // kotlin.MediaCodecAdapter
    public final boolean write(Exception exc) {
        return false;
    }

    public getBufferTimestampUs(TaskCompletionSource<String> taskCompletionSource) {
        this.write = taskCompletionSource;
    }

    @Override // kotlin.MediaCodecAdapter
    public final boolean RemoteActionCompatParcelizer(createForVideoDecoding createforvideodecoding) {
        if (!createforvideodecoding.RatingCompat() && !createforvideodecoding.MediaDescriptionCompat() && !createforvideodecoding.MediaBrowserCompatItemReceiver()) {
            return false;
        }
        this.write.trySetResult(createforvideodecoding.write());
        return true;
    }
}
