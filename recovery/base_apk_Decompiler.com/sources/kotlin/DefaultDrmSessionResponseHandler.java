package kotlin;

import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.data.BubbleEntry;
import com.github.mikephil.charting.data.CandleEntry;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.RadarEntry;

/* JADX INFO: loaded from: classes2.dex */
public abstract class DefaultDrmSessionResponseHandler {
    public String read(float f) {
        return String.valueOf(f);
    }

    public final String write(float f) {
        return read(f);
    }

    public final String read(BarEntry barEntry) {
        return read(barEntry.read());
    }

    public final String AudioAttributesCompatParcelizer(float f) {
        return read(f);
    }

    public final String AudioAttributesCompatParcelizer(Entry entry) {
        return read(entry.read());
    }

    public final String RemoteActionCompatParcelizer(float f) {
        return read(f);
    }

    public final String write(RadarEntry radarEntry) {
        return read(radarEntry.read());
    }

    public final String AudioAttributesCompatParcelizer(BubbleEntry bubbleEntry) {
        return read(bubbleEntry.RemoteActionCompatParcelizer());
    }

    public final String AudioAttributesCompatParcelizer(CandleEntry candleEntry) {
        return read(candleEntry.RemoteActionCompatParcelizer());
    }
}
