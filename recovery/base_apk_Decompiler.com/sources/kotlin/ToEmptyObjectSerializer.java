package kotlin;

import android.net.Uri;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.util.MimeTypes;
import kotlin.C0170format;
import kotlin.JsonSerializableSchema;
import kotlin.StdKeySerializers;
import kotlin.SubTypeValidator;
import kotlin._hasTypeResolver;

/* JADX INFO: loaded from: classes2.dex */
public final class ToEmptyObjectSerializer extends NumberSerializers1 {
    private final C0170format AudioAttributesCompatParcelizer;
    private final boolean AudioAttributesImplApi21Parcelizer;
    private final JsonSerializableSchema AudioAttributesImplApi26Parcelizer;
    private TypeNameIdResolver AudioAttributesImplBaseParcelizer;
    private final _hasTypeResolver.write IconCompatParcelizer;
    private final PolymorphicTypeValidator MediaBrowserCompatItemReceiver;
    private final SubTypeValidator RemoteActionCompatParcelizer;
    private final long read;
    private final _resolveSuperClass write;

    @Override // kotlin.StdKeySerializers
    public final void maybeThrowSourceInfoRefreshError() {
    }

    @Override // kotlin.NumberSerializers1
    protected final void releaseSourceInternal() {
    }

    /* synthetic */ ToEmptyObjectSerializer(String str, JsonSerializableSchema.MediaBrowserCompatItemReceiver mediaBrowserCompatItemReceiver, _hasTypeResolver.write writeVar, long j, _resolveSuperClass _resolvesuperclass, boolean z, Object obj, byte b) {
        this(str, mediaBrowserCompatItemReceiver, writeVar, C.TIME_UNSET, _resolvesuperclass, z, obj);
    }

    public static final class RemoteActionCompatParcelizer {
        private String IconCompatParcelizer;
        private final _hasTypeResolver.write read;
        private Object write;
        private _resolveSuperClass RemoteActionCompatParcelizer = new _unknownType();
        private boolean AudioAttributesCompatParcelizer = true;

        public RemoteActionCompatParcelizer(_hasTypeResolver.write writeVar) {
            this.read = (_hasTypeResolver.write) buildTypeSerializer.IconCompatParcelizer(writeVar);
        }

        public final RemoteActionCompatParcelizer AudioAttributesCompatParcelizer(_resolveSuperClass _resolvesuperclass) {
            if (_resolvesuperclass == null) {
                _resolvesuperclass = new _unknownType();
            }
            this.RemoteActionCompatParcelizer = _resolvesuperclass;
            return this;
        }

        public final ToEmptyObjectSerializer write(JsonSerializableSchema.MediaBrowserCompatItemReceiver mediaBrowserCompatItemReceiver) {
            return new ToEmptyObjectSerializer(this.IconCompatParcelizer, mediaBrowserCompatItemReceiver, this.read, C.TIME_UNSET, this.RemoteActionCompatParcelizer, this.AudioAttributesCompatParcelizer, this.write, (byte) 0);
        }
    }

    private ToEmptyObjectSerializer(String str, JsonSerializableSchema.MediaBrowserCompatItemReceiver mediaBrowserCompatItemReceiver, _hasTypeResolver.write writeVar, long j, _resolveSuperClass _resolvesuperclass, boolean z, Object obj) {
        this.IconCompatParcelizer = writeVar;
        this.read = j;
        this.write = _resolvesuperclass;
        this.AudioAttributesImplApi21Parcelizer = z;
        JsonSerializableSchema jsonSerializableSchemaIconCompatParcelizer = new JsonSerializableSchema.IconCompatParcelizer().read(Uri.EMPTY).RemoteActionCompatParcelizer(mediaBrowserCompatItemReceiver.AudioAttributesImplBaseParcelizer.toString()).IconCompatParcelizer(initExtraTracks.read(mediaBrowserCompatItemReceiver)).read(obj).IconCompatParcelizer();
        this.AudioAttributesImplApi26Parcelizer = jsonSerializableSchemaIconCompatParcelizer;
        this.AudioAttributesCompatParcelizer = new C0170format.RemoteActionCompatParcelizer().AudioAttributesImplApi26Parcelizer((String) parseStbl.RemoteActionCompatParcelizer(mediaBrowserCompatItemReceiver.write, MimeTypes.TEXT_UNKNOWN)).read(mediaBrowserCompatItemReceiver.read).handleMediaPlayPauseIfPendingOnHandler(mediaBrowserCompatItemReceiver.MediaBrowserCompatCustomActionResultReceiver).MediaBrowserCompatSearchResultReceiver(mediaBrowserCompatItemReceiver.IconCompatParcelizer).write(mediaBrowserCompatItemReceiver.AudioAttributesCompatParcelizer).AudioAttributesCompatParcelizer(mediaBrowserCompatItemReceiver.RemoteActionCompatParcelizer != null ? mediaBrowserCompatItemReceiver.RemoteActionCompatParcelizer : str).IconCompatParcelizer();
        this.RemoteActionCompatParcelizer = new SubTypeValidator.write().IconCompatParcelizer(mediaBrowserCompatItemReceiver.AudioAttributesImplBaseParcelizer).read(1).write();
        this.MediaBrowserCompatItemReceiver = new TokenBufferSerializer(j, true, false, jsonSerializableSchemaIconCompatParcelizer);
    }

    @Override // kotlin.StdKeySerializers
    public final JsonSerializableSchema getMediaItem() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    @Override // kotlin.NumberSerializers1
    protected final void prepareSourceInternal(TypeNameIdResolver typeNameIdResolver) {
        this.AudioAttributesImplBaseParcelizer = typeNameIdResolver;
        refreshSourceInfo(this.MediaBrowserCompatItemReceiver);
    }

    @Override // kotlin.StdKeySerializers
    public final StdJdkSerializersAtomicIntegerSerializer createPeriod(StdKeySerializers.write writeVar, _findWellKnownSimple _findwellknownsimple, long j) {
        return new ToStringSerializer(this.RemoteActionCompatParcelizer, this.IconCompatParcelizer, this.AudioAttributesImplBaseParcelizer, this.AudioAttributesCompatParcelizer, this.read, this.write, createEventDispatcher(writeVar), this.AudioAttributesImplApi21Parcelizer);
    }

    @Override // kotlin.StdKeySerializers
    public final void releasePeriod(StdJdkSerializersAtomicIntegerSerializer stdJdkSerializersAtomicIntegerSerializer) {
        ((ToStringSerializer) stdJdkSerializersAtomicIntegerSerializer).AudioAttributesImplApi26Parcelizer();
    }
}
