package kotlin;

import android.content.Context;
import android.location.Geocoder;
import android.location.LocationManager;
import in.juspay.hyper.constants.LogSubCategory;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class maybePrepareFile {
    private static List write = IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Object[]) new String[]{"gps", LogSubCategory.ApiCall.NETWORK, "passive"});
    public final Context AudioAttributesCompatParcelizer;
    public final Geocoder IconCompatParcelizer;
    public final LocationManager read;

    public maybePrepareFile(Context context, LocationManager locationManager, Geocoder geocoder) {
        this.AudioAttributesCompatParcelizer = context;
        this.read = locationManager;
        this.IconCompatParcelizer = geocoder;
    }

    public static boolean IconCompatParcelizer() {
        return Geocoder.isPresent();
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0065, code lost:
    
        if (r0.isProviderEnabled(in.juspay.hyper.constants.LogSubCategory.ApiCall.NETWORK) == false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.location.Location RemoteActionCompatParcelizer() {
        /*
            r5 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            r2 = 0
            if (r0 < r1) goto L4d
            android.location.LocationManager r0 = r5.read
            kotlin.toMagicModuleMetaRepoModel.write(r0)
            java.util.List r0 = r0.getAllProviders()
            kotlin.toMagicModuleMetaRepoModel.write(r0)
            java.util.List r0 = kotlin.IntermediateLoginResponseBody.AudioAttributesImplApi26Parcelizer(r0)
            java.util.List r1 = kotlin.maybePrepareFile.write
            java.util.Iterator r1 = r1.iterator()
        L1d:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L31
            java.lang.Object r3 = r1.next()
            r4 = r3
            java.lang.String r4 = (java.lang.String) r4
            boolean r4 = r0.contains(r4)
            if (r4 == 0) goto L1d
            goto L32
        L31:
            r3 = r2
        L32:
            java.lang.String r3 = (java.lang.String) r3
            if (r3 == 0) goto L67
            android.location.LocationManager r0 = r5.read
            kotlin.toMagicModuleMetaRepoModel.write(r0)
            boolean r0 = r0.isLocationEnabled()
            if (r0 == 0) goto L67
            o.DtsUtil r0 = new o.DtsUtil
            r0.<init>(r5, r3)
            java.lang.Object r5 = kotlin.TeeAudioProcessor.RemoteActionCompatParcelizer(r0)
            android.location.Location r5 = (android.location.Location) r5
            return r5
        L4d:
            android.location.LocationManager r0 = r5.read
            kotlin.toMagicModuleMetaRepoModel.write(r0)
            java.lang.String r1 = "gps"
            boolean r0 = r0.isProviderEnabled(r1)
            if (r0 != 0) goto L68
            android.location.LocationManager r0 = r5.read
            kotlin.toMagicModuleMetaRepoModel.write(r0)
            java.lang.String r1 = "network"
            boolean r0 = r0.isProviderEnabled(r1)
            if (r0 != 0) goto L68
        L67:
            return r2
        L68:
            o.MediaCodecAudioRenderer1 r0 = new o.MediaCodecAudioRenderer1
            r0.<init>(r5)
            java.lang.Object r5 = kotlin.TeeAudioProcessor.RemoteActionCompatParcelizer(r0)
            android.location.Location r5 = (android.location.Location) r5
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.maybePrepareFile.RemoteActionCompatParcelizer():android.location.Location");
    }
}
