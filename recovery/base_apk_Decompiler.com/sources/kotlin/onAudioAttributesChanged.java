package kotlin;

import android.util.Log;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class onAudioAttributesChanged {
    private ForwardingPlayerForwardingListener IconCompatParcelizer;
    private ByteBuffer write;
    private final byte[] AudioAttributesCompatParcelizer = new byte[256];
    private int read = 0;

    public final onAudioAttributesChanged AudioAttributesCompatParcelizer(ByteBuffer byteBuffer) {
        MediaMetadataCompat();
        ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        this.write = byteBufferAsReadOnlyBuffer;
        byteBufferAsReadOnlyBuffer.position(0);
        this.write.order(ByteOrder.LITTLE_ENDIAN);
        return this;
    }

    public final void RemoteActionCompatParcelizer() {
        this.write = null;
        this.IconCompatParcelizer = null;
    }

    private void MediaMetadataCompat() {
        this.write = null;
        Arrays.fill(this.AudioAttributesCompatParcelizer, (byte) 0);
        this.IconCompatParcelizer = new ForwardingPlayerForwardingListener();
        this.read = 0;
    }

    public final ForwardingPlayerForwardingListener write() {
        if (this.write == null) {
            throw new IllegalStateException("You must call setData() before parseHeader()");
        }
        if (IconCompatParcelizer()) {
            return this.IconCompatParcelizer;
        }
        MediaBrowserCompatItemReceiver();
        if (!IconCompatParcelizer()) {
            AudioAttributesImplApi21Parcelizer();
            if (this.IconCompatParcelizer.RemoteActionCompatParcelizer < 0) {
                this.IconCompatParcelizer.MediaBrowserCompatMediaItem = 1;
            }
        }
        return this.IconCompatParcelizer;
    }

    private void AudioAttributesImplApi21Parcelizer() {
        MediaBrowserCompatCustomActionResultReceiver();
    }

    private void MediaBrowserCompatCustomActionResultReceiver() {
        boolean z = false;
        while (!z && !IconCompatParcelizer() && this.IconCompatParcelizer.RemoteActionCompatParcelizer <= Integer.MAX_VALUE) {
            int iAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer();
            if (iAudioAttributesCompatParcelizer == 33) {
                int iAudioAttributesCompatParcelizer2 = AudioAttributesCompatParcelizer();
                if (iAudioAttributesCompatParcelizer2 == 1) {
                    MediaDescriptionCompat();
                } else if (iAudioAttributesCompatParcelizer2 == 249) {
                    this.IconCompatParcelizer.AudioAttributesCompatParcelizer = new getWrappedPlayer();
                    AudioAttributesImplBaseParcelizer();
                } else if (iAudioAttributesCompatParcelizer2 == 254) {
                    MediaDescriptionCompat();
                } else if (iAudioAttributesCompatParcelizer2 == 255) {
                    AudioAttributesImplApi26Parcelizer();
                    StringBuilder sb = new StringBuilder();
                    for (int i = 0; i < 11; i++) {
                        sb.append((char) this.AudioAttributesCompatParcelizer[i]);
                    }
                    if (sb.toString().equals("NETSCAPE2.0")) {
                        MediaBrowserCompatSearchResultReceiver();
                    } else {
                        MediaDescriptionCompat();
                    }
                } else {
                    MediaDescriptionCompat();
                }
            } else if (iAudioAttributesCompatParcelizer == 44) {
                if (this.IconCompatParcelizer.AudioAttributesCompatParcelizer == null) {
                    this.IconCompatParcelizer.AudioAttributesCompatParcelizer = new getWrappedPlayer();
                }
                read();
            } else if (iAudioAttributesCompatParcelizer != 59) {
                this.IconCompatParcelizer.MediaBrowserCompatMediaItem = 1;
            } else {
                z = true;
            }
        }
    }

    private void AudioAttributesImplBaseParcelizer() {
        AudioAttributesCompatParcelizer();
        int iAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer();
        this.IconCompatParcelizer.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer = (iAudioAttributesCompatParcelizer & 28) >> 2;
        if (this.IconCompatParcelizer.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer == 0) {
            this.IconCompatParcelizer.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer = 1;
        }
        this.IconCompatParcelizer.AudioAttributesCompatParcelizer.MediaBrowserCompatMediaItem = (iAudioAttributesCompatParcelizer & 1) != 0;
        int iMediaBrowserCompatMediaItem = MediaBrowserCompatMediaItem();
        if (iMediaBrowserCompatMediaItem < 2) {
            iMediaBrowserCompatMediaItem = 10;
        }
        this.IconCompatParcelizer.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer = iMediaBrowserCompatMediaItem * 10;
        this.IconCompatParcelizer.AudioAttributesCompatParcelizer.AudioAttributesImplApi26Parcelizer = AudioAttributesCompatParcelizer();
        AudioAttributesCompatParcelizer();
    }

    private void read() {
        this.IconCompatParcelizer.AudioAttributesCompatParcelizer.AudioAttributesImplApi21Parcelizer = MediaBrowserCompatMediaItem();
        this.IconCompatParcelizer.AudioAttributesCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver = MediaBrowserCompatMediaItem();
        this.IconCompatParcelizer.AudioAttributesCompatParcelizer.AudioAttributesImplBaseParcelizer = MediaBrowserCompatMediaItem();
        this.IconCompatParcelizer.AudioAttributesCompatParcelizer.IconCompatParcelizer = MediaBrowserCompatMediaItem();
        int iAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer();
        boolean z = (iAudioAttributesCompatParcelizer & 128) != 0;
        int iPow = (int) Math.pow(2.0d, (iAudioAttributesCompatParcelizer & 7) + 1);
        this.IconCompatParcelizer.AudioAttributesCompatParcelizer.write = (iAudioAttributesCompatParcelizer & 64) != 0;
        if (z) {
            this.IconCompatParcelizer.AudioAttributesCompatParcelizer.MediaBrowserCompatItemReceiver = IconCompatParcelizer(iPow);
        } else {
            this.IconCompatParcelizer.AudioAttributesCompatParcelizer.MediaBrowserCompatItemReceiver = null;
        }
        this.IconCompatParcelizer.AudioAttributesCompatParcelizer.read = this.write.position();
        MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
        if (IconCompatParcelizer()) {
            return;
        }
        this.IconCompatParcelizer.RemoteActionCompatParcelizer++;
        this.IconCompatParcelizer.write.add(this.IconCompatParcelizer.AudioAttributesCompatParcelizer);
    }

    private void MediaBrowserCompatSearchResultReceiver() {
        do {
            AudioAttributesImplApi26Parcelizer();
            byte[] bArr = this.AudioAttributesCompatParcelizer;
            if (bArr[0] == 1) {
                byte b = bArr[1];
                this.IconCompatParcelizer.AudioAttributesImplBaseParcelizer = ((bArr[2] & 255) << 8) | (b & 255);
            }
            if (this.read <= 0) {
                return;
            }
        } while (!IconCompatParcelizer());
    }

    private void MediaBrowserCompatItemReceiver() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 6; i++) {
            sb.append((char) AudioAttributesCompatParcelizer());
        }
        if (!sb.toString().startsWith("GIF")) {
            this.IconCompatParcelizer.MediaBrowserCompatMediaItem = 1;
            return;
        }
        RatingCompat();
        if (!this.IconCompatParcelizer.AudioAttributesImplApi21Parcelizer || IconCompatParcelizer()) {
            return;
        }
        ForwardingPlayerForwardingListener forwardingPlayerForwardingListener = this.IconCompatParcelizer;
        forwardingPlayerForwardingListener.MediaBrowserCompatCustomActionResultReceiver = IconCompatParcelizer(forwardingPlayerForwardingListener.AudioAttributesImplApi26Parcelizer);
        ForwardingPlayerForwardingListener forwardingPlayerForwardingListener2 = this.IconCompatParcelizer;
        forwardingPlayerForwardingListener2.IconCompatParcelizer = forwardingPlayerForwardingListener2.MediaBrowserCompatCustomActionResultReceiver[this.IconCompatParcelizer.read];
    }

    private void RatingCompat() {
        this.IconCompatParcelizer.MediaBrowserCompatSearchResultReceiver = MediaBrowserCompatMediaItem();
        this.IconCompatParcelizer.MediaBrowserCompatItemReceiver = MediaBrowserCompatMediaItem();
        this.IconCompatParcelizer.AudioAttributesImplApi21Parcelizer = (AudioAttributesCompatParcelizer() & 128) != 0;
        this.IconCompatParcelizer.AudioAttributesImplApi26Parcelizer = (int) Math.pow(2.0d, (r0 & 7) + 1);
        this.IconCompatParcelizer.read = AudioAttributesCompatParcelizer();
        this.IconCompatParcelizer.MediaMetadataCompat = AudioAttributesCompatParcelizer();
    }

    private int[] IconCompatParcelizer(int i) {
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
            this.IconCompatParcelizer.MediaBrowserCompatMediaItem = 1;
            return iArr;
        }
    }

    private void MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
        AudioAttributesCompatParcelizer();
        MediaDescriptionCompat();
    }

    private void MediaDescriptionCompat() {
        int iAudioAttributesCompatParcelizer;
        do {
            iAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer();
            this.write.position(Math.min(this.write.position() + iAudioAttributesCompatParcelizer, this.write.limit()));
        } while (iAudioAttributesCompatParcelizer > 0);
    }

    private void AudioAttributesImplApi26Parcelizer() {
        int iAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer();
        this.read = iAudioAttributesCompatParcelizer;
        if (iAudioAttributesCompatParcelizer <= 0) {
            return;
        }
        int i = 0;
        while (true) {
            try {
                int i2 = this.read;
                if (i >= i2) {
                    return;
                }
                int i3 = i2 - i;
                this.write.get(this.AudioAttributesCompatParcelizer, i, i3);
                i += i3;
            } catch (Exception unused) {
                Log.isLoggable("GifHeaderParser", 3);
                this.IconCompatParcelizer.MediaBrowserCompatMediaItem = 1;
                return;
            }
        }
    }

    private int AudioAttributesCompatParcelizer() {
        try {
            return this.write.get() & 255;
        } catch (Exception unused) {
            this.IconCompatParcelizer.MediaBrowserCompatMediaItem = 1;
            return 0;
        }
    }

    private int MediaBrowserCompatMediaItem() {
        return this.write.getShort();
    }

    private boolean IconCompatParcelizer() {
        return this.IconCompatParcelizer.MediaBrowserCompatMediaItem != 0;
    }
}
