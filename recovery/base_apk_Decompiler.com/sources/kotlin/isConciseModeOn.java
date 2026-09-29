package kotlin;

import com.google.android.exoplayer2.source.rtsp.SessionDescription;
import kotlin.resetCurrentSelectedPosition;

/* JADX INFO: loaded from: classes4.dex */
public final class isConciseModeOn {
    private static final int AudioAttributesCompatParcelizer;

    public static final int AudioAttributesCompatParcelizer(int i) {
        return ((i & 65280) << 8) | (((-16777216) & i) >>> 24) | ((16711680 & i) >>> 8) | ((i & 255) << 24);
    }

    public static final short AudioAttributesCompatParcelizer(short s) {
        return (short) (((s & 65280) >>> 8) | ((s & 255) << 8));
    }

    public static final void write(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            StringBuilder sb = new StringBuilder("size=");
            sb.append(j);
            sb.append(" offset=");
            sb.append(j2);
            sb.append(" byteCount=");
            sb.append(j3);
            throw new ArrayIndexOutOfBoundsException(sb.toString());
        }
    }

    public static final boolean write(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        toMagicModuleMetaRepoModel.write(bArr, "");
        toMagicModuleMetaRepoModel.write(bArr2, "");
        for (int i4 = 0; i4 < i3; i4++) {
            if (bArr[i4 + i] != bArr2[i4 + i2]) {
                return false;
            }
        }
        return true;
    }

    public static final String AudioAttributesCompatParcelizer(byte b) {
        return TestGroupLSModel.IconCompatParcelizer(new char[]{setTimelines.RemoteActionCompatParcelizer()[(b >> 4) & 15], setTimelines.RemoteActionCompatParcelizer()[b & 15]});
    }

    public static final String write(int i) {
        if (i == 0) {
            return SessionDescription.SUPPORTED_SDP_VERSION;
        }
        int i2 = 0;
        char[] cArr = {setTimelines.RemoteActionCompatParcelizer()[(i >> 28) & 15], setTimelines.RemoteActionCompatParcelizer()[(i >> 24) & 15], setTimelines.RemoteActionCompatParcelizer()[(i >> 20) & 15], setTimelines.RemoteActionCompatParcelizer()[(i >> 16) & 15], setTimelines.RemoteActionCompatParcelizer()[(i >> 12) & 15], setTimelines.RemoteActionCompatParcelizer()[(i >> 8) & 15], setTimelines.RemoteActionCompatParcelizer()[(i >> 4) & 15], setTimelines.RemoteActionCompatParcelizer()[i & 15]};
        while (i2 < 8 && cArr[i2] == '0') {
            i2++;
        }
        return TestGroupLSModel.AudioAttributesCompatParcelizer(cArr, i2);
    }

    static {
        new resetCurrentSelectedPosition.IconCompatParcelizer();
        AudioAttributesCompatParcelizer = -1234567890;
    }

    public static final int RemoteActionCompatParcelizer() {
        return AudioAttributesCompatParcelizer;
    }

    public static final int IconCompatParcelizer(getRelatedModuleAdapter getrelatedmoduleadapter) {
        toMagicModuleMetaRepoModel.write(getrelatedmoduleadapter, "");
        if (64 == AudioAttributesCompatParcelizer) {
            return getrelatedmoduleadapter.MediaBrowserCompatCustomActionResultReceiver();
        }
        return 64;
    }

    public static final int IconCompatParcelizer(byte[] bArr, int i) {
        toMagicModuleMetaRepoModel.write(bArr, "");
        return i == AudioAttributesCompatParcelizer ? bArr.length : i;
    }
}
