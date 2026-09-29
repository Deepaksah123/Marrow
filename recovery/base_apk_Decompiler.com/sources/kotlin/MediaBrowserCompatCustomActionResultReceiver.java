package kotlin;

import android.window.BackEvent;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\bJ\u0015\u0010\r\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\b"}, d2 = {"Lo/MediaBrowserCompatCustomActionResultReceiver;", "", "<init>", "()V", "Landroid/window/BackEvent;", "p0", "", "bt_", "(Landroid/window/BackEvent;)F", "", "bu_", "(Landroid/window/BackEvent;)I", "bv_", "bw_"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class MediaBrowserCompatCustomActionResultReceiver {
    public static final MediaBrowserCompatCustomActionResultReceiver INSTANCE = new MediaBrowserCompatCustomActionResultReceiver();

    private MediaBrowserCompatCustomActionResultReceiver() {
    }

    public final float bt_(BackEvent p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return p0.getProgress();
    }

    public final float bv_(BackEvent p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return p0.getTouchX();
    }

    public final float bw_(BackEvent p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return p0.getTouchY();
    }

    public final int bu_(BackEvent p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return p0.getSwipeEdge();
    }
}
