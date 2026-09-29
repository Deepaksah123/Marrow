package kotlin;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* JADX INFO: loaded from: classes2.dex */
public final class onEnabled extends replaceStream<Boolean> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public onEnabled(Context context, setEnableDecoderFallback setenabledecoderfallback) {
        super(context, setenabledecoderfallback);
        toMagicModuleMetaRepoModel.write(context, "");
        toMagicModuleMetaRepoModel.write(setenabledecoderfallback, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.onStreamChanged
    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: merged with bridge method [inline-methods] */
    public Boolean read() {
        Intent intentRegisterReceiver = write().registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (intentRegisterReceiver == null) {
            n.write();
            String unused = onDisabled.RemoteActionCompatParcelizer;
            return Boolean.FALSE;
        }
        return Boolean.valueOf(read(intentRegisterReceiver));
    }

    @Override // kotlin.replaceStream
    public final IntentFilter IconCompatParcelizer() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.os.action.CHARGING");
        intentFilter.addAction("android.os.action.DISCHARGING");
        return intentFilter;
    }

    @Override // kotlin.replaceStream
    public final void write(Intent intent) {
        toMagicModuleMetaRepoModel.write(intent, "");
        String action = intent.getAction();
        if (action != null) {
            n.write();
            String unused = onDisabled.RemoteActionCompatParcelizer;
            switch (action.hashCode()) {
                case -1886648615:
                    if (action.equals("android.intent.action.ACTION_POWER_DISCONNECTED")) {
                        IconCompatParcelizer(Boolean.FALSE);
                    }
                    break;
                case -54942926:
                    if (action.equals("android.os.action.DISCHARGING")) {
                        IconCompatParcelizer(Boolean.FALSE);
                    }
                    break;
                case 948344062:
                    if (action.equals("android.os.action.CHARGING")) {
                        IconCompatParcelizer(Boolean.TRUE);
                    }
                    break;
                case 1019184907:
                    if (action.equals("android.intent.action.ACTION_POWER_CONNECTED")) {
                        IconCompatParcelizer(Boolean.TRUE);
                    }
                    break;
            }
        }
    }

    private static boolean read(Intent intent) {
        int intExtra = intent.getIntExtra("status", -1);
        return intExtra == 2 || intExtra == 5;
    }
}
