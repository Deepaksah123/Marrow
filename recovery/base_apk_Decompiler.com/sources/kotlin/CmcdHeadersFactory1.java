package kotlin;

import android.os.Build;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0007\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\u0005\u0010\b"}, d2 = {"Lo/CmcdHeadersFactory1;", "", "<init>", "()V", "", "AudioAttributesCompatParcelizer", "Z", "RemoteActionCompatParcelizer", "()Z", "write"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CmcdHeadersFactory1 {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private static final boolean RemoteActionCompatParcelizer;
    public static final CmcdHeadersFactory1 INSTANCE = new CmcdHeadersFactory1();

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private static final boolean AudioAttributesCompatParcelizer;

    private CmcdHeadersFactory1() {
    }

    static {
        RemoteActionCompatParcelizer = Build.VERSION.SDK_INT >= 35;
        AudioAttributesCompatParcelizer = Build.VERSION.SDK_INT >= 33;
    }

    public static boolean RemoteActionCompatParcelizer() {
        return RemoteActionCompatParcelizer;
    }

    public static boolean AudioAttributesCompatParcelizer() {
        return AudioAttributesCompatParcelizer;
    }
}
