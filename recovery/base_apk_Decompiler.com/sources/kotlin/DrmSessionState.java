package kotlin;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.github.mikephil.charting.charts.BarChart;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.List;
import kotlin.getOfflineLicenseKeySetId;
import kotlin.hasSessionId;

/* JADX INFO: loaded from: classes4.dex */
public final class DrmSessionState extends copyWithData {
    private Path MediaDescriptionCompat;
    private BarChart MediaMetadataCompat;

    public DrmSessionState(lambdadrmSessionAcquired0comgoogleandroidexoplayer2drmDrmSessionEventListenerEventDispatcher lambdadrmsessionacquired0comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher, hasSessionId hassessionid, drmSessionReleased drmsessionreleased, BarChart barChart) {
        super(lambdadrmsessionacquired0comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher, hassessionid, drmsessionreleased);
        this.MediaDescriptionCompat = new Path();
        this.MediaMetadataCompat = barChart;
    }

    @Override // kotlin.copyWithData, kotlin.DefaultDrmSessionManagerProvisioningManagerImpl
    public final void write(float f, float f2, boolean z) {
        float f3;
        double d;
        if (this.MediaBrowserCompatSearchResultReceiver.MediaBrowserCompatItemReceiver() > 10.0f && !this.MediaBrowserCompatSearchResultReceiver.onPause()) {
            drmKeysRemoved drmkeysremovedIconCompatParcelizer = this.AudioAttributesImplApi21Parcelizer.IconCompatParcelizer(this.MediaBrowserCompatSearchResultReceiver.AudioAttributesImplBaseParcelizer(), this.MediaBrowserCompatSearchResultReceiver.read());
            drmKeysRemoved drmkeysremovedIconCompatParcelizer2 = this.AudioAttributesImplApi21Parcelizer.IconCompatParcelizer(this.MediaBrowserCompatSearchResultReceiver.AudioAttributesImplBaseParcelizer(), this.MediaBrowserCompatSearchResultReceiver.AudioAttributesImplApi21Parcelizer());
            if (z) {
                f3 = (float) drmkeysremovedIconCompatParcelizer2.AudioAttributesCompatParcelizer;
                d = drmkeysremovedIconCompatParcelizer.AudioAttributesCompatParcelizer;
            } else {
                f3 = (float) drmkeysremovedIconCompatParcelizer.AudioAttributesCompatParcelizer;
                d = drmkeysremovedIconCompatParcelizer2.AudioAttributesCompatParcelizer;
            }
            drmKeysRemoved.IconCompatParcelizer(drmkeysremovedIconCompatParcelizer);
            drmKeysRemoved.IconCompatParcelizer(drmkeysremovedIconCompatParcelizer2);
            f = f3;
            f2 = (float) d;
        }
        RemoteActionCompatParcelizer(f, f2);
    }

    @Override // kotlin.copyWithData
    protected final void AudioAttributesCompatParcelizer() {
        this.AudioAttributesCompatParcelizer.setTypeface(this.MediaBrowserCompatItemReceiver.onPrepareFromSearch());
        this.AudioAttributesCompatParcelizer.setTextSize(this.MediaBrowserCompatItemReceiver.onPrepareFromMediaId());
        DrmSessionEventListener drmSessionEventListenerWrite = drmSessionAcquired.write(this.AudioAttributesCompatParcelizer, this.MediaBrowserCompatItemReceiver.AudioAttributesImplBaseParcelizer());
        float fOnPlayFromUri = (int) (drmSessionEventListenerWrite.RemoteActionCompatParcelizer + (this.MediaBrowserCompatItemReceiver.onPlayFromUri() * 3.5f));
        float f = drmSessionEventListenerWrite.IconCompatParcelizer;
        DrmSessionEventListener drmSessionEventListenerWrite2 = drmSessionAcquired.write(drmSessionEventListenerWrite.RemoteActionCompatParcelizer, f, this.MediaBrowserCompatItemReceiver.onRemoveQueueItem());
        this.MediaBrowserCompatItemReceiver.onCustomAction = Math.round(fOnPlayFromUri);
        this.MediaBrowserCompatItemReceiver.MediaDescriptionCompat = Math.round(f);
        this.MediaBrowserCompatItemReceiver.MediaBrowserCompatSearchResultReceiver = (int) (drmSessionEventListenerWrite2.RemoteActionCompatParcelizer + (this.MediaBrowserCompatItemReceiver.onPlayFromUri() * 3.5f));
        this.MediaBrowserCompatItemReceiver.MediaMetadataCompat = Math.round(drmSessionEventListenerWrite2.IconCompatParcelizer);
        DrmSessionEventListener.IconCompatParcelizer(drmSessionEventListenerWrite2);
    }

    @Override // kotlin.copyWithData
    public final void write(Canvas canvas) {
        if (this.MediaBrowserCompatItemReceiver.onPlayFromSearch() && this.MediaBrowserCompatItemReceiver.onCommand()) {
            float fOnPlayFromUri = this.MediaBrowserCompatItemReceiver.onPlayFromUri();
            this.AudioAttributesCompatParcelizer.setTypeface(this.MediaBrowserCompatItemReceiver.onPrepareFromSearch());
            this.AudioAttributesCompatParcelizer.setTextSize(this.MediaBrowserCompatItemReceiver.onPrepareFromMediaId());
            this.AudioAttributesCompatParcelizer.setColor(this.MediaBrowserCompatItemReceiver.onFastForward());
            lambdadrmKeysRemoved4comgoogleandroidexoplayer2drmDrmSessionEventListenerEventDispatcher lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher = lambdadrmKeysRemoved4comgoogleandroidexoplayer2drmDrmSessionEventListenerEventDispatcher.read(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
            if (this.MediaBrowserCompatItemReceiver.onRewind() == hasSessionId.AudioAttributesCompatParcelizer.TOP) {
                lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher.IconCompatParcelizer = BitmapDescriptorFactory.HUE_RED;
                lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher.write = 0.5f;
                IconCompatParcelizer(canvas, this.MediaBrowserCompatSearchResultReceiver.MediaBrowserCompatCustomActionResultReceiver() + fOnPlayFromUri, lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher);
            } else if (this.MediaBrowserCompatItemReceiver.onRewind() == hasSessionId.AudioAttributesCompatParcelizer.TOP_INSIDE) {
                lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher.IconCompatParcelizer = 1.0f;
                lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher.write = 0.5f;
                IconCompatParcelizer(canvas, this.MediaBrowserCompatSearchResultReceiver.MediaBrowserCompatCustomActionResultReceiver() - fOnPlayFromUri, lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher);
            } else if (this.MediaBrowserCompatItemReceiver.onRewind() == hasSessionId.AudioAttributesCompatParcelizer.BOTTOM) {
                lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher.IconCompatParcelizer = 1.0f;
                lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher.write = 0.5f;
                IconCompatParcelizer(canvas, this.MediaBrowserCompatSearchResultReceiver.AudioAttributesImplBaseParcelizer() - fOnPlayFromUri, lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher);
            } else if (this.MediaBrowserCompatItemReceiver.onRewind() == hasSessionId.AudioAttributesCompatParcelizer.BOTTOM_INSIDE) {
                lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher.IconCompatParcelizer = 1.0f;
                lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher.write = 0.5f;
                IconCompatParcelizer(canvas, this.MediaBrowserCompatSearchResultReceiver.AudioAttributesImplBaseParcelizer() + fOnPlayFromUri, lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher);
            } else {
                lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher.IconCompatParcelizer = BitmapDescriptorFactory.HUE_RED;
                lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher.write = 0.5f;
                IconCompatParcelizer(canvas, this.MediaBrowserCompatSearchResultReceiver.MediaBrowserCompatCustomActionResultReceiver() + fOnPlayFromUri, lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher);
                lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher.IconCompatParcelizer = 1.0f;
                lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher.write = 0.5f;
                IconCompatParcelizer(canvas, this.MediaBrowserCompatSearchResultReceiver.AudioAttributesImplBaseParcelizer() - fOnPlayFromUri, lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher);
            }
            lambdadrmKeysRemoved4comgoogleandroidexoplayer2drmDrmSessionEventListenerEventDispatcher.AudioAttributesCompatParcelizer(lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher);
        }
    }

    @Override // kotlin.copyWithData
    protected final void IconCompatParcelizer(Canvas canvas, float f, lambdadrmKeysRemoved4comgoogleandroidexoplayer2drmDrmSessionEventListenerEventDispatcher lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher) {
        float fOnRemoveQueueItem = this.MediaBrowserCompatItemReceiver.onRemoveQueueItem();
        hasSessionId hassessionid = this.MediaBrowserCompatItemReceiver;
        int i = this.MediaBrowserCompatItemReceiver.MediaBrowserCompatCustomActionResultReceiver << 1;
        float[] fArr = new float[i];
        for (int i2 = 0; i2 < i; i2 += 2) {
            fArr[i2 + 1] = this.MediaBrowserCompatItemReceiver.AudioAttributesImplBaseParcelizer[i2 / 2];
        }
        this.AudioAttributesImplApi21Parcelizer.RemoteActionCompatParcelizer(fArr);
        for (int i3 = 0; i3 < i; i3 += 2) {
            float f2 = fArr[i3 + 1];
            if (this.MediaBrowserCompatSearchResultReceiver.AudioAttributesImplBaseParcelizer(f2)) {
                DefaultDrmSessionResponseHandler defaultDrmSessionResponseHandlerMediaMetadataCompat = this.MediaBrowserCompatItemReceiver.MediaMetadataCompat();
                float f3 = this.MediaBrowserCompatItemReceiver.AudioAttributesImplBaseParcelizer[i3 / 2];
                hasSessionId hassessionid2 = this.MediaBrowserCompatItemReceiver;
                write(canvas, defaultDrmSessionResponseHandlerMediaMetadataCompat.write(f3), f, f2, lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher, fOnRemoveQueueItem);
            }
        }
    }

    @Override // kotlin.copyWithData
    public final RectF read() {
        this.AudioAttributesImplBaseParcelizer.set(this.MediaBrowserCompatSearchResultReceiver.MediaBrowserCompatSearchResultReceiver());
        this.AudioAttributesImplBaseParcelizer.inset(BitmapDescriptorFactory.HUE_RED, -this.read.MediaBrowserCompatCustomActionResultReceiver());
        return this.AudioAttributesImplBaseParcelizer;
    }

    @Override // kotlin.copyWithData
    protected final void write(Canvas canvas, float f, float f2, Path path) {
        path.moveTo(this.MediaBrowserCompatSearchResultReceiver.MediaBrowserCompatCustomActionResultReceiver(), f2);
        path.lineTo(this.MediaBrowserCompatSearchResultReceiver.AudioAttributesImplBaseParcelizer(), f2);
        canvas.drawPath(path, this.write);
        path.reset();
    }

    @Override // kotlin.copyWithData
    public final void read(Canvas canvas) {
        if (this.MediaBrowserCompatItemReceiver.MediaDescriptionCompat() && this.MediaBrowserCompatItemReceiver.onPlayFromSearch()) {
            this.IconCompatParcelizer.setColor(this.MediaBrowserCompatItemReceiver.read());
            this.IconCompatParcelizer.setStrokeWidth(this.MediaBrowserCompatItemReceiver.write());
            if (this.MediaBrowserCompatItemReceiver.onRewind() == hasSessionId.AudioAttributesCompatParcelizer.TOP || this.MediaBrowserCompatItemReceiver.onRewind() == hasSessionId.AudioAttributesCompatParcelizer.TOP_INSIDE || this.MediaBrowserCompatItemReceiver.onRewind() == hasSessionId.AudioAttributesCompatParcelizer.BOTH_SIDED) {
                canvas.drawLine(this.MediaBrowserCompatSearchResultReceiver.MediaBrowserCompatCustomActionResultReceiver(), this.MediaBrowserCompatSearchResultReceiver.AudioAttributesImplApi21Parcelizer(), this.MediaBrowserCompatSearchResultReceiver.MediaBrowserCompatCustomActionResultReceiver(), this.MediaBrowserCompatSearchResultReceiver.read(), this.IconCompatParcelizer);
            }
            if (this.MediaBrowserCompatItemReceiver.onRewind() == hasSessionId.AudioAttributesCompatParcelizer.BOTTOM || this.MediaBrowserCompatItemReceiver.onRewind() == hasSessionId.AudioAttributesCompatParcelizer.BOTTOM_INSIDE || this.MediaBrowserCompatItemReceiver.onRewind() == hasSessionId.AudioAttributesCompatParcelizer.BOTH_SIDED) {
                canvas.drawLine(this.MediaBrowserCompatSearchResultReceiver.AudioAttributesImplBaseParcelizer(), this.MediaBrowserCompatSearchResultReceiver.AudioAttributesImplApi21Parcelizer(), this.MediaBrowserCompatSearchResultReceiver.AudioAttributesImplBaseParcelizer(), this.MediaBrowserCompatSearchResultReceiver.read(), this.IconCompatParcelizer);
            }
        }
    }

    @Override // kotlin.copyWithData
    public final void IconCompatParcelizer(Canvas canvas) {
        List<getOfflineLicenseKeySetId> listAudioAttributesImplApi21Parcelizer = this.MediaBrowserCompatItemReceiver.AudioAttributesImplApi21Parcelizer();
        if (listAudioAttributesImplApi21Parcelizer == null || listAudioAttributesImplApi21Parcelizer.size() <= 0) {
            return;
        }
        float[] fArr = this.AudioAttributesImplApi26Parcelizer;
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        Path path = this.MediaDescriptionCompat;
        path.reset();
        for (int i = 0; i < listAudioAttributesImplApi21Parcelizer.size(); i++) {
            getOfflineLicenseKeySetId getofflinelicensekeysetid = listAudioAttributesImplApi21Parcelizer.get(i);
            if (getofflinelicensekeysetid.onPlayFromSearch()) {
                int iSave = canvas.save();
                this.MediaBrowserCompatCustomActionResultReceiver.set(this.MediaBrowserCompatSearchResultReceiver.MediaBrowserCompatSearchResultReceiver());
                this.MediaBrowserCompatCustomActionResultReceiver.inset(BitmapDescriptorFactory.HUE_RED, -getofflinelicensekeysetid.AudioAttributesImplApi21Parcelizer());
                canvas.clipRect(this.MediaBrowserCompatCustomActionResultReceiver);
                this.RemoteActionCompatParcelizer.setStyle(Paint.Style.STROKE);
                this.RemoteActionCompatParcelizer.setColor(getofflinelicensekeysetid.AudioAttributesCompatParcelizer());
                this.RemoteActionCompatParcelizer.setStrokeWidth(getofflinelicensekeysetid.AudioAttributesImplApi21Parcelizer());
                this.RemoteActionCompatParcelizer.setPathEffect(getofflinelicensekeysetid.IconCompatParcelizer());
                fArr[1] = getofflinelicensekeysetid.read();
                this.AudioAttributesImplApi21Parcelizer.RemoteActionCompatParcelizer(fArr);
                path.moveTo(this.MediaBrowserCompatSearchResultReceiver.AudioAttributesImplBaseParcelizer(), fArr[1]);
                path.lineTo(this.MediaBrowserCompatSearchResultReceiver.MediaBrowserCompatCustomActionResultReceiver(), fArr[1]);
                canvas.drawPath(path, this.RemoteActionCompatParcelizer);
                path.reset();
                String strRemoteActionCompatParcelizer = getofflinelicensekeysetid.RemoteActionCompatParcelizer();
                if (strRemoteActionCompatParcelizer != null && !strRemoteActionCompatParcelizer.equals("")) {
                    this.RemoteActionCompatParcelizer.setStyle(getofflinelicensekeysetid.AudioAttributesImplApi26Parcelizer());
                    this.RemoteActionCompatParcelizer.setPathEffect(null);
                    this.RemoteActionCompatParcelizer.setColor(getofflinelicensekeysetid.onFastForward());
                    this.RemoteActionCompatParcelizer.setStrokeWidth(0.5f);
                    this.RemoteActionCompatParcelizer.setTextSize(getofflinelicensekeysetid.onPrepareFromMediaId());
                    float fAudioAttributesCompatParcelizer = drmSessionAcquired.AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer, strRemoteActionCompatParcelizer);
                    float fWrite = drmSessionAcquired.write(4.0f) + getofflinelicensekeysetid.onPlayFromUri();
                    float fAudioAttributesImplApi21Parcelizer = getofflinelicensekeysetid.AudioAttributesImplApi21Parcelizer() + fAudioAttributesCompatParcelizer + getofflinelicensekeysetid.onPrepare();
                    getOfflineLicenseKeySetId.AudioAttributesCompatParcelizer audioAttributesCompatParcelizerWrite = getofflinelicensekeysetid.write();
                    if (audioAttributesCompatParcelizerWrite == getOfflineLicenseKeySetId.AudioAttributesCompatParcelizer.RIGHT_TOP) {
                        this.RemoteActionCompatParcelizer.setTextAlign(Paint.Align.RIGHT);
                        canvas.drawText(strRemoteActionCompatParcelizer, this.MediaBrowserCompatSearchResultReceiver.MediaBrowserCompatCustomActionResultReceiver() - fWrite, (fArr[1] - fAudioAttributesImplApi21Parcelizer) + fAudioAttributesCompatParcelizer, this.RemoteActionCompatParcelizer);
                    } else if (audioAttributesCompatParcelizerWrite == getOfflineLicenseKeySetId.AudioAttributesCompatParcelizer.RIGHT_BOTTOM) {
                        this.RemoteActionCompatParcelizer.setTextAlign(Paint.Align.RIGHT);
                        canvas.drawText(strRemoteActionCompatParcelizer, this.MediaBrowserCompatSearchResultReceiver.MediaBrowserCompatCustomActionResultReceiver() - fWrite, fArr[1] + fAudioAttributesImplApi21Parcelizer, this.RemoteActionCompatParcelizer);
                    } else if (audioAttributesCompatParcelizerWrite == getOfflineLicenseKeySetId.AudioAttributesCompatParcelizer.LEFT_TOP) {
                        this.RemoteActionCompatParcelizer.setTextAlign(Paint.Align.LEFT);
                        canvas.drawText(strRemoteActionCompatParcelizer, this.MediaBrowserCompatSearchResultReceiver.AudioAttributesImplBaseParcelizer() + fWrite, (fArr[1] - fAudioAttributesImplApi21Parcelizer) + fAudioAttributesCompatParcelizer, this.RemoteActionCompatParcelizer);
                    } else {
                        this.RemoteActionCompatParcelizer.setTextAlign(Paint.Align.LEFT);
                        canvas.drawText(strRemoteActionCompatParcelizer, this.MediaBrowserCompatSearchResultReceiver.onFastForward() + fWrite, fArr[1] + fAudioAttributesImplApi21Parcelizer, this.RemoteActionCompatParcelizer);
                    }
                }
                canvas.restoreToCount(iSave);
            }
        }
    }
}
