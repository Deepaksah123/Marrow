package kotlin;

import android.content.Context;
import android.os.PowerManager;

/* JADX INFO: loaded from: classes2.dex */
final class findSerializerByAddonType {
    private boolean AudioAttributesCompatParcelizer;
    private boolean IconCompatParcelizer;
    private final Context RemoteActionCompatParcelizer;
    private PowerManager.WakeLock read;

    public findSerializerByAddonType(Context context) {
        this.RemoteActionCompatParcelizer = context.getApplicationContext();
    }

    public final void write(boolean z) {
        if (z && this.read == null) {
            PowerManager powerManager = (PowerManager) this.RemoteActionCompatParcelizer.getSystemService("power");
            if (powerManager == null) {
                prune.RemoteActionCompatParcelizer("WakeLockManager", "PowerManager is null, therefore not creating the WakeLock.");
                return;
            } else {
                PowerManager.WakeLock wakeLockNewWakeLock = powerManager.newWakeLock(1, "ExoPlayer:WakeLockManager");
                this.read = wakeLockNewWakeLock;
                wakeLockNewWakeLock.setReferenceCounted(false);
            }
        }
        this.IconCompatParcelizer = z;
        RemoteActionCompatParcelizer();
    }

    public final void AudioAttributesCompatParcelizer(boolean z) {
        this.AudioAttributesCompatParcelizer = z;
        RemoteActionCompatParcelizer();
    }

    private void RemoteActionCompatParcelizer() {
        PowerManager.WakeLock wakeLock = this.read;
        if (wakeLock == null) {
            return;
        }
        if (this.IconCompatParcelizer && this.AudioAttributesCompatParcelizer) {
            wakeLock.acquire();
        } else {
            wakeLock.release();
        }
    }
}
