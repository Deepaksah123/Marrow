package kotlin;

import com.google.android.exoplayer2.C;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
final class peek {
    private boolean AudioAttributesCompatParcelizer;
    private boolean RemoteActionCompatParcelizer;
    private boolean write;
    private final MinimalClassNameIdResolver AudioAttributesImplApi26Parcelizer = new MinimalClassNameIdResolver(0);
    private long read = C.TIME_UNSET;
    private long AudioAttributesImplApi21Parcelizer = C.TIME_UNSET;
    private long IconCompatParcelizer = C.TIME_UNSET;
    private final AsPropertyTypeDeserializer MediaBrowserCompatItemReceiver = new AsPropertyTypeDeserializer();

    peek() {
    }

    public final boolean AudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final MinimalClassNameIdResolver read() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    public final int IconCompatParcelizer(closeOnFailAndThrowAsIOE closeonfailandthrowasioe, isJacksonStdImpl isjacksonstdimpl) throws IOException {
        if (!this.RemoteActionCompatParcelizer) {
            return AudioAttributesCompatParcelizer(closeonfailandthrowasioe, isjacksonstdimpl);
        }
        if (this.AudioAttributesImplApi21Parcelizer == C.TIME_UNSET) {
            return write(closeonfailandthrowasioe);
        }
        if (!this.write) {
            return write(closeonfailandthrowasioe, isjacksonstdimpl);
        }
        long j = this.read;
        if (j == C.TIME_UNSET) {
            return write(closeonfailandthrowasioe);
        }
        this.IconCompatParcelizer = this.AudioAttributesImplApi26Parcelizer.AudioAttributesCompatParcelizer(this.AudioAttributesImplApi21Parcelizer) - this.AudioAttributesImplApi26Parcelizer.write(j);
        return write(closeonfailandthrowasioe);
    }

    public final long RemoteActionCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public static long IconCompatParcelizer(AsPropertyTypeDeserializer asPropertyTypeDeserializer) {
        int iWrite = asPropertyTypeDeserializer.write();
        if (asPropertyTypeDeserializer.IconCompatParcelizer() < 9) {
            return C.TIME_UNSET;
        }
        byte[] bArr = new byte[9];
        asPropertyTypeDeserializer.write(bArr, 0, 9);
        asPropertyTypeDeserializer.MediaBrowserCompatCustomActionResultReceiver(iWrite);
        return !IconCompatParcelizer(bArr) ? C.TIME_UNSET : read(bArr);
    }

    private int write(closeOnFailAndThrowAsIOE closeonfailandthrowasioe) {
        this.MediaBrowserCompatItemReceiver.AudioAttributesCompatParcelizer(LaissezFaireSubTypeValidator.RemoteActionCompatParcelizer);
        this.AudioAttributesCompatParcelizer = true;
        closeonfailandthrowasioe.RemoteActionCompatParcelizer();
        return 0;
    }

    private int write(closeOnFailAndThrowAsIOE closeonfailandthrowasioe, isJacksonStdImpl isjacksonstdimpl) throws IOException {
        int iMin = (int) Math.min(20000L, closeonfailandthrowasioe.read());
        if (closeonfailandthrowasioe.IconCompatParcelizer() != 0) {
            isjacksonstdimpl.AudioAttributesCompatParcelizer = 0L;
            return 1;
        }
        this.MediaBrowserCompatItemReceiver.write(iMin);
        closeonfailandthrowasioe.RemoteActionCompatParcelizer();
        closeonfailandthrowasioe.RemoteActionCompatParcelizer(this.MediaBrowserCompatItemReceiver.RemoteActionCompatParcelizer(), 0, iMin);
        this.read = RemoteActionCompatParcelizer(this.MediaBrowserCompatItemReceiver);
        this.write = true;
        return 0;
    }

    private static long RemoteActionCompatParcelizer(AsPropertyTypeDeserializer asPropertyTypeDeserializer) {
        int i = asPropertyTypeDeserializer.read();
        for (int iWrite = asPropertyTypeDeserializer.write(); iWrite < i - 3; iWrite++) {
            if (IconCompatParcelizer(asPropertyTypeDeserializer.RemoteActionCompatParcelizer(), iWrite) == 442) {
                asPropertyTypeDeserializer.MediaBrowserCompatCustomActionResultReceiver(iWrite + 4);
                long jIconCompatParcelizer = IconCompatParcelizer(asPropertyTypeDeserializer);
                if (jIconCompatParcelizer != C.TIME_UNSET) {
                    return jIconCompatParcelizer;
                }
            }
        }
        return C.TIME_UNSET;
    }

    private int AudioAttributesCompatParcelizer(closeOnFailAndThrowAsIOE closeonfailandthrowasioe, isJacksonStdImpl isjacksonstdimpl) throws IOException {
        long j = closeonfailandthrowasioe.read();
        int iMin = (int) Math.min(20000L, j);
        long j2 = j - ((long) iMin);
        if (closeonfailandthrowasioe.IconCompatParcelizer() != j2) {
            isjacksonstdimpl.AudioAttributesCompatParcelizer = j2;
            return 1;
        }
        this.MediaBrowserCompatItemReceiver.write(iMin);
        closeonfailandthrowasioe.RemoteActionCompatParcelizer();
        closeonfailandthrowasioe.RemoteActionCompatParcelizer(this.MediaBrowserCompatItemReceiver.RemoteActionCompatParcelizer(), 0, iMin);
        this.AudioAttributesImplApi21Parcelizer = write(this.MediaBrowserCompatItemReceiver);
        this.RemoteActionCompatParcelizer = true;
        return 0;
    }

    private static long write(AsPropertyTypeDeserializer asPropertyTypeDeserializer) {
        int iWrite = asPropertyTypeDeserializer.write();
        for (int i = asPropertyTypeDeserializer.read() - 4; i >= iWrite; i--) {
            if (IconCompatParcelizer(asPropertyTypeDeserializer.RemoteActionCompatParcelizer(), i) == 442) {
                asPropertyTypeDeserializer.MediaBrowserCompatCustomActionResultReceiver(i + 4);
                long jIconCompatParcelizer = IconCompatParcelizer(asPropertyTypeDeserializer);
                if (jIconCompatParcelizer != C.TIME_UNSET) {
                    return jIconCompatParcelizer;
                }
            }
        }
        return C.TIME_UNSET;
    }

    private static int IconCompatParcelizer(byte[] bArr, int i) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }

    private static boolean IconCompatParcelizer(byte[] bArr) {
        return (bArr[0] & 196) == 68 && (bArr[2] & 4) == 4 && (bArr[4] & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3;
    }

    private static long read(byte[] bArr) {
        long j = bArr[0];
        long j2 = ((j & 3) << 28) | (((56 & j) >> 3) << 30) | ((((long) bArr[1]) & 255) << 20);
        long j3 = bArr[2];
        return j2 | (((j3 & 248) >> 3) << 15) | ((j3 & 3) << 13) | ((((long) bArr[3]) & 255) << 5) | ((((long) bArr[4]) & 248) >> 3);
    }
}
