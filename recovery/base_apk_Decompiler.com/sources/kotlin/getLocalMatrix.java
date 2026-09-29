package kotlin;

import android.os.Build;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0005\"\u001a\u0010\u0005\u001a\u00020\u00008\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004"}, d2 = {"", "read", "Z", "write", "()Z", "RemoteActionCompatParcelizer"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class getLocalMatrix {
    private static final boolean read;

    public static final boolean write() {
        return read;
    }

    static {
        read = Build.VERSION.SDK_INT >= 34;
    }
}
