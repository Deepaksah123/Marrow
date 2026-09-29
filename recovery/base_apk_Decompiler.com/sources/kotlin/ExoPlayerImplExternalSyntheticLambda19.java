package kotlin;

import android.graphics.Rect;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class ExoPlayerImplExternalSyntheticLambda19 {
    private float AudioAttributesCompatParcelizer;
    private boolean AudioAttributesImplApi21Parcelizer;
    private List<stopRenderers> AudioAttributesImplApi26Parcelizer;
    private setPresenter<stopRenderers> AudioAttributesImplBaseParcelizer;
    private Map<String, isUsingPlaceholderPeriod> IconCompatParcelizer;
    private Map<String, onAudioDisabled> MediaBrowserCompatCustomActionResultReceiver;
    private float MediaBrowserCompatItemReceiver;
    private List<maybeUpdateLoadingPeriod> MediaBrowserCompatSearchResultReceiver;
    private Map<String, List<stopRenderers>> MediaDescriptionCompat;
    private float MediaMetadataCompat;
    private setSupportButtonTintList<maybeNotifyPlaybackInfoChanged> RemoteActionCompatParcelizer;
    private int onAddQueueItem;
    private int onCustomAction;
    private float read;
    private Rect write;
    private final onRenderedFirstFrame RatingCompat = new onRenderedFirstFrame();
    private final HashSet<String> onCommand = new HashSet<>();
    private int MediaBrowserCompatMediaItem = 0;

    public final void write(Rect rect, float f, float f2, float f3, List<stopRenderers> list, setPresenter<stopRenderers> setpresenter, Map<String, List<stopRenderers>> map, Map<String, onAudioDisabled> map2, float f4, setSupportButtonTintList<maybeNotifyPlaybackInfoChanged> setsupportbuttontintlist, Map<String, isUsingPlaceholderPeriod> map3, List<maybeUpdateLoadingPeriod> list2, int i, int i2) {
        this.write = rect;
        this.MediaMetadataCompat = f;
        this.AudioAttributesCompatParcelizer = f2;
        this.read = f3;
        this.AudioAttributesImplApi26Parcelizer = list;
        this.AudioAttributesImplBaseParcelizer = setpresenter;
        this.MediaDescriptionCompat = map;
        this.MediaBrowserCompatCustomActionResultReceiver = map2;
        this.MediaBrowserCompatItemReceiver = f4;
        this.RemoteActionCompatParcelizer = setsupportbuttontintlist;
        this.IconCompatParcelizer = map3;
        this.MediaBrowserCompatSearchResultReceiver = list2;
        this.onCustomAction = i;
        this.onAddQueueItem = i2;
    }

    public final void write(String str) {
        access3000.AudioAttributesCompatParcelizer(str);
        this.onCommand.add(str);
    }

    public final void MediaBrowserCompatSearchResultReceiver() {
        this.AudioAttributesImplApi21Parcelizer = true;
    }

    public final void write(int i) {
        this.MediaBrowserCompatMediaItem += i;
    }

    public final boolean MediaDescriptionCompat() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    public final int AudioAttributesImplApi21Parcelizer() {
        return this.MediaBrowserCompatMediaItem;
    }

    public final void write(boolean z) {
        this.RatingCompat.IconCompatParcelizer(z);
    }

    public final onRenderedFirstFrame MediaBrowserCompatMediaItem() {
        return this.RatingCompat;
    }

    public final stopRenderers AudioAttributesCompatParcelizer(long j) {
        return this.AudioAttributesImplBaseParcelizer.IconCompatParcelizer(j);
    }

    public final Rect IconCompatParcelizer() {
        return this.write;
    }

    public final float AudioAttributesCompatParcelizer() {
        return (long) ((read() / this.read) * 1000.0f);
    }

    public final float MediaMetadataCompat() {
        return this.MediaMetadataCompat;
    }

    public final float RemoteActionCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final float read(float f) {
        return setColorInfo.RemoteActionCompatParcelizer(this.MediaMetadataCompat, this.AudioAttributesCompatParcelizer, f);
    }

    public final float MediaBrowserCompatCustomActionResultReceiver() {
        return this.read;
    }

    public final List<stopRenderers> MediaBrowserCompatItemReceiver() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    public final List<stopRenderers> read(String str) {
        return this.MediaDescriptionCompat.get(str);
    }

    public final setSupportButtonTintList<maybeNotifyPlaybackInfoChanged> write() {
        return this.RemoteActionCompatParcelizer;
    }

    public final Map<String, isUsingPlaceholderPeriod> AudioAttributesImplApi26Parcelizer() {
        return this.IconCompatParcelizer;
    }

    public final maybeUpdateLoadingPeriod AudioAttributesCompatParcelizer(String str) {
        int size = this.MediaBrowserCompatSearchResultReceiver.size();
        for (int i = 0; i < size; i++) {
            maybeUpdateLoadingPeriod maybeupdateloadingperiod = this.MediaBrowserCompatSearchResultReceiver.get(i);
            if (maybeupdateloadingperiod.AudioAttributesCompatParcelizer(str)) {
                return maybeupdateloadingperiod;
            }
        }
        return null;
    }

    public final boolean RatingCompat() {
        return !this.MediaBrowserCompatCustomActionResultReceiver.isEmpty();
    }

    public final Map<String, onAudioDisabled> AudioAttributesImplBaseParcelizer() {
        float fIconCompatParcelizer = setEncoderPadding.IconCompatParcelizer();
        if (fIconCompatParcelizer != this.MediaBrowserCompatItemReceiver) {
            for (Map.Entry<String, onAudioDisabled> entry : this.MediaBrowserCompatCustomActionResultReceiver.entrySet()) {
                this.MediaBrowserCompatCustomActionResultReceiver.put(entry.getKey(), entry.getValue().IconCompatParcelizer(this.MediaBrowserCompatItemReceiver / fIconCompatParcelizer));
            }
        }
        this.MediaBrowserCompatItemReceiver = fIconCompatParcelizer;
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    public final float read() {
        return this.AudioAttributesCompatParcelizer - this.MediaMetadataCompat;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("LottieComposition:\n");
        Iterator<stopRenderers> it = this.AudioAttributesImplApi26Parcelizer.iterator();
        while (it.hasNext()) {
            sb.append(it.next().write("\t"));
        }
        return sb.toString();
    }
}
