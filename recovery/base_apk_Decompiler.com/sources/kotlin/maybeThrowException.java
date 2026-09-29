package kotlin;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class maybeThrowException extends MagicModuleUseCase implements getCreatedOnDateMs {
    private /* synthetic */ isSafeToMultiply IconCompatParcelizer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public maybeThrowException(isSafeToMultiply issafetomultiply) {
        super(0);
        this.IconCompatParcelizer = issafetomultiply;
    }

    @Override // kotlin.getCreatedOnDateMs
    public final Object invoke() {
        boolean z;
        if (_isNaN.checkSelfPermission(this.IconCompatParcelizer.IconCompatParcelizer, "android.permission.ACCESS_NETWORK_STATE") != 0) {
            return new codecNeedsDiscardChannelsWorkaround(onDowngrade.write);
        }
        ConnectivityManager connectivityManager = this.IconCompatParcelizer.AudioAttributesCompatParcelizer;
        toMagicModuleMetaRepoModel.write(connectivityManager);
        Network[] allNetworks = connectivityManager.getAllNetworks();
        toMagicModuleMetaRepoModel.write(allNetworks);
        List listAudioAttributesImplBaseParcelizer = getOrderDetails.AudioAttributesImplBaseParcelizer(allNetworks);
        isSafeToMultiply issafetomultiply = this.IconCompatParcelizer;
        ArrayList arrayList = new ArrayList();
        Iterator it = listAudioAttributesImplBaseParcelizer.iterator();
        while (it.hasNext()) {
            NetworkCapabilities networkCapabilities = issafetomultiply.AudioAttributesCompatParcelizer.getNetworkCapabilities((Network) it.next());
            if (networkCapabilities != null) {
                arrayList.add(networkCapabilities);
            }
        }
        if (arrayList.isEmpty()) {
            z = false;
        } else {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                if (((NetworkCapabilities) it2.next()).hasTransport(4)) {
                    z = true;
                    break;
                }
            }
            z = false;
        }
        return new Ac4Util(Boolean.valueOf(z));
    }
}
