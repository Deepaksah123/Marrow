package kotlin;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.List;
import kotlin.getOfflineLicenseKeySetId;
import kotlin.hasSessionId;

/* JADX INFO: loaded from: classes2.dex */
public class copyWithData extends DefaultDrmSessionManagerProvisioningManagerImpl {
    protected float[] AudioAttributesImplApi26Parcelizer;
    protected RectF AudioAttributesImplBaseParcelizer;
    protected RectF MediaBrowserCompatCustomActionResultReceiver;
    protected hasSessionId MediaBrowserCompatItemReceiver;
    private float[] MediaBrowserCompatMediaItem;
    private Path MediaDescriptionCompat;
    private float[] MediaMetadataCompat;
    private Path RatingCompat;

    public copyWithData(lambdadrmSessionAcquired0comgoogleandroidexoplayer2drmDrmSessionEventListenerEventDispatcher lambdadrmsessionacquired0comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher, hasSessionId hassessionid, drmSessionReleased drmsessionreleased) {
        super(lambdadrmsessionacquired0comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher, drmsessionreleased, hassessionid);
        this.MediaDescriptionCompat = new Path();
        this.MediaBrowserCompatMediaItem = new float[2];
        this.AudioAttributesImplBaseParcelizer = new RectF();
        this.AudioAttributesImplApi26Parcelizer = new float[2];
        this.MediaBrowserCompatCustomActionResultReceiver = new RectF();
        this.MediaMetadataCompat = new float[4];
        this.RatingCompat = new Path();
        this.MediaBrowserCompatItemReceiver = hassessionid;
        this.AudioAttributesCompatParcelizer.setColor(-16777216);
        this.AudioAttributesCompatParcelizer.setTextAlign(Paint.Align.CENTER);
        this.AudioAttributesCompatParcelizer.setTextSize(drmSessionAcquired.write(10.0f));
    }

    private void RemoteActionCompatParcelizer() {
        this.write.setColor(this.MediaBrowserCompatItemReceiver.AudioAttributesCompatParcelizer());
        this.write.setStrokeWidth(this.MediaBrowserCompatItemReceiver.MediaBrowserCompatCustomActionResultReceiver());
        this.write.setPathEffect(this.MediaBrowserCompatItemReceiver.MediaBrowserCompatItemReceiver());
    }

    @Override // kotlin.DefaultDrmSessionManagerProvisioningManagerImpl
    public void write(float f, float f2, boolean z) {
        float f3;
        double d;
        if (this.MediaBrowserCompatSearchResultReceiver.MediaBrowserCompatItemReceiver() > 10.0f && !this.MediaBrowserCompatSearchResultReceiver.onMediaButtonEvent()) {
            drmKeysRemoved drmkeysremovedIconCompatParcelizer = this.AudioAttributesImplApi21Parcelizer.IconCompatParcelizer(this.MediaBrowserCompatSearchResultReceiver.AudioAttributesImplBaseParcelizer(), this.MediaBrowserCompatSearchResultReceiver.AudioAttributesImplApi21Parcelizer());
            drmKeysRemoved drmkeysremovedIconCompatParcelizer2 = this.AudioAttributesImplApi21Parcelizer.IconCompatParcelizer(this.MediaBrowserCompatSearchResultReceiver.MediaBrowserCompatCustomActionResultReceiver(), this.MediaBrowserCompatSearchResultReceiver.AudioAttributesImplApi21Parcelizer());
            if (z) {
                f3 = (float) drmkeysremovedIconCompatParcelizer2.IconCompatParcelizer;
                d = drmkeysremovedIconCompatParcelizer.IconCompatParcelizer;
            } else {
                f3 = (float) drmkeysremovedIconCompatParcelizer.IconCompatParcelizer;
                d = drmkeysremovedIconCompatParcelizer2.IconCompatParcelizer;
            }
            drmKeysRemoved.IconCompatParcelizer(drmkeysremovedIconCompatParcelizer);
            drmKeysRemoved.IconCompatParcelizer(drmkeysremovedIconCompatParcelizer2);
            f = f3;
            f2 = (float) d;
        }
        RemoteActionCompatParcelizer(f, f2);
    }

    @Override // kotlin.DefaultDrmSessionManagerProvisioningManagerImpl
    protected final void RemoteActionCompatParcelizer(float f, float f2) {
        super.RemoteActionCompatParcelizer(f, f2);
        AudioAttributesCompatParcelizer();
    }

    protected void AudioAttributesCompatParcelizer() {
        String strAudioAttributesImplBaseParcelizer = this.MediaBrowserCompatItemReceiver.AudioAttributesImplBaseParcelizer();
        this.AudioAttributesCompatParcelizer.setTypeface(this.MediaBrowserCompatItemReceiver.onPrepareFromSearch());
        this.AudioAttributesCompatParcelizer.setTextSize(this.MediaBrowserCompatItemReceiver.onPrepareFromMediaId());
        DrmSessionEventListener drmSessionEventListenerWrite = drmSessionAcquired.write(this.AudioAttributesCompatParcelizer, strAudioAttributesImplBaseParcelizer);
        float f = drmSessionEventListenerWrite.RemoteActionCompatParcelizer;
        float fAudioAttributesCompatParcelizer = drmSessionAcquired.AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer, "Q");
        DrmSessionEventListener drmSessionEventListenerWrite2 = drmSessionAcquired.write(f, fAudioAttributesCompatParcelizer, this.MediaBrowserCompatItemReceiver.onRemoveQueueItem());
        this.MediaBrowserCompatItemReceiver.onCustomAction = Math.round(f);
        this.MediaBrowserCompatItemReceiver.MediaDescriptionCompat = Math.round(fAudioAttributesCompatParcelizer);
        this.MediaBrowserCompatItemReceiver.MediaBrowserCompatSearchResultReceiver = Math.round(drmSessionEventListenerWrite2.RemoteActionCompatParcelizer);
        this.MediaBrowserCompatItemReceiver.MediaMetadataCompat = Math.round(drmSessionEventListenerWrite2.IconCompatParcelizer);
        DrmSessionEventListener.IconCompatParcelizer(drmSessionEventListenerWrite2);
        DrmSessionEventListener.IconCompatParcelizer(drmSessionEventListenerWrite);
    }

    public void write(Canvas canvas) {
        if (this.MediaBrowserCompatItemReceiver.onPlayFromSearch() && this.MediaBrowserCompatItemReceiver.onCommand()) {
            float fOnPrepare = this.MediaBrowserCompatItemReceiver.onPrepare();
            this.AudioAttributesCompatParcelizer.setTypeface(this.MediaBrowserCompatItemReceiver.onPrepareFromSearch());
            this.AudioAttributesCompatParcelizer.setTextSize(this.MediaBrowserCompatItemReceiver.onPrepareFromMediaId());
            this.AudioAttributesCompatParcelizer.setColor(this.MediaBrowserCompatItemReceiver.onFastForward());
            lambdadrmKeysRemoved4comgoogleandroidexoplayer2drmDrmSessionEventListenerEventDispatcher lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher = lambdadrmKeysRemoved4comgoogleandroidexoplayer2drmDrmSessionEventListenerEventDispatcher.read(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
            if (this.MediaBrowserCompatItemReceiver.onRewind() == hasSessionId.AudioAttributesCompatParcelizer.TOP) {
                lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher.IconCompatParcelizer = 0.5f;
                lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher.write = 1.0f;
                IconCompatParcelizer(canvas, this.MediaBrowserCompatSearchResultReceiver.AudioAttributesImplApi21Parcelizer() - fOnPrepare, lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher);
            } else if (this.MediaBrowserCompatItemReceiver.onRewind() == hasSessionId.AudioAttributesCompatParcelizer.TOP_INSIDE) {
                lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher.IconCompatParcelizer = 0.5f;
                lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher.write = 1.0f;
                IconCompatParcelizer(canvas, this.MediaBrowserCompatSearchResultReceiver.AudioAttributesImplApi21Parcelizer() + fOnPrepare + this.MediaBrowserCompatItemReceiver.MediaMetadataCompat, lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher);
            } else if (this.MediaBrowserCompatItemReceiver.onRewind() == hasSessionId.AudioAttributesCompatParcelizer.BOTTOM) {
                lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher.IconCompatParcelizer = 0.5f;
                lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher.write = BitmapDescriptorFactory.HUE_RED;
                IconCompatParcelizer(canvas, this.MediaBrowserCompatSearchResultReceiver.read() + fOnPrepare, lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher);
            } else if (this.MediaBrowserCompatItemReceiver.onRewind() == hasSessionId.AudioAttributesCompatParcelizer.BOTTOM_INSIDE) {
                lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher.IconCompatParcelizer = 0.5f;
                lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher.write = BitmapDescriptorFactory.HUE_RED;
                IconCompatParcelizer(canvas, (this.MediaBrowserCompatSearchResultReceiver.read() - fOnPrepare) - this.MediaBrowserCompatItemReceiver.MediaMetadataCompat, lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher);
            } else {
                lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher.IconCompatParcelizer = 0.5f;
                lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher.write = 1.0f;
                IconCompatParcelizer(canvas, this.MediaBrowserCompatSearchResultReceiver.AudioAttributesImplApi21Parcelizer() - fOnPrepare, lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher);
                lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher.IconCompatParcelizer = 0.5f;
                lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher.write = BitmapDescriptorFactory.HUE_RED;
                IconCompatParcelizer(canvas, this.MediaBrowserCompatSearchResultReceiver.read() + fOnPrepare, lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher);
            }
            lambdadrmKeysRemoved4comgoogleandroidexoplayer2drmDrmSessionEventListenerEventDispatcher.AudioAttributesCompatParcelizer(lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher);
        }
    }

    public void read(Canvas canvas) {
        if (this.MediaBrowserCompatItemReceiver.MediaDescriptionCompat() && this.MediaBrowserCompatItemReceiver.onPlayFromSearch()) {
            this.IconCompatParcelizer.setColor(this.MediaBrowserCompatItemReceiver.read());
            this.IconCompatParcelizer.setStrokeWidth(this.MediaBrowserCompatItemReceiver.write());
            this.IconCompatParcelizer.setPathEffect(this.MediaBrowserCompatItemReceiver.RemoteActionCompatParcelizer());
            if (this.MediaBrowserCompatItemReceiver.onRewind() == hasSessionId.AudioAttributesCompatParcelizer.TOP || this.MediaBrowserCompatItemReceiver.onRewind() == hasSessionId.AudioAttributesCompatParcelizer.TOP_INSIDE || this.MediaBrowserCompatItemReceiver.onRewind() == hasSessionId.AudioAttributesCompatParcelizer.BOTH_SIDED) {
                canvas.drawLine(this.MediaBrowserCompatSearchResultReceiver.AudioAttributesImplBaseParcelizer(), this.MediaBrowserCompatSearchResultReceiver.AudioAttributesImplApi21Parcelizer(), this.MediaBrowserCompatSearchResultReceiver.MediaBrowserCompatCustomActionResultReceiver(), this.MediaBrowserCompatSearchResultReceiver.AudioAttributesImplApi21Parcelizer(), this.IconCompatParcelizer);
            }
            if (this.MediaBrowserCompatItemReceiver.onRewind() == hasSessionId.AudioAttributesCompatParcelizer.BOTTOM || this.MediaBrowserCompatItemReceiver.onRewind() == hasSessionId.AudioAttributesCompatParcelizer.BOTTOM_INSIDE || this.MediaBrowserCompatItemReceiver.onRewind() == hasSessionId.AudioAttributesCompatParcelizer.BOTH_SIDED) {
                canvas.drawLine(this.MediaBrowserCompatSearchResultReceiver.AudioAttributesImplBaseParcelizer(), this.MediaBrowserCompatSearchResultReceiver.read(), this.MediaBrowserCompatSearchResultReceiver.MediaBrowserCompatCustomActionResultReceiver(), this.MediaBrowserCompatSearchResultReceiver.read(), this.IconCompatParcelizer);
            }
        }
    }

    protected void IconCompatParcelizer(Canvas canvas, float f, lambdadrmKeysRemoved4comgoogleandroidexoplayer2drmDrmSessionEventListenerEventDispatcher lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher) {
        float fOnRemoveQueueItem = this.MediaBrowserCompatItemReceiver.onRemoveQueueItem();
        int i = this.MediaBrowserCompatItemReceiver.MediaBrowserCompatCustomActionResultReceiver << 1;
        float[] fArr = new float[i];
        for (int i2 = 0; i2 < i; i2 += 2) {
            fArr[i2] = this.MediaBrowserCompatItemReceiver.AudioAttributesImplBaseParcelizer[i2 / 2];
        }
        this.AudioAttributesImplApi21Parcelizer.RemoteActionCompatParcelizer(fArr);
        for (int i3 = 0; i3 < i; i3 += 2) {
            float f2 = fArr[i3];
            if (this.MediaBrowserCompatSearchResultReceiver.read(f2)) {
                int i4 = i3 / 2;
                String strWrite = this.MediaBrowserCompatItemReceiver.MediaMetadataCompat().write(this.MediaBrowserCompatItemReceiver.AudioAttributesImplBaseParcelizer[i4]);
                if (this.MediaBrowserCompatItemReceiver.onSetRating()) {
                    if (i4 == this.MediaBrowserCompatItemReceiver.MediaBrowserCompatCustomActionResultReceiver - 1 && this.MediaBrowserCompatItemReceiver.MediaBrowserCompatCustomActionResultReceiver > 1) {
                        float f3 = drmSessionAcquired.read(this.AudioAttributesCompatParcelizer, strWrite);
                        if (f3 > this.MediaBrowserCompatSearchResultReceiver.onPlay() * 2.0f && f2 + f3 > this.MediaBrowserCompatSearchResultReceiver.MediaBrowserCompatMediaItem()) {
                            f2 -= f3 / 2.0f;
                        }
                    } else if (i3 == 0) {
                        f2 += drmSessionAcquired.read(this.AudioAttributesCompatParcelizer, strWrite) / 2.0f;
                    }
                }
                write(canvas, strWrite, f2, f, lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher, fOnRemoveQueueItem);
            }
        }
    }

    protected final void write(Canvas canvas, String str, float f, float f2, lambdadrmKeysRemoved4comgoogleandroidexoplayer2drmDrmSessionEventListenerEventDispatcher lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher, float f3) {
        drmSessionAcquired.write(canvas, str, f, f2, this.AudioAttributesCompatParcelizer, lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher, f3);
    }

    public final void AudioAttributesCompatParcelizer(Canvas canvas) {
        if (this.MediaBrowserCompatItemReceiver.MediaBrowserCompatMediaItem() && this.MediaBrowserCompatItemReceiver.onPlayFromSearch()) {
            int iSave = canvas.save();
            canvas.clipRect(read());
            if (this.MediaBrowserCompatMediaItem.length != (this.read.MediaBrowserCompatCustomActionResultReceiver << 1)) {
                this.MediaBrowserCompatMediaItem = new float[this.MediaBrowserCompatItemReceiver.MediaBrowserCompatCustomActionResultReceiver << 1];
            }
            float[] fArr = this.MediaBrowserCompatMediaItem;
            for (int i = 0; i < fArr.length; i += 2) {
                int i2 = i / 2;
                fArr[i] = this.MediaBrowserCompatItemReceiver.AudioAttributesImplBaseParcelizer[i2];
                fArr[i + 1] = this.MediaBrowserCompatItemReceiver.AudioAttributesImplBaseParcelizer[i2];
            }
            this.AudioAttributesImplApi21Parcelizer.RemoteActionCompatParcelizer(fArr);
            RemoteActionCompatParcelizer();
            Path path = this.MediaDescriptionCompat;
            path.reset();
            for (int i3 = 0; i3 < fArr.length; i3 += 2) {
                write(canvas, fArr[i3], fArr[i3 + 1], path);
            }
            canvas.restoreToCount(iSave);
        }
    }

    public RectF read() {
        this.AudioAttributesImplBaseParcelizer.set(this.MediaBrowserCompatSearchResultReceiver.MediaBrowserCompatSearchResultReceiver());
        this.AudioAttributesImplBaseParcelizer.inset(-this.read.MediaBrowserCompatCustomActionResultReceiver(), BitmapDescriptorFactory.HUE_RED);
        return this.AudioAttributesImplBaseParcelizer;
    }

    protected void write(Canvas canvas, float f, float f2, Path path) {
        path.moveTo(f, this.MediaBrowserCompatSearchResultReceiver.read());
        path.lineTo(f, this.MediaBrowserCompatSearchResultReceiver.AudioAttributesImplApi21Parcelizer());
        canvas.drawPath(path, this.write);
        path.reset();
    }

    public void IconCompatParcelizer(Canvas canvas) {
        List<getOfflineLicenseKeySetId> listAudioAttributesImplApi21Parcelizer = this.MediaBrowserCompatItemReceiver.AudioAttributesImplApi21Parcelizer();
        if (listAudioAttributesImplApi21Parcelizer == null || listAudioAttributesImplApi21Parcelizer.size() <= 0) {
            return;
        }
        float[] fArr = this.AudioAttributesImplApi26Parcelizer;
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        for (int i = 0; i < listAudioAttributesImplApi21Parcelizer.size(); i++) {
            getOfflineLicenseKeySetId getofflinelicensekeysetid = listAudioAttributesImplApi21Parcelizer.get(i);
            if (getofflinelicensekeysetid.onPlayFromSearch()) {
                int iSave = canvas.save();
                this.MediaBrowserCompatCustomActionResultReceiver.set(this.MediaBrowserCompatSearchResultReceiver.MediaBrowserCompatSearchResultReceiver());
                this.MediaBrowserCompatCustomActionResultReceiver.inset(-getofflinelicensekeysetid.AudioAttributesImplApi21Parcelizer(), BitmapDescriptorFactory.HUE_RED);
                canvas.clipRect(this.MediaBrowserCompatCustomActionResultReceiver);
                fArr[0] = getofflinelicensekeysetid.read();
                fArr[1] = 0.0f;
                this.AudioAttributesImplApi21Parcelizer.RemoteActionCompatParcelizer(fArr);
                AudioAttributesCompatParcelizer(canvas, getofflinelicensekeysetid, fArr);
                RemoteActionCompatParcelizer(canvas, getofflinelicensekeysetid, fArr, getofflinelicensekeysetid.onPrepare() + 2.0f);
                canvas.restoreToCount(iSave);
            }
        }
    }

    private void AudioAttributesCompatParcelizer(Canvas canvas, getOfflineLicenseKeySetId getofflinelicensekeysetid, float[] fArr) {
        float[] fArr2 = this.MediaMetadataCompat;
        fArr2[0] = fArr[0];
        fArr2[1] = this.MediaBrowserCompatSearchResultReceiver.AudioAttributesImplApi21Parcelizer();
        float[] fArr3 = this.MediaMetadataCompat;
        fArr3[2] = fArr[0];
        fArr3[3] = this.MediaBrowserCompatSearchResultReceiver.read();
        this.RatingCompat.reset();
        Path path = this.RatingCompat;
        float[] fArr4 = this.MediaMetadataCompat;
        path.moveTo(fArr4[0], fArr4[1]);
        Path path2 = this.RatingCompat;
        float[] fArr5 = this.MediaMetadataCompat;
        path2.lineTo(fArr5[2], fArr5[3]);
        this.RemoteActionCompatParcelizer.setStyle(Paint.Style.STROKE);
        this.RemoteActionCompatParcelizer.setColor(getofflinelicensekeysetid.AudioAttributesCompatParcelizer());
        this.RemoteActionCompatParcelizer.setStrokeWidth(getofflinelicensekeysetid.AudioAttributesImplApi21Parcelizer());
        this.RemoteActionCompatParcelizer.setPathEffect(getofflinelicensekeysetid.IconCompatParcelizer());
        canvas.drawPath(this.RatingCompat, this.RemoteActionCompatParcelizer);
    }

    private void RemoteActionCompatParcelizer(Canvas canvas, getOfflineLicenseKeySetId getofflinelicensekeysetid, float[] fArr, float f) {
        String strRemoteActionCompatParcelizer = getofflinelicensekeysetid.RemoteActionCompatParcelizer();
        if (strRemoteActionCompatParcelizer == null || strRemoteActionCompatParcelizer.equals("")) {
            return;
        }
        this.RemoteActionCompatParcelizer.setStyle(getofflinelicensekeysetid.AudioAttributesImplApi26Parcelizer());
        this.RemoteActionCompatParcelizer.setPathEffect(null);
        this.RemoteActionCompatParcelizer.setColor(getofflinelicensekeysetid.onFastForward());
        this.RemoteActionCompatParcelizer.setStrokeWidth(0.5f);
        this.RemoteActionCompatParcelizer.setTextSize(getofflinelicensekeysetid.onPrepareFromMediaId());
        float fAudioAttributesImplApi21Parcelizer = getofflinelicensekeysetid.AudioAttributesImplApi21Parcelizer() + getofflinelicensekeysetid.onPlayFromUri();
        getOfflineLicenseKeySetId.AudioAttributesCompatParcelizer audioAttributesCompatParcelizerWrite = getofflinelicensekeysetid.write();
        if (audioAttributesCompatParcelizerWrite == getOfflineLicenseKeySetId.AudioAttributesCompatParcelizer.RIGHT_TOP) {
            float fAudioAttributesCompatParcelizer = drmSessionAcquired.AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer, strRemoteActionCompatParcelizer);
            this.RemoteActionCompatParcelizer.setTextAlign(Paint.Align.LEFT);
            canvas.drawText(strRemoteActionCompatParcelizer, fArr[0] + fAudioAttributesImplApi21Parcelizer, this.MediaBrowserCompatSearchResultReceiver.AudioAttributesImplApi21Parcelizer() + f + fAudioAttributesCompatParcelizer, this.RemoteActionCompatParcelizer);
        } else if (audioAttributesCompatParcelizerWrite == getOfflineLicenseKeySetId.AudioAttributesCompatParcelizer.RIGHT_BOTTOM) {
            this.RemoteActionCompatParcelizer.setTextAlign(Paint.Align.LEFT);
            canvas.drawText(strRemoteActionCompatParcelizer, fArr[0] + fAudioAttributesImplApi21Parcelizer, this.MediaBrowserCompatSearchResultReceiver.read() - f, this.RemoteActionCompatParcelizer);
        } else if (audioAttributesCompatParcelizerWrite == getOfflineLicenseKeySetId.AudioAttributesCompatParcelizer.LEFT_TOP) {
            this.RemoteActionCompatParcelizer.setTextAlign(Paint.Align.RIGHT);
            canvas.drawText(strRemoteActionCompatParcelizer, fArr[0] - fAudioAttributesImplApi21Parcelizer, this.MediaBrowserCompatSearchResultReceiver.AudioAttributesImplApi21Parcelizer() + f + drmSessionAcquired.AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer, strRemoteActionCompatParcelizer), this.RemoteActionCompatParcelizer);
        } else {
            this.RemoteActionCompatParcelizer.setTextAlign(Paint.Align.RIGHT);
            canvas.drawText(strRemoteActionCompatParcelizer, fArr[0] - fAudioAttributesImplApi21Parcelizer, this.MediaBrowserCompatSearchResultReceiver.read() - f, this.RemoteActionCompatParcelizer);
        }
    }
}
