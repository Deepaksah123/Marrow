package kotlin;

import kotlin.PlayerTimelineChangeReason;

/* JADX INFO: loaded from: classes.dex */
public final class RendererWakeupListener implements PlaylistTimeline1 {
    private int read;

    public RendererWakeupListener(int i) {
        this.read = i;
    }

    public static void MediaBrowserCompatItemReceiver() {
        onFastForward();
        PlayerTimelineChangeReason.AudioAttributesCompatParcelizer.INFO.AudioAttributesCompatParcelizer();
    }

    public static void AudioAttributesImplApi21Parcelizer() {
        onFastForward();
        PlayerTimelineChangeReason.AudioAttributesCompatParcelizer.INFO.AudioAttributesCompatParcelizer();
    }

    public static void AudioAttributesImplApi26Parcelizer() {
        onFastForward();
        PlayerTimelineChangeReason.AudioAttributesCompatParcelizer.INFO.AudioAttributesCompatParcelizer();
    }

    public static void AudioAttributesImplBaseParcelizer() {
        onFastForward();
        PlayerTimelineChangeReason.AudioAttributesCompatParcelizer.INFO.AudioAttributesCompatParcelizer();
    }

    public static void MediaBrowserCompatCustomActionResultReceiver() {
        onFastForward();
        PlayerTimelineChangeReason.AudioAttributesCompatParcelizer.INFO.AudioAttributesCompatParcelizer();
    }

    public static void MediaBrowserCompatSearchResultReceiver() {
        onFastForward();
        PlayerTimelineChangeReason.AudioAttributesCompatParcelizer.INFO.AudioAttributesCompatParcelizer();
    }

    public static void MediaDescriptionCompat() {
        onFastForward();
        PlayerTimelineChangeReason.AudioAttributesCompatParcelizer.INFO.AudioAttributesCompatParcelizer();
    }

    public static void MediaMetadataCompat() {
        onFastForward();
        PlayerTimelineChangeReason.AudioAttributesCompatParcelizer.DEBUG.AudioAttributesCompatParcelizer();
    }

    public static void RatingCompat() {
        onFastForward();
        PlayerTimelineChangeReason.AudioAttributesCompatParcelizer.DEBUG.AudioAttributesCompatParcelizer();
    }

    public static void MediaBrowserCompatMediaItem() {
        onFastForward();
        PlayerTimelineChangeReason.AudioAttributesCompatParcelizer.DEBUG.AudioAttributesCompatParcelizer();
    }

    public static void MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
        onFastForward();
        PlayerTimelineChangeReason.AudioAttributesCompatParcelizer.DEBUG.AudioAttributesCompatParcelizer();
    }

    public static void handleMediaPlayPauseIfPendingOnHandler() {
        onFastForward();
        PlayerTimelineChangeReason.AudioAttributesCompatParcelizer.INFO.AudioAttributesCompatParcelizer();
    }

    @Override // kotlin.PlaylistTimeline1
    public final void IconCompatParcelizer(String str, String str2) {
        if (onFastForward() <= PlayerTimelineChangeReason.AudioAttributesCompatParcelizer.INFO.AudioAttributesCompatParcelizer() || str2.length() <= 4000) {
            return;
        }
        IconCompatParcelizer(str, str2.substring(4000));
    }

    @Override // kotlin.PlaylistTimeline1
    public final void write() {
        onFastForward();
        PlayerTimelineChangeReason.AudioAttributesCompatParcelizer.INFO.AudioAttributesCompatParcelizer();
    }

    public static void onCustomAction() {
        onFastForward();
        PlayerTimelineChangeReason.AudioAttributesCompatParcelizer.INFO.AudioAttributesCompatParcelizer();
    }

    @Override // kotlin.PlaylistTimeline1
    public final void RemoteActionCompatParcelizer() {
        onCommand();
        PlayerTimelineChangeReason.AudioAttributesCompatParcelizer.INFO.AudioAttributesCompatParcelizer();
    }

    @Override // kotlin.PlaylistTimeline1
    public final void AudioAttributesCompatParcelizer() {
        onCommand();
        PlayerTimelineChangeReason.AudioAttributesCompatParcelizer.INFO.AudioAttributesCompatParcelizer();
    }

    @Override // kotlin.PlaylistTimeline1
    public final void read() {
        onFastForward();
        PlayerTimelineChangeReason.AudioAttributesCompatParcelizer.DEBUG.AudioAttributesCompatParcelizer();
    }

    @Override // kotlin.PlaylistTimeline1
    public final void write(String str, String str2) {
        if (onFastForward() <= PlayerTimelineChangeReason.AudioAttributesCompatParcelizer.DEBUG.AudioAttributesCompatParcelizer() || str2.length() <= 4000) {
            return;
        }
        write(str, str2.substring(4000));
    }

    @Override // kotlin.PlaylistTimeline1
    public final void IconCompatParcelizer() {
        onFastForward();
        PlayerTimelineChangeReason.AudioAttributesCompatParcelizer.DEBUG.AudioAttributesCompatParcelizer();
    }

    public static void onAddQueueItem() {
        onFastForward();
        PlayerTimelineChangeReason.AudioAttributesCompatParcelizer.DEBUG.AudioAttributesCompatParcelizer();
    }

    private int onCommand() {
        return this.read;
    }

    private static int onFastForward() {
        return PlayerTimelineChangeReason.write();
    }
}
