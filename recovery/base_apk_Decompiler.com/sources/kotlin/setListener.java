package kotlin;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* JADX INFO: loaded from: classes2.dex */
public final class setListener extends replaceStream<Boolean> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public setListener(Context context, setEnableDecoderFallback setenabledecoderfallback) {
        super(context, setenabledecoderfallback);
        toMagicModuleMetaRepoModel.write(context, "");
        toMagicModuleMetaRepoModel.write(setenabledecoderfallback, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.onStreamChanged
    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: merged with bridge method [inline-methods] */
    public Boolean read() {
        Intent intentRegisterReceiver = write().registerReceiver(null, IconCompatParcelizer());
        boolean z = true;
        if (intentRegisterReceiver != null && intentRegisterReceiver.getAction() != null) {
            String action = intentRegisterReceiver.getAction();
            if (action == null) {
                z = false;
            } else {
                int iHashCode = action.hashCode();
                if (iHashCode == -1181163412) {
                    action.equals("android.intent.action.DEVICE_STORAGE_LOW");
                } else if (iHashCode != -730838620 || !action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
                }
                z = false;
            }
        }
        return Boolean.valueOf(z);
    }

    @Override // kotlin.replaceStream
    public final IntentFilter IconCompatParcelizer() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_OK");
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_LOW");
        return intentFilter;
    }

    @Override // kotlin.replaceStream
    public final void write(Intent intent) {
        toMagicModuleMetaRepoModel.write(intent, "");
        if (intent.getAction() != null) {
            n.write();
            String unused = stop.write;
            intent.getAction();
            String action = intent.getAction();
            if (action != null) {
                int iHashCode = action.hashCode();
                if (iHashCode == -1181163412) {
                    if (action.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
                        IconCompatParcelizer(Boolean.FALSE);
                    }
                } else if (iHashCode == -730838620 && action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
                    IconCompatParcelizer(Boolean.TRUE);
                }
            }
        }
    }
}
