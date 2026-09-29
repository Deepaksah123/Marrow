package androidx.media3.exoplayer;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.os.Looper;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.image.ImageOutput;
import com.google.android.exoplayer2.C;
import java.util.List;
import kotlin.ArrayBuildersDoubleBuilder;
import kotlin.BaseJsonNode;
import kotlin.BinaryNode;
import kotlin.C0170format;
import kotlin.JsonIntegerFormatVisitor;
import kotlin.JsonSerializableSchema;
import kotlin.JsonValueFormat;
import kotlin.LaissezFaireSubTypeValidator;
import kotlin.ReferenceTypeSerializer;
import kotlin.StdKeySerializers;
import kotlin.ToStringSerializerBase;
import kotlin._at;
import kotlin._childrenEqual;
import kotlin._constructSimple;
import kotlin._fromWellKnownInterface;
import kotlin._resolveTypePlaceholders;
import kotlin._withArrayAddTailProperty;
import kotlin._writeAsBinary;
import kotlin.addNull;
import kotlin.buildIndexedListSerializer;
import kotlin.buildMapEntrySerializer;
import kotlin.buildTypeDeserializer;
import kotlin.buildTypeSerializer;
import kotlin.checkAndFixAccess;
import kotlin.createKeySerializer;
import kotlin.customSerializers;
import kotlin.expectNumberFormat;
import kotlin.findBoundType;
import kotlin.findMapSerializer;
import kotlin.findSerializerByAnnotations;
import kotlin.findSerializerByPrimaryType;
import kotlin.getRemainingInput;
import kotlin.isUnsafeBaseType;
import kotlin.parseMvhd;
import kotlin.parseUdtaMeta;
import kotlin.validateBaseType;

/* JADX INFO: loaded from: classes2.dex */
public interface ExoPlayer extends isUnsafeBaseType {
    public static final long DEFAULT_DETACH_SURFACE_TIMEOUT_MS = 2000;
    public static final long DEFAULT_RELEASE_TIMEOUT_MS = 500;

    @Deprecated
    public interface AudioAttributesCompatParcelizer {
    }

    @Deprecated
    public interface AudioAttributesImplApi26Parcelizer {
    }

    @Deprecated
    public interface MediaBrowserCompatCustomActionResultReceiver {
    }

    public interface RemoteActionCompatParcelizer {
        default void AudioAttributesCompatParcelizer() {
        }
    }

    @Deprecated
    public interface write {
    }

    void addAnalyticsListener(findSerializerByAnnotations findserializerbyannotations);

    void addAudioOffloadListener(RemoteActionCompatParcelizer remoteActionCompatParcelizer);

    void addMediaSource(int i, StdKeySerializers stdKeySerializers);

    void addMediaSource(StdKeySerializers stdKeySerializers);

    void addMediaSources(int i, List<StdKeySerializers> list);

    void addMediaSources(List<StdKeySerializers> list);

    void clearAuxEffectInfo();

    void clearCameraMotionListener(ArrayBuildersDoubleBuilder arrayBuildersDoubleBuilder);

    void clearVideoFrameMetadataListener(getRemainingInput getremaininginput);

    buildMapEntrySerializer createMessage(buildMapEntrySerializer.write writeVar);

    findSerializerByPrimaryType getAnalyticsCollector();

    @Deprecated
    write getAudioComponent();

    _at getAudioDecoderCounters();

    C0170format getAudioFormat();

    int getAudioSessionId();

    buildTypeDeserializer getClock();

    @Deprecated
    _writeAsBinary getCurrentTrackGroups();

    @Deprecated
    _resolveTypePlaceholders getCurrentTrackSelections();

    @Deprecated
    AudioAttributesCompatParcelizer getDeviceComponent();

    boolean getPauseAtEndOfMediaItems();

    Looper getPlaybackLooper();

    @Override // kotlin.isUnsafeBaseType
    addNull getPlayerError();

    IconCompatParcelizer getPreloadConfiguration();

    buildIndexedListSerializer getRenderer(int i);

    int getRendererCount();

    int getRendererType(int i);

    createKeySerializer getSeekParameters();

    boolean getSkipSilenceEnabled();

    @Deprecated
    MediaBrowserCompatCustomActionResultReceiver getTextComponent();

    _constructSimple getTrackSelector();

    int getVideoChangeFrameRateStrategy();

    @Deprecated
    AudioAttributesImplApi26Parcelizer getVideoComponent();

    _at getVideoDecoderCounters();

    C0170format getVideoFormat();

    int getVideoScalingMode();

    boolean isReleased();

    boolean isSleepingForOffload();

    boolean isTunnelingEnabled();

    @Deprecated
    void prepare(StdKeySerializers stdKeySerializers);

    @Deprecated
    void prepare(StdKeySerializers stdKeySerializers, boolean z, boolean z2);

    void release();

    void removeAnalyticsListener(findSerializerByAnnotations findserializerbyannotations);

    void removeAudioOffloadListener(RemoteActionCompatParcelizer remoteActionCompatParcelizer);

    void replaceMediaItem(int i, JsonSerializableSchema jsonSerializableSchema);

    @Override // kotlin.isUnsafeBaseType
    void replaceMediaItems(int i, int i2, List<JsonSerializableSchema> list);

    void setAudioSessionId(int i);

    void setAuxEffectInfo(expectNumberFormat expectnumberformat);

    void setCameraMotionListener(ArrayBuildersDoubleBuilder arrayBuildersDoubleBuilder);

    void setForegroundMode(boolean z);

    void setHandleAudioBecomingNoisy(boolean z);

    void setImageOutput(ImageOutput imageOutput);

    void setMediaSource(StdKeySerializers stdKeySerializers);

    void setMediaSource(StdKeySerializers stdKeySerializers, long j);

    void setMediaSource(StdKeySerializers stdKeySerializers, boolean z);

    void setMediaSources(List<StdKeySerializers> list);

    void setMediaSources(List<StdKeySerializers> list, int i, long j);

    void setMediaSources(List<StdKeySerializers> list, boolean z);

    void setPauseAtEndOfMediaItems(boolean z);

    void setPreferredAudioDevice(AudioDeviceInfo audioDeviceInfo);

    void setPreloadConfiguration(IconCompatParcelizer iconCompatParcelizer);

    void setPriority(int i);

    void setPriorityTaskManager(validateBaseType validatebasetype);

    void setSeekParameters(createKeySerializer createkeyserializer);

    void setShuffleOrder(ToStringSerializerBase toStringSerializerBase);

    void setSkipSilenceEnabled(boolean z);

    void setVideoChangeFrameRateStrategy(int i);

    void setVideoEffects(List<JsonValueFormat> list);

    void setVideoFrameMetadataListener(getRemainingInput getremaininginput);

    void setVideoScalingMode(int i);

    void setWakeMode(int i);

    public static class IconCompatParcelizer {
        public static final IconCompatParcelizer read = new IconCompatParcelizer();
        public final long AudioAttributesCompatParcelizer = C.TIME_UNSET;

        private IconCompatParcelizer() {
        }
    }

    public static final class read {
        public final Context AudioAttributesCompatParcelizer;
        public long AudioAttributesImplApi21Parcelizer;
        public boolean AudioAttributesImplApi26Parcelizer;
        public boolean AudioAttributesImplBaseParcelizer;
        public JsonIntegerFormatVisitor IconCompatParcelizer;
        public boolean MediaBrowserCompatCustomActionResultReceiver;
        public long MediaBrowserCompatItemReceiver;
        public _childrenEqual MediaBrowserCompatMediaItem;
        public long MediaBrowserCompatSearchResultReceiver;
        public String MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        public boolean MediaDescriptionCompat;
        public parseUdtaMeta<_withArrayAddTailProperty> MediaMetadataCompat;
        public Looper RatingCompat;
        public buildTypeDeserializer RemoteActionCompatParcelizer;
        public int handleMediaPlayPauseIfPendingOnHandler;
        public Looper onAddQueueItem;
        public boolean onCommand;
        public parseUdtaMeta<StdKeySerializers.AudioAttributesCompatParcelizer> onCustomAction;
        public long onFastForward;
        public parseUdtaMeta<customSerializers> onMediaButtonEvent;
        public long onPause;
        public validateBaseType onPlay;
        public long onPlayFromMediaId;
        public boolean onPlayFromSearch;
        public parseUdtaMeta<_constructSimple> onPlayFromUri;
        public createKeySerializer onPrepare;
        public boolean onPrepareFromMediaId;
        public boolean onPrepareFromSearch;
        public int onPrepareFromUri;
        public int onRemoveQueueItem;
        public boolean onRemoveQueueItemAt;
        public int onRewind;
        private boolean onSeekTo;
        public parseMvhd<buildTypeDeserializer, findSerializerByPrimaryType> read;
        public parseUdtaMeta<_fromWellKnownInterface> write;

        public static /* synthetic */ StdKeySerializers.AudioAttributesCompatParcelizer read(StdKeySerializers.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
            return audioAttributesCompatParcelizer;
        }

        public static /* synthetic */ _constructSimple write(_constructSimple _constructsimple) {
            return _constructsimple;
        }

        public read(final Context context) {
            this(context, new parseUdtaMeta() { // from class: o._reportWrongNodeType
                @Override // kotlin.parseUdtaMeta
                public final Object get() {
                    return ExoPlayer.read.AudioAttributesCompatParcelizer(context);
                }
            }, new parseUdtaMeta() { // from class: o._jsonPointerIfValid
                @Override // kotlin.parseUdtaMeta
                public final Object get() {
                    return ExoPlayer.read.write(context);
                }
            });
        }

        public static /* synthetic */ customSerializers AudioAttributesCompatParcelizer(Context context) {
            return new BaseJsonNode(context);
        }

        public static /* synthetic */ StdKeySerializers.AudioAttributesCompatParcelizer write(Context context) {
            return new ReferenceTypeSerializer(context, new checkAndFixAccess());
        }

        private read(final Context context, parseUdtaMeta<customSerializers> parseudtameta, parseUdtaMeta<StdKeySerializers.AudioAttributesCompatParcelizer> parseudtameta2) {
            this(context, parseudtameta, parseudtameta2, new parseUdtaMeta() { // from class: o._withArrayAddTailElement
                @Override // kotlin.parseUdtaMeta
                public final Object get() {
                    return ExoPlayer.read.IconCompatParcelizer(context);
                }
            }, new parseUdtaMeta() { // from class: o._withXxxSetArrayElement
                @Override // kotlin.parseUdtaMeta
                public final Object get() {
                    return new ArrayNode();
                }
            }, new parseUdtaMeta() { // from class: o._withArray
                @Override // kotlin.parseUdtaMeta
                public final Object get() {
                    return _newSimpleType.IconCompatParcelizer(context);
                }
            }, new parseMvhd() { // from class: o._reportWrongNodeOperation
                @Override // kotlin.parseMvhd
                public final Object apply(Object obj) {
                    return new findReferenceSerializer((buildTypeDeserializer) obj);
                }
            });
        }

        public static /* synthetic */ _constructSimple IconCompatParcelizer(Context context) {
            return new findBoundType(context);
        }

        private read(Context context, parseUdtaMeta<customSerializers> parseudtameta, parseUdtaMeta<StdKeySerializers.AudioAttributesCompatParcelizer> parseudtameta2, parseUdtaMeta<_constructSimple> parseudtameta3, parseUdtaMeta<_withArrayAddTailProperty> parseudtameta4, parseUdtaMeta<_fromWellKnownInterface> parseudtameta5, parseMvhd<buildTypeDeserializer, findSerializerByPrimaryType> parsemvhd) {
            this.AudioAttributesCompatParcelizer = (Context) buildTypeSerializer.IconCompatParcelizer(context);
            this.onMediaButtonEvent = parseudtameta;
            this.onCustomAction = parseudtameta2;
            this.onPlayFromUri = parseudtameta3;
            this.MediaMetadataCompat = parseudtameta4;
            this.write = parseudtameta5;
            this.read = parsemvhd;
            this.RatingCompat = LaissezFaireSubTypeValidator.write();
            this.IconCompatParcelizer = JsonIntegerFormatVisitor.write;
            this.onRemoveQueueItem = 0;
            this.onRewind = 1;
            this.onPrepareFromUri = 0;
            this.onPlayFromSearch = true;
            this.onPrepare = createKeySerializer.write;
            this.onPause = 5000L;
            this.onPlayFromMediaId = C.DEFAULT_SEEK_FORWARD_INCREMENT_MS;
            this.MediaBrowserCompatSearchResultReceiver = C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS;
            this.MediaBrowserCompatMediaItem = new findMapSerializer.RemoteActionCompatParcelizer().write();
            this.RemoteActionCompatParcelizer = buildTypeDeserializer.write;
            this.onFastForward = 500L;
            this.AudioAttributesImplApi21Parcelizer = 2000L;
            this.onRemoveQueueItemAt = true;
            this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = "";
            this.handleMediaPlayPauseIfPendingOnHandler = -1000;
        }

        public final read RemoteActionCompatParcelizer(final StdKeySerializers.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
            buildTypeSerializer.write(!this.onSeekTo);
            this.onCustomAction = new parseUdtaMeta() { // from class: o._withXxxVerifyReplace
                @Override // kotlin.parseUdtaMeta
                public final Object get() {
                    return ExoPlayer.read.read(audioAttributesCompatParcelizer);
                }
            };
            return this;
        }

        public final read read(final _constructSimple _constructsimple) {
            buildTypeSerializer.write(!this.onSeekTo);
            this.onPlayFromUri = new parseUdtaMeta() { // from class: o._withXxxMayReplace
                @Override // kotlin.parseUdtaMeta
                public final Object get() {
                    return ExoPlayer.read.write(_constructsimple);
                }
            };
            return this;
        }

        public final read RemoteActionCompatParcelizer(JsonIntegerFormatVisitor jsonIntegerFormatVisitor) {
            buildTypeSerializer.write(!this.onSeekTo);
            this.IconCompatParcelizer = (JsonIntegerFormatVisitor) buildTypeSerializer.IconCompatParcelizer(jsonIntegerFormatVisitor);
            this.MediaDescriptionCompat = true;
            return this;
        }

        public final ExoPlayer write() {
            buildTypeSerializer.write(!this.onSeekTo);
            this.onSeekTo = true;
            return new BinaryNode(this);
        }
    }
}
