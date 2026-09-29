package kotlin;

import com.marrow.data.utils.product.exceptions.ResponseErrorException;

/* JADX INFO: loaded from: classes4.dex */
public final class getIconUrl {
    public static final boolean IconCompatParcelizer(Throwable th, String str) {
        toMagicModuleMetaRepoModel.write(th, "");
        toMagicModuleMetaRepoModel.write(str, "");
        int i = 0;
        while (th != null && i < 3) {
            i++;
            String message = th.getMessage();
            if (message != null && TestGroupLSModel.write((CharSequence) message, (CharSequence) str, false)) {
                return true;
            }
            th = th.getCause();
        }
        return false;
    }

    public static final ResponseErrorException IconCompatParcelizer(Throwable th) {
        toMagicModuleMetaRepoModel.write(th, "");
        int i = 0;
        while (th != null && i < 3) {
            if (th instanceof ResponseErrorException) {
                return (ResponseErrorException) th;
            }
            i++;
            th = th.getCause();
        }
        return null;
    }
}
