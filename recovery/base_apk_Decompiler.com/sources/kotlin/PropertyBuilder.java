package kotlin;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioDeviceInfo;
import android.media.AudioRouting;
import android.media.AudioTrack;
import android.media.PlaybackParams;
import android.media.metrics.LogSessionId;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import androidx.media3.exoplayer.ExoPlayer;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.PlaybackException;
import com.google.android.exoplayer2.audio.Ac3Util;
import com.google.android.exoplayer2.util.MimeTypes;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import kotlin.FilterProvider;
import kotlin.SerializerCache;
import kotlin.deserializeTypedFromArray;
import kotlin.initExtraTracks;
import kotlin.modifyKeySerializer;
import kotlin.serializePolymorphic;

/* JADX INFO: loaded from: classes2.dex */
public final class PropertyBuilder implements serializePolymorphic {
    private static int AudioAttributesCompatParcelizer = 0;
    private static ExecutorService RemoteActionCompatParcelizer = null;
    private static final Object read = new Object();
    public static boolean write = false;
    private final ExoPlayer.RemoteActionCompatParcelizer AudioAttributesImplApi21Parcelizer;
    private modifyMapSerializer AudioAttributesImplApi26Parcelizer;
    private MediaBrowserCompatItemReceiver AudioAttributesImplBaseParcelizer;
    private long IconCompatParcelizer;
    private JsonIntegerFormatVisitor MediaBrowserCompatCustomActionResultReceiver;
    private modifyKeySerializer MediaBrowserCompatItemReceiver;
    private final RemoteActionCompatParcelizer MediaBrowserCompatMediaItem;
    private final deserializeTypedFromAny MediaBrowserCompatSearchResultReceiver;
    private expectNumberFormat MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    private int MediaDescriptionCompat;
    private AudioTrack MediaMetadataCompat;
    private byte[] MediaSessionCompatQueueItem;
    private int MediaSessionCompatResultReceiverWrapper;
    private boolean MediaSessionCompatToken;
    private final boolean ParcelableVolumeInfo;
    private modifyArraySerializer PlaybackStateCompat;
    private long PlaybackStateCompatCustomAction;
    private deserializeTypedFromScalar RatingCompat;
    private Handler ResultReceiver;
    private boolean _init_lambda2;
    private boolean _init_lambda3;
    private long _init_lambda4;
    private boolean _init_lambda5;
    private final initExtraTracks<deserializeTypedFromArray> accessaddObserverForBackInvoker;
    private final initExtraTracks<deserializeTypedFromArray> accessensureViewModelStore;
    private final getReadOnlyLookupMap accessgetReportFullyDrawnExecutorp;
    private float accessonBackPresseds1027565324;
    private final AudioAttributesImplApi26Parcelizer<serializePolymorphic.MediaBrowserCompatItemReceiver> addObserverForBackInvoker;
    private long createFullyDrawnExecutor;
    private long ensureViewModelStore;
    private int handleMediaPlayPauseIfPendingOnHandler;
    private final FilterProvider onAddQueueItem;
    private ByteBuffer onCommand;
    private final write onCustomAction;
    private final findFilter onFastForward;
    private final boolean onMediaButtonEvent;
    private MediaBrowserCompatCustomActionResultReceiver onPause;
    private final Context onPlay;
    private boolean onPlayFromMediaId;
    private boolean onPlayFromSearch;
    private final AudioAttributesImplApi26Parcelizer<serializePolymorphic.AudioAttributesCompatParcelizer> onPlayFromUri;
    private int onPrepare;
    private boolean onPrepareFromMediaId;
    private ByteBuffer onPrepareFromSearch;
    private long onPrepareFromUri;
    private int onRemoveQueueItem;
    private serializePolymorphic.IconCompatParcelizer onRemoveQueueItemAt;
    private long onRewind;
    private boolean onSeekTo;
    private MediaBrowserCompatItemReceiver onSetCaptioningEnabled;
    private boolean onSetPlaybackSpeed;
    private int onSetRating;
    private final ArrayDeque<MediaBrowserCompatItemReceiver> onSetRepeatMode;
    private MediaMetadataCompat onSetShuffleMode;
    private MediaBrowserCompatCustomActionResultReceiver onSkipToNext;
    private ByteBuffer onSkipToPrevious;
    private AudioAttributesImplApi21Parcelizer onSkipToQueueItem;
    private DefaultBaseTypeLimitingValidatorUnsafeBaseTypes onStop;
    private final typeIdVisibility r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw;
    private modifySerializer r8lambdaKUbBm7ckfqTc9QCgukC86fguu4;
    private boolean r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
    private long r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28;
    private long r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8;
    private boolean r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0;
    private Looper setSessionImpl;

    public interface RemoteActionCompatParcelizer {
        modifyEnumSerializer RemoteActionCompatParcelizer(C0170format c0170format, JsonIntegerFormatVisitor jsonIntegerFormatVisitor);
    }

    public interface write {
        public static final write read = new SerializerCache.RemoteActionCompatParcelizer().AudioAttributesCompatParcelizer();

        int AudioAttributesCompatParcelizer(int i, int i2, int i3, int i4, int i5, int i6, double d);
    }

    /* synthetic */ PropertyBuilder(AudioAttributesCompatParcelizer audioAttributesCompatParcelizer, byte b) {
        this(audioAttributesCompatParcelizer);
    }

    static /* synthetic */ boolean AudioAttributesCompatParcelizer(PropertyBuilder propertyBuilder) {
        propertyBuilder.onPlayFromSearch = true;
        return true;
    }

    public static class AudioAttributesImplBaseParcelizer implements findSerializationType {
        private final deserializeTypedFromArray[] IconCompatParcelizer;
        private final PropertyWriter RemoteActionCompatParcelizer;
        private final hasDefaultImpl write;

        public AudioAttributesImplBaseParcelizer(deserializeTypedFromArray... deserializetypedfromarrayArr) {
            this(deserializetypedfromarrayArr, new PropertyWriter(), new hasDefaultImpl());
        }

        private AudioAttributesImplBaseParcelizer(deserializeTypedFromArray[] deserializetypedfromarrayArr, PropertyWriter propertyWriter, hasDefaultImpl hasdefaultimpl) {
            deserializeTypedFromArray[] deserializetypedfromarrayArr2 = new deserializeTypedFromArray[deserializetypedfromarrayArr.length + 2];
            this.IconCompatParcelizer = deserializetypedfromarrayArr2;
            System.arraycopy(deserializetypedfromarrayArr, 0, deserializetypedfromarrayArr2, 0, deserializetypedfromarrayArr.length);
            this.RemoteActionCompatParcelizer = propertyWriter;
            this.write = hasdefaultimpl;
            deserializetypedfromarrayArr2[deserializetypedfromarrayArr.length] = propertyWriter;
            deserializetypedfromarrayArr2[deserializetypedfromarrayArr.length + 1] = hasdefaultimpl;
        }

        @Override // kotlin.deserializeTypedFromAny
        public final deserializeTypedFromArray[] AudioAttributesCompatParcelizer() {
            return this.IconCompatParcelizer;
        }

        @Override // kotlin.deserializeTypedFromAny
        public final DefaultBaseTypeLimitingValidatorUnsafeBaseTypes AudioAttributesCompatParcelizer(DefaultBaseTypeLimitingValidatorUnsafeBaseTypes defaultBaseTypeLimitingValidatorUnsafeBaseTypes) {
            this.write.AudioAttributesCompatParcelizer(defaultBaseTypeLimitingValidatorUnsafeBaseTypes.AudioAttributesCompatParcelizer);
            this.write.RemoteActionCompatParcelizer(defaultBaseTypeLimitingValidatorUnsafeBaseTypes.RemoteActionCompatParcelizer);
            return defaultBaseTypeLimitingValidatorUnsafeBaseTypes;
        }

        @Override // kotlin.deserializeTypedFromAny
        public final boolean read(boolean z) {
            this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(z);
            return z;
        }

        @Override // kotlin.deserializeTypedFromAny
        public final long write(long j) {
            return this.write.read() ? this.write.read(j) : j;
        }

        @Override // kotlin.deserializeTypedFromAny
        public final long write() {
            return this.RemoteActionCompatParcelizer.MediaBrowserCompatMediaItem();
        }
    }

    public static final class AudioAttributesCompatParcelizer {
        private ExoPlayer.RemoteActionCompatParcelizer AudioAttributesCompatParcelizer;
        private boolean AudioAttributesImplApi21Parcelizer;
        private boolean AudioAttributesImplApi26Parcelizer;
        private final Context AudioAttributesImplBaseParcelizer;
        private write IconCompatParcelizer;
        private boolean MediaBrowserCompatItemReceiver;
        private modifyMapSerializer RemoteActionCompatParcelizer;
        private RemoteActionCompatParcelizer read;
        private deserializeTypedFromAny write;

        @Deprecated
        public AudioAttributesCompatParcelizer() {
            this.AudioAttributesImplBaseParcelizer = null;
            this.RemoteActionCompatParcelizer = modifyMapSerializer.read;
            this.IconCompatParcelizer = write.read;
        }

        public AudioAttributesCompatParcelizer(Context context) {
            this.AudioAttributesImplBaseParcelizer = context;
            this.RemoteActionCompatParcelizer = modifyMapSerializer.read;
            this.IconCompatParcelizer = write.read;
        }

        public final AudioAttributesCompatParcelizer IconCompatParcelizer(boolean z) {
            this.AudioAttributesImplApi21Parcelizer = z;
            return this;
        }

        public final AudioAttributesCompatParcelizer AudioAttributesCompatParcelizer(boolean z) {
            this.AudioAttributesImplApi26Parcelizer = z;
            return this;
        }

        public final PropertyBuilder RemoteActionCompatParcelizer() {
            buildTypeSerializer.write(!this.MediaBrowserCompatItemReceiver);
            this.MediaBrowserCompatItemReceiver = true;
            byte b = 0;
            if (this.write == null) {
                this.write = new AudioAttributesImplBaseParcelizer(new deserializeTypedFromArray[0]);
            }
            if (this.read == null) {
                this.read = new _constructPropertyWriter(this.AudioAttributesImplBaseParcelizer);
            }
            return new PropertyBuilder(this, b);
        }
    }

    private PropertyBuilder(AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
        modifyMapSerializer modifymapserializerIconCompatParcelizer;
        Context context = audioAttributesCompatParcelizer.AudioAttributesImplBaseParcelizer;
        this.onPlay = context;
        JsonIntegerFormatVisitor jsonIntegerFormatVisitor = JsonIntegerFormatVisitor.write;
        this.MediaBrowserCompatCustomActionResultReceiver = jsonIntegerFormatVisitor;
        if (context == null) {
            modifymapserializerIconCompatParcelizer = audioAttributesCompatParcelizer.RemoteActionCompatParcelizer;
        } else {
            modifymapserializerIconCompatParcelizer = modifyMapSerializer.IconCompatParcelizer(context, jsonIntegerFormatVisitor);
        }
        this.AudioAttributesImplApi26Parcelizer = modifymapserializerIconCompatParcelizer;
        this.MediaBrowserCompatSearchResultReceiver = audioAttributesCompatParcelizer.write;
        byte b = 0;
        this.onMediaButtonEvent = LaissezFaireSubTypeValidator.MediaBrowserCompatCustomActionResultReceiver >= 21 && audioAttributesCompatParcelizer.AudioAttributesImplApi21Parcelizer;
        this.ParcelableVolumeInfo = LaissezFaireSubTypeValidator.MediaBrowserCompatCustomActionResultReceiver >= 23 && audioAttributesCompatParcelizer.AudioAttributesImplApi26Parcelizer;
        this.onSetRating = 0;
        this.onCustomAction = audioAttributesCompatParcelizer.IconCompatParcelizer;
        this.MediaBrowserCompatMediaItem = (RemoteActionCompatParcelizer) buildTypeSerializer.IconCompatParcelizer(audioAttributesCompatParcelizer.read);
        typeIdVisibility typeidvisibility = new typeIdVisibility(buildTypeDeserializer.write);
        this.r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw = typeidvisibility;
        typeidvisibility.read();
        this.onAddQueueItem = new FilterProvider(new MediaBrowserCompatMediaItem(this, b));
        findFilter findfilter = new findFilter();
        this.onFastForward = findfilter;
        getReadOnlyLookupMap getreadonlylookupmap = new getReadOnlyLookupMap();
        this.accessgetReportFullyDrawnExecutorp = getreadonlylookupmap;
        this.accessensureViewModelStore = initExtraTracks.write(new getTypeIdResolver(), findfilter, getreadonlylookupmap);
        this.accessaddObserverForBackInvoker = initExtraTracks.read(new _makeReadOnlyLookupMap());
        this.accessonBackPresseds1027565324 = 1.0f;
        this.MediaDescriptionCompat = 0;
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = new expectNumberFormat();
        this.onSetCaptioningEnabled = new MediaBrowserCompatItemReceiver(DefaultBaseTypeLimitingValidatorUnsafeBaseTypes.write, 0L, 0L, (byte) 0);
        this.onStop = DefaultBaseTypeLimitingValidatorUnsafeBaseTypes.write;
        this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = false;
        this.onSetRepeatMode = new ArrayDeque<>();
        this.onPlayFromUri = new AudioAttributesImplApi26Parcelizer<>();
        this.addObserverForBackInvoker = new AudioAttributesImplApi26Parcelizer<>();
        this.AudioAttributesImplApi21Parcelizer = audioAttributesCompatParcelizer.AudioAttributesCompatParcelizer;
    }

    @Override // kotlin.serializePolymorphic
    public final void write(serializePolymorphic.IconCompatParcelizer iconCompatParcelizer) {
        this.onRemoveQueueItemAt = iconCompatParcelizer;
    }

    @Override // kotlin.serializePolymorphic
    public final void AudioAttributesCompatParcelizer(modifyArraySerializer modifyarrayserializer) {
        this.PlaybackStateCompat = modifyarrayserializer;
    }

    @Override // kotlin.serializePolymorphic
    public final void write(buildTypeDeserializer buildtypedeserializer) {
        this.onAddQueueItem.IconCompatParcelizer(buildtypedeserializer);
    }

    @Override // kotlin.serializePolymorphic
    public final boolean IconCompatParcelizer(C0170format c0170format) {
        return RemoteActionCompatParcelizer(c0170format) != 0;
    }

    @Override // kotlin.serializePolymorphic
    public final int RemoteActionCompatParcelizer(C0170format c0170format) {
        onPlay();
        if (!MimeTypes.AUDIO_RAW.equals(c0170format.onPlayFromUri)) {
            return this.AudioAttributesImplApi26Parcelizer.RemoteActionCompatParcelizer(c0170format, this.MediaBrowserCompatCustomActionResultReceiver) ? 2 : 0;
        }
        if (LaissezFaireSubTypeValidator.MediaBrowserCompatMediaItem(c0170format.onMediaButtonEvent)) {
            return (c0170format.onMediaButtonEvent == 2 || (this.onMediaButtonEvent && c0170format.onMediaButtonEvent == 4)) ? 2 : 1;
        }
        StringBuilder sb = new StringBuilder("Invalid PCM encoding: ");
        sb.append(c0170format.onMediaButtonEvent);
        prune.RemoteActionCompatParcelizer("DefaultAudioSink", sb.toString());
        return 0;
    }

    @Override // kotlin.serializePolymorphic
    public final modifyEnumSerializer read(C0170format c0170format) {
        if (this.onSetPlaybackSpeed) {
            return modifyEnumSerializer.read;
        }
        return this.MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer(c0170format, this.MediaBrowserCompatCustomActionResultReceiver);
    }

    @Override // kotlin.serializePolymorphic
    public final long AudioAttributesCompatParcelizer(boolean z) {
        if (!onCommand() || this._init_lambda3) {
            return Long.MIN_VALUE;
        }
        return IconCompatParcelizer(AudioAttributesCompatParcelizer(Math.min(this.onAddQueueItem.RemoteActionCompatParcelizer(z), this.onPause.write(handleMediaPlayPauseIfPendingOnHandler()))));
    }

    @Override // kotlin.serializePolymorphic
    public final void RemoteActionCompatParcelizer(C0170format c0170format, int[] iArr) throws serializePolymorphic.RemoteActionCompatParcelizer {
        modifyEnumSerializer modifyenumserializer;
        boolean z;
        int i;
        int iRemoteActionCompatParcelizer;
        int i2;
        boolean z2;
        deserializeTypedFromScalar deserializetypedfromscalar;
        int i3;
        int i4;
        boolean z3;
        boolean z4;
        int i5;
        int i6;
        int i7;
        int i8;
        int[] iArr2;
        onPlay();
        if (MimeTypes.AUDIO_RAW.equals(c0170format.onPlayFromUri)) {
            buildTypeSerializer.IconCompatParcelizer(LaissezFaireSubTypeValidator.MediaBrowserCompatMediaItem(c0170format.onMediaButtonEvent));
            int i9 = LaissezFaireSubTypeValidator.read(c0170format.onMediaButtonEvent, c0170format.AudioAttributesCompatParcelizer);
            initExtraTracks.IconCompatParcelizer iconCompatParcelizer = new initExtraTracks.IconCompatParcelizer();
            if (RemoteActionCompatParcelizer(c0170format.onMediaButtonEvent)) {
                iconCompatParcelizer.RemoteActionCompatParcelizer(this.accessaddObserverForBackInvoker);
            } else {
                iconCompatParcelizer.RemoteActionCompatParcelizer(this.accessensureViewModelStore);
                iconCompatParcelizer.read(this.MediaBrowserCompatSearchResultReceiver.AudioAttributesCompatParcelizer());
            }
            deserializeTypedFromScalar deserializetypedfromscalar2 = new deserializeTypedFromScalar(iconCompatParcelizer.IconCompatParcelizer());
            if (deserializetypedfromscalar2.equals(this.RatingCompat)) {
                deserializetypedfromscalar2 = this.RatingCompat;
            }
            this.accessgetReportFullyDrawnExecutorp.IconCompatParcelizer(c0170format.MediaDescriptionCompat, c0170format.MediaBrowserCompatSearchResultReceiver);
            if (LaissezFaireSubTypeValidator.MediaBrowserCompatCustomActionResultReceiver < 21 && c0170format.AudioAttributesCompatParcelizer == 8 && iArr == null) {
                iArr2 = new int[6];
                for (int i10 = 0; i10 < 6; i10++) {
                    iArr2[i10] = i10;
                }
            } else {
                iArr2 = iArr;
            }
            this.onFastForward.read(iArr2);
            try {
                deserializeTypedFromArray.IconCompatParcelizer IconCompatParcelizer2 = deserializetypedfromscalar2.IconCompatParcelizer(new deserializeTypedFromArray.IconCompatParcelizer(c0170format));
                int i11 = IconCompatParcelizer2.write;
                int i12 = IconCompatParcelizer2.RemoteActionCompatParcelizer;
                int iRemoteActionCompatParcelizer2 = LaissezFaireSubTypeValidator.RemoteActionCompatParcelizer(IconCompatParcelizer2.IconCompatParcelizer);
                z4 = false;
                i3 = LaissezFaireSubTypeValidator.read(i11, IconCompatParcelizer2.IconCompatParcelizer);
                deserializetypedfromscalar = deserializetypedfromscalar2;
                i5 = i11;
                i4 = i12;
                i6 = iRemoteActionCompatParcelizer2;
                z3 = this.ParcelableVolumeInfo;
                i8 = i9;
                i7 = 0;
            } catch (deserializeTypedFromArray.RemoteActionCompatParcelizer e) {
                throw new serializePolymorphic.RemoteActionCompatParcelizer(e, c0170format);
            }
        } else {
            deserializeTypedFromScalar deserializetypedfromscalar3 = new deserializeTypedFromScalar(initExtraTracks.AudioAttributesImplApi26Parcelizer());
            int i13 = c0170format.onPrepareFromUri;
            if (this.onSetRating != 0) {
                modifyenumserializer = read(c0170format);
            } else {
                modifyenumserializer = modifyEnumSerializer.read;
            }
            if (this.onSetRating != 0 && modifyenumserializer.RemoteActionCompatParcelizer) {
                int i14 = DefaultBaseTypeLimitingValidator.read((String) buildTypeSerializer.IconCompatParcelizer(c0170format.onPlayFromUri), c0170format.RemoteActionCompatParcelizer);
                i = 1;
                iRemoteActionCompatParcelizer = LaissezFaireSubTypeValidator.RemoteActionCompatParcelizer(c0170format.AudioAttributesCompatParcelizer);
                i2 = i14;
                z2 = modifyenumserializer.AudioAttributesCompatParcelizer;
                z = true;
            } else {
                Pair<Integer, Integer> pairWrite = this.AudioAttributesImplApi26Parcelizer.write(c0170format, this.MediaBrowserCompatCustomActionResultReceiver);
                if (pairWrite == null) {
                    throw new serializePolymorphic.RemoteActionCompatParcelizer("Unable to configure passthrough for: ".concat(String.valueOf(c0170format)), c0170format);
                }
                int iIntValue = ((Integer) pairWrite.first).intValue();
                int iIntValue2 = ((Integer) pairWrite.second).intValue();
                z = this.ParcelableVolumeInfo;
                i = 2;
                iRemoteActionCompatParcelizer = iIntValue2;
                i2 = iIntValue;
                z2 = false;
            }
            deserializetypedfromscalar = deserializetypedfromscalar3;
            i3 = -1;
            i4 = i13;
            z3 = z;
            z4 = z2;
            i5 = i2;
            i6 = iRemoteActionCompatParcelizer;
            i7 = i;
            i8 = -1;
        }
        if (i5 == 0) {
            int i15 = i7;
            StringBuilder sb = new StringBuilder("Invalid output encoding (mode=");
            sb.append(i15);
            sb.append(") for: ");
            sb.append(c0170format);
            throw new serializePolymorphic.RemoteActionCompatParcelizer(sb.toString(), c0170format);
        }
        if (i6 == 0) {
            int i16 = i7;
            StringBuilder sb2 = new StringBuilder("Invalid output channel config (mode=");
            sb2.append(i16);
            sb2.append(") for: ");
            sb2.append(c0170format);
            throw new serializePolymorphic.RemoteActionCompatParcelizer(sb2.toString(), c0170format);
        }
        int i17 = c0170format.read;
        if (MimeTypes.AUDIO_DTS_EXPRESS.equals(c0170format.onPlayFromUri) && i17 == -1) {
            i17 = Ac3Util.E_AC3_MAX_RATE_BYTES_PER_SECOND;
        }
        int iAudioAttributesCompatParcelizer = this.onCustomAction.AudioAttributesCompatParcelizer(read(i4, i6, i5), i5, i7, i3 != -1 ? i3 : 1, i4, i17, z3 ? 8.0d : 1.0d);
        this.onSetPlaybackSpeed = false;
        int i18 = i8;
        MediaBrowserCompatCustomActionResultReceiver mediaBrowserCompatCustomActionResultReceiver = new MediaBrowserCompatCustomActionResultReceiver(c0170format, i18, i7, i3, i4, i6, i5, iAudioAttributesCompatParcelizer, deserializetypedfromscalar, z3, z4, this._init_lambda5);
        if (onCommand()) {
            this.onSkipToNext = mediaBrowserCompatCustomActionResultReceiver;
        } else {
            this.onPause = mediaBrowserCompatCustomActionResultReceiver;
        }
    }

    private void onPrepare() {
        deserializeTypedFromScalar deserializetypedfromscalar = this.onPause.AudioAttributesCompatParcelizer;
        this.RatingCompat = deserializetypedfromscalar;
        deserializetypedfromscalar.RemoteActionCompatParcelizer();
    }

    private boolean onCustomAction() throws serializePolymorphic.AudioAttributesCompatParcelizer {
        modifyKeySerializer modifykeyserializer;
        modifyArraySerializer modifyarrayserializer;
        if (!this.r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw.RemoteActionCompatParcelizer()) {
            return false;
        }
        AudioTrack audioTrackRatingCompat = RatingCompat();
        this.MediaMetadataCompat = audioTrackRatingCompat;
        if (AudioAttributesCompatParcelizer(audioTrackRatingCompat)) {
            write(this.MediaMetadataCompat);
            if (this.onPause.write) {
                this.MediaMetadataCompat.setOffloadDelayPadding(this.onPause.IconCompatParcelizer.MediaDescriptionCompat, this.onPause.IconCompatParcelizer.MediaBrowserCompatSearchResultReceiver);
            }
        }
        if (LaissezFaireSubTypeValidator.MediaBrowserCompatCustomActionResultReceiver >= 31 && (modifyarrayserializer = this.PlaybackStateCompat) != null) {
            read.write(this.MediaMetadataCompat, modifyarrayserializer);
        }
        this.MediaDescriptionCompat = this.MediaMetadataCompat.getAudioSessionId();
        this.onAddQueueItem.IconCompatParcelizer(this.MediaMetadataCompat, this.onPause.MediaBrowserCompatItemReceiver == 2, this.onPause.AudioAttributesImplApi26Parcelizer, this.onPause.AudioAttributesImplApi21Parcelizer, this.onPause.RemoteActionCompatParcelizer);
        onPause();
        if (this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.IconCompatParcelizer != 0) {
            this.MediaMetadataCompat.attachAuxEffect(this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.IconCompatParcelizer);
            this.MediaMetadataCompat.setAuxEffectSendLevel(this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.write);
        }
        if (this.r8lambdaKUbBm7ckfqTc9QCgukC86fguu4 != null && LaissezFaireSubTypeValidator.MediaBrowserCompatCustomActionResultReceiver >= 23) {
            IconCompatParcelizer.AudioAttributesCompatParcelizer(this.MediaMetadataCompat, this.r8lambdaKUbBm7ckfqTc9QCgukC86fguu4);
            modifyKeySerializer modifykeyserializer2 = this.MediaBrowserCompatItemReceiver;
            if (modifykeyserializer2 != null) {
                modifykeyserializer2.write(this.r8lambdaKUbBm7ckfqTc9QCgukC86fguu4.IconCompatParcelizer);
            }
        }
        if (LaissezFaireSubTypeValidator.MediaBrowserCompatCustomActionResultReceiver >= 24 && (modifykeyserializer = this.MediaBrowserCompatItemReceiver) != null) {
            this.onSkipToQueueItem = new AudioAttributesImplApi21Parcelizer(this.MediaMetadataCompat, modifykeyserializer);
        }
        this._init_lambda3 = true;
        serializePolymorphic.IconCompatParcelizer iconCompatParcelizer = this.onRemoveQueueItemAt;
        if (iconCompatParcelizer != null) {
            iconCompatParcelizer.RemoteActionCompatParcelizer(this.onPause.write());
        }
        return true;
    }

    @Override // kotlin.serializePolymorphic
    public final void MediaBrowserCompatCustomActionResultReceiver() {
        this.MediaSessionCompatToken = true;
        if (onCommand()) {
            this.onAddQueueItem.AudioAttributesCompatParcelizer();
            this.MediaMetadataCompat.play();
        }
    }

    @Override // kotlin.serializePolymorphic
    public final void AudioAttributesCompatParcelizer() {
        this._init_lambda2 = true;
    }

    @Override // kotlin.serializePolymorphic
    public final boolean read(ByteBuffer byteBuffer, long j, int i) throws Exception {
        ByteBuffer byteBuffer2 = this.onPrepareFromSearch;
        buildTypeSerializer.IconCompatParcelizer(byteBuffer2 == null || byteBuffer == byteBuffer2);
        if (this.onSkipToNext != null) {
            if (!MediaMetadataCompat()) {
                return false;
            }
            if (!this.onSkipToNext.RemoteActionCompatParcelizer(this.onPause)) {
                onMediaButtonEvent();
                if (MediaBrowserCompatItemReceiver()) {
                    return false;
                }
                write();
            } else {
                this.onPause = this.onSkipToNext;
                this.onSkipToNext = null;
                AudioTrack audioTrack = this.MediaMetadataCompat;
                if (audioTrack != null && AudioAttributesCompatParcelizer(audioTrack) && this.onPause.write) {
                    if (this.MediaMetadataCompat.getPlayState() == 3) {
                        this.MediaMetadataCompat.setOffloadEndOfStream();
                        this.onAddQueueItem.IconCompatParcelizer();
                    }
                    this.MediaMetadataCompat.setOffloadDelayPadding(this.onPause.IconCompatParcelizer.MediaDescriptionCompat, this.onPause.IconCompatParcelizer.MediaBrowserCompatSearchResultReceiver);
                    this.onSeekTo = true;
                }
            }
            RemoteActionCompatParcelizer(j);
        }
        if (!onCommand()) {
            try {
                if (!onCustomAction()) {
                    return false;
                }
            } catch (serializePolymorphic.AudioAttributesCompatParcelizer e) {
                if (e.IconCompatParcelizer) {
                    throw e;
                }
                this.onPlayFromUri.write(e);
                return false;
            }
        }
        this.onPlayFromUri.IconCompatParcelizer();
        if (this._init_lambda3) {
            this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = Math.max(0L, j);
            this._init_lambda2 = false;
            this._init_lambda3 = false;
            if (onPrepareFromSearch()) {
                onPlayFromMediaId();
            }
            RemoteActionCompatParcelizer(j);
            if (this.MediaSessionCompatToken) {
                MediaBrowserCompatCustomActionResultReceiver();
            }
        }
        if (!this.onAddQueueItem.RemoteActionCompatParcelizer(handleMediaPlayPauseIfPendingOnHandler())) {
            return false;
        }
        if (this.onPrepareFromSearch == null) {
            buildTypeSerializer.IconCompatParcelizer(byteBuffer.order() == ByteOrder.LITTLE_ENDIAN);
            if (!byteBuffer.hasRemaining()) {
                return true;
            }
            if (this.onPause.MediaBrowserCompatItemReceiver != 0 && this.onPrepare == 0) {
                int iAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(this.onPause.AudioAttributesImplApi26Parcelizer, byteBuffer);
                this.onPrepare = iAudioAttributesCompatParcelizer;
                if (iAudioAttributesCompatParcelizer == 0) {
                    return true;
                }
            }
            if (this.AudioAttributesImplBaseParcelizer != null) {
                if (!MediaMetadataCompat()) {
                    return false;
                }
                RemoteActionCompatParcelizer(j);
                this.AudioAttributesImplBaseParcelizer = null;
            }
            long jAudioAttributesCompatParcelizer = this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 + this.onPause.AudioAttributesCompatParcelizer(MediaDescriptionCompat() - this.accessgetReportFullyDrawnExecutorp.RatingCompat());
            if (!this._init_lambda2 && Math.abs(jAudioAttributesCompatParcelizer - j) > 200000) {
                serializePolymorphic.IconCompatParcelizer iconCompatParcelizer = this.onRemoveQueueItemAt;
                if (iconCompatParcelizer != null) {
                    iconCompatParcelizer.IconCompatParcelizer(new serializePolymorphic.write(j, jAudioAttributesCompatParcelizer));
                }
                this._init_lambda2 = true;
            }
            if (this._init_lambda2) {
                if (!MediaMetadataCompat()) {
                    return false;
                }
                long j2 = j - jAudioAttributesCompatParcelizer;
                this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 += j2;
                this._init_lambda2 = false;
                RemoteActionCompatParcelizer(j);
                serializePolymorphic.IconCompatParcelizer iconCompatParcelizer2 = this.onRemoveQueueItemAt;
                if (iconCompatParcelizer2 != null && j2 != 0) {
                    iconCompatParcelizer2.read();
                }
            }
            if (this.onPause.MediaBrowserCompatItemReceiver == 0) {
                this._init_lambda4 += (long) byteBuffer.remaining();
            } else {
                this.r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8 += ((long) this.onPrepare) * ((long) i);
            }
            this.onPrepareFromSearch = byteBuffer;
            this.onRemoveQueueItem = i;
        }
        read(j);
        if (!this.onPrepareFromSearch.hasRemaining()) {
            this.onPrepareFromSearch = null;
            this.onRemoveQueueItem = 0;
            return true;
        }
        if (!this.onAddQueueItem.AudioAttributesCompatParcelizer(handleMediaPlayPauseIfPendingOnHandler())) {
            return false;
        }
        prune.RemoteActionCompatParcelizer("DefaultAudioSink", "Resetting stalled audio track");
        write();
        return true;
    }

    private AudioTrack RatingCompat() throws serializePolymorphic.AudioAttributesCompatParcelizer {
        try {
            return read((MediaBrowserCompatCustomActionResultReceiver) buildTypeSerializer.IconCompatParcelizer(this.onPause));
        } catch (serializePolymorphic.AudioAttributesCompatParcelizer e) {
            if (this.onPause.RemoteActionCompatParcelizer > 1000000) {
                MediaBrowserCompatCustomActionResultReceiver mediaBrowserCompatCustomActionResultReceiverAudioAttributesCompatParcelizer = this.onPause.AudioAttributesCompatParcelizer();
                try {
                    AudioTrack audioTrack = this.read(mediaBrowserCompatCustomActionResultReceiverAudioAttributesCompatParcelizer);
                    this.onPause = mediaBrowserCompatCustomActionResultReceiverAudioAttributesCompatParcelizer;
                    return audioTrack;
                } catch (serializePolymorphic.AudioAttributesCompatParcelizer e2) {
                    e.addSuppressed(e2);
                    this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
                    throw e;
                }
            }
            this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
            throw e;
        }
    }

    private AudioTrack read(MediaBrowserCompatCustomActionResultReceiver mediaBrowserCompatCustomActionResultReceiver) throws serializePolymorphic.AudioAttributesCompatParcelizer {
        try {
            AudioTrack audioTrackIconCompatParcelizer = mediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver, this.MediaDescriptionCompat);
            if (this.AudioAttributesImplApi21Parcelizer != null) {
                AudioAttributesCompatParcelizer(audioTrackIconCompatParcelizer);
            }
            return audioTrackIconCompatParcelizer;
        } catch (serializePolymorphic.AudioAttributesCompatParcelizer e) {
            serializePolymorphic.IconCompatParcelizer iconCompatParcelizer = this.onRemoveQueueItemAt;
            if (iconCompatParcelizer != null) {
                iconCompatParcelizer.IconCompatParcelizer(e);
            }
            throw e;
        }
    }

    private void write(AudioTrack audioTrack) {
        if (this.onSetShuffleMode == null) {
            this.onSetShuffleMode = new MediaMetadataCompat();
        }
        this.onSetShuffleMode.IconCompatParcelizer(audioTrack);
    }

    private void read(long j) throws Exception {
        ByteBuffer byteBuffer;
        if (!this.RatingCompat.write()) {
            ByteBuffer byteBuffer2 = this.onPrepareFromSearch;
            if (byteBuffer2 == null) {
                byteBuffer2 = deserializeTypedFromArray.AudioAttributesCompatParcelizer;
            }
            AudioAttributesCompatParcelizer(byteBuffer2, j);
            return;
        }
        while (!this.RatingCompat.AudioAttributesCompatParcelizer()) {
            do {
                byteBuffer = this.RatingCompat.read();
                if (byteBuffer.hasRemaining()) {
                    AudioAttributesCompatParcelizer(byteBuffer, j);
                } else {
                    ByteBuffer byteBuffer3 = this.onPrepareFromSearch;
                    if (byteBuffer3 == null || !byteBuffer3.hasRemaining()) {
                        return;
                    } else {
                        this.RatingCompat.RemoteActionCompatParcelizer(this.onPrepareFromSearch);
                    }
                }
            } while (!byteBuffer.hasRemaining());
            return;
        }
    }

    private boolean MediaMetadataCompat() throws Exception {
        ByteBuffer byteBuffer;
        if (!this.RatingCompat.write()) {
            ByteBuffer byteBuffer2 = this.onSkipToPrevious;
            if (byteBuffer2 == null) {
                return true;
            }
            AudioAttributesCompatParcelizer(byteBuffer2, Long.MIN_VALUE);
            return this.onSkipToPrevious == null;
        }
        this.RatingCompat.IconCompatParcelizer();
        read(Long.MIN_VALUE);
        return this.RatingCompat.AudioAttributesCompatParcelizer() && ((byteBuffer = this.onSkipToPrevious) == null || !byteBuffer.hasRemaining());
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00c0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void AudioAttributesCompatParcelizer(java.nio.ByteBuffer r13, long r14) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 307
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.PropertyBuilder.AudioAttributesCompatParcelizer(java.nio.ByteBuffer, long):void");
    }

    @Override // kotlin.serializePolymorphic
    public final void AudioAttributesImplBaseParcelizer() throws serializePolymorphic.MediaBrowserCompatItemReceiver {
        if (!this.onPrepareFromMediaId && onCommand() && MediaMetadataCompat()) {
            onMediaButtonEvent();
            this.onPrepareFromMediaId = true;
        }
    }

    private void MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
        if (this.onPause.read()) {
            this.onSetPlaybackSpeed = true;
        }
    }

    private static boolean read(int i) {
        return (LaissezFaireSubTypeValidator.MediaBrowserCompatCustomActionResultReceiver >= 24 && i == -6) || i == -32;
    }

    @Override // kotlin.serializePolymorphic
    public final boolean AudioAttributesImplApi26Parcelizer() {
        if (onCommand()) {
            return this.onPrepareFromMediaId && !MediaBrowserCompatItemReceiver();
        }
        return true;
    }

    @Override // kotlin.serializePolymorphic
    public final boolean MediaBrowserCompatItemReceiver() {
        if (onCommand()) {
            return !(LaissezFaireSubTypeValidator.MediaBrowserCompatCustomActionResultReceiver >= 29 && this.MediaMetadataCompat.isOffloadedPlayback() && this.onPlayFromSearch) && this.onAddQueueItem.read(handleMediaPlayPauseIfPendingOnHandler());
        }
        return false;
    }

    @Override // kotlin.serializePolymorphic
    public final void read(DefaultBaseTypeLimitingValidatorUnsafeBaseTypes defaultBaseTypeLimitingValidatorUnsafeBaseTypes) {
        this.onStop = new DefaultBaseTypeLimitingValidatorUnsafeBaseTypes(LaissezFaireSubTypeValidator.AudioAttributesCompatParcelizer(defaultBaseTypeLimitingValidatorUnsafeBaseTypes.AudioAttributesCompatParcelizer, 0.1f, 8.0f), LaissezFaireSubTypeValidator.AudioAttributesCompatParcelizer(defaultBaseTypeLimitingValidatorUnsafeBaseTypes.RemoteActionCompatParcelizer, 0.1f, 8.0f));
        if (onPrepareFromSearch()) {
            onPlayFromMediaId();
        } else {
            AudioAttributesCompatParcelizer(defaultBaseTypeLimitingValidatorUnsafeBaseTypes);
        }
    }

    @Override // kotlin.serializePolymorphic
    public final DefaultBaseTypeLimitingValidatorUnsafeBaseTypes RemoteActionCompatParcelizer() {
        return this.onStop;
    }

    @Override // kotlin.serializePolymorphic
    public final void IconCompatParcelizer(boolean z) {
        this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = z;
        AudioAttributesCompatParcelizer(onPrepareFromSearch() ? DefaultBaseTypeLimitingValidatorUnsafeBaseTypes.write : this.onStop);
    }

    @Override // kotlin.serializePolymorphic
    public final void read(JsonIntegerFormatVisitor jsonIntegerFormatVisitor) {
        if (this.MediaBrowserCompatCustomActionResultReceiver.equals(jsonIntegerFormatVisitor)) {
            return;
        }
        this.MediaBrowserCompatCustomActionResultReceiver = jsonIntegerFormatVisitor;
        if (this._init_lambda5) {
            return;
        }
        modifyKeySerializer modifykeyserializer = this.MediaBrowserCompatItemReceiver;
        if (modifykeyserializer != null) {
            modifykeyserializer.write(jsonIntegerFormatVisitor);
        }
        write();
    }

    @Override // kotlin.serializePolymorphic
    public final void write(int i) {
        if (this.MediaDescriptionCompat != i) {
            this.MediaDescriptionCompat = i;
            this.onPlayFromMediaId = i != 0;
            write();
        }
    }

    @Override // kotlin.serializePolymorphic
    public final void read(expectNumberFormat expectnumberformat) {
        if (this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.equals(expectnumberformat)) {
            return;
        }
        int i = expectnumberformat.IconCompatParcelizer;
        float f = expectnumberformat.write;
        if (this.MediaMetadataCompat != null) {
            if (this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.IconCompatParcelizer != i) {
                this.MediaMetadataCompat.attachAuxEffect(i);
            }
            if (i != 0) {
                this.MediaMetadataCompat.setAuxEffectSendLevel(f);
            }
        }
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = expectnumberformat;
    }

    @Override // kotlin.serializePolymorphic
    public final void RemoteActionCompatParcelizer(AudioDeviceInfo audioDeviceInfo) {
        this.r8lambdaKUbBm7ckfqTc9QCgukC86fguu4 = audioDeviceInfo == null ? null : new modifySerializer(audioDeviceInfo);
        modifyKeySerializer modifykeyserializer = this.MediaBrowserCompatItemReceiver;
        if (modifykeyserializer != null) {
            modifykeyserializer.write(audioDeviceInfo);
        }
        AudioTrack audioTrack = this.MediaMetadataCompat;
        if (audioTrack != null) {
            IconCompatParcelizer.AudioAttributesCompatParcelizer(audioTrack, this.r8lambdaKUbBm7ckfqTc9QCgukC86fguu4);
        }
    }

    @Override // kotlin.serializePolymorphic
    public final void IconCompatParcelizer() {
        buildTypeSerializer.write(LaissezFaireSubTypeValidator.MediaBrowserCompatCustomActionResultReceiver >= 21);
        buildTypeSerializer.write(this.onPlayFromMediaId);
        if (this._init_lambda5) {
            return;
        }
        this._init_lambda5 = true;
        write();
    }

    @Override // kotlin.serializePolymorphic
    public final void read() {
        if (this._init_lambda5) {
            this._init_lambda5 = false;
            write();
        }
    }

    @Override // kotlin.serializePolymorphic
    public final void IconCompatParcelizer(int i) {
        buildTypeSerializer.write(LaissezFaireSubTypeValidator.MediaBrowserCompatCustomActionResultReceiver >= 29);
        this.onSetRating = i;
    }

    @Override // kotlin.serializePolymorphic
    public final void RemoteActionCompatParcelizer(int i, int i2) {
        MediaBrowserCompatCustomActionResultReceiver mediaBrowserCompatCustomActionResultReceiver;
        AudioTrack audioTrack = this.MediaMetadataCompat;
        if (audioTrack == null || !AudioAttributesCompatParcelizer(audioTrack) || (mediaBrowserCompatCustomActionResultReceiver = this.onPause) == null || !mediaBrowserCompatCustomActionResultReceiver.write) {
            return;
        }
        this.MediaMetadataCompat.setOffloadDelayPadding(i, i2);
    }

    @Override // kotlin.serializePolymorphic
    public final void IconCompatParcelizer(float f) {
        if (this.accessonBackPresseds1027565324 != f) {
            this.accessonBackPresseds1027565324 = f;
            onPause();
        }
    }

    private void onPause() {
        if (onCommand()) {
            if (LaissezFaireSubTypeValidator.MediaBrowserCompatCustomActionResultReceiver >= 21) {
                IconCompatParcelizer(this.MediaMetadataCompat, this.accessonBackPresseds1027565324);
            } else {
                write(this.MediaMetadataCompat, this.accessonBackPresseds1027565324);
            }
        }
    }

    @Override // kotlin.serializePolymorphic
    public final void AudioAttributesImplApi21Parcelizer() {
        this.MediaSessionCompatToken = false;
        if (onCommand()) {
            if (this.onAddQueueItem.RemoteActionCompatParcelizer() || AudioAttributesCompatParcelizer(this.MediaMetadataCompat)) {
                this.MediaMetadataCompat.pause();
            }
        }
    }

    @Override // kotlin.serializePolymorphic
    public final void write() {
        AudioAttributesImplApi21Parcelizer audioAttributesImplApi21Parcelizer;
        if (onCommand()) {
            onFastForward();
            if (this.onAddQueueItem.read()) {
                this.MediaMetadataCompat.pause();
            }
            if (AudioAttributesCompatParcelizer(this.MediaMetadataCompat)) {
                ((MediaMetadataCompat) buildTypeSerializer.IconCompatParcelizer(this.onSetShuffleMode)).AudioAttributesCompatParcelizer(this.MediaMetadataCompat);
            }
            if (LaissezFaireSubTypeValidator.MediaBrowserCompatCustomActionResultReceiver < 21 && !this.onPlayFromMediaId) {
                this.MediaDescriptionCompat = 0;
            }
            serializePolymorphic.read readVarWrite = this.onPause.write();
            MediaBrowserCompatCustomActionResultReceiver mediaBrowserCompatCustomActionResultReceiver = this.onSkipToNext;
            if (mediaBrowserCompatCustomActionResultReceiver != null) {
                this.onPause = mediaBrowserCompatCustomActionResultReceiver;
                this.onSkipToNext = null;
            }
            this.onAddQueueItem.write();
            if (LaissezFaireSubTypeValidator.MediaBrowserCompatCustomActionResultReceiver >= 24 && (audioAttributesImplApi21Parcelizer = this.onSkipToQueueItem) != null) {
                audioAttributesImplApi21Parcelizer.read();
                this.onSkipToQueueItem = null;
            }
            IconCompatParcelizer(this.MediaMetadataCompat, this.r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw, this.onRemoveQueueItemAt, readVarWrite);
            this.MediaMetadataCompat = null;
        }
        this.addObserverForBackInvoker.IconCompatParcelizer();
        this.onPlayFromUri.IconCompatParcelizer();
        this.PlaybackStateCompatCustomAction = 0L;
        this.IconCompatParcelizer = 0L;
        Handler handler = this.ResultReceiver;
        if (handler != null) {
            ((Handler) buildTypeSerializer.IconCompatParcelizer(handler)).removeCallbacksAndMessages(null);
        }
    }

    @Override // kotlin.serializePolymorphic
    public final void MediaBrowserCompatSearchResultReceiver() {
        write();
        getCurrentSampleFlags<deserializeTypedFromArray> it = this.accessensureViewModelStore.iterator();
        while (it.hasNext()) {
            it.next().AudioAttributesImplApi26Parcelizer();
        }
        getCurrentSampleFlags<deserializeTypedFromArray> it2 = this.accessaddObserverForBackInvoker.iterator();
        while (it2.hasNext()) {
            it2.next().AudioAttributesImplApi26Parcelizer();
        }
        deserializeTypedFromScalar deserializetypedfromscalar = this.RatingCompat;
        if (deserializetypedfromscalar != null) {
            deserializetypedfromscalar.MediaBrowserCompatCustomActionResultReceiver();
        }
        this.MediaSessionCompatToken = false;
        this.onSetPlaybackSpeed = false;
    }

    @Override // kotlin.serializePolymorphic
    public final void MediaBrowserCompatMediaItem() {
        modifyKeySerializer modifykeyserializer = this.MediaBrowserCompatItemReceiver;
        if (modifykeyserializer != null) {
            modifykeyserializer.read();
        }
    }

    public final void IconCompatParcelizer(modifyMapSerializer modifymapserializer) {
        Looper looperMyLooper = Looper.myLooper();
        Looper looper = this.setSessionImpl;
        if (looper != looperMyLooper) {
            String name = "null";
            String name2 = looper == null ? "null" : looper.getThread().getName();
            if (looperMyLooper != null) {
                name = looperMyLooper.getThread().getName();
            }
            StringBuilder sb = new StringBuilder("Current looper (");
            sb.append(name);
            sb.append(") is not the playback looper (");
            sb.append(name2);
            sb.append(")");
            throw new IllegalStateException(sb.toString());
        }
        if (modifymapserializer.equals(this.AudioAttributesImplApi26Parcelizer)) {
            return;
        }
        this.AudioAttributesImplApi26Parcelizer = modifymapserializer;
        serializePolymorphic.IconCompatParcelizer iconCompatParcelizer = this.onRemoveQueueItemAt;
        if (iconCompatParcelizer != null) {
            iconCompatParcelizer.IconCompatParcelizer();
        }
    }

    private void onFastForward() {
        this._init_lambda4 = 0L;
        this.r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8 = 0L;
        this.ensureViewModelStore = 0L;
        this.createFullyDrawnExecutor = 0L;
        this.onSeekTo = false;
        this.onPrepare = 0;
        this.onSetCaptioningEnabled = new MediaBrowserCompatItemReceiver(this.onStop, 0L, 0L, (byte) 0);
        this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = 0L;
        this.AudioAttributesImplBaseParcelizer = null;
        this.onSetRepeatMode.clear();
        this.onPrepareFromSearch = null;
        this.onRemoveQueueItem = 0;
        this.onSkipToPrevious = null;
        this.r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0 = false;
        this.onPrepareFromMediaId = false;
        this.onPlayFromSearch = false;
        this.onCommand = null;
        this.handleMediaPlayPauseIfPendingOnHandler = 0;
        this.accessgetReportFullyDrawnExecutorp.MediaBrowserCompatMediaItem();
        onPrepare();
    }

    private void onPlayFromMediaId() {
        if (onCommand()) {
            try {
                this.MediaMetadataCompat.setPlaybackParams(new PlaybackParams().allowDefaults().setSpeed(this.onStop.AudioAttributesCompatParcelizer).setPitch(this.onStop.RemoteActionCompatParcelizer).setAudioFallbackMode(2));
            } catch (IllegalArgumentException e) {
                prune.write("DefaultAudioSink", "Failed to set playback params", e);
            }
            DefaultBaseTypeLimitingValidatorUnsafeBaseTypes defaultBaseTypeLimitingValidatorUnsafeBaseTypes = new DefaultBaseTypeLimitingValidatorUnsafeBaseTypes(this.MediaMetadataCompat.getPlaybackParams().getSpeed(), this.MediaMetadataCompat.getPlaybackParams().getPitch());
            this.onStop = defaultBaseTypeLimitingValidatorUnsafeBaseTypes;
            this.onAddQueueItem.write(defaultBaseTypeLimitingValidatorUnsafeBaseTypes.AudioAttributesCompatParcelizer);
        }
    }

    private void AudioAttributesCompatParcelizer(DefaultBaseTypeLimitingValidatorUnsafeBaseTypes defaultBaseTypeLimitingValidatorUnsafeBaseTypes) {
        MediaBrowserCompatItemReceiver mediaBrowserCompatItemReceiver = new MediaBrowserCompatItemReceiver(defaultBaseTypeLimitingValidatorUnsafeBaseTypes, C.TIME_UNSET, C.TIME_UNSET, (byte) 0);
        if (onCommand()) {
            this.AudioAttributesImplBaseParcelizer = mediaBrowserCompatItemReceiver;
        } else {
            this.onSetCaptioningEnabled = mediaBrowserCompatItemReceiver;
        }
    }

    private void RemoteActionCompatParcelizer(long j) {
        DefaultBaseTypeLimitingValidatorUnsafeBaseTypes defaultBaseTypeLimitingValidatorUnsafeBaseTypesAudioAttributesCompatParcelizer;
        if (!onPrepareFromSearch()) {
            if (onPrepareFromMediaId()) {
                defaultBaseTypeLimitingValidatorUnsafeBaseTypesAudioAttributesCompatParcelizer = this.MediaBrowserCompatSearchResultReceiver.AudioAttributesCompatParcelizer(this.onStop);
            } else {
                defaultBaseTypeLimitingValidatorUnsafeBaseTypesAudioAttributesCompatParcelizer = DefaultBaseTypeLimitingValidatorUnsafeBaseTypes.write;
            }
            this.onStop = defaultBaseTypeLimitingValidatorUnsafeBaseTypesAudioAttributesCompatParcelizer;
        } else {
            defaultBaseTypeLimitingValidatorUnsafeBaseTypesAudioAttributesCompatParcelizer = DefaultBaseTypeLimitingValidatorUnsafeBaseTypes.write;
        }
        DefaultBaseTypeLimitingValidatorUnsafeBaseTypes defaultBaseTypeLimitingValidatorUnsafeBaseTypes = defaultBaseTypeLimitingValidatorUnsafeBaseTypesAudioAttributesCompatParcelizer;
        this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = onPrepareFromMediaId() ? this.MediaBrowserCompatSearchResultReceiver.read(this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM) : false;
        this.onSetRepeatMode.add(new MediaBrowserCompatItemReceiver(defaultBaseTypeLimitingValidatorUnsafeBaseTypes, Math.max(0L, j), this.onPause.write(handleMediaPlayPauseIfPendingOnHandler()), (byte) 0));
        onPrepare();
        serializePolymorphic.IconCompatParcelizer iconCompatParcelizer = this.onRemoveQueueItemAt;
        if (iconCompatParcelizer != null) {
            iconCompatParcelizer.write(this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM);
        }
    }

    private boolean onPrepareFromMediaId() {
        return (this._init_lambda5 || this.onPause.MediaBrowserCompatItemReceiver != 0 || RemoteActionCompatParcelizer(this.onPause.IconCompatParcelizer.onMediaButtonEvent)) ? false : true;
    }

    private boolean onPrepareFromSearch() {
        MediaBrowserCompatCustomActionResultReceiver mediaBrowserCompatCustomActionResultReceiver = this.onPause;
        return mediaBrowserCompatCustomActionResultReceiver != null && mediaBrowserCompatCustomActionResultReceiver.read && LaissezFaireSubTypeValidator.MediaBrowserCompatCustomActionResultReceiver >= 23;
    }

    private boolean RemoteActionCompatParcelizer(int i) {
        return this.onMediaButtonEvent && LaissezFaireSubTypeValidator.MediaMetadataCompat(i);
    }

    private long AudioAttributesCompatParcelizer(long j) {
        while (!this.onSetRepeatMode.isEmpty() && j >= this.onSetRepeatMode.getFirst().RemoteActionCompatParcelizer) {
            this.onSetCaptioningEnabled = this.onSetRepeatMode.remove();
        }
        long j2 = this.onSetCaptioningEnabled.RemoteActionCompatParcelizer;
        if (this.onSetRepeatMode.isEmpty()) {
            return this.onSetCaptioningEnabled.IconCompatParcelizer + this.MediaBrowserCompatSearchResultReceiver.write(j - j2);
        }
        MediaBrowserCompatItemReceiver first = this.onSetRepeatMode.getFirst();
        return first.IconCompatParcelizer - LaissezFaireSubTypeValidator.read(first.RemoteActionCompatParcelizer - j, this.onSetCaptioningEnabled.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer);
    }

    private long IconCompatParcelizer(long j) {
        long jWrite = this.MediaBrowserCompatSearchResultReceiver.write();
        long jWrite2 = this.onPause.write(jWrite);
        long j2 = this.PlaybackStateCompatCustomAction;
        if (jWrite > j2) {
            long jWrite3 = this.onPause.write(jWrite - j2);
            this.PlaybackStateCompatCustomAction = jWrite;
            write(jWrite3);
        }
        return j + jWrite2;
    }

    private void write(long j) {
        this.IconCompatParcelizer += j;
        if (this.ResultReceiver == null) {
            this.ResultReceiver = new Handler(Looper.myLooper());
        }
        this.ResultReceiver.removeCallbacksAndMessages(null);
        this.ResultReceiver.postDelayed(new Runnable() { // from class: o.PropertyFilter
            @Override // java.lang.Runnable
            public final void run() {
                this.read.onAddQueueItem();
            }
        }, 100L);
    }

    private boolean onCommand() {
        return this.MediaMetadataCompat != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long MediaDescriptionCompat() {
        if (this.onPause.MediaBrowserCompatItemReceiver == 0) {
            return this._init_lambda4 / ((long) this.onPause.MediaBrowserCompatCustomActionResultReceiver);
        }
        return this.r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long handleMediaPlayPauseIfPendingOnHandler() {
        if (this.onPause.MediaBrowserCompatItemReceiver == 0) {
            return LaissezFaireSubTypeValidator.read(this.ensureViewModelStore, this.onPause.AudioAttributesImplApi21Parcelizer);
        }
        return this.createFullyDrawnExecutor;
    }

    private void onPlay() {
        if (this.MediaBrowserCompatItemReceiver != null || this.onPlay == null) {
            return;
        }
        this.setSessionImpl = Looper.myLooper();
        modifyKeySerializer modifykeyserializer = new modifyKeySerializer(this.onPlay, new modifyKeySerializer.AudioAttributesCompatParcelizer() { // from class: o.PropertyBuilder1
            @Override // o.modifyKeySerializer.AudioAttributesCompatParcelizer
            public final void write(modifyMapSerializer modifymapserializer) {
                this.RemoteActionCompatParcelizer.IconCompatParcelizer(modifymapserializer);
            }
        }, this.MediaBrowserCompatCustomActionResultReceiver, this.r8lambdaKUbBm7ckfqTc9QCgukC86fguu4);
        this.MediaBrowserCompatItemReceiver = modifykeyserializer;
        this.AudioAttributesImplApi26Parcelizer = modifykeyserializer.AudioAttributesCompatParcelizer();
    }

    private static boolean AudioAttributesCompatParcelizer(AudioTrack audioTrack) {
        return LaissezFaireSubTypeValidator.MediaBrowserCompatCustomActionResultReceiver >= 29 && audioTrack.isOffloadedPlayback();
    }

    private static int AudioAttributesCompatParcelizer(int i, ByteBuffer byteBuffer) {
        if (i != 20) {
            if (i != 30) {
                switch (i) {
                    case 5:
                    case 6:
                        break;
                    case 7:
                    case 8:
                        break;
                    case 9:
                        int i2 = getTypeDescription.read(LaissezFaireSubTypeValidator.RemoteActionCompatParcelizer(byteBuffer, byteBuffer.position()));
                        if (i2 != -1) {
                            return i2;
                        }
                        throw new IllegalArgumentException();
                    case 10:
                        return 1024;
                    case 11:
                    case 12:
                        return 2048;
                    default:
                        switch (i) {
                            case 14:
                                int iWrite = isJava8TimeClass.write(byteBuffer);
                                if (iWrite == -1) {
                                    return 0;
                                }
                                return isJava8TimeClass.AudioAttributesCompatParcelizer(byteBuffer, iWrite) << 4;
                            case 15:
                                return 512;
                            case 16:
                                return 1024;
                            case 17:
                                return _interfaces.RemoteActionCompatParcelizer(byteBuffer);
                            case 18:
                                break;
                            default:
                                throw new IllegalStateException("Unexpected audio encoding: ".concat(String.valueOf(i)));
                        }
                        break;
                }
                return isJava8TimeClass.IconCompatParcelizer(byteBuffer);
            }
            return findClassAnnotations.RemoteActionCompatParcelizer(byteBuffer);
        }
        return isObjectOrPrimitive.IconCompatParcelizer(byteBuffer);
    }

    private static int write(AudioTrack audioTrack, ByteBuffer byteBuffer, int i) {
        return audioTrack.write(byteBuffer, i, 1);
    }

    private int read(AudioTrack audioTrack, ByteBuffer byteBuffer, int i, long j) {
        if (LaissezFaireSubTypeValidator.MediaBrowserCompatCustomActionResultReceiver >= 26) {
            return audioTrack.write(byteBuffer, i, 1, j * 1000);
        }
        if (this.onCommand == null) {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(16);
            this.onCommand = byteBufferAllocate;
            byteBufferAllocate.order(ByteOrder.BIG_ENDIAN);
            this.onCommand.putInt(1431633921);
        }
        if (this.handleMediaPlayPauseIfPendingOnHandler == 0) {
            this.onCommand.putInt(4, i);
            this.onCommand.putLong(8, j * 1000);
            this.onCommand.position(0);
            this.handleMediaPlayPauseIfPendingOnHandler = i;
        }
        int iRemaining = this.onCommand.remaining();
        if (iRemaining > 0) {
            int iWrite = audioTrack.write(this.onCommand, iRemaining, 1);
            if (iWrite < 0) {
                this.handleMediaPlayPauseIfPendingOnHandler = 0;
                return iWrite;
            }
            if (iWrite < iRemaining) {
                return 0;
            }
        }
        int iWrite2 = write(audioTrack, byteBuffer, i);
        if (iWrite2 < 0) {
            this.handleMediaPlayPauseIfPendingOnHandler = 0;
            return iWrite2;
        }
        this.handleMediaPlayPauseIfPendingOnHandler -= iWrite2;
        return iWrite2;
    }

    private static void IconCompatParcelizer(AudioTrack audioTrack, float f) {
        audioTrack.setVolume(f);
    }

    private static void write(AudioTrack audioTrack, float f) {
        audioTrack.setStereoVolume(f, f);
    }

    private void onMediaButtonEvent() {
        if (this.r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0) {
            return;
        }
        this.r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0 = true;
        this.onAddQueueItem.IconCompatParcelizer(handleMediaPlayPauseIfPendingOnHandler());
        if (AudioAttributesCompatParcelizer(this.MediaMetadataCompat)) {
            this.onPlayFromSearch = false;
        }
        this.MediaMetadataCompat.stop();
        this.handleMediaPlayPauseIfPendingOnHandler = 0;
    }

    private static void IconCompatParcelizer(final AudioTrack audioTrack, final typeIdVisibility typeidvisibility, final serializePolymorphic.IconCompatParcelizer iconCompatParcelizer, final serializePolymorphic.read readVar) {
        typeidvisibility.IconCompatParcelizer();
        final Handler handler = new Handler(Looper.myLooper());
        synchronized (read) {
            if (RemoteActionCompatParcelizer == null) {
                RemoteActionCompatParcelizer = LaissezFaireSubTypeValidator.RemoteActionCompatParcelizer("ExoPlayer:AudioTrackReleaseThread");
            }
            AudioAttributesCompatParcelizer++;
            RemoteActionCompatParcelizer.execute(new Runnable() { // from class: o.findPropertyFilter
                @Override // java.lang.Runnable
                public final void run() {
                    PropertyBuilder.AudioAttributesCompatParcelizer(audioTrack, iconCompatParcelizer, handler, readVar, typeidvisibility);
                }
            });
        }
    }

    static /* synthetic */ void AudioAttributesCompatParcelizer(AudioTrack audioTrack, final serializePolymorphic.IconCompatParcelizer iconCompatParcelizer, Handler handler, final serializePolymorphic.read readVar, typeIdVisibility typeidvisibility) {
        try {
            audioTrack.flush();
            audioTrack.release();
            if (iconCompatParcelizer != null && handler.getLooper().getThread().isAlive()) {
                handler.post(new Runnable() { // from class: o._throwWrapped
                    @Override // java.lang.Runnable
                    public final void run() {
                        iconCompatParcelizer.read(readVar);
                    }
                });
            }
            typeidvisibility.read();
            synchronized (read) {
                int i = AudioAttributesCompatParcelizer - 1;
                AudioAttributesCompatParcelizer = i;
                if (i == 0) {
                    RemoteActionCompatParcelizer.shutdown();
                    RemoteActionCompatParcelizer = null;
                }
            }
        } catch (Throwable th) {
            if (iconCompatParcelizer != null && handler.getLooper().getThread().isAlive()) {
                handler.post(new Runnable() { // from class: o._throwWrapped
                    @Override // java.lang.Runnable
                    public final void run() {
                        iconCompatParcelizer.read(readVar);
                    }
                });
            }
            typeidvisibility.read();
            synchronized (read) {
                int i2 = AudioAttributesCompatParcelizer - 1;
                AudioAttributesCompatParcelizer = i2;
                if (i2 == 0) {
                    RemoteActionCompatParcelizer.shutdown();
                    RemoteActionCompatParcelizer = null;
                }
                throw th;
            }
        }
    }

    static final class AudioAttributesImplApi21Parcelizer {
        private final AudioTrack IconCompatParcelizer;
        private final modifyKeySerializer RemoteActionCompatParcelizer;
        private AudioRouting.OnRoutingChangedListener write = new AudioRouting.OnRoutingChangedListener() { // from class: o.buildWriter
            @Override // android.media.AudioRouting.OnRoutingChangedListener
            public final void onRoutingChanged(AudioRouting audioRouting) {
                this.IconCompatParcelizer.RemoteActionCompatParcelizer(audioRouting);
            }
        };

        public AudioAttributesImplApi21Parcelizer(AudioTrack audioTrack, modifyKeySerializer modifykeyserializer) {
            this.IconCompatParcelizer = audioTrack;
            this.RemoteActionCompatParcelizer = modifykeyserializer;
            audioTrack.addOnRoutingChangedListener(this.write, new Handler(Looper.myLooper()));
        }

        public final void read() {
            this.IconCompatParcelizer.removeOnRoutingChangedListener((AudioRouting.OnRoutingChangedListener) buildTypeSerializer.IconCompatParcelizer(this.write));
            this.write = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void RemoteActionCompatParcelizer(AudioRouting audioRouting) {
            if (this.write == null || audioRouting.getRoutedDevice() == null) {
                return;
            }
            this.RemoteActionCompatParcelizer.write(audioRouting.getRoutedDevice());
        }
    }

    final class MediaMetadataCompat {
        private final AudioTrack.StreamEventCallback AudioAttributesCompatParcelizer;
        private final Handler RemoteActionCompatParcelizer = new Handler(Looper.myLooper());

        public MediaMetadataCompat() {
            this.AudioAttributesCompatParcelizer = new AudioTrack.StreamEventCallback() { // from class: o.PropertyBuilder.MediaMetadataCompat.2
                @Override // android.media.AudioTrack.StreamEventCallback
                public final void onDataRequest(AudioTrack audioTrack, int i) {
                    if (audioTrack.equals(PropertyBuilder.this.MediaMetadataCompat) && PropertyBuilder.this.onRemoveQueueItemAt != null && PropertyBuilder.this.MediaSessionCompatToken) {
                        PropertyBuilder.this.onRemoveQueueItemAt.RemoteActionCompatParcelizer();
                    }
                }

                @Override // android.media.AudioTrack.StreamEventCallback
                public final void onPresentationEnded(AudioTrack audioTrack) {
                    if (audioTrack.equals(PropertyBuilder.this.MediaMetadataCompat)) {
                        PropertyBuilder.AudioAttributesCompatParcelizer(PropertyBuilder.this);
                    }
                }

                @Override // android.media.AudioTrack.StreamEventCallback
                public final void onTearDown(AudioTrack audioTrack) {
                    if (audioTrack.equals(PropertyBuilder.this.MediaMetadataCompat) && PropertyBuilder.this.onRemoveQueueItemAt != null && PropertyBuilder.this.MediaSessionCompatToken) {
                        PropertyBuilder.this.onRemoveQueueItemAt.RemoteActionCompatParcelizer();
                    }
                }
            };
        }

        public final void IconCompatParcelizer(AudioTrack audioTrack) {
            final Handler handler = this.RemoteActionCompatParcelizer;
            Objects.requireNonNull(handler);
            audioTrack.registerStreamEventCallback(new Executor() { // from class: o.getDefaultBean
                @Override // java.util.concurrent.Executor
                public final void execute(Runnable runnable) {
                    handler.post(runnable);
                }
            }, this.AudioAttributesCompatParcelizer);
        }

        public final void AudioAttributesCompatParcelizer(AudioTrack audioTrack) {
            audioTrack.unregisterStreamEventCallback(this.AudioAttributesCompatParcelizer);
            this.RemoteActionCompatParcelizer.removeCallbacksAndMessages(null);
        }
    }

    static final class MediaBrowserCompatItemReceiver {
        public final DefaultBaseTypeLimitingValidatorUnsafeBaseTypes AudioAttributesCompatParcelizer;
        public final long IconCompatParcelizer;
        public final long RemoteActionCompatParcelizer;

        /* synthetic */ MediaBrowserCompatItemReceiver(DefaultBaseTypeLimitingValidatorUnsafeBaseTypes defaultBaseTypeLimitingValidatorUnsafeBaseTypes, long j, long j2, byte b) {
            this(defaultBaseTypeLimitingValidatorUnsafeBaseTypes, j, j2);
        }

        private MediaBrowserCompatItemReceiver(DefaultBaseTypeLimitingValidatorUnsafeBaseTypes defaultBaseTypeLimitingValidatorUnsafeBaseTypes, long j, long j2) {
            this.AudioAttributesCompatParcelizer = defaultBaseTypeLimitingValidatorUnsafeBaseTypes;
            this.IconCompatParcelizer = j;
            this.RemoteActionCompatParcelizer = j2;
        }
    }

    private static int read(int i, int i2, int i3) {
        int minBufferSize = AudioTrack.getMinBufferSize(i, i2, i3);
        buildTypeSerializer.write(minBufferSize != -2);
        return minBufferSize;
    }

    final class MediaBrowserCompatMediaItem implements FilterProvider.read {
        private MediaBrowserCompatMediaItem() {
        }

        /* synthetic */ MediaBrowserCompatMediaItem(PropertyBuilder propertyBuilder, byte b) {
            this();
        }

        @Override // o.FilterProvider.read
        public final void IconCompatParcelizer(long j, long j2, long j3, long j4) {
            StringBuilder sb = new StringBuilder("Spurious audio timestamp (frame position mismatch): ");
            sb.append(j);
            sb.append(", ");
            sb.append(j2);
            sb.append(", ");
            sb.append(j3);
            sb.append(", ");
            sb.append(j4);
            sb.append(", ");
            sb.append(PropertyBuilder.this.MediaDescriptionCompat());
            sb.append(", ");
            sb.append(PropertyBuilder.this.handleMediaPlayPauseIfPendingOnHandler());
            String string = sb.toString();
            boolean z = PropertyBuilder.write;
            prune.RemoteActionCompatParcelizer("DefaultAudioSink", string);
        }

        @Override // o.FilterProvider.read
        public final void write(long j, long j2, long j3, long j4) {
            StringBuilder sb = new StringBuilder("Spurious audio timestamp (system clock mismatch): ");
            sb.append(j);
            sb.append(", ");
            sb.append(j2);
            sb.append(", ");
            sb.append(j3);
            sb.append(", ");
            sb.append(j4);
            sb.append(", ");
            sb.append(PropertyBuilder.this.MediaDescriptionCompat());
            sb.append(", ");
            sb.append(PropertyBuilder.this.handleMediaPlayPauseIfPendingOnHandler());
            String string = sb.toString();
            boolean z = PropertyBuilder.write;
            prune.RemoteActionCompatParcelizer("DefaultAudioSink", string);
        }

        @Override // o.FilterProvider.read
        public final void AudioAttributesCompatParcelizer(long j) {
            prune.RemoteActionCompatParcelizer("DefaultAudioSink", "Ignoring impossibly large audio latency: ".concat(String.valueOf(j)));
        }

        @Override // o.FilterProvider.read
        public final void write(long j) {
            if (PropertyBuilder.this.onRemoveQueueItemAt != null) {
                PropertyBuilder.this.onRemoveQueueItemAt.write(j);
            }
        }

        @Override // o.FilterProvider.read
        public final void read(int i, long j) {
            if (PropertyBuilder.this.onRemoveQueueItemAt != null) {
                PropertyBuilder.this.onRemoveQueueItemAt.AudioAttributesCompatParcelizer(i, j, SystemClock.elapsedRealtime() - PropertyBuilder.this.onPrepareFromUri);
            }
        }
    }

    static final class MediaBrowserCompatCustomActionResultReceiver {
        public final deserializeTypedFromScalar AudioAttributesCompatParcelizer;
        public final int AudioAttributesImplApi21Parcelizer;
        public final int AudioAttributesImplApi26Parcelizer;
        public final int AudioAttributesImplBaseParcelizer;
        public final C0170format IconCompatParcelizer;
        public final int MediaBrowserCompatCustomActionResultReceiver;
        public final int MediaBrowserCompatItemReceiver;
        public final int MediaBrowserCompatSearchResultReceiver;
        public final boolean MediaDescriptionCompat;
        public final int RemoteActionCompatParcelizer;
        public final boolean read;
        public final boolean write;

        public MediaBrowserCompatCustomActionResultReceiver(C0170format c0170format, int i, int i2, int i3, int i4, int i5, int i6, int i7, deserializeTypedFromScalar deserializetypedfromscalar, boolean z, boolean z2, boolean z3) {
            this.IconCompatParcelizer = c0170format;
            this.MediaBrowserCompatCustomActionResultReceiver = i;
            this.MediaBrowserCompatItemReceiver = i2;
            this.AudioAttributesImplApi21Parcelizer = i3;
            this.MediaBrowserCompatSearchResultReceiver = i4;
            this.AudioAttributesImplBaseParcelizer = i5;
            this.AudioAttributesImplApi26Parcelizer = i6;
            this.RemoteActionCompatParcelizer = i7;
            this.AudioAttributesCompatParcelizer = deserializetypedfromscalar;
            this.read = z;
            this.write = z2;
            this.MediaDescriptionCompat = z3;
        }

        public final MediaBrowserCompatCustomActionResultReceiver AudioAttributesCompatParcelizer() {
            return new MediaBrowserCompatCustomActionResultReceiver(this.IconCompatParcelizer, this.MediaBrowserCompatCustomActionResultReceiver, this.MediaBrowserCompatItemReceiver, this.AudioAttributesImplApi21Parcelizer, this.MediaBrowserCompatSearchResultReceiver, this.AudioAttributesImplBaseParcelizer, this.AudioAttributesImplApi26Parcelizer, PlaybackException.CUSTOM_ERROR_CODE_BASE, this.AudioAttributesCompatParcelizer, this.read, this.write, this.MediaDescriptionCompat);
        }

        public final boolean RemoteActionCompatParcelizer(MediaBrowserCompatCustomActionResultReceiver mediaBrowserCompatCustomActionResultReceiver) {
            return mediaBrowserCompatCustomActionResultReceiver.MediaBrowserCompatItemReceiver == this.MediaBrowserCompatItemReceiver && mediaBrowserCompatCustomActionResultReceiver.AudioAttributesImplApi26Parcelizer == this.AudioAttributesImplApi26Parcelizer && mediaBrowserCompatCustomActionResultReceiver.MediaBrowserCompatSearchResultReceiver == this.MediaBrowserCompatSearchResultReceiver && mediaBrowserCompatCustomActionResultReceiver.AudioAttributesImplBaseParcelizer == this.AudioAttributesImplBaseParcelizer && mediaBrowserCompatCustomActionResultReceiver.AudioAttributesImplApi21Parcelizer == this.AudioAttributesImplApi21Parcelizer && mediaBrowserCompatCustomActionResultReceiver.read == this.read && mediaBrowserCompatCustomActionResultReceiver.write == this.write;
        }

        public final long AudioAttributesCompatParcelizer(long j) {
            return LaissezFaireSubTypeValidator.IconCompatParcelizer(j, this.IconCompatParcelizer.onPrepareFromUri);
        }

        public final long write(long j) {
            return LaissezFaireSubTypeValidator.IconCompatParcelizer(j, this.MediaBrowserCompatSearchResultReceiver);
        }

        public final serializePolymorphic.read write() {
            return new serializePolymorphic.read(this.AudioAttributesImplApi26Parcelizer, this.MediaBrowserCompatSearchResultReceiver, this.AudioAttributesImplBaseParcelizer, this.MediaDescriptionCompat, this.MediaBrowserCompatItemReceiver == 1, this.RemoteActionCompatParcelizer);
        }

        public final AudioTrack IconCompatParcelizer(JsonIntegerFormatVisitor jsonIntegerFormatVisitor, int i) throws serializePolymorphic.AudioAttributesCompatParcelizer {
            try {
                AudioTrack audioTrackAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(jsonIntegerFormatVisitor, i);
                int state = audioTrackAudioAttributesCompatParcelizer.getState();
                if (state == 1) {
                    return audioTrackAudioAttributesCompatParcelizer;
                }
                try {
                    audioTrackAudioAttributesCompatParcelizer.release();
                } catch (Exception unused) {
                }
                throw new serializePolymorphic.AudioAttributesCompatParcelizer(state, this.MediaBrowserCompatSearchResultReceiver, this.AudioAttributesImplBaseParcelizer, this.RemoteActionCompatParcelizer, this.IconCompatParcelizer, read(), null);
            } catch (IllegalArgumentException | UnsupportedOperationException e) {
                throw new serializePolymorphic.AudioAttributesCompatParcelizer(0, this.MediaBrowserCompatSearchResultReceiver, this.AudioAttributesImplBaseParcelizer, this.RemoteActionCompatParcelizer, this.IconCompatParcelizer, read(), e);
            }
        }

        private AudioTrack AudioAttributesCompatParcelizer(JsonIntegerFormatVisitor jsonIntegerFormatVisitor, int i) {
            if (LaissezFaireSubTypeValidator.MediaBrowserCompatCustomActionResultReceiver >= 29) {
                return write(jsonIntegerFormatVisitor, i);
            }
            if (LaissezFaireSubTypeValidator.MediaBrowserCompatCustomActionResultReceiver >= 21) {
                return read(jsonIntegerFormatVisitor, i);
            }
            return RemoteActionCompatParcelizer(jsonIntegerFormatVisitor, i);
        }

        private AudioTrack write(JsonIntegerFormatVisitor jsonIntegerFormatVisitor, int i) {
            return new AudioTrack.Builder().setAudioAttributes(IconCompatParcelizer(jsonIntegerFormatVisitor, this.MediaDescriptionCompat)).setAudioFormat(LaissezFaireSubTypeValidator.IconCompatParcelizer(this.MediaBrowserCompatSearchResultReceiver, this.AudioAttributesImplBaseParcelizer, this.AudioAttributesImplApi26Parcelizer)).setTransferMode(1).setBufferSizeInBytes(this.RemoteActionCompatParcelizer).setSessionId(i).setOffloadedPlayback(this.MediaBrowserCompatItemReceiver == 1).build();
        }

        private AudioTrack read(JsonIntegerFormatVisitor jsonIntegerFormatVisitor, int i) {
            return new AudioTrack(IconCompatParcelizer(jsonIntegerFormatVisitor, this.MediaDescriptionCompat), LaissezFaireSubTypeValidator.IconCompatParcelizer(this.MediaBrowserCompatSearchResultReceiver, this.AudioAttributesImplBaseParcelizer, this.AudioAttributesImplApi26Parcelizer), this.RemoteActionCompatParcelizer, 1, i);
        }

        private AudioTrack RemoteActionCompatParcelizer(JsonIntegerFormatVisitor jsonIntegerFormatVisitor, int i) {
            int iAudioAttributesImplApi21Parcelizer = LaissezFaireSubTypeValidator.AudioAttributesImplApi21Parcelizer(jsonIntegerFormatVisitor.AudioAttributesImplApi21Parcelizer);
            if (i == 0) {
                return new AudioTrack(iAudioAttributesImplApi21Parcelizer, this.MediaBrowserCompatSearchResultReceiver, this.AudioAttributesImplBaseParcelizer, this.AudioAttributesImplApi26Parcelizer, this.RemoteActionCompatParcelizer, 1);
            }
            return new AudioTrack(iAudioAttributesImplApi21Parcelizer, this.MediaBrowserCompatSearchResultReceiver, this.AudioAttributesImplBaseParcelizer, this.AudioAttributesImplApi26Parcelizer, this.RemoteActionCompatParcelizer, 1, i);
        }

        private static AudioAttributes IconCompatParcelizer(JsonIntegerFormatVisitor jsonIntegerFormatVisitor, boolean z) {
            if (z) {
                return RemoteActionCompatParcelizer();
            }
            return jsonIntegerFormatVisitor.RemoteActionCompatParcelizer().IconCompatParcelizer;
        }

        private static AudioAttributes RemoteActionCompatParcelizer() {
            return new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build();
        }

        public final boolean read() {
            return this.MediaBrowserCompatItemReceiver == 1;
        }
    }

    static final class AudioAttributesImplApi26Parcelizer<T extends Exception> {
        private long IconCompatParcelizer;
        private T RemoteActionCompatParcelizer;
        private final long read = 100;

        /* JADX INFO: Thrown type has an unknown type hierarchy: T extends java.lang.Exception */
        public final void write(T t) throws Exception {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (this.RemoteActionCompatParcelizer == null) {
                this.RemoteActionCompatParcelizer = t;
                this.IconCompatParcelizer = this.read + jElapsedRealtime;
            }
            if (jElapsedRealtime >= this.IconCompatParcelizer) {
                T t2 = this.RemoteActionCompatParcelizer;
                if (t2 != t) {
                    t2.addSuppressed(t);
                }
                T t3 = this.RemoteActionCompatParcelizer;
                IconCompatParcelizer();
                throw t3;
            }
        }

        public final void IconCompatParcelizer() {
            this.RemoteActionCompatParcelizer = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onAddQueueItem() {
        if (this.IconCompatParcelizer >= 300000) {
            this.onRemoveQueueItemAt.write();
            this.IconCompatParcelizer = 0L;
        }
    }

    static final class IconCompatParcelizer {
        public static void AudioAttributesCompatParcelizer(AudioTrack audioTrack, modifySerializer modifyserializer) {
            audioTrack.setPreferredDevice(modifyserializer == null ? null : modifyserializer.IconCompatParcelizer);
        }
    }

    static final class read {
        public static void write(AudioTrack audioTrack, modifyArraySerializer modifyarrayserializer) {
            LogSessionId logSessionIdCJ_ = modifyarrayserializer.cJ_();
            if (logSessionIdCJ_.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
                return;
            }
            audioTrack.setLogSessionId(logSessionIdCJ_);
        }
    }
}
