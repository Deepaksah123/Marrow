package kotlin;

import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
final class lambdaupdateStateAndInformListeners33 {
    private final byte[] AudioAttributesCompatParcelizer = new byte[256];
    private int IconCompatParcelizer = 0;
    private lambdaupdateStateAndInformListeners34 read;
    private ByteBuffer write;

    lambdaupdateStateAndInformListeners33() {
    }

    private lambdaupdateStateAndInformListeners33 IconCompatParcelizer(ByteBuffer byteBuffer) {
        MediaDescriptionCompat();
        ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        this.write = byteBufferAsReadOnlyBuffer;
        byteBufferAsReadOnlyBuffer.position(0);
        this.write.order(ByteOrder.LITTLE_ENDIAN);
        return this;
    }

    public final lambdaupdateStateAndInformListeners33 AudioAttributesCompatParcelizer(byte[] bArr) {
        if (bArr != null) {
            IconCompatParcelizer(ByteBuffer.wrap(bArr));
            return this;
        }
        this.write = null;
        this.read.MediaDescriptionCompat = 2;
        return this;
    }

    final lambdaupdateStateAndInformListeners34 RemoteActionCompatParcelizer() {
        if (this.write == null) {
            throw new IllegalStateException("You must call setData() before parseHeader()");
        }
        if (AudioAttributesCompatParcelizer()) {
            return this.read;
        }
        MediaBrowserCompatItemReceiver();
        if (!AudioAttributesCompatParcelizer()) {
            AudioAttributesImplApi21Parcelizer();
            if (this.read.write < 0) {
                this.read.MediaDescriptionCompat = 1;
            }
        }
        return this.read;
    }

    private boolean AudioAttributesCompatParcelizer() {
        return this.read.MediaDescriptionCompat != 0;
    }

    private int write() {
        try {
            return this.write.get() & 255;
        } catch (Exception unused) {
            this.read.MediaDescriptionCompat = 1;
            return 0;
        }
    }

    private void IconCompatParcelizer() {
        this.read.AudioAttributesCompatParcelizer.AudioAttributesImplBaseParcelizer = MediaBrowserCompatMediaItem();
        this.read.AudioAttributesCompatParcelizer.AudioAttributesImplApi21Parcelizer = MediaBrowserCompatMediaItem();
        this.read.AudioAttributesCompatParcelizer.MediaBrowserCompatItemReceiver = MediaBrowserCompatMediaItem();
        this.read.AudioAttributesCompatParcelizer.write = MediaBrowserCompatMediaItem();
        int iWrite = write();
        boolean z = (iWrite & 128) != 0;
        int iPow = (int) Math.pow(2.0d, (iWrite & 7) + 1);
        this.read.AudioAttributesCompatParcelizer.IconCompatParcelizer = (iWrite & 64) != 0;
        if (z) {
            this.read.AudioAttributesCompatParcelizer.AudioAttributesImplApi26Parcelizer = AudioAttributesCompatParcelizer(iPow);
        } else {
            this.read.AudioAttributesCompatParcelizer.AudioAttributesImplApi26Parcelizer = null;
        }
        this.read.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer = this.write.position();
        MediaBrowserCompatSearchResultReceiver();
        if (AudioAttributesCompatParcelizer()) {
            return;
        }
        this.read.write++;
        this.read.read.add(this.read.AudioAttributesCompatParcelizer);
    }

    private int read() {
        int iWrite = write();
        this.IconCompatParcelizer = iWrite;
        int i = 0;
        if (iWrite > 0) {
            while (true) {
                try {
                    int i2 = this.IconCompatParcelizer;
                    if (i >= i2) {
                        break;
                    }
                    int i3 = i2 - i;
                    this.write.get(this.AudioAttributesCompatParcelizer, i, i3);
                    i += i3;
                } catch (Exception unused) {
                    this.read.MediaDescriptionCompat = 1;
                }
            }
        }
        return i;
    }

    private int[] AudioAttributesCompatParcelizer(int i) {
        byte[] bArr = new byte[i * 3];
        int[] iArr = null;
        try {
            this.write.get(bArr);
            iArr = new int[256];
            int i2 = 0;
            int i3 = 0;
            while (i3 < i) {
                byte b = bArr[i2];
                byte b2 = bArr[i2 + 1];
                int i4 = i2 + 3;
                iArr[i3] = (bArr[i2 + 2] & 255) | ((b & 255) << 16) | (-16777216) | ((b2 & 255) << 8);
                i3++;
                i2 = i4;
            }
            return iArr;
        } catch (BufferUnderflowException unused) {
            RendererWakeupListener.AudioAttributesImplApi26Parcelizer();
            this.read.MediaDescriptionCompat = 1;
            return iArr;
        }
    }

    private void AudioAttributesImplApi21Parcelizer() {
        AudioAttributesImplApi26Parcelizer();
    }

    private void AudioAttributesImplApi26Parcelizer() {
        boolean z = false;
        while (!z && !AudioAttributesCompatParcelizer() && this.read.write <= Integer.MAX_VALUE) {
            int iWrite = write();
            if (iWrite == 33) {
                int iWrite2 = write();
                if (iWrite2 == 1) {
                    RatingCompat();
                } else if (iWrite2 == 249) {
                    this.read.AudioAttributesCompatParcelizer = new lambdaupdateStateAndInformListeners35();
                    AudioAttributesImplBaseParcelizer();
                } else if (iWrite2 == 254) {
                    RatingCompat();
                } else if (iWrite2 == 255) {
                    read();
                    String string = "";
                    for (int i = 0; i < 11; i++) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(string);
                        sb.append((char) this.AudioAttributesCompatParcelizer[i]);
                        string = sb.toString();
                    }
                    if (string.equals("NETSCAPE2.0")) {
                        MediaMetadataCompat();
                    } else {
                        RatingCompat();
                    }
                } else {
                    RatingCompat();
                }
            } else if (iWrite == 44) {
                if (this.read.AudioAttributesCompatParcelizer == null) {
                    this.read.AudioAttributesCompatParcelizer = new lambdaupdateStateAndInformListeners35();
                }
                IconCompatParcelizer();
            } else if (iWrite != 59) {
                this.read.MediaDescriptionCompat = 1;
            } else {
                z = true;
            }
        }
    }

    private void AudioAttributesImplBaseParcelizer() {
        write();
        int iWrite = write();
        this.read.AudioAttributesCompatParcelizer.read = (iWrite & 28) >> 2;
        if (this.read.AudioAttributesCompatParcelizer.read == 0) {
            this.read.AudioAttributesCompatParcelizer.read = 1;
        }
        this.read.AudioAttributesCompatParcelizer.MediaMetadataCompat = (iWrite & 1) != 0;
        int iMediaBrowserCompatMediaItem = MediaBrowserCompatMediaItem();
        if (iMediaBrowserCompatMediaItem < 2) {
            iMediaBrowserCompatMediaItem = 10;
        }
        this.read.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer = iMediaBrowserCompatMediaItem * 10;
        this.read.AudioAttributesCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver = write();
        write();
    }

    private void MediaBrowserCompatItemReceiver() {
        String string = "";
        for (int i = 0; i < 6; i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(string);
            sb.append((char) write());
            string = sb.toString();
        }
        if (!string.startsWith("GIF")) {
            this.read.MediaDescriptionCompat = 1;
            return;
        }
        MediaBrowserCompatCustomActionResultReceiver();
        if (!this.read.AudioAttributesImplApi26Parcelizer || AudioAttributesCompatParcelizer()) {
            return;
        }
        lambdaupdateStateAndInformListeners34 lambdaupdatestateandinformlisteners34 = this.read;
        lambdaupdatestateandinformlisteners34.AudioAttributesImplBaseParcelizer = AudioAttributesCompatParcelizer(lambdaupdatestateandinformlisteners34.AudioAttributesImplApi21Parcelizer);
        lambdaupdateStateAndInformListeners34 lambdaupdatestateandinformlisteners342 = this.read;
        lambdaupdatestateandinformlisteners342.IconCompatParcelizer = lambdaupdatestateandinformlisteners342.AudioAttributesImplBaseParcelizer[this.read.RemoteActionCompatParcelizer];
    }

    private void MediaBrowserCompatCustomActionResultReceiver() {
        this.read.MediaBrowserCompatSearchResultReceiver = MediaBrowserCompatMediaItem();
        this.read.MediaBrowserCompatItemReceiver = MediaBrowserCompatMediaItem();
        int iWrite = write();
        this.read.AudioAttributesImplApi26Parcelizer = (iWrite & 128) != 0;
        this.read.AudioAttributesImplApi21Parcelizer = 2 << (iWrite & 7);
        this.read.RemoteActionCompatParcelizer = write();
        this.read.MediaBrowserCompatMediaItem = write();
    }

    private void MediaMetadataCompat() {
        do {
            read();
            byte[] bArr = this.AudioAttributesCompatParcelizer;
            if (bArr[0] == 1) {
                byte b = bArr[1];
                this.read.MediaBrowserCompatCustomActionResultReceiver = ((bArr[2] & 255) << 8) | (b & 255);
                if (this.read.MediaBrowserCompatCustomActionResultReceiver == 0) {
                    this.read.MediaBrowserCompatCustomActionResultReceiver = -1;
                }
            }
            if (this.IconCompatParcelizer <= 0) {
                return;
            }
        } while (!AudioAttributesCompatParcelizer());
    }

    private int MediaBrowserCompatMediaItem() {
        return this.write.getShort();
    }

    private void MediaDescriptionCompat() {
        this.write = null;
        Arrays.fill(this.AudioAttributesCompatParcelizer, (byte) 0);
        this.read = new lambdaupdateStateAndInformListeners34();
        this.IconCompatParcelizer = 0;
    }

    private void RatingCompat() {
        int iWrite;
        do {
            try {
                iWrite = write();
                ByteBuffer byteBuffer = this.write;
                byteBuffer.position(byteBuffer.position() + iWrite);
            } catch (IllegalArgumentException unused) {
                return;
            }
        } while (iWrite > 0);
    }

    private void MediaBrowserCompatSearchResultReceiver() {
        write();
        RatingCompat();
    }
}
