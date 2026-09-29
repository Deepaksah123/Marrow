package kotlin;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes2.dex */
public abstract class experimentalSetOffloadSchedulingEnabled<T> {
    private int AudioAttributesCompatParcelizer;
    private InputStream RemoteActionCompatParcelizer;
    protected final copyWithMediaPeriodId write;

    public experimentalSetOffloadSchedulingEnabled(copyWithMediaPeriodId copywithmediaperiodid, InputStream inputStream) {
        this.write = copywithmediaperiodid;
        this.RemoteActionCompatParcelizer = inputStream;
    }

    protected final int IconCompatParcelizer() throws ExoPlaybackExceptionType {
        try {
            int i = this.RemoteActionCompatParcelizer.read();
            if (i != -1) {
                return i;
            }
            throw new IOException("Unexpected end of stream");
        } catch (IOException e) {
            throw new ExoPlaybackExceptionType(e);
        }
    }

    protected final byte[] AudioAttributesCompatParcelizer(int i) throws ExoPlaybackExceptionType {
        try {
            byte[] bArr = new byte[i];
            int i2 = this.RemoteActionCompatParcelizer.read(bArr);
            if (i2 != i) {
                if (i2 == -1) {
                    throw new IOException("Unexpected end of stream");
                }
                int i3 = i - i2;
                while (i3 > 0) {
                    int i4 = this.RemoteActionCompatParcelizer.read(bArr, i - i3, i3);
                    if (i4 == -1) {
                        throw new IOException("Unexpected end of stream");
                    }
                    i3 -= i4;
                }
            }
            return bArr;
        } catch (IOException e) {
            throw new ExoPlaybackExceptionType(e);
        }
    }

    final byte[] write(long j) throws ExoPlaybackExceptionType {
        if (j > 2147483647L) {
            throw new ExoPlaybackExceptionType("Decoding fixed size items is limited to INTMAX");
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(AudioAttributesCompatParcelizer(j));
        int i = (int) (j <= 4096 ? j : 4096L);
        int i2 = (int) j;
        byte[] bArr = new byte[i];
        while (i2 > 0) {
            try {
                int i3 = this.RemoteActionCompatParcelizer.read(bArr, 0, i2 > i ? i : i2);
                if (i3 == -1) {
                    throw new IOException("Unexpected end of stream");
                }
                byteArrayOutputStream.write(bArr, 0, i3);
                i2 -= i3;
            } catch (IOException e) {
                throw new ExoPlaybackExceptionType(e);
            }
        }
        return byteArrayOutputStream.toByteArray();
    }

    /* JADX INFO: renamed from: o.experimentalSetOffloadSchedulingEnabled$3, reason: invalid class name */
    static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] AudioAttributesCompatParcelizer;

        static {
            int[] iArr = new int[lambdanew0.values().length];
            AudioAttributesCompatParcelizer = iArr;
            try {
                iArr[lambdanew0.DIRECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                AudioAttributesCompatParcelizer[lambdanew0.ONE_BYTE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AudioAttributesCompatParcelizer[lambdanew0.TWO_BYTES.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AudioAttributesCompatParcelizer[lambdanew0.FOUR_BYTES.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                AudioAttributesCompatParcelizer[lambdanew0.EIGHT_BYTES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                AudioAttributesCompatParcelizer[lambdanew0.INDEFINITE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                AudioAttributesCompatParcelizer[lambdanew0.RESERVED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    protected final long read(int i) throws ExoPlaybackExceptionType {
        switch (AnonymousClass3.AudioAttributesCompatParcelizer[lambdanew0.AudioAttributesCompatParcelizer(i).ordinal()]) {
            case 1:
                return i & 31;
            case 2:
                return IconCompatParcelizer();
            case 3:
                byte[] bArrAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(2);
                return ((long) (bArrAudioAttributesCompatParcelizer[1] & 255)) | ((long) ((bArrAudioAttributesCompatParcelizer[0] & 255) << 8));
            case 4:
                byte[] bArrAudioAttributesCompatParcelizer2 = AudioAttributesCompatParcelizer(4);
                return ((bArrAudioAttributesCompatParcelizer2[0] & 255) << 24) | ((bArrAudioAttributesCompatParcelizer2[1] & 255) << 16) | ((bArrAudioAttributesCompatParcelizer2[2] & 255) << 8) | ((long) (bArrAudioAttributesCompatParcelizer2[3] & 255));
            case 5:
                byte[] bArrAudioAttributesCompatParcelizer3 = AudioAttributesCompatParcelizer(8);
                long j = bArrAudioAttributesCompatParcelizer3[0] & 255;
                long j2 = bArrAudioAttributesCompatParcelizer3[1] & 255;
                long j3 = bArrAudioAttributesCompatParcelizer3[2] & 255;
                long j4 = bArrAudioAttributesCompatParcelizer3[3] & 255;
                long j5 = bArrAudioAttributesCompatParcelizer3[4] & 255;
                return ((long) (bArrAudioAttributesCompatParcelizer3[7] & 255)) | ((bArrAudioAttributesCompatParcelizer3[5] & 255) << 16) | (j5 << 24) | (j2 << 48) | (j << 56) | (j3 << 40) | (j4 << 32) | (((long) (bArrAudioAttributesCompatParcelizer3[6] & 255)) << 8);
            case 6:
                return -1L;
            default:
                throw new ExoPlaybackExceptionType("Reserved additional information");
        }
    }

    protected final BigInteger RemoteActionCompatParcelizer(int i) throws ExoPlaybackExceptionType {
        switch (AnonymousClass3.AudioAttributesCompatParcelizer[lambdanew0.AudioAttributesCompatParcelizer(i).ordinal()]) {
            case 1:
                return BigInteger.valueOf(i & 31);
            case 2:
                return BigInteger.valueOf(IconCompatParcelizer());
            case 3:
                byte[] bArrAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(2);
                return BigInteger.valueOf(((long) (bArrAudioAttributesCompatParcelizer[1] & 255)) | ((long) ((bArrAudioAttributesCompatParcelizer[0] & 255) << 8)));
            case 4:
                byte[] bArrAudioAttributesCompatParcelizer2 = AudioAttributesCompatParcelizer(4);
                long j = bArrAudioAttributesCompatParcelizer2[0] & 255;
                return BigInteger.valueOf(((long) (bArrAudioAttributesCompatParcelizer2[3] & 255)) | ((bArrAudioAttributesCompatParcelizer2[1] & 255) << 16) | (j << 24) | (((long) (bArrAudioAttributesCompatParcelizer2[2] & 255)) << 8));
            case 5:
                BigInteger bigInteger = BigInteger.ZERO;
                byte[] bArrAudioAttributesCompatParcelizer3 = AudioAttributesCompatParcelizer(8);
                return bigInteger.or(BigInteger.valueOf(bArrAudioAttributesCompatParcelizer3[0] & 255).shiftLeft(56)).or(BigInteger.valueOf(bArrAudioAttributesCompatParcelizer3[1] & 255).shiftLeft(48)).or(BigInteger.valueOf(bArrAudioAttributesCompatParcelizer3[2] & 255).shiftLeft(40)).or(BigInteger.valueOf(bArrAudioAttributesCompatParcelizer3[3] & 255).shiftLeft(32)).or(BigInteger.valueOf(bArrAudioAttributesCompatParcelizer3[4] & 255).shiftLeft(24)).or(BigInteger.valueOf(bArrAudioAttributesCompatParcelizer3[5] & 255).shiftLeft(16)).or(BigInteger.valueOf(bArrAudioAttributesCompatParcelizer3[6] & 255).shiftLeft(8)).or(BigInteger.valueOf(bArrAudioAttributesCompatParcelizer3[7] & 255).shiftLeft(0));
            case 6:
                return BigInteger.valueOf(-1L);
            default:
                throw new ExoPlaybackExceptionType("Reserved additional information");
        }
    }

    final int AudioAttributesCompatParcelizer(long j) {
        return Math.abs((int) j);
    }
}
