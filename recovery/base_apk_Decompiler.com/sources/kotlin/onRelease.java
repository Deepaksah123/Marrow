package kotlin;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* JADX INFO: loaded from: classes2.dex */
public final class onRelease extends replaceStream<Boolean> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public onRelease(Context context, setEnableDecoderFallback setenabledecoderfallback) {
        super(context, setenabledecoderfallback);
        toMagicModuleMetaRepoModel.write(context, "");
        toMagicModuleMetaRepoModel.write(setenabledecoderfallback, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.onStreamChanged
    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: merged with bridge method [inline-methods] */
    public Boolean read() {
        Intent intentRegisterReceiver = write().registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (intentRegisterReceiver == null) {
            n.write();
            String unused = onStarted.RemoteActionCompatParcelizer;
            return Boolean.FALSE;
        }
        int intExtra = intentRegisterReceiver.getIntExtra("status", -1);
        float intExtra2 = intentRegisterReceiver.getIntExtra("level", -1) / intentRegisterReceiver.getIntExtra("scale", -1);
        boolean z = true;
        if (intExtra != 1 && intExtra2 <= 0.15f) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // kotlin.replaceStream
    public final IntentFilter IconCompatParcelizer() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.BATTERY_OKAY");
        intentFilter.addAction("android.intent.action.BATTERY_LOW");
        return intentFilter;
    }

    @Override // kotlin.replaceStream
    public final void write(Intent intent) {
        toMagicModuleMetaRepoModel.write(intent, "");
        if (intent.getAction() != null) {
            n.write();
            String unused = onStarted.RemoteActionCompatParcelizer;
            intent.getAction();
            String action = intent.getAction();
            if (action != null) {
                int iHashCode = action.hashCode();
                if (iHashCode == -1980154005) {
                    if (action.equals("android.intent.action.BATTERY_OKAY")) {
                        IconCompatParcelizer(Boolean.TRUE);
                    }
                } else if (iHashCode == 490310653 && action.equals("android.intent.action.BATTERY_LOW")) {
                    IconCompatParcelizer(Boolean.FALSE);
                }
            }
        }
    }
}
