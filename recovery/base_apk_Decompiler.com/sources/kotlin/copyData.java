package kotlin;

import com.google.android.exoplayer2.extractor.ogg.OggPageHeader;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
final class copyData {
    private boolean AudioAttributesCompatParcelizer;
    private int write;
    private final RootNameLookup RemoteActionCompatParcelizer = new RootNameLookup();
    private final AsPropertyTypeDeserializer IconCompatParcelizer = new AsPropertyTypeDeserializer(new byte[OggPageHeader.MAX_PAGE_PAYLOAD], 0);
    private int read = -1;

    copyData() {
    }

    public final void AudioAttributesCompatParcelizer() {
        this.RemoteActionCompatParcelizer.IconCompatParcelizer();
        this.IconCompatParcelizer.write(0);
        this.read = -1;
        this.AudioAttributesCompatParcelizer = false;
    }

    public final boolean IconCompatParcelizer(closeOnFailAndThrowAsIOE closeonfailandthrowasioe) throws IOException {
        int i;
        buildTypeSerializer.write(closeonfailandthrowasioe != null);
        if (this.AudioAttributesCompatParcelizer) {
            this.AudioAttributesCompatParcelizer = false;
            this.IconCompatParcelizer.write(0);
        }
        while (!this.AudioAttributesCompatParcelizer) {
            if (this.read < 0) {
                if (!this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(closeonfailandthrowasioe) || !this.RemoteActionCompatParcelizer.read(closeonfailandthrowasioe, true)) {
                    return false;
                }
                int iRemoteActionCompatParcelizer = this.RemoteActionCompatParcelizer.write;
                if ((this.RemoteActionCompatParcelizer.AudioAttributesImplApi26Parcelizer & 1) == 1 && this.IconCompatParcelizer.read() == 0) {
                    iRemoteActionCompatParcelizer += RemoteActionCompatParcelizer(0);
                    i = this.write;
                } else {
                    i = 0;
                }
                if (!findSuperClasses.AudioAttributesCompatParcelizer(closeonfailandthrowasioe, iRemoteActionCompatParcelizer)) {
                    return false;
                }
                this.read = i;
            }
            int iRemoteActionCompatParcelizer2 = RemoteActionCompatParcelizer(this.read);
            int i2 = this.read + this.write;
            if (iRemoteActionCompatParcelizer2 > 0) {
                AsPropertyTypeDeserializer asPropertyTypeDeserializer = this.IconCompatParcelizer;
                asPropertyTypeDeserializer.IconCompatParcelizer(asPropertyTypeDeserializer.read() + iRemoteActionCompatParcelizer2);
                if (!findSuperClasses.AudioAttributesCompatParcelizer(closeonfailandthrowasioe, this.IconCompatParcelizer.RemoteActionCompatParcelizer(), this.IconCompatParcelizer.read(), iRemoteActionCompatParcelizer2)) {
                    return false;
                }
                AsPropertyTypeDeserializer asPropertyTypeDeserializer2 = this.IconCompatParcelizer;
                asPropertyTypeDeserializer2.AudioAttributesCompatParcelizer(asPropertyTypeDeserializer2.read() + iRemoteActionCompatParcelizer2);
                this.AudioAttributesCompatParcelizer = this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer[i2 + (-1)] != 255;
            }
            if (i2 == this.RemoteActionCompatParcelizer.read) {
                i2 = -1;
            }
            this.read = i2;
        }
        return true;
    }

    public final RootNameLookup read() {
        return this.RemoteActionCompatParcelizer;
    }

    public final AsPropertyTypeDeserializer RemoteActionCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public final void write() {
        if (this.IconCompatParcelizer.RemoteActionCompatParcelizer().length == 65025) {
            return;
        }
        AsPropertyTypeDeserializer asPropertyTypeDeserializer = this.IconCompatParcelizer;
        asPropertyTypeDeserializer.IconCompatParcelizer(Arrays.copyOf(asPropertyTypeDeserializer.RemoteActionCompatParcelizer(), Math.max(OggPageHeader.MAX_PAGE_PAYLOAD, this.IconCompatParcelizer.read())), this.IconCompatParcelizer.read());
    }

    private int RemoteActionCompatParcelizer(int i) {
        int i2 = 0;
        this.write = 0;
        while (this.write + i < this.RemoteActionCompatParcelizer.read) {
            int[] iArr = this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer;
            int i3 = this.write;
            this.write = i3 + 1;
            int i4 = iArr[i3 + i];
            i2 += i4;
            if (i4 != 255) {
                break;
            }
        }
        return i2;
    }
}
