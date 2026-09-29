package kotlin;

import android.app.ActivityManager;
import android.content.pm.ConfigurationInfo;

/* JADX INFO: loaded from: classes2.dex */
public final class sampleCountToNanoseconds extends MagicModuleUseCase implements getCreatedOnDateMs {
    private /* synthetic */ processSilence write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sampleCountToNanoseconds(processSilence processsilence) {
        super(0);
        this.write = processsilence;
    }

    @Override // kotlin.getCreatedOnDateMs
    public final Object invoke() {
        ActivityManager activityManager = this.write.AudioAttributesCompatParcelizer;
        toMagicModuleMetaRepoModel.write(activityManager);
        ConfigurationInfo deviceConfigurationInfo = activityManager.getDeviceConfigurationInfo();
        toMagicModuleMetaRepoModel.write(deviceConfigurationInfo);
        String glEsVersion = deviceConfigurationInfo.getGlEsVersion();
        toMagicModuleMetaRepoModel.write((Object) glEsVersion);
        return glEsVersion;
    }
}
