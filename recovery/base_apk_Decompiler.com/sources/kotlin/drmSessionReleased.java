package kotlin;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import com.github.mikephil.charting.data.CandleEntry;

/* JADX INFO: loaded from: classes2.dex */
public class drmSessionReleased {
    protected lambdadrmSessionAcquired0comgoogleandroidexoplayer2drmDrmSessionEventListenerEventDispatcher RemoteActionCompatParcelizer;
    private Matrix AudioAttributesCompatParcelizer = new Matrix();
    protected Matrix IconCompatParcelizer = new Matrix();
    private float[] MediaBrowserCompatSearchResultReceiver = new float[1];
    private float[] AudioAttributesImplApi21Parcelizer = new float[1];
    private float[] MediaBrowserCompatCustomActionResultReceiver = new float[1];
    private float[] AudioAttributesImplBaseParcelizer = new float[1];
    private Matrix MediaBrowserCompatItemReceiver = new Matrix();
    private float[] AudioAttributesImplApi26Parcelizer = new float[2];
    private Matrix write = new Matrix();
    private Matrix read = new Matrix();

    public drmSessionReleased(lambdadrmSessionAcquired0comgoogleandroidexoplayer2drmDrmSessionEventListenerEventDispatcher lambdadrmsessionacquired0comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher) {
        this.RemoteActionCompatParcelizer = lambdadrmsessionacquired0comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher;
    }

    public final void AudioAttributesCompatParcelizer(float f, float f2, float f3, float f4) {
        float fMediaBrowserCompatItemReceiver = this.RemoteActionCompatParcelizer.MediaBrowserCompatItemReceiver() / f2;
        float fAudioAttributesImplApi26Parcelizer = this.RemoteActionCompatParcelizer.AudioAttributesImplApi26Parcelizer() / f3;
        if (Float.isInfinite(fMediaBrowserCompatItemReceiver)) {
            fMediaBrowserCompatItemReceiver = 0.0f;
        }
        if (Float.isInfinite(fAudioAttributesImplApi26Parcelizer)) {
            fAudioAttributesImplApi26Parcelizer = 0.0f;
        }
        this.AudioAttributesCompatParcelizer.reset();
        this.AudioAttributesCompatParcelizer.postTranslate(-f, -f4);
        this.AudioAttributesCompatParcelizer.postScale(fMediaBrowserCompatItemReceiver, -fAudioAttributesImplApi26Parcelizer);
    }

    public void IconCompatParcelizer(boolean z) {
        this.IconCompatParcelizer.reset();
        if (!z) {
            this.IconCompatParcelizer.postTranslate(this.RemoteActionCompatParcelizer.onFastForward(), this.RemoteActionCompatParcelizer.MediaDescriptionCompat() - this.RemoteActionCompatParcelizer.onPlayFromMediaId());
        } else {
            this.IconCompatParcelizer.setTranslate(this.RemoteActionCompatParcelizer.onFastForward(), -this.RemoteActionCompatParcelizer.onPlayFromUri());
            this.IconCompatParcelizer.postScale(1.0f, -1.0f);
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [com.github.mikephil.charting.data.Entry, o.playClearSamplesWithoutKeys] */
    public final float[] write(lambdaacquire0comgoogleandroidexoplayer2drmDefaultDrmSessionManagerPreacquiredSessionReference lambdaacquire0comgoogleandroidexoplayer2drmdefaultdrmsessionmanagerpreacquiredsessionreference, float f, float f2, int i, int i2) {
        int i3 = ((int) (((i2 - i) * f) + 1.0f)) << 1;
        if (this.MediaBrowserCompatSearchResultReceiver.length != i3) {
            this.MediaBrowserCompatSearchResultReceiver = new float[i3];
        }
        float[] fArr = this.MediaBrowserCompatSearchResultReceiver;
        for (int i4 = 0; i4 < i3; i4 += 2) {
            ?? IconCompatParcelizer = lambdaacquire0comgoogleandroidexoplayer2drmdefaultdrmsessionmanagerpreacquiredsessionreference.IconCompatParcelizer((i4 / 2) + i);
            if (IconCompatParcelizer != 0) {
                fArr[i4] = IconCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver();
                fArr[i4 + 1] = IconCompatParcelizer.read() * f2;
            } else {
                fArr[i4] = 0.0f;
                fArr[i4 + 1] = 0.0f;
            }
        }
        RemoteActionCompatParcelizer().mapPoints(fArr);
        return fArr;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [com.github.mikephil.charting.data.Entry, o.playClearSamplesWithoutKeys] */
    public final float[] read(DefaultDrmSessionManager1 defaultDrmSessionManager1, float f, int i, int i2) {
        int i3 = ((i2 - i) + 1) << 1;
        if (this.AudioAttributesImplApi21Parcelizer.length != i3) {
            this.AudioAttributesImplApi21Parcelizer = new float[i3];
        }
        float[] fArr = this.AudioAttributesImplApi21Parcelizer;
        for (int i4 = 0; i4 < i3; i4 += 2) {
            ?? IconCompatParcelizer = defaultDrmSessionManager1.IconCompatParcelizer((i4 / 2) + i);
            if (IconCompatParcelizer != 0) {
                fArr[i4] = IconCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver();
                fArr[i4 + 1] = IconCompatParcelizer.read() * f;
            } else {
                fArr[i4] = 0.0f;
                fArr[i4 + 1] = 0.0f;
            }
        }
        RemoteActionCompatParcelizer().mapPoints(fArr);
        return fArr;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [com.github.mikephil.charting.data.Entry, o.playClearSamplesWithoutKeys] */
    public final float[] AudioAttributesCompatParcelizer(setUuidAndExoMediaDrmProvider setuuidandexomediadrmprovider, float f, float f2, int i, int i2) {
        int i3 = (((int) ((i2 - i) * f)) + 1) << 1;
        if (this.MediaBrowserCompatCustomActionResultReceiver.length != i3) {
            this.MediaBrowserCompatCustomActionResultReceiver = new float[i3];
        }
        float[] fArr = this.MediaBrowserCompatCustomActionResultReceiver;
        for (int i4 = 0; i4 < i3; i4 += 2) {
            ?? IconCompatParcelizer = setuuidandexomediadrmprovider.IconCompatParcelizer((i4 / 2) + i);
            if (IconCompatParcelizer != 0) {
                fArr[i4] = IconCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver();
                fArr[i4 + 1] = IconCompatParcelizer.read() * f2;
            } else {
                fArr[i4] = 0.0f;
                fArr[i4 + 1] = 0.0f;
            }
        }
        RemoteActionCompatParcelizer().mapPoints(fArr);
        return fArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final float[] RemoteActionCompatParcelizer(DefaultDrmSessionManagerBuilder defaultDrmSessionManagerBuilder, float f, float f2, int i, int i2) {
        int i3 = ((int) (((i2 - i) * f) + 1.0f)) << 1;
        if (this.AudioAttributesImplBaseParcelizer.length != i3) {
            this.AudioAttributesImplBaseParcelizer = new float[i3];
        }
        float[] fArr = this.AudioAttributesImplBaseParcelizer;
        for (int i4 = 0; i4 < i3; i4 += 2) {
            CandleEntry candleEntry = (CandleEntry) defaultDrmSessionManagerBuilder.IconCompatParcelizer((i4 / 2) + i);
            if (candleEntry != null) {
                fArr[i4] = candleEntry.MediaBrowserCompatCustomActionResultReceiver();
                fArr[i4 + 1] = candleEntry.RemoteActionCompatParcelizer() * f2;
            } else {
                fArr[i4] = 0.0f;
                fArr[i4 + 1] = 0.0f;
            }
        }
        RemoteActionCompatParcelizer().mapPoints(fArr);
        return fArr;
    }

    public final void IconCompatParcelizer(Path path) {
        path.transform(this.AudioAttributesCompatParcelizer);
        path.transform(this.RemoteActionCompatParcelizer.RatingCompat());
        path.transform(this.IconCompatParcelizer);
    }

    public final void RemoteActionCompatParcelizer(float[] fArr) {
        this.AudioAttributesCompatParcelizer.mapPoints(fArr);
        this.RemoteActionCompatParcelizer.RatingCompat().mapPoints(fArr);
        this.IconCompatParcelizer.mapPoints(fArr);
    }

    public final void AudioAttributesCompatParcelizer(RectF rectF) {
        this.AudioAttributesCompatParcelizer.mapRect(rectF);
        this.RemoteActionCompatParcelizer.RatingCompat().mapRect(rectF);
        this.IconCompatParcelizer.mapRect(rectF);
    }

    public final void RemoteActionCompatParcelizer(RectF rectF, float f) {
        rectF.top *= f;
        rectF.bottom *= f;
        this.AudioAttributesCompatParcelizer.mapRect(rectF);
        this.RemoteActionCompatParcelizer.RatingCompat().mapRect(rectF);
        this.IconCompatParcelizer.mapRect(rectF);
    }

    public final void AudioAttributesCompatParcelizer(RectF rectF, float f) {
        rectF.left *= f;
        rectF.right *= f;
        this.AudioAttributesCompatParcelizer.mapRect(rectF);
        this.RemoteActionCompatParcelizer.RatingCompat().mapRect(rectF);
        this.IconCompatParcelizer.mapRect(rectF);
    }

    public final void IconCompatParcelizer(float[] fArr) {
        Matrix matrix = this.MediaBrowserCompatItemReceiver;
        matrix.reset();
        this.IconCompatParcelizer.invert(matrix);
        matrix.mapPoints(fArr);
        this.RemoteActionCompatParcelizer.RatingCompat().invert(matrix);
        matrix.mapPoints(fArr);
        this.AudioAttributesCompatParcelizer.invert(matrix);
        matrix.mapPoints(fArr);
    }

    public final drmKeysRemoved IconCompatParcelizer(float f, float f2) {
        drmKeysRemoved drmkeysremoved = drmKeysRemoved.read(0.0d, 0.0d);
        read(f, f2, drmkeysremoved);
        return drmkeysremoved;
    }

    public final void read(float f, float f2, drmKeysRemoved drmkeysremoved) {
        float[] fArr = this.AudioAttributesImplApi26Parcelizer;
        fArr[0] = f;
        fArr[1] = f2;
        IconCompatParcelizer(fArr);
        drmkeysremoved.IconCompatParcelizer = this.AudioAttributesImplApi26Parcelizer[0];
        drmkeysremoved.AudioAttributesCompatParcelizer = this.AudioAttributesImplApi26Parcelizer[1];
    }

    public final drmKeysRemoved RemoteActionCompatParcelizer(float f, float f2) {
        float[] fArr = this.AudioAttributesImplApi26Parcelizer;
        fArr[0] = f;
        fArr[1] = f2;
        RemoteActionCompatParcelizer(fArr);
        float[] fArr2 = this.AudioAttributesImplApi26Parcelizer;
        return drmKeysRemoved.read(fArr2[0], fArr2[1]);
    }

    private Matrix RemoteActionCompatParcelizer() {
        this.write.set(this.AudioAttributesCompatParcelizer);
        this.write.postConcat(this.RemoteActionCompatParcelizer.write);
        this.write.postConcat(this.IconCompatParcelizer);
        return this.write;
    }
}
