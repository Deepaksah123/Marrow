package com.github.mikephil.charting.components;

import android.graphics.Canvas;
import android.view.View;
import android.widget.RelativeLayout;
import com.github.mikephil.charting.charts.Chart;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.ref.WeakReference;
import kotlin.acquire;
import kotlin.lambdadrmKeysRemoved4comgoogleandroidexoplayer2drmDrmSessionEventListenerEventDispatcher;

/* JADX INFO: loaded from: classes4.dex */
public class MarkerView extends RelativeLayout implements acquire {
    private WeakReference<Chart> IconCompatParcelizer;
    private lambdadrmKeysRemoved4comgoogleandroidexoplayer2drmDrmSessionEventListenerEventDispatcher read;
    private lambdadrmKeysRemoved4comgoogleandroidexoplayer2drmDrmSessionEventListenerEventDispatcher write;

    public void setOffset(lambdadrmKeysRemoved4comgoogleandroidexoplayer2drmDrmSessionEventListenerEventDispatcher lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher) {
        this.write = lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher;
        if (lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher == null) {
            this.write = new lambdadrmKeysRemoved4comgoogleandroidexoplayer2drmDrmSessionEventListenerEventDispatcher();
        }
    }

    public void setOffset(float f, float f2) {
        this.write.IconCompatParcelizer = f;
        this.write.write = f2;
    }

    private lambdadrmKeysRemoved4comgoogleandroidexoplayer2drmDrmSessionEventListenerEventDispatcher IconCompatParcelizer() {
        return this.write;
    }

    public void setChartView(Chart chart) {
        this.IconCompatParcelizer = new WeakReference<>(chart);
    }

    private Chart write() {
        WeakReference<Chart> weakReference = this.IconCompatParcelizer;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    private lambdadrmKeysRemoved4comgoogleandroidexoplayer2drmDrmSessionEventListenerEventDispatcher IconCompatParcelizer(float f, float f2) {
        lambdadrmKeysRemoved4comgoogleandroidexoplayer2drmDrmSessionEventListenerEventDispatcher lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcherIconCompatParcelizer = IconCompatParcelizer();
        float f3 = lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcherIconCompatParcelizer.IconCompatParcelizer;
        float f4 = lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcherIconCompatParcelizer.write;
        Chart chartWrite = write();
        float width = getWidth();
        float height = getHeight();
        if (this.read.IconCompatParcelizer + f >= BitmapDescriptorFactory.HUE_RED && chartWrite != null && f + width + this.read.IconCompatParcelizer > chartWrite.getWidth()) {
            chartWrite.getWidth();
        }
        if (this.read.write + f2 >= BitmapDescriptorFactory.HUE_RED && chartWrite != null && f2 + height + this.read.write > chartWrite.getHeight()) {
            chartWrite.getHeight();
        }
        return this.read;
    }

    @Override // kotlin.acquire
    public final void RemoteActionCompatParcelizer() {
        measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        layout(0, 0, getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // kotlin.acquire
    public final void write(Canvas canvas, float f, float f2) {
        lambdadrmKeysRemoved4comgoogleandroidexoplayer2drmDrmSessionEventListenerEventDispatcher lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcherIconCompatParcelizer = IconCompatParcelizer(f, f2);
        int iSave = canvas.save();
        canvas.translate(f + lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcherIconCompatParcelizer.IconCompatParcelizer, f2 + lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcherIconCompatParcelizer.write);
        draw(canvas);
        canvas.restoreToCount(iSave);
    }
}
