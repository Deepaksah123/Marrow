package kotlin;

import com.google.android.exoplayer2.C;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
final class pollLast {
    private final int AudioAttributesImplApi21Parcelizer;
    private boolean IconCompatParcelizer;
    private boolean RemoteActionCompatParcelizer;
    private boolean read;
    private final MinimalClassNameIdResolver MediaBrowserCompatItemReceiver = new MinimalClassNameIdResolver(0);
    private long write = C.TIME_UNSET;
    private long AudioAttributesImplBaseParcelizer = C.TIME_UNSET;
    private long AudioAttributesCompatParcelizer = C.TIME_UNSET;
    private final AsPropertyTypeDeserializer AudioAttributesImplApi26Parcelizer = new AsPropertyTypeDeserializer();

    pollLast(int i) {
        this.AudioAttributesImplApi21Parcelizer = i;
    }

    public final boolean read() {
        return this.RemoteActionCompatParcelizer;
    }

    public final int RemoteActionCompatParcelizer(closeOnFailAndThrowAsIOE closeonfailandthrowasioe, isJacksonStdImpl isjacksonstdimpl, int i) throws IOException {
        if (i <= 0) {
            return RemoteActionCompatParcelizer(closeonfailandthrowasioe);
        }
        if (!this.IconCompatParcelizer) {
            return write(closeonfailandthrowasioe, isjacksonstdimpl, i);
        }
        if (this.AudioAttributesImplBaseParcelizer == C.TIME_UNSET) {
            return RemoteActionCompatParcelizer(closeonfailandthrowasioe);
        }
        if (!this.read) {
            return read(closeonfailandthrowasioe, isjacksonstdimpl, i);
        }
        long j = this.write;
        if (j == C.TIME_UNSET) {
            return RemoteActionCompatParcelizer(closeonfailandthrowasioe);
        }
        this.AudioAttributesCompatParcelizer = this.MediaBrowserCompatItemReceiver.AudioAttributesCompatParcelizer(this.AudioAttributesImplBaseParcelizer) - this.MediaBrowserCompatItemReceiver.write(j);
        return RemoteActionCompatParcelizer(closeonfailandthrowasioe);
    }

    public final long RemoteActionCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final MinimalClassNameIdResolver AudioAttributesCompatParcelizer() {
        return this.MediaBrowserCompatItemReceiver;
    }

    private int RemoteActionCompatParcelizer(closeOnFailAndThrowAsIOE closeonfailandthrowasioe) {
        this.AudioAttributesImplApi26Parcelizer.AudioAttributesCompatParcelizer(LaissezFaireSubTypeValidator.RemoteActionCompatParcelizer);
        this.RemoteActionCompatParcelizer = true;
        closeonfailandthrowasioe.RemoteActionCompatParcelizer();
        return 0;
    }

    private int read(closeOnFailAndThrowAsIOE closeonfailandthrowasioe, isJacksonStdImpl isjacksonstdimpl, int i) throws IOException {
        int iMin = (int) Math.min(this.AudioAttributesImplApi21Parcelizer, closeonfailandthrowasioe.read());
        if (closeonfailandthrowasioe.IconCompatParcelizer() != 0) {
            isjacksonstdimpl.AudioAttributesCompatParcelizer = 0L;
            return 1;
        }
        this.AudioAttributesImplApi26Parcelizer.write(iMin);
        closeonfailandthrowasioe.RemoteActionCompatParcelizer();
        closeonfailandthrowasioe.RemoteActionCompatParcelizer(this.AudioAttributesImplApi26Parcelizer.RemoteActionCompatParcelizer(), 0, iMin);
        this.write = AudioAttributesCompatParcelizer(this.AudioAttributesImplApi26Parcelizer, i);
        this.read = true;
        return 0;
    }

    private static long AudioAttributesCompatParcelizer(AsPropertyTypeDeserializer asPropertyTypeDeserializer, int i) {
        int i2 = asPropertyTypeDeserializer.read();
        for (int iWrite = asPropertyTypeDeserializer.write(); iWrite < i2; iWrite++) {
            if (asPropertyTypeDeserializer.RemoteActionCompatParcelizer()[iWrite] == 71) {
                long j = unlinkFirst.read(asPropertyTypeDeserializer, iWrite, i);
                if (j != C.TIME_UNSET) {
                    return j;
                }
            }
        }
        return C.TIME_UNSET;
    }

    private int write(closeOnFailAndThrowAsIOE closeonfailandthrowasioe, isJacksonStdImpl isjacksonstdimpl, int i) throws IOException {
        long j = closeonfailandthrowasioe.read();
        int iMin = (int) Math.min(this.AudioAttributesImplApi21Parcelizer, j);
        long j2 = j - ((long) iMin);
        if (closeonfailandthrowasioe.IconCompatParcelizer() != j2) {
            isjacksonstdimpl.AudioAttributesCompatParcelizer = j2;
            return 1;
        }
        this.AudioAttributesImplApi26Parcelizer.write(iMin);
        closeonfailandthrowasioe.RemoteActionCompatParcelizer();
        closeonfailandthrowasioe.RemoteActionCompatParcelizer(this.AudioAttributesImplApi26Parcelizer.RemoteActionCompatParcelizer(), 0, iMin);
        this.AudioAttributesImplBaseParcelizer = read(this.AudioAttributesImplApi26Parcelizer, i);
        this.IconCompatParcelizer = true;
        return 0;
    }

    private static long read(AsPropertyTypeDeserializer asPropertyTypeDeserializer, int i) {
        int iWrite = asPropertyTypeDeserializer.write();
        int i2 = asPropertyTypeDeserializer.read();
        for (int i3 = i2 - 188; i3 >= iWrite; i3--) {
            if (unlinkFirst.AudioAttributesCompatParcelizer(asPropertyTypeDeserializer.RemoteActionCompatParcelizer(), iWrite, i2, i3)) {
                long j = unlinkFirst.read(asPropertyTypeDeserializer, i3, i);
                if (j != C.TIME_UNSET) {
                    return j;
                }
            }
        }
        return C.TIME_UNSET;
    }
}
