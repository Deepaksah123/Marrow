package kotlin;

import android.app.Activity;
import android.location.Location;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class copyWithPlaceholderTimeline extends PlayerMessageTarget {
    private static int AudioAttributesCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 0;
    private static WeakReference<Activity> read = null;
    private static boolean write = false;
    private WeakReference<Activity> AudioAttributesImplApi21Parcelizer;
    private boolean onFastForward;
    private boolean onPlayFromMediaId;
    private boolean onPlayFromUri;
    private long AudioAttributesImplBaseParcelizer = 0;
    private boolean MediaBrowserCompatItemReceiver = false;
    private final Object AudioAttributesImplApi26Parcelizer = new Object();
    private String MediaBrowserCompatSearchResultReceiver = null;
    private int MediaBrowserCompatMediaItem = 0;
    private boolean RatingCompat = false;
    private boolean IconCompatParcelizer = true;
    private boolean MediaDescriptionCompat = false;
    private boolean MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = false;
    private int onCustomAction = 0;
    private boolean handleMediaPlayPauseIfPendingOnHandler = false;
    private boolean onAddQueueItem = false;
    private boolean onCommand = false;
    private int onPlay = 0;
    private Location onMediaButtonEvent = null;
    private final Object onPlayFromSearch = new Object();
    private HashMap<String, Integer> MediaMetadataCompat = new HashMap<>();
    private long onPrepare = 0;
    private String onPrepareFromSearch = null;
    private String onPause = null;
    private String MediaBrowserCompatCustomActionResultReceiver = null;
    private JSONObject onSeekTo = null;
    private boolean onPrepareFromMediaId = false;

    public static Activity IconCompatParcelizer() {
        WeakReference<Activity> weakReference = read;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    static int AudioAttributesCompatParcelizer() {
        return AudioAttributesCompatParcelizer;
    }

    public static void IconCompatParcelizer(Activity activity) {
        if (activity == null) {
            read = null;
        } else {
            if (activity.getLocalClassName().contains("InAppNotificationActivity")) {
                return;
            }
            read = new WeakReference<>(activity);
        }
    }

    public static String write() {
        Activity activityIconCompatParcelizer = IconCompatParcelizer();
        if (activityIconCompatParcelizer != null) {
            return activityIconCompatParcelizer.getLocalClassName();
        }
        return null;
    }

    public final void AudioAttributesCompatParcelizer(Activity activity) {
        this.AudioAttributesImplApi21Parcelizer = new WeakReference<>(activity);
    }

    public static boolean AudioAttributesImplBaseParcelizer() {
        return write;
    }

    public static void AudioAttributesCompatParcelizer(boolean z) {
        write = z;
    }

    static void IconCompatParcelizer(int i) {
        AudioAttributesCompatParcelizer = i;
    }

    public final long MediaBrowserCompatMediaItem() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    public final void write(long j) {
        this.AudioAttributesImplBaseParcelizer = j;
    }

    public final Location onAddQueueItem() {
        return this.onMediaButtonEvent;
    }

    public final boolean onRemoveQueueItem() {
        return this.onPlayFromMediaId;
    }

    public final void onSetCaptioningEnabled() {
        this.onPlayFromMediaId = false;
    }

    public final void RemoteActionCompatParcelizer(String str) {
        this.MediaBrowserCompatSearchResultReceiver = str;
    }

    final void AudioAttributesImplApi21Parcelizer() {
        synchronized (this) {
            this.MediaBrowserCompatCustomActionResultReceiver = null;
        }
    }

    final void MediaBrowserCompatItemReceiver() {
        synchronized (this) {
            this.onPause = null;
        }
    }

    final void AudioAttributesImplApi26Parcelizer() {
        synchronized (this) {
            this.onPrepareFromSearch = null;
        }
    }

    final void MediaDescriptionCompat() {
        synchronized (this) {
            this.onSeekTo = null;
        }
    }

    public static int read() {
        return RemoteActionCompatParcelizer;
    }

    final void IconCompatParcelizer(String str) {
        synchronized (this) {
            if (this.MediaBrowserCompatCustomActionResultReceiver == null) {
                this.MediaBrowserCompatCustomActionResultReceiver = str;
            }
        }
    }

    public final String MediaBrowserCompatSearchResultReceiver() {
        String str;
        synchronized (this) {
            str = this.MediaBrowserCompatCustomActionResultReceiver;
        }
        return str;
    }

    public final int RatingCompat() {
        return this.MediaBrowserCompatMediaItem;
    }

    public final int onCustomAction() {
        return this.onCustomAction;
    }

    public final void onSetRepeatMode() {
        this.onCustomAction = 0;
    }

    public final HashMap<String, Integer> MediaMetadataCompat() {
        return this.MediaMetadataCompat;
    }

    final void AudioAttributesCompatParcelizer(int i) {
        this.onPlay = i;
    }

    public final int MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
        return this.onPlay;
    }

    final void read(String str) {
        synchronized (this) {
            if (this.onPause == null) {
                this.onPause = str;
            }
        }
    }

    public final String handleMediaPlayPauseIfPendingOnHandler() {
        String str;
        synchronized (this) {
            str = this.onPause;
        }
        return str;
    }

    final void AudioAttributesCompatParcelizer(long j) {
        this.onPrepare = j;
    }

    public final long onPlay() {
        return this.onPrepare;
    }

    public final String onFastForward() {
        String str;
        synchronized (this) {
            str = this.onPrepareFromSearch;
        }
        return str;
    }

    final void write(String str) {
        synchronized (this) {
            if (this.onPrepareFromSearch == null) {
                this.onPrepareFromSearch = str;
            }
        }
    }

    public final String onMediaButtonEvent() {
        return this.MediaBrowserCompatSearchResultReceiver;
    }

    public final void AudioAttributesCompatParcelizer(JSONObject jSONObject) {
        synchronized (this) {
            if (this.onSeekTo == null) {
                this.onSeekTo = jSONObject;
            }
        }
    }

    public final JSONObject onPause() {
        JSONObject jSONObject;
        synchronized (this) {
            jSONObject = this.onSeekTo;
        }
        return jSONObject;
    }

    public final boolean onPlayFromMediaId() {
        return this.MediaBrowserCompatMediaItem > 0;
    }

    final void RemoteActionCompatParcelizer(boolean z) {
        synchronized (this.AudioAttributesImplApi26Parcelizer) {
            this.MediaBrowserCompatItemReceiver = z;
        }
    }

    public final boolean onPrepareFromSearch() {
        boolean z;
        synchronized (this.AudioAttributesImplApi26Parcelizer) {
            z = this.MediaBrowserCompatItemReceiver;
        }
        return z;
    }

    public final boolean onPrepareFromMediaId() {
        return this.onAddQueueItem;
    }

    public final void IconCompatParcelizer(boolean z) {
        this.onAddQueueItem = z;
    }

    public final void write(boolean z) {
        synchronized (this.onPlayFromSearch) {
            this.RatingCompat = z;
        }
    }

    public final boolean onPlayFromUri() {
        boolean z;
        synchronized (this.onPlayFromSearch) {
            z = this.RatingCompat;
        }
        return z;
    }

    public final void read(boolean z) {
        synchronized (this.onPlayFromSearch) {
            this.IconCompatParcelizer = z;
        }
    }

    public final boolean onCommand() {
        boolean z;
        synchronized (this.onPlayFromSearch) {
            z = this.IconCompatParcelizer;
        }
        return z;
    }

    public final boolean onPlayFromSearch() {
        return this.MediaDescriptionCompat;
    }

    public final void AudioAttributesImplApi21Parcelizer(boolean z) {
        this.MediaDescriptionCompat = z;
    }

    final void MediaBrowserCompatCustomActionResultReceiver(boolean z) {
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = z;
    }

    public final boolean onPrepare() {
        return this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    }

    final void AudioAttributesImplBaseParcelizer(boolean z) {
        this.handleMediaPlayPauseIfPendingOnHandler = z;
    }

    public final boolean onPrepareFromUri() {
        return this.handleMediaPlayPauseIfPendingOnHandler;
    }

    public final boolean onSeekTo() {
        return this.onCommand;
    }

    public final void onSetShuffleMode() {
        this.onCommand = false;
    }

    final void write(int i) {
        this.MediaBrowserCompatMediaItem = i;
    }

    public final boolean onRewind() {
        return this.onFastForward;
    }

    public final boolean onSetPlaybackSpeed() {
        return this.onPlayFromUri;
    }

    public static void MediaBrowserCompatCustomActionResultReceiver() {
        RemoteActionCompatParcelizer = 1;
    }

    static void RemoteActionCompatParcelizer() {
        RemoteActionCompatParcelizer++;
    }

    public final boolean onRemoveQueueItemAt() {
        return this.onPrepareFromMediaId;
    }

    public final void MediaBrowserCompatItemReceiver(boolean z) {
        this.onPrepareFromMediaId = z;
    }
}
