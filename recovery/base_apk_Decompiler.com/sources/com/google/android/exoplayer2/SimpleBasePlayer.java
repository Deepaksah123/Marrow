package com.google.android.exoplayer2;

import android.graphics.Rect;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.MediaMetadata;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.SimpleBasePlayer;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.Tracks;
import com.google.android.exoplayer2.audio.AudioAttributes;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.source.ads.AdPlaybackState;
import com.google.android.exoplayer2.text.CueGroup;
import com.google.android.exoplayer2.trackselection.TrackSelectionParameters;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Clock;
import com.google.android.exoplayer2.util.FlagSet;
import com.google.android.exoplayer2.util.HandlerWrapper;
import com.google.android.exoplayer2.util.ListenerSet;
import com.google.android.exoplayer2.util.Size;
import com.google.android.exoplayer2.util.Util;
import com.google.android.exoplayer2.video.VideoSize;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.Mp4ExtractorExternalSyntheticLambda0;
import kotlin.getTrackIndexOfNextReadSample;
import kotlin.initExtraTracks;
import kotlin.parseUdtaMeta;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public abstract class SimpleBasePlayer extends BasePlayer {
    private static final long POSITION_DISCONTINUITY_THRESHOLD_MS = 1000;
    private final HandlerWrapper applicationHandler;
    private final Looper applicationLooper;
    private final ListenerSet<Player.Listener> listeners;
    private final HashSet<Mp4ExtractorExternalSyntheticLambda0<?>> pendingOperations;
    private final Timeline.Period period;
    private boolean released;
    private State state;

    static /* synthetic */ Mp4ExtractorExternalSyntheticLambda0 lambda$handleReplaceMediaItems$30(Mp4ExtractorExternalSyntheticLambda0 mp4ExtractorExternalSyntheticLambda0, Object obj) throws Exception {
        return mp4ExtractorExternalSyntheticLambda0;
    }

    static /* synthetic */ State lambda$release$13(State state) {
        return state;
    }

    protected State getPlaceholderState(State state) {
        return state;
    }

    protected abstract State getState();

    protected static final class State {
        public final PositionSupplier adBufferedPositionMsSupplier;
        public final PositionSupplier adPositionMsSupplier;
        public final AudioAttributes audioAttributes;
        public final Player.Commands availableCommands;
        public final PositionSupplier contentBufferedPositionMsSupplier;
        public final PositionSupplier contentPositionMsSupplier;
        public final int currentAdGroupIndex;
        public final int currentAdIndexInAdGroup;
        public final CueGroup currentCues;
        public final int currentMediaItemIndex;
        public final DeviceInfo deviceInfo;
        public final int deviceVolume;
        public final long discontinuityPositionMs;
        public final boolean hasPositionDiscontinuity;
        public final boolean isDeviceMuted;
        public final boolean isLoading;
        public final long maxSeekToPreviousPositionMs;
        public final boolean newlyRenderedFirstFrame;
        public final boolean playWhenReady;
        public final int playWhenReadyChangeReason;
        public final PlaybackParameters playbackParameters;
        public final int playbackState;
        public final int playbackSuppressionReason;
        public final PlaybackException playerError;
        public final initExtraTracks<MediaItemData> playlist;
        public final MediaMetadata playlistMetadata;
        public final int positionDiscontinuityReason;
        public final int repeatMode;
        public final long seekBackIncrementMs;
        public final long seekForwardIncrementMs;
        public final boolean shuffleModeEnabled;
        public final Size surfaceSize;
        public final Metadata timedMetadata;
        public final Timeline timeline;
        public final PositionSupplier totalBufferedDurationMsSupplier;
        public final TrackSelectionParameters trackSelectionParameters;
        public final VideoSize videoSize;
        public final float volume;

        /* JADX INFO: loaded from: classes5.dex */
        public static final class Builder {
            private PositionSupplier adBufferedPositionMsSupplier;
            private Long adPositionMs;
            private PositionSupplier adPositionMsSupplier;
            private AudioAttributes audioAttributes;
            private Player.Commands availableCommands;
            private PositionSupplier contentBufferedPositionMsSupplier;
            private Long contentPositionMs;
            private PositionSupplier contentPositionMsSupplier;
            private int currentAdGroupIndex;
            private int currentAdIndexInAdGroup;
            private CueGroup currentCues;
            private int currentMediaItemIndex;
            private DeviceInfo deviceInfo;
            private int deviceVolume;
            private long discontinuityPositionMs;
            private boolean hasPositionDiscontinuity;
            private boolean isDeviceMuted;
            private boolean isLoading;
            private long maxSeekToPreviousPositionMs;
            private boolean newlyRenderedFirstFrame;
            private boolean playWhenReady;
            private int playWhenReadyChangeReason;
            private PlaybackParameters playbackParameters;
            private int playbackState;
            private int playbackSuppressionReason;
            private PlaybackException playerError;
            private initExtraTracks<MediaItemData> playlist;
            private MediaMetadata playlistMetadata;
            private int positionDiscontinuityReason;
            private int repeatMode;
            private long seekBackIncrementMs;
            private long seekForwardIncrementMs;
            private boolean shuffleModeEnabled;
            private Size surfaceSize;
            private Metadata timedMetadata;
            private Timeline timeline;
            private PositionSupplier totalBufferedDurationMsSupplier;
            private TrackSelectionParameters trackSelectionParameters;
            private VideoSize videoSize;
            private float volume;

            public Builder() {
                this.availableCommands = Player.Commands.EMPTY;
                this.playWhenReady = false;
                this.playWhenReadyChangeReason = 1;
                this.playbackState = 1;
                this.playbackSuppressionReason = 0;
                this.playerError = null;
                this.repeatMode = 0;
                this.shuffleModeEnabled = false;
                this.isLoading = false;
                this.seekBackIncrementMs = 5000L;
                this.seekForwardIncrementMs = C.DEFAULT_SEEK_FORWARD_INCREMENT_MS;
                this.maxSeekToPreviousPositionMs = C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS;
                this.playbackParameters = PlaybackParameters.DEFAULT;
                this.trackSelectionParameters = TrackSelectionParameters.DEFAULT_WITHOUT_CONTEXT;
                this.audioAttributes = AudioAttributes.DEFAULT;
                this.volume = 1.0f;
                this.videoSize = VideoSize.UNKNOWN;
                this.currentCues = CueGroup.EMPTY_TIME_ZERO;
                this.deviceInfo = DeviceInfo.UNKNOWN;
                this.deviceVolume = 0;
                this.isDeviceMuted = false;
                this.surfaceSize = Size.UNKNOWN;
                this.newlyRenderedFirstFrame = false;
                this.timedMetadata = new Metadata(C.TIME_UNSET, new Metadata.Entry[0]);
                this.playlist = initExtraTracks.AudioAttributesImplApi26Parcelizer();
                this.timeline = Timeline.EMPTY;
                this.playlistMetadata = MediaMetadata.EMPTY;
                this.currentMediaItemIndex = -1;
                this.currentAdGroupIndex = -1;
                this.currentAdIndexInAdGroup = -1;
                this.contentPositionMs = null;
                this.contentPositionMsSupplier = PositionSupplier.getConstant(C.TIME_UNSET);
                this.adPositionMs = null;
                this.adPositionMsSupplier = PositionSupplier.ZERO;
                this.contentBufferedPositionMsSupplier = PositionSupplier.getConstant(C.TIME_UNSET);
                this.adBufferedPositionMsSupplier = PositionSupplier.ZERO;
                this.totalBufferedDurationMsSupplier = PositionSupplier.ZERO;
                this.hasPositionDiscontinuity = false;
                this.positionDiscontinuityReason = 5;
                this.discontinuityPositionMs = 0L;
            }

            private Builder(State state) {
                this.availableCommands = state.availableCommands;
                this.playWhenReady = state.playWhenReady;
                this.playWhenReadyChangeReason = state.playWhenReadyChangeReason;
                this.playbackState = state.playbackState;
                this.playbackSuppressionReason = state.playbackSuppressionReason;
                this.playerError = state.playerError;
                this.repeatMode = state.repeatMode;
                this.shuffleModeEnabled = state.shuffleModeEnabled;
                this.isLoading = state.isLoading;
                this.seekBackIncrementMs = state.seekBackIncrementMs;
                this.seekForwardIncrementMs = state.seekForwardIncrementMs;
                this.maxSeekToPreviousPositionMs = state.maxSeekToPreviousPositionMs;
                this.playbackParameters = state.playbackParameters;
                this.trackSelectionParameters = state.trackSelectionParameters;
                this.audioAttributes = state.audioAttributes;
                this.volume = state.volume;
                this.videoSize = state.videoSize;
                this.currentCues = state.currentCues;
                this.deviceInfo = state.deviceInfo;
                this.deviceVolume = state.deviceVolume;
                this.isDeviceMuted = state.isDeviceMuted;
                this.surfaceSize = state.surfaceSize;
                this.newlyRenderedFirstFrame = state.newlyRenderedFirstFrame;
                this.timedMetadata = state.timedMetadata;
                this.playlist = state.playlist;
                this.timeline = state.timeline;
                this.playlistMetadata = state.playlistMetadata;
                this.currentMediaItemIndex = state.currentMediaItemIndex;
                this.currentAdGroupIndex = state.currentAdGroupIndex;
                this.currentAdIndexInAdGroup = state.currentAdIndexInAdGroup;
                this.contentPositionMs = null;
                this.contentPositionMsSupplier = state.contentPositionMsSupplier;
                this.adPositionMs = null;
                this.adPositionMsSupplier = state.adPositionMsSupplier;
                this.contentBufferedPositionMsSupplier = state.contentBufferedPositionMsSupplier;
                this.adBufferedPositionMsSupplier = state.adBufferedPositionMsSupplier;
                this.totalBufferedDurationMsSupplier = state.totalBufferedDurationMsSupplier;
                this.hasPositionDiscontinuity = state.hasPositionDiscontinuity;
                this.positionDiscontinuityReason = state.positionDiscontinuityReason;
                this.discontinuityPositionMs = state.discontinuityPositionMs;
            }

            public final Builder setAvailableCommands(Player.Commands commands) {
                this.availableCommands = commands;
                return this;
            }

            public final Builder setPlayWhenReady(boolean z, int i) {
                this.playWhenReady = z;
                this.playWhenReadyChangeReason = i;
                return this;
            }

            public final Builder setPlaybackState(int i) {
                this.playbackState = i;
                return this;
            }

            public final Builder setPlaybackSuppressionReason(int i) {
                this.playbackSuppressionReason = i;
                return this;
            }

            public final Builder setPlayerError(PlaybackException playbackException) {
                this.playerError = playbackException;
                return this;
            }

            public final Builder setRepeatMode(int i) {
                this.repeatMode = i;
                return this;
            }

            public final Builder setShuffleModeEnabled(boolean z) {
                this.shuffleModeEnabled = z;
                return this;
            }

            public final Builder setIsLoading(boolean z) {
                this.isLoading = z;
                return this;
            }

            public final Builder setSeekBackIncrementMs(long j) {
                this.seekBackIncrementMs = j;
                return this;
            }

            public final Builder setSeekForwardIncrementMs(long j) {
                this.seekForwardIncrementMs = j;
                return this;
            }

            public final Builder setMaxSeekToPreviousPositionMs(long j) {
                this.maxSeekToPreviousPositionMs = j;
                return this;
            }

            public final Builder setPlaybackParameters(PlaybackParameters playbackParameters) {
                this.playbackParameters = playbackParameters;
                return this;
            }

            public final Builder setTrackSelectionParameters(TrackSelectionParameters trackSelectionParameters) {
                this.trackSelectionParameters = trackSelectionParameters;
                return this;
            }

            public final Builder setAudioAttributes(AudioAttributes audioAttributes) {
                this.audioAttributes = audioAttributes;
                return this;
            }

            public final Builder setVolume(float f) {
                Assertions.checkArgument(f >= BitmapDescriptorFactory.HUE_RED && f <= 1.0f);
                this.volume = f;
                return this;
            }

            public final Builder setVideoSize(VideoSize videoSize) {
                this.videoSize = videoSize;
                return this;
            }

            public final Builder setCurrentCues(CueGroup cueGroup) {
                this.currentCues = cueGroup;
                return this;
            }

            public final Builder setDeviceInfo(DeviceInfo deviceInfo) {
                this.deviceInfo = deviceInfo;
                return this;
            }

            public final Builder setDeviceVolume(int i) {
                Assertions.checkArgument(i >= 0);
                this.deviceVolume = i;
                return this;
            }

            public final Builder setIsDeviceMuted(boolean z) {
                this.isDeviceMuted = z;
                return this;
            }

            public final Builder setSurfaceSize(Size size) {
                this.surfaceSize = size;
                return this;
            }

            public final Builder setNewlyRenderedFirstFrame(boolean z) {
                this.newlyRenderedFirstFrame = z;
                return this;
            }

            public final Builder setTimedMetadata(Metadata metadata) {
                this.timedMetadata = metadata;
                return this;
            }

            public final Builder setPlaylist(List<MediaItemData> list) {
                HashSet hashSet = new HashSet();
                for (int i = 0; i < list.size(); i++) {
                    Assertions.checkArgument(hashSet.add(list.get(i).uid), "Duplicate MediaItemData UID in playlist");
                }
                this.playlist = initExtraTracks.write(list);
                this.timeline = new PlaylistTimeline(this.playlist);
                return this;
            }

            public final Builder setPlaylistMetadata(MediaMetadata mediaMetadata) {
                this.playlistMetadata = mediaMetadata;
                return this;
            }

            public final Builder setCurrentMediaItemIndex(int i) {
                this.currentMediaItemIndex = i;
                return this;
            }

            public final Builder setCurrentAd(int i, int i2) {
                Assertions.checkArgument((i == -1) == (i2 == -1));
                this.currentAdGroupIndex = i;
                this.currentAdIndexInAdGroup = i2;
                return this;
            }

            public final Builder setContentPositionMs(long j) {
                this.contentPositionMs = Long.valueOf(j);
                return this;
            }

            public final Builder setContentPositionMs(PositionSupplier positionSupplier) {
                this.contentPositionMs = null;
                this.contentPositionMsSupplier = positionSupplier;
                return this;
            }

            public final Builder setAdPositionMs(long j) {
                this.adPositionMs = Long.valueOf(j);
                return this;
            }

            public final Builder setAdPositionMs(PositionSupplier positionSupplier) {
                this.adPositionMs = null;
                this.adPositionMsSupplier = positionSupplier;
                return this;
            }

            public final Builder setContentBufferedPositionMs(PositionSupplier positionSupplier) {
                this.contentBufferedPositionMsSupplier = positionSupplier;
                return this;
            }

            public final Builder setAdBufferedPositionMs(PositionSupplier positionSupplier) {
                this.adBufferedPositionMsSupplier = positionSupplier;
                return this;
            }

            public final Builder setTotalBufferedDurationMs(PositionSupplier positionSupplier) {
                this.totalBufferedDurationMsSupplier = positionSupplier;
                return this;
            }

            public final Builder setPositionDiscontinuity(int i, long j) {
                this.hasPositionDiscontinuity = true;
                this.positionDiscontinuityReason = i;
                this.discontinuityPositionMs = j;
                return this;
            }

            public final Builder clearPositionDiscontinuity() {
                this.hasPositionDiscontinuity = false;
                return this;
            }

            public final State build() {
                return new State(this);
            }
        }

        private State(Builder builder) {
            int i;
            if (!builder.timeline.isEmpty()) {
                int i2 = builder.currentMediaItemIndex;
                if (i2 == -1) {
                    i = 0;
                } else {
                    Assertions.checkArgument(builder.currentMediaItemIndex < builder.timeline.getWindowCount(), "currentMediaItemIndex must be less than playlist.size()");
                    i = i2;
                }
                if (builder.currentAdGroupIndex != -1) {
                    Timeline.Period period = new Timeline.Period();
                    builder.timeline.getPeriod(SimpleBasePlayer.getPeriodIndexFromWindowPosition(builder.timeline, i, builder.contentPositionMs != null ? builder.contentPositionMs.longValue() : builder.contentPositionMsSupplier.get(), new Timeline.Window(), period), period);
                    Assertions.checkArgument(builder.currentAdGroupIndex < period.getAdGroupCount(), "PeriodData has less ad groups than adGroupIndex");
                    int adCountInAdGroup = period.getAdCountInAdGroup(builder.currentAdGroupIndex);
                    if (adCountInAdGroup != -1) {
                        Assertions.checkArgument(builder.currentAdIndexInAdGroup < adCountInAdGroup, "Ad group has less ads than adIndexInGroupIndex");
                    }
                }
            } else {
                Assertions.checkArgument(builder.playbackState == 1 || builder.playbackState == 4, "Empty playlist only allowed in STATE_IDLE or STATE_ENDED");
                Assertions.checkArgument(builder.currentAdGroupIndex == -1 && builder.currentAdIndexInAdGroup == -1, "Ads not allowed if playlist is empty");
            }
            if (builder.playerError != null) {
                Assertions.checkArgument(builder.playbackState == 1, "Player error only allowed in STATE_IDLE");
            }
            if (builder.playbackState == 1 || builder.playbackState == 4) {
                Assertions.checkArgument(!builder.isLoading, "isLoading only allowed when not in STATE_IDLE or STATE_ENDED");
            }
            PositionSupplier extrapolating = builder.contentPositionMs != null ? (builder.currentAdGroupIndex == -1 && builder.playWhenReady && builder.playbackState == 3 && builder.playbackSuppressionReason == 0 && builder.contentPositionMs.longValue() != C.TIME_UNSET) ? PositionSupplier.getExtrapolating(builder.contentPositionMs.longValue(), builder.playbackParameters.speed) : PositionSupplier.getConstant(builder.contentPositionMs.longValue()) : builder.contentPositionMsSupplier;
            PositionSupplier extrapolating2 = builder.adPositionMs != null ? (builder.currentAdGroupIndex != -1 && builder.playWhenReady && builder.playbackState == 3 && builder.playbackSuppressionReason == 0) ? PositionSupplier.getExtrapolating(builder.adPositionMs.longValue(), 1.0f) : PositionSupplier.getConstant(builder.adPositionMs.longValue()) : builder.adPositionMsSupplier;
            this.availableCommands = builder.availableCommands;
            this.playWhenReady = builder.playWhenReady;
            this.playWhenReadyChangeReason = builder.playWhenReadyChangeReason;
            this.playbackState = builder.playbackState;
            this.playbackSuppressionReason = builder.playbackSuppressionReason;
            this.playerError = builder.playerError;
            this.repeatMode = builder.repeatMode;
            this.shuffleModeEnabled = builder.shuffleModeEnabled;
            this.isLoading = builder.isLoading;
            this.seekBackIncrementMs = builder.seekBackIncrementMs;
            this.seekForwardIncrementMs = builder.seekForwardIncrementMs;
            this.maxSeekToPreviousPositionMs = builder.maxSeekToPreviousPositionMs;
            this.playbackParameters = builder.playbackParameters;
            this.trackSelectionParameters = builder.trackSelectionParameters;
            this.audioAttributes = builder.audioAttributes;
            this.volume = builder.volume;
            this.videoSize = builder.videoSize;
            this.currentCues = builder.currentCues;
            this.deviceInfo = builder.deviceInfo;
            this.deviceVolume = builder.deviceVolume;
            this.isDeviceMuted = builder.isDeviceMuted;
            this.surfaceSize = builder.surfaceSize;
            this.newlyRenderedFirstFrame = builder.newlyRenderedFirstFrame;
            this.timedMetadata = builder.timedMetadata;
            this.playlist = builder.playlist;
            this.timeline = builder.timeline;
            this.playlistMetadata = builder.playlistMetadata;
            this.currentMediaItemIndex = builder.currentMediaItemIndex;
            this.currentAdGroupIndex = builder.currentAdGroupIndex;
            this.currentAdIndexInAdGroup = builder.currentAdIndexInAdGroup;
            this.contentPositionMsSupplier = extrapolating;
            this.adPositionMsSupplier = extrapolating2;
            this.contentBufferedPositionMsSupplier = builder.contentBufferedPositionMsSupplier;
            this.adBufferedPositionMsSupplier = builder.adBufferedPositionMsSupplier;
            this.totalBufferedDurationMsSupplier = builder.totalBufferedDurationMsSupplier;
            this.hasPositionDiscontinuity = builder.hasPositionDiscontinuity;
            this.positionDiscontinuityReason = builder.positionDiscontinuityReason;
            this.discontinuityPositionMs = builder.discontinuityPositionMs;
        }

        public final Builder buildUpon() {
            return new Builder();
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof State)) {
                return false;
            }
            State state = (State) obj;
            return this.playWhenReady == state.playWhenReady && this.playWhenReadyChangeReason == state.playWhenReadyChangeReason && this.availableCommands.equals(state.availableCommands) && this.playbackState == state.playbackState && this.playbackSuppressionReason == state.playbackSuppressionReason && Util.areEqual(this.playerError, state.playerError) && this.repeatMode == state.repeatMode && this.shuffleModeEnabled == state.shuffleModeEnabled && this.isLoading == state.isLoading && this.seekBackIncrementMs == state.seekBackIncrementMs && this.seekForwardIncrementMs == state.seekForwardIncrementMs && this.maxSeekToPreviousPositionMs == state.maxSeekToPreviousPositionMs && this.playbackParameters.equals(state.playbackParameters) && this.trackSelectionParameters.equals(state.trackSelectionParameters) && this.audioAttributes.equals(state.audioAttributes) && this.volume == state.volume && this.videoSize.equals(state.videoSize) && this.currentCues.equals(state.currentCues) && this.deviceInfo.equals(state.deviceInfo) && this.deviceVolume == state.deviceVolume && this.isDeviceMuted == state.isDeviceMuted && this.surfaceSize.equals(state.surfaceSize) && this.newlyRenderedFirstFrame == state.newlyRenderedFirstFrame && this.timedMetadata.equals(state.timedMetadata) && this.playlist.equals(state.playlist) && this.playlistMetadata.equals(state.playlistMetadata) && this.currentMediaItemIndex == state.currentMediaItemIndex && this.currentAdGroupIndex == state.currentAdGroupIndex && this.currentAdIndexInAdGroup == state.currentAdIndexInAdGroup && this.contentPositionMsSupplier.equals(state.contentPositionMsSupplier) && this.adPositionMsSupplier.equals(state.adPositionMsSupplier) && this.contentBufferedPositionMsSupplier.equals(state.contentBufferedPositionMsSupplier) && this.adBufferedPositionMsSupplier.equals(state.adBufferedPositionMsSupplier) && this.totalBufferedDurationMsSupplier.equals(state.totalBufferedDurationMsSupplier) && this.hasPositionDiscontinuity == state.hasPositionDiscontinuity && this.positionDiscontinuityReason == state.positionDiscontinuityReason && this.discontinuityPositionMs == state.discontinuityPositionMs;
        }

        public final int hashCode() {
            int iHashCode = this.availableCommands.hashCode();
            boolean z = this.playWhenReady;
            int i = this.playWhenReadyChangeReason;
            int i2 = this.playbackState;
            int i3 = this.playbackSuppressionReason;
            PlaybackException playbackException = this.playerError;
            int iHashCode2 = playbackException == null ? 0 : playbackException.hashCode();
            int i4 = this.repeatMode;
            boolean z2 = this.shuffleModeEnabled;
            boolean z3 = this.isLoading;
            long j = this.seekBackIncrementMs;
            int i5 = (int) (j ^ (j >>> 32));
            long j2 = this.seekForwardIncrementMs;
            int i6 = (int) (j2 ^ (j2 >>> 32));
            long j3 = this.maxSeekToPreviousPositionMs;
            int i7 = (int) (j3 ^ (j3 >>> 32));
            int iHashCode3 = this.playbackParameters.hashCode();
            int iHashCode4 = this.trackSelectionParameters.hashCode();
            int iHashCode5 = this.audioAttributes.hashCode();
            int iFloatToRawIntBits = Float.floatToRawIntBits(this.volume);
            int iHashCode6 = this.videoSize.hashCode();
            int iHashCode7 = this.currentCues.hashCode();
            int iHashCode8 = this.deviceInfo.hashCode();
            int i8 = this.deviceVolume;
            boolean z4 = this.isDeviceMuted;
            int iHashCode9 = this.surfaceSize.hashCode();
            boolean z5 = this.newlyRenderedFirstFrame;
            int iHashCode10 = this.timedMetadata.hashCode();
            int iHashCode11 = this.playlist.hashCode();
            int iHashCode12 = this.playlistMetadata.hashCode();
            int i9 = this.currentMediaItemIndex;
            int i10 = this.currentAdGroupIndex;
            int i11 = this.currentAdIndexInAdGroup;
            int iHashCode13 = this.contentPositionMsSupplier.hashCode();
            int iHashCode14 = this.adPositionMsSupplier.hashCode();
            int iHashCode15 = this.contentBufferedPositionMsSupplier.hashCode();
            int iHashCode16 = this.adBufferedPositionMsSupplier.hashCode();
            int iHashCode17 = this.totalBufferedDurationMsSupplier.hashCode();
            boolean z6 = this.hasPositionDiscontinuity;
            int i12 = this.positionDiscontinuityReason;
            long j4 = this.discontinuityPositionMs;
            return ((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((iHashCode + 217) * 31) + (z ? 1 : 0)) * 31) + i) * 31) + i2) * 31) + i3) * 31) + iHashCode2) * 31) + i4) * 31) + (z2 ? 1 : 0)) * 31) + (z3 ? 1 : 0)) * 31) + i5) * 31) + i6) * 31) + i7) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iFloatToRawIntBits) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + i8) * 31) + (z4 ? 1 : 0)) * 31) + iHashCode9) * 31) + (z5 ? 1 : 0)) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + i9) * 31) + i10) * 31) + i11) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + (z6 ? 1 : 0)) * 31) + i12) * 31) + ((int) ((j4 >>> 32) ^ j4));
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    static final class PlaylistTimeline extends Timeline {
        private final int[] firstPeriodIndexByWindowIndex;
        private final HashMap<Object, Integer> periodIndexByUid;
        private final initExtraTracks<MediaItemData> playlist;
        private final int[] windowIndexByPeriodIndex;

        public PlaylistTimeline(initExtraTracks<MediaItemData> initextratracks) {
            int size = initextratracks.size();
            this.playlist = initextratracks;
            this.firstPeriodIndexByWindowIndex = new int[size];
            int periodCountInMediaItem = 0;
            for (int i = 0; i < size; i++) {
                MediaItemData mediaItemData = initextratracks.get(i);
                this.firstPeriodIndexByWindowIndex[i] = periodCountInMediaItem;
                periodCountInMediaItem += getPeriodCountInMediaItem(mediaItemData);
            }
            this.windowIndexByPeriodIndex = new int[periodCountInMediaItem];
            this.periodIndexByUid = new HashMap<>();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                MediaItemData mediaItemData2 = initextratracks.get(i3);
                for (int i4 = 0; i4 < getPeriodCountInMediaItem(mediaItemData2); i4++) {
                    this.periodIndexByUid.put(mediaItemData2.getPeriodUid(i4), Integer.valueOf(i2));
                    this.windowIndexByPeriodIndex[i2] = i3;
                    i2++;
                }
            }
        }

        @Override // com.google.android.exoplayer2.Timeline
        public final int getWindowCount() {
            return this.playlist.size();
        }

        @Override // com.google.android.exoplayer2.Timeline
        public final int getNextWindowIndex(int i, int i2, boolean z) {
            return super.getNextWindowIndex(i, i2, z);
        }

        @Override // com.google.android.exoplayer2.Timeline
        public final int getPreviousWindowIndex(int i, int i2, boolean z) {
            return super.getPreviousWindowIndex(i, i2, z);
        }

        @Override // com.google.android.exoplayer2.Timeline
        public final int getLastWindowIndex(boolean z) {
            return super.getLastWindowIndex(z);
        }

        @Override // com.google.android.exoplayer2.Timeline
        public final int getFirstWindowIndex(boolean z) {
            return super.getFirstWindowIndex(z);
        }

        @Override // com.google.android.exoplayer2.Timeline
        public final Timeline.Window getWindow(int i, Timeline.Window window, long j) {
            return this.playlist.get(i).getWindow(this.firstPeriodIndexByWindowIndex[i], window);
        }

        @Override // com.google.android.exoplayer2.Timeline
        public final int getPeriodCount() {
            return this.windowIndexByPeriodIndex.length;
        }

        @Override // com.google.android.exoplayer2.Timeline
        public final Timeline.Period getPeriodByUid(Object obj, Timeline.Period period) {
            return getPeriod(((Integer) Assertions.checkNotNull(this.periodIndexByUid.get(obj))).intValue(), period, true);
        }

        @Override // com.google.android.exoplayer2.Timeline
        public final Timeline.Period getPeriod(int i, Timeline.Period period, boolean z) {
            int i2 = this.windowIndexByPeriodIndex[i];
            return this.playlist.get(i2).getPeriod(i2, i - this.firstPeriodIndexByWindowIndex[i2], period);
        }

        @Override // com.google.android.exoplayer2.Timeline
        public final int getIndexOfPeriod(Object obj) {
            Integer num = this.periodIndexByUid.get(obj);
            if (num == null) {
                return -1;
            }
            return num.intValue();
        }

        @Override // com.google.android.exoplayer2.Timeline
        public final Object getUidOfPeriod(int i) {
            int i2 = this.windowIndexByPeriodIndex[i];
            return this.playlist.get(i2).getPeriodUid(i - this.firstPeriodIndexByWindowIndex[i2]);
        }

        private static int getPeriodCountInMediaItem(MediaItemData mediaItemData) {
            if (mediaItemData.periods.isEmpty()) {
                return 1;
            }
            return mediaItemData.periods.size();
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    protected static final class MediaItemData {
        private final MediaMetadata combinedMediaMetadata;
        public final long defaultPositionUs;
        public final long durationUs;
        public final long elapsedRealtimeEpochOffsetMs;
        public final boolean isDynamic;
        public final boolean isPlaceholder;
        public final boolean isSeekable;
        public final MediaItem.LiveConfiguration liveConfiguration;
        public final Object manifest;
        public final MediaItem mediaItem;
        public final MediaMetadata mediaMetadata;
        private final long[] periodPositionInWindowUs;
        public final initExtraTracks<PeriodData> periods;
        public final long positionInFirstPeriodUs;
        public final long presentationStartTimeMs;
        public final Tracks tracks;
        public final Object uid;
        public final long windowStartTimeMs;

        public static final class Builder {
            private long defaultPositionUs;
            private long durationUs;
            private long elapsedRealtimeEpochOffsetMs;
            private boolean isDynamic;
            private boolean isPlaceholder;
            private boolean isSeekable;
            private MediaItem.LiveConfiguration liveConfiguration;
            private Object manifest;
            private MediaItem mediaItem;
            private MediaMetadata mediaMetadata;
            private initExtraTracks<PeriodData> periods;
            private long positionInFirstPeriodUs;
            private long presentationStartTimeMs;
            private Tracks tracks;
            private Object uid;
            private long windowStartTimeMs;

            public Builder(Object obj) {
                this.uid = obj;
                this.tracks = Tracks.EMPTY;
                this.mediaItem = MediaItem.EMPTY;
                this.mediaMetadata = null;
                this.manifest = null;
                this.liveConfiguration = null;
                this.presentationStartTimeMs = C.TIME_UNSET;
                this.windowStartTimeMs = C.TIME_UNSET;
                this.elapsedRealtimeEpochOffsetMs = C.TIME_UNSET;
                this.isSeekable = false;
                this.isDynamic = false;
                this.defaultPositionUs = 0L;
                this.durationUs = C.TIME_UNSET;
                this.positionInFirstPeriodUs = 0L;
                this.isPlaceholder = false;
                this.periods = initExtraTracks.AudioAttributesImplApi26Parcelizer();
            }

            private Builder(MediaItemData mediaItemData) {
                this.uid = mediaItemData.uid;
                this.tracks = mediaItemData.tracks;
                this.mediaItem = mediaItemData.mediaItem;
                this.mediaMetadata = mediaItemData.mediaMetadata;
                this.manifest = mediaItemData.manifest;
                this.liveConfiguration = mediaItemData.liveConfiguration;
                this.presentationStartTimeMs = mediaItemData.presentationStartTimeMs;
                this.windowStartTimeMs = mediaItemData.windowStartTimeMs;
                this.elapsedRealtimeEpochOffsetMs = mediaItemData.elapsedRealtimeEpochOffsetMs;
                this.isSeekable = mediaItemData.isSeekable;
                this.isDynamic = mediaItemData.isDynamic;
                this.defaultPositionUs = mediaItemData.defaultPositionUs;
                this.durationUs = mediaItemData.durationUs;
                this.positionInFirstPeriodUs = mediaItemData.positionInFirstPeriodUs;
                this.isPlaceholder = mediaItemData.isPlaceholder;
                this.periods = mediaItemData.periods;
            }

            public final Builder setUid(Object obj) {
                this.uid = obj;
                return this;
            }

            public final Builder setTracks(Tracks tracks) {
                this.tracks = tracks;
                return this;
            }

            public final Builder setMediaItem(MediaItem mediaItem) {
                this.mediaItem = mediaItem;
                return this;
            }

            public final Builder setMediaMetadata(MediaMetadata mediaMetadata) {
                this.mediaMetadata = mediaMetadata;
                return this;
            }

            public final Builder setManifest(Object obj) {
                this.manifest = obj;
                return this;
            }

            public final Builder setLiveConfiguration(MediaItem.LiveConfiguration liveConfiguration) {
                this.liveConfiguration = liveConfiguration;
                return this;
            }

            public final Builder setPresentationStartTimeMs(long j) {
                this.presentationStartTimeMs = j;
                return this;
            }

            public final Builder setWindowStartTimeMs(long j) {
                this.windowStartTimeMs = j;
                return this;
            }

            public final Builder setElapsedRealtimeEpochOffsetMs(long j) {
                this.elapsedRealtimeEpochOffsetMs = j;
                return this;
            }

            public final Builder setIsSeekable(boolean z) {
                this.isSeekable = z;
                return this;
            }

            public final Builder setIsDynamic(boolean z) {
                this.isDynamic = z;
                return this;
            }

            public final Builder setDefaultPositionUs(long j) {
                Assertions.checkArgument(j >= 0);
                this.defaultPositionUs = j;
                return this;
            }

            public final Builder setDurationUs(long j) {
                Assertions.checkArgument(j == C.TIME_UNSET || j >= 0);
                this.durationUs = j;
                return this;
            }

            public final Builder setPositionInFirstPeriodUs(long j) {
                Assertions.checkArgument(j >= 0);
                this.positionInFirstPeriodUs = j;
                return this;
            }

            public final Builder setIsPlaceholder(boolean z) {
                this.isPlaceholder = z;
                return this;
            }

            public final Builder setPeriods(List<PeriodData> list) {
                int size = list.size();
                int i = 0;
                while (i < size - 1) {
                    Assertions.checkArgument(list.get(i).durationUs != C.TIME_UNSET, "Periods other than last need a duration");
                    int i2 = i + 1;
                    for (int i3 = i2; i3 < size; i3++) {
                        Assertions.checkArgument(!list.get(i).uid.equals(list.get(i3).uid), "Duplicate PeriodData UIDs in period list");
                    }
                    i = i2;
                }
                this.periods = initExtraTracks.write(list);
                return this;
            }

            public final MediaItemData build() {
                return new MediaItemData(this);
            }
        }

        private MediaItemData(Builder builder) {
            int i = 0;
            if (builder.liveConfiguration == null) {
                Assertions.checkArgument(builder.presentationStartTimeMs == C.TIME_UNSET, "presentationStartTimeMs can only be set if liveConfiguration != null");
                Assertions.checkArgument(builder.windowStartTimeMs == C.TIME_UNSET, "windowStartTimeMs can only be set if liveConfiguration != null");
                Assertions.checkArgument(builder.elapsedRealtimeEpochOffsetMs == C.TIME_UNSET, "elapsedRealtimeEpochOffsetMs can only be set if liveConfiguration != null");
            } else if (builder.presentationStartTimeMs != C.TIME_UNSET && builder.windowStartTimeMs != C.TIME_UNSET) {
                Assertions.checkArgument(builder.windowStartTimeMs >= builder.presentationStartTimeMs, "windowStartTimeMs can't be less than presentationStartTimeMs");
            }
            int size = builder.periods.size();
            if (builder.durationUs != C.TIME_UNSET) {
                Assertions.checkArgument(builder.defaultPositionUs <= builder.durationUs, "defaultPositionUs can't be greater than durationUs");
            }
            this.uid = builder.uid;
            this.tracks = builder.tracks;
            this.mediaItem = builder.mediaItem;
            this.mediaMetadata = builder.mediaMetadata;
            this.manifest = builder.manifest;
            this.liveConfiguration = builder.liveConfiguration;
            this.presentationStartTimeMs = builder.presentationStartTimeMs;
            this.windowStartTimeMs = builder.windowStartTimeMs;
            this.elapsedRealtimeEpochOffsetMs = builder.elapsedRealtimeEpochOffsetMs;
            this.isSeekable = builder.isSeekable;
            this.isDynamic = builder.isDynamic;
            this.defaultPositionUs = builder.defaultPositionUs;
            this.durationUs = builder.durationUs;
            long j = builder.positionInFirstPeriodUs;
            this.positionInFirstPeriodUs = j;
            this.isPlaceholder = builder.isPlaceholder;
            initExtraTracks<PeriodData> initextratracks = builder.periods;
            this.periods = initextratracks;
            long[] jArr = new long[initextratracks.size()];
            this.periodPositionInWindowUs = jArr;
            if (!initextratracks.isEmpty()) {
                jArr[0] = -j;
                while (i < size - 1) {
                    long[] jArr2 = this.periodPositionInWindowUs;
                    int i2 = i + 1;
                    jArr2[i2] = jArr2[i] + this.periods.get(i).durationUs;
                    i = i2;
                }
            }
            MediaMetadata mediaMetadata = this.mediaMetadata;
            this.combinedMediaMetadata = mediaMetadata == null ? getCombinedMediaMetadata(this.mediaItem, this.tracks) : mediaMetadata;
        }

        public final Builder buildUpon() {
            return new Builder();
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MediaItemData)) {
                return false;
            }
            MediaItemData mediaItemData = (MediaItemData) obj;
            return this.uid.equals(mediaItemData.uid) && this.tracks.equals(mediaItemData.tracks) && this.mediaItem.equals(mediaItemData.mediaItem) && Util.areEqual(this.mediaMetadata, mediaItemData.mediaMetadata) && Util.areEqual(this.manifest, mediaItemData.manifest) && Util.areEqual(this.liveConfiguration, mediaItemData.liveConfiguration) && this.presentationStartTimeMs == mediaItemData.presentationStartTimeMs && this.windowStartTimeMs == mediaItemData.windowStartTimeMs && this.elapsedRealtimeEpochOffsetMs == mediaItemData.elapsedRealtimeEpochOffsetMs && this.isSeekable == mediaItemData.isSeekable && this.isDynamic == mediaItemData.isDynamic && this.defaultPositionUs == mediaItemData.defaultPositionUs && this.durationUs == mediaItemData.durationUs && this.positionInFirstPeriodUs == mediaItemData.positionInFirstPeriodUs && this.isPlaceholder == mediaItemData.isPlaceholder && this.periods.equals(mediaItemData.periods);
        }

        public final int hashCode() {
            int iHashCode = this.uid.hashCode();
            int iHashCode2 = this.tracks.hashCode();
            int iHashCode3 = this.mediaItem.hashCode();
            MediaMetadata mediaMetadata = this.mediaMetadata;
            int iHashCode4 = mediaMetadata == null ? 0 : mediaMetadata.hashCode();
            Object obj = this.manifest;
            int iHashCode5 = obj == null ? 0 : obj.hashCode();
            MediaItem.LiveConfiguration liveConfiguration = this.liveConfiguration;
            int iHashCode6 = liveConfiguration != null ? liveConfiguration.hashCode() : 0;
            long j = this.presentationStartTimeMs;
            long j2 = this.windowStartTimeMs;
            int i = (int) (j2 ^ (j2 >>> 32));
            long j3 = this.elapsedRealtimeEpochOffsetMs;
            int i2 = (int) (j3 ^ (j3 >>> 32));
            boolean z = this.isSeekable;
            boolean z2 = this.isDynamic;
            long j4 = this.defaultPositionUs;
            long j5 = this.durationUs;
            int i3 = (int) (j5 ^ (j5 >>> 32));
            long j6 = this.positionInFirstPeriodUs;
            return ((((((((((((((((((((((((((((((iHashCode + 217) * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + i) * 31) + i2) * 31) + (z ? 1 : 0)) * 31) + (z2 ? 1 : 0)) * 31) + ((int) (j4 ^ (j4 >>> 32)))) * 31) + i3) * 31) + ((int) (j6 ^ (j6 >>> 32)))) * 31) + (this.isPlaceholder ? 1 : 0)) * 31) + this.periods.hashCode();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Timeline.Window getWindow(int i, Timeline.Window window) {
            window.set(this.uid, this.mediaItem, this.manifest, this.presentationStartTimeMs, this.windowStartTimeMs, this.elapsedRealtimeEpochOffsetMs, this.isSeekable, this.isDynamic, this.liveConfiguration, this.defaultPositionUs, this.durationUs, i, (i + (this.periods.isEmpty() ? 1 : this.periods.size())) - 1, this.positionInFirstPeriodUs);
            window.isPlaceholder = this.isPlaceholder;
            return window;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Timeline.Period getPeriod(int i, int i2, Timeline.Period period) {
            if (this.periods.isEmpty()) {
                Object obj = this.uid;
                period.set(obj, obj, i, this.positionInFirstPeriodUs + this.durationUs, 0L, AdPlaybackState.NONE, this.isPlaceholder);
                return period;
            }
            PeriodData periodData = this.periods.get(i2);
            Object obj2 = periodData.uid;
            period.set(obj2, Pair.create(this.uid, obj2), i, periodData.durationUs, this.periodPositionInWindowUs[i2], periodData.adPlaybackState, periodData.isPlaceholder);
            return period;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Object getPeriodUid(int i) {
            if (this.periods.isEmpty()) {
                return this.uid;
            }
            return Pair.create(this.uid, this.periods.get(i).uid);
        }

        private static MediaMetadata getCombinedMediaMetadata(MediaItem mediaItem, Tracks tracks) {
            MediaMetadata.Builder builder = new MediaMetadata.Builder();
            int size = tracks.getGroups().size();
            for (int i = 0; i < size; i++) {
                Tracks.Group group = tracks.getGroups().get(i);
                for (int i2 = 0; i2 < group.length; i2++) {
                    if (group.isTrackSelected(i2)) {
                        Format trackFormat = group.getTrackFormat(i2);
                        if (trackFormat.metadata != null) {
                            for (int i3 = 0; i3 < trackFormat.metadata.length(); i3++) {
                                trackFormat.metadata.get(i3).populateMediaMetadata(builder);
                            }
                        }
                    }
                }
            }
            return builder.populate(mediaItem.mediaMetadata).build();
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    protected static final class PeriodData {
        public final AdPlaybackState adPlaybackState;
        public final long durationUs;
        public final boolean isPlaceholder;
        public final Object uid;

        public static final class Builder {
            private AdPlaybackState adPlaybackState;
            private long durationUs;
            private boolean isPlaceholder;
            private Object uid;

            public Builder(Object obj) {
                this.uid = obj;
                this.durationUs = 0L;
                this.adPlaybackState = AdPlaybackState.NONE;
                this.isPlaceholder = false;
            }

            private Builder(PeriodData periodData) {
                this.uid = periodData.uid;
                this.durationUs = periodData.durationUs;
                this.adPlaybackState = periodData.adPlaybackState;
                this.isPlaceholder = periodData.isPlaceholder;
            }

            public final Builder setUid(Object obj) {
                this.uid = obj;
                return this;
            }

            public final Builder setDurationUs(long j) {
                Assertions.checkArgument(j == C.TIME_UNSET || j >= 0);
                this.durationUs = j;
                return this;
            }

            public final Builder setAdPlaybackState(AdPlaybackState adPlaybackState) {
                this.adPlaybackState = adPlaybackState;
                return this;
            }

            public final Builder setIsPlaceholder(boolean z) {
                this.isPlaceholder = z;
                return this;
            }

            public final PeriodData build() {
                return new PeriodData(this);
            }
        }

        private PeriodData(Builder builder) {
            this.uid = builder.uid;
            this.durationUs = builder.durationUs;
            this.adPlaybackState = builder.adPlaybackState;
            this.isPlaceholder = builder.isPlaceholder;
        }

        public final Builder buildUpon() {
            return new Builder();
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PeriodData)) {
                return false;
            }
            PeriodData periodData = (PeriodData) obj;
            return this.uid.equals(periodData.uid) && this.durationUs == periodData.durationUs && this.adPlaybackState.equals(periodData.adPlaybackState) && this.isPlaceholder == periodData.isPlaceholder;
        }

        public final int hashCode() {
            int iHashCode = this.uid.hashCode();
            long j = this.durationUs;
            return ((((((iHashCode + 217) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + this.adPlaybackState.hashCode()) * 31) + (this.isPlaceholder ? 1 : 0);
        }
    }

    protected interface PositionSupplier {
        public static final PositionSupplier ZERO = getConstant(0);

        static /* synthetic */ long lambda$getConstant$0(long j) {
            return j;
        }

        long get();

        static PositionSupplier getConstant(final long j) {
            return new PositionSupplier() { // from class: com.google.android.exoplayer2.SimpleBasePlayer$PositionSupplier$$ExternalSyntheticLambda1
                @Override // com.google.android.exoplayer2.SimpleBasePlayer.PositionSupplier
                public final long get() {
                    return SimpleBasePlayer.PositionSupplier.lambda$getConstant$0(j);
                }
            };
        }

        static PositionSupplier getExtrapolating(final long j, final float f) {
            final long jElapsedRealtime = SystemClock.elapsedRealtime();
            return new PositionSupplier() { // from class: com.google.android.exoplayer2.SimpleBasePlayer$PositionSupplier$$ExternalSyntheticLambda0
                @Override // com.google.android.exoplayer2.SimpleBasePlayer.PositionSupplier
                public final long get() {
                    return SimpleBasePlayer.PositionSupplier.lambda$getExtrapolating$1(j, jElapsedRealtime, f);
                }
            };
        }

        static /* synthetic */ long lambda$getExtrapolating$1(long j, long j2, float f) {
            return j + ((long) ((SystemClock.elapsedRealtime() - j2) * f));
        }
    }

    protected SimpleBasePlayer(Looper looper) {
        this(looper, Clock.DEFAULT);
    }

    protected SimpleBasePlayer(Looper looper, Clock clock) {
        this.applicationLooper = looper;
        this.applicationHandler = clock.createHandler(looper, null);
        this.pendingOperations = new HashSet<>();
        this.period = new Timeline.Period();
        this.listeners = new ListenerSet<>(looper, clock, new ListenerSet.IterationFinishedEvent() { // from class: com.google.android.exoplayer2.SimpleBasePlayer$$ExternalSyntheticLambda58
            @Override // com.google.android.exoplayer2.util.ListenerSet.IterationFinishedEvent
            public final void invoke(Object obj, FlagSet flagSet) {
                this.f$0.m54lambda$new$0$comgoogleandroidexoplayer2SimpleBasePlayer((Player.Listener) obj, flagSet);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$new$0$com-google-android-exoplayer2-SimpleBasePlayer, reason: not valid java name */
    /* synthetic */ void m54lambda$new$0$comgoogleandroidexoplayer2SimpleBasePlayer(Player.Listener listener, FlagSet flagSet) {
        listener.onEvents(this, new Player.Events(flagSet));
    }

    @Override // com.google.android.exoplayer2.Player
    public final void addListener(Player.Listener listener) {
        this.listeners.add((Player.Listener) Assertions.checkNotNull(listener));
    }

    @Override // com.google.android.exoplayer2.Player
    public final void removeListener(Player.Listener listener) {
        verifyApplicationThreadAndInitState();
        this.listeners.remove(listener);
    }

    @Override // com.google.android.exoplayer2.Player
    public final Looper getApplicationLooper() {
        return this.applicationLooper;
    }

    @Override // com.google.android.exoplayer2.Player
    public final Player.Commands getAvailableCommands() {
        verifyApplicationThreadAndInitState();
        return this.state.availableCommands;
    }

    @Override // com.google.android.exoplayer2.Player
    public final void setPlayWhenReady(final boolean z) {
        verifyApplicationThreadAndInitState();
        final State state = this.state;
        if (shouldHandleCommand(1)) {
            updateStateForPendingOperation(handleSetPlayWhenReady(z), new parseUdtaMeta() { // from class: com.google.android.exoplayer2.SimpleBasePlayer$$ExternalSyntheticLambda30
                @Override // kotlin.parseUdtaMeta
                public final Object get() {
                    return state.buildUpon().setPlayWhenReady(z, 1).build();
                }
            });
        }
    }

    @Override // com.google.android.exoplayer2.Player
    public final boolean getPlayWhenReady() {
        verifyApplicationThreadAndInitState();
        return this.state.playWhenReady;
    }

    @Override // com.google.android.exoplayer2.Player
    public final void setMediaItems(List<MediaItem> list, boolean z) {
        verifyApplicationThreadAndInitState();
        setMediaItemsInternal(list, z ? -1 : this.state.currentMediaItemIndex, z ? C.TIME_UNSET : this.state.contentPositionMsSupplier.get());
    }

    @Override // com.google.android.exoplayer2.Player
    public final void setMediaItems(List<MediaItem> list, int i, long j) {
        verifyApplicationThreadAndInitState();
        if (i == -1) {
            i = this.state.currentMediaItemIndex;
            j = this.state.contentPositionMsSupplier.get();
        }
        setMediaItemsInternal(list, i, j);
    }

    private void setMediaItemsInternal(final List<MediaItem> list, final int i, final long j) {
        Assertions.checkArgument(i == -1 || i >= 0);
        final State state = this.state;
        if (shouldHandleCommand(20) || (list.size() == 1 && shouldHandleCommand(31))) {
            updateStateForPendingOperation(handleSetMediaItems(list, i, j), new parseUdtaMeta() { // from class: com.google.android.exoplayer2.SimpleBasePlayer$$ExternalSyntheticLambda53
                @Override // kotlin.parseUdtaMeta
                public final Object get() {
                    return this.f$0.m57lambda$setMediaItemsInternal$2$comgoogleandroidexoplayer2SimpleBasePlayer(list, state, i, j);
                }
            });
        }
    }

    /* JADX INFO: renamed from: lambda$setMediaItemsInternal$2$com-google-android-exoplayer2-SimpleBasePlayer, reason: not valid java name */
    /* synthetic */ State m57lambda$setMediaItemsInternal$2$comgoogleandroidexoplayer2SimpleBasePlayer(List list, State state, int i, long j) {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            arrayList.add(getPlaceholderMediaItemData((MediaItem) list.get(i2)));
        }
        return getStateWithNewPlaylistAndPosition(state, arrayList, i, j);
    }

    @Override // com.google.android.exoplayer2.Player
    public final void addMediaItems(int i, final List<MediaItem> list) {
        verifyApplicationThreadAndInitState();
        Assertions.checkArgument(i >= 0);
        final State state = this.state;
        int size = state.playlist.size();
        if (!shouldHandleCommand(20) || list.isEmpty()) {
            return;
        }
        final int iMin = Math.min(i, size);
        updateStateForPendingOperation(handleAddMediaItems(iMin, list), new parseUdtaMeta() { // from class: com.google.android.exoplayer2.SimpleBasePlayer$$ExternalSyntheticLambda0
            @Override // kotlin.parseUdtaMeta
            public final Object get() {
                return this.f$0.m52lambda$addMediaItems$3$comgoogleandroidexoplayer2SimpleBasePlayer(state, list, iMin);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$addMediaItems$3$com-google-android-exoplayer2-SimpleBasePlayer, reason: not valid java name */
    /* synthetic */ State m52lambda$addMediaItems$3$comgoogleandroidexoplayer2SimpleBasePlayer(State state, List list, int i) {
        ArrayList arrayList = new ArrayList(state.playlist);
        for (int i2 = 0; i2 < list.size(); i2++) {
            arrayList.add(i2 + i, getPlaceholderMediaItemData((MediaItem) list.get(i2)));
        }
        if (!state.playlist.isEmpty()) {
            return getStateWithNewPlaylist(state, arrayList, this.period);
        }
        return getStateWithNewPlaylistAndPosition(state, arrayList, state.currentMediaItemIndex, state.contentPositionMsSupplier.get());
    }

    @Override // com.google.android.exoplayer2.Player
    public final void moveMediaItems(final int i, int i2, int i3) {
        verifyApplicationThreadAndInitState();
        Assertions.checkArgument(i >= 0 && i2 >= i && i3 >= 0);
        final State state = this.state;
        int size = state.playlist.size();
        if (!shouldHandleCommand(20) || size == 0 || i >= size) {
            return;
        }
        final int iMin = Math.min(i2, size);
        final int iMin2 = Math.min(i3, state.playlist.size() - (iMin - i));
        if (i == iMin || iMin2 == i) {
            return;
        }
        updateStateForPendingOperation(handleMoveMediaItems(i, iMin, iMin2), new parseUdtaMeta() { // from class: com.google.android.exoplayer2.SimpleBasePlayer$$ExternalSyntheticLambda57
            @Override // kotlin.parseUdtaMeta
            public final Object get() {
                return this.f$0.m53lambda$moveMediaItems$4$comgoogleandroidexoplayer2SimpleBasePlayer(state, i, iMin, iMin2);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$moveMediaItems$4$com-google-android-exoplayer2-SimpleBasePlayer, reason: not valid java name */
    /* synthetic */ State m53lambda$moveMediaItems$4$comgoogleandroidexoplayer2SimpleBasePlayer(State state, int i, int i2, int i3) {
        ArrayList arrayList = new ArrayList(state.playlist);
        Util.moveItems(arrayList, i, i2, i3);
        return getStateWithNewPlaylist(state, arrayList, this.period);
    }

    @Override // com.google.android.exoplayer2.Player
    public final void replaceMediaItems(final int i, int i2, final List<MediaItem> list) {
        verifyApplicationThreadAndInitState();
        Assertions.checkArgument(i >= 0 && i <= i2);
        final State state = this.state;
        int size = state.playlist.size();
        if (!shouldHandleCommand(20) || i > size) {
            return;
        }
        final int iMin = Math.min(i2, size);
        updateStateForPendingOperation(handleReplaceMediaItems(i, iMin, list), new parseUdtaMeta() { // from class: com.google.android.exoplayer2.SimpleBasePlayer$$ExternalSyntheticLambda59
            @Override // kotlin.parseUdtaMeta
            public final Object get() {
                return this.f$0.m56lambda$replaceMediaItems$5$comgoogleandroidexoplayer2SimpleBasePlayer(state, list, iMin, i);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$replaceMediaItems$5$com-google-android-exoplayer2-SimpleBasePlayer, reason: not valid java name */
    /* synthetic */ State m56lambda$replaceMediaItems$5$comgoogleandroidexoplayer2SimpleBasePlayer(State state, List list, int i, int i2) {
        State stateWithNewPlaylistAndPosition;
        ArrayList arrayList = new ArrayList(state.playlist);
        for (int i3 = 0; i3 < list.size(); i3++) {
            arrayList.add(i3 + i, getPlaceholderMediaItemData((MediaItem) list.get(i3)));
        }
        if (!state.playlist.isEmpty()) {
            stateWithNewPlaylistAndPosition = getStateWithNewPlaylist(state, arrayList, this.period);
        } else {
            stateWithNewPlaylistAndPosition = getStateWithNewPlaylistAndPosition(state, arrayList, state.currentMediaItemIndex, state.contentPositionMsSupplier.get());
        }
        if (i2 >= i) {
            return stateWithNewPlaylistAndPosition;
        }
        Util.removeRange(arrayList, i2, i);
        return getStateWithNewPlaylist(stateWithNewPlaylistAndPosition, arrayList, this.period);
    }

    @Override // com.google.android.exoplayer2.Player
    public final void removeMediaItems(final int i, int i2) {
        final int iMin;
        verifyApplicationThreadAndInitState();
        Assertions.checkArgument(i >= 0 && i2 >= i);
        final State state = this.state;
        int size = state.playlist.size();
        if (!shouldHandleCommand(20) || size == 0 || i >= size || i == (iMin = Math.min(i2, size))) {
            return;
        }
        updateStateForPendingOperation(handleRemoveMediaItems(i, iMin), new parseUdtaMeta() { // from class: com.google.android.exoplayer2.SimpleBasePlayer$$ExternalSyntheticLambda50
            @Override // kotlin.parseUdtaMeta
            public final Object get() {
                return this.f$0.m55lambda$removeMediaItems$6$comgoogleandroidexoplayer2SimpleBasePlayer(state, i, iMin);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$removeMediaItems$6$com-google-android-exoplayer2-SimpleBasePlayer, reason: not valid java name */
    /* synthetic */ State m55lambda$removeMediaItems$6$comgoogleandroidexoplayer2SimpleBasePlayer(State state, int i, int i2) {
        ArrayList arrayList = new ArrayList(state.playlist);
        Util.removeRange(arrayList, i, i2);
        return getStateWithNewPlaylist(state, arrayList, this.period);
    }

    @Override // com.google.android.exoplayer2.Player
    public final void prepare() {
        verifyApplicationThreadAndInitState();
        final State state = this.state;
        if (shouldHandleCommand(2)) {
            updateStateForPendingOperation(handlePrepare(), new parseUdtaMeta() { // from class: com.google.android.exoplayer2.SimpleBasePlayer$$ExternalSyntheticLambda39
                @Override // kotlin.parseUdtaMeta
                public final Object get() {
                    SimpleBasePlayer.State state2 = state;
                    return state2.buildUpon().setPlayerError(null).setPlaybackState(state2.timeline.isEmpty() ? 4 : 2).build();
                }
            });
        }
    }

    @Override // com.google.android.exoplayer2.Player
    public final int getPlaybackState() {
        verifyApplicationThreadAndInitState();
        return this.state.playbackState;
    }

    @Override // com.google.android.exoplayer2.Player
    public final int getPlaybackSuppressionReason() {
        verifyApplicationThreadAndInitState();
        return this.state.playbackSuppressionReason;
    }

    @Override // com.google.android.exoplayer2.Player
    public final PlaybackException getPlayerError() {
        verifyApplicationThreadAndInitState();
        return this.state.playerError;
    }

    @Override // com.google.android.exoplayer2.Player
    public final void setRepeatMode(final int i) {
        verifyApplicationThreadAndInitState();
        final State state = this.state;
        if (shouldHandleCommand(15)) {
            updateStateForPendingOperation(handleSetRepeatMode(i), new parseUdtaMeta() { // from class: com.google.android.exoplayer2.SimpleBasePlayer$$ExternalSyntheticLambda37
                @Override // kotlin.parseUdtaMeta
                public final Object get() {
                    return state.buildUpon().setRepeatMode(i).build();
                }
            });
        }
    }

    @Override // com.google.android.exoplayer2.Player
    public final int getRepeatMode() {
        verifyApplicationThreadAndInitState();
        return this.state.repeatMode;
    }

    @Override // com.google.android.exoplayer2.Player
    public final void setShuffleModeEnabled(final boolean z) {
        verifyApplicationThreadAndInitState();
        final State state = this.state;
        if (shouldHandleCommand(14)) {
            updateStateForPendingOperation(handleSetShuffleModeEnabled(z), new parseUdtaMeta() { // from class: com.google.android.exoplayer2.SimpleBasePlayer$$ExternalSyntheticLambda32
                @Override // kotlin.parseUdtaMeta
                public final Object get() {
                    return state.buildUpon().setShuffleModeEnabled(z).build();
                }
            });
        }
    }

    @Override // com.google.android.exoplayer2.Player
    public final boolean getShuffleModeEnabled() {
        verifyApplicationThreadAndInitState();
        return this.state.shuffleModeEnabled;
    }

    @Override // com.google.android.exoplayer2.Player
    public final boolean isLoading() {
        verifyApplicationThreadAndInitState();
        return this.state.isLoading;
    }

    @Override // com.google.android.exoplayer2.BasePlayer
    public final void seekTo(final int i, final long j, int i2, boolean z) {
        verifyApplicationThreadAndInitState();
        Assertions.checkArgument(i >= 0);
        final State state = this.state;
        if (!shouldHandleCommand(i2) || isPlayingAd()) {
            return;
        }
        if (state.playlist.isEmpty() || i < state.playlist.size()) {
            updateStateForPendingOperation(handleSeek(i, j, i2), new parseUdtaMeta() { // from class: com.google.android.exoplayer2.SimpleBasePlayer$$ExternalSyntheticLambda44
                @Override // kotlin.parseUdtaMeta
                public final Object get() {
                    SimpleBasePlayer.State state2 = state;
                    return SimpleBasePlayer.getStateWithNewPlaylistAndPosition(state2, state2.playlist, i, j);
                }
            }, true, z);
        }
    }

    @Override // com.google.android.exoplayer2.Player
    public final long getSeekBackIncrement() {
        verifyApplicationThreadAndInitState();
        return this.state.seekBackIncrementMs;
    }

    @Override // com.google.android.exoplayer2.Player
    public final long getSeekForwardIncrement() {
        verifyApplicationThreadAndInitState();
        return this.state.seekForwardIncrementMs;
    }

    @Override // com.google.android.exoplayer2.Player
    public final long getMaxSeekToPreviousPosition() {
        verifyApplicationThreadAndInitState();
        return this.state.maxSeekToPreviousPositionMs;
    }

    @Override // com.google.android.exoplayer2.Player
    public final void setPlaybackParameters(final PlaybackParameters playbackParameters) {
        verifyApplicationThreadAndInitState();
        final State state = this.state;
        if (shouldHandleCommand(13)) {
            updateStateForPendingOperation(handleSetPlaybackParameters(playbackParameters), new parseUdtaMeta() { // from class: com.google.android.exoplayer2.SimpleBasePlayer$$ExternalSyntheticLambda55
                @Override // kotlin.parseUdtaMeta
                public final Object get() {
                    return state.buildUpon().setPlaybackParameters(playbackParameters).build();
                }
            });
        }
    }

    @Override // com.google.android.exoplayer2.Player
    public final PlaybackParameters getPlaybackParameters() {
        verifyApplicationThreadAndInitState();
        return this.state.playbackParameters;
    }

    @Override // com.google.android.exoplayer2.Player
    public final void stop() {
        verifyApplicationThreadAndInitState();
        final State state = this.state;
        if (shouldHandleCommand(3)) {
            updateStateForPendingOperation(handleStop(), new parseUdtaMeta() { // from class: com.google.android.exoplayer2.SimpleBasePlayer$$ExternalSyntheticLambda38
                @Override // kotlin.parseUdtaMeta
                public final Object get() {
                    SimpleBasePlayer.State state2 = state;
                    return state2.buildUpon().setPlaybackState(1).setTotalBufferedDurationMs(SimpleBasePlayer.PositionSupplier.ZERO).setContentBufferedPositionMs(SimpleBasePlayer.PositionSupplier.getConstant(SimpleBasePlayer.getContentPositionMsInternal(state2))).setAdBufferedPositionMs(state2.adPositionMsSupplier).setIsLoading(false).build();
                }
            });
        }
    }

    @Override // com.google.android.exoplayer2.Player
    public final void release() {
        verifyApplicationThreadAndInitState();
        final State state = this.state;
        if (shouldHandleCommand(32)) {
            updateStateForPendingOperation(handleRelease(), new parseUdtaMeta() { // from class: com.google.android.exoplayer2.SimpleBasePlayer$$ExternalSyntheticLambda31
                @Override // kotlin.parseUdtaMeta
                public final Object get() {
                    return SimpleBasePlayer.lambda$release$13(state);
                }
            });
            this.released = true;
            this.listeners.release();
            this.state = this.state.buildUpon().setPlaybackState(1).setTotalBufferedDurationMs(PositionSupplier.ZERO).setContentBufferedPositionMs(PositionSupplier.getConstant(getContentPositionMsInternal(state))).setAdBufferedPositionMs(state.adPositionMsSupplier).setIsLoading(false).build();
        }
    }

    @Override // com.google.android.exoplayer2.Player
    public final Tracks getCurrentTracks() {
        verifyApplicationThreadAndInitState();
        return getCurrentTracksInternal(this.state);
    }

    @Override // com.google.android.exoplayer2.Player
    public final TrackSelectionParameters getTrackSelectionParameters() {
        verifyApplicationThreadAndInitState();
        return this.state.trackSelectionParameters;
    }

    @Override // com.google.android.exoplayer2.Player
    public final void setTrackSelectionParameters(final TrackSelectionParameters trackSelectionParameters) {
        verifyApplicationThreadAndInitState();
        final State state = this.state;
        if (shouldHandleCommand(29)) {
            updateStateForPendingOperation(handleSetTrackSelectionParameters(trackSelectionParameters), new parseUdtaMeta() { // from class: com.google.android.exoplayer2.SimpleBasePlayer$$ExternalSyntheticLambda56
                @Override // kotlin.parseUdtaMeta
                public final Object get() {
                    return state.buildUpon().setTrackSelectionParameters(trackSelectionParameters).build();
                }
            });
        }
    }

    @Override // com.google.android.exoplayer2.Player
    public final MediaMetadata getMediaMetadata() {
        verifyApplicationThreadAndInitState();
        return getMediaMetadataInternal(this.state);
    }

    @Override // com.google.android.exoplayer2.Player
    public final MediaMetadata getPlaylistMetadata() {
        verifyApplicationThreadAndInitState();
        return this.state.playlistMetadata;
    }

    @Override // com.google.android.exoplayer2.Player
    public final void setPlaylistMetadata(final MediaMetadata mediaMetadata) {
        verifyApplicationThreadAndInitState();
        final State state = this.state;
        if (shouldHandleCommand(19)) {
            updateStateForPendingOperation(handleSetPlaylistMetadata(mediaMetadata), new parseUdtaMeta() { // from class: com.google.android.exoplayer2.SimpleBasePlayer$$ExternalSyntheticLambda49
                @Override // kotlin.parseUdtaMeta
                public final Object get() {
                    return state.buildUpon().setPlaylistMetadata(mediaMetadata).build();
                }
            });
        }
    }

    @Override // com.google.android.exoplayer2.Player
    public final Timeline getCurrentTimeline() {
        verifyApplicationThreadAndInitState();
        return this.state.timeline;
    }

    @Override // com.google.android.exoplayer2.Player
    public final int getCurrentPeriodIndex() {
        verifyApplicationThreadAndInitState();
        return getCurrentPeriodIndexInternal(this.state, this.window, this.period);
    }

    @Override // com.google.android.exoplayer2.Player
    public final int getCurrentMediaItemIndex() {
        verifyApplicationThreadAndInitState();
        return getCurrentMediaItemIndexInternal(this.state);
    }

    @Override // com.google.android.exoplayer2.Player
    public final long getDuration() {
        verifyApplicationThreadAndInitState();
        if (isPlayingAd()) {
            this.state.timeline.getPeriod(getCurrentPeriodIndex(), this.period);
            return Util.usToMs(this.period.getAdDurationUs(this.state.currentAdGroupIndex, this.state.currentAdIndexInAdGroup));
        }
        return getContentDuration();
    }

    @Override // com.google.android.exoplayer2.Player
    public final long getCurrentPosition() {
        verifyApplicationThreadAndInitState();
        return isPlayingAd() ? this.state.adPositionMsSupplier.get() : getContentPosition();
    }

    @Override // com.google.android.exoplayer2.Player
    public final long getBufferedPosition() {
        verifyApplicationThreadAndInitState();
        if (isPlayingAd()) {
            return Math.max(this.state.adBufferedPositionMsSupplier.get(), this.state.adPositionMsSupplier.get());
        }
        return getContentBufferedPosition();
    }

    @Override // com.google.android.exoplayer2.Player
    public final long getTotalBufferedDuration() {
        verifyApplicationThreadAndInitState();
        return this.state.totalBufferedDurationMsSupplier.get();
    }

    @Override // com.google.android.exoplayer2.Player
    public final boolean isPlayingAd() {
        verifyApplicationThreadAndInitState();
        return this.state.currentAdGroupIndex != -1;
    }

    @Override // com.google.android.exoplayer2.Player
    public final int getCurrentAdGroupIndex() {
        verifyApplicationThreadAndInitState();
        return this.state.currentAdGroupIndex;
    }

    @Override // com.google.android.exoplayer2.Player
    public final int getCurrentAdIndexInAdGroup() {
        verifyApplicationThreadAndInitState();
        return this.state.currentAdIndexInAdGroup;
    }

    @Override // com.google.android.exoplayer2.Player
    public final long getContentPosition() {
        verifyApplicationThreadAndInitState();
        return getContentPositionMsInternal(this.state);
    }

    @Override // com.google.android.exoplayer2.Player
    public final long getContentBufferedPosition() {
        verifyApplicationThreadAndInitState();
        return Math.max(getContentBufferedPositionMsInternal(this.state), getContentPositionMsInternal(this.state));
    }

    @Override // com.google.android.exoplayer2.Player, com.google.android.exoplayer2.ExoPlayer.AudioComponent
    public final AudioAttributes getAudioAttributes() {
        verifyApplicationThreadAndInitState();
        return this.state.audioAttributes;
    }

    @Override // com.google.android.exoplayer2.Player, com.google.android.exoplayer2.ExoPlayer.AudioComponent
    public final void setVolume(final float f) {
        verifyApplicationThreadAndInitState();
        final State state = this.state;
        if (shouldHandleCommand(24)) {
            updateStateForPendingOperation(handleSetVolume(f), new parseUdtaMeta() { // from class: com.google.android.exoplayer2.SimpleBasePlayer$$ExternalSyntheticLambda34
                @Override // kotlin.parseUdtaMeta
                public final Object get() {
                    return state.buildUpon().setVolume(f).build();
                }
            });
        }
    }

    @Override // com.google.android.exoplayer2.Player, com.google.android.exoplayer2.ExoPlayer.AudioComponent
    public final float getVolume() {
        verifyApplicationThreadAndInitState();
        return this.state.volume;
    }

    @Override // com.google.android.exoplayer2.Player, com.google.android.exoplayer2.ExoPlayer.VideoComponent
    public final void setVideoSurface(Surface surface) {
        verifyApplicationThreadAndInitState();
        final State state = this.state;
        if (shouldHandleCommand(27)) {
            if (surface == null) {
                clearVideoSurface();
            } else {
                updateStateForPendingOperation(handleSetVideoOutput(surface), new parseUdtaMeta() { // from class: com.google.android.exoplayer2.SimpleBasePlayer$$ExternalSyntheticLambda35
                    @Override // kotlin.parseUdtaMeta
                    public final Object get() {
                        return state.buildUpon().setSurfaceSize(Size.UNKNOWN).build();
                    }
                });
            }
        }
    }

    @Override // com.google.android.exoplayer2.Player, com.google.android.exoplayer2.ExoPlayer.VideoComponent
    public final void setVideoSurfaceHolder(final SurfaceHolder surfaceHolder) {
        verifyApplicationThreadAndInitState();
        final State state = this.state;
        if (shouldHandleCommand(27)) {
            if (surfaceHolder == null) {
                clearVideoSurface();
            } else {
                updateStateForPendingOperation(handleSetVideoOutput(surfaceHolder), new parseUdtaMeta() { // from class: com.google.android.exoplayer2.SimpleBasePlayer$$ExternalSyntheticLambda52
                    @Override // kotlin.parseUdtaMeta
                    public final Object get() {
                        return state.buildUpon().setSurfaceSize(SimpleBasePlayer.getSurfaceHolderSize(surfaceHolder)).build();
                    }
                });
            }
        }
    }

    @Override // com.google.android.exoplayer2.Player, com.google.android.exoplayer2.ExoPlayer.VideoComponent
    public final void setVideoSurfaceView(final SurfaceView surfaceView) {
        verifyApplicationThreadAndInitState();
        final State state = this.state;
        if (shouldHandleCommand(27)) {
            if (surfaceView == null) {
                clearVideoSurface();
            } else {
                updateStateForPendingOperation(handleSetVideoOutput(surfaceView), new parseUdtaMeta() { // from class: com.google.android.exoplayer2.SimpleBasePlayer$$ExternalSyntheticLambda21
                    @Override // kotlin.parseUdtaMeta
                    public final Object get() {
                        return state.buildUpon().setSurfaceSize(SimpleBasePlayer.getSurfaceHolderSize(surfaceView.getHolder())).build();
                    }
                });
            }
        }
    }

    @Override // com.google.android.exoplayer2.Player, com.google.android.exoplayer2.ExoPlayer.VideoComponent
    public final void setVideoTextureView(TextureView textureView) {
        final Size size;
        verifyApplicationThreadAndInitState();
        final State state = this.state;
        if (shouldHandleCommand(27)) {
            if (textureView == null) {
                clearVideoSurface();
                return;
            }
            if (textureView.isAvailable()) {
                size = new Size(textureView.getWidth(), textureView.getHeight());
            } else {
                size = Size.ZERO;
            }
            updateStateForPendingOperation(handleSetVideoOutput(textureView), new parseUdtaMeta() { // from class: com.google.android.exoplayer2.SimpleBasePlayer$$ExternalSyntheticLambda54
                @Override // kotlin.parseUdtaMeta
                public final Object get() {
                    return state.buildUpon().setSurfaceSize(size).build();
                }
            });
        }
    }

    @Override // com.google.android.exoplayer2.Player, com.google.android.exoplayer2.ExoPlayer.VideoComponent
    public final void clearVideoSurface() {
        clearVideoOutput(null);
    }

    @Override // com.google.android.exoplayer2.Player, com.google.android.exoplayer2.ExoPlayer.VideoComponent
    public final void clearVideoSurface(Surface surface) {
        clearVideoOutput(surface);
    }

    @Override // com.google.android.exoplayer2.Player, com.google.android.exoplayer2.ExoPlayer.VideoComponent
    public final void clearVideoSurfaceHolder(SurfaceHolder surfaceHolder) {
        clearVideoOutput(surfaceHolder);
    }

    @Override // com.google.android.exoplayer2.Player, com.google.android.exoplayer2.ExoPlayer.VideoComponent
    public final void clearVideoSurfaceView(SurfaceView surfaceView) {
        clearVideoOutput(surfaceView);
    }

    @Override // com.google.android.exoplayer2.Player, com.google.android.exoplayer2.ExoPlayer.VideoComponent
    public final void clearVideoTextureView(TextureView textureView) {
        clearVideoOutput(textureView);
    }

    private void clearVideoOutput(Object obj) {
        verifyApplicationThreadAndInitState();
        final State state = this.state;
        if (shouldHandleCommand(27)) {
            updateStateForPendingOperation(handleClearVideoOutput(obj), new parseUdtaMeta() { // from class: com.google.android.exoplayer2.SimpleBasePlayer$$ExternalSyntheticLambda47
                @Override // kotlin.parseUdtaMeta
                public final Object get() {
                    return state.buildUpon().setSurfaceSize(Size.ZERO).build();
                }
            });
        }
    }

    @Override // com.google.android.exoplayer2.Player, com.google.android.exoplayer2.ExoPlayer.VideoComponent
    public final VideoSize getVideoSize() {
        verifyApplicationThreadAndInitState();
        return this.state.videoSize;
    }

    @Override // com.google.android.exoplayer2.Player
    public final Size getSurfaceSize() {
        verifyApplicationThreadAndInitState();
        return this.state.surfaceSize;
    }

    @Override // com.google.android.exoplayer2.Player, com.google.android.exoplayer2.ExoPlayer.TextComponent
    public final CueGroup getCurrentCues() {
        verifyApplicationThreadAndInitState();
        return this.state.currentCues;
    }

    @Override // com.google.android.exoplayer2.Player, com.google.android.exoplayer2.ExoPlayer.DeviceComponent
    public final DeviceInfo getDeviceInfo() {
        verifyApplicationThreadAndInitState();
        return this.state.deviceInfo;
    }

    @Override // com.google.android.exoplayer2.Player, com.google.android.exoplayer2.ExoPlayer.DeviceComponent
    public final int getDeviceVolume() {
        verifyApplicationThreadAndInitState();
        return this.state.deviceVolume;
    }

    @Override // com.google.android.exoplayer2.Player, com.google.android.exoplayer2.ExoPlayer.DeviceComponent
    public final boolean isDeviceMuted() {
        verifyApplicationThreadAndInitState();
        return this.state.isDeviceMuted;
    }

    @Override // com.google.android.exoplayer2.Player, com.google.android.exoplayer2.ExoPlayer.DeviceComponent
    @Deprecated
    public final void setDeviceVolume(final int i) {
        verifyApplicationThreadAndInitState();
        final State state = this.state;
        if (shouldHandleCommand(25)) {
            updateStateForPendingOperation(handleSetDeviceVolume(i, 1), new parseUdtaMeta() { // from class: com.google.android.exoplayer2.SimpleBasePlayer$$ExternalSyntheticLambda43
                @Override // kotlin.parseUdtaMeta
                public final Object get() {
                    return state.buildUpon().setDeviceVolume(i).build();
                }
            });
        }
    }

    @Override // com.google.android.exoplayer2.Player
    public final void setDeviceVolume(final int i, int i2) {
        verifyApplicationThreadAndInitState();
        final State state = this.state;
        if (shouldHandleCommand(33)) {
            updateStateForPendingOperation(handleSetDeviceVolume(i, i2), new parseUdtaMeta() { // from class: com.google.android.exoplayer2.SimpleBasePlayer$$ExternalSyntheticLambda45
                @Override // kotlin.parseUdtaMeta
                public final Object get() {
                    return state.buildUpon().setDeviceVolume(i).build();
                }
            });
        }
    }

    @Override // com.google.android.exoplayer2.Player, com.google.android.exoplayer2.ExoPlayer.DeviceComponent
    @Deprecated
    public final void increaseDeviceVolume() {
        verifyApplicationThreadAndInitState();
        final State state = this.state;
        if (shouldHandleCommand(26)) {
            updateStateForPendingOperation(handleIncreaseDeviceVolume(1), new parseUdtaMeta() { // from class: com.google.android.exoplayer2.SimpleBasePlayer$$ExternalSyntheticLambda11
                @Override // kotlin.parseUdtaMeta
                public final Object get() {
                    SimpleBasePlayer.State state2 = state;
                    return state2.buildUpon().setDeviceVolume(state2.deviceVolume + 1).build();
                }
            });
        }
    }

    @Override // com.google.android.exoplayer2.Player
    public final void increaseDeviceVolume(int i) {
        verifyApplicationThreadAndInitState();
        final State state = this.state;
        if (shouldHandleCommand(34)) {
            updateStateForPendingOperation(handleIncreaseDeviceVolume(i), new parseUdtaMeta() { // from class: com.google.android.exoplayer2.SimpleBasePlayer$$ExternalSyntheticLambda36
                @Override // kotlin.parseUdtaMeta
                public final Object get() {
                    SimpleBasePlayer.State state2 = state;
                    return state2.buildUpon().setDeviceVolume(state2.deviceVolume + 1).build();
                }
            });
        }
    }

    @Override // com.google.android.exoplayer2.Player, com.google.android.exoplayer2.ExoPlayer.DeviceComponent
    @Deprecated
    public final void decreaseDeviceVolume() {
        verifyApplicationThreadAndInitState();
        final State state = this.state;
        if (shouldHandleCommand(26)) {
            updateStateForPendingOperation(handleDecreaseDeviceVolume(1), new parseUdtaMeta() { // from class: com.google.android.exoplayer2.SimpleBasePlayer$$ExternalSyntheticLambda40
                @Override // kotlin.parseUdtaMeta
                public final Object get() {
                    return state.buildUpon().setDeviceVolume(Math.max(0, r0.deviceVolume - 1)).build();
                }
            });
        }
    }

    @Override // com.google.android.exoplayer2.Player
    public final void decreaseDeviceVolume(int i) {
        verifyApplicationThreadAndInitState();
        final State state = this.state;
        if (shouldHandleCommand(34)) {
            updateStateForPendingOperation(handleDecreaseDeviceVolume(i), new parseUdtaMeta() { // from class: com.google.android.exoplayer2.SimpleBasePlayer$$ExternalSyntheticLambda33
                @Override // kotlin.parseUdtaMeta
                public final Object get() {
                    return state.buildUpon().setDeviceVolume(Math.max(0, r0.deviceVolume - 1)).build();
                }
            });
        }
    }

    @Override // com.google.android.exoplayer2.Player, com.google.android.exoplayer2.ExoPlayer.DeviceComponent
    @Deprecated
    public final void setDeviceMuted(final boolean z) {
        verifyApplicationThreadAndInitState();
        final State state = this.state;
        if (shouldHandleCommand(26)) {
            updateStateForPendingOperation(handleSetDeviceMuted(z, 1), new parseUdtaMeta() { // from class: com.google.android.exoplayer2.SimpleBasePlayer$$ExternalSyntheticLambda46
                @Override // kotlin.parseUdtaMeta
                public final Object get() {
                    return state.buildUpon().setIsDeviceMuted(z).build();
                }
            });
        }
    }

    @Override // com.google.android.exoplayer2.Player
    public final void setDeviceMuted(final boolean z, int i) {
        verifyApplicationThreadAndInitState();
        final State state = this.state;
        if (shouldHandleCommand(34)) {
            updateStateForPendingOperation(handleSetDeviceMuted(z, i), new parseUdtaMeta() { // from class: com.google.android.exoplayer2.SimpleBasePlayer$$ExternalSyntheticLambda51
                @Override // kotlin.parseUdtaMeta
                public final Object get() {
                    return state.buildUpon().setIsDeviceMuted(z).build();
                }
            });
        }
    }

    protected final void invalidateState() {
        verifyApplicationThreadAndInitState();
        if (!this.pendingOperations.isEmpty() || this.released) {
            return;
        }
        updateStateAndInformListeners(getState(), false, false);
    }

    protected MediaItemData getPlaceholderMediaItemData(MediaItem mediaItem) {
        return new MediaItemData.Builder(new PlaceholderUid()).setMediaItem(mediaItem).setIsDynamic(true).setIsPlaceholder(true).build();
    }

    protected Mp4ExtractorExternalSyntheticLambda0<?> handleSetPlayWhenReady(boolean z) {
        throw new IllegalStateException("Missing implementation to handle COMMAND_PLAY_PAUSE");
    }

    protected Mp4ExtractorExternalSyntheticLambda0<?> handlePrepare() {
        throw new IllegalStateException("Missing implementation to handle COMMAND_PREPARE");
    }

    protected Mp4ExtractorExternalSyntheticLambda0<?> handleStop() {
        throw new IllegalStateException("Missing implementation to handle COMMAND_STOP");
    }

    protected Mp4ExtractorExternalSyntheticLambda0<?> handleRelease() {
        throw new IllegalStateException("Missing implementation to handle COMMAND_RELEASE");
    }

    protected Mp4ExtractorExternalSyntheticLambda0<?> handleSetRepeatMode(int i) {
        throw new IllegalStateException("Missing implementation to handle COMMAND_SET_REPEAT_MODE");
    }

    protected Mp4ExtractorExternalSyntheticLambda0<?> handleSetShuffleModeEnabled(boolean z) {
        throw new IllegalStateException("Missing implementation to handle COMMAND_SET_SHUFFLE_MODE");
    }

    protected Mp4ExtractorExternalSyntheticLambda0<?> handleSetPlaybackParameters(PlaybackParameters playbackParameters) {
        throw new IllegalStateException("Missing implementation to handle COMMAND_SET_SPEED_AND_PITCH");
    }

    protected Mp4ExtractorExternalSyntheticLambda0<?> handleSetTrackSelectionParameters(TrackSelectionParameters trackSelectionParameters) {
        throw new IllegalStateException("Missing implementation to handle COMMAND_SET_TRACK_SELECTION_PARAMETERS");
    }

    protected Mp4ExtractorExternalSyntheticLambda0<?> handleSetPlaylistMetadata(MediaMetadata mediaMetadata) {
        throw new IllegalStateException("Missing implementation to handle COMMAND_SET_PLAYLIST_METADATA");
    }

    protected Mp4ExtractorExternalSyntheticLambda0<?> handleSetVolume(float f) {
        throw new IllegalStateException("Missing implementation to handle COMMAND_SET_VOLUME");
    }

    protected Mp4ExtractorExternalSyntheticLambda0<?> handleSetDeviceVolume(int i, int i2) {
        throw new IllegalStateException("Missing implementation to handle COMMAND_SET_DEVICE_VOLUME or COMMAND_SET_DEVICE_VOLUME_WITH_FLAGS");
    }

    protected Mp4ExtractorExternalSyntheticLambda0<?> handleIncreaseDeviceVolume(int i) {
        throw new IllegalStateException("Missing implementation to handle COMMAND_ADJUST_DEVICE_VOLUME or COMMAND_ADJUST_DEVICE_VOLUME_WITH_FLAGS");
    }

    protected Mp4ExtractorExternalSyntheticLambda0<?> handleDecreaseDeviceVolume(int i) {
        throw new IllegalStateException("Missing implementation to handle COMMAND_ADJUST_DEVICE_VOLUME or COMMAND_ADJUST_DEVICE_VOLUME_WITH_FLAGS");
    }

    protected Mp4ExtractorExternalSyntheticLambda0<?> handleSetDeviceMuted(boolean z, int i) {
        throw new IllegalStateException("Missing implementation to handle COMMAND_ADJUST_DEVICE_VOLUME or COMMAND_ADJUST_DEVICE_VOLUME_WITH_FLAGS");
    }

    protected Mp4ExtractorExternalSyntheticLambda0<?> handleSetVideoOutput(Object obj) {
        throw new IllegalStateException("Missing implementation to handle COMMAND_SET_VIDEO_SURFACE");
    }

    protected Mp4ExtractorExternalSyntheticLambda0<?> handleClearVideoOutput(Object obj) {
        throw new IllegalStateException("Missing implementation to handle COMMAND_SET_VIDEO_SURFACE");
    }

    protected Mp4ExtractorExternalSyntheticLambda0<?> handleSetMediaItems(List<MediaItem> list, int i, long j) {
        throw new IllegalStateException("Missing implementation to handle COMMAND_SET_MEDIA_ITEM(S)");
    }

    protected Mp4ExtractorExternalSyntheticLambda0<?> handleAddMediaItems(int i, List<MediaItem> list) {
        throw new IllegalStateException("Missing implementation to handle COMMAND_CHANGE_MEDIA_ITEMS");
    }

    protected Mp4ExtractorExternalSyntheticLambda0<?> handleMoveMediaItems(int i, int i2, int i3) {
        throw new IllegalStateException("Missing implementation to handle COMMAND_CHANGE_MEDIA_ITEMS");
    }

    protected Mp4ExtractorExternalSyntheticLambda0<?> handleReplaceMediaItems(int i, int i2, List<MediaItem> list) {
        Mp4ExtractorExternalSyntheticLambda0<?> mp4ExtractorExternalSyntheticLambda0HandleAddMediaItems = handleAddMediaItems(i2, list);
        final Mp4ExtractorExternalSyntheticLambda0<?> mp4ExtractorExternalSyntheticLambda0HandleRemoveMediaItems = handleRemoveMediaItems(i, i2);
        return Util.transformFutureAsync(mp4ExtractorExternalSyntheticLambda0HandleAddMediaItems, new getTrackIndexOfNextReadSample() { // from class: com.google.android.exoplayer2.SimpleBasePlayer$$ExternalSyntheticLambda48
            @Override // kotlin.getTrackIndexOfNextReadSample
            public final Mp4ExtractorExternalSyntheticLambda0 apply(Object obj) {
                return SimpleBasePlayer.lambda$handleReplaceMediaItems$30(mp4ExtractorExternalSyntheticLambda0HandleRemoveMediaItems, obj);
            }
        });
    }

    protected Mp4ExtractorExternalSyntheticLambda0<?> handleRemoveMediaItems(int i, int i2) {
        throw new IllegalStateException("Missing implementation to handle COMMAND_CHANGE_MEDIA_ITEMS");
    }

    protected Mp4ExtractorExternalSyntheticLambda0<?> handleSeek(int i, long j, int i2) {
        throw new IllegalStateException("Missing implementation to handle one of the COMMAND_SEEK_*");
    }

    private boolean shouldHandleCommand(int i) {
        return !this.released && this.state.availableCommands.contains(i);
    }

    private void updateStateAndInformListeners(final State state, boolean z, boolean z2) {
        State state2 = this.state;
        this.state = state;
        if (state.hasPositionDiscontinuity || state.newlyRenderedFirstFrame) {
            this.state = this.state.buildUpon().clearPositionDiscontinuity().setNewlyRenderedFirstFrame(false).build();
        }
        boolean z3 = state2.playWhenReady != state.playWhenReady;
        boolean z4 = state2.playbackState != state.playbackState;
        Tracks currentTracksInternal = getCurrentTracksInternal(state2);
        final Tracks currentTracksInternal2 = getCurrentTracksInternal(state);
        MediaMetadata mediaMetadataInternal = getMediaMetadataInternal(state2);
        final MediaMetadata mediaMetadataInternal2 = getMediaMetadataInternal(state);
        final int positionDiscontinuityReason = getPositionDiscontinuityReason(state2, state, z, this.window, this.period);
        boolean zEquals = state2.timeline.equals(state.timeline);
        final int mediaItemTransitionReason = getMediaItemTransitionReason(state2, state, positionDiscontinuityReason, z2, this.window);
        if (!zEquals) {
            final int timelineChangeReason = getTimelineChangeReason(state2.playlist, state.playlist);
            this.listeners.queueEvent(0, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.SimpleBasePlayer$$ExternalSyntheticLambda60
                @Override // com.google.android.exoplayer2.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    Player.Listener listener = (Player.Listener) obj;
                    listener.onTimelineChanged(state.timeline, timelineChangeReason);
                }
            });
        }
        if (positionDiscontinuityReason != -1) {
            final Player.PositionInfo positionInfo = getPositionInfo(state2, false, this.window, this.period);
            final Player.PositionInfo positionInfo2 = getPositionInfo(state, state.hasPositionDiscontinuity, this.window, this.period);
            this.listeners.queueEvent(11, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.SimpleBasePlayer$$ExternalSyntheticLambda9
                @Override // com.google.android.exoplayer2.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    SimpleBasePlayer.lambda$updateStateAndInformListeners$32(positionDiscontinuityReason, positionInfo, positionInfo2, (Player.Listener) obj);
                }
            });
        }
        if (mediaItemTransitionReason != -1) {
            final MediaItem mediaItem = state.timeline.isEmpty() ? null : state.playlist.get(getCurrentMediaItemIndexInternal(state)).mediaItem;
            this.listeners.queueEvent(1, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.SimpleBasePlayer$$ExternalSyntheticLambda20
                @Override // com.google.android.exoplayer2.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    ((Player.Listener) obj).onMediaItemTransition(mediaItem, mediaItemTransitionReason);
                }
            });
        }
        if (!Util.areEqual(state2.playerError, state.playerError)) {
            this.listeners.queueEvent(10, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.SimpleBasePlayer$$ExternalSyntheticLambda23
                @Override // com.google.android.exoplayer2.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    ((Player.Listener) obj).onPlayerErrorChanged(state.playerError);
                }
            });
            if (state.playerError != null) {
                this.listeners.queueEvent(10, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.SimpleBasePlayer$$ExternalSyntheticLambda24
                    @Override // com.google.android.exoplayer2.util.ListenerSet.Event
                    public final void invoke(Object obj) {
                        ((Player.Listener) obj).onPlayerError((PlaybackException) Util.castNonNull(state.playerError));
                    }
                });
            }
        }
        if (!state2.trackSelectionParameters.equals(state.trackSelectionParameters)) {
            this.listeners.queueEvent(19, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.SimpleBasePlayer$$ExternalSyntheticLambda25
                @Override // com.google.android.exoplayer2.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    ((Player.Listener) obj).onTrackSelectionParametersChanged(state.trackSelectionParameters);
                }
            });
        }
        if (!currentTracksInternal.equals(currentTracksInternal2)) {
            this.listeners.queueEvent(2, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.SimpleBasePlayer$$ExternalSyntheticLambda26
                @Override // com.google.android.exoplayer2.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    ((Player.Listener) obj).onTracksChanged(currentTracksInternal2);
                }
            });
        }
        if (!mediaMetadataInternal.equals(mediaMetadataInternal2)) {
            this.listeners.queueEvent(14, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.SimpleBasePlayer$$ExternalSyntheticLambda27
                @Override // com.google.android.exoplayer2.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    ((Player.Listener) obj).onMediaMetadataChanged(mediaMetadataInternal2);
                }
            });
        }
        if (state2.isLoading != state.isLoading) {
            this.listeners.queueEvent(3, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.SimpleBasePlayer$$ExternalSyntheticLambda28
                @Override // com.google.android.exoplayer2.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    SimpleBasePlayer.lambda$updateStateAndInformListeners$39(state, (Player.Listener) obj);
                }
            });
        }
        if (z3 || z4) {
            this.listeners.queueEvent(-1, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.SimpleBasePlayer$$ExternalSyntheticLambda29
                @Override // com.google.android.exoplayer2.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    SimpleBasePlayer.State state3 = state;
                    ((Player.Listener) obj).onPlayerStateChanged(state3.playWhenReady, state3.playbackState);
                }
            });
        }
        if (z4) {
            this.listeners.queueEvent(4, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.SimpleBasePlayer$$ExternalSyntheticLambda61
                @Override // com.google.android.exoplayer2.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    ((Player.Listener) obj).onPlaybackStateChanged(state.playbackState);
                }
            });
        }
        if (z3 || state2.playWhenReadyChangeReason != state.playWhenReadyChangeReason) {
            this.listeners.queueEvent(5, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.SimpleBasePlayer$$ExternalSyntheticLambda62
                @Override // com.google.android.exoplayer2.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    SimpleBasePlayer.State state3 = state;
                    ((Player.Listener) obj).onPlayWhenReadyChanged(state3.playWhenReady, state3.playWhenReadyChangeReason);
                }
            });
        }
        if (state2.playbackSuppressionReason != state.playbackSuppressionReason) {
            this.listeners.queueEvent(6, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.SimpleBasePlayer$$ExternalSyntheticLambda1
                @Override // com.google.android.exoplayer2.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    ((Player.Listener) obj).onPlaybackSuppressionReasonChanged(state.playbackSuppressionReason);
                }
            });
        }
        if (isPlaying(state2) != isPlaying(state)) {
            this.listeners.queueEvent(7, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.SimpleBasePlayer$$ExternalSyntheticLambda2
                @Override // com.google.android.exoplayer2.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    ((Player.Listener) obj).onIsPlayingChanged(SimpleBasePlayer.isPlaying(state));
                }
            });
        }
        if (!state2.playbackParameters.equals(state.playbackParameters)) {
            this.listeners.queueEvent(12, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.SimpleBasePlayer$$ExternalSyntheticLambda3
                @Override // com.google.android.exoplayer2.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    ((Player.Listener) obj).onPlaybackParametersChanged(state.playbackParameters);
                }
            });
        }
        if (state2.repeatMode != state.repeatMode) {
            this.listeners.queueEvent(8, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.SimpleBasePlayer$$ExternalSyntheticLambda4
                @Override // com.google.android.exoplayer2.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    ((Player.Listener) obj).onRepeatModeChanged(state.repeatMode);
                }
            });
        }
        if (state2.shuffleModeEnabled != state.shuffleModeEnabled) {
            this.listeners.queueEvent(9, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.SimpleBasePlayer$$ExternalSyntheticLambda5
                @Override // com.google.android.exoplayer2.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    ((Player.Listener) obj).onShuffleModeEnabledChanged(state.shuffleModeEnabled);
                }
            });
        }
        if (state2.seekBackIncrementMs != state.seekBackIncrementMs) {
            this.listeners.queueEvent(16, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.SimpleBasePlayer$$ExternalSyntheticLambda6
                @Override // com.google.android.exoplayer2.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    ((Player.Listener) obj).onSeekBackIncrementChanged(state.seekBackIncrementMs);
                }
            });
        }
        if (state2.seekForwardIncrementMs != state.seekForwardIncrementMs) {
            this.listeners.queueEvent(17, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.SimpleBasePlayer$$ExternalSyntheticLambda7
                @Override // com.google.android.exoplayer2.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    ((Player.Listener) obj).onSeekForwardIncrementChanged(state.seekForwardIncrementMs);
                }
            });
        }
        if (state2.maxSeekToPreviousPositionMs != state.maxSeekToPreviousPositionMs) {
            this.listeners.queueEvent(18, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.SimpleBasePlayer$$ExternalSyntheticLambda8
                @Override // com.google.android.exoplayer2.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    ((Player.Listener) obj).onMaxSeekToPreviousPositionChanged(state.maxSeekToPreviousPositionMs);
                }
            });
        }
        if (!state2.audioAttributes.equals(state.audioAttributes)) {
            this.listeners.queueEvent(20, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.SimpleBasePlayer$$ExternalSyntheticLambda10
                @Override // com.google.android.exoplayer2.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    ((Player.Listener) obj).onAudioAttributesChanged(state.audioAttributes);
                }
            });
        }
        if (!state2.videoSize.equals(state.videoSize)) {
            this.listeners.queueEvent(25, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.SimpleBasePlayer$$ExternalSyntheticLambda12
                @Override // com.google.android.exoplayer2.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    ((Player.Listener) obj).onVideoSizeChanged(state.videoSize);
                }
            });
        }
        if (!state2.deviceInfo.equals(state.deviceInfo)) {
            this.listeners.queueEvent(29, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.SimpleBasePlayer$$ExternalSyntheticLambda13
                @Override // com.google.android.exoplayer2.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    ((Player.Listener) obj).onDeviceInfoChanged(state.deviceInfo);
                }
            });
        }
        if (!state2.playlistMetadata.equals(state.playlistMetadata)) {
            this.listeners.queueEvent(15, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.SimpleBasePlayer$$ExternalSyntheticLambda14
                @Override // com.google.android.exoplayer2.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    ((Player.Listener) obj).onPlaylistMetadataChanged(state.playlistMetadata);
                }
            });
        }
        if (state.newlyRenderedFirstFrame) {
            this.listeners.queueEvent(26, new ExoPlayerImpl$ComponentListener$$ExternalSyntheticLambda4());
        }
        if (!state2.surfaceSize.equals(state.surfaceSize)) {
            this.listeners.queueEvent(24, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.SimpleBasePlayer$$ExternalSyntheticLambda15
                @Override // com.google.android.exoplayer2.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    SimpleBasePlayer.State state3 = state;
                    ((Player.Listener) obj).onSurfaceSizeChanged(state3.surfaceSize.getWidth(), state3.surfaceSize.getHeight());
                }
            });
        }
        if (state2.volume != state.volume) {
            this.listeners.queueEvent(22, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.SimpleBasePlayer$$ExternalSyntheticLambda16
                @Override // com.google.android.exoplayer2.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    ((Player.Listener) obj).onVolumeChanged(state.volume);
                }
            });
        }
        if (state2.deviceVolume != state.deviceVolume || state2.isDeviceMuted != state.isDeviceMuted) {
            this.listeners.queueEvent(30, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.SimpleBasePlayer$$ExternalSyntheticLambda17
                @Override // com.google.android.exoplayer2.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    SimpleBasePlayer.State state3 = state;
                    ((Player.Listener) obj).onDeviceVolumeChanged(state3.deviceVolume, state3.isDeviceMuted);
                }
            });
        }
        if (!state2.currentCues.equals(state.currentCues)) {
            this.listeners.queueEvent(27, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.SimpleBasePlayer$$ExternalSyntheticLambda18
                @Override // com.google.android.exoplayer2.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    SimpleBasePlayer.lambda$updateStateAndInformListeners$58(state, (Player.Listener) obj);
                }
            });
        }
        if (!state2.timedMetadata.equals(state.timedMetadata) && state.timedMetadata.presentationTimeUs != C.TIME_UNSET) {
            this.listeners.queueEvent(28, new SimpleBasePlayer$$ExternalSyntheticLambda19(state));
        }
        if (!state2.availableCommands.equals(state.availableCommands)) {
            this.listeners.queueEvent(13, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.SimpleBasePlayer$$ExternalSyntheticLambda22
                @Override // com.google.android.exoplayer2.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    ((Player.Listener) obj).onAvailableCommandsChanged(state.availableCommands);
                }
            });
        }
        this.listeners.flushEvents();
    }

    static /* synthetic */ void lambda$updateStateAndInformListeners$32(int i, Player.PositionInfo positionInfo, Player.PositionInfo positionInfo2, Player.Listener listener) {
        listener.onPositionDiscontinuity(i);
        listener.onPositionDiscontinuity(positionInfo, positionInfo2, i);
    }

    static /* synthetic */ void lambda$updateStateAndInformListeners$39(State state, Player.Listener listener) {
        listener.onLoadingChanged(state.isLoading);
        listener.onIsLoadingChanged(state.isLoading);
    }

    static /* synthetic */ void lambda$updateStateAndInformListeners$58(State state, Player.Listener listener) {
        listener.onCues(state.currentCues.cues);
        listener.onCues(state.currentCues);
    }

    private void verifyApplicationThreadAndInitState() {
        if (Thread.currentThread() != this.applicationLooper.getThread()) {
            throw new IllegalStateException(Util.formatInvariant("Player is accessed on the wrong thread.\nCurrent thread: '%s'\nExpected thread: '%s'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread", Thread.currentThread().getName(), this.applicationLooper.getThread().getName()));
        }
        if (this.state == null) {
            this.state = getState();
        }
    }

    private void updateStateForPendingOperation(Mp4ExtractorExternalSyntheticLambda0<?> mp4ExtractorExternalSyntheticLambda0, parseUdtaMeta<State> parseudtameta) {
        updateStateForPendingOperation(mp4ExtractorExternalSyntheticLambda0, parseudtameta, false, false);
    }

    private void updateStateForPendingOperation(final Mp4ExtractorExternalSyntheticLambda0<?> mp4ExtractorExternalSyntheticLambda0, parseUdtaMeta<State> parseudtameta, boolean z, boolean z2) {
        if (mp4ExtractorExternalSyntheticLambda0.isDone() && this.pendingOperations.isEmpty()) {
            updateStateAndInformListeners(getState(), z, z2);
            return;
        }
        this.pendingOperations.add(mp4ExtractorExternalSyntheticLambda0);
        updateStateAndInformListeners(getPlaceholderState(parseudtameta.get()), z, z2);
        mp4ExtractorExternalSyntheticLambda0.IconCompatParcelizer(new Runnable() { // from class: com.google.android.exoplayer2.SimpleBasePlayer$$ExternalSyntheticLambda41
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m58lambda$updateStateForPendingOperation$61$comgoogleandroidexoplayer2SimpleBasePlayer(mp4ExtractorExternalSyntheticLambda0);
            }
        }, new Executor() { // from class: com.google.android.exoplayer2.SimpleBasePlayer$$ExternalSyntheticLambda42
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                this.f$0.postOrRunOnApplicationHandler(runnable);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$updateStateForPendingOperation$61$com-google-android-exoplayer2-SimpleBasePlayer, reason: not valid java name */
    /* synthetic */ void m58lambda$updateStateForPendingOperation$61$comgoogleandroidexoplayer2SimpleBasePlayer(Mp4ExtractorExternalSyntheticLambda0 mp4ExtractorExternalSyntheticLambda0) {
        Util.castNonNull(this.state);
        this.pendingOperations.remove(mp4ExtractorExternalSyntheticLambda0);
        if (!this.pendingOperations.isEmpty() || this.released) {
            return;
        }
        updateStateAndInformListeners(getState(), false, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void postOrRunOnApplicationHandler(Runnable runnable) {
        if (this.applicationHandler.getLooper() == Looper.myLooper()) {
            runnable.run();
        } else {
            this.applicationHandler.post(runnable);
        }
    }

    private static boolean isPlaying(State state) {
        return state.playWhenReady && state.playbackState == 3 && state.playbackSuppressionReason == 0;
    }

    private static Tracks getCurrentTracksInternal(State state) {
        if (state.playlist.isEmpty()) {
            return Tracks.EMPTY;
        }
        return state.playlist.get(getCurrentMediaItemIndexInternal(state)).tracks;
    }

    private static MediaMetadata getMediaMetadataInternal(State state) {
        if (!state.playlist.isEmpty()) {
            return state.playlist.get(getCurrentMediaItemIndexInternal(state)).combinedMediaMetadata;
        }
        return MediaMetadata.EMPTY;
    }

    private static int getCurrentMediaItemIndexInternal(State state) {
        if (state.currentMediaItemIndex != -1) {
            return state.currentMediaItemIndex;
        }
        return 0;
    }

    private static long getContentPositionMsInternal(State state) {
        return getPositionOrDefaultInMediaItem(state.contentPositionMsSupplier.get(), state);
    }

    private static long getContentBufferedPositionMsInternal(State state) {
        return getPositionOrDefaultInMediaItem(state.contentBufferedPositionMsSupplier.get(), state);
    }

    private static long getPositionOrDefaultInMediaItem(long j, State state) {
        if (j != C.TIME_UNSET) {
            return j;
        }
        if (state.playlist.isEmpty()) {
            return 0L;
        }
        return Util.usToMs(state.playlist.get(getCurrentMediaItemIndexInternal(state)).defaultPositionUs);
    }

    private static int getCurrentPeriodIndexInternal(State state, Timeline.Window window, Timeline.Period period) {
        int currentMediaItemIndexInternal = getCurrentMediaItemIndexInternal(state);
        return state.timeline.isEmpty() ? currentMediaItemIndexInternal : getPeriodIndexFromWindowPosition(state.timeline, currentMediaItemIndexInternal, getContentPositionMsInternal(state), window, period);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int getPeriodIndexFromWindowPosition(Timeline timeline, int i, long j, Timeline.Window window, Timeline.Period period) {
        return timeline.getIndexOfPeriod(timeline.getPeriodPositionUs(window, period, i, Util.msToUs(j)).first);
    }

    private static int getTimelineChangeReason(List<MediaItemData> list, List<MediaItemData> list2) {
        if (list.size() != list2.size()) {
            return 0;
        }
        int i = 0;
        while (true) {
            if (i >= list.size()) {
                return 1;
            }
            Object obj = list.get(i).uid;
            Object obj2 = list2.get(i).uid;
            boolean z = (obj instanceof PlaceholderUid) && !(obj2 instanceof PlaceholderUid);
            if (!obj.equals(obj2) && !z) {
                return 0;
            }
            i++;
        }
    }

    private static int getPositionDiscontinuityReason(State state, State state2, boolean z, Timeline.Window window, Timeline.Period period) {
        if (state2.hasPositionDiscontinuity) {
            return state2.positionDiscontinuityReason;
        }
        if (z) {
            return 1;
        }
        if (state.playlist.isEmpty()) {
            return -1;
        }
        if (state2.playlist.isEmpty()) {
            return 4;
        }
        Object uidOfPeriod = state.timeline.getUidOfPeriod(getCurrentPeriodIndexInternal(state, window, period));
        Object uidOfPeriod2 = state2.timeline.getUidOfPeriod(getCurrentPeriodIndexInternal(state2, window, period));
        if ((uidOfPeriod instanceof PlaceholderUid) && !(uidOfPeriod2 instanceof PlaceholderUid)) {
            return -1;
        }
        if (!uidOfPeriod2.equals(uidOfPeriod) || state.currentAdGroupIndex != state2.currentAdGroupIndex || state.currentAdIndexInAdGroup != state2.currentAdIndexInAdGroup) {
            if (state2.timeline.getIndexOfPeriod(uidOfPeriod) == -1) {
                return 4;
            }
            long currentPeriodOrAdPositionMs = getCurrentPeriodOrAdPositionMs(state, uidOfPeriod, period);
            long periodOrAdDurationMs = getPeriodOrAdDurationMs(state, uidOfPeriod, period);
            return (periodOrAdDurationMs == C.TIME_UNSET || currentPeriodOrAdPositionMs < periodOrAdDurationMs) ? 3 : 0;
        }
        long currentPeriodOrAdPositionMs2 = getCurrentPeriodOrAdPositionMs(state, uidOfPeriod, period);
        if (Math.abs(currentPeriodOrAdPositionMs2 - getCurrentPeriodOrAdPositionMs(state2, uidOfPeriod2, period)) < 1000) {
            return -1;
        }
        long periodOrAdDurationMs2 = getPeriodOrAdDurationMs(state, uidOfPeriod, period);
        return (periodOrAdDurationMs2 == C.TIME_UNSET || currentPeriodOrAdPositionMs2 < periodOrAdDurationMs2) ? 5 : 0;
    }

    private static long getCurrentPeriodOrAdPositionMs(State state, Object obj, Timeline.Period period) {
        if (state.currentAdGroupIndex != -1) {
            return state.adPositionMsSupplier.get();
        }
        return getContentPositionMsInternal(state) - state.timeline.getPeriodByUid(obj, period).getPositionInWindowMs();
    }

    private static long getPeriodOrAdDurationMs(State state, Object obj, Timeline.Period period) {
        long adDurationUs;
        state.timeline.getPeriodByUid(obj, period);
        if (state.currentAdGroupIndex == -1) {
            adDurationUs = period.durationUs;
        } else {
            adDurationUs = period.getAdDurationUs(state.currentAdGroupIndex, state.currentAdIndexInAdGroup);
        }
        return Util.usToMs(adDurationUs);
    }

    private static Player.PositionInfo getPositionInfo(State state, boolean z, Timeline.Window window, Timeline.Period period) {
        Object obj;
        MediaItem mediaItem;
        Object obj2;
        int i;
        long j;
        long contentPositionMsInternal;
        int currentMediaItemIndexInternal = getCurrentMediaItemIndexInternal(state);
        if (state.timeline.isEmpty()) {
            obj = null;
            mediaItem = null;
            obj2 = null;
            i = -1;
        } else {
            int currentPeriodIndexInternal = getCurrentPeriodIndexInternal(state, window, period);
            Object obj3 = state.timeline.getPeriod(currentPeriodIndexInternal, period, true).uid;
            Object obj4 = state.timeline.getWindow(currentMediaItemIndexInternal, window).uid;
            i = currentPeriodIndexInternal;
            mediaItem = window.mediaItem;
            obj = obj4;
            obj2 = obj3;
        }
        if (z) {
            j = state.discontinuityPositionMs;
            contentPositionMsInternal = state.currentAdGroupIndex == -1 ? j : getContentPositionMsInternal(state);
        } else {
            long contentPositionMsInternal2 = getContentPositionMsInternal(state);
            j = state.currentAdGroupIndex != -1 ? state.adPositionMsSupplier.get() : contentPositionMsInternal2;
            contentPositionMsInternal = contentPositionMsInternal2;
        }
        return new Player.PositionInfo(obj, currentMediaItemIndexInternal, mediaItem, obj2, i, j, contentPositionMsInternal, state.currentAdGroupIndex, state.currentAdIndexInAdGroup);
    }

    private static int getMediaItemTransitionReason(State state, State state2, int i, boolean z, Timeline.Window window) {
        Timeline timeline = state.timeline;
        Timeline timeline2 = state2.timeline;
        if (timeline2.isEmpty() && timeline.isEmpty()) {
            return -1;
        }
        if (timeline2.isEmpty() != timeline.isEmpty()) {
            return 3;
        }
        Object obj = state.timeline.getWindow(getCurrentMediaItemIndexInternal(state), window).uid;
        Object obj2 = state2.timeline.getWindow(getCurrentMediaItemIndexInternal(state2), window).uid;
        if ((obj instanceof PlaceholderUid) && !(obj2 instanceof PlaceholderUid)) {
            return -1;
        }
        if (!obj.equals(obj2)) {
            if (i == 0) {
                return 1;
            }
            return i == 1 ? 2 : 3;
        }
        if (i != 0 || getContentPositionMsInternal(state) <= getContentPositionMsInternal(state2)) {
            return (i == 1 && z) ? 2 : -1;
        }
        return 0;
    }

    private static Size getSurfaceHolderSize(SurfaceHolder surfaceHolder) {
        if (!surfaceHolder.getSurface().isValid()) {
            return Size.ZERO;
        }
        Rect surfaceFrame = surfaceHolder.getSurfaceFrame();
        return new Size(surfaceFrame.width(), surfaceFrame.height());
    }

    private static int getMediaItemIndexInNewPlaylist(List<MediaItemData> list, Timeline timeline, int i, Timeline.Period period) {
        if (!list.isEmpty()) {
            Object periodUid = list.get(i).getPeriodUid(0);
            if (timeline.getIndexOfPeriod(periodUid) == -1) {
                return -1;
            }
            return timeline.getPeriodByUid(periodUid, period).windowIndex;
        }
        if (i < timeline.getWindowCount()) {
            return i;
        }
        return -1;
    }

    private static State getStateWithNewPlaylist(State state, List<MediaItemData> list, Timeline.Period period) {
        State.Builder builderBuildUpon = state.buildUpon();
        builderBuildUpon.setPlaylist(list);
        Timeline timeline = builderBuildUpon.timeline;
        long j = state.contentPositionMsSupplier.get();
        int currentMediaItemIndexInternal = getCurrentMediaItemIndexInternal(state);
        int mediaItemIndexInNewPlaylist = getMediaItemIndexInNewPlaylist(state.playlist, timeline, currentMediaItemIndexInternal, period);
        long j2 = mediaItemIndexInNewPlaylist == -1 ? C.TIME_UNSET : j;
        while (true) {
            currentMediaItemIndexInternal++;
            if (mediaItemIndexInNewPlaylist != -1 || currentMediaItemIndexInternal >= state.playlist.size()) {
                break;
            }
            mediaItemIndexInNewPlaylist = getMediaItemIndexInNewPlaylist(state.playlist, timeline, currentMediaItemIndexInternal, period);
        }
        if (state.playbackState != 1 && mediaItemIndexInNewPlaylist == -1) {
            builderBuildUpon.setPlaybackState(4).setIsLoading(false);
        }
        return buildStateForNewPosition(builderBuildUpon, state, j, list, mediaItemIndexInNewPlaylist, j2, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static State getStateWithNewPlaylistAndPosition(State state, List<MediaItemData> list, int i, long j) {
        State.Builder builderBuildUpon = state.buildUpon();
        builderBuildUpon.setPlaylist(list);
        if (state.playbackState != 1) {
            if (list.isEmpty() || (i != -1 && i >= list.size())) {
                builderBuildUpon.setPlaybackState(4).setIsLoading(false);
            } else {
                builderBuildUpon.setPlaybackState(2);
            }
        }
        return buildStateForNewPosition(builderBuildUpon, state, state.contentPositionMsSupplier.get(), list, i, j, false);
    }

    private static State buildStateForNewPosition(State.Builder builder, State state, long j, List<MediaItemData> list, int i, long j2, boolean z) {
        long positionOrDefaultInMediaItem = getPositionOrDefaultInMediaItem(j, state);
        boolean z2 = false;
        if (!list.isEmpty() && (i == -1 || i >= list.size())) {
            j2 = -9223372036854775807L;
            i = 0;
        }
        if (!list.isEmpty() && j2 == C.TIME_UNSET) {
            j2 = Util.usToMs(list.get(i).defaultPositionUs);
        }
        boolean z3 = state.playlist.isEmpty() || list.isEmpty();
        if (!z3 && !state.playlist.get(getCurrentMediaItemIndexInternal(state)).uid.equals(list.get(i).uid)) {
            z2 = true;
        }
        if (z3 || z2 || j2 < positionOrDefaultInMediaItem) {
            builder.setCurrentMediaItemIndex(i).setCurrentAd(-1, -1).setContentPositionMs(j2).setContentBufferedPositionMs(PositionSupplier.getConstant(j2)).setTotalBufferedDurationMs(PositionSupplier.ZERO);
        } else if (j2 == positionOrDefaultInMediaItem) {
            builder.setCurrentMediaItemIndex(i);
            if (state.currentAdGroupIndex != -1 && z) {
                builder.setTotalBufferedDurationMs(PositionSupplier.getConstant(state.adBufferedPositionMsSupplier.get() - state.adPositionMsSupplier.get()));
            } else {
                builder.setCurrentAd(-1, -1).setTotalBufferedDurationMs(PositionSupplier.getConstant(getContentBufferedPositionMsInternal(state) - positionOrDefaultInMediaItem));
            }
        } else {
            builder.setCurrentMediaItemIndex(i).setCurrentAd(-1, -1).setContentPositionMs(j2).setContentBufferedPositionMs(PositionSupplier.getConstant(Math.max(getContentBufferedPositionMsInternal(state), j2))).setTotalBufferedDurationMs(PositionSupplier.getConstant(Math.max(0L, state.totalBufferedDurationMsSupplier.get() - (j2 - positionOrDefaultInMediaItem))));
        }
        return builder.build();
    }

    /* JADX INFO: loaded from: classes5.dex */
    static final class PlaceholderUid {
        private PlaceholderUid() {
        }
    }
}
