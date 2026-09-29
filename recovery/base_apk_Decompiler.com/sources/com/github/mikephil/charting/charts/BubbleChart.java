package com.github.mikephil.charting.charts;

import android.content.Context;
import android.util.AttributeSet;
import kotlin.DefaultDrmSessionManagerProvider;
import kotlin.maybeReleaseMediaDrm;
import kotlin.onProvisionError;

/* JADX INFO: loaded from: classes4.dex */
public class BubbleChart extends BarLineChartBase<onProvisionError> implements maybeReleaseMediaDrm {
    public BubbleChart(Context context) {
        super(context);
    }

    public BubbleChart(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public BubbleChart(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // com.github.mikephil.charting.charts.BarLineChartBase, com.github.mikephil.charting.charts.Chart
    protected final void RemoteActionCompatParcelizer() {
        super.RemoteActionCompatParcelizer();
        this.onAddQueueItem = new DefaultDrmSessionManagerProvider(this, this.RatingCompat, this.onPause);
    }

    @Override // kotlin.maybeReleaseMediaDrm
    public final onProvisionError J_() {
        return (onProvisionError) this.MediaBrowserCompatMediaItem;
    }
}
