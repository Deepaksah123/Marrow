package kotlin;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes4.dex */
public final class getJSONArray {
    public static final CancellationException AudioAttributesCompatParcelizer(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }
}
