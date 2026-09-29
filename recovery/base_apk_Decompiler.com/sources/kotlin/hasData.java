package kotlin;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import com.github.mikephil.charting.charts.RadarChart;
import com.github.mikephil.charting.data.RadarEntry;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: loaded from: classes4.dex */
public final class hasData extends compare {
    private Paint AudioAttributesCompatParcelizer;
    private Paint IconCompatParcelizer;
    private Path RemoteActionCompatParcelizer;
    private Path read;
    private RadarChart write;

    @Override // kotlin.lambdaonReferenceCountDecremented0
    public final void RemoteActionCompatParcelizer() {
    }

    public hasData(RadarChart radarChart, onKeyResponse onkeyresponse, lambdadrmSessionAcquired0comgoogleandroidexoplayer2drmDrmSessionEventListenerEventDispatcher lambdadrmsessionacquired0comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher) {
        super(onkeyresponse, lambdadrmsessionacquired0comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher);
        this.read = new Path();
        this.RemoteActionCompatParcelizer = new Path();
        this.write = radarChart;
        this.AudioAttributesImplApi26Parcelizer = new Paint(1);
        this.AudioAttributesImplApi26Parcelizer.setStyle(Paint.Style.STROKE);
        this.AudioAttributesImplApi26Parcelizer.setStrokeWidth(2.0f);
        this.AudioAttributesImplApi26Parcelizer.setColor(Color.rgb(255, 187, 115));
        Paint paint = new Paint(1);
        this.AudioAttributesCompatParcelizer = paint;
        paint.setStyle(Paint.Style.STROKE);
        this.IconCompatParcelizer = new Paint(1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.lambdaonReferenceCountDecremented0
    public final void IconCompatParcelizer(Canvas canvas) {
        maybeRetryRequest mayberetryrequest = (maybeRetryRequest) this.write.onSeekTo();
        int iOnMediaButtonEvent = mayberetryrequest.AudioAttributesImplBaseParcelizer().onMediaButtonEvent();
        for (setUseDrmSessionsForClearContent setusedrmsessionsforclearcontent : mayberetryrequest.IconCompatParcelizer()) {
            if (setusedrmsessionsforclearcontent.handleMediaPlayPauseIfPendingOnHandler()) {
                read(canvas, setusedrmsessionsforclearcontent, iOnMediaButtonEvent);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void read(Canvas canvas, setUseDrmSessionsForClearContent setusedrmsessionsforclearcontent, int i) {
        float fIconCompatParcelizer = this.MediaBrowserCompatItemReceiver.IconCompatParcelizer();
        float f = this.MediaBrowserCompatItemReceiver.read();
        float fAudioAttributesCompatParcelizer = this.write.AudioAttributesCompatParcelizer();
        float fWrite = this.write.write();
        lambdadrmKeysRemoved4comgoogleandroidexoplayer2drmDrmSessionEventListenerEventDispatcher lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcherOnPrepareFromMediaId = this.write.onPrepareFromMediaId();
        lambdadrmKeysRemoved4comgoogleandroidexoplayer2drmDrmSessionEventListenerEventDispatcher lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher = lambdadrmKeysRemoved4comgoogleandroidexoplayer2drmDrmSessionEventListenerEventDispatcher.read(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
        Path path = this.read;
        path.reset();
        boolean z = false;
        for (int i2 = 0; i2 < setusedrmsessionsforclearcontent.onMediaButtonEvent(); i2++) {
            this.AudioAttributesImplBaseParcelizer.setColor(setusedrmsessionsforclearcontent.AudioAttributesCompatParcelizer(i2));
            drmSessionAcquired.read(lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcherOnPrepareFromMediaId, (((RadarEntry) setusedrmsessionsforclearcontent.IconCompatParcelizer(i2)).read() - this.write.MediaSessionCompatToken()) * fWrite * f, (i2 * fAudioAttributesCompatParcelizer * fIconCompatParcelizer) + this.write.ParcelableVolumeInfo(), lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher);
            if (!Float.isNaN(lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher.IconCompatParcelizer)) {
                if (!z) {
                    path.moveTo(lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher.IconCompatParcelizer, lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher.write);
                    z = true;
                } else {
                    path.lineTo(lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher.IconCompatParcelizer, lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher.write);
                }
            }
        }
        if (setusedrmsessionsforclearcontent.onMediaButtonEvent() > i) {
            path.lineTo(lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcherOnPrepareFromMediaId.IconCompatParcelizer, lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcherOnPrepareFromMediaId.write);
        }
        path.close();
        if (setusedrmsessionsforclearcontent.setSessionImpl()) {
            Drawable drawableOnSetShuffleMode = setusedrmsessionsforclearcontent.onSetShuffleMode();
            if (drawableOnSetShuffleMode != null) {
                write(canvas, path, drawableOnSetShuffleMode);
            } else {
                IconCompatParcelizer(canvas, path, setusedrmsessionsforclearcontent.onSetPlaybackSpeed(), setusedrmsessionsforclearcontent.onSetCaptioningEnabled());
            }
        }
        this.AudioAttributesImplBaseParcelizer.setStrokeWidth(setusedrmsessionsforclearcontent.onSkipToQueueItem());
        this.AudioAttributesImplBaseParcelizer.setStyle(Paint.Style.STROKE);
        if (!setusedrmsessionsforclearcontent.setSessionImpl() || setusedrmsessionsforclearcontent.onSetCaptioningEnabled() < 255) {
            canvas.drawPath(path, this.AudioAttributesImplBaseParcelizer);
        }
        lambdadrmKeysRemoved4comgoogleandroidexoplayer2drmDrmSessionEventListenerEventDispatcher.AudioAttributesCompatParcelizer(lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcherOnPrepareFromMediaId);
        lambdadrmKeysRemoved4comgoogleandroidexoplayer2drmDrmSessionEventListenerEventDispatcher.AudioAttributesCompatParcelizer(lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.lambdaonReferenceCountDecremented0
    public final void write(Canvas canvas) {
        int i;
        float f;
        RadarEntry radarEntry;
        int i2;
        setUseDrmSessionsForClearContent setusedrmsessionsforclearcontent;
        int i3;
        float f2;
        lambdadrmKeysRemoved4comgoogleandroidexoplayer2drmDrmSessionEventListenerEventDispatcher lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher;
        DefaultDrmSessionResponseHandler defaultDrmSessionResponseHandler;
        float fIconCompatParcelizer = this.MediaBrowserCompatItemReceiver.IconCompatParcelizer();
        float f3 = this.MediaBrowserCompatItemReceiver.read();
        float fAudioAttributesCompatParcelizer = this.write.AudioAttributesCompatParcelizer();
        float fWrite = this.write.write();
        lambdadrmKeysRemoved4comgoogleandroidexoplayer2drmDrmSessionEventListenerEventDispatcher lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcherOnPrepareFromMediaId = this.write.onPrepareFromMediaId();
        lambdadrmKeysRemoved4comgoogleandroidexoplayer2drmDrmSessionEventListenerEventDispatcher lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher2 = lambdadrmKeysRemoved4comgoogleandroidexoplayer2drmDrmSessionEventListenerEventDispatcher.read(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
        lambdadrmKeysRemoved4comgoogleandroidexoplayer2drmDrmSessionEventListenerEventDispatcher lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher3 = lambdadrmKeysRemoved4comgoogleandroidexoplayer2drmDrmSessionEventListenerEventDispatcher.read(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
        float fWrite2 = drmSessionAcquired.write(5.0f);
        int i4 = 0;
        while (i4 < ((maybeRetryRequest) this.write.onSeekTo()).read()) {
            setUseDrmSessionsForClearContent setusedrmsessionsforclearcontentRemoteActionCompatParcelizer = ((maybeRetryRequest) this.write.onSeekTo()).RemoteActionCompatParcelizer(i4);
            if (IconCompatParcelizer(setusedrmsessionsforclearcontentRemoteActionCompatParcelizer)) {
                RemoteActionCompatParcelizer(setusedrmsessionsforclearcontentRemoteActionCompatParcelizer);
                DefaultDrmSessionResponseHandler defaultDrmSessionResponseHandlerMediaBrowserCompatMediaItem = setusedrmsessionsforclearcontentRemoteActionCompatParcelizer.MediaBrowserCompatMediaItem();
                lambdadrmKeysRemoved4comgoogleandroidexoplayer2drmDrmSessionEventListenerEventDispatcher lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher4 = lambdadrmKeysRemoved4comgoogleandroidexoplayer2drmDrmSessionEventListenerEventDispatcher.read(setusedrmsessionsforclearcontentRemoteActionCompatParcelizer.MediaDescriptionCompat());
                lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher4.IconCompatParcelizer = drmSessionAcquired.write(lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher4.IconCompatParcelizer);
                lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher4.write = drmSessionAcquired.write(lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher4.write);
                int i5 = 0;
                while (i5 < setusedrmsessionsforclearcontentRemoteActionCompatParcelizer.onMediaButtonEvent()) {
                    RadarEntry radarEntry2 = (RadarEntry) setusedrmsessionsforclearcontentRemoteActionCompatParcelizer.IconCompatParcelizer(i5);
                    lambdadrmKeysRemoved4comgoogleandroidexoplayer2drmDrmSessionEventListenerEventDispatcher lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher5 = lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher4;
                    float f4 = i5 * fAudioAttributesCompatParcelizer * fIconCompatParcelizer;
                    drmSessionAcquired.read(lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcherOnPrepareFromMediaId, (radarEntry2.read() - this.write.MediaSessionCompatToken()) * fWrite * f3, f4 + this.write.ParcelableVolumeInfo(), lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher2);
                    if (setusedrmsessionsforclearcontentRemoteActionCompatParcelizer.onAddQueueItem()) {
                        radarEntry = radarEntry2;
                        i2 = i5;
                        f2 = fIconCompatParcelizer;
                        lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher = lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher5;
                        defaultDrmSessionResponseHandler = defaultDrmSessionResponseHandlerMediaBrowserCompatMediaItem;
                        setusedrmsessionsforclearcontent = setusedrmsessionsforclearcontentRemoteActionCompatParcelizer;
                        i3 = i4;
                        IconCompatParcelizer(canvas, defaultDrmSessionResponseHandlerMediaBrowserCompatMediaItem.write(radarEntry2), lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher2.IconCompatParcelizer, lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher2.write - fWrite2, setusedrmsessionsforclearcontentRemoteActionCompatParcelizer.write(i5));
                    } else {
                        radarEntry = radarEntry2;
                        i2 = i5;
                        setusedrmsessionsforclearcontent = setusedrmsessionsforclearcontentRemoteActionCompatParcelizer;
                        i3 = i4;
                        f2 = fIconCompatParcelizer;
                        lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher = lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher5;
                        defaultDrmSessionResponseHandler = defaultDrmSessionResponseHandlerMediaBrowserCompatMediaItem;
                    }
                    if (radarEntry.AudioAttributesImplApi21Parcelizer() != null && setusedrmsessionsforclearcontent.onCommand()) {
                        Drawable drawableAudioAttributesImplApi21Parcelizer = radarEntry.AudioAttributesImplApi21Parcelizer();
                        drmSessionAcquired.read(lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcherOnPrepareFromMediaId, (radarEntry.read() * fWrite * f3) + lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher.write, f4 + this.write.ParcelableVolumeInfo(), lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher3);
                        lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher3.write += lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher.IconCompatParcelizer;
                        drmSessionAcquired.write(canvas, drawableAudioAttributesImplApi21Parcelizer, (int) lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher3.IconCompatParcelizer, (int) lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher3.write, drawableAudioAttributesImplApi21Parcelizer.getIntrinsicWidth(), drawableAudioAttributesImplApi21Parcelizer.getIntrinsicHeight());
                    }
                    i5 = i2 + 1;
                    lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher4 = lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher;
                    setusedrmsessionsforclearcontentRemoteActionCompatParcelizer = setusedrmsessionsforclearcontent;
                    defaultDrmSessionResponseHandlerMediaBrowserCompatMediaItem = defaultDrmSessionResponseHandler;
                    i4 = i3;
                    fIconCompatParcelizer = f2;
                }
                i = i4;
                f = fIconCompatParcelizer;
                lambdadrmKeysRemoved4comgoogleandroidexoplayer2drmDrmSessionEventListenerEventDispatcher.AudioAttributesCompatParcelizer(lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher4);
            } else {
                i = i4;
                f = fIconCompatParcelizer;
            }
            i4 = i + 1;
            fIconCompatParcelizer = f;
        }
        lambdadrmKeysRemoved4comgoogleandroidexoplayer2drmDrmSessionEventListenerEventDispatcher.AudioAttributesCompatParcelizer(lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcherOnPrepareFromMediaId);
        lambdadrmKeysRemoved4comgoogleandroidexoplayer2drmDrmSessionEventListenerEventDispatcher.AudioAttributesCompatParcelizer(lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher2);
        lambdadrmKeysRemoved4comgoogleandroidexoplayer2drmDrmSessionEventListenerEventDispatcher.AudioAttributesCompatParcelizer(lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher3);
    }

    private void IconCompatParcelizer(Canvas canvas, String str, float f, float f2, int i) {
        this.AudioAttributesImplApi21Parcelizer.setColor(i);
        canvas.drawText(str, f, f2, this.AudioAttributesImplApi21Parcelizer);
    }

    @Override // kotlin.lambdaonReferenceCountDecremented0
    public final void read(Canvas canvas) {
        RemoteActionCompatParcelizer(canvas);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void RemoteActionCompatParcelizer(Canvas canvas) {
        float fAudioAttributesCompatParcelizer = this.write.AudioAttributesCompatParcelizer();
        float fWrite = this.write.write();
        float fParcelableVolumeInfo = this.write.ParcelableVolumeInfo();
        lambdadrmKeysRemoved4comgoogleandroidexoplayer2drmDrmSessionEventListenerEventDispatcher lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcherOnPrepareFromMediaId = this.write.onPrepareFromMediaId();
        this.AudioAttributesCompatParcelizer.setStrokeWidth(this.write.MediaBrowserCompatItemReceiver());
        this.AudioAttributesCompatParcelizer.setColor(this.write.AudioAttributesImplBaseParcelizer());
        this.AudioAttributesCompatParcelizer.setAlpha(this.write.AudioAttributesImplApi26Parcelizer());
        int iIconCompatParcelizer = this.write.IconCompatParcelizer();
        int iOnMediaButtonEvent = ((maybeRetryRequest) this.write.onSeekTo()).AudioAttributesImplBaseParcelizer().onMediaButtonEvent();
        lambdadrmKeysRemoved4comgoogleandroidexoplayer2drmDrmSessionEventListenerEventDispatcher lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher = lambdadrmKeysRemoved4comgoogleandroidexoplayer2drmDrmSessionEventListenerEventDispatcher.read(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
        for (int i = 0; i < iOnMediaButtonEvent; i += iIconCompatParcelizer + 1) {
            drmSessionAcquired.read(lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcherOnPrepareFromMediaId, this.write.onCustomAction() * fWrite, (i * fAudioAttributesCompatParcelizer) + fParcelableVolumeInfo, lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher);
            canvas.drawLine(lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcherOnPrepareFromMediaId.IconCompatParcelizer, lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcherOnPrepareFromMediaId.write, lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher.IconCompatParcelizer, lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher.write, this.AudioAttributesCompatParcelizer);
        }
        lambdadrmKeysRemoved4comgoogleandroidexoplayer2drmDrmSessionEventListenerEventDispatcher.AudioAttributesCompatParcelizer(lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher);
        this.AudioAttributesCompatParcelizer.setStrokeWidth(this.write.MediaBrowserCompatSearchResultReceiver());
        this.AudioAttributesCompatParcelizer.setColor(this.write.MediaBrowserCompatCustomActionResultReceiver());
        this.AudioAttributesCompatParcelizer.setAlpha(this.write.AudioAttributesImplApi26Parcelizer());
        int i2 = this.write.handleMediaPlayPauseIfPendingOnHandler().MediaBrowserCompatCustomActionResultReceiver;
        lambdadrmKeysRemoved4comgoogleandroidexoplayer2drmDrmSessionEventListenerEventDispatcher lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher2 = lambdadrmKeysRemoved4comgoogleandroidexoplayer2drmDrmSessionEventListenerEventDispatcher.read(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
        lambdadrmKeysRemoved4comgoogleandroidexoplayer2drmDrmSessionEventListenerEventDispatcher lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher3 = lambdadrmKeysRemoved4comgoogleandroidexoplayer2drmDrmSessionEventListenerEventDispatcher.read(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = 0;
            while (i4 < ((maybeRetryRequest) this.write.onSeekTo()).write()) {
                float fMediaSessionCompatToken = (this.write.handleMediaPlayPauseIfPendingOnHandler().AudioAttributesImplBaseParcelizer[i3] - this.write.MediaSessionCompatToken()) * fWrite;
                drmSessionAcquired.read(lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcherOnPrepareFromMediaId, fMediaSessionCompatToken, (i4 * fAudioAttributesCompatParcelizer) + fParcelableVolumeInfo, lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher2);
                i4++;
                drmSessionAcquired.read(lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcherOnPrepareFromMediaId, fMediaSessionCompatToken, (i4 * fAudioAttributesCompatParcelizer) + fParcelableVolumeInfo, lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher3);
                canvas.drawLine(lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher2.IconCompatParcelizer, lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher2.write, lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher3.IconCompatParcelizer, lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher3.write, this.AudioAttributesCompatParcelizer);
            }
        }
        lambdadrmKeysRemoved4comgoogleandroidexoplayer2drmDrmSessionEventListenerEventDispatcher.AudioAttributesCompatParcelizer(lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher2);
        lambdadrmKeysRemoved4comgoogleandroidexoplayer2drmDrmSessionEventListenerEventDispatcher.AudioAttributesCompatParcelizer(lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00df  */
    @Override // kotlin.lambdaonReferenceCountDecremented0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void RemoteActionCompatParcelizer(android.graphics.Canvas r21, kotlin.createAndAcquireSessionWithRetry[] r22) {
        /*
            Method dump skipped, instruction units count: 238
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.hasData.RemoteActionCompatParcelizer(android.graphics.Canvas, o.createAndAcquireSessionWithRetry[]):void");
    }

    private void RemoteActionCompatParcelizer(Canvas canvas, lambdadrmKeysRemoved4comgoogleandroidexoplayer2drmDrmSessionEventListenerEventDispatcher lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher, float f, float f2, int i, int i2, float f3) {
        canvas.save();
        float fWrite = drmSessionAcquired.write(f2);
        float fWrite2 = drmSessionAcquired.write(f);
        if (i != 1122867) {
            Path path = this.RemoteActionCompatParcelizer;
            path.reset();
            path.addCircle(lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher.IconCompatParcelizer, lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher.write, fWrite, Path.Direction.CW);
            if (fWrite2 > BitmapDescriptorFactory.HUE_RED) {
                path.addCircle(lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher.IconCompatParcelizer, lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher.write, fWrite2, Path.Direction.CCW);
            }
            this.IconCompatParcelizer.setColor(i);
            this.IconCompatParcelizer.setStyle(Paint.Style.FILL);
            canvas.drawPath(path, this.IconCompatParcelizer);
        }
        if (i2 != 1122867) {
            this.IconCompatParcelizer.setColor(i2);
            this.IconCompatParcelizer.setStyle(Paint.Style.STROKE);
            this.IconCompatParcelizer.setStrokeWidth(drmSessionAcquired.write(f3));
            canvas.drawCircle(lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher.IconCompatParcelizer, lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher.write, fWrite, this.IconCompatParcelizer);
        }
        canvas.restore();
    }
}
