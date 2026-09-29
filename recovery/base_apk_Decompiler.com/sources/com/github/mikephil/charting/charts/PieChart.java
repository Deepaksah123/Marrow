package com.github.mikephil.charting.charts;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.util.AttributeSet;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.List;
import kotlin.canAcquireSession;
import kotlin.canReplace;
import kotlin.createAndAcquireSessionWithRetry;
import kotlin.drmSessionAcquired;
import kotlin.hasSessionId;
import kotlin.lambdadrmKeysRemoved4comgoogleandroidexoplayer2drmDrmSessionEventListenerEventDispatcher;
import kotlin.provisionRequired;
import kotlin.setSessionKeepaliveMs;

/* JADX INFO: loaded from: classes.dex */
public class PieChart extends PieRadarChartBase<provisionRequired> {
    private float AudioAttributesCompatParcelizer;
    private boolean AudioAttributesImplApi21Parcelizer;
    private boolean AudioAttributesImplApi26Parcelizer;
    private float[] AudioAttributesImplBaseParcelizer;
    private RectF IconCompatParcelizer;
    private boolean MediaBrowserCompatCustomActionResultReceiver;
    private boolean MediaBrowserCompatItemReceiver;
    private float[] RemoteActionCompatParcelizer;
    private boolean onFastForward;
    private float onPlay;
    private float onPlayFromSearch;
    private boolean onPlayFromUri;
    private float onPrepareFromMediaId;
    private float onPrepareFromSearch;
    private lambdadrmKeysRemoved4comgoogleandroidexoplayer2drmDrmSessionEventListenerEventDispatcher read;
    private CharSequence write;

    @Override // com.github.mikephil.charting.charts.PieRadarChartBase
    protected final float MediaDescriptionCompat() {
        return BitmapDescriptorFactory.HUE_RED;
    }

    public PieChart(Context context) {
        super(context);
        this.IconCompatParcelizer = new RectF();
        this.MediaBrowserCompatCustomActionResultReceiver = true;
        this.AudioAttributesImplBaseParcelizer = new float[1];
        this.RemoteActionCompatParcelizer = new float[1];
        this.AudioAttributesImplApi21Parcelizer = true;
        this.onFastForward = false;
        this.onPlayFromUri = false;
        this.MediaBrowserCompatItemReceiver = false;
        this.write = "";
        this.read = lambdadrmKeysRemoved4comgoogleandroidexoplayer2drmDrmSessionEventListenerEventDispatcher.read(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
        this.onPlay = 50.0f;
        this.onPlayFromSearch = 55.0f;
        this.AudioAttributesImplApi26Parcelizer = true;
        this.AudioAttributesCompatParcelizer = 100.0f;
        this.onPrepareFromMediaId = 360.0f;
        this.onPrepareFromSearch = BitmapDescriptorFactory.HUE_RED;
    }

    public PieChart(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.IconCompatParcelizer = new RectF();
        this.MediaBrowserCompatCustomActionResultReceiver = true;
        this.AudioAttributesImplBaseParcelizer = new float[1];
        this.RemoteActionCompatParcelizer = new float[1];
        this.AudioAttributesImplApi21Parcelizer = true;
        this.onFastForward = false;
        this.onPlayFromUri = false;
        this.MediaBrowserCompatItemReceiver = false;
        this.write = "";
        this.read = lambdadrmKeysRemoved4comgoogleandroidexoplayer2drmDrmSessionEventListenerEventDispatcher.read(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
        this.onPlay = 50.0f;
        this.onPlayFromSearch = 55.0f;
        this.AudioAttributesImplApi26Parcelizer = true;
        this.AudioAttributesCompatParcelizer = 100.0f;
        this.onPrepareFromMediaId = 360.0f;
        this.onPrepareFromSearch = BitmapDescriptorFactory.HUE_RED;
    }

    public PieChart(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.IconCompatParcelizer = new RectF();
        this.MediaBrowserCompatCustomActionResultReceiver = true;
        this.AudioAttributesImplBaseParcelizer = new float[1];
        this.RemoteActionCompatParcelizer = new float[1];
        this.AudioAttributesImplApi21Parcelizer = true;
        this.onFastForward = false;
        this.onPlayFromUri = false;
        this.MediaBrowserCompatItemReceiver = false;
        this.write = "";
        this.read = lambdadrmKeysRemoved4comgoogleandroidexoplayer2drmDrmSessionEventListenerEventDispatcher.read(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
        this.onPlay = 50.0f;
        this.onPlayFromSearch = 55.0f;
        this.AudioAttributesImplApi26Parcelizer = true;
        this.AudioAttributesCompatParcelizer = 100.0f;
        this.onPrepareFromMediaId = 360.0f;
        this.onPrepareFromSearch = BitmapDescriptorFactory.HUE_RED;
    }

    @Override // com.github.mikephil.charting.charts.PieRadarChartBase, com.github.mikephil.charting.charts.Chart
    protected final void RemoteActionCompatParcelizer() {
        super.RemoteActionCompatParcelizer();
        this.onAddQueueItem = new canReplace(this, this.RatingCompat, this.onPause);
        this.onMediaButtonEvent = null;
        this.MediaDescriptionCompat = new canAcquireSession(this);
    }

    @Override // com.github.mikephil.charting.charts.Chart, android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.MediaBrowserCompatMediaItem == 0) {
            return;
        }
        this.onAddQueueItem.IconCompatParcelizer(canvas);
        if (PlaybackStateCompat()) {
            this.onAddQueueItem.RemoteActionCompatParcelizer(canvas, this.MediaBrowserCompatSearchResultReceiver);
        }
        this.onAddQueueItem.read(canvas);
        this.onAddQueueItem.write(canvas);
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.IconCompatParcelizer(canvas);
        IconCompatParcelizer(canvas);
        read(canvas);
    }

    @Override // com.github.mikephil.charting.charts.PieRadarChartBase, com.github.mikephil.charting.charts.Chart
    public final void AudioAttributesImplApi21Parcelizer() {
        super.AudioAttributesImplApi21Parcelizer();
        if (this.MediaBrowserCompatMediaItem == 0) {
            return;
        }
        float fOnPlayFromMediaId = onPlayFromMediaId() / 2.0f;
        lambdadrmKeysRemoved4comgoogleandroidexoplayer2drmDrmSessionEventListenerEventDispatcher lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcherOnPrepareFromMediaId = onPrepareFromMediaId();
        float fAudioAttributesCompatParcelizer = ((provisionRequired) this.MediaBrowserCompatMediaItem).AudioAttributesCompatParcelizer().AudioAttributesCompatParcelizer();
        this.IconCompatParcelizer.set((lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcherOnPrepareFromMediaId.IconCompatParcelizer - fOnPlayFromMediaId) + fAudioAttributesCompatParcelizer, (lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcherOnPrepareFromMediaId.write - fOnPlayFromMediaId) + fAudioAttributesCompatParcelizer, (lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcherOnPrepareFromMediaId.IconCompatParcelizer + fOnPlayFromMediaId) - fAudioAttributesCompatParcelizer, (lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcherOnPrepareFromMediaId.write + fOnPlayFromMediaId) - fAudioAttributesCompatParcelizer);
        lambdadrmKeysRemoved4comgoogleandroidexoplayer2drmDrmSessionEventListenerEventDispatcher.AudioAttributesCompatParcelizer(lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcherOnPrepareFromMediaId);
    }

    @Override // com.github.mikephil.charting.charts.PieRadarChartBase, com.github.mikephil.charting.charts.Chart
    protected final void read() {
        r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw();
    }

    @Override // com.github.mikephil.charting.charts.Chart
    protected final float[] read(createAndAcquireSessionWithRetry createandacquiresessionwithretry) {
        lambdadrmKeysRemoved4comgoogleandroidexoplayer2drmDrmSessionEventListenerEventDispatcher lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcherIconCompatParcelizer = IconCompatParcelizer();
        float fRatingCompat = RatingCompat();
        float fMediaBrowserCompatSearchResultReceiver = (fRatingCompat / 10.0f) * 3.6f;
        if (MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver()) {
            fMediaBrowserCompatSearchResultReceiver = (fRatingCompat - ((fRatingCompat / 100.0f) * MediaBrowserCompatSearchResultReceiver())) / 2.0f;
        }
        float fParcelableVolumeInfo = ParcelableVolumeInfo();
        float f = this.AudioAttributesImplBaseParcelizer[(int) createandacquiresessionwithretry.MediaBrowserCompatCustomActionResultReceiver()] / 2.0f;
        double d = fRatingCompat - fMediaBrowserCompatSearchResultReceiver;
        float fCos = (float) ((Math.cos(Math.toRadians(((this.RemoteActionCompatParcelizer[r11] + fParcelableVolumeInfo) - f) * this.RatingCompat.read())) * d) + ((double) lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcherIconCompatParcelizer.IconCompatParcelizer));
        float fSin = (float) ((d * Math.sin(Math.toRadians(((fParcelableVolumeInfo + this.RemoteActionCompatParcelizer[r11]) - f) * this.RatingCompat.read()))) + ((double) lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcherIconCompatParcelizer.write));
        lambdadrmKeysRemoved4comgoogleandroidexoplayer2drmDrmSessionEventListenerEventDispatcher.AudioAttributesCompatParcelizer(lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcherIconCompatParcelizer);
        return new float[]{fCos, fSin};
    }

    private void r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw() {
        int iWrite = ((provisionRequired) this.MediaBrowserCompatMediaItem).write();
        if (this.AudioAttributesImplBaseParcelizer.length != iWrite) {
            this.AudioAttributesImplBaseParcelizer = new float[iWrite];
        } else {
            for (int i = 0; i < iWrite; i++) {
                this.AudioAttributesImplBaseParcelizer[i] = 0.0f;
            }
        }
        if (this.RemoteActionCompatParcelizer.length != iWrite) {
            this.RemoteActionCompatParcelizer = new float[iWrite];
        } else {
            for (int i2 = 0; i2 < iWrite; i2++) {
                this.RemoteActionCompatParcelizer[i2] = 0.0f;
            }
        }
        float fMediaBrowserCompatMediaItem = ((provisionRequired) this.MediaBrowserCompatMediaItem).MediaBrowserCompatMediaItem();
        List<setSessionKeepaliveMs> listIconCompatParcelizer = ((provisionRequired) this.MediaBrowserCompatMediaItem).IconCompatParcelizer();
        float f = this.onPrepareFromSearch;
        boolean z = f != BitmapDescriptorFactory.HUE_RED && ((float) iWrite) * f <= this.onPrepareFromMediaId;
        float[] fArr = new float[iWrite];
        float f2 = 0.0f;
        float f3 = 0.0f;
        int i3 = 0;
        for (int i4 = 0; i4 < ((provisionRequired) this.MediaBrowserCompatMediaItem).read(); i4++) {
            setSessionKeepaliveMs setsessionkeepalivems = listIconCompatParcelizer.get(i4);
            for (int i5 = 0; i5 < setsessionkeepalivems.onMediaButtonEvent(); i5++) {
                float f4 = read(Math.abs(setsessionkeepalivems.IconCompatParcelizer(i5).read()), fMediaBrowserCompatMediaItem);
                if (z) {
                    float f5 = this.onPrepareFromSearch;
                    float f6 = f4 - f5;
                    if (f6 <= BitmapDescriptorFactory.HUE_RED) {
                        fArr[i3] = f5;
                        f3 -= f6;
                    } else {
                        fArr[i3] = f4;
                        f2 += f6;
                    }
                }
                this.AudioAttributesImplBaseParcelizer[i3] = f4;
                if (i3 == 0) {
                    this.RemoteActionCompatParcelizer[i3] = f4;
                } else {
                    float[] fArr2 = this.RemoteActionCompatParcelizer;
                    fArr2[i3] = fArr2[i3 - 1] + f4;
                }
                i3++;
            }
        }
        if (z) {
            for (int i6 = 0; i6 < iWrite; i6++) {
                float f7 = fArr[i6];
                float f8 = f7 - (((f7 - this.onPrepareFromSearch) / f2) * f3);
                fArr[i6] = f8;
                if (i6 == 0) {
                    this.RemoteActionCompatParcelizer[0] = fArr[0];
                } else {
                    float[] fArr3 = this.RemoteActionCompatParcelizer;
                    fArr3[i6] = fArr3[i6 - 1] + f8;
                }
            }
            this.AudioAttributesImplBaseParcelizer = fArr;
        }
    }

    public final boolean RemoteActionCompatParcelizer(int i) {
        if (!PlaybackStateCompat()) {
            return false;
        }
        for (int i2 = 0; i2 < this.MediaBrowserCompatSearchResultReceiver.length; i2++) {
            if (((int) this.MediaBrowserCompatSearchResultReceiver[i2].MediaBrowserCompatCustomActionResultReceiver()) == i) {
                return true;
            }
        }
        return false;
    }

    private float read(float f, float f2) {
        return (f / f2) * this.onPrepareFromMediaId;
    }

    @Override // com.github.mikephil.charting.charts.Chart
    @Deprecated
    public final hasSessionId setSessionImpl() {
        throw new RuntimeException("PieChart has no XAxis");
    }

    @Override // com.github.mikephil.charting.charts.PieRadarChartBase
    public final int RemoteActionCompatParcelizer(float f) {
        float fIconCompatParcelizer = drmSessionAcquired.IconCompatParcelizer(f - ParcelableVolumeInfo());
        int i = 0;
        while (true) {
            float[] fArr = this.RemoteActionCompatParcelizer;
            if (i >= fArr.length) {
                return -1;
            }
            if (fArr[i] > fIconCompatParcelizer) {
                return i;
            }
            i++;
        }
    }

    public final float[] MediaBrowserCompatCustomActionResultReceiver() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    public final float[] write() {
        return this.RemoteActionCompatParcelizer;
    }

    public void setHoleColor(int i) {
        ((canReplace) this.onAddQueueItem).write().setColor(i);
    }

    public void setDrawSlicesUnderHole(boolean z) {
        this.onFastForward = z;
    }

    public final boolean onPause() {
        return this.onFastForward;
    }

    public void setDrawHoleEnabled(boolean z) {
        this.AudioAttributesImplApi21Parcelizer = z;
    }

    public final boolean MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    public void setCenterText(CharSequence charSequence) {
        if (charSequence == null) {
            this.write = "";
        } else {
            this.write = charSequence;
        }
    }

    public final CharSequence AudioAttributesCompatParcelizer() {
        return this.write;
    }

    public void setDrawCenterText(boolean z) {
        this.AudioAttributesImplApi26Parcelizer = z;
    }

    public final boolean handleMediaPlayPauseIfPendingOnHandler() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    @Override // com.github.mikephil.charting.charts.PieRadarChartBase
    protected final float MediaMetadataCompat() {
        return this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.AudioAttributesCompatParcelizer().getTextSize() * 2.0f;
    }

    @Override // com.github.mikephil.charting.charts.PieRadarChartBase
    public final float RatingCompat() {
        RectF rectF = this.IconCompatParcelizer;
        return rectF == null ? BitmapDescriptorFactory.HUE_RED : Math.min(rectF.width() / 2.0f, this.IconCompatParcelizer.height() / 2.0f);
    }

    public final RectF MediaBrowserCompatItemReceiver() {
        return this.IconCompatParcelizer;
    }

    public final lambdadrmKeysRemoved4comgoogleandroidexoplayer2drmDrmSessionEventListenerEventDispatcher IconCompatParcelizer() {
        return lambdadrmKeysRemoved4comgoogleandroidexoplayer2drmDrmSessionEventListenerEventDispatcher.read(this.IconCompatParcelizer.centerX(), this.IconCompatParcelizer.centerY());
    }

    public void setCenterTextTypeface(Typeface typeface) {
        ((canReplace) this.onAddQueueItem).AudioAttributesCompatParcelizer().setTypeface(typeface);
    }

    public void setCenterTextSize(float f) {
        ((canReplace) this.onAddQueueItem).AudioAttributesCompatParcelizer().setTextSize(drmSessionAcquired.write(f));
    }

    public void setCenterTextSizePixels(float f) {
        ((canReplace) this.onAddQueueItem).AudioAttributesCompatParcelizer().setTextSize(f);
    }

    public void setCenterTextOffset(float f, float f2) {
        this.read.IconCompatParcelizer = drmSessionAcquired.write(f);
        this.read.write = drmSessionAcquired.write(f2);
    }

    public final lambdadrmKeysRemoved4comgoogleandroidexoplayer2drmDrmSessionEventListenerEventDispatcher AudioAttributesImplApi26Parcelizer() {
        return lambdadrmKeysRemoved4comgoogleandroidexoplayer2drmDrmSessionEventListenerEventDispatcher.read(this.read.IconCompatParcelizer, this.read.write);
    }

    public void setCenterTextColor(int i) {
        ((canReplace) this.onAddQueueItem).AudioAttributesCompatParcelizer().setColor(i);
    }

    public void setHoleRadius(float f) {
        this.onPlay = f;
    }

    public final float MediaBrowserCompatSearchResultReceiver() {
        return this.onPlay;
    }

    public void setTransparentCircleColor(int i) {
        Paint paintIconCompatParcelizer = ((canReplace) this.onAddQueueItem).IconCompatParcelizer();
        int alpha = paintIconCompatParcelizer.getAlpha();
        paintIconCompatParcelizer.setColor(i);
        paintIconCompatParcelizer.setAlpha(alpha);
    }

    public void setTransparentCircleRadius(float f) {
        this.onPlayFromSearch = f;
    }

    public final float onCustomAction() {
        return this.onPlayFromSearch;
    }

    public void setTransparentCircleAlpha(int i) {
        ((canReplace) this.onAddQueueItem).IconCompatParcelizer().setAlpha(i);
    }

    @Deprecated
    public void setDrawSliceText(boolean z) {
        this.MediaBrowserCompatCustomActionResultReceiver = z;
    }

    public void setDrawEntryLabels(boolean z) {
        this.MediaBrowserCompatCustomActionResultReceiver = z;
    }

    public final boolean onCommand() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    public void setEntryLabelColor(int i) {
        ((canReplace) this.onAddQueueItem).read().setColor(i);
    }

    public void setEntryLabelTypeface(Typeface typeface) {
        ((canReplace) this.onAddQueueItem).read().setTypeface(typeface);
    }

    public void setEntryLabelTextSize(float f) {
        ((canReplace) this.onAddQueueItem).read().setTextSize(drmSessionAcquired.write(f));
    }

    public void setDrawRoundedSlices(boolean z) {
        this.MediaBrowserCompatItemReceiver = z;
    }

    public final boolean onAddQueueItem() {
        return this.MediaBrowserCompatItemReceiver;
    }

    public void setUsePercentValues(boolean z) {
        this.onPlayFromUri = z;
    }

    public final boolean onMediaButtonEvent() {
        return this.onPlayFromUri;
    }

    public void setCenterTextRadiusPercent(float f) {
        this.AudioAttributesCompatParcelizer = f;
    }

    public final float AudioAttributesImplBaseParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public void setMaxAngle(float f) {
        if (f > 360.0f) {
            f = 360.0f;
        }
        if (f < 90.0f) {
            f = 90.0f;
        }
        this.onPrepareFromMediaId = f;
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0009 A[PHI: r0
      0x0009: PHI (r0v3 float) = (r0v1 float), (r0v2 float) binds: [B:3:0x0007, B:6:0x000e] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setMinAngleForSlices(float r3) {
        /*
            r2 = this;
            float r0 = r2.onPrepareFromMediaId
            r1 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 / r1
            int r1 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r1 <= 0) goto Lb
        L9:
            r3 = r0
            goto L11
        Lb:
            r0 = 0
            int r1 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r1 >= 0) goto L11
            goto L9
        L11:
            r2.onPrepareFromSearch = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.mikephil.charting.charts.PieChart.setMinAngleForSlices(float):void");
    }

    @Override // com.github.mikephil.charting.charts.Chart, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        if (this.onAddQueueItem != null && (this.onAddQueueItem instanceof canReplace)) {
            ((canReplace) this.onAddQueueItem).AudioAttributesImplApi21Parcelizer();
        }
        super.onDetachedFromWindow();
    }
}
