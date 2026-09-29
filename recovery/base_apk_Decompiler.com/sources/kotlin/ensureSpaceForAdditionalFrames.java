package kotlin;

import android.location.Location;

/* JADX INFO: loaded from: classes2.dex */
public final class ensureSpaceForAdditionalFrames extends MagicModuleUseCase implements getAnswerMap {
    private /* synthetic */ interpolate AudioAttributesCompatParcelizer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ensureSpaceForAdditionalFrames(interpolate interpolateVar) {
        super(1);
        this.AudioAttributesCompatParcelizer = interpolateVar;
    }

    @Override // kotlin.getAnswerMap
    public final Object invoke(Object obj) {
        this.AudioAttributesCompatParcelizer.IconCompatParcelizer((Location) obj);
        return getShowPopup.INSTANCE;
    }
}
