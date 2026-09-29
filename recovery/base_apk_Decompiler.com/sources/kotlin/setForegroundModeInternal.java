package kotlin;

import android.graphics.PointF;

/* JADX INFO: loaded from: classes2.dex */
public final class setForegroundModeInternal implements resolvePositionForPlaylistChange {
    private final resolvePendingMessagePosition<PointF, PointF> AudioAttributesCompatParcelizer;
    private final String IconCompatParcelizer;
    private final mediaSourceListUpdateRequestedInternal RemoteActionCompatParcelizer;
    private final boolean read;
    private final resolvePendingMessagePosition<PointF, PointF> write;

    public setForegroundModeInternal(String str, resolvePendingMessagePosition<PointF, PointF> resolvependingmessageposition, resolvePendingMessagePosition<PointF, PointF> resolvependingmessageposition2, mediaSourceListUpdateRequestedInternal mediasourcelistupdaterequestedinternal, boolean z) {
        this.IconCompatParcelizer = str;
        this.write = resolvependingmessageposition;
        this.AudioAttributesCompatParcelizer = resolvependingmessageposition2;
        this.RemoteActionCompatParcelizer = mediasourcelistupdaterequestedinternal;
        this.read = z;
    }

    public final String AudioAttributesCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public final mediaSourceListUpdateRequestedInternal write() {
        return this.RemoteActionCompatParcelizer;
    }

    public final resolvePendingMessagePosition<PointF, PointF> IconCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final resolvePendingMessagePosition<PointF, PointF> RemoteActionCompatParcelizer() {
        return this.write;
    }

    public final boolean read() {
        return this.read;
    }

    @Override // kotlin.resolvePositionForPlaylistChange
    public final onVideoFrameProcessingOffset RemoteActionCompatParcelizer(ExoPlayerImplExternalSyntheticLambda6 exoPlayerImplExternalSyntheticLambda6, ExoPlayerImplExternalSyntheticLambda19 exoPlayerImplExternalSyntheticLambda19, setShuffleModeEnabledInternal setshufflemodeenabledinternal) {
        return new surfaceDestroyed(exoPlayerImplExternalSyntheticLambda6, setshufflemodeenabledinternal, this);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RectangleShape{position=");
        sb.append(this.write);
        sb.append(", size=");
        sb.append(this.AudioAttributesCompatParcelizer);
        sb.append('}');
        return sb.toString();
    }
}
