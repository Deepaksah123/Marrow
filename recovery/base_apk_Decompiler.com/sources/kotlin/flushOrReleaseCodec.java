package kotlin;

import java.lang.ref.WeakReference;
import kotlin.getCodecOutputMediaFormat;

/* JADX INFO: loaded from: classes3.dex */
public abstract class flushOrReleaseCodec implements getCodecOutputMediaFormat.write {
    private final WeakReference<getCodecOutputMediaFormat.write> IconCompatParcelizer;
    private final getCodecOutputMediaFormat RemoteActionCompatParcelizer;
    private lambdasetOnFrameRenderedListener0comgoogleandroidexoplayer2mediacodecSynchronousMediaCodecAdapter read;
    private boolean write;

    protected flushOrReleaseCodec() {
        this(getCodecOutputMediaFormat.RemoteActionCompatParcelizer());
    }

    public flushOrReleaseCodec(getCodecOutputMediaFormat getcodecoutputmediaformat) {
        this.write = false;
        this.read = lambdasetOnFrameRenderedListener0comgoogleandroidexoplayer2mediacodecSynchronousMediaCodecAdapter.APPLICATION_PROCESS_STATE_UNKNOWN;
        this.RemoteActionCompatParcelizer = getcodecoutputmediaformat;
        this.IconCompatParcelizer = new WeakReference<>(this);
    }

    protected final void read() {
        if (this.write) {
            return;
        }
        this.read = this.RemoteActionCompatParcelizer.IconCompatParcelizer();
        this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(this.IconCompatParcelizer);
        this.write = true;
    }

    protected final void IconCompatParcelizer() {
        if (this.write) {
            this.RemoteActionCompatParcelizer.write(this.IconCompatParcelizer);
            this.write = false;
        }
    }

    protected final void AudioAttributesCompatParcelizer() {
        this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(1);
    }

    @Override // o.getCodecOutputMediaFormat.write
    public final void AudioAttributesCompatParcelizer(lambdasetOnFrameRenderedListener0comgoogleandroidexoplayer2mediacodecSynchronousMediaCodecAdapter lambdasetonframerenderedlistener0comgoogleandroidexoplayer2mediacodecsynchronousmediacodecadapter) {
        if (this.read == lambdasetOnFrameRenderedListener0comgoogleandroidexoplayer2mediacodecSynchronousMediaCodecAdapter.APPLICATION_PROCESS_STATE_UNKNOWN) {
            this.read = lambdasetonframerenderedlistener0comgoogleandroidexoplayer2mediacodecsynchronousmediacodecadapter;
        } else {
            if (this.read == lambdasetonframerenderedlistener0comgoogleandroidexoplayer2mediacodecsynchronousmediacodecadapter || lambdasetonframerenderedlistener0comgoogleandroidexoplayer2mediacodecsynchronousmediacodecadapter == lambdasetOnFrameRenderedListener0comgoogleandroidexoplayer2mediacodecSynchronousMediaCodecAdapter.APPLICATION_PROCESS_STATE_UNKNOWN) {
                return;
            }
            this.read = lambdasetOnFrameRenderedListener0comgoogleandroidexoplayer2mediacodecSynchronousMediaCodecAdapter.FOREGROUND_BACKGROUND;
        }
    }

    public final lambdasetOnFrameRenderedListener0comgoogleandroidexoplayer2mediacodecSynchronousMediaCodecAdapter write() {
        return this.read;
    }
}
