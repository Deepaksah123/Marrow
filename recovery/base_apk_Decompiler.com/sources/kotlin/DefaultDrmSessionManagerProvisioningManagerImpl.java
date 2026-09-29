package kotlin;

import android.graphics.Paint;

/* JADX INFO: loaded from: classes2.dex */
public abstract class DefaultDrmSessionManagerProvisioningManagerImpl extends DrmInitData1 {
    protected Paint AudioAttributesCompatParcelizer;
    protected drmSessionReleased AudioAttributesImplApi21Parcelizer;
    protected Paint IconCompatParcelizer;
    protected Paint RemoteActionCompatParcelizer;
    protected restoreKeys read;
    protected Paint write;

    public DefaultDrmSessionManagerProvisioningManagerImpl(lambdadrmSessionAcquired0comgoogleandroidexoplayer2drmDrmSessionEventListenerEventDispatcher lambdadrmsessionacquired0comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher, drmSessionReleased drmsessionreleased, restoreKeys restorekeys) {
        super(lambdadrmsessionacquired0comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher);
        this.AudioAttributesImplApi21Parcelizer = drmsessionreleased;
        this.read = restorekeys;
        if (this.MediaBrowserCompatSearchResultReceiver != null) {
            this.AudioAttributesCompatParcelizer = new Paint(1);
            Paint paint = new Paint();
            this.write = paint;
            paint.setColor(-7829368);
            this.write.setStrokeWidth(1.0f);
            this.write.setStyle(Paint.Style.STROKE);
            this.write.setAlpha(90);
            Paint paint2 = new Paint();
            this.IconCompatParcelizer = paint2;
            paint2.setColor(-16777216);
            this.IconCompatParcelizer.setStrokeWidth(1.0f);
            this.IconCompatParcelizer.setStyle(Paint.Style.STROKE);
            Paint paint3 = new Paint(1);
            this.RemoteActionCompatParcelizer = paint3;
            paint3.setStyle(Paint.Style.STROKE);
        }
    }

    public final Paint IconCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public void write(float f, float f2, boolean z) {
        float f3;
        double d;
        if (this.MediaBrowserCompatSearchResultReceiver != null && this.MediaBrowserCompatSearchResultReceiver.MediaBrowserCompatItemReceiver() > 10.0f && !this.MediaBrowserCompatSearchResultReceiver.onPause()) {
            drmKeysRemoved drmkeysremovedIconCompatParcelizer = this.AudioAttributesImplApi21Parcelizer.IconCompatParcelizer(this.MediaBrowserCompatSearchResultReceiver.AudioAttributesImplBaseParcelizer(), this.MediaBrowserCompatSearchResultReceiver.AudioAttributesImplApi21Parcelizer());
            drmKeysRemoved drmkeysremovedIconCompatParcelizer2 = this.AudioAttributesImplApi21Parcelizer.IconCompatParcelizer(this.MediaBrowserCompatSearchResultReceiver.AudioAttributesImplBaseParcelizer(), this.MediaBrowserCompatSearchResultReceiver.read());
            if (!z) {
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

    /* JADX WARN: Multi-variable type inference failed */
    protected void RemoteActionCompatParcelizer(float f, float f2) {
        int i;
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
        boolean zRatingCompat = this.read.RatingCompat();
        if (this.read.handleMediaPlayPauseIfPendingOnHandler()) {
            dWrite = ((float) dAbs) / (iAudioAttributesImplApi26Parcelizer - 1);
            this.read.MediaBrowserCompatCustomActionResultReceiver = iAudioAttributesImplApi26Parcelizer;
            if (this.read.AudioAttributesImplBaseParcelizer.length < iAudioAttributesImplApi26Parcelizer) {
                this.read.AudioAttributesImplBaseParcelizer = new float[iAudioAttributesImplApi26Parcelizer];
            }
            for (int i2 = 0; i2 < iAudioAttributesImplApi26Parcelizer; i2++) {
                this.read.AudioAttributesImplBaseParcelizer[i2] = f3;
                f3 = (float) (((double) f3) + dWrite);
            }
        } else {
            double dCeil = dWrite == 0.0d ? 0.0d : Math.ceil(((double) f3) / dWrite) * dWrite;
            double dAudioAttributesCompatParcelizer = dWrite == 0.0d ? 0.0d : drmSessionAcquired.AudioAttributesCompatParcelizer(Math.floor(((double) f2) / dWrite) * dWrite);
            if (dWrite != 0.0d) {
                double d = dCeil;
                i = zRatingCompat;
                while (d <= dAudioAttributesCompatParcelizer) {
                    d += dWrite;
                    i++;
                }
            } else {
                i = 0;
            }
            this.read.MediaBrowserCompatCustomActionResultReceiver = i;
            if (this.read.AudioAttributesImplBaseParcelizer.length < i) {
                this.read.AudioAttributesImplBaseParcelizer = new float[i];
            }
            for (int i3 = 0; i3 < i; i3++) {
                if (dCeil == 0.0d) {
                    dCeil = 0.0d;
                }
                this.read.AudioAttributesImplBaseParcelizer[i3] = (float) dCeil;
                dCeil += dWrite;
            }
        }
        if (dWrite < 1.0d) {
            this.read.AudioAttributesImplApi26Parcelizer = (int) Math.ceil(-Math.log10(dWrite));
        } else {
            this.read.AudioAttributesImplApi26Parcelizer = 0;
        }
    }
}
