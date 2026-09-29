package kotlin;

import android.content.Context;
import android.content.pm.PackageManager;

/* JADX INFO: loaded from: classes2.dex */
public final class AudioAttributesAudioAttributesV21 extends MagicModuleUseCase implements getAnswerMap {
    private /* synthetic */ Context read;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AudioAttributesAudioAttributesV21(Context context) {
        super(1);
        this.read = context;
    }

    @Override // kotlin.getAnswerMap
    public final Object invoke(Object obj) {
        PackageManager packageManager = this.read.getPackageManager();
        toMagicModuleMetaRepoModel.write(packageManager);
        return packageManager;
    }
}
