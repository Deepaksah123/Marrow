package kotlin;

import android.app.ActivityManager;

/* JADX INFO: loaded from: classes2.dex */
public final class getMeanPlayTimeMs extends MagicModuleUseCase implements getCreatedOnDateMs {
    private /* synthetic */ getRebufferRate AudioAttributesCompatParcelizer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getMeanPlayTimeMs(getRebufferRate getrebufferrate) {
        super(0);
        this.AudioAttributesCompatParcelizer = getrebufferrate;
    }

    @Override // kotlin.getCreatedOnDateMs
    public final Object invoke() {
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ActivityManager activityManager = this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer;
        toMagicModuleMetaRepoModel.write(activityManager);
        activityManager.getMemoryInfo(memoryInfo);
        return Long.valueOf(memoryInfo.totalMem);
    }
}
