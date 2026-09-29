package kotlin;

import com.google.android.exoplayer2.C;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
final class BeanAsArraySerializer implements visitStringFormat {
    private serializeTypedContents AudioAttributesCompatParcelizer;
    private final C0170format AudioAttributesImplBaseParcelizer;
    private int IconCompatParcelizer;
    private boolean MediaBrowserCompatCustomActionResultReceiver;
    private long[] RemoteActionCompatParcelizer;
    private boolean write;
    private final _findEnumCaseInsensitive read = new _findEnumCaseInsensitive();
    private long MediaBrowserCompatItemReceiver = C.TIME_UNSET;

    @Override // kotlin.visitStringFormat
    public final boolean F_() {
        return true;
    }

    @Override // kotlin.visitStringFormat
    public final void G_() throws IOException {
    }

    public BeanAsArraySerializer(serializeTypedContents serializetypedcontents, C0170format c0170format, boolean z) {
        this.AudioAttributesImplBaseParcelizer = c0170format;
        this.AudioAttributesCompatParcelizer = serializetypedcontents;
        this.RemoteActionCompatParcelizer = serializetypedcontents.RemoteActionCompatParcelizer;
        AudioAttributesCompatParcelizer(serializetypedcontents, z);
    }

    public final String RemoteActionCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer();
    }

    public final void AudioAttributesCompatParcelizer(serializeTypedContents serializetypedcontents, boolean z) {
        int i = this.IconCompatParcelizer;
        long j = i == 0 ? -9223372036854775807L : this.RemoteActionCompatParcelizer[i - 1];
        this.write = z;
        this.AudioAttributesCompatParcelizer = serializetypedcontents;
        long[] jArr = serializetypedcontents.RemoteActionCompatParcelizer;
        this.RemoteActionCompatParcelizer = jArr;
        long j2 = this.MediaBrowserCompatItemReceiver;
        if (j2 != C.TIME_UNSET) {
            read(j2);
        } else if (j != C.TIME_UNSET) {
            this.IconCompatParcelizer = LaissezFaireSubTypeValidator.read(jArr, j, false);
        }
    }

    public final void read(long j) {
        int i = LaissezFaireSubTypeValidator.read(this.RemoteActionCompatParcelizer, j, true);
        this.IconCompatParcelizer = i;
        if (!this.write || i != this.RemoteActionCompatParcelizer.length) {
            j = C.TIME_UNSET;
        }
        this.MediaBrowserCompatItemReceiver = j;
    }

    @Override // kotlin.visitStringFormat
    public final int AudioAttributesCompatParcelizer(ObjectNode objectNode, _find _findVar, int i) {
        int i2 = this.IconCompatParcelizer;
        boolean z = i2 == this.RemoteActionCompatParcelizer.length;
        if (z && !this.write) {
            _findVar.c_(4);
            return -4;
        }
        if ((i & 2) != 0 || !this.MediaBrowserCompatCustomActionResultReceiver) {
            objectNode.write = this.AudioAttributesImplBaseParcelizer;
            this.MediaBrowserCompatCustomActionResultReceiver = true;
            return -5;
        }
        if (z) {
            return -3;
        }
        if ((i & 1) == 0) {
            this.IconCompatParcelizer = i2 + 1;
        }
        if ((i & 4) == 0) {
            byte[] bArrIconCompatParcelizer = this.read.IconCompatParcelizer(this.AudioAttributesCompatParcelizer.IconCompatParcelizer[i2]);
            _findVar.read(bArrIconCompatParcelizer.length);
            _findVar.read.put(bArrIconCompatParcelizer);
        }
        _findVar.RemoteActionCompatParcelizer = this.RemoteActionCompatParcelizer[i2];
        _findVar.c_(1);
        return -4;
    }

    @Override // kotlin.visitStringFormat
    public final int IconCompatParcelizer(long j) {
        int iMax = Math.max(this.IconCompatParcelizer, LaissezFaireSubTypeValidator.read(this.RemoteActionCompatParcelizer, j, true));
        int i = this.IconCompatParcelizer;
        this.IconCompatParcelizer = iMax;
        return iMax - i;
    }
}
