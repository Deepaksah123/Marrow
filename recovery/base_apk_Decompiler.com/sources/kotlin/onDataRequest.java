package kotlin;

import android.content.Context;
import android.os.StatFs;
import java.io.File;

/* JADX INFO: loaded from: classes2.dex */
public final class onDataRequest extends MagicModuleUseCase implements getCreatedOnDateMs {
    private /* synthetic */ Context RemoteActionCompatParcelizer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public onDataRequest(Context context) {
        super(0);
        this.RemoteActionCompatParcelizer = context;
    }

    @Override // kotlin.getCreatedOnDateMs
    public final Object invoke() {
        StatFs statFs = null;
        File externalFilesDir = this.RemoteActionCompatParcelizer.getExternalFilesDir(null);
        if (externalFilesDir != null) {
            if (!externalFilesDir.canRead()) {
                externalFilesDir = null;
            }
            if (externalFilesDir != null) {
                String absolutePath = externalFilesDir.getAbsolutePath();
                toMagicModuleMetaRepoModel.write((Object) absolutePath);
                statFs = new StatFs(absolutePath);
            }
        }
        toMagicModuleMetaRepoModel.write(statFs);
        return statFs;
    }
}
