package kotlin;

import android.content.Context;
import android.hardware.SensorManager;

/* JADX INFO: loaded from: classes2.dex */
public final class parseAc4SyncframeSize extends MagicModuleUseCase implements getAnswerMap {
    private /* synthetic */ Context AudioAttributesCompatParcelizer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public parseAc4SyncframeSize(Context context) {
        super(1);
        this.AudioAttributesCompatParcelizer = context;
    }

    @Override // kotlin.getAnswerMap
    public final Object invoke(Object obj) {
        Object systemService = this.AudioAttributesCompatParcelizer.getSystemService("sensor");
        toMagicModuleMetaRepoModel.write(systemService);
        return (SensorManager) systemService;
    }
}
