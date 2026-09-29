package kotlin;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.media.MediaFormat;
import android.media.metrics.LogSessionId;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.image.ImageOutput;
import androidx.media3.exoplayer.video.spherical.SphericalGLSurfaceView;
import com.google.android.exoplayer2.C;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeoutException;
import kotlin.BasicSerializerFactory;
import kotlin.LongNode;
import kotlin.PolymorphicTypeValidator;
import kotlin.SimpleSerializers;
import kotlin.StdKeySerializers;
import kotlin.ToStringSerializerBase;
import kotlin.buildMapEntrySerializer;
import kotlin.collectAndResolveSubtypesByClass;
import kotlin.findArraySerializer;
import kotlin.findConvertingSerializer;
import kotlin.isUnsafeBaseType;
import kotlin.optionalProperty;
import kotlin.serializePolymorphic;
import kotlin.typeId;

/* JADX INFO: loaded from: classes2.dex */
public final class BinaryNode extends valueFormat implements ExoPlayer, ExoPlayer.write, ExoPlayer.AudioAttributesImplApi26Parcelizer, ExoPlayer.MediaBrowserCompatCustomActionResultReceiver, ExoPlayer.AudioAttributesCompatParcelizer {
    final isUnsafeBaseType.read AudioAttributesCompatParcelizer;
    private final Looper AudioAttributesImplApi21Parcelizer;
    private JsonIntegerFormatVisitor AudioAttributesImplApi26Parcelizer;
    private _at AudioAttributesImplBaseParcelizer;
    private final SimpleSerializers MediaBrowserCompatCustomActionResultReceiver;
    private final findArraySerializer MediaBrowserCompatItemReceiver;
    private isUnsafeBaseType.read MediaBrowserCompatMediaItem;
    private int MediaBrowserCompatSearchResultReceiver;
    private final buildTypeDeserializer MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    private C0170format MediaDescriptionCompat;
    private final CopyOnWriteArraySet<ExoPlayer.RemoteActionCompatParcelizer> MediaMetadataCompat;
    private final LongNode.read MediaSessionCompatQueueItem;
    private getSchema MediaSessionCompatResultReceiverWrapper;
    private boolean MediaSessionCompatToken;
    private int ParcelableVolumeInfo;
    private ExoPlayer.IconCompatParcelizer PlaybackStateCompat;
    private final long PlaybackStateCompatCustomAction;
    private AudioManager RatingCompat;
    private final Context RemoteActionCompatParcelizer;
    private validateBaseType ResultReceiver;
    private createKeySerializer _init_lambda2;
    private SphericalGLSurfaceView _init_lambda3;
    private final findConvertingSerializer _init_lambda4;
    private getSchema _init_lambda5;
    private final boolean accessaddObserverForBackInvoker;
    private SurfaceHolder accessensureViewModelStore;
    private boolean accessgetReportFullyDrawnExecutorp;
    private TextureView accessonBackPresseds1027565324;
    private _at addContentView;
    private C0170format addMenuProvider;
    private final boolean addObserverForBackInvoker;
    private AsWrapperTypeSerializer addObserverForBackInvokerlambda7;
    private int addOnConfigurationChangedListener;
    private final findSerializerByAddonType addOnContextAvailableListener;
    private float addOnMultiWindowModeChangedListener;
    private final findSerializerByLookup addOnNewIntentListener;
    private deserializeTypedFromObject addOnPictureInPictureModeChangedListener;
    private final _constructSimple createFullyDrawnExecutor;
    private boolean ensureViewModelStore;
    private final isUnsafeBaseType getDefaultViewModelCreationExtras;
    private getRemainingInput getOnBackPressedDispatcherannotations;
    private Object getSavedStateRegistryControllerannotations;
    private final write handleMediaPlayPauseIfPendingOnHandler;
    private int menuHostHelperlambda0;
    private final typeIdVisibility onAddQueueItem;
    private final _fromWellKnownInterface onCommand;
    private ArrayBuildersDoubleBuilder onCustomAction;
    private final AudioAttributesCompatParcelizer onFastForward;
    private final long onMediaButtonEvent;
    private idFromValue onPause;
    private boolean onPlay;
    private optionalProperty onPlayFromMediaId;
    private boolean onPlayFromSearch;
    private boolean onPlayFromUri;
    private final typeId<isUnsafeBaseType.AudioAttributesCompatParcelizer> onPrepare;
    private AudioTrack onPrepareFromMediaId;
    private final LongNode onPrepareFromSearch;
    private int onPrepareFromUri;
    private int onRemoveQueueItem;
    private long onRemoveQueueItemAt;
    private final long onRewind;
    private getSchema onSeekTo;
    private Surface onSetCaptioningEnabled;
    private final StdKeySerializers.AudioAttributesCompatParcelizer onSetPlaybackSpeed;
    private final List<IconCompatParcelizer> onSetRating;
    private boolean onSetRepeatMode;
    private boolean onSetShuffleMode;
    private final _usesExternalId onSkipToNext;
    private int onSkipToPrevious;
    private buildEnumSetSerializer onSkipToQueueItem;
    private int onStop;
    private final long r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw;
    private int r8lambdaKUbBm7ckfqTc9QCgukC86fguu4;
    private final buildIndexedListSerializer[] r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
    private ToStringSerializerBase r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28;
    private boolean r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8;
    private boolean r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0;
    final _findPrimitive read;
    private final PolymorphicTypeValidator.AudioAttributesCompatParcelizer setSessionImpl;
    private final findSerializerByPrimaryType write;

    /* JADX INFO: Access modifiers changed from: private */
    public static int AudioAttributesCompatParcelizer(int i) {
        return i == -1 ? 2 : 1;
    }

    private boolean MediaSessionCompatQueueItem() {
        return true;
    }

    static {
        isSafeSubType.AudioAttributesCompatParcelizer("media3.exoplayer");
    }

    public BinaryNode(ExoPlayer.read readVar) {
        modifyArraySerializer modifyarrayserializerIconCompatParcelizer;
        typeIdVisibility typeidvisibility = new typeIdVisibility();
        this.onAddQueueItem = typeidvisibility;
        try {
            StringBuilder sb = new StringBuilder("Init ");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" [AndroidXMedia3/1.4.1] [");
            sb.append(LaissezFaireSubTypeValidator.write);
            sb.append("]");
            prune.write("ExoPlayerImpl", sb.toString());
            Context applicationContext = readVar.AudioAttributesCompatParcelizer.getApplicationContext();
            this.RemoteActionCompatParcelizer = applicationContext;
            findSerializerByPrimaryType findserializerbyprimarytypeApply = readVar.read.apply(readVar.RemoteActionCompatParcelizer);
            this.write = findserializerbyprimarytypeApply;
            this.ParcelableVolumeInfo = readVar.handleMediaPlayPauseIfPendingOnHandler;
            this.ResultReceiver = readVar.onPlay;
            this.AudioAttributesImplApi26Parcelizer = readVar.IconCompatParcelizer;
            this.addOnConfigurationChangedListener = readVar.onRewind;
            this.menuHostHelperlambda0 = readVar.onPrepareFromUri;
            this.r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0 = readVar.onPrepareFromMediaId;
            this.onMediaButtonEvent = readVar.AudioAttributesImplApi21Parcelizer;
            byte b = 0;
            write writeVar = new write(this, b);
            this.handleMediaPlayPauseIfPendingOnHandler = writeVar;
            AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = new AudioAttributesCompatParcelizer(b);
            this.onFastForward = audioAttributesCompatParcelizer;
            Handler handler = new Handler(readVar.RatingCompat);
            buildIndexedListSerializer[] buildindexedlistserializerArrAudioAttributesCompatParcelizer = readVar.onMediaButtonEvent.get().AudioAttributesCompatParcelizer(handler, writeVar, writeVar, writeVar, writeVar);
            this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = buildindexedlistserializerArrAudioAttributesCompatParcelizer;
            buildTypeSerializer.write(buildindexedlistserializerArrAudioAttributesCompatParcelizer.length > 0);
            _constructSimple _constructsimple = readVar.onPlayFromUri.get();
            this.createFullyDrawnExecutor = _constructsimple;
            this.onSetPlaybackSpeed = readVar.onCustomAction.get();
            _fromWellKnownInterface _fromwellknowninterface = readVar.write.get();
            this.onCommand = _fromwellknowninterface;
            this.addObserverForBackInvoker = readVar.onPlayFromSearch;
            this._init_lambda2 = readVar.onPrepare;
            this.r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw = readVar.onPause;
            this.PlaybackStateCompatCustomAction = readVar.onPlayFromMediaId;
            this.onRewind = readVar.MediaBrowserCompatSearchResultReceiver;
            this.onSetShuffleMode = readVar.onCommand;
            Looper looper = readVar.RatingCompat;
            this.AudioAttributesImplApi21Parcelizer = looper;
            buildTypeDeserializer buildtypedeserializer = readVar.RemoteActionCompatParcelizer;
            this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = buildtypedeserializer;
            this.getDefaultViewModelCreationExtras = this;
            boolean z = readVar.onPrepareFromSearch;
            this.accessaddObserverForBackInvoker = false;
            this.onPrepare = new typeId<>(looper, buildtypedeserializer, new typeId.read() { // from class: o.getFalse
                @Override // o.typeId.read
                public final void write(Object obj, enumTypes enumtypes) {
                    this.write.RemoteActionCompatParcelizer((isUnsafeBaseType.AudioAttributesCompatParcelizer) obj, enumtypes);
                }
            });
            this.MediaMetadataCompat = new CopyOnWriteArraySet<>();
            this.onSetRating = new ArrayList();
            this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = new ToStringSerializerBase.RemoteActionCompatParcelizer();
            this.PlaybackStateCompat = ExoPlayer.IconCompatParcelizer.read;
            _findPrimitive _findprimitive = new _findPrimitive(new buildIteratorSerializer[buildindexedlistserializerArrAudioAttributesCompatParcelizer.length], new _verifyAndResolvePlaceholders[buildindexedlistserializerArrAudioAttributesCompatParcelizer.length], collectAndResolveSubtypesByTypeId.RemoteActionCompatParcelizer, null);
            this.read = _findprimitive;
            this.setSessionImpl = new PolymorphicTypeValidator.AudioAttributesCompatParcelizer();
            isUnsafeBaseType.read.C0120read c0120readIconCompatParcelizer = new isUnsafeBaseType.read.C0120read().AudioAttributesCompatParcelizer(1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 35, 22, 24, 27, 28, 32).IconCompatParcelizer(29, _constructsimple.write());
            boolean z2 = readVar.MediaBrowserCompatCustomActionResultReceiver;
            isUnsafeBaseType.read.C0120read c0120readIconCompatParcelizer2 = c0120readIconCompatParcelizer.IconCompatParcelizer(23, false);
            boolean z3 = readVar.MediaBrowserCompatCustomActionResultReceiver;
            isUnsafeBaseType.read.C0120read c0120readIconCompatParcelizer3 = c0120readIconCompatParcelizer2.IconCompatParcelizer(25, false);
            boolean z4 = readVar.MediaBrowserCompatCustomActionResultReceiver;
            isUnsafeBaseType.read.C0120read c0120readIconCompatParcelizer4 = c0120readIconCompatParcelizer3.IconCompatParcelizer(33, false);
            boolean z5 = readVar.MediaBrowserCompatCustomActionResultReceiver;
            isUnsafeBaseType.read.C0120read c0120readIconCompatParcelizer5 = c0120readIconCompatParcelizer4.IconCompatParcelizer(26, false);
            boolean z6 = readVar.MediaBrowserCompatCustomActionResultReceiver;
            isUnsafeBaseType.read readVar2 = c0120readIconCompatParcelizer5.IconCompatParcelizer(34, false).read();
            this.AudioAttributesCompatParcelizer = readVar2;
            this.MediaBrowserCompatMediaItem = new isUnsafeBaseType.read.C0120read().IconCompatParcelizer(readVar2).IconCompatParcelizer(4).IconCompatParcelizer(10).read();
            this.onSkipToNext = buildtypedeserializer.read(looper, null);
            LongNode.read readVar3 = new LongNode.read() { // from class: o.getTrue
                @Override // o.LongNode.read
                public final void read(LongNode.write writeVar2) {
                    this.RemoteActionCompatParcelizer.IconCompatParcelizer(writeVar2);
                }
            };
            this.MediaSessionCompatQueueItem = readVar3;
            this.onSkipToQueueItem = buildEnumSetSerializer.IconCompatParcelizer(_findprimitive);
            findserializerbyprimarytypeApply.RemoteActionCompatParcelizer(this, looper);
            if (LaissezFaireSubTypeValidator.MediaBrowserCompatCustomActionResultReceiver < 31) {
                modifyarrayserializerIconCompatParcelizer = new modifyArraySerializer(readVar.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
            } else {
                modifyarrayserializerIconCompatParcelizer = read.IconCompatParcelizer(applicationContext, this, readVar.onRemoveQueueItemAt, readVar.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
            }
            LongNode longNode = new LongNode(buildindexedlistserializerArrAudioAttributesCompatParcelizer, _constructsimple, _findprimitive, readVar.MediaMetadataCompat.get(), _fromwellknowninterface, this.r8lambdaKUbBm7ckfqTc9QCgukC86fguu4, this.r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8, findserializerbyprimarytypeApply, this._init_lambda2, readVar.MediaBrowserCompatMediaItem, readVar.onFastForward, this.onSetShuffleMode, readVar.AudioAttributesImplBaseParcelizer, looper, buildtypedeserializer, readVar3, modifyarrayserializerIconCompatParcelizer, readVar.onAddQueueItem, this.PlaybackStateCompat);
            this.onPrepareFromSearch = longNode;
            this.addOnMultiWindowModeChangedListener = 1.0f;
            this.r8lambdaKUbBm7ckfqTc9QCgukC86fguu4 = 0;
            this.onSeekTo = getSchema.AudioAttributesCompatParcelizer;
            this.MediaSessionCompatResultReceiverWrapper = getSchema.AudioAttributesCompatParcelizer;
            this._init_lambda5 = getSchema.AudioAttributesCompatParcelizer;
            this.onRemoveQueueItem = -1;
            if (LaissezFaireSubTypeValidator.MediaBrowserCompatCustomActionResultReceiver < 21) {
                this.MediaBrowserCompatSearchResultReceiver = RemoteActionCompatParcelizer(0);
            } else {
                this.MediaBrowserCompatSearchResultReceiver = LaissezFaireSubTypeValidator.AudioAttributesCompatParcelizer(applicationContext);
            }
            this.onPause = idFromValue.IconCompatParcelizer;
            this.ensureViewModelStore = true;
            read(findserializerbyprimarytypeApply);
            _fromwellknowninterface.IconCompatParcelizer(new Handler(looper), findserializerbyprimarytypeApply);
            addAudioOffloadListener(writeVar);
            if (readVar.MediaBrowserCompatItemReceiver > 0) {
                longNode.IconCompatParcelizer(readVar.MediaBrowserCompatItemReceiver);
            }
            findArraySerializer findarrayserializer = new findArraySerializer(readVar.AudioAttributesCompatParcelizer, handler, writeVar);
            this.MediaBrowserCompatItemReceiver = findarrayserializer;
            findarrayserializer.RemoteActionCompatParcelizer(readVar.AudioAttributesImplApi26Parcelizer);
            SimpleSerializers simpleSerializers = new SimpleSerializers(readVar.AudioAttributesCompatParcelizer, handler, writeVar);
            this.MediaBrowserCompatCustomActionResultReceiver = simpleSerializers;
            simpleSerializers.write(readVar.MediaDescriptionCompat ? this.AudioAttributesImplApi26Parcelizer : null);
            boolean z7 = readVar.MediaBrowserCompatCustomActionResultReceiver;
            this._init_lambda4 = null;
            findSerializerByAddonType findserializerbyaddontype = new findSerializerByAddonType(readVar.AudioAttributesCompatParcelizer);
            this.addOnContextAvailableListener = findserializerbyaddontype;
            int i = readVar.onRemoveQueueItem;
            findserializerbyaddontype.write(false);
            findSerializerByLookup findserializerbylookup = new findSerializerByLookup(readVar.AudioAttributesCompatParcelizer);
            this.addOnNewIntentListener = findserializerbylookup;
            int i2 = readVar.onRemoveQueueItem;
            findserializerbylookup.read(false);
            this.onPlayFromMediaId = AudioAttributesCompatParcelizer((findConvertingSerializer) null);
            this.addOnPictureInPictureModeChangedListener = deserializeTypedFromObject.read;
            this.addObserverForBackInvokerlambda7 = AsWrapperTypeSerializer.read;
            _constructsimple.write(this.AudioAttributesImplApi26Parcelizer);
            IconCompatParcelizer(1, 10, Integer.valueOf(this.MediaBrowserCompatSearchResultReceiver));
            IconCompatParcelizer(2, 10, Integer.valueOf(this.MediaBrowserCompatSearchResultReceiver));
            IconCompatParcelizer(1, 3, this.AudioAttributesImplApi26Parcelizer);
            IconCompatParcelizer(2, 4, Integer.valueOf(this.addOnConfigurationChangedListener));
            IconCompatParcelizer(2, 5, Integer.valueOf(this.menuHostHelperlambda0));
            IconCompatParcelizer(1, 9, Boolean.valueOf(this.r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0));
            IconCompatParcelizer(2, 7, audioAttributesCompatParcelizer);
            IconCompatParcelizer(6, 8, audioAttributesCompatParcelizer);
            write(Integer.valueOf(this.ParcelableVolumeInfo));
            typeidvisibility.read();
        } catch (Throwable th) {
            this.onAddQueueItem.read();
            throw th;
        }
    }

    final /* synthetic */ void RemoteActionCompatParcelizer(isUnsafeBaseType.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer, enumTypes enumtypes) {
        audioAttributesCompatParcelizer.IconCompatParcelizer(this.getDefaultViewModelCreationExtras, new isUnsafeBaseType.RemoteActionCompatParcelizer(enumtypes));
    }

    final /* synthetic */ void IconCompatParcelizer(final LongNode.write writeVar) {
        this.onSkipToNext.IconCompatParcelizer(new Runnable() { // from class: o.asToken
            @Override // java.lang.Runnable
            public final void run() {
                this.RemoteActionCompatParcelizer.read(writeVar);
            }
        });
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    @Deprecated
    public final ExoPlayer.write getAudioComponent() {
        r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        return this;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    @Deprecated
    public final ExoPlayer.AudioAttributesImplApi26Parcelizer getVideoComponent() {
        r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        return this;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    @Deprecated
    public final ExoPlayer.MediaBrowserCompatCustomActionResultReceiver getTextComponent() {
        r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        return this;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    @Deprecated
    public final ExoPlayer.AudioAttributesCompatParcelizer getDeviceComponent() {
        r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        return this;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final boolean isSleepingForOffload() {
        r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        return this.onSkipToQueueItem.MediaBrowserCompatMediaItem;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final Looper getPlaybackLooper() {
        return this.onPrepareFromSearch.RemoteActionCompatParcelizer();
    }

    @Override // kotlin.isUnsafeBaseType
    public final Looper onCommand() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final buildTypeDeserializer getClock() {
        return this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void addAudioOffloadListener(ExoPlayer.RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        this.MediaMetadataCompat.add(remoteActionCompatParcelizer);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void removeAudioOffloadListener(ExoPlayer.RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        this.MediaMetadataCompat.remove(remoteActionCompatParcelizer);
    }

    @Override // kotlin.isUnsafeBaseType
    public final isUnsafeBaseType.read MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
        r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        return this.MediaBrowserCompatMediaItem;
    }

    @Override // kotlin.isUnsafeBaseType
    public final int onRewind() {
        r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        return this.onSkipToQueueItem.MediaBrowserCompatItemReceiver;
    }

    @Override // kotlin.isUnsafeBaseType
    public final int onSeekTo() {
        r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        return this.onSkipToQueueItem.MediaBrowserCompatSearchResultReceiver;
    }

    @Override // kotlin.isUnsafeBaseType
    public final addNull getPlayerError() {
        r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        return this.onSkipToQueueItem.AudioAttributesImplApi26Parcelizer;
    }

    @Override // kotlin.isUnsafeBaseType
    public final void onSkipToQueueItem() {
        r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        boolean zOnPrepareFromUri = onPrepareFromUri();
        int iIconCompatParcelizer = this.MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer(zOnPrepareFromUri, 2);
        AudioAttributesCompatParcelizer(zOnPrepareFromUri, iIconCompatParcelizer, AudioAttributesCompatParcelizer(iIconCompatParcelizer));
        if (this.onSkipToQueueItem.MediaBrowserCompatItemReceiver != 1) {
            return;
        }
        buildEnumSetSerializer buildenumsetserializerRemoteActionCompatParcelizer = this.onSkipToQueueItem.RemoteActionCompatParcelizer((addNull) null);
        buildEnumSetSerializer buildenumsetserializer = buildenumsetserializerRemoteActionCompatParcelizer.read(buildenumsetserializerRemoteActionCompatParcelizer.onAddQueueItem.RemoteActionCompatParcelizer() ? 4 : 2);
        this.onStop++;
        this.onPrepareFromSearch.MediaBrowserCompatCustomActionResultReceiver();
        IconCompatParcelizer(buildenumsetserializer, 1, false, 5, C.TIME_UNSET, -1, false);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    @Deprecated
    public final void prepare(StdKeySerializers stdKeySerializers) {
        r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        setMediaSource(stdKeySerializers);
        onSkipToQueueItem();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    @Deprecated
    public final void prepare(StdKeySerializers stdKeySerializers, boolean z, boolean z2) {
        r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        setMediaSource(stdKeySerializers, z);
        onSkipToQueueItem();
    }

    @Override // kotlin.isUnsafeBaseType
    public final void RemoteActionCompatParcelizer(List<JsonSerializableSchema> list) {
        r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        setMediaSources(AudioAttributesCompatParcelizer(list), true);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void setMediaSource(StdKeySerializers stdKeySerializers) {
        r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        setMediaSources(Collections.singletonList(stdKeySerializers));
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void setMediaSource(StdKeySerializers stdKeySerializers, long j) {
        r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        setMediaSources(Collections.singletonList(stdKeySerializers), 0, j);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void setMediaSource(StdKeySerializers stdKeySerializers, boolean z) {
        r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        setMediaSources(Collections.singletonList(stdKeySerializers), z);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void setMediaSources(List<StdKeySerializers> list) {
        r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        setMediaSources(list, true);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void setMediaSources(List<StdKeySerializers> list, boolean z) {
        r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        write(list, -1, C.TIME_UNSET, z);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void setMediaSources(List<StdKeySerializers> list, int i, long j) {
        r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        write(list, i, j, false);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void addMediaSource(StdKeySerializers stdKeySerializers) {
        r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        addMediaSources(Collections.singletonList(stdKeySerializers));
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void addMediaSource(int i, StdKeySerializers stdKeySerializers) {
        r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        addMediaSources(i, Collections.singletonList(stdKeySerializers));
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void addMediaSources(List<StdKeySerializers> list) {
        r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        addMediaSources(this.onSetRating.size(), list);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void addMediaSources(int i, List<StdKeySerializers> list) {
        r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        buildTypeSerializer.IconCompatParcelizer(i >= 0);
        int iMin = Math.min(i, this.onSetRating.size());
        if (this.onSetRating.isEmpty()) {
            setMediaSources(list, this.onRemoveQueueItem == -1);
        } else {
            IconCompatParcelizer(read(this.onSkipToQueueItem, iMin, list), 0, false, 5, C.TIME_UNSET, -1, false);
        }
    }

    @Override // kotlin.isUnsafeBaseType
    public final void replaceMediaItems(int i, int i2, List<JsonSerializableSchema> list) {
        r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        buildTypeSerializer.IconCompatParcelizer(i >= 0 && i2 >= i);
        int size = this.onSetRating.size();
        if (i > size) {
            return;
        }
        int iMin = Math.min(i2, size);
        if (IconCompatParcelizer(i, iMin, list)) {
            read(i, iMin, list);
            return;
        }
        List<StdKeySerializers> listAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(list);
        if (this.onSetRating.isEmpty()) {
            setMediaSources(listAudioAttributesCompatParcelizer, this.onRemoveQueueItem == -1);
        } else {
            buildEnumSetSerializer buildenumsetserializerAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(read(this.onSkipToQueueItem, iMin, listAudioAttributesCompatParcelizer), i, iMin);
            IconCompatParcelizer(buildenumsetserializerAudioAttributesCompatParcelizer, 0, !buildenumsetserializerAudioAttributesCompatParcelizer.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer.equals(this.onSkipToQueueItem.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer), 4, RemoteActionCompatParcelizer(buildenumsetserializerAudioAttributesCompatParcelizer), -1, false);
        }
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void setShuffleOrder(ToStringSerializerBase toStringSerializerBase) {
        r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        buildTypeSerializer.IconCompatParcelizer(toStringSerializerBase.write() == this.onSetRating.size());
        this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = toStringSerializerBase;
        PolymorphicTypeValidator polymorphicTypeValidatorMediaSessionCompatResultReceiverWrapper = MediaSessionCompatResultReceiverWrapper();
        buildEnumSetSerializer buildenumsetserializerRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(this.onSkipToQueueItem, polymorphicTypeValidatorMediaSessionCompatResultReceiverWrapper, AudioAttributesCompatParcelizer(polymorphicTypeValidatorMediaSessionCompatResultReceiverWrapper, onMediaButtonEvent(), onPlayFromUri()));
        this.onStop++;
        this.onPrepareFromSearch.IconCompatParcelizer(toStringSerializerBase);
        IconCompatParcelizer(buildenumsetserializerRemoteActionCompatParcelizer, 0, false, 5, C.TIME_UNSET, -1, false);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void setPauseAtEndOfMediaItems(boolean z) {
        r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        if (this.onSetShuffleMode == z) {
            return;
        }
        this.onSetShuffleMode = z;
        this.onPrepareFromSearch.RemoteActionCompatParcelizer(z);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final boolean getPauseAtEndOfMediaItems() {
        r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        return this.onSetShuffleMode;
    }

    @Override // kotlin.isUnsafeBaseType
    public final void AudioAttributesCompatParcelizer(boolean z) {
        r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        int iIconCompatParcelizer = this.MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer(z, onRewind());
        AudioAttributesCompatParcelizer(z, iIconCompatParcelizer, AudioAttributesCompatParcelizer(iIconCompatParcelizer));
    }

    @Override // kotlin.isUnsafeBaseType
    public final boolean onPrepareFromUri() {
        r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        return this.onSkipToQueueItem.MediaBrowserCompatCustomActionResultReceiver;
    }

    @Override // kotlin.isUnsafeBaseType
    public final void IconCompatParcelizer(final int i) {
        r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        if (this.r8lambdaKUbBm7ckfqTc9QCgukC86fguu4 != i) {
            this.r8lambdaKUbBm7ckfqTc9QCgukC86fguu4 = i;
            this.onPrepareFromSearch.RemoteActionCompatParcelizer(i);
            this.onPrepare.read(8, new typeId.RemoteActionCompatParcelizer() { // from class: o.ContainerNode
                @Override // o.typeId.RemoteActionCompatParcelizer
                public final void RemoteActionCompatParcelizer(Object obj) {
                    ((isUnsafeBaseType.AudioAttributesCompatParcelizer) obj).AudioAttributesCompatParcelizer(i);
                }
            });
            r8lambdaKUbBm7ckfqTc9QCgukC86fguu4();
            this.onPrepare.AudioAttributesCompatParcelizer();
        }
    }

    @Override // kotlin.isUnsafeBaseType
    public final int onSetShuffleMode() {
        r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        return this.r8lambdaKUbBm7ckfqTc9QCgukC86fguu4;
    }

    @Override // kotlin.isUnsafeBaseType
    public final void IconCompatParcelizer(final boolean z) {
        r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        if (this.r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8 != z) {
            this.r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8 = z;
            this.onPrepareFromSearch.read(z);
            this.onPrepare.read(9, new typeId.RemoteActionCompatParcelizer() { // from class: o.booleanNode
                @Override // o.typeId.RemoteActionCompatParcelizer
                public final void RemoteActionCompatParcelizer(Object obj) {
                    ((isUnsafeBaseType.AudioAttributesCompatParcelizer) obj).read(z);
                }
            });
            r8lambdaKUbBm7ckfqTc9QCgukC86fguu4();
            this.onPrepare.AudioAttributesCompatParcelizer();
        }
    }

    @Override // kotlin.isUnsafeBaseType
    public final boolean onSetPlaybackSpeed() {
        r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        return this.r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void setPreloadConfiguration(ExoPlayer.IconCompatParcelizer iconCompatParcelizer) {
        r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        if (this.PlaybackStateCompat.equals(iconCompatParcelizer)) {
            return;
        }
        this.PlaybackStateCompat = iconCompatParcelizer;
        this.onPrepareFromSearch.IconCompatParcelizer(iconCompatParcelizer);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final ExoPlayer.IconCompatParcelizer getPreloadConfiguration() {
        return this.PlaybackStateCompat;
    }

    private boolean r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8() {
        r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        return this.onSkipToQueueItem.write;
    }

    @Override // kotlin.valueFormat
    public final void read(int i, long j, boolean z) {
        r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        if (i != -1) {
            buildTypeSerializer.IconCompatParcelizer(i >= 0);
            PolymorphicTypeValidator polymorphicTypeValidator = this.onSkipToQueueItem.onAddQueueItem;
            if (polymorphicTypeValidator.RemoteActionCompatParcelizer() || i < polymorphicTypeValidator.AudioAttributesCompatParcelizer()) {
                this.write.write();
                this.onStop++;
                if (setSessionImpl()) {
                    prune.RemoteActionCompatParcelizer("ExoPlayerImpl", "seekTo ignored because an ad is playing");
                    LongNode.write writeVar = new LongNode.write(this.onSkipToQueueItem);
                    writeVar.write(1);
                    this.MediaSessionCompatQueueItem.read(writeVar);
                    return;
                }
                buildEnumSetSerializer buildenumsetserializer = this.onSkipToQueueItem;
                if (buildenumsetserializer.MediaBrowserCompatItemReceiver == 3 || (this.onSkipToQueueItem.MediaBrowserCompatItemReceiver == 4 && !polymorphicTypeValidator.RemoteActionCompatParcelizer())) {
                    buildenumsetserializer = this.onSkipToQueueItem.read(2);
                }
                int iOnMediaButtonEvent = onMediaButtonEvent();
                buildEnumSetSerializer buildenumsetserializerRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(buildenumsetserializer, polymorphicTypeValidator, AudioAttributesCompatParcelizer(polymorphicTypeValidator, i, j));
                this.onPrepareFromSearch.RemoteActionCompatParcelizer(polymorphicTypeValidator, i, LaissezFaireSubTypeValidator.IconCompatParcelizer(j));
                IconCompatParcelizer(buildenumsetserializerRemoteActionCompatParcelizer, 0, true, 1, RemoteActionCompatParcelizer(buildenumsetserializerRemoteActionCompatParcelizer), iOnMediaButtonEvent, z);
            }
        }
    }

    @Override // kotlin.isUnsafeBaseType
    public final long onSetCaptioningEnabled() {
        r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        return this.r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw;
    }

    @Override // kotlin.isUnsafeBaseType
    public final long onSetRepeatMode() {
        r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        return this.PlaybackStateCompatCustomAction;
    }

    @Override // kotlin.isUnsafeBaseType
    public final long onPrepareFromMediaId() {
        r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        return this.onRewind;
    }

    @Override // kotlin.isUnsafeBaseType
    public final void AudioAttributesCompatParcelizer(DefaultBaseTypeLimitingValidatorUnsafeBaseTypes defaultBaseTypeLimitingValidatorUnsafeBaseTypes) {
        r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        if (defaultBaseTypeLimitingValidatorUnsafeBaseTypes == null) {
            defaultBaseTypeLimitingValidatorUnsafeBaseTypes = DefaultBaseTypeLimitingValidatorUnsafeBaseTypes.write;
        }
        if (this.onSkipToQueueItem.AudioAttributesImplApi21Parcelizer.equals(defaultBaseTypeLimitingValidatorUnsafeBaseTypes)) {
            return;
        }
        buildEnumSetSerializer buildenumsetserializerRemoteActionCompatParcelizer = this.onSkipToQueueItem.RemoteActionCompatParcelizer(defaultBaseTypeLimitingValidatorUnsafeBaseTypes);
        this.onStop++;
        this.onPrepareFromSearch.RemoteActionCompatParcelizer(defaultBaseTypeLimitingValidatorUnsafeBaseTypes);
        IconCompatParcelizer(buildenumsetserializerRemoteActionCompatParcelizer, 0, false, 5, C.TIME_UNSET, -1, false);
    }

    @Override // kotlin.isUnsafeBaseType
    public final DefaultBaseTypeLimitingValidatorUnsafeBaseTypes onRemoveQueueItemAt() {
        r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        return this.onSkipToQueueItem.AudioAttributesImplApi21Parcelizer;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void setSeekParameters(createKeySerializer createkeyserializer) {
        r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        if (createkeyserializer == null) {
            createkeyserializer = createKeySerializer.write;
        }
        if (this._init_lambda2.equals(createkeyserializer)) {
            return;
        }
        this._init_lambda2 = createkeyserializer;
        this.onPrepareFromSearch.IconCompatParcelizer(createkeyserializer);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final createKeySerializer getSeekParameters() {
        r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        return this._init_lambda2;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void setForegroundMode(boolean z) {
        r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        if (this.onPlay != z) {
            this.onPlay = z;
            if (this.onPrepareFromSearch.write(z)) {
                return;
            }
            RemoteActionCompatParcelizer(addNull.RemoteActionCompatParcelizer(new _read(2), 1003));
        }
    }

    @Override // kotlin.isUnsafeBaseType
    public final void ParcelableVolumeInfo() {
        r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        this.MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer(onPrepareFromUri(), 1);
        RemoteActionCompatParcelizer((addNull) null);
        this.onPause = new idFromValue(initExtraTracks.AudioAttributesImplApi26Parcelizer(), this.onSkipToQueueItem.RatingCompat);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void release() {
        AudioTrack audioTrack;
        StringBuilder sb = new StringBuilder("Release ");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" [AndroidXMedia3/1.4.1] [");
        sb.append(LaissezFaireSubTypeValidator.write);
        sb.append("] [");
        sb.append(isSafeSubType.write());
        sb.append("]");
        prune.write("ExoPlayerImpl", sb.toString());
        r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        if (LaissezFaireSubTypeValidator.MediaBrowserCompatCustomActionResultReceiver < 21 && (audioTrack = this.onPrepareFromMediaId) != null) {
            audioTrack.release();
            this.onPrepareFromMediaId = null;
        }
        this.MediaBrowserCompatItemReceiver.RemoteActionCompatParcelizer(false);
        findConvertingSerializer findconvertingserializer = this._init_lambda4;
        if (findconvertingserializer != null) {
            findconvertingserializer.RemoteActionCompatParcelizer();
        }
        this.addOnContextAvailableListener.AudioAttributesCompatParcelizer(false);
        this.addOnNewIntentListener.IconCompatParcelizer(false);
        this.MediaBrowserCompatCustomActionResultReceiver.write();
        if (!this.onPrepareFromSearch.AudioAttributesImplApi26Parcelizer()) {
            this.onPrepare.write(10, new typeId.RemoteActionCompatParcelizer() { // from class: o.JsonNodeFactory
                @Override // o.typeId.RemoteActionCompatParcelizer
                public final void RemoteActionCompatParcelizer(Object obj) {
                    ((isUnsafeBaseType.AudioAttributesCompatParcelizer) obj).IconCompatParcelizer(addNull.RemoteActionCompatParcelizer(new _read(1), 1003));
                }
            });
        }
        this.onPrepare.RemoteActionCompatParcelizer();
        this.onSkipToNext.read();
        this.onCommand.IconCompatParcelizer(this.write);
        if (this.onSkipToQueueItem.MediaBrowserCompatMediaItem) {
            this.onSkipToQueueItem = this.onSkipToQueueItem.RemoteActionCompatParcelizer();
        }
        buildEnumSetSerializer buildenumsetserializer = this.onSkipToQueueItem.read(1);
        this.onSkipToQueueItem = buildenumsetserializer;
        buildEnumSetSerializer buildenumsetserializerRemoteActionCompatParcelizer = buildenumsetserializer.RemoteActionCompatParcelizer(buildenumsetserializer.RemoteActionCompatParcelizer);
        this.onSkipToQueueItem = buildenumsetserializerRemoteActionCompatParcelizer;
        buildenumsetserializerRemoteActionCompatParcelizer.IconCompatParcelizer = buildenumsetserializerRemoteActionCompatParcelizer.RatingCompat;
        this.onSkipToQueueItem.onCustomAction = 0L;
        this.write.read();
        this.createFullyDrawnExecutor.read();
        PlaybackStateCompat();
        Surface surface = this.onSetCaptioningEnabled;
        if (surface != null) {
            surface.release();
            this.onSetCaptioningEnabled = null;
        }
        if (this.onPlayFromSearch) {
            ((validateBaseType) buildTypeSerializer.IconCompatParcelizer(this.ResultReceiver)).RemoteActionCompatParcelizer(this.ParcelableVolumeInfo);
            this.onPlayFromSearch = false;
        }
        this.onPause = idFromValue.IconCompatParcelizer;
        this.MediaSessionCompatToken = true;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final boolean isReleased() {
        r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        return this.MediaSessionCompatToken;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final buildMapEntrySerializer createMessage(buildMapEntrySerializer.write writeVar) {
        r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        return write(writeVar);
    }

    @Override // kotlin.isUnsafeBaseType
    public final int onFastForward() {
        r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        if (this.onSkipToQueueItem.onAddQueueItem.RemoteActionCompatParcelizer()) {
            return this.onPrepareFromUri;
        }
        return this.onSkipToQueueItem.onAddQueueItem.read(this.onSkipToQueueItem.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer);
    }

    @Override // kotlin.isUnsafeBaseType
    public final int onMediaButtonEvent() {
        r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        int iAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(this.onSkipToQueueItem);
        if (iAudioAttributesCompatParcelizer == -1) {
            return 0;
        }
        return iAudioAttributesCompatParcelizer;
    }

    @Override // kotlin.isUnsafeBaseType
    public final long onPlayFromSearch() {
        r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        if (setSessionImpl()) {
            StdKeySerializers.write writeVar = this.onSkipToQueueItem.RemoteActionCompatParcelizer;
            this.onSkipToQueueItem.onAddQueueItem.RemoteActionCompatParcelizer(writeVar.AudioAttributesCompatParcelizer, this.setSessionImpl);
            return LaissezFaireSubTypeValidator.AudioAttributesCompatParcelizer(this.setSessionImpl.RemoteActionCompatParcelizer(writeVar.write, writeVar.read));
        }
        return RemoteActionCompatParcelizer();
    }

    @Override // kotlin.isUnsafeBaseType
    public final long onPlayFromUri() {
        r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        return LaissezFaireSubTypeValidator.AudioAttributesCompatParcelizer(RemoteActionCompatParcelizer(this.onSkipToQueueItem));
    }

    @Override // kotlin.isUnsafeBaseType
    public final long handleMediaPlayPauseIfPendingOnHandler() {
        r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        if (setSessionImpl()) {
            if (this.onSkipToQueueItem.read.equals(this.onSkipToQueueItem.RemoteActionCompatParcelizer)) {
                return LaissezFaireSubTypeValidator.AudioAttributesCompatParcelizer(this.onSkipToQueueItem.IconCompatParcelizer);
            }
            return onPlayFromSearch();
        }
        return onCustomAction();
    }

    @Override // kotlin.isUnsafeBaseType
    public final long onSetRating() {
        r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        return LaissezFaireSubTypeValidator.AudioAttributesCompatParcelizer(this.onSkipToQueueItem.onCustomAction);
    }

    @Override // kotlin.isUnsafeBaseType
    public final boolean setSessionImpl() {
        r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        return this.onSkipToQueueItem.RemoteActionCompatParcelizer.IconCompatParcelizer();
    }

    @Override // kotlin.isUnsafeBaseType
    public final int onPlay() {
        r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        if (setSessionImpl()) {
            return this.onSkipToQueueItem.RemoteActionCompatParcelizer.write;
        }
        return -1;
    }

    @Override // kotlin.isUnsafeBaseType
    public final int onPause() {
        r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        if (setSessionImpl()) {
            return this.onSkipToQueueItem.RemoteActionCompatParcelizer.read;
        }
        return -1;
    }

    @Override // kotlin.isUnsafeBaseType
    public final long onAddQueueItem() {
        r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        return write(this.onSkipToQueueItem);
    }

    @Override // kotlin.isUnsafeBaseType
    public final long onCustomAction() {
        r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        if (this.onSkipToQueueItem.onAddQueueItem.RemoteActionCompatParcelizer()) {
            return this.onRemoveQueueItemAt;
        }
        if (this.onSkipToQueueItem.read.RemoteActionCompatParcelizer != this.onSkipToQueueItem.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer) {
            return this.onSkipToQueueItem.onAddQueueItem.RemoteActionCompatParcelizer(onMediaButtonEvent(), this.IconCompatParcelizer).write();
        }
        long j = this.onSkipToQueueItem.IconCompatParcelizer;
        if (this.onSkipToQueueItem.read.IconCompatParcelizer()) {
            PolymorphicTypeValidator.AudioAttributesCompatParcelizer audioAttributesCompatParcelizerRemoteActionCompatParcelizer = this.onSkipToQueueItem.onAddQueueItem.RemoteActionCompatParcelizer(this.onSkipToQueueItem.read.AudioAttributesCompatParcelizer, this.setSessionImpl);
            long jWrite = audioAttributesCompatParcelizerRemoteActionCompatParcelizer.write(this.onSkipToQueueItem.read.write);
            j = jWrite == Long.MIN_VALUE ? audioAttributesCompatParcelizerRemoteActionCompatParcelizer.read : jWrite;
        }
        return LaissezFaireSubTypeValidator.AudioAttributesCompatParcelizer(RemoteActionCompatParcelizer(this.onSkipToQueueItem.onAddQueueItem, this.onSkipToQueueItem.read, j));
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final int getRendererCount() {
        r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        return this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM.length;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final int getRendererType(int i) {
        r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        return this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM[i].MediaBrowserCompatMediaItem();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final buildIndexedListSerializer getRenderer(int i) {
        r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        return this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM[i];
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final _constructSimple getTrackSelector() {
        r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        return this.createFullyDrawnExecutor;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final _writeAsBinary getCurrentTrackGroups() {
        r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        return this.onSkipToQueueItem.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final _resolveTypePlaceholders getCurrentTrackSelections() {
        r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        return new _resolveTypePlaceholders(this.onSkipToQueueItem.onCommand.write);
    }

    @Override // kotlin.isUnsafeBaseType
    public final collectAndResolveSubtypesByTypeId onPrepareFromSearch() {
        r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        return this.onSkipToQueueItem.onCommand.IconCompatParcelizer;
    }

    @Override // kotlin.isUnsafeBaseType
    public final SubtypeResolver onStop() {
        r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        return this.createFullyDrawnExecutor.AudioAttributesCompatParcelizer();
    }

    @Override // kotlin.isUnsafeBaseType
    public final void AudioAttributesCompatParcelizer(final SubtypeResolver subtypeResolver) {
        r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        if (!this.createFullyDrawnExecutor.write() || subtypeResolver.equals(this.createFullyDrawnExecutor.AudioAttributesCompatParcelizer())) {
            return;
        }
        this.createFullyDrawnExecutor.read(subtypeResolver);
        this.onPrepare.write(19, new typeId.RemoteActionCompatParcelizer() { // from class: o.arrayNode
            @Override // o.typeId.RemoteActionCompatParcelizer
            public final void RemoteActionCompatParcelizer(Object obj) {
                ((isUnsafeBaseType.AudioAttributesCompatParcelizer) obj).AudioAttributesCompatParcelizer(subtypeResolver);
            }
        });
    }

    @Override // kotlin.isUnsafeBaseType
    public final getSchema onRemoveQueueItem() {
        r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        return this.onSeekTo;
    }

    @Override // kotlin.isUnsafeBaseType
    public final PolymorphicTypeValidator onPrepare() {
        r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        return this.onSkipToQueueItem.onAddQueueItem;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void setVideoEffects(List<JsonValueFormat> list) {
        r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        try {
            Class.forName("androidx.media3.effect.PreviewingSingleInputVideoGraph$Factory").getConstructor(collectAndResolveSubtypesByClass.RemoteActionCompatParcelizer.class);
            IconCompatParcelizer(2, 13, list);
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            throw new IllegalStateException("Could not find required lib-effect dependencies.", e);
        }
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void setVideoScalingMode(int i) {
        r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        this.addOnConfigurationChangedListener = i;
        IconCompatParcelizer(2, 4, Integer.valueOf(i));
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final int getVideoScalingMode() {
        r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        return this.addOnConfigurationChangedListener;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void setVideoChangeFrameRateStrategy(int i) {
        r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        if (this.menuHostHelperlambda0 == i) {
            return;
        }
        this.menuHostHelperlambda0 = i;
        IconCompatParcelizer(2, 5, Integer.valueOf(i));
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final int getVideoChangeFrameRateStrategy() {
        r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        return this.menuHostHelperlambda0;
    }

    @Override // kotlin.isUnsafeBaseType
    public final deserializeTypedFromObject onSkipToPrevious() {
        r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        return this.addOnPictureInPictureModeChangedListener;
    }

    private void PlaybackStateCompatCustomAction() {
        r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        PlaybackStateCompat();
        AudioAttributesCompatParcelizer((Object) null);
        AudioAttributesCompatParcelizer(0, 0);
    }

    private void AudioAttributesCompatParcelizer(SurfaceHolder surfaceHolder) {
        r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        if (surfaceHolder == null) {
            PlaybackStateCompatCustomAction();
            return;
        }
        PlaybackStateCompat();
        this.accessgetReportFullyDrawnExecutorp = true;
        this.accessensureViewModelStore = surfaceHolder;
        surfaceHolder.addCallback(this.handleMediaPlayPauseIfPendingOnHandler);
        Surface surface = surfaceHolder.getSurface();
        if (surface != null && surface.isValid()) {
            AudioAttributesCompatParcelizer(surface);
            Rect surfaceFrame = surfaceHolder.getSurfaceFrame();
            AudioAttributesCompatParcelizer(surfaceFrame.width(), surfaceFrame.height());
        } else {
            AudioAttributesCompatParcelizer((Object) null);
            AudioAttributesCompatParcelizer(0, 0);
        }
    }

    private void RemoteActionCompatParcelizer(SurfaceHolder surfaceHolder) {
        r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        if (surfaceHolder == null || surfaceHolder != this.accessensureViewModelStore) {
            return;
        }
        PlaybackStateCompatCustomAction();
    }

    @Override // kotlin.isUnsafeBaseType
    public final void AudioAttributesCompatParcelizer(SurfaceView surfaceView) {
        r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        if (surfaceView instanceof parseTypes) {
            PlaybackStateCompat();
            AudioAttributesCompatParcelizer((Object) surfaceView);
            write(surfaceView.getHolder());
        } else {
            if (surfaceView instanceof SphericalGLSurfaceView) {
                PlaybackStateCompat();
                this._init_lambda3 = (SphericalGLSurfaceView) surfaceView;
                write((buildMapEntrySerializer.write) this.onFastForward).RemoteActionCompatParcelizer(10000).AudioAttributesCompatParcelizer(this._init_lambda3).AudioAttributesImplApi21Parcelizer();
                this._init_lambda3.read(this.handleMediaPlayPauseIfPendingOnHandler);
                AudioAttributesCompatParcelizer(this._init_lambda3.write());
                write(surfaceView.getHolder());
                return;
            }
            AudioAttributesCompatParcelizer(surfaceView == null ? null : surfaceView.getHolder());
        }
    }

    @Override // kotlin.isUnsafeBaseType
    public final void read(SurfaceView surfaceView) {
        r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        RemoteActionCompatParcelizer(surfaceView == null ? null : surfaceView.getHolder());
    }

    @Override // kotlin.isUnsafeBaseType
    public final void IconCompatParcelizer(TextureView textureView) {
        r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        if (textureView == null) {
            PlaybackStateCompatCustomAction();
            return;
        }
        PlaybackStateCompat();
        this.accessonBackPresseds1027565324 = textureView;
        if (textureView.getSurfaceTextureListener() != null) {
            prune.RemoteActionCompatParcelizer("ExoPlayerImpl", "Replacing existing SurfaceTextureListener.");
        }
        textureView.setSurfaceTextureListener(this.handleMediaPlayPauseIfPendingOnHandler);
        SurfaceTexture surfaceTexture = textureView.isAvailable() ? textureView.getSurfaceTexture() : null;
        if (surfaceTexture == null) {
            AudioAttributesCompatParcelizer((Object) null);
            AudioAttributesCompatParcelizer(0, 0);
        } else {
            RemoteActionCompatParcelizer(surfaceTexture);
            AudioAttributesCompatParcelizer(textureView.getWidth(), textureView.getHeight());
        }
    }

    @Override // kotlin.isUnsafeBaseType
    public final void write(TextureView textureView) {
        r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        if (textureView == null || textureView != this.accessonBackPresseds1027565324) {
            return;
        }
        PlaybackStateCompatCustomAction();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void setAudioSessionId(final int i) {
        r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        if (this.MediaBrowserCompatSearchResultReceiver == i) {
            return;
        }
        if (i == 0) {
            if (LaissezFaireSubTypeValidator.MediaBrowserCompatCustomActionResultReceiver < 21) {
                i = RemoteActionCompatParcelizer(0);
            } else {
                i = LaissezFaireSubTypeValidator.AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer);
            }
        } else if (LaissezFaireSubTypeValidator.MediaBrowserCompatCustomActionResultReceiver < 21) {
            RemoteActionCompatParcelizer(i);
        }
        this.MediaBrowserCompatSearchResultReceiver = i;
        IconCompatParcelizer(1, 10, Integer.valueOf(i));
        IconCompatParcelizer(2, 10, Integer.valueOf(i));
        this.onPrepare.write(21, new typeId.RemoteActionCompatParcelizer() { // from class: o.numberNode
            @Override // o.typeId.RemoteActionCompatParcelizer
            public final void RemoteActionCompatParcelizer(Object obj) {
                ((isUnsafeBaseType.AudioAttributesCompatParcelizer) obj).read(i);
            }
        });
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final int getAudioSessionId() {
        r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        return this.MediaBrowserCompatSearchResultReceiver;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void setAuxEffectInfo(expectNumberFormat expectnumberformat) {
        r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        IconCompatParcelizer(1, 6, expectnumberformat);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void clearAuxEffectInfo() {
        r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        setAuxEffectInfo(new expectNumberFormat());
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void setPreferredAudioDevice(AudioDeviceInfo audioDeviceInfo) {
        r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        IconCompatParcelizer(1, 12, audioDeviceInfo);
    }

    @Override // kotlin.isUnsafeBaseType
    public final void read(float f) {
        r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        final float fAudioAttributesCompatParcelizer = LaissezFaireSubTypeValidator.AudioAttributesCompatParcelizer(f, BitmapDescriptorFactory.HUE_RED, 1.0f);
        if (this.addOnMultiWindowModeChangedListener == fAudioAttributesCompatParcelizer) {
            return;
        }
        this.addOnMultiWindowModeChangedListener = fAudioAttributesCompatParcelizer;
        ResultReceiver();
        this.onPrepare.write(22, new typeId.RemoteActionCompatParcelizer() { // from class: o.valueToBytes
            @Override // o.typeId.RemoteActionCompatParcelizer
            public final void RemoteActionCompatParcelizer(Object obj) {
                ((isUnsafeBaseType.AudioAttributesCompatParcelizer) obj).IconCompatParcelizer(fAudioAttributesCompatParcelizer);
            }
        });
    }

    @Override // kotlin.isUnsafeBaseType
    public final float onSkipToNext() {
        r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        return this.addOnMultiWindowModeChangedListener;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final boolean getSkipSilenceEnabled() {
        r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        return this.r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void setSkipSilenceEnabled(final boolean z) {
        r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        if (this.r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0 == z) {
            return;
        }
        this.r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0 = z;
        IconCompatParcelizer(1, 9, Boolean.valueOf(z));
        this.onPrepare.write(23, new typeId.RemoteActionCompatParcelizer() { // from class: o.InternalNodeMapperWrapperForSerializer
            @Override // o.typeId.RemoteActionCompatParcelizer
            public final void RemoteActionCompatParcelizer(Object obj) {
                ((isUnsafeBaseType.AudioAttributesCompatParcelizer) obj).RemoteActionCompatParcelizer(z);
            }
        });
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final findSerializerByPrimaryType getAnalyticsCollector() {
        r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        return this.write;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void addAnalyticsListener(findSerializerByAnnotations findserializerbyannotations) {
        this.write.write((findSerializerByAnnotations) buildTypeSerializer.IconCompatParcelizer(findserializerbyannotations));
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void removeAnalyticsListener(findSerializerByAnnotations findserializerbyannotations) {
        r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        this.write.AudioAttributesCompatParcelizer((findSerializerByAnnotations) buildTypeSerializer.IconCompatParcelizer(findserializerbyannotations));
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void setHandleAudioBecomingNoisy(boolean z) {
        r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        if (this.MediaSessionCompatToken) {
            return;
        }
        this.MediaBrowserCompatItemReceiver.RemoteActionCompatParcelizer(z);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void setPriority(int i) {
        r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        if (this.ParcelableVolumeInfo == i) {
            return;
        }
        if (this.onPlayFromSearch) {
            validateBaseType validatebasetype = (validateBaseType) buildTypeSerializer.IconCompatParcelizer(this.ResultReceiver);
            validatebasetype.AudioAttributesCompatParcelizer(i);
            validatebasetype.RemoteActionCompatParcelizer(this.ParcelableVolumeInfo);
        }
        this.ParcelableVolumeInfo = i;
        write(Integer.valueOf(i));
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void setPriorityTaskManager(validateBaseType validatebasetype) {
        r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        if (LaissezFaireSubTypeValidator.read(this.ResultReceiver, validatebasetype)) {
            return;
        }
        if (this.onPlayFromSearch) {
            ((validateBaseType) buildTypeSerializer.IconCompatParcelizer(this.ResultReceiver)).RemoteActionCompatParcelizer(this.ParcelableVolumeInfo);
        }
        if (validatebasetype != null && r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8()) {
            validatebasetype.AudioAttributesCompatParcelizer(this.ParcelableVolumeInfo);
            this.onPlayFromSearch = true;
        } else {
            this.onPlayFromSearch = false;
        }
        this.ResultReceiver = validatebasetype;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final C0170format getVideoFormat() {
        r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        return this.addMenuProvider;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final C0170format getAudioFormat() {
        r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        return this.MediaDescriptionCompat;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final _at getVideoDecoderCounters() {
        r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        return this.addContentView;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final _at getAudioDecoderCounters() {
        r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        return this.AudioAttributesImplBaseParcelizer;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void setVideoFrameMetadataListener(getRemainingInput getremaininginput) {
        r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        this.getOnBackPressedDispatcherannotations = getremaininginput;
        write((buildMapEntrySerializer.write) this.onFastForward).RemoteActionCompatParcelizer(7).AudioAttributesCompatParcelizer(getremaininginput).AudioAttributesImplApi21Parcelizer();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void clearVideoFrameMetadataListener(getRemainingInput getremaininginput) {
        r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        if (this.getOnBackPressedDispatcherannotations != getremaininginput) {
            return;
        }
        write((buildMapEntrySerializer.write) this.onFastForward).RemoteActionCompatParcelizer(7).AudioAttributesCompatParcelizer((Object) null).AudioAttributesImplApi21Parcelizer();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void setCameraMotionListener(ArrayBuildersDoubleBuilder arrayBuildersDoubleBuilder) {
        r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        this.onCustomAction = arrayBuildersDoubleBuilder;
        write((buildMapEntrySerializer.write) this.onFastForward).RemoteActionCompatParcelizer(8).AudioAttributesCompatParcelizer(arrayBuildersDoubleBuilder).AudioAttributesImplApi21Parcelizer();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void clearCameraMotionListener(ArrayBuildersDoubleBuilder arrayBuildersDoubleBuilder) {
        r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        if (this.onCustomAction != arrayBuildersDoubleBuilder) {
            return;
        }
        write((buildMapEntrySerializer.write) this.onFastForward).RemoteActionCompatParcelizer(8).AudioAttributesCompatParcelizer((Object) null).AudioAttributesImplApi21Parcelizer();
    }

    @Override // kotlin.isUnsafeBaseType
    public final idFromValue onPlayFromMediaId() {
        r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        return this.onPause;
    }

    @Override // kotlin.isUnsafeBaseType
    public final void read(isUnsafeBaseType.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
        this.onPrepare.AudioAttributesCompatParcelizer((isUnsafeBaseType.AudioAttributesCompatParcelizer) buildTypeSerializer.IconCompatParcelizer(audioAttributesCompatParcelizer));
    }

    @Override // kotlin.isUnsafeBaseType
    public final void write(isUnsafeBaseType.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
        r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        this.onPrepare.write((isUnsafeBaseType.AudioAttributesCompatParcelizer) buildTypeSerializer.IconCompatParcelizer(audioAttributesCompatParcelizer));
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void setWakeMode(int i) {
        r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        if (i == 0) {
            this.addOnContextAvailableListener.write(false);
            this.addOnNewIntentListener.read(false);
        } else if (i == 1) {
            this.addOnContextAvailableListener.write(true);
            this.addOnNewIntentListener.read(false);
        } else {
            if (i != 2) {
                return;
            }
            this.addOnContextAvailableListener.write(true);
            this.addOnNewIntentListener.read(true);
        }
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final boolean isTunnelingEnabled() {
        r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        for (buildIteratorSerializer builditeratorserializer : this.onSkipToQueueItem.onCommand.read) {
            if (builditeratorserializer != null && builditeratorserializer.RemoteActionCompatParcelizer) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void setImageOutput(ImageOutput imageOutput) {
        r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        IconCompatParcelizer(4, 15, imageOutput);
    }

    private void RemoteActionCompatParcelizer(addNull addnull) {
        buildEnumSetSerializer buildenumsetserializer = this.onSkipToQueueItem;
        buildEnumSetSerializer buildenumsetserializerRemoteActionCompatParcelizer = buildenumsetserializer.RemoteActionCompatParcelizer(buildenumsetserializer.RemoteActionCompatParcelizer);
        buildenumsetserializerRemoteActionCompatParcelizer.IconCompatParcelizer = buildenumsetserializerRemoteActionCompatParcelizer.RatingCompat;
        buildenumsetserializerRemoteActionCompatParcelizer.onCustomAction = 0L;
        buildEnumSetSerializer buildenumsetserializerRemoteActionCompatParcelizer2 = buildenumsetserializerRemoteActionCompatParcelizer.read(1);
        if (addnull != null) {
            buildenumsetserializerRemoteActionCompatParcelizer2 = buildenumsetserializerRemoteActionCompatParcelizer2.RemoteActionCompatParcelizer(addnull);
        }
        this.onStop++;
        this.onPrepareFromSearch.AudioAttributesImplBaseParcelizer();
        IconCompatParcelizer(buildenumsetserializerRemoteActionCompatParcelizer2, 0, false, 5, C.TIME_UNSET, -1, false);
    }

    private int AudioAttributesCompatParcelizer(buildEnumSetSerializer buildenumsetserializer) {
        if (buildenumsetserializer.onAddQueueItem.RemoteActionCompatParcelizer()) {
            return this.onRemoveQueueItem;
        }
        return buildenumsetserializer.onAddQueueItem.RemoteActionCompatParcelizer(buildenumsetserializer.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer, this.setSessionImpl).AudioAttributesImplBaseParcelizer;
    }

    private long write(buildEnumSetSerializer buildenumsetserializer) {
        if (buildenumsetserializer.RemoteActionCompatParcelizer.IconCompatParcelizer()) {
            buildenumsetserializer.onAddQueueItem.RemoteActionCompatParcelizer(buildenumsetserializer.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer, this.setSessionImpl);
            if (buildenumsetserializer.MediaMetadataCompat == C.TIME_UNSET) {
                return buildenumsetserializer.onAddQueueItem.RemoteActionCompatParcelizer(AudioAttributesCompatParcelizer(buildenumsetserializer), this.IconCompatParcelizer).RemoteActionCompatParcelizer();
            }
            return this.setSessionImpl.AudioAttributesCompatParcelizer() + LaissezFaireSubTypeValidator.AudioAttributesCompatParcelizer(buildenumsetserializer.MediaMetadataCompat);
        }
        return LaissezFaireSubTypeValidator.AudioAttributesCompatParcelizer(RemoteActionCompatParcelizer(buildenumsetserializer));
    }

    private long RemoteActionCompatParcelizer(buildEnumSetSerializer buildenumsetserializer) {
        long jAudioAttributesCompatParcelizer;
        if (buildenumsetserializer.onAddQueueItem.RemoteActionCompatParcelizer()) {
            return LaissezFaireSubTypeValidator.IconCompatParcelizer(this.onRemoveQueueItemAt);
        }
        if (buildenumsetserializer.MediaBrowserCompatMediaItem) {
            jAudioAttributesCompatParcelizer = buildenumsetserializer.AudioAttributesCompatParcelizer();
        } else {
            jAudioAttributesCompatParcelizer = buildenumsetserializer.RatingCompat;
        }
        return buildenumsetserializer.RemoteActionCompatParcelizer.IconCompatParcelizer() ? jAudioAttributesCompatParcelizer : RemoteActionCompatParcelizer(buildenumsetserializer.onAddQueueItem, buildenumsetserializer.RemoteActionCompatParcelizer, jAudioAttributesCompatParcelizer);
    }

    private List<StdKeySerializers> AudioAttributesCompatParcelizer(List<JsonSerializableSchema> list) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            arrayList.add(this.onSetPlaybackSpeed.write(list.get(i)));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public void read(LongNode.write writeVar) {
        this.onStop -= writeVar.RemoteActionCompatParcelizer;
        boolean z = true;
        if (writeVar.read) {
            this.onSkipToPrevious = writeVar.AudioAttributesCompatParcelizer;
            this.onSetRepeatMode = true;
        }
        if (this.onStop == 0) {
            PolymorphicTypeValidator polymorphicTypeValidator = writeVar.write.onAddQueueItem;
            if (!this.onSkipToQueueItem.onAddQueueItem.RemoteActionCompatParcelizer() && polymorphicTypeValidator.RemoteActionCompatParcelizer()) {
                this.onRemoveQueueItem = -1;
                this.onRemoveQueueItemAt = 0L;
                this.onPrepareFromUri = 0;
            }
            if (!polymorphicTypeValidator.RemoteActionCompatParcelizer()) {
                List<PolymorphicTypeValidator> list = ((buildMapSerializer) polymorphicTypeValidator).read();
                buildTypeSerializer.write(list.size() == this.onSetRating.size());
                for (int i = 0; i < list.size(); i++) {
                    this.onSetRating.get(i).RemoteActionCompatParcelizer(list.get(i));
                }
            }
            boolean z2 = this.onSetRepeatMode;
            long jRemoteActionCompatParcelizer = C.TIME_UNSET;
            if (z2) {
                boolean z3 = (writeVar.write.RemoteActionCompatParcelizer.equals(this.onSkipToQueueItem.RemoteActionCompatParcelizer) && writeVar.write.AudioAttributesCompatParcelizer == this.onSkipToQueueItem.RatingCompat) ? false : true;
                if (!z3) {
                    z = z3;
                } else if (polymorphicTypeValidator.RemoteActionCompatParcelizer() || writeVar.write.RemoteActionCompatParcelizer.IconCompatParcelizer()) {
                    jRemoteActionCompatParcelizer = writeVar.write.AudioAttributesCompatParcelizer;
                } else {
                    jRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(polymorphicTypeValidator, writeVar.write.RemoteActionCompatParcelizer, writeVar.write.AudioAttributesCompatParcelizer);
                }
            } else {
                z = false;
            }
            this.onSetRepeatMode = false;
            IconCompatParcelizer(writeVar.write, 1, z, this.onSkipToPrevious, jRemoteActionCompatParcelizer, -1, false);
        }
    }

    private void IconCompatParcelizer(final buildEnumSetSerializer buildenumsetserializer, final int i, boolean z, final int i2, long j, int i3, boolean z2) {
        buildEnumSetSerializer buildenumsetserializer2 = this.onSkipToQueueItem;
        this.onSkipToQueueItem = buildenumsetserializer;
        boolean zEquals = buildenumsetserializer2.onAddQueueItem.equals(buildenumsetserializer.onAddQueueItem);
        Pair<Boolean, Integer> pairIconCompatParcelizer = IconCompatParcelizer(buildenumsetserializer, buildenumsetserializer2, z, i2, !zEquals, z2);
        boolean zBooleanValue = ((Boolean) pairIconCompatParcelizer.first).booleanValue();
        final int iIntValue = ((Integer) pairIconCompatParcelizer.second).intValue();
        if (zBooleanValue) {
            jsonSerializableSchema = buildenumsetserializer.onAddQueueItem.RemoteActionCompatParcelizer() ? null : buildenumsetserializer.onAddQueueItem.RemoteActionCompatParcelizer(buildenumsetserializer.onAddQueueItem.RemoteActionCompatParcelizer(buildenumsetserializer.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer, this.setSessionImpl).AudioAttributesImplBaseParcelizer, this.IconCompatParcelizer).AudioAttributesImplApi26Parcelizer;
            this._init_lambda5 = getSchema.AudioAttributesCompatParcelizer;
        }
        if (zBooleanValue || !buildenumsetserializer2.MediaDescriptionCompat.equals(buildenumsetserializer.MediaDescriptionCompat)) {
            this._init_lambda5 = this._init_lambda5.IconCompatParcelizer().AudioAttributesCompatParcelizer(buildenumsetserializer.MediaDescriptionCompat).read();
        }
        getSchema getschemaMediaSessionCompatToken = MediaSessionCompatToken();
        boolean zEquals2 = getschemaMediaSessionCompatToken.equals(this.onSeekTo);
        this.onSeekTo = getschemaMediaSessionCompatToken;
        boolean z3 = buildenumsetserializer2.MediaBrowserCompatCustomActionResultReceiver != buildenumsetserializer.MediaBrowserCompatCustomActionResultReceiver;
        boolean z4 = buildenumsetserializer2.MediaBrowserCompatItemReceiver != buildenumsetserializer.MediaBrowserCompatItemReceiver;
        if (z4 || z3) {
            r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw();
        }
        boolean z5 = buildenumsetserializer2.write != buildenumsetserializer.write;
        if (z5) {
            RemoteActionCompatParcelizer(buildenumsetserializer.write);
        }
        if (!zEquals) {
            this.onPrepare.read(0, new typeId.RemoteActionCompatParcelizer() { // from class: o.BooleanNode
                @Override // o.typeId.RemoteActionCompatParcelizer
                public final void RemoteActionCompatParcelizer(Object obj) {
                    isUnsafeBaseType.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = (isUnsafeBaseType.AudioAttributesCompatParcelizer) obj;
                    audioAttributesCompatParcelizer.RemoteActionCompatParcelizer(buildenumsetserializer.onAddQueueItem, i);
                }
            });
        }
        if (z) {
            final isUnsafeBaseType.write writeVarAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(i2, buildenumsetserializer2, i3);
            final isUnsafeBaseType.write writeVar = read(j);
            this.onPrepare.read(11, new typeId.RemoteActionCompatParcelizer() { // from class: o.FloatNode
                @Override // o.typeId.RemoteActionCompatParcelizer
                public final void RemoteActionCompatParcelizer(Object obj) {
                    isUnsafeBaseType.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = (isUnsafeBaseType.AudioAttributesCompatParcelizer) obj;
                    audioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(writeVarAudioAttributesCompatParcelizer, writeVar, i2);
                }
            });
        }
        if (zBooleanValue) {
            this.onPrepare.read(1, new typeId.RemoteActionCompatParcelizer() { // from class: o.bytesToNode
                @Override // o.typeId.RemoteActionCompatParcelizer
                public final void RemoteActionCompatParcelizer(Object obj) {
                    ((isUnsafeBaseType.AudioAttributesCompatParcelizer) obj).RemoteActionCompatParcelizer(jsonSerializableSchema, iIntValue);
                }
            });
        }
        if (buildenumsetserializer2.AudioAttributesImplApi26Parcelizer != buildenumsetserializer.AudioAttributesImplApi26Parcelizer) {
            this.onPrepare.read(10, new typeId.RemoteActionCompatParcelizer() { // from class: o.InternalNodeMapper
                @Override // o.typeId.RemoteActionCompatParcelizer
                public final void RemoteActionCompatParcelizer(Object obj) {
                    ((isUnsafeBaseType.AudioAttributesCompatParcelizer) obj).write(buildenumsetserializer.AudioAttributesImplApi26Parcelizer);
                }
            });
            if (buildenumsetserializer.AudioAttributesImplApi26Parcelizer != null) {
                this.onPrepare.read(10, new typeId.RemoteActionCompatParcelizer() { // from class: o._wrapper
                    @Override // o.typeId.RemoteActionCompatParcelizer
                    public final void RemoteActionCompatParcelizer(Object obj) {
                        ((isUnsafeBaseType.AudioAttributesCompatParcelizer) obj).IconCompatParcelizer(buildenumsetserializer.AudioAttributesImplApi26Parcelizer);
                    }
                });
            }
        }
        if (buildenumsetserializer2.onCommand != buildenumsetserializer.onCommand) {
            Object obj = buildenumsetserializer.onCommand.AudioAttributesCompatParcelizer;
            this.onPrepare.read(2, new typeId.RemoteActionCompatParcelizer() { // from class: o.IntNode
                @Override // o.typeId.RemoteActionCompatParcelizer
                public final void RemoteActionCompatParcelizer(Object obj2) {
                    ((isUnsafeBaseType.AudioAttributesCompatParcelizer) obj2).RemoteActionCompatParcelizer(buildenumsetserializer.onCommand.IconCompatParcelizer);
                }
            });
        }
        if (!zEquals2) {
            final getSchema getschema = this.onSeekTo;
            this.onPrepare.read(14, new typeId.RemoteActionCompatParcelizer() { // from class: o.BaseJsonNode1
                @Override // o.typeId.RemoteActionCompatParcelizer
                public final void RemoteActionCompatParcelizer(Object obj2) {
                    ((isUnsafeBaseType.AudioAttributesCompatParcelizer) obj2).AudioAttributesCompatParcelizer(getschema);
                }
            });
        }
        if (z5) {
            this.onPrepare.read(3, new typeId.RemoteActionCompatParcelizer() { // from class: o.DecimalNode
                @Override // o.typeId.RemoteActionCompatParcelizer
                public final void RemoteActionCompatParcelizer(Object obj2) {
                    BinaryNode.RemoteActionCompatParcelizer(buildenumsetserializer, (isUnsafeBaseType.AudioAttributesCompatParcelizer) obj2);
                }
            });
        }
        if (z4 || z3) {
            this.onPrepare.read(-1, new typeId.RemoteActionCompatParcelizer() { // from class: o._serializeNonRecursive
                @Override // o.typeId.RemoteActionCompatParcelizer
                public final void RemoteActionCompatParcelizer(Object obj2) {
                    buildEnumSetSerializer buildenumsetserializer3 = buildenumsetserializer;
                    ((isUnsafeBaseType.AudioAttributesCompatParcelizer) obj2).write(buildenumsetserializer3.MediaBrowserCompatCustomActionResultReceiver, buildenumsetserializer3.MediaBrowserCompatItemReceiver);
                }
            });
        }
        if (z4) {
            this.onPrepare.read(4, new typeId.RemoteActionCompatParcelizer() { // from class: o.InternalNodeMapperIteratorStack
                @Override // o.typeId.RemoteActionCompatParcelizer
                public final void RemoteActionCompatParcelizer(Object obj2) {
                    ((isUnsafeBaseType.AudioAttributesCompatParcelizer) obj2).RemoteActionCompatParcelizer(buildenumsetserializer.MediaBrowserCompatItemReceiver);
                }
            });
        }
        if (z3 || buildenumsetserializer2.AudioAttributesImplBaseParcelizer != buildenumsetserializer.AudioAttributesImplBaseParcelizer) {
            this.onPrepare.read(5, new typeId.RemoteActionCompatParcelizer() { // from class: o.BigIntegerNode
                @Override // o.typeId.RemoteActionCompatParcelizer
                public final void RemoteActionCompatParcelizer(Object obj2) {
                    buildEnumSetSerializer buildenumsetserializer3 = buildenumsetserializer;
                    ((isUnsafeBaseType.AudioAttributesCompatParcelizer) obj2).RemoteActionCompatParcelizer(buildenumsetserializer3.MediaBrowserCompatCustomActionResultReceiver, buildenumsetserializer3.AudioAttributesImplBaseParcelizer);
                }
            });
        }
        if (buildenumsetserializer2.MediaBrowserCompatSearchResultReceiver != buildenumsetserializer.MediaBrowserCompatSearchResultReceiver) {
            this.onPrepare.read(6, new typeId.RemoteActionCompatParcelizer() { // from class: o.nullNode
                @Override // o.typeId.RemoteActionCompatParcelizer
                public final void RemoteActionCompatParcelizer(Object obj2) {
                    ((isUnsafeBaseType.AudioAttributesCompatParcelizer) obj2).IconCompatParcelizer(buildenumsetserializer.MediaBrowserCompatSearchResultReceiver);
                }
            });
        }
        if (buildenumsetserializer2.IconCompatParcelizer() != buildenumsetserializer.IconCompatParcelizer()) {
            this.onPrepare.read(7, new typeId.RemoteActionCompatParcelizer() { // from class: o.objectNode
                @Override // o.typeId.RemoteActionCompatParcelizer
                public final void RemoteActionCompatParcelizer(Object obj2) {
                    ((isUnsafeBaseType.AudioAttributesCompatParcelizer) obj2).AudioAttributesCompatParcelizer(buildenumsetserializer.IconCompatParcelizer());
                }
            });
        }
        if (!buildenumsetserializer2.AudioAttributesImplApi21Parcelizer.equals(buildenumsetserializer.AudioAttributesImplApi21Parcelizer)) {
            this.onPrepare.read(12, new typeId.RemoteActionCompatParcelizer() { // from class: o.textNode
                @Override // o.typeId.RemoteActionCompatParcelizer
                public final void RemoteActionCompatParcelizer(Object obj2) {
                    ((isUnsafeBaseType.AudioAttributesCompatParcelizer) obj2).RemoteActionCompatParcelizer(buildenumsetserializer.AudioAttributesImplApi21Parcelizer);
                }
            });
        }
        r8lambdaKUbBm7ckfqTc9QCgukC86fguu4();
        this.onPrepare.AudioAttributesCompatParcelizer();
        if (buildenumsetserializer2.MediaBrowserCompatMediaItem != buildenumsetserializer.MediaBrowserCompatMediaItem) {
            for (ExoPlayer.RemoteActionCompatParcelizer remoteActionCompatParcelizer : this.MediaMetadataCompat) {
                boolean z6 = buildenumsetserializer.MediaBrowserCompatMediaItem;
                remoteActionCompatParcelizer.AudioAttributesCompatParcelizer();
            }
        }
    }

    static /* synthetic */ void RemoteActionCompatParcelizer(buildEnumSetSerializer buildenumsetserializer, isUnsafeBaseType.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
        boolean z = buildenumsetserializer.write;
        audioAttributesCompatParcelizer.IconCompatParcelizer(buildenumsetserializer.write);
    }

    private isUnsafeBaseType.write AudioAttributesCompatParcelizer(int i, buildEnumSetSerializer buildenumsetserializer, int i2) {
        int i3;
        Object obj;
        JsonSerializableSchema jsonSerializableSchema;
        Object obj2;
        int i4;
        long jIconCompatParcelizer;
        long jIconCompatParcelizer2;
        PolymorphicTypeValidator.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = new PolymorphicTypeValidator.AudioAttributesCompatParcelizer();
        if (buildenumsetserializer.onAddQueueItem.RemoteActionCompatParcelizer()) {
            i3 = i2;
            obj = null;
            jsonSerializableSchema = null;
            obj2 = null;
            i4 = -1;
        } else {
            Object obj3 = buildenumsetserializer.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer;
            buildenumsetserializer.onAddQueueItem.RemoteActionCompatParcelizer(obj3, audioAttributesCompatParcelizer);
            int i5 = audioAttributesCompatParcelizer.AudioAttributesImplBaseParcelizer;
            int i6 = buildenumsetserializer.onAddQueueItem.read(obj3);
            Object obj4 = buildenumsetserializer.onAddQueueItem.RemoteActionCompatParcelizer(i5, this.IconCompatParcelizer).MediaBrowserCompatSearchResultReceiver;
            jsonSerializableSchema = this.IconCompatParcelizer.AudioAttributesImplApi26Parcelizer;
            obj2 = obj3;
            i4 = i6;
            obj = obj4;
            i3 = i5;
        }
        if (i == 0) {
            if (buildenumsetserializer.RemoteActionCompatParcelizer.IconCompatParcelizer()) {
                jIconCompatParcelizer = audioAttributesCompatParcelizer.RemoteActionCompatParcelizer(buildenumsetserializer.RemoteActionCompatParcelizer.write, buildenumsetserializer.RemoteActionCompatParcelizer.read);
                jIconCompatParcelizer2 = IconCompatParcelizer(buildenumsetserializer);
            } else {
                if (buildenumsetserializer.RemoteActionCompatParcelizer.IconCompatParcelizer != -1) {
                    jIconCompatParcelizer = IconCompatParcelizer(this.onSkipToQueueItem);
                } else {
                    jIconCompatParcelizer = audioAttributesCompatParcelizer.AudioAttributesCompatParcelizer + audioAttributesCompatParcelizer.read;
                }
                jIconCompatParcelizer2 = jIconCompatParcelizer;
            }
        } else if (buildenumsetserializer.RemoteActionCompatParcelizer.IconCompatParcelizer()) {
            jIconCompatParcelizer = buildenumsetserializer.RatingCompat;
            jIconCompatParcelizer2 = IconCompatParcelizer(buildenumsetserializer);
        } else {
            jIconCompatParcelizer = audioAttributesCompatParcelizer.AudioAttributesCompatParcelizer + buildenumsetserializer.RatingCompat;
            jIconCompatParcelizer2 = jIconCompatParcelizer;
        }
        return new isUnsafeBaseType.write(obj, i3, jsonSerializableSchema, obj2, i4, LaissezFaireSubTypeValidator.AudioAttributesCompatParcelizer(jIconCompatParcelizer), LaissezFaireSubTypeValidator.AudioAttributesCompatParcelizer(jIconCompatParcelizer2), buildenumsetserializer.RemoteActionCompatParcelizer.write, buildenumsetserializer.RemoteActionCompatParcelizer.read);
    }

    private isUnsafeBaseType.write read(long j) {
        JsonSerializableSchema jsonSerializableSchema;
        Object obj;
        int i;
        Object obj2;
        int iOnMediaButtonEvent = onMediaButtonEvent();
        if (this.onSkipToQueueItem.onAddQueueItem.RemoteActionCompatParcelizer()) {
            jsonSerializableSchema = null;
            obj = null;
            i = -1;
            obj2 = null;
        } else {
            Object obj3 = this.onSkipToQueueItem.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer;
            this.onSkipToQueueItem.onAddQueueItem.RemoteActionCompatParcelizer(obj3, this.setSessionImpl);
            i = this.onSkipToQueueItem.onAddQueueItem.read(obj3);
            obj2 = this.onSkipToQueueItem.onAddQueueItem.RemoteActionCompatParcelizer(iOnMediaButtonEvent, this.IconCompatParcelizer).MediaBrowserCompatSearchResultReceiver;
            jsonSerializableSchema = this.IconCompatParcelizer.AudioAttributesImplApi26Parcelizer;
            obj = obj3;
        }
        long jAudioAttributesCompatParcelizer = LaissezFaireSubTypeValidator.AudioAttributesCompatParcelizer(j);
        return new isUnsafeBaseType.write(obj2, iOnMediaButtonEvent, jsonSerializableSchema, obj, i, jAudioAttributesCompatParcelizer, this.onSkipToQueueItem.RemoteActionCompatParcelizer.IconCompatParcelizer() ? LaissezFaireSubTypeValidator.AudioAttributesCompatParcelizer(IconCompatParcelizer(this.onSkipToQueueItem)) : jAudioAttributesCompatParcelizer, this.onSkipToQueueItem.RemoteActionCompatParcelizer.write, this.onSkipToQueueItem.RemoteActionCompatParcelizer.read);
    }

    private static long IconCompatParcelizer(buildEnumSetSerializer buildenumsetserializer) {
        PolymorphicTypeValidator.IconCompatParcelizer iconCompatParcelizer = new PolymorphicTypeValidator.IconCompatParcelizer();
        PolymorphicTypeValidator.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = new PolymorphicTypeValidator.AudioAttributesCompatParcelizer();
        buildenumsetserializer.onAddQueueItem.RemoteActionCompatParcelizer(buildenumsetserializer.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer, audioAttributesCompatParcelizer);
        if (buildenumsetserializer.MediaMetadataCompat == C.TIME_UNSET) {
            return buildenumsetserializer.onAddQueueItem.RemoteActionCompatParcelizer(audioAttributesCompatParcelizer.AudioAttributesImplBaseParcelizer, iconCompatParcelizer).IconCompatParcelizer();
        }
        return audioAttributesCompatParcelizer.IconCompatParcelizer() + buildenumsetserializer.MediaMetadataCompat;
    }

    private Pair<Boolean, Integer> IconCompatParcelizer(buildEnumSetSerializer buildenumsetserializer, buildEnumSetSerializer buildenumsetserializer2, boolean z, int i, boolean z2, boolean z3) {
        PolymorphicTypeValidator polymorphicTypeValidator = buildenumsetserializer2.onAddQueueItem;
        PolymorphicTypeValidator polymorphicTypeValidator2 = buildenumsetserializer.onAddQueueItem;
        boolean zRemoteActionCompatParcelizer = polymorphicTypeValidator2.RemoteActionCompatParcelizer();
        Boolean bool = Boolean.FALSE;
        if (zRemoteActionCompatParcelizer && polymorphicTypeValidator.RemoteActionCompatParcelizer()) {
            return new Pair<>(bool, -1);
        }
        int i2 = 3;
        if (polymorphicTypeValidator2.RemoteActionCompatParcelizer() != polymorphicTypeValidator.RemoteActionCompatParcelizer()) {
            return new Pair<>(Boolean.TRUE, 3);
        }
        if (polymorphicTypeValidator.RemoteActionCompatParcelizer(polymorphicTypeValidator.RemoteActionCompatParcelizer(buildenumsetserializer2.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer, this.setSessionImpl).AudioAttributesImplBaseParcelizer, this.IconCompatParcelizer).MediaBrowserCompatSearchResultReceiver.equals(polymorphicTypeValidator2.RemoteActionCompatParcelizer(polymorphicTypeValidator2.RemoteActionCompatParcelizer(buildenumsetserializer.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer, this.setSessionImpl).AudioAttributesImplBaseParcelizer, this.IconCompatParcelizer).MediaBrowserCompatSearchResultReceiver)) {
            if (z && i == 0 && buildenumsetserializer2.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer < buildenumsetserializer.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer) {
                return new Pair<>(Boolean.TRUE, 0);
            }
            if (z && i == 1 && z3) {
                return new Pair<>(Boolean.TRUE, 2);
            }
            return new Pair<>(bool, -1);
        }
        if (z && i == 0) {
            i2 = 1;
        } else if (z && i == 1) {
            i2 = 2;
        } else if (!z2) {
            throw new IllegalStateException();
        }
        return new Pair<>(Boolean.TRUE, Integer.valueOf(i2));
    }

    private void r8lambdaKUbBm7ckfqTc9QCgukC86fguu4() {
        isUnsafeBaseType.read readVar = this.MediaBrowserCompatMediaItem;
        isUnsafeBaseType.read readVar2 = LaissezFaireSubTypeValidator.read(this.getDefaultViewModelCreationExtras, this.AudioAttributesCompatParcelizer);
        this.MediaBrowserCompatMediaItem = readVar2;
        if (readVar2.equals(readVar)) {
            return;
        }
        this.onPrepare.read(13, new typeId.RemoteActionCompatParcelizer() { // from class: o.DoubleNode
            @Override // o.typeId.RemoteActionCompatParcelizer
            public final void RemoteActionCompatParcelizer(Object obj) {
                this.read.IconCompatParcelizer((isUnsafeBaseType.AudioAttributesCompatParcelizer) obj);
            }
        });
    }

    final /* synthetic */ void IconCompatParcelizer(isUnsafeBaseType.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
        audioAttributesCompatParcelizer.RemoteActionCompatParcelizer(this.MediaBrowserCompatMediaItem);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void write(java.util.List<kotlin.StdKeySerializers> r15, int r16, long r17, boolean r19) {
        /*
            r14 = this;
            r0 = r14
            r1 = r16
            o.buildEnumSetSerializer r2 = r0.onSkipToQueueItem
            int r2 = r14.AudioAttributesCompatParcelizer(r2)
            long r3 = r14.onPlayFromUri()
            int r5 = r0.onStop
            r6 = 1
            int r5 = r5 + r6
            r0.onStop = r5
            java.util.List<o.BinaryNode$IconCompatParcelizer> r5 = r0.onSetRating
            boolean r5 = r5.isEmpty()
            r7 = 0
            if (r5 != 0) goto L25
            java.util.List<o.BinaryNode$IconCompatParcelizer> r5 = r0.onSetRating
            int r5 = r5.size()
            r14.IconCompatParcelizer(r7, r5)
        L25:
            r5 = r15
            java.util.List r9 = r14.RemoteActionCompatParcelizer(r7, r15)
            o.PolymorphicTypeValidator r5 = r14.MediaSessionCompatResultReceiverWrapper()
            boolean r8 = r5.RemoteActionCompatParcelizer()
            if (r8 != 0) goto L43
            int r8 = r5.AudioAttributesCompatParcelizer()
            if (r1 >= r8) goto L3b
            goto L43
        L3b:
            o.JsonSchema r0 = new o.JsonSchema
            r10 = r17
            r0.<init>(r5, r1, r10)
            throw r0
        L43:
            r10 = r17
            r8 = -1
            if (r19 == 0) goto L55
            boolean r1 = r0.r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8
            int r1 = r5.RemoteActionCompatParcelizer(r1)
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r10 = r2
            goto L59
        L55:
            if (r1 != r8) goto L59
            r10 = r2
            goto L5b
        L59:
            r3 = r10
            r10 = r1
        L5b:
            o.buildEnumSetSerializer r1 = r0.onSkipToQueueItem
            android.util.Pair r2 = r14.AudioAttributesCompatParcelizer(r5, r10, r3)
            o.buildEnumSetSerializer r1 = r14.RemoteActionCompatParcelizer(r1, r5, r2)
            int r2 = r1.MediaBrowserCompatItemReceiver
            if (r10 == r8) goto L7c
            int r8 = r1.MediaBrowserCompatItemReceiver
            if (r8 == r6) goto L7c
            boolean r2 = r5.RemoteActionCompatParcelizer()
            if (r2 != 0) goto L7b
            int r2 = r5.AudioAttributesCompatParcelizer()
            if (r10 >= r2) goto L7b
            r2 = 2
            goto L7c
        L7b:
            r2 = 4
        L7c:
            o.buildEnumSetSerializer r1 = r1.read(r2)
            o.LongNode r8 = r0.onPrepareFromSearch
            long r11 = kotlin.LaissezFaireSubTypeValidator.IconCompatParcelizer(r3)
            o.ToStringSerializerBase r13 = r0.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28
            r8.IconCompatParcelizer(r9, r10, r11, r13)
            o.buildEnumSetSerializer r2 = r0.onSkipToQueueItem
            o.StdKeySerializers$write r2 = r2.RemoteActionCompatParcelizer
            java.lang.Object r2 = r2.AudioAttributesCompatParcelizer
            o.StdKeySerializers$write r3 = r1.RemoteActionCompatParcelizer
            java.lang.Object r3 = r3.AudioAttributesCompatParcelizer
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto La7
            o.buildEnumSetSerializer r2 = r0.onSkipToQueueItem
            o.PolymorphicTypeValidator r2 = r2.onAddQueueItem
            boolean r2 = r2.RemoteActionCompatParcelizer()
            if (r2 != 0) goto La7
            r3 = r6
            goto La8
        La7:
            r3 = r7
        La8:
            long r5 = r14.RemoteActionCompatParcelizer(r1)
            r2 = 0
            r4 = 4
            r7 = -1
            r8 = 0
            r0 = r14
            r0.IconCompatParcelizer(r1, r2, r3, r4, r5, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.BinaryNode.write(java.util.List, int, long, boolean):void");
    }

    private List<BasicSerializerFactory.AudioAttributesCompatParcelizer> RemoteActionCompatParcelizer(int i, List<StdKeySerializers> list) {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            BasicSerializerFactory.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = new BasicSerializerFactory.AudioAttributesCompatParcelizer(list.get(i2), this.addObserverForBackInvoker);
            arrayList.add(audioAttributesCompatParcelizer);
            this.onSetRating.add(i2 + i, new IconCompatParcelizer(audioAttributesCompatParcelizer.write, audioAttributesCompatParcelizer.AudioAttributesCompatParcelizer));
        }
        this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28.RemoteActionCompatParcelizer(i, arrayList.size());
        return arrayList;
    }

    private buildEnumSetSerializer read(buildEnumSetSerializer buildenumsetserializer, int i, List<StdKeySerializers> list) {
        PolymorphicTypeValidator polymorphicTypeValidator = buildenumsetserializer.onAddQueueItem;
        this.onStop++;
        List<BasicSerializerFactory.AudioAttributesCompatParcelizer> listRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(i, list);
        PolymorphicTypeValidator polymorphicTypeValidatorMediaSessionCompatResultReceiverWrapper = MediaSessionCompatResultReceiverWrapper();
        buildEnumSetSerializer buildenumsetserializerRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(buildenumsetserializer, polymorphicTypeValidatorMediaSessionCompatResultReceiverWrapper, RemoteActionCompatParcelizer(polymorphicTypeValidator, polymorphicTypeValidatorMediaSessionCompatResultReceiverWrapper, AudioAttributesCompatParcelizer(buildenumsetserializer), write(buildenumsetserializer)));
        this.onPrepareFromSearch.RemoteActionCompatParcelizer(i, listRemoteActionCompatParcelizer, this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28);
        return buildenumsetserializerRemoteActionCompatParcelizer;
    }

    private buildEnumSetSerializer AudioAttributesCompatParcelizer(buildEnumSetSerializer buildenumsetserializer, int i, int i2) {
        int iAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(buildenumsetserializer);
        long jWrite = write(buildenumsetserializer);
        PolymorphicTypeValidator polymorphicTypeValidator = buildenumsetserializer.onAddQueueItem;
        int size = this.onSetRating.size();
        this.onStop++;
        IconCompatParcelizer(i, i2);
        PolymorphicTypeValidator polymorphicTypeValidatorMediaSessionCompatResultReceiverWrapper = MediaSessionCompatResultReceiverWrapper();
        buildEnumSetSerializer buildenumsetserializerRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(buildenumsetserializer, polymorphicTypeValidatorMediaSessionCompatResultReceiverWrapper, RemoteActionCompatParcelizer(polymorphicTypeValidator, polymorphicTypeValidatorMediaSessionCompatResultReceiverWrapper, iAudioAttributesCompatParcelizer, jWrite));
        if (buildenumsetserializerRemoteActionCompatParcelizer.MediaBrowserCompatItemReceiver != 1 && buildenumsetserializerRemoteActionCompatParcelizer.MediaBrowserCompatItemReceiver != 4 && i < i2 && i2 == size && iAudioAttributesCompatParcelizer >= buildenumsetserializerRemoteActionCompatParcelizer.onAddQueueItem.AudioAttributesCompatParcelizer()) {
            buildenumsetserializerRemoteActionCompatParcelizer = buildenumsetserializerRemoteActionCompatParcelizer.read(4);
        }
        this.onPrepareFromSearch.AudioAttributesCompatParcelizer(i, i2, this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28);
        return buildenumsetserializerRemoteActionCompatParcelizer;
    }

    private void IconCompatParcelizer(int i, int i2) {
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            this.onSetRating.remove(i3);
        }
        this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28.write(i, i2);
    }

    private PolymorphicTypeValidator MediaSessionCompatResultReceiverWrapper() {
        return new buildMapSerializer(this.onSetRating, this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28);
    }

    private buildEnumSetSerializer RemoteActionCompatParcelizer(buildEnumSetSerializer buildenumsetserializer, PolymorphicTypeValidator polymorphicTypeValidator, Pair<Object, Long> pair) {
        long jRemoteActionCompatParcelizer;
        buildTypeSerializer.IconCompatParcelizer(polymorphicTypeValidator.RemoteActionCompatParcelizer() || pair != null);
        PolymorphicTypeValidator polymorphicTypeValidator2 = buildenumsetserializer.onAddQueueItem;
        long jWrite = write(buildenumsetserializer);
        buildEnumSetSerializer buildenumsetserializerRemoteActionCompatParcelizer = buildenumsetserializer.RemoteActionCompatParcelizer(polymorphicTypeValidator);
        if (polymorphicTypeValidator.RemoteActionCompatParcelizer()) {
            StdKeySerializers.write writeVar = buildEnumSetSerializer.read();
            long jIconCompatParcelizer = LaissezFaireSubTypeValidator.IconCompatParcelizer(this.onRemoveQueueItemAt);
            buildEnumSetSerializer buildenumsetserializerRemoteActionCompatParcelizer2 = buildenumsetserializerRemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(writeVar, jIconCompatParcelizer, jIconCompatParcelizer, jIconCompatParcelizer, 0L, _writeAsBinary.read, this.read, initExtraTracks.AudioAttributesImplApi26Parcelizer()).RemoteActionCompatParcelizer(writeVar);
            buildenumsetserializerRemoteActionCompatParcelizer2.IconCompatParcelizer = buildenumsetserializerRemoteActionCompatParcelizer2.RatingCompat;
            return buildenumsetserializerRemoteActionCompatParcelizer2;
        }
        Object obj = buildenumsetserializerRemoteActionCompatParcelizer.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer;
        boolean zEquals = obj.equals(((Pair) LaissezFaireSubTypeValidator.IconCompatParcelizer(pair)).first);
        StdKeySerializers.write writeVar2 = !zEquals ? new StdKeySerializers.write(pair.first) : buildenumsetserializerRemoteActionCompatParcelizer.RemoteActionCompatParcelizer;
        long jLongValue = ((Long) pair.second).longValue();
        long jIconCompatParcelizer2 = LaissezFaireSubTypeValidator.IconCompatParcelizer(jWrite);
        if (!polymorphicTypeValidator2.RemoteActionCompatParcelizer()) {
            jIconCompatParcelizer2 -= polymorphicTypeValidator2.RemoteActionCompatParcelizer(obj, this.setSessionImpl).IconCompatParcelizer();
        }
        if (!zEquals || jLongValue < jIconCompatParcelizer2) {
            buildTypeSerializer.write(!writeVar2.IconCompatParcelizer());
            buildEnumSetSerializer buildenumsetserializerRemoteActionCompatParcelizer3 = buildenumsetserializerRemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(writeVar2, jLongValue, jLongValue, jLongValue, 0L, !zEquals ? _writeAsBinary.read : buildenumsetserializerRemoteActionCompatParcelizer.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, !zEquals ? this.read : buildenumsetserializerRemoteActionCompatParcelizer.onCommand, !zEquals ? initExtraTracks.AudioAttributesImplApi26Parcelizer() : buildenumsetserializerRemoteActionCompatParcelizer.MediaDescriptionCompat).RemoteActionCompatParcelizer(writeVar2);
            buildenumsetserializerRemoteActionCompatParcelizer3.IconCompatParcelizer = jLongValue;
            return buildenumsetserializerRemoteActionCompatParcelizer3;
        }
        if (jLongValue == jIconCompatParcelizer2) {
            int i = polymorphicTypeValidator.read(buildenumsetserializerRemoteActionCompatParcelizer.read.AudioAttributesCompatParcelizer);
            if (i != -1 && polymorphicTypeValidator.AudioAttributesCompatParcelizer(i, this.setSessionImpl).AudioAttributesImplBaseParcelizer == polymorphicTypeValidator.RemoteActionCompatParcelizer(writeVar2.AudioAttributesCompatParcelizer, this.setSessionImpl).AudioAttributesImplBaseParcelizer) {
                return buildenumsetserializerRemoteActionCompatParcelizer;
            }
            polymorphicTypeValidator.RemoteActionCompatParcelizer(writeVar2.AudioAttributesCompatParcelizer, this.setSessionImpl);
            if (writeVar2.IconCompatParcelizer()) {
                jRemoteActionCompatParcelizer = this.setSessionImpl.RemoteActionCompatParcelizer(writeVar2.write, writeVar2.read);
            } else {
                jRemoteActionCompatParcelizer = this.setSessionImpl.read;
            }
            buildEnumSetSerializer buildenumsetserializerRemoteActionCompatParcelizer4 = buildenumsetserializerRemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(writeVar2, buildenumsetserializerRemoteActionCompatParcelizer.RatingCompat, buildenumsetserializerRemoteActionCompatParcelizer.RatingCompat, buildenumsetserializerRemoteActionCompatParcelizer.AudioAttributesCompatParcelizer, jRemoteActionCompatParcelizer - buildenumsetserializerRemoteActionCompatParcelizer.RatingCompat, buildenumsetserializerRemoteActionCompatParcelizer.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, buildenumsetserializerRemoteActionCompatParcelizer.onCommand, buildenumsetserializerRemoteActionCompatParcelizer.MediaDescriptionCompat).RemoteActionCompatParcelizer(writeVar2);
            buildenumsetserializerRemoteActionCompatParcelizer4.IconCompatParcelizer = jRemoteActionCompatParcelizer;
            return buildenumsetserializerRemoteActionCompatParcelizer4;
        }
        buildTypeSerializer.write(!writeVar2.IconCompatParcelizer());
        long jMax = Math.max(0L, buildenumsetserializerRemoteActionCompatParcelizer.onCustomAction - (jLongValue - jIconCompatParcelizer2));
        long j = buildenumsetserializerRemoteActionCompatParcelizer.IconCompatParcelizer;
        if (buildenumsetserializerRemoteActionCompatParcelizer.read.equals(buildenumsetserializerRemoteActionCompatParcelizer.RemoteActionCompatParcelizer)) {
            j = jLongValue + jMax;
        }
        buildEnumSetSerializer buildenumsetserializerAudioAttributesCompatParcelizer = buildenumsetserializerRemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(writeVar2, jLongValue, jLongValue, jLongValue, jMax, buildenumsetserializerRemoteActionCompatParcelizer.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, buildenumsetserializerRemoteActionCompatParcelizer.onCommand, buildenumsetserializerRemoteActionCompatParcelizer.MediaDescriptionCompat);
        buildenumsetserializerAudioAttributesCompatParcelizer.IconCompatParcelizer = j;
        return buildenumsetserializerAudioAttributesCompatParcelizer;
    }

    private Pair<Object, Long> RemoteActionCompatParcelizer(PolymorphicTypeValidator polymorphicTypeValidator, PolymorphicTypeValidator polymorphicTypeValidator2, int i, long j) {
        boolean zRemoteActionCompatParcelizer = polymorphicTypeValidator.RemoteActionCompatParcelizer();
        long j2 = C.TIME_UNSET;
        if (zRemoteActionCompatParcelizer || polymorphicTypeValidator2.RemoteActionCompatParcelizer()) {
            boolean z = !polymorphicTypeValidator.RemoteActionCompatParcelizer() && polymorphicTypeValidator2.RemoteActionCompatParcelizer();
            int i2 = z ? -1 : i;
            if (!z) {
                j2 = j;
            }
            return AudioAttributesCompatParcelizer(polymorphicTypeValidator2, i2, j2);
        }
        Pair<Object, Long> pairAudioAttributesCompatParcelizer = polymorphicTypeValidator.AudioAttributesCompatParcelizer(this.IconCompatParcelizer, this.setSessionImpl, i, LaissezFaireSubTypeValidator.IconCompatParcelizer(j));
        Object obj = ((Pair) LaissezFaireSubTypeValidator.IconCompatParcelizer(pairAudioAttributesCompatParcelizer)).first;
        if (polymorphicTypeValidator2.read(obj) != -1) {
            return pairAudioAttributesCompatParcelizer;
        }
        int i3 = LongNode.read(this.IconCompatParcelizer, this.setSessionImpl, this.r8lambdaKUbBm7ckfqTc9QCgukC86fguu4, this.r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8, obj, polymorphicTypeValidator, polymorphicTypeValidator2);
        if (i3 != -1) {
            return AudioAttributesCompatParcelizer(polymorphicTypeValidator2, i3, polymorphicTypeValidator2.RemoteActionCompatParcelizer(i3, this.IconCompatParcelizer).RemoteActionCompatParcelizer());
        }
        return AudioAttributesCompatParcelizer(polymorphicTypeValidator2, -1, C.TIME_UNSET);
    }

    private Pair<Object, Long> AudioAttributesCompatParcelizer(PolymorphicTypeValidator polymorphicTypeValidator, int i, long j) {
        if (polymorphicTypeValidator.RemoteActionCompatParcelizer()) {
            this.onRemoveQueueItem = i;
            if (j == C.TIME_UNSET) {
                j = 0;
            }
            this.onRemoveQueueItemAt = j;
            this.onPrepareFromUri = 0;
            return null;
        }
        if (i == -1 || i >= polymorphicTypeValidator.AudioAttributesCompatParcelizer()) {
            i = polymorphicTypeValidator.RemoteActionCompatParcelizer(this.r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8);
            j = polymorphicTypeValidator.RemoteActionCompatParcelizer(i, this.IconCompatParcelizer).RemoteActionCompatParcelizer();
        }
        return polymorphicTypeValidator.AudioAttributesCompatParcelizer(this.IconCompatParcelizer, this.setSessionImpl, i, LaissezFaireSubTypeValidator.IconCompatParcelizer(j));
    }

    private long RemoteActionCompatParcelizer(PolymorphicTypeValidator polymorphicTypeValidator, StdKeySerializers.write writeVar, long j) {
        polymorphicTypeValidator.RemoteActionCompatParcelizer(writeVar.AudioAttributesCompatParcelizer, this.setSessionImpl);
        return j + this.setSessionImpl.IconCompatParcelizer();
    }

    private buildMapEntrySerializer write(buildMapEntrySerializer.write writeVar) {
        int iAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(this.onSkipToQueueItem);
        LongNode longNode = this.onPrepareFromSearch;
        PolymorphicTypeValidator polymorphicTypeValidator = this.onSkipToQueueItem.onAddQueueItem;
        if (iAudioAttributesCompatParcelizer == -1) {
            iAudioAttributesCompatParcelizer = 0;
        }
        return new buildMapEntrySerializer(longNode, writeVar, polymorphicTypeValidator, iAudioAttributesCompatParcelizer, this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, this.onPrepareFromSearch.RemoteActionCompatParcelizer());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public getSchema MediaSessionCompatToken() {
        PolymorphicTypeValidator polymorphicTypeValidatorOnPrepare = onPrepare();
        if (polymorphicTypeValidatorOnPrepare.RemoteActionCompatParcelizer()) {
            return this._init_lambda5;
        }
        return this._init_lambda5.IconCompatParcelizer().read(polymorphicTypeValidatorOnPrepare.RemoteActionCompatParcelizer(onMediaButtonEvent(), this.IconCompatParcelizer).AudioAttributesImplApi26Parcelizer.AudioAttributesImplApi21Parcelizer).read();
    }

    private void PlaybackStateCompat() {
        if (this._init_lambda3 != null) {
            write((buildMapEntrySerializer.write) this.onFastForward).RemoteActionCompatParcelizer(10000).AudioAttributesCompatParcelizer((Object) null).AudioAttributesImplApi21Parcelizer();
            this._init_lambda3.RemoteActionCompatParcelizer(this.handleMediaPlayPauseIfPendingOnHandler);
            this._init_lambda3 = null;
        }
        TextureView textureView = this.accessonBackPresseds1027565324;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() != this.handleMediaPlayPauseIfPendingOnHandler) {
                prune.RemoteActionCompatParcelizer("ExoPlayerImpl", "SurfaceTextureListener already unset or replaced.");
            } else {
                this.accessonBackPresseds1027565324.setSurfaceTextureListener(null);
            }
            this.accessonBackPresseds1027565324 = null;
        }
        SurfaceHolder surfaceHolder = this.accessensureViewModelStore;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(this.handleMediaPlayPauseIfPendingOnHandler);
            this.accessensureViewModelStore = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void RemoteActionCompatParcelizer(SurfaceTexture surfaceTexture) {
        Surface surface = new Surface(surfaceTexture);
        AudioAttributesCompatParcelizer(surface);
        this.onSetCaptioningEnabled = surface;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void AudioAttributesCompatParcelizer(Object obj) {
        ArrayList arrayList = new ArrayList();
        boolean z = false;
        for (buildIndexedListSerializer buildindexedlistserializer : this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM) {
            if (buildindexedlistserializer.MediaBrowserCompatMediaItem() == 2) {
                arrayList.add(write((buildMapEntrySerializer.write) buildindexedlistserializer).RemoteActionCompatParcelizer(1).AudioAttributesCompatParcelizer(obj).AudioAttributesImplApi21Parcelizer());
            }
        }
        Object obj2 = this.getSavedStateRegistryControllerannotations;
        if (obj2 != null && obj2 != obj) {
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((buildMapEntrySerializer) it.next()).AudioAttributesCompatParcelizer(this.onMediaButtonEvent);
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (TimeoutException unused2) {
                z = true;
            }
            Object obj3 = this.getSavedStateRegistryControllerannotations;
            Surface surface = this.onSetCaptioningEnabled;
            if (obj3 == surface) {
                surface.release();
                this.onSetCaptioningEnabled = null;
            }
        }
        this.getSavedStateRegistryControllerannotations = obj;
        if (z) {
            RemoteActionCompatParcelizer(addNull.RemoteActionCompatParcelizer(new _read(3), 1003));
        }
    }

    private void write(SurfaceHolder surfaceHolder) {
        this.accessgetReportFullyDrawnExecutorp = false;
        this.accessensureViewModelStore = surfaceHolder;
        surfaceHolder.addCallback(this.handleMediaPlayPauseIfPendingOnHandler);
        Surface surface = this.accessensureViewModelStore.getSurface();
        if (surface != null && surface.isValid()) {
            Rect surfaceFrame = this.accessensureViewModelStore.getSurfaceFrame();
            AudioAttributesCompatParcelizer(surfaceFrame.width(), surfaceFrame.height());
        } else {
            AudioAttributesCompatParcelizer(0, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void AudioAttributesCompatParcelizer(final int i, final int i2) {
        if (i == this.addObserverForBackInvokerlambda7.RemoteActionCompatParcelizer() && i2 == this.addObserverForBackInvokerlambda7.IconCompatParcelizer()) {
            return;
        }
        this.addObserverForBackInvokerlambda7 = new AsWrapperTypeSerializer(i, i2);
        this.onPrepare.write(24, new typeId.RemoteActionCompatParcelizer() { // from class: o.nodeToString
            @Override // o.typeId.RemoteActionCompatParcelizer
            public final void RemoteActionCompatParcelizer(Object obj) {
                ((isUnsafeBaseType.AudioAttributesCompatParcelizer) obj).RemoteActionCompatParcelizer(i, i2);
            }
        });
        IconCompatParcelizer(2, 14, new AsWrapperTypeSerializer(i, i2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ResultReceiver() {
        IconCompatParcelizer(1, 2, Float.valueOf(this.addOnMultiWindowModeChangedListener * this.MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void AudioAttributesCompatParcelizer(boolean z, int i, int i2) {
        boolean z2 = z && i != -1;
        int iIconCompatParcelizer = IconCompatParcelizer(z2, i);
        if (this.onSkipToQueueItem.MediaBrowserCompatCustomActionResultReceiver == z2 && this.onSkipToQueueItem.MediaBrowserCompatSearchResultReceiver == iIconCompatParcelizer && this.onSkipToQueueItem.AudioAttributesImplBaseParcelizer == i2) {
            return;
        }
        write(z2, i2, iIconCompatParcelizer);
    }

    private void write(boolean z, int i, int i2) {
        buildEnumSetSerializer buildenumsetserializerRemoteActionCompatParcelizer;
        this.onStop++;
        if (this.onSkipToQueueItem.MediaBrowserCompatMediaItem) {
            buildenumsetserializerRemoteActionCompatParcelizer = this.onSkipToQueueItem.RemoteActionCompatParcelizer();
        } else {
            buildenumsetserializerRemoteActionCompatParcelizer = this.onSkipToQueueItem;
        }
        buildEnumSetSerializer buildenumsetserializerAudioAttributesCompatParcelizer = buildenumsetserializerRemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(z, i, i2);
        this.onPrepareFromSearch.write(z, i, i2);
        IconCompatParcelizer(buildenumsetserializerAudioAttributesCompatParcelizer, 0, false, 5, C.TIME_UNSET, -1, false);
    }

    private int IconCompatParcelizer(boolean z, int i) {
        if (i == 0) {
            return 1;
        }
        if (!this.accessaddObserverForBackInvoker) {
            return 0;
        }
        if (!z || MediaSessionCompatQueueItem()) {
            return (z || this.onSkipToQueueItem.MediaBrowserCompatSearchResultReceiver != 3) ? 0 : 3;
        }
        return 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw() {
        int iOnRewind = onRewind();
        boolean z = false;
        if (iOnRewind != 1) {
            if (iOnRewind == 2 || iOnRewind == 3) {
                boolean zIsSleepingForOffload = isSleepingForOffload();
                findSerializerByAddonType findserializerbyaddontype = this.addOnContextAvailableListener;
                if (onPrepareFromUri() && !zIsSleepingForOffload) {
                    z = true;
                }
                findserializerbyaddontype.AudioAttributesCompatParcelizer(z);
                this.addOnNewIntentListener.IconCompatParcelizer(onPrepareFromUri());
                return;
            }
            if (iOnRewind != 4) {
                throw new IllegalStateException();
            }
        }
        this.addOnContextAvailableListener.AudioAttributesCompatParcelizer(false);
        this.addOnNewIntentListener.IconCompatParcelizer(false);
    }

    private void r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM() {
        this.onAddQueueItem.AudioAttributesCompatParcelizer();
        if (Thread.currentThread() != onCommand().getThread()) {
            String str = LaissezFaireSubTypeValidator.read("Player is accessed on the wrong thread.\nCurrent thread: '%s'\nExpected thread: '%s'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread", Thread.currentThread().getName(), onCommand().getThread().getName());
            if (this.ensureViewModelStore) {
                throw new IllegalStateException(str);
            }
            prune.write("ExoPlayerImpl", str, this.onPlayFromUri ? null : new IllegalStateException());
            this.onPlayFromUri = true;
        }
    }

    private void write(Object obj) {
        IconCompatParcelizer(-1, 16, obj);
    }

    private void IconCompatParcelizer(int i, int i2, Object obj) {
        for (buildIndexedListSerializer buildindexedlistserializer : this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM) {
            if (i == -1 || buildindexedlistserializer.MediaBrowserCompatMediaItem() == i) {
                write((buildMapEntrySerializer.write) buildindexedlistserializer).RemoteActionCompatParcelizer(i2).AudioAttributesCompatParcelizer(obj).AudioAttributesImplApi21Parcelizer();
            }
        }
    }

    private int RemoteActionCompatParcelizer(int i) {
        AudioTrack audioTrack = this.onPrepareFromMediaId;
        if (audioTrack != null && audioTrack.getAudioSessionId() != i) {
            this.onPrepareFromMediaId.release();
            this.onPrepareFromMediaId = null;
        }
        if (this.onPrepareFromMediaId == null) {
            this.onPrepareFromMediaId = new AudioTrack(3, 4000, 4, 2, 2, 0, i);
        }
        return this.onPrepareFromMediaId.getAudioSessionId();
    }

    private void RemoteActionCompatParcelizer(boolean z) {
        validateBaseType validatebasetype = this.ResultReceiver;
        if (validatebasetype != null) {
            if (z && !this.onPlayFromSearch) {
                validatebasetype.AudioAttributesCompatParcelizer(this.ParcelableVolumeInfo);
                this.onPlayFromSearch = true;
            } else {
                if (z || !this.onPlayFromSearch) {
                    return;
                }
                validatebasetype.RemoteActionCompatParcelizer(this.ParcelableVolumeInfo);
                this.onPlayFromSearch = false;
            }
        }
    }

    private boolean IconCompatParcelizer(int i, int i2, List<JsonSerializableSchema> list) {
        if (i2 - i != list.size()) {
            return false;
        }
        for (int i3 = i; i3 < i2; i3++) {
            if (!this.onSetRating.get(i3).RemoteActionCompatParcelizer.canUpdateMediaItem(list.get(i3 - i))) {
                return false;
            }
        }
        return true;
    }

    private void read(int i, int i2, List<JsonSerializableSchema> list) {
        this.onStop++;
        this.onPrepareFromSearch.read(i, i2, list);
        for (int i3 = i; i3 < i2; i3++) {
            IconCompatParcelizer iconCompatParcelizer = this.onSetRating.get(i3);
            iconCompatParcelizer.RemoteActionCompatParcelizer(new ArrayType(iconCompatParcelizer.IconCompatParcelizer(), list.get(i3 - i)));
        }
        IconCompatParcelizer(this.onSkipToQueueItem.RemoteActionCompatParcelizer(MediaSessionCompatResultReceiverWrapper()), 0, false, 4, C.TIME_UNSET, -1, false);
    }

    private static optionalProperty AudioAttributesCompatParcelizer(findConvertingSerializer findconvertingserializer) {
        return new optionalProperty.write().write(findconvertingserializer != null ? findconvertingserializer.AudioAttributesCompatParcelizer() : 0).RemoteActionCompatParcelizer(findconvertingserializer != null ? findconvertingserializer.write() : 0).RemoteActionCompatParcelizer();
    }

    static final class IconCompatParcelizer implements putObject {
        private PolymorphicTypeValidator AudioAttributesCompatParcelizer;
        private final Object IconCompatParcelizer;
        private final StdKeySerializers RemoteActionCompatParcelizer;

        public IconCompatParcelizer(Object obj, StdArraySerializersTypedPrimitiveArraySerializer stdArraySerializersTypedPrimitiveArraySerializer) {
            this.IconCompatParcelizer = obj;
            this.RemoteActionCompatParcelizer = stdArraySerializersTypedPrimitiveArraySerializer;
            this.AudioAttributesCompatParcelizer = stdArraySerializersTypedPrimitiveArraySerializer.AudioAttributesCompatParcelizer();
        }

        @Override // kotlin.putObject
        public final Object AudioAttributesCompatParcelizer() {
            return this.IconCompatParcelizer;
        }

        @Override // kotlin.putObject
        public final PolymorphicTypeValidator IconCompatParcelizer() {
            return this.AudioAttributesCompatParcelizer;
        }

        public final void RemoteActionCompatParcelizer(PolymorphicTypeValidator polymorphicTypeValidator) {
            this.AudioAttributesCompatParcelizer = polymorphicTypeValidator;
        }
    }

    final class write implements Annotations, modifyMapLikeSerializer, _hasNTypeParameters, valueToString, SurfaceHolder.Callback, TextureView.SurfaceTextureListener, SphericalGLSurfaceView.read, SimpleSerializers.write, findArraySerializer.IconCompatParcelizer, findConvertingSerializer.RemoteActionCompatParcelizer, ExoPlayer.RemoteActionCompatParcelizer {
        @Override // android.view.TextureView.SurfaceTextureListener
        public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }

        private write() {
        }

        /* synthetic */ write(BinaryNode binaryNode, byte b) {
            this();
        }

        @Override // kotlin.Annotations
        public final void IconCompatParcelizer(_at _atVar) {
            BinaryNode.this.addContentView = _atVar;
            BinaryNode.this.write.write(_atVar);
        }

        @Override // kotlin.Annotations
        public final void write(String str, long j, long j2) {
            BinaryNode.this.write.write(str, j, j2);
        }

        @Override // kotlin.Annotations
        public final void read(C0170format c0170format, findMapLikeSerializer findmaplikeserializer) {
            BinaryNode.this.addMenuProvider = c0170format;
            BinaryNode.this.write.write(c0170format, findmaplikeserializer);
        }

        @Override // kotlin.Annotations
        public final void read(int i, long j) {
            BinaryNode.this.write.write(i, j);
        }

        @Override // kotlin.Annotations
        public final void AudioAttributesCompatParcelizer(final deserializeTypedFromObject deserializetypedfromobject) {
            BinaryNode.this.addOnPictureInPictureModeChangedListener = deserializetypedfromobject;
            BinaryNode.this.onPrepare.write(25, new typeId.RemoteActionCompatParcelizer() { // from class: o.JsonNodeType
                @Override // o.typeId.RemoteActionCompatParcelizer
                public final void RemoteActionCompatParcelizer(Object obj) {
                    ((isUnsafeBaseType.AudioAttributesCompatParcelizer) obj).IconCompatParcelizer(deserializetypedfromobject);
                }
            });
        }

        @Override // kotlin.Annotations
        public final void IconCompatParcelizer(Object obj, long j) {
            BinaryNode.this.write.write(obj, j);
            if (BinaryNode.this.getSavedStateRegistryControllerannotations == obj) {
                BinaryNode.this.onPrepare.write(26, new typeId.RemoteActionCompatParcelizer() { // from class: o.PolymorphicTypeValidatorValidity
                    @Override // o.typeId.RemoteActionCompatParcelizer
                    public final void RemoteActionCompatParcelizer(Object obj2) {
                        ((isUnsafeBaseType.AudioAttributesCompatParcelizer) obj2).AudioAttributesCompatParcelizer();
                    }
                });
            }
        }

        @Override // kotlin.Annotations
        public final void AudioAttributesCompatParcelizer(String str) {
            BinaryNode.this.write.AudioAttributesCompatParcelizer(str);
        }

        @Override // kotlin.Annotations
        public final void RemoteActionCompatParcelizer(_at _atVar) {
            BinaryNode.this.write.RemoteActionCompatParcelizer(_atVar);
            BinaryNode.this.addMenuProvider = null;
            BinaryNode.this.addContentView = null;
        }

        @Override // kotlin.Annotations
        public final void RemoteActionCompatParcelizer(long j, int i) {
            BinaryNode.this.write.AudioAttributesCompatParcelizer(j, i);
        }

        @Override // kotlin.Annotations
        public final void AudioAttributesCompatParcelizer(Exception exc) {
            BinaryNode.this.write.AudioAttributesCompatParcelizer(exc);
        }

        @Override // kotlin.modifyMapLikeSerializer
        public final void read(_at _atVar) {
            BinaryNode.this.AudioAttributesImplBaseParcelizer = _atVar;
            BinaryNode.this.write.AudioAttributesCompatParcelizer(_atVar);
        }

        @Override // kotlin.modifyMapLikeSerializer
        public final void IconCompatParcelizer(String str, long j, long j2) {
            BinaryNode.this.write.read(str, j, j2);
        }

        @Override // kotlin.modifyMapLikeSerializer
        public final void AudioAttributesCompatParcelizer(C0170format c0170format, findMapLikeSerializer findmaplikeserializer) {
            BinaryNode.this.MediaDescriptionCompat = c0170format;
            BinaryNode.this.write.RemoteActionCompatParcelizer(c0170format, findmaplikeserializer);
        }

        @Override // kotlin.modifyMapLikeSerializer
        public final void read(long j) {
            BinaryNode.this.write.RemoteActionCompatParcelizer(j);
        }

        @Override // kotlin.modifyMapLikeSerializer
        public final void write(int i, long j, long j2) {
            BinaryNode.this.write.read(i, j, j2);
        }

        @Override // kotlin.modifyMapLikeSerializer
        public final void read(String str) {
            BinaryNode.this.write.read(str);
        }

        @Override // kotlin.modifyMapLikeSerializer
        public final void AudioAttributesCompatParcelizer(_at _atVar) {
            BinaryNode.this.write.IconCompatParcelizer(_atVar);
            BinaryNode.this.MediaDescriptionCompat = null;
            BinaryNode.this.AudioAttributesImplBaseParcelizer = null;
        }

        @Override // kotlin.modifyMapLikeSerializer
        public final void IconCompatParcelizer(final boolean z) {
            if (BinaryNode.this.r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0 == z) {
                return;
            }
            BinaryNode.this.r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0 = z;
            BinaryNode.this.onPrepare.write(23, new typeId.RemoteActionCompatParcelizer() { // from class: o.rawValueNode
                @Override // o.typeId.RemoteActionCompatParcelizer
                public final void RemoteActionCompatParcelizer(Object obj) {
                    ((isUnsafeBaseType.AudioAttributesCompatParcelizer) obj).RemoteActionCompatParcelizer(z);
                }
            });
        }

        @Override // kotlin.modifyMapLikeSerializer
        public final void write(Exception exc) {
            BinaryNode.this.write.RemoteActionCompatParcelizer(exc);
        }

        @Override // kotlin.modifyMapLikeSerializer
        public final void read(Exception exc) {
            BinaryNode.this.write.IconCompatParcelizer(exc);
        }

        @Override // kotlin.modifyMapLikeSerializer
        public final void RemoteActionCompatParcelizer(serializePolymorphic.read readVar) {
            BinaryNode.this.write.read(readVar);
        }

        @Override // kotlin.modifyMapLikeSerializer
        public final void AudioAttributesCompatParcelizer(serializePolymorphic.read readVar) {
            BinaryNode.this.write.RemoteActionCompatParcelizer(readVar);
        }

        @Override // kotlin._hasNTypeParameters
        public final void write(final List<getDefaultImpl> list) {
            BinaryNode.this.onPrepare.write(27, new typeId.RemoteActionCompatParcelizer() { // from class: o.pojoNode
                @Override // o.typeId.RemoteActionCompatParcelizer
                public final void RemoteActionCompatParcelizer(Object obj) {
                    ((isUnsafeBaseType.AudioAttributesCompatParcelizer) obj).write((List<getDefaultImpl>) list);
                }
            });
        }

        @Override // kotlin._hasNTypeParameters
        public final void IconCompatParcelizer(final idFromValue idfromvalue) {
            BinaryNode.this.onPause = idfromvalue;
            BinaryNode.this.onPrepare.write(27, new typeId.RemoteActionCompatParcelizer() { // from class: o.missingNode
                @Override // o.typeId.RemoteActionCompatParcelizer
                public final void RemoteActionCompatParcelizer(Object obj) {
                    ((isUnsafeBaseType.AudioAttributesCompatParcelizer) obj).write(idfromvalue);
                }
            });
        }

        @Override // kotlin.valueToString
        public final void write(final androidx.media3.common.Metadata metadata) {
            BinaryNode binaryNode = BinaryNode.this;
            binaryNode._init_lambda5 = binaryNode._init_lambda5.IconCompatParcelizer().IconCompatParcelizer(metadata).read();
            getSchema getschemaMediaSessionCompatToken = BinaryNode.this.MediaSessionCompatToken();
            if (!getschemaMediaSessionCompatToken.equals(BinaryNode.this.onSeekTo)) {
                BinaryNode.this.onSeekTo = getschemaMediaSessionCompatToken;
                BinaryNode.this.onPrepare.read(14, new typeId.RemoteActionCompatParcelizer() { // from class: o.binaryNode
                    @Override // o.typeId.RemoteActionCompatParcelizer
                    public final void RemoteActionCompatParcelizer(Object obj) {
                        this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer((isUnsafeBaseType.AudioAttributesCompatParcelizer) obj);
                    }
                });
            }
            BinaryNode.this.onPrepare.read(28, new typeId.RemoteActionCompatParcelizer() { // from class: o.getMaxElementIndexForInsert
                @Override // o.typeId.RemoteActionCompatParcelizer
                public final void RemoteActionCompatParcelizer(Object obj) {
                    ((isUnsafeBaseType.AudioAttributesCompatParcelizer) obj).read(metadata);
                }
            });
            BinaryNode.this.onPrepare.AudioAttributesCompatParcelizer();
        }

        final /* synthetic */ void RemoteActionCompatParcelizer(isUnsafeBaseType.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
            audioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(BinaryNode.this.onSeekTo);
        }

        @Override // android.view.SurfaceHolder.Callback
        public final void surfaceCreated(SurfaceHolder surfaceHolder) {
            if (BinaryNode.this.accessgetReportFullyDrawnExecutorp) {
                BinaryNode.this.AudioAttributesCompatParcelizer(surfaceHolder.getSurface());
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
            BinaryNode.this.AudioAttributesCompatParcelizer(i2, i3);
        }

        @Override // android.view.SurfaceHolder.Callback
        public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            if (BinaryNode.this.accessgetReportFullyDrawnExecutorp) {
                BinaryNode.this.AudioAttributesCompatParcelizer((Object) null);
            }
            BinaryNode.this.AudioAttributesCompatParcelizer(0, 0);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            BinaryNode.this.RemoteActionCompatParcelizer(surfaceTexture);
            BinaryNode.this.AudioAttributesCompatParcelizer(i, i2);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
            BinaryNode.this.AudioAttributesCompatParcelizer(i, i2);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            BinaryNode.this.AudioAttributesCompatParcelizer((Object) null);
            BinaryNode.this.AudioAttributesCompatParcelizer(0, 0);
            return true;
        }

        @Override // androidx.media3.exoplayer.video.spherical.SphericalGLSurfaceView.read
        public final void AudioAttributesCompatParcelizer(Surface surface) {
            BinaryNode.this.AudioAttributesCompatParcelizer(surface);
        }

        @Override // androidx.media3.exoplayer.video.spherical.SphericalGLSurfaceView.read
        public final void read() {
            BinaryNode.this.AudioAttributesCompatParcelizer((Object) null);
        }

        @Override // o.SimpleSerializers.write
        public final void write() {
            BinaryNode.this.ResultReceiver();
        }

        @Override // o.SimpleSerializers.write
        public final void read(int i) {
            BinaryNode.this.AudioAttributesCompatParcelizer(BinaryNode.this.onPrepareFromUri(), i, BinaryNode.AudioAttributesCompatParcelizer(i));
        }

        @Override // o.findArraySerializer.IconCompatParcelizer
        public final void RemoteActionCompatParcelizer() {
            BinaryNode.this.AudioAttributesCompatParcelizer(false, -1, 3);
        }

        @Override // o.findConvertingSerializer.RemoteActionCompatParcelizer
        public final void write(final int i, final boolean z) {
            BinaryNode.this.onPrepare.write(30, new typeId.RemoteActionCompatParcelizer() { // from class: o.willStripTrailingBigDecimalZeroes
                @Override // o.typeId.RemoteActionCompatParcelizer
                public final void RemoteActionCompatParcelizer(Object obj) {
                    ((isUnsafeBaseType.AudioAttributesCompatParcelizer) obj).read(i, z);
                }
            });
        }

        @Override // androidx.media3.exoplayer.ExoPlayer.RemoteActionCompatParcelizer
        public final void AudioAttributesCompatParcelizer() {
            BinaryNode.this.r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw();
        }
    }

    static final class AudioAttributesCompatParcelizer implements getRemainingInput, ArrayBuildersDoubleBuilder, buildMapEntrySerializer.write {
        private getRemainingInput AudioAttributesCompatParcelizer;
        private ArrayBuildersDoubleBuilder IconCompatParcelizer;
        private getRemainingInput RemoteActionCompatParcelizer;
        private ArrayBuildersDoubleBuilder write;

        private AudioAttributesCompatParcelizer() {
        }

        /* synthetic */ AudioAttributesCompatParcelizer(byte b) {
            this();
        }

        @Override // o.buildMapEntrySerializer.write
        public final void AudioAttributesCompatParcelizer(int i, Object obj) {
            if (i == 7) {
                this.AudioAttributesCompatParcelizer = (getRemainingInput) obj;
                return;
            }
            if (i == 8) {
                this.IconCompatParcelizer = (ArrayBuildersDoubleBuilder) obj;
                return;
            }
            if (i != 10000) {
                return;
            }
            SphericalGLSurfaceView sphericalGLSurfaceView = (SphericalGLSurfaceView) obj;
            if (sphericalGLSurfaceView == null) {
                this.RemoteActionCompatParcelizer = null;
                this.write = null;
            } else {
                this.RemoteActionCompatParcelizer = sphericalGLSurfaceView.read();
                this.write = sphericalGLSurfaceView.AudioAttributesCompatParcelizer();
            }
        }

        @Override // kotlin.getRemainingInput
        public final void RemoteActionCompatParcelizer(long j, long j2, C0170format c0170format, MediaFormat mediaFormat) {
            getRemainingInput getremaininginput = this.RemoteActionCompatParcelizer;
            if (getremaininginput != null) {
                getremaininginput.RemoteActionCompatParcelizer(j, j2, c0170format, mediaFormat);
            }
            getRemainingInput getremaininginput2 = this.AudioAttributesCompatParcelizer;
            if (getremaininginput2 != null) {
                getremaininginput2.RemoteActionCompatParcelizer(j, j2, c0170format, mediaFormat);
            }
        }

        @Override // kotlin.ArrayBuildersDoubleBuilder
        public final void AudioAttributesCompatParcelizer(long j, float[] fArr) {
            ArrayBuildersDoubleBuilder arrayBuildersDoubleBuilder = this.write;
            if (arrayBuildersDoubleBuilder != null) {
                arrayBuildersDoubleBuilder.AudioAttributesCompatParcelizer(j, fArr);
            }
            ArrayBuildersDoubleBuilder arrayBuildersDoubleBuilder2 = this.IconCompatParcelizer;
            if (arrayBuildersDoubleBuilder2 != null) {
                arrayBuildersDoubleBuilder2.AudioAttributesCompatParcelizer(j, fArr);
            }
        }

        @Override // kotlin.ArrayBuildersDoubleBuilder
        public final void RemoteActionCompatParcelizer() {
            ArrayBuildersDoubleBuilder arrayBuildersDoubleBuilder = this.write;
            if (arrayBuildersDoubleBuilder != null) {
                arrayBuildersDoubleBuilder.RemoteActionCompatParcelizer();
            }
            ArrayBuildersDoubleBuilder arrayBuildersDoubleBuilder2 = this.IconCompatParcelizer;
            if (arrayBuildersDoubleBuilder2 != null) {
                arrayBuildersDoubleBuilder2.RemoteActionCompatParcelizer();
            }
        }
    }

    static final class read {
        public static modifyArraySerializer IconCompatParcelizer(Context context, BinaryNode binaryNode, boolean z, String str) {
            modifyCollectionLikeSerializer modifycollectionlikeserializerIconCompatParcelizer = modifyCollectionLikeSerializer.IconCompatParcelizer(context);
            if (modifycollectionlikeserializerIconCompatParcelizer == null) {
                prune.RemoteActionCompatParcelizer("ExoPlayerImpl", "MediaMetricsService unavailable.");
                return new modifyArraySerializer(LogSessionId.LOG_SESSION_ID_NONE, str);
            }
            if (z) {
                binaryNode.addAnalyticsListener(modifycollectionlikeserializerIconCompatParcelizer);
            }
            return new modifyArraySerializer(modifycollectionlikeserializerIconCompatParcelizer.cI_(), str);
        }
    }
}
