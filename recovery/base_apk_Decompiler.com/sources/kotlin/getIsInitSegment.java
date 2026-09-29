package kotlin;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;

/* JADX INFO: loaded from: classes.dex */
public final class getIsInitSegment {
    public static final boolean write(Context context) {
        toMagicModuleMetaRepoModel.write(context, "");
        Object systemService = context.getSystemService("connectivity");
        toMagicModuleMetaRepoModel.read(systemService, "");
        ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
        return networkCapabilities != null && networkCapabilities.hasCapability(12) && networkCapabilities.hasCapability(16);
    }
}
