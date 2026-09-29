package kotlin;

import android.graphics.Paint;
import com.github.mikephil.charting.data.CandleEntry;

/* JADX INFO: loaded from: classes2.dex */
public interface DefaultDrmSessionManagerBuilder extends onEvent<CandleEntry> {
    int onPlayFromUri();

    Paint.Style onPrepare();

    float onPrepareFromMediaId();

    int onPrepareFromSearch();

    int onPrepareFromUri();

    int onRemoveQueueItem();

    Paint.Style onRemoveQueueItemAt();

    float onRewind();

    boolean onSeekTo();

    boolean onSetShuffleMode();
}
