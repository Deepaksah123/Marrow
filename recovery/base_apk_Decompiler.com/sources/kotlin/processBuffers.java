package kotlin;

import android.app.ActivityManager;
import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class processBuffers extends MagicModuleUseCase implements getCreatedOnDateMs {
    private /* synthetic */ Context RemoteActionCompatParcelizer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public processBuffers(Context context) {
        super(0);
        this.RemoteActionCompatParcelizer = context;
    }

    @Override // kotlin.getCreatedOnDateMs
    public final Object invoke() {
        return (ActivityManager) this.RemoteActionCompatParcelizer.getSystemService("activity");
    }
}
