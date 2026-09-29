package kotlin;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
final class constructFromName {
    private int IconCompatParcelizer;
    private final AsPropertyTypeDeserializer read = new AsPropertyTypeDeserializer(8);

    public final boolean read(closeOnFailAndThrowAsIOE closeonfailandthrowasioe) throws IOException {
        long j = closeonfailandthrowasioe.read();
        long j2 = 1024;
        if (j != -1 && j <= 1024) {
            j2 = j;
        }
        int i = (int) j2;
        closeonfailandthrowasioe.RemoteActionCompatParcelizer(this.read.RemoteActionCompatParcelizer(), 0, 4);
        long jOnMediaButtonEvent = this.read.onMediaButtonEvent();
        this.IconCompatParcelizer = 4;
        while (jOnMediaButtonEvent != 440786851) {
            int i2 = this.IconCompatParcelizer + 1;
            this.IconCompatParcelizer = i2;
            if (i2 == i) {
                return false;
            }
            closeonfailandthrowasioe.RemoteActionCompatParcelizer(this.read.RemoteActionCompatParcelizer(), 0, 1);
            jOnMediaButtonEvent = ((jOnMediaButtonEvent << 8) & (-256)) | ((long) (this.read.RemoteActionCompatParcelizer()[0] & 255));
        }
        long jIconCompatParcelizer = IconCompatParcelizer(closeonfailandthrowasioe);
        long j3 = this.IconCompatParcelizer;
        if (jIconCompatParcelizer != Long.MIN_VALUE && (j == -1 || j3 + jIconCompatParcelizer < j)) {
            while (true) {
                long j4 = this.IconCompatParcelizer;
                long j5 = j3 + jIconCompatParcelizer;
                if (j4 < j5) {
                    if (IconCompatParcelizer(closeonfailandthrowasioe) == Long.MIN_VALUE) {
                        return false;
                    }
                    long jIconCompatParcelizer2 = IconCompatParcelizer(closeonfailandthrowasioe);
                    if (jIconCompatParcelizer2 < 0 || jIconCompatParcelizer2 > 2147483647L) {
                        break;
                    }
                    if (jIconCompatParcelizer2 != 0) {
                        int i3 = (int) jIconCompatParcelizer2;
                        closeonfailandthrowasioe.write(i3);
                        this.IconCompatParcelizer += i3;
                    }
                } else if (j4 == j5) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    private long IconCompatParcelizer(closeOnFailAndThrowAsIOE closeonfailandthrowasioe) throws IOException {
        int i = 0;
        closeonfailandthrowasioe.RemoteActionCompatParcelizer(this.read.RemoteActionCompatParcelizer(), 0, 1);
        int i2 = this.read.RemoteActionCompatParcelizer()[0] & 255;
        if (i2 == 0) {
            return Long.MIN_VALUE;
        }
        int i3 = 128;
        int i4 = 0;
        while ((i2 & i3) == 0) {
            i3 >>= 1;
            i4++;
        }
        int i5 = i2 & (~i3);
        closeonfailandthrowasioe.RemoteActionCompatParcelizer(this.read.RemoteActionCompatParcelizer(), 1, i4);
        while (i < i4) {
            i++;
            i5 = (i5 << 8) + (this.read.RemoteActionCompatParcelizer()[i] & 255);
        }
        this.IconCompatParcelizer += i4 + 1;
        return i5;
    }
}
