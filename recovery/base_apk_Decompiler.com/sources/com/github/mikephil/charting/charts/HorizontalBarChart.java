package com.github.mikephil.charting.charts;

import android.content.Context;
import android.graphics.RectF;
import android.util.AttributeSet;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.DrmSessionDrmSessionException;
import kotlin.DrmSessionState;
import kotlin.containsSchemeDataWithUuid;
import kotlin.createAndAcquireSession;
import kotlin.createAndAcquireSessionWithRetry;
import kotlin.drmKeysRestored;
import kotlin.drmSessionAcquired;
import kotlin.getError;
import kotlin.hasSessionId;
import kotlin.lambdadrmKeysLoaded1comgoogleandroidexoplayer2drmDrmSessionEventListenerEventDispatcher;
import kotlin.restoreKeys;

/* JADX INFO: loaded from: classes4.dex */
public class HorizontalBarChart extends BarChart {
    private RectF onFastForward;
    private float[] onPlay;

    public HorizontalBarChart(Context context) {
        super(context);
        this.onFastForward = new RectF();
        this.onPlay = new float[2];
    }

    public HorizontalBarChart(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.onFastForward = new RectF();
        this.onPlay = new float[2];
    }

    public HorizontalBarChart(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.onFastForward = new RectF();
        this.onPlay = new float[2];
    }

    @Override // com.github.mikephil.charting.charts.BarChart, com.github.mikephil.charting.charts.BarLineChartBase, com.github.mikephil.charting.charts.Chart
    protected final void RemoteActionCompatParcelizer() {
        this.onPause = new drmKeysRestored();
        super.RemoteActionCompatParcelizer();
        ((BarLineChartBase) this).read = new lambdadrmKeysLoaded1comgoogleandroidexoplayer2drmDrmSessionEventListenerEventDispatcher(this.onPause);
        ((BarLineChartBase) this).AudioAttributesImplApi21Parcelizer = new lambdadrmKeysLoaded1comgoogleandroidexoplayer2drmDrmSessionEventListenerEventDispatcher(this.onPause);
        this.onAddQueueItem = new containsSchemeDataWithUuid(this, this.RatingCompat, this.onPause);
        setHighlighter(new createAndAcquireSession(this));
        ((BarLineChartBase) this).write = new DrmSessionDrmSessionException(this.onPause, ((BarLineChartBase) this).RemoteActionCompatParcelizer, ((BarLineChartBase) this).read);
        ((BarLineChartBase) this).IconCompatParcelizer = new DrmSessionDrmSessionException(this.onPause, ((BarLineChartBase) this).AudioAttributesCompatParcelizer, ((BarLineChartBase) this).AudioAttributesImplApi21Parcelizer);
        ((BarLineChartBase) this).AudioAttributesImplBaseParcelizer = new DrmSessionState(this.onPause, this.onMediaButtonEvent, ((BarLineChartBase) this).read, this);
    }

    @Override // com.github.mikephil.charting.charts.BarLineChartBase, com.github.mikephil.charting.charts.Chart
    public final void AudioAttributesImplApi21Parcelizer() {
        read(this.onFastForward);
        float f = this.onFastForward.left + BitmapDescriptorFactory.HUE_RED;
        float fAudioAttributesCompatParcelizer = this.onFastForward.top + BitmapDescriptorFactory.HUE_RED;
        float f2 = this.onFastForward.right + BitmapDescriptorFactory.HUE_RED;
        float fAudioAttributesCompatParcelizer2 = this.onFastForward.bottom + BitmapDescriptorFactory.HUE_RED;
        if (((BarLineChartBase) this).RemoteActionCompatParcelizer.onSkipToPrevious()) {
            fAudioAttributesCompatParcelizer += ((BarLineChartBase) this).RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(((BarLineChartBase) this).write.IconCompatParcelizer());
        }
        if (((BarLineChartBase) this).AudioAttributesCompatParcelizer.onSkipToPrevious()) {
            fAudioAttributesCompatParcelizer2 += ((BarLineChartBase) this).AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(((BarLineChartBase) this).IconCompatParcelizer.IconCompatParcelizer());
        }
        float f3 = this.onMediaButtonEvent.MediaBrowserCompatSearchResultReceiver;
        if (this.onMediaButtonEvent.onPlayFromSearch()) {
            if (this.onMediaButtonEvent.onRewind() == hasSessionId.AudioAttributesCompatParcelizer.BOTTOM) {
                f += f3;
            } else if (this.onMediaButtonEvent.onRewind() == hasSessionId.AudioAttributesCompatParcelizer.TOP) {
                f2 += f3;
            } else if (this.onMediaButtonEvent.onRewind() == hasSessionId.AudioAttributesCompatParcelizer.BOTH_SIDED) {
                f += f3;
                f2 += f3;
            }
        }
        float fOnSetPlaybackSpeed = fAudioAttributesCompatParcelizer + onSetPlaybackSpeed();
        float fOnSetCaptioningEnabled = f2 + onSetCaptioningEnabled();
        float fOnRemoveQueueItem = fAudioAttributesCompatParcelizer2 + onRemoveQueueItem();
        float fOnRewind = f + onRewind();
        float fWrite = drmSessionAcquired.write(((BarLineChartBase) this).MediaBrowserCompatCustomActionResultReceiver);
        this.onPause.RemoteActionCompatParcelizer(Math.max(fWrite, fOnRewind), Math.max(fWrite, fOnSetPlaybackSpeed), Math.max(fWrite, fOnSetCaptioningEnabled), Math.max(fWrite, fOnRemoveQueueItem));
        if (this.handleMediaPlayPauseIfPendingOnHandler) {
            this.onPause.MediaBrowserCompatSearchResultReceiver().toString();
        }
        onPlayFromMediaId();
        onMediaButtonEvent();
    }

    @Override // com.github.mikephil.charting.charts.BarLineChartBase
    protected final void onMediaButtonEvent() {
        ((BarLineChartBase) this).AudioAttributesImplApi21Parcelizer.AudioAttributesCompatParcelizer(((restoreKeys) ((BarLineChartBase) this).AudioAttributesCompatParcelizer).IconCompatParcelizer, ((BarLineChartBase) this).AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer, this.onMediaButtonEvent.RemoteActionCompatParcelizer, ((restoreKeys) this.onMediaButtonEvent).IconCompatParcelizer);
        ((BarLineChartBase) this).read.AudioAttributesCompatParcelizer(((restoreKeys) ((BarLineChartBase) this).RemoteActionCompatParcelizer).IconCompatParcelizer, ((BarLineChartBase) this).RemoteActionCompatParcelizer.RemoteActionCompatParcelizer, this.onMediaButtonEvent.RemoteActionCompatParcelizer, ((restoreKeys) this.onMediaButtonEvent).IconCompatParcelizer);
    }

    @Override // com.github.mikephil.charting.charts.Chart
    protected final float[] read(createAndAcquireSessionWithRetry createandacquiresessionwithretry) {
        return new float[]{createandacquiresessionwithretry.IconCompatParcelizer(), createandacquiresessionwithretry.read()};
    }

    @Override // com.github.mikephil.charting.charts.BarChart, com.github.mikephil.charting.charts.Chart
    public final createAndAcquireSessionWithRetry AudioAttributesCompatParcelizer(float f, float f2) {
        if (this.MediaBrowserCompatMediaItem == 0) {
            boolean z = this.handleMediaPlayPauseIfPendingOnHandler;
            return null;
        }
        return onSetRating().RemoteActionCompatParcelizer(f2, f);
    }

    @Override // com.github.mikephil.charting.charts.BarLineChartBase, kotlin.maybeAcquirePlaceholderSession
    public final float MediaBrowserCompatCustomActionResultReceiver() {
        write(getError.write.LEFT).read(this.onPause.AudioAttributesImplBaseParcelizer(), this.onPause.read(), ((BarLineChartBase) this).AudioAttributesImplApi26Parcelizer);
        return (float) Math.max(((restoreKeys) this.onMediaButtonEvent).IconCompatParcelizer, ((BarLineChartBase) this).AudioAttributesImplApi26Parcelizer.AudioAttributesCompatParcelizer);
    }

    @Override // com.github.mikephil.charting.charts.BarLineChartBase, kotlin.maybeAcquirePlaceholderSession
    public final float AudioAttributesImplApi26Parcelizer() {
        write(getError.write.LEFT).read(this.onPause.AudioAttributesImplBaseParcelizer(), this.onPause.AudioAttributesImplApi21Parcelizer(), ((BarLineChartBase) this).MediaBrowserCompatItemReceiver);
        return (float) Math.min(this.onMediaButtonEvent.AudioAttributesCompatParcelizer, ((BarLineChartBase) this).MediaBrowserCompatItemReceiver.AudioAttributesCompatParcelizer);
    }

    @Override // com.github.mikephil.charting.charts.BarLineChartBase
    public void setVisibleXRangeMaximum(float f) {
        this.onPause.MediaBrowserCompatSearchResultReceiver(this.onMediaButtonEvent.RemoteActionCompatParcelizer / f);
    }

    @Override // com.github.mikephil.charting.charts.BarLineChartBase
    public void setVisibleXRangeMinimum(float f) {
        this.onPause.MediaBrowserCompatItemReceiver(this.onMediaButtonEvent.RemoteActionCompatParcelizer / f);
    }

    @Override // com.github.mikephil.charting.charts.BarLineChartBase
    public void setVisibleXRange(float f, float f2) {
        this.onPause.RemoteActionCompatParcelizer(this.onMediaButtonEvent.RemoteActionCompatParcelizer / f, this.onMediaButtonEvent.RemoteActionCompatParcelizer / f2);
    }

    @Override // com.github.mikephil.charting.charts.BarLineChartBase
    public void setVisibleYRangeMaximum(float f, getError.write writeVar) {
        this.onPause.MediaDescriptionCompat(IconCompatParcelizer(writeVar) / f);
    }

    @Override // com.github.mikephil.charting.charts.BarLineChartBase
    public void setVisibleYRangeMinimum(float f, getError.write writeVar) {
        this.onPause.AudioAttributesImplApi26Parcelizer(IconCompatParcelizer(writeVar) / f);
    }

    @Override // com.github.mikephil.charting.charts.BarLineChartBase
    public void setVisibleYRange(float f, float f2, getError.write writeVar) {
        this.onPause.read(IconCompatParcelizer(writeVar) / f, IconCompatParcelizer(writeVar) / f2);
    }
}
