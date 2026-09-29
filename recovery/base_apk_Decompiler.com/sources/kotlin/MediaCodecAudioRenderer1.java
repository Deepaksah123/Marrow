package kotlin;

import android.location.Criteria;
import android.location.LocationManager;
import android.os.Looper;

/* JADX INFO: loaded from: classes2.dex */
public final class MediaCodecAudioRenderer1 extends MagicModuleUseCase implements getAnswerMap {
    private /* synthetic */ maybePrepareFile IconCompatParcelizer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaCodecAudioRenderer1(maybePrepareFile maybepreparefile) {
        super(1);
        this.IconCompatParcelizer = maybepreparefile;
    }

    @Override // kotlin.getAnswerMap
    public final Object invoke(Object obj) {
        Criteria criteria = new Criteria();
        criteria.setAccuracy(1);
        criteria.setPowerRequirement(3);
        criteria.setCostAllowed(true);
        criteria.setAltitudeRequired(true);
        criteria.setBearingRequired(false);
        criteria.setSpeedRequired(false);
        criteria.setHorizontalAccuracy(3);
        criteria.setVerticalAccuracy(3);
        maybePrepareFile maybepreparefile = this.IconCompatParcelizer;
        getMediaFormat getmediaformat = new getMediaFormat((interpolate) obj, maybepreparefile);
        LocationManager locationManager = maybepreparefile.read;
        toMagicModuleMetaRepoModel.write(locationManager);
        locationManager.requestSingleUpdate(criteria, getmediaformat, Looper.getMainLooper());
        return getShowPopup.INSTANCE;
    }
}
