package kotlin;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;

/* JADX INFO: loaded from: classes2.dex */
public final class supportsMixedMimeTypeAdaptation {
    private static final String write;

    public static final onStreamChanged<getLastResetPositionUs> write(Context context, setEnableDecoderFallback setenabledecoderfallback) {
        toMagicModuleMetaRepoModel.write(context, "");
        toMagicModuleMetaRepoModel.write(setenabledecoderfallback, "");
        return new setCurrentStreamFinal(context, setenabledecoderfallback);
    }

    static {
        String strWrite = n.write("NetworkStateTracker");
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strWrite, "");
        write = strWrite;
    }

    private static boolean IconCompatParcelizer(ConnectivityManager connectivityManager) {
        toMagicModuleMetaRepoModel.write(connectivityManager, "");
        try {
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
            if (networkCapabilities != null) {
                return networkCapabilities.hasCapability(16);
            }
            return false;
        } catch (SecurityException e) {
            n.write();
            return false;
        }
    }

    public static final getLastResetPositionUs IconCompatParcelizer(ConnectivityManager connectivityManager, boolean z) {
        toMagicModuleMetaRepoModel.write(connectivityManager, "");
        try {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            return new getLastResetPositionUs(activeNetworkInfo != null && activeNetworkInfo.isConnected(), IconCompatParcelizer(connectivityManager), StdDeserializer1.RemoteActionCompatParcelizer(connectivityManager), (activeNetworkInfo == null || activeNetworkInfo.isRoaming()) ? false : true, z);
        } catch (SecurityException e) {
            n.write();
            return new getLastResetPositionUs(false, false, false, true, z);
        }
    }

    public static final getLastResetPositionUs read(NetworkCapabilities networkCapabilities, boolean z) {
        toMagicModuleMetaRepoModel.write(networkCapabilities, "");
        return new getLastResetPositionUs(networkCapabilities.hasCapability(12), networkCapabilities.hasCapability(16), !networkCapabilities.hasCapability(11), networkCapabilities.hasCapability(18), z);
    }
}
