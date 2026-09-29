package kotlin;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* JADX INFO: loaded from: classes3.dex */
final class outputSample {
    private final boolean RemoteActionCompatParcelizer;
    private final Float write;

    private outputSample(Float f, boolean z) {
        this.RemoteActionCompatParcelizer = z;
        this.write = f;
    }

    public final Float write() {
        return this.write;
    }

    public final int IconCompatParcelizer() {
        Float f;
        if (!this.RemoteActionCompatParcelizer || (f = this.write) == null) {
            return 1;
        }
        return ((double) f.floatValue()) < 0.99d ? 2 : 3;
    }

    public static outputSample write(Context context) {
        Float fRemoteActionCompatParcelizer = null;
        boolean zWrite = false;
        try {
            Intent intentRegisterReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (intentRegisterReceiver != null) {
                zWrite = write(intentRegisterReceiver);
                fRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(intentRegisterReceiver);
            }
        } catch (IllegalStateException unused) {
            DvbSubtitleReader.read().write();
        }
        return new outputSample(fRemoteActionCompatParcelizer, zWrite);
    }

    private static boolean write(Intent intent) {
        int intExtra = intent.getIntExtra("status", -1);
        if (intExtra == -1) {
            return false;
        }
        return intExtra == 2 || intExtra == 5;
    }

    private static Float RemoteActionCompatParcelizer(Intent intent) {
        int intExtra = intent.getIntExtra("level", -1);
        int intExtra2 = intent.getIntExtra("scale", -1);
        if (intExtra == -1 || intExtra2 == -1) {
            return null;
        }
        return Float.valueOf(intExtra / intExtra2);
    }
}
