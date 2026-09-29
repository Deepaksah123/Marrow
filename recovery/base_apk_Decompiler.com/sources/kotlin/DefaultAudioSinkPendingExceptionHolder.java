package kotlin;

import android.os.Environment;
import android.os.StatFs;
import java.io.File;

/* JADX INFO: loaded from: classes2.dex */
public final class DefaultAudioSinkPendingExceptionHolder extends MagicModuleUseCase implements getCreatedOnDateMs {
    public static final DefaultAudioSinkPendingExceptionHolder write = new DefaultAudioSinkPendingExceptionHolder();

    public DefaultAudioSinkPendingExceptionHolder() {
        super(0);
    }

    @Override // kotlin.getCreatedOnDateMs
    public final Object invoke() {
        File rootDirectory = Environment.getRootDirectory();
        toMagicModuleMetaRepoModel.write(rootDirectory);
        String absolutePath = rootDirectory.getAbsolutePath();
        toMagicModuleMetaRepoModel.write((Object) absolutePath);
        return new StatFs(absolutePath);
    }
}
