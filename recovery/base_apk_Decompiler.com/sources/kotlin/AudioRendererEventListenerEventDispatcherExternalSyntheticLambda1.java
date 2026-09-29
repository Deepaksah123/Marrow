package kotlin;

import android.telephony.TelephonyManager;

/* JADX INFO: loaded from: classes2.dex */
public final class AudioRendererEventListenerEventDispatcherExternalSyntheticLambda1 extends MagicModuleUseCase implements getCreatedOnDateMs {
    private /* synthetic */ hasAdvancingTimestamp IconCompatParcelizer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AudioRendererEventListenerEventDispatcherExternalSyntheticLambda1(hasAdvancingTimestamp hasadvancingtimestamp) {
        super(0);
        this.IconCompatParcelizer = hasadvancingtimestamp;
    }

    @Override // kotlin.getCreatedOnDateMs
    public final Object invoke() {
        TelephonyManager telephonyManager = this.IconCompatParcelizer.AudioAttributesCompatParcelizer;
        toMagicModuleMetaRepoModel.write(telephonyManager);
        String networkCountryIso = telephonyManager.getNetworkCountryIso();
        toMagicModuleMetaRepoModel.write((Object) networkCountryIso);
        return networkCountryIso;
    }
}
