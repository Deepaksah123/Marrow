package kotlin;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class mediaSourceListUpdateRequestedInternal extends resolvePendingMessagePositions<Float, Float> {
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

    public mediaSourceListUpdateRequestedInternal(List<setEncoderDelay<Float>> list) {
        super(list);
    }

    @Override // kotlin.resolvePendingMessagePosition
    /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
    public final onCameraMotion read() {
        return new onCameraMotion(this.AudioAttributesCompatParcelizer);
    }
}
