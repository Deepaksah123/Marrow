package kotlin;

import android.os.Bundle;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.gms.internal.measurement.zzix;
import com.google.android.gms.internal.measurement.zzja;
import com.google.android.gms.internal.measurement.zzjb;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.android.gms.measurement.internal.zzhe;
import in.juspay.hypersdk.ota.Constants;

/* JADX INFO: loaded from: classes5.dex */
public final class sampleHasSubsampleEncryptionTable {
    private static final zzja AudioAttributesImplApi21Parcelizer;
    private static final zzja MediaBrowserCompatItemReceiver;
    public static final /* synthetic */ int write = 0;
    private static final zzjb RemoteActionCompatParcelizer = zzjb.zzi("_in", "_xa", "_xu", "_aq", "_aa", "_ai", "_ac", "campaign_details", "_ug", "_iapx", "_exp_set", "_exp_clear", "_exp_activate", "_exp_timeout", "_exp_expire");
    private static final zzja AudioAttributesCompatParcelizer = zzja.zzj("_e", "_f", "_iap", "_s", "_au", "_ui", "_cd");
    private static final zzja IconCompatParcelizer = zzja.zzi(TtmlNode.TEXT_EMPHASIS_AUTO, Constants.APP_DIR, "am");
    private static final zzja read = zzja.zzh("_r", "_dbg");

    static {
        zzix zzixVar = new zzix();
        zzixVar.zza(zzhe.zza);
        zzixVar.zza(zzhe.zzb);
        MediaBrowserCompatItemReceiver = zzixVar.zzb();
        AudioAttributesImplApi21Parcelizer = zzja.zzh("^_ltv_[A-Z]{3}$", "^_cc[1-5]{1}$");
    }

    public static boolean RemoteActionCompatParcelizer(String str) {
        return !RemoteActionCompatParcelizer.contains(str);
    }

    public static boolean RemoteActionCompatParcelizer(String str, Bundle bundle) {
        if (AudioAttributesCompatParcelizer.contains(str)) {
            return false;
        }
        if (bundle == null) {
            return true;
        }
        zzja zzjaVar = read;
        int size = zzjaVar.size();
        int i = 0;
        while (i < size) {
            boolean zContainsKey = bundle.containsKey((String) zzjaVar.get(i));
            i++;
            if (zContainsKey) {
                return false;
            }
        }
        return true;
    }

    public static boolean read(String str) {
        return !IconCompatParcelizer.contains(str);
    }

    public static boolean write(String str, String str2) {
        if ("_ce1".equals(str2) || "_ce2".equals(str2)) {
            return str.equals(AppMeasurement.FCM_ORIGIN) || str.equals("frc");
        }
        if ("_ln".equals(str2)) {
            return str.equals(AppMeasurement.FCM_ORIGIN) || str.equals(AppMeasurement.FIAM_ORIGIN);
        }
        if (MediaBrowserCompatItemReceiver.contains(str2)) {
            return false;
        }
        zzja zzjaVar = AudioAttributesImplApi21Parcelizer;
        int size = zzjaVar.size();
        int i = 0;
        while (i < size) {
            boolean zMatches = str2.matches((String) zzjaVar.get(i));
            i++;
            if (zMatches) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean write(java.lang.String r5, java.lang.String r6, android.os.Bundle r7) {
        /*
            java.lang.String r0 = "_cmp"
            boolean r6 = r0.equals(r6)
            r0 = 1
            if (r6 != 0) goto La
            return r0
        La:
            boolean r6 = read(r5)
            r1 = 0
            if (r6 != 0) goto L12
            return r1
        L12:
            if (r7 != 0) goto L15
            return r1
        L15:
            com.google.android.gms.internal.measurement.zzja r6 = kotlin.sampleHasSubsampleEncryptionTable.read
            int r2 = r6.size()
            r3 = r1
        L1c:
            if (r3 >= r2) goto L2d
            java.lang.Object r4 = r6.get(r3)
            java.lang.String r4 = (java.lang.String) r4
            boolean r4 = r7.containsKey(r4)
            int r3 = r3 + 1
            if (r4 == 0) goto L1c
            return r1
        L2d:
            int r6 = r5.hashCode()
            r2 = 101200(0x18b50, float:1.41811E-40)
            r3 = 2
            if (r6 == r2) goto L55
            r2 = 101230(0x18b6e, float:1.41853E-40)
            if (r6 == r2) goto L4b
            r2 = 3142703(0x2ff42f, float:4.403865E-39)
            if (r6 != r2) goto L5f
            java.lang.String r6 = "fiam"
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L5f
            r5 = r3
            goto L60
        L4b:
            java.lang.String r6 = "fdl"
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L5f
            r5 = r0
            goto L60
        L55:
            java.lang.String r6 = "fcm"
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L5f
            r5 = r1
            goto L60
        L5f:
            r5 = -1
        L60:
            java.lang.String r6 = "_cis"
            if (r5 == 0) goto L75
            if (r5 == r0) goto L6f
            if (r5 == r3) goto L69
            return r1
        L69:
            java.lang.String r5 = "fiam_integration"
            r7.putString(r6, r5)
            return r0
        L6f:
            java.lang.String r5 = "fdl_integration"
            r7.putString(r6, r5)
            return r0
        L75:
            java.lang.String r5 = "fcm_integration"
            r7.putString(r6, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.sampleHasSubsampleEncryptionTable.write(java.lang.String, java.lang.String, android.os.Bundle):boolean");
    }
}
