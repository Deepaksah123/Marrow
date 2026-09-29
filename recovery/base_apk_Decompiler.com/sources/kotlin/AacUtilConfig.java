package kotlin;

import android.content.Context;
import java.io.File;

/* JADX INFO: loaded from: classes2.dex */
public final class AacUtilConfig extends MagicModuleUseCase implements getAnswerMap {
    private /* synthetic */ Context read;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AacUtilConfig(Context context) {
        super(1);
        this.read = context;
    }

    @Override // kotlin.getAnswerMap
    public final Object invoke(Object obj) {
        File cacheDir = this.read.getCacheDir();
        toMagicModuleMetaRepoModel.write(cacheDir);
        String absolutePath = cacheDir.getAbsolutePath();
        toMagicModuleMetaRepoModel.write((Object) absolutePath);
        return absolutePath;
    }
}
