package kotlin;

import java.io.IOException;
import kotlin.nonNullString;

/* JADX INFO: loaded from: classes2.dex */
public final class nameOf {
    private int AudioAttributesCompatParcelizer;
    private boolean AudioAttributesImplApi21Parcelizer;
    private final byte[] AudioAttributesImplBaseParcelizer = new byte[10];
    private int IconCompatParcelizer;
    private int RemoteActionCompatParcelizer;
    private long read;
    private int write;

    public final void IconCompatParcelizer() {
        this.AudioAttributesImplApi21Parcelizer = false;
        this.RemoteActionCompatParcelizer = 0;
    }

    public final void read(closeOnFailAndThrowAsIOE closeonfailandthrowasioe) throws IOException {
        if (this.AudioAttributesImplApi21Parcelizer) {
            return;
        }
        closeonfailandthrowasioe.RemoteActionCompatParcelizer(this.AudioAttributesImplBaseParcelizer, 0, 10);
        closeonfailandthrowasioe.RemoteActionCompatParcelizer();
        if (isJava8TimeClass.AudioAttributesCompatParcelizer(this.AudioAttributesImplBaseParcelizer) == 0) {
            return;
        }
        this.AudioAttributesImplApi21Parcelizer = true;
    }

    public final void write(nonNullString nonnullstring, long j, int i, int i2, int i3, nonNullString.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
        buildTypeSerializer.read(this.AudioAttributesCompatParcelizer <= i2 + i3, "TrueHD chunk samples must be contiguous in the sample queue.");
        if (this.AudioAttributesImplApi21Parcelizer) {
            int i4 = this.RemoteActionCompatParcelizer;
            int i5 = i4 + 1;
            this.RemoteActionCompatParcelizer = i5;
            if (i4 == 0) {
                this.read = j;
                this.write = i;
                this.IconCompatParcelizer = 0;
            }
            this.IconCompatParcelizer += i2;
            this.AudioAttributesCompatParcelizer = i3;
            if (i5 >= 16) {
                AudioAttributesCompatParcelizer(nonnullstring, audioAttributesCompatParcelizer);
            }
        }
    }

    public final void AudioAttributesCompatParcelizer(nonNullString nonnullstring, nonNullString.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
        if (this.RemoteActionCompatParcelizer > 0) {
            nonnullstring.IconCompatParcelizer(this.read, this.write, this.IconCompatParcelizer, this.AudioAttributesCompatParcelizer, audioAttributesCompatParcelizer);
            this.RemoteActionCompatParcelizer = 0;
        }
    }
}
