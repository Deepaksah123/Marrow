package kotlin;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.TrackSampleTable;

/* JADX INFO: loaded from: classes5.dex */
public final class getNextSeekPosition {
    private final TrackSampleTable.IconCompatParcelizer IconCompatParcelizer;
    private final AppMeasurementSdk RemoteActionCompatParcelizer;
    private final getIndexOfLaterOrEqualSynchronizationSample read;

    public getNextSeekPosition(AppMeasurementSdk appMeasurementSdk, TrackSampleTable.IconCompatParcelizer iconCompatParcelizer) {
        this.IconCompatParcelizer = iconCompatParcelizer;
        this.RemoteActionCompatParcelizer = appMeasurementSdk;
        getIndexOfLaterOrEqualSynchronizationSample getindexoflaterorequalsynchronizationsample = new getIndexOfLaterOrEqualSynchronizationSample(this);
        this.read = getindexoflaterorequalsynchronizationsample;
        appMeasurementSdk.registerOnMeasurementEventListener(getindexoflaterorequalsynchronizationsample);
    }
}
