package kotlin;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class resetRendererPosition extends resolvePendingMessagePositions<isTimelineReady, isTimelineReady> {
    @Override // kotlin.resolvePendingMessagePositions, kotlin.resolvePendingMessagePosition
    public final /* bridge */ /* synthetic */ boolean AudioAttributesCompatParcelizer() {
        return super.AudioAttributesCompatParcelizer();
    }

    @Override // kotlin.resolvePendingMessagePositions, kotlin.resolvePendingMessagePosition
    public final /* bridge */ /* synthetic */ List RemoteActionCompatParcelizer() {
        return super.RemoteActionCompatParcelizer();
    }

    @Override // kotlin.resolvePendingMessagePositions
    public final /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    public resetRendererPosition(List<setEncoderDelay<isTimelineReady>> list) {
        super(list);
    }

    @Override // kotlin.resolvePendingMessagePosition
    /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public final deliverMessage read() {
        return new deliverMessage(this.AudioAttributesCompatParcelizer);
    }
}
