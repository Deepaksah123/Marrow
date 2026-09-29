package kotlin;

import com.google.android.exoplayer2.audio.AacUtil;
import com.google.android.exoplayer2.audio.MpegAudioUtil;
import com.google.android.exoplayer2.audio.OpusUtil;

/* JADX INFO: loaded from: classes2.dex */
final class linkLast {

    public static class RemoteActionCompatParcelizer {
        public long IconCompatParcelizer;
        public int RemoteActionCompatParcelizer;
        public int write;
    }

    public static boolean IconCompatParcelizer(int i) {
        return (i & 16777215) == 12583333;
    }

    public static boolean read(AsExternalTypeSerializer asExternalTypeSerializer, RemoteActionCompatParcelizer remoteActionCompatParcelizer) throws SchemaAware {
        asExternalTypeSerializer.RemoteActionCompatParcelizer();
        remoteActionCompatParcelizer.write = AudioAttributesCompatParcelizer(asExternalTypeSerializer, 3, 8, 8);
        if (remoteActionCompatParcelizer.write == -1) {
            return false;
        }
        remoteActionCompatParcelizer.IconCompatParcelizer = read(asExternalTypeSerializer);
        if (remoteActionCompatParcelizer.IconCompatParcelizer == -1) {
            return false;
        }
        if (remoteActionCompatParcelizer.IconCompatParcelizer > 16) {
            StringBuilder sb = new StringBuilder("Contains sub-stream with an invalid packet label ");
            sb.append(remoteActionCompatParcelizer.IconCompatParcelizer);
            throw SchemaAware.RemoteActionCompatParcelizer(sb.toString());
        }
        if (remoteActionCompatParcelizer.IconCompatParcelizer == 0) {
            int i = remoteActionCompatParcelizer.write;
            if (i == 1) {
                throw SchemaAware.RemoteActionCompatParcelizer("Mpegh3daConfig packet with invalid packet label 0", null);
            }
            if (i == 2) {
                throw SchemaAware.RemoteActionCompatParcelizer("Mpegh3daFrame packet with invalid packet label 0", null);
            }
            if (i == 17) {
                throw SchemaAware.RemoteActionCompatParcelizer("AudioTruncation packet with invalid packet label 0", null);
            }
        }
        remoteActionCompatParcelizer.RemoteActionCompatParcelizer = AudioAttributesCompatParcelizer(asExternalTypeSerializer, 11, 24, 24);
        return remoteActionCompatParcelizer.RemoteActionCompatParcelizer != -1;
    }

    private static int RemoteActionCompatParcelizer(int i) throws SchemaAware {
        if (i == 0) {
            return 768;
        }
        if (i == 1) {
            return 1024;
        }
        if (i == 2 || i == 3) {
            return 2048;
        }
        if (i == 4) {
            return 4096;
        }
        throw SchemaAware.RemoteActionCompatParcelizer("Unsupported coreSbrFrameLengthIndex ".concat(String.valueOf(i)));
    }

    private static int AudioAttributesCompatParcelizer(int i) throws SchemaAware {
        if (i == 0 || i == 1) {
            return 0;
        }
        int i2 = 2;
        if (i != 2) {
            i2 = 3;
            if (i != 3) {
                if (i == 4) {
                    return 1;
                }
                throw SchemaAware.RemoteActionCompatParcelizer("Unsupported coreSbrFrameLengthIndex ".concat(String.valueOf(i)));
            }
        }
        return i2;
    }

    private static double read(int i) throws SchemaAware {
        switch (i) {
            case 14700:
            case AacUtil.AAC_HE_V1_MAX_RATE_BYTES_PER_SECOND /* 16000 */:
                return 3.0d;
            case 22050:
            case 24000:
                return 2.0d;
            case 29400:
            case 32000:
            case 58800:
            case 64000:
                return 1.5d;
            case 44100:
            case OpusUtil.SAMPLE_RATE /* 48000 */:
            case 88200:
            case 96000:
                return 1.0d;
            default:
                throw SchemaAware.RemoteActionCompatParcelizer("Unsupported sampling rate ".concat(String.valueOf(i)));
        }
    }

    public static read write(AsExternalTypeSerializer asExternalTypeSerializer) throws SchemaAware {
        int iWrite;
        int iIconCompatParcelizer = asExternalTypeSerializer.IconCompatParcelizer(8);
        int iIconCompatParcelizer2 = asExternalTypeSerializer.IconCompatParcelizer(5);
        if (iIconCompatParcelizer2 == 31) {
            iWrite = asExternalTypeSerializer.IconCompatParcelizer(24);
        } else {
            iWrite = write(iIconCompatParcelizer2);
        }
        int iIconCompatParcelizer3 = asExternalTypeSerializer.IconCompatParcelizer(3);
        int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(iIconCompatParcelizer3);
        int iAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(iIconCompatParcelizer3);
        asExternalTypeSerializer.write(2);
        AudioAttributesImplBaseParcelizer(asExternalTypeSerializer);
        AudioAttributesCompatParcelizer(asExternalTypeSerializer, RemoteActionCompatParcelizer(asExternalTypeSerializer), iAudioAttributesCompatParcelizer);
        byte[] bArr = null;
        if (asExternalTypeSerializer.read()) {
            int iAudioAttributesCompatParcelizer2 = AudioAttributesCompatParcelizer(asExternalTypeSerializer, 2, 4, 8);
            for (int i = 0; i < iAudioAttributesCompatParcelizer2 + 1; i++) {
                int iAudioAttributesCompatParcelizer3 = AudioAttributesCompatParcelizer(asExternalTypeSerializer, 4, 8, 16);
                int iAudioAttributesCompatParcelizer4 = AudioAttributesCompatParcelizer(asExternalTypeSerializer, 4, 8, 16);
                if (iAudioAttributesCompatParcelizer3 == 7) {
                    int iIconCompatParcelizer4 = asExternalTypeSerializer.IconCompatParcelizer(4) + 1;
                    asExternalTypeSerializer.write(4);
                    byte[] bArr2 = new byte[iIconCompatParcelizer4];
                    for (int i2 = 0; i2 < iIconCompatParcelizer4; i2++) {
                        bArr2[i2] = (byte) asExternalTypeSerializer.IconCompatParcelizer(8);
                    }
                    bArr = bArr2;
                } else {
                    asExternalTypeSerializer.write(iAudioAttributesCompatParcelizer4 << 3);
                }
            }
        }
        double d = read(iWrite);
        return new read(iIconCompatParcelizer, (int) (((double) iWrite) * d), (int) (((double) iRemoteActionCompatParcelizer) * d), bArr, (byte) 0);
    }

    private static int write(int i) throws SchemaAware {
        switch (i) {
            case 0:
                return 96000;
            case 1:
                return 88200;
            case 2:
                return 64000;
            case 3:
                return OpusUtil.SAMPLE_RATE;
            case 4:
                return 44100;
            case 5:
                return 32000;
            case 6:
                return 24000;
            case 7:
                return 22050;
            case 8:
                return AacUtil.AAC_HE_V1_MAX_RATE_BYTES_PER_SECOND;
            case 9:
                return 12000;
            case 10:
                return 11025;
            case 11:
                return 8000;
            case 12:
                return 7350;
            case 13:
            case 14:
            default:
                throw SchemaAware.RemoteActionCompatParcelizer("Unsupported sampling rate index ".concat(String.valueOf(i)));
            case 15:
                return 57600;
            case 16:
                return 51200;
            case 17:
                return MpegAudioUtil.MAX_RATE_BYTES_PER_SECOND;
            case 18:
                return 38400;
            case 19:
                return 34150;
            case 20:
                return 28800;
            case 21:
                return 25600;
            case 22:
                return 20000;
            case 23:
                return 19200;
            case 24:
                return 17075;
            case 25:
                return 14400;
            case 26:
                return 12800;
            case 27:
                return 9600;
        }
    }

    public static int AudioAttributesCompatParcelizer(AsExternalTypeSerializer asExternalTypeSerializer) {
        if (!asExternalTypeSerializer.read()) {
            return 0;
        }
        asExternalTypeSerializer.write(2);
        return asExternalTypeSerializer.IconCompatParcelizer(13);
    }

    private static void AudioAttributesImplBaseParcelizer(AsExternalTypeSerializer asExternalTypeSerializer) {
        int iIconCompatParcelizer = asExternalTypeSerializer.IconCompatParcelizer(2);
        if (iIconCompatParcelizer == 0) {
            asExternalTypeSerializer.write(6);
            return;
        }
        int iAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(asExternalTypeSerializer, 5, 8, 16) + 1;
        if (iIconCompatParcelizer == 1) {
            asExternalTypeSerializer.write(iAudioAttributesCompatParcelizer * 7);
        } else if (iIconCompatParcelizer == 2) {
            read(asExternalTypeSerializer, iAudioAttributesCompatParcelizer);
        }
    }

    private static void read(AsExternalTypeSerializer asExternalTypeSerializer, int i) {
        int iIconCompatParcelizer;
        boolean z = asExternalTypeSerializer.read();
        int i2 = z ? 1 : 5;
        int i3 = z ? 7 : 5;
        int i4 = z ? 8 : 6;
        int i5 = 0;
        while (i5 < i) {
            if (asExternalTypeSerializer.read()) {
                asExternalTypeSerializer.write(7);
                iIconCompatParcelizer = 0;
            } else {
                if (asExternalTypeSerializer.IconCompatParcelizer(2) == 3 && asExternalTypeSerializer.IconCompatParcelizer(i3) * i2 != 0) {
                    asExternalTypeSerializer.AudioAttributesImplApi21Parcelizer();
                }
                iIconCompatParcelizer = asExternalTypeSerializer.IconCompatParcelizer(i4) * i2;
                if (iIconCompatParcelizer != 0 && iIconCompatParcelizer != 180) {
                    asExternalTypeSerializer.AudioAttributesImplApi21Parcelizer();
                }
                asExternalTypeSerializer.AudioAttributesImplApi21Parcelizer();
            }
            if (iIconCompatParcelizer != 0 && iIconCompatParcelizer != 180 && asExternalTypeSerializer.read()) {
                i5++;
            }
            i5++;
        }
    }

    private static int RemoteActionCompatParcelizer(AsExternalTypeSerializer asExternalTypeSerializer) {
        int iIconCompatParcelizer = asExternalTypeSerializer.IconCompatParcelizer(5);
        int iAudioAttributesCompatParcelizer = 0;
        for (int i = 0; i < iIconCompatParcelizer + 1; i++) {
            int iIconCompatParcelizer2 = asExternalTypeSerializer.IconCompatParcelizer(3);
            iAudioAttributesCompatParcelizer += AudioAttributesCompatParcelizer(asExternalTypeSerializer, 5, 8, 16) + 1;
            if ((iIconCompatParcelizer2 == 0 || iIconCompatParcelizer2 == 2) && asExternalTypeSerializer.read()) {
                AudioAttributesImplBaseParcelizer(asExternalTypeSerializer);
            }
        }
        return iAudioAttributesCompatParcelizer;
    }

    private static void AudioAttributesCompatParcelizer(AsExternalTypeSerializer asExternalTypeSerializer, int i, int i2) {
        int iIconCompatParcelizer;
        int iAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(asExternalTypeSerializer, 4, 8, 16);
        asExternalTypeSerializer.AudioAttributesImplApi21Parcelizer();
        for (int i3 = 0; i3 < iAudioAttributesCompatParcelizer + 1; i3++) {
            int iIconCompatParcelizer2 = asExternalTypeSerializer.IconCompatParcelizer(2);
            if (iIconCompatParcelizer2 == 0) {
                IconCompatParcelizer(asExternalTypeSerializer);
                if (i2 > 0) {
                    MediaBrowserCompatItemReceiver(asExternalTypeSerializer);
                }
            } else if (iIconCompatParcelizer2 == 1) {
                if (IconCompatParcelizer(asExternalTypeSerializer)) {
                    asExternalTypeSerializer.AudioAttributesImplApi21Parcelizer();
                }
                if (i2 > 0) {
                    MediaBrowserCompatItemReceiver(asExternalTypeSerializer);
                    iIconCompatParcelizer = asExternalTypeSerializer.IconCompatParcelizer(2);
                } else {
                    iIconCompatParcelizer = 0;
                }
                if (iIconCompatParcelizer > 0) {
                    asExternalTypeSerializer.write(6);
                    int iIconCompatParcelizer3 = asExternalTypeSerializer.IconCompatParcelizer(2);
                    asExternalTypeSerializer.write(4);
                    if (asExternalTypeSerializer.read()) {
                        asExternalTypeSerializer.write(5);
                    }
                    if (iIconCompatParcelizer == 2 || iIconCompatParcelizer == 3) {
                        asExternalTypeSerializer.write(6);
                    }
                    if (iIconCompatParcelizer3 == 2) {
                        asExternalTypeSerializer.AudioAttributesImplApi21Parcelizer();
                    }
                }
                int iFloor = ((int) Math.floor(Math.log(i - 1) / Math.log(2.0d))) + 1;
                int iIconCompatParcelizer4 = asExternalTypeSerializer.IconCompatParcelizer(2);
                if (iIconCompatParcelizer4 > 0 && asExternalTypeSerializer.read()) {
                    asExternalTypeSerializer.write(iFloor);
                }
                if (asExternalTypeSerializer.read()) {
                    asExternalTypeSerializer.write(iFloor);
                }
                if (i2 == 0 && iIconCompatParcelizer4 == 0) {
                    asExternalTypeSerializer.AudioAttributesImplApi21Parcelizer();
                }
            } else if (iIconCompatParcelizer2 == 3) {
                AudioAttributesCompatParcelizer(asExternalTypeSerializer, 4, 8, 16);
                int iAudioAttributesCompatParcelizer2 = AudioAttributesCompatParcelizer(asExternalTypeSerializer, 4, 8, 16);
                if (asExternalTypeSerializer.read()) {
                    AudioAttributesCompatParcelizer(asExternalTypeSerializer, 8, 16, 0);
                }
                asExternalTypeSerializer.AudioAttributesImplApi21Parcelizer();
                if (iAudioAttributesCompatParcelizer2 > 0) {
                    asExternalTypeSerializer.write(iAudioAttributesCompatParcelizer2 << 3);
                }
            }
        }
    }

    private static boolean IconCompatParcelizer(AsExternalTypeSerializer asExternalTypeSerializer) {
        asExternalTypeSerializer.write(3);
        boolean z = asExternalTypeSerializer.read();
        if (z) {
            asExternalTypeSerializer.write(13);
        }
        return z;
    }

    private static void MediaBrowserCompatItemReceiver(AsExternalTypeSerializer asExternalTypeSerializer) {
        asExternalTypeSerializer.write(3);
        asExternalTypeSerializer.write(8);
        boolean z = asExternalTypeSerializer.read();
        boolean z2 = asExternalTypeSerializer.read();
        if (z) {
            asExternalTypeSerializer.write(5);
        }
        if (z2) {
            asExternalTypeSerializer.write(6);
        }
    }

    private static int AudioAttributesCompatParcelizer(AsExternalTypeSerializer asExternalTypeSerializer, int i, int i2, int i3) {
        buildTypeSerializer.IconCompatParcelizer(Math.max(Math.max(i, i2), i3) <= 31);
        int i4 = (1 << i) - 1;
        int i5 = (1 << i2) - 1;
        parseCoverArt.IconCompatParcelizer(parseCoverArt.IconCompatParcelizer(i4, i5), 1 << i3);
        if (asExternalTypeSerializer.IconCompatParcelizer() < i) {
            return -1;
        }
        int iIconCompatParcelizer = asExternalTypeSerializer.IconCompatParcelizer(i);
        if (iIconCompatParcelizer != i4) {
            return iIconCompatParcelizer;
        }
        if (asExternalTypeSerializer.IconCompatParcelizer() < i2) {
            return -1;
        }
        int iIconCompatParcelizer2 = asExternalTypeSerializer.IconCompatParcelizer(i2);
        int i6 = iIconCompatParcelizer + iIconCompatParcelizer2;
        if (iIconCompatParcelizer2 != i5) {
            return i6;
        }
        if (asExternalTypeSerializer.IconCompatParcelizer() < i3) {
            return -1;
        }
        return i6 + asExternalTypeSerializer.IconCompatParcelizer(i3);
    }

    private static long read(AsExternalTypeSerializer asExternalTypeSerializer) {
        buildTypeSerializer.IconCompatParcelizer(Math.max(Math.max(2, 8), 32) <= 63);
        long j = 0;
        parseIlstElement.AudioAttributesCompatParcelizer(parseIlstElement.AudioAttributesCompatParcelizer(3L, 255L), (j - ((j >> 63) << 32)) | (((long) 1) << 32));
        if (asExternalTypeSerializer.IconCompatParcelizer() < 2) {
            return -1L;
        }
        long jAudioAttributesCompatParcelizer = asExternalTypeSerializer.AudioAttributesCompatParcelizer(2);
        if (jAudioAttributesCompatParcelizer != 3) {
            return jAudioAttributesCompatParcelizer;
        }
        if (asExternalTypeSerializer.IconCompatParcelizer() < 8) {
            return -1L;
        }
        long jAudioAttributesCompatParcelizer2 = asExternalTypeSerializer.AudioAttributesCompatParcelizer(8);
        long j2 = jAudioAttributesCompatParcelizer + jAudioAttributesCompatParcelizer2;
        if (jAudioAttributesCompatParcelizer2 != 255) {
            return j2;
        }
        if (asExternalTypeSerializer.IconCompatParcelizer() < 32) {
            return -1L;
        }
        return j2 + asExternalTypeSerializer.AudioAttributesCompatParcelizer(32);
    }

    public static class read {
        public final byte[] AudioAttributesCompatParcelizer;
        public final int RemoteActionCompatParcelizer;
        public final int read;
        public final int write;

        /* synthetic */ read(int i, int i2, int i3, byte[] bArr, byte b) {
            this(i, i2, i3, bArr);
        }

        private read(int i, int i2, int i3, byte[] bArr) {
            this.read = i;
            this.write = i2;
            this.RemoteActionCompatParcelizer = i3;
            this.AudioAttributesCompatParcelizer = bArr;
        }
    }
}
