package kotlin;

import android.util.Base64;
import java.security.SecureRandom;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/marrow2/data/security/utils/SecureUtils;", "", "<init>", "()V", "generateRandomHash", "", "byteSize", "", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class buildCea708InitializationData {
    public static final buildCea708InitializationData write = new buildCea708InitializationData();

    private buildCea708InitializationData() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String read(int i) {
        byte[] bArr = new byte[32];
        new SecureRandom().nextBytes(bArr);
        String strEncodeToString = Base64.encodeToString(bArr, 2);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strEncodeToString, "");
        return strEncodeToString;
    }
}
