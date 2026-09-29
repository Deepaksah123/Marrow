package kotlin;

import com.google.android.exoplayer2.audio.AacUtil;
import com.google.android.exoplayer2.audio.OpusUtil;

/* JADX INFO: loaded from: classes2.dex */
public final class ByteBufferBackedOutputStream {
    private static final int[] RemoteActionCompatParcelizer = {96000, 88200, 64000, OpusUtil.SAMPLE_RATE, 44100, 32000, 24000, 22050, AacUtil.AAC_HE_V1_MAX_RATE_BYTES_PER_SECOND, 12000, 11025, 8000, 7350};
    private static final int[] IconCompatParcelizer = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    public static final class RemoteActionCompatParcelizer {
        public final int AudioAttributesCompatParcelizer;
        public final int IconCompatParcelizer;
        public final String write;

        /* synthetic */ RemoteActionCompatParcelizer(int i, int i2, String str, byte b) {
            this(i, i2, str);
        }

        private RemoteActionCompatParcelizer(int i, int i2, String str) {
            this.IconCompatParcelizer = i;
            this.AudioAttributesCompatParcelizer = i2;
            this.write = str;
        }
    }

    public static RemoteActionCompatParcelizer read(byte[] bArr) throws SchemaAware {
        return write(new AsExternalTypeSerializer(bArr), false);
    }

    public static RemoteActionCompatParcelizer write(AsExternalTypeSerializer asExternalTypeSerializer, boolean z) throws SchemaAware {
        int iWrite = write(asExternalTypeSerializer);
        int iAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(asExternalTypeSerializer);
        int iIconCompatParcelizer = asExternalTypeSerializer.IconCompatParcelizer(4);
        String strConcat = "mp4a.40.".concat(String.valueOf(iWrite));
        if (iWrite == 5 || iWrite == 29) {
            iAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(asExternalTypeSerializer);
            iWrite = write(asExternalTypeSerializer);
            if (iWrite == 22) {
                iIconCompatParcelizer = asExternalTypeSerializer.IconCompatParcelizer(4);
            }
        }
        if (z) {
            if (iWrite != 1 && iWrite != 2 && iWrite != 3 && iWrite != 4 && iWrite != 6 && iWrite != 7 && iWrite != 17) {
                switch (iWrite) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        break;
                    default:
                        throw SchemaAware.RemoteActionCompatParcelizer("Unsupported audio object type: ".concat(String.valueOf(iWrite)));
                }
            }
            AudioAttributesCompatParcelizer(asExternalTypeSerializer, iWrite, iIconCompatParcelizer);
            switch (iWrite) {
                case 17:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    int iIconCompatParcelizer2 = asExternalTypeSerializer.IconCompatParcelizer(2);
                    if (iIconCompatParcelizer2 == 2 || iIconCompatParcelizer2 == 3) {
                        throw SchemaAware.RemoteActionCompatParcelizer("Unsupported epConfig: ".concat(String.valueOf(iIconCompatParcelizer2)));
                    }
                    break;
            }
        }
        int i = IconCompatParcelizer[iIconCompatParcelizer];
        if (i == -1) {
            throw SchemaAware.RemoteActionCompatParcelizer(null, null);
        }
        return new RemoteActionCompatParcelizer(iAudioAttributesCompatParcelizer, i, strConcat, (byte) 0);
    }

    public static byte[] read(int i, int i2, int i3) {
        return new byte[]{(byte) (((i << 3) & 248) | ((i2 >> 1) & 7)), (byte) (((i2 << 7) & 128) | ((i3 << 3) & 120))};
    }

    private static int write(AsExternalTypeSerializer asExternalTypeSerializer) {
        int iIconCompatParcelizer = asExternalTypeSerializer.IconCompatParcelizer(5);
        return iIconCompatParcelizer == 31 ? asExternalTypeSerializer.IconCompatParcelizer(6) + 32 : iIconCompatParcelizer;
    }

    private static int AudioAttributesCompatParcelizer(AsExternalTypeSerializer asExternalTypeSerializer) throws SchemaAware {
        int iIconCompatParcelizer = asExternalTypeSerializer.IconCompatParcelizer(4);
        if (iIconCompatParcelizer == 15) {
            if (asExternalTypeSerializer.IconCompatParcelizer() < 24) {
                throw SchemaAware.RemoteActionCompatParcelizer("AAC header insufficient data", null);
            }
            return asExternalTypeSerializer.IconCompatParcelizer(24);
        }
        if (iIconCompatParcelizer < 13) {
            return RemoteActionCompatParcelizer[iIconCompatParcelizer];
        }
        throw SchemaAware.RemoteActionCompatParcelizer("AAC header wrong Sampling Frequency Index", null);
    }

    private static void AudioAttributesCompatParcelizer(AsExternalTypeSerializer asExternalTypeSerializer, int i, int i2) {
        if (asExternalTypeSerializer.read()) {
            prune.RemoteActionCompatParcelizer("AacUtil", "Unexpected frameLengthFlag = 1");
        }
        if (asExternalTypeSerializer.read()) {
            asExternalTypeSerializer.write(14);
        }
        boolean z = asExternalTypeSerializer.read();
        if (i2 == 0) {
            throw new UnsupportedOperationException();
        }
        if (i == 6 || i == 20) {
            asExternalTypeSerializer.write(3);
        }
        if (z) {
            if (i == 22) {
                asExternalTypeSerializer.write(16);
            }
            if (i == 17 || i == 19 || i == 20 || i == 23) {
                asExternalTypeSerializer.write(3);
            }
            asExternalTypeSerializer.write(1);
        }
    }
}
