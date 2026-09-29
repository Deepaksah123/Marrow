package kotlin;

import android.content.Intent;
import android.content.IntentFilter;

/* JADX INFO: loaded from: classes2.dex */
public final class setLogSessionIdOnAudioTrack extends MagicModuleUseCase implements getCreatedOnDateMs {
    private /* synthetic */ DefaultAudioSinkDefaultAudioProcessorChain write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public setLogSessionIdOnAudioTrack(DefaultAudioSinkDefaultAudioProcessorChain defaultAudioSinkDefaultAudioProcessorChain) {
        super(0);
        this.write = defaultAudioSinkDefaultAudioProcessorChain;
    }

    @Override // kotlin.getCreatedOnDateMs
    public final Object invoke() {
        Intent intentRegisterReceiver = this.write.write.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        toMagicModuleMetaRepoModel.write(intentRegisterReceiver);
        int intExtra = intentRegisterReceiver.getIntExtra("health", -1);
        if (intExtra == -1) {
            return "";
        }
        switch (intExtra) {
            case 2:
                return "good";
            case 3:
                return "overheat";
            case 4:
                return "dead";
            case 5:
                return "over voltage";
            case 6:
                return "unspecified failure";
            case 7:
                return "cold";
            default:
                return "unknown";
        }
    }
}
