package kotlin;

import com.google.android.exoplayer2.C;
import java.io.EOFException;
import java.io.IOException;
import kotlin.nonNullString;
import kotlin.withTimeZone;

/* JADX INFO: loaded from: classes2.dex */
final class _copyBufferValue implements nonNullString {
    private final withTimeZone.IconCompatParcelizer AudioAttributesImplApi26Parcelizer;
    private C0170format RemoteActionCompatParcelizer;
    private final nonNullString read;
    private withTimeZone write;
    private final _parse4D IconCompatParcelizer = new _parse4D();
    private int MediaBrowserCompatItemReceiver = 0;
    private int MediaBrowserCompatCustomActionResultReceiver = 0;
    private byte[] AudioAttributesImplApi21Parcelizer = LaissezFaireSubTypeValidator.RemoteActionCompatParcelizer;
    private final AsPropertyTypeDeserializer AudioAttributesCompatParcelizer = new AsPropertyTypeDeserializer();

    public _copyBufferValue(nonNullString nonnullstring, withTimeZone.IconCompatParcelizer iconCompatParcelizer) {
        this.read = nonnullstring;
        this.AudioAttributesImplApi26Parcelizer = iconCompatParcelizer;
    }

    public final void write() {
        withTimeZone withtimezone = this.write;
        if (withtimezone != null) {
            withtimezone.RemoteActionCompatParcelizer();
        }
    }

    @Override // kotlin.nonNullString
    public final void write(C0170format c0170format) {
        String str = c0170format.onPlayFromUri;
        buildTypeSerializer.IconCompatParcelizer(DefaultBaseTypeLimitingValidator.IconCompatParcelizer(c0170format.onPlayFromUri) == 3);
        if (!c0170format.equals(this.RemoteActionCompatParcelizer)) {
            this.RemoteActionCompatParcelizer = c0170format;
            this.write = this.AudioAttributesImplApi26Parcelizer.write(c0170format) ? this.AudioAttributesImplApi26Parcelizer.IconCompatParcelizer(c0170format) : null;
        }
        if (this.write == null) {
            this.read.write(c0170format);
        } else {
            this.read.write(c0170format.write().AudioAttributesImplApi26Parcelizer("application/x-media3-cues").RemoteActionCompatParcelizer(c0170format.onPlayFromUri).write(Long.MAX_VALUE).IconCompatParcelizer(this.AudioAttributesImplApi26Parcelizer.RemoteActionCompatParcelizer(c0170format)).IconCompatParcelizer());
        }
    }

    @Override // kotlin.nonNullString
    public final int AudioAttributesCompatParcelizer(JsonNullFormatVisitor jsonNullFormatVisitor, int i, boolean z, int i2) throws IOException {
        if (this.write == null) {
            return this.read.AudioAttributesCompatParcelizer(jsonNullFormatVisitor, i, z, i2);
        }
        IconCompatParcelizer(i);
        int iAudioAttributesCompatParcelizer = jsonNullFormatVisitor.AudioAttributesCompatParcelizer(this.AudioAttributesImplApi21Parcelizer, this.MediaBrowserCompatCustomActionResultReceiver, i);
        if (iAudioAttributesCompatParcelizer != -1) {
            this.MediaBrowserCompatCustomActionResultReceiver += iAudioAttributesCompatParcelizer;
            return iAudioAttributesCompatParcelizer;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // kotlin.nonNullString
    public final void IconCompatParcelizer(AsPropertyTypeDeserializer asPropertyTypeDeserializer, int i, int i2) {
        if (this.write == null) {
            this.read.IconCompatParcelizer(asPropertyTypeDeserializer, i, i2);
            return;
        }
        IconCompatParcelizer(i);
        asPropertyTypeDeserializer.write(this.AudioAttributesImplApi21Parcelizer, this.MediaBrowserCompatCustomActionResultReceiver, i);
        this.MediaBrowserCompatCustomActionResultReceiver += i;
    }

    @Override // kotlin.nonNullString
    public final void IconCompatParcelizer(final long j, final int i, int i2, int i3, nonNullString.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
        if (this.write == null) {
            this.read.IconCompatParcelizer(j, i, i2, i3, audioAttributesCompatParcelizer);
            return;
        }
        buildTypeSerializer.write(audioAttributesCompatParcelizer == null, "DRM on subtitles is not supported");
        int i4 = (this.MediaBrowserCompatCustomActionResultReceiver - i3) - i2;
        this.write.RemoteActionCompatParcelizer(this.AudioAttributesImplApi21Parcelizer, i4, i2, withTimeZone.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(), new TypeSerializer() { // from class: o.TokenBuffer
            @Override // kotlin.TypeSerializer
            public final void read(Object obj) {
                this.read.read(j, i, (pad3) obj);
            }
        });
        int i5 = i4 + i2;
        this.MediaBrowserCompatItemReceiver = i5;
        if (i5 == this.MediaBrowserCompatCustomActionResultReceiver) {
            this.MediaBrowserCompatItemReceiver = 0;
            this.MediaBrowserCompatCustomActionResultReceiver = 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public void read(pad3 pad3Var, long j, int i) {
        buildTypeSerializer.AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer);
        byte[] bArrWrite = _parse4D.write(pad3Var.read, pad3Var.AudioAttributesCompatParcelizer);
        this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(bArrWrite);
        this.read.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, bArrWrite.length);
        if (pad3Var.IconCompatParcelizer == C.TIME_UNSET) {
            buildTypeSerializer.write(this.RemoteActionCompatParcelizer.onSeekTo == Long.MAX_VALUE);
        } else if (this.RemoteActionCompatParcelizer.onSeekTo == Long.MAX_VALUE) {
            j += pad3Var.IconCompatParcelizer;
        } else {
            j = pad3Var.IconCompatParcelizer + this.RemoteActionCompatParcelizer.onSeekTo;
        }
        this.read.IconCompatParcelizer(j, i, bArrWrite.length, 0, null);
    }

    private void IconCompatParcelizer(int i) {
        int length = this.AudioAttributesImplApi21Parcelizer.length;
        int i2 = this.MediaBrowserCompatCustomActionResultReceiver;
        if (length - i2 >= i) {
            return;
        }
        int i3 = i2 - this.MediaBrowserCompatItemReceiver;
        int iMax = Math.max(i3 << 1, i + i3);
        byte[] bArr = this.AudioAttributesImplApi21Parcelizer;
        byte[] bArr2 = iMax <= bArr.length ? bArr : new byte[iMax];
        System.arraycopy(bArr, this.MediaBrowserCompatItemReceiver, bArr2, 0, i3);
        this.MediaBrowserCompatItemReceiver = 0;
        this.MediaBrowserCompatCustomActionResultReceiver = i3;
        this.AudioAttributesImplApi21Parcelizer = bArr2;
    }
}
