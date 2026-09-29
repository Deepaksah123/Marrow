package kotlin;

import android.os.SystemClock;
import com.google.android.exoplayer2.C;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import kotlin.constructCollectionType;

/* JADX INFO: loaded from: classes2.dex */
public final class resolveMemberType {
    private static long AudioAttributesCompatParcelizer = 0;
    private static boolean IconCompatParcelizer = false;
    private static final Object RemoteActionCompatParcelizer = new Object();
    private static final Object read = new Object();
    private static String write = "time.android.com";

    public interface RemoteActionCompatParcelizer {
        void AudioAttributesCompatParcelizer();

        void read(IOException iOException);
    }

    static /* synthetic */ boolean RemoteActionCompatParcelizer() {
        IconCompatParcelizer = true;
        return true;
    }

    private static String AudioAttributesImplBaseParcelizer() {
        String str;
        synchronized (read) {
            str = write;
        }
        return str;
    }

    public static boolean AudioAttributesImplApi21Parcelizer() {
        boolean z;
        synchronized (read) {
            z = IconCompatParcelizer;
        }
        return z;
    }

    public static long AudioAttributesImplApi26Parcelizer() {
        long j;
        synchronized (read) {
            j = IconCompatParcelizer ? AudioAttributesCompatParcelizer : C.TIME_UNSET;
        }
        return j;
    }

    public static void read(constructCollectionType constructcollectiontype, RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        if (AudioAttributesImplApi21Parcelizer()) {
            remoteActionCompatParcelizer.AudioAttributesCompatParcelizer();
            return;
        }
        if (constructcollectiontype == null) {
            constructcollectiontype = new constructCollectionType("SntpClient");
        }
        constructcollectiontype.read(new AudioAttributesCompatParcelizer((byte) 0), new write(remoteActionCompatParcelizer), 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long MediaBrowserCompatCustomActionResultReceiver() throws IOException {
        InetAddress byName = InetAddress.getByName(AudioAttributesImplBaseParcelizer());
        DatagramSocket datagramSocket = new DatagramSocket();
        try {
            datagramSocket.setSoTimeout(10000);
            byte[] bArr = new byte[48];
            DatagramPacket datagramPacket = new DatagramPacket(bArr, 48, byName, 123);
            bArr[0] = 27;
            long jCurrentTimeMillis = System.currentTimeMillis();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            IconCompatParcelizer(bArr, jCurrentTimeMillis);
            datagramSocket.send(datagramPacket);
            datagramSocket.receive(new DatagramPacket(bArr, 48));
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            long j = jCurrentTimeMillis + (jElapsedRealtime2 - jElapsedRealtime);
            byte b = bArr[0];
            byte b2 = bArr[1];
            long jWrite = write(bArr, 24);
            long jWrite2 = write(bArr, 32);
            long jWrite3 = write(bArr, 40);
            IconCompatParcelizer((byte) ((b >> 6) & 3), (byte) (b & 7), b2 & 255, jWrite3);
            long j2 = ((jWrite2 - jWrite) + (jWrite3 - j)) / 2;
            datagramSocket.close();
            return (j + j2) - jElapsedRealtime2;
        } catch (Throwable th) {
            try {
                datagramSocket.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private static long write(byte[] bArr, int i) {
        long j = read(bArr, i);
        long j2 = read(bArr, i + 4);
        if (j == 0 && j2 == 0) {
            return 0L;
        }
        long j3 = 0;
        return ((j - 2208988800L) * 1000) + ((j2 * 1000) / ((((long) 1) << 32) | (j3 - ((j3 >> 63) << 32))));
    }

    private static void IconCompatParcelizer(byte[] bArr, long j) {
        if (j == 0) {
            Arrays.fill(bArr, 40, 48, (byte) 0);
            return;
        }
        long j2 = j / 1000;
        bArr[40] = (byte) (r6 >> 24);
        bArr[41] = (byte) (r6 >> 16);
        bArr[42] = (byte) (r6 >> 8);
        bArr[43] = (byte) (2208988800L + j2);
        long j3 = ((j - (j2 * 1000)) << 32) / 1000;
        bArr[44] = (byte) (j3 >> 24);
        bArr[45] = (byte) (j3 >> 16);
        bArr[46] = (byte) (j3 >> 8);
        bArr[47] = (byte) (Math.random() * 255.0d);
    }

    private static long read(byte[] bArr, int i) {
        int i2 = bArr[i];
        int i3 = bArr[i + 1];
        int i4 = bArr[i + 2];
        int i5 = bArr[i + 3];
        if ((i2 & 128) == 128) {
            i2 = (i2 & 127) + 128;
        }
        if ((i3 & 128) == 128) {
            i3 = (i3 & 127) + 128;
        }
        if ((i4 & 128) == 128) {
            i4 = (i4 & 127) + 128;
        }
        if ((i5 & 128) == 128) {
            i5 = (i5 & 127) + 128;
        }
        return (((long) i2) << 24) + (((long) i3) << 16) + (((long) i4) << 8) + ((long) i5);
    }

    private static void IconCompatParcelizer(byte b, byte b2, int i, long j) throws IOException {
        if (b == 3) {
            throw new IOException("SNTP: Unsynchronized server");
        }
        if (b2 != 4 && b2 != 5) {
            throw new IOException("SNTP: Untrusted mode: ".concat(String.valueOf((int) b2)));
        }
        if (i == 0 || i > 15) {
            throw new IOException("SNTP: Untrusted stratum: ".concat(String.valueOf(i)));
        }
        if (j == 0) {
            throw new IOException("SNTP: Zero transmitTime");
        }
    }

    static final class AudioAttributesCompatParcelizer implements constructCollectionType.AudioAttributesCompatParcelizer {
        @Override // o.constructCollectionType.AudioAttributesCompatParcelizer
        public final void B_() {
        }

        private AudioAttributesCompatParcelizer() {
        }

        /* synthetic */ AudioAttributesCompatParcelizer(byte b) {
            this();
        }

        @Override // o.constructCollectionType.AudioAttributesCompatParcelizer
        public final void AudioAttributesCompatParcelizer() throws IOException {
            synchronized (resolveMemberType.RemoteActionCompatParcelizer) {
                synchronized (resolveMemberType.read) {
                    if (resolveMemberType.IconCompatParcelizer) {
                        return;
                    }
                    long jMediaBrowserCompatCustomActionResultReceiver = resolveMemberType.MediaBrowserCompatCustomActionResultReceiver();
                    synchronized (resolveMemberType.read) {
                        long unused = resolveMemberType.AudioAttributesCompatParcelizer = jMediaBrowserCompatCustomActionResultReceiver;
                        resolveMemberType.RemoteActionCompatParcelizer();
                    }
                }
            }
        }
    }

    static final class write implements constructCollectionType.RemoteActionCompatParcelizer<constructCollectionType.AudioAttributesCompatParcelizer> {
        private final RemoteActionCompatParcelizer AudioAttributesCompatParcelizer;

        @Override // o.constructCollectionType.RemoteActionCompatParcelizer
        public final void read(constructCollectionType.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer, long j, long j2, boolean z) {
        }

        public write(RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
            this.AudioAttributesCompatParcelizer = remoteActionCompatParcelizer;
        }

        @Override // o.constructCollectionType.RemoteActionCompatParcelizer
        public final void RemoteActionCompatParcelizer(constructCollectionType.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer, long j, long j2) {
            if (this.AudioAttributesCompatParcelizer != null) {
                if (!resolveMemberType.AudioAttributesImplApi21Parcelizer()) {
                    this.AudioAttributesCompatParcelizer.read(new IOException(new ConcurrentModificationException()));
                } else {
                    this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer();
                }
            }
        }

        @Override // o.constructCollectionType.RemoteActionCompatParcelizer
        public final constructCollectionType.write AudioAttributesCompatParcelizer(constructCollectionType.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer, long j, long j2, IOException iOException, int i) {
            RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.AudioAttributesCompatParcelizer;
            if (remoteActionCompatParcelizer != null) {
                remoteActionCompatParcelizer.read(iOException);
            }
            return constructCollectionType.RemoteActionCompatParcelizer;
        }
    }
}
