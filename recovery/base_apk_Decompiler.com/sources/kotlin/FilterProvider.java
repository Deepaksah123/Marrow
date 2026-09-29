package kotlin;

import android.media.AudioTrack;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.source.dash.DashMediaSource;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
final class FilterProvider {
    private AudioTrack AudioAttributesCompatParcelizer;
    private long AudioAttributesImplApi21Parcelizer;
    private buildTypeDeserializer AudioAttributesImplApi26Parcelizer;
    private boolean AudioAttributesImplBaseParcelizer;
    private DefaultSerializerProviderImpl IconCompatParcelizer;
    private Method MediaBrowserCompatCustomActionResultReceiver;
    private long MediaBrowserCompatItemReceiver;
    private long MediaBrowserCompatMediaItem;
    private boolean MediaBrowserCompatSearchResultReceiver;
    private boolean MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    private long MediaDescriptionCompat;
    private boolean MediaMetadataCompat;
    private long RatingCompat;
    private float RemoteActionCompatParcelizer;
    private final read handleMediaPlayPauseIfPendingOnHandler;
    private long onAddQueueItem;
    private long onCommand;
    private long onCustomAction;
    private int onFastForward;
    private int onMediaButtonEvent;
    private int onPause;
    private boolean onPlay;
    private boolean onPlayFromMediaId;
    private final long[] onPlayFromSearch;
    private long onPlayFromUri;
    private long onPrepare;
    private long onPrepareFromMediaId;
    private int onPrepareFromSearch;
    private long onPrepareFromUri;
    private long onRemoveQueueItem;
    private long onRemoveQueueItemAt;
    private long onRewind;
    private long onSeekTo;
    private long onSetRepeatMode;
    private int read;
    private long write;

    public interface read {
        void AudioAttributesCompatParcelizer(long j);

        void IconCompatParcelizer(long j, long j2, long j3, long j4);

        void read(int i, long j);

        void write(long j);

        void write(long j, long j2, long j3, long j4);
    }

    public FilterProvider(read readVar) {
        this.handleMediaPlayPauseIfPendingOnHandler = (read) buildTypeSerializer.IconCompatParcelizer(readVar);
        try {
            this.MediaBrowserCompatCustomActionResultReceiver = AudioTrack.class.getMethod("getLatency", null);
        } catch (NoSuchMethodException unused) {
        }
        this.onPlayFromSearch = new long[10];
        this.AudioAttributesImplApi26Parcelizer = buildTypeDeserializer.write;
    }

    public final void IconCompatParcelizer(AudioTrack audioTrack, boolean z, int i, int i2, int i3) {
        this.AudioAttributesCompatParcelizer = audioTrack;
        this.onFastForward = i2;
        this.read = i3;
        this.IconCompatParcelizer = new DefaultSerializerProviderImpl(audioTrack);
        this.onMediaButtonEvent = audioTrack.getSampleRate();
        this.onPlayFromMediaId = z && IconCompatParcelizer(i);
        boolean zMediaBrowserCompatMediaItem = LaissezFaireSubTypeValidator.MediaBrowserCompatMediaItem(i);
        this.MediaBrowserCompatSearchResultReceiver = zMediaBrowserCompatMediaItem;
        this.write = zMediaBrowserCompatMediaItem ? LaissezFaireSubTypeValidator.IconCompatParcelizer(i3 / i2, this.onMediaButtonEvent) : -9223372036854775807L;
        this.onSeekTo = 0L;
        this.onPrepareFromUri = 0L;
        this.AudioAttributesImplBaseParcelizer = false;
        this.onSetRepeatMode = 0L;
        this.onPrepareFromMediaId = 0L;
        this.MediaMetadataCompat = false;
        this.onRemoveQueueItem = C.TIME_UNSET;
        this.MediaBrowserCompatItemReceiver = C.TIME_UNSET;
        this.MediaDescriptionCompat = 0L;
        this.onCustomAction = 0L;
        this.RemoteActionCompatParcelizer = 1.0f;
    }

    public final void write(float f) {
        this.RemoteActionCompatParcelizer = f;
        DefaultSerializerProviderImpl defaultSerializerProviderImpl = this.IconCompatParcelizer;
        if (defaultSerializerProviderImpl != null) {
            defaultSerializerProviderImpl.AudioAttributesImplApi26Parcelizer();
        }
        MediaBrowserCompatCustomActionResultReceiver();
    }

    public final long RemoteActionCompatParcelizer(boolean z) {
        long jMax;
        if (((AudioTrack) buildTypeSerializer.IconCompatParcelizer(this.AudioAttributesCompatParcelizer)).getPlayState() == 3) {
            AudioAttributesImplApi21Parcelizer();
        }
        long j = this.AudioAttributesImplApi26Parcelizer.read() / 1000;
        DefaultSerializerProviderImpl defaultSerializerProviderImpl = (DefaultSerializerProviderImpl) buildTypeSerializer.IconCompatParcelizer(this.IconCompatParcelizer);
        boolean zRemoteActionCompatParcelizer = defaultSerializerProviderImpl.RemoteActionCompatParcelizer();
        if (zRemoteActionCompatParcelizer) {
            jMax = LaissezFaireSubTypeValidator.IconCompatParcelizer(defaultSerializerProviderImpl.read(), this.onMediaButtonEvent) + LaissezFaireSubTypeValidator.read(j - defaultSerializerProviderImpl.AudioAttributesCompatParcelizer(), this.RemoteActionCompatParcelizer);
        } else {
            if (this.onPrepareFromSearch == 0) {
                jMax = AudioAttributesImplApi26Parcelizer();
            } else {
                jMax = LaissezFaireSubTypeValidator.read(this.onRewind + j, this.RemoteActionCompatParcelizer);
            }
            if (!z) {
                jMax = Math.max(0L, jMax - this.onCustomAction);
            }
        }
        if (this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver != zRemoteActionCompatParcelizer) {
            this.onPlayFromUri = this.onCommand;
            this.onPrepare = this.MediaBrowserCompatMediaItem;
        }
        long j2 = j - this.onPlayFromUri;
        if (j2 < 1000000) {
            long j3 = this.onPrepare;
            long j4 = LaissezFaireSubTypeValidator.read(j2, this.RemoteActionCompatParcelizer);
            long j5 = (j2 * 1000) / 1000000;
            jMax = ((jMax * j5) + ((1000 - j5) * (j3 + j4))) / 1000;
        }
        if (!this.onPlay) {
            long j6 = this.MediaBrowserCompatMediaItem;
            if (jMax > j6) {
                this.onPlay = true;
                long jIconCompatParcelizer = LaissezFaireSubTypeValidator.IconCompatParcelizer(LaissezFaireSubTypeValidator.AudioAttributesCompatParcelizer(jMax - j6), this.RemoteActionCompatParcelizer);
                this.handleMediaPlayPauseIfPendingOnHandler.write(this.AudioAttributesImplApi26Parcelizer.IconCompatParcelizer() - LaissezFaireSubTypeValidator.AudioAttributesCompatParcelizer(jIconCompatParcelizer));
            }
        }
        this.onCommand = j;
        this.MediaBrowserCompatMediaItem = jMax;
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = zRemoteActionCompatParcelizer;
        return jMax;
    }

    public final void AudioAttributesCompatParcelizer() {
        if (this.onRemoveQueueItem != C.TIME_UNSET) {
            this.onRemoveQueueItem = LaissezFaireSubTypeValidator.IconCompatParcelizer(this.AudioAttributesImplApi26Parcelizer.RemoteActionCompatParcelizer());
        }
        ((DefaultSerializerProviderImpl) buildTypeSerializer.IconCompatParcelizer(this.IconCompatParcelizer)).AudioAttributesImplApi26Parcelizer();
    }

    public final boolean read() {
        return ((AudioTrack) buildTypeSerializer.IconCompatParcelizer(this.AudioAttributesCompatParcelizer)).getPlayState() == 3;
    }

    public final boolean RemoteActionCompatParcelizer(long j) {
        int playState = ((AudioTrack) buildTypeSerializer.IconCompatParcelizer(this.AudioAttributesCompatParcelizer)).getPlayState();
        if (this.onPlayFromMediaId) {
            if (playState == 2) {
                this.MediaMetadataCompat = false;
                return false;
            }
            if (playState == 1 && MediaBrowserCompatItemReceiver() == 0) {
                return false;
            }
        }
        boolean z = this.MediaMetadataCompat;
        boolean z2 = read(j);
        this.MediaMetadataCompat = z2;
        if (z && !z2 && playState != 1) {
            this.handleMediaPlayPauseIfPendingOnHandler.read(this.read, LaissezFaireSubTypeValidator.AudioAttributesCompatParcelizer(this.write));
        }
        return true;
    }

    public final int write(long j) {
        return this.read - ((int) (j - (MediaBrowserCompatItemReceiver() * ((long) this.onFastForward))));
    }

    public final boolean AudioAttributesCompatParcelizer(long j) {
        return this.MediaBrowserCompatItemReceiver != C.TIME_UNSET && j > 0 && this.AudioAttributesImplApi26Parcelizer.RemoteActionCompatParcelizer() - this.MediaBrowserCompatItemReceiver >= 200;
    }

    public final void IconCompatParcelizer(long j) {
        this.onRemoveQueueItemAt = MediaBrowserCompatItemReceiver();
        this.onRemoveQueueItem = LaissezFaireSubTypeValidator.IconCompatParcelizer(this.AudioAttributesImplApi26Parcelizer.RemoteActionCompatParcelizer());
        this.AudioAttributesImplApi21Parcelizer = j;
    }

    public final boolean read(long j) {
        return j > LaissezFaireSubTypeValidator.write(RemoteActionCompatParcelizer(false), this.onMediaButtonEvent) || AudioAttributesImplBaseParcelizer();
    }

    public final boolean RemoteActionCompatParcelizer() {
        MediaBrowserCompatCustomActionResultReceiver();
        if (this.onRemoveQueueItem == C.TIME_UNSET) {
            ((DefaultSerializerProviderImpl) buildTypeSerializer.IconCompatParcelizer(this.IconCompatParcelizer)).AudioAttributesImplApi26Parcelizer();
            return true;
        }
        this.onRemoveQueueItemAt = MediaBrowserCompatItemReceiver();
        return false;
    }

    public final void IconCompatParcelizer() {
        this.AudioAttributesImplBaseParcelizer = true;
        DefaultSerializerProviderImpl defaultSerializerProviderImpl = this.IconCompatParcelizer;
        if (defaultSerializerProviderImpl != null) {
            defaultSerializerProviderImpl.write();
        }
    }

    public final void write() {
        MediaBrowserCompatCustomActionResultReceiver();
        this.AudioAttributesCompatParcelizer = null;
        this.IconCompatParcelizer = null;
    }

    public final void IconCompatParcelizer(buildTypeDeserializer buildtypedeserializer) {
        this.AudioAttributesImplApi26Parcelizer = buildtypedeserializer;
    }

    private void AudioAttributesImplApi21Parcelizer() {
        long j = this.AudioAttributesImplApi26Parcelizer.read() / 1000;
        if (j - this.RatingCompat >= 30000) {
            long jAudioAttributesImplApi26Parcelizer = AudioAttributesImplApi26Parcelizer();
            if (jAudioAttributesImplApi26Parcelizer == 0) {
                return;
            }
            this.onPlayFromSearch[this.onPause] = LaissezFaireSubTypeValidator.IconCompatParcelizer(jAudioAttributesImplApi26Parcelizer, this.RemoteActionCompatParcelizer) - j;
            this.onPause = (this.onPause + 1) % 10;
            int i = this.onPrepareFromSearch;
            if (i < 10) {
                this.onPrepareFromSearch = i + 1;
            }
            this.RatingCompat = j;
            this.onRewind = 0L;
            int i2 = 0;
            while (true) {
                int i3 = this.onPrepareFromSearch;
                if (i2 >= i3) {
                    break;
                }
                this.onRewind += this.onPlayFromSearch[i2] / ((long) i3);
                i2++;
            }
        }
        if (this.onPlayFromMediaId) {
            return;
        }
        MediaBrowserCompatItemReceiver(j);
        AudioAttributesImplBaseParcelizer(j);
    }

    private void MediaBrowserCompatItemReceiver(long j) {
        DefaultSerializerProviderImpl defaultSerializerProviderImpl = (DefaultSerializerProviderImpl) buildTypeSerializer.IconCompatParcelizer(this.IconCompatParcelizer);
        if (defaultSerializerProviderImpl.write(j)) {
            long jAudioAttributesCompatParcelizer = defaultSerializerProviderImpl.AudioAttributesCompatParcelizer();
            long j2 = defaultSerializerProviderImpl.read();
            long jAudioAttributesImplApi26Parcelizer = AudioAttributesImplApi26Parcelizer();
            if (Math.abs(jAudioAttributesCompatParcelizer - j) > DashMediaSource.MIN_LIVE_DEFAULT_START_POSITION_US) {
                this.handleMediaPlayPauseIfPendingOnHandler.write(j2, jAudioAttributesCompatParcelizer, j, jAudioAttributesImplApi26Parcelizer);
                defaultSerializerProviderImpl.MediaBrowserCompatCustomActionResultReceiver();
            } else if (Math.abs(LaissezFaireSubTypeValidator.IconCompatParcelizer(j2, this.onMediaButtonEvent) - jAudioAttributesImplApi26Parcelizer) > DashMediaSource.MIN_LIVE_DEFAULT_START_POSITION_US) {
                this.handleMediaPlayPauseIfPendingOnHandler.IconCompatParcelizer(j2, jAudioAttributesCompatParcelizer, j, jAudioAttributesImplApi26Parcelizer);
                defaultSerializerProviderImpl.MediaBrowserCompatCustomActionResultReceiver();
            } else {
                defaultSerializerProviderImpl.IconCompatParcelizer();
            }
        }
    }

    private void AudioAttributesImplBaseParcelizer(long j) {
        Method method;
        if (!this.MediaBrowserCompatSearchResultReceiver || (method = this.MediaBrowserCompatCustomActionResultReceiver) == null || j - this.MediaDescriptionCompat < 500000) {
            return;
        }
        try {
            long jIntValue = (((long) ((Integer) LaissezFaireSubTypeValidator.IconCompatParcelizer((Integer) method.invoke(buildTypeSerializer.IconCompatParcelizer(this.AudioAttributesCompatParcelizer), new Object[0]))).intValue()) * 1000) - this.write;
            this.onCustomAction = jIntValue;
            long jMax = Math.max(jIntValue, 0L);
            this.onCustomAction = jMax;
            if (jMax > DashMediaSource.MIN_LIVE_DEFAULT_START_POSITION_US) {
                this.handleMediaPlayPauseIfPendingOnHandler.AudioAttributesCompatParcelizer(jMax);
                this.onCustomAction = 0L;
            }
        } catch (Exception unused) {
            this.MediaBrowserCompatCustomActionResultReceiver = null;
        }
        this.MediaDescriptionCompat = j;
    }

    private void MediaBrowserCompatCustomActionResultReceiver() {
        this.onRewind = 0L;
        this.onPrepareFromSearch = 0;
        this.onPause = 0;
        this.RatingCompat = 0L;
        this.onCommand = 0L;
        this.onPlayFromUri = 0L;
        this.onPlay = false;
    }

    private boolean AudioAttributesImplBaseParcelizer() {
        return this.onPlayFromMediaId && ((AudioTrack) buildTypeSerializer.IconCompatParcelizer(this.AudioAttributesCompatParcelizer)).getPlayState() == 2 && MediaBrowserCompatItemReceiver() == 0;
    }

    private static boolean IconCompatParcelizer(int i) {
        if (LaissezFaireSubTypeValidator.MediaBrowserCompatCustomActionResultReceiver < 23) {
            return i == 5 || i == 6;
        }
        return false;
    }

    private long AudioAttributesImplApi26Parcelizer() {
        return LaissezFaireSubTypeValidator.IconCompatParcelizer(MediaBrowserCompatItemReceiver(), this.onMediaButtonEvent);
    }

    private long MediaBrowserCompatItemReceiver() {
        long jRemoteActionCompatParcelizer = this.AudioAttributesImplApi26Parcelizer.RemoteActionCompatParcelizer();
        if (this.onRemoveQueueItem != C.TIME_UNSET) {
            if (((AudioTrack) buildTypeSerializer.IconCompatParcelizer(this.AudioAttributesCompatParcelizer)).getPlayState() == 2) {
                return this.onRemoveQueueItemAt;
            }
            return Math.min(this.AudioAttributesImplApi21Parcelizer, this.onRemoveQueueItemAt + LaissezFaireSubTypeValidator.write(LaissezFaireSubTypeValidator.read(LaissezFaireSubTypeValidator.IconCompatParcelizer(jRemoteActionCompatParcelizer) - this.onRemoveQueueItem, this.RemoteActionCompatParcelizer), this.onMediaButtonEvent));
        }
        if (jRemoteActionCompatParcelizer - this.onAddQueueItem >= 5) {
            AudioAttributesImplApi26Parcelizer(jRemoteActionCompatParcelizer);
            this.onAddQueueItem = jRemoteActionCompatParcelizer;
        }
        return this.onSeekTo + this.onSetRepeatMode + (this.onPrepareFromUri << 32);
    }

    private void AudioAttributesImplApi26Parcelizer(long j) {
        AudioTrack audioTrack = (AudioTrack) buildTypeSerializer.IconCompatParcelizer(this.AudioAttributesCompatParcelizer);
        int playState = audioTrack.getPlayState();
        if (playState != 1) {
            long j2 = -1;
            long playbackHeadPosition = ((long) audioTrack.getPlaybackHeadPosition()) & ((((long) 0) << 32) | (j2 - ((j2 >> 63) << 32)));
            if (this.onPlayFromMediaId) {
                if (playState == 2 && playbackHeadPosition == 0) {
                    this.onPrepareFromMediaId = this.onSeekTo;
                }
                playbackHeadPosition += this.onPrepareFromMediaId;
            }
            if (LaissezFaireSubTypeValidator.MediaBrowserCompatCustomActionResultReceiver <= 29) {
                if (playbackHeadPosition == 0 && this.onSeekTo > 0 && playState == 3) {
                    if (this.MediaBrowserCompatItemReceiver == C.TIME_UNSET) {
                        this.MediaBrowserCompatItemReceiver = j;
                        return;
                    }
                    return;
                }
                this.MediaBrowserCompatItemReceiver = C.TIME_UNSET;
            }
            long j3 = this.onSeekTo;
            if (j3 > playbackHeadPosition) {
                if (this.AudioAttributesImplBaseParcelizer) {
                    this.onSetRepeatMode += j3;
                    this.AudioAttributesImplBaseParcelizer = false;
                } else {
                    this.onPrepareFromUri++;
                }
            }
            this.onSeekTo = playbackHeadPosition;
        }
    }
}
