package kotlin;

import android.content.Context;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.util.MimeTypes;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import kotlin.C0170format;
import kotlin.C0209subTypeValidator;
import kotlin.JsonSerializableSchema;
import kotlin.StdKeySerializers;
import kotlin.ToEmptyObjectSerializer;
import kotlin._fromClass;
import kotlin._hasTypeResolver;
import kotlin._writeArrayContents;
import kotlin.findContextualConvertingSerializer;
import kotlin.getEmptyArray;
import kotlin.isCollectionMapOrArray;
import kotlin.withTimeZone;

/* JADX INFO: loaded from: classes2.dex */
public final class ReferenceTypeSerializer implements StdKeySerializersDefault {
    private final write AudioAttributesCompatParcelizer;
    private float AudioAttributesImplApi21Parcelizer;
    private long AudioAttributesImplApi26Parcelizer;
    private StdArraySerializersLongArraySerializer AudioAttributesImplBaseParcelizer;
    private _hasTypeResolver.write IconCompatParcelizer;
    private long MediaBrowserCompatCustomActionResultReceiver;
    private float MediaBrowserCompatItemReceiver;
    private withTimeZone.IconCompatParcelizer MediaBrowserCompatMediaItem;
    private long MediaBrowserCompatSearchResultReceiver;
    private StdKeySerializers.AudioAttributesCompatParcelizer MediaDescriptionCompat;
    private boolean MediaMetadataCompat;
    private _resolveSuperClass RatingCompat;
    private expectObjectFormat RemoteActionCompatParcelizer;
    private getEmptyArray.AudioAttributesCompatParcelizer read;

    public ReferenceTypeSerializer(Context context) {
        this(new C0209subTypeValidator.RemoteActionCompatParcelizer(context));
    }

    public ReferenceTypeSerializer(Context context, getClassDescription getclassdescription) {
        this(new C0209subTypeValidator.RemoteActionCompatParcelizer(context), getclassdescription);
    }

    private ReferenceTypeSerializer(_hasTypeResolver.write writeVar) {
        this(writeVar, new checkAndFixAccess());
    }

    private ReferenceTypeSerializer(_hasTypeResolver.write writeVar, getClassDescription getclassdescription) {
        this.IconCompatParcelizer = writeVar;
        _clearFormats _clearformats = new _clearFormats();
        this.MediaBrowserCompatMediaItem = _clearformats;
        write writeVar2 = new write(getclassdescription, _clearformats);
        this.AudioAttributesCompatParcelizer = writeVar2;
        writeVar2.write(writeVar);
        this.MediaBrowserCompatSearchResultReceiver = C.TIME_UNSET;
        this.MediaBrowserCompatCustomActionResultReceiver = C.TIME_UNSET;
        this.AudioAttributesImplApi26Parcelizer = C.TIME_UNSET;
        this.AudioAttributesImplApi21Parcelizer = -3.4028235E38f;
        this.MediaBrowserCompatItemReceiver = -3.4028235E38f;
        this.MediaMetadataCompat = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // o.StdKeySerializers.AudioAttributesCompatParcelizer
    @Deprecated
    /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public ReferenceTypeSerializer write(boolean z) {
        this.MediaMetadataCompat = z;
        this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(z);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // o.StdKeySerializers.AudioAttributesCompatParcelizer
    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public ReferenceTypeSerializer IconCompatParcelizer(withTimeZone.IconCompatParcelizer iconCompatParcelizer) {
        this.MediaBrowserCompatMediaItem = (withTimeZone.IconCompatParcelizer) buildTypeSerializer.IconCompatParcelizer(iconCompatParcelizer);
        this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(iconCompatParcelizer);
        return this;
    }

    public final ReferenceTypeSerializer AudioAttributesCompatParcelizer(_hasTypeResolver.write writeVar) {
        this.IconCompatParcelizer = writeVar;
        this.AudioAttributesCompatParcelizer.write(writeVar);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // o.StdKeySerializers.AudioAttributesCompatParcelizer
    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public ReferenceTypeSerializer read(_fromClass.IconCompatParcelizer iconCompatParcelizer) {
        this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer((_fromClass.IconCompatParcelizer) buildTypeSerializer.IconCompatParcelizer(iconCompatParcelizer));
        return this;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // o.StdKeySerializers.AudioAttributesCompatParcelizer
    /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public ReferenceTypeSerializer write(SimpleBeanPropertyFilter simpleBeanPropertyFilter) {
        this.AudioAttributesCompatParcelizer.IconCompatParcelizer((SimpleBeanPropertyFilter) buildTypeSerializer.write(simpleBeanPropertyFilter, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior."));
        return this;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // o.StdKeySerializers.AudioAttributesCompatParcelizer
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public ReferenceTypeSerializer read(_resolveSuperClass _resolvesuperclass) {
        this.RatingCompat = (_resolveSuperClass) buildTypeSerializer.write(_resolvesuperclass, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
        this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(_resolvesuperclass);
        return this;
    }

    @Override // o.StdKeySerializers.AudioAttributesCompatParcelizer
    public final StdKeySerializers write(JsonSerializableSchema jsonSerializableSchema) {
        JsonSerializableSchema.AudioAttributesImplApi21Parcelizer audioAttributesImplApi21Parcelizer = jsonSerializableSchema.AudioAttributesCompatParcelizer;
        String scheme = jsonSerializableSchema.AudioAttributesCompatParcelizer.MediaBrowserCompatItemReceiver.getScheme();
        if (scheme != null && scheme.equals(C.SSAI_SCHEME)) {
            return ((StdKeySerializers.AudioAttributesCompatParcelizer) buildTypeSerializer.IconCompatParcelizer(this.MediaDescriptionCompat)).write(jsonSerializableSchema);
        }
        if (Objects.equals(jsonSerializableSchema.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer, "application/x-image-uri")) {
            return new _writeArrayContents.RemoteActionCompatParcelizer(LaissezFaireSubTypeValidator.IconCompatParcelizer(jsonSerializableSchema.AudioAttributesCompatParcelizer.write), (StdArraySerializersLongArraySerializer) buildTypeSerializer.IconCompatParcelizer((Object) null)).write(jsonSerializableSchema);
        }
        int i = LaissezFaireSubTypeValidator.read(jsonSerializableSchema.AudioAttributesCompatParcelizer.MediaBrowserCompatItemReceiver, jsonSerializableSchema.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer);
        if (jsonSerializableSchema.AudioAttributesCompatParcelizer.write != C.TIME_UNSET) {
            this.AudioAttributesCompatParcelizer.IconCompatParcelizer();
        }
        try {
            StdKeySerializers.AudioAttributesCompatParcelizer audioAttributesCompatParcelizerRemoteActionCompatParcelizer = this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(i);
            JsonSerializableSchema.AudioAttributesImplApi26Parcelizer.read readVarRemoteActionCompatParcelizer = jsonSerializableSchema.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer();
            if (jsonSerializableSchema.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer == C.TIME_UNSET) {
                readVarRemoteActionCompatParcelizer.RemoteActionCompatParcelizer(this.MediaBrowserCompatSearchResultReceiver);
            }
            if (jsonSerializableSchema.RemoteActionCompatParcelizer.write == -3.4028235E38f) {
                readVarRemoteActionCompatParcelizer.RemoteActionCompatParcelizer(this.AudioAttributesImplApi21Parcelizer);
            }
            if (jsonSerializableSchema.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer == -3.4028235E38f) {
                readVarRemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(this.MediaBrowserCompatItemReceiver);
            }
            if (jsonSerializableSchema.RemoteActionCompatParcelizer.IconCompatParcelizer == C.TIME_UNSET) {
                readVarRemoteActionCompatParcelizer.read(this.MediaBrowserCompatCustomActionResultReceiver);
            }
            if (jsonSerializableSchema.RemoteActionCompatParcelizer.read == C.TIME_UNSET) {
                readVarRemoteActionCompatParcelizer.IconCompatParcelizer(this.AudioAttributesImplApi26Parcelizer);
            }
            JsonSerializableSchema.AudioAttributesImplApi26Parcelizer audioAttributesImplApi26ParcelizerWrite = readVarRemoteActionCompatParcelizer.write();
            if (!audioAttributesImplApi26ParcelizerWrite.equals(jsonSerializableSchema.RemoteActionCompatParcelizer)) {
                jsonSerializableSchema = jsonSerializableSchema.read().write(audioAttributesImplApi26ParcelizerWrite).IconCompatParcelizer();
            }
            StdKeySerializers stdKeySerializersWrite = audioAttributesCompatParcelizerRemoteActionCompatParcelizer.write(jsonSerializableSchema);
            initExtraTracks<JsonSerializableSchema.MediaBrowserCompatItemReceiver> initextratracks = ((JsonSerializableSchema.AudioAttributesImplApi21Parcelizer) LaissezFaireSubTypeValidator.IconCompatParcelizer(jsonSerializableSchema.AudioAttributesCompatParcelizer)).MediaBrowserCompatCustomActionResultReceiver;
            if (!initextratracks.isEmpty()) {
                StdKeySerializers[] stdKeySerializersArr = new StdKeySerializers[initextratracks.size() + 1];
                stdKeySerializersArr[0] = stdKeySerializersWrite;
                for (int i2 = 0; i2 < initextratracks.size(); i2++) {
                    if (this.MediaMetadataCompat) {
                        final C0170format c0170formatIconCompatParcelizer = new C0170format.RemoteActionCompatParcelizer().AudioAttributesImplApi26Parcelizer(initextratracks.get(i2).write).read(initextratracks.get(i2).read).handleMediaPlayPauseIfPendingOnHandler(initextratracks.get(i2).MediaBrowserCompatCustomActionResultReceiver).MediaBrowserCompatSearchResultReceiver(initextratracks.get(i2).IconCompatParcelizer).write(initextratracks.get(i2).AudioAttributesCompatParcelizer).AudioAttributesCompatParcelizer(initextratracks.get(i2).RemoteActionCompatParcelizer).IconCompatParcelizer();
                        findContextualConvertingSerializer.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = new findContextualConvertingSerializer.AudioAttributesCompatParcelizer(this.IconCompatParcelizer, new getClassDescription() { // from class: o._findCachedSerializer
                            @Override // kotlin.getClassDescription
                            public final findConstructor[] RemoteActionCompatParcelizer() {
                                return this.read.IconCompatParcelizer(c0170formatIconCompatParcelizer);
                            }
                        });
                        _resolveSuperClass _resolvesuperclass = this.RatingCompat;
                        if (_resolvesuperclass != null) {
                            audioAttributesCompatParcelizer.read(_resolvesuperclass);
                        }
                        stdKeySerializersArr[i2 + 1] = audioAttributesCompatParcelizer.write(JsonSerializableSchema.read(initextratracks.get(i2).AudioAttributesImplBaseParcelizer.toString()));
                    } else {
                        ToEmptyObjectSerializer.RemoteActionCompatParcelizer remoteActionCompatParcelizer = new ToEmptyObjectSerializer.RemoteActionCompatParcelizer(this.IconCompatParcelizer);
                        _resolveSuperClass _resolvesuperclass2 = this.RatingCompat;
                        if (_resolvesuperclass2 != null) {
                            remoteActionCompatParcelizer.AudioAttributesCompatParcelizer(_resolvesuperclass2);
                        }
                        stdKeySerializersArr[i2 + 1] = remoteActionCompatParcelizer.write(initextratracks.get(i2));
                    }
                }
                stdKeySerializersWrite = new StdScalarSerializer(stdKeySerializersArr);
            }
            return write(jsonSerializableSchema, read(jsonSerializableSchema, stdKeySerializersWrite));
        } catch (ClassNotFoundException e) {
            throw new IllegalStateException(e);
        }
    }

    final /* synthetic */ findConstructor[] IconCompatParcelizer(C0170format c0170format) {
        findConstructor remoteActionCompatParcelizer;
        findConstructor[] findconstructorArr = new findConstructor[1];
        if (this.MediaBrowserCompatMediaItem.write(c0170format)) {
            remoteActionCompatParcelizer = new looksLikeISO8601(this.MediaBrowserCompatMediaItem.IconCompatParcelizer(c0170format), c0170format);
        } else {
            remoteActionCompatParcelizer = new RemoteActionCompatParcelizer(c0170format);
        }
        findconstructorArr[0] = remoteActionCompatParcelizer;
        return findconstructorArr;
    }

    private static StdKeySerializers read(JsonSerializableSchema jsonSerializableSchema, StdKeySerializers stdKeySerializers) {
        return (jsonSerializableSchema.IconCompatParcelizer.MediaBrowserCompatItemReceiver == 0 && jsonSerializableSchema.IconCompatParcelizer.RemoteActionCompatParcelizer == Long.MIN_VALUE && !jsonSerializableSchema.IconCompatParcelizer.AudioAttributesCompatParcelizer) ? stdKeySerializers : new ObjectArraySerializer(stdKeySerializers, jsonSerializableSchema.IconCompatParcelizer.MediaBrowserCompatItemReceiver, jsonSerializableSchema.IconCompatParcelizer.RemoteActionCompatParcelizer, !jsonSerializableSchema.IconCompatParcelizer.AudioAttributesImplApi21Parcelizer, jsonSerializableSchema.IconCompatParcelizer.read, jsonSerializableSchema.IconCompatParcelizer.AudioAttributesCompatParcelizer);
    }

    private StdKeySerializers write(JsonSerializableSchema jsonSerializableSchema, StdKeySerializers stdKeySerializers) {
        JsonSerializableSchema.AudioAttributesImplApi21Parcelizer audioAttributesImplApi21Parcelizer = jsonSerializableSchema.AudioAttributesCompatParcelizer;
        if (jsonSerializableSchema.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer == null) {
            return stdKeySerializers;
        }
        prune.RemoteActionCompatParcelizer("DMediaSourceFactory", "Playing media without ads. Configure ad support by calling setAdsLoaderProvider and setAdViewProvider.");
        return stdKeySerializers;
    }

    static final class write {
        private _resolveSuperClass AudioAttributesCompatParcelizer;
        private _fromClass.IconCompatParcelizer IconCompatParcelizer;
        private withTimeZone.IconCompatParcelizer MediaBrowserCompatCustomActionResultReceiver;
        private SimpleBeanPropertyFilter RemoteActionCompatParcelizer;
        private final getClassDescription read;
        private _hasTypeResolver.write write;
        private final Map<Integer, parseUdtaMeta<StdKeySerializers.AudioAttributesCompatParcelizer>> AudioAttributesImplApi26Parcelizer = new HashMap();
        private final Map<Integer, StdKeySerializers.AudioAttributesCompatParcelizer> MediaBrowserCompatItemReceiver = new HashMap();
        private boolean AudioAttributesImplBaseParcelizer = true;

        public write(getClassDescription getclassdescription, withTimeZone.IconCompatParcelizer iconCompatParcelizer) {
            this.read = getclassdescription;
            this.MediaBrowserCompatCustomActionResultReceiver = iconCompatParcelizer;
        }

        public final StdKeySerializers.AudioAttributesCompatParcelizer RemoteActionCompatParcelizer(int i) throws ClassNotFoundException {
            StdKeySerializers.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = this.MediaBrowserCompatItemReceiver.get(Integer.valueOf(i));
            if (audioAttributesCompatParcelizer != null) {
                return audioAttributesCompatParcelizer;
            }
            StdKeySerializers.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer2 = AudioAttributesCompatParcelizer(i).get();
            _fromClass.IconCompatParcelizer iconCompatParcelizer = this.IconCompatParcelizer;
            if (iconCompatParcelizer != null) {
                audioAttributesCompatParcelizer2.read(iconCompatParcelizer);
            }
            SimpleBeanPropertyFilter simpleBeanPropertyFilter = this.RemoteActionCompatParcelizer;
            if (simpleBeanPropertyFilter != null) {
                audioAttributesCompatParcelizer2.write(simpleBeanPropertyFilter);
            }
            _resolveSuperClass _resolvesuperclass = this.AudioAttributesCompatParcelizer;
            if (_resolvesuperclass != null) {
                audioAttributesCompatParcelizer2.read(_resolvesuperclass);
            }
            audioAttributesCompatParcelizer2.IconCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver);
            audioAttributesCompatParcelizer2.write(this.AudioAttributesImplBaseParcelizer);
            this.MediaBrowserCompatItemReceiver.put(Integer.valueOf(i), audioAttributesCompatParcelizer2);
            return audioAttributesCompatParcelizer2;
        }

        public final void write(_hasTypeResolver.write writeVar) {
            if (writeVar != this.write) {
                this.write = writeVar;
                this.AudioAttributesImplApi26Parcelizer.clear();
                this.MediaBrowserCompatItemReceiver.clear();
            }
        }

        public final void AudioAttributesCompatParcelizer(boolean z) {
            this.AudioAttributesImplBaseParcelizer = z;
            this.read.AudioAttributesCompatParcelizer(z);
            Iterator<StdKeySerializers.AudioAttributesCompatParcelizer> it = this.MediaBrowserCompatItemReceiver.values().iterator();
            while (it.hasNext()) {
                it.next().write(z);
            }
        }

        public final void AudioAttributesCompatParcelizer(withTimeZone.IconCompatParcelizer iconCompatParcelizer) {
            this.MediaBrowserCompatCustomActionResultReceiver = iconCompatParcelizer;
            this.read.write(iconCompatParcelizer);
            Iterator<StdKeySerializers.AudioAttributesCompatParcelizer> it = this.MediaBrowserCompatItemReceiver.values().iterator();
            while (it.hasNext()) {
                it.next().IconCompatParcelizer(iconCompatParcelizer);
            }
        }

        public final void RemoteActionCompatParcelizer(_fromClass.IconCompatParcelizer iconCompatParcelizer) {
            this.IconCompatParcelizer = iconCompatParcelizer;
            Iterator<StdKeySerializers.AudioAttributesCompatParcelizer> it = this.MediaBrowserCompatItemReceiver.values().iterator();
            while (it.hasNext()) {
                it.next().read(iconCompatParcelizer);
            }
        }

        public final void IconCompatParcelizer(SimpleBeanPropertyFilter simpleBeanPropertyFilter) {
            this.RemoteActionCompatParcelizer = simpleBeanPropertyFilter;
            Iterator<StdKeySerializers.AudioAttributesCompatParcelizer> it = this.MediaBrowserCompatItemReceiver.values().iterator();
            while (it.hasNext()) {
                it.next().write(simpleBeanPropertyFilter);
            }
        }

        public final void AudioAttributesCompatParcelizer(_resolveSuperClass _resolvesuperclass) {
            this.AudioAttributesCompatParcelizer = _resolvesuperclass;
            Iterator<StdKeySerializers.AudioAttributesCompatParcelizer> it = this.MediaBrowserCompatItemReceiver.values().iterator();
            while (it.hasNext()) {
                it.next().read(_resolvesuperclass);
            }
        }

        public final void IconCompatParcelizer() {
            getClassDescription getclassdescription = this.read;
            if (getclassdescription instanceof checkAndFixAccess) {
                ((checkAndFixAccess) getclassdescription).write(1);
            }
        }

        private parseUdtaMeta<StdKeySerializers.AudioAttributesCompatParcelizer> AudioAttributesCompatParcelizer(int i) throws ClassNotFoundException {
            parseUdtaMeta<StdKeySerializers.AudioAttributesCompatParcelizer> parseudtameta;
            parseUdtaMeta<StdKeySerializers.AudioAttributesCompatParcelizer> parseudtameta2;
            parseUdtaMeta<StdKeySerializers.AudioAttributesCompatParcelizer> parseudtameta3 = this.AudioAttributesImplApi26Parcelizer.get(Integer.valueOf(i));
            if (parseudtameta3 != null) {
                return parseudtameta3;
            }
            final _hasTypeResolver.write writeVar = (_hasTypeResolver.write) buildTypeSerializer.IconCompatParcelizer(this.write);
            if (i == 0) {
                final Class<? extends U> clsAsSubclass = Class.forName("androidx.media3.exoplayer.dash.DashMediaSource$Factory").asSubclass(StdKeySerializers.AudioAttributesCompatParcelizer.class);
                parseudtameta = new parseUdtaMeta() { // from class: o.findStandardImpl
                    @Override // kotlin.parseUdtaMeta
                    public final Object get() {
                        return ReferenceTypeSerializer.AudioAttributesCompatParcelizer(clsAsSubclass, writeVar);
                    }
                };
            } else if (i == 1) {
                final Class<? extends U> clsAsSubclass2 = Class.forName("androidx.media3.exoplayer.smoothstreaming.SsMediaSource$Factory").asSubclass(StdKeySerializers.AudioAttributesCompatParcelizer.class);
                parseudtameta = new parseUdtaMeta() { // from class: o.StaticListSerializerBase
                    @Override // kotlin.parseUdtaMeta
                    public final Object get() {
                        return ReferenceTypeSerializer.AudioAttributesCompatParcelizer(clsAsSubclass2, writeVar);
                    }
                };
            } else if (i == 2) {
                final Class<? extends U> clsAsSubclass3 = Class.forName("androidx.media3.exoplayer.hls.HlsMediaSource$Factory").asSubclass(StdKeySerializers.AudioAttributesCompatParcelizer.class);
                parseudtameta = new parseUdtaMeta() { // from class: o.StdArraySerializersCharArraySerializer
                    @Override // kotlin.parseUdtaMeta
                    public final Object get() {
                        return ReferenceTypeSerializer.AudioAttributesCompatParcelizer(clsAsSubclass3, writeVar);
                    }
                };
            } else {
                if (i == 3) {
                    final Class<? extends U> clsAsSubclass4 = Class.forName("androidx.media3.exoplayer.rtsp.RtspMediaSource$Factory").asSubclass(StdKeySerializers.AudioAttributesCompatParcelizer.class);
                    parseudtameta2 = new parseUdtaMeta() { // from class: o.StdArraySerializers
                        @Override // kotlin.parseUdtaMeta
                        public final Object get() {
                            return ReferenceTypeSerializer.write((Class<? extends StdKeySerializers.AudioAttributesCompatParcelizer>) clsAsSubclass4);
                        }
                    };
                } else if (i == 4) {
                    parseudtameta2 = new parseUdtaMeta() { // from class: o.StdArraySerializersBooleanArraySerializer
                        @Override // kotlin.parseUdtaMeta
                        public final Object get() {
                            return this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(writeVar);
                        }
                    };
                } else {
                    throw new IllegalArgumentException("Unrecognized contentType: ".concat(String.valueOf(i)));
                }
                this.AudioAttributesImplApi26Parcelizer.put(Integer.valueOf(i), parseudtameta2);
                return parseudtameta2;
            }
            parseudtameta2 = parseudtameta;
            this.AudioAttributesImplApi26Parcelizer.put(Integer.valueOf(i), parseudtameta2);
            return parseudtameta2;
        }

        final /* synthetic */ StdKeySerializers.AudioAttributesCompatParcelizer RemoteActionCompatParcelizer(_hasTypeResolver.write writeVar) {
            return new findContextualConvertingSerializer.AudioAttributesCompatParcelizer(writeVar, this.read);
        }
    }

    static final class RemoteActionCompatParcelizer implements findConstructor {
        private final C0170format AudioAttributesCompatParcelizer;

        @Override // kotlin.findConstructor
        public final void RemoteActionCompatParcelizer() {
        }

        @Override // kotlin.findConstructor
        public final boolean read(closeOnFailAndThrowAsIOE closeonfailandthrowasioe) {
            return true;
        }

        @Override // kotlin.findConstructor
        public final void write(long j, long j2) {
        }

        public RemoteActionCompatParcelizer(C0170format c0170format) {
            this.AudioAttributesCompatParcelizer = c0170format;
        }

        @Override // kotlin.findConstructor
        public final void read(findRawSuperTypes findrawsupertypes) {
            nonNullString nonnullstringIconCompatParcelizer = findrawsupertypes.IconCompatParcelizer(0, 3);
            findrawsupertypes.read(new isCollectionMapOrArray.write(C.TIME_UNSET));
            findrawsupertypes.RemoteActionCompatParcelizer();
            nonnullstringIconCompatParcelizer.write(this.AudioAttributesCompatParcelizer.write().AudioAttributesImplApi26Parcelizer(MimeTypes.TEXT_UNKNOWN).RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer.onPlayFromUri).IconCompatParcelizer());
        }

        @Override // kotlin.findConstructor
        public final int RemoteActionCompatParcelizer(closeOnFailAndThrowAsIOE closeonfailandthrowasioe, isJacksonStdImpl isjacksonstdimpl) throws IOException {
            return closeonfailandthrowasioe.read(Integer.MAX_VALUE) == -1 ? -1 : 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static StdKeySerializers.AudioAttributesCompatParcelizer AudioAttributesCompatParcelizer(Class<? extends StdKeySerializers.AudioAttributesCompatParcelizer> cls, _hasTypeResolver.write writeVar) {
        try {
            return cls.getConstructor(_hasTypeResolver.write.class).newInstance(writeVar);
        } catch (Exception e) {
            throw new IllegalStateException(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static StdKeySerializers.AudioAttributesCompatParcelizer write(Class<? extends StdKeySerializers.AudioAttributesCompatParcelizer> cls) {
        try {
            return cls.getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception e) {
            throw new IllegalStateException(e);
        }
    }
}
