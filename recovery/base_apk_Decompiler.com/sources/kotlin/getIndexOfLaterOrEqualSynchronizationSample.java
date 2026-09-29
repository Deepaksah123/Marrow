package kotlin;

import android.os.Bundle;
import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* JADX INFO: loaded from: classes5.dex */
final class getIndexOfLaterOrEqualSynchronizationSample implements AppMeasurementSdk.OnEventListener {
    private /* synthetic */ getNextSeekPosition IconCompatParcelizer;

    @Override // com.google.android.gms.measurement.api.AppMeasurementSdk.OnEventListener, com.google.android.gms.measurement.internal.zzhg
    public final void onEvent(String str, String str2, Bundle bundle, long j) {
        if (str == null || !sampleHasSubsampleEncryptionTable.RemoteActionCompatParcelizer(str2)) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putString("name", str2);
        bundle2.putLong("timestampInMillis", j);
        bundle2.putBundle("params", bundle);
        this.IconCompatParcelizer.IconCompatParcelizer.RemoteActionCompatParcelizer(3, bundle2);
    }

    public getIndexOfLaterOrEqualSynchronizationSample(getNextSeekPosition getnextseekposition) {
        this.IconCompatParcelizer = getnextseekposition;
    }
}
