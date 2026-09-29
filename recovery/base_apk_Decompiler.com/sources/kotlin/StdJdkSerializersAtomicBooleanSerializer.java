package kotlin;

import android.net.Uri;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class StdJdkSerializersAtomicBooleanSerializer implements _hasTypeResolver {
    private final byte[] AudioAttributesCompatParcelizer;
    private final int IconCompatParcelizer;
    private final read RemoteActionCompatParcelizer;
    private final _hasTypeResolver read;
    private int write;

    public interface read {
        void AudioAttributesCompatParcelizer(AsPropertyTypeDeserializer asPropertyTypeDeserializer);
    }

    public StdJdkSerializersAtomicBooleanSerializer(_hasTypeResolver _hastyperesolver, int i, read readVar) {
        buildTypeSerializer.IconCompatParcelizer(i > 0);
        this.read = _hastyperesolver;
        this.IconCompatParcelizer = i;
        this.RemoteActionCompatParcelizer = readVar;
        this.AudioAttributesCompatParcelizer = new byte[1];
        this.write = i;
    }

    @Override // kotlin._hasTypeResolver
    public final void read(TypeNameIdResolver typeNameIdResolver) {
        this.read.read(typeNameIdResolver);
    }

    @Override // kotlin._hasTypeResolver
    public final long RemoteActionCompatParcelizer(SubTypeValidator subTypeValidator) {
        throw new UnsupportedOperationException();
    }

    @Override // kotlin.JsonNullFormatVisitor
    public final int AudioAttributesCompatParcelizer(byte[] bArr, int i, int i2) throws IOException {
        if (this.write == 0) {
            if (!RemoteActionCompatParcelizer()) {
                return -1;
            }
            this.write = this.IconCompatParcelizer;
        }
        int iAudioAttributesCompatParcelizer = this.read.AudioAttributesCompatParcelizer(bArr, i, Math.min(this.write, i2));
        if (iAudioAttributesCompatParcelizer != -1) {
            this.write -= iAudioAttributesCompatParcelizer;
        }
        return iAudioAttributesCompatParcelizer;
    }

    @Override // kotlin._hasTypeResolver
    public final Uri IconCompatParcelizer() {
        return this.read.IconCompatParcelizer();
    }

    @Override // kotlin._hasTypeResolver
    public final Map<String, List<String>> read() {
        return this.read.read();
    }

    @Override // kotlin._hasTypeResolver
    public final void AudioAttributesCompatParcelizer() {
        throw new UnsupportedOperationException();
    }

    private boolean RemoteActionCompatParcelizer() throws IOException {
        if (this.read.AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer, 0, 1) == -1) {
            return false;
        }
        int i = (this.AudioAttributesCompatParcelizer[0] & 255) << 4;
        if (i == 0) {
            return true;
        }
        byte[] bArr = new byte[i];
        int i2 = i;
        int i3 = 0;
        while (i2 > 0) {
            int iAudioAttributesCompatParcelizer = this.read.AudioAttributesCompatParcelizer(bArr, i3, i2);
            if (iAudioAttributesCompatParcelizer == -1) {
                return false;
            }
            i3 += iAudioAttributesCompatParcelizer;
            i2 -= iAudioAttributesCompatParcelizer;
        }
        while (i > 0 && bArr[i - 1] == 0) {
            i--;
        }
        if (i > 0) {
            this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(new AsPropertyTypeDeserializer(bArr, i));
        }
        return true;
    }
}
