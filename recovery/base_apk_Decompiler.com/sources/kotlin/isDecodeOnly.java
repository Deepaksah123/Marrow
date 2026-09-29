package kotlin;

import android.hardware.Sensor;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final class isDecodeOnly implements Callable {
    private /* synthetic */ Sensor RemoteActionCompatParcelizer;
    private /* synthetic */ releaseInputBufferInternal read;

    public isDecodeOnly(releaseInputBufferInternal releaseinputbufferinternal, Sensor sensor) {
        this.read = releaseinputbufferinternal;
        this.RemoteActionCompatParcelizer = sensor;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        releaseInputBufferInternal releaseinputbufferinternal = this.read;
        releaseOutputBuffer releaseoutputbuffer = releaseinputbufferinternal.write;
        return releaseoutputbuffer.IconCompatParcelizer ? releaseInputBufferInternal.read(releaseinputbufferinternal, this.RemoteActionCompatParcelizer, releaseoutputbuffer.read, releaseoutputbuffer.AudioAttributesCompatParcelizer, releaseoutputbuffer.write) : IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
    }
}
