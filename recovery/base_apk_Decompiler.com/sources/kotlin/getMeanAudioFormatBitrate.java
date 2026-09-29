package kotlin;

import android.os.StatFs;

/* JADX INFO: loaded from: classes2.dex */
public final class getMeanAudioFormatBitrate extends MagicModuleUseCase implements getCreatedOnDateMs {
    private /* synthetic */ getRebufferRate IconCompatParcelizer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getMeanAudioFormatBitrate(getRebufferRate getrebufferrate) {
        super(0);
        this.IconCompatParcelizer = getrebufferrate;
    }

    @Override // kotlin.getCreatedOnDateMs
    public final Object invoke() {
        StatFs statFs = this.IconCompatParcelizer.read;
        toMagicModuleMetaRepoModel.write(statFs);
        return Long.valueOf(statFs.getTotalBytes());
    }
}
