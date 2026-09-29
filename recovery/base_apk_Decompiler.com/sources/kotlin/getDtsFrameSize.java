package kotlin;

import android.content.Context;
import android.hardware.SensorManager;

/* JADX INFO: loaded from: classes2.dex */
public final class getDtsFrameSize extends MagicModuleUseCase implements getCreatedOnDateMs {
    private /* synthetic */ Context read;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getDtsFrameSize(Context context) {
        super(0);
        this.read = context;
    }

    @Override // kotlin.getCreatedOnDateMs
    public final Object invoke() {
        return (SensorManager) this.read.getSystemService("sensor");
    }
}
