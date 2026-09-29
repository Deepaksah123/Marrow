package kotlin;

import android.net.Uri;
import android.os.Looper;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import kotlin.JsonSerializableSchema;
import kotlin.PolymorphicTypeValidator;
import kotlin.StdKeySerializers;
import kotlin._hasTypeResolver;
import kotlin._nonEmpty;
import kotlin.findAnnotatedContentSerializer;
import kotlin.findContextualConvertingSerializer;

/* JADX INFO: loaded from: classes2.dex */
public final class findContextualConvertingSerializer extends NumberSerializers1 implements _nonEmpty.IconCompatParcelizer {
    private final matchesUntyped AudioAttributesCompatParcelizer;
    private long AudioAttributesImplApi21Parcelizer;
    private boolean AudioAttributesImplApi26Parcelizer;
    private boolean AudioAttributesImplBaseParcelizer;
    private final _hasTypeResolver.write IconCompatParcelizer;
    private final findAnnotatedContentSerializer.AudioAttributesCompatParcelizer MediaBrowserCompatCustomActionResultReceiver;
    private boolean MediaBrowserCompatItemReceiver;
    private TypeNameIdResolver MediaBrowserCompatSearchResultReceiver;
    private final _resolveSuperClass RemoteActionCompatParcelizer;
    private JsonSerializableSchema read;
    private final int write;

    @Override // kotlin.StdKeySerializers
    public final void maybeThrowSourceInfoRefreshError() {
    }

    /* synthetic */ findContextualConvertingSerializer(JsonSerializableSchema jsonSerializableSchema, _hasTypeResolver.write writeVar, findAnnotatedContentSerializer.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer, matchesUntyped matchesuntyped, _resolveSuperClass _resolvesuperclass, int i, byte b) {
        this(jsonSerializableSchema, writeVar, audioAttributesCompatParcelizer, matchesuntyped, _resolvesuperclass, i);
    }

    public static final class AudioAttributesCompatParcelizer implements StdKeySerializersDefault {
        private final _hasTypeResolver.write AudioAttributesCompatParcelizer;
        private int IconCompatParcelizer;
        private findAnnotatedContentSerializer.AudioAttributesCompatParcelizer MediaBrowserCompatCustomActionResultReceiver;
        private _resolveSuperClass RemoteActionCompatParcelizer;
        private SimpleBeanPropertyFilter read;

        public AudioAttributesCompatParcelizer(_hasTypeResolver.write writeVar, final getClassDescription getclassdescription) {
            this(writeVar, new findAnnotatedContentSerializer.AudioAttributesCompatParcelizer() { // from class: o.StringSerializer
                @Override // o.findAnnotatedContentSerializer.AudioAttributesCompatParcelizer
                public final findAnnotatedContentSerializer write() {
                    return findContextualConvertingSerializer.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(getclassdescription);
                }
            });
        }

        static /* synthetic */ findAnnotatedContentSerializer RemoteActionCompatParcelizer(getClassDescription getclassdescription) {
            return new NumberSerializersIntLikeSerializer(getclassdescription);
        }

        private AudioAttributesCompatParcelizer(_hasTypeResolver.write writeVar, findAnnotatedContentSerializer.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
            this(writeVar, audioAttributesCompatParcelizer, new PropertySerializerMapMulti(), new _unknownType());
        }

        private AudioAttributesCompatParcelizer(_hasTypeResolver.write writeVar, findAnnotatedContentSerializer.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer, SimpleBeanPropertyFilter simpleBeanPropertyFilter, _resolveSuperClass _resolvesuperclass) {
            this.AudioAttributesCompatParcelizer = writeVar;
            this.MediaBrowserCompatCustomActionResultReceiver = audioAttributesCompatParcelizer;
            this.read = simpleBeanPropertyFilter;
            this.RemoteActionCompatParcelizer = _resolvesuperclass;
            this.IconCompatParcelizer = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
        }

        @Override // o.StdKeySerializers.AudioAttributesCompatParcelizer
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public final AudioAttributesCompatParcelizer read(_resolveSuperClass _resolvesuperclass) {
            this.RemoteActionCompatParcelizer = (_resolveSuperClass) buildTypeSerializer.write(_resolvesuperclass, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
            return this;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // o.StdKeySerializers.AudioAttributesCompatParcelizer
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public AudioAttributesCompatParcelizer write(SimpleBeanPropertyFilter simpleBeanPropertyFilter) {
            this.read = (SimpleBeanPropertyFilter) buildTypeSerializer.write(simpleBeanPropertyFilter, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.");
            return this;
        }

        @Override // o.StdKeySerializers.AudioAttributesCompatParcelizer
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final findContextualConvertingSerializer write(JsonSerializableSchema jsonSerializableSchema) {
            JsonSerializableSchema.AudioAttributesImplApi21Parcelizer audioAttributesImplApi21Parcelizer = jsonSerializableSchema.AudioAttributesCompatParcelizer;
            return new findContextualConvertingSerializer(jsonSerializableSchema, this.AudioAttributesCompatParcelizer, this.MediaBrowserCompatCustomActionResultReceiver, this.read.read(jsonSerializableSchema), this.RemoteActionCompatParcelizer, this.IconCompatParcelizer, (byte) 0);
        }
    }

    private findContextualConvertingSerializer(JsonSerializableSchema jsonSerializableSchema, _hasTypeResolver.write writeVar, findAnnotatedContentSerializer.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer, matchesUntyped matchesuntyped, _resolveSuperClass _resolvesuperclass, int i) {
        this.read = jsonSerializableSchema;
        this.IconCompatParcelizer = writeVar;
        this.MediaBrowserCompatCustomActionResultReceiver = audioAttributesCompatParcelizer;
        this.AudioAttributesCompatParcelizer = matchesuntyped;
        this.RemoteActionCompatParcelizer = _resolvesuperclass;
        this.write = i;
        this.MediaBrowserCompatItemReceiver = true;
        this.AudioAttributesImplApi21Parcelizer = C.TIME_UNSET;
    }

    @Override // kotlin.StdKeySerializers
    public final JsonSerializableSchema getMediaItem() {
        JsonSerializableSchema jsonSerializableSchema;
        synchronized (this) {
            jsonSerializableSchema = this.read;
        }
        return jsonSerializableSchema;
    }

    @Override // kotlin.StdKeySerializers
    public final boolean canUpdateMediaItem(JsonSerializableSchema jsonSerializableSchema) {
        JsonSerializableSchema.AudioAttributesImplApi21Parcelizer audioAttributesImplApi21ParcelizerWrite = write();
        JsonSerializableSchema.AudioAttributesImplApi21Parcelizer audioAttributesImplApi21Parcelizer = jsonSerializableSchema.AudioAttributesCompatParcelizer;
        return audioAttributesImplApi21Parcelizer != null && audioAttributesImplApi21Parcelizer.MediaBrowserCompatItemReceiver.equals(audioAttributesImplApi21ParcelizerWrite.MediaBrowserCompatItemReceiver) && audioAttributesImplApi21Parcelizer.write == audioAttributesImplApi21ParcelizerWrite.write && LaissezFaireSubTypeValidator.read(audioAttributesImplApi21Parcelizer.IconCompatParcelizer, audioAttributesImplApi21ParcelizerWrite.IconCompatParcelizer);
    }

    @Override // kotlin.StdKeySerializers
    public final void updateMediaItem(JsonSerializableSchema jsonSerializableSchema) {
        synchronized (this) {
            this.read = jsonSerializableSchema;
        }
    }

    @Override // kotlin.NumberSerializers1
    protected final void prepareSourceInternal(TypeNameIdResolver typeNameIdResolver) {
        this.MediaBrowserCompatSearchResultReceiver = typeNameIdResolver;
        this.AudioAttributesCompatParcelizer.write((Looper) buildTypeSerializer.IconCompatParcelizer(Looper.myLooper()), getPlayerId());
        this.AudioAttributesCompatParcelizer.IconCompatParcelizer();
        AudioAttributesCompatParcelizer();
    }

    @Override // kotlin.StdKeySerializers
    public final StdJdkSerializersAtomicIntegerSerializer createPeriod(StdKeySerializers.write writeVar, _findWellKnownSimple _findwellknownsimple, long j) {
        _hasTypeResolver _hastyperesolverWrite = this.IconCompatParcelizer.write();
        TypeNameIdResolver typeNameIdResolver = this.MediaBrowserCompatSearchResultReceiver;
        if (typeNameIdResolver != null) {
            _hastyperesolverWrite.read(typeNameIdResolver);
        }
        JsonSerializableSchema.AudioAttributesImplApi21Parcelizer audioAttributesImplApi21ParcelizerWrite = write();
        Uri uri = audioAttributesImplApi21ParcelizerWrite.MediaBrowserCompatItemReceiver;
        findAnnotatedContentSerializer.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = this.MediaBrowserCompatCustomActionResultReceiver;
        getPlayerId();
        return new _nonEmpty(uri, _hastyperesolverWrite, audioAttributesCompatParcelizer.write(), this.AudioAttributesCompatParcelizer, createDrmEventDispatcher(writeVar), this.RemoteActionCompatParcelizer, createEventDispatcher(writeVar), this, _findwellknownsimple, audioAttributesImplApi21ParcelizerWrite.IconCompatParcelizer, this.write, LaissezFaireSubTypeValidator.IconCompatParcelizer(audioAttributesImplApi21ParcelizerWrite.write));
    }

    @Override // kotlin.StdKeySerializers
    public final void releasePeriod(StdJdkSerializersAtomicIntegerSerializer stdJdkSerializersAtomicIntegerSerializer) {
        ((_nonEmpty) stdJdkSerializersAtomicIntegerSerializer).MediaMetadataCompat();
    }

    @Override // kotlin.NumberSerializers1
    protected final void releaseSourceInternal() {
        this.AudioAttributesCompatParcelizer.write();
    }

    @Override // o._nonEmpty.IconCompatParcelizer
    public final void IconCompatParcelizer(long j, boolean z, boolean z2) {
        if (j == C.TIME_UNSET) {
            j = this.AudioAttributesImplApi21Parcelizer;
        }
        if (!this.MediaBrowserCompatItemReceiver && this.AudioAttributesImplApi21Parcelizer == j && this.AudioAttributesImplBaseParcelizer == z && this.AudioAttributesImplApi26Parcelizer == z2) {
            return;
        }
        this.AudioAttributesImplApi21Parcelizer = j;
        this.AudioAttributesImplBaseParcelizer = z;
        this.AudioAttributesImplApi26Parcelizer = z2;
        this.MediaBrowserCompatItemReceiver = false;
        AudioAttributesCompatParcelizer();
    }

    private JsonSerializableSchema.AudioAttributesImplApi21Parcelizer write() {
        return (JsonSerializableSchema.AudioAttributesImplApi21Parcelizer) buildTypeSerializer.IconCompatParcelizer(getMediaItem().AudioAttributesCompatParcelizer);
    }

    private void AudioAttributesCompatParcelizer() {
        PolymorphicTypeValidator tokenBufferSerializer = new TokenBufferSerializer(this.AudioAttributesImplApi21Parcelizer, this.AudioAttributesImplBaseParcelizer, this.AudioAttributesImplApi26Parcelizer, getMediaItem());
        if (this.MediaBrowserCompatItemReceiver) {
            tokenBufferSerializer = new StdArraySerializersFloatArraySerializer(tokenBufferSerializer) { // from class: o.findContextualConvertingSerializer.1
                @Override // kotlin.StdArraySerializersFloatArraySerializer, kotlin.PolymorphicTypeValidator
                public final PolymorphicTypeValidator.IconCompatParcelizer write(int i, PolymorphicTypeValidator.IconCompatParcelizer iconCompatParcelizer, long j) {
                    super.write(i, iconCompatParcelizer, j);
                    iconCompatParcelizer.MediaBrowserCompatItemReceiver = true;
                    return iconCompatParcelizer;
                }

                @Override // kotlin.StdArraySerializersFloatArraySerializer, kotlin.PolymorphicTypeValidator
                public final PolymorphicTypeValidator.AudioAttributesCompatParcelizer RemoteActionCompatParcelizer(int i, PolymorphicTypeValidator.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer, boolean z) {
                    super.RemoteActionCompatParcelizer(i, audioAttributesCompatParcelizer, z);
                    audioAttributesCompatParcelizer.IconCompatParcelizer = true;
                    return audioAttributesCompatParcelizer;
                }
            };
        }
        refreshSourceInfo(tokenBufferSerializer);
    }
}
