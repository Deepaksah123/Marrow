package com.github.mikephil.charting.charts;

import android.content.Context;
import android.util.AttributeSet;
import kotlin.DefaultDrmSessionManagerReferenceCountListenerImplExternalSyntheticLambda0;
import kotlin.queryKeyStatus;
import kotlin.setMode;

/* JADX INFO: loaded from: classes4.dex */
public class CandleStickChart extends BarLineChartBase<queryKeyStatus> implements setMode {
    public CandleStickChart(Context context) {
        super(context);
    }

    public CandleStickChart(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CandleStickChart(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // com.github.mikephil.charting.charts.BarLineChartBase, com.github.mikephil.charting.charts.Chart
    protected final void RemoteActionCompatParcelizer() {
        super.RemoteActionCompatParcelizer();
        this.onAddQueueItem = new DefaultDrmSessionManagerReferenceCountListenerImplExternalSyntheticLambda0(this, this.RatingCompat, this.onPause);
        setSessionImpl().onMediaButtonEvent();
        setSessionImpl().onPlay();
    }

    @Override // kotlin.setMode
    public final queryKeyStatus IconCompatParcelizer() {
        return (queryKeyStatus) this.MediaBrowserCompatMediaItem;
    }
}
