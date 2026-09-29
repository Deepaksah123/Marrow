package kotlin;

import android.os.Build;

/* JADX INFO: loaded from: classes2.dex */
public final class parseEAc3AnnexFFormat extends MagicModuleUseCase implements getCreatedOnDateMs {
    public static final parseEAc3AnnexFFormat RemoteActionCompatParcelizer = new parseEAc3AnnexFFormat();

    public parseEAc3AnnexFFormat() {
        super(0);
    }

    @Override // kotlin.getCreatedOnDateMs
    public final Object invoke() {
        String str = Build.SUPPORTED_ABIS[0];
        toMagicModuleMetaRepoModel.write((Object) str);
        return str;
    }
}
