package com.google.android.exoplayer2;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.os.Looper;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import com.google.android.exoplayer2.DefaultLivePlaybackSpeedControl;
import com.google.android.exoplayer2.ExoPlayer;
import com.google.android.exoplayer2.PlayerMessage;
import com.google.android.exoplayer2.analytics.AnalyticsCollector;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector;
import com.google.android.exoplayer2.audio.AudioAttributes;
import com.google.android.exoplayer2.audio.AuxEffectInfo;
import com.google.android.exoplayer2.decoder.DecoderCounters;
import com.google.android.exoplayer2.extractor.DefaultExtractorsFactory;
import com.google.android.exoplayer2.source.DefaultMediaSourceFactory;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.ShuffleOrder;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.text.CueGroup;
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector;
import com.google.android.exoplayer2.trackselection.TrackSelectionArray;
import com.google.android.exoplayer2.trackselection.TrackSelector;
import com.google.android.exoplayer2.upstream.BandwidthMeter;
import com.google.android.exoplayer2.upstream.DefaultBandwidthMeter;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Clock;
import com.google.android.exoplayer2.util.Effect;
import com.google.android.exoplayer2.util.PriorityTaskManager;
import com.google.android.exoplayer2.util.Util;
import com.google.android.exoplayer2.video.VideoFrameMetadataListener;
import com.google.android.exoplayer2.video.VideoSize;
import com.google.android.exoplayer2.video.spherical.CameraMotionListener;
import java.util.List;
import kotlin.parseMvhd;
import kotlin.parseUdtaMeta;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public interface ExoPlayer extends Player {
    public static final long DEFAULT_DETACH_SURFACE_TIMEOUT_MS = 2000;
    public static final long DEFAULT_RELEASE_TIMEOUT_MS = 500;

    @Deprecated
    public interface AudioComponent {
        @Deprecated
        void clearAuxEffectInfo();

        @Deprecated
        AudioAttributes getAudioAttributes();

        @Deprecated
        int getAudioSessionId();

        @Deprecated
        boolean getSkipSilenceEnabled();

        @Deprecated
        float getVolume();

        @Deprecated
        void setAudioAttributes(AudioAttributes audioAttributes, boolean z);

        @Deprecated
        void setAudioSessionId(int i);

        @Deprecated
        void setAuxEffectInfo(AuxEffectInfo auxEffectInfo);

        @Deprecated
        void setSkipSilenceEnabled(boolean z);

        @Deprecated
        void setVolume(float f);
    }

    public interface AudioOffloadListener {
        default void onExperimentalOffloadSchedulingEnabledChanged(boolean z) {
        }

        default void onExperimentalOffloadedPlayback(boolean z) {
        }

        default void onExperimentalSleepingForOffloadChanged(boolean z) {
        }
    }

    @Deprecated
    public interface DeviceComponent {
        @Deprecated
        void decreaseDeviceVolume();

        @Deprecated
        DeviceInfo getDeviceInfo();

        @Deprecated
        int getDeviceVolume();

        @Deprecated
        void increaseDeviceVolume();

        @Deprecated
        boolean isDeviceMuted();

        @Deprecated
        void setDeviceMuted(boolean z);

        @Deprecated
        void setDeviceVolume(int i);
    }

    @Deprecated
    public interface TextComponent {
        @Deprecated
        CueGroup getCurrentCues();
    }

    @Deprecated
    public interface VideoComponent {
        @Deprecated
        void clearCameraMotionListener(CameraMotionListener cameraMotionListener);

        @Deprecated
        void clearVideoFrameMetadataListener(VideoFrameMetadataListener videoFrameMetadataListener);

        @Deprecated
        void clearVideoSurface();

        @Deprecated
        void clearVideoSurface(Surface surface);

        @Deprecated
        void clearVideoSurfaceHolder(SurfaceHolder surfaceHolder);

        @Deprecated
        void clearVideoSurfaceView(SurfaceView surfaceView);

        @Deprecated
        void clearVideoTextureView(TextureView textureView);

        @Deprecated
        int getVideoChangeFrameRateStrategy();

        @Deprecated
        int getVideoScalingMode();

        @Deprecated
        VideoSize getVideoSize();

        @Deprecated
        void setCameraMotionListener(CameraMotionListener cameraMotionListener);

        @Deprecated
        void setVideoChangeFrameRateStrategy(int i);

        @Deprecated
        void setVideoFrameMetadataListener(VideoFrameMetadataListener videoFrameMetadataListener);

        @Deprecated
        void setVideoScalingMode(int i);

        @Deprecated
        void setVideoSurface(Surface surface);

        @Deprecated
        void setVideoSurfaceHolder(SurfaceHolder surfaceHolder);

        @Deprecated
        void setVideoSurfaceView(SurfaceView surfaceView);

        @Deprecated
        void setVideoTextureView(TextureView textureView);
    }

    void addAnalyticsListener(AnalyticsListener analyticsListener);

    void addAudioOffloadListener(AudioOffloadListener audioOffloadListener);

    void addMediaSource(int i, MediaSource mediaSource);

    void addMediaSource(MediaSource mediaSource);

    void addMediaSources(int i, List<MediaSource> list);

    void addMediaSources(List<MediaSource> list);

    void clearAuxEffectInfo();

    void clearCameraMotionListener(CameraMotionListener cameraMotionListener);

    void clearVideoFrameMetadataListener(VideoFrameMetadataListener videoFrameMetadataListener);

    PlayerMessage createMessage(PlayerMessage.Target target);

    boolean experimentalIsSleepingForOffload();

    void experimentalSetOffloadSchedulingEnabled(boolean z);

    AnalyticsCollector getAnalyticsCollector();

    @Deprecated
    AudioComponent getAudioComponent();

    DecoderCounters getAudioDecoderCounters();

    Format getAudioFormat();

    int getAudioSessionId();

    Clock getClock();

    @Deprecated
    TrackGroupArray getCurrentTrackGroups();

    @Deprecated
    TrackSelectionArray getCurrentTrackSelections();

    @Deprecated
    DeviceComponent getDeviceComponent();

    boolean getPauseAtEndOfMediaItems();

    Looper getPlaybackLooper();

    @Override // com.google.android.exoplayer2.Player
    ExoPlaybackException getPlayerError();

    Renderer getRenderer(int i);

    int getRendererCount();

    int getRendererType(int i);

    SeekParameters getSeekParameters();

    boolean getSkipSilenceEnabled();

    @Deprecated
    TextComponent getTextComponent();

    TrackSelector getTrackSelector();

    int getVideoChangeFrameRateStrategy();

    @Deprecated
    VideoComponent getVideoComponent();

    DecoderCounters getVideoDecoderCounters();

    Format getVideoFormat();

    int getVideoScalingMode();

    boolean isTunnelingEnabled();

    @Deprecated
    void prepare(MediaSource mediaSource);

    @Deprecated
    void prepare(MediaSource mediaSource, boolean z, boolean z2);

    void removeAnalyticsListener(AnalyticsListener analyticsListener);

    void removeAudioOffloadListener(AudioOffloadListener audioOffloadListener);

    void setAudioAttributes(AudioAttributes audioAttributes, boolean z);

    void setAudioSessionId(int i);

    void setAuxEffectInfo(AuxEffectInfo auxEffectInfo);

    void setCameraMotionListener(CameraMotionListener cameraMotionListener);

    void setForegroundMode(boolean z);

    void setHandleAudioBecomingNoisy(boolean z);

    void setMediaSource(MediaSource mediaSource);

    void setMediaSource(MediaSource mediaSource, long j);

    void setMediaSource(MediaSource mediaSource, boolean z);

    void setMediaSources(List<MediaSource> list);

    void setMediaSources(List<MediaSource> list, int i, long j);

    void setMediaSources(List<MediaSource> list, boolean z);

    void setPauseAtEndOfMediaItems(boolean z);

    void setPreferredAudioDevice(AudioDeviceInfo audioDeviceInfo);

    void setPriorityTaskManager(PriorityTaskManager priorityTaskManager);

    void setSeekParameters(SeekParameters seekParameters);

    void setShuffleOrder(ShuffleOrder shuffleOrder);

    void setSkipSilenceEnabled(boolean z);

    void setVideoChangeFrameRateStrategy(int i);

    void setVideoEffects(List<Effect> list);

    void setVideoFrameMetadataListener(VideoFrameMetadataListener videoFrameMetadataListener);

    void setVideoScalingMode(int i);

    void setWakeMode(int i);

    public static final class Builder {
        parseMvhd<Clock, AnalyticsCollector> analyticsCollectorFunction;
        AudioAttributes audioAttributes;
        parseUdtaMeta<BandwidthMeter> bandwidthMeterSupplier;
        boolean buildCalled;
        Clock clock;
        final Context context;
        long detachSurfaceTimeoutMs;
        boolean deviceVolumeControlEnabled;
        long foregroundModeTimeoutMs;
        boolean handleAudioBecomingNoisy;
        boolean handleAudioFocus;
        LivePlaybackSpeedControl livePlaybackSpeedControl;
        parseUdtaMeta<LoadControl> loadControlSupplier;
        Looper looper;
        parseUdtaMeta<MediaSource.Factory> mediaSourceFactorySupplier;
        boolean pauseAtEndOfMediaItems;
        Looper playbackLooper;
        PriorityTaskManager priorityTaskManager;
        long releaseTimeoutMs;
        parseUdtaMeta<RenderersFactory> renderersFactorySupplier;
        long seekBackIncrementMs;
        long seekForwardIncrementMs;
        SeekParameters seekParameters;
        boolean skipSilenceEnabled;
        parseUdtaMeta<TrackSelector> trackSelectorSupplier;
        boolean useLazyPreparation;
        boolean usePlatformDiagnostics;
        int videoChangeFrameRateStrategy;
        int videoScalingMode;
        int wakeMode;

        static /* synthetic */ TrackSelector lambda$new$10(TrackSelector trackSelector) {
            return trackSelector;
        }

        static /* synthetic */ LoadControl lambda$new$11(LoadControl loadControl) {
            return loadControl;
        }

        static /* synthetic */ BandwidthMeter lambda$new$12(BandwidthMeter bandwidthMeter) {
            return bandwidthMeter;
        }

        static /* synthetic */ AnalyticsCollector lambda$new$13(AnalyticsCollector analyticsCollector, Clock clock) {
            return analyticsCollector;
        }

        static /* synthetic */ RenderersFactory lambda$new$2(RenderersFactory renderersFactory) {
            return renderersFactory;
        }

        static /* synthetic */ MediaSource.Factory lambda$new$5(MediaSource.Factory factory) {
            return factory;
        }

        static /* synthetic */ RenderersFactory lambda$new$6(RenderersFactory renderersFactory) {
            return renderersFactory;
        }

        static /* synthetic */ MediaSource.Factory lambda$new$7(MediaSource.Factory factory) {
            return factory;
        }

        static /* synthetic */ RenderersFactory lambda$new$8(RenderersFactory renderersFactory) {
            return renderersFactory;
        }

        static /* synthetic */ MediaSource.Factory lambda$new$9(MediaSource.Factory factory) {
            return factory;
        }

        static /* synthetic */ AnalyticsCollector lambda$setAnalyticsCollector$21(AnalyticsCollector analyticsCollector, Clock clock) {
            return analyticsCollector;
        }

        static /* synthetic */ BandwidthMeter lambda$setBandwidthMeter$20(BandwidthMeter bandwidthMeter) {
            return bandwidthMeter;
        }

        static /* synthetic */ LoadControl lambda$setLoadControl$19(LoadControl loadControl) {
            return loadControl;
        }

        static /* synthetic */ MediaSource.Factory lambda$setMediaSourceFactory$17(MediaSource.Factory factory) {
            return factory;
        }

        static /* synthetic */ RenderersFactory lambda$setRenderersFactory$16(RenderersFactory renderersFactory) {
            return renderersFactory;
        }

        static /* synthetic */ TrackSelector lambda$setTrackSelector$18(TrackSelector trackSelector) {
            return trackSelector;
        }

        public Builder(final Context context) {
            this(context, (parseUdtaMeta<RenderersFactory>) new parseUdtaMeta() { // from class: com.google.android.exoplayer2.ExoPlayer$Builder$$ExternalSyntheticLambda11
                @Override // kotlin.parseUdtaMeta
                public final Object get() {
                    return ExoPlayer.Builder.lambda$new$0(context);
                }
            }, (parseUdtaMeta<MediaSource.Factory>) new parseUdtaMeta() { // from class: com.google.android.exoplayer2.ExoPlayer$Builder$$ExternalSyntheticLambda16
                @Override // kotlin.parseUdtaMeta
                public final Object get() {
                    return ExoPlayer.Builder.lambda$new$1(context);
                }
            });
        }

        static /* synthetic */ RenderersFactory lambda$new$0(Context context) {
            return new DefaultRenderersFactory(context);
        }

        static /* synthetic */ MediaSource.Factory lambda$new$1(Context context) {
            return new DefaultMediaSourceFactory(context, new DefaultExtractorsFactory());
        }

        public Builder(final Context context, final RenderersFactory renderersFactory) {
            this(context, (parseUdtaMeta<RenderersFactory>) new parseUdtaMeta() { // from class: com.google.android.exoplayer2.ExoPlayer$Builder$$ExternalSyntheticLambda4
                @Override // kotlin.parseUdtaMeta
                public final Object get() {
                    return ExoPlayer.Builder.lambda$new$2(renderersFactory);
                }
            }, (parseUdtaMeta<MediaSource.Factory>) new parseUdtaMeta() { // from class: com.google.android.exoplayer2.ExoPlayer$Builder$$ExternalSyntheticLambda5
                @Override // kotlin.parseUdtaMeta
                public final Object get() {
                    return ExoPlayer.Builder.lambda$new$3(context);
                }
            });
            Assertions.checkNotNull(renderersFactory);
        }

        static /* synthetic */ MediaSource.Factory lambda$new$3(Context context) {
            return new DefaultMediaSourceFactory(context, new DefaultExtractorsFactory());
        }

        public Builder(final Context context, final MediaSource.Factory factory) {
            this(context, (parseUdtaMeta<RenderersFactory>) new parseUdtaMeta() { // from class: com.google.android.exoplayer2.ExoPlayer$Builder$$ExternalSyntheticLambda6
                @Override // kotlin.parseUdtaMeta
                public final Object get() {
                    return ExoPlayer.Builder.lambda$new$4(context);
                }
            }, (parseUdtaMeta<MediaSource.Factory>) new parseUdtaMeta() { // from class: com.google.android.exoplayer2.ExoPlayer$Builder$$ExternalSyntheticLambda7
                @Override // kotlin.parseUdtaMeta
                public final Object get() {
                    return ExoPlayer.Builder.lambda$new$5(factory);
                }
            });
            Assertions.checkNotNull(factory);
        }

        static /* synthetic */ RenderersFactory lambda$new$4(Context context) {
            return new DefaultRenderersFactory(context);
        }

        public Builder(Context context, final RenderersFactory renderersFactory, final MediaSource.Factory factory) {
            this(context, (parseUdtaMeta<RenderersFactory>) new parseUdtaMeta() { // from class: com.google.android.exoplayer2.ExoPlayer$Builder$$ExternalSyntheticLambda17
                @Override // kotlin.parseUdtaMeta
                public final Object get() {
                    return ExoPlayer.Builder.lambda$new$6(renderersFactory);
                }
            }, (parseUdtaMeta<MediaSource.Factory>) new parseUdtaMeta() { // from class: com.google.android.exoplayer2.ExoPlayer$Builder$$ExternalSyntheticLambda18
                @Override // kotlin.parseUdtaMeta
                public final Object get() {
                    return ExoPlayer.Builder.lambda$new$7(factory);
                }
            });
            Assertions.checkNotNull(renderersFactory);
            Assertions.checkNotNull(factory);
        }

        public Builder(Context context, final RenderersFactory renderersFactory, final MediaSource.Factory factory, final TrackSelector trackSelector, final LoadControl loadControl, final BandwidthMeter bandwidthMeter, final AnalyticsCollector analyticsCollector) {
            this(context, (parseUdtaMeta<RenderersFactory>) new parseUdtaMeta() { // from class: com.google.android.exoplayer2.ExoPlayer$Builder$$ExternalSyntheticLambda20
                @Override // kotlin.parseUdtaMeta
                public final Object get() {
                    return ExoPlayer.Builder.lambda$new$8(renderersFactory);
                }
            }, (parseUdtaMeta<MediaSource.Factory>) new parseUdtaMeta() { // from class: com.google.android.exoplayer2.ExoPlayer$Builder$$ExternalSyntheticLambda21
                @Override // kotlin.parseUdtaMeta
                public final Object get() {
                    return ExoPlayer.Builder.lambda$new$9(factory);
                }
            }, (parseUdtaMeta<TrackSelector>) new parseUdtaMeta() { // from class: com.google.android.exoplayer2.ExoPlayer$Builder$$ExternalSyntheticLambda22
                @Override // kotlin.parseUdtaMeta
                public final Object get() {
                    return ExoPlayer.Builder.lambda$new$10(trackSelector);
                }
            }, (parseUdtaMeta<LoadControl>) new parseUdtaMeta() { // from class: com.google.android.exoplayer2.ExoPlayer$Builder$$ExternalSyntheticLambda23
                @Override // kotlin.parseUdtaMeta
                public final Object get() {
                    return ExoPlayer.Builder.lambda$new$11(loadControl);
                }
            }, (parseUdtaMeta<BandwidthMeter>) new parseUdtaMeta() { // from class: com.google.android.exoplayer2.ExoPlayer$Builder$$ExternalSyntheticLambda1
                @Override // kotlin.parseUdtaMeta
                public final Object get() {
                    return ExoPlayer.Builder.lambda$new$12(bandwidthMeter);
                }
            }, (parseMvhd<Clock, AnalyticsCollector>) new parseMvhd() { // from class: com.google.android.exoplayer2.ExoPlayer$Builder$$ExternalSyntheticLambda2
                @Override // kotlin.parseMvhd
                public final Object apply(Object obj) {
                    return ExoPlayer.Builder.lambda$new$13(analyticsCollector, (Clock) obj);
                }
            });
            Assertions.checkNotNull(renderersFactory);
            Assertions.checkNotNull(factory);
            Assertions.checkNotNull(trackSelector);
            Assertions.checkNotNull(bandwidthMeter);
            Assertions.checkNotNull(analyticsCollector);
        }

        private Builder(final Context context, parseUdtaMeta<RenderersFactory> parseudtameta, parseUdtaMeta<MediaSource.Factory> parseudtameta2) {
            this(context, parseudtameta, parseudtameta2, (parseUdtaMeta<TrackSelector>) new parseUdtaMeta() { // from class: com.google.android.exoplayer2.ExoPlayer$Builder$$ExternalSyntheticLambda8
                @Override // kotlin.parseUdtaMeta
                public final Object get() {
                    return ExoPlayer.Builder.lambda$new$14(context);
                }
            }, (parseUdtaMeta<LoadControl>) new parseUdtaMeta() { // from class: com.google.android.exoplayer2.ExoPlayer$Builder$$ExternalSyntheticLambda9
                @Override // kotlin.parseUdtaMeta
                public final Object get() {
                    return new DefaultLoadControl();
                }
            }, (parseUdtaMeta<BandwidthMeter>) new parseUdtaMeta() { // from class: com.google.android.exoplayer2.ExoPlayer$Builder$$ExternalSyntheticLambda10
                @Override // kotlin.parseUdtaMeta
                public final Object get() {
                    return DefaultBandwidthMeter.getSingletonInstance(context);
                }
            }, (parseMvhd<Clock, AnalyticsCollector>) new parseMvhd() { // from class: com.google.android.exoplayer2.ExoPlayer$Builder$$ExternalSyntheticLambda12
                @Override // kotlin.parseMvhd
                public final Object apply(Object obj) {
                    return new DefaultAnalyticsCollector((Clock) obj);
                }
            });
        }

        static /* synthetic */ TrackSelector lambda$new$14(Context context) {
            return new DefaultTrackSelector(context);
        }

        private Builder(Context context, parseUdtaMeta<RenderersFactory> parseudtameta, parseUdtaMeta<MediaSource.Factory> parseudtameta2, parseUdtaMeta<TrackSelector> parseudtameta3, parseUdtaMeta<LoadControl> parseudtameta4, parseUdtaMeta<BandwidthMeter> parseudtameta5, parseMvhd<Clock, AnalyticsCollector> parsemvhd) {
            this.context = (Context) Assertions.checkNotNull(context);
            this.renderersFactorySupplier = parseudtameta;
            this.mediaSourceFactorySupplier = parseudtameta2;
            this.trackSelectorSupplier = parseudtameta3;
            this.loadControlSupplier = parseudtameta4;
            this.bandwidthMeterSupplier = parseudtameta5;
            this.analyticsCollectorFunction = parsemvhd;
            this.looper = Util.getCurrentOrMainLooper();
            this.audioAttributes = AudioAttributes.DEFAULT;
            this.wakeMode = 0;
            this.videoScalingMode = 1;
            this.videoChangeFrameRateStrategy = 0;
            this.useLazyPreparation = true;
            this.seekParameters = SeekParameters.DEFAULT;
            this.seekBackIncrementMs = 5000L;
            this.seekForwardIncrementMs = C.DEFAULT_SEEK_FORWARD_INCREMENT_MS;
            this.livePlaybackSpeedControl = new DefaultLivePlaybackSpeedControl.Builder().build();
            this.clock = Clock.DEFAULT;
            this.releaseTimeoutMs = 500L;
            this.detachSurfaceTimeoutMs = 2000L;
            this.usePlatformDiagnostics = true;
        }

        public final Builder experimentalSetForegroundModeTimeoutMs(long j) {
            Assertions.checkState(!this.buildCalled);
            this.foregroundModeTimeoutMs = j;
            return this;
        }

        public final Builder setRenderersFactory(final RenderersFactory renderersFactory) {
            Assertions.checkState(!this.buildCalled);
            Assertions.checkNotNull(renderersFactory);
            this.renderersFactorySupplier = new parseUdtaMeta() { // from class: com.google.android.exoplayer2.ExoPlayer$Builder$$ExternalSyntheticLambda14
                @Override // kotlin.parseUdtaMeta
                public final Object get() {
                    return ExoPlayer.Builder.lambda$setRenderersFactory$16(renderersFactory);
                }
            };
            return this;
        }

        public final Builder setMediaSourceFactory(final MediaSource.Factory factory) {
            Assertions.checkState(!this.buildCalled);
            Assertions.checkNotNull(factory);
            this.mediaSourceFactorySupplier = new parseUdtaMeta() { // from class: com.google.android.exoplayer2.ExoPlayer$Builder$$ExternalSyntheticLambda15
                @Override // kotlin.parseUdtaMeta
                public final Object get() {
                    return ExoPlayer.Builder.lambda$setMediaSourceFactory$17(factory);
                }
            };
            return this;
        }

        public final Builder setTrackSelector(final TrackSelector trackSelector) {
            Assertions.checkState(!this.buildCalled);
            Assertions.checkNotNull(trackSelector);
            this.trackSelectorSupplier = new parseUdtaMeta() { // from class: com.google.android.exoplayer2.ExoPlayer$Builder$$ExternalSyntheticLambda3
                @Override // kotlin.parseUdtaMeta
                public final Object get() {
                    return ExoPlayer.Builder.lambda$setTrackSelector$18(trackSelector);
                }
            };
            return this;
        }

        public final Builder setLoadControl(final LoadControl loadControl) {
            Assertions.checkState(!this.buildCalled);
            Assertions.checkNotNull(loadControl);
            this.loadControlSupplier = new parseUdtaMeta() { // from class: com.google.android.exoplayer2.ExoPlayer$Builder$$ExternalSyntheticLambda0
                @Override // kotlin.parseUdtaMeta
                public final Object get() {
                    return ExoPlayer.Builder.lambda$setLoadControl$19(loadControl);
                }
            };
            return this;
        }

        public final Builder setBandwidthMeter(final BandwidthMeter bandwidthMeter) {
            Assertions.checkState(!this.buildCalled);
            Assertions.checkNotNull(bandwidthMeter);
            this.bandwidthMeterSupplier = new parseUdtaMeta() { // from class: com.google.android.exoplayer2.ExoPlayer$Builder$$ExternalSyntheticLambda19
                @Override // kotlin.parseUdtaMeta
                public final Object get() {
                    return ExoPlayer.Builder.lambda$setBandwidthMeter$20(bandwidthMeter);
                }
            };
            return this;
        }

        public final Builder setLooper(Looper looper) {
            Assertions.checkState(!this.buildCalled);
            Assertions.checkNotNull(looper);
            this.looper = looper;
            return this;
        }

        public final Builder setAnalyticsCollector(final AnalyticsCollector analyticsCollector) {
            Assertions.checkState(!this.buildCalled);
            Assertions.checkNotNull(analyticsCollector);
            this.analyticsCollectorFunction = new parseMvhd() { // from class: com.google.android.exoplayer2.ExoPlayer$Builder$$ExternalSyntheticLambda13
                @Override // kotlin.parseMvhd
                public final Object apply(Object obj) {
                    return ExoPlayer.Builder.lambda$setAnalyticsCollector$21(analyticsCollector, (Clock) obj);
                }
            };
            return this;
        }

        public final Builder setPriorityTaskManager(PriorityTaskManager priorityTaskManager) {
            Assertions.checkState(!this.buildCalled);
            this.priorityTaskManager = priorityTaskManager;
            return this;
        }

        public final Builder setAudioAttributes(AudioAttributes audioAttributes, boolean z) {
            Assertions.checkState(!this.buildCalled);
            this.audioAttributes = (AudioAttributes) Assertions.checkNotNull(audioAttributes);
            this.handleAudioFocus = z;
            return this;
        }

        public final Builder setWakeMode(int i) {
            Assertions.checkState(!this.buildCalled);
            this.wakeMode = i;
            return this;
        }

        public final Builder setHandleAudioBecomingNoisy(boolean z) {
            Assertions.checkState(!this.buildCalled);
            this.handleAudioBecomingNoisy = z;
            return this;
        }

        public final Builder setSkipSilenceEnabled(boolean z) {
            Assertions.checkState(!this.buildCalled);
            this.skipSilenceEnabled = z;
            return this;
        }

        public final Builder setDeviceVolumeControlEnabled(boolean z) {
            Assertions.checkState(!this.buildCalled);
            this.deviceVolumeControlEnabled = z;
            return this;
        }

        public final Builder setVideoScalingMode(int i) {
            Assertions.checkState(!this.buildCalled);
            this.videoScalingMode = i;
            return this;
        }

        public final Builder setVideoChangeFrameRateStrategy(int i) {
            Assertions.checkState(!this.buildCalled);
            this.videoChangeFrameRateStrategy = i;
            return this;
        }

        public final Builder setUseLazyPreparation(boolean z) {
            Assertions.checkState(!this.buildCalled);
            this.useLazyPreparation = z;
            return this;
        }

        public final Builder setSeekParameters(SeekParameters seekParameters) {
            Assertions.checkState(!this.buildCalled);
            this.seekParameters = (SeekParameters) Assertions.checkNotNull(seekParameters);
            return this;
        }

        public final Builder setSeekBackIncrementMs(long j) {
            Assertions.checkArgument(j > 0);
            Assertions.checkState(!this.buildCalled);
            this.seekBackIncrementMs = j;
            return this;
        }

        public final Builder setSeekForwardIncrementMs(long j) {
            Assertions.checkArgument(j > 0);
            Assertions.checkState(!this.buildCalled);
            this.seekForwardIncrementMs = j;
            return this;
        }

        public final Builder setReleaseTimeoutMs(long j) {
            Assertions.checkState(!this.buildCalled);
            this.releaseTimeoutMs = j;
            return this;
        }

        public final Builder setDetachSurfaceTimeoutMs(long j) {
            Assertions.checkState(!this.buildCalled);
            this.detachSurfaceTimeoutMs = j;
            return this;
        }

        public final Builder setPauseAtEndOfMediaItems(boolean z) {
            Assertions.checkState(!this.buildCalled);
            this.pauseAtEndOfMediaItems = z;
            return this;
        }

        public final Builder setLivePlaybackSpeedControl(LivePlaybackSpeedControl livePlaybackSpeedControl) {
            Assertions.checkState(!this.buildCalled);
            this.livePlaybackSpeedControl = (LivePlaybackSpeedControl) Assertions.checkNotNull(livePlaybackSpeedControl);
            return this;
        }

        public final Builder setUsePlatformDiagnostics(boolean z) {
            Assertions.checkState(!this.buildCalled);
            this.usePlatformDiagnostics = z;
            return this;
        }

        public final Builder setClock(Clock clock) {
            Assertions.checkState(!this.buildCalled);
            this.clock = clock;
            return this;
        }

        public final Builder setPlaybackLooper(Looper looper) {
            Assertions.checkState(!this.buildCalled);
            this.playbackLooper = looper;
            return this;
        }

        public final ExoPlayer build() {
            Assertions.checkState(!this.buildCalled);
            this.buildCalled = true;
            return new ExoPlayerImpl(this, null);
        }

        final SimpleExoPlayer buildSimpleExoPlayer() {
            Assertions.checkState(!this.buildCalled);
            this.buildCalled = true;
            return new SimpleExoPlayer(this);
        }
    }
}
