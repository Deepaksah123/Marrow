package kotlin;

import android.content.Context;
import android.os.Bundle;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import kotlin._coercedTypeDesc;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes.dex */
public interface getAdCountInAdGroup {
    public static final byte[] $$d = {14, -40, -35, 110, 11, -3, -64, TarConstants.LF_BLK, 8, -8, 16, -18, 12, 1, -20, 14, -67, TarConstants.LF_SYMLINK, 12, -11, 13, -4, -7, -6, -55, 68, -16, 6, -62, 65, 4, -3, -12, 5, 0, 4, -12, -4, 2, -7, -3, 18, -12, 5, -2, -65, 20, 16, -7, 32, 4, -12, -4, 2, -7, -3, 18, -12, 5, -2, -38, 36, 5, -16, 8, 5, -34, 17, 12, 3, -14, -7, 1};
    public static final int $$e = 169;

    private static void b(int i, byte b, byte b2, Object[] objArr) {
        int i2 = (i * 2) + 4;
        int i3 = b * 2;
        byte[] bArr = $$d;
        int i4 = 99 - (b2 * 3);
        byte[] bArr2 = new byte[70 - i3];
        int i5 = 69 - i3;
        int i6 = -1;
        if (bArr == null) {
            i2++;
            i4 = i2 + i5 + 1;
        }
        while (true) {
            int i7 = i4;
            int i8 = i2;
            i6++;
            bArr2[i6] = (byte) i7;
            if (i6 == i5) {
                objArr[0] = new String(bArr2, 0);
                return;
            } else {
                i2 = i8 + 1;
                i4 = i7 + bArr[i8] + 1;
            }
        }
    }

    String AudioAttributesCompatParcelizer();

    String AudioAttributesCompatParcelizer(Bundle bundle);

    String RemoteActionCompatParcelizer(Bundle bundle, Context context);

    Object read(Bundle bundle);

    _coercedTypeDesc.AudioAttributesImplBaseParcelizer write(Bundle bundle, Context context, _coercedTypeDesc.AudioAttributesImplBaseParcelizer audioAttributesImplBaseParcelizer, CleverTapInstanceConfig cleverTapInstanceConfig, int i);

    void write(int i, Context context);

    /* JADX WARN: Removed duplicated region for block: B:37:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00f8 A[Catch: all -> 0x015e, TryCatch #5 {all -> 0x015e, blocks: (B:20:0x0062, B:22:0x008a, B:25:0x0092, B:32:0x00af, B:38:0x00bc, B:41:0x00c6, B:43:0x00cc, B:46:0x00d6, B:52:0x00e3, B:55:0x00eb, B:61:0x00f8, B:63:0x0113, B:69:0x013a, B:64:0x0117, B:66:0x011d, B:67:0x012c, B:30:0x00a8, B:27:0x0098), top: B:98:0x0062, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0117 A[Catch: all -> 0x015e, TryCatch #5 {all -> 0x015e, blocks: (B:20:0x0062, B:22:0x008a, B:25:0x0092, B:32:0x00af, B:38:0x00bc, B:41:0x00c6, B:43:0x00cc, B:46:0x00d6, B:52:0x00e3, B:55:0x00eb, B:61:0x00f8, B:63:0x0113, B:69:0x013a, B:64:0x0117, B:66:0x011d, B:67:0x012c, B:30:0x00a8, B:27:0x0098), top: B:98:0x0062, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x013a A[Catch: all -> 0x015e, TRY_LEAVE, TryCatch #5 {all -> 0x015e, blocks: (B:20:0x0062, B:22:0x008a, B:25:0x0092, B:32:0x00af, B:38:0x00bc, B:41:0x00c6, B:43:0x00cc, B:46:0x00d6, B:52:0x00e3, B:55:0x00eb, B:61:0x00f8, B:63:0x0113, B:69:0x013a, B:64:0x0117, B:66:0x011d, B:67:0x012c, B:30:0x00a8, B:27:0x0098), top: B:98:0x0062, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0171 A[Catch: all -> 0x0180, TRY_LEAVE, TryCatch #0 {all -> 0x0180, blocks: (B:71:0x0155, B:75:0x0164, B:77:0x0171), top: B:90:0x0155 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0177  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    default o._coercedTypeDesc.AudioAttributesImplBaseParcelizer read(android.content.Context r18, android.os.Bundle r19, int r20, o._coercedTypeDesc.AudioAttributesImplBaseParcelizer r21, org.json.JSONArray r22) {
        /*
            Method dump skipped, instruction units count: 408
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getAdCountInAdGroup.read(android.content.Context, android.os.Bundle, int, o._coercedTypeDesc$AudioAttributesImplBaseParcelizer, org.json.JSONArray):o._coercedTypeDesc$AudioAttributesImplBaseParcelizer");
    }
}
