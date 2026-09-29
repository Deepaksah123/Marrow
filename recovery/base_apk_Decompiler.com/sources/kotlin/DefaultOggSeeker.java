package kotlin;

import android.os.Bundle;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.gms.measurement.internal.zzhc;

/* JADX INFO: loaded from: classes5.dex */
final class DefaultOggSeeker implements AppMeasurementSdk.OnEventListener {
    private /* synthetic */ skipToPageOfTargetGranule AudioAttributesCompatParcelizer;

    @Override // com.google.android.gms.measurement.api.AppMeasurementSdk.OnEventListener, com.google.android.gms.measurement.internal.zzhg
    public final void onEvent(String str, String str2, Bundle bundle, long j) {
        if (this.AudioAttributesCompatParcelizer.write.contains(str2)) {
            Bundle bundle2 = new Bundle();
            int i = sampleHasSubsampleEncryptionTable.write;
            String strZza = zzhc.zza(str2);
            if (strZza != null) {
                str2 = strZza;
            }
            bundle2.putString("events", str2);
            this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(2, bundle2);
        }
    }

    public DefaultOggSeeker(skipToPageOfTargetGranule skiptopageoftargetgranule) {
        this.AudioAttributesCompatParcelizer = skiptopageoftargetgranule;
    }
}
