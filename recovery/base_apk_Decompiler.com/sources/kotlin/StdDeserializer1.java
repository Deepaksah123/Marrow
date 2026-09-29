package kotlin;

import android.net.ConnectivityManager;

/* JADX INFO: loaded from: classes2.dex */
public final class StdDeserializer1 {
    @Deprecated
    public static boolean RemoteActionCompatParcelizer(ConnectivityManager connectivityManager) {
        return connectivityManager.isActiveNetworkMetered();
    }
}
