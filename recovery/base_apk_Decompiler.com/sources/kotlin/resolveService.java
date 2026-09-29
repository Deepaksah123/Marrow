package kotlin;

import android.view.DisplayCutout;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\bJ\u0015\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\b"}, d2 = {"Lo/resolveService;", "", "<init>", "()V", "Landroid/view/DisplayCutout;", "p0", "", "IconCompatParcelizer", "(Landroid/view/DisplayCutout;)I", "RemoteActionCompatParcelizer", "write", "read"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class resolveService {
    public static final resolveService INSTANCE = new resolveService();

    private resolveService() {
    }

    public final int IconCompatParcelizer(DisplayCutout p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return p0.getSafeInsetLeft();
    }

    public final int RemoteActionCompatParcelizer(DisplayCutout p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return p0.getSafeInsetTop();
    }

    public final int write(DisplayCutout p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return p0.getSafeInsetRight();
    }

    public final int read(DisplayCutout p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return p0.getSafeInsetBottom();
    }
}
