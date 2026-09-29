package kotlin;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import kotlin.createMediaSources;

/* JADX INFO: loaded from: classes2.dex */
final class getPositionInfo implements createMediaSources {
    private final ConnectivityManager AudioAttributesCompatParcelizer;
    private final read RemoteActionCompatParcelizer;
    private final createMediaSources.write read;

    public getPositionInfo(ConnectivityManager connectivityManager, createMediaSources.write writeVar) {
        toMagicModuleMetaRepoModel.write(connectivityManager, "");
        toMagicModuleMetaRepoModel.write(writeVar, "");
        this.AudioAttributesCompatParcelizer = connectivityManager;
        this.read = writeVar;
        read readVar = new read();
        this.RemoteActionCompatParcelizer = readVar;
        connectivityManager.registerNetworkCallback(new NetworkRequest.Builder().addCapability(12).build(), readVar);
    }

    public static final class read extends ConnectivityManager.NetworkCallback {
        read() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onAvailable(Network network) {
            toMagicModuleMetaRepoModel.write(network, "");
            getPositionInfo.this.read(network, true);
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onLost(Network network) {
            toMagicModuleMetaRepoModel.write(network, "");
            getPositionInfo.this.read(network, false);
        }
    }

    @Override // kotlin.createMediaSources
    public final boolean AudioAttributesCompatParcelizer() {
        Network[] allNetworks = this.AudioAttributesCompatParcelizer.getAllNetworks();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(allNetworks, "");
        for (Network network : allNetworks) {
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(network, "");
            if (write(network)) {
                return true;
            }
        }
        return false;
    }

    @Override // kotlin.createMediaSources
    public final void write() {
        this.AudioAttributesCompatParcelizer.unregisterNetworkCallback(this.RemoteActionCompatParcelizer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void read(Network network, boolean z) {
        boolean zWrite;
        Network[] allNetworks = this.AudioAttributesCompatParcelizer.getAllNetworks();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(allNetworks, "");
        Network[] networkArr = allNetworks;
        int length = networkArr.length;
        boolean z2 = false;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            Network network2 = networkArr[i];
            if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(network2, network)) {
                zWrite = z;
            } else {
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(network2, "");
                zWrite = write(network2);
            }
            if (zWrite) {
                z2 = true;
                break;
            }
            i++;
        }
        this.read.AudioAttributesCompatParcelizer(z2);
    }

    private final boolean write(Network network) {
        NetworkCapabilities networkCapabilities = this.AudioAttributesCompatParcelizer.getNetworkCapabilities(network);
        return networkCapabilities != null && networkCapabilities.hasCapability(12);
    }
}
