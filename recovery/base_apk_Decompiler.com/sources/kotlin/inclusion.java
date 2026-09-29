package kotlin;

import android.util.Pair;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class inclusion {
    private static final byte[] IconCompatParcelizer = {0, 0, 0, 1};
    private static final String[] RemoteActionCompatParcelizer = {"", "A", "B", "C"};

    public static Pair<Integer, Integer> IconCompatParcelizer(byte[] bArr) {
        AsPropertyTypeDeserializer asPropertyTypeDeserializer = new AsPropertyTypeDeserializer(bArr);
        asPropertyTypeDeserializer.MediaBrowserCompatCustomActionResultReceiver(9);
        int iOnPlayFromMediaId = asPropertyTypeDeserializer.onPlayFromMediaId();
        asPropertyTypeDeserializer.MediaBrowserCompatCustomActionResultReceiver(20);
        return Pair.create(Integer.valueOf(asPropertyTypeDeserializer.onPrepareFromSearch()), Integer.valueOf(iOnPlayFromMediaId));
    }

    public static List<byte[]> IconCompatParcelizer(boolean z) {
        return Collections.singletonList(z ? new byte[]{1} : new byte[]{0});
    }

    public static boolean write(List<byte[]> list) {
        return list.size() == 1 && list.get(0).length == 1 && list.get(0)[0] == 1;
    }

    public static String IconCompatParcelizer(int i, int i2, int i3) {
        return String.format("avc1.%02X%02X%02X", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
    }

    public static String write(int i, boolean z, int i2, int i3, int[] iArr, int i4) {
        StringBuilder sb = new StringBuilder(LaissezFaireSubTypeValidator.read("hvc1.%s%d.%X.%c%d", RemoteActionCompatParcelizer[i], Integer.valueOf(i2), Integer.valueOf(i3), Character.valueOf(z ? 'H' : 'L'), Integer.valueOf(i4)));
        int length = iArr.length;
        while (length > 0 && iArr[length - 1] == 0) {
            length--;
        }
        for (int i5 = 0; i5 < length; i5++) {
            sb.append(String.format(".%02X", Integer.valueOf(iArr[i5])));
        }
        return sb.toString();
    }

    public static byte[] write(byte[] bArr, int i, int i2) {
        byte[] bArr2 = IconCompatParcelizer;
        byte[] bArr3 = new byte[bArr2.length + i2];
        System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
        System.arraycopy(bArr, i, bArr3, bArr2.length, i2);
        return bArr3;
    }
}
