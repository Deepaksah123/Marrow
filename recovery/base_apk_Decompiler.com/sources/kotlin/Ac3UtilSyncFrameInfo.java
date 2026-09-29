package kotlin;

import android.content.Context;
import android.os.UserManager;
import in.juspay.hyper.constants.LogSubCategory;

/* JADX INFO: loaded from: classes2.dex */
public final class Ac3UtilSyncFrameInfo extends MagicModuleUseCase implements getAnswerMap {
    private /* synthetic */ Context RemoteActionCompatParcelizer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ac3UtilSyncFrameInfo(Context context) {
        super(1);
        this.RemoteActionCompatParcelizer = context;
    }

    @Override // kotlin.getAnswerMap
    public final Object invoke(Object obj) {
        Object systemService = this.RemoteActionCompatParcelizer.getSystemService(LogSubCategory.Action.USER);
        toMagicModuleMetaRepoModel.write(systemService);
        return (UserManager) systemService;
    }
}
