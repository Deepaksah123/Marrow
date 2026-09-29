package kotlin;

import android.graphics.Canvas;
import android.graphics.Path;
import com.github.mikephil.charting.charts.RadarChart;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class replaceSession extends DrmInitDataSchemeData1 {
    private RadarChart MediaDescriptionCompat;
    private Path RatingCompat;

    public replaceSession(lambdadrmSessionAcquired0comgoogleandroidexoplayer2drmDrmSessionEventListenerEventDispatcher lambdadrmsessionacquired0comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher, getError geterror, RadarChart radarChart) {
        super(lambdadrmsessionacquired0comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher, geterror, null);
        this.RatingCompat = new Path();
        this.MediaDescriptionCompat = radarChart;
    }

    @Override // kotlin.DefaultDrmSessionManagerProvisioningManagerImpl
    protected final void RemoteActionCompatParcelizer(float f, float f2) {
        int i;
        char c;
        float f3 = f;
        int iAudioAttributesImplApi26Parcelizer = this.read.AudioAttributesImplApi26Parcelizer();
        double dAbs = Math.abs(f2 - f3);
        if (iAudioAttributesImplApi26Parcelizer == 0 || dAbs <= 0.0d || Double.isInfinite(dAbs)) {
            this.read.AudioAttributesImplBaseParcelizer = new float[0];
            this.read.read = new float[0];
            this.read.MediaBrowserCompatCustomActionResultReceiver = 0;
            return;
        }
        double dWrite = drmSessionAcquired.write(dAbs / ((double) iAudioAttributesImplApi26Parcelizer));
        if (this.read.onCustomAction() && dWrite < this.read.IconCompatParcelizer()) {
            dWrite = this.read.IconCompatParcelizer();
        }
        double dWrite2 = drmSessionAcquired.write(Math.pow(10.0d, (int) Math.log10(dWrite)));
        if (((int) (dWrite / dWrite2)) > 5) {
            dWrite = Math.floor(dWrite2 * 10.0d);
        }
        restoreKeys restorekeys = this.read;
        if (this.read.handleMediaPlayPauseIfPendingOnHandler()) {
            float f4 = ((float) dAbs) / (iAudioAttributesImplApi26Parcelizer - 1);
            this.read.MediaBrowserCompatCustomActionResultReceiver = iAudioAttributesImplApi26Parcelizer;
            if (this.read.AudioAttributesImplBaseParcelizer.length < iAudioAttributesImplApi26Parcelizer) {
                this.read.AudioAttributesImplBaseParcelizer = new float[iAudioAttributesImplApi26Parcelizer];
            }
            for (int i2 = 0; i2 < iAudioAttributesImplApi26Parcelizer; i2++) {
                this.read.AudioAttributesImplBaseParcelizer[i2] = f3;
                f3 += f4;
            }
        } else {
            double dCeil = dWrite == 0.0d ? 0.0d : Math.ceil(((double) f3) / dWrite) * dWrite;
            double dAudioAttributesCompatParcelizer = dWrite == 0.0d ? 0.0d : drmSessionAcquired.AudioAttributesCompatParcelizer(Math.floor(((double) f2) / dWrite) * dWrite);
            if (dWrite != 0.0d) {
                i = 0;
                for (double d = dCeil; d <= dAudioAttributesCompatParcelizer; d += dWrite) {
                    i++;
                }
            } else {
                i = 0;
            }
            int i3 = i + 1;
            this.read.MediaBrowserCompatCustomActionResultReceiver = i3;
            if (this.read.AudioAttributesImplBaseParcelizer.length < i3) {
                this.read.AudioAttributesImplBaseParcelizer = new float[i3];
            }
            for (int i4 = 0; i4 < i3; i4++) {
                if (dCeil == 0.0d) {
                    dCeil = 0.0d;
                }
                this.read.AudioAttributesImplBaseParcelizer[i4] = (float) dCeil;
                dCeil += dWrite;
            }
            iAudioAttributesImplApi26Parcelizer = i3;
        }
        if (dWrite < 1.0d) {
            this.read.AudioAttributesImplApi26Parcelizer = (int) Math.ceil(-Math.log10(dWrite));
            c = 0;
        } else {
            c = 0;
            this.read.AudioAttributesImplApi26Parcelizer = 0;
        }
        this.read.IconCompatParcelizer = this.read.AudioAttributesImplBaseParcelizer[c];
        this.read.AudioAttributesCompatParcelizer = this.read.AudioAttributesImplBaseParcelizer[iAudioAttributesImplApi26Parcelizer - 1];
        this.read.RemoteActionCompatParcelizer = Math.abs(this.read.AudioAttributesCompatParcelizer - this.read.IconCompatParcelizer);
    }

    @Override // kotlin.DrmInitDataSchemeData1
    public final void write(Canvas canvas) {
        if (this.AudioAttributesImplApi26Parcelizer.onPlayFromSearch() && this.AudioAttributesImplApi26Parcelizer.onCommand()) {
            this.AudioAttributesCompatParcelizer.setTypeface(this.AudioAttributesImplApi26Parcelizer.onPrepareFromSearch());
            this.AudioAttributesCompatParcelizer.setTextSize(this.AudioAttributesImplApi26Parcelizer.onPrepareFromMediaId());
            this.AudioAttributesCompatParcelizer.setColor(this.AudioAttributesImplApi26Parcelizer.onFastForward());
            lambdadrmKeysRemoved4comgoogleandroidexoplayer2drmDrmSessionEventListenerEventDispatcher lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcherOnPrepareFromMediaId = this.MediaDescriptionCompat.onPrepareFromMediaId();
            lambdadrmKeysRemoved4comgoogleandroidexoplayer2drmDrmSessionEventListenerEventDispatcher lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher = lambdadrmKeysRemoved4comgoogleandroidexoplayer2drmDrmSessionEventListenerEventDispatcher.read(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
            float fWrite = this.MediaDescriptionCompat.write();
            int i = this.AudioAttributesImplApi26Parcelizer.onSetCaptioningEnabled() ? this.AudioAttributesImplApi26Parcelizer.MediaBrowserCompatCustomActionResultReceiver : this.AudioAttributesImplApi26Parcelizer.MediaBrowserCompatCustomActionResultReceiver - 1;
            for (int i2 = !this.AudioAttributesImplApi26Parcelizer.onSetPlaybackSpeed() ? 1 : 0; i2 < i; i2++) {
                drmSessionAcquired.read(lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcherOnPrepareFromMediaId, (this.AudioAttributesImplApi26Parcelizer.AudioAttributesImplBaseParcelizer[i2] - ((restoreKeys) this.AudioAttributesImplApi26Parcelizer).IconCompatParcelizer) * fWrite, this.MediaDescriptionCompat.ParcelableVolumeInfo(), lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher);
                canvas.drawText(this.AudioAttributesImplApi26Parcelizer.read(i2), lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher.IconCompatParcelizer + 10.0f, lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher.write, this.AudioAttributesCompatParcelizer);
            }
            lambdadrmKeysRemoved4comgoogleandroidexoplayer2drmDrmSessionEventListenerEventDispatcher.AudioAttributesCompatParcelizer(lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcherOnPrepareFromMediaId);
            lambdadrmKeysRemoved4comgoogleandroidexoplayer2drmDrmSessionEventListenerEventDispatcher.AudioAttributesCompatParcelizer(lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.DrmInitDataSchemeData1
    public final void IconCompatParcelizer(Canvas canvas) {
        List<getOfflineLicenseKeySetId> listAudioAttributesImplApi21Parcelizer = this.AudioAttributesImplApi26Parcelizer.AudioAttributesImplApi21Parcelizer();
        if (listAudioAttributesImplApi21Parcelizer == null) {
            return;
        }
        float fAudioAttributesCompatParcelizer = this.MediaDescriptionCompat.AudioAttributesCompatParcelizer();
        float fWrite = this.MediaDescriptionCompat.write();
        lambdadrmKeysRemoved4comgoogleandroidexoplayer2drmDrmSessionEventListenerEventDispatcher lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcherOnPrepareFromMediaId = this.MediaDescriptionCompat.onPrepareFromMediaId();
        lambdadrmKeysRemoved4comgoogleandroidexoplayer2drmDrmSessionEventListenerEventDispatcher lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher = lambdadrmKeysRemoved4comgoogleandroidexoplayer2drmDrmSessionEventListenerEventDispatcher.read(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
        for (int i = 0; i < listAudioAttributesImplApi21Parcelizer.size(); i++) {
            getOfflineLicenseKeySetId getofflinelicensekeysetid = listAudioAttributesImplApi21Parcelizer.get(i);
            if (getofflinelicensekeysetid.onPlayFromSearch()) {
                this.RemoteActionCompatParcelizer.setColor(getofflinelicensekeysetid.AudioAttributesCompatParcelizer());
                this.RemoteActionCompatParcelizer.setPathEffect(getofflinelicensekeysetid.IconCompatParcelizer());
                this.RemoteActionCompatParcelizer.setStrokeWidth(getofflinelicensekeysetid.AudioAttributesImplApi21Parcelizer());
                float f = getofflinelicensekeysetid.read();
                float fMediaSessionCompatToken = this.MediaDescriptionCompat.MediaSessionCompatToken();
                Path path = this.RatingCompat;
                path.reset();
                for (int i2 = 0; i2 < ((maybeRetryRequest) this.MediaDescriptionCompat.onSeekTo()).AudioAttributesImplBaseParcelizer().onMediaButtonEvent(); i2++) {
                    drmSessionAcquired.read(lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcherOnPrepareFromMediaId, (f - fMediaSessionCompatToken) * fWrite, (i2 * fAudioAttributesCompatParcelizer) + this.MediaDescriptionCompat.ParcelableVolumeInfo(), lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher);
                    if (i2 == 0) {
                        path.moveTo(lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher.IconCompatParcelizer, lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher.write);
                    } else {
                        path.lineTo(lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher.IconCompatParcelizer, lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher.write);
                    }
                }
                path.close();
                canvas.drawPath(path, this.RemoteActionCompatParcelizer);
            }
        }
        lambdadrmKeysRemoved4comgoogleandroidexoplayer2drmDrmSessionEventListenerEventDispatcher.AudioAttributesCompatParcelizer(lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcherOnPrepareFromMediaId);
        lambdadrmKeysRemoved4comgoogleandroidexoplayer2drmDrmSessionEventListenerEventDispatcher.AudioAttributesCompatParcelizer(lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher);
    }
}
