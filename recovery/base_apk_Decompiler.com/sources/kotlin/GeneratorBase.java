package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\t\u0010\bR\u001a\u0010\u0007\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\n\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u001a\u0010\n\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\u000b\u0010\bR\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u001a\u0010\u000f\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0005\u0010\bR\u0014\u0010\u000e\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0006R\u001a\u0010\u0010\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u0014\u0010\u0011\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0006R\u0014\u0010\u0013\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0006R\u001a\u0010\u0012\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0006\u001a\u0004\b\u0010\u0010\bR\u0014\u0010\u0016\u001a\u00020\u00158\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0014\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0006\u001a\u0004\b\f\u0010\bR\u001a\u0010\u001d\u001a\u00020\u00198\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\r\u0010\u001cR\u001a\u0010\u001e\u001a\u00020\u00198\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u000f\u0010\u001cR\u001a\u0010\u0018\u001a\u00020\u00198\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001b\u001a\u0004\b\u0011\u0010\u001cR\u001a\u0010\u001a\u001a\u00020\u00198\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u001b\u001a\u0004\b\u0014\u0010\u001cR\u001a\u0010\u001f\u001a\u00020\u00198\u0007X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u001b\u001a\u0004\b\u0013\u0010\u001cR\u001a\u0010\"\u001a\u00020\u00198\u0007X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\u001b\u001a\u0004\b\u0012\u0010\u001cR\u001a\u0010 \u001a\u00020\u00198\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010\u001b\u001a\u0004\b\u0016\u0010\u001cR\u001a\u0010!\u001a\u00020\u00198\u0007X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010\u001b\u001a\u0004\b\u0018\u0010\u001cR\u001a\u0010$\u001a\u00020\u00198\u0007X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010\u001b\u001a\u0004\b\u001a\u0010\u001c"}, d2 = {"Lo/GeneratorBase;", "", "<init>", "()V", "Lo/setShowFastForwardButton;", "RemoteActionCompatParcelizer", "Lo/setShowFastForwardButton;", "write", "()Lo/setShowFastForwardButton;", "IconCompatParcelizer", "read", "AudioAttributesCompatParcelizer", "AudioAttributesImplApi26Parcelizer", "AudioAttributesImplBaseParcelizer", "MediaBrowserCompatCustomActionResultReceiver", "MediaBrowserCompatItemReceiver", "AudioAttributesImplApi21Parcelizer", "MediaBrowserCompatMediaItem", "MediaMetadataCompat", "MediaDescriptionCompat", "MediaBrowserCompatSearchResultReceiver", "Lo/findAndAddVirtualProperties;", "RatingCompat", "Lo/findAndAddVirtualProperties;", "onCommand", "Lo/setUnplayedColor;", "handleMediaPlayPauseIfPendingOnHandler", "Lo/setUnplayedColor;", "()Lo/setUnplayedColor;", "MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver", "onCustomAction", "onAddQueueItem", "onPlay", "onFastForward", "onPause", "onPlayFromMediaId", "onMediaButtonEvent"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GeneratorBase {
    public static final GeneratorBase INSTANCE = new GeneratorBase();

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private static final setShowFastForwardButton IconCompatParcelizer = setPlayer.RemoteActionCompatParcelizer(assignParameter.IconCompatParcelizer(48.0f));

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private static final setShowFastForwardButton RemoteActionCompatParcelizer = setPlayer.RemoteActionCompatParcelizer(assignParameter.IconCompatParcelizer(28.0f));

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private static final setShowFastForwardButton write = setPlayer.RemoteActionCompatParcelizer(assignParameter.IconCompatParcelizer(32.0f));

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private static final setShowFastForwardButton AudioAttributesCompatParcelizer = setPlayer.AudioAttributesCompatParcelizer(assignParameter.IconCompatParcelizer(28.0f), assignParameter.IconCompatParcelizer(28.0f), assignParameter.IconCompatParcelizer(BitmapDescriptorFactory.HUE_RED), assignParameter.IconCompatParcelizer(BitmapDescriptorFactory.HUE_RED));

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private static final setShowFastForwardButton read = setPlayer.RemoteActionCompatParcelizer(assignParameter.IconCompatParcelizer(4.0f));

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private static final setShowFastForwardButton AudioAttributesImplApi26Parcelizer = setPlayer.AudioAttributesCompatParcelizer(assignParameter.IconCompatParcelizer(4.0f), assignParameter.IconCompatParcelizer(4.0f), assignParameter.IconCompatParcelizer(BitmapDescriptorFactory.HUE_RED), assignParameter.IconCompatParcelizer(BitmapDescriptorFactory.HUE_RED));

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private static final setShowFastForwardButton AudioAttributesImplBaseParcelizer = setPlayer.IconCompatParcelizer();
    private static final setShowFastForwardButton MediaBrowserCompatItemReceiver = setPlayer.RemoteActionCompatParcelizer(assignParameter.IconCompatParcelizer(16.0f));

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private static final setShowFastForwardButton MediaBrowserCompatCustomActionResultReceiver = setPlayer.AudioAttributesCompatParcelizer(assignParameter.IconCompatParcelizer(BitmapDescriptorFactory.HUE_RED), assignParameter.IconCompatParcelizer(16.0f), assignParameter.IconCompatParcelizer(16.0f), assignParameter.IconCompatParcelizer(BitmapDescriptorFactory.HUE_RED));

    /* JADX INFO: renamed from: MediaBrowserCompatMediaItem, reason: from kotlin metadata */
    private static final setShowFastForwardButton AudioAttributesImplApi21Parcelizer = setPlayer.RemoteActionCompatParcelizer(assignParameter.IconCompatParcelizer(20.0f));

    /* JADX INFO: renamed from: MediaMetadataCompat, reason: from kotlin metadata */
    private static final setShowFastForwardButton MediaBrowserCompatMediaItem = setPlayer.AudioAttributesCompatParcelizer(assignParameter.IconCompatParcelizer(16.0f), assignParameter.IconCompatParcelizer(BitmapDescriptorFactory.HUE_RED), assignParameter.IconCompatParcelizer(BitmapDescriptorFactory.HUE_RED), assignParameter.IconCompatParcelizer(16.0f));
    private static final setShowFastForwardButton MediaDescriptionCompat = setPlayer.AudioAttributesCompatParcelizer(assignParameter.IconCompatParcelizer(16.0f), assignParameter.IconCompatParcelizer(16.0f), assignParameter.IconCompatParcelizer(BitmapDescriptorFactory.HUE_RED), assignParameter.IconCompatParcelizer(BitmapDescriptorFactory.HUE_RED));

    /* JADX INFO: renamed from: MediaBrowserCompatSearchResultReceiver, reason: from kotlin metadata */
    private static final setShowFastForwardButton MediaMetadataCompat = setPlayer.RemoteActionCompatParcelizer(assignParameter.IconCompatParcelizer(12.0f));
    private static final findAndAddVirtualProperties RatingCompat = parseVersion.read();

    /* JADX INFO: renamed from: onCommand, reason: from kotlin metadata */
    private static final setShowFastForwardButton MediaBrowserCompatSearchResultReceiver = setPlayer.RemoteActionCompatParcelizer(assignParameter.IconCompatParcelizer(8.0f));

    /* JADX INFO: renamed from: handleMediaPlayPauseIfPendingOnHandler, reason: from kotlin metadata */
    private static final setUnplayedColor MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = LegacyPlayerControlView.IconCompatParcelizer(assignParameter.IconCompatParcelizer(48.0f));
    private static final setUnplayedColor onCustomAction = LegacyPlayerControlView.IconCompatParcelizer(assignParameter.IconCompatParcelizer(28.0f));

    /* JADX INFO: renamed from: MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, reason: from kotlin metadata */
    private static final setUnplayedColor onCommand = LegacyPlayerControlView.IconCompatParcelizer(assignParameter.IconCompatParcelizer(32.0f));

    /* JADX INFO: renamed from: onAddQueueItem, reason: from kotlin metadata */
    private static final setUnplayedColor handleMediaPlayPauseIfPendingOnHandler = LegacyPlayerControlView.IconCompatParcelizer(assignParameter.IconCompatParcelizer(4.0f));

    /* JADX INFO: renamed from: onPlay, reason: from kotlin metadata */
    private static final setUnplayedColor onAddQueueItem = LegacyPlayerControlView.IconCompatParcelizer(assignParameter.IconCompatParcelizer(16.0f));

    /* JADX INFO: renamed from: onFastForward, reason: from kotlin metadata */
    private static final setUnplayedColor onPause = LegacyPlayerControlView.IconCompatParcelizer(assignParameter.IconCompatParcelizer(20.0f));

    /* JADX INFO: renamed from: onPause, reason: from kotlin metadata */
    private static final setUnplayedColor onPlay = LegacyPlayerControlView.IconCompatParcelizer(assignParameter.IconCompatParcelizer(12.0f));

    /* JADX INFO: renamed from: onPlayFromMediaId, reason: from kotlin metadata */
    private static final setUnplayedColor onFastForward = LegacyPlayerControlView.IconCompatParcelizer(assignParameter.IconCompatParcelizer(BitmapDescriptorFactory.HUE_RED));
    private static final setUnplayedColor onMediaButtonEvent = LegacyPlayerControlView.IconCompatParcelizer(assignParameter.IconCompatParcelizer(8.0f));

    private GeneratorBase() {
    }

    public final setShowFastForwardButton write() {
        return IconCompatParcelizer;
    }

    public final setShowFastForwardButton IconCompatParcelizer() {
        return RemoteActionCompatParcelizer;
    }

    public final setShowFastForwardButton read() {
        return write;
    }

    public final setShowFastForwardButton AudioAttributesCompatParcelizer() {
        return read;
    }

    public final setShowFastForwardButton RemoteActionCompatParcelizer() {
        return MediaBrowserCompatItemReceiver;
    }

    public final setShowFastForwardButton MediaBrowserCompatCustomActionResultReceiver() {
        return AudioAttributesImplApi21Parcelizer;
    }

    public final setShowFastForwardButton AudioAttributesImplApi21Parcelizer() {
        return MediaMetadataCompat;
    }

    public final setShowFastForwardButton AudioAttributesImplApi26Parcelizer() {
        return MediaBrowserCompatSearchResultReceiver;
    }

    public final setUnplayedColor AudioAttributesImplBaseParcelizer() {
        return MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    }

    public final setUnplayedColor MediaBrowserCompatItemReceiver() {
        return onCustomAction;
    }

    public final setUnplayedColor MediaBrowserCompatMediaItem() {
        return onCommand;
    }

    public final setUnplayedColor MediaBrowserCompatSearchResultReceiver() {
        return handleMediaPlayPauseIfPendingOnHandler;
    }

    public final setUnplayedColor MediaDescriptionCompat() {
        return onAddQueueItem;
    }

    public final setUnplayedColor MediaMetadataCompat() {
        return onPause;
    }

    public final setUnplayedColor RatingCompat() {
        return onPlay;
    }

    public final setUnplayedColor onCommand() {
        return onFastForward;
    }

    public final setUnplayedColor handleMediaPlayPauseIfPendingOnHandler() {
        return onMediaButtonEvent;
    }
}
