package kotlin;

import java.nio.charset.Charset;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class AsPropertyTypeDeserializer {
    private static final char[] AudioAttributesCompatParcelizer = {'\r', '\n'};
    private static final char[] IconCompatParcelizer = {'\n'};
    private static final onEmsgLeafAtomRead<Charset> read = onEmsgLeafAtomRead.write(parseMdtaFromMeta.RemoteActionCompatParcelizer, parseMdtaFromMeta.AudioAttributesImplApi26Parcelizer, parseMdtaFromMeta.write, parseMdtaFromMeta.IconCompatParcelizer, parseMdtaFromMeta.read);
    private int AudioAttributesImplBaseParcelizer;
    private byte[] RemoteActionCompatParcelizer;
    private int write;

    public AsPropertyTypeDeserializer() {
        this.RemoteActionCompatParcelizer = LaissezFaireSubTypeValidator.RemoteActionCompatParcelizer;
    }

    public AsPropertyTypeDeserializer(int i) {
        this.RemoteActionCompatParcelizer = new byte[i];
        this.write = i;
    }

    public AsPropertyTypeDeserializer(byte[] bArr) {
        this.RemoteActionCompatParcelizer = bArr;
        this.write = bArr.length;
    }

    public AsPropertyTypeDeserializer(byte[] bArr, int i) {
        this.RemoteActionCompatParcelizer = bArr;
        this.write = i;
    }

    public final void write(int i) {
        IconCompatParcelizer(AudioAttributesCompatParcelizer() < i ? new byte[i] : this.RemoteActionCompatParcelizer, i);
    }

    public final void AudioAttributesCompatParcelizer(byte[] bArr) {
        IconCompatParcelizer(bArr, bArr.length);
    }

    public final void IconCompatParcelizer(byte[] bArr, int i) {
        this.RemoteActionCompatParcelizer = bArr;
        this.write = i;
        this.AudioAttributesImplBaseParcelizer = 0;
    }

    public final void IconCompatParcelizer(int i) {
        if (i > AudioAttributesCompatParcelizer()) {
            this.RemoteActionCompatParcelizer = Arrays.copyOf(this.RemoteActionCompatParcelizer, i);
        }
    }

    public final int IconCompatParcelizer() {
        return this.write - this.AudioAttributesImplBaseParcelizer;
    }

    public final int read() {
        return this.write;
    }

    public final void AudioAttributesCompatParcelizer(int i) {
        buildTypeSerializer.IconCompatParcelizer(i >= 0 && i <= this.RemoteActionCompatParcelizer.length);
        this.write = i;
    }

    public final int write() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    public final void MediaBrowserCompatCustomActionResultReceiver(int i) {
        buildTypeSerializer.IconCompatParcelizer(i >= 0 && i <= this.write);
        this.AudioAttributesImplBaseParcelizer = i;
    }

    public final byte[] RemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public final int AudioAttributesCompatParcelizer() {
        return this.RemoteActionCompatParcelizer.length;
    }

    public final void AudioAttributesImplBaseParcelizer(int i) {
        MediaBrowserCompatCustomActionResultReceiver(this.AudioAttributesImplBaseParcelizer + i);
    }

    public final void AudioAttributesCompatParcelizer(AsExternalTypeSerializer asExternalTypeSerializer, int i) {
        write(asExternalTypeSerializer.write, 0, i);
        asExternalTypeSerializer.read(0);
    }

    public final void write(byte[] bArr, int i, int i2) {
        System.arraycopy(this.RemoteActionCompatParcelizer, this.AudioAttributesImplBaseParcelizer, bArr, i, i2);
        this.AudioAttributesImplBaseParcelizer += i2;
    }

    public final int AudioAttributesImplBaseParcelizer() {
        return this.RemoteActionCompatParcelizer[this.AudioAttributesImplBaseParcelizer] & 255;
    }

    public final char IconCompatParcelizer(Charset charset) {
        buildTypeSerializer.write(read.contains(charset), "Unsupported charset: ".concat(String.valueOf(charset)));
        return (char) (AudioAttributesCompatParcelizer(charset) >> 16);
    }

    public final int onPlayFromMediaId() {
        byte[] bArr = this.RemoteActionCompatParcelizer;
        int i = this.AudioAttributesImplBaseParcelizer;
        this.AudioAttributesImplBaseParcelizer = i + 1;
        return bArr[i] & 255;
    }

    public final int onPrepare() {
        byte[] bArr = this.RemoteActionCompatParcelizer;
        int i = this.AudioAttributesImplBaseParcelizer;
        int i2 = i + 1;
        byte b = bArr[i];
        this.AudioAttributesImplBaseParcelizer = i + 2;
        return (bArr[i2] & 255) | ((b & 255) << 8);
    }

    public final int onCustomAction() {
        byte[] bArr = this.RemoteActionCompatParcelizer;
        int i = this.AudioAttributesImplBaseParcelizer;
        int i2 = i + 1;
        byte b = bArr[i];
        this.AudioAttributesImplBaseParcelizer = i + 2;
        return ((bArr[i2] & 255) << 8) | (b & 255);
    }

    public final short MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
        byte[] bArr = this.RemoteActionCompatParcelizer;
        int i = this.AudioAttributesImplBaseParcelizer;
        int i2 = i + 1;
        byte b = bArr[i];
        this.AudioAttributesImplBaseParcelizer = i + 2;
        return (short) ((bArr[i2] & 255) | ((b & 255) << 8));
    }

    public final short MediaBrowserCompatSearchResultReceiver() {
        byte[] bArr = this.RemoteActionCompatParcelizer;
        int i = this.AudioAttributesImplBaseParcelizer;
        int i2 = i + 1;
        byte b = bArr[i];
        this.AudioAttributesImplBaseParcelizer = i + 2;
        return (short) (((bArr[i2] & 255) << 8) | (b & 255));
    }

    public final int onPause() {
        byte[] bArr = this.RemoteActionCompatParcelizer;
        int i = this.AudioAttributesImplBaseParcelizer;
        byte b = bArr[i];
        int i2 = i + 2;
        byte b2 = bArr[i + 1];
        this.AudioAttributesImplBaseParcelizer = i + 3;
        return (bArr[i2] & 255) | ((b2 & 255) << 8) | ((b & 255) << 16);
    }

    public final int AudioAttributesImplApi26Parcelizer() {
        byte[] bArr = this.RemoteActionCompatParcelizer;
        int i = this.AudioAttributesImplBaseParcelizer;
        byte b = bArr[i];
        int i2 = i + 2;
        byte b2 = bArr[i + 1];
        this.AudioAttributesImplBaseParcelizer = i + 3;
        return (bArr[i2] & 255) | ((b2 & 255) << 8) | (((b & 255) << 24) >> 8);
    }

    public final long onMediaButtonEvent() {
        byte[] bArr = this.RemoteActionCompatParcelizer;
        int i = this.AudioAttributesImplBaseParcelizer;
        long j = bArr[i];
        long j2 = bArr[i + 1];
        int i2 = i + 3;
        long j3 = bArr[i + 2];
        this.AudioAttributesImplBaseParcelizer = i + 4;
        return (((long) bArr[i2]) & 255) | ((j & 255) << 24) | ((j2 & 255) << 16) | ((j3 & 255) << 8);
    }

    public final long RatingCompat() {
        byte[] bArr = this.RemoteActionCompatParcelizer;
        int i = this.AudioAttributesImplBaseParcelizer;
        long j = bArr[i];
        long j2 = bArr[i + 1];
        int i2 = i + 3;
        long j3 = bArr[i + 2];
        this.AudioAttributesImplBaseParcelizer = i + 4;
        return ((((long) bArr[i2]) & 255) << 24) | (j & 255) | ((j2 & 255) << 8) | ((j3 & 255) << 16);
    }

    public final int MediaBrowserCompatItemReceiver() {
        byte[] bArr = this.RemoteActionCompatParcelizer;
        int i = this.AudioAttributesImplBaseParcelizer;
        byte b = bArr[i];
        byte b2 = bArr[i + 1];
        int i2 = i + 3;
        byte b3 = bArr[i + 2];
        this.AudioAttributesImplBaseParcelizer = i + 4;
        return (bArr[i2] & 255) | ((b2 & 255) << 16) | ((b & 255) << 24) | ((b3 & 255) << 8);
    }

    public final int MediaMetadataCompat() {
        byte[] bArr = this.RemoteActionCompatParcelizer;
        int i = this.AudioAttributesImplBaseParcelizer;
        byte b = bArr[i];
        byte b2 = bArr[i + 1];
        int i2 = i + 3;
        byte b3 = bArr[i + 2];
        this.AudioAttributesImplBaseParcelizer = i + 4;
        return ((bArr[i2] & 255) << 24) | ((b2 & 255) << 8) | (b & 255) | ((b3 & 255) << 16);
    }

    public final long handleMediaPlayPauseIfPendingOnHandler() {
        byte[] bArr = this.RemoteActionCompatParcelizer;
        int i = this.AudioAttributesImplBaseParcelizer;
        long j = bArr[i];
        long j2 = bArr[i + 1];
        long j3 = bArr[i + 2];
        long j4 = bArr[i + 3];
        long j5 = bArr[i + 4];
        long j6 = bArr[i + 5];
        int i2 = i + 7;
        long j7 = bArr[i + 6];
        this.AudioAttributesImplBaseParcelizer = i + 8;
        return (((long) bArr[i2]) & 255) | ((255 & j7) << 8) | ((j & 255) << 56) | ((j2 & 255) << 48) | ((j3 & 255) << 40) | ((j4 & 255) << 32) | ((j5 & 255) << 24) | ((j6 & 255) << 16);
    }

    public final long MediaDescriptionCompat() {
        byte[] bArr = this.RemoteActionCompatParcelizer;
        int i = this.AudioAttributesImplBaseParcelizer;
        long j = bArr[i];
        long j2 = bArr[i + 1];
        long j3 = bArr[i + 2];
        long j4 = bArr[i + 3];
        long j5 = bArr[i + 4];
        long j6 = bArr[i + 5];
        int i2 = i + 7;
        long j7 = bArr[i + 6];
        this.AudioAttributesImplBaseParcelizer = i + 8;
        return ((((long) bArr[i2]) & 255) << 56) | ((255 & j7) << 48) | (j & 255) | ((j2 & 255) << 8) | ((j3 & 255) << 16) | ((j4 & 255) << 24) | ((j5 & 255) << 32) | ((j6 & 255) << 40);
    }

    public final int onFastForward() {
        byte[] bArr = this.RemoteActionCompatParcelizer;
        int i = this.AudioAttributesImplBaseParcelizer;
        byte b = bArr[i];
        byte b2 = bArr[i + 1];
        this.AudioAttributesImplBaseParcelizer = i + 4;
        return (b2 & 255) | ((b & 255) << 8);
    }

    public final int onPlay() {
        return onPlayFromMediaId() | (onPlayFromMediaId() << 21) | (onPlayFromMediaId() << 14) | (onPlayFromMediaId() << 7);
    }

    public final int onPrepareFromSearch() {
        int iMediaBrowserCompatItemReceiver = MediaBrowserCompatItemReceiver();
        if (iMediaBrowserCompatItemReceiver >= 0) {
            return iMediaBrowserCompatItemReceiver;
        }
        throw new IllegalStateException("Top bit not zero: ".concat(String.valueOf(iMediaBrowserCompatItemReceiver)));
    }

    public final int onCommand() {
        int iMediaMetadataCompat = MediaMetadataCompat();
        if (iMediaMetadataCompat >= 0) {
            return iMediaMetadataCompat;
        }
        throw new IllegalStateException("Top bit not zero: ".concat(String.valueOf(iMediaMetadataCompat)));
    }

    public final long onPlayFromUri() {
        long jHandleMediaPlayPauseIfPendingOnHandler = handleMediaPlayPauseIfPendingOnHandler();
        if (jHandleMediaPlayPauseIfPendingOnHandler >= 0) {
            return jHandleMediaPlayPauseIfPendingOnHandler;
        }
        throw new IllegalStateException("Top bit not zero: ".concat(String.valueOf(jHandleMediaPlayPauseIfPendingOnHandler)));
    }

    public final float AudioAttributesImplApi21Parcelizer() {
        return Float.intBitsToFloat(MediaBrowserCompatItemReceiver());
    }

    public final double MediaBrowserCompatCustomActionResultReceiver() {
        return Double.longBitsToDouble(handleMediaPlayPauseIfPendingOnHandler());
    }

    public final String read(int i) {
        return AudioAttributesCompatParcelizer(i, parseMdtaFromMeta.AudioAttributesImplApi26Parcelizer);
    }

    public final String AudioAttributesCompatParcelizer(int i, Charset charset) {
        String str = new String(this.RemoteActionCompatParcelizer, this.AudioAttributesImplBaseParcelizer, i, charset);
        this.AudioAttributesImplBaseParcelizer += i;
        return str;
    }

    public final String RemoteActionCompatParcelizer(int i) {
        if (i == 0) {
            return "";
        }
        int i2 = this.AudioAttributesImplBaseParcelizer;
        int i3 = (i2 + i) - 1;
        String strWrite = LaissezFaireSubTypeValidator.write(this.RemoteActionCompatParcelizer, i2, (i3 >= this.write || this.RemoteActionCompatParcelizer[i3] != 0) ? i : i - 1);
        this.AudioAttributesImplBaseParcelizer += i;
        return strWrite;
    }

    public final String onAddQueueItem() {
        return onPrepareFromUri();
    }

    private String onPrepareFromUri() {
        if (IconCompatParcelizer() == 0) {
            return null;
        }
        int i = this.AudioAttributesImplBaseParcelizer;
        while (i < this.write && this.RemoteActionCompatParcelizer[i] != 0) {
            i++;
        }
        byte[] bArr = this.RemoteActionCompatParcelizer;
        int i2 = this.AudioAttributesImplBaseParcelizer;
        String strWrite = LaissezFaireSubTypeValidator.write(bArr, i2, i - i2);
        this.AudioAttributesImplBaseParcelizer = i;
        if (i < this.write) {
            this.AudioAttributesImplBaseParcelizer = i + 1;
        }
        return strWrite;
    }

    public final String MediaBrowserCompatMediaItem() {
        return read(parseMdtaFromMeta.AudioAttributesImplApi26Parcelizer);
    }

    public final String read(Charset charset) {
        buildTypeSerializer.write(read.contains(charset), "Unsupported charset: ".concat(String.valueOf(charset)));
        if (IconCompatParcelizer() == 0) {
            return null;
        }
        if (!charset.equals(parseMdtaFromMeta.RemoteActionCompatParcelizer)) {
            onPrepareFromMediaId();
        }
        String strAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(write(charset) - this.AudioAttributesImplBaseParcelizer, charset);
        if (this.AudioAttributesImplBaseParcelizer == this.write) {
            return strAudioAttributesCompatParcelizer;
        }
        RemoteActionCompatParcelizer(charset);
        return strAudioAttributesCompatParcelizer;
    }

    public final long onPlayFromSearch() {
        int i;
        int i2;
        long j = this.RemoteActionCompatParcelizer[this.AudioAttributesImplBaseParcelizer];
        int i3 = 7;
        while (true) {
            if (i3 < 0) {
                break;
            }
            int i4 = 1 << i3;
            if ((((long) i4) & j) != 0) {
                i3--;
            } else if (i3 < 6) {
                j &= (long) (i4 - 1);
                i2 = 7 - i3;
            } else if (i3 == 7) {
                i2 = 1;
            }
        }
        i2 = 0;
        if (i2 == 0) {
            throw new NumberFormatException("Invalid UTF-8 sequence first byte: ".concat(String.valueOf(j)));
        }
        for (i = 1; i < i2; i++) {
            byte b = this.RemoteActionCompatParcelizer[this.AudioAttributesImplBaseParcelizer + i];
            if ((b & 192) != 128) {
                throw new NumberFormatException("Invalid UTF-8 sequence continuation byte: ".concat(String.valueOf(j)));
            }
            j = (j << 6) | ((long) (b & 63));
        }
        this.AudioAttributesImplBaseParcelizer += i2;
        return j;
    }

    public final Charset onPrepareFromMediaId() {
        if (IconCompatParcelizer() >= 3) {
            byte[] bArr = this.RemoteActionCompatParcelizer;
            int i = this.AudioAttributesImplBaseParcelizer;
            if (bArr[i] == -17 && bArr[i + 1] == -69 && bArr[i + 2] == -65) {
                this.AudioAttributesImplBaseParcelizer = i + 3;
                return parseMdtaFromMeta.AudioAttributesImplApi26Parcelizer;
            }
        }
        if (IconCompatParcelizer() < 2) {
            return null;
        }
        byte[] bArr2 = this.RemoteActionCompatParcelizer;
        int i2 = this.AudioAttributesImplBaseParcelizer;
        byte b = bArr2[i2];
        if (b == -2 && bArr2[i2 + 1] == -1) {
            this.AudioAttributesImplBaseParcelizer = i2 + 2;
            return parseMdtaFromMeta.IconCompatParcelizer;
        }
        if (b != -1 || bArr2[i2 + 1] != -2) {
            return null;
        }
        this.AudioAttributesImplBaseParcelizer = i2 + 2;
        return parseMdtaFromMeta.read;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0080  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int write(java.nio.charset.Charset r5) {
        /*
            r4 = this;
            java.nio.charset.Charset r0 = kotlin.parseMdtaFromMeta.AudioAttributesImplApi26Parcelizer
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L3b
            java.nio.charset.Charset r0 = kotlin.parseMdtaFromMeta.RemoteActionCompatParcelizer
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L3b
            java.nio.charset.Charset r0 = kotlin.parseMdtaFromMeta.write
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L39
            java.nio.charset.Charset r0 = kotlin.parseMdtaFromMeta.read
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L39
            java.nio.charset.Charset r0 = kotlin.parseMdtaFromMeta.IconCompatParcelizer
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L29
            goto L39
        L29:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Unsupported charset: "
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.String r5 = r0.concat(r5)
            r4.<init>(r5)
            throw r4
        L39:
            r0 = 2
            goto L3c
        L3b:
            r0 = 1
        L3c:
            int r1 = r4.AudioAttributesImplBaseParcelizer
        L3e:
            int r2 = r4.write
            int r3 = r0 + (-1)
            int r3 = r2 - r3
            if (r1 >= r3) goto L9c
            java.nio.charset.Charset r2 = kotlin.parseMdtaFromMeta.AudioAttributesImplApi26Parcelizer
            boolean r2 = r5.equals(r2)
            if (r2 != 0) goto L56
            java.nio.charset.Charset r2 = kotlin.parseMdtaFromMeta.RemoteActionCompatParcelizer
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L60
        L56:
            byte[] r2 = r4.RemoteActionCompatParcelizer
            r2 = r2[r1]
            boolean r2 = kotlin.LaissezFaireSubTypeValidator.MediaDescriptionCompat(r2)
            if (r2 != 0) goto L9b
        L60:
            java.nio.charset.Charset r2 = kotlin.parseMdtaFromMeta.write
            boolean r2 = r5.equals(r2)
            if (r2 != 0) goto L70
            java.nio.charset.Charset r2 = kotlin.parseMdtaFromMeta.IconCompatParcelizer
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L80
        L70:
            byte[] r2 = r4.RemoteActionCompatParcelizer
            r3 = r2[r1]
            if (r3 != 0) goto L80
            int r3 = r1 + 1
            r2 = r2[r3]
            boolean r2 = kotlin.LaissezFaireSubTypeValidator.MediaDescriptionCompat(r2)
            if (r2 != 0) goto L9b
        L80:
            java.nio.charset.Charset r2 = kotlin.parseMdtaFromMeta.read
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L99
            byte[] r2 = r4.RemoteActionCompatParcelizer
            int r3 = r1 + 1
            r3 = r2[r3]
            if (r3 != 0) goto L99
            r2 = r2[r1]
            boolean r2 = kotlin.LaissezFaireSubTypeValidator.MediaDescriptionCompat(r2)
            if (r2 == 0) goto L99
            goto L9b
        L99:
            int r1 = r1 + r0
            goto L3e
        L9b:
            return r1
        L9c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.AsPropertyTypeDeserializer.write(java.nio.charset.Charset):int");
    }

    private void RemoteActionCompatParcelizer(Charset charset) {
        if (RemoteActionCompatParcelizer(charset, AudioAttributesCompatParcelizer) == '\r') {
            RemoteActionCompatParcelizer(charset, IconCompatParcelizer);
        }
    }

    private char RemoteActionCompatParcelizer(Charset charset, char[] cArr) {
        int iAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(charset);
        if (iAudioAttributesCompatParcelizer == 0) {
            return (char) 0;
        }
        char c = (char) (iAudioAttributesCompatParcelizer >> 16);
        if (!parseIndexAndCountAttribute.write(cArr, c)) {
            return (char) 0;
        }
        this.AudioAttributesImplBaseParcelizer += iAudioAttributesCompatParcelizer & 65535;
        return c;
    }

    private int AudioAttributesCompatParcelizer(Charset charset) {
        byte bAudioAttributesCompatParcelizer;
        char cIconCompatParcelizer;
        int i = 1;
        if ((charset.equals(parseMdtaFromMeta.AudioAttributesImplApi26Parcelizer) || charset.equals(parseMdtaFromMeta.RemoteActionCompatParcelizer)) && IconCompatParcelizer() > 0) {
            bAudioAttributesCompatParcelizer = (byte) parseIndexAndCountAttribute.AudioAttributesCompatParcelizer(parseUint8Attribute.write(this.RemoteActionCompatParcelizer[this.AudioAttributesImplBaseParcelizer]));
        } else {
            if ((charset.equals(parseMdtaFromMeta.write) || charset.equals(parseMdtaFromMeta.IconCompatParcelizer)) && IconCompatParcelizer() >= 2) {
                byte[] bArr = this.RemoteActionCompatParcelizer;
                int i2 = this.AudioAttributesImplBaseParcelizer;
                cIconCompatParcelizer = parseIndexAndCountAttribute.IconCompatParcelizer(bArr[i2], bArr[i2 + 1]);
            } else {
                if (!charset.equals(parseMdtaFromMeta.read) || IconCompatParcelizer() < 2) {
                    return 0;
                }
                byte[] bArr2 = this.RemoteActionCompatParcelizer;
                int i3 = this.AudioAttributesImplBaseParcelizer;
                cIconCompatParcelizer = parseIndexAndCountAttribute.IconCompatParcelizer(bArr2[i3 + 1], bArr2[i3]);
            }
            bAudioAttributesCompatParcelizer = (byte) cIconCompatParcelizer;
            i = 2;
        }
        return (parseIndexAndCountAttribute.AudioAttributesCompatParcelizer(bAudioAttributesCompatParcelizer) << 16) + i;
    }
}
