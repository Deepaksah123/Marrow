package kotlin;

import android.os.Build;

/* JADX INFO: loaded from: classes2.dex */
public final class isPassthroughPlaybackSupported extends MagicModuleUseCase implements getCreatedOnDateMs {
    public static final isPassthroughPlaybackSupported write = new isPassthroughPlaybackSupported();

    public isPassthroughPlaybackSupported() {
        super(0);
    }

    @Override // kotlin.getCreatedOnDateMs
    public final Object invoke() {
        String str = Build.MODEL;
        toMagicModuleMetaRepoModel.write((Object) str);
        return str;
    }
}
