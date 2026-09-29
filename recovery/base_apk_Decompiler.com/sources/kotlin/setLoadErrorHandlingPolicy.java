package kotlin;

import com.github.mikephil.charting.data.BarEntry;

/* JADX INFO: loaded from: classes2.dex */
public interface setLoadErrorHandlingPolicy extends setKeyRequestParameters<BarEntry> {
    int onPlayFromUri();

    float onPrepare();

    int onPrepareFromMediaId();

    int onPrepareFromSearch();

    String[] onRemoveQueueItem();

    boolean onRemoveQueueItemAt();

    int onRewind();
}
