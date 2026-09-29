package com.github.mikephil.charting.charts;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.RectF;
import android.util.AttributeSet;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.DrmSession;
import kotlin.drmSessionAcquired;
import kotlin.getError;
import kotlin.hasData;
import kotlin.maybeCreateMediaDrmHandler;
import kotlin.maybeRetryRequest;
import kotlin.replaceSession;
import kotlin.restoreKeys;

/* JADX INFO: loaded from: classes2.dex */
public class RadarChart extends PieRadarChartBase<maybeRetryRequest> {
    private int AudioAttributesCompatParcelizer;
    private DrmSession AudioAttributesImplApi21Parcelizer;
    private int AudioAttributesImplApi26Parcelizer;
    private getError AudioAttributesImplBaseParcelizer;
    private boolean IconCompatParcelizer;
    private replaceSession MediaBrowserCompatCustomActionResultReceiver;
    private float MediaBrowserCompatItemReceiver;
    private float RemoteActionCompatParcelizer;
    private int read;
    private int write;

    public RadarChart(Context context) {
        super(context);
        this.MediaBrowserCompatItemReceiver = 2.5f;
        this.RemoteActionCompatParcelizer = 1.5f;
        this.write = Color.rgb(122, 122, 122);
        this.AudioAttributesImplApi26Parcelizer = Color.rgb(122, 122, 122);
        this.read = 150;
        this.IconCompatParcelizer = true;
        this.AudioAttributesCompatParcelizer = 0;
    }

    public RadarChart(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.MediaBrowserCompatItemReceiver = 2.5f;
        this.RemoteActionCompatParcelizer = 1.5f;
        this.write = Color.rgb(122, 122, 122);
        this.AudioAttributesImplApi26Parcelizer = Color.rgb(122, 122, 122);
        this.read = 150;
        this.IconCompatParcelizer = true;
        this.AudioAttributesCompatParcelizer = 0;
    }

    public RadarChart(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.MediaBrowserCompatItemReceiver = 2.5f;
        this.RemoteActionCompatParcelizer = 1.5f;
        this.write = Color.rgb(122, 122, 122);
        this.AudioAttributesImplApi26Parcelizer = Color.rgb(122, 122, 122);
        this.read = 150;
        this.IconCompatParcelizer = true;
        this.AudioAttributesCompatParcelizer = 0;
    }

    @Override // com.github.mikephil.charting.charts.PieRadarChartBase, com.github.mikephil.charting.charts.Chart
    protected final void RemoteActionCompatParcelizer() {
        super.RemoteActionCompatParcelizer();
        this.AudioAttributesImplBaseParcelizer = new getError(getError.write.LEFT);
        this.MediaBrowserCompatItemReceiver = drmSessionAcquired.write(1.5f);
        this.RemoteActionCompatParcelizer = drmSessionAcquired.write(0.75f);
        this.onAddQueueItem = new hasData(this, this.RatingCompat, this.onPause);
        this.MediaBrowserCompatCustomActionResultReceiver = new replaceSession(this.onPause, this.AudioAttributesImplBaseParcelizer, this);
        this.AudioAttributesImplApi21Parcelizer = new DrmSession(this.onPause, this.onMediaButtonEvent, this);
        this.MediaDescriptionCompat = new maybeCreateMediaDrmHandler(this);
    }

    @Override // com.github.mikephil.charting.charts.PieRadarChartBase, com.github.mikephil.charting.charts.Chart
    protected final void read() {
        super.read();
        this.AudioAttributesImplBaseParcelizer.IconCompatParcelizer(((maybeRetryRequest) this.MediaBrowserCompatMediaItem).IconCompatParcelizer(getError.write.LEFT), ((maybeRetryRequest) this.MediaBrowserCompatMediaItem).read(getError.write.LEFT));
        this.onMediaButtonEvent.IconCompatParcelizer(BitmapDescriptorFactory.HUE_RED, ((maybeRetryRequest) this.MediaBrowserCompatMediaItem).AudioAttributesImplBaseParcelizer().onMediaButtonEvent());
    }

    @Override // com.github.mikephil.charting.charts.PieRadarChartBase, com.github.mikephil.charting.charts.Chart
    public final void onPlay() {
        if (this.MediaBrowserCompatMediaItem == 0) {
            return;
        }
        read();
        this.MediaBrowserCompatCustomActionResultReceiver.write(((restoreKeys) this.AudioAttributesImplBaseParcelizer).IconCompatParcelizer, this.AudioAttributesImplBaseParcelizer.AudioAttributesCompatParcelizer, this.AudioAttributesImplBaseParcelizer.onSkipToNext());
        this.AudioAttributesImplApi21Parcelizer.write(((restoreKeys) this.onMediaButtonEvent).IconCompatParcelizer, this.onMediaButtonEvent.AudioAttributesCompatParcelizer, false);
        if (this.onCommand != null && !this.onCommand.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver()) {
            this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.IconCompatParcelizer(this.MediaBrowserCompatMediaItem);
        }
        AudioAttributesImplApi21Parcelizer();
    }

    @Override // com.github.mikephil.charting.charts.Chart, android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.MediaBrowserCompatMediaItem == 0) {
            return;
        }
        if (this.onMediaButtonEvent.onPlayFromSearch()) {
            this.AudioAttributesImplApi21Parcelizer.write(((restoreKeys) this.onMediaButtonEvent).IconCompatParcelizer, this.onMediaButtonEvent.AudioAttributesCompatParcelizer, false);
        }
        this.AudioAttributesImplApi21Parcelizer.write(canvas);
        if (this.IconCompatParcelizer) {
            this.onAddQueueItem.read(canvas);
        }
        if (this.AudioAttributesImplBaseParcelizer.onPlayFromSearch() && this.AudioAttributesImplBaseParcelizer.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver()) {
            this.MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer(canvas);
        }
        this.onAddQueueItem.IconCompatParcelizer(canvas);
        if (PlaybackStateCompat()) {
            this.onAddQueueItem.RemoteActionCompatParcelizer(canvas, this.MediaBrowserCompatSearchResultReceiver);
        }
        if (this.AudioAttributesImplBaseParcelizer.onPlayFromSearch() && !this.AudioAttributesImplBaseParcelizer.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver()) {
            this.MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer(canvas);
        }
        this.MediaBrowserCompatCustomActionResultReceiver.write(canvas);
        this.onAddQueueItem.write(canvas);
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.IconCompatParcelizer(canvas);
        IconCompatParcelizer(canvas);
        read(canvas);
    }

    public final float write() {
        RectF rectFMediaBrowserCompatSearchResultReceiver = this.onPause.MediaBrowserCompatSearchResultReceiver();
        return Math.min(rectFMediaBrowserCompatSearchResultReceiver.width() / 2.0f, rectFMediaBrowserCompatSearchResultReceiver.height() / 2.0f) / this.AudioAttributesImplBaseParcelizer.RemoteActionCompatParcelizer;
    }

    public final float AudioAttributesCompatParcelizer() {
        return 360.0f / ((maybeRetryRequest) this.MediaBrowserCompatMediaItem).AudioAttributesImplBaseParcelizer().onMediaButtonEvent();
    }

    @Override // com.github.mikephil.charting.charts.PieRadarChartBase
    public final int RemoteActionCompatParcelizer(float f) {
        float fIconCompatParcelizer = drmSessionAcquired.IconCompatParcelizer(f - ParcelableVolumeInfo());
        float fAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer();
        int iOnMediaButtonEvent = ((maybeRetryRequest) this.MediaBrowserCompatMediaItem).AudioAttributesImplBaseParcelizer().onMediaButtonEvent();
        int i = 0;
        while (i < iOnMediaButtonEvent) {
            int i2 = i + 1;
            if ((i2 * fAudioAttributesCompatParcelizer) - (fAudioAttributesCompatParcelizer / 2.0f) > fIconCompatParcelizer) {
                return i;
            }
            i = i2;
        }
        return 0;
    }

    public final getError handleMediaPlayPauseIfPendingOnHandler() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    public void setWebLineWidth(float f) {
        this.MediaBrowserCompatItemReceiver = drmSessionAcquired.write(f);
    }

    public final float MediaBrowserCompatItemReceiver() {
        return this.MediaBrowserCompatItemReceiver;
    }

    public void setWebLineWidthInner(float f) {
        this.RemoteActionCompatParcelizer = drmSessionAcquired.write(f);
    }

    public final float MediaBrowserCompatSearchResultReceiver() {
        return this.RemoteActionCompatParcelizer;
    }

    public void setWebAlpha(int i) {
        this.read = i;
    }

    public final int AudioAttributesImplApi26Parcelizer() {
        return this.read;
    }

    public void setWebColor(int i) {
        this.write = i;
    }

    public final int AudioAttributesImplBaseParcelizer() {
        return this.write;
    }

    public void setWebColorInner(int i) {
        this.AudioAttributesImplApi26Parcelizer = i;
    }

    public final int MediaBrowserCompatCustomActionResultReceiver() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    public void setDrawWeb(boolean z) {
        this.IconCompatParcelizer = z;
    }

    public void setSkipWebLineCount(int i) {
        this.AudioAttributesCompatParcelizer = Math.max(0, i);
    }

    public final int IconCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    @Override // com.github.mikephil.charting.charts.PieRadarChartBase
    protected final float MediaMetadataCompat() {
        return this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.AudioAttributesCompatParcelizer().getTextSize() * 4.0f;
    }

    @Override // com.github.mikephil.charting.charts.PieRadarChartBase
    protected final float MediaDescriptionCompat() {
        return (this.onMediaButtonEvent.onPlayFromSearch() && this.onMediaButtonEvent.onCommand()) ? this.onMediaButtonEvent.MediaBrowserCompatSearchResultReceiver : drmSessionAcquired.write(10.0f);
    }

    @Override // com.github.mikephil.charting.charts.PieRadarChartBase
    public final float RatingCompat() {
        RectF rectFMediaBrowserCompatSearchResultReceiver = this.onPause.MediaBrowserCompatSearchResultReceiver();
        return Math.min(rectFMediaBrowserCompatSearchResultReceiver.width() / 2.0f, rectFMediaBrowserCompatSearchResultReceiver.height() / 2.0f);
    }

    @Override // com.github.mikephil.charting.charts.PieRadarChartBase
    public final float MediaSessionCompatToken() {
        return ((restoreKeys) this.AudioAttributesImplBaseParcelizer).IconCompatParcelizer;
    }

    public final float onCustomAction() {
        return this.AudioAttributesImplBaseParcelizer.RemoteActionCompatParcelizer;
    }
}
