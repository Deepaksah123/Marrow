package kotlin;

import java.io.Closeable;

/* JADX INFO: loaded from: classes.dex */
public final class MagicModuleMetaLSModel {
    public static final void IconCompatParcelizer(Closeable closeable, Throwable th) {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                getPlanName.IconCompatParcelizer(th, th2);
            }
        }
    }
}
