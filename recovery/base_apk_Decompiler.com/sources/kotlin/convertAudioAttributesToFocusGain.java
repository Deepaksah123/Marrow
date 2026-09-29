package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lo/convertAudioAttributesToFocusGain;", "Lo/setVisibleYRange;", "<init>", "()V", "Lo/setDrawSliceText;", "p0", "", "AudioAttributesCompatParcelizer", "(Lo/setDrawSliceText;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class convertAudioAttributesToFocusGain extends setVisibleYRange {
    public static final convertAudioAttributesToFocusGain INSTANCE = new convertAudioAttributesToFocusGain();

    private convertAudioAttributesToFocusGain() {
        super(3, 4);
    }

    @Override // kotlin.setVisibleYRange
    public final void AudioAttributesCompatParcelizer(setDrawSliceText p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        p0.AudioAttributesCompatParcelizer("\n    UPDATE workspec SET schedule_requested_at = 0\n    WHERE state NOT IN (2, 3, 5)\n        AND schedule_requested_at = -1\n        AND interval_duration <> 0\n    ");
    }
}
