package kotlin;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.List;
import kotlin.getError;
import kotlin.getOfflineLicenseKeySetId;

/* JADX INFO: loaded from: classes2.dex */
public class DrmInitDataSchemeData1 extends DefaultDrmSessionManagerProvisioningManagerImpl {
    protected getError AudioAttributesImplApi26Parcelizer;
    protected float[] AudioAttributesImplBaseParcelizer;
    protected RectF MediaBrowserCompatCustomActionResultReceiver;
    protected RectF MediaBrowserCompatItemReceiver;
    protected RectF MediaBrowserCompatMediaItem;
    private Path MediaDescriptionCompat;
    protected Paint MediaMetadataCompat;
    private Path RatingCompat;
    private Path onCommand;
    private float[] onCustomAction;

    public DrmInitDataSchemeData1(lambdadrmSessionAcquired0comgoogleandroidexoplayer2drmDrmSessionEventListenerEventDispatcher lambdadrmsessionacquired0comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher, getError geterror, drmSessionReleased drmsessionreleased) {
        super(lambdadrmsessionacquired0comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher, drmsessionreleased, geterror);
        this.MediaDescriptionCompat = new Path();
        this.MediaBrowserCompatCustomActionResultReceiver = new RectF();
        this.AudioAttributesImplBaseParcelizer = new float[2];
        this.RatingCompat = new Path();
        this.MediaBrowserCompatMediaItem = new RectF();
        this.onCommand = new Path();
        this.onCustomAction = new float[2];
        this.MediaBrowserCompatItemReceiver = new RectF();
        this.AudioAttributesImplApi26Parcelizer = geterror;
        if (this.MediaBrowserCompatSearchResultReceiver != null) {
            this.AudioAttributesCompatParcelizer.setColor(-16777216);
            this.AudioAttributesCompatParcelizer.setTextSize(drmSessionAcquired.write(10.0f));
            Paint paint = new Paint(1);
            this.MediaMetadataCompat = paint;
            paint.setColor(-7829368);
            this.MediaMetadataCompat.setStrokeWidth(1.0f);
            this.MediaMetadataCompat.setStyle(Paint.Style.STROKE);
        }
    }

    public void write(Canvas canvas) {
        float fMediaBrowserCompatCustomActionResultReceiver;
        float fMediaBrowserCompatCustomActionResultReceiver2;
        float f;
        if (this.AudioAttributesImplApi26Parcelizer.onPlayFromSearch() && this.AudioAttributesImplApi26Parcelizer.onCommand()) {
            float[] fArr = read();
            this.AudioAttributesCompatParcelizer.setTypeface(this.AudioAttributesImplApi26Parcelizer.onPrepareFromSearch());
            this.AudioAttributesCompatParcelizer.setTextSize(this.AudioAttributesImplApi26Parcelizer.onPrepareFromMediaId());
            this.AudioAttributesCompatParcelizer.setColor(this.AudioAttributesImplApi26Parcelizer.onFastForward());
            float fOnPlayFromUri = this.AudioAttributesImplApi26Parcelizer.onPlayFromUri();
            float fAudioAttributesCompatParcelizer = drmSessionAcquired.AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer, "A") / 2.5f;
            float fOnPrepare = this.AudioAttributesImplApi26Parcelizer.onPrepare();
            getError.write writeVarOnRemoveQueueItem = this.AudioAttributesImplApi26Parcelizer.onRemoveQueueItem();
            getError.IconCompatParcelizer iconCompatParcelizerOnRewind = this.AudioAttributesImplApi26Parcelizer.onRewind();
            if (writeVarOnRemoveQueueItem == getError.write.LEFT) {
                if (iconCompatParcelizerOnRewind == getError.IconCompatParcelizer.OUTSIDE_CHART) {
                    this.AudioAttributesCompatParcelizer.setTextAlign(Paint.Align.RIGHT);
                    fMediaBrowserCompatCustomActionResultReceiver = this.MediaBrowserCompatSearchResultReceiver.onFastForward();
                    f = fMediaBrowserCompatCustomActionResultReceiver - fOnPlayFromUri;
                } else {
                    this.AudioAttributesCompatParcelizer.setTextAlign(Paint.Align.LEFT);
                    fMediaBrowserCompatCustomActionResultReceiver2 = this.MediaBrowserCompatSearchResultReceiver.onFastForward();
                    f = fMediaBrowserCompatCustomActionResultReceiver2 + fOnPlayFromUri;
                }
            } else if (iconCompatParcelizerOnRewind == getError.IconCompatParcelizer.OUTSIDE_CHART) {
                this.AudioAttributesCompatParcelizer.setTextAlign(Paint.Align.LEFT);
                fMediaBrowserCompatCustomActionResultReceiver2 = this.MediaBrowserCompatSearchResultReceiver.MediaBrowserCompatCustomActionResultReceiver();
                f = fMediaBrowserCompatCustomActionResultReceiver2 + fOnPlayFromUri;
            } else {
                this.AudioAttributesCompatParcelizer.setTextAlign(Paint.Align.RIGHT);
                fMediaBrowserCompatCustomActionResultReceiver = this.MediaBrowserCompatSearchResultReceiver.MediaBrowserCompatCustomActionResultReceiver();
                f = fMediaBrowserCompatCustomActionResultReceiver - fOnPlayFromUri;
            }
            RemoteActionCompatParcelizer(canvas, f, fArr, fAudioAttributesCompatParcelizer + fOnPrepare);
        }
    }

    public void RemoteActionCompatParcelizer(Canvas canvas) {
        if (this.AudioAttributesImplApi26Parcelizer.onPlayFromSearch() && this.AudioAttributesImplApi26Parcelizer.MediaDescriptionCompat()) {
            this.IconCompatParcelizer.setColor(this.AudioAttributesImplApi26Parcelizer.read());
            this.IconCompatParcelizer.setStrokeWidth(this.AudioAttributesImplApi26Parcelizer.write());
            if (this.AudioAttributesImplApi26Parcelizer.onRemoveQueueItem() == getError.write.LEFT) {
                canvas.drawLine(this.MediaBrowserCompatSearchResultReceiver.AudioAttributesImplBaseParcelizer(), this.MediaBrowserCompatSearchResultReceiver.AudioAttributesImplApi21Parcelizer(), this.MediaBrowserCompatSearchResultReceiver.AudioAttributesImplBaseParcelizer(), this.MediaBrowserCompatSearchResultReceiver.read(), this.IconCompatParcelizer);
            } else {
                canvas.drawLine(this.MediaBrowserCompatSearchResultReceiver.MediaBrowserCompatCustomActionResultReceiver(), this.MediaBrowserCompatSearchResultReceiver.AudioAttributesImplApi21Parcelizer(), this.MediaBrowserCompatSearchResultReceiver.MediaBrowserCompatCustomActionResultReceiver(), this.MediaBrowserCompatSearchResultReceiver.read(), this.IconCompatParcelizer);
            }
        }
    }

    protected void RemoteActionCompatParcelizer(Canvas canvas, float f, float[] fArr, float f2) {
        int i = this.AudioAttributesImplApi26Parcelizer.onSetCaptioningEnabled() ? this.AudioAttributesImplApi26Parcelizer.MediaBrowserCompatCustomActionResultReceiver : this.AudioAttributesImplApi26Parcelizer.MediaBrowserCompatCustomActionResultReceiver - 1;
        for (int i2 = !this.AudioAttributesImplApi26Parcelizer.onSetPlaybackSpeed() ? 1 : 0; i2 < i; i2++) {
            canvas.drawText(this.AudioAttributesImplApi26Parcelizer.read(i2), f, fArr[(i2 << 1) + 1] + f2, this.AudioAttributesCompatParcelizer);
        }
    }

    public final void AudioAttributesCompatParcelizer(Canvas canvas) {
        if (this.AudioAttributesImplApi26Parcelizer.onPlayFromSearch()) {
            if (this.AudioAttributesImplApi26Parcelizer.MediaBrowserCompatMediaItem()) {
                int iSave = canvas.save();
                canvas.clipRect(RemoteActionCompatParcelizer());
                float[] fArr = read();
                this.write.setColor(this.AudioAttributesImplApi26Parcelizer.AudioAttributesCompatParcelizer());
                this.write.setStrokeWidth(this.AudioAttributesImplApi26Parcelizer.MediaBrowserCompatCustomActionResultReceiver());
                this.write.setPathEffect(this.AudioAttributesImplApi26Parcelizer.MediaBrowserCompatItemReceiver());
                Path path = this.MediaDescriptionCompat;
                path.reset();
                for (int i = 0; i < fArr.length; i += 2) {
                    canvas.drawPath(read(path, i, fArr), this.write);
                    path.reset();
                }
                canvas.restoreToCount(iSave);
            }
            if (this.AudioAttributesImplApi26Parcelizer.onSetRepeatMode()) {
                read(canvas);
            }
        }
    }

    public RectF RemoteActionCompatParcelizer() {
        this.MediaBrowserCompatCustomActionResultReceiver.set(this.MediaBrowserCompatSearchResultReceiver.MediaBrowserCompatSearchResultReceiver());
        this.MediaBrowserCompatCustomActionResultReceiver.inset(BitmapDescriptorFactory.HUE_RED, -this.read.MediaBrowserCompatCustomActionResultReceiver());
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    protected Path read(Path path, int i, float[] fArr) {
        int i2 = i + 1;
        path.moveTo(this.MediaBrowserCompatSearchResultReceiver.onFastForward(), fArr[i2]);
        path.lineTo(this.MediaBrowserCompatSearchResultReceiver.MediaBrowserCompatCustomActionResultReceiver(), fArr[i2]);
        return path;
    }

    protected float[] read() {
        if (this.AudioAttributesImplBaseParcelizer.length != (this.AudioAttributesImplApi26Parcelizer.MediaBrowserCompatCustomActionResultReceiver << 1)) {
            this.AudioAttributesImplBaseParcelizer = new float[this.AudioAttributesImplApi26Parcelizer.MediaBrowserCompatCustomActionResultReceiver << 1];
        }
        float[] fArr = this.AudioAttributesImplBaseParcelizer;
        for (int i = 0; i < fArr.length; i += 2) {
            fArr[i + 1] = this.AudioAttributesImplApi26Parcelizer.AudioAttributesImplBaseParcelizer[i / 2];
        }
        this.AudioAttributesImplApi21Parcelizer.RemoteActionCompatParcelizer(fArr);
        return fArr;
    }

    protected void read(Canvas canvas) {
        int iSave = canvas.save();
        this.MediaBrowserCompatMediaItem.set(this.MediaBrowserCompatSearchResultReceiver.MediaBrowserCompatSearchResultReceiver());
        this.MediaBrowserCompatMediaItem.inset(BitmapDescriptorFactory.HUE_RED, -this.AudioAttributesImplApi26Parcelizer.onSetShuffleMode());
        canvas.clipRect(this.MediaBrowserCompatMediaItem);
        drmKeysRemoved drmkeysremovedRemoteActionCompatParcelizer = this.AudioAttributesImplApi21Parcelizer.RemoteActionCompatParcelizer(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
        this.MediaMetadataCompat.setColor(this.AudioAttributesImplApi26Parcelizer.onSetRating());
        this.MediaMetadataCompat.setStrokeWidth(this.AudioAttributesImplApi26Parcelizer.onSetShuffleMode());
        Path path = this.RatingCompat;
        path.reset();
        path.moveTo(this.MediaBrowserCompatSearchResultReceiver.AudioAttributesImplBaseParcelizer(), (float) drmkeysremovedRemoteActionCompatParcelizer.AudioAttributesCompatParcelizer);
        path.lineTo(this.MediaBrowserCompatSearchResultReceiver.MediaBrowserCompatCustomActionResultReceiver(), (float) drmkeysremovedRemoteActionCompatParcelizer.AudioAttributesCompatParcelizer);
        canvas.drawPath(path, this.MediaMetadataCompat);
        canvas.restoreToCount(iSave);
    }

    public void IconCompatParcelizer(Canvas canvas) {
        List<getOfflineLicenseKeySetId> listAudioAttributesImplApi21Parcelizer = this.AudioAttributesImplApi26Parcelizer.AudioAttributesImplApi21Parcelizer();
        if (listAudioAttributesImplApi21Parcelizer == null || listAudioAttributesImplApi21Parcelizer.size() <= 0) {
            return;
        }
        float[] fArr = this.onCustomAction;
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        Path path = this.onCommand;
        path.reset();
        for (int i = 0; i < listAudioAttributesImplApi21Parcelizer.size(); i++) {
            getOfflineLicenseKeySetId getofflinelicensekeysetid = listAudioAttributesImplApi21Parcelizer.get(i);
            if (getofflinelicensekeysetid.onPlayFromSearch()) {
                int iSave = canvas.save();
                this.MediaBrowserCompatItemReceiver.set(this.MediaBrowserCompatSearchResultReceiver.MediaBrowserCompatSearchResultReceiver());
                this.MediaBrowserCompatItemReceiver.inset(BitmapDescriptorFactory.HUE_RED, -getofflinelicensekeysetid.AudioAttributesImplApi21Parcelizer());
                canvas.clipRect(this.MediaBrowserCompatItemReceiver);
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
                    this.RemoteActionCompatParcelizer.setTypeface(getofflinelicensekeysetid.onPrepareFromSearch());
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
