package kotlin;

import android.util.Base64;

/* JADX INFO: loaded from: classes2.dex */
public final class getPositionOrDefaultInMediaItem {
    public static final String write(byte[] bArr) {
        toMagicModuleMetaRepoModel.write(bArr, "");
        String strEncodeToString = Base64.encodeToString(bArr, 2);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strEncodeToString, "");
        return strEncodeToString;
    }

    public static final byte[] write(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        byte[] bArrDecode = Base64.decode(str, 2);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(bArrDecode, "");
        return bArrDecode;
    }
}
