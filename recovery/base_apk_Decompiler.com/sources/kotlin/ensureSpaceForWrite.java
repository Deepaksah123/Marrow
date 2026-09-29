package kotlin;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;

/* JADX INFO: loaded from: classes2.dex */
public final class ensureSpaceForWrite extends MagicModuleUseCase implements getCreatedOnDateMs {
    private /* synthetic */ isSafeToMultiply AudioAttributesCompatParcelizer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ensureSpaceForWrite(isSafeToMultiply issafetomultiply) {
        super(0);
        this.AudioAttributesCompatParcelizer = issafetomultiply;
    }

    @Override // kotlin.getCreatedOnDateMs
    public final Object invoke() {
        if (_isNaN.checkSelfPermission(this.AudioAttributesCompatParcelizer.IconCompatParcelizer, "android.permission.ACCESS_NETWORK_STATE") != 0) {
            return new codecNeedsDiscardChannelsWorkaround(insertPitchPeriod.AudioAttributesCompatParcelizer);
        }
        ConnectivityManager connectivityManager = this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer;
        toMagicModuleMetaRepoModel.write(connectivityManager);
        Network activeNetwork = connectivityManager.getActiveNetwork();
        toMagicModuleMetaRepoModel.write(activeNetwork);
        NetworkCapabilities networkCapabilities = this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer.getNetworkCapabilities(activeNetwork);
        toMagicModuleMetaRepoModel.write(networkCapabilities);
        return new Ac4Util(Boolean.valueOf(networkCapabilities.hasTransport(4)));
    }
}
