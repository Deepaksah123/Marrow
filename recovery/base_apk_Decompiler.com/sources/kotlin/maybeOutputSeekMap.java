package kotlin;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* JADX INFO: loaded from: classes5.dex */
final class maybeOutputSeekMap extends readAmrHeader {
    maybeOutputSeekMap(View view) {
        write(view);
    }

    @Override // kotlin.readAmrHeader
    final boolean RemoteActionCompatParcelizer() {
        return this.read;
    }

    @Override // kotlin.readAmrHeader
    final void read(View view) {
        view.setClipToOutline(!RemoteActionCompatParcelizer());
        if (RemoteActionCompatParcelizer()) {
            view.invalidate();
        } else {
            view.invalidateOutline();
        }
    }

    private void write(View view) {
        view.setOutlineProvider(new ViewOutlineProvider() { // from class: o.maybeOutputSeekMap.1
            @Override // android.view.ViewOutlineProvider
            public final void getOutline(View view2, Outline outline) {
                if (maybeOutputSeekMap.this.RemoteActionCompatParcelizer.isEmpty()) {
                    return;
                }
                outline.setPath(maybeOutputSeekMap.this.RemoteActionCompatParcelizer);
            }
        });
    }
}
