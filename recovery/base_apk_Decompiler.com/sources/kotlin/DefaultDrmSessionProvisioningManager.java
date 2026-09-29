package kotlin;

import android.graphics.DashPathEffect;
import com.github.mikephil.charting.data.Entry;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class DefaultDrmSessionProvisioningManager extends DefaultDrmSessionReferenceCountListener<Entry> implements setUuidAndExoMediaDrmProvider {
    private float AudioAttributesCompatParcelizer;
    private boolean AudioAttributesImplApi21Parcelizer;
    private boolean AudioAttributesImplApi26Parcelizer;
    private DashPathEffect AudioAttributesImplBaseParcelizer;
    private List<Integer> IconCompatParcelizer;
    private read MediaBrowserCompatCustomActionResultReceiver;
    private DefaultDrmSessionManager MediaBrowserCompatItemReceiver;
    private float RemoteActionCompatParcelizer;
    private float read;
    private int write;

    public enum read {
        LINEAR,
        STEPPED,
        CUBIC_BEZIER,
        HORIZONTAL_BEZIER
    }

    @Override // kotlin.setUuidAndExoMediaDrmProvider
    public final read onRemoveQueueItemAt() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    @Override // kotlin.setUuidAndExoMediaDrmProvider
    public final float onRewind() {
        return this.AudioAttributesCompatParcelizer;
    }

    @Override // kotlin.setUuidAndExoMediaDrmProvider
    public final float onRemoveQueueItem() {
        return this.read;
    }

    @Override // kotlin.setUuidAndExoMediaDrmProvider
    public final float onPrepareFromMediaId() {
        return this.RemoteActionCompatParcelizer;
    }

    @Override // kotlin.setUuidAndExoMediaDrmProvider
    public final DashPathEffect onSeekTo() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    @Override // kotlin.setUuidAndExoMediaDrmProvider
    public final boolean onSetRating() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    @Override // kotlin.setUuidAndExoMediaDrmProvider
    public final int onPrepareFromSearch() {
        throw null;
    }

    @Override // kotlin.setUuidAndExoMediaDrmProvider
    public final int onPlayFromUri() {
        throw null;
    }

    @Override // kotlin.setUuidAndExoMediaDrmProvider
    public final int onPrepare() {
        return this.write;
    }

    @Override // kotlin.setUuidAndExoMediaDrmProvider
    public final boolean onSetRepeatMode() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    @Override // kotlin.setUuidAndExoMediaDrmProvider
    public final DefaultDrmSessionManager onPrepareFromUri() {
        return this.MediaBrowserCompatItemReceiver;
    }
}
