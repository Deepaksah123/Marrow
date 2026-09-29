package kotlin;

import android.telephony.TelephonyManager;

/* JADX INFO: loaded from: classes2.dex */
public final class lambdadisabled6comgoogleandroidexoplayer2audioAudioRendererEventListenerEventDispatcher extends MagicModuleUseCase implements getCreatedOnDateMs {
    private /* synthetic */ hasAdvancingTimestamp RemoteActionCompatParcelizer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lambdadisabled6comgoogleandroidexoplayer2audioAudioRendererEventListenerEventDispatcher(hasAdvancingTimestamp hasadvancingtimestamp) {
        super(0);
        this.RemoteActionCompatParcelizer = hasadvancingtimestamp;
    }

    @Override // kotlin.getCreatedOnDateMs
    public final Object invoke() throws Exception {
        TelephonyManager telephonyManager = this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer;
        toMagicModuleMetaRepoModel.write(telephonyManager);
        switch (telephonyManager.getDataState()) {
            case -1:
                return setAudioProcessorPlaybackParameters.write;
            case 0:
                return isZero.IconCompatParcelizer;
            case 1:
                return ChannelMixingMatrix.RemoteActionCompatParcelizer;
            case 2:
                return setAudioTrackPlaybackSpeed.IconCompatParcelizer;
            case 3:
                return getAudioCapabilities.write;
            case 4:
                return processFirstSampleOfStream.write;
            case 5:
                return DecoderAudioRenderer1.RemoteActionCompatParcelizer;
            default:
                throw new Exception();
        }
    }
}
