package androidx.media3.exoplayer.dash;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import androidx.media3.common.StreamKey;
import com.google.android.exoplayer2.C;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.RoundingMode;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.AttributePropertyWriter;
import kotlin.FilteredBeanPropertyWriter;
import kotlin.FilteredBeanPropertyWriterMultiView;
import kotlin.FilteredBeanPropertyWriterSingleView;
import kotlin.IndexedStringListSerializer;
import kotlin.JsonSerializableSchema;
import kotlin.LaissezFaireSubTypeValidator;
import kotlin.MapEntrySerializer;
import kotlin.NumberSerializers1;
import kotlin.NumberSerializersDoubleSerializer;
import kotlin.PolymorphicTypeValidator;
import kotlin.PropertySerializerMapEmpty;
import kotlin.PropertySerializerMapMulti;
import kotlin.SchemaAware;
import kotlin.SerializableSerializer;
import kotlin.SerializerFactory;
import kotlin.Serializers;
import kotlin.SimpleBeanPropertyFilter;
import kotlin.StdArraySerializersShortArraySerializer;
import kotlin.StdDelegatingSerializer;
import kotlin.StdJdkSerializersAtomicIntegerSerializer;
import kotlin.StdKeySerializer;
import kotlin.StdKeySerializers;
import kotlin.StdKeySerializersDefault;
import kotlin.TypeNameIdResolver;
import kotlin._findWellKnownSimple;
import kotlin._fromClass;
import kotlin._hasTypeResolver;
import kotlin._inView;
import kotlin._resolveSuperClass;
import kotlin._suppressableValue;
import kotlin._unknownType;
import kotlin._useStatic;
import kotlin.addTypedSerializer;
import kotlin.buildTypeSerializer;
import kotlin.classForName;
import kotlin.constructCollectionType;
import kotlin.constructGeneralizedType;
import kotlin.isSafeSubType;
import kotlin.matchesUntyped;
import kotlin.parseIlstElement;
import kotlin.parseMdtaFromMeta;
import kotlin.prune;
import kotlin.resolveMemberType;
import kotlin.serializeContents;
import kotlin.typedValueSerializer;
import kotlin.withTimeZone;

/* JADX INFO: loaded from: classes2.dex */
public final class DashMediaSource extends NumberSerializers1 {
    private _hasTypeResolver AudioAttributesCompatParcelizer;
    private final matchesUntyped AudioAttributesImplApi21Parcelizer;
    private long AudioAttributesImplApi26Parcelizer;
    private final long AudioAttributesImplBaseParcelizer;
    private final _fromClass IconCompatParcelizer;
    private long MediaBrowserCompatCustomActionResultReceiver;
    private int MediaBrowserCompatItemReceiver;
    private Uri MediaBrowserCompatMediaItem;
    private constructCollectionType MediaBrowserCompatSearchResultReceiver;
    private IOException MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    private Handler MediaDescriptionCompat;
    private JsonSerializableSchema.AudioAttributesImplApi26Parcelizer MediaMetadataCompat;
    private final _resolveSuperClass RatingCompat;
    private final addTypedSerializer.write RemoteActionCompatParcelizer;
    private FilteredBeanPropertyWriterMultiView handleMediaPlayPauseIfPendingOnHandler;
    private final AudioAttributesCompatParcelizer onAddQueueItem;
    private final StdKeySerializer.read onCommand;
    private final _hasTypeResolver.write onCustomAction;
    private long onFastForward;
    private boolean onMediaButtonEvent;
    private final classForName onPause;
    private long onPlay;
    private final constructGeneralizedType.IconCompatParcelizer<? extends FilteredBeanPropertyWriterMultiView> onPlayFromMediaId;
    private final long onPlayFromSearch;
    private TypeNameIdResolver onPlayFromUri;
    private Uri onPrepare;
    private final Object onPrepareFromMediaId;
    private JsonSerializableSchema onPrepareFromSearch;
    private final AttributePropertyWriter.IconCompatParcelizer onPrepareFromUri;
    private final Runnable onRemoveQueueItem;
    private final boolean onRemoveQueueItemAt;
    private final Runnable onRewind;
    private final SparseArray<_suppressableValue> onSeekTo;
    private int onSetRating;
    private final _useStatic read;
    private final typedValueSerializer write;

    /* synthetic */ DashMediaSource(JsonSerializableSchema jsonSerializableSchema, _hasTypeResolver.write writeVar, constructGeneralizedType.IconCompatParcelizer iconCompatParcelizer, addTypedSerializer.write writeVar2, _useStatic _usestatic, _fromClass _fromclass, matchesUntyped matchesuntyped, _resolveSuperClass _resolvesuperclass, long j, long j2) {
        this(jsonSerializableSchema, null, writeVar, iconCompatParcelizer, writeVar2, _usestatic, _fromclass, matchesuntyped, _resolvesuperclass, j, j2);
    }

    static {
        isSafeSubType.AudioAttributesCompatParcelizer("media3.exoplayer.dash");
    }

    public static final class Factory implements StdKeySerializersDefault {
        private final addTypedSerializer.write AudioAttributesCompatParcelizer;
        private long AudioAttributesImplApi21Parcelizer;
        private final _hasTypeResolver.write AudioAttributesImplApi26Parcelizer;
        private long AudioAttributesImplBaseParcelizer;
        private SimpleBeanPropertyFilter IconCompatParcelizer;
        private constructGeneralizedType.IconCompatParcelizer<? extends FilteredBeanPropertyWriterMultiView> MediaBrowserCompatCustomActionResultReceiver;
        private _resolveSuperClass MediaBrowserCompatItemReceiver;
        private _useStatic RemoteActionCompatParcelizer;
        private _fromClass.IconCompatParcelizer read;

        public Factory(_hasTypeResolver.write writeVar) {
            this(new FilteredBeanPropertyWriter.read(writeVar), writeVar);
        }

        private Factory(addTypedSerializer.write writeVar, _hasTypeResolver.write writeVar2) {
            this.AudioAttributesCompatParcelizer = (addTypedSerializer.write) buildTypeSerializer.IconCompatParcelizer(writeVar);
            this.AudioAttributesImplApi26Parcelizer = writeVar2;
            this.IconCompatParcelizer = new PropertySerializerMapMulti();
            this.MediaBrowserCompatItemReceiver = new _unknownType();
            this.AudioAttributesImplApi21Parcelizer = 30000L;
            this.AudioAttributesImplBaseParcelizer = com.google.android.exoplayer2.source.dash.DashMediaSource.MIN_LIVE_DEFAULT_START_POSITION_US;
            this.RemoteActionCompatParcelizer = new SerializableSerializer();
            write(true);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // o.StdKeySerializers.AudioAttributesCompatParcelizer
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Factory read(_fromClass.IconCompatParcelizer iconCompatParcelizer) {
            this.read = (_fromClass.IconCompatParcelizer) buildTypeSerializer.IconCompatParcelizer(iconCompatParcelizer);
            return this;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // o.StdKeySerializers.AudioAttributesCompatParcelizer
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Factory write(SimpleBeanPropertyFilter simpleBeanPropertyFilter) {
            this.IconCompatParcelizer = (SimpleBeanPropertyFilter) buildTypeSerializer.write(simpleBeanPropertyFilter, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.");
            return this;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // o.StdKeySerializers.AudioAttributesCompatParcelizer
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Factory read(_resolveSuperClass _resolvesuperclass) {
            this.MediaBrowserCompatItemReceiver = (_resolveSuperClass) buildTypeSerializer.write(_resolvesuperclass, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
            return this;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // o.StdKeySerializers.AudioAttributesCompatParcelizer
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public Factory IconCompatParcelizer(withTimeZone.IconCompatParcelizer iconCompatParcelizer) {
            this.AudioAttributesCompatParcelizer.IconCompatParcelizer((withTimeZone.IconCompatParcelizer) buildTypeSerializer.IconCompatParcelizer(iconCompatParcelizer));
            return this;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // o.StdKeySerializers.AudioAttributesCompatParcelizer
        @Deprecated
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public Factory write(boolean z) {
            this.AudioAttributesCompatParcelizer.IconCompatParcelizer(z);
            return this;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // o.StdKeySerializers.AudioAttributesCompatParcelizer
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public DashMediaSource write(JsonSerializableSchema jsonSerializableSchema) {
            JsonSerializableSchema.AudioAttributesImplApi21Parcelizer audioAttributesImplApi21Parcelizer = jsonSerializableSchema.AudioAttributesCompatParcelizer;
            _inView _inview = new _inView();
            List<StreamKey> list = jsonSerializableSchema.AudioAttributesCompatParcelizer.AudioAttributesImplApi21Parcelizer;
            constructGeneralizedType.IconCompatParcelizer numberSerializersDoubleSerializer = !list.isEmpty() ? new NumberSerializersDoubleSerializer(_inview, list) : _inview;
            _fromClass.IconCompatParcelizer iconCompatParcelizer = this.read;
            return new DashMediaSource(jsonSerializableSchema, this.AudioAttributesImplApi26Parcelizer, numberSerializersDoubleSerializer, this.AudioAttributesCompatParcelizer, this.RemoteActionCompatParcelizer, iconCompatParcelizer == null ? null : iconCompatParcelizer.write(jsonSerializableSchema), this.IconCompatParcelizer.read(jsonSerializableSchema), this.MediaBrowserCompatItemReceiver, this.AudioAttributesImplApi21Parcelizer, this.AudioAttributesImplBaseParcelizer);
        }
    }

    private DashMediaSource(JsonSerializableSchema jsonSerializableSchema, FilteredBeanPropertyWriterMultiView filteredBeanPropertyWriterMultiView, _hasTypeResolver.write writeVar, constructGeneralizedType.IconCompatParcelizer<? extends FilteredBeanPropertyWriterMultiView> iconCompatParcelizer, addTypedSerializer.write writeVar2, _useStatic _usestatic, _fromClass _fromclass, matchesUntyped matchesuntyped, _resolveSuperClass _resolvesuperclass, long j, long j2) {
        this.onPrepareFromSearch = jsonSerializableSchema;
        this.MediaMetadataCompat = jsonSerializableSchema.RemoteActionCompatParcelizer;
        this.onPrepare = ((JsonSerializableSchema.AudioAttributesImplApi21Parcelizer) buildTypeSerializer.IconCompatParcelizer(jsonSerializableSchema.AudioAttributesCompatParcelizer)).MediaBrowserCompatItemReceiver;
        this.MediaBrowserCompatMediaItem = jsonSerializableSchema.AudioAttributesCompatParcelizer.MediaBrowserCompatItemReceiver;
        this.handleMediaPlayPauseIfPendingOnHandler = null;
        this.onCustomAction = writeVar;
        this.onPlayFromMediaId = iconCompatParcelizer;
        this.RemoteActionCompatParcelizer = writeVar2;
        this.IconCompatParcelizer = _fromclass;
        this.AudioAttributesImplApi21Parcelizer = matchesuntyped;
        this.RatingCompat = _resolvesuperclass;
        this.AudioAttributesImplBaseParcelizer = j;
        this.onPlayFromSearch = j2;
        this.read = _usestatic;
        this.write = new typedValueSerializer();
        byte b = 0;
        this.onRemoveQueueItemAt = false;
        this.onCommand = createEventDispatcher(null);
        this.onPrepareFromMediaId = new Object();
        this.onSeekTo = new SparseArray<>();
        this.onPrepareFromUri = new write(this, b);
        this.AudioAttributesImplApi26Parcelizer = C.TIME_UNSET;
        this.MediaBrowserCompatCustomActionResultReceiver = C.TIME_UNSET;
        this.onAddQueueItem = new AudioAttributesCompatParcelizer(this, b);
        this.onPause = new RemoteActionCompatParcelizer();
        this.onRewind = new Runnable() { // from class: o._suppressNulls
            @Override // java.lang.Runnable
            public final void run() {
                this.read.AudioAttributesImplApi21Parcelizer();
            }
        };
        this.onRemoveQueueItem = new Runnable() { // from class: o.SerializersBase
            @Override // java.lang.Runnable
            public final void run() {
                this.read.IconCompatParcelizer();
            }
        };
    }

    public final /* synthetic */ void IconCompatParcelizer() {
        read(false);
    }

    @Override // kotlin.StdKeySerializers
    public final JsonSerializableSchema getMediaItem() {
        JsonSerializableSchema jsonSerializableSchema;
        synchronized (this) {
            jsonSerializableSchema = this.onPrepareFromSearch;
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
            this.onPrepareFromSearch = jsonSerializableSchema;
        }
    }

    @Override // kotlin.NumberSerializers1
    public final void prepareSourceInternal(TypeNameIdResolver typeNameIdResolver) {
        this.onPlayFromUri = typeNameIdResolver;
        this.AudioAttributesImplApi21Parcelizer.write(Looper.myLooper(), getPlayerId());
        this.AudioAttributesImplApi21Parcelizer.IconCompatParcelizer();
        if (this.onRemoveQueueItemAt) {
            read(false);
            return;
        }
        this.AudioAttributesCompatParcelizer = this.onCustomAction.write();
        this.MediaBrowserCompatSearchResultReceiver = new constructCollectionType(com.google.android.exoplayer2.source.dash.DashMediaSource.DEFAULT_MEDIA_ID);
        this.MediaDescriptionCompat = LaissezFaireSubTypeValidator.RemoteActionCompatParcelizer();
        AudioAttributesImplApi21Parcelizer();
    }

    @Override // kotlin.StdKeySerializers
    public final void maybeThrowSourceInfoRefreshError() throws IOException {
        this.onPause.read();
    }

    @Override // kotlin.StdKeySerializers
    public final StdJdkSerializersAtomicIntegerSerializer createPeriod(StdKeySerializers.write writeVar, _findWellKnownSimple _findwellknownsimple, long j) {
        int iIntValue = ((Integer) writeVar.AudioAttributesCompatParcelizer).intValue() - this.MediaBrowserCompatItemReceiver;
        StdKeySerializer.read readVarCreateEventDispatcher = createEventDispatcher(writeVar);
        PropertySerializerMapEmpty.read readVarCreateDrmEventDispatcher = createDrmEventDispatcher(writeVar);
        _suppressableValue _suppressablevalue = new _suppressableValue(this.MediaBrowserCompatItemReceiver + iIntValue, this.handleMediaPlayPauseIfPendingOnHandler, this.write, iIntValue, this.RemoteActionCompatParcelizer, this.onPlayFromUri, this.IconCompatParcelizer, this.AudioAttributesImplApi21Parcelizer, readVarCreateDrmEventDispatcher, this.RatingCompat, readVarCreateEventDispatcher, this.MediaBrowserCompatCustomActionResultReceiver, this.onPause, _findwellknownsimple, this.read, this.onPrepareFromUri, getPlayerId());
        this.onSeekTo.put(_suppressablevalue.RemoteActionCompatParcelizer, _suppressablevalue);
        return _suppressablevalue;
    }

    @Override // kotlin.StdKeySerializers
    public final void releasePeriod(StdJdkSerializersAtomicIntegerSerializer stdJdkSerializersAtomicIntegerSerializer) {
        _suppressableValue _suppressablevalue = (_suppressableValue) stdJdkSerializersAtomicIntegerSerializer;
        _suppressablevalue.MediaBrowserCompatCustomActionResultReceiver();
        this.onSeekTo.remove(_suppressablevalue.RemoteActionCompatParcelizer);
    }

    @Override // kotlin.NumberSerializers1
    public final void releaseSourceInternal() {
        this.onMediaButtonEvent = false;
        this.AudioAttributesCompatParcelizer = null;
        constructCollectionType constructcollectiontype = this.MediaBrowserCompatSearchResultReceiver;
        if (constructcollectiontype != null) {
            constructcollectiontype.AudioAttributesImplBaseParcelizer();
            this.MediaBrowserCompatSearchResultReceiver = null;
        }
        this.onFastForward = 0L;
        this.onPlay = 0L;
        this.onPrepare = this.MediaBrowserCompatMediaItem;
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = null;
        Handler handler = this.MediaDescriptionCompat;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.MediaDescriptionCompat = null;
        }
        this.MediaBrowserCompatCustomActionResultReceiver = C.TIME_UNSET;
        this.onSetRating = 0;
        this.AudioAttributesImplApi26Parcelizer = C.TIME_UNSET;
        this.onSeekTo.clear();
        this.write.AudioAttributesCompatParcelizer();
        this.AudioAttributesImplApi21Parcelizer.write();
    }

    final void write() {
        this.MediaDescriptionCompat.removeCallbacks(this.onRemoveQueueItem);
        AudioAttributesImplApi21Parcelizer();
    }

    final void write(long j) {
        long j2 = this.AudioAttributesImplApi26Parcelizer;
        if (j2 == C.TIME_UNSET || j2 < j) {
            this.AudioAttributesImplApi26Parcelizer = j;
        }
    }

    final void read(constructGeneralizedType<FilteredBeanPropertyWriterMultiView> constructgeneralizedtype, long j, long j2) {
        StdDelegatingSerializer stdDelegatingSerializer = new StdDelegatingSerializer(constructgeneralizedtype.RemoteActionCompatParcelizer, constructgeneralizedtype.write, constructgeneralizedtype.MediaBrowserCompatCustomActionResultReceiver(), constructgeneralizedtype.read(), j, j2, constructgeneralizedtype.write());
        long j3 = constructgeneralizedtype.RemoteActionCompatParcelizer;
        this.onCommand.read(stdDelegatingSerializer, constructgeneralizedtype.read);
        FilteredBeanPropertyWriterMultiView filteredBeanPropertyWriterMultiViewRemoteActionCompatParcelizer = constructgeneralizedtype.RemoteActionCompatParcelizer();
        FilteredBeanPropertyWriterMultiView filteredBeanPropertyWriterMultiView = this.handleMediaPlayPauseIfPendingOnHandler;
        int i = filteredBeanPropertyWriterMultiView == null ? 0 : filteredBeanPropertyWriterMultiView.read();
        long j4 = filteredBeanPropertyWriterMultiViewRemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(0).IconCompatParcelizer;
        int i2 = 0;
        while (i2 < i && this.handleMediaPlayPauseIfPendingOnHandler.AudioAttributesCompatParcelizer(i2).IconCompatParcelizer < j4) {
            i2++;
        }
        if (filteredBeanPropertyWriterMultiViewRemoteActionCompatParcelizer.RemoteActionCompatParcelizer) {
            if (i - i2 > filteredBeanPropertyWriterMultiViewRemoteActionCompatParcelizer.read()) {
                prune.RemoteActionCompatParcelizer(com.google.android.exoplayer2.source.dash.DashMediaSource.DEFAULT_MEDIA_ID, "Loaded out of sync manifest");
            } else if (this.AudioAttributesImplApi26Parcelizer != C.TIME_UNSET && filteredBeanPropertyWriterMultiViewRemoteActionCompatParcelizer.AudioAttributesImplBaseParcelizer * 1000 <= this.AudioAttributesImplApi26Parcelizer) {
                StringBuilder sb = new StringBuilder("Loaded stale dynamic manifest: ");
                sb.append(filteredBeanPropertyWriterMultiViewRemoteActionCompatParcelizer.AudioAttributesImplBaseParcelizer);
                sb.append(", ");
                sb.append(this.AudioAttributesImplApi26Parcelizer);
                prune.RemoteActionCompatParcelizer(com.google.android.exoplayer2.source.dash.DashMediaSource.DEFAULT_MEDIA_ID, sb.toString());
            } else {
                this.onSetRating = 0;
            }
            int i3 = this.onSetRating;
            this.onSetRating = i3 + 1;
            if (i3 < this.RatingCompat.write(constructgeneralizedtype.read)) {
                read(AudioAttributesCompatParcelizer());
                return;
            } else {
                this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = new SerializerFactory();
                return;
            }
        }
        this.handleMediaPlayPauseIfPendingOnHandler = filteredBeanPropertyWriterMultiViewRemoteActionCompatParcelizer;
        this.onMediaButtonEvent = filteredBeanPropertyWriterMultiViewRemoteActionCompatParcelizer.RemoteActionCompatParcelizer & this.onMediaButtonEvent;
        this.onFastForward = j - j2;
        this.onPlay = j;
        this.MediaBrowserCompatItemReceiver += i2;
        synchronized (this.onPrepareFromMediaId) {
            if (constructgeneralizedtype.write.AudioAttributesImplBaseParcelizer == this.onPrepare) {
                this.onPrepare = this.handleMediaPlayPauseIfPendingOnHandler.IconCompatParcelizer != null ? this.handleMediaPlayPauseIfPendingOnHandler.IconCompatParcelizer : constructgeneralizedtype.MediaBrowserCompatCustomActionResultReceiver();
            }
        }
        if (this.handleMediaPlayPauseIfPendingOnHandler.RemoteActionCompatParcelizer && this.MediaBrowserCompatCustomActionResultReceiver == C.TIME_UNSET) {
            if (this.handleMediaPlayPauseIfPendingOnHandler.MediaMetadataCompat != null) {
                write(this.handleMediaPlayPauseIfPendingOnHandler.MediaMetadataCompat);
                return;
            } else {
                MediaBrowserCompatItemReceiver();
                return;
            }
        }
        read(true);
    }

    final constructCollectionType.write write(constructGeneralizedType<FilteredBeanPropertyWriterMultiView> constructgeneralizedtype, long j, long j2, IOException iOException, int i) {
        constructCollectionType.write writeVarRemoteActionCompatParcelizer;
        StdDelegatingSerializer stdDelegatingSerializer = new StdDelegatingSerializer(constructgeneralizedtype.RemoteActionCompatParcelizer, constructgeneralizedtype.write, constructgeneralizedtype.MediaBrowserCompatCustomActionResultReceiver(), constructgeneralizedtype.read(), j, j2, constructgeneralizedtype.write());
        long jWrite = this.RatingCompat.write(new _resolveSuperClass.AudioAttributesCompatParcelizer(stdDelegatingSerializer, new StdArraySerializersShortArraySerializer(constructgeneralizedtype.read), iOException, i));
        if (jWrite == C.TIME_UNSET) {
            writeVarRemoteActionCompatParcelizer = constructCollectionType.IconCompatParcelizer;
        } else {
            writeVarRemoteActionCompatParcelizer = constructCollectionType.RemoteActionCompatParcelizer(false, jWrite);
        }
        boolean z = writeVarRemoteActionCompatParcelizer.read();
        this.onCommand.read(stdDelegatingSerializer, constructgeneralizedtype.read, iOException, !z);
        if (!z) {
            long j3 = constructgeneralizedtype.RemoteActionCompatParcelizer;
        }
        return writeVarRemoteActionCompatParcelizer;
    }

    final void write(constructGeneralizedType<Long> constructgeneralizedtype, long j, long j2) {
        StdDelegatingSerializer stdDelegatingSerializer = new StdDelegatingSerializer(constructgeneralizedtype.RemoteActionCompatParcelizer, constructgeneralizedtype.write, constructgeneralizedtype.MediaBrowserCompatCustomActionResultReceiver(), constructgeneralizedtype.read(), j, j2, constructgeneralizedtype.write());
        long j3 = constructgeneralizedtype.RemoteActionCompatParcelizer;
        this.onCommand.read(stdDelegatingSerializer, constructgeneralizedtype.read);
        AudioAttributesCompatParcelizer(constructgeneralizedtype.RemoteActionCompatParcelizer().longValue() - j);
    }

    final constructCollectionType.write AudioAttributesCompatParcelizer(constructGeneralizedType<Long> constructgeneralizedtype, long j, long j2, IOException iOException) {
        this.onCommand.read(new StdDelegatingSerializer(constructgeneralizedtype.RemoteActionCompatParcelizer, constructgeneralizedtype.write, constructgeneralizedtype.MediaBrowserCompatCustomActionResultReceiver(), constructgeneralizedtype.read(), j, j2, constructgeneralizedtype.write()), constructgeneralizedtype.read, iOException, true);
        long j3 = constructgeneralizedtype.RemoteActionCompatParcelizer;
        IconCompatParcelizer(iOException);
        return constructCollectionType.RemoteActionCompatParcelizer;
    }

    final void AudioAttributesCompatParcelizer(constructGeneralizedType<?> constructgeneralizedtype, long j, long j2) {
        StdDelegatingSerializer stdDelegatingSerializer = new StdDelegatingSerializer(constructgeneralizedtype.RemoteActionCompatParcelizer, constructgeneralizedtype.write, constructgeneralizedtype.MediaBrowserCompatCustomActionResultReceiver(), constructgeneralizedtype.read(), j, j2, constructgeneralizedtype.write());
        long j3 = constructgeneralizedtype.RemoteActionCompatParcelizer;
        this.onCommand.IconCompatParcelizer(stdDelegatingSerializer, constructgeneralizedtype.read);
    }

    private void write(MapEntrySerializer mapEntrySerializer) {
        String str = mapEntrySerializer.write;
        if (LaissezFaireSubTypeValidator.read(str, "urn:mpeg:dash:utc:direct:2014") || LaissezFaireSubTypeValidator.read(str, "urn:mpeg:dash:utc:direct:2012")) {
            RemoteActionCompatParcelizer(mapEntrySerializer);
            return;
        }
        if (LaissezFaireSubTypeValidator.read(str, "urn:mpeg:dash:utc:http-iso:2014") || LaissezFaireSubTypeValidator.read(str, "urn:mpeg:dash:utc:http-iso:2012")) {
            AudioAttributesCompatParcelizer(mapEntrySerializer, new read());
            return;
        }
        if (LaissezFaireSubTypeValidator.read(str, "urn:mpeg:dash:utc:http-xsdate:2014") || LaissezFaireSubTypeValidator.read(str, "urn:mpeg:dash:utc:http-xsdate:2012")) {
            AudioAttributesCompatParcelizer(mapEntrySerializer, new MediaBrowserCompatCustomActionResultReceiver((byte) 0));
        } else if (LaissezFaireSubTypeValidator.read(str, "urn:mpeg:dash:utc:ntp:2014") || LaissezFaireSubTypeValidator.read(str, "urn:mpeg:dash:utc:ntp:2012")) {
            MediaBrowserCompatItemReceiver();
        } else {
            IconCompatParcelizer(new IOException("Unsupported UTC timing scheme"));
        }
    }

    private void RemoteActionCompatParcelizer(MapEntrySerializer mapEntrySerializer) {
        try {
            AudioAttributesCompatParcelizer(LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(mapEntrySerializer.RemoteActionCompatParcelizer) - this.onPlay);
        } catch (SchemaAware e) {
            IconCompatParcelizer(e);
        }
    }

    private void AudioAttributesCompatParcelizer(MapEntrySerializer mapEntrySerializer, constructGeneralizedType.IconCompatParcelizer<Long> iconCompatParcelizer) {
        AudioAttributesCompatParcelizer(new constructGeneralizedType(this.AudioAttributesCompatParcelizer, Uri.parse(mapEntrySerializer.RemoteActionCompatParcelizer), 5, iconCompatParcelizer), new AudioAttributesImplApi21Parcelizer(this, (byte) 0), 1);
    }

    private void MediaBrowserCompatItemReceiver() {
        resolveMemberType.read(this.MediaBrowserCompatSearchResultReceiver, new resolveMemberType.RemoteActionCompatParcelizer() { // from class: androidx.media3.exoplayer.dash.DashMediaSource.3
            @Override // o.resolveMemberType.RemoteActionCompatParcelizer
            public final void AudioAttributesCompatParcelizer() {
                DashMediaSource.this.AudioAttributesCompatParcelizer(resolveMemberType.AudioAttributesImplApi26Parcelizer());
            }

            @Override // o.resolveMemberType.RemoteActionCompatParcelizer
            public final void read(IOException iOException) {
                DashMediaSource.this.IconCompatParcelizer(iOException);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void AudioAttributesCompatParcelizer(long j) {
        this.MediaBrowserCompatCustomActionResultReceiver = j;
        read(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void IconCompatParcelizer(IOException iOException) {
        prune.read(com.google.android.exoplayer2.source.dash.DashMediaSource.DEFAULT_MEDIA_ID, "Failed to resolve time offset.", iOException);
        this.MediaBrowserCompatCustomActionResultReceiver = System.currentTimeMillis() - SystemClock.elapsedRealtime();
        read(true);
    }

    private void read(boolean z) {
        long j;
        long j2;
        for (int i = 0; i < this.onSeekTo.size(); i++) {
            int iKeyAt = this.onSeekTo.keyAt(i);
            if (iKeyAt >= this.MediaBrowserCompatItemReceiver) {
                this.onSeekTo.valueAt(i).read(this.handleMediaPlayPauseIfPendingOnHandler, iKeyAt - this.MediaBrowserCompatItemReceiver);
            }
        }
        serializeContents serializecontentsAudioAttributesCompatParcelizer = this.handleMediaPlayPauseIfPendingOnHandler.AudioAttributesCompatParcelizer(0);
        int i2 = this.handleMediaPlayPauseIfPendingOnHandler.read() - 1;
        serializeContents serializecontentsAudioAttributesCompatParcelizer2 = this.handleMediaPlayPauseIfPendingOnHandler.AudioAttributesCompatParcelizer(i2);
        long j3 = this.handleMediaPlayPauseIfPendingOnHandler.read(i2);
        long jIconCompatParcelizer = LaissezFaireSubTypeValidator.IconCompatParcelizer(LaissezFaireSubTypeValidator.RemoteActionCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver));
        long jIconCompatParcelizer2 = IconCompatParcelizer(serializecontentsAudioAttributesCompatParcelizer, this.handleMediaPlayPauseIfPendingOnHandler.read(0), jIconCompatParcelizer);
        long jWrite = write(serializecontentsAudioAttributesCompatParcelizer2, j3, jIconCompatParcelizer);
        boolean z2 = this.handleMediaPlayPauseIfPendingOnHandler.RemoteActionCompatParcelizer && !read(serializecontentsAudioAttributesCompatParcelizer2);
        if (z2 && this.handleMediaPlayPauseIfPendingOnHandler.MediaBrowserCompatMediaItem != C.TIME_UNSET) {
            jIconCompatParcelizer2 = Math.max(jIconCompatParcelizer2, jWrite - LaissezFaireSubTypeValidator.IconCompatParcelizer(this.handleMediaPlayPauseIfPendingOnHandler.MediaBrowserCompatMediaItem));
        }
        long j4 = jWrite - jIconCompatParcelizer2;
        if (this.handleMediaPlayPauseIfPendingOnHandler.RemoteActionCompatParcelizer) {
            buildTypeSerializer.write(this.handleMediaPlayPauseIfPendingOnHandler.AudioAttributesCompatParcelizer != C.TIME_UNSET);
            long jIconCompatParcelizer3 = (jIconCompatParcelizer - LaissezFaireSubTypeValidator.IconCompatParcelizer(this.handleMediaPlayPauseIfPendingOnHandler.AudioAttributesCompatParcelizer)) - jIconCompatParcelizer2;
            AudioAttributesCompatParcelizer(jIconCompatParcelizer3, j4);
            long jAudioAttributesCompatParcelizer = this.handleMediaPlayPauseIfPendingOnHandler.AudioAttributesCompatParcelizer + LaissezFaireSubTypeValidator.AudioAttributesCompatParcelizer(jIconCompatParcelizer2);
            long jIconCompatParcelizer4 = jIconCompatParcelizer3 - LaissezFaireSubTypeValidator.IconCompatParcelizer(this.MediaMetadataCompat.AudioAttributesCompatParcelizer);
            j = jAudioAttributesCompatParcelizer;
            long jMin = Math.min(this.onPlayFromSearch, j4 / 2);
            j2 = jIconCompatParcelizer4 < jMin ? jMin : jIconCompatParcelizer4;
        } else {
            j = C.TIME_UNSET;
            j2 = 0;
        }
        refreshSourceInfo(new IconCompatParcelizer(this.handleMediaPlayPauseIfPendingOnHandler.AudioAttributesCompatParcelizer, j, this.MediaBrowserCompatCustomActionResultReceiver, this.MediaBrowserCompatItemReceiver, jIconCompatParcelizer2 - LaissezFaireSubTypeValidator.IconCompatParcelizer(serializecontentsAudioAttributesCompatParcelizer.IconCompatParcelizer), j4, j2, this.handleMediaPlayPauseIfPendingOnHandler, getMediaItem(), this.handleMediaPlayPauseIfPendingOnHandler.RemoteActionCompatParcelizer ? this.MediaMetadataCompat : null));
        if (this.onRemoveQueueItemAt) {
            return;
        }
        this.MediaDescriptionCompat.removeCallbacks(this.onRemoveQueueItem);
        if (z2) {
            this.MediaDescriptionCompat.postDelayed(this.onRemoveQueueItem, AudioAttributesCompatParcelizer(this.handleMediaPlayPauseIfPendingOnHandler, LaissezFaireSubTypeValidator.RemoteActionCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver)));
        }
        if (this.onMediaButtonEvent) {
            AudioAttributesImplApi21Parcelizer();
            return;
        }
        if (z && this.handleMediaPlayPauseIfPendingOnHandler.RemoteActionCompatParcelizer && this.handleMediaPlayPauseIfPendingOnHandler.MediaBrowserCompatItemReceiver != C.TIME_UNSET) {
            long j5 = this.handleMediaPlayPauseIfPendingOnHandler.MediaBrowserCompatItemReceiver;
            if (j5 == 0) {
                j5 = 5000;
            }
            read(Math.max(0L, (this.onFastForward + j5) - SystemClock.elapsedRealtime()));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0100  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void AudioAttributesCompatParcelizer(long r19, long r21) {
        /*
            Method dump skipped, instruction units count: 329
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.dash.DashMediaSource.AudioAttributesCompatParcelizer(long, long):void");
    }

    private void read(long j) {
        this.MediaDescriptionCompat.postDelayed(this.onRewind, j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void AudioAttributesImplApi21Parcelizer() {
        Uri uri;
        this.MediaDescriptionCompat.removeCallbacks(this.onRewind);
        if (this.MediaBrowserCompatSearchResultReceiver.IconCompatParcelizer()) {
            return;
        }
        if (this.MediaBrowserCompatSearchResultReceiver.RemoteActionCompatParcelizer()) {
            this.onMediaButtonEvent = true;
            return;
        }
        synchronized (this.onPrepareFromMediaId) {
            uri = this.onPrepare;
        }
        this.onMediaButtonEvent = false;
        AudioAttributesCompatParcelizer(new constructGeneralizedType(this.AudioAttributesCompatParcelizer, uri, 4, this.onPlayFromMediaId), this.onAddQueueItem, this.RatingCompat.write(4));
    }

    private long AudioAttributesCompatParcelizer() {
        return Math.min((this.onSetRating - 1) * 1000, 5000);
    }

    private <T> void AudioAttributesCompatParcelizer(constructGeneralizedType<T> constructgeneralizedtype, constructCollectionType.RemoteActionCompatParcelizer<constructGeneralizedType<T>> remoteActionCompatParcelizer, int i) {
        this.onCommand.AudioAttributesCompatParcelizer(new StdDelegatingSerializer(constructgeneralizedtype.RemoteActionCompatParcelizer, constructgeneralizedtype.write, this.MediaBrowserCompatSearchResultReceiver.read(constructgeneralizedtype, remoteActionCompatParcelizer, i)), constructgeneralizedtype.read);
    }

    private static long AudioAttributesCompatParcelizer(FilteredBeanPropertyWriterMultiView filteredBeanPropertyWriterMultiView, long j) {
        Serializers serializersRemoteActionCompatParcelizer;
        int i = filteredBeanPropertyWriterMultiView.read() - 1;
        serializeContents serializecontentsAudioAttributesCompatParcelizer = filteredBeanPropertyWriterMultiView.AudioAttributesCompatParcelizer(i);
        long jIconCompatParcelizer = LaissezFaireSubTypeValidator.IconCompatParcelizer(serializecontentsAudioAttributesCompatParcelizer.IconCompatParcelizer);
        long j2 = filteredBeanPropertyWriterMultiView.read(i);
        long jIconCompatParcelizer2 = LaissezFaireSubTypeValidator.IconCompatParcelizer(j);
        long jIconCompatParcelizer3 = LaissezFaireSubTypeValidator.IconCompatParcelizer(filteredBeanPropertyWriterMultiView.AudioAttributesCompatParcelizer);
        long jIconCompatParcelizer4 = LaissezFaireSubTypeValidator.IconCompatParcelizer(5000L);
        for (int i2 = 0; i2 < serializecontentsAudioAttributesCompatParcelizer.RemoteActionCompatParcelizer.size(); i2++) {
            List<IndexedStringListSerializer> list = serializecontentsAudioAttributesCompatParcelizer.RemoteActionCompatParcelizer.get(i2).IconCompatParcelizer;
            if (!list.isEmpty() && (serializersRemoteActionCompatParcelizer = list.get(0).RemoteActionCompatParcelizer()) != null) {
                long jAudioAttributesCompatParcelizer = ((jIconCompatParcelizer3 + jIconCompatParcelizer) + serializersRemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(j2, jIconCompatParcelizer2)) - jIconCompatParcelizer2;
                if (jAudioAttributesCompatParcelizer < jIconCompatParcelizer4 - 100000 || (jAudioAttributesCompatParcelizer > jIconCompatParcelizer4 && jAudioAttributesCompatParcelizer < jIconCompatParcelizer4 + 100000)) {
                    jIconCompatParcelizer4 = jAudioAttributesCompatParcelizer;
                }
            }
        }
        return parseIlstElement.RemoteActionCompatParcelizer(jIconCompatParcelizer4, 1000L, RoundingMode.CEILING);
    }

    private static long IconCompatParcelizer(serializeContents serializecontents, long j, long j2) {
        long jIconCompatParcelizer = LaissezFaireSubTypeValidator.IconCompatParcelizer(serializecontents.IconCompatParcelizer);
        boolean zAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(serializecontents);
        long jMax = jIconCompatParcelizer;
        for (int i = 0; i < serializecontents.RemoteActionCompatParcelizer.size(); i++) {
            FilteredBeanPropertyWriterSingleView filteredBeanPropertyWriterSingleView = serializecontents.RemoteActionCompatParcelizer.get(i);
            List<IndexedStringListSerializer> list = filteredBeanPropertyWriterSingleView.IconCompatParcelizer;
            boolean z = (filteredBeanPropertyWriterSingleView.AudioAttributesImplApi21Parcelizer == 1 || filteredBeanPropertyWriterSingleView.AudioAttributesImplApi21Parcelizer == 2) ? false : true;
            if ((!zAudioAttributesCompatParcelizer || !z) && !list.isEmpty()) {
                Serializers serializersRemoteActionCompatParcelizer = list.get(0).RemoteActionCompatParcelizer();
                if (serializersRemoteActionCompatParcelizer == null || serializersRemoteActionCompatParcelizer.write(j, j2) == 0) {
                    return jIconCompatParcelizer;
                }
                jMax = Math.max(jMax, serializersRemoteActionCompatParcelizer.write(serializersRemoteActionCompatParcelizer.read(j, j2)) + jIconCompatParcelizer);
            }
        }
        return jMax;
    }

    private static long write(serializeContents serializecontents, long j, long j2) {
        long jIconCompatParcelizer = LaissezFaireSubTypeValidator.IconCompatParcelizer(serializecontents.IconCompatParcelizer);
        boolean zAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(serializecontents);
        long jMin = Long.MAX_VALUE;
        for (int i = 0; i < serializecontents.RemoteActionCompatParcelizer.size(); i++) {
            FilteredBeanPropertyWriterSingleView filteredBeanPropertyWriterSingleView = serializecontents.RemoteActionCompatParcelizer.get(i);
            List<IndexedStringListSerializer> list = filteredBeanPropertyWriterSingleView.IconCompatParcelizer;
            boolean z = (filteredBeanPropertyWriterSingleView.AudioAttributesImplApi21Parcelizer == 1 || filteredBeanPropertyWriterSingleView.AudioAttributesImplApi21Parcelizer == 2) ? false : true;
            if ((!zAudioAttributesCompatParcelizer || !z) && !list.isEmpty()) {
                Serializers serializersRemoteActionCompatParcelizer = list.get(0).RemoteActionCompatParcelizer();
                if (serializersRemoteActionCompatParcelizer == null) {
                    return jIconCompatParcelizer + j;
                }
                long jWrite = serializersRemoteActionCompatParcelizer.write(j, j2);
                if (jWrite == 0) {
                    return jIconCompatParcelizer;
                }
                long j3 = (serializersRemoteActionCompatParcelizer.read(j, j2) + jWrite) - 1;
                jMin = Math.min(jMin, serializersRemoteActionCompatParcelizer.IconCompatParcelizer(j3, j) + serializersRemoteActionCompatParcelizer.write(j3) + jIconCompatParcelizer);
            }
        }
        return jMin;
    }

    private static boolean read(serializeContents serializecontents) {
        for (int i = 0; i < serializecontents.RemoteActionCompatParcelizer.size(); i++) {
            Serializers serializersRemoteActionCompatParcelizer = serializecontents.RemoteActionCompatParcelizer.get(i).IconCompatParcelizer.get(0).RemoteActionCompatParcelizer();
            if (serializersRemoteActionCompatParcelizer == null || serializersRemoteActionCompatParcelizer.IconCompatParcelizer()) {
                return true;
            }
        }
        return false;
    }

    private static boolean AudioAttributesCompatParcelizer(serializeContents serializecontents) {
        for (int i = 0; i < serializecontents.RemoteActionCompatParcelizer.size(); i++) {
            int i2 = serializecontents.RemoteActionCompatParcelizer.get(i).AudioAttributesImplApi21Parcelizer;
            if (i2 == 1 || i2 == 2) {
                return true;
            }
        }
        return false;
    }

    static final class IconCompatParcelizer extends PolymorphicTypeValidator {
        private final JsonSerializableSchema.AudioAttributesImplApi26Parcelizer AudioAttributesCompatParcelizer;
        private final long AudioAttributesImplApi21Parcelizer;
        private final long AudioAttributesImplApi26Parcelizer;
        private final JsonSerializableSchema AudioAttributesImplBaseParcelizer;
        private final FilteredBeanPropertyWriterMultiView IconCompatParcelizer;
        private final long MediaBrowserCompatCustomActionResultReceiver;
        private final long MediaBrowserCompatItemReceiver;
        private final long MediaBrowserCompatSearchResultReceiver;
        private final long read;
        private final int write;

        @Override // kotlin.PolymorphicTypeValidator
        public final int AudioAttributesCompatParcelizer() {
            return 1;
        }

        public IconCompatParcelizer(long j, long j2, long j3, int i, long j4, long j5, long j6, FilteredBeanPropertyWriterMultiView filteredBeanPropertyWriterMultiView, JsonSerializableSchema jsonSerializableSchema, JsonSerializableSchema.AudioAttributesImplApi26Parcelizer audioAttributesImplApi26Parcelizer) {
            buildTypeSerializer.write(filteredBeanPropertyWriterMultiView.RemoteActionCompatParcelizer == (audioAttributesImplApi26Parcelizer != null));
            this.MediaBrowserCompatCustomActionResultReceiver = j;
            this.MediaBrowserCompatSearchResultReceiver = j2;
            this.read = j3;
            this.write = i;
            this.AudioAttributesImplApi26Parcelizer = j4;
            this.MediaBrowserCompatItemReceiver = j5;
            this.AudioAttributesImplApi21Parcelizer = j6;
            this.IconCompatParcelizer = filteredBeanPropertyWriterMultiView;
            this.AudioAttributesImplBaseParcelizer = jsonSerializableSchema;
            this.AudioAttributesCompatParcelizer = audioAttributesImplApi26Parcelizer;
        }

        @Override // kotlin.PolymorphicTypeValidator
        public final int IconCompatParcelizer() {
            return this.IconCompatParcelizer.read();
        }

        @Override // kotlin.PolymorphicTypeValidator
        public final PolymorphicTypeValidator.AudioAttributesCompatParcelizer RemoteActionCompatParcelizer(int i, PolymorphicTypeValidator.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer, boolean z) {
            buildTypeSerializer.RemoteActionCompatParcelizer(i, IconCompatParcelizer());
            return audioAttributesCompatParcelizer.read(z ? this.IconCompatParcelizer.AudioAttributesCompatParcelizer(i).read : null, z ? Integer.valueOf(this.write + i) : null, this.IconCompatParcelizer.read(i), LaissezFaireSubTypeValidator.IconCompatParcelizer(this.IconCompatParcelizer.AudioAttributesCompatParcelizer(i).IconCompatParcelizer - this.IconCompatParcelizer.AudioAttributesCompatParcelizer(0).IconCompatParcelizer) - this.AudioAttributesImplApi26Parcelizer);
        }

        @Override // kotlin.PolymorphicTypeValidator
        public final PolymorphicTypeValidator.IconCompatParcelizer write(int i, PolymorphicTypeValidator.IconCompatParcelizer iconCompatParcelizer, long j) {
            buildTypeSerializer.RemoteActionCompatParcelizer(i, 1);
            long j2 = read(j);
            Object obj = PolymorphicTypeValidator.IconCompatParcelizer.read;
            JsonSerializableSchema jsonSerializableSchema = this.AudioAttributesImplBaseParcelizer;
            FilteredBeanPropertyWriterMultiView filteredBeanPropertyWriterMultiView = this.IconCompatParcelizer;
            return iconCompatParcelizer.write(obj, jsonSerializableSchema, filteredBeanPropertyWriterMultiView, this.MediaBrowserCompatCustomActionResultReceiver, this.MediaBrowserCompatSearchResultReceiver, this.read, true, read(filteredBeanPropertyWriterMultiView), this.AudioAttributesCompatParcelizer, j2, this.MediaBrowserCompatItemReceiver, IconCompatParcelizer() - 1, this.AudioAttributesImplApi26Parcelizer);
        }

        @Override // kotlin.PolymorphicTypeValidator
        public final int read(Object obj) {
            int iIntValue;
            if ((obj instanceof Integer) && (iIntValue = ((Integer) obj).intValue() - this.write) >= 0 && iIntValue < IconCompatParcelizer()) {
                return iIntValue;
            }
            return -1;
        }

        private long read(long j) {
            Serializers serializersRemoteActionCompatParcelizer;
            long j2 = this.AudioAttributesImplApi21Parcelizer;
            if (!read(this.IconCompatParcelizer)) {
                return j2;
            }
            if (j > 0) {
                j2 += j;
                if (j2 > this.MediaBrowserCompatItemReceiver) {
                    return C.TIME_UNSET;
                }
            }
            long j3 = this.AudioAttributesImplApi26Parcelizer + j2;
            long j4 = this.IconCompatParcelizer.read(0);
            int i = 0;
            while (i < this.IconCompatParcelizer.read() - 1 && j3 >= j4) {
                j3 -= j4;
                i++;
                j4 = this.IconCompatParcelizer.read(i);
            }
            serializeContents serializecontentsAudioAttributesCompatParcelizer = this.IconCompatParcelizer.AudioAttributesCompatParcelizer(i);
            int i2 = serializecontentsAudioAttributesCompatParcelizer.read();
            return (i2 == -1 || (serializersRemoteActionCompatParcelizer = serializecontentsAudioAttributesCompatParcelizer.RemoteActionCompatParcelizer.get(i2).IconCompatParcelizer.get(0).RemoteActionCompatParcelizer()) == null || serializersRemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(j4) == 0) ? j2 : (j2 + serializersRemoteActionCompatParcelizer.write(serializersRemoteActionCompatParcelizer.RemoteActionCompatParcelizer(j3, j4))) - j3;
        }

        @Override // kotlin.PolymorphicTypeValidator
        public final Object write(int i) {
            buildTypeSerializer.RemoteActionCompatParcelizer(i, IconCompatParcelizer());
            return Integer.valueOf(this.write + i);
        }

        private static boolean read(FilteredBeanPropertyWriterMultiView filteredBeanPropertyWriterMultiView) {
            return filteredBeanPropertyWriterMultiView.RemoteActionCompatParcelizer && filteredBeanPropertyWriterMultiView.MediaBrowserCompatItemReceiver != C.TIME_UNSET && filteredBeanPropertyWriterMultiView.write == C.TIME_UNSET;
        }
    }

    final class write implements AttributePropertyWriter.IconCompatParcelizer {
        private write() {
        }

        /* synthetic */ write(DashMediaSource dashMediaSource, byte b) {
            this();
        }

        @Override // o.AttributePropertyWriter.IconCompatParcelizer
        public final void write() {
            DashMediaSource.this.write();
        }

        @Override // o.AttributePropertyWriter.IconCompatParcelizer
        public final void write(long j) {
            DashMediaSource.this.write(j);
        }
    }

    final class AudioAttributesCompatParcelizer implements constructCollectionType.RemoteActionCompatParcelizer<constructGeneralizedType<FilteredBeanPropertyWriterMultiView>> {
        private AudioAttributesCompatParcelizer() {
        }

        /* synthetic */ AudioAttributesCompatParcelizer(DashMediaSource dashMediaSource, byte b) {
            this();
        }

        @Override // o.constructCollectionType.RemoteActionCompatParcelizer
        public final /* synthetic */ void read(constructCollectionType.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer, long j, long j2, boolean z) {
            RemoteActionCompatParcelizer((constructGeneralizedType<FilteredBeanPropertyWriterMultiView>) audioAttributesCompatParcelizer, j, j2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // o.constructCollectionType.RemoteActionCompatParcelizer
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public void RemoteActionCompatParcelizer(constructGeneralizedType<FilteredBeanPropertyWriterMultiView> constructgeneralizedtype, long j, long j2) {
            DashMediaSource.this.read(constructgeneralizedtype, j, j2);
        }

        private void RemoteActionCompatParcelizer(constructGeneralizedType<FilteredBeanPropertyWriterMultiView> constructgeneralizedtype, long j, long j2) {
            DashMediaSource.this.AudioAttributesCompatParcelizer(constructgeneralizedtype, j, j2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // o.constructCollectionType.RemoteActionCompatParcelizer
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public constructCollectionType.write AudioAttributesCompatParcelizer(constructGeneralizedType<FilteredBeanPropertyWriterMultiView> constructgeneralizedtype, long j, long j2, IOException iOException, int i) {
            return DashMediaSource.this.write(constructgeneralizedtype, j, j2, iOException, i);
        }
    }

    final class AudioAttributesImplApi21Parcelizer implements constructCollectionType.RemoteActionCompatParcelizer<constructGeneralizedType<Long>> {
        private AudioAttributesImplApi21Parcelizer() {
        }

        /* synthetic */ AudioAttributesImplApi21Parcelizer(DashMediaSource dashMediaSource, byte b) {
            this();
        }

        @Override // o.constructCollectionType.RemoteActionCompatParcelizer
        public final /* bridge */ /* synthetic */ constructCollectionType.write AudioAttributesCompatParcelizer(constructCollectionType.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer, long j, long j2, IOException iOException, int i) {
            return AudioAttributesCompatParcelizer((constructGeneralizedType) audioAttributesCompatParcelizer, j, j2, iOException);
        }

        @Override // o.constructCollectionType.RemoteActionCompatParcelizer
        public final /* bridge */ /* synthetic */ void read(constructCollectionType.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer, long j, long j2, boolean z) {
            read((constructGeneralizedType) audioAttributesCompatParcelizer, j, j2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // o.constructCollectionType.RemoteActionCompatParcelizer
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public void RemoteActionCompatParcelizer(constructGeneralizedType<Long> constructgeneralizedtype, long j, long j2) {
            DashMediaSource.this.write(constructgeneralizedtype, j, j2);
        }

        private void read(constructGeneralizedType<Long> constructgeneralizedtype, long j, long j2) {
            DashMediaSource.this.AudioAttributesCompatParcelizer(constructgeneralizedtype, j, j2);
        }

        private constructCollectionType.write AudioAttributesCompatParcelizer(constructGeneralizedType<Long> constructgeneralizedtype, long j, long j2, IOException iOException) {
            return DashMediaSource.this.AudioAttributesCompatParcelizer(constructgeneralizedtype, j, j2, iOException);
        }
    }

    static final class MediaBrowserCompatCustomActionResultReceiver implements constructGeneralizedType.IconCompatParcelizer<Long> {
        private MediaBrowserCompatCustomActionResultReceiver() {
        }

        /* synthetic */ MediaBrowserCompatCustomActionResultReceiver(byte b) {
            this();
        }

        @Override // o.constructGeneralizedType.IconCompatParcelizer
        public final /* bridge */ /* synthetic */ Long RemoteActionCompatParcelizer(Uri uri, InputStream inputStream) throws IOException {
            return RemoteActionCompatParcelizer(inputStream);
        }

        private static Long RemoteActionCompatParcelizer(InputStream inputStream) throws IOException {
            return Long.valueOf(LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(new BufferedReader(new InputStreamReader(inputStream)).readLine()));
        }
    }

    static final class read implements constructGeneralizedType.IconCompatParcelizer<Long> {
        private static final Pattern AudioAttributesCompatParcelizer = Pattern.compile("(.+?)(Z|((\\+|-|−)(\\d\\d)(:?(\\d\\d))?))");

        read() {
        }

        @Override // o.constructGeneralizedType.IconCompatParcelizer
        public final /* synthetic */ Long RemoteActionCompatParcelizer(Uri uri, InputStream inputStream) throws IOException {
            return AudioAttributesCompatParcelizer(inputStream);
        }

        private static Long AudioAttributesCompatParcelizer(InputStream inputStream) throws IOException {
            String line = new BufferedReader(new InputStreamReader(inputStream, parseMdtaFromMeta.AudioAttributesImplApi26Parcelizer)).readLine();
            try {
                Matcher matcher = AudioAttributesCompatParcelizer.matcher(line);
                if (!matcher.matches()) {
                    StringBuilder sb = new StringBuilder("Couldn't parse timestamp: ");
                    sb.append(line);
                    throw SchemaAware.AudioAttributesCompatParcelizer(sb.toString(), null);
                }
                String strGroup = matcher.group(1);
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);
                simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
                long time = simpleDateFormat.parse(strGroup).getTime();
                if (!"Z".equals(matcher.group(2))) {
                    long j = "+".equals(matcher.group(4)) ? 1L : -1L;
                    long j2 = Long.parseLong(matcher.group(5));
                    String strGroup2 = matcher.group(7);
                    time -= j * (((j2 * 60) + (TextUtils.isEmpty(strGroup2) ? 0L : Long.parseLong(strGroup2))) * 60000);
                }
                return Long.valueOf(time);
            } catch (ParseException e) {
                throw SchemaAware.AudioAttributesCompatParcelizer(null, e);
            }
        }
    }

    final class RemoteActionCompatParcelizer implements classForName {
        RemoteActionCompatParcelizer() {
        }

        @Override // kotlin.classForName
        public final void read() throws IOException {
            DashMediaSource.this.MediaBrowserCompatSearchResultReceiver.read();
            IconCompatParcelizer();
        }

        private void IconCompatParcelizer() throws IOException {
            if (DashMediaSource.this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver != null) {
                throw DashMediaSource.this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
            }
        }
    }
}
