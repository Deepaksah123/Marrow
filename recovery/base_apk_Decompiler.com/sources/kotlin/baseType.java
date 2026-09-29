package kotlin;

import android.net.Uri;
import com.google.android.exoplayer2.PlaybackException;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;

/* JADX INFO: loaded from: classes2.dex */
public final class baseType extends _collectAndResolveByTypeId {
    private final DatagramPacket AudioAttributesCompatParcelizer;
    private DatagramSocket AudioAttributesImplApi21Parcelizer;
    private Uri AudioAttributesImplApi26Parcelizer;
    private final int AudioAttributesImplBaseParcelizer;
    private boolean IconCompatParcelizer;
    private int MediaBrowserCompatItemReceiver;
    private final byte[] RemoteActionCompatParcelizer;
    private InetAddress read;
    private MulticastSocket write;

    public static final class AudioAttributesCompatParcelizer extends idResolver {
        public AudioAttributesCompatParcelizer(Throwable th, int i) {
            super(th, i);
        }
    }

    public baseType() {
        this((byte) 0);
    }

    private baseType(byte b) {
        this(2000);
    }

    private baseType(int i) {
        super(true);
        this.AudioAttributesImplBaseParcelizer = 8000;
        byte[] bArr = new byte[2000];
        this.RemoteActionCompatParcelizer = bArr;
        this.AudioAttributesCompatParcelizer = new DatagramPacket(bArr, 0, 2000);
    }

    @Override // kotlin._hasTypeResolver
    public final long RemoteActionCompatParcelizer(SubTypeValidator subTypeValidator) throws AudioAttributesCompatParcelizer {
        Uri uri = subTypeValidator.AudioAttributesImplBaseParcelizer;
        this.AudioAttributesImplApi26Parcelizer = uri;
        String str = (String) buildTypeSerializer.IconCompatParcelizer(uri.getHost());
        int port = this.AudioAttributesImplApi26Parcelizer.getPort();
        write();
        try {
            this.read = InetAddress.getByName(str);
            InetSocketAddress inetSocketAddress = new InetSocketAddress(this.read, port);
            if (this.read.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(inetSocketAddress);
                this.write = multicastSocket;
                multicastSocket.joinGroup(this.read);
                this.AudioAttributesImplApi21Parcelizer = this.write;
            } else {
                this.AudioAttributesImplApi21Parcelizer = new DatagramSocket(inetSocketAddress);
            }
            this.AudioAttributesImplApi21Parcelizer.setSoTimeout(this.AudioAttributesImplBaseParcelizer);
            this.IconCompatParcelizer = true;
            IconCompatParcelizer(subTypeValidator);
            return -1L;
        } catch (IOException e) {
            throw new AudioAttributesCompatParcelizer(e, PlaybackException.ERROR_CODE_IO_NETWORK_CONNECTION_FAILED);
        } catch (SecurityException e2) {
            throw new AudioAttributesCompatParcelizer(e2, PlaybackException.ERROR_CODE_IO_NO_PERMISSION);
        }
    }

    @Override // kotlin.JsonNullFormatVisitor
    public final int AudioAttributesCompatParcelizer(byte[] bArr, int i, int i2) throws AudioAttributesCompatParcelizer {
        if (i2 == 0) {
            return 0;
        }
        if (this.MediaBrowserCompatItemReceiver == 0) {
            try {
                ((DatagramSocket) buildTypeSerializer.IconCompatParcelizer(this.AudioAttributesImplApi21Parcelizer)).receive(this.AudioAttributesCompatParcelizer);
                int length = this.AudioAttributesCompatParcelizer.getLength();
                this.MediaBrowserCompatItemReceiver = length;
                AudioAttributesCompatParcelizer(length);
            } catch (SocketTimeoutException e) {
                throw new AudioAttributesCompatParcelizer(e, PlaybackException.ERROR_CODE_IO_NETWORK_CONNECTION_TIMEOUT);
            } catch (IOException e2) {
                throw new AudioAttributesCompatParcelizer(e2, PlaybackException.ERROR_CODE_IO_NETWORK_CONNECTION_FAILED);
            }
        }
        int length2 = this.AudioAttributesCompatParcelizer.getLength();
        int i3 = this.MediaBrowserCompatItemReceiver;
        int iMin = Math.min(i3, i2);
        System.arraycopy(this.RemoteActionCompatParcelizer, length2 - i3, bArr, i, iMin);
        this.MediaBrowserCompatItemReceiver -= iMin;
        return iMin;
    }

    @Override // kotlin._hasTypeResolver
    public final Uri IconCompatParcelizer() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    @Override // kotlin._hasTypeResolver
    public final void AudioAttributesCompatParcelizer() {
        this.AudioAttributesImplApi26Parcelizer = null;
        MulticastSocket multicastSocket = this.write;
        if (multicastSocket != null) {
            try {
                multicastSocket.leaveGroup((InetAddress) buildTypeSerializer.IconCompatParcelizer(this.read));
            } catch (IOException unused) {
            }
            this.write = null;
        }
        DatagramSocket datagramSocket = this.AudioAttributesImplApi21Parcelizer;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.AudioAttributesImplApi21Parcelizer = null;
        }
        this.read = null;
        this.MediaBrowserCompatItemReceiver = 0;
        if (this.IconCompatParcelizer) {
            this.IconCompatParcelizer = false;
            RemoteActionCompatParcelizer();
        }
    }
}
