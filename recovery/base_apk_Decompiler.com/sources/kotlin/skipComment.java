package kotlin;

import com.marrow.data.models.lesson.tab.LessonTabItem;
import kotlin.toCueBuilder;

/* JADX INFO: loaded from: classes3.dex */
public interface skipComment {

    public interface AudioAttributesCompatParcelizer extends MediaBrowserCompatCustomActionResultReceiver {
        void RemoteActionCompatParcelizer(String str);
    }

    public interface AudioAttributesImplApi26Parcelizer extends MediaBrowserCompatCustomActionResultReceiver {
        void RemoteActionCompatParcelizer(String str);

        void read();

        void read(int i, int i2);
    }

    public interface IconCompatParcelizer extends MediaBrowserCompatCustomActionResultReceiver {
        void AudioAttributesCompatParcelizer();

        void AudioAttributesCompatParcelizer(float f);

        void AudioAttributesCompatParcelizer(String str);

        void AudioAttributesImplApi21Parcelizer();

        void AudioAttributesImplApi21Parcelizer(String str);

        void AudioAttributesImplApi26Parcelizer();

        void AudioAttributesImplApi26Parcelizer(String str);

        void AudioAttributesImplBaseParcelizer();

        void AudioAttributesImplBaseParcelizer(String str);

        void IconCompatParcelizer();

        void IconCompatParcelizer(String str);

        void MediaBrowserCompatCustomActionResultReceiver();

        void MediaBrowserCompatItemReceiver(String str);

        void MediaBrowserCompatMediaItem();

        void MediaBrowserCompatSearchResultReceiver();

        void MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();

        void MediaDescriptionCompat();

        void MediaMetadataCompat();

        void RatingCompat();

        void RemoteActionCompatParcelizer();

        void RemoteActionCompatParcelizer(int i);

        void RemoteActionCompatParcelizer(String str);

        void handleMediaPlayPauseIfPendingOnHandler();

        void onAddQueueItem();

        void onCommand();

        void onCustomAction();

        void onFastForward();

        void onMediaButtonEvent();

        void onPause();

        void onPlay();

        void onPlayFromMediaId();

        void onPlayFromSearch();

        void onPlayFromUri();

        void onPrepare();

        void onPrepareFromMediaId();

        void onPrepareFromSearch();

        void onPrepareFromUri();

        void onRemoveQueueItem();

        void onRemoveQueueItemAt();

        void onRewind();

        void onSeekTo();

        void onSetCaptioningEnabled();

        void onSetPlaybackSpeed();

        void onSetRating();

        void onSetRepeatMode();

        void onSetShuffleMode();

        void onSkipToPrevious();

        void onStop();

        void read();

        void read(int i);

        void read(String str);

        void read(boolean z);

        void setSessionImpl();

        void write();

        void write(float f, String str);

        void write(String str);
    }

    public interface MediaBrowserCompatCustomActionResultReceiver extends invokeUpdateOutputInternal {
    }

    public interface RemoteActionCompatParcelizer extends Cea608Decoder<MediaBrowserCompatCustomActionResultReceiver, LessonTabItem<?>>, toCueBuilder.IconCompatParcelizer {
        LessonTabItem<?> write(int i);
    }

    public interface read extends MediaBrowserCompatCustomActionResultReceiver {
        void AudioAttributesCompatParcelizer(int i);

        void RemoteActionCompatParcelizer(boolean z);

        void read(String str);

        void write(int i);
    }

    public interface write extends MediaBrowserCompatCustomActionResultReceiver {
        void IconCompatParcelizer(String str);

        void RemoteActionCompatParcelizer(String str);

        void read(String str);
    }
}
