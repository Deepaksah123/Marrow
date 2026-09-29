package kotlin;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class setOffloadSchedulingEnabledInternal implements resolvePositionForPlaylistChange {
    private final List<resolvePositionForPlaylistChange> AudioAttributesCompatParcelizer;
    private final String IconCompatParcelizer;
    private final boolean RemoteActionCompatParcelizer;

    public setOffloadSchedulingEnabledInternal(String str, List<resolvePositionForPlaylistChange> list, boolean z) {
        this.IconCompatParcelizer = str;
        this.AudioAttributesCompatParcelizer = list;
        this.RemoteActionCompatParcelizer = z;
    }

    public final String RemoteActionCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public final List<resolvePositionForPlaylistChange> IconCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final boolean write() {
        return this.RemoteActionCompatParcelizer;
    }

    @Override // kotlin.resolvePositionForPlaylistChange
    public final onVideoFrameProcessingOffset RemoteActionCompatParcelizer(ExoPlayerImplExternalSyntheticLambda6 exoPlayerImplExternalSyntheticLambda6, ExoPlayerImplExternalSyntheticLambda19 exoPlayerImplExternalSyntheticLambda19, setShuffleModeEnabledInternal setshufflemodeenabledinternal) {
        return new onVideoDecoderInitialized(exoPlayerImplExternalSyntheticLambda6, setshufflemodeenabledinternal, this, exoPlayerImplExternalSyntheticLambda19);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShapeGroup{name='");
        sb.append(this.IconCompatParcelizer);
        sb.append("' Shapes: ");
        sb.append(Arrays.toString(this.AudioAttributesCompatParcelizer.toArray()));
        sb.append('}');
        return sb.toString();
    }
}
