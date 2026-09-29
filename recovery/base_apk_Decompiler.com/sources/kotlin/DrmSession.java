package kotlin;

import android.graphics.Canvas;
import com.github.mikephil.charting.charts.RadarChart;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: loaded from: classes2.dex */
public final class DrmSession extends copyWithData {
    private RadarChart RatingCompat;

    @Override // kotlin.copyWithData
    public final void IconCompatParcelizer(Canvas canvas) {
    }

    public DrmSession(lambdadrmSessionAcquired0comgoogleandroidexoplayer2drmDrmSessionEventListenerEventDispatcher lambdadrmsessionacquired0comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher, hasSessionId hassessionid, RadarChart radarChart) {
        super(lambdadrmsessionacquired0comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher, hassessionid, null);
        this.RatingCompat = radarChart;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.copyWithData
    public final void write(Canvas canvas) {
        if (this.MediaBrowserCompatItemReceiver.onPlayFromSearch() && this.MediaBrowserCompatItemReceiver.onCommand()) {
            float fOnRemoveQueueItem = this.MediaBrowserCompatItemReceiver.onRemoveQueueItem();
            lambdadrmKeysRemoved4comgoogleandroidexoplayer2drmDrmSessionEventListenerEventDispatcher lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher = lambdadrmKeysRemoved4comgoogleandroidexoplayer2drmDrmSessionEventListenerEventDispatcher.read(0.5f, 0.25f);
            this.AudioAttributesCompatParcelizer.setTypeface(this.MediaBrowserCompatItemReceiver.onPrepareFromSearch());
            this.AudioAttributesCompatParcelizer.setTextSize(this.MediaBrowserCompatItemReceiver.onPrepareFromMediaId());
            this.AudioAttributesCompatParcelizer.setColor(this.MediaBrowserCompatItemReceiver.onFastForward());
            float fAudioAttributesCompatParcelizer = this.RatingCompat.AudioAttributesCompatParcelizer();
            float fWrite = this.RatingCompat.write();
            lambdadrmKeysRemoved4comgoogleandroidexoplayer2drmDrmSessionEventListenerEventDispatcher lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcherOnPrepareFromMediaId = this.RatingCompat.onPrepareFromMediaId();
            lambdadrmKeysRemoved4comgoogleandroidexoplayer2drmDrmSessionEventListenerEventDispatcher lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher2 = lambdadrmKeysRemoved4comgoogleandroidexoplayer2drmDrmSessionEventListenerEventDispatcher.read(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
            for (int i = 0; i < ((maybeRetryRequest) this.RatingCompat.onSeekTo()).AudioAttributesImplBaseParcelizer().onMediaButtonEvent(); i++) {
                DefaultDrmSessionResponseHandler defaultDrmSessionResponseHandlerMediaMetadataCompat = this.MediaBrowserCompatItemReceiver.MediaMetadataCompat();
                float f = i;
                hasSessionId hassessionid = this.MediaBrowserCompatItemReceiver;
                String strWrite = defaultDrmSessionResponseHandlerMediaMetadataCompat.write(f);
                drmSessionAcquired.read(lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcherOnPrepareFromMediaId, (this.RatingCompat.onCustomAction() * fWrite) + (this.MediaBrowserCompatItemReceiver.MediaBrowserCompatSearchResultReceiver / 2.0f), ((f * fAudioAttributesCompatParcelizer) + this.RatingCompat.ParcelableVolumeInfo()) % 360.0f, lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher2);
                write(canvas, strWrite, lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher2.IconCompatParcelizer, lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher2.write - (this.MediaBrowserCompatItemReceiver.MediaMetadataCompat / 2.0f), lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher, fOnRemoveQueueItem);
            }
            lambdadrmKeysRemoved4comgoogleandroidexoplayer2drmDrmSessionEventListenerEventDispatcher.AudioAttributesCompatParcelizer(lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcherOnPrepareFromMediaId);
            lambdadrmKeysRemoved4comgoogleandroidexoplayer2drmDrmSessionEventListenerEventDispatcher.AudioAttributesCompatParcelizer(lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher2);
            lambdadrmKeysRemoved4comgoogleandroidexoplayer2drmDrmSessionEventListenerEventDispatcher.AudioAttributesCompatParcelizer(lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher);
        }
    }
}
