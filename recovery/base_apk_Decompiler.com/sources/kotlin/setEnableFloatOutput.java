package kotlin;

import android.content.pm.PackageManager;

/* JADX INFO: loaded from: classes2.dex */
public final class setEnableFloatOutput extends MagicModuleUseCase implements getAnswerMap {
    private /* synthetic */ String AudioAttributesCompatParcelizer;
    private /* synthetic */ outputModeIsOffload read;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public setEnableFloatOutput(outputModeIsOffload outputmodeisoffload, String str) {
        super(1);
        this.read = outputmodeisoffload;
        this.AudioAttributesCompatParcelizer = str;
    }

    @Override // kotlin.getAnswerMap
    public final Object invoke(Object obj) {
        PackageManager packageManager = this.read.IconCompatParcelizer;
        toMagicModuleMetaRepoModel.write(packageManager);
        return new isAudioTrackInitialized(packageManager.getApplicationInfo(this.AudioAttributesCompatParcelizer, 128).dataDir);
    }
}
