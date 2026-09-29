package kotlin;

import com.google.android.exoplayer2.C;
import java.io.IOException;
import kotlin.StdJdkSerializersAtomicIntegerSerializer;
import kotlin.StdKeySerializers;

/* JADX INFO: loaded from: classes2.dex */
public final class StdJdkSerializers implements StdJdkSerializersAtomicIntegerSerializer, StdJdkSerializersAtomicIntegerSerializer.AudioAttributesCompatParcelizer {
    private write AudioAttributesCompatParcelizer;
    private StdKeySerializers AudioAttributesImplApi21Parcelizer;
    private long AudioAttributesImplApi26Parcelizer = C.TIME_UNSET;
    private StdJdkSerializersAtomicIntegerSerializer.AudioAttributesCompatParcelizer IconCompatParcelizer;
    private final long MediaBrowserCompatCustomActionResultReceiver;
    private final _findWellKnownSimple RemoteActionCompatParcelizer;
    private StdJdkSerializersAtomicIntegerSerializer read;
    public final StdKeySerializers.write write;

    public interface write {
    }

    @Override // o.UUIDSerializer.RemoteActionCompatParcelizer
    public final /* synthetic */ void RemoteActionCompatParcelizer(UUIDSerializer uUIDSerializer) {
        AudioAttributesImplApi26Parcelizer();
    }

    public StdJdkSerializers(StdKeySerializers.write writeVar, _findWellKnownSimple _findwellknownsimple, long j) {
        this.write = writeVar;
        this.RemoteActionCompatParcelizer = _findwellknownsimple;
        this.MediaBrowserCompatCustomActionResultReceiver = j;
    }

    public final long MediaBrowserCompatCustomActionResultReceiver() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    public final void read(long j) {
        this.AudioAttributesImplApi26Parcelizer = j;
    }

    public final long AudioAttributesImplApi21Parcelizer() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    public final void RemoteActionCompatParcelizer(StdKeySerializers stdKeySerializers) {
        buildTypeSerializer.write(this.AudioAttributesImplApi21Parcelizer == null);
        this.AudioAttributesImplApi21Parcelizer = stdKeySerializers;
    }

    public final void RemoteActionCompatParcelizer(StdKeySerializers.write writeVar) {
        long jAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver);
        StdJdkSerializersAtomicIntegerSerializer stdJdkSerializersAtomicIntegerSerializerCreatePeriod = ((StdKeySerializers) buildTypeSerializer.IconCompatParcelizer(this.AudioAttributesImplApi21Parcelizer)).createPeriod(writeVar, this.RemoteActionCompatParcelizer, jAudioAttributesCompatParcelizer);
        this.read = stdJdkSerializersAtomicIntegerSerializerCreatePeriod;
        if (this.IconCompatParcelizer != null) {
            stdJdkSerializersAtomicIntegerSerializerCreatePeriod.IconCompatParcelizer(this, jAudioAttributesCompatParcelizer);
        }
    }

    public final void MediaBrowserCompatItemReceiver() {
        if (this.read != null) {
            ((StdKeySerializers) buildTypeSerializer.IconCompatParcelizer(this.AudioAttributesImplApi21Parcelizer)).releasePeriod(this.read);
        }
    }

    @Override // kotlin.StdJdkSerializersAtomicIntegerSerializer
    public final void IconCompatParcelizer(StdJdkSerializersAtomicIntegerSerializer.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer, long j) {
        this.IconCompatParcelizer = audioAttributesCompatParcelizer;
        StdJdkSerializersAtomicIntegerSerializer stdJdkSerializersAtomicIntegerSerializer = this.read;
        if (stdJdkSerializersAtomicIntegerSerializer != null) {
            stdJdkSerializersAtomicIntegerSerializer.IconCompatParcelizer(this, AudioAttributesCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver));
        }
    }

    @Override // kotlin.StdJdkSerializersAtomicIntegerSerializer
    public final void write() throws IOException {
        StdJdkSerializersAtomicIntegerSerializer stdJdkSerializersAtomicIntegerSerializer = this.read;
        if (stdJdkSerializersAtomicIntegerSerializer != null) {
            stdJdkSerializersAtomicIntegerSerializer.write();
            return;
        }
        StdKeySerializers stdKeySerializers = this.AudioAttributesImplApi21Parcelizer;
        if (stdKeySerializers != null) {
            stdKeySerializers.maybeThrowSourceInfoRefreshError();
        }
    }

    @Override // kotlin.StdJdkSerializersAtomicIntegerSerializer
    public final _writeAsBinary D_() {
        return ((StdJdkSerializersAtomicIntegerSerializer) LaissezFaireSubTypeValidator.IconCompatParcelizer(this.read)).D_();
    }

    @Override // kotlin.StdJdkSerializersAtomicIntegerSerializer
    public final long read(_verifyAndResolvePlaceholders[] _verifyandresolveplaceholdersArr, boolean[] zArr, visitStringFormat[] visitstringformatArr, boolean[] zArr2, long j) {
        long j2 = this.AudioAttributesImplApi26Parcelizer;
        long j3 = (j2 == C.TIME_UNSET || j != this.MediaBrowserCompatCustomActionResultReceiver) ? j : j2;
        this.AudioAttributesImplApi26Parcelizer = C.TIME_UNSET;
        return ((StdJdkSerializersAtomicIntegerSerializer) LaissezFaireSubTypeValidator.IconCompatParcelizer(this.read)).read(_verifyandresolveplaceholdersArr, zArr, visitstringformatArr, zArr2, j3);
    }

    @Override // kotlin.StdJdkSerializersAtomicIntegerSerializer
    public final void IconCompatParcelizer(long j, boolean z) {
        ((StdJdkSerializersAtomicIntegerSerializer) LaissezFaireSubTypeValidator.IconCompatParcelizer(this.read)).IconCompatParcelizer(j, z);
    }

    @Override // kotlin.StdJdkSerializersAtomicIntegerSerializer
    public final long E_() {
        return ((StdJdkSerializersAtomicIntegerSerializer) LaissezFaireSubTypeValidator.IconCompatParcelizer(this.read)).E_();
    }

    @Override // kotlin.StdJdkSerializersAtomicIntegerSerializer, kotlin.UUIDSerializer
    public final long read() {
        return ((StdJdkSerializersAtomicIntegerSerializer) LaissezFaireSubTypeValidator.IconCompatParcelizer(this.read)).read();
    }

    @Override // kotlin.StdJdkSerializersAtomicIntegerSerializer
    public final long write(long j) {
        return ((StdJdkSerializersAtomicIntegerSerializer) LaissezFaireSubTypeValidator.IconCompatParcelizer(this.read)).write(j);
    }

    @Override // kotlin.StdJdkSerializersAtomicIntegerSerializer
    public final long read(long j, createKeySerializer createkeyserializer) {
        return ((StdJdkSerializersAtomicIntegerSerializer) LaissezFaireSubTypeValidator.IconCompatParcelizer(this.read)).read(j, createkeyserializer);
    }

    @Override // kotlin.StdJdkSerializersAtomicIntegerSerializer, kotlin.UUIDSerializer
    public final long AudioAttributesCompatParcelizer() {
        return ((StdJdkSerializersAtomicIntegerSerializer) LaissezFaireSubTypeValidator.IconCompatParcelizer(this.read)).AudioAttributesCompatParcelizer();
    }

    @Override // kotlin.StdJdkSerializersAtomicIntegerSerializer, kotlin.UUIDSerializer
    public final void RemoteActionCompatParcelizer(long j) {
        ((StdJdkSerializersAtomicIntegerSerializer) LaissezFaireSubTypeValidator.IconCompatParcelizer(this.read)).RemoteActionCompatParcelizer(j);
    }

    @Override // kotlin.StdJdkSerializersAtomicIntegerSerializer, kotlin.UUIDSerializer
    public final boolean RemoteActionCompatParcelizer(_put _putVar) {
        StdJdkSerializersAtomicIntegerSerializer stdJdkSerializersAtomicIntegerSerializer = this.read;
        return stdJdkSerializersAtomicIntegerSerializer != null && stdJdkSerializersAtomicIntegerSerializer.RemoteActionCompatParcelizer(_putVar);
    }

    @Override // kotlin.StdJdkSerializersAtomicIntegerSerializer, kotlin.UUIDSerializer
    public final boolean IconCompatParcelizer() {
        StdJdkSerializersAtomicIntegerSerializer stdJdkSerializersAtomicIntegerSerializer = this.read;
        return stdJdkSerializersAtomicIntegerSerializer != null && stdJdkSerializersAtomicIntegerSerializer.IconCompatParcelizer();
    }

    private void AudioAttributesImplApi26Parcelizer() {
        ((StdJdkSerializersAtomicIntegerSerializer.AudioAttributesCompatParcelizer) LaissezFaireSubTypeValidator.IconCompatParcelizer(this.IconCompatParcelizer)).RemoteActionCompatParcelizer(this);
    }

    @Override // o.StdJdkSerializersAtomicIntegerSerializer.AudioAttributesCompatParcelizer
    public final void write(StdJdkSerializersAtomicIntegerSerializer stdJdkSerializersAtomicIntegerSerializer) {
        ((StdJdkSerializersAtomicIntegerSerializer.AudioAttributesCompatParcelizer) LaissezFaireSubTypeValidator.IconCompatParcelizer(this.IconCompatParcelizer)).write(this);
    }

    private long AudioAttributesCompatParcelizer(long j) {
        long j2 = this.AudioAttributesImplApi26Parcelizer;
        return j2 != C.TIME_UNSET ? j2 : j;
    }
}
