package kotlin;

import com.google.android.exoplayer2.C;
import java.io.IOException;
import kotlin.StdJdkSerializersAtomicIntegerSerializer;

/* JADX INFO: loaded from: classes2.dex */
final class _appendInt implements StdJdkSerializersAtomicIntegerSerializer, StdJdkSerializersAtomicIntegerSerializer.AudioAttributesCompatParcelizer {
    private StdJdkSerializersAtomicIntegerSerializer.AudioAttributesCompatParcelizer AudioAttributesCompatParcelizer;
    private final StdJdkSerializersAtomicIntegerSerializer IconCompatParcelizer;
    private final long read;

    @Override // o.UUIDSerializer.RemoteActionCompatParcelizer
    public final /* synthetic */ void RemoteActionCompatParcelizer(UUIDSerializer uUIDSerializer) {
        MediaBrowserCompatCustomActionResultReceiver();
    }

    public _appendInt(StdJdkSerializersAtomicIntegerSerializer stdJdkSerializersAtomicIntegerSerializer, long j) {
        this.IconCompatParcelizer = stdJdkSerializersAtomicIntegerSerializer;
        this.read = j;
    }

    public final StdJdkSerializersAtomicIntegerSerializer AudioAttributesImplApi26Parcelizer() {
        return this.IconCompatParcelizer;
    }

    @Override // kotlin.StdJdkSerializersAtomicIntegerSerializer
    public final void IconCompatParcelizer(StdJdkSerializersAtomicIntegerSerializer.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer, long j) {
        this.AudioAttributesCompatParcelizer = audioAttributesCompatParcelizer;
        this.IconCompatParcelizer.IconCompatParcelizer(this, j - this.read);
    }

    @Override // kotlin.StdJdkSerializersAtomicIntegerSerializer
    public final void write() throws IOException {
        this.IconCompatParcelizer.write();
    }

    @Override // kotlin.StdJdkSerializersAtomicIntegerSerializer
    public final _writeAsBinary D_() {
        return this.IconCompatParcelizer.D_();
    }

    @Override // kotlin.StdJdkSerializersAtomicIntegerSerializer
    public final long read(_verifyAndResolvePlaceholders[] _verifyandresolveplaceholdersArr, boolean[] zArr, visitStringFormat[] visitstringformatArr, boolean[] zArr2, long j) {
        visitStringFormat[] visitstringformatArr2 = new visitStringFormat[visitstringformatArr.length];
        int i = 0;
        while (true) {
            visitStringFormat visitstringformatRemoteActionCompatParcelizer = null;
            if (i >= visitstringformatArr.length) {
                break;
            }
            AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = (AudioAttributesCompatParcelizer) visitstringformatArr[i];
            if (audioAttributesCompatParcelizer != null) {
                visitstringformatRemoteActionCompatParcelizer = audioAttributesCompatParcelizer.RemoteActionCompatParcelizer();
            }
            visitstringformatArr2[i] = visitstringformatRemoteActionCompatParcelizer;
            i++;
        }
        long j2 = this.IconCompatParcelizer.read(_verifyandresolveplaceholdersArr, zArr, visitstringformatArr2, zArr2, j - this.read);
        for (int i2 = 0; i2 < visitstringformatArr.length; i2++) {
            visitStringFormat visitstringformat = visitstringformatArr2[i2];
            if (visitstringformat == null) {
                visitstringformatArr[i2] = null;
            } else {
                visitStringFormat visitstringformat2 = visitstringformatArr[i2];
                if (visitstringformat2 == null || ((AudioAttributesCompatParcelizer) visitstringformat2).RemoteActionCompatParcelizer() != visitstringformat) {
                    visitstringformatArr[i2] = new AudioAttributesCompatParcelizer(visitstringformat, this.read);
                }
            }
        }
        return j2 + this.read;
    }

    @Override // kotlin.StdJdkSerializersAtomicIntegerSerializer
    public final void IconCompatParcelizer(long j, boolean z) {
        this.IconCompatParcelizer.IconCompatParcelizer(j - this.read, z);
    }

    @Override // kotlin.StdJdkSerializersAtomicIntegerSerializer
    public final long E_() {
        long jE_ = this.IconCompatParcelizer.E_();
        return jE_ == C.TIME_UNSET ? C.TIME_UNSET : jE_ + this.read;
    }

    @Override // kotlin.StdJdkSerializersAtomicIntegerSerializer
    public final long write(long j) {
        return this.IconCompatParcelizer.write(j - this.read) + this.read;
    }

    @Override // kotlin.StdJdkSerializersAtomicIntegerSerializer
    public final long read(long j, createKeySerializer createkeyserializer) {
        return this.IconCompatParcelizer.read(j - this.read, createkeyserializer) + this.read;
    }

    @Override // kotlin.StdJdkSerializersAtomicIntegerSerializer, kotlin.UUIDSerializer
    public final long read() {
        long j = this.IconCompatParcelizer.read();
        if (j == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return j + this.read;
    }

    @Override // kotlin.StdJdkSerializersAtomicIntegerSerializer, kotlin.UUIDSerializer
    public final long AudioAttributesCompatParcelizer() {
        long jAudioAttributesCompatParcelizer = this.IconCompatParcelizer.AudioAttributesCompatParcelizer();
        if (jAudioAttributesCompatParcelizer == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return jAudioAttributesCompatParcelizer + this.read;
    }

    @Override // kotlin.StdJdkSerializersAtomicIntegerSerializer, kotlin.UUIDSerializer
    public final boolean RemoteActionCompatParcelizer(_put _putVar) {
        return this.IconCompatParcelizer.RemoteActionCompatParcelizer(_putVar.write().IconCompatParcelizer(_putVar.write - this.read).write());
    }

    @Override // kotlin.StdJdkSerializersAtomicIntegerSerializer, kotlin.UUIDSerializer
    public final boolean IconCompatParcelizer() {
        return this.IconCompatParcelizer.IconCompatParcelizer();
    }

    @Override // kotlin.StdJdkSerializersAtomicIntegerSerializer, kotlin.UUIDSerializer
    public final void RemoteActionCompatParcelizer(long j) {
        this.IconCompatParcelizer.RemoteActionCompatParcelizer(j - this.read);
    }

    @Override // o.StdJdkSerializersAtomicIntegerSerializer.AudioAttributesCompatParcelizer
    public final void write(StdJdkSerializersAtomicIntegerSerializer stdJdkSerializersAtomicIntegerSerializer) {
        ((StdJdkSerializersAtomicIntegerSerializer.AudioAttributesCompatParcelizer) buildTypeSerializer.IconCompatParcelizer(this.AudioAttributesCompatParcelizer)).write(this);
    }

    private void MediaBrowserCompatCustomActionResultReceiver() {
        ((StdJdkSerializersAtomicIntegerSerializer.AudioAttributesCompatParcelizer) buildTypeSerializer.IconCompatParcelizer(this.AudioAttributesCompatParcelizer)).RemoteActionCompatParcelizer(this);
    }

    static final class AudioAttributesCompatParcelizer implements visitStringFormat {
        private final long AudioAttributesCompatParcelizer;
        private final visitStringFormat write;

        public AudioAttributesCompatParcelizer(visitStringFormat visitstringformat, long j) {
            this.write = visitstringformat;
            this.AudioAttributesCompatParcelizer = j;
        }

        public final visitStringFormat RemoteActionCompatParcelizer() {
            return this.write;
        }

        @Override // kotlin.visitStringFormat
        public final boolean F_() {
            return this.write.F_();
        }

        @Override // kotlin.visitStringFormat
        public final void G_() throws IOException {
            this.write.G_();
        }

        @Override // kotlin.visitStringFormat
        public final int AudioAttributesCompatParcelizer(ObjectNode objectNode, _find _findVar, int i) {
            int iAudioAttributesCompatParcelizer = this.write.AudioAttributesCompatParcelizer(objectNode, _findVar, i);
            if (iAudioAttributesCompatParcelizer == -4) {
                _findVar.RemoteActionCompatParcelizer += this.AudioAttributesCompatParcelizer;
            }
            return iAudioAttributesCompatParcelizer;
        }

        @Override // kotlin.visitStringFormat
        public final int IconCompatParcelizer(long j) {
            return this.write.IconCompatParcelizer(j - this.AudioAttributesCompatParcelizer);
        }
    }
}
