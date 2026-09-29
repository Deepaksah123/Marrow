package kotlin;

import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import kotlin._findWellKnownSimple;
import kotlin.nonNullString;
import kotlin.visitIntFormat;

/* JADX INFO: loaded from: classes2.dex */
final class visitFloatFormat {
    private final int AudioAttributesCompatParcelizer;
    private RemoteActionCompatParcelizer AudioAttributesImplApi26Parcelizer;
    private long AudioAttributesImplBaseParcelizer;
    private final _findWellKnownSimple IconCompatParcelizer;
    private RemoteActionCompatParcelizer RemoteActionCompatParcelizer;
    private RemoteActionCompatParcelizer read;
    private final AsPropertyTypeDeserializer write;

    public visitFloatFormat(_findWellKnownSimple _findwellknownsimple) {
        this.IconCompatParcelizer = _findwellknownsimple;
        int iIconCompatParcelizer = _findwellknownsimple.IconCompatParcelizer();
        this.AudioAttributesCompatParcelizer = iIconCompatParcelizer;
        this.write = new AsPropertyTypeDeserializer(32);
        RemoteActionCompatParcelizer remoteActionCompatParcelizer = new RemoteActionCompatParcelizer(0L, iIconCompatParcelizer);
        this.read = remoteActionCompatParcelizer;
        this.RemoteActionCompatParcelizer = remoteActionCompatParcelizer;
        this.AudioAttributesImplApi26Parcelizer = remoteActionCompatParcelizer;
    }

    public final void write() {
        IconCompatParcelizer(this.read);
        this.read.write(0L, this.AudioAttributesCompatParcelizer);
        RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.read;
        this.RemoteActionCompatParcelizer = remoteActionCompatParcelizer;
        this.AudioAttributesImplApi26Parcelizer = remoteActionCompatParcelizer;
        this.AudioAttributesImplBaseParcelizer = 0L;
        this.IconCompatParcelizer.read();
    }

    public final void read(long j) {
        buildTypeSerializer.IconCompatParcelizer(j <= this.AudioAttributesImplBaseParcelizer);
        this.AudioAttributesImplBaseParcelizer = j;
        if (j == 0 || j == this.read.IconCompatParcelizer) {
            IconCompatParcelizer(this.read);
            RemoteActionCompatParcelizer remoteActionCompatParcelizer = new RemoteActionCompatParcelizer(this.AudioAttributesImplBaseParcelizer, this.AudioAttributesCompatParcelizer);
            this.read = remoteActionCompatParcelizer;
            this.RemoteActionCompatParcelizer = remoteActionCompatParcelizer;
            this.AudioAttributesImplApi26Parcelizer = remoteActionCompatParcelizer;
            return;
        }
        RemoteActionCompatParcelizer remoteActionCompatParcelizer2 = this.read;
        while (this.AudioAttributesImplBaseParcelizer > remoteActionCompatParcelizer2.read) {
            remoteActionCompatParcelizer2 = remoteActionCompatParcelizer2.AudioAttributesCompatParcelizer;
        }
        RemoteActionCompatParcelizer remoteActionCompatParcelizer3 = (RemoteActionCompatParcelizer) buildTypeSerializer.IconCompatParcelizer(remoteActionCompatParcelizer2.AudioAttributesCompatParcelizer);
        IconCompatParcelizer(remoteActionCompatParcelizer3);
        remoteActionCompatParcelizer2.AudioAttributesCompatParcelizer = new RemoteActionCompatParcelizer(remoteActionCompatParcelizer2.read, this.AudioAttributesCompatParcelizer);
        this.AudioAttributesImplApi26Parcelizer = this.AudioAttributesImplBaseParcelizer == remoteActionCompatParcelizer2.read ? remoteActionCompatParcelizer2.AudioAttributesCompatParcelizer : remoteActionCompatParcelizer2;
        if (this.RemoteActionCompatParcelizer == remoteActionCompatParcelizer3) {
            this.RemoteActionCompatParcelizer = remoteActionCompatParcelizer2.AudioAttributesCompatParcelizer;
        }
    }

    public final void IconCompatParcelizer() {
        this.RemoteActionCompatParcelizer = this.read;
    }

    public final void RemoteActionCompatParcelizer(_find _findVar, visitIntFormat.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
        this.RemoteActionCompatParcelizer = read(this.RemoteActionCompatParcelizer, _findVar, audioAttributesCompatParcelizer, this.write);
    }

    public final void read(_find _findVar, visitIntFormat.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
        read(this.RemoteActionCompatParcelizer, _findVar, audioAttributesCompatParcelizer, this.write);
    }

    public final void AudioAttributesCompatParcelizer(long j) {
        if (j != -1) {
            while (j >= this.read.read) {
                this.IconCompatParcelizer.write(this.read.RemoteActionCompatParcelizer);
                this.read = this.read.AudioAttributesCompatParcelizer();
            }
            if (this.RemoteActionCompatParcelizer.IconCompatParcelizer < this.read.IconCompatParcelizer) {
                this.RemoteActionCompatParcelizer = this.read;
            }
        }
    }

    public final long RemoteActionCompatParcelizer() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    public final int write(JsonNullFormatVisitor jsonNullFormatVisitor, int i, boolean z) throws IOException {
        int iAudioAttributesCompatParcelizer = jsonNullFormatVisitor.AudioAttributesCompatParcelizer(this.AudioAttributesImplApi26Parcelizer.RemoteActionCompatParcelizer.read, this.AudioAttributesImplApi26Parcelizer.read(this.AudioAttributesImplBaseParcelizer), RemoteActionCompatParcelizer(i));
        if (iAudioAttributesCompatParcelizer != -1) {
            read(iAudioAttributesCompatParcelizer);
            return iAudioAttributesCompatParcelizer;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }

    public final void read(AsPropertyTypeDeserializer asPropertyTypeDeserializer, int i) {
        while (i > 0) {
            int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(i);
            asPropertyTypeDeserializer.write(this.AudioAttributesImplApi26Parcelizer.RemoteActionCompatParcelizer.read, this.AudioAttributesImplApi26Parcelizer.read(this.AudioAttributesImplBaseParcelizer), iRemoteActionCompatParcelizer);
            i -= iRemoteActionCompatParcelizer;
            read(iRemoteActionCompatParcelizer);
        }
    }

    private void IconCompatParcelizer(RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        if (remoteActionCompatParcelizer.RemoteActionCompatParcelizer == null) {
            return;
        }
        this.IconCompatParcelizer.write(remoteActionCompatParcelizer);
        remoteActionCompatParcelizer.AudioAttributesCompatParcelizer();
    }

    private int RemoteActionCompatParcelizer(int i) {
        if (this.AudioAttributesImplApi26Parcelizer.RemoteActionCompatParcelizer == null) {
            this.AudioAttributesImplApi26Parcelizer.write(this.IconCompatParcelizer.write(), new RemoteActionCompatParcelizer(this.AudioAttributesImplApi26Parcelizer.read, this.AudioAttributesCompatParcelizer));
        }
        return Math.min(i, (int) (this.AudioAttributesImplApi26Parcelizer.read - this.AudioAttributesImplBaseParcelizer));
    }

    private void read(int i) {
        long j = this.AudioAttributesImplBaseParcelizer + ((long) i);
        this.AudioAttributesImplBaseParcelizer = j;
        if (j == this.AudioAttributesImplApi26Parcelizer.read) {
            this.AudioAttributesImplApi26Parcelizer = this.AudioAttributesImplApi26Parcelizer.AudioAttributesCompatParcelizer;
        }
    }

    private static RemoteActionCompatParcelizer read(RemoteActionCompatParcelizer remoteActionCompatParcelizer, _find _findVar, visitIntFormat.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer, AsPropertyTypeDeserializer asPropertyTypeDeserializer) {
        if (_findVar.MediaBrowserCompatCustomActionResultReceiver()) {
            remoteActionCompatParcelizer = RemoteActionCompatParcelizer(remoteActionCompatParcelizer, _findVar, audioAttributesCompatParcelizer, asPropertyTypeDeserializer);
        }
        if (_findVar.H_()) {
            asPropertyTypeDeserializer.write(4);
            RemoteActionCompatParcelizer remoteActionCompatParcelizerIconCompatParcelizer = IconCompatParcelizer(remoteActionCompatParcelizer, audioAttributesCompatParcelizer.read, asPropertyTypeDeserializer.RemoteActionCompatParcelizer(), 4);
            int iOnPrepareFromSearch = asPropertyTypeDeserializer.onPrepareFromSearch();
            audioAttributesCompatParcelizer.read += 4;
            audioAttributesCompatParcelizer.IconCompatParcelizer -= 4;
            _findVar.read(iOnPrepareFromSearch);
            RemoteActionCompatParcelizer remoteActionCompatParcelizerIconCompatParcelizer2 = IconCompatParcelizer(remoteActionCompatParcelizerIconCompatParcelizer, audioAttributesCompatParcelizer.read, _findVar.read, iOnPrepareFromSearch);
            audioAttributesCompatParcelizer.read += (long) iOnPrepareFromSearch;
            audioAttributesCompatParcelizer.IconCompatParcelizer -= iOnPrepareFromSearch;
            _findVar.AudioAttributesCompatParcelizer(audioAttributesCompatParcelizer.IconCompatParcelizer);
            return IconCompatParcelizer(remoteActionCompatParcelizerIconCompatParcelizer2, audioAttributesCompatParcelizer.read, _findVar.write, audioAttributesCompatParcelizer.IconCompatParcelizer);
        }
        _findVar.read(audioAttributesCompatParcelizer.IconCompatParcelizer);
        return IconCompatParcelizer(remoteActionCompatParcelizer, audioAttributesCompatParcelizer.read, _findVar.read, audioAttributesCompatParcelizer.IconCompatParcelizer);
    }

    private static RemoteActionCompatParcelizer RemoteActionCompatParcelizer(RemoteActionCompatParcelizer remoteActionCompatParcelizer, _find _findVar, visitIntFormat.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer, AsPropertyTypeDeserializer asPropertyTypeDeserializer) {
        long j = audioAttributesCompatParcelizer.read;
        int iOnPrepare = 1;
        asPropertyTypeDeserializer.write(1);
        RemoteActionCompatParcelizer remoteActionCompatParcelizerIconCompatParcelizer = IconCompatParcelizer(remoteActionCompatParcelizer, j, asPropertyTypeDeserializer.RemoteActionCompatParcelizer(), 1);
        long j2 = j + 1;
        byte b = asPropertyTypeDeserializer.RemoteActionCompatParcelizer()[0];
        boolean z = (b & 128) != 0;
        int i = b & 127;
        TypeSerializerBase typeSerializerBase = _findVar.IconCompatParcelizer;
        if (typeSerializerBase.AudioAttributesCompatParcelizer == null) {
            typeSerializerBase.AudioAttributesCompatParcelizer = new byte[16];
        } else {
            Arrays.fill(typeSerializerBase.AudioAttributesCompatParcelizer, (byte) 0);
        }
        RemoteActionCompatParcelizer remoteActionCompatParcelizerIconCompatParcelizer2 = IconCompatParcelizer(remoteActionCompatParcelizerIconCompatParcelizer, j2, typeSerializerBase.AudioAttributesCompatParcelizer, i);
        long j3 = j2 + ((long) i);
        if (z) {
            asPropertyTypeDeserializer.write(2);
            remoteActionCompatParcelizerIconCompatParcelizer2 = IconCompatParcelizer(remoteActionCompatParcelizerIconCompatParcelizer2, j3, asPropertyTypeDeserializer.RemoteActionCompatParcelizer(), 2);
            j3 += 2;
            iOnPrepare = asPropertyTypeDeserializer.onPrepare();
        }
        int i2 = iOnPrepare;
        int[] iArr = typeSerializerBase.MediaBrowserCompatCustomActionResultReceiver;
        if (iArr == null || iArr.length < i2) {
            iArr = new int[i2];
        }
        int[] iArr2 = iArr;
        int[] iArr3 = typeSerializerBase.AudioAttributesImplBaseParcelizer;
        if (iArr3 == null || iArr3.length < i2) {
            iArr3 = new int[i2];
        }
        int[] iArr4 = iArr3;
        if (z) {
            int i3 = i2 * 6;
            asPropertyTypeDeserializer.write(i3);
            remoteActionCompatParcelizerIconCompatParcelizer2 = IconCompatParcelizer(remoteActionCompatParcelizerIconCompatParcelizer2, j3, asPropertyTypeDeserializer.RemoteActionCompatParcelizer(), i3);
            j3 += (long) i3;
            asPropertyTypeDeserializer.MediaBrowserCompatCustomActionResultReceiver(0);
            for (int i4 = 0; i4 < i2; i4++) {
                iArr2[i4] = asPropertyTypeDeserializer.onPrepare();
                iArr4[i4] = asPropertyTypeDeserializer.onPrepareFromSearch();
            }
        } else {
            iArr2[0] = 0;
            iArr4[0] = audioAttributesCompatParcelizer.IconCompatParcelizer - ((int) (j3 - audioAttributesCompatParcelizer.read));
        }
        nonNullString.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer2 = (nonNullString.AudioAttributesCompatParcelizer) LaissezFaireSubTypeValidator.IconCompatParcelizer(audioAttributesCompatParcelizer.write);
        typeSerializerBase.write(i2, iArr2, iArr4, audioAttributesCompatParcelizer2.read, typeSerializerBase.AudioAttributesCompatParcelizer, audioAttributesCompatParcelizer2.RemoteActionCompatParcelizer, audioAttributesCompatParcelizer2.IconCompatParcelizer, audioAttributesCompatParcelizer2.AudioAttributesCompatParcelizer);
        int i5 = (int) (j3 - audioAttributesCompatParcelizer.read);
        audioAttributesCompatParcelizer.read += (long) i5;
        audioAttributesCompatParcelizer.IconCompatParcelizer -= i5;
        return remoteActionCompatParcelizerIconCompatParcelizer2;
    }

    private static RemoteActionCompatParcelizer IconCompatParcelizer(RemoteActionCompatParcelizer remoteActionCompatParcelizer, long j, ByteBuffer byteBuffer, int i) {
        RemoteActionCompatParcelizer remoteActionCompatParcelizerIconCompatParcelizer = IconCompatParcelizer(remoteActionCompatParcelizer, j);
        while (i > 0) {
            int iMin = Math.min(i, (int) (remoteActionCompatParcelizerIconCompatParcelizer.read - j));
            byteBuffer.put(remoteActionCompatParcelizerIconCompatParcelizer.RemoteActionCompatParcelizer.read, remoteActionCompatParcelizerIconCompatParcelizer.read(j), iMin);
            i -= iMin;
            j += (long) iMin;
            if (j == remoteActionCompatParcelizerIconCompatParcelizer.read) {
                remoteActionCompatParcelizerIconCompatParcelizer = remoteActionCompatParcelizerIconCompatParcelizer.AudioAttributesCompatParcelizer;
            }
        }
        return remoteActionCompatParcelizerIconCompatParcelizer;
    }

    private static RemoteActionCompatParcelizer IconCompatParcelizer(RemoteActionCompatParcelizer remoteActionCompatParcelizer, long j, byte[] bArr, int i) {
        RemoteActionCompatParcelizer remoteActionCompatParcelizerIconCompatParcelizer = IconCompatParcelizer(remoteActionCompatParcelizer, j);
        int i2 = i;
        while (i2 > 0) {
            int iMin = Math.min(i2, (int) (remoteActionCompatParcelizerIconCompatParcelizer.read - j));
            System.arraycopy(remoteActionCompatParcelizerIconCompatParcelizer.RemoteActionCompatParcelizer.read, remoteActionCompatParcelizerIconCompatParcelizer.read(j), bArr, i - i2, iMin);
            i2 -= iMin;
            j += (long) iMin;
            if (j == remoteActionCompatParcelizerIconCompatParcelizer.read) {
                remoteActionCompatParcelizerIconCompatParcelizer = remoteActionCompatParcelizerIconCompatParcelizer.AudioAttributesCompatParcelizer;
            }
        }
        return remoteActionCompatParcelizerIconCompatParcelizer;
    }

    private static RemoteActionCompatParcelizer IconCompatParcelizer(RemoteActionCompatParcelizer remoteActionCompatParcelizer, long j) {
        while (j >= remoteActionCompatParcelizer.read) {
            remoteActionCompatParcelizer = remoteActionCompatParcelizer.AudioAttributesCompatParcelizer;
        }
        return remoteActionCompatParcelizer;
    }

    static final class RemoteActionCompatParcelizer implements _findWellKnownSimple.read {
        public RemoteActionCompatParcelizer AudioAttributesCompatParcelizer;
        public long IconCompatParcelizer;
        public _fromArrayType RemoteActionCompatParcelizer;
        public long read;

        public RemoteActionCompatParcelizer(long j, int i) {
            write(j, i);
        }

        public final void write(long j, int i) {
            buildTypeSerializer.write(this.RemoteActionCompatParcelizer == null);
            this.IconCompatParcelizer = j;
            this.read = j + ((long) i);
        }

        public final void write(_fromArrayType _fromarraytype, RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
            this.RemoteActionCompatParcelizer = _fromarraytype;
            this.AudioAttributesCompatParcelizer = remoteActionCompatParcelizer;
        }

        public final int read(long j) {
            return ((int) (j - this.IconCompatParcelizer)) + this.RemoteActionCompatParcelizer.IconCompatParcelizer;
        }

        public final RemoteActionCompatParcelizer AudioAttributesCompatParcelizer() {
            this.RemoteActionCompatParcelizer = null;
            RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.AudioAttributesCompatParcelizer;
            this.AudioAttributesCompatParcelizer = null;
            return remoteActionCompatParcelizer;
        }

        @Override // o._findWellKnownSimple.read
        public final _fromArrayType read() {
            return (_fromArrayType) buildTypeSerializer.IconCompatParcelizer(this.RemoteActionCompatParcelizer);
        }

        @Override // o._findWellKnownSimple.read
        public final _findWellKnownSimple.read write() {
            RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.AudioAttributesCompatParcelizer;
            if (remoteActionCompatParcelizer == null || remoteActionCompatParcelizer.RemoteActionCompatParcelizer == null) {
                return null;
            }
            return remoteActionCompatParcelizer;
        }
    }
}
