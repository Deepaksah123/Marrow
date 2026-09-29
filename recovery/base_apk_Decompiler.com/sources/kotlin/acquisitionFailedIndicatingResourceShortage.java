package kotlin;

import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.charts.PieRadarChartBase;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class acquisitionFailedIndicatingResourceShortage<T extends PieRadarChartBase> implements getSchemeDatas {
    protected T RemoteActionCompatParcelizer;
    protected List<createAndAcquireSessionWithRetry> write = new ArrayList();

    protected abstract createAndAcquireSessionWithRetry IconCompatParcelizer(int i, float f, float f2);

    public acquisitionFailedIndicatingResourceShortage(T t) {
        this.RemoteActionCompatParcelizer = t;
    }

    @Override // kotlin.getSchemeDatas
    public final createAndAcquireSessionWithRetry RemoteActionCompatParcelizer(float f, float f2) {
        if (this.RemoteActionCompatParcelizer.IconCompatParcelizer(f, f2) > this.RemoteActionCompatParcelizer.RatingCompat()) {
            return null;
        }
        float fRemoteActionCompatParcelizer = this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(f, f2);
        T t = this.RemoteActionCompatParcelizer;
        if (t instanceof PieChart) {
            fRemoteActionCompatParcelizer /= t.onPlayFromUri().read();
        }
        int iRemoteActionCompatParcelizer = this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(fRemoteActionCompatParcelizer);
        if (iRemoteActionCompatParcelizer < 0 || iRemoteActionCompatParcelizer >= this.RemoteActionCompatParcelizer.onSeekTo().AudioAttributesImplBaseParcelizer().onMediaButtonEvent()) {
            return null;
        }
        return IconCompatParcelizer(iRemoteActionCompatParcelizer, f, f2);
    }
}
