package kotlin;

import android.net.ConnectivityManager;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroid/net/ConnectivityManager;", "Landroid/net/ConnectivityManager$NetworkCallback;", "p0", "", "RemoteActionCompatParcelizer", "(Landroid/net/ConnectivityManager;Landroid/net/ConnectivityManager$NetworkCallback;)V"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class buildAudioSink {
    public static final void RemoteActionCompatParcelizer(ConnectivityManager connectivityManager, ConnectivityManager.NetworkCallback networkCallback) {
        toMagicModuleMetaRepoModel.write(connectivityManager, "");
        toMagicModuleMetaRepoModel.write(networkCallback, "");
        connectivityManager.registerDefaultNetworkCallback(networkCallback);
    }
}
