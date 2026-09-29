package kotlin;

import com.github.mikephil.charting.data.RadarEntry;

/* JADX INFO: loaded from: classes2.dex */
public interface setUseDrmSessionsForClearContent extends DefaultDrmSessionManagerMediaDrmEventListener<RadarEntry> {
    float onPlayFromUri();

    int onPrepare();

    int onPrepareFromMediaId();

    float onPrepareFromSearch();

    int onRemoveQueueItem();

    boolean onRemoveQueueItemAt();

    float onSeekTo();
}
