package com.github.mikephil.charting.charts;

import android.content.Context;
import android.util.AttributeSet;
import kotlin.DefaultDrmSessionManagerPreacquiredSessionReferenceExternalSyntheticLambda1;
import kotlin.DefaultDrmSessionRequestTask;
import kotlin.createAndAcquireSessionWithRetry;
import kotlin.getCryptoConfig;
import kotlin.getError;
import kotlin.releaseAllKeepaliveSessions;

/* JADX INFO: loaded from: classes4.dex */
public class BarChart extends BarLineChartBase<getCryptoConfig> implements releaseAllKeepaliveSessions {
    private boolean onFastForward;
    private boolean onPlay;
    private boolean onPlayFromSearch;
    private boolean onPrepareFromSearch;

    public BarChart(Context context) {
        super(context);
        this.onPrepareFromSearch = false;
        this.onPlay = true;
        this.onFastForward = false;
        this.onPlayFromSearch = false;
    }

    public BarChart(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.onPrepareFromSearch = false;
        this.onPlay = true;
        this.onFastForward = false;
        this.onPlayFromSearch = false;
    }

    public BarChart(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.onPrepareFromSearch = false;
        this.onPlay = true;
        this.onFastForward = false;
        this.onPlayFromSearch = false;
    }

    @Override // com.github.mikephil.charting.charts.BarLineChartBase, com.github.mikephil.charting.charts.Chart
    protected void RemoteActionCompatParcelizer() {
        super.RemoteActionCompatParcelizer();
        this.onAddQueueItem = new DefaultDrmSessionManagerPreacquiredSessionReferenceExternalSyntheticLambda1(this, this.RatingCompat, this.onPause);
        setHighlighter(new DefaultDrmSessionRequestTask(this));
        setSessionImpl().onMediaButtonEvent();
        setSessionImpl().onPlay();
    }

    @Override // com.github.mikephil.charting.charts.BarLineChartBase, com.github.mikephil.charting.charts.Chart
    protected final void read() {
        if (this.onPlayFromSearch) {
            this.onMediaButtonEvent.IconCompatParcelizer(((getCryptoConfig) this.MediaBrowserCompatMediaItem).MediaBrowserCompatCustomActionResultReceiver() - (((getCryptoConfig) this.MediaBrowserCompatMediaItem).AudioAttributesCompatParcelizer() / 2.0f), ((getCryptoConfig) this.MediaBrowserCompatMediaItem).AudioAttributesImplApi21Parcelizer() + (((getCryptoConfig) this.MediaBrowserCompatMediaItem).AudioAttributesCompatParcelizer() / 2.0f));
        } else {
            this.onMediaButtonEvent.IconCompatParcelizer(((getCryptoConfig) this.MediaBrowserCompatMediaItem).MediaBrowserCompatCustomActionResultReceiver(), ((getCryptoConfig) this.MediaBrowserCompatMediaItem).AudioAttributesImplApi21Parcelizer());
        }
        ((BarLineChartBase) this).RemoteActionCompatParcelizer.IconCompatParcelizer(((getCryptoConfig) this.MediaBrowserCompatMediaItem).IconCompatParcelizer(getError.write.LEFT), ((getCryptoConfig) this.MediaBrowserCompatMediaItem).read(getError.write.LEFT));
        ((BarLineChartBase) this).AudioAttributesCompatParcelizer.IconCompatParcelizer(((getCryptoConfig) this.MediaBrowserCompatMediaItem).IconCompatParcelizer(getError.write.RIGHT), ((getCryptoConfig) this.MediaBrowserCompatMediaItem).read(getError.write.RIGHT));
    }

    @Override // com.github.mikephil.charting.charts.Chart
    public createAndAcquireSessionWithRetry AudioAttributesCompatParcelizer(float f, float f2) {
        if (this.MediaBrowserCompatMediaItem == 0) {
            return null;
        }
        createAndAcquireSessionWithRetry createandacquiresessionwithretryRemoteActionCompatParcelizer = onSetRating().RemoteActionCompatParcelizer(f, f2);
        return (createandacquiresessionwithretryRemoteActionCompatParcelizer == null || !MediaBrowserCompatItemReceiver()) ? createandacquiresessionwithretryRemoteActionCompatParcelizer : new createAndAcquireSessionWithRetry(createandacquiresessionwithretryRemoteActionCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver(), createandacquiresessionwithretryRemoteActionCompatParcelizer.MediaBrowserCompatItemReceiver(), createandacquiresessionwithretryRemoteActionCompatParcelizer.AudioAttributesImplBaseParcelizer(), createandacquiresessionwithretryRemoteActionCompatParcelizer.AudioAttributesImplApi21Parcelizer(), createandacquiresessionwithretryRemoteActionCompatParcelizer.RemoteActionCompatParcelizer(), -1, createandacquiresessionwithretryRemoteActionCompatParcelizer.AudioAttributesCompatParcelizer());
    }

    public void setDrawValueAboveBar(boolean z) {
        this.onPlay = z;
    }

    @Override // kotlin.releaseAllKeepaliveSessions
    public final boolean AudioAttributesCompatParcelizer() {
        return this.onPlay;
    }

    public void setDrawBarShadow(boolean z) {
        this.onFastForward = z;
    }

    @Override // kotlin.releaseAllKeepaliveSessions
    public final boolean K_() {
        return this.onFastForward;
    }

    public void setHighlightFullBarEnabled(boolean z) {
        this.onPrepareFromSearch = z;
    }

    public final boolean MediaBrowserCompatItemReceiver() {
        return this.onPrepareFromSearch;
    }

    @Override // kotlin.releaseAllKeepaliveSessions
    public final getCryptoConfig write() {
        return (getCryptoConfig) this.MediaBrowserCompatMediaItem;
    }

    public void setFitBars(boolean z) {
        this.onPlayFromSearch = z;
    }
}
