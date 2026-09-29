package kotlin;

import android.content.Context;
import android.net.wifi.WifiManager;

/* JADX INFO: loaded from: classes2.dex */
final class findSerializerByLookup {
    private WifiManager.WifiLock AudioAttributesCompatParcelizer;
    private boolean IconCompatParcelizer;
    private final Context RemoteActionCompatParcelizer;
    private boolean read;

    public findSerializerByLookup(Context context) {
        this.RemoteActionCompatParcelizer = context.getApplicationContext();
    }

    public final void read(boolean z) {
        if (z && this.AudioAttributesCompatParcelizer == null) {
            WifiManager wifiManager = (WifiManager) this.RemoteActionCompatParcelizer.getApplicationContext().getSystemService("wifi");
            if (wifiManager == null) {
                prune.RemoteActionCompatParcelizer("WifiLockManager", "WifiManager is null, therefore not creating the WifiLock.");
                return;
            } else {
                WifiManager.WifiLock wifiLockCreateWifiLock = wifiManager.createWifiLock(3, "ExoPlayer:WifiLockManager");
                this.AudioAttributesCompatParcelizer = wifiLockCreateWifiLock;
                wifiLockCreateWifiLock.setReferenceCounted(false);
            }
        }
        this.read = z;
        IconCompatParcelizer();
    }

    public final void IconCompatParcelizer(boolean z) {
        this.IconCompatParcelizer = z;
        IconCompatParcelizer();
    }

    private void IconCompatParcelizer() {
        WifiManager.WifiLock wifiLock = this.AudioAttributesCompatParcelizer;
        if (wifiLock == null) {
            return;
        }
        if (this.read && this.IconCompatParcelizer) {
            wifiLock.acquire();
        } else {
            wifiLock.release();
        }
    }
}
