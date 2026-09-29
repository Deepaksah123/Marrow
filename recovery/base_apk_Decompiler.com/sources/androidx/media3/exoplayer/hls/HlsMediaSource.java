package androidx.media3.exoplayer.hls;

import android.os.Looper;
import androidx.media3.common.StreamKey;
import com.google.android.exoplayer2.C;
import java.io.IOException;
import java.util.List;
import kotlin.AtomicReferenceSerializer;
import kotlin.BeanSerializerBase;
import kotlin.ClassSerializer;
import kotlin.DateSerializer;
import kotlin.DateTimeSerializerBase;
import kotlin.EnumSerializer;
import kotlin.JsonSerializableSchema;
import kotlin.LaissezFaireSubTypeValidator;
import kotlin.NumberSerializers1;
import kotlin.PropertySerializerMapMulti;
import kotlin.SerializableSerializer;
import kotlin.SimpleBeanPropertyFilter;
import kotlin.StdJdkSerializersAtomicIntegerSerializer;
import kotlin.StdKeySerializer;
import kotlin.StdKeySerializers;
import kotlin.StdKeySerializersDefault;
import kotlin.TokenBufferSerializer;
import kotlin.TypeNameIdResolver;
import kotlin._acceptJsonFormatVisitor;
import kotlin._findWellKnownSimple;
import kotlin._fromClass;
import kotlin._getReferenced;
import kotlin._getReferencedIfPresent;
import kotlin._hasTypeResolver;
import kotlin._isShapeWrittenUsingIndex;
import kotlin._resolveSuperClass;
import kotlin._serializeAsIndex;
import kotlin._serializeWithObjectId;
import kotlin._unknownType;
import kotlin._useStatic;
import kotlin.buildTypeSerializer;
import kotlin.isSafeSubType;
import kotlin.matchesUntyped;
import kotlin.withTimeZone;

/* JADX INFO: loaded from: classes2.dex */
public final class HlsMediaSource extends NumberSerializers1 implements _serializeAsIndex.write {
    public static final int METADATA_TYPE_EMSG = 3;
    public static final int METADATA_TYPE_ID3 = 1;
    private final boolean allowChunklessPreparation;
    private final _fromClass cmcdConfiguration;
    private final _useStatic compositeSequenceableLoaderFactory;
    private final _getReferenced dataSourceFactory;
    private final matchesUntyped drmSessionManager;
    private final long elapsedRealTimeOffsetMs;
    private final _getReferencedIfPresent extractorFactory;
    private JsonSerializableSchema.AudioAttributesImplApi26Parcelizer liveConfiguration;
    private final _resolveSuperClass loadErrorHandlingPolicy;
    private JsonSerializableSchema mediaItem;
    private TypeNameIdResolver mediaTransferListener;
    private final int metadataType;
    private final _serializeAsIndex playlistTracker;
    private final long timestampAdjusterInitializationTimeoutMs;
    private final boolean useSessionKeys;

    static {
        isSafeSubType.AudioAttributesCompatParcelizer("media3.exoplayer.hls");
    }

    public static final class Factory implements StdKeySerializersDefault {
        private boolean AudioAttributesCompatParcelizer;
        private _resolveSuperClass AudioAttributesImplApi21Parcelizer;
        private int AudioAttributesImplApi26Parcelizer;
        private long AudioAttributesImplBaseParcelizer;
        private _fromClass.IconCompatParcelizer IconCompatParcelizer;
        private final _getReferenced MediaBrowserCompatCustomActionResultReceiver;
        private _getReferencedIfPresent MediaBrowserCompatItemReceiver;
        private _isShapeWrittenUsingIndex MediaBrowserCompatMediaItem;
        private boolean MediaBrowserCompatSearchResultReceiver;
        private long MediaDescriptionCompat;
        private _serializeAsIndex.AudioAttributesCompatParcelizer MediaMetadataCompat;
        private SimpleBeanPropertyFilter RemoteActionCompatParcelizer;
        private _useStatic read;

        public Factory(_hasTypeResolver.write writeVar) {
            this(new AtomicReferenceSerializer(writeVar));
        }

        private Factory(_getReferenced _getreferenced) {
            this.MediaBrowserCompatCustomActionResultReceiver = (_getReferenced) buildTypeSerializer.IconCompatParcelizer(_getreferenced);
            this.RemoteActionCompatParcelizer = new PropertySerializerMapMulti();
            this.MediaBrowserCompatMediaItem = new DateSerializer();
            this.MediaMetadataCompat = DateTimeSerializerBase.AudioAttributesCompatParcelizer;
            this.MediaBrowserCompatItemReceiver = _getReferencedIfPresent.write;
            this.AudioAttributesImplApi21Parcelizer = new _unknownType();
            this.read = new SerializableSerializer();
            this.AudioAttributesImplApi26Parcelizer = 1;
            this.AudioAttributesImplBaseParcelizer = C.TIME_UNSET;
            this.AudioAttributesCompatParcelizer = true;
            write(true);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // o.StdKeySerializers.AudioAttributesCompatParcelizer
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Factory read(_resolveSuperClass _resolvesuperclass) {
            this.AudioAttributesImplApi21Parcelizer = (_resolveSuperClass) buildTypeSerializer.write(_resolvesuperclass, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
            return this;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // o.StdKeySerializers.AudioAttributesCompatParcelizer
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Factory IconCompatParcelizer(withTimeZone.IconCompatParcelizer iconCompatParcelizer) {
            this.MediaBrowserCompatItemReceiver.IconCompatParcelizer((withTimeZone.IconCompatParcelizer) buildTypeSerializer.IconCompatParcelizer(iconCompatParcelizer));
            return this;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // o.StdKeySerializers.AudioAttributesCompatParcelizer
        @Deprecated
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Factory write(boolean z) {
            this.MediaBrowserCompatItemReceiver.write(z);
            return this;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // o.StdKeySerializers.AudioAttributesCompatParcelizer
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Factory read(_fromClass.IconCompatParcelizer iconCompatParcelizer) {
            this.IconCompatParcelizer = (_fromClass.IconCompatParcelizer) buildTypeSerializer.IconCompatParcelizer(iconCompatParcelizer);
            return this;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // o.StdKeySerializers.AudioAttributesCompatParcelizer
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Factory write(SimpleBeanPropertyFilter simpleBeanPropertyFilter) {
            this.RemoteActionCompatParcelizer = (SimpleBeanPropertyFilter) buildTypeSerializer.write(simpleBeanPropertyFilter, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.");
            return this;
        }

        @Override // o.StdKeySerializers.AudioAttributesCompatParcelizer
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public final HlsMediaSource write(JsonSerializableSchema jsonSerializableSchema) {
            JsonSerializableSchema.AudioAttributesImplApi21Parcelizer audioAttributesImplApi21Parcelizer = jsonSerializableSchema.AudioAttributesCompatParcelizer;
            _isShapeWrittenUsingIndex _isshapewrittenusingindex = this.MediaBrowserCompatMediaItem;
            List<StreamKey> list = jsonSerializableSchema.AudioAttributesCompatParcelizer.AudioAttributesImplApi21Parcelizer;
            _isShapeWrittenUsingIndex classSerializer = !list.isEmpty() ? new ClassSerializer(_isshapewrittenusingindex, list) : _isshapewrittenusingindex;
            _fromClass.IconCompatParcelizer iconCompatParcelizer = this.IconCompatParcelizer;
            _fromClass _fromclassWrite = iconCompatParcelizer == null ? null : iconCompatParcelizer.write(jsonSerializableSchema);
            _getReferenced _getreferenced = this.MediaBrowserCompatCustomActionResultReceiver;
            _getReferencedIfPresent _getreferencedifpresent = this.MediaBrowserCompatItemReceiver;
            _useStatic _usestatic = this.read;
            matchesUntyped matchesuntyped = this.RemoteActionCompatParcelizer.read(jsonSerializableSchema);
            _resolveSuperClass _resolvesuperclass = this.AudioAttributesImplApi21Parcelizer;
            return new HlsMediaSource(jsonSerializableSchema, _getreferenced, _getreferencedifpresent, _usestatic, _fromclassWrite, matchesuntyped, _resolvesuperclass, this.MediaMetadataCompat.read(this.MediaBrowserCompatCustomActionResultReceiver, _resolvesuperclass, classSerializer), this.AudioAttributesImplBaseParcelizer, this.AudioAttributesCompatParcelizer, this.AudioAttributesImplApi26Parcelizer, this.MediaBrowserCompatSearchResultReceiver, this.MediaDescriptionCompat);
        }
    }

    private HlsMediaSource(JsonSerializableSchema jsonSerializableSchema, _getReferenced _getreferenced, _getReferencedIfPresent _getreferencedifpresent, _useStatic _usestatic, _fromClass _fromclass, matchesUntyped matchesuntyped, _resolveSuperClass _resolvesuperclass, _serializeAsIndex _serializeasindex, long j, boolean z, int i, boolean z2, long j2) {
        this.mediaItem = jsonSerializableSchema;
        this.liveConfiguration = jsonSerializableSchema.RemoteActionCompatParcelizer;
        this.dataSourceFactory = _getreferenced;
        this.extractorFactory = _getreferencedifpresent;
        this.compositeSequenceableLoaderFactory = _usestatic;
        this.cmcdConfiguration = _fromclass;
        this.drmSessionManager = matchesuntyped;
        this.loadErrorHandlingPolicy = _resolvesuperclass;
        this.playlistTracker = _serializeasindex;
        this.elapsedRealTimeOffsetMs = j;
        this.allowChunklessPreparation = z;
        this.metadataType = i;
        this.useSessionKeys = z2;
        this.timestampAdjusterInitializationTimeoutMs = j2;
    }

    @Override // kotlin.StdKeySerializers
    public final JsonSerializableSchema getMediaItem() {
        JsonSerializableSchema jsonSerializableSchema;
        synchronized (this) {
            jsonSerializableSchema = this.mediaItem;
        }
        return jsonSerializableSchema;
    }

    @Override // kotlin.StdKeySerializers
    public final boolean canUpdateMediaItem(JsonSerializableSchema jsonSerializableSchema) {
        JsonSerializableSchema mediaItem = getMediaItem();
        JsonSerializableSchema.AudioAttributesImplApi21Parcelizer audioAttributesImplApi21Parcelizer = (JsonSerializableSchema.AudioAttributesImplApi21Parcelizer) buildTypeSerializer.IconCompatParcelizer(mediaItem.AudioAttributesCompatParcelizer);
        JsonSerializableSchema.AudioAttributesImplApi21Parcelizer audioAttributesImplApi21Parcelizer2 = jsonSerializableSchema.AudioAttributesCompatParcelizer;
        return audioAttributesImplApi21Parcelizer2 != null && audioAttributesImplApi21Parcelizer2.MediaBrowserCompatItemReceiver.equals(audioAttributesImplApi21Parcelizer.MediaBrowserCompatItemReceiver) && audioAttributesImplApi21Parcelizer2.AudioAttributesImplApi21Parcelizer.equals(audioAttributesImplApi21Parcelizer.AudioAttributesImplApi21Parcelizer) && LaissezFaireSubTypeValidator.read(audioAttributesImplApi21Parcelizer2.read, audioAttributesImplApi21Parcelizer.read) && mediaItem.RemoteActionCompatParcelizer.equals(jsonSerializableSchema.RemoteActionCompatParcelizer);
    }

    @Override // kotlin.StdKeySerializers
    public final void updateMediaItem(JsonSerializableSchema jsonSerializableSchema) {
        synchronized (this) {
            this.mediaItem = jsonSerializableSchema;
        }
    }

    @Override // kotlin.NumberSerializers1
    public final void prepareSourceInternal(TypeNameIdResolver typeNameIdResolver) {
        this.mediaTransferListener = typeNameIdResolver;
        this.drmSessionManager.write((Looper) buildTypeSerializer.IconCompatParcelizer(Looper.myLooper()), getPlayerId());
        this.drmSessionManager.IconCompatParcelizer();
        this.playlistTracker.read(((JsonSerializableSchema.AudioAttributesImplApi21Parcelizer) buildTypeSerializer.IconCompatParcelizer(getMediaItem().AudioAttributesCompatParcelizer)).MediaBrowserCompatItemReceiver, createEventDispatcher(null), this);
    }

    @Override // kotlin.StdKeySerializers
    public final void maybeThrowSourceInfoRefreshError() throws IOException {
        this.playlistTracker.read();
    }

    @Override // kotlin.StdKeySerializers
    public final StdJdkSerializersAtomicIntegerSerializer createPeriod(StdKeySerializers.write writeVar, _findWellKnownSimple _findwellknownsimple, long j) {
        StdKeySerializer.read readVarCreateEventDispatcher = createEventDispatcher(writeVar);
        return new _serializeWithObjectId(this.extractorFactory, this.playlistTracker, this.dataSourceFactory, this.mediaTransferListener, this.cmcdConfiguration, this.drmSessionManager, createDrmEventDispatcher(writeVar), this.loadErrorHandlingPolicy, readVarCreateEventDispatcher, _findwellknownsimple, this.compositeSequenceableLoaderFactory, this.allowChunklessPreparation, this.metadataType, this.useSessionKeys, getPlayerId(), this.timestampAdjusterInitializationTimeoutMs);
    }

    @Override // kotlin.StdKeySerializers
    public final void releasePeriod(StdJdkSerializersAtomicIntegerSerializer stdJdkSerializersAtomicIntegerSerializer) {
        ((_serializeWithObjectId) stdJdkSerializersAtomicIntegerSerializer).MediaBrowserCompatCustomActionResultReceiver();
    }

    @Override // kotlin.NumberSerializers1
    public final void releaseSourceInternal() {
        this.playlistTracker.RemoteActionCompatParcelizer();
        this.drmSessionManager.write();
    }

    @Override // o._serializeAsIndex.write
    public final void onPrimaryPlaylistRefreshed(_acceptJsonFormatVisitor _acceptjsonformatvisitor) {
        TokenBufferSerializer tokenBufferSerializerCreateTimelineForOnDemand;
        long jAudioAttributesCompatParcelizer = _acceptjsonformatvisitor.AudioAttributesImplApi26Parcelizer ? LaissezFaireSubTypeValidator.AudioAttributesCompatParcelizer(_acceptjsonformatvisitor.onCommand) : -9223372036854775807L;
        long j = (_acceptjsonformatvisitor.MediaBrowserCompatItemReceiver == 2 || _acceptjsonformatvisitor.MediaBrowserCompatItemReceiver == 1) ? jAudioAttributesCompatParcelizer : -9223372036854775807L;
        BeanSerializerBase beanSerializerBase = new BeanSerializerBase((EnumSerializer) buildTypeSerializer.IconCompatParcelizer(this.playlistTracker.AudioAttributesCompatParcelizer()), _acceptjsonformatvisitor);
        if (this.playlistTracker.IconCompatParcelizer()) {
            tokenBufferSerializerCreateTimelineForOnDemand = createTimelineForLive(_acceptjsonformatvisitor, j, jAudioAttributesCompatParcelizer, beanSerializerBase);
        } else {
            tokenBufferSerializerCreateTimelineForOnDemand = createTimelineForOnDemand(_acceptjsonformatvisitor, j, jAudioAttributesCompatParcelizer, beanSerializerBase);
        }
        refreshSourceInfo(tokenBufferSerializerCreateTimelineForOnDemand);
    }

    private TokenBufferSerializer createTimelineForLive(_acceptJsonFormatVisitor _acceptjsonformatvisitor, long j, long j2, BeanSerializerBase beanSerializerBase) {
        long targetLiveOffsetUs;
        long jWrite = _acceptjsonformatvisitor.onCommand - this.playlistTracker.write();
        long j3 = _acceptjsonformatvisitor.RemoteActionCompatParcelizer ? _acceptjsonformatvisitor.AudioAttributesCompatParcelizer + jWrite : -9223372036854775807L;
        long liveEdgeOffsetUs = getLiveEdgeOffsetUs(_acceptjsonformatvisitor);
        if (this.liveConfiguration.AudioAttributesCompatParcelizer != C.TIME_UNSET) {
            targetLiveOffsetUs = LaissezFaireSubTypeValidator.IconCompatParcelizer(this.liveConfiguration.AudioAttributesCompatParcelizer);
        } else {
            targetLiveOffsetUs = getTargetLiveOffsetUs(_acceptjsonformatvisitor, liveEdgeOffsetUs);
        }
        updateLiveConfiguration(_acceptjsonformatvisitor, LaissezFaireSubTypeValidator.read(targetLiveOffsetUs, liveEdgeOffsetUs, _acceptjsonformatvisitor.AudioAttributesCompatParcelizer + liveEdgeOffsetUs));
        return new TokenBufferSerializer(j, j2, j3, _acceptjsonformatvisitor.AudioAttributesCompatParcelizer, jWrite, getLiveWindowDefaultStartPositionUs(_acceptjsonformatvisitor, liveEdgeOffsetUs), true, !_acceptjsonformatvisitor.RemoteActionCompatParcelizer, _acceptjsonformatvisitor.MediaBrowserCompatItemReceiver == 2 && _acceptjsonformatvisitor.read, beanSerializerBase, getMediaItem(), this.liveConfiguration);
    }

    private TokenBufferSerializer createTimelineForOnDemand(_acceptJsonFormatVisitor _acceptjsonformatvisitor, long j, long j2, BeanSerializerBase beanSerializerBase) {
        long j3;
        if (_acceptjsonformatvisitor.MediaMetadataCompat == C.TIME_UNSET || _acceptjsonformatvisitor.MediaDescriptionCompat.isEmpty()) {
            j3 = 0;
        } else if (_acceptjsonformatvisitor.MediaBrowserCompatCustomActionResultReceiver || _acceptjsonformatvisitor.MediaMetadataCompat == _acceptjsonformatvisitor.AudioAttributesCompatParcelizer) {
            j3 = _acceptjsonformatvisitor.MediaMetadataCompat;
        } else {
            j3 = findClosestPrecedingSegment(_acceptjsonformatvisitor.MediaDescriptionCompat, _acceptjsonformatvisitor.MediaMetadataCompat).MediaBrowserCompatMediaItem;
        }
        return new TokenBufferSerializer(j, j2, _acceptjsonformatvisitor.AudioAttributesCompatParcelizer, _acceptjsonformatvisitor.AudioAttributesCompatParcelizer, 0L, j3, true, false, true, beanSerializerBase, getMediaItem(), null);
    }

    private long getLiveEdgeOffsetUs(_acceptJsonFormatVisitor _acceptjsonformatvisitor) {
        if (_acceptjsonformatvisitor.AudioAttributesImplApi26Parcelizer) {
            return LaissezFaireSubTypeValidator.IconCompatParcelizer(LaissezFaireSubTypeValidator.RemoteActionCompatParcelizer(this.elapsedRealTimeOffsetMs)) - _acceptjsonformatvisitor.IconCompatParcelizer();
        }
        return 0L;
    }

    private long getLiveWindowDefaultStartPositionUs(_acceptJsonFormatVisitor _acceptjsonformatvisitor, long j) {
        long jIconCompatParcelizer;
        if (_acceptjsonformatvisitor.MediaMetadataCompat != C.TIME_UNSET) {
            jIconCompatParcelizer = _acceptjsonformatvisitor.MediaMetadataCompat;
        } else {
            jIconCompatParcelizer = (_acceptjsonformatvisitor.AudioAttributesCompatParcelizer + j) - LaissezFaireSubTypeValidator.IconCompatParcelizer(this.liveConfiguration.AudioAttributesCompatParcelizer);
        }
        if (_acceptjsonformatvisitor.MediaBrowserCompatCustomActionResultReceiver) {
            return jIconCompatParcelizer;
        }
        _acceptJsonFormatVisitor.read readVarFindClosestPrecedingIndependentPart = findClosestPrecedingIndependentPart(_acceptjsonformatvisitor.onAddQueueItem, jIconCompatParcelizer);
        if (readVarFindClosestPrecedingIndependentPart != null) {
            return readVarFindClosestPrecedingIndependentPart.MediaBrowserCompatMediaItem;
        }
        if (_acceptjsonformatvisitor.MediaDescriptionCompat.isEmpty()) {
            return 0L;
        }
        _acceptJsonFormatVisitor.write writeVarFindClosestPrecedingSegment = findClosestPrecedingSegment(_acceptjsonformatvisitor.MediaDescriptionCompat, jIconCompatParcelizer);
        _acceptJsonFormatVisitor.read readVarFindClosestPrecedingIndependentPart2 = findClosestPrecedingIndependentPart(writeVarFindClosestPrecedingSegment.RemoteActionCompatParcelizer, jIconCompatParcelizer);
        if (readVarFindClosestPrecedingIndependentPart2 != null) {
            return readVarFindClosestPrecedingIndependentPart2.MediaBrowserCompatMediaItem;
        }
        return writeVarFindClosestPrecedingSegment.MediaBrowserCompatMediaItem;
    }

    private void updateLiveConfiguration(_acceptJsonFormatVisitor _acceptjsonformatvisitor, long j) {
        JsonSerializableSchema.AudioAttributesImplApi26Parcelizer audioAttributesImplApi26Parcelizer = getMediaItem().RemoteActionCompatParcelizer;
        boolean z = audioAttributesImplApi26Parcelizer.write == -3.4028235E38f && audioAttributesImplApi26Parcelizer.RemoteActionCompatParcelizer == -3.4028235E38f && _acceptjsonformatvisitor.RatingCompat.AudioAttributesCompatParcelizer == C.TIME_UNSET && _acceptjsonformatvisitor.RatingCompat.read == C.TIME_UNSET;
        this.liveConfiguration = new JsonSerializableSchema.AudioAttributesImplApi26Parcelizer.read().RemoteActionCompatParcelizer(LaissezFaireSubTypeValidator.AudioAttributesCompatParcelizer(j)).RemoteActionCompatParcelizer(z ? 1.0f : this.liveConfiguration.write).AudioAttributesCompatParcelizer(z ? 1.0f : this.liveConfiguration.RemoteActionCompatParcelizer).write();
    }

    private static long getTargetLiveOffsetUs(_acceptJsonFormatVisitor _acceptjsonformatvisitor, long j) {
        long j2;
        _acceptJsonFormatVisitor.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = _acceptjsonformatvisitor.RatingCompat;
        if (_acceptjsonformatvisitor.MediaMetadataCompat != C.TIME_UNSET) {
            j2 = _acceptjsonformatvisitor.AudioAttributesCompatParcelizer - _acceptjsonformatvisitor.MediaMetadataCompat;
        } else if (audioAttributesCompatParcelizer.read != C.TIME_UNSET && _acceptjsonformatvisitor.AudioAttributesImplApi21Parcelizer != C.TIME_UNSET) {
            j2 = audioAttributesCompatParcelizer.read;
        } else if (audioAttributesCompatParcelizer.AudioAttributesCompatParcelizer != C.TIME_UNSET) {
            j2 = audioAttributesCompatParcelizer.AudioAttributesCompatParcelizer;
        } else {
            j2 = 3 * _acceptjsonformatvisitor.onCustomAction;
        }
        return j2 + j;
    }

    private static _acceptJsonFormatVisitor.read findClosestPrecedingIndependentPart(List<_acceptJsonFormatVisitor.read> list, long j) {
        _acceptJsonFormatVisitor.read readVar = null;
        for (int i = 0; i < list.size(); i++) {
            _acceptJsonFormatVisitor.read readVar2 = list.get(i);
            if (readVar2.MediaBrowserCompatMediaItem > j || !readVar2.RemoteActionCompatParcelizer) {
                if (readVar2.MediaBrowserCompatMediaItem > j) {
                    break;
                }
            } else {
                readVar = readVar2;
            }
        }
        return readVar;
    }

    private static _acceptJsonFormatVisitor.write findClosestPrecedingSegment(List<_acceptJsonFormatVisitor.write> list, long j) {
        return list.get(LaissezFaireSubTypeValidator.AudioAttributesCompatParcelizer((List<? extends Comparable<? super Long>>) list, Long.valueOf(j), true));
    }
}
