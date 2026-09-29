package kotlin;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
final class AtomParsersUdtaInfo {
    static int AudioAttributesCompatParcelizer(int i, int i2) {
        return i & (~i2);
    }

    static int AudioAttributesCompatParcelizer(int i, int i2, int i3) {
        return (i & (~i3)) | (i2 & i3);
    }

    static int IconCompatParcelizer(int i) {
        return (i < 32 ? 4 : 2) * (i + 1);
    }

    static int write(int i, int i2) {
        return i & i2;
    }

    static int write(int i) {
        return Math.max(4, getDefaultSampleValues.IconCompatParcelizer(i + 1));
    }

    static Object read(int i) {
        if (i < 2 || i > 1073741824 || Integer.highestOneBit(i) != i) {
            throw new IllegalArgumentException("must be power of 2 between 2^1 and 2^30: ".concat(String.valueOf(i)));
        }
        if (i <= 256) {
            return new byte[i];
        }
        if (i <= 65536) {
            return new short[i];
        }
        return new int[i];
    }

    static void AudioAttributesCompatParcelizer(Object obj) {
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
    }

    static int RemoteActionCompatParcelizer(Object obj, int i) {
        if (obj instanceof byte[]) {
            return ((byte[]) obj)[i] & 255;
        }
        if (obj instanceof short[]) {
            return ((short[]) obj)[i] & 65535;
        }
        return ((int[]) obj)[i];
    }

    static void IconCompatParcelizer(Object obj, int i, int i2) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i] = (byte) i2;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i] = (short) i2;
        } else {
            ((int[]) obj)[i] = i2;
        }
    }

    static int read(Object obj, Object obj2, int i, Object obj3, int[] iArr, Object[] objArr, Object[] objArr2) {
        int i2;
        int i3;
        int i4 = getDefaultSampleValues.read(obj);
        int i5 = i4 & i;
        int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(obj3, i5);
        if (iRemoteActionCompatParcelizer == 0) {
            return -1;
        }
        int iAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(i4, i);
        int i6 = -1;
        while (true) {
            i2 = iRemoteActionCompatParcelizer - 1;
            i3 = iArr[i2];
            if (AudioAttributesCompatParcelizer(i3, i) == iAudioAttributesCompatParcelizer && parseSmta.AudioAttributesCompatParcelizer(obj, objArr[i2]) && (objArr2 == null || parseSmta.AudioAttributesCompatParcelizer(obj2, objArr2[i2]))) {
                break;
            }
            int iWrite = write(i3, i);
            if (iWrite == 0) {
                return -1;
            }
            i6 = i2;
            iRemoteActionCompatParcelizer = iWrite;
        }
        int iWrite2 = write(i3, i);
        if (i6 == -1) {
            IconCompatParcelizer(obj3, i5, iWrite2);
            return i2;
        }
        iArr[i6] = AudioAttributesCompatParcelizer(iArr[i6], iWrite2, i);
        return i2;
    }
}
