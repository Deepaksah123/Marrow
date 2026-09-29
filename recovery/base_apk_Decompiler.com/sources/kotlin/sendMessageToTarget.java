package kotlin;

/* JADX INFO: loaded from: classes2.dex */
public final class sendMessageToTarget {
    private final boolean IconCompatParcelizer;
    private final AudioAttributesCompatParcelizer RemoteActionCompatParcelizer;
    private final notifyTrackSelectionPlayWhenReadyChanged read;
    private final replaceStreamsOrDisableRendererForTransition write;

    public enum AudioAttributesCompatParcelizer {
        MASK_MODE_ADD,
        MASK_MODE_SUBTRACT,
        MASK_MODE_INTERSECT,
        MASK_MODE_NONE
    }

    public sendMessageToTarget(AudioAttributesCompatParcelizer audioAttributesCompatParcelizer, replaceStreamsOrDisableRendererForTransition replacestreamsordisablerendererfortransition, notifyTrackSelectionPlayWhenReadyChanged notifytrackselectionplaywhenreadychanged, boolean z) {
        this.RemoteActionCompatParcelizer = audioAttributesCompatParcelizer;
        this.write = replacestreamsordisablerendererfortransition;
        this.read = notifytrackselectionplaywhenreadychanged;
        this.IconCompatParcelizer = z;
    }

    public final AudioAttributesCompatParcelizer AudioAttributesCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public final replaceStreamsOrDisableRendererForTransition read() {
        return this.write;
    }

    public final notifyTrackSelectionPlayWhenReadyChanged write() {
        return this.read;
    }

    public final boolean IconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }
}
