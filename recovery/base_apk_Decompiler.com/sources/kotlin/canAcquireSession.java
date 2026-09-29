package kotlin;

import com.github.mikephil.charting.charts.PieChart;

/* JADX INFO: loaded from: classes4.dex */
public final class canAcquireSession extends acquisitionFailedIndicatingResourceShortage<PieChart> {
    public canAcquireSession(PieChart pieChart) {
        super(pieChart);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.acquisitionFailedIndicatingResourceShortage
    protected final createAndAcquireSessionWithRetry IconCompatParcelizer(int i, float f, float f2) {
        setSessionKeepaliveMs setsessionkeepalivemsAudioAttributesCompatParcelizer = ((provisionRequired) ((PieChart) this.RemoteActionCompatParcelizer).onSeekTo()).AudioAttributesCompatParcelizer();
        return new createAndAcquireSessionWithRetry(i, setsessionkeepalivemsAudioAttributesCompatParcelizer.IconCompatParcelizer(i).read(), f, f2, 0, setsessionkeepalivemsAudioAttributesCompatParcelizer.IconCompatParcelizer());
    }
}
