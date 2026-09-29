package kotlin;

import com.google.android.exoplayer2.C;
import java.util.Objects;
import kotlin.JsonSerializableSchema;
import kotlin.StdKeySerializers;

/* JADX INFO: loaded from: classes2.dex */
public final class _writeArrayContents extends NumberSerializers1 {
    private final long IconCompatParcelizer;
    private JsonSerializableSchema RemoteActionCompatParcelizer;
    private final StdArraySerializersLongArraySerializer read;

    @Override // kotlin.StdKeySerializers
    public final void maybeThrowSourceInfoRefreshError() {
    }

    @Override // kotlin.NumberSerializers1
    protected final void releaseSourceInternal() {
    }

    /* synthetic */ _writeArrayContents(JsonSerializableSchema jsonSerializableSchema, long j, StdArraySerializersLongArraySerializer stdArraySerializersLongArraySerializer, byte b) {
        this(jsonSerializableSchema, j, stdArraySerializersLongArraySerializer);
    }

    public static final class RemoteActionCompatParcelizer implements StdKeySerializers.AudioAttributesCompatParcelizer {
        private final long AudioAttributesCompatParcelizer;
        private final StdArraySerializersLongArraySerializer write;

        @Override // o.StdKeySerializers.AudioAttributesCompatParcelizer
        public final StdKeySerializers.AudioAttributesCompatParcelizer read(_resolveSuperClass _resolvesuperclass) {
            return this;
        }

        @Override // o.StdKeySerializers.AudioAttributesCompatParcelizer
        public final StdKeySerializers.AudioAttributesCompatParcelizer write(SimpleBeanPropertyFilter simpleBeanPropertyFilter) {
            return this;
        }

        public RemoteActionCompatParcelizer(long j, StdArraySerializersLongArraySerializer stdArraySerializersLongArraySerializer) {
            this.AudioAttributesCompatParcelizer = j;
            this.write = stdArraySerializersLongArraySerializer;
        }

        @Override // o.StdKeySerializers.AudioAttributesCompatParcelizer
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final _writeArrayContents write(JsonSerializableSchema jsonSerializableSchema) {
            return new _writeArrayContents(jsonSerializableSchema, this.AudioAttributesCompatParcelizer, this.write, (byte) 0);
        }
    }

    private _writeArrayContents(JsonSerializableSchema jsonSerializableSchema, long j, StdArraySerializersLongArraySerializer stdArraySerializersLongArraySerializer) {
        this.RemoteActionCompatParcelizer = jsonSerializableSchema;
        this.IconCompatParcelizer = j;
        this.read = stdArraySerializersLongArraySerializer;
    }

    @Override // kotlin.NumberSerializers1
    protected final void prepareSourceInternal(TypeNameIdResolver typeNameIdResolver) {
        refreshSourceInfo(new TokenBufferSerializer(this.IconCompatParcelizer, true, false, getMediaItem()));
    }

    @Override // kotlin.StdKeySerializers
    public final JsonSerializableSchema getMediaItem() {
        JsonSerializableSchema jsonSerializableSchema;
        synchronized (this) {
            jsonSerializableSchema = this.RemoteActionCompatParcelizer;
        }
        return jsonSerializableSchema;
    }

    @Override // kotlin.StdKeySerializers
    public final boolean canUpdateMediaItem(JsonSerializableSchema jsonSerializableSchema) {
        JsonSerializableSchema.AudioAttributesImplApi21Parcelizer audioAttributesImplApi21Parcelizer = jsonSerializableSchema.AudioAttributesCompatParcelizer;
        JsonSerializableSchema.AudioAttributesImplApi21Parcelizer audioAttributesImplApi21Parcelizer2 = (JsonSerializableSchema.AudioAttributesImplApi21Parcelizer) buildTypeSerializer.IconCompatParcelizer(getMediaItem().AudioAttributesCompatParcelizer);
        if (audioAttributesImplApi21Parcelizer != null && audioAttributesImplApi21Parcelizer.MediaBrowserCompatItemReceiver.equals(audioAttributesImplApi21Parcelizer2.MediaBrowserCompatItemReceiver) && Objects.equals(audioAttributesImplApi21Parcelizer.AudioAttributesCompatParcelizer, audioAttributesImplApi21Parcelizer2.AudioAttributesCompatParcelizer)) {
            return audioAttributesImplApi21Parcelizer.write == C.TIME_UNSET || LaissezFaireSubTypeValidator.IconCompatParcelizer(audioAttributesImplApi21Parcelizer.write) == this.IconCompatParcelizer;
        }
        return false;
    }

    @Override // kotlin.StdKeySerializers
    public final void updateMediaItem(JsonSerializableSchema jsonSerializableSchema) {
        synchronized (this) {
            this.RemoteActionCompatParcelizer = jsonSerializableSchema;
        }
    }

    @Override // kotlin.StdKeySerializers
    public final StdJdkSerializersAtomicIntegerSerializer createPeriod(StdKeySerializers.write writeVar, _findWellKnownSimple _findwellknownsimple, long j) {
        JsonSerializableSchema mediaItem = getMediaItem();
        JsonSerializableSchema.AudioAttributesImplApi21Parcelizer audioAttributesImplApi21Parcelizer = mediaItem.AudioAttributesCompatParcelizer;
        buildTypeSerializer.write(mediaItem.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer, "Externally loaded mediaItems require a MIME type.");
        return new StdArraySerializersDoubleArraySerializer(mediaItem.AudioAttributesCompatParcelizer.MediaBrowserCompatItemReceiver, mediaItem.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer, this.read);
    }

    @Override // kotlin.StdKeySerializers
    public final void releasePeriod(StdJdkSerializersAtomicIntegerSerializer stdJdkSerializersAtomicIntegerSerializer) {
        ((StdArraySerializersDoubleArraySerializer) stdJdkSerializersAtomicIntegerSerializer).MediaBrowserCompatItemReceiver();
    }
}
