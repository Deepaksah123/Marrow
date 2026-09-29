package kotlin;

import android.os.Bundle;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX INFO: renamed from: o.seekMap, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C0197seekMap {
    private final View RemoteActionCompatParcelizer;
    private boolean AudioAttributesCompatParcelizer = false;
    private int read = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public C0197seekMap(endTracks endtracks) {
        this.RemoteActionCompatParcelizer = (View) endtracks;
    }

    public final boolean write() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final Bundle RemoteActionCompatParcelizer() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("expanded", this.AudioAttributesCompatParcelizer);
        bundle.putInt("expandedComponentIdHint", this.read);
        return bundle;
    }

    public final void IconCompatParcelizer(Bundle bundle) {
        this.AudioAttributesCompatParcelizer = bundle.getBoolean("expanded", false);
        this.read = bundle.getInt("expandedComponentIdHint", 0);
        if (this.AudioAttributesCompatParcelizer) {
            IconCompatParcelizer();
        }
    }

    public final void RemoteActionCompatParcelizer(int i) {
        this.read = i;
    }

    public final int read() {
        return this.read;
    }

    private void IconCompatParcelizer() {
        ViewParent parent = this.RemoteActionCompatParcelizer.getParent();
        if (parent instanceof CoordinatorLayout) {
            ((CoordinatorLayout) parent).read(this.RemoteActionCompatParcelizer);
        }
    }
}
