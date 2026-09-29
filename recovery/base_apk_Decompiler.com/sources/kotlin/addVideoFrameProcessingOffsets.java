package kotlin;

import android.hardware.Sensor;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final class addVideoFrameProcessingOffsets implements Callable {
    private /* synthetic */ releaseInputBufferInternal AudioAttributesCompatParcelizer;
    private /* synthetic */ Sensor read;

    public addVideoFrameProcessingOffsets(releaseInputBufferInternal releaseinputbufferinternal, Sensor sensor) {
        this.AudioAttributesCompatParcelizer = releaseinputbufferinternal;
        this.read = sensor;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        releaseInputBufferInternal releaseinputbufferinternal = this.AudioAttributesCompatParcelizer;
        releaseOutputBuffer releaseoutputbuffer = releaseinputbufferinternal.write;
        return releaseoutputbuffer.RemoteActionCompatParcelizer ? releaseInputBufferInternal.read(releaseinputbufferinternal, this.read, releaseoutputbuffer.MediaBrowserCompatItemReceiver, releaseoutputbuffer.MediaBrowserCompatCustomActionResultReceiver, releaseoutputbuffer.AudioAttributesImplBaseParcelizer) : IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
    }
}
