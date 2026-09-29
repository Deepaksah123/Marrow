package kotlin;

import android.net.Uri;
import com.google.android.exoplayer2.C;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.C0170format;
import kotlin.StdArraySerializersLongArraySerializer;
import kotlin.StdJdkSerializersAtomicIntegerSerializer;

/* JADX INFO: loaded from: classes2.dex */
final class StdArraySerializersDoubleArraySerializer implements StdJdkSerializersAtomicIntegerSerializer {
    private final AtomicBoolean AudioAttributesCompatParcelizer;
    private final Uri AudioAttributesImplApi21Parcelizer;
    private final _writeAsBinary AudioAttributesImplApi26Parcelizer;
    private final StdArraySerializersLongArraySerializer IconCompatParcelizer;
    private Mp4ExtractorExternalSyntheticLambda0<?> RemoteActionCompatParcelizer;
    private final byte[] read;
    private final AtomicReference<Throwable> write;

    @Override // kotlin.StdJdkSerializersAtomicIntegerSerializer
    public final long E_() {
        return C.TIME_UNSET;
    }

    @Override // kotlin.StdJdkSerializersAtomicIntegerSerializer
    public final void IconCompatParcelizer(long j, boolean z) {
    }

    @Override // kotlin.StdJdkSerializersAtomicIntegerSerializer, kotlin.UUIDSerializer
    public final void RemoteActionCompatParcelizer(long j) {
    }

    @Override // kotlin.StdJdkSerializersAtomicIntegerSerializer
    public final long read(long j, createKeySerializer createkeyserializer) {
        return j;
    }

    @Override // kotlin.StdJdkSerializersAtomicIntegerSerializer
    public final long write(long j) {
        return j;
    }

    @Override // kotlin.StdJdkSerializersAtomicIntegerSerializer
    public final void write() {
    }

    public StdArraySerializersDoubleArraySerializer(Uri uri, String str, StdArraySerializersLongArraySerializer stdArraySerializersLongArraySerializer) {
        this.AudioAttributesImplApi21Parcelizer = uri;
        C0170format c0170formatIconCompatParcelizer = new C0170format.RemoteActionCompatParcelizer().AudioAttributesImplApi26Parcelizer(str).IconCompatParcelizer();
        this.IconCompatParcelizer = stdArraySerializersLongArraySerializer;
        this.AudioAttributesImplApi26Parcelizer = new _writeAsBinary(new setName(c0170formatIconCompatParcelizer));
        this.read = uri.toString().getBytes(parseMdtaFromMeta.AudioAttributesImplApi26Parcelizer);
        this.AudioAttributesCompatParcelizer = new AtomicBoolean();
        this.write = new AtomicReference<>();
    }

    @Override // kotlin.StdJdkSerializersAtomicIntegerSerializer
    public final void IconCompatParcelizer(StdJdkSerializersAtomicIntegerSerializer.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer, long j) {
        audioAttributesCompatParcelizer.write(this);
        StdArraySerializersLongArraySerializer stdArraySerializersLongArraySerializer = this.IconCompatParcelizer;
        new StdArraySerializersLongArraySerializer.IconCompatParcelizer(this.AudioAttributesImplApi21Parcelizer);
        Mp4ExtractorExternalSyntheticLambda0<?> mp4ExtractorExternalSyntheticLambda0 = stdArraySerializersLongArraySerializer.read();
        this.RemoteActionCompatParcelizer = mp4ExtractorExternalSyntheticLambda0;
        processEndOfStreamReadingAtomHeader.AudioAttributesCompatParcelizer(mp4ExtractorExternalSyntheticLambda0, new maybeAdjustSeekOffset<Object>() { // from class: o.StdArraySerializersDoubleArraySerializer.3
            @Override // kotlin.maybeAdjustSeekOffset
            public final void IconCompatParcelizer() {
                StdArraySerializersDoubleArraySerializer.this.AudioAttributesCompatParcelizer.set(true);
            }

            @Override // kotlin.maybeAdjustSeekOffset
            public final void write(Throwable th) {
                StdArraySerializersDoubleArraySerializer.this.write.set(th);
            }
        }, buildPsshAtom.IconCompatParcelizer());
    }

    @Override // kotlin.StdJdkSerializersAtomicIntegerSerializer
    public final _writeAsBinary D_() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    @Override // kotlin.StdJdkSerializersAtomicIntegerSerializer
    public final long read(_verifyAndResolvePlaceholders[] _verifyandresolveplaceholdersArr, boolean[] zArr, visitStringFormat[] visitstringformatArr, boolean[] zArr2, long j) {
        for (int i = 0; i < _verifyandresolveplaceholdersArr.length; i++) {
            if (visitstringformatArr[i] != null && (_verifyandresolveplaceholdersArr[i] == null || !zArr[i])) {
                visitstringformatArr[i] = null;
            }
            if (visitstringformatArr[i] == null && _verifyandresolveplaceholdersArr[i] != null) {
                visitstringformatArr[i] = new write();
                zArr2[i] = true;
            }
        }
        return j;
    }

    @Override // kotlin.StdJdkSerializersAtomicIntegerSerializer, kotlin.UUIDSerializer
    public final long read() {
        return this.AudioAttributesCompatParcelizer.get() ? Long.MIN_VALUE : 0L;
    }

    @Override // kotlin.StdJdkSerializersAtomicIntegerSerializer, kotlin.UUIDSerializer
    public final long AudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer.get() ? Long.MIN_VALUE : 0L;
    }

    @Override // kotlin.StdJdkSerializersAtomicIntegerSerializer, kotlin.UUIDSerializer
    public final boolean RemoteActionCompatParcelizer(_put _putVar) {
        return !this.AudioAttributesCompatParcelizer.get();
    }

    @Override // kotlin.StdJdkSerializersAtomicIntegerSerializer, kotlin.UUIDSerializer
    public final boolean IconCompatParcelizer() {
        return !this.AudioAttributesCompatParcelizer.get();
    }

    public final void MediaBrowserCompatItemReceiver() {
        Mp4ExtractorExternalSyntheticLambda0<?> mp4ExtractorExternalSyntheticLambda0 = this.RemoteActionCompatParcelizer;
        if (mp4ExtractorExternalSyntheticLambda0 != null) {
            mp4ExtractorExternalSyntheticLambda0.cancel(false);
        }
    }

    final class write implements visitStringFormat {
        private int write = 0;

        @Override // kotlin.visitStringFormat
        public final int IconCompatParcelizer(long j) {
            return 0;
        }

        public write() {
        }

        @Override // kotlin.visitStringFormat
        public final boolean F_() {
            return StdArraySerializersDoubleArraySerializer.this.AudioAttributesCompatParcelizer.get();
        }

        @Override // kotlin.visitStringFormat
        public final void G_() throws IOException {
            Throwable th = (Throwable) StdArraySerializersDoubleArraySerializer.this.write.get();
            if (th != null) {
                throw new IOException(th);
            }
        }

        @Override // kotlin.visitStringFormat
        public final int AudioAttributesCompatParcelizer(ObjectNode objectNode, _find _findVar, int i) {
            int i2 = this.write;
            if (i2 == 2) {
                _findVar.IconCompatParcelizer(4);
                return -4;
            }
            if ((i & 2) != 0 || i2 == 0) {
                objectNode.write = StdArraySerializersDoubleArraySerializer.this.AudioAttributesImplApi26Parcelizer.RemoteActionCompatParcelizer(0).AudioAttributesCompatParcelizer(0);
                this.write = 1;
                return -5;
            }
            if (!StdArraySerializersDoubleArraySerializer.this.AudioAttributesCompatParcelizer.get()) {
                return -3;
            }
            int length = StdArraySerializersDoubleArraySerializer.this.read.length;
            _findVar.IconCompatParcelizer(1);
            _findVar.RemoteActionCompatParcelizer = 0L;
            if ((i & 4) == 0) {
                _findVar.read(length);
                _findVar.read.put(StdArraySerializersDoubleArraySerializer.this.read, 0, length);
            }
            if ((i & 1) == 0) {
                this.write = 2;
            }
            return -4;
        }
    }
}
