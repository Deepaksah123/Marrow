package kotlin;

import android.graphics.Path;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class replaceStreamsOrDisableRendererForTransition extends resolvePendingMessagePositions<setMediaItemsInternal, Path> {
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

    public replaceStreamsOrDisableRendererForTransition(List<setEncoderDelay<setMediaItemsInternal>> list) {
        super(list);
    }

    @Override // kotlin.resolvePendingMessagePosition
    /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
    public final disableRenderer read() {
        return new disableRenderer(this.AudioAttributesCompatParcelizer);
    }
}
