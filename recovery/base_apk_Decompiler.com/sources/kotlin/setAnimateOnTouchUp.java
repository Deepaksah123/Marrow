package kotlin;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes4.dex */
public final class setAnimateOnTouchUp extends RecyclerView.AudioAttributesImplBaseParcelizer {
    private final int AudioAttributesCompatParcelizer;
    private final int read;

    public setAnimateOnTouchUp(int i, int i2) {
        this.read = i;
        this.AudioAttributesCompatParcelizer = i2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AudioAttributesImplBaseParcelizer
    public final void IconCompatParcelizer(Rect rect, View view, RecyclerView recyclerView, RecyclerView.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) {
        toMagicModuleMetaRepoModel.write(rect, "");
        toMagicModuleMetaRepoModel.write(view, "");
        toMagicModuleMetaRepoModel.write(recyclerView, "");
        toMagicModuleMetaRepoModel.write(mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, "");
        rect.top = this.read;
        rect.right = this.AudioAttributesCompatParcelizer;
        rect.left = this.AudioAttributesCompatParcelizer;
        rect.bottom = this.read;
    }
}
