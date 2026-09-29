package kotlin;

import com.github.mikephil.charting.data.RadarEntry;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class onReferenceCountIncremented extends DefaultDrmSessionReferenceCountListener<RadarEntry> implements setUseDrmSessionsForClearContent {
    private int AudioAttributesCompatParcelizer;
    private float AudioAttributesImplApi26Parcelizer;
    private boolean IconCompatParcelizer;
    private int MediaBrowserCompatItemReceiver;
    private float RemoteActionCompatParcelizer;
    private int read;
    private float write;

    public onReferenceCountIncremented(List<RadarEntry> list, String str) {
        super(list, str);
        this.IconCompatParcelizer = false;
        this.read = -1;
        this.MediaBrowserCompatItemReceiver = 1122867;
        this.AudioAttributesCompatParcelizer = 76;
        this.RemoteActionCompatParcelizer = 3.0f;
        this.write = 4.0f;
        this.AudioAttributesImplApi26Parcelizer = 2.0f;
    }

    @Override // kotlin.setUseDrmSessionsForClearContent
    public final boolean onRemoveQueueItemAt() {
        return this.IconCompatParcelizer;
    }

    public final void onRewind() {
        this.IconCompatParcelizer = true;
    }

    @Override // kotlin.setUseDrmSessionsForClearContent
    public final int onPrepare() {
        return this.read;
    }

    @Override // kotlin.setUseDrmSessionsForClearContent
    public final int onRemoveQueueItem() {
        return this.MediaBrowserCompatItemReceiver;
    }

    @Override // kotlin.setUseDrmSessionsForClearContent
    public final int onPrepareFromMediaId() {
        return this.AudioAttributesCompatParcelizer;
    }

    @Override // kotlin.setUseDrmSessionsForClearContent
    public final float onPrepareFromSearch() {
        return this.RemoteActionCompatParcelizer;
    }

    @Override // kotlin.setUseDrmSessionsForClearContent
    public final float onPlayFromUri() {
        return this.write;
    }

    @Override // kotlin.setUseDrmSessionsForClearContent
    public final float onSeekTo() {
        return this.AudioAttributesImplApi26Parcelizer;
    }
}
