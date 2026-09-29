package kotlin;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

/* JADX INFO: loaded from: classes2.dex */
public abstract class lambdaonReferenceCountDecremented0 extends DrmInitData1 {
    protected Paint AudioAttributesImplApi21Parcelizer;
    protected Paint AudioAttributesImplApi26Parcelizer;
    protected Paint AudioAttributesImplBaseParcelizer;
    protected onKeyResponse MediaBrowserCompatItemReceiver;
    private Paint write;

    public abstract void IconCompatParcelizer(Canvas canvas);

    public abstract void RemoteActionCompatParcelizer();

    public abstract void RemoteActionCompatParcelizer(Canvas canvas, createAndAcquireSessionWithRetry[] createandacquiresessionwithretryArr);

    public abstract void read(Canvas canvas);

    public abstract void write(Canvas canvas);

    public lambdaonReferenceCountDecremented0(onKeyResponse onkeyresponse, lambdadrmSessionAcquired0comgoogleandroidexoplayer2drmDrmSessionEventListenerEventDispatcher lambdadrmsessionacquired0comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher) {
        super(lambdadrmsessionacquired0comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher);
        this.MediaBrowserCompatItemReceiver = onkeyresponse;
        Paint paint = new Paint(1);
        this.AudioAttributesImplBaseParcelizer = paint;
        paint.setStyle(Paint.Style.FILL);
        this.write = new Paint(4);
        Paint paint2 = new Paint(1);
        this.AudioAttributesImplApi21Parcelizer = paint2;
        paint2.setColor(Color.rgb(63, 63, 63));
        this.AudioAttributesImplApi21Parcelizer.setTextAlign(Paint.Align.CENTER);
        this.AudioAttributesImplApi21Parcelizer.setTextSize(drmSessionAcquired.write(9.0f));
        Paint paint3 = new Paint(1);
        this.AudioAttributesImplApi26Parcelizer = paint3;
        paint3.setStyle(Paint.Style.STROKE);
        this.AudioAttributesImplApi26Parcelizer.setStrokeWidth(2.0f);
        this.AudioAttributesImplApi26Parcelizer.setColor(Color.rgb(255, 187, 115));
    }

    protected boolean AudioAttributesCompatParcelizer(getCryptoType getcryptotype) {
        return ((float) getcryptotype.onSeekTo().write()) < ((float) getcryptotype.MediaBrowserCompatMediaItem()) * this.MediaBrowserCompatSearchResultReceiver.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
    }

    protected final void RemoteActionCompatParcelizer(setPlayClearSamplesWithoutKeys setplayclearsampleswithoutkeys) {
        this.AudioAttributesImplApi21Parcelizer.setTypeface(setplayclearsampleswithoutkeys.onCustomAction());
        this.AudioAttributesImplApi21Parcelizer.setTextSize(setplayclearsampleswithoutkeys.MediaBrowserCompatSearchResultReceiver());
    }
}
