package kotlin;

import java.io.IOException;
import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes2.dex */
final class isFromIntValue implements ExceptionUtil {
    private long AudioAttributesCompatParcelizer;
    private int IconCompatParcelizer;
    private int read;
    private enums write;
    private final byte[] AudioAttributesImplApi21Parcelizer = new byte[8];
    private final ArrayDeque<AudioAttributesCompatParcelizer> RemoteActionCompatParcelizer = new ArrayDeque<>();
    private final buildCheckerIfNeeded MediaBrowserCompatItemReceiver = new buildCheckerIfNeeded();

    @Override // kotlin.ExceptionUtil
    public final void RemoteActionCompatParcelizer(enums enumsVar) {
        this.write = enumsVar;
    }

    @Override // kotlin.ExceptionUtil
    public final void write() {
        this.IconCompatParcelizer = 0;
        this.RemoteActionCompatParcelizer.clear();
        this.MediaBrowserCompatItemReceiver.AudioAttributesCompatParcelizer();
    }

    @Override // kotlin.ExceptionUtil
    public final boolean read(closeOnFailAndThrowAsIOE closeonfailandthrowasioe) throws IOException {
        buildTypeSerializer.AudioAttributesCompatParcelizer(this.write);
        while (true) {
            AudioAttributesCompatParcelizer audioAttributesCompatParcelizerPeek = this.RemoteActionCompatParcelizer.peek();
            if (audioAttributesCompatParcelizerPeek == null || closeonfailandthrowasioe.IconCompatParcelizer() < audioAttributesCompatParcelizerPeek.IconCompatParcelizer) {
                byte b = 0;
                if (this.IconCompatParcelizer == 0) {
                    long jWrite = this.MediaBrowserCompatItemReceiver.write(closeonfailandthrowasioe, true, false, 4);
                    if (jWrite == -2) {
                        jWrite = write(closeonfailandthrowasioe);
                    }
                    if (jWrite == -1) {
                        return false;
                    }
                    this.read = (int) jWrite;
                    this.IconCompatParcelizer = 1;
                }
                if (this.IconCompatParcelizer == 1) {
                    this.AudioAttributesCompatParcelizer = this.MediaBrowserCompatItemReceiver.write(closeonfailandthrowasioe, false, true, 8);
                    this.IconCompatParcelizer = 2;
                }
                int i = this.write.read(this.read);
                if (i != 0) {
                    if (i == 1) {
                        long jIconCompatParcelizer = closeonfailandthrowasioe.IconCompatParcelizer();
                        this.RemoteActionCompatParcelizer.push(new AudioAttributesCompatParcelizer(this.read, this.AudioAttributesCompatParcelizer + jIconCompatParcelizer, b));
                        this.write.write(this.read, jIconCompatParcelizer, this.AudioAttributesCompatParcelizer);
                        this.IconCompatParcelizer = 0;
                        return true;
                    }
                    if (i == 2) {
                        long j = this.AudioAttributesCompatParcelizer;
                        if (j > 8) {
                            StringBuilder sb = new StringBuilder("Invalid integer size: ");
                            sb.append(this.AudioAttributesCompatParcelizer);
                            throw SchemaAware.RemoteActionCompatParcelizer(sb.toString(), null);
                        }
                        this.write.write(this.read, AudioAttributesCompatParcelizer(closeonfailandthrowasioe, (int) j));
                        this.IconCompatParcelizer = 0;
                        return true;
                    }
                    if (i == 3) {
                        long j2 = this.AudioAttributesCompatParcelizer;
                        if (j2 > 2147483647L) {
                            StringBuilder sb2 = new StringBuilder("String element size: ");
                            sb2.append(this.AudioAttributesCompatParcelizer);
                            throw SchemaAware.RemoteActionCompatParcelizer(sb2.toString(), null);
                        }
                        this.write.IconCompatParcelizer(this.read, write(closeonfailandthrowasioe, (int) j2));
                        this.IconCompatParcelizer = 0;
                        return true;
                    }
                    if (i == 4) {
                        this.write.AudioAttributesCompatParcelizer(this.read, (int) this.AudioAttributesCompatParcelizer, closeonfailandthrowasioe);
                        this.IconCompatParcelizer = 0;
                        return true;
                    }
                    if (i == 5) {
                        long j3 = this.AudioAttributesCompatParcelizer;
                        if (j3 != 4 && j3 != 8) {
                            StringBuilder sb3 = new StringBuilder("Invalid float size: ");
                            sb3.append(this.AudioAttributesCompatParcelizer);
                            throw SchemaAware.RemoteActionCompatParcelizer(sb3.toString(), null);
                        }
                        this.write.read(this.read, IconCompatParcelizer(closeonfailandthrowasioe, (int) j3));
                        this.IconCompatParcelizer = 0;
                        return true;
                    }
                    throw SchemaAware.RemoteActionCompatParcelizer("Invalid element type ".concat(String.valueOf(i)), null);
                }
                closeonfailandthrowasioe.IconCompatParcelizer((int) this.AudioAttributesCompatParcelizer);
                this.IconCompatParcelizer = 0;
            } else {
                this.write.write(this.RemoteActionCompatParcelizer.pop().read);
                return true;
            }
        }
    }

    private long write(closeOnFailAndThrowAsIOE closeonfailandthrowasioe) throws IOException {
        closeonfailandthrowasioe.RemoteActionCompatParcelizer();
        while (true) {
            closeonfailandthrowasioe.RemoteActionCompatParcelizer(this.AudioAttributesImplApi21Parcelizer, 0, 4);
            int iIconCompatParcelizer = buildCheckerIfNeeded.IconCompatParcelizer(this.AudioAttributesImplApi21Parcelizer[0]);
            if (iIconCompatParcelizer != -1 && iIconCompatParcelizer <= 4) {
                int iRemoteActionCompatParcelizer = (int) buildCheckerIfNeeded.RemoteActionCompatParcelizer(this.AudioAttributesImplApi21Parcelizer, iIconCompatParcelizer, false);
                if (this.write.AudioAttributesCompatParcelizer(iRemoteActionCompatParcelizer)) {
                    closeonfailandthrowasioe.IconCompatParcelizer(iIconCompatParcelizer);
                    return iRemoteActionCompatParcelizer;
                }
            }
            closeonfailandthrowasioe.IconCompatParcelizer(1);
        }
    }

    private long AudioAttributesCompatParcelizer(closeOnFailAndThrowAsIOE closeonfailandthrowasioe, int i) throws IOException {
        closeonfailandthrowasioe.IconCompatParcelizer(this.AudioAttributesImplApi21Parcelizer, 0, i);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j = (j << 8) | ((long) (this.AudioAttributesImplApi21Parcelizer[i2] & 255));
        }
        return j;
    }

    private double IconCompatParcelizer(closeOnFailAndThrowAsIOE closeonfailandthrowasioe, int i) throws IOException {
        long jAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(closeonfailandthrowasioe, i);
        if (i == 4) {
            return Float.intBitsToFloat((int) jAudioAttributesCompatParcelizer);
        }
        return Double.longBitsToDouble(jAudioAttributesCompatParcelizer);
    }

    private static String write(closeOnFailAndThrowAsIOE closeonfailandthrowasioe, int i) throws IOException {
        if (i == 0) {
            return "";
        }
        byte[] bArr = new byte[i];
        closeonfailandthrowasioe.IconCompatParcelizer(bArr, 0, i);
        while (i > 0 && bArr[i - 1] == 0) {
            i--;
        }
        return new String(bArr, 0, i);
    }

    static final class AudioAttributesCompatParcelizer {
        private final long IconCompatParcelizer;
        private final int read;

        /* synthetic */ AudioAttributesCompatParcelizer(int i, long j, byte b) {
            this(i, j);
        }

        private AudioAttributesCompatParcelizer(int i, long j) {
            this.read = i;
            this.IconCompatParcelizer = j;
        }
    }
}
