package kotlin;

import android.app.ActivityManager;
import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class createAudioTrackV29 extends MagicModuleUseCase implements getCreatedOnDateMs {
    private /* synthetic */ Context read;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public createAudioTrackV29(Context context) {
        super(0);
        this.read = context;
    }

    @Override // kotlin.getCreatedOnDateMs
    public final Object invoke() {
        return (ActivityManager) this.read.getSystemService("activity");
    }
}
