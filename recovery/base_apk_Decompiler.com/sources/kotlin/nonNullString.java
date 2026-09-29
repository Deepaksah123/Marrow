package kotlin;

import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public interface nonNullString {
    int AudioAttributesCompatParcelizer(JsonNullFormatVisitor jsonNullFormatVisitor, int i, boolean z, int i2) throws IOException;

    void IconCompatParcelizer(long j, int i, int i2, int i3, AudioAttributesCompatParcelizer audioAttributesCompatParcelizer);

    void IconCompatParcelizer(AsPropertyTypeDeserializer asPropertyTypeDeserializer, int i, int i2);

    void write(C0170format c0170format);

    public static final class AudioAttributesCompatParcelizer {
        public final int AudioAttributesCompatParcelizer;
        public final int IconCompatParcelizer;
        public final int RemoteActionCompatParcelizer;
        public final byte[] read;

        public AudioAttributesCompatParcelizer(int i, byte[] bArr, int i2, int i3) {
            this.RemoteActionCompatParcelizer = i;
            this.read = bArr;
            this.IconCompatParcelizer = i2;
            this.AudioAttributesCompatParcelizer = i3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = (AudioAttributesCompatParcelizer) obj;
            return this.RemoteActionCompatParcelizer == audioAttributesCompatParcelizer.RemoteActionCompatParcelizer && this.IconCompatParcelizer == audioAttributesCompatParcelizer.IconCompatParcelizer && this.AudioAttributesCompatParcelizer == audioAttributesCompatParcelizer.AudioAttributesCompatParcelizer && Arrays.equals(this.read, audioAttributesCompatParcelizer.read);
        }

        public final int hashCode() {
            int i = this.RemoteActionCompatParcelizer;
            return (((((i * 31) + Arrays.hashCode(this.read)) * 31) + this.IconCompatParcelizer) * 31) + this.AudioAttributesCompatParcelizer;
        }
    }

    default int AudioAttributesCompatParcelizer(JsonNullFormatVisitor jsonNullFormatVisitor, int i, boolean z) throws IOException {
        return AudioAttributesCompatParcelizer(jsonNullFormatVisitor, i, z, 0);
    }

    default void RemoteActionCompatParcelizer(AsPropertyTypeDeserializer asPropertyTypeDeserializer, int i) {
        IconCompatParcelizer(asPropertyTypeDeserializer, i, 0);
    }
}
