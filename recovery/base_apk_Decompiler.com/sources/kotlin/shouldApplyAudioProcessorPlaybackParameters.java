package kotlin;

import android.location.Location;

/* JADX INFO: loaded from: classes2.dex */
public final class shouldApplyAudioProcessorPlaybackParameters extends MagicModuleUseCase implements getAnswerMap {
    private /* synthetic */ interpolate read;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public shouldApplyAudioProcessorPlaybackParameters(interpolate interpolateVar) {
        super(1);
        this.read = interpolateVar;
    }

    @Override // kotlin.getAnswerMap
    public final Object invoke(Object obj) {
        this.read.IconCompatParcelizer((Location) obj);
        return getShowPopup.INSTANCE;
    }
}
