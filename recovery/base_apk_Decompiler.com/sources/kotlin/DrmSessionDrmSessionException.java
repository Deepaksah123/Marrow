package kotlin;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.List;
import kotlin.getError;
import kotlin.getOfflineLicenseKeySetId;

/* JADX INFO: loaded from: classes4.dex */
public final class DrmSessionDrmSessionException extends DrmInitDataSchemeData1 {
    private Path MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    private Path MediaDescriptionCompat;
    private float[] RatingCompat;

    public DrmSessionDrmSessionException(lambdadrmSessionAcquired0comgoogleandroidexoplayer2drmDrmSessionEventListenerEventDispatcher lambdadrmsessionacquired0comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher, getError geterror, drmSessionReleased drmsessionreleased) {
        super(lambdadrmsessionacquired0comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher, geterror, drmsessionreleased);
        this.MediaDescriptionCompat = new Path();
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = new Path();
        this.RatingCompat = new float[4];
        this.RemoteActionCompatParcelizer.setTextAlign(Paint.Align.LEFT);
    }

    @Override // kotlin.DefaultDrmSessionManagerProvisioningManagerImpl
    public final void write(float f, float f2, boolean z) {
        float f3;
        double d;
        if (this.MediaBrowserCompatSearchResultReceiver.AudioAttributesImplApi26Parcelizer() > 10.0f && !this.MediaBrowserCompatSearchResultReceiver.onMediaButtonEvent()) {
            drmKeysRemoved drmkeysremovedIconCompatParcelizer = this.AudioAttributesImplApi21Parcelizer.IconCompatParcelizer(this.MediaBrowserCompatSearchResultReceiver.AudioAttributesImplBaseParcelizer(), this.MediaBrowserCompatSearchResultReceiver.AudioAttributesImplApi21Parcelizer());
            drmKeysRemoved drmkeysremovedIconCompatParcelizer2 = this.AudioAttributesImplApi21Parcelizer.IconCompatParcelizer(this.MediaBrowserCompatSearchResultReceiver.MediaBrowserCompatCustomActionResultReceiver(), this.MediaBrowserCompatSearchResultReceiver.AudioAttributesImplApi21Parcelizer());
            if (!z) {
                f3 = (float) drmkeysremovedIconCompatParcelizer.IconCompatParcelizer;
                d = drmkeysremovedIconCompatParcelizer2.IconCompatParcelizer;
            } else {
                f3 = (float) drmkeysremovedIconCompatParcelizer2.IconCompatParcelizer;
                d = drmkeysremovedIconCompatParcelizer.IconCompatParcelizer;
            }
            drmKeysRemoved.IconCompatParcelizer(drmkeysremovedIconCompatParcelizer);
            drmKeysRemoved.IconCompatParcelizer(drmkeysremovedIconCompatParcelizer2);
            f = f3;
            f2 = (float) d;
        }
        RemoteActionCompatParcelizer(f, f2);
    }

    @Override // kotlin.DrmInitDataSchemeData1
    public final void write(Canvas canvas) {
        float fAudioAttributesImplApi21Parcelizer;
        if (this.AudioAttributesImplApi26Parcelizer.onPlayFromSearch() && this.AudioAttributesImplApi26Parcelizer.onCommand()) {
            float[] fArr = read();
            this.AudioAttributesCompatParcelizer.setTypeface(this.AudioAttributesImplApi26Parcelizer.onPrepareFromSearch());
            this.AudioAttributesCompatParcelizer.setTextSize(this.AudioAttributesImplApi26Parcelizer.onPrepareFromMediaId());
            this.AudioAttributesCompatParcelizer.setColor(this.AudioAttributesImplApi26Parcelizer.onFastForward());
            this.AudioAttributesCompatParcelizer.setTextAlign(Paint.Align.CENTER);
            float fWrite = drmSessionAcquired.write(2.5f);
            float fAudioAttributesCompatParcelizer = drmSessionAcquired.AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer, "Q");
            getError.write writeVarOnRemoveQueueItem = this.AudioAttributesImplApi26Parcelizer.onRemoveQueueItem();
            this.AudioAttributesImplApi26Parcelizer.onRewind();
            if (writeVarOnRemoveQueueItem == getError.write.LEFT) {
                getError.IconCompatParcelizer iconCompatParcelizer = getError.IconCompatParcelizer.OUTSIDE_CHART;
                fAudioAttributesImplApi21Parcelizer = this.MediaBrowserCompatSearchResultReceiver.AudioAttributesImplApi21Parcelizer() - fWrite;
            } else {
                getError.IconCompatParcelizer iconCompatParcelizer2 = getError.IconCompatParcelizer.OUTSIDE_CHART;
                fAudioAttributesImplApi21Parcelizer = this.MediaBrowserCompatSearchResultReceiver.read() + fAudioAttributesCompatParcelizer + fWrite;
            }
            RemoteActionCompatParcelizer(canvas, fAudioAttributesImplApi21Parcelizer, fArr, this.AudioAttributesImplApi26Parcelizer.onPrepare());
        }
    }

    @Override // kotlin.DrmInitDataSchemeData1
    public final void RemoteActionCompatParcelizer(Canvas canvas) {
        if (this.AudioAttributesImplApi26Parcelizer.onPlayFromSearch() && this.AudioAttributesImplApi26Parcelizer.MediaDescriptionCompat()) {
            this.IconCompatParcelizer.setColor(this.AudioAttributesImplApi26Parcelizer.read());
            this.IconCompatParcelizer.setStrokeWidth(this.AudioAttributesImplApi26Parcelizer.write());
            if (this.AudioAttributesImplApi26Parcelizer.onRemoveQueueItem() == getError.write.LEFT) {
                canvas.drawLine(this.MediaBrowserCompatSearchResultReceiver.AudioAttributesImplBaseParcelizer(), this.MediaBrowserCompatSearchResultReceiver.AudioAttributesImplApi21Parcelizer(), this.MediaBrowserCompatSearchResultReceiver.MediaBrowserCompatCustomActionResultReceiver(), this.MediaBrowserCompatSearchResultReceiver.AudioAttributesImplApi21Parcelizer(), this.IconCompatParcelizer);
            } else {
                canvas.drawLine(this.MediaBrowserCompatSearchResultReceiver.AudioAttributesImplBaseParcelizer(), this.MediaBrowserCompatSearchResultReceiver.read(), this.MediaBrowserCompatSearchResultReceiver.MediaBrowserCompatCustomActionResultReceiver(), this.MediaBrowserCompatSearchResultReceiver.read(), this.IconCompatParcelizer);
            }
        }
    }

    @Override // kotlin.DrmInitDataSchemeData1
    protected final void RemoteActionCompatParcelizer(Canvas canvas, float f, float[] fArr, float f2) {
        this.AudioAttributesCompatParcelizer.setTypeface(this.AudioAttributesImplApi26Parcelizer.onPrepareFromSearch());
        this.AudioAttributesCompatParcelizer.setTextSize(this.AudioAttributesImplApi26Parcelizer.onPrepareFromMediaId());
        this.AudioAttributesCompatParcelizer.setColor(this.AudioAttributesImplApi26Parcelizer.onFastForward());
        int i = this.AudioAttributesImplApi26Parcelizer.onSetCaptioningEnabled() ? this.AudioAttributesImplApi26Parcelizer.MediaBrowserCompatCustomActionResultReceiver : this.AudioAttributesImplApi26Parcelizer.MediaBrowserCompatCustomActionResultReceiver - 1;
        for (int i2 = !this.AudioAttributesImplApi26Parcelizer.onSetPlaybackSpeed() ? 1 : 0; i2 < i; i2++) {
            canvas.drawText(this.AudioAttributesImplApi26Parcelizer.read(i2), fArr[i2 << 1], f - f2, this.AudioAttributesCompatParcelizer);
        }
    }

    @Override // kotlin.DrmInitDataSchemeData1
    protected final float[] read() {
        if (this.AudioAttributesImplBaseParcelizer.length != (this.AudioAttributesImplApi26Parcelizer.MediaBrowserCompatCustomActionResultReceiver << 1)) {
            this.AudioAttributesImplBaseParcelizer = new float[this.AudioAttributesImplApi26Parcelizer.MediaBrowserCompatCustomActionResultReceiver << 1];
        }
        float[] fArr = this.AudioAttributesImplBaseParcelizer;
        for (int i = 0; i < fArr.length; i += 2) {
            fArr[i] = this.AudioAttributesImplApi26Parcelizer.AudioAttributesImplBaseParcelizer[i / 2];
        }
        this.AudioAttributesImplApi21Parcelizer.RemoteActionCompatParcelizer(fArr);
        return fArr;
    }

    @Override // kotlin.DrmInitDataSchemeData1
    public final RectF RemoteActionCompatParcelizer() {
        this.MediaBrowserCompatCustomActionResultReceiver.set(this.MediaBrowserCompatSearchResultReceiver.MediaBrowserCompatSearchResultReceiver());
        this.MediaBrowserCompatCustomActionResultReceiver.inset(-this.read.MediaBrowserCompatCustomActionResultReceiver(), BitmapDescriptorFactory.HUE_RED);
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    @Override // kotlin.DrmInitDataSchemeData1
    protected final Path read(Path path, int i, float[] fArr) {
        path.moveTo(fArr[i], this.MediaBrowserCompatSearchResultReceiver.AudioAttributesImplApi21Parcelizer());
        path.lineTo(fArr[i], this.MediaBrowserCompatSearchResultReceiver.read());
        return path;
    }

    @Override // kotlin.DrmInitDataSchemeData1
    protected final void read(Canvas canvas) {
        int iSave = canvas.save();
        this.MediaBrowserCompatMediaItem.set(this.MediaBrowserCompatSearchResultReceiver.MediaBrowserCompatSearchResultReceiver());
        this.MediaBrowserCompatMediaItem.inset(-this.AudioAttributesImplApi26Parcelizer.onSetShuffleMode(), BitmapDescriptorFactory.HUE_RED);
        canvas.clipRect(this.MediaBrowserCompatItemReceiver);
        drmKeysRemoved drmkeysremovedRemoteActionCompatParcelizer = this.AudioAttributesImplApi21Parcelizer.RemoteActionCompatParcelizer(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
        this.MediaMetadataCompat.setColor(this.AudioAttributesImplApi26Parcelizer.onSetRating());
        this.MediaMetadataCompat.setStrokeWidth(this.AudioAttributesImplApi26Parcelizer.onSetShuffleMode());
        Path path = this.MediaDescriptionCompat;
        path.reset();
        path.moveTo(((float) drmkeysremovedRemoteActionCompatParcelizer.IconCompatParcelizer) - 1.0f, this.MediaBrowserCompatSearchResultReceiver.AudioAttributesImplApi21Parcelizer());
        path.lineTo(((float) drmkeysremovedRemoteActionCompatParcelizer.IconCompatParcelizer) - 1.0f, this.MediaBrowserCompatSearchResultReceiver.read());
        canvas.drawPath(path, this.MediaMetadataCompat);
        canvas.restoreToCount(iSave);
    }

    @Override // kotlin.DrmInitDataSchemeData1
    public final void IconCompatParcelizer(Canvas canvas) {
        List<getOfflineLicenseKeySetId> listAudioAttributesImplApi21Parcelizer = this.AudioAttributesImplApi26Parcelizer.AudioAttributesImplApi21Parcelizer();
        if (listAudioAttributesImplApi21Parcelizer == null || listAudioAttributesImplApi21Parcelizer.size() <= 0) {
            return;
        }
        float[] fArr = this.RatingCompat;
        float f = BitmapDescriptorFactory.HUE_RED;
        fArr[0] = 0.0f;
        char c = 1;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        Path path = this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        path.reset();
        int i = 0;
        while (i < listAudioAttributesImplApi21Parcelizer.size()) {
            getOfflineLicenseKeySetId getofflinelicensekeysetid = listAudioAttributesImplApi21Parcelizer.get(i);
            if (getofflinelicensekeysetid.onPlayFromSearch()) {
                int iSave = canvas.save();
                this.MediaBrowserCompatItemReceiver.set(this.MediaBrowserCompatSearchResultReceiver.MediaBrowserCompatSearchResultReceiver());
                this.MediaBrowserCompatItemReceiver.inset(-getofflinelicensekeysetid.AudioAttributesImplApi21Parcelizer(), f);
                canvas.clipRect(this.MediaBrowserCompatItemReceiver);
                fArr[0] = getofflinelicensekeysetid.read();
                fArr[2] = getofflinelicensekeysetid.read();
                this.AudioAttributesImplApi21Parcelizer.RemoteActionCompatParcelizer(fArr);
                fArr[c] = this.MediaBrowserCompatSearchResultReceiver.AudioAttributesImplApi21Parcelizer();
                fArr[3] = this.MediaBrowserCompatSearchResultReceiver.read();
                path.moveTo(fArr[0], fArr[c]);
                path.lineTo(fArr[2], fArr[3]);
                this.RemoteActionCompatParcelizer.setStyle(Paint.Style.STROKE);
                this.RemoteActionCompatParcelizer.setColor(getofflinelicensekeysetid.AudioAttributesCompatParcelizer());
                this.RemoteActionCompatParcelizer.setPathEffect(getofflinelicensekeysetid.IconCompatParcelizer());
                this.RemoteActionCompatParcelizer.setStrokeWidth(getofflinelicensekeysetid.AudioAttributesImplApi21Parcelizer());
                canvas.drawPath(path, this.RemoteActionCompatParcelizer);
                path.reset();
                String strRemoteActionCompatParcelizer = getofflinelicensekeysetid.RemoteActionCompatParcelizer();
                if (strRemoteActionCompatParcelizer != null && !strRemoteActionCompatParcelizer.equals("")) {
                    this.RemoteActionCompatParcelizer.setStyle(getofflinelicensekeysetid.AudioAttributesImplApi26Parcelizer());
                    this.RemoteActionCompatParcelizer.setPathEffect(null);
                    this.RemoteActionCompatParcelizer.setColor(getofflinelicensekeysetid.onFastForward());
                    this.RemoteActionCompatParcelizer.setTypeface(getofflinelicensekeysetid.onPrepareFromSearch());
                    this.RemoteActionCompatParcelizer.setStrokeWidth(0.5f);
                    this.RemoteActionCompatParcelizer.setTextSize(getofflinelicensekeysetid.onPrepareFromMediaId());
                    float fAudioAttributesImplApi21Parcelizer = getofflinelicensekeysetid.AudioAttributesImplApi21Parcelizer() + getofflinelicensekeysetid.onPlayFromUri();
                    float fWrite = drmSessionAcquired.write(2.0f) + getofflinelicensekeysetid.onPrepare();
                    getOfflineLicenseKeySetId.AudioAttributesCompatParcelizer audioAttributesCompatParcelizerWrite = getofflinelicensekeysetid.write();
                    if (audioAttributesCompatParcelizerWrite == getOfflineLicenseKeySetId.AudioAttributesCompatParcelizer.RIGHT_TOP) {
                        float fAudioAttributesCompatParcelizer = drmSessionAcquired.AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer, strRemoteActionCompatParcelizer);
                        this.RemoteActionCompatParcelizer.setTextAlign(Paint.Align.LEFT);
                        canvas.drawText(strRemoteActionCompatParcelizer, fArr[0] + fAudioAttributesImplApi21Parcelizer, this.MediaBrowserCompatSearchResultReceiver.AudioAttributesImplApi21Parcelizer() + fWrite + fAudioAttributesCompatParcelizer, this.RemoteActionCompatParcelizer);
                    } else if (audioAttributesCompatParcelizerWrite == getOfflineLicenseKeySetId.AudioAttributesCompatParcelizer.RIGHT_BOTTOM) {
                        this.RemoteActionCompatParcelizer.setTextAlign(Paint.Align.LEFT);
                        canvas.drawText(strRemoteActionCompatParcelizer, fArr[0] + fAudioAttributesImplApi21Parcelizer, this.MediaBrowserCompatSearchResultReceiver.read() - fWrite, this.RemoteActionCompatParcelizer);
                    } else if (audioAttributesCompatParcelizerWrite == getOfflineLicenseKeySetId.AudioAttributesCompatParcelizer.LEFT_TOP) {
                        this.RemoteActionCompatParcelizer.setTextAlign(Paint.Align.RIGHT);
                        canvas.drawText(strRemoteActionCompatParcelizer, fArr[0] - fAudioAttributesImplApi21Parcelizer, this.MediaBrowserCompatSearchResultReceiver.AudioAttributesImplApi21Parcelizer() + fWrite + drmSessionAcquired.AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer, strRemoteActionCompatParcelizer), this.RemoteActionCompatParcelizer);
                    } else {
                        this.RemoteActionCompatParcelizer.setTextAlign(Paint.Align.RIGHT);
                        canvas.drawText(strRemoteActionCompatParcelizer, fArr[0] - fAudioAttributesImplApi21Parcelizer, this.MediaBrowserCompatSearchResultReceiver.read() - fWrite, this.RemoteActionCompatParcelizer);
                    }
                }
                canvas.restoreToCount(iSave);
            }
            i++;
            f = BitmapDescriptorFactory.HUE_RED;
            c = 1;
        }
    }
}
