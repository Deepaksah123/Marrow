package kotlin;

import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class stopRenderers {
    private final resolveSeekPositionUs AudioAttributesCompatParcelizer;
    private final AudioAttributesCompatParcelizer AudioAttributesImplApi21Parcelizer;
    private final long AudioAttributesImplApi26Parcelizer;
    private final List<sendMessageToTarget> AudioAttributesImplBaseParcelizer;
    private final ExoPlayerImplExternalSyntheticLambda19 IconCompatParcelizer;
    private final String MediaBrowserCompatCustomActionResultReceiver;
    private final List<setEncoderDelay<Float>> MediaBrowserCompatItemReceiver;
    private final String MediaBrowserCompatMediaItem;
    private final float MediaBrowserCompatSearchResultReceiver;
    private final List<resolvePositionForPlaylistChange> MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    private final long MediaDescriptionCompat;
    private final RemoteActionCompatParcelizer MediaMetadataCompat;
    private final float RatingCompat;
    private final boolean RemoteActionCompatParcelizer;
    private final int handleMediaPlayPauseIfPendingOnHandler;
    private final float onAddQueueItem;
    private final int onCommand;
    private final int onCustomAction;
    private final float onFastForward;
    private final resetRendererPosition onMediaButtonEvent;
    private final reselectTracksInternalAndSeek onPause;
    private final mediaSourceListUpdateRequestedInternal onPlay;
    private final resetPendingPauseAtEndOfPeriod onPlayFromMediaId;
    private final seekToInternal read;
    private final ExoPlayerImplInternalExternalSyntheticLambda2 write;

    public enum AudioAttributesCompatParcelizer {
        PRE_COMP,
        SOLID,
        IMAGE,
        NULL,
        SHAPE,
        TEXT,
        UNKNOWN
    }

    public enum RemoteActionCompatParcelizer {
        NONE,
        ADD,
        INVERT,
        LUMA,
        LUMA_INVERTED,
        UNKNOWN
    }

    public stopRenderers(List<resolvePositionForPlaylistChange> list, ExoPlayerImplExternalSyntheticLambda19 exoPlayerImplExternalSyntheticLambda19, String str, long j, AudioAttributesCompatParcelizer audioAttributesCompatParcelizer, long j2, String str2, List<sendMessageToTarget> list2, resetPendingPauseAtEndOfPeriod resetpendingpauseatendofperiod, int i, int i2, int i3, float f, float f2, float f3, float f4, resetRendererPosition resetrendererposition, reselectTracksInternalAndSeek reselecttracksinternalandseek, List<setEncoderDelay<Float>> list3, RemoteActionCompatParcelizer remoteActionCompatParcelizer, mediaSourceListUpdateRequestedInternal mediasourcelistupdaterequestedinternal, boolean z, resolveSeekPositionUs resolveseekpositionus, ExoPlayerImplInternalExternalSyntheticLambda2 exoPlayerImplInternalExternalSyntheticLambda2, seekToInternal seektointernal) {
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = list;
        this.IconCompatParcelizer = exoPlayerImplExternalSyntheticLambda19;
        this.MediaBrowserCompatCustomActionResultReceiver = str;
        this.AudioAttributesImplApi26Parcelizer = j;
        this.AudioAttributesImplApi21Parcelizer = audioAttributesCompatParcelizer;
        this.MediaDescriptionCompat = j2;
        this.MediaBrowserCompatMediaItem = str2;
        this.AudioAttributesImplBaseParcelizer = list2;
        this.onPlayFromMediaId = resetpendingpauseatendofperiod;
        this.handleMediaPlayPauseIfPendingOnHandler = i;
        this.onCustomAction = i2;
        this.onCommand = i3;
        this.onFastForward = f;
        this.onAddQueueItem = f2;
        this.MediaBrowserCompatSearchResultReceiver = f3;
        this.RatingCompat = f4;
        this.onMediaButtonEvent = resetrendererposition;
        this.onPause = reselecttracksinternalandseek;
        this.MediaBrowserCompatItemReceiver = list3;
        this.MediaMetadataCompat = remoteActionCompatParcelizer;
        this.onPlay = mediasourcelistupdaterequestedinternal;
        this.RemoteActionCompatParcelizer = z;
        this.AudioAttributesCompatParcelizer = resolveseekpositionus;
        this.write = exoPlayerImplInternalExternalSyntheticLambda2;
        this.read = seektointernal;
    }

    final ExoPlayerImplExternalSyntheticLambda19 read() {
        return this.IconCompatParcelizer;
    }

    final float onPlayFromMediaId() {
        return this.onFastForward;
    }

    final float onCommand() {
        return this.onAddQueueItem / this.IconCompatParcelizer.read();
    }

    final List<setEncoderDelay<Float>> AudioAttributesImplApi26Parcelizer() {
        return this.MediaBrowserCompatItemReceiver;
    }

    public final long AudioAttributesCompatParcelizer() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    public final String AudioAttributesImplApi21Parcelizer() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    public final String MediaBrowserCompatMediaItem() {
        return this.MediaBrowserCompatMediaItem;
    }

    final float MediaBrowserCompatSearchResultReceiver() {
        return this.MediaBrowserCompatSearchResultReceiver;
    }

    final float MediaMetadataCompat() {
        return this.RatingCompat;
    }

    final List<sendMessageToTarget> MediaBrowserCompatCustomActionResultReceiver() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    public final AudioAttributesCompatParcelizer AudioAttributesImplBaseParcelizer() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    final RemoteActionCompatParcelizer MediaBrowserCompatItemReceiver() {
        return this.MediaMetadataCompat;
    }

    final long RatingCompat() {
        return this.MediaDescriptionCompat;
    }

    final List<resolvePositionForPlaylistChange> MediaDescriptionCompat() {
        return this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    }

    final resetPendingPauseAtEndOfPeriod onFastForward() {
        return this.onPlayFromMediaId;
    }

    final int handleMediaPlayPauseIfPendingOnHandler() {
        return this.onCommand;
    }

    final int MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
        return this.onCustomAction;
    }

    final int onCustomAction() {
        return this.handleMediaPlayPauseIfPendingOnHandler;
    }

    final resetRendererPosition onAddQueueItem() {
        return this.onMediaButtonEvent;
    }

    final reselectTracksInternalAndSeek onMediaButtonEvent() {
        return this.onPause;
    }

    final mediaSourceListUpdateRequestedInternal onPause() {
        return this.onPlay;
    }

    public final String toString() {
        return write("");
    }

    public final boolean onPlay() {
        return this.RemoteActionCompatParcelizer;
    }

    public final seekToInternal write() {
        return this.read;
    }

    public final resolveSeekPositionUs RemoteActionCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final ExoPlayerImplInternalExternalSyntheticLambda2 IconCompatParcelizer() {
        return this.write;
    }

    public final String write(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(AudioAttributesImplApi21Parcelizer());
        sb.append("\n");
        stopRenderers stoprenderersAudioAttributesCompatParcelizer = this.IconCompatParcelizer.AudioAttributesCompatParcelizer(RatingCompat());
        if (stoprenderersAudioAttributesCompatParcelizer != null) {
            sb.append("\t\tParents: ");
            sb.append(stoprenderersAudioAttributesCompatParcelizer.AudioAttributesImplApi21Parcelizer());
            stopRenderers stoprenderersAudioAttributesCompatParcelizer2 = this.IconCompatParcelizer.AudioAttributesCompatParcelizer(stoprenderersAudioAttributesCompatParcelizer.RatingCompat());
            while (stoprenderersAudioAttributesCompatParcelizer2 != null) {
                sb.append("->");
                sb.append(stoprenderersAudioAttributesCompatParcelizer2.AudioAttributesImplApi21Parcelizer());
                stoprenderersAudioAttributesCompatParcelizer2 = this.IconCompatParcelizer.AudioAttributesCompatParcelizer(stoprenderersAudioAttributesCompatParcelizer2.RatingCompat());
            }
            sb.append(str);
            sb.append("\n");
        }
        if (!MediaBrowserCompatCustomActionResultReceiver().isEmpty()) {
            sb.append(str);
            sb.append("\tMasks: ");
            sb.append(MediaBrowserCompatCustomActionResultReceiver().size());
            sb.append("\n");
        }
        if (onCustomAction() != 0 && MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() != 0) {
            sb.append(str);
            sb.append("\tBackground: ");
            sb.append(String.format(Locale.US, "%dx%d %X\n", Integer.valueOf(onCustomAction()), Integer.valueOf(MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver()), Integer.valueOf(handleMediaPlayPauseIfPendingOnHandler())));
        }
        if (!this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.isEmpty()) {
            sb.append(str);
            sb.append("\tShapes:\n");
            for (resolvePositionForPlaylistChange resolvepositionforplaylistchange : this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) {
                sb.append(str);
                sb.append("\t\t");
                sb.append(resolvepositionforplaylistchange);
                sb.append("\n");
            }
        }
        return sb.toString();
    }
}
