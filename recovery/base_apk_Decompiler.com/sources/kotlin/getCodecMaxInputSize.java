package kotlin;

import android.os.Build;
import android.os.UserManager;

/* JADX INFO: loaded from: classes2.dex */
public final class getCodecMaxInputSize extends MagicModuleUseCase implements getAnswerMap {
    private /* synthetic */ onCodecReleased read;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getCodecMaxInputSize(onCodecReleased oncodecreleased) {
        super(1);
        this.read = oncodecreleased;
    }

    @Override // kotlin.getAnswerMap
    public final Object invoke(Object obj) {
        UserManager userManager = this.read.AudioAttributesCompatParcelizer;
        toMagicModuleMetaRepoModel.write(userManager);
        return new getChannelCount(Integer.valueOf(userManager.getUserProfiles().size()), Build.VERSION.SDK_INT >= 30 ? Boolean.valueOf(this.read.AudioAttributesCompatParcelizer.isManagedProfile()) : null, Boolean.valueOf(this.read.AudioAttributesCompatParcelizer.isSystemUser()));
    }
}
