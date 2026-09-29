package kotlin;

import com.github.mikephil.charting.charts.RadarChart;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class maybeCreateMediaDrmHandler extends acquisitionFailedIndicatingResourceShortage<RadarChart> {
    public maybeCreateMediaDrmHandler(RadarChart radarChart) {
        super(radarChart);
    }

    @Override // kotlin.acquisitionFailedIndicatingResourceShortage
    protected final createAndAcquireSessionWithRetry IconCompatParcelizer(int i, float f, float f2) {
        List<createAndAcquireSessionWithRetry> listAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(i);
        float fIconCompatParcelizer = ((RadarChart) this.RemoteActionCompatParcelizer).IconCompatParcelizer(f, f2) / ((RadarChart) this.RemoteActionCompatParcelizer).write();
        createAndAcquireSessionWithRetry createandacquiresessionwithretry = null;
        float f3 = Float.MAX_VALUE;
        for (int i2 = 0; i2 < listAudioAttributesCompatParcelizer.size(); i2++) {
            createAndAcquireSessionWithRetry createandacquiresessionwithretry2 = listAudioAttributesCompatParcelizer.get(i2);
            float fAbs = Math.abs(createandacquiresessionwithretry2.MediaBrowserCompatItemReceiver() - fIconCompatParcelizer);
            if (fAbs < f3) {
                createandacquiresessionwithretry = createandacquiresessionwithretry2;
                f3 = fAbs;
            }
        }
        return createandacquiresessionwithretry;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0, types: [com.github.mikephil.charting.data.Entry, o.playClearSamplesWithoutKeys] */
    private List<createAndAcquireSessionWithRetry> AudioAttributesCompatParcelizer(int i) {
        int i2 = i;
        this.write.clear();
        float fIconCompatParcelizer = ((RadarChart) this.RemoteActionCompatParcelizer).onPlayFromUri().IconCompatParcelizer();
        float f = ((RadarChart) this.RemoteActionCompatParcelizer).onPlayFromUri().read();
        float fAudioAttributesCompatParcelizer = ((RadarChart) this.RemoteActionCompatParcelizer).AudioAttributesCompatParcelizer();
        float fWrite = ((RadarChart) this.RemoteActionCompatParcelizer).write();
        lambdadrmKeysRemoved4comgoogleandroidexoplayer2drmDrmSessionEventListenerEventDispatcher lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher = lambdadrmKeysRemoved4comgoogleandroidexoplayer2drmDrmSessionEventListenerEventDispatcher.read(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
        int i3 = 0;
        while (i3 < ((maybeRetryRequest) ((RadarChart) this.RemoteActionCompatParcelizer).onSeekTo()).read()) {
            setUseDrmSessionsForClearContent setusedrmsessionsforclearcontentRemoteActionCompatParcelizer = ((maybeRetryRequest) ((RadarChart) this.RemoteActionCompatParcelizer).onSeekTo()).RemoteActionCompatParcelizer(i3);
            ?? IconCompatParcelizer = setusedrmsessionsforclearcontentRemoteActionCompatParcelizer.IconCompatParcelizer(i2);
            float f2 = i2;
            drmSessionAcquired.read(((RadarChart) this.RemoteActionCompatParcelizer).onPrepareFromMediaId(), (IconCompatParcelizer.read() - ((RadarChart) this.RemoteActionCompatParcelizer).MediaSessionCompatToken()) * fWrite * f, (fAudioAttributesCompatParcelizer * f2 * fIconCompatParcelizer) + ((RadarChart) this.RemoteActionCompatParcelizer).ParcelableVolumeInfo(), lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher);
            this.write.add(new createAndAcquireSessionWithRetry(f2, IconCompatParcelizer.read(), lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher.IconCompatParcelizer, lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher.write, i3, setusedrmsessionsforclearcontentRemoteActionCompatParcelizer.IconCompatParcelizer()));
            i3++;
            i2 = i;
        }
        return this.write;
    }
}
