package kotlin;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewOverlay;

/* JADX INFO: loaded from: classes3.dex */
final class peekId3Metadata implements getFrameStartMarker {
    private final ViewOverlay write;

    peekId3Metadata(View view) {
        this.write = view.getOverlay();
    }

    @Override // kotlin.getFrameStartMarker
    public final void RemoteActionCompatParcelizer(Drawable drawable) {
        this.write.add(drawable);
    }

    @Override // kotlin.getFrameStartMarker
    public final void IconCompatParcelizer(Drawable drawable) {
        this.write.remove(drawable);
    }
}
