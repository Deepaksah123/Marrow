package kotlin;

import android.content.Context;
import android.location.LocationManager;

/* JADX INFO: loaded from: classes2.dex */
public final class isActive extends MagicModuleUseCase implements getAnswerMap {
    private /* synthetic */ Context write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public isActive(Context context) {
        super(1);
        this.write = context;
    }

    @Override // kotlin.getAnswerMap
    public final Object invoke(Object obj) {
        Object systemService = this.write.getSystemService("location");
        if (systemService instanceof LocationManager) {
            return (LocationManager) systemService;
        }
        return null;
    }
}
