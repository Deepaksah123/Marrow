package kotlin;

import java.io.EOFException;
import java.io.IOException;
import kotlin.nonNullString;

/* JADX INFO: loaded from: classes2.dex */
public final class exceptionMessage implements nonNullString {
    private final byte[] IconCompatParcelizer = new byte[4096];

    @Override // kotlin.nonNullString
    public final void IconCompatParcelizer(long j, int i, int i2, int i3, nonNullString.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
    }

    @Override // kotlin.nonNullString
    public final void write(C0170format c0170format) {
    }

    @Override // kotlin.nonNullString
    public final int AudioAttributesCompatParcelizer(JsonNullFormatVisitor jsonNullFormatVisitor, int i, boolean z, int i2) throws IOException {
        int iAudioAttributesCompatParcelizer = jsonNullFormatVisitor.AudioAttributesCompatParcelizer(this.IconCompatParcelizer, 0, Math.min(this.IconCompatParcelizer.length, i));
        if (iAudioAttributesCompatParcelizer != -1) {
            return iAudioAttributesCompatParcelizer;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // kotlin.nonNullString
    public final void IconCompatParcelizer(AsPropertyTypeDeserializer asPropertyTypeDeserializer, int i, int i2) {
        asPropertyTypeDeserializer.AudioAttributesImplBaseParcelizer(i);
    }
}
