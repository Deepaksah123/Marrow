package kotlin;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageItemInfo;

/* JADX INFO: loaded from: classes2.dex */
public final class AudioCapabilitiesReceiverListener extends MagicModuleUseCase implements getAnswerMap {
    private /* synthetic */ Context IconCompatParcelizer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AudioCapabilitiesReceiverListener(Context context) {
        super(1);
        this.IconCompatParcelizer = context;
    }

    @Override // kotlin.getAnswerMap
    public final Object invoke(Object obj) {
        ApplicationInfo applicationInfo = this.IconCompatParcelizer.getApplicationInfo();
        toMagicModuleMetaRepoModel.write(applicationInfo);
        String str = ((PackageItemInfo) applicationInfo).packageName;
        toMagicModuleMetaRepoModel.write((Object) str);
        return str;
    }
}
