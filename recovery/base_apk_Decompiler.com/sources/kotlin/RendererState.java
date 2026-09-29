package kotlin;

import android.content.Context;
import android.content.pm.PackageItemInfo;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;

/* JADX INFO: loaded from: classes.dex */
public class RendererState {
    private static String AudioAttributesCompatParcelizer;
    private static String AudioAttributesImplApi26Parcelizer;
    private static String AudioAttributesImplBaseParcelizer;
    private static String IconCompatParcelizer;
    private static String RemoteActionCompatParcelizer;
    private static RendererState read;
    private static String write;
    private final boolean AudioAttributesImplApi21Parcelizer;
    private final boolean MediaBrowserCompatCustomActionResultReceiver;
    private final boolean MediaBrowserCompatItemReceiver;
    private final String MediaBrowserCompatMediaItem;
    private final String MediaBrowserCompatSearchResultReceiver;
    private final String[] MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    private final String MediaDescriptionCompat;
    private final String MediaMetadataCompat;
    private final int RatingCompat;
    private final String handleMediaPlayPauseIfPendingOnHandler;
    private final String onAddQueueItem;
    private final String onCommand;
    private final String onCustomAction;
    private final boolean onFastForward;
    private final String onMediaButtonEvent;
    private final boolean onPause;
    private final boolean onPlayFromMediaId;

    public static RendererState IconCompatParcelizer(Context context) {
        RendererState rendererState;
        synchronized (RendererState.class) {
            if (read == null) {
                read = new RendererState(context);
            }
            rendererState = read;
        }
        return rendererState;
    }

    private RendererState(Context context) {
        Bundle bundle;
        int i;
        try {
            bundle = ((PackageItemInfo) context.getPackageManager().getApplicationInfo(context.getPackageName(), 128)).metaData;
        } catch (Throwable unused) {
            bundle = null;
        }
        bundle = bundle == null ? new Bundle() : bundle;
        if (RemoteActionCompatParcelizer == null) {
            RemoteActionCompatParcelizer = write(bundle, "CLEVERTAP_ACCOUNT_ID");
        }
        if (AudioAttributesCompatParcelizer == null) {
            AudioAttributesCompatParcelizer = write(bundle, "CLEVERTAP_TOKEN");
        }
        if (write == null) {
            write = write(bundle, "CLEVERTAP_REGION");
        }
        if (AudioAttributesImplBaseParcelizer == null) {
            AudioAttributesImplBaseParcelizer = write(bundle, "CLEVERTAP_PROXY_DOMAIN");
        }
        if (AudioAttributesImplApi26Parcelizer == null) {
            AudioAttributesImplApi26Parcelizer = write(bundle, "CLEVERTAP_SPIKY_PROXY_DOMAIN");
        }
        if (IconCompatParcelizer == null) {
            IconCompatParcelizer = write(bundle, "CLEVERTAP_HANDSHAKE_DOMAIN");
        }
        this.onCommand = write(bundle, "CLEVERTAP_NOTIFICATION_ICON");
        this.onFastForward = IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE.equals(write(bundle, "CLEVERTAP_USE_GOOGLE_AD_ID"));
        this.MediaBrowserCompatCustomActionResultReceiver = IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE.equals(write(bundle, "CLEVERTAP_DISABLE_APP_LAUNCHED"));
        this.MediaBrowserCompatSearchResultReceiver = write(bundle, "CLEVERTAP_INAPP_EXCLUDE");
        this.onPause = IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE.equals(write(bundle, "CLEVERTAP_SSL_PINNING"));
        this.AudioAttributesImplApi21Parcelizer = IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE.equals(write(bundle, "CLEVERTAP_BACKGROUND_SYNC"));
        this.onPlayFromMediaId = IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE.equals(write(bundle, "CLEVERTAP_USE_CUSTOM_ID"));
        String strWrite = write(bundle, "FCM_SENDER_ID");
        this.MediaMetadataCompat = strWrite != null ? strWrite.replace("id:", "") : strWrite;
        try {
            i = Integer.parseInt(write(bundle, "CLEVERTAP_ENCRYPTION_LEVEL"));
        } catch (Throwable th) {
            th.getCause();
            RendererWakeupListener.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
        }
        if (i < 0 || i > 1) {
            RendererWakeupListener.MediaMetadataCompat();
        } else {
            this.RatingCompat = i;
            this.handleMediaPlayPauseIfPendingOnHandler = write(bundle, "CLEVERTAP_APP_PACKAGE");
            this.MediaBrowserCompatItemReceiver = IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE.equals(write(bundle, "CLEVERTAP_BETA"));
            this.onCustomAction = write(bundle, "CLEVERTAP_INTENT_SERVICE");
            this.MediaDescriptionCompat = write(bundle, "CLEVERTAP_DEFAULT_CHANNEL_ID");
            this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = IconCompatParcelizer(bundle);
            this.onAddQueueItem = write(bundle, "CLEVERTAP_PROVIDER_1");
            this.onMediaButtonEvent = write(bundle, "CLEVERTAP_PROVIDER_2");
            this.MediaBrowserCompatMediaItem = write(bundle, "CLEVERTAP_ENCRYPTION_IN_TRANSIT");
        }
        i = 0;
        this.RatingCompat = i;
        this.handleMediaPlayPauseIfPendingOnHandler = write(bundle, "CLEVERTAP_APP_PACKAGE");
        this.MediaBrowserCompatItemReceiver = IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE.equals(write(bundle, "CLEVERTAP_BETA"));
        this.onCustomAction = write(bundle, "CLEVERTAP_INTENT_SERVICE");
        this.MediaDescriptionCompat = write(bundle, "CLEVERTAP_DEFAULT_CHANNEL_ID");
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = IconCompatParcelizer(bundle);
        this.onAddQueueItem = write(bundle, "CLEVERTAP_PROVIDER_1");
        this.onMediaButtonEvent = write(bundle, "CLEVERTAP_PROVIDER_2");
        this.MediaBrowserCompatMediaItem = write(bundle, "CLEVERTAP_ENCRYPTION_IN_TRANSIT");
    }

    public static String write() {
        return RemoteActionCompatParcelizer;
    }

    public final String AudioAttributesImplApi21Parcelizer() {
        return this.MediaBrowserCompatSearchResultReceiver;
    }

    public final String MediaBrowserCompatCustomActionResultReceiver() {
        return this.MediaMetadataCompat;
    }

    public final String IconCompatParcelizer() {
        return this.MediaDescriptionCompat;
    }

    public final String MediaDescriptionCompat() {
        return this.onCustomAction;
    }

    public final String MediaBrowserCompatSearchResultReceiver() {
        return this.onCommand;
    }

    public final String[] MediaMetadataCompat() {
        return this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    }

    public final boolean read() {
        return this.MediaBrowserCompatItemReceiver;
    }

    public final int AudioAttributesImplBaseParcelizer() {
        return this.RatingCompat;
    }

    public static String AudioAttributesCompatParcelizer() {
        RendererWakeupListener.MediaMetadataCompat();
        return write;
    }

    static String RemoteActionCompatParcelizer() {
        return AudioAttributesCompatParcelizer;
    }

    public static String MediaBrowserCompatMediaItem() {
        RendererWakeupListener.MediaMetadataCompat();
        return AudioAttributesImplBaseParcelizer;
    }

    public static String handleMediaPlayPauseIfPendingOnHandler() {
        RendererWakeupListener.MediaMetadataCompat();
        return AudioAttributesImplApi26Parcelizer;
    }

    public static String MediaBrowserCompatItemReceiver() {
        RendererWakeupListener.MediaMetadataCompat();
        return IconCompatParcelizer;
    }

    public final String RatingCompat() {
        return this.handleMediaPlayPauseIfPendingOnHandler;
    }

    public final boolean onAddQueueItem() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    public final boolean onCommand() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    public final boolean onFastForward() {
        return this.onPause;
    }

    public final boolean onPlay() {
        return this.onPlayFromMediaId;
    }

    public final boolean onPlayFromMediaId() {
        return this.onFastForward;
    }

    private static String[] IconCompatParcelizer(Bundle bundle) {
        String strWrite = write(bundle, "CLEVERTAP_IDENTIFIER");
        return !TextUtils.isEmpty(strWrite) ? strWrite.split(",") : getTimelines.write;
    }

    private static String write(Bundle bundle, String str) {
        try {
            Object obj = bundle.get(str);
            if (obj != null) {
                return obj.toString();
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    public final String onCustomAction() {
        return this.onAddQueueItem;
    }

    public final String MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
        return this.onMediaButtonEvent;
    }

    public final String AudioAttributesImplApi26Parcelizer() {
        return this.MediaBrowserCompatMediaItem;
    }
}
