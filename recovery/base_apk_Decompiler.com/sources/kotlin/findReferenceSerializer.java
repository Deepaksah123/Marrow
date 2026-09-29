package kotlin;

import android.os.Looper;
import android.util.SparseArray;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import java.io.IOException;
import java.util.List;
import kotlin.PolymorphicTypeValidator;
import kotlin.StdKeySerializers;
import kotlin.findSerializerByAnnotations;
import kotlin.isUnsafeBaseType;
import kotlin.onMoovContainerAtomRead;
import kotlin.serializePolymorphic;
import kotlin.typeId;

/* JADX INFO: loaded from: classes2.dex */
public final class findReferenceSerializer implements findSerializerByPrimaryType {
    private final buildTypeDeserializer AudioAttributesCompatParcelizer;
    private final PolymorphicTypeValidator.AudioAttributesCompatParcelizer AudioAttributesImplApi21Parcelizer;
    private final PolymorphicTypeValidator.IconCompatParcelizer AudioAttributesImplApi26Parcelizer;
    private isUnsafeBaseType AudioAttributesImplBaseParcelizer;
    private typeId<findSerializerByAnnotations> IconCompatParcelizer;
    private final AudioAttributesCompatParcelizer MediaBrowserCompatCustomActionResultReceiver;
    private final SparseArray<findSerializerByAnnotations.RemoteActionCompatParcelizer> RemoteActionCompatParcelizer;
    private _usesExternalId read;
    private boolean write;

    static /* synthetic */ void AudioAttributesImplApi21Parcelizer() {
    }

    static /* synthetic */ void AudioAttributesImplApi26Parcelizer() {
    }

    static /* synthetic */ void AudioAttributesImplBaseParcelizer() {
    }

    static /* synthetic */ void IconCompatParcelizer() {
    }

    static /* synthetic */ void MediaBrowserCompatCustomActionResultReceiver() {
    }

    static /* synthetic */ void MediaBrowserCompatItemReceiver() {
    }

    static /* synthetic */ void MediaBrowserCompatMediaItem() {
    }

    static /* synthetic */ void MediaBrowserCompatSearchResultReceiver() {
    }

    static /* synthetic */ void MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
    }

    static /* synthetic */ void MediaDescriptionCompat() {
    }

    static /* synthetic */ void MediaMetadataCompat() {
    }

    static /* synthetic */ void MediaSessionCompatQueueItem() {
    }

    static /* synthetic */ void MediaSessionCompatResultReceiverWrapper() {
    }

    static /* synthetic */ void MediaSessionCompatToken() {
    }

    static /* synthetic */ void ParcelableVolumeInfo() {
    }

    static /* synthetic */ void PlaybackStateCompat() {
    }

    static /* synthetic */ void PlaybackStateCompatCustomAction() {
    }

    static /* synthetic */ void RatingCompat() {
    }

    static /* synthetic */ void RemoteActionCompatParcelizer() {
    }

    static /* synthetic */ void ResultReceiver() {
    }

    static /* synthetic */ void _init_lambda2() {
    }

    static /* synthetic */ void handleMediaPlayPauseIfPendingOnHandler() {
    }

    static /* synthetic */ void onAddQueueItem() {
    }

    static /* synthetic */ void onCommand() {
    }

    static /* synthetic */ void onCustomAction() {
    }

    static /* synthetic */ void onFastForward() {
    }

    static /* synthetic */ void onMediaButtonEvent() {
    }

    static /* synthetic */ void onPause() {
    }

    static /* synthetic */ void onPlay() {
    }

    static /* synthetic */ void onPlayFromMediaId() {
    }

    static /* synthetic */ void onPlayFromSearch() {
    }

    static /* synthetic */ void onPlayFromUri() {
    }

    static /* synthetic */ void onPrepare() {
    }

    static /* synthetic */ void onPrepareFromMediaId() {
    }

    static /* synthetic */ void onPrepareFromSearch() {
    }

    static /* synthetic */ void onPrepareFromUri() {
    }

    static /* synthetic */ void onRemoveQueueItem() {
    }

    static /* synthetic */ void onRemoveQueueItemAt() {
    }

    static /* synthetic */ void onRewind() {
    }

    static /* synthetic */ void onSeekTo() {
    }

    static /* synthetic */ void onSetCaptioningEnabled() {
    }

    static /* synthetic */ void onSetPlaybackSpeed() {
    }

    static /* synthetic */ void onSetRating() {
    }

    static /* synthetic */ void onSetRepeatMode() {
    }

    static /* synthetic */ void onSetShuffleMode() {
    }

    static /* synthetic */ void onSkipToNext() {
    }

    static /* synthetic */ void onSkipToPrevious() {
    }

    static /* synthetic */ void onSkipToQueueItem() {
    }

    static /* synthetic */ void onStop() {
    }

    static /* synthetic */ void r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw() {
    }

    static /* synthetic */ void r8lambdaKUbBm7ckfqTc9QCgukC86fguu4() {
    }

    static /* synthetic */ void r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM() {
    }

    static /* synthetic */ void r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28() {
    }

    static /* synthetic */ void r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8() {
    }

    static /* synthetic */ void r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0() {
    }

    static /* synthetic */ void setSessionImpl() {
    }

    @Override // o.isUnsafeBaseType.AudioAttributesCompatParcelizer
    public final void AudioAttributesCompatParcelizer() {
    }

    @Override // o.isUnsafeBaseType.AudioAttributesCompatParcelizer
    public final void IconCompatParcelizer(isUnsafeBaseType isunsafebasetype, isUnsafeBaseType.RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
    }

    public findReferenceSerializer(buildTypeDeserializer buildtypedeserializer) {
        this.AudioAttributesCompatParcelizer = (buildTypeDeserializer) buildTypeSerializer.IconCompatParcelizer(buildtypedeserializer);
        this.IconCompatParcelizer = new typeId<>(LaissezFaireSubTypeValidator.write(), buildtypedeserializer, new typeId.read() { // from class: o.serializeAsOmittedField
            @Override // o.typeId.read
            public final void write(Object obj, enumTypes enumtypes) {
                findReferenceSerializer.RemoteActionCompatParcelizer();
            }
        });
        PolymorphicTypeValidator.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = new PolymorphicTypeValidator.AudioAttributesCompatParcelizer();
        this.AudioAttributesImplApi21Parcelizer = audioAttributesCompatParcelizer;
        this.AudioAttributesImplApi26Parcelizer = new PolymorphicTypeValidator.IconCompatParcelizer();
        this.MediaBrowserCompatCustomActionResultReceiver = new AudioAttributesCompatParcelizer(audioAttributesCompatParcelizer);
        this.RemoteActionCompatParcelizer = new SparseArray<>();
    }

    @Override // kotlin.findSerializerByPrimaryType
    public final void write(findSerializerByAnnotations findserializerbyannotations) {
        this.IconCompatParcelizer.AudioAttributesCompatParcelizer(findserializerbyannotations);
    }

    @Override // kotlin.findSerializerByPrimaryType
    public final void AudioAttributesCompatParcelizer(findSerializerByAnnotations findserializerbyannotations) {
        this.IconCompatParcelizer.write(findserializerbyannotations);
    }

    @Override // kotlin.findSerializerByPrimaryType
    public final void RemoteActionCompatParcelizer(final isUnsafeBaseType isunsafebasetype, Looper looper) {
        buildTypeSerializer.write(this.AudioAttributesImplBaseParcelizer == null || this.MediaBrowserCompatCustomActionResultReceiver.RemoteActionCompatParcelizer.isEmpty());
        this.AudioAttributesImplBaseParcelizer = (isUnsafeBaseType) buildTypeSerializer.IconCompatParcelizer(isunsafebasetype);
        this.read = this.AudioAttributesCompatParcelizer.read(looper, null);
        this.IconCompatParcelizer = this.IconCompatParcelizer.AudioAttributesCompatParcelizer(looper, new typeId.read() { // from class: o.serializeAsField
            @Override // o.typeId.read
            public final void write(Object obj, enumTypes enumtypes) {
                this.IconCompatParcelizer.read(isunsafebasetype, (findSerializerByAnnotations) obj, enumtypes);
            }
        });
    }

    final /* synthetic */ void read(isUnsafeBaseType isunsafebasetype, findSerializerByAnnotations findserializerbyannotations, enumTypes enumtypes) {
        findserializerbyannotations.write(isunsafebasetype, new findSerializerByAnnotations.read(enumtypes, this.RemoteActionCompatParcelizer));
    }

    @Override // kotlin.findSerializerByPrimaryType
    public final void read() {
        ((_usesExternalId) buildTypeSerializer.AudioAttributesCompatParcelizer(this.read)).IconCompatParcelizer(new Runnable() { // from class: o._findUnsupportedTypeSerializer
            @Override // java.lang.Runnable
            public final void run() {
                this.AudioAttributesCompatParcelizer._init_lambda4();
            }
        });
    }

    @Override // kotlin.findSerializerByPrimaryType
    public final void RemoteActionCompatParcelizer(List<StdKeySerializers.write> list, StdKeySerializers.write writeVar) {
        this.MediaBrowserCompatCustomActionResultReceiver.AudioAttributesCompatParcelizer(list, writeVar, (isUnsafeBaseType) buildTypeSerializer.IconCompatParcelizer(this.AudioAttributesImplBaseParcelizer));
    }

    @Override // kotlin.findSerializerByPrimaryType
    public final void write() {
        if (this.write) {
            return;
        }
        final findSerializerByAnnotations.RemoteActionCompatParcelizer remoteActionCompatParcelizerAccessensureViewModelStore = accessensureViewModelStore();
        this.write = true;
        RemoteActionCompatParcelizer(remoteActionCompatParcelizerAccessensureViewModelStore, -1, new typeId.RemoteActionCompatParcelizer() { // from class: o.setFilteredProperties
            @Override // o.typeId.RemoteActionCompatParcelizer
            public final void RemoteActionCompatParcelizer(Object obj) {
                findReferenceSerializer.IconCompatParcelizer();
            }
        });
    }

    @Override // kotlin.findSerializerByPrimaryType
    public final void AudioAttributesCompatParcelizer(final _at _atVar) {
        final findSerializerByAnnotations.RemoteActionCompatParcelizer remoteActionCompatParcelizer_init_lambda5 = _init_lambda5();
        RemoteActionCompatParcelizer(remoteActionCompatParcelizer_init_lambda5, AnalyticsListener.EVENT_AUDIO_ENABLED, new typeId.RemoteActionCompatParcelizer() { // from class: o.assignNullSerializer
            @Override // o.typeId.RemoteActionCompatParcelizer
            public final void RemoteActionCompatParcelizer(Object obj) {
                findReferenceSerializer.AudioAttributesImplApi21Parcelizer();
            }
        });
    }

    @Override // kotlin.findSerializerByPrimaryType
    public final void read(final String str, final long j, final long j2) {
        final findSerializerByAnnotations.RemoteActionCompatParcelizer remoteActionCompatParcelizer_init_lambda5 = _init_lambda5();
        RemoteActionCompatParcelizer(remoteActionCompatParcelizer_init_lambda5, AnalyticsListener.EVENT_AUDIO_DECODER_INITIALIZED, new typeId.RemoteActionCompatParcelizer() { // from class: o.getViews
            @Override // o.typeId.RemoteActionCompatParcelizer
            public final void RemoteActionCompatParcelizer(Object obj) {
                findReferenceSerializer.MediaBrowserCompatItemReceiver();
            }
        });
    }

    @Override // kotlin.findSerializerByPrimaryType
    public final void RemoteActionCompatParcelizer(final C0170format c0170format, final findMapLikeSerializer findmaplikeserializer) {
        final findSerializerByAnnotations.RemoteActionCompatParcelizer remoteActionCompatParcelizer_init_lambda5 = _init_lambda5();
        RemoteActionCompatParcelizer(remoteActionCompatParcelizer_init_lambda5, AnalyticsListener.EVENT_AUDIO_INPUT_FORMAT_CHANGED, new typeId.RemoteActionCompatParcelizer() { // from class: o.setTypeId
            @Override // o.typeId.RemoteActionCompatParcelizer
            public final void RemoteActionCompatParcelizer(Object obj) {
                findReferenceSerializer.MediaBrowserCompatMediaItem();
            }
        });
    }

    @Override // kotlin.findSerializerByPrimaryType
    public final void RemoteActionCompatParcelizer(final long j) {
        final findSerializerByAnnotations.RemoteActionCompatParcelizer remoteActionCompatParcelizer_init_lambda5 = _init_lambda5();
        RemoteActionCompatParcelizer(remoteActionCompatParcelizer_init_lambda5, AnalyticsListener.EVENT_AUDIO_POSITION_ADVANCING, new typeId.RemoteActionCompatParcelizer() { // from class: o.getSerializer
            @Override // o.typeId.RemoteActionCompatParcelizer
            public final void RemoteActionCompatParcelizer(Object obj) {
                findReferenceSerializer.MediaBrowserCompatSearchResultReceiver();
            }
        });
    }

    @Override // kotlin.findSerializerByPrimaryType
    public final void read(final int i, final long j, final long j2) {
        final findSerializerByAnnotations.RemoteActionCompatParcelizer remoteActionCompatParcelizer_init_lambda5 = _init_lambda5();
        RemoteActionCompatParcelizer(remoteActionCompatParcelizer_init_lambda5, AnalyticsListener.EVENT_AUDIO_UNDERRUN, new typeId.RemoteActionCompatParcelizer() { // from class: o._depositSchemaProperty
            @Override // o.typeId.RemoteActionCompatParcelizer
            public final void RemoteActionCompatParcelizer(Object obj) {
                findReferenceSerializer.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
            }
        });
    }

    @Override // kotlin.findSerializerByPrimaryType
    public final void read(final String str) {
        final findSerializerByAnnotations.RemoteActionCompatParcelizer remoteActionCompatParcelizer_init_lambda5 = _init_lambda5();
        RemoteActionCompatParcelizer(remoteActionCompatParcelizer_init_lambda5, AnalyticsListener.EVENT_AUDIO_DECODER_RELEASED, new typeId.RemoteActionCompatParcelizer() { // from class: o.setProperties
            @Override // o.typeId.RemoteActionCompatParcelizer
            public final void RemoteActionCompatParcelizer(Object obj) {
                findReferenceSerializer.AudioAttributesImplApi26Parcelizer();
            }
        });
    }

    @Override // kotlin.findSerializerByPrimaryType
    public final void IconCompatParcelizer(final _at _atVar) {
        final findSerializerByAnnotations.RemoteActionCompatParcelizer remoteActionCompatParcelizerAccessaddObserverForBackInvoker = accessaddObserverForBackInvoker();
        RemoteActionCompatParcelizer(remoteActionCompatParcelizerAccessaddObserverForBackInvoker, AnalyticsListener.EVENT_AUDIO_DISABLED, new typeId.RemoteActionCompatParcelizer() { // from class: o.asArraySerializer
            @Override // o.typeId.RemoteActionCompatParcelizer
            public final void RemoteActionCompatParcelizer(Object obj) {
                findReferenceSerializer.AudioAttributesImplBaseParcelizer();
            }
        });
    }

    @Override // kotlin.findSerializerByPrimaryType
    public final void RemoteActionCompatParcelizer(final Exception exc) {
        final findSerializerByAnnotations.RemoteActionCompatParcelizer remoteActionCompatParcelizer_init_lambda5 = _init_lambda5();
        RemoteActionCompatParcelizer(remoteActionCompatParcelizer_init_lambda5, AnalyticsListener.EVENT_AUDIO_SINK_ERROR, new typeId.RemoteActionCompatParcelizer() { // from class: o.filterBeanProperties
            @Override // o.typeId.RemoteActionCompatParcelizer
            public final void RemoteActionCompatParcelizer(Object obj) {
                findReferenceSerializer.RatingCompat();
            }
        });
    }

    @Override // kotlin.findSerializerByPrimaryType
    public final void IconCompatParcelizer(final Exception exc) {
        final findSerializerByAnnotations.RemoteActionCompatParcelizer remoteActionCompatParcelizer_init_lambda5 = _init_lambda5();
        RemoteActionCompatParcelizer(remoteActionCompatParcelizer_init_lambda5, AnalyticsListener.EVENT_AUDIO_CODEC_ERROR, new typeId.RemoteActionCompatParcelizer() { // from class: o.createSerializer
            @Override // o.typeId.RemoteActionCompatParcelizer
            public final void RemoteActionCompatParcelizer(Object obj) {
                findReferenceSerializer.MediaBrowserCompatCustomActionResultReceiver();
            }
        });
    }

    @Override // kotlin.findSerializerByPrimaryType
    public final void read(final serializePolymorphic.read readVar) {
        final findSerializerByAnnotations.RemoteActionCompatParcelizer remoteActionCompatParcelizer_init_lambda5 = _init_lambda5();
        RemoteActionCompatParcelizer(remoteActionCompatParcelizer_init_lambda5, 1031, new typeId.RemoteActionCompatParcelizer() { // from class: o.getObjectIdWriter
            @Override // o.typeId.RemoteActionCompatParcelizer
            public final void RemoteActionCompatParcelizer(Object obj) {
                findReferenceSerializer.MediaDescriptionCompat();
            }
        });
    }

    @Override // kotlin.findSerializerByPrimaryType
    public final void RemoteActionCompatParcelizer(final serializePolymorphic.read readVar) {
        final findSerializerByAnnotations.RemoteActionCompatParcelizer remoteActionCompatParcelizer_init_lambda5 = _init_lambda5();
        RemoteActionCompatParcelizer(remoteActionCompatParcelizer_init_lambda5, 1032, new typeId.RemoteActionCompatParcelizer() { // from class: o.findBeanOrAddOnSerializer
            @Override // o.typeId.RemoteActionCompatParcelizer
            public final void RemoteActionCompatParcelizer(Object obj) {
                findReferenceSerializer.handleMediaPlayPauseIfPendingOnHandler();
            }
        });
    }

    @Override // o.isUnsafeBaseType.AudioAttributesCompatParcelizer
    public final void IconCompatParcelizer(final float f) {
        final findSerializerByAnnotations.RemoteActionCompatParcelizer remoteActionCompatParcelizer_init_lambda5 = _init_lambda5();
        RemoteActionCompatParcelizer(remoteActionCompatParcelizer_init_lambda5, 22, new typeId.RemoteActionCompatParcelizer() { // from class: o.isIndexedList
            @Override // o.typeId.RemoteActionCompatParcelizer
            public final void RemoteActionCompatParcelizer(Object obj) {
                findReferenceSerializer.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
        });
    }

    @Override // kotlin.findSerializerByPrimaryType
    public final void write(final _at _atVar) {
        final findSerializerByAnnotations.RemoteActionCompatParcelizer remoteActionCompatParcelizer_init_lambda5 = _init_lambda5();
        RemoteActionCompatParcelizer(remoteActionCompatParcelizer_init_lambda5, AnalyticsListener.EVENT_VIDEO_ENABLED, new typeId.RemoteActionCompatParcelizer() { // from class: o._constructWriter
            @Override // o.typeId.RemoteActionCompatParcelizer
            public final void RemoteActionCompatParcelizer(Object obj) {
                findReferenceSerializer.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            }
        });
    }

    @Override // kotlin.findSerializerByPrimaryType
    public final void write(final String str, final long j, final long j2) {
        final findSerializerByAnnotations.RemoteActionCompatParcelizer remoteActionCompatParcelizer_init_lambda5 = _init_lambda5();
        RemoteActionCompatParcelizer(remoteActionCompatParcelizer_init_lambda5, AnalyticsListener.EVENT_VIDEO_DECODER_INITIALIZED, new typeId.RemoteActionCompatParcelizer() { // from class: o.constructPropertyBuilder
            @Override // o.typeId.RemoteActionCompatParcelizer
            public final void RemoteActionCompatParcelizer(Object obj) {
                findReferenceSerializer.ResultReceiver();
            }
        });
    }

    @Override // kotlin.findSerializerByPrimaryType
    public final void write(final C0170format c0170format, final findMapLikeSerializer findmaplikeserializer) {
        final findSerializerByAnnotations.RemoteActionCompatParcelizer remoteActionCompatParcelizer_init_lambda5 = _init_lambda5();
        RemoteActionCompatParcelizer(remoteActionCompatParcelizer_init_lambda5, AnalyticsListener.EVENT_VIDEO_INPUT_FORMAT_CHANGED, new typeId.RemoteActionCompatParcelizer() { // from class: o.setConfig
            @Override // o.typeId.RemoteActionCompatParcelizer
            public final void RemoteActionCompatParcelizer(Object obj) {
                findReferenceSerializer._init_lambda2();
            }
        });
    }

    @Override // kotlin.findSerializerByPrimaryType
    public final void write(final int i, final long j) {
        final findSerializerByAnnotations.RemoteActionCompatParcelizer remoteActionCompatParcelizerAccessaddObserverForBackInvoker = accessaddObserverForBackInvoker();
        RemoteActionCompatParcelizer(remoteActionCompatParcelizerAccessaddObserverForBackInvoker, AnalyticsListener.EVENT_DROPPED_VIDEO_FRAMES, new typeId.RemoteActionCompatParcelizer() { // from class: o.getTypeSerializer
            @Override // o.typeId.RemoteActionCompatParcelizer
            public final void RemoteActionCompatParcelizer(Object obj) {
                findReferenceSerializer.onPrepareFromSearch();
            }
        });
    }

    @Override // kotlin.findSerializerByPrimaryType
    public final void AudioAttributesCompatParcelizer(final String str) {
        final findSerializerByAnnotations.RemoteActionCompatParcelizer remoteActionCompatParcelizer_init_lambda5 = _init_lambda5();
        RemoteActionCompatParcelizer(remoteActionCompatParcelizer_init_lambda5, AnalyticsListener.EVENT_VIDEO_DECODER_RELEASED, new typeId.RemoteActionCompatParcelizer() { // from class: o.hasNullSerializer
            @Override // o.typeId.RemoteActionCompatParcelizer
            public final void RemoteActionCompatParcelizer(Object obj) {
                findReferenceSerializer.r8lambdaKUbBm7ckfqTc9QCgukC86fguu4();
            }
        });
    }

    @Override // kotlin.findSerializerByPrimaryType
    public final void RemoteActionCompatParcelizer(final _at _atVar) {
        final findSerializerByAnnotations.RemoteActionCompatParcelizer remoteActionCompatParcelizerAccessaddObserverForBackInvoker = accessaddObserverForBackInvoker();
        RemoteActionCompatParcelizer(remoteActionCompatParcelizerAccessaddObserverForBackInvoker, AnalyticsListener.EVENT_VIDEO_DISABLED, new typeId.RemoteActionCompatParcelizer() { // from class: o.setAnyGetter
            @Override // o.typeId.RemoteActionCompatParcelizer
            public final void RemoteActionCompatParcelizer(Object obj) {
                ((findSerializerByAnnotations) obj).read(_atVar);
            }
        });
    }

    @Override // kotlin.findSerializerByPrimaryType
    public final void write(final Object obj, final long j) {
        final findSerializerByAnnotations.RemoteActionCompatParcelizer remoteActionCompatParcelizer_init_lambda5 = _init_lambda5();
        RemoteActionCompatParcelizer(remoteActionCompatParcelizer_init_lambda5, 26, new typeId.RemoteActionCompatParcelizer() { // from class: o.constructBeanOrAddOnSerializer
            @Override // o.typeId.RemoteActionCompatParcelizer
            public final void RemoteActionCompatParcelizer(Object obj2) {
                findReferenceSerializer.onStop();
            }
        });
    }

    @Override // kotlin.findSerializerByPrimaryType
    public final void AudioAttributesCompatParcelizer(final long j, final int i) {
        final findSerializerByAnnotations.RemoteActionCompatParcelizer remoteActionCompatParcelizerAccessaddObserverForBackInvoker = accessaddObserverForBackInvoker();
        RemoteActionCompatParcelizer(remoteActionCompatParcelizerAccessaddObserverForBackInvoker, AnalyticsListener.EVENT_VIDEO_FRAME_PROCESSING_OFFSET, new typeId.RemoteActionCompatParcelizer() { // from class: o.serializeAsPlaceholder
            @Override // o.typeId.RemoteActionCompatParcelizer
            public final void RemoteActionCompatParcelizer(Object obj) {
                findReferenceSerializer.r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8();
            }
        });
    }

    @Override // kotlin.findSerializerByPrimaryType
    public final void AudioAttributesCompatParcelizer(final Exception exc) {
        final findSerializerByAnnotations.RemoteActionCompatParcelizer remoteActionCompatParcelizer_init_lambda5 = _init_lambda5();
        RemoteActionCompatParcelizer(remoteActionCompatParcelizer_init_lambda5, AnalyticsListener.EVENT_VIDEO_CODEC_ERROR, new typeId.RemoteActionCompatParcelizer() { // from class: o.BeanPropertyWriter
            @Override // o.typeId.RemoteActionCompatParcelizer
            public final void RemoteActionCompatParcelizer(Object obj) {
                findReferenceSerializer.r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw();
            }
        });
    }

    @Override // o.isUnsafeBaseType.AudioAttributesCompatParcelizer
    public final void RemoteActionCompatParcelizer(final int i, final int i2) {
        final findSerializerByAnnotations.RemoteActionCompatParcelizer remoteActionCompatParcelizer_init_lambda5 = _init_lambda5();
        RemoteActionCompatParcelizer(remoteActionCompatParcelizer_init_lambda5, 24, new typeId.RemoteActionCompatParcelizer() { // from class: o.removeSetterlessGetters
            @Override // o.typeId.RemoteActionCompatParcelizer
            public final void RemoteActionCompatParcelizer(Object obj) {
                findReferenceSerializer.MediaSessionCompatQueueItem();
            }
        });
    }

    @Override // kotlin.StdKeySerializer
    public final void IconCompatParcelizer(int i, StdKeySerializers.write writeVar, final StdDelegatingSerializer stdDelegatingSerializer, final StdArraySerializersShortArraySerializer stdArraySerializersShortArraySerializer) {
        final findSerializerByAnnotations.RemoteActionCompatParcelizer remoteActionCompatParcelizerIconCompatParcelizer = IconCompatParcelizer(i, writeVar);
        RemoteActionCompatParcelizer(remoteActionCompatParcelizerIconCompatParcelizer, 1000, new typeId.RemoteActionCompatParcelizer() { // from class: o.constructObjectIdHandler
            @Override // o.typeId.RemoteActionCompatParcelizer
            public final void RemoteActionCompatParcelizer(Object obj) {
                findReferenceSerializer.onRewind();
            }
        });
    }

    @Override // kotlin.StdKeySerializer
    public final void read(int i, StdKeySerializers.write writeVar, final StdDelegatingSerializer stdDelegatingSerializer, final StdArraySerializersShortArraySerializer stdArraySerializersShortArraySerializer) {
        final findSerializerByAnnotations.RemoteActionCompatParcelizer remoteActionCompatParcelizerIconCompatParcelizer = IconCompatParcelizer(i, writeVar);
        RemoteActionCompatParcelizer(remoteActionCompatParcelizerIconCompatParcelizer, 1001, new typeId.RemoteActionCompatParcelizer() { // from class: o.withProperties
            @Override // o.typeId.RemoteActionCompatParcelizer
            public final void RemoteActionCompatParcelizer(Object obj) {
                findReferenceSerializer.onSeekTo();
            }
        });
    }

    @Override // kotlin.StdKeySerializer
    public final void write(int i, StdKeySerializers.write writeVar, final StdDelegatingSerializer stdDelegatingSerializer, final StdArraySerializersShortArraySerializer stdArraySerializersShortArraySerializer) {
        final findSerializerByAnnotations.RemoteActionCompatParcelizer remoteActionCompatParcelizerIconCompatParcelizer = IconCompatParcelizer(i, writeVar);
        RemoteActionCompatParcelizer(remoteActionCompatParcelizerIconCompatParcelizer, 1002, new typeId.RemoteActionCompatParcelizer() { // from class: o.createDummy
            @Override // o.typeId.RemoteActionCompatParcelizer
            public final void RemoteActionCompatParcelizer(Object obj) {
                findReferenceSerializer.onRemoveQueueItem();
            }
        });
    }

    @Override // kotlin.StdKeySerializer
    public final void AudioAttributesCompatParcelizer(int i, StdKeySerializers.write writeVar, final StdDelegatingSerializer stdDelegatingSerializer, final StdArraySerializersShortArraySerializer stdArraySerializersShortArraySerializer, final IOException iOException, final boolean z) {
        final findSerializerByAnnotations.RemoteActionCompatParcelizer remoteActionCompatParcelizerIconCompatParcelizer = IconCompatParcelizer(i, writeVar);
        RemoteActionCompatParcelizer(remoteActionCompatParcelizerIconCompatParcelizer, 1003, new typeId.RemoteActionCompatParcelizer() { // from class: o._findAndAddDynamic
            @Override // o.typeId.RemoteActionCompatParcelizer
            public final void RemoteActionCompatParcelizer(Object obj) {
                ((findSerializerByAnnotations) obj).RemoteActionCompatParcelizer(stdArraySerializersShortArraySerializer);
            }
        });
    }

    @Override // kotlin.StdKeySerializer
    public final void RemoteActionCompatParcelizer(int i, StdKeySerializers.write writeVar, final StdArraySerializersShortArraySerializer stdArraySerializersShortArraySerializer) {
        final findSerializerByAnnotations.RemoteActionCompatParcelizer remoteActionCompatParcelizerIconCompatParcelizer = IconCompatParcelizer(i, writeVar);
        RemoteActionCompatParcelizer(remoteActionCompatParcelizerIconCompatParcelizer, 1005, new typeId.RemoteActionCompatParcelizer() { // from class: o.constructBeanSerializerBuilder
            @Override // o.typeId.RemoteActionCompatParcelizer
            public final void RemoteActionCompatParcelizer(Object obj) {
                findReferenceSerializer.PlaybackStateCompatCustomAction();
            }
        });
    }

    @Override // kotlin.StdKeySerializer
    public final void IconCompatParcelizer(int i, StdKeySerializers.write writeVar, final StdArraySerializersShortArraySerializer stdArraySerializersShortArraySerializer) {
        final findSerializerByAnnotations.RemoteActionCompatParcelizer remoteActionCompatParcelizerIconCompatParcelizer = IconCompatParcelizer(i, writeVar);
        RemoteActionCompatParcelizer(remoteActionCompatParcelizerIconCompatParcelizer, 1004, new typeId.RemoteActionCompatParcelizer() { // from class: o.BeanSerializer
            @Override // o.typeId.RemoteActionCompatParcelizer
            public final void RemoteActionCompatParcelizer(Object obj) {
                ((findSerializerByAnnotations) obj).write(remoteActionCompatParcelizerIconCompatParcelizer, stdArraySerializersShortArraySerializer);
            }
        });
    }

    @Override // o.isUnsafeBaseType.AudioAttributesCompatParcelizer
    public final void RemoteActionCompatParcelizer(PolymorphicTypeValidator polymorphicTypeValidator, final int i) {
        this.MediaBrowserCompatCustomActionResultReceiver.read((isUnsafeBaseType) buildTypeSerializer.IconCompatParcelizer(this.AudioAttributesImplBaseParcelizer));
        final findSerializerByAnnotations.RemoteActionCompatParcelizer remoteActionCompatParcelizerAccessensureViewModelStore = accessensureViewModelStore();
        RemoteActionCompatParcelizer(remoteActionCompatParcelizerAccessensureViewModelStore, 0, new typeId.RemoteActionCompatParcelizer() { // from class: o.removeOverlappingTypeIds
            @Override // o.typeId.RemoteActionCompatParcelizer
            public final void RemoteActionCompatParcelizer(Object obj) {
                findReferenceSerializer.MediaSessionCompatToken();
            }
        });
    }

    @Override // o.isUnsafeBaseType.AudioAttributesCompatParcelizer
    public final void RemoteActionCompatParcelizer(final JsonSerializableSchema jsonSerializableSchema, final int i) {
        final findSerializerByAnnotations.RemoteActionCompatParcelizer remoteActionCompatParcelizerAccessensureViewModelStore = accessensureViewModelStore();
        RemoteActionCompatParcelizer(remoteActionCompatParcelizerAccessensureViewModelStore, 1, new typeId.RemoteActionCompatParcelizer() { // from class: o.processViews
            @Override // o.typeId.RemoteActionCompatParcelizer
            public final void RemoteActionCompatParcelizer(Object obj) {
                findReferenceSerializer.onPrepareFromUri();
            }
        });
    }

    @Override // o.isUnsafeBaseType.AudioAttributesCompatParcelizer
    public final void RemoteActionCompatParcelizer(final collectAndResolveSubtypesByTypeId collectandresolvesubtypesbytypeid) {
        final findSerializerByAnnotations.RemoteActionCompatParcelizer remoteActionCompatParcelizerAccessensureViewModelStore = accessensureViewModelStore();
        RemoteActionCompatParcelizer(remoteActionCompatParcelizerAccessensureViewModelStore, 2, new typeId.RemoteActionCompatParcelizer() { // from class: o.getSerializationType
            @Override // o.typeId.RemoteActionCompatParcelizer
            public final void RemoteActionCompatParcelizer(Object obj) {
                findReferenceSerializer.MediaSessionCompatResultReceiverWrapper();
            }
        });
    }

    @Override // o.isUnsafeBaseType.AudioAttributesCompatParcelizer
    public final void IconCompatParcelizer(final boolean z) {
        final findSerializerByAnnotations.RemoteActionCompatParcelizer remoteActionCompatParcelizerAccessensureViewModelStore = accessensureViewModelStore();
        RemoteActionCompatParcelizer(remoteActionCompatParcelizerAccessensureViewModelStore, 3, new typeId.RemoteActionCompatParcelizer() { // from class: o.getAnyGetter
            @Override // o.typeId.RemoteActionCompatParcelizer
            public final void RemoteActionCompatParcelizer(Object obj) {
                findReferenceSerializer.onPlayFromUri();
            }
        });
    }

    @Override // o.isUnsafeBaseType.AudioAttributesCompatParcelizer
    public final void RemoteActionCompatParcelizer(final isUnsafeBaseType.read readVar) {
        final findSerializerByAnnotations.RemoteActionCompatParcelizer remoteActionCompatParcelizerAccessensureViewModelStore = accessensureViewModelStore();
        RemoteActionCompatParcelizer(remoteActionCompatParcelizerAccessensureViewModelStore, 13, new typeId.RemoteActionCompatParcelizer() { // from class: o.removeIgnorableTypes
            @Override // o.typeId.RemoteActionCompatParcelizer
            public final void RemoteActionCompatParcelizer(Object obj) {
                findReferenceSerializer.onAddQueueItem();
            }
        });
    }

    @Override // o.isUnsafeBaseType.AudioAttributesCompatParcelizer
    public final void write(final boolean z, final int i) {
        final findSerializerByAnnotations.RemoteActionCompatParcelizer remoteActionCompatParcelizerAccessensureViewModelStore = accessensureViewModelStore();
        RemoteActionCompatParcelizer(remoteActionCompatParcelizerAccessensureViewModelStore, -1, new typeId.RemoteActionCompatParcelizer() { // from class: o._handleSelfReference
            @Override // o.typeId.RemoteActionCompatParcelizer
            public final void RemoteActionCompatParcelizer(Object obj) {
                findReferenceSerializer.onSkipToQueueItem();
            }
        });
    }

    @Override // o.isUnsafeBaseType.AudioAttributesCompatParcelizer
    public final void RemoteActionCompatParcelizer(final int i) {
        final findSerializerByAnnotations.RemoteActionCompatParcelizer remoteActionCompatParcelizerAccessensureViewModelStore = accessensureViewModelStore();
        RemoteActionCompatParcelizer(remoteActionCompatParcelizerAccessensureViewModelStore, 4, new typeId.RemoteActionCompatParcelizer() { // from class: o.willSuppressNulls
            @Override // o.typeId.RemoteActionCompatParcelizer
            public final void RemoteActionCompatParcelizer(Object obj) {
                findReferenceSerializer.onSetPlaybackSpeed();
            }
        });
    }

    @Override // o.isUnsafeBaseType.AudioAttributesCompatParcelizer
    public final void RemoteActionCompatParcelizer(final boolean z, final int i) {
        final findSerializerByAnnotations.RemoteActionCompatParcelizer remoteActionCompatParcelizerAccessensureViewModelStore = accessensureViewModelStore();
        RemoteActionCompatParcelizer(remoteActionCompatParcelizerAccessensureViewModelStore, 5, new typeId.RemoteActionCompatParcelizer() { // from class: o.setNonTrivialBaseType
            @Override // o.typeId.RemoteActionCompatParcelizer
            public final void RemoteActionCompatParcelizer(Object obj) {
                findReferenceSerializer.onSetCaptioningEnabled();
            }
        });
    }

    @Override // o.isUnsafeBaseType.AudioAttributesCompatParcelizer
    public final void IconCompatParcelizer(final int i) {
        final findSerializerByAnnotations.RemoteActionCompatParcelizer remoteActionCompatParcelizerAccessensureViewModelStore = accessensureViewModelStore();
        RemoteActionCompatParcelizer(remoteActionCompatParcelizerAccessensureViewModelStore, 6, new typeId.RemoteActionCompatParcelizer() { // from class: o.hasSerializer
            @Override // o.typeId.RemoteActionCompatParcelizer
            public final void RemoteActionCompatParcelizer(Object obj) {
                findReferenceSerializer.onSetRating();
            }
        });
    }

    @Override // o.isUnsafeBaseType.AudioAttributesCompatParcelizer
    public final void AudioAttributesCompatParcelizer(final boolean z) {
        final findSerializerByAnnotations.RemoteActionCompatParcelizer remoteActionCompatParcelizerAccessensureViewModelStore = accessensureViewModelStore();
        RemoteActionCompatParcelizer(remoteActionCompatParcelizerAccessensureViewModelStore, 7, new typeId.RemoteActionCompatParcelizer() { // from class: o.assignSerializer
            @Override // o.typeId.RemoteActionCompatParcelizer
            public final void RemoteActionCompatParcelizer(Object obj) {
                findReferenceSerializer.onPrepare();
            }
        });
    }

    @Override // o.isUnsafeBaseType.AudioAttributesCompatParcelizer
    public final void AudioAttributesCompatParcelizer(final int i) {
        final findSerializerByAnnotations.RemoteActionCompatParcelizer remoteActionCompatParcelizerAccessensureViewModelStore = accessensureViewModelStore();
        RemoteActionCompatParcelizer(remoteActionCompatParcelizerAccessensureViewModelStore, 8, new typeId.RemoteActionCompatParcelizer() { // from class: o._isUnserializableJacksonType
            @Override // o.typeId.RemoteActionCompatParcelizer
            public final void RemoteActionCompatParcelizer(Object obj) {
                findReferenceSerializer.onSkipToPrevious();
            }
        });
    }

    @Override // o.isUnsafeBaseType.AudioAttributesCompatParcelizer
    public final void read(final boolean z) {
        final findSerializerByAnnotations.RemoteActionCompatParcelizer remoteActionCompatParcelizerAccessensureViewModelStore = accessensureViewModelStore();
        RemoteActionCompatParcelizer(remoteActionCompatParcelizerAccessensureViewModelStore, 9, new typeId.RemoteActionCompatParcelizer() { // from class: o.filterUnwantedJDKProperties
            @Override // o.typeId.RemoteActionCompatParcelizer
            public final void RemoteActionCompatParcelizer(Object obj) {
                findReferenceSerializer.onSkipToNext();
            }
        });
    }

    @Override // o.isUnsafeBaseType.AudioAttributesCompatParcelizer
    public final void IconCompatParcelizer(final validateSubClassName validatesubclassname) {
        final findSerializerByAnnotations.RemoteActionCompatParcelizer remoteActionCompatParcelizer = read(validatesubclassname);
        RemoteActionCompatParcelizer(remoteActionCompatParcelizer, 10, new typeId.RemoteActionCompatParcelizer() { // from class: o.wouldConflictWithName
            @Override // o.typeId.RemoteActionCompatParcelizer
            public final void RemoteActionCompatParcelizer(Object obj) {
                ((findSerializerByAnnotations) obj).IconCompatParcelizer(validatesubclassname);
            }
        });
    }

    @Override // o.isUnsafeBaseType.AudioAttributesCompatParcelizer
    public final void write(final validateSubClassName validatesubclassname) {
        final findSerializerByAnnotations.RemoteActionCompatParcelizer remoteActionCompatParcelizer = read(validatesubclassname);
        RemoteActionCompatParcelizer(remoteActionCompatParcelizer, 10, new typeId.RemoteActionCompatParcelizer() { // from class: o.rename
            @Override // o.typeId.RemoteActionCompatParcelizer
            public final void RemoteActionCompatParcelizer(Object obj) {
                findReferenceSerializer.setSessionImpl();
            }
        });
    }

    @Override // o.isUnsafeBaseType.AudioAttributesCompatParcelizer
    public final void AudioAttributesCompatParcelizer(final isUnsafeBaseType.write writeVar, final isUnsafeBaseType.write writeVar2, final int i) {
        if (i == 1) {
            this.write = false;
        }
        this.MediaBrowserCompatCustomActionResultReceiver.write((isUnsafeBaseType) buildTypeSerializer.IconCompatParcelizer(this.AudioAttributesImplBaseParcelizer));
        final findSerializerByAnnotations.RemoteActionCompatParcelizer remoteActionCompatParcelizerAccessensureViewModelStore = accessensureViewModelStore();
        RemoteActionCompatParcelizer(remoteActionCompatParcelizerAccessensureViewModelStore, 11, new typeId.RemoteActionCompatParcelizer() { // from class: o.BeanSerializerFactory
            @Override // o.typeId.RemoteActionCompatParcelizer
            public final void RemoteActionCompatParcelizer(Object obj) {
                ((findSerializerByAnnotations) obj).AudioAttributesCompatParcelizer(i);
            }
        });
    }

    @Override // o.isUnsafeBaseType.AudioAttributesCompatParcelizer
    public final void RemoteActionCompatParcelizer(final DefaultBaseTypeLimitingValidatorUnsafeBaseTypes defaultBaseTypeLimitingValidatorUnsafeBaseTypes) {
        final findSerializerByAnnotations.RemoteActionCompatParcelizer remoteActionCompatParcelizerAccessensureViewModelStore = accessensureViewModelStore();
        RemoteActionCompatParcelizer(remoteActionCompatParcelizerAccessensureViewModelStore, 12, new typeId.RemoteActionCompatParcelizer() { // from class: o.findSerializerFromAnnotation
            @Override // o.typeId.RemoteActionCompatParcelizer
            public final void RemoteActionCompatParcelizer(Object obj) {
                findReferenceSerializer.onSetShuffleMode();
            }
        });
    }

    @Override // o.isUnsafeBaseType.AudioAttributesCompatParcelizer
    public final void AudioAttributesCompatParcelizer(final getSchema getschema) {
        final findSerializerByAnnotations.RemoteActionCompatParcelizer remoteActionCompatParcelizerAccessensureViewModelStore = accessensureViewModelStore();
        RemoteActionCompatParcelizer(remoteActionCompatParcelizerAccessensureViewModelStore, 14, new typeId.RemoteActionCompatParcelizer() { // from class: o.findPropertyContentTypeSerializer
            @Override // o.typeId.RemoteActionCompatParcelizer
            public final void RemoteActionCompatParcelizer(Object obj) {
                findReferenceSerializer.onRemoveQueueItemAt();
            }
        });
    }

    @Override // o.isUnsafeBaseType.AudioAttributesCompatParcelizer
    public final void read(final androidx.media3.common.Metadata metadata) {
        final findSerializerByAnnotations.RemoteActionCompatParcelizer remoteActionCompatParcelizerAccessensureViewModelStore = accessensureViewModelStore();
        RemoteActionCompatParcelizer(remoteActionCompatParcelizerAccessensureViewModelStore, 28, new typeId.RemoteActionCompatParcelizer() { // from class: o.assignTypeSerializer
            @Override // o.typeId.RemoteActionCompatParcelizer
            public final void RemoteActionCompatParcelizer(Object obj) {
                findReferenceSerializer.onSetRepeatMode();
            }
        });
    }

    @Override // o.isUnsafeBaseType.AudioAttributesCompatParcelizer
    public final void write(final List<getDefaultImpl> list) {
        final findSerializerByAnnotations.RemoteActionCompatParcelizer remoteActionCompatParcelizerAccessensureViewModelStore = accessensureViewModelStore();
        RemoteActionCompatParcelizer(remoteActionCompatParcelizerAccessensureViewModelStore, 27, new typeId.RemoteActionCompatParcelizer() { // from class: o.serializeAsElement
            @Override // o.typeId.RemoteActionCompatParcelizer
            public final void RemoteActionCompatParcelizer(Object obj) {
                findReferenceSerializer.onCustomAction();
            }
        });
    }

    @Override // o.isUnsafeBaseType.AudioAttributesCompatParcelizer
    public final void write(final idFromValue idfromvalue) {
        final findSerializerByAnnotations.RemoteActionCompatParcelizer remoteActionCompatParcelizerAccessensureViewModelStore = accessensureViewModelStore();
        RemoteActionCompatParcelizer(remoteActionCompatParcelizerAccessensureViewModelStore, 27, new typeId.RemoteActionCompatParcelizer() { // from class: o._createSerializer2
            @Override // o.typeId.RemoteActionCompatParcelizer
            public final void RemoteActionCompatParcelizer(Object obj) {
                findReferenceSerializer.onCommand();
            }
        });
    }

    @Override // o.isUnsafeBaseType.AudioAttributesCompatParcelizer
    public final void RemoteActionCompatParcelizer(final boolean z) {
        final findSerializerByAnnotations.RemoteActionCompatParcelizer remoteActionCompatParcelizer_init_lambda5 = _init_lambda5();
        RemoteActionCompatParcelizer(remoteActionCompatParcelizer_init_lambda5, 23, new typeId.RemoteActionCompatParcelizer() { // from class: o.BasicSerializerFactory1
            @Override // o.typeId.RemoteActionCompatParcelizer
            public final void RemoteActionCompatParcelizer(Object obj) {
                findReferenceSerializer.ParcelableVolumeInfo();
            }
        });
    }

    @Override // o.isUnsafeBaseType.AudioAttributesCompatParcelizer
    public final void read(final int i) {
        final findSerializerByAnnotations.RemoteActionCompatParcelizer remoteActionCompatParcelizer_init_lambda5 = _init_lambda5();
        RemoteActionCompatParcelizer(remoteActionCompatParcelizer_init_lambda5, 21, new typeId.RemoteActionCompatParcelizer() { // from class: o.setFilterId
            @Override // o.typeId.RemoteActionCompatParcelizer
            public final void RemoteActionCompatParcelizer(Object obj) {
                findReferenceSerializer.MediaMetadataCompat();
            }
        });
    }

    @Override // o.isUnsafeBaseType.AudioAttributesCompatParcelizer
    public final void IconCompatParcelizer(final deserializeTypedFromObject deserializetypedfromobject) {
        final findSerializerByAnnotations.RemoteActionCompatParcelizer remoteActionCompatParcelizer_init_lambda5 = _init_lambda5();
        RemoteActionCompatParcelizer(remoteActionCompatParcelizer_init_lambda5, 25, new typeId.RemoteActionCompatParcelizer() { // from class: o.setObjectIdWriter
            @Override // o.typeId.RemoteActionCompatParcelizer
            public final void RemoteActionCompatParcelizer(Object obj) {
                findReferenceSerializer.IconCompatParcelizer(deserializetypedfromobject, (findSerializerByAnnotations) obj);
            }
        });
    }

    static /* synthetic */ void IconCompatParcelizer(deserializeTypedFromObject deserializetypedfromobject, findSerializerByAnnotations findserializerbyannotations) {
        findserializerbyannotations.AudioAttributesCompatParcelizer(deserializetypedfromobject);
        int i = deserializetypedfromobject.write;
        int i2 = deserializetypedfromobject.AudioAttributesCompatParcelizer;
        int i3 = deserializetypedfromobject.RemoteActionCompatParcelizer;
        float f = deserializetypedfromobject.IconCompatParcelizer;
    }

    @Override // o.isUnsafeBaseType.AudioAttributesCompatParcelizer
    public final void AudioAttributesCompatParcelizer(final SubtypeResolver subtypeResolver) {
        final findSerializerByAnnotations.RemoteActionCompatParcelizer remoteActionCompatParcelizerAccessensureViewModelStore = accessensureViewModelStore();
        RemoteActionCompatParcelizer(remoteActionCompatParcelizerAccessensureViewModelStore, 19, new typeId.RemoteActionCompatParcelizer() { // from class: o.findPropertyTypeSerializer
            @Override // o.typeId.RemoteActionCompatParcelizer
            public final void RemoteActionCompatParcelizer(Object obj) {
                findReferenceSerializer.PlaybackStateCompat();
            }
        });
    }

    @Override // o.isUnsafeBaseType.AudioAttributesCompatParcelizer
    public final void read(final int i, final boolean z) {
        final findSerializerByAnnotations.RemoteActionCompatParcelizer remoteActionCompatParcelizerAccessensureViewModelStore = accessensureViewModelStore();
        RemoteActionCompatParcelizer(remoteActionCompatParcelizerAccessensureViewModelStore, 30, new typeId.RemoteActionCompatParcelizer() { // from class: o.unwrappingWriter
            @Override // o.typeId.RemoteActionCompatParcelizer
            public final void RemoteActionCompatParcelizer(Object obj) {
                findReferenceSerializer.onFastForward();
            }
        });
    }

    @Override // o._fromWellKnownInterface.IconCompatParcelizer
    public final void IconCompatParcelizer(final int i, final long j, final long j2) {
        final findSerializerByAnnotations.RemoteActionCompatParcelizer remoteActionCompatParcelizer_init_lambda3 = _init_lambda3();
        RemoteActionCompatParcelizer(remoteActionCompatParcelizer_init_lambda3, AnalyticsListener.EVENT_BANDWIDTH_ESTIMATE, new typeId.RemoteActionCompatParcelizer() { // from class: o.usesStaticTyping
            @Override // o.typeId.RemoteActionCompatParcelizer
            public final void RemoteActionCompatParcelizer(Object obj) {
                ((findSerializerByAnnotations) obj).write(remoteActionCompatParcelizer_init_lambda3, i, j);
            }
        });
    }

    @Override // kotlin.PropertySerializerMapEmpty
    public final void read(int i, StdKeySerializers.write writeVar, final int i2) {
        final findSerializerByAnnotations.RemoteActionCompatParcelizer remoteActionCompatParcelizerIconCompatParcelizer = IconCompatParcelizer(i, writeVar);
        RemoteActionCompatParcelizer(remoteActionCompatParcelizerIconCompatParcelizer, AnalyticsListener.EVENT_DRM_SESSION_ACQUIRED, new typeId.RemoteActionCompatParcelizer() { // from class: o.BeanSerializerBuilder
            @Override // o.typeId.RemoteActionCompatParcelizer
            public final void RemoteActionCompatParcelizer(Object obj) {
                findReferenceSerializer.onPlayFromMediaId();
            }
        });
    }

    @Override // kotlin.PropertySerializerMapEmpty
    public final void AudioAttributesCompatParcelizer(int i, StdKeySerializers.write writeVar) {
        final findSerializerByAnnotations.RemoteActionCompatParcelizer remoteActionCompatParcelizerIconCompatParcelizer = IconCompatParcelizer(i, writeVar);
        RemoteActionCompatParcelizer(remoteActionCompatParcelizerIconCompatParcelizer, AnalyticsListener.EVENT_DRM_KEYS_LOADED, new typeId.RemoteActionCompatParcelizer() { // from class: o.constructFilteredBeanWriter
            @Override // o.typeId.RemoteActionCompatParcelizer
            public final void RemoteActionCompatParcelizer(Object obj) {
                findReferenceSerializer.onPlay();
            }
        });
    }

    @Override // kotlin.PropertySerializerMapEmpty
    public final void AudioAttributesCompatParcelizer(int i, StdKeySerializers.write writeVar, final Exception exc) {
        final findSerializerByAnnotations.RemoteActionCompatParcelizer remoteActionCompatParcelizerIconCompatParcelizer = IconCompatParcelizer(i, writeVar);
        RemoteActionCompatParcelizer(remoteActionCompatParcelizerIconCompatParcelizer, 1024, new typeId.RemoteActionCompatParcelizer() { // from class: o.withObjectIdWriter
            @Override // o.typeId.RemoteActionCompatParcelizer
            public final void RemoteActionCompatParcelizer(Object obj) {
                findReferenceSerializer.onPrepareFromMediaId();
            }
        });
    }

    @Override // kotlin.PropertySerializerMapEmpty
    public final void RemoteActionCompatParcelizer(int i, StdKeySerializers.write writeVar) {
        final findSerializerByAnnotations.RemoteActionCompatParcelizer remoteActionCompatParcelizerIconCompatParcelizer = IconCompatParcelizer(i, writeVar);
        RemoteActionCompatParcelizer(remoteActionCompatParcelizerIconCompatParcelizer, AnalyticsListener.EVENT_DRM_KEYS_RESTORED, new typeId.RemoteActionCompatParcelizer() { // from class: o.getFilterId
            @Override // o.typeId.RemoteActionCompatParcelizer
            public final void RemoteActionCompatParcelizer(Object obj) {
                findReferenceSerializer.onMediaButtonEvent();
            }
        });
    }

    @Override // kotlin.PropertySerializerMapEmpty
    public final void read(int i, StdKeySerializers.write writeVar) {
        final findSerializerByAnnotations.RemoteActionCompatParcelizer remoteActionCompatParcelizerIconCompatParcelizer = IconCompatParcelizer(i, writeVar);
        RemoteActionCompatParcelizer(remoteActionCompatParcelizerIconCompatParcelizer, AnalyticsListener.EVENT_DRM_KEYS_REMOVED, new typeId.RemoteActionCompatParcelizer() { // from class: o.getBeanDescription
            @Override // o.typeId.RemoteActionCompatParcelizer
            public final void RemoteActionCompatParcelizer(Object obj) {
                findReferenceSerializer.onPause();
            }
        });
    }

    @Override // kotlin.PropertySerializerMapEmpty
    public final void write(int i, StdKeySerializers.write writeVar) {
        final findSerializerByAnnotations.RemoteActionCompatParcelizer remoteActionCompatParcelizerIconCompatParcelizer = IconCompatParcelizer(i, writeVar);
        RemoteActionCompatParcelizer(remoteActionCompatParcelizerIconCompatParcelizer, AnalyticsListener.EVENT_DRM_SESSION_RELEASED, new typeId.RemoteActionCompatParcelizer() { // from class: o.findBeanProperties
            @Override // o.typeId.RemoteActionCompatParcelizer
            public final void RemoteActionCompatParcelizer(Object obj) {
                findReferenceSerializer.onPlayFromSearch();
            }
        });
    }

    private void RemoteActionCompatParcelizer(findSerializerByAnnotations.RemoteActionCompatParcelizer remoteActionCompatParcelizer, int i, typeId.RemoteActionCompatParcelizer<findSerializerByAnnotations> remoteActionCompatParcelizer2) {
        this.RemoteActionCompatParcelizer.put(i, remoteActionCompatParcelizer);
        this.IconCompatParcelizer.write(i, remoteActionCompatParcelizer2);
    }

    private findSerializerByAnnotations.RemoteActionCompatParcelizer accessensureViewModelStore() {
        return read(this.MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer());
    }

    private findSerializerByAnnotations.RemoteActionCompatParcelizer IconCompatParcelizer(PolymorphicTypeValidator polymorphicTypeValidator, int i, StdKeySerializers.write writeVar) {
        long jRemoteActionCompatParcelizer;
        StdKeySerializers.write writeVar2 = polymorphicTypeValidator.RemoteActionCompatParcelizer() ? null : writeVar;
        long jRemoteActionCompatParcelizer2 = this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer();
        boolean z = polymorphicTypeValidator.equals(this.AudioAttributesImplBaseParcelizer.onPrepare()) && i == this.AudioAttributesImplBaseParcelizer.onMediaButtonEvent();
        long jOnAddQueueItem = 0;
        if (writeVar2 == null || !writeVar2.IconCompatParcelizer()) {
            if (z) {
                jOnAddQueueItem = this.AudioAttributesImplBaseParcelizer.onAddQueueItem();
            } else if (!polymorphicTypeValidator.RemoteActionCompatParcelizer()) {
                jRemoteActionCompatParcelizer = polymorphicTypeValidator.RemoteActionCompatParcelizer(i, this.AudioAttributesImplApi26Parcelizer).RemoteActionCompatParcelizer();
            }
        } else {
            jRemoteActionCompatParcelizer = (z && this.AudioAttributesImplBaseParcelizer.onPlay() == writeVar2.write && this.AudioAttributesImplBaseParcelizer.onPause() == writeVar2.read) ? this.AudioAttributesImplBaseParcelizer.onPlayFromUri() : jOnAddQueueItem;
        }
        return new findSerializerByAnnotations.RemoteActionCompatParcelizer(jRemoteActionCompatParcelizer2, polymorphicTypeValidator, i, writeVar2, jRemoteActionCompatParcelizer, this.AudioAttributesImplBaseParcelizer.onPrepare(), this.AudioAttributesImplBaseParcelizer.onMediaButtonEvent(), this.MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer(), this.AudioAttributesImplBaseParcelizer.onPlayFromUri(), this.AudioAttributesImplBaseParcelizer.onSetRating());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void _init_lambda4() {
        final findSerializerByAnnotations.RemoteActionCompatParcelizer remoteActionCompatParcelizerAccessensureViewModelStore = accessensureViewModelStore();
        RemoteActionCompatParcelizer(remoteActionCompatParcelizerAccessensureViewModelStore, AnalyticsListener.EVENT_PLAYER_RELEASED, new typeId.RemoteActionCompatParcelizer() { // from class: o.BeanPropertyFilter
            @Override // o.typeId.RemoteActionCompatParcelizer
            public final void RemoteActionCompatParcelizer(Object obj) {
                findReferenceSerializer.r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0();
            }
        });
        this.IconCompatParcelizer.RemoteActionCompatParcelizer();
    }

    private findSerializerByAnnotations.RemoteActionCompatParcelizer read(StdKeySerializers.write writeVar) {
        PolymorphicTypeValidator polymorphicTypeValidatorAudioAttributesCompatParcelizer = writeVar == null ? null : this.MediaBrowserCompatCustomActionResultReceiver.AudioAttributesCompatParcelizer(writeVar);
        if (writeVar == null || polymorphicTypeValidatorAudioAttributesCompatParcelizer == null) {
            int iOnMediaButtonEvent = this.AudioAttributesImplBaseParcelizer.onMediaButtonEvent();
            PolymorphicTypeValidator polymorphicTypeValidatorOnPrepare = this.AudioAttributesImplBaseParcelizer.onPrepare();
            if (iOnMediaButtonEvent >= polymorphicTypeValidatorOnPrepare.AudioAttributesCompatParcelizer()) {
                polymorphicTypeValidatorOnPrepare = PolymorphicTypeValidator.RemoteActionCompatParcelizer;
            }
            return IconCompatParcelizer(polymorphicTypeValidatorOnPrepare, iOnMediaButtonEvent, (StdKeySerializers.write) null);
        }
        return IconCompatParcelizer(polymorphicTypeValidatorAudioAttributesCompatParcelizer, polymorphicTypeValidatorAudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(writeVar.AudioAttributesCompatParcelizer, this.AudioAttributesImplApi21Parcelizer).AudioAttributesImplBaseParcelizer, writeVar);
    }

    private findSerializerByAnnotations.RemoteActionCompatParcelizer accessaddObserverForBackInvoker() {
        return read(this.MediaBrowserCompatCustomActionResultReceiver.write());
    }

    private findSerializerByAnnotations.RemoteActionCompatParcelizer _init_lambda5() {
        return read(this.MediaBrowserCompatCustomActionResultReceiver.read());
    }

    private findSerializerByAnnotations.RemoteActionCompatParcelizer _init_lambda3() {
        return read(this.MediaBrowserCompatCustomActionResultReceiver.RemoteActionCompatParcelizer());
    }

    private findSerializerByAnnotations.RemoteActionCompatParcelizer IconCompatParcelizer(int i, StdKeySerializers.write writeVar) {
        isUnsafeBaseType isunsafebasetype = this.AudioAttributesImplBaseParcelizer;
        if (writeVar != null) {
            if (this.MediaBrowserCompatCustomActionResultReceiver.AudioAttributesCompatParcelizer(writeVar) != null) {
                return read(writeVar);
            }
            return IconCompatParcelizer(PolymorphicTypeValidator.RemoteActionCompatParcelizer, i, writeVar);
        }
        PolymorphicTypeValidator polymorphicTypeValidatorOnPrepare = isunsafebasetype.onPrepare();
        if (i >= polymorphicTypeValidatorOnPrepare.AudioAttributesCompatParcelizer()) {
            polymorphicTypeValidatorOnPrepare = PolymorphicTypeValidator.RemoteActionCompatParcelizer;
        }
        return IconCompatParcelizer(polymorphicTypeValidatorOnPrepare, i, (StdKeySerializers.write) null);
    }

    private findSerializerByAnnotations.RemoteActionCompatParcelizer read(validateSubClassName validatesubclassname) {
        if (validatesubclassname instanceof addNull) {
            addNull addnull = (addNull) validatesubclassname;
            if (addnull.RemoteActionCompatParcelizer != null) {
                return read(addnull.RemoteActionCompatParcelizer);
            }
        }
        return accessensureViewModelStore();
    }

    static final class AudioAttributesCompatParcelizer {
        private StdKeySerializers.write AudioAttributesImplBaseParcelizer;
        private final PolymorphicTypeValidator.AudioAttributesCompatParcelizer IconCompatParcelizer;
        private StdKeySerializers.write read;
        private StdKeySerializers.write write;
        private initExtraTracks<StdKeySerializers.write> RemoteActionCompatParcelizer = initExtraTracks.AudioAttributesImplApi26Parcelizer();
        private onMoovContainerAtomRead<StdKeySerializers.write, PolymorphicTypeValidator> AudioAttributesCompatParcelizer = onMoovContainerAtomRead.AudioAttributesCompatParcelizer();

        public AudioAttributesCompatParcelizer(PolymorphicTypeValidator.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
            this.IconCompatParcelizer = audioAttributesCompatParcelizer;
        }

        public final StdKeySerializers.write IconCompatParcelizer() {
            return this.read;
        }

        public final StdKeySerializers.write write() {
            return this.write;
        }

        public final StdKeySerializers.write read() {
            return this.AudioAttributesImplBaseParcelizer;
        }

        public final StdKeySerializers.write RemoteActionCompatParcelizer() {
            if (this.RemoteActionCompatParcelizer.isEmpty()) {
                return null;
            }
            return (StdKeySerializers.write) onMoofContainerAtomRead.AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer);
        }

        public final PolymorphicTypeValidator AudioAttributesCompatParcelizer(StdKeySerializers.write writeVar) {
            return this.AudioAttributesCompatParcelizer.get(writeVar);
        }

        public final void write(isUnsafeBaseType isunsafebasetype) {
            this.read = read(isunsafebasetype, this.RemoteActionCompatParcelizer, this.write, this.IconCompatParcelizer);
        }

        public final void read(isUnsafeBaseType isunsafebasetype) {
            this.read = read(isunsafebasetype, this.RemoteActionCompatParcelizer, this.write, this.IconCompatParcelizer);
            write(isunsafebasetype.onPrepare());
        }

        public final void AudioAttributesCompatParcelizer(List<StdKeySerializers.write> list, StdKeySerializers.write writeVar, isUnsafeBaseType isunsafebasetype) {
            this.RemoteActionCompatParcelizer = initExtraTracks.write(list);
            if (!list.isEmpty()) {
                this.write = list.get(0);
                this.AudioAttributesImplBaseParcelizer = (StdKeySerializers.write) buildTypeSerializer.IconCompatParcelizer(writeVar);
            }
            if (this.read == null) {
                this.read = read(isunsafebasetype, this.RemoteActionCompatParcelizer, this.write, this.IconCompatParcelizer);
            }
            write(isunsafebasetype.onPrepare());
        }

        private void write(PolymorphicTypeValidator polymorphicTypeValidator) {
            onMoovContainerAtomRead.AudioAttributesCompatParcelizer<StdKeySerializers.write, PolymorphicTypeValidator> audioAttributesCompatParcelizer = onMoovContainerAtomRead.read();
            if (this.RemoteActionCompatParcelizer.isEmpty()) {
                AudioAttributesCompatParcelizer(audioAttributesCompatParcelizer, this.write, polymorphicTypeValidator);
                if (!parseSmta.AudioAttributesCompatParcelizer(this.AudioAttributesImplBaseParcelizer, this.write)) {
                    AudioAttributesCompatParcelizer(audioAttributesCompatParcelizer, this.AudioAttributesImplBaseParcelizer, polymorphicTypeValidator);
                }
                if (!parseSmta.AudioAttributesCompatParcelizer(this.read, this.write) && !parseSmta.AudioAttributesCompatParcelizer(this.read, this.AudioAttributesImplBaseParcelizer)) {
                    AudioAttributesCompatParcelizer(audioAttributesCompatParcelizer, this.read, polymorphicTypeValidator);
                }
            } else {
                for (int i = 0; i < this.RemoteActionCompatParcelizer.size(); i++) {
                    AudioAttributesCompatParcelizer(audioAttributesCompatParcelizer, this.RemoteActionCompatParcelizer.get(i), polymorphicTypeValidator);
                }
                if (!this.RemoteActionCompatParcelizer.contains(this.read)) {
                    AudioAttributesCompatParcelizer(audioAttributesCompatParcelizer, this.read, polymorphicTypeValidator);
                }
            }
            this.AudioAttributesCompatParcelizer = audioAttributesCompatParcelizer.AudioAttributesCompatParcelizer();
        }

        private void AudioAttributesCompatParcelizer(onMoovContainerAtomRead.AudioAttributesCompatParcelizer<StdKeySerializers.write, PolymorphicTypeValidator> audioAttributesCompatParcelizer, StdKeySerializers.write writeVar, PolymorphicTypeValidator polymorphicTypeValidator) {
            if (writeVar != null) {
                if (polymorphicTypeValidator.read(writeVar.AudioAttributesCompatParcelizer) != -1) {
                    audioAttributesCompatParcelizer.read(writeVar, polymorphicTypeValidator);
                    return;
                }
                PolymorphicTypeValidator polymorphicTypeValidator2 = this.AudioAttributesCompatParcelizer.get(writeVar);
                if (polymorphicTypeValidator2 != null) {
                    audioAttributesCompatParcelizer.read(writeVar, polymorphicTypeValidator2);
                }
            }
        }

        private static StdKeySerializers.write read(isUnsafeBaseType isunsafebasetype, initExtraTracks<StdKeySerializers.write> initextratracks, StdKeySerializers.write writeVar, PolymorphicTypeValidator.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
            PolymorphicTypeValidator polymorphicTypeValidatorOnPrepare = isunsafebasetype.onPrepare();
            int iOnFastForward = isunsafebasetype.onFastForward();
            Object objWrite = polymorphicTypeValidatorOnPrepare.RemoteActionCompatParcelizer() ? null : polymorphicTypeValidatorOnPrepare.write(iOnFastForward);
            int iWrite = (isunsafebasetype.setSessionImpl() || polymorphicTypeValidatorOnPrepare.RemoteActionCompatParcelizer()) ? -1 : polymorphicTypeValidatorOnPrepare.AudioAttributesCompatParcelizer(iOnFastForward, audioAttributesCompatParcelizer).write(LaissezFaireSubTypeValidator.IconCompatParcelizer(isunsafebasetype.onPlayFromUri()) - audioAttributesCompatParcelizer.IconCompatParcelizer());
            for (int i = 0; i < initextratracks.size(); i++) {
                StdKeySerializers.write writeVar2 = initextratracks.get(i);
                if (write(writeVar2, objWrite, isunsafebasetype.setSessionImpl(), isunsafebasetype.onPlay(), isunsafebasetype.onPause(), iWrite)) {
                    return writeVar2;
                }
            }
            if (initextratracks.isEmpty() && writeVar != null) {
                if (write(writeVar, objWrite, isunsafebasetype.setSessionImpl(), isunsafebasetype.onPlay(), isunsafebasetype.onPause(), iWrite)) {
                    return writeVar;
                }
            }
            return null;
        }

        private static boolean write(StdKeySerializers.write writeVar, Object obj, boolean z, int i, int i2, int i3) {
            if (!writeVar.AudioAttributesCompatParcelizer.equals(obj)) {
                return false;
            }
            if (z && writeVar.write == i && writeVar.read == i2) {
                return true;
            }
            return !z && writeVar.write == -1 && writeVar.IconCompatParcelizer == i3;
        }
    }
}
