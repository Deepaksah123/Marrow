package kotlin;

import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
public final class getMediaFormat implements LocationListener {
    private /* synthetic */ maybePrepareFile IconCompatParcelizer;
    private /* synthetic */ interpolate RemoteActionCompatParcelizer;

    public getMediaFormat(interpolate interpolateVar, maybePrepareFile maybepreparefile) {
        this.RemoteActionCompatParcelizer = interpolateVar;
        this.IconCompatParcelizer = maybepreparefile;
    }

    @Override // android.location.LocationListener
    public final void onLocationChanged(Location location) {
        this.RemoteActionCompatParcelizer.IconCompatParcelizer(location);
        LocationManager locationManager = this.IconCompatParcelizer.read;
        toMagicModuleMetaRepoModel.write(locationManager);
        locationManager.removeUpdates(this);
    }

    @Override // android.location.LocationListener
    public final void onProviderDisabled(String str) {
    }

    @Override // android.location.LocationListener
    public final void onProviderEnabled(String str) {
    }

    @Override // android.location.LocationListener
    public final void onStatusChanged(String str, int i, Bundle bundle) {
    }
}
