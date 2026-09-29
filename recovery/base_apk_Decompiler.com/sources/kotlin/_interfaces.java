package kotlin;

import androidx.media3.common.DrmInitData;
import com.google.android.exoplayer2.PlaybackException;
import com.google.android.exoplayer2.audio.OpusUtil;
import com.google.android.exoplayer2.util.MimeTypes;
import com.marrow.data.models.ResponseError;
import java.nio.ByteBuffer;
import kotlin.C0170format;

/* JADX INFO: loaded from: classes2.dex */
public final class _interfaces {
    private static final int[] AudioAttributesCompatParcelizer = {PlaybackException.ERROR_CODE_IO_NETWORK_CONNECTION_TIMEOUT, 2000, 1920, 1601, 1600, 1001, 1000, 960, 800, 800, 480, ResponseError.NO_INTERNET_ERROR, ResponseError.NO_INTERNET_ERROR, 2048};

    public static final class RemoteActionCompatParcelizer {
        public final int AudioAttributesCompatParcelizer;
        public final int IconCompatParcelizer;
        public final int RemoteActionCompatParcelizer;
        public final int read;
        public final int write;

        /* synthetic */ RemoteActionCompatParcelizer(int i, int i2, int i3, int i4) {
            this(i, 2, i2, i3, i4);
        }

        private RemoteActionCompatParcelizer(int i, int i2, int i3, int i4, int i5) {
            this.RemoteActionCompatParcelizer = i;
            this.AudioAttributesCompatParcelizer = 2;
            this.write = i3;
            this.read = i4;
            this.IconCompatParcelizer = i5;
        }
    }

    public static C0170format AudioAttributesCompatParcelizer(AsPropertyTypeDeserializer asPropertyTypeDeserializer, String str, String str2, DrmInitData drmInitData) {
        asPropertyTypeDeserializer.AudioAttributesImplBaseParcelizer(1);
        return new C0170format.RemoteActionCompatParcelizer().AudioAttributesCompatParcelizer(str).AudioAttributesImplApi26Parcelizer(MimeTypes.AUDIO_AC4).read(2).MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(((asPropertyTypeDeserializer.onPlayFromMediaId() & 32) >> 5) == 1 ? OpusUtil.SAMPLE_RATE : 44100).AudioAttributesCompatParcelizer(drmInitData).read(str2).IconCompatParcelizer();
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x008e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static o._interfaces.RemoteActionCompatParcelizer write(kotlin.AsExternalTypeSerializer r10) {
        /*
            r0 = 16
            int r1 = r10.IconCompatParcelizer(r0)
            int r0 = r10.IconCompatParcelizer(r0)
            r2 = 65535(0xffff, float:9.1834E-41)
            r3 = 4
            if (r0 != r2) goto L18
            r0 = 24
            int r0 = r10.IconCompatParcelizer(r0)
            r2 = 7
            goto L19
        L18:
            r2 = r3
        L19:
            int r0 = r0 + r2
            r2 = 44097(0xac41, float:6.1793E-41)
            if (r1 != r2) goto L21
            int r0 = r0 + 2
        L21:
            r1 = 2
            int r2 = r10.IconCompatParcelizer(r1)
            r4 = 3
            if (r2 != r4) goto L2e
            int r5 = IconCompatParcelizer(r10)
            int r2 = r2 + r5
        L2e:
            r5 = 10
            int r5 = r10.IconCompatParcelizer(r5)
            boolean r6 = r10.read()
            if (r6 == 0) goto L43
            int r6 = r10.IconCompatParcelizer(r4)
            if (r6 <= 0) goto L43
            r10.write(r1)
        L43:
            boolean r6 = r10.read()
            r7 = 48000(0xbb80, float:6.7262E-41)
            r8 = 44100(0xac44, float:6.1797E-41)
            if (r6 == 0) goto L51
            r6 = r7
            goto L52
        L51:
            r6 = r8
        L52:
            int r10 = r10.IconCompatParcelizer(r3)
            if (r6 != r8) goto L61
            r8 = 13
            if (r10 != r8) goto L61
            int[] r1 = kotlin._interfaces.AudioAttributesCompatParcelizer
            r10 = r1[r10]
            goto L8f
        L61:
            if (r6 != r7) goto L8e
            int[] r7 = kotlin._interfaces.AudioAttributesCompatParcelizer
            int r8 = r7.length
            if (r10 >= r8) goto L8e
            r7 = r7[r10]
            int r5 = r5 % 5
            r8 = 1
            r9 = 8
            if (r5 == r8) goto L85
            r8 = 11
            if (r5 == r1) goto L80
            if (r5 == r4) goto L85
            if (r5 != r3) goto L89
            if (r10 == r4) goto L8b
            if (r10 == r9) goto L8b
            if (r10 != r8) goto L89
            goto L8b
        L80:
            if (r10 == r9) goto L8b
            if (r10 != r8) goto L89
            goto L8b
        L85:
            if (r10 == r4) goto L8b
            if (r10 == r9) goto L8b
        L89:
            r10 = r7
            goto L8f
        L8b:
            int r10 = r7 + 1
            goto L8f
        L8e:
            r10 = 0
        L8f:
            o._interfaces$RemoteActionCompatParcelizer r1 = new o._interfaces$RemoteActionCompatParcelizer
            r1.<init>(r2, r6, r0, r10)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin._interfaces.write(o.AsExternalTypeSerializer):o._interfaces$RemoteActionCompatParcelizer");
    }

    public static int AudioAttributesCompatParcelizer(byte[] bArr, int i) {
        int i2 = 7;
        if (bArr.length < 7) {
            return -1;
        }
        int i3 = ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        if (i3 == 65535) {
            i3 = ((bArr[4] & 255) << 16) | ((bArr[5] & 255) << 8) | (bArr[6] & 255);
        } else {
            i2 = 4;
        }
        if (i == 44097) {
            i2 += 2;
        }
        return i3 + i2;
    }

    public static int RemoteActionCompatParcelizer(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[16];
        int iPosition = byteBuffer.position();
        byteBuffer.get(bArr);
        byteBuffer.position(iPosition);
        return write(new AsExternalTypeSerializer(bArr)).IconCompatParcelizer;
    }

    public static void AudioAttributesCompatParcelizer(int i, AsPropertyTypeDeserializer asPropertyTypeDeserializer) {
        asPropertyTypeDeserializer.write(7);
        byte[] bArrRemoteActionCompatParcelizer = asPropertyTypeDeserializer.RemoteActionCompatParcelizer();
        bArrRemoteActionCompatParcelizer[0] = -84;
        bArrRemoteActionCompatParcelizer[1] = 64;
        bArrRemoteActionCompatParcelizer[2] = -1;
        bArrRemoteActionCompatParcelizer[3] = -1;
        bArrRemoteActionCompatParcelizer[4] = (byte) (i >> 16);
        bArrRemoteActionCompatParcelizer[5] = (byte) (i >> 8);
        bArrRemoteActionCompatParcelizer[6] = (byte) i;
    }

    private static int IconCompatParcelizer(AsExternalTypeSerializer asExternalTypeSerializer) {
        int i = 0;
        while (true) {
            int iIconCompatParcelizer = i + asExternalTypeSerializer.IconCompatParcelizer(2);
            if (!asExternalTypeSerializer.read()) {
                return iIconCompatParcelizer;
            }
            i = (iIconCompatParcelizer + 1) << 2;
        }
    }
}
