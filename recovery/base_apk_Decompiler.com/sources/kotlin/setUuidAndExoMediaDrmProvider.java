package kotlin;

import android.graphics.DashPathEffect;
import com.github.mikephil.charting.data.Entry;
import kotlin.DefaultDrmSessionProvisioningManager;

/* JADX INFO: loaded from: classes4.dex */
public interface setUuidAndExoMediaDrmProvider extends DefaultDrmSessionManagerMediaDrmEventListener<Entry> {
    int onPlayFromUri();

    int onPrepare();

    float onPrepareFromMediaId();

    int onPrepareFromSearch();

    DefaultDrmSessionManager onPrepareFromUri();

    float onRemoveQueueItem();

    DefaultDrmSessionProvisioningManager.read onRemoveQueueItemAt();

    float onRewind();

    DashPathEffect onSeekTo();

    boolean onSetRating();

    boolean onSetRepeatMode();
}
