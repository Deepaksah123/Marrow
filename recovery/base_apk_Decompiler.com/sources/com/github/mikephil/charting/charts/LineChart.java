package com.github.mikephil.charting.charts;

import android.content.Context;
import android.util.AttributeSet;
import kotlin.DefaultDrmSessionExternalSyntheticLambda1;
import kotlin.setDrmHttpDataSourceFactory;
import kotlin.undoAcquisition;

/* JADX INFO: loaded from: classes4.dex */
public class LineChart extends BarLineChartBase<DefaultDrmSessionExternalSyntheticLambda1> implements undoAcquisition {
    public LineChart(Context context) {
        super(context);
    }

    public LineChart(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LineChart(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // com.github.mikephil.charting.charts.BarLineChartBase, com.github.mikephil.charting.charts.Chart
    protected final void RemoteActionCompatParcelizer() {
        super.RemoteActionCompatParcelizer();
        this.onAddQueueItem = new setDrmHttpDataSourceFactory(this, this.RatingCompat, this.onPause);
    }

    @Override // kotlin.undoAcquisition
    public final DefaultDrmSessionExternalSyntheticLambda1 MediaSessionCompatToken() {
        return (DefaultDrmSessionExternalSyntheticLambda1) this.MediaBrowserCompatMediaItem;
    }

    @Override // com.github.mikephil.charting.charts.Chart, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        if (this.onAddQueueItem != null && (this.onAddQueueItem instanceof setDrmHttpDataSourceFactory)) {
            ((setDrmHttpDataSourceFactory) this.onAddQueueItem).read();
        }
        super.onDetachedFromWindow();
    }
}
