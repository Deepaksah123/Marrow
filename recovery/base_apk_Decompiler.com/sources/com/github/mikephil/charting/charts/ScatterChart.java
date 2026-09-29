package com.github.mikephil.charting.charts;

import android.content.Context;
import android.util.AttributeSet;
import kotlin.DefaultDrmSessionRequestHandler;
import kotlin.copyWithSchemeType;
import kotlin.releaseAllPreacquiredSessions;

/* JADX INFO: loaded from: classes4.dex */
public class ScatterChart extends BarLineChartBase<DefaultDrmSessionRequestHandler> implements releaseAllPreacquiredSessions {
    public ScatterChart(Context context) {
        super(context);
    }

    public ScatterChart(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ScatterChart(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // com.github.mikephil.charting.charts.BarLineChartBase, com.github.mikephil.charting.charts.Chart
    protected final void RemoteActionCompatParcelizer() {
        super.RemoteActionCompatParcelizer();
        this.onAddQueueItem = new copyWithSchemeType(this, this.RatingCompat, this.onPause);
        setSessionImpl().onMediaButtonEvent();
        setSessionImpl().onPlay();
    }

    @Override // kotlin.releaseAllPreacquiredSessions
    public final DefaultDrmSessionRequestHandler PlaybackStateCompatCustomAction() {
        return (DefaultDrmSessionRequestHandler) this.MediaBrowserCompatMediaItem;
    }
}
