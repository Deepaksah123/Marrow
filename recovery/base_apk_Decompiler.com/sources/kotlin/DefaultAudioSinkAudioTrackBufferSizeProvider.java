package kotlin;

import android.content.Context;
import android.hardware.input.InputManager;

/* JADX INFO: loaded from: classes2.dex */
public final class DefaultAudioSinkAudioTrackBufferSizeProvider extends MagicModuleUseCase implements getCreatedOnDateMs {
    private /* synthetic */ Context AudioAttributesCompatParcelizer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultAudioSinkAudioTrackBufferSizeProvider(Context context) {
        super(0);
        this.AudioAttributesCompatParcelizer = context;
    }

    @Override // kotlin.getCreatedOnDateMs
    public final Object invoke() {
        return (InputManager) this.AudioAttributesCompatParcelizer.getSystemService("input");
    }
}
