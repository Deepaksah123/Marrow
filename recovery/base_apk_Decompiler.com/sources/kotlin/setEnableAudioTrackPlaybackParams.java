package kotlin;

import android.content.Context;
import android.os.PowerManager;

/* JADX INFO: loaded from: classes2.dex */
public final class setEnableAudioTrackPlaybackParams {
    static {
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(n.write("WakeLocks"), "");
    }

    public static final PowerManager.WakeLock RemoteActionCompatParcelizer(Context context, String str) {
        toMagicModuleMetaRepoModel.write(context, "");
        toMagicModuleMetaRepoModel.write(str, "");
        Object systemService = context.getApplicationContext().getSystemService("power");
        toMagicModuleMetaRepoModel.read(systemService, "");
        String strConcat = "WorkManager: ".concat(String.valueOf(str));
        PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) systemService).newWakeLock(1, strConcat);
        synchronized (setEnableAudioFloatOutput.INSTANCE) {
            setEnableAudioFloatOutput setenableaudiofloatoutput = setEnableAudioFloatOutput.INSTANCE;
            setEnableAudioFloatOutput.read().put(wakeLockNewWakeLock, strConcat);
        }
        toMagicModuleMetaRepoModel.write(wakeLockNewWakeLock);
        return wakeLockNewWakeLock;
    }
}
