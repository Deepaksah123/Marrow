package kotlin;

import java.net.SocketTimeoutException;
import java.net.UnknownHostException;

/* JADX INFO: loaded from: classes3.dex */
public final class withRequestHeaders {
    public static final boolean write(validateSubClassName validatesubclassname) {
        toMagicModuleMetaRepoModel.write(validatesubclassname, "");
        return validatesubclassname.IconCompatParcelizer == 2001 || validatesubclassname.IconCompatParcelizer == 2002;
    }

    public static final boolean AudioAttributesCompatParcelizer(Throwable th) {
        if (th == null) {
            return false;
        }
        return (th instanceof UnknownHostException) || (th instanceof SocketTimeoutException) || (th.getCause() instanceof UnknownHostException) || (th.getCause() instanceof SocketTimeoutException);
    }
}
