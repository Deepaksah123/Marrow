package kotlin;

import android.os.Looper;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0010\t\n\u0002\b\u0005\"\u001a\u0010\u0005\u001a\u00020\u00008\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004"}, d2 = {"", "read", "J", "AudioAttributesCompatParcelizer", "()J", "IconCompatParcelizer"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class realIdx {
    private static final long read;

    public static final long AudioAttributesCompatParcelizer() {
        return read;
    }

    static {
        long id;
        try {
            id = Looper.getMainLooper().getThread().getId();
        } catch (Exception unused) {
            id = -1;
        }
        read = id;
    }
}
