package kotlin;

import java.io.IOException;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public abstract class getCurrentSampleSize {
    private static final getCurrentSampleSize RemoteActionCompatParcelizer;
    private static final getCurrentSampleSize write = new write("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", '=');

    abstract int AudioAttributesCompatParcelizer(int i);

    abstract void AudioAttributesCompatParcelizer(Appendable appendable, byte[] bArr, int i, int i2) throws IOException;

    getCurrentSampleSize() {
    }

    public final String read(byte[] bArr) {
        return write(bArr, bArr.length);
    }

    private String write(byte[] bArr, int i) {
        parseStsd.read(0, i, bArr.length);
        StringBuilder sb = new StringBuilder(AudioAttributesCompatParcelizer(i));
        try {
            AudioAttributesCompatParcelizer(sb, bArr, 0, i);
            return sb.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    static {
        new write("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_", '=');
        new IconCompatParcelizer("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567", '=');
        new IconCompatParcelizer("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV", '=');
        RemoteActionCompatParcelizer = new read("base16()", "0123456789ABCDEF");
    }

    public static getCurrentSampleSize IconCompatParcelizer() {
        return write;
    }

    public static getCurrentSampleSize RemoteActionCompatParcelizer() {
        return RemoteActionCompatParcelizer;
    }

    static final class RemoteActionCompatParcelizer {
        final int AudioAttributesCompatParcelizer;
        private final boolean[] AudioAttributesImplApi21Parcelizer;
        private final String AudioAttributesImplBaseParcelizer;
        private final char[] IconCompatParcelizer;
        private final boolean MediaBrowserCompatCustomActionResultReceiver;
        private final byte[] MediaBrowserCompatItemReceiver;
        final int RemoteActionCompatParcelizer;
        final int read;
        final int write;

        RemoteActionCompatParcelizer(String str, char[] cArr) {
            this(str, cArr, write(cArr));
        }

        private RemoteActionCompatParcelizer(String str, char[] cArr, byte[] bArr) {
            this.AudioAttributesImplBaseParcelizer = (String) parseStsd.IconCompatParcelizer(str);
            this.IconCompatParcelizer = (char[]) parseStsd.IconCompatParcelizer(cArr);
            try {
                int iWrite = parseCoverArt.write(cArr.length, RoundingMode.UNNECESSARY);
                this.write = iWrite;
                int iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(iWrite);
                int i = 1 << (3 - iNumberOfTrailingZeros);
                this.read = i;
                this.AudioAttributesCompatParcelizer = iWrite >> iNumberOfTrailingZeros;
                this.RemoteActionCompatParcelizer = cArr.length - 1;
                this.MediaBrowserCompatItemReceiver = bArr;
                boolean[] zArr = new boolean[i];
                for (int i2 = 0; i2 < this.AudioAttributesCompatParcelizer; i2++) {
                    zArr[parseCoverArt.read(i2 << 3, this.write, RoundingMode.CEILING)] = true;
                }
                this.AudioAttributesImplApi21Parcelizer = zArr;
                this.MediaBrowserCompatCustomActionResultReceiver = false;
            } catch (ArithmeticException e) {
                StringBuilder sb = new StringBuilder("Illegal alphabet length ");
                sb.append(cArr.length);
                throw new IllegalArgumentException(sb.toString(), e);
            }
        }

        private static byte[] write(char[] cArr) {
            byte[] bArr = new byte[128];
            Arrays.fill(bArr, (byte) -1);
            for (int i = 0; i < cArr.length; i++) {
                char c = cArr[i];
                boolean z = true;
                parseStsd.RemoteActionCompatParcelizer(c < 128, "Non-ASCII character: %s", c);
                if (bArr[c] != -1) {
                    z = false;
                }
                parseStsd.RemoteActionCompatParcelizer(z, "Duplicate character: %s", c);
                bArr[c] = (byte) i;
            }
            return bArr;
        }

        final char AudioAttributesCompatParcelizer(int i) {
            return this.IconCompatParcelizer[i];
        }

        public final boolean write(char c) {
            byte[] bArr = this.MediaBrowserCompatItemReceiver;
            return c < bArr.length && bArr[c] != -1;
        }

        public final String toString() {
            return this.AudioAttributesImplBaseParcelizer;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof RemoteActionCompatParcelizer)) {
                return false;
            }
            RemoteActionCompatParcelizer remoteActionCompatParcelizer = (RemoteActionCompatParcelizer) obj;
            boolean z = remoteActionCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver;
            return Arrays.equals(this.IconCompatParcelizer, remoteActionCompatParcelizer.IconCompatParcelizer);
        }

        public final int hashCode() {
            return Arrays.hashCode(this.IconCompatParcelizer) + 1237;
        }
    }

    static class IconCompatParcelizer extends getCurrentSampleSize {
        private Character AudioAttributesCompatParcelizer;
        final RemoteActionCompatParcelizer IconCompatParcelizer;

        IconCompatParcelizer(String str, String str2, Character ch) {
            this(new RemoteActionCompatParcelizer(str, str2.toCharArray()), ch);
        }

        IconCompatParcelizer(RemoteActionCompatParcelizer remoteActionCompatParcelizer, Character ch) {
            this.IconCompatParcelizer = (RemoteActionCompatParcelizer) parseStsd.IconCompatParcelizer(remoteActionCompatParcelizer);
            parseStsd.AudioAttributesCompatParcelizer(ch == null || !remoteActionCompatParcelizer.write(ch.charValue()), "Padding character %s was already in alphabet", ch);
            this.AudioAttributesCompatParcelizer = ch;
        }

        @Override // kotlin.getCurrentSampleSize
        final int AudioAttributesCompatParcelizer(int i) {
            return this.IconCompatParcelizer.read * parseCoverArt.read(i, this.IconCompatParcelizer.AudioAttributesCompatParcelizer, RoundingMode.CEILING);
        }

        @Override // kotlin.getCurrentSampleSize
        void AudioAttributesCompatParcelizer(Appendable appendable, byte[] bArr, int i, int i2) throws IOException {
            int i3 = 0;
            parseStsd.read(0, i2, bArr.length);
            while (i3 < i2) {
                read(appendable, bArr, i3, Math.min(this.IconCompatParcelizer.AudioAttributesCompatParcelizer, i2 - i3));
                i3 += this.IconCompatParcelizer.AudioAttributesCompatParcelizer;
            }
        }

        final void read(Appendable appendable, byte[] bArr, int i, int i2) throws IOException {
            parseStsd.read(i, i + i2, bArr.length);
            int i3 = 0;
            parseStsd.RemoteActionCompatParcelizer(i2 <= this.IconCompatParcelizer.AudioAttributesCompatParcelizer);
            long j = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                j = (j | ((long) (bArr[i + i4] & 255))) << 8;
            }
            int i5 = this.IconCompatParcelizer.write;
            while (i3 < (i2 << 3)) {
                appendable.append(this.IconCompatParcelizer.AudioAttributesCompatParcelizer(((int) (j >>> ((((i2 + 1) << 3) - i5) - i3))) & this.IconCompatParcelizer.RemoteActionCompatParcelizer));
                i3 += this.IconCompatParcelizer.write;
            }
            if (this.AudioAttributesCompatParcelizer != null) {
                while (i3 < (this.IconCompatParcelizer.AudioAttributesCompatParcelizer << 3)) {
                    appendable.append(this.AudioAttributesCompatParcelizer.charValue());
                    i3 += this.IconCompatParcelizer.write;
                }
            }
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("BaseEncoding.");
            sb.append(this.IconCompatParcelizer);
            if (8 % this.IconCompatParcelizer.write != 0) {
                if (this.AudioAttributesCompatParcelizer == null) {
                    sb.append(".omitPadding()");
                } else {
                    sb.append(".withPadChar('");
                    sb.append(this.AudioAttributesCompatParcelizer);
                    sb.append("')");
                }
            }
            return sb.toString();
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof IconCompatParcelizer)) {
                return false;
            }
            IconCompatParcelizer iconCompatParcelizer = (IconCompatParcelizer) obj;
            return this.IconCompatParcelizer.equals(iconCompatParcelizer.IconCompatParcelizer) && Objects.equals(this.AudioAttributesCompatParcelizer, iconCompatParcelizer.AudioAttributesCompatParcelizer);
        }

        public int hashCode() {
            return Objects.hashCode(this.AudioAttributesCompatParcelizer) ^ this.IconCompatParcelizer.hashCode();
        }
    }

    static final class read extends IconCompatParcelizer {
        private char[] read;

        read(String str, String str2) {
            this(new RemoteActionCompatParcelizer(str, str2.toCharArray()));
        }

        private read(RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
            super(remoteActionCompatParcelizer, null);
            this.read = new char[512];
            parseStsd.RemoteActionCompatParcelizer(remoteActionCompatParcelizer.IconCompatParcelizer.length == 16);
            for (int i = 0; i < 256; i++) {
                this.read[i] = remoteActionCompatParcelizer.AudioAttributesCompatParcelizer(i >>> 4);
                this.read[i | 256] = remoteActionCompatParcelizer.AudioAttributesCompatParcelizer(i & 15);
            }
        }

        @Override // o.getCurrentSampleSize.IconCompatParcelizer, kotlin.getCurrentSampleSize
        final void AudioAttributesCompatParcelizer(Appendable appendable, byte[] bArr, int i, int i2) throws IOException {
            parseStsd.read(0, i2, bArr.length);
            for (int i3 = 0; i3 < i2; i3++) {
                int i4 = bArr[i3] & 255;
                appendable.append(this.read[i4]);
                appendable.append(this.read[i4 | 256]);
            }
        }
    }

    static final class write extends IconCompatParcelizer {
        write(String str, String str2, Character ch) {
            this(new RemoteActionCompatParcelizer(str, str2.toCharArray()), ch);
        }

        private write(RemoteActionCompatParcelizer remoteActionCompatParcelizer, Character ch) {
            super(remoteActionCompatParcelizer, ch);
            parseStsd.RemoteActionCompatParcelizer(remoteActionCompatParcelizer.IconCompatParcelizer.length == 64);
        }

        @Override // o.getCurrentSampleSize.IconCompatParcelizer, kotlin.getCurrentSampleSize
        final void AudioAttributesCompatParcelizer(Appendable appendable, byte[] bArr, int i, int i2) throws IOException {
            parseStsd.read(0, i2, bArr.length);
            int i3 = i2;
            while (i3 >= 3) {
                int i4 = i + 3;
                int i5 = (bArr[i + 2] & 255) | ((bArr[i] & 255) << 16) | ((bArr[i + 1] & 255) << 8);
                appendable.append(this.IconCompatParcelizer.AudioAttributesCompatParcelizer(i5 >>> 18));
                appendable.append(this.IconCompatParcelizer.AudioAttributesCompatParcelizer((i5 >>> 12) & 63));
                appendable.append(this.IconCompatParcelizer.AudioAttributesCompatParcelizer((i5 >>> 6) & 63));
                appendable.append(this.IconCompatParcelizer.AudioAttributesCompatParcelizer(i5 & 63));
                i3 -= 3;
                i = i4;
            }
            if (i < i2) {
                read(appendable, bArr, i, i2 - i);
            }
        }
    }
}
