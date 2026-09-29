package kotlin;

import android.telephony.TelephonyManager;

/* JADX INFO: loaded from: classes2.dex */
public final class AudioSink extends MagicModuleUseCase implements getCreatedOnDateMs {
    private /* synthetic */ hasAdvancingTimestamp AudioAttributesCompatParcelizer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AudioSink(hasAdvancingTimestamp hasadvancingtimestamp) {
        super(0);
        this.AudioAttributesCompatParcelizer = hasadvancingtimestamp;
    }

    @Override // kotlin.getCreatedOnDateMs
    public final Object invoke() throws Exception {
        TelephonyManager telephonyManager = this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer;
        toMagicModuleMetaRepoModel.write(telephonyManager);
        int phoneType = telephonyManager.getPhoneType();
        if (phoneType == 0) {
            return getMeanRebufferCount.RemoteActionCompatParcelizer;
        }
        if (phoneType == 1) {
            return getFatalErrorRate.IconCompatParcelizer;
        }
        if (phoneType == 2) {
            return MediaMetricsListenerErrorInfo.read;
        }
        if (phoneType == 3) {
            return getMeanVideoFormatBitrate.write;
        }
        throw new Exception();
    }
}
