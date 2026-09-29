package kotlin;

import android.graphics.PointF;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class prepareInternal implements resolvePendingMessagePosition<PointF, PointF> {
    private final mediaSourceListUpdateRequestedInternal RemoteActionCompatParcelizer;
    private final mediaSourceListUpdateRequestedInternal read;

    public prepareInternal(mediaSourceListUpdateRequestedInternal mediasourcelistupdaterequestedinternal, mediaSourceListUpdateRequestedInternal mediasourcelistupdaterequestedinternal2) {
        this.read = mediasourcelistupdaterequestedinternal;
        this.RemoteActionCompatParcelizer = mediasourcelistupdaterequestedinternal2;
    }

    @Override // kotlin.resolvePendingMessagePosition
    public final List<setEncoderDelay<PointF>> RemoteActionCompatParcelizer() {
        throw new UnsupportedOperationException("Cannot call getKeyframes on AnimatableSplitDimensionPathValue.");
    }

    @Override // kotlin.resolvePendingMessagePosition
    public final boolean AudioAttributesCompatParcelizer() {
        return this.read.AudioAttributesCompatParcelizer() && this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer();
    }

    @Override // kotlin.resolvePendingMessagePosition
    public final ExoPlayerImplComponentListenerExternalSyntheticLambda5<PointF, PointF> read() {
        return new doSomeWork(this.read.read(), this.RemoteActionCompatParcelizer.read());
    }
}
