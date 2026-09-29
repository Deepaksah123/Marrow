package kotlin;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.HashSet;
import java.util.Set;
import kotlin.TrackSampleTable;

/* JADX INFO: loaded from: classes5.dex */
public final class skipToPageOfTargetGranule {
    private final TrackSampleTable.IconCompatParcelizer AudioAttributesCompatParcelizer;
    private final DefaultOggSeeker IconCompatParcelizer;
    private final AppMeasurementSdk read;
    final Set write;

    public skipToPageOfTargetGranule(AppMeasurementSdk appMeasurementSdk, TrackSampleTable.IconCompatParcelizer iconCompatParcelizer) {
        this.AudioAttributesCompatParcelizer = iconCompatParcelizer;
        this.read = appMeasurementSdk;
        DefaultOggSeeker defaultOggSeeker = new DefaultOggSeeker(this);
        this.IconCompatParcelizer = defaultOggSeeker;
        appMeasurementSdk.registerOnMeasurementEventListener(defaultOggSeeker);
        this.write = new HashSet();
    }
}
