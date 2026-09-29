package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lo/AudioBecomingNoisyManager;", "Lo/setVisibleYRange;", "<init>", "()V", "Lo/setDrawSliceText;", "p0", "", "AudioAttributesCompatParcelizer", "(Lo/setDrawSliceText;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AudioBecomingNoisyManager extends setVisibleYRange {
    public static final AudioBecomingNoisyManager INSTANCE = new AudioBecomingNoisyManager();

    private AudioBecomingNoisyManager() {
        super(11, 12);
    }

    @Override // kotlin.setVisibleYRange
    public final void AudioAttributesCompatParcelizer(setDrawSliceText p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        p0.AudioAttributesCompatParcelizer("ALTER TABLE workspec ADD COLUMN `out_of_quota_policy` INTEGER NOT NULL DEFAULT 0");
    }
}
