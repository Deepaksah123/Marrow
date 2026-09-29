package kotlin;

import com.google.android.exoplayer2.C;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.Locale;
import java.util.Objects;
import kotlin.PsBinarySearchSeeker;
import org.apache.commons.compress.utils.CharsetNames;

/* JADX INFO: loaded from: classes5.dex */
final class PsDurationReader implements PsBinarySearchSeeker1 {
    private static final Charset read = Charset.forName(CharsetNames.UTF_8);
    private final File AudioAttributesCompatParcelizer;
    private PsBinarySearchSeeker RemoteActionCompatParcelizer;
    private final int write = C.DEFAULT_BUFFER_SEGMENT_SIZE;

    static class AudioAttributesCompatParcelizer {
        public final int RemoteActionCompatParcelizer;
        public final byte[] read;

        AudioAttributesCompatParcelizer(byte[] bArr, int i) {
            this.read = bArr;
            this.RemoteActionCompatParcelizer = i;
        }
    }

    PsDurationReader(File file, int i) {
        this.AudioAttributesCompatParcelizer = file;
    }

    @Override // kotlin.PsBinarySearchSeeker1
    public final void IconCompatParcelizer(long j, String str) {
        RemoteActionCompatParcelizer();
        write(j, str);
    }

    private byte[] write() {
        AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = read();
        if (audioAttributesCompatParcelizer == null) {
            return null;
        }
        byte[] bArr = new byte[audioAttributesCompatParcelizer.RemoteActionCompatParcelizer];
        System.arraycopy(audioAttributesCompatParcelizer.read, 0, bArr, 0, audioAttributesCompatParcelizer.RemoteActionCompatParcelizer);
        return bArr;
    }

    @Override // kotlin.PsBinarySearchSeeker1
    public final String IconCompatParcelizer() {
        byte[] bArrWrite = write();
        if (bArrWrite != null) {
            return new String(bArrWrite, read);
        }
        return null;
    }

    private AudioAttributesCompatParcelizer read() {
        if (!this.AudioAttributesCompatParcelizer.exists()) {
            return null;
        }
        RemoteActionCompatParcelizer();
        PsBinarySearchSeeker psBinarySearchSeeker = this.RemoteActionCompatParcelizer;
        if (psBinarySearchSeeker == null) {
            return null;
        }
        final int[] iArr = {0};
        final byte[] bArr = new byte[psBinarySearchSeeker.RemoteActionCompatParcelizer()];
        try {
            this.RemoteActionCompatParcelizer.write(new PsBinarySearchSeeker.RemoteActionCompatParcelizer() { // from class: o.PsDurationReader.1
                @Override // o.PsBinarySearchSeeker.RemoteActionCompatParcelizer
                public final void RemoteActionCompatParcelizer(InputStream inputStream, int i) throws IOException {
                    try {
                        inputStream.read(bArr, iArr[0], i);
                        int[] iArr2 = iArr;
                        iArr2[0] = iArr2[0] + i;
                    } finally {
                        inputStream.close();
                    }
                }
            });
        } catch (IOException unused) {
            DvbSubtitleReader.read().write();
        }
        return new AudioAttributesCompatParcelizer(bArr, iArr[0]);
    }

    @Override // kotlin.PsBinarySearchSeeker1
    public final void AudioAttributesCompatParcelizer() {
        putSps.AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer, "There was a problem closing the Crashlytics log file.");
        this.RemoteActionCompatParcelizer = null;
    }

    private void RemoteActionCompatParcelizer() {
        if (this.RemoteActionCompatParcelizer == null) {
            try {
                this.RemoteActionCompatParcelizer = new PsBinarySearchSeeker(this.AudioAttributesCompatParcelizer);
            } catch (IOException unused) {
                DvbSubtitleReader dvbSubtitleReader = DvbSubtitleReader.read();
                Objects.toString(this.AudioAttributesCompatParcelizer);
                dvbSubtitleReader.write();
            }
        }
    }

    private void write(long j, String str) {
        if (this.RemoteActionCompatParcelizer != null) {
            if (str == null) {
                str = "null";
            }
            try {
                int i = this.write / 4;
                if (str.length() > i) {
                    StringBuilder sb = new StringBuilder("...");
                    sb.append(str.substring(str.length() - i));
                    str = sb.toString();
                }
                this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(String.format(Locale.US, "%d %s%n", Long.valueOf(j), str.replaceAll("\r", " ").replaceAll("\n", " ")).getBytes(read));
                while (!this.RemoteActionCompatParcelizer.read() && this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer() > this.write) {
                    this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer();
                }
            } catch (IOException unused) {
                DvbSubtitleReader.read().write();
            }
        }
    }
}
