package kotlin;

import android.graphics.Color;
import android.graphics.DashPathEffect;
import android.graphics.Typeface;
import com.github.mikephil.charting.data.Entry;
import java.util.ArrayList;
import java.util.List;
import kotlin.getError;
import kotlin.postKeyRequest;

/* JADX INFO: loaded from: classes.dex */
public abstract class provision<T extends Entry> implements setPlayClearSamplesWithoutKeys<T> {
    private postKeyRequest.RemoteActionCompatParcelizer AudioAttributesCompatParcelizer;
    private float AudioAttributesImplApi21Parcelizer;
    private DefaultDrmSessionManagerPreacquiredSessionReferenceExternalSyntheticLambda0 AudioAttributesImplApi26Parcelizer;
    private float AudioAttributesImplBaseParcelizer;
    private getError.write IconCompatParcelizer;
    private DashPathEffect MediaBrowserCompatCustomActionResultReceiver;
    private List<DefaultDrmSessionManagerPreacquiredSessionReferenceExternalSyntheticLambda0> MediaBrowserCompatItemReceiver;
    private String MediaBrowserCompatMediaItem;
    private transient DefaultDrmSessionResponseHandler MediaBrowserCompatSearchResultReceiver;
    private lambdadrmKeysRemoved4comgoogleandroidexoplayer2drmDrmSessionEventListenerEventDispatcher MediaDescriptionCompat;
    private boolean MediaMetadataCompat;
    private List<Integer> RatingCompat;
    private List<Integer> RemoteActionCompatParcelizer;
    private float handleMediaPlayPauseIfPendingOnHandler;
    private Typeface onCommand;
    private boolean onCustomAction;
    private boolean read;
    private boolean write;

    public provision() {
        this.RemoteActionCompatParcelizer = null;
        this.AudioAttributesImplApi26Parcelizer = null;
        this.MediaBrowserCompatItemReceiver = null;
        this.RatingCompat = null;
        this.MediaBrowserCompatMediaItem = "DataSet";
        this.IconCompatParcelizer = getError.write.LEFT;
        this.MediaMetadataCompat = true;
        this.AudioAttributesCompatParcelizer = postKeyRequest.RemoteActionCompatParcelizer.DEFAULT;
        this.AudioAttributesImplApi21Parcelizer = Float.NaN;
        this.AudioAttributesImplBaseParcelizer = Float.NaN;
        this.MediaBrowserCompatCustomActionResultReceiver = null;
        this.read = true;
        this.write = true;
        this.MediaDescriptionCompat = new lambdadrmKeysRemoved4comgoogleandroidexoplayer2drmDrmSessionEventListenerEventDispatcher();
        this.handleMediaPlayPauseIfPendingOnHandler = 17.0f;
        this.onCustomAction = true;
        this.RemoteActionCompatParcelizer = new ArrayList();
        this.RatingCompat = new ArrayList();
        this.RemoteActionCompatParcelizer.add(Integer.valueOf(Color.rgb(140, 234, 255)));
        this.RatingCompat.add(-16777216);
    }

    public provision(String str) {
        this();
        this.MediaBrowserCompatMediaItem = str;
    }

    @Override // kotlin.setPlayClearSamplesWithoutKeys
    public final List<Integer> write() {
        return this.RemoteActionCompatParcelizer;
    }

    @Override // kotlin.setPlayClearSamplesWithoutKeys
    public final int RemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer.get(0).intValue();
    }

    @Override // kotlin.setPlayClearSamplesWithoutKeys
    public final int AudioAttributesCompatParcelizer(int i) {
        List<Integer> list = this.RemoteActionCompatParcelizer;
        return list.get(i % list.size()).intValue();
    }

    @Override // kotlin.setPlayClearSamplesWithoutKeys
    public final DefaultDrmSessionManagerPreacquiredSessionReferenceExternalSyntheticLambda0 AudioAttributesImplBaseParcelizer() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    @Override // kotlin.setPlayClearSamplesWithoutKeys
    public final List<DefaultDrmSessionManagerPreacquiredSessionReferenceExternalSyntheticLambda0> MediaMetadataCompat() {
        return this.MediaBrowserCompatItemReceiver;
    }

    @Override // kotlin.setPlayClearSamplesWithoutKeys
    public final DefaultDrmSessionManagerPreacquiredSessionReferenceExternalSyntheticLambda0 AudioAttributesImplApi21Parcelizer() {
        throw null;
    }

    public final void RemoteActionCompatParcelizer(List<Integer> list) {
        this.RemoteActionCompatParcelizer = list;
    }

    public final void write(int... iArr) {
        this.RemoteActionCompatParcelizer = DrmSessionEventListenerEventDispatcher.read(iArr);
    }

    @Override // kotlin.setPlayClearSamplesWithoutKeys
    public final String RatingCompat() {
        return this.MediaBrowserCompatMediaItem;
    }

    @Override // kotlin.setPlayClearSamplesWithoutKeys
    public final boolean MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
        return this.MediaMetadataCompat;
    }

    @Override // kotlin.setPlayClearSamplesWithoutKeys
    public final void write(DefaultDrmSessionResponseHandler defaultDrmSessionResponseHandler) {
        if (defaultDrmSessionResponseHandler == null) {
            return;
        }
        this.MediaBrowserCompatSearchResultReceiver = defaultDrmSessionResponseHandler;
    }

    @Override // kotlin.setPlayClearSamplesWithoutKeys
    public final DefaultDrmSessionResponseHandler MediaBrowserCompatMediaItem() {
        if (onPause()) {
            return drmSessionAcquired.write();
        }
        return this.MediaBrowserCompatSearchResultReceiver;
    }

    @Override // kotlin.setPlayClearSamplesWithoutKeys
    public final boolean onPause() {
        return this.MediaBrowserCompatSearchResultReceiver == null;
    }

    @Override // kotlin.setPlayClearSamplesWithoutKeys
    public final void read(int i) {
        this.RatingCompat.clear();
        this.RatingCompat.add(Integer.valueOf(i));
    }

    @Override // kotlin.setPlayClearSamplesWithoutKeys
    public final void AudioAttributesCompatParcelizer(float f) {
        this.handleMediaPlayPauseIfPendingOnHandler = drmSessionAcquired.write(8.0f);
    }

    @Override // kotlin.setPlayClearSamplesWithoutKeys
    public final int write(int i) {
        List<Integer> list = this.RatingCompat;
        return list.get(i % list.size()).intValue();
    }

    @Override // kotlin.setPlayClearSamplesWithoutKeys
    public final Typeface onCustomAction() {
        return this.onCommand;
    }

    @Override // kotlin.setPlayClearSamplesWithoutKeys
    public final float MediaBrowserCompatSearchResultReceiver() {
        return this.handleMediaPlayPauseIfPendingOnHandler;
    }

    public final void read(postKeyRequest.RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        this.AudioAttributesCompatParcelizer = remoteActionCompatParcelizer;
    }

    @Override // kotlin.setPlayClearSamplesWithoutKeys
    public final postKeyRequest.RemoteActionCompatParcelizer read() {
        return this.AudioAttributesCompatParcelizer;
    }

    @Override // kotlin.setPlayClearSamplesWithoutKeys
    public final float AudioAttributesImplApi26Parcelizer() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    @Override // kotlin.setPlayClearSamplesWithoutKeys
    public final float MediaBrowserCompatItemReceiver() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    @Override // kotlin.setPlayClearSamplesWithoutKeys
    public final DashPathEffect MediaBrowserCompatCustomActionResultReceiver() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    @Override // kotlin.setPlayClearSamplesWithoutKeys
    public final void AudioAttributesCompatParcelizer(boolean z) {
        this.read = false;
    }

    @Override // kotlin.setPlayClearSamplesWithoutKeys
    public final boolean onAddQueueItem() {
        return this.read;
    }

    @Override // kotlin.setPlayClearSamplesWithoutKeys
    public final boolean onCommand() {
        return this.write;
    }

    @Override // kotlin.setPlayClearSamplesWithoutKeys
    public final lambdadrmKeysRemoved4comgoogleandroidexoplayer2drmDrmSessionEventListenerEventDispatcher MediaDescriptionCompat() {
        return this.MediaDescriptionCompat;
    }

    @Override // kotlin.setPlayClearSamplesWithoutKeys
    public final boolean handleMediaPlayPauseIfPendingOnHandler() {
        return this.onCustomAction;
    }

    @Override // kotlin.setPlayClearSamplesWithoutKeys
    public final getError.write IconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }
}
