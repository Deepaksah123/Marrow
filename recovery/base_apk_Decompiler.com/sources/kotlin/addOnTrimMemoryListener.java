package kotlin;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import in.juspay.hyper.constants.LogSubCategory;
import java.util.Calendar;

/* JADX INFO: loaded from: classes.dex */
final class addOnTrimMemoryListener {
    private static addOnTrimMemoryListener write;
    private final LocationManager AudioAttributesCompatParcelizer;
    private final Context IconCompatParcelizer;
    private final IconCompatParcelizer RemoteActionCompatParcelizer = new IconCompatParcelizer();

    static addOnTrimMemoryListener IconCompatParcelizer(Context context) {
        if (write == null) {
            Context applicationContext = context.getApplicationContext();
            write = new addOnTrimMemoryListener(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
        }
        return write;
    }

    private addOnTrimMemoryListener(Context context, LocationManager locationManager) {
        this.IconCompatParcelizer = context;
        this.AudioAttributesCompatParcelizer = locationManager;
    }

    final boolean IconCompatParcelizer() {
        IconCompatParcelizer iconCompatParcelizer = this.RemoteActionCompatParcelizer;
        if (RemoteActionCompatParcelizer()) {
            return iconCompatParcelizer.AudioAttributesCompatParcelizer;
        }
        Location location = read();
        if (location != null) {
            write(location);
            return iconCompatParcelizer.AudioAttributesCompatParcelizer;
        }
        int i = Calendar.getInstance().get(11);
        return i < 6 || i >= 22;
    }

    private Location read() {
        Location locationIconCompatParcelizer = _parseBooleanPrimitive.read(this.IconCompatParcelizer, "android.permission.ACCESS_COARSE_LOCATION") == 0 ? IconCompatParcelizer(LogSubCategory.ApiCall.NETWORK) : null;
        Location locationIconCompatParcelizer2 = _parseBooleanPrimitive.read(this.IconCompatParcelizer, "android.permission.ACCESS_FINE_LOCATION") == 0 ? IconCompatParcelizer("gps") : null;
        return (locationIconCompatParcelizer2 == null || locationIconCompatParcelizer == null ? locationIconCompatParcelizer2 == null : locationIconCompatParcelizer2.getTime() <= locationIconCompatParcelizer.getTime()) ? locationIconCompatParcelizer : locationIconCompatParcelizer2;
    }

    private Location IconCompatParcelizer(String str) {
        try {
            if (this.AudioAttributesCompatParcelizer.isProviderEnabled(str)) {
                return this.AudioAttributesCompatParcelizer.getLastKnownLocation(str);
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    private boolean RemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer.IconCompatParcelizer > System.currentTimeMillis();
    }

    private void write(Location location) {
        long j;
        IconCompatParcelizer iconCompatParcelizer = this.RemoteActionCompatParcelizer;
        long jCurrentTimeMillis = System.currentTimeMillis();
        addOnUserLeaveHintListener addonuserleavehintlistenerAudioAttributesCompatParcelizer = addOnUserLeaveHintListener.AudioAttributesCompatParcelizer();
        addonuserleavehintlistenerAudioAttributesCompatParcelizer.write(jCurrentTimeMillis - 86400000, location.getLatitude(), location.getLongitude());
        addonuserleavehintlistenerAudioAttributesCompatParcelizer.write(jCurrentTimeMillis, location.getLatitude(), location.getLongitude());
        boolean z = addonuserleavehintlistenerAudioAttributesCompatParcelizer.write == 1;
        long j2 = addonuserleavehintlistenerAudioAttributesCompatParcelizer.RemoteActionCompatParcelizer;
        long j3 = addonuserleavehintlistenerAudioAttributesCompatParcelizer.IconCompatParcelizer;
        addonuserleavehintlistenerAudioAttributesCompatParcelizer.write(jCurrentTimeMillis + 86400000, location.getLatitude(), location.getLongitude());
        long j4 = addonuserleavehintlistenerAudioAttributesCompatParcelizer.RemoteActionCompatParcelizer;
        if (j2 == -1 || j3 == -1) {
            j = jCurrentTimeMillis + 43200000;
        } else {
            if (jCurrentTimeMillis > j3) {
                j2 = j4;
            } else if (jCurrentTimeMillis > j2) {
                j2 = j3;
            }
            j = j2 + 60000;
        }
        iconCompatParcelizer.AudioAttributesCompatParcelizer = z;
        iconCompatParcelizer.IconCompatParcelizer = j;
    }

    static class IconCompatParcelizer {
        boolean AudioAttributesCompatParcelizer;
        long IconCompatParcelizer;

        IconCompatParcelizer() {
        }
    }
}
