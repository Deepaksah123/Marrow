package kotlin;

import android.graphics.PointF;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class notifyTrackSelectionRebuffer implements resolvePendingMessagePosition<PointF, PointF> {
    private final List<setEncoderDelay<PointF>> write;

    public notifyTrackSelectionRebuffer(List<setEncoderDelay<PointF>> list) {
        this.write = list;
    }

    @Override // kotlin.resolvePendingMessagePosition
    public final List<setEncoderDelay<PointF>> RemoteActionCompatParcelizer() {
        return this.write;
    }

    @Override // kotlin.resolvePendingMessagePosition
    public final boolean AudioAttributesCompatParcelizer() {
        return this.write.size() == 1 && this.write.get(0).MediaBrowserCompatItemReceiver();
    }

    @Override // kotlin.resolvePendingMessagePosition
    public final ExoPlayerImplComponentListenerExternalSyntheticLambda5<PointF, PointF> read() {
        if (this.write.get(0).MediaBrowserCompatItemReceiver()) {
            return new getTimeline(this.write);
        }
        return new r8lambdaGiYIuSgkdcClbkNSWm6YyOduvLI(this.write);
    }
}
