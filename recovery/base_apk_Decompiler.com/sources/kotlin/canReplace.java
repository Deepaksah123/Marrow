package kotlin;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.data.PieEntry;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.DefaultDrmSessionExternalSyntheticLambda3;

/* JADX INFO: loaded from: classes2.dex */
public final class canReplace extends lambdaonReferenceCountDecremented0 {
    private StaticLayout AudioAttributesCompatParcelizer;
    private Canvas IconCompatParcelizer;
    private PieChart MediaBrowserCompatCustomActionResultReceiver;
    private RectF MediaBrowserCompatMediaItem;
    private RectF MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    private Paint MediaDescriptionCompat;
    private WeakReference<Bitmap> MediaMetadataCompat;
    private Path RatingCompat;
    private TextPaint RemoteActionCompatParcelizer;
    private Path handleMediaPlayPauseIfPendingOnHandler;
    private Paint onAddQueueItem;
    private Path onCommand;
    private RectF[] onCustomAction;
    private Paint onFastForward;
    private Paint onPlay;
    private RectF read;
    private CharSequence write;

    @Override // kotlin.lambdaonReferenceCountDecremented0
    public final void RemoteActionCompatParcelizer() {
    }

    public canReplace(PieChart pieChart, onKeyResponse onkeyresponse, lambdadrmSessionAcquired0comgoogleandroidexoplayer2drmDrmSessionEventListenerEventDispatcher lambdadrmsessionacquired0comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher) {
        super(onkeyresponse, lambdadrmsessionacquired0comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher);
        this.read = new RectF();
        this.onCustomAction = new RectF[]{new RectF(), new RectF(), new RectF()};
        this.handleMediaPlayPauseIfPendingOnHandler = new Path();
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = new RectF();
        this.onCommand = new Path();
        this.RatingCompat = new Path();
        this.MediaBrowserCompatMediaItem = new RectF();
        this.MediaBrowserCompatCustomActionResultReceiver = pieChart;
        Paint paint = new Paint(1);
        this.onAddQueueItem = paint;
        paint.setColor(-1);
        this.onAddQueueItem.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint(1);
        this.onPlay = paint2;
        paint2.setColor(-1);
        this.onPlay.setStyle(Paint.Style.FILL);
        this.onPlay.setAlpha(105);
        TextPaint textPaint = new TextPaint(1);
        this.RemoteActionCompatParcelizer = textPaint;
        textPaint.setColor(-16777216);
        this.RemoteActionCompatParcelizer.setTextSize(drmSessionAcquired.write(12.0f));
        this.AudioAttributesImplApi21Parcelizer.setTextSize(drmSessionAcquired.write(13.0f));
        this.AudioAttributesImplApi21Parcelizer.setColor(-1);
        this.AudioAttributesImplApi21Parcelizer.setTextAlign(Paint.Align.CENTER);
        Paint paint3 = new Paint(1);
        this.MediaDescriptionCompat = paint3;
        paint3.setColor(-1);
        this.MediaDescriptionCompat.setTextAlign(Paint.Align.CENTER);
        this.MediaDescriptionCompat.setTextSize(drmSessionAcquired.write(13.0f));
        Paint paint4 = new Paint(1);
        this.onFastForward = paint4;
        paint4.setStyle(Paint.Style.STROKE);
    }

    public final Paint write() {
        return this.onAddQueueItem;
    }

    public final Paint IconCompatParcelizer() {
        return this.onPlay;
    }

    public final TextPaint AudioAttributesCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public final Paint read() {
        return this.MediaDescriptionCompat;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.lambdaonReferenceCountDecremented0
    public final void IconCompatParcelizer(Canvas canvas) {
        int iMediaBrowserCompatMediaItem = (int) this.MediaBrowserCompatSearchResultReceiver.MediaBrowserCompatMediaItem();
        int iMediaDescriptionCompat = (int) this.MediaBrowserCompatSearchResultReceiver.MediaDescriptionCompat();
        WeakReference<Bitmap> weakReference = this.MediaMetadataCompat;
        Bitmap bitmapCreateBitmap = weakReference == null ? null : weakReference.get();
        if (bitmapCreateBitmap == null || bitmapCreateBitmap.getWidth() != iMediaBrowserCompatMediaItem || bitmapCreateBitmap.getHeight() != iMediaDescriptionCompat) {
            if (iMediaBrowserCompatMediaItem <= 0 || iMediaDescriptionCompat <= 0) {
                return;
            }
            bitmapCreateBitmap = Bitmap.createBitmap(iMediaBrowserCompatMediaItem, iMediaDescriptionCompat, Bitmap.Config.ARGB_4444);
            this.MediaMetadataCompat = new WeakReference<>(bitmapCreateBitmap);
            this.IconCompatParcelizer = new Canvas(bitmapCreateBitmap);
        }
        bitmapCreateBitmap.eraseColor(0);
        for (setSessionKeepaliveMs setsessionkeepalivems : ((provisionRequired) this.MediaBrowserCompatCustomActionResultReceiver.onSeekTo()).IconCompatParcelizer()) {
            if (setsessionkeepalivems.handleMediaPlayPauseIfPendingOnHandler() && setsessionkeepalivems.onMediaButtonEvent() > 0) {
                write(setsessionkeepalivems);
            }
        }
    }

    private static float IconCompatParcelizer(lambdadrmKeysRemoved4comgoogleandroidexoplayer2drmDrmSessionEventListenerEventDispatcher lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher, float f, float f2, float f3, float f4, float f5, float f6) {
        double d = (f5 + f6) * 0.017453292f;
        float fCos = lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher.IconCompatParcelizer + (((float) Math.cos(d)) * f);
        float fSin = lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher.write + (((float) Math.sin(d)) * f);
        double d2 = (f5 + (f6 / 2.0f)) * 0.017453292f;
        return (float) (((double) (f - ((float) ((Math.sqrt(Math.pow(fCos - f3, 2.0d) + Math.pow(fSin - f4, 2.0d)) / 2.0d) * Math.tan(((180.0d - ((double) f2)) / 2.0d) * 0.017453292519943295d))))) - Math.sqrt(Math.pow((lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher.IconCompatParcelizer + (((float) Math.cos(d2)) * f)) - ((fCos + f3) / 2.0f), 2.0d) + Math.pow((lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher.write + (((float) Math.sin(d2)) * f)) - ((fSin + f4) / 2.0f), 2.0d)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private float IconCompatParcelizer(setSessionKeepaliveMs setsessionkeepalivems) {
        if (setsessionkeepalivems.onPrepareFromUri()) {
            return setsessionkeepalivems.onPrepare() / this.MediaBrowserCompatSearchResultReceiver.handleMediaPlayPauseIfPendingOnHandler() > (setsessionkeepalivems.onPlayFromSearch() / ((provisionRequired) this.MediaBrowserCompatCustomActionResultReceiver.onSeekTo()).MediaBrowserCompatMediaItem()) * 2.0f ? BitmapDescriptorFactory.HUE_RED : setsessionkeepalivems.onPrepare();
        }
        return setsessionkeepalivems.onPrepare();
    }

    private void write(setSessionKeepaliveMs setsessionkeepalivems) {
        float f;
        float f2;
        RectF rectF;
        int i;
        float[] fArr;
        int i2;
        int i3;
        RectF rectF2;
        float f3;
        int i4;
        float f4;
        float f5;
        int i5;
        float f6;
        RectF rectF3;
        float f7;
        setSessionKeepaliveMs setsessionkeepalivems2 = setsessionkeepalivems;
        float fParcelableVolumeInfo = this.MediaBrowserCompatCustomActionResultReceiver.ParcelableVolumeInfo();
        float fIconCompatParcelizer = this.MediaBrowserCompatItemReceiver.IconCompatParcelizer();
        float f8 = this.MediaBrowserCompatItemReceiver.read();
        RectF rectFMediaBrowserCompatItemReceiver = this.MediaBrowserCompatCustomActionResultReceiver.MediaBrowserCompatItemReceiver();
        int iOnMediaButtonEvent = setsessionkeepalivems.onMediaButtonEvent();
        float[] fArrMediaBrowserCompatCustomActionResultReceiver = this.MediaBrowserCompatCustomActionResultReceiver.MediaBrowserCompatCustomActionResultReceiver();
        lambdadrmKeysRemoved4comgoogleandroidexoplayer2drmDrmSessionEventListenerEventDispatcher lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcherIconCompatParcelizer = this.MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer();
        float fRatingCompat = this.MediaBrowserCompatCustomActionResultReceiver.RatingCompat();
        int i6 = 1;
        boolean z = this.MediaBrowserCompatCustomActionResultReceiver.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() && !this.MediaBrowserCompatCustomActionResultReceiver.onPause();
        float fMediaBrowserCompatSearchResultReceiver = z ? (this.MediaBrowserCompatCustomActionResultReceiver.MediaBrowserCompatSearchResultReceiver() / 100.0f) * fRatingCompat : 0.0f;
        float fMediaBrowserCompatSearchResultReceiver2 = (fRatingCompat - ((this.MediaBrowserCompatCustomActionResultReceiver.MediaBrowserCompatSearchResultReceiver() * fRatingCompat) / 100.0f)) / 2.0f;
        RectF rectF4 = new RectF();
        boolean z2 = z && this.MediaBrowserCompatCustomActionResultReceiver.onAddQueueItem();
        int i7 = 0;
        for (int i8 = 0; i8 < iOnMediaButtonEvent; i8++) {
            if (Math.abs(setsessionkeepalivems2.IconCompatParcelizer(i8).read()) > drmSessionAcquired.IconCompatParcelizer) {
                i7++;
            }
        }
        float fIconCompatParcelizer2 = i7 <= 1 ? 0.0f : IconCompatParcelizer(setsessionkeepalivems);
        int i9 = 0;
        float f9 = 0.0f;
        while (i9 < iOnMediaButtonEvent) {
            float f10 = fArrMediaBrowserCompatCustomActionResultReceiver[i9];
            if (Math.abs(setsessionkeepalivems2.IconCompatParcelizer(i9).read()) > drmSessionAcquired.IconCompatParcelizer && (!this.MediaBrowserCompatCustomActionResultReceiver.RemoteActionCompatParcelizer(i9) || z2)) {
                boolean z3 = fIconCompatParcelizer2 > BitmapDescriptorFactory.HUE_RED && f10 <= 180.0f;
                i = iOnMediaButtonEvent;
                this.AudioAttributesImplBaseParcelizer.setColor(setsessionkeepalivems2.AudioAttributesCompatParcelizer(i9));
                float f11 = i7 == 1 ? 0.0f : fIconCompatParcelizer2 / (fRatingCompat * 0.017453292f);
                float f12 = fParcelableVolumeInfo + ((f9 + (f11 / 2.0f)) * f8);
                float f13 = (f10 - f11) * f8;
                float f14 = f13 < BitmapDescriptorFactory.HUE_RED ? 0.0f : f13;
                this.handleMediaPlayPauseIfPendingOnHandler.reset();
                if (z2) {
                    float f15 = fRatingCompat - fMediaBrowserCompatSearchResultReceiver2;
                    fArr = fArrMediaBrowserCompatCustomActionResultReceiver;
                    i2 = i9;
                    i5 = i7;
                    double d = f12 * 0.017453292f;
                    f5 = fParcelableVolumeInfo;
                    f = fIconCompatParcelizer;
                    float fCos = lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcherIconCompatParcelizer.IconCompatParcelizer + (((float) Math.cos(d)) * f15);
                    float fSin = lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcherIconCompatParcelizer.write + (f15 * ((float) Math.sin(d)));
                    rectF4.set(fCos - fMediaBrowserCompatSearchResultReceiver2, fSin - fMediaBrowserCompatSearchResultReceiver2, fCos + fMediaBrowserCompatSearchResultReceiver2, fSin + fMediaBrowserCompatSearchResultReceiver2);
                } else {
                    f = fIconCompatParcelizer;
                    fArr = fArrMediaBrowserCompatCustomActionResultReceiver;
                    i2 = i9;
                    i5 = i7;
                    f5 = fParcelableVolumeInfo;
                }
                double d2 = f12 * 0.017453292f;
                f2 = f8;
                float fCos2 = lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcherIconCompatParcelizer.IconCompatParcelizer + (((float) Math.cos(d2)) * fRatingCompat);
                float fSin2 = lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcherIconCompatParcelizer.write + (((float) Math.sin(d2)) * fRatingCompat);
                if (f14 >= 360.0f && f14 % 360.0f <= drmSessionAcquired.IconCompatParcelizer) {
                    this.handleMediaPlayPauseIfPendingOnHandler.addCircle(lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcherIconCompatParcelizer.IconCompatParcelizer, lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcherIconCompatParcelizer.write, fRatingCompat, Path.Direction.CW);
                } else {
                    if (z2) {
                        this.handleMediaPlayPauseIfPendingOnHandler.arcTo(rectF4, f12 + 180.0f, -180.0f);
                    }
                    this.handleMediaPlayPauseIfPendingOnHandler.arcTo(rectFMediaBrowserCompatItemReceiver, f12, f14);
                }
                rectF = rectFMediaBrowserCompatItemReceiver;
                this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.set(lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcherIconCompatParcelizer.IconCompatParcelizer - fMediaBrowserCompatSearchResultReceiver, lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcherIconCompatParcelizer.write - fMediaBrowserCompatSearchResultReceiver, lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcherIconCompatParcelizer.IconCompatParcelizer + fMediaBrowserCompatSearchResultReceiver, lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcherIconCompatParcelizer.write + fMediaBrowserCompatSearchResultReceiver);
                if (!z) {
                    rectF2 = rectF4;
                    f4 = fRatingCompat;
                    i3 = i5;
                    i4 = 1;
                    f3 = fMediaBrowserCompatSearchResultReceiver;
                    f6 = 360.0f;
                } else if (fMediaBrowserCompatSearchResultReceiver > BitmapDescriptorFactory.HUE_RED || z3) {
                    if (z3) {
                        i3 = i5;
                        f7 = fMediaBrowserCompatSearchResultReceiver;
                        rectF3 = rectF4;
                        i4 = 1;
                        f4 = fRatingCompat;
                        float fIconCompatParcelizer3 = IconCompatParcelizer(lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcherIconCompatParcelizer, fRatingCompat, f10 * f2, fCos2, fSin2, f12, f14);
                        if (fIconCompatParcelizer3 < BitmapDescriptorFactory.HUE_RED) {
                            fIconCompatParcelizer3 = -fIconCompatParcelizer3;
                        }
                        fMediaBrowserCompatSearchResultReceiver = Math.max(f7, fIconCompatParcelizer3);
                    } else {
                        rectF3 = rectF4;
                        f7 = fMediaBrowserCompatSearchResultReceiver;
                        f4 = fRatingCompat;
                        i3 = i5;
                        i4 = 1;
                    }
                    float f16 = (i3 == i4 || fMediaBrowserCompatSearchResultReceiver == BitmapDescriptorFactory.HUE_RED) ? 0.0f : fIconCompatParcelizer2 / (fMediaBrowserCompatSearchResultReceiver * 0.017453292f);
                    float f17 = f16 / 2.0f;
                    float f18 = (f10 - f16) * f2;
                    if (f18 < BitmapDescriptorFactory.HUE_RED) {
                        f18 = 0.0f;
                    }
                    float f19 = ((f9 + f17) * f2) + f5 + f18;
                    if (f14 >= 360.0f && f14 % 360.0f <= drmSessionAcquired.IconCompatParcelizer) {
                        this.handleMediaPlayPauseIfPendingOnHandler.addCircle(lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcherIconCompatParcelizer.IconCompatParcelizer, lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcherIconCompatParcelizer.write, fMediaBrowserCompatSearchResultReceiver, Path.Direction.CCW);
                    } else {
                        if (z2) {
                            float f20 = f4 - fMediaBrowserCompatSearchResultReceiver2;
                            double d3 = 0.017453292f * f19;
                            float fCos3 = lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcherIconCompatParcelizer.IconCompatParcelizer + (((float) Math.cos(d3)) * f20);
                            float fSin3 = lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcherIconCompatParcelizer.write + (((float) Math.sin(d3)) * f20);
                            rectF3.set(fCos3 - fMediaBrowserCompatSearchResultReceiver2, fSin3 - fMediaBrowserCompatSearchResultReceiver2, fCos3 + fMediaBrowserCompatSearchResultReceiver2, fSin3 + fMediaBrowserCompatSearchResultReceiver2);
                            this.handleMediaPlayPauseIfPendingOnHandler.arcTo(rectF3, f19, 180.0f);
                        } else {
                            double d4 = 0.017453292f * f19;
                            this.handleMediaPlayPauseIfPendingOnHandler.lineTo(lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcherIconCompatParcelizer.IconCompatParcelizer + (((float) Math.cos(d4)) * fMediaBrowserCompatSearchResultReceiver), lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcherIconCompatParcelizer.write + (fMediaBrowserCompatSearchResultReceiver * ((float) Math.sin(d4))));
                        }
                        this.handleMediaPlayPauseIfPendingOnHandler.arcTo(this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, f19, -f18);
                    }
                    f3 = f7;
                    rectF2 = rectF3;
                    this.handleMediaPlayPauseIfPendingOnHandler.close();
                    this.IconCompatParcelizer.drawPath(this.handleMediaPlayPauseIfPendingOnHandler, this.AudioAttributesImplBaseParcelizer);
                    f9 += f10 * f;
                } else {
                    rectF2 = rectF4;
                    f4 = fRatingCompat;
                    i3 = i5;
                    i4 = 1;
                    f6 = 360.0f;
                    f3 = fMediaBrowserCompatSearchResultReceiver;
                }
                if (f14 % f6 > drmSessionAcquired.IconCompatParcelizer) {
                    if (z3) {
                        float f21 = f14 / 2.0f;
                        float fIconCompatParcelizer4 = IconCompatParcelizer(lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcherIconCompatParcelizer, f4, f10 * f2, fCos2, fSin2, f12, f14);
                        double d5 = (f12 + f21) * 0.017453292f;
                        this.handleMediaPlayPauseIfPendingOnHandler.lineTo(lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcherIconCompatParcelizer.IconCompatParcelizer + (((float) Math.cos(d5)) * fIconCompatParcelizer4), lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcherIconCompatParcelizer.write + (fIconCompatParcelizer4 * ((float) Math.sin(d5))));
                    } else {
                        this.handleMediaPlayPauseIfPendingOnHandler.lineTo(lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcherIconCompatParcelizer.IconCompatParcelizer, lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcherIconCompatParcelizer.write);
                    }
                }
                this.handleMediaPlayPauseIfPendingOnHandler.close();
                this.IconCompatParcelizer.drawPath(this.handleMediaPlayPauseIfPendingOnHandler, this.AudioAttributesImplBaseParcelizer);
                f9 += f10 * f;
            } else {
                f9 += f10 * fIconCompatParcelizer;
                f = fIconCompatParcelizer;
                f2 = f8;
                rectF = rectFMediaBrowserCompatItemReceiver;
                i = iOnMediaButtonEvent;
                fArr = fArrMediaBrowserCompatCustomActionResultReceiver;
                i2 = i9;
                i3 = i7;
                rectF2 = rectF4;
                f3 = fMediaBrowserCompatSearchResultReceiver;
                i4 = i6;
                f4 = fRatingCompat;
                f5 = fParcelableVolumeInfo;
            }
            i9 = i2 + 1;
            setsessionkeepalivems2 = setsessionkeepalivems;
            i6 = i4;
            i7 = i3;
            fParcelableVolumeInfo = f5;
            fRatingCompat = f4;
            rectF4 = rectF2;
            iOnMediaButtonEvent = i;
            f8 = f2;
            fArrMediaBrowserCompatCustomActionResultReceiver = fArr;
            fMediaBrowserCompatSearchResultReceiver = f3;
            fIconCompatParcelizer = f;
            rectFMediaBrowserCompatItemReceiver = rectF;
        }
        lambdadrmKeysRemoved4comgoogleandroidexoplayer2drmDrmSessionEventListenerEventDispatcher.AudioAttributesCompatParcelizer(lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcherIconCompatParcelizer);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.lambdaonReferenceCountDecremented0
    public final void write(Canvas canvas) {
        int i;
        List<setSessionKeepaliveMs> list;
        float f;
        float[] fArr;
        float[] fArr2;
        float f2;
        float f3;
        float f4;
        lambdadrmKeysRemoved4comgoogleandroidexoplayer2drmDrmSessionEventListenerEventDispatcher lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher;
        Canvas canvas2;
        float f5;
        DefaultDrmSessionExternalSyntheticLambda3.IconCompatParcelizer iconCompatParcelizer;
        float f6;
        float f7;
        float f8;
        boolean z;
        float f9;
        float f10;
        float f11;
        lambdadrmKeysRemoved4comgoogleandroidexoplayer2drmDrmSessionEventListenerEventDispatcher lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher2;
        DefaultDrmSessionResponseHandler defaultDrmSessionResponseHandler;
        lambdadrmKeysRemoved4comgoogleandroidexoplayer2drmDrmSessionEventListenerEventDispatcher lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher3;
        float f12;
        float f13;
        String str;
        setSessionKeepaliveMs setsessionkeepalivems;
        Canvas canvas3;
        lambdadrmKeysRemoved4comgoogleandroidexoplayer2drmDrmSessionEventListenerEventDispatcher lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher4;
        Canvas canvas4 = canvas;
        lambdadrmKeysRemoved4comgoogleandroidexoplayer2drmDrmSessionEventListenerEventDispatcher lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcherIconCompatParcelizer = this.MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer();
        float fRatingCompat = this.MediaBrowserCompatCustomActionResultReceiver.RatingCompat();
        float fParcelableVolumeInfo = this.MediaBrowserCompatCustomActionResultReceiver.ParcelableVolumeInfo();
        float[] fArrMediaBrowserCompatCustomActionResultReceiver = this.MediaBrowserCompatCustomActionResultReceiver.MediaBrowserCompatCustomActionResultReceiver();
        float[] fArrWrite = this.MediaBrowserCompatCustomActionResultReceiver.write();
        float fIconCompatParcelizer = this.MediaBrowserCompatItemReceiver.IconCompatParcelizer();
        float f14 = this.MediaBrowserCompatItemReceiver.read();
        float fMediaBrowserCompatSearchResultReceiver = (fRatingCompat - ((this.MediaBrowserCompatCustomActionResultReceiver.MediaBrowserCompatSearchResultReceiver() * fRatingCompat) / 100.0f)) / 2.0f;
        float fMediaBrowserCompatSearchResultReceiver2 = this.MediaBrowserCompatCustomActionResultReceiver.MediaBrowserCompatSearchResultReceiver() / 100.0f;
        float f15 = (fRatingCompat / 10.0f) * 3.6f;
        if (this.MediaBrowserCompatCustomActionResultReceiver.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver()) {
            f15 = (fRatingCompat - (fRatingCompat * fMediaBrowserCompatSearchResultReceiver2)) / 2.0f;
            if (!this.MediaBrowserCompatCustomActionResultReceiver.onPause() && this.MediaBrowserCompatCustomActionResultReceiver.onAddQueueItem()) {
                fParcelableVolumeInfo = (float) (((double) fParcelableVolumeInfo) + (((double) (fMediaBrowserCompatSearchResultReceiver * 360.0f)) / (((double) fRatingCompat) * 6.283185307179586d)));
            }
        }
        float f16 = fParcelableVolumeInfo;
        float f17 = fRatingCompat - f15;
        provisionRequired provisionrequired = (provisionRequired) this.MediaBrowserCompatCustomActionResultReceiver.onSeekTo();
        List<setSessionKeepaliveMs> listIconCompatParcelizer = provisionrequired.IconCompatParcelizer();
        float fMediaBrowserCompatMediaItem = provisionrequired.MediaBrowserCompatMediaItem();
        boolean zOnCommand = this.MediaBrowserCompatCustomActionResultReceiver.onCommand();
        canvas.save();
        float fWrite = drmSessionAcquired.write(5.0f);
        int i2 = 0;
        int i3 = 0;
        while (i3 < listIconCompatParcelizer.size()) {
            setSessionKeepaliveMs setsessionkeepalivems2 = listIconCompatParcelizer.get(i3);
            boolean zOnAddQueueItem = setsessionkeepalivems2.onAddQueueItem();
            if (zOnAddQueueItem || zOnCommand) {
                DefaultDrmSessionExternalSyntheticLambda3.IconCompatParcelizer iconCompatParcelizerOnSeekTo = setsessionkeepalivems2.onSeekTo();
                DefaultDrmSessionExternalSyntheticLambda3.IconCompatParcelizer iconCompatParcelizerOnRemoveQueueItemAt = setsessionkeepalivems2.onRemoveQueueItemAt();
                RemoteActionCompatParcelizer(setsessionkeepalivems2);
                int i4 = i2;
                i = i3;
                float fAudioAttributesCompatParcelizer = drmSessionAcquired.AudioAttributesCompatParcelizer(this.AudioAttributesImplApi21Parcelizer, "Q") + drmSessionAcquired.write(4.0f);
                DefaultDrmSessionResponseHandler defaultDrmSessionResponseHandlerMediaBrowserCompatMediaItem = setsessionkeepalivems2.MediaBrowserCompatMediaItem();
                int iOnMediaButtonEvent = setsessionkeepalivems2.onMediaButtonEvent();
                list = listIconCompatParcelizer;
                this.onFastForward.setColor(setsessionkeepalivems2.onPlayFromUri());
                this.onFastForward.setStrokeWidth(drmSessionAcquired.write(setsessionkeepalivems2.onRemoveQueueItem()));
                float fIconCompatParcelizer2 = IconCompatParcelizer(setsessionkeepalivems2);
                lambdadrmKeysRemoved4comgoogleandroidexoplayer2drmDrmSessionEventListenerEventDispatcher lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher5 = lambdadrmKeysRemoved4comgoogleandroidexoplayer2drmDrmSessionEventListenerEventDispatcher.read(setsessionkeepalivems2.MediaDescriptionCompat());
                lambdadrmKeysRemoved4comgoogleandroidexoplayer2drmDrmSessionEventListenerEventDispatcher lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher6 = lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcherIconCompatParcelizer;
                lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher5.IconCompatParcelizer = drmSessionAcquired.write(lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher5.IconCompatParcelizer);
                lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher5.write = drmSessionAcquired.write(lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher5.write);
                int i5 = 0;
                while (i5 < iOnMediaButtonEvent) {
                    PieEntry pieEntryIconCompatParcelizer = setsessionkeepalivems2.IconCompatParcelizer(i5);
                    int i6 = iOnMediaButtonEvent;
                    float f18 = f16 + (((i4 == 0 ? BitmapDescriptorFactory.HUE_RED : fArrWrite[i4 - 1] * fIconCompatParcelizer) + ((fArrMediaBrowserCompatCustomActionResultReceiver[i4] - ((fIconCompatParcelizer2 / (f17 * 0.017453292f)) / 2.0f)) / 2.0f)) * f14);
                    lambdadrmKeysRemoved4comgoogleandroidexoplayer2drmDrmSessionEventListenerEventDispatcher lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher7 = lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher5;
                    String strRemoteActionCompatParcelizer = defaultDrmSessionResponseHandlerMediaBrowserCompatMediaItem.RemoteActionCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver.onMediaButtonEvent() ? (pieEntryIconCompatParcelizer.read() / fMediaBrowserCompatMediaItem) * 100.0f : pieEntryIconCompatParcelizer.read());
                    String strWrite = pieEntryIconCompatParcelizer.write();
                    DefaultDrmSessionResponseHandler defaultDrmSessionResponseHandler2 = defaultDrmSessionResponseHandlerMediaBrowserCompatMediaItem;
                    double d = f18 * 0.017453292f;
                    float[] fArr3 = fArrMediaBrowserCompatCustomActionResultReceiver;
                    float[] fArr4 = fArrWrite;
                    float fCos = (float) Math.cos(d);
                    float f19 = fIconCompatParcelizer;
                    float fSin = (float) Math.sin(d);
                    boolean z2 = zOnCommand && iconCompatParcelizerOnSeekTo == DefaultDrmSessionExternalSyntheticLambda3.IconCompatParcelizer.OUTSIDE_SLICE;
                    float f20 = fIconCompatParcelizer2;
                    boolean z3 = zOnAddQueueItem && iconCompatParcelizerOnRemoveQueueItemAt == DefaultDrmSessionExternalSyntheticLambda3.IconCompatParcelizer.OUTSIDE_SLICE;
                    float f21 = f14;
                    boolean z4 = zOnCommand && iconCompatParcelizerOnSeekTo == DefaultDrmSessionExternalSyntheticLambda3.IconCompatParcelizer.INSIDE_SLICE;
                    DefaultDrmSessionExternalSyntheticLambda3.IconCompatParcelizer iconCompatParcelizer2 = iconCompatParcelizerOnSeekTo;
                    boolean z5 = zOnAddQueueItem && iconCompatParcelizerOnRemoveQueueItemAt == DefaultDrmSessionExternalSyntheticLambda3.IconCompatParcelizer.INSIDE_SLICE;
                    if (z2 || z3) {
                        float fOnPrepareFromMediaId = setsessionkeepalivems2.onPrepareFromMediaId();
                        float fOnRewind = setsessionkeepalivems2.onRewind();
                        float fOnPrepareFromSearch = setsessionkeepalivems2.onPrepareFromSearch() / 100.0f;
                        iconCompatParcelizer = iconCompatParcelizerOnRemoveQueueItemAt;
                        if (this.MediaBrowserCompatCustomActionResultReceiver.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver()) {
                            float f22 = fRatingCompat * fMediaBrowserCompatSearchResultReceiver2;
                            f6 = ((fRatingCompat - f22) * fOnPrepareFromSearch) + f22;
                        } else {
                            f6 = fRatingCompat * fOnPrepareFromSearch;
                        }
                        float fAbs = setsessionkeepalivems2.onSetCaptioningEnabled() ? fOnRewind * f17 * Math.abs((float) Math.sin(d)) : fOnRewind * f17;
                        lambdadrmKeysRemoved4comgoogleandroidexoplayer2drmDrmSessionEventListenerEventDispatcher lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher8 = lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher6;
                        float f23 = lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher8.IconCompatParcelizer;
                        float f24 = lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher8.write;
                        float f25 = (fOnPrepareFromMediaId + 1.0f) * f17;
                        f7 = fRatingCompat;
                        float f26 = (f25 * fCos) + lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher8.IconCompatParcelizer;
                        f8 = f16;
                        float f27 = lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher8.write + (f25 * fSin);
                        z = z4;
                        double d2 = ((double) f18) % 360.0d;
                        if (d2 >= 90.0d && d2 <= 270.0d) {
                            float f28 = f26 - fAbs;
                            this.AudioAttributesImplApi21Parcelizer.setTextAlign(Paint.Align.RIGHT);
                            if (z2) {
                                this.MediaDescriptionCompat.setTextAlign(Paint.Align.RIGHT);
                            }
                            f10 = f28 - fWrite;
                            f9 = f28;
                        } else {
                            f9 = f26 + fAbs;
                            this.AudioAttributesImplApi21Parcelizer.setTextAlign(Paint.Align.LEFT);
                            if (z2) {
                                this.MediaDescriptionCompat.setTextAlign(Paint.Align.LEFT);
                            }
                            f10 = f9 + fWrite;
                        }
                        if (setsessionkeepalivems2.onPlayFromUri() != 1122867) {
                            if (setsessionkeepalivems2.onSetRating()) {
                                this.onFastForward.setColor(setsessionkeepalivems2.AudioAttributesCompatParcelizer(i5));
                            }
                            defaultDrmSessionResponseHandler = defaultDrmSessionResponseHandler2;
                            f12 = fSin;
                            setsessionkeepalivems = setsessionkeepalivems2;
                            f11 = fCos;
                            lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher2 = lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher7;
                            lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher3 = lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher8;
                            f13 = f17;
                            str = strWrite;
                            canvas.drawLine(f23 + (f6 * fCos), (f6 * fSin) + f24, f26, f27, this.onFastForward);
                            canvas.drawLine(f26, f27, f9, f27, this.onFastForward);
                        } else {
                            f11 = fCos;
                            lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher2 = lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher7;
                            defaultDrmSessionResponseHandler = defaultDrmSessionResponseHandler2;
                            lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher3 = lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher8;
                            f12 = fSin;
                            f13 = f17;
                            str = strWrite;
                            setsessionkeepalivems = setsessionkeepalivems2;
                        }
                        if (z2 && z3) {
                            write(canvas, strRemoteActionCompatParcelizer, f10, f27, setsessionkeepalivems.write(i5));
                            if (i5 >= provisionrequired.write() || str == null) {
                                canvas3 = canvas;
                            } else {
                                canvas3 = canvas;
                                RemoteActionCompatParcelizer(canvas3, str, f10, f27 + fAudioAttributesCompatParcelizer);
                            }
                        } else {
                            canvas3 = canvas;
                            if (z2) {
                                if (i5 < provisionrequired.write() && str != null) {
                                    RemoteActionCompatParcelizer(canvas3, str, f10, f27 + (fAudioAttributesCompatParcelizer / 2.0f));
                                }
                            } else if (z3) {
                                write(canvas, strRemoteActionCompatParcelizer, f10, (fAudioAttributesCompatParcelizer / 2.0f) + f27, setsessionkeepalivems.write(i5));
                            }
                        }
                    } else {
                        iconCompatParcelizer = iconCompatParcelizerOnRemoveQueueItemAt;
                        f7 = fRatingCompat;
                        f11 = fCos;
                        z = z4;
                        lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher3 = lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher6;
                        lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher2 = lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher7;
                        defaultDrmSessionResponseHandler = defaultDrmSessionResponseHandler2;
                        canvas3 = canvas;
                        f12 = fSin;
                        f8 = f16;
                        f13 = f17;
                        str = strWrite;
                        setsessionkeepalivems = setsessionkeepalivems2;
                    }
                    if (z || z5) {
                        float f29 = lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher3.IconCompatParcelizer + (f13 * f11);
                        float f30 = lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher3.write + (f13 * f12);
                        this.AudioAttributesImplApi21Parcelizer.setTextAlign(Paint.Align.CENTER);
                        if (z && z5) {
                            write(canvas, strRemoteActionCompatParcelizer, f29, f30, setsessionkeepalivems.write(i5));
                            if (i5 < provisionrequired.write() && str != null) {
                                RemoteActionCompatParcelizer(canvas3, str, f29, f30 + fAudioAttributesCompatParcelizer);
                            }
                        } else if (z) {
                            if (i5 < provisionrequired.write() && str != null) {
                                RemoteActionCompatParcelizer(canvas3, str, f29, f30 + (fAudioAttributesCompatParcelizer / 2.0f));
                            }
                        } else if (z5) {
                            write(canvas, strRemoteActionCompatParcelizer, f29, f30 + (fAudioAttributesCompatParcelizer / 2.0f), setsessionkeepalivems.write(i5));
                        }
                    }
                    if (pieEntryIconCompatParcelizer.AudioAttributesImplApi21Parcelizer() == null || !setsessionkeepalivems.onCommand()) {
                        lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher4 = lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher2;
                    } else {
                        Drawable drawableAudioAttributesImplApi21Parcelizer = pieEntryIconCompatParcelizer.AudioAttributesImplApi21Parcelizer();
                        lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher4 = lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher2;
                        drmSessionAcquired.write(canvas, drawableAudioAttributesImplApi21Parcelizer, (int) (((lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher4.write + f13) * f11) + lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher3.IconCompatParcelizer), (int) (((lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher4.write + f13) * f12) + lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher3.write + lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher4.IconCompatParcelizer), drawableAudioAttributesImplApi21Parcelizer.getIntrinsicWidth(), drawableAudioAttributesImplApi21Parcelizer.getIntrinsicHeight());
                    }
                    i4++;
                    i5++;
                    lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher5 = lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher4;
                    setsessionkeepalivems2 = setsessionkeepalivems;
                    f16 = f8;
                    f17 = f13;
                    iOnMediaButtonEvent = i6;
                    fArrWrite = fArr4;
                    fIconCompatParcelizer = f19;
                    fIconCompatParcelizer2 = f20;
                    f14 = f21;
                    iconCompatParcelizerOnSeekTo = iconCompatParcelizer2;
                    fRatingCompat = f7;
                    iconCompatParcelizerOnRemoveQueueItemAt = iconCompatParcelizer;
                    defaultDrmSessionResponseHandlerMediaBrowserCompatMediaItem = defaultDrmSessionResponseHandler;
                    lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher6 = lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher3;
                    fArrMediaBrowserCompatCustomActionResultReceiver = fArr3;
                }
                f = fRatingCompat;
                fArr = fArrMediaBrowserCompatCustomActionResultReceiver;
                fArr2 = fArrWrite;
                f2 = fIconCompatParcelizer;
                f3 = f14;
                f4 = f17;
                lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher = lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher6;
                canvas2 = canvas;
                f5 = f16;
                lambdadrmKeysRemoved4comgoogleandroidexoplayer2drmDrmSessionEventListenerEventDispatcher.AudioAttributesCompatParcelizer(lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher5);
                i2 = i4;
            } else {
                i = i3;
                list = listIconCompatParcelizer;
                f = fRatingCompat;
                fArr = fArrMediaBrowserCompatCustomActionResultReceiver;
                fArr2 = fArrWrite;
                f2 = fIconCompatParcelizer;
                f3 = f14;
                f5 = f16;
                f4 = f17;
                canvas2 = canvas4;
                lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher = lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcherIconCompatParcelizer;
            }
            i3 = i + 1;
            canvas4 = canvas2;
            lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcherIconCompatParcelizer = lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher;
            listIconCompatParcelizer = list;
            f16 = f5;
            f17 = f4;
            fArrMediaBrowserCompatCustomActionResultReceiver = fArr;
            fArrWrite = fArr2;
            fIconCompatParcelizer = f2;
            f14 = f3;
            fRatingCompat = f;
        }
        lambdadrmKeysRemoved4comgoogleandroidexoplayer2drmDrmSessionEventListenerEventDispatcher.AudioAttributesCompatParcelizer(lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcherIconCompatParcelizer);
        canvas.restore();
    }

    private void write(Canvas canvas, String str, float f, float f2, int i) {
        this.AudioAttributesImplApi21Parcelizer.setColor(i);
        canvas.drawText(str, f, f2, this.AudioAttributesImplApi21Parcelizer);
    }

    private void RemoteActionCompatParcelizer(Canvas canvas, String str, float f, float f2) {
        canvas.drawText(str, f, f2, this.MediaDescriptionCompat);
    }

    @Override // kotlin.lambdaonReferenceCountDecremented0
    public final void read(Canvas canvas) {
        AudioAttributesImplBaseParcelizer();
        canvas.drawBitmap(this.MediaMetadataCompat.get(), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (Paint) null);
        AudioAttributesCompatParcelizer(canvas);
    }

    private void AudioAttributesImplBaseParcelizer() {
        if (!this.MediaBrowserCompatCustomActionResultReceiver.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() || this.IconCompatParcelizer == null) {
            return;
        }
        float fRatingCompat = this.MediaBrowserCompatCustomActionResultReceiver.RatingCompat();
        float fMediaBrowserCompatSearchResultReceiver = (this.MediaBrowserCompatCustomActionResultReceiver.MediaBrowserCompatSearchResultReceiver() / 100.0f) * fRatingCompat;
        lambdadrmKeysRemoved4comgoogleandroidexoplayer2drmDrmSessionEventListenerEventDispatcher lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcherIconCompatParcelizer = this.MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer();
        if (Color.alpha(this.onAddQueueItem.getColor()) > 0) {
            this.IconCompatParcelizer.drawCircle(lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcherIconCompatParcelizer.IconCompatParcelizer, lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcherIconCompatParcelizer.write, fMediaBrowserCompatSearchResultReceiver, this.onAddQueueItem);
        }
        if (Color.alpha(this.onPlay.getColor()) > 0 && this.MediaBrowserCompatCustomActionResultReceiver.onCustomAction() > this.MediaBrowserCompatCustomActionResultReceiver.MediaBrowserCompatSearchResultReceiver()) {
            int alpha = this.onPlay.getAlpha();
            float fOnCustomAction = this.MediaBrowserCompatCustomActionResultReceiver.onCustomAction() / 100.0f;
            this.onPlay.setAlpha((int) (alpha * this.MediaBrowserCompatItemReceiver.IconCompatParcelizer() * this.MediaBrowserCompatItemReceiver.read()));
            this.onCommand.reset();
            this.onCommand.addCircle(lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcherIconCompatParcelizer.IconCompatParcelizer, lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcherIconCompatParcelizer.write, fRatingCompat * fOnCustomAction, Path.Direction.CW);
            this.onCommand.addCircle(lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcherIconCompatParcelizer.IconCompatParcelizer, lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcherIconCompatParcelizer.write, fMediaBrowserCompatSearchResultReceiver, Path.Direction.CCW);
            this.IconCompatParcelizer.drawPath(this.onCommand, this.onPlay);
            this.onPlay.setAlpha(alpha);
        }
        lambdadrmKeysRemoved4comgoogleandroidexoplayer2drmDrmSessionEventListenerEventDispatcher.AudioAttributesCompatParcelizer(lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcherIconCompatParcelizer);
    }

    private void AudioAttributesCompatParcelizer(Canvas canvas) {
        float fRatingCompat;
        lambdadrmKeysRemoved4comgoogleandroidexoplayer2drmDrmSessionEventListenerEventDispatcher lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher;
        CharSequence charSequenceAudioAttributesCompatParcelizer = this.MediaBrowserCompatCustomActionResultReceiver.AudioAttributesCompatParcelizer();
        if (!this.MediaBrowserCompatCustomActionResultReceiver.handleMediaPlayPauseIfPendingOnHandler() || charSequenceAudioAttributesCompatParcelizer == null) {
            return;
        }
        lambdadrmKeysRemoved4comgoogleandroidexoplayer2drmDrmSessionEventListenerEventDispatcher lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcherIconCompatParcelizer = this.MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer();
        lambdadrmKeysRemoved4comgoogleandroidexoplayer2drmDrmSessionEventListenerEventDispatcher lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcherAudioAttributesImplApi26Parcelizer = this.MediaBrowserCompatCustomActionResultReceiver.AudioAttributesImplApi26Parcelizer();
        float f = lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcherIconCompatParcelizer.IconCompatParcelizer + lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcherAudioAttributesImplApi26Parcelizer.IconCompatParcelizer;
        float f2 = lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcherIconCompatParcelizer.write + lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcherAudioAttributesImplApi26Parcelizer.write;
        if (this.MediaBrowserCompatCustomActionResultReceiver.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() && !this.MediaBrowserCompatCustomActionResultReceiver.onPause()) {
            fRatingCompat = this.MediaBrowserCompatCustomActionResultReceiver.RatingCompat() * (this.MediaBrowserCompatCustomActionResultReceiver.MediaBrowserCompatSearchResultReceiver() / 100.0f);
        } else {
            fRatingCompat = this.MediaBrowserCompatCustomActionResultReceiver.RatingCompat();
        }
        RectF rectF = this.onCustomAction[0];
        rectF.left = f - fRatingCompat;
        rectF.top = f2 - fRatingCompat;
        rectF.right = f + fRatingCompat;
        rectF.bottom = f2 + fRatingCompat;
        RectF rectF2 = this.onCustomAction[1];
        rectF2.set(rectF);
        float fAudioAttributesImplBaseParcelizer = this.MediaBrowserCompatCustomActionResultReceiver.AudioAttributesImplBaseParcelizer() / 100.0f;
        if (fAudioAttributesImplBaseParcelizer > 0.0d) {
            rectF2.inset((rectF2.width() - (rectF2.width() * fAudioAttributesImplBaseParcelizer)) / 2.0f, (rectF2.height() - (rectF2.height() * fAudioAttributesImplBaseParcelizer)) / 2.0f);
        }
        if (charSequenceAudioAttributesCompatParcelizer.equals(this.write) && rectF2.equals(this.read)) {
            lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher = lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcherAudioAttributesImplApi26Parcelizer;
        } else {
            this.read.set(rectF2);
            this.write = charSequenceAudioAttributesCompatParcelizer;
            lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher = lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcherAudioAttributesImplApi26Parcelizer;
            this.AudioAttributesCompatParcelizer = new StaticLayout(charSequenceAudioAttributesCompatParcelizer, 0, charSequenceAudioAttributesCompatParcelizer.length(), this.RemoteActionCompatParcelizer, (int) Math.max(Math.ceil(this.read.width()), 1.0d), Layout.Alignment.ALIGN_CENTER, 1.0f, BitmapDescriptorFactory.HUE_RED, false);
        }
        float height = this.AudioAttributesCompatParcelizer.getHeight();
        canvas.save();
        Path path = this.RatingCompat;
        path.reset();
        path.addOval(rectF, Path.Direction.CW);
        canvas.clipPath(path);
        canvas.translate(rectF2.left, rectF2.top + ((rectF2.height() - height) / 2.0f));
        this.AudioAttributesCompatParcelizer.draw(canvas);
        canvas.restore();
        lambdadrmKeysRemoved4comgoogleandroidexoplayer2drmDrmSessionEventListenerEventDispatcher.AudioAttributesCompatParcelizer(lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcherIconCompatParcelizer);
        lambdadrmKeysRemoved4comgoogleandroidexoplayer2drmDrmSessionEventListenerEventDispatcher.AudioAttributesCompatParcelizer(lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.lambdaonReferenceCountDecremented0
    public final void RemoteActionCompatParcelizer(Canvas canvas, createAndAcquireSessionWithRetry[] createandacquiresessionwithretryArr) {
        boolean z;
        float f;
        float f2;
        float f3;
        float[] fArr;
        float[] fArr2;
        int i;
        RectF rectF;
        float f4;
        setSessionKeepaliveMs setsessionkeepalivems;
        int i2;
        int i3;
        float f5;
        int i4;
        float fIconCompatParcelizer;
        float f6;
        float fMax;
        createAndAcquireSessionWithRetry[] createandacquiresessionwithretryArr2 = createandacquiresessionwithretryArr;
        boolean z2 = this.MediaBrowserCompatCustomActionResultReceiver.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() && !this.MediaBrowserCompatCustomActionResultReceiver.onPause();
        if (z2 && this.MediaBrowserCompatCustomActionResultReceiver.onAddQueueItem()) {
            return;
        }
        float fIconCompatParcelizer2 = this.MediaBrowserCompatItemReceiver.IconCompatParcelizer();
        float f7 = this.MediaBrowserCompatItemReceiver.read();
        float fParcelableVolumeInfo = this.MediaBrowserCompatCustomActionResultReceiver.ParcelableVolumeInfo();
        float[] fArrMediaBrowserCompatCustomActionResultReceiver = this.MediaBrowserCompatCustomActionResultReceiver.MediaBrowserCompatCustomActionResultReceiver();
        float[] fArrWrite = this.MediaBrowserCompatCustomActionResultReceiver.write();
        lambdadrmKeysRemoved4comgoogleandroidexoplayer2drmDrmSessionEventListenerEventDispatcher lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcherIconCompatParcelizer = this.MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer();
        float fRatingCompat = this.MediaBrowserCompatCustomActionResultReceiver.RatingCompat();
        float fMediaBrowserCompatSearchResultReceiver = z2 ? (this.MediaBrowserCompatCustomActionResultReceiver.MediaBrowserCompatSearchResultReceiver() / 100.0f) * fRatingCompat : 0.0f;
        RectF rectF2 = this.MediaBrowserCompatMediaItem;
        rectF2.set(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
        int i5 = 0;
        while (i5 < createandacquiresessionwithretryArr2.length) {
            int iMediaBrowserCompatCustomActionResultReceiver = (int) createandacquiresessionwithretryArr2[i5].MediaBrowserCompatCustomActionResultReceiver();
            if (iMediaBrowserCompatCustomActionResultReceiver >= fArrMediaBrowserCompatCustomActionResultReceiver.length || (setsessionkeepalivems = ((provisionRequired) this.MediaBrowserCompatCustomActionResultReceiver.onSeekTo()).RemoteActionCompatParcelizer(createandacquiresessionwithretryArr2[i5].RemoteActionCompatParcelizer())) == null || !setsessionkeepalivems.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver()) {
                z = z2;
                f = fIconCompatParcelizer2;
                f2 = f7;
                f3 = fParcelableVolumeInfo;
                fArr = fArrMediaBrowserCompatCustomActionResultReceiver;
                fArr2 = fArrWrite;
                i = i5;
                rectF = rectF2;
                f4 = fMediaBrowserCompatSearchResultReceiver;
            } else {
                int iOnMediaButtonEvent = setsessionkeepalivems.onMediaButtonEvent();
                int i6 = 0;
                for (int i7 = 0; i7 < iOnMediaButtonEvent; i7++) {
                    if (Math.abs(setsessionkeepalivems.IconCompatParcelizer(i7).read()) > drmSessionAcquired.IconCompatParcelizer) {
                        i6++;
                    }
                }
                float f8 = iMediaBrowserCompatCustomActionResultReceiver == 0 ? BitmapDescriptorFactory.HUE_RED : fArrWrite[iMediaBrowserCompatCustomActionResultReceiver - 1] * fIconCompatParcelizer2;
                float fOnPrepare = i6 <= 1 ? BitmapDescriptorFactory.HUE_RED : setsessionkeepalivems.onPrepare();
                float f9 = fArrMediaBrowserCompatCustomActionResultReceiver[iMediaBrowserCompatCustomActionResultReceiver];
                float fAudioAttributesCompatParcelizer = setsessionkeepalivems.AudioAttributesCompatParcelizer();
                f = fIconCompatParcelizer2;
                float f10 = fRatingCompat + fAudioAttributesCompatParcelizer;
                fArr = fArrMediaBrowserCompatCustomActionResultReceiver;
                rectF2.set(this.MediaBrowserCompatCustomActionResultReceiver.MediaBrowserCompatItemReceiver());
                float f11 = -fAudioAttributesCompatParcelizer;
                rectF2.inset(f11, f11);
                boolean z3 = fOnPrepare > BitmapDescriptorFactory.HUE_RED && f9 <= 180.0f;
                this.AudioAttributesImplBaseParcelizer.setColor(setsessionkeepalivems.AudioAttributesCompatParcelizer(iMediaBrowserCompatCustomActionResultReceiver));
                float f12 = i6 == 1 ? BitmapDescriptorFactory.HUE_RED : fOnPrepare / (fRatingCompat * 0.017453292f);
                float f13 = i6 == 1 ? BitmapDescriptorFactory.HUE_RED : fOnPrepare / (f10 * 0.017453292f);
                float f14 = (((f12 / 2.0f) + f8) * f7) + fParcelableVolumeInfo;
                float f15 = (f9 - f12) * f7;
                float f16 = f15 < BitmapDescriptorFactory.HUE_RED ? 0.0f : f15;
                float f17 = (((f13 / 2.0f) + f8) * f7) + fParcelableVolumeInfo;
                float f18 = (f9 - f13) * f7;
                if (f18 < BitmapDescriptorFactory.HUE_RED) {
                    f18 = 0.0f;
                }
                this.handleMediaPlayPauseIfPendingOnHandler.reset();
                if (f16 >= 360.0f && f16 % 360.0f <= drmSessionAcquired.IconCompatParcelizer) {
                    fArr2 = fArrWrite;
                    this.handleMediaPlayPauseIfPendingOnHandler.addCircle(lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcherIconCompatParcelizer.IconCompatParcelizer, lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcherIconCompatParcelizer.write, f10, Path.Direction.CW);
                    i3 = i6;
                    z = z2;
                    f2 = f7;
                    f3 = fParcelableVolumeInfo;
                    i2 = i5;
                } else {
                    fArr2 = fArrWrite;
                    i2 = i5;
                    i3 = i6;
                    z = z2;
                    double d = f17 * 0.017453292f;
                    f2 = f7;
                    f3 = fParcelableVolumeInfo;
                    this.handleMediaPlayPauseIfPendingOnHandler.moveTo(lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcherIconCompatParcelizer.IconCompatParcelizer + (((float) Math.cos(d)) * f10), lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcherIconCompatParcelizer.write + (((float) Math.sin(d)) * f10));
                    this.handleMediaPlayPauseIfPendingOnHandler.arcTo(rectF2, f17, f18);
                }
                if (z3) {
                    double d2 = f14 * 0.017453292f;
                    float fCos = lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcherIconCompatParcelizer.IconCompatParcelizer + (((float) Math.cos(d2)) * fRatingCompat);
                    float fSin = lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcherIconCompatParcelizer.write + (((float) Math.sin(d2)) * fRatingCompat);
                    i4 = i2;
                    rectF = rectF2;
                    f4 = fMediaBrowserCompatSearchResultReceiver;
                    f5 = 0.0f;
                    fIconCompatParcelizer = IconCompatParcelizer(lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcherIconCompatParcelizer, fRatingCompat, f9 * f2, fCos, fSin, f14, f16);
                } else {
                    rectF = rectF2;
                    f4 = fMediaBrowserCompatSearchResultReceiver;
                    f5 = 0.0f;
                    i4 = i2;
                    fIconCompatParcelizer = 0.0f;
                }
                this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.set(lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcherIconCompatParcelizer.IconCompatParcelizer - f4, lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcherIconCompatParcelizer.write - f4, lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcherIconCompatParcelizer.IconCompatParcelizer + f4, lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcherIconCompatParcelizer.write + f4);
                if (!z) {
                    i = i4;
                    f6 = 360.0f;
                } else if (f4 > f5 || z3) {
                    if (z3) {
                        if (fIconCompatParcelizer < f5) {
                            fIconCompatParcelizer = -fIconCompatParcelizer;
                        }
                        fMax = Math.max(f4, fIconCompatParcelizer);
                    } else {
                        fMax = f4;
                    }
                    float f19 = (i3 == 1 || fMax == f5) ? f5 : fOnPrepare / (fMax * 0.017453292f);
                    float f20 = f19 / 2.0f;
                    float f21 = (f9 - f19) * f2;
                    if (f21 < f5) {
                        f21 = f5;
                    }
                    float f22 = ((f8 + f20) * f2) + f3 + f21;
                    if (f16 >= 360.0f && f16 % 360.0f <= drmSessionAcquired.IconCompatParcelizer) {
                        this.handleMediaPlayPauseIfPendingOnHandler.addCircle(lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcherIconCompatParcelizer.IconCompatParcelizer, lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcherIconCompatParcelizer.write, fMax, Path.Direction.CCW);
                        i = i4;
                    } else {
                        double d3 = 0.017453292f * f22;
                        i = i4;
                        this.handleMediaPlayPauseIfPendingOnHandler.lineTo(lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcherIconCompatParcelizer.IconCompatParcelizer + (((float) Math.cos(d3)) * fMax), lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcherIconCompatParcelizer.write + (fMax * ((float) Math.sin(d3))));
                        this.handleMediaPlayPauseIfPendingOnHandler.arcTo(this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, f22, -f21);
                    }
                    this.handleMediaPlayPauseIfPendingOnHandler.close();
                    this.IconCompatParcelizer.drawPath(this.handleMediaPlayPauseIfPendingOnHandler, this.AudioAttributesImplBaseParcelizer);
                } else {
                    i = i4;
                    f6 = 360.0f;
                }
                if (f16 % f6 > drmSessionAcquired.IconCompatParcelizer) {
                    if (z3) {
                        double d4 = 0.017453292f * (f14 + (f16 / 2.0f));
                        this.handleMediaPlayPauseIfPendingOnHandler.lineTo(lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcherIconCompatParcelizer.IconCompatParcelizer + (((float) Math.cos(d4)) * fIconCompatParcelizer), lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcherIconCompatParcelizer.write + (fIconCompatParcelizer * ((float) Math.sin(d4))));
                    } else {
                        this.handleMediaPlayPauseIfPendingOnHandler.lineTo(lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcherIconCompatParcelizer.IconCompatParcelizer, lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcherIconCompatParcelizer.write);
                    }
                }
                this.handleMediaPlayPauseIfPendingOnHandler.close();
                this.IconCompatParcelizer.drawPath(this.handleMediaPlayPauseIfPendingOnHandler, this.AudioAttributesImplBaseParcelizer);
            }
            i5 = i + 1;
            createandacquiresessionwithretryArr2 = createandacquiresessionwithretryArr;
            fMediaBrowserCompatSearchResultReceiver = f4;
            rectF2 = rectF;
            fIconCompatParcelizer2 = f;
            fArrMediaBrowserCompatCustomActionResultReceiver = fArr;
            fArrWrite = fArr2;
            z2 = z;
            f7 = f2;
            fParcelableVolumeInfo = f3;
        }
        lambdadrmKeysRemoved4comgoogleandroidexoplayer2drmDrmSessionEventListenerEventDispatcher.AudioAttributesCompatParcelizer(lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcherIconCompatParcelizer);
    }

    public final void AudioAttributesImplApi21Parcelizer() {
        Canvas canvas = this.IconCompatParcelizer;
        if (canvas != null) {
            canvas.setBitmap(null);
            this.IconCompatParcelizer = null;
        }
        WeakReference<Bitmap> weakReference = this.MediaMetadataCompat;
        if (weakReference != null) {
            Bitmap bitmap = weakReference.get();
            if (bitmap != null) {
                bitmap.recycle();
            }
            this.MediaMetadataCompat.clear();
            this.MediaMetadataCompat = null;
        }
    }
}
